package com.gusged.os.machine;

import com.gusged.os.machine.cpu.CpuMode;
import static com.gusged.os.Constants.*;

public class RealCpu {
    private CpuMode mode;
    private int pc;
    private int sp;

    public RealCpu() {
        mode = CpuMode.SUPERVISOR;
    }

    public void enterMode(CpuMode mode) {
        this.mode = mode;
    }

    public int getPc() {
        return CODE_SEGMENT_START + pc;
    }

    public void jump(int address) {
        pc = address % CODE_SEGMENT_SIZE;
    }

    public void advance() {
        jump(pc + 1);
    }

    public int getSp() {
        return STACK_SEGMENT_START + sp;
    }

    public void incrementSp() {
        sp = (sp + 1) % STACK_SEGMENT_SIZE;
    }

    public void decrementSp() {
        sp = (sp - 1) % STACK_SEGMENT_SIZE;
    }
}