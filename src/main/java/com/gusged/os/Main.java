package com.gusged.os;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;

import com.gusged.os.machine.RealMachine;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Starting OS");

        var injector = Guice.createInjector(new AppModule());
        var rm = injector.getInstance(RealMachine.class);

        var vm = rm.createVirtualMachine();

        try {
            vm.loadProgram("programs/example.asm");

            vm.singleStep();
            vm.singleStep();
            vm.singleStep();
        } catch (Exception e) {
            logger.error("Running error", e);
        }

        rm.freeVirtualMachine(vm);
    }
}