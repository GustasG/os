package com.gusged.os.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.Kernel;

public class JobGovernor extends Process {
    private static final Logger logger = LoggerFactory.getLogger(JobGovernor.class);

    private int step;

    public JobGovernor(Kernel kernel, Process parent) {
        super(kernel, parent, 45);
        step = 0;
    }

    @Override
    public void execute() {
        logger.trace("Step {}", step);

        switch (step) {
            case 0 -> {

            }
            default -> logger.error("Invalid step {}", step);
        }
    }
}