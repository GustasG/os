package com.gusged.os.resource;

import com.gusged.os.process.Process;
import com.gusged.os.machine.PageAllocator;

public class MemoryAllocatorResource extends Resource {
    private final PageAllocator allocator;

    public MemoryAllocatorResource(Process creator) {
        super(creator, 1);
        allocator = new PageAllocator();
    }

    public int allocateMemory() {
        return allocator.allocateMemory();
    }

    public void freeMemory(int memory) {
        allocator.freeMemory(memory);
    }
}