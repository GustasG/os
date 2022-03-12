package com.gusged.os.machine;

import lombok.Data;

import com.gusged.os.machine.cpu.CpuMode;
import com.gusged.os.machine.cpu.ProgramInterrupt;
import com.gusged.os.machine.cpu.SupervisorInterrupt;

@Data
class RealCpu {
    private CpuMode mode;
    private int pc;
    private int sp;
    private int ti;
    private SupervisorInterrupt si;
    private ProgramInterrupt pi;

    public RealCpu() {
        mode = CpuMode.SUPERVISOR;
        si = SupervisorInterrupt.NONE;
        pi = ProgramInterrupt.NONE;
    }
}