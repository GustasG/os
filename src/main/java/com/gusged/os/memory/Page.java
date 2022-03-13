package com.gusged.os.memory;

import lombok.Data;

@Data
public class Page {
    private static transient long lastPageId = 0;

    private final int[] data;
    private Page next;

    public Page(int pageSize) {
        data = new int[pageSize];
    }

    public int readWord(int offset) {
        return data[offset];
    }

    public void writeWord(int offset, int value) {
        data[offset] = value;
    }
}