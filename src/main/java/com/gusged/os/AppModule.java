package com.gusged.os;

import com.google.inject.AbstractModule;

import com.gusged.os.rm.device.InputDevice;
import com.gusged.os.rm.device.OutputDevice;
import com.gusged.os.rm.device.PrinterDevice;
import com.gusged.os.rm.device.ScannerDevice;
import com.gusged.os.rm.memory.UserMemory;
import com.gusged.os.rm.memory.SupervisorMemory;

public class AppModule extends AbstractModule {
    @Override
    public void configure() {
        bind(InputDevice.class)
                .toInstance(new ScannerDevice());

        bind(OutputDevice.class)
                .toInstance(new PrinterDevice());

        bind(SupervisorMemory.class)
                .toInstance(new SupervisorMemory(512));

        bind(UserMemory.class)
                .toInstance(new UserMemory(1536));
    }
}