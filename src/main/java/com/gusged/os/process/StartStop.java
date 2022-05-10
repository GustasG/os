package com.gusged.os.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.resource.*;

public class StartStop extends Process {
    private static final Logger logger = LoggerFactory.getLogger(StartStop.class);

    private int step;

    public StartStop() {
        super(null, 40);
        step = 0;
    }

    @Override
    public void execute() {
        logger.trace("Step {}", step);

        switch (step) {
            case 0 -> {
                kernel.createResource(new MosFinal(this));
                kernel.createResource(new ProgramInputStream(this));
                kernel.createResource(new ProgramResource(this));
                kernel.createResource(new TaskProgram(this));
                kernel.createResource(new MemoryAllocatorResource(this));
                kernel.createResource(new InterruptResource(this));
                kernel.createResource(new FromInterrupt(this));
                kernel.createResource(new EmptyResource(this));
                step += 1;
            }
            case 1 -> {
                kernel.createProcess(new ProgramInputProcess(this));
                kernel.createProcess(new ProgramCompilerProcess(this));
                kernel.createProcess(new MainProc(this));
                kernel.createProcess(new InterruptProcess(this));
                step += 1;
            }
            case 2 -> {
                requestResource(MosFinal.class);
                step += 1;
            }
            case 3 -> {
                destroy();
                acquiredResources.clear();
                kernel.setRunning(false);
                step += 1;
            }
            default -> logger.error("Invalid step {}", step);
        }
    }
}