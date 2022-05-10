package com.gusged.os.resource;

import com.gusged.os.process.Process;

public class EmptyResource extends Resource {
    public EmptyResource(Process creator) {
        super(creator, 0);
    }
}