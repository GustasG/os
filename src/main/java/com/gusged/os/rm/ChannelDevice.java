package com.gusged.os.rm;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.rm.device.InputDevice;
import com.gusged.os.rm.device.OutputDevice;

public class ChannelDevice {
    private static final Logger logger = LoggerFactory.getLogger(ChannelDevice.class);

    private final InputDevice inputDevice;
    private final OutputDevice outputDevice;

    @Inject
    public ChannelDevice(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }
}