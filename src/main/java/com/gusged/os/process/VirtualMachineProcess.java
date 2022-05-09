package com.gusged.os.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.Kernel;

public class VirtualMachineProcess extends Process {
    private final Logger logger = LoggerFactory.getLogger(VirtualMachineProcess.class);

    private int step;

    public VirtualMachineProcess(Kernel kernel, Process parent) {
        super(kernel, parent, 5);
        step = 0;
    }

    @Override
    public void execute() {
        logger.trace("Step {}", step);

        switch (step) {
            default -> logger.error("Invalid step {}", step);
        }
    }
}