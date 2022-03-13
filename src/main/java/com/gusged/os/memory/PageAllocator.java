package com.gusged.os.memory;

import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class PageAllocator {
    private static transient final Logger logger = LoggerFactory.getLogger(PageAllocator.class);

    private final Page[] memoryPages;
    private Page head;
    private int freePageCount;

    public PageAllocator(int pageCount, int pageSize) {
        memoryPages = createPages(pageCount, pageSize);
        freePageCount = pageCount;
        head = memoryPages[0];

        for (int i = 1; i < memoryPages.length; i++) {
            memoryPages[i - 1].setNext(memoryPages[i]);
        }
    }

    public Page[] allocatePages(int requestedPageCount) {
        if (getFreePageCount() < requestedPageCount) {
            throw new OutOfMemoryError(String.format("Cannot allocate %d pages of memory. Out of memory", requestedPageCount));
        }

        logger.debug("Allocating {} pages of memory", requestedPageCount);
        var pages = new Page[requestedPageCount];

        for (int i = 0; i < requestedPageCount; i++) {
            pages[i] = head;
            head = head.getNext();
            pages[i].setNext(null);
        }

        freePageCount -= requestedPageCount;
        return pages;
    }

    public void freePages(Page[] pages) {
        logger.debug("Released {} pages of memory", pages.length);

        for (var page : pages) {
            page.setNext(head);
            head = page;
        }

        freePageCount += pages.length;
    }

    private static Page[] createPages(int count, int pageSize) {
        var pages = new Page[count];

        for (int i = 0; i < pages.length; i++) {
            pages[i] = new Page(pageSize);
        }

        return pages;
    }
}