package com.gusged.os.process;

import com.gusged.os.machine.cpu.CpuMode;
import com.gusged.os.resource.InterruptResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.compiler.Program;
import com.gusged.os.machine.RealMachine;
import com.gusged.os.machine.cpu.Processor;
import com.gusged.os.machine.VirtualMachine;

public class VirtualMachineProcess extends Process {
    private final Logger logger = LoggerFactory.getLogger(VirtualMachineProcess.class);

    private final RealMachine realMachine;
    private final VirtualMachine virtualMachine;
    private final Processor processor;
    private int step;

    public VirtualMachineProcess(Process parent, Program program, int ptr) {
        super(parent, 15);
        realMachine = kernel.getRealMachine();
        virtualMachine = new VirtualMachine(realMachine);
        processor = new Processor();
        processor.setPtr(ptr);
        realMachine.setProcessor(processor);
        virtualMachine.loadProgram(program);
        step = 0;
    }

    @Override
    public void execute() {
        logger.trace("Step {}", step);

        switch (step) {
            case 0 -> {
                realMachine.setProcessor(processor);
                processor.setMode(CpuMode.USER);
                step += 1;
            }
            case 1 -> {
                while (!virtualMachine.test()) {
                    virtualMachine.step();
                }

                processor.setMode(CpuMode.SUPERVISOR);
                var ir = new InterruptResource(this);
                kernel.createResource(ir);
                kernel.freeResource(ir);
                step = 0;
            }
            default -> logger.error("Invalid step {}", step);
        }
    }
}