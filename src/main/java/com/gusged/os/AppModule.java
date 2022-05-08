package com.gusged.os;

import lombok.SneakyThrows;

import com.gusged.os.machine.Memory;
import com.gusged.os.machine.HardDrive;
import com.google.inject.AbstractModule;

import static com.gusged.os.Constants.PAGE_COUNT;
import static com.gusged.os.Constants.PAGE_SIZE;

public class AppModule extends AbstractModule {
    @SneakyThrows
    @Override
    protected void configure() {
        bind(HardDrive.class)
                .toInstance(new HardDrive("HDD.txt", 1048,256));

        bind(Memory.class)
                .toInstance(new Memory(PAGE_COUNT, PAGE_SIZE));
    }
}