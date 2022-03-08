package com.gusged.os.interpreter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Instruction {
    ADD(0x01),
    SUB(0x02),
    MUL(0x03),
    DIV(0x04),

    PUSH(0x05),
    POP(0x06),

    CMP(0x07),

    JMP(0x08),
    JE(0x09),
    JB(0x0A),
    JA(0x0B);

    private final int opcode;
}