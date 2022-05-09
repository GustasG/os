package com.gusged.os.process;

import com.gusged.os.resource.DummyResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.Kernel;

public class DummyProcess extends Process{
    private final Logger logger = LoggerFactory.getLogger(DummyProcess.class);

    private int step;

    public DummyProcess(Kernel kernel, Process parent) {
        super(kernel, parent, 1);
        step = 0;
    }

    @Override
    public void execute() {
        switch (step) {
            case 0 -> {
                kernel.createResource(new DummyResource(this));
                step += 1;
            }
            case 1 -> {
                requestResource(DummyResource.class);
                step += 1;
            }
            case 2 -> {
                freeResource(DummyResource.class);
                step = 1;
            }
        }
    }
}