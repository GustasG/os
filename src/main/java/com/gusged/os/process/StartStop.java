package com.gusged.os.process;

import com.gusged.os.resource.TaskInMemory;
import com.gusged.os.resource.TaskProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.Kernel;
import com.gusged.os.resource.InputStream;
import com.gusged.os.resource.MosFinal;

public class StartStop extends Process {
    private static final Logger logger = LoggerFactory.getLogger(StartStop.class);

    private int step;

    public StartStop(Kernel kernel) {
        super(kernel, null, 10);
        step = 0;
    }

    @Override
    public void execute() {
        logger.trace("Step {}", step);

        switch (step) {
            case 0 -> {
                // TODO: Create resources here
                kernel.createResource(new MosFinal(this));
                kernel.createResource(new InputStream(this));
                kernel.createResource(new TaskInMemory(this));
                kernel.createResource(new TaskProgram(this));
                step += 1;
            }
            case 1 -> {
                // TODO: Create processes here
                kernel.createProcess(new DummyProcess(kernel, this));
                kernel.createProcess(new ReadFromInterface(kernel, this));
                kernel.createProcess(new JCL(kernel, this));
                kernel.createProcess(new MainProc(kernel, this));
                step += 1;
            }
            case 2 -> {
                requestResource(MosFinal.class);
                step += 1;
            }
            case 3 -> {
                destroy();
                kernel.setRunning(false);
                step += 1;
            }
            default -> logger.error("Invalid step {}", step);
        }
    }
}