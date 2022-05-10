package com.gusged.os.machine;

import java.util.Queue;
import java.util.LinkedList;

import static com.gusged.os.Constants.PAGE_COUNT;
import static com.gusged.os.Constants.VIRTUAL_MACHINE_PAGE_COUNT;

public class PageAllocator {
    private final Queue<Integer> freePages;

    public PageAllocator() {
        freePages = createPageTable(PAGE_COUNT / VIRTUAL_MACHINE_PAGE_COUNT);
    }

    public int allocateMemory() {
        if (freePages.isEmpty()) {
            throw new OutOfMemoryError("Created too much virtual machines");
        }

        return freePages.poll();
    }

    public void freeMemory(int pageAddress) {
        freePages.add(pageAddress);
    }

    private static Queue<Integer> createPageTable(int pageCount) {
        var pages = new LinkedList<Integer>();

        for (int i = 0; i < pageCount; i++) {
            pages.add(i*VIRTUAL_MACHINE_PAGE_COUNT);
        }

        return pages;
    }
}