package com.gusged.os.memory;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Page {
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