package com.gusged.os.resource;

import lombok.Getter;

import com.gusged.os.process.Process;
import com.gusged.os.compiler.Program;
import com.gusged.os.process.JobGovernor;

@Getter
public class TaskProgram extends Resource {
    private Program program;
    private JobGovernor governor;

    public TaskProgram(Process creator) {
        super(creator, 0);
    }

    public TaskProgram(Process creator, Program program) {
        super(creator, 1);
        this.program = program;
    }

    public TaskProgram(JobGovernor governor) {
        super(governor, 1);
        this.governor = governor;
    }
}