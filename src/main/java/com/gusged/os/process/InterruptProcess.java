package com.gusged.os.process;

import com.gusged.os.Kernel;

public class InterruptProcess extends Process {
    public InterruptProcess(Kernel kernel, Process parent, int priority) {
        super(kernel, parent, priority);
    }

    @Override
    public void execute() {

    }
}