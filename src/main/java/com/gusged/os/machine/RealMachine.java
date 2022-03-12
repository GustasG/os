package com.gusged.os.machine;

import java.util.Set;
import java.util.HashSet;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.Data;
import lombok.ToString;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.memory.PageTable;
import com.gusged.os.machine.cpu.ProgramInterrupt;
import com.gusged.os.machine.cpu.SupervisorInterrupt;
import static com.gusged.os.Constants.*;

@Data
@Singleton
public class RealMachine {
    private static transient final Logger logger = LoggerFactory.getLogger(RealMachine.class);

    private final RealCpu realCpu;
    @ToString.Exclude private final PageTable pageTable;
    private final Set<VirtualMachine> virtualMachines;
    private VirtualMachine activeVirtualMachine;

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
        if (vm == null) {
            return;
        }

        if (virtualMachines.remove(vm)) {
            pageTable.releasePages(vm.getVirtualMemory());
            logger.debug("Deleted VM");
        } else {
            logger.error("This machine did not create this VM");
        }
    }

    public void setActiveVirtualMachine(VirtualMachine vm) {
        if (!virtualMachines.contains(vm)) {
            logger.error("This VM does not belong to this machine!");
            return;
        }

        activeVirtualMachine = vm;
    }

    public void step() {
        activeVirtualMachine.singleStep();
        test();
    }

    private void test() {
        if (realCpu.getSi() == SupervisorInterrupt.HALT) {
            shutdownActiveVirtualMachine();
        }

        if (realCpu.getPi() == ProgramInterrupt.INCORRECT_OPCODE) {
            shutdownActiveVirtualMachine();
            logger.info("Stopping active machine because of invalid opcode");
        }
    }

    private void shutdownActiveVirtualMachine() {
        freeVirtualMachine(activeVirtualMachine);

        activeVirtualMachine = virtualMachines
                .stream()
                .findAny()
                .orElse(null);
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
        realCpu.setSp((realCpu.getSp() + 1) % STACK_SEGMENT_SIZE);
    }

    public void decrementSp() {
        realCpu.setSp((realCpu.getSp() - 1) % STACK_SEGMENT_SIZE);
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