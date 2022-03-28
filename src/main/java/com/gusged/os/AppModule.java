package com.gusged.os;

import lombok.SneakyThrows;

import com.google.inject.AbstractModule;
import com.gusged.os.machine.HardDrive;

public class AppModule extends AbstractModule {
    @SneakyThrows
    @Override
    protected void configure() {
        bind(HardDrive.class)
                .toInstance(new HardDrive("HDD.txt", 1048,256));
    }
}