package com.gusged.os.rm.memory;

import lombok.Data;

import com.gusged.os.MemoryPage;

@Data
public class UserMemory {
    private final MemoryPage[] memory;

    public UserMemory(int pageCount) {
        memory = new MemoryPage[pageCount];
    }
}
