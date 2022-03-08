package com.gusged.os.vm;

import com.gusged.os.Utility;
import com.gusged.os.memory.Page;
import com.gusged.os.rm.RealCpu;
import com.gusged.os.rm.RealMachine;
import com.gusged.os.interpreter.Instruction;

import static com.gusged.os.Constants.PAGE_SIZE;

public class VirtualCpu {
    private final RealMachine realMachine;
    private final RealCpu realCpu;
    private final Page[] virtualMemory;

    public VirtualCpu(RealMachine realMachine, Page[] virtualMemory) {
        this.realMachine = realMachine;
        this.realCpu = realMachine.getRealCpu();
        this.virtualMemory = virtualMemory;
    }

    public void step() {
        int instruction = readInstruction();

        if (instruction == Instruction.ADD.getOpcode()) {
            add();
        } else if (instruction == Instruction.SUB.getOpcode()) {
            sub();
        } else if (instruction == Instruction.MUL.getOpcode()) {
            mul();
        } else if (instruction == Instruction.DIV.getOpcode()) {
            div();
        } else if (instruction == Instruction.PUSH.getOpcode()) {
            push();
        } else if (instruction == Instruction.POP.getOpcode()) {
            pop();
        } else if (instruction == Instruction.CMP.getOpcode()) {
            cmp();
        } else if (instruction == Instruction.JMP.getOpcode()) {
            jmp();
        } else if (instruction == Instruction.JE.getOpcode()) {
            je();
        } else if (instruction == Instruction.JB.getOpcode()) {
            jb();
        } else if (instruction == Instruction.JA.getOpcode()) {
            ja();
        }
    }

    private void add() {
        var lhs = popFromStack();
        var rhs = popFromStack();

        pushToStack(lhs + rhs);
    }

    private void sub() {
        var rhs = popFromStack();
        var lhs = popFromStack();

        pushToStack(lhs - rhs);
    }

    private void mul() {
        var rhs = popFromStack();
        var lhs = popFromStack();

        pushToStack(lhs * rhs);
    }

    private void div() {
        var rhs = popFromStack();
        var lhs = popFromStack();

        pushToStack(lhs / rhs);
    }

    private void push() {
        var value = readInstruction();
        pushToStack(value);
    }

    private void pop() {
        popFromStack();
    }

    private void cmp() {
        var rhs = popFromStack();
        var lhs = popFromStack();
        pushToStack(Utility.clamp(lhs - rhs, -1, 1));
    }

    private void jmp() {
        int location = readInstruction();
        realCpu.setPc(location);
    }

    private void je() {
        var condition = popFromStack();
        var location = readInstruction();

        if (condition == 0) {
            realCpu.setPc(location);
        }
    }

    private void jb() {
        var condition = popFromStack();
        var location = readInstruction();

        if (condition == -1) {
            realCpu.setPc(location);
        }
    }

    private void ja() {
        var condition = popFromStack();
        var location = readInstruction();

        if (condition == 1) {
            realCpu.setPc(location);
        }
    }

    private int popFromStack() {
        int value = readFromVirtualAddress(realCpu.getSs() + realCpu.getSp());
        realCpu.setSp(realCpu.getSp() - 1);

        return value;
    }

    private void pushToStack(int value) {
        writeToVirtualAddress(realCpu.getSs() + realCpu.getSp(), value);
        realCpu.setSp(realCpu.getSp() + 1);
    }

    private int readInstruction() {
        int instruction = readFromVirtualAddress(realCpu.getCs() + realCpu.getPc());
        realCpu.setPc(realCpu.getPc() + 1);

        return instruction;
    }

    private int readFromVirtualAddress(int address) {
        int page = address / PAGE_SIZE;
        int offset = address - page * PAGE_SIZE;

        return virtualMemory[page].readWord(offset);
    }

    private void writeToVirtualAddress(int address, int value) {
        int page = address / PAGE_SIZE;
        int offset = address - page * PAGE_SIZE;

        virtualMemory[page].writeWord(offset, value);
    }
}