package com.gusged.os;

import lombok.Data;

@Data
public class MemoryPage {
    private final int[] data;

    public MemoryPage() {
        data = new int[256];
    }
}