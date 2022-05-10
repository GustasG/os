package com.gusged.os.resource;

import lombok.Getter;

import com.gusged.os.process.Process;

@Getter
public class InterruptResource extends Resource {
    public InterruptResource(Process creator) {
        super(creator, 0);
    }
}