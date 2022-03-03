package com.gusged.os.rm;

import com.gusged.os.rm.device.InputDevice;
import com.gusged.os.rm.device.OutputDevice;

public class ChannelDevice {
    private final InputDevice inputDevice;
    private final OutputDevice outputDevice;

    public ChannelDevice() {
        inputDevice = new InputDevice();
        outputDevice = new OutputDevice();
    }
}