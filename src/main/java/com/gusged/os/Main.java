package com.gusged.os;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;

import com.gusged.os.rm.RealMachine;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Starting OS");

        var injector = Guice.createInjector(new AppModule());
        var rm = injector.getInstance(RealMachine.class);
    }
}