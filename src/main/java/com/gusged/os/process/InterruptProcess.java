package com.gusged.os.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.resource.FromInterrupt;
import com.gusged.os.resource.InterruptResource;

public class InterruptProcess extends Process {
    private final Logger logger = LoggerFactory.getLogger(InterruptProcess.class);

    private Process target;
    private int step;

    public InterruptProcess(Process parent) {
        super(parent, 100);
        step = 0;
    }

    @Override
    public void execute() {
        switch (step) {
            case 0 -> {
                requestResource(InterruptResource.class);
                step += 1;
            }
            case 1 -> {
                var ir = findAcquiredResource(InterruptResource.class);
                acquiredResources.clear();

                target = ir.getCreator().getParent();
                step += 1;
            }
            case 2 -> {
                kernel.createResource(new FromInterrupt(this, (JobGovernor) target));
                step = 0;
            }
            default -> logger.error("Invalid step {}", step);
        }
    }
}