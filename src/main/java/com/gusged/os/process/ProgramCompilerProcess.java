package com.gusged.os.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.compiler.Program;
import com.gusged.os.resource.ProgramResource;
import com.gusged.os.resource.TaskProgram;

public class ProgramCompilerProcess extends Process {
    private static final Logger logger = LoggerFactory.getLogger(ProgramCompilerProcess.class);

    private int step;

    public ProgramCompilerProcess(Process parent) {
        super(parent, 20);
        step = 0;
    }

    @Override
    public void execute() {
        logger.trace("Step {}", step);

        switch (step) {
            case 0 -> {
                requestResource(ProgramResource.class);
                step += 1;
            }
            case 1 -> {
                var tim = findAcquiredResource(ProgramResource.class);
                acquiredResources.clear();

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