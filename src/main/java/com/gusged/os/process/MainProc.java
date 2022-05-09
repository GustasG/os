package com.gusged.os.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.Kernel;
import com.gusged.os.resource.TaskProgram;

public class MainProc extends Process {
    private final Logger logger = LoggerFactory.getLogger(MainProc.class);

    private int step;

    // TODO: Create vm pages in here
    public MainProc(Kernel kernel, Process parent) {
        super(kernel, parent, 50);
        step = 0;
    }

    @Override
    public void execute() {
        logger.trace("Step {}", step);

        switch (step) {
            case 0 -> {
                requestResource(TaskProgram.class);
                step += 1;
            }
            case 1 -> {
                var program = findAcquiredResource(TaskProgram.class);
                step = 0;
            }
            default -> logger.error("Invalid step {}", step);
        }
    }
}