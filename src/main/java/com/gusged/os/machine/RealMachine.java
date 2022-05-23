package com.gusged.os.machine;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.machine.cpu.Processor;
import com.gusged.os.machine.cpu.ProgramInterrupt;
import com.gusged.os.machine.cpu.SupervisorInterrupt;
import static com.gusged.os.Constants.*;

@Data
@Singleton
public final class RealMachine {
    private static final Logger logger = LoggerFactory.getLogger(RealMachine.class);

    private Processor processor;
    private final Memory memory;

    @Inject
    public RealMachine(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
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

    public int peekFromStack() {
        return readFromVirtualAddress(getSp() - 1);
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
}