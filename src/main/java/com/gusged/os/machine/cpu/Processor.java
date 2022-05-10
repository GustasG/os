package com.gusged.os.machine.cpu;

import lombok.Data;

@Data
public class Processor {
    private CpuMode mode;
    private int ptr;
    private int pc;
    private int sp;

    private int ti;
    private SupervisorInterrupt si;
    private ProgramInterrupt pi;

    public Processor() {
        mode = CpuMode.USER;
        si = SupervisorInterrupt.NONE;
        pi = ProgramInterrupt.NONE;
        ti = 100;
    }
}