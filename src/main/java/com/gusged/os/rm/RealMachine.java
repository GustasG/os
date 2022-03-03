package com.gusged.os.rm;

import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.MemoryPage;
import com.gusged.os.rm.cpu.CpuMode;
import com.gusged.os.vm.VirtualMachine;

public class RealMachine {
    private static final Logger logger = LoggerFactory.getLogger(RealMachine.class);

    private final ChannelDevice channelDevice;
    private final List<VirtualMachine> virtualMachines;
    private final MemoryPage[] memoryPages;
    private final RealCpu cpu;

    public RealMachine() {
        channelDevice = new ChannelDevice();
        virtualMachines = new ArrayList<>();
        memoryPages = new MemoryPage[2048];
        for (int i = 0; i < memoryPages.length; i++) {
            memoryPages[i] = new MemoryPage();
        }

        cpu = new RealCpu();
        cpu.setMode(CpuMode.SUPERVISOR);
    }
}