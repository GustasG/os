package com.gusged.os.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.Kernel;
import com.gusged.os.resource.InputStream;

public class ReadFromInterface extends Process {
    private static final Logger logger = LoggerFactory.getLogger(ReadFromInterface.class);

    private int state;

    public ReadFromInterface(Kernel kernel, Process parent) {
        super(kernel, parent, 15);
        state = 0;
    }

    @Override
    public void execute() {
        switch (state) {
            case 0 -> {
                kernel.requestResource(InputStream.class, this);
                state += 1;
            }
            case 1 -> {

            }
        }
    }
}
