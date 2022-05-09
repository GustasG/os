package com.gusged.os.resource;

import com.gusged.os.process.Process;

public class DummyResource extends Resource {
    public DummyResource(Process creator) {
        super(creator, 1);
    }
}