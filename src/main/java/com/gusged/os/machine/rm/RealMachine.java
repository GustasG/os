package com.gusged.os.machine.rm;

import java.util.Set;
import java.util.HashSet;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.Data;
import lombok.ToString;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.memory.PageAllocator;
import com.gusged.os.machine.vm.VirtualMachine;
import com.gusged.os.machine.rm.cpu.CpuMode;
import com.gusged.os.machine.rm.cpu.ProgramInterrupt;
import com.gusged.os.machine.rm.cpu.SupervisorInterrupt;
import static com.gusged.os.Constants.VIRTUAL_MACHINE_PAGE_COUNT;

@Data
@Singleton
public class RealMachine {
    private static transient final Logger logger = LoggerFactory.getLogger(RealMachine.class);

    private final RealCpu realCpu;
    @ToString.Exclude private final PageAllocator pageAllocator;
    private final Set<VirtualMachine> virtualMachines;
    private VirtualMachine activeVirtualMachine;

    @Inject
    public RealMachine(RealCpu realCpu, PageAllocator pageTable) {
        this.realCpu = realCpu;
        this.pageAllocator = pageTable;
        this.virtualMachines = new HashSet<>();
    }

    public VirtualMachine createVirtualMachine() {
        var memory = pageAllocator.allocatePages(VIRTUAL_MACHINE_PAGE_COUNT);
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
            pageAllocator.freePages(vm.getVirtualMemory());
            logger.debug("Deleted VM");
        } else {
            logger.warn("This machine did not create this VM");
        }
    }

    public void setActiveVirtualMachine(VirtualMachine vm) {
        if (!virtualMachines.contains(vm)) {
            logger.error("This VM does not belong to this machine");
            return;
        }

        activeVirtualMachine = vm;
    }

    public void run() {
        while (!virtualMachines.isEmpty()) {
            activeVirtualMachine.step();
            test();
        }
    }

    private void test() {
        if (realCpu.getPi() != ProgramInterrupt.NONE || realCpu.getSi() != SupervisorInterrupt.NONE) {
            realCpu.setMode(CpuMode.SUPERVISOR);

            if (realCpu.getSi() == SupervisorInterrupt.HALT) {
                shutdownActiveVirtualMachine();
            }

            if (realCpu.getPi() == ProgramInterrupt.INCORRECT_OPCODE) {
                logger.warn("Handle incorrect opcode");
            } else if (realCpu.getPi() == ProgramInterrupt.INVALID_ADDRESS) {
                logger.warn("Handle invalid address");
            }

            realCpu.setMode(CpuMode.USER);
        }
    }

    private void shutdownActiveVirtualMachine() {
        freeVirtualMachine(activeVirtualMachine);

        activeVirtualMachine = virtualMachines
                .stream()
                .findAny()
                .orElse(null);
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