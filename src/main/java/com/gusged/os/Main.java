package com.gusged.os;

import com.gusged.os.interpreter.Program;
import com.gusged.os.machine.rm.cpu.SupervisorInterrupt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;

import com.gusged.os.machine.rm.RealMachine;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        var injector = Guice.createInjector(new AppModule());
        var rm = injector.getInstance(RealMachine.class);

        rm.onSupervisorInterrupt(SupervisorInterrupt.HALT, (virtual) -> {
            rm.freeVirtualMachine(virtual);
        });

        var vm = rm.createVirtualMachine();
        rm.setActiveVirtualMachine(vm);

        try {
            var program = Program.createFromFile("programs/factorial.asm");
            vm.loadProgram(program);

            rm.run();
        } catch (Exception e) {
            logger.error("Running error", e);
        }
    }
}