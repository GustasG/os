package com.gusged.os.resource;

import lombok.Getter;

import com.gusged.os.process.Process;

@Getter
public class TaskInMemory extends Resource {
    private String program;

    public TaskInMemory(Process creator) {
        super(creator, 0);
    }

    public TaskInMemory(Process creator, String program) {
        super(creator, 1);
        this.program = program;
    }
}