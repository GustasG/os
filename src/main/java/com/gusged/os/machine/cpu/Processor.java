package com.gusged.os.machine.cpu;

import lombok.Data;

@Data
public final class Processor {
    private CpuMode mode;
    private int ptr;
    private int pc;
    private int sp;

    private int ti;
    private SupervisorInterrupt si;
    private ProgramInterrupt pi;

    public Processor() {
        mode = CpuMode.SUPERVISOR;
        si = SupervisorInterrupt.NONE;
        pi = ProgramInterrupt.NONE;
    }
}