package com.gusged.os;

import java.util.concurrent.atomic.AtomicBoolean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;

import com.gusged.os.interpreter.Program;
import com.gusged.os.machine.cpu.CpuMode;
import com.gusged.os.machine.RealMachine;
import com.gusged.os.machine.VirtualMachine;
import com.gusged.os.machine.cpu.SupervisorInterrupt;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        var injector = Guice.createInjector(new AppModule());

        var running = new AtomicBoolean(true);

        var rm = injector.getInstance(RealMachine.class);
        rm.onSupervisorInterrupt(SupervisorInterrupt.HALT, realMachine -> {
            running.set(false);
        });

        rm.onTimerInterrupt(realMachine -> {
            logger.info("In interrupt: {}", realMachine.getProcessor());
        });

        rm.getProcessor()
                .setMode(CpuMode.USER);

        rm.setTi(2);

        var vm = new VirtualMachine(rm);

        try {
            var program = Program.createFromFile("programs/sandbox.asm");
            vm.loadProgram(program);

            while (running.get()) {
                vm.step();
            }
        } catch (Exception e) {
            logger.error("Running error", e);
        }
    }
}