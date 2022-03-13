package com.gusged.os;

import com.google.inject.AbstractModule;

import com.gusged.os.memory.PageAllocator;
import static com.gusged.os.Constants.PAGE_SIZE;
import static com.gusged.os.Constants.PAGE_COUNT;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PageAllocator.class)
                .toInstance(new PageAllocator(PAGE_COUNT, PAGE_SIZE));
    }
}