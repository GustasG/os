package com.gusged.os.vm;

import lombok.Data;

import com.gusged.os.rm.RealMachine;
import com.gusged.os.memory.Page;

@Data
public class VirtualMachine {
    private final VirtualCpu virtualCpu;

    public VirtualMachine(RealMachine realMachine, Page[] virtualMemory) {
        virtualCpu = new VirtualCpu(realMachine, virtualMemory);
    }

    public void step() {
        virtualCpu.step();
    }
}