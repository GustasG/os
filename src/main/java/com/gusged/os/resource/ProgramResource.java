package com.gusged.os.resource;

import lombok.Getter;

import com.gusged.os.process.Process;

@Getter
public class ProgramResource extends Resource {
    private String program;

    public ProgramResource(Process creator) {
        super(creator, 0);
    }

    public ProgramResource(Process creator, String program) {
        super(creator, 1);
        this.program = program;
    }
}