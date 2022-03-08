package com.gusged.os.rm;

import javax.inject.Inject;

import lombok.Data;

import com.gusged.os.memory.PageTable;

@Data
public class RealMachine {
    private final RealCpu realCpu;
    private final PageTable memory;

    @Inject
    public RealMachine(RealCpu realCpu, PageTable memory) {
        this.realCpu = realCpu;
        this.memory = memory;
    }
}