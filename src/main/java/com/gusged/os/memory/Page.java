package com.gusged.os.memory;

import lombok.Data;

@Data
public class Page {
    private final int[] data;
    Page next;

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