package com.gusged.os.resource;

import lombok.Getter;
import lombok.Setter;

import com.gusged.os.process.Process;

@Setter
@Getter
public class ProgramInputStream extends Resource {
    private String payload;

    public ProgramInputStream(Process creator) {
        super(creator, 0);
    }
}