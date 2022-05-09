package com.gusged.os.process;

import com.gusged.os.compiler.CodeGenerator;
import com.gusged.os.compiler.Program;
import com.gusged.os.compiler.report.ListStorageErrorReporter;
import com.gusged.os.resource.TaskInMemory;
import com.gusged.os.resource.TaskProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.Kernel;

public class JCL extends Process {
    private static final Logger logger = LoggerFactory.getLogger(JCL.class);

    private int step;

    public JCL(Kernel kernel, Process parent) {
        super(kernel, parent, 20);
        step = 0;
    }

    @Override
    public void execute() {
        logger.trace("Step {}", step);

        switch (step) {
            case 0 -> {
                requestResource(TaskInMemory.class);
                step += 1;
            }
            case 1 -> {
                var tim = findAcquiredResource(TaskInMemory.class);

                try {
                    var program = Program.createFromString(tim.getProgram());
                    kernel.createResource(new TaskProgram(this, program));
                } catch (Exception e) {
                    logger.error("Failed to validate progrma", e);
                }

                step = 0;
            }
            default -> logger.error("Invalid step {}", step);
        }
    }
}