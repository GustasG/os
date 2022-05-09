package com.gusged.os.process;

import com.gusged.os.resource.TaskInMemory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.Kernel;
import com.gusged.os.resource.InputStream;

public class ReadFromInterface extends Process {
    private static final Logger logger = LoggerFactory.getLogger(ReadFromInterface.class);

    private int step;

    public ReadFromInterface(Kernel kernel, Process parent) {
        super(kernel, parent, 15);
        step = 0;
    }

    @Override
    public void execute() {
        logger.trace("Step {}", step);

        switch (step) {
            case 0 -> {
                requestResource(InputStream.class);
                step += 1;
            }
            case 1 -> {
                var is = findAcquiredResource(InputStream.class);
                kernel.createResource(new TaskInMemory(this, is.getPayload()));
//                var tim = kernel.findResource(TaskInMemory.class);
//                tim.setProgram(is.getPayload());
//                kernel.freeResource(tim);
                step = 0;
            }
            default -> logger.error("Invalid step {}", step);
        }
    }
}
