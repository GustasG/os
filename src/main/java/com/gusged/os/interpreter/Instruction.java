package com.gusged.os.interpreter;

public enum Instruction {
    ADD,
    INC,
    SUB,
    DEC,
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
    JA,

    HALT,
    PRINTN,
    SCANN;

    public int getOpcode() {
        return ordinal() + 1;
    }
}