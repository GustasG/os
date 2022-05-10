package com.gusged.os.resource;

import lombok.Getter;

import com.gusged.os.process.Process;
import com.gusged.os.process.JobGovernor;

@Getter
public class FromInterrupt extends Resource {
    private JobGovernor target;

    public FromInterrupt(Process creator) {
        super(creator, 0);
    }

    public FromInterrupt(Process creator, JobGovernor target) {
        super(creator, 1);
        this.target = target;
    }
}