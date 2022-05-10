package com.gusged.os.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.resource.ProgramInputStream;
import com.gusged.os.resource.ProgramResource;

public class ProgramInputProcess extends Process {
    private static final Logger logger = LoggerFactory.getLogger(ProgramInputProcess.class);

    private int step;

    public ProgramInputProcess(Process parent) {
        super(parent, 15);
        step = 0;
    }

    @Override
    public void execute() {
        logger.trace("Step {}", step);

        switch (step) {
            case 0 -> {
                requestResource(ProgramInputStream.class);
                step += 1;
            }
            case 1 -> {
                var is = findAcquiredResource(ProgramInputStream.class);
                acquiredResources.clear();
                kernel.createResource(new ProgramResource(this, is.getPayload()));
                step = 0;
            }
            default -> logger.error("Invalid step {}", step);
        }
    }
}
