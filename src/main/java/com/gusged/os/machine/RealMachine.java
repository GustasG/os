package com.gusged.os.machine;

import java.util.Map;
import java.util.HashMap;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.machine.cpu.CpuMode;
import com.gusged.os.machine.cpu.Processor;
import com.gusged.os.machine.cpu.ProgramInterrupt;
import com.gusged.os.machine.cpu.SupervisorInterrupt;
import static com.gusged.os.Constants.*;

@Data
@Singleton
public final class RealMachine {
    private static final Logger logger = LoggerFactory.getLogger(RealMachine.class);

    private Processor processor;
    private final HardDrive hardDrive;
    private final Memory memory;

    private final Map<SupervisorInterrupt, InterruptCallback> supervisorIterruptTable;
    private final Map<ProgramInterrupt, InterruptCallback> programInterruptTable;
    private InterruptCallback onTimerInterrupt;

    @Inject
    public RealMachine(Processor processor, Memory memory, HardDrive hardDrive) {
        this.processor = processor;
        this.memory = memory;
        this.hardDrive = hardDrive;
        this.supervisorIterruptTable = new HashMap<>();
        this.programInterruptTable = new HashMap<>();
    }

    public void onSupervisorInterrupt(SupervisorInterrupt interrupt, InterruptCallback fn) {
        supervisorIterruptTable.put(interrupt, fn);
    }

    public void onProgramInterrupt(ProgramInterrupt interrupt, InterruptCallback fn) {
        programInterruptTable.put(interrupt, fn);
    }

    public void onTimerInterrupt(InterruptCallback fn) {
        onTimerInterrupt = fn;
    }

    public void test() {
        if (processor.getSi() != SupervisorInterrupt.NONE) {
            dispatch(supervisorIterruptTable.get(processor.getSi()));
            processor.setSi(SupervisorInterrupt.NONE);
        }
        if (processor.getPi() != ProgramInterrupt.NONE) {
            dispatch(programInterruptTable.get(processor.getPi()));
            processor.setPi(ProgramInterrupt.NONE);
        }
        if (processor.getTi() == 0) {
            dispatch(onTimerInterrupt);
        }
    }

    private void dispatch(InterruptCallback fn) {
        if (fn == null) {
            return;
        }

        processor.setMode(CpuMode.SUPERVISOR);

        try {
            fn.accept();
        } finally {
            processor.setMode(CpuMode.USER);
        }
    }

    public int readFromVirtualAddress(int address) {
        int page = address / memory.getPageSize();
        int offset = address - page * memory.getPageSize();

        var realAddress = virtualToRealAddress(page, offset);
        return memory.read(realAddress);
    }

    public void writeToVirtualAddress(int address, int value) {
        int page = address / memory.getPageSize();
        int offset = address - page * memory.getPageSize();

        var realAddress = virtualToRealAddress(page, offset);
        memory.write(realAddress, value);
    }

    private int virtualToRealAddress(int page, int offset) {
        return (processor.getPtr() + page) * memory.getPageSize() + offset;
    }

    public int getPc() {
        return processor.getPc() + CODE_SEGMENT_START;
    }

    public void jump(int address) {
        processor.setPc(address % CODE_SEGMENT_SIZE);
    }

    public void incrementPc() {
        jump(processor.getPc() + 1);
    }

    public void pushToStack(int value) {
        writeToVirtualAddress(getSp(), value);
        processor.setSp((processor.getSp() + 1) % STACK_SEGMENT_SIZE);
    }

    public int popFromStack() {
        processor.setSp((processor.getSp() - 1) % STACK_SEGMENT_SIZE);
        return readFromVirtualAddress(getSp());
    }

    private int getSp() {
        return processor.getSp() + STACK_SEGMENT_START;
    }

    public void decrementTimer(int delta) {
        processor.setTi(Math.max(processor.getTi() - delta, 0));
    }

    public void programInterrupt(ProgramInterrupt interrupt) {
        processor.setPi(interrupt);
    }

    public void supervisorInterrupt(SupervisorInterrupt interrupt) {
        processor.setSi(interrupt);
    }

    public void setTi(int value) {
        processor.setTi(value);
    }
}