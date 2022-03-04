package com.gusged.os.rm;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.rm.cpu.RealCpu;

public class RealMachine {
    private static final Logger logger = LoggerFactory.getLogger(RealMachine.class);

    private final ChannelDevice channelDevice;
    private final RealCpu cpu;
    private final PageTable pageTable;

    @Inject
    public RealMachine(ChannelDevice channelDevice, RealCpu cpu, PageTable pageTable) {
        this.channelDevice = channelDevice;
        this.cpu = cpu;
        this.pageTable = pageTable;
    }
}