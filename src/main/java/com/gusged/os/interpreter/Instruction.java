package com.gusged.os.interpreter;

public enum Instruction {
    ADD,
    SUB,
    MUL,
    DIV,
    MOD,

    PUSH_CONST,
    PUSH_VAR,
    POP,
    POP_VAR,

    CMP,
    MOV_CONST,
    MOV_VAR,

    JMP,
    JE,
    JNE,
    JB,
    JA;

    public int getOpcode() {
        return ordinal() + 1;
    }
}