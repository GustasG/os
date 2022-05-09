package com.gusged.os.resource;

import lombok.Getter;
import lombok.Setter;

import com.gusged.os.process.Process;

@Setter
@Getter
public class InputStream extends Resource {
    private String payload;

    public InputStream(Process creator) {
        super(creator, 0);
    }
}