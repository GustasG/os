package com.gusged.os.machine.vm;

import lombok.Data;

import static com.gusged.os.Constants.*;

@Data
public class VirtualCpu {
    private int pc;
    private int sp;

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