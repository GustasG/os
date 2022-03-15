package com.gusged.os.machine.rm;

import lombok.Data;

import com.gusged.os.machine.rm.cpu.CpuMode;
import com.gusged.os.machine.rm.cpu.ProgramInterrupt;
import com.gusged.os.machine.rm.cpu.SupervisorInterrupt;

import static com.gusged.os.Constants.*;

@Data
public class RealCpu {
    private CpuMode mode;
    private int ptr;
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

    public void jump(int address) {
        pc = address % CODE_SEGMENT_SIZE;
    }

    public void advance() {
        jump(pc + 1);
    }

    public int getPc() {
        return pc + CODE_SEGMENT_START;
    }

    public void incrementSp() {
        sp = (sp + 1) % STACK_SEGMENT_SIZE;
    }

    public void decrementSp() {
        sp = (sp - 1) % STACK_SEGMENT_SIZE;
    }

    public int getSp() {
        return sp + STACK_SEGMENT_START;
    }
}