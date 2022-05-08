package com.gusged.os.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.Kernel;
import com.gusged.os.resource.InputStream;
import com.gusged.os.resource.MosFinal;
import com.gusged.os.resource.SupervisorMemory;

public class StartStop extends Process {
    private static final Logger logger = LoggerFactory.getLogger(StartStop.class);

    private int state;

    public StartStop(Kernel kernel) {
        super(kernel, null, 10);
        state = 0;
    }

    @Override
    public void execute() {
        switch (state) {
            case 0 -> {
                // TODO: Create resources here
                kernel.createResource(new MosFinal(this));
                kernel.createResource(new InputStream(this));
                kernel.createResource(new SupervisorMemory(this));
                state += 1;
            }
            case 1 -> {
                // TODO: Create processes here
                kernel.createProcess(new ReadFromInterface(kernel, this));
                state += 1;
            }
            case 2 -> {
                kernel.requestResource(MosFinal.class, this);
                state += 1;
            }
            case 3 -> {
                destroy();
                kernel.shutdown();
                state += 1;
            }
            default -> logger.error("Invalid state {}", state);
        }
    }
}