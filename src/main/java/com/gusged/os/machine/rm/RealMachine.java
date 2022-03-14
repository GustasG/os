package com.gusged.os.machine.rm;

import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;

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

    private final Map<SupervisorInterrupt, Consumer<VirtualMachine>> supervisorIterruptTable;
    private final Map<ProgramInterrupt, Consumer<VirtualMachine>> programInterruptTable;
    private Consumer<VirtualMachine> onTimerInterrupt;

    private final RealCpu realCpu;
    @ToString.Exclude private final PageAllocator pageAllocator;
    private final Set<VirtualMachine> virtualMachines;
    private VirtualMachine activeVirtualMachine;

    @Inject
    public RealMachine(RealCpu realCpu, PageAllocator pageTable) {
        this.realCpu = realCpu;
        this.pageAllocator = pageTable;
        this.virtualMachines = new HashSet<>();
        this.supervisorIterruptTable = new HashMap<>();
        this.programInterruptTable = new HashMap<>();
    }

    public VirtualMachine createVirtualMachine() {
        assert realCpu.getMode() == CpuMode.SUPERVISOR;

        var memory = pageAllocator.allocatePages(VIRTUAL_MACHINE_PAGE_COUNT);
        var vm = new VirtualMachine(this, memory);
        virtualMachines.add(vm);

        logger.debug("Created new virtual machine");

        return vm;
    }

    public void freeVirtualMachine(VirtualMachine vm) {
        assert realCpu.getMode() == CpuMode.SUPERVISOR;

        if (vm == null) {
            return;
        }

        if (virtualMachines.remove(vm)) {
            pageAllocator.freePages(vm.getVirtualMemory());
            logger.debug("Deleted VM");

            if (vm.equals(activeVirtualMachine)) {
                activeVirtualMachine = virtualMachines
                        .stream()
                        .findAny()
                        .orElse(null);
            }
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

    public void onSupervisorInterrupt(SupervisorInterrupt interrupt, Consumer<VirtualMachine> fn) {
        assert realCpu.getMode() == CpuMode.SUPERVISOR;
        supervisorIterruptTable.put(interrupt, fn);
    }

    public void onProgramInterrupt(ProgramInterrupt interrupt, Consumer<VirtualMachine> fn) {
        assert realCpu.getMode() == CpuMode.SUPERVISOR;
        programInterruptTable.put(interrupt, fn);
    }

    public void onTimerInterrupt(Consumer<VirtualMachine> fn) {
        assert realCpu.getMode() == CpuMode.SUPERVISOR;
        onTimerInterrupt = fn;
    }

    public void run() {
        realCpu.setMode(CpuMode.USER);

        while (!virtualMachines.isEmpty()) {
            activeVirtualMachine.step();
            test();
        }
    }

    private void test() {
        if (realCpu.getSi() != SupervisorInterrupt.NONE) {
            dispatch(supervisorIterruptTable.get(realCpu.getSi()));
            realCpu.setSi(SupervisorInterrupt.NONE);
        }
        if (realCpu.getPi() != ProgramInterrupt.NONE) {
            dispatch(programInterruptTable.get(realCpu.getPi()));
            realCpu.setPi(ProgramInterrupt.NONE);
        }
        if (realCpu.getTi() == 0) {
            dispatch(onTimerInterrupt);
            realCpu.setTi(240);
        }
    }

    private void dispatch(Consumer<VirtualMachine> fn) {
        if (fn == null) {
            return;
        }

        realCpu.setMode(CpuMode.SUPERVISOR);

        try {
            fn.accept(activeVirtualMachine);
        } finally {
            realCpu.setMode(CpuMode.USER);
        }
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