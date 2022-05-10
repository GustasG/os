package com.gusged.os.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.resource.TaskProgram;

public class MainProc extends Process {
    private final Logger logger = LoggerFactory.getLogger(MainProc.class);

    private int step;

    public MainProc(Process parent) {
        super(parent, 50);
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
                var tp = findAcquiredResource(TaskProgram.class);
                acquiredResources.clear();

                if (tp.getGovernor() == null) {
                    kernel.createProcess(new JobGovernor(this, tp.getProgram()));
                } else {
                    var governor = tp.getGovernor();
                    governor.destroy();
                    children.remove(governor);
                }

                step = 0;
            }
            default -> logger.error("Invalid step {}", step);
        }
    }
}