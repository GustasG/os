package com.gusged.os;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.rm.RealMachine;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Starting OS");

        var rm = new RealMachine();
    }
}