package com.gusged.os;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;

import com.gusged.os.machine.rm.RealMachine;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        var injector = Guice.createInjector(new AppModule());
        var rm = injector.getInstance(RealMachine.class);

        var vm = rm.createVirtualMachine();
        rm.setActiveVirtualMachine(vm);

        try {
            vm.loadProgram("programs/example.asm");

            while (rm.getActiveVirtualMachine() != null) {
                rm.step();
            }

        } catch (Exception e) {
            logger.error("Running error", e);
        }
    }
}