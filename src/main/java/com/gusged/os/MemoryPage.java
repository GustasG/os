package com.gusged.os;

import lombok.Data;

@Data
public class MemoryPage {
    private final int[] data;

    public MemoryPage() {
        data = new int[256];
    }

    public static MemoryPage[] allocatePages(int count) {
        var pages = new MemoryPage[count];

        for (int i = 0; i < count; i++) {
            pages[i] = new MemoryPage();
        }

        return pages;
    }
}