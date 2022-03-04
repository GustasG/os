package com.gusged.os.rm.cpu;

import lombok.Data;

@Data
public class RealCpu {
    private int pc;
    private int sp;
    CpuMode mode;
    ProgramInterrupt pi;
    SupervisorInterrupt si;
    int ti;

    public RealCpu() {
        mode = CpuMode.SUPERVISOR;
        pi = ProgramInterrupt.NONE;
        si = SupervisorInterrupt.NONE;
    }
}