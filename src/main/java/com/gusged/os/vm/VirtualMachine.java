package com.gusged.os.vm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.rm.RealMachine;

public class VirtualMachine {
    private static final Logger logger = LoggerFactory.getLogger(VirtualMachine.class);

    private final RealMachine realMachine;

    public VirtualMachine(RealMachine realMachine) {
        this.realMachine = realMachine;
    }
}