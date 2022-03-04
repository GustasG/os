package com.gusged.os.rm.memory;

import lombok.Data;

import com.gusged.os.MemoryPage;

@Data
public class SupervisorMemory {
    private final MemoryPage[] memory;

    public SupervisorMemory(int pageCount) {
        memory = new MemoryPage[pageCount];
    }
}