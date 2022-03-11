package com.gusged.os.machine;

import java.util.List;
import java.util.ArrayList;

import javax.inject.Inject;

import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.memory.PageTable;

@Data
public class RealMachine {
    private static transient final Logger logger = LoggerFactory.getLogger(RealMachine.class);

    private final RealCpu realCpu;
    private final PageTable pageTable;
    private final List<VirtualMachine> virtualMachines;

    @Inject
    public RealMachine(RealCpu realCpu, PageTable pageTable) {
        this.realCpu = realCpu;
        this.pageTable = pageTable;
        this.virtualMachines = new ArrayList<>();
    }

    public VirtualMachine createVirtualMachine() {
        var memory = pageTable.acquirePages(16);
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
}