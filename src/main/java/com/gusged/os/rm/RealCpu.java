package com.gusged.os.rm;

import lombok.Data;

import com.gusged.os.rm.cpu.CpuMode;

@Data
public class RealCpu {
    private int pc;
    private int sp;
    CpuMode mode;
}