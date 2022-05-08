package com.gusged.os.machine;

import lombok.Getter;

@Getter
public class Memory {
    private final int[] data;
    private final int pageCount;
    private final int pageSize;

    public Memory(int pageCount, int pageSize) {
        this.data = new int[pageCount * pageSize];
        this.pageCount = pageCount;
        this.pageSize = pageSize;
    }

    public void write(int address, int value) {
        data[address] = value;
    }

    public int read(int address) {
        return data[address];
    }
}