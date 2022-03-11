package com.gusged.os.machine;

import java.util.Set;
import java.util.HashSet;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.gusged.os.machine.cpu.ProgramInterrupt;
import com.gusged.os.machine.cpu.SupervisorInterrupt;
import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.memory.PageTable;

import static com.gusged.os.Constants.*;
import static com.gusged.os.Constants.STACK_SEGMENT_SIZE;

@Data
@Singleton
public class RealMachine {
    private static transient final Logger logger = LoggerFactory.getLogger(RealMachine.class);

    private final RealCpu realCpu;
    private final PageTable pageTable;
    private final Set<VirtualMachine> virtualMachines;

    @Inject
    public RealMachine(RealCpu realCpu, PageTable pageTable) {
        this.realCpu = realCpu;
        this.pageTable = pageTable;
        this.virtualMachines = new HashSet<>();
    }

    public VirtualMachine createVirtualMachine() {
        var memory = pageTable.acquirePages(VIRTUAL_MACHINE_PAGE_COUNT);
        var vm = new VirtualMachine(this, memory);
        virtualMachines.add(vm);

        logger.debug("Created new virtual machine");

        return vm;
    }

    public void freeVirtualMachine(VirtualMachine vm) {
        if (virtualMachines.remove(vm)) {
            pageTable.releasePages(vm.getVirtualMemory());
            logger.debug("Deleted VM");
        } else {
            logger.error("This machine did not create this VM");
        }
    }

    public int getPc() {
        return CODE_SEGMENT_START + realCpu.getPc();
    }

    public void jump(int address) {
        realCpu.setPc(address % CODE_SEGMENT_SIZE);
    }

    public void advance() {
        jump(realCpu.getPc() + 1);
    }

    public int getSp() {
        return STACK_SEGMENT_START + realCpu.getSp();
    }

    public void incrementSp() {
        realCpu.setPc((realCpu.getSp() + 1) % STACK_SEGMENT_SIZE);
    }

    public void decrementSp() {
        realCpu.setPc((realCpu.getSp() - 1) % STACK_SEGMENT_SIZE);
    }

    public void decrementTimer(int delta) {
        realCpu.setTi(Math.max(realCpu.getTi() - delta, 0));
    }

    public void programInterrupt(ProgramInterrupt interrupt) {
        realCpu.setPi(interrupt);
    }

    public void supervisorInterrupt(SupervisorInterrupt interrupt) {
        realCpu.setSi(interrupt);
    }
}