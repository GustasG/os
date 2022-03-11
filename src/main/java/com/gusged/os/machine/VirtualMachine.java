package com.gusged.os.machine;

import java.util.List;
import java.io.IOException;

import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.gusged.os.generated.AssemblyLexer;
import com.gusged.os.generated.AssemblyParser;

import com.gusged.os.Utility;
import com.gusged.os.memory.Page;
import com.gusged.os.interpreter.Instruction;
import com.gusged.os.interpreter.CodeGenerator;

import static com.gusged.os.Constants.PAGE_SIZE;
import static com.gusged.os.Constants.DATA_SEGMENT_START;
import static com.gusged.os.Constants.CODE_SEGMENT_START;

@Data
public class VirtualMachine {
    private static transient final Logger logger = LoggerFactory.getLogger(VirtualMachine.class);

    private transient final RealMachine realMachine;
    private transient final RealCpu realCpu;
    private final Page[] virtualMemory;

    public VirtualMachine(RealMachine realMachine, Page[] virtualMemory) {
        this.virtualMemory = virtualMemory;
        this.realMachine = realMachine;
        this.realCpu = realMachine.getRealCpu();
    }

    public void loadProgram(String filePath) throws IOException {
        var charStream = CharStreams.fromFileName(filePath);
        var lexer = new AssemblyLexer(charStream);
        var parser = new AssemblyParser(new CommonTokenStream(lexer));
        var tree = parser.program();

        var generator = new CodeGenerator();
        generator.visit(tree);

        copyToPage(DATA_SEGMENT_START, generator.getDataSegment());
        copyToPage(CODE_SEGMENT_START, generator.getCodeSegment());
        logger.debug("Loaded program from {}", filePath);
    }

    private void copyToPage(int pageStart, List<Integer> payload) {
        for (int i = 0; i < payload.size(); i++) {
            writeToVirtualAddress(pageStart + i, payload.get(i));
        }
    }

    public void singleStep() {
        int instruction = readInstruction();

        if (instruction == Instruction.ADD.getOpcode()) {
            add();
        } else if (instruction == Instruction.SUB.getOpcode()) {
            sub();
        } else if (instruction == Instruction.MUL.getOpcode()) {
            mul();
        } else if (instruction == Instruction.DIV.getOpcode()) {
            div();
        } else if (instruction == Instruction.MOD.getOpcode()) {
            mod();
        } else if (instruction == Instruction.PUSH_CONST.getOpcode()) {
            pushConst();
        } else if (instruction == Instruction.PUSH_VAR.getOpcode()) {
            pushVariable();
        } else if (instruction == Instruction.POP.getOpcode()) {
            pop();
        } else if (instruction == Instruction.POP_VAR.getOpcode()) {
            popVariable();
        } else if (instruction == Instruction.CMP.getOpcode()) {
            cmp();
        } else if (instruction == Instruction.MOV_CONST.getOpcode()) {
            movConst();
        } else if (instruction == Instruction.MOV_VAR.getOpcode()) {
            movVariable();
        } else if (instruction == Instruction.JMP.getOpcode()) {
            jmp();
        } else if (instruction == Instruction.JE.getOpcode()) {
            je();
        } else if (instruction == Instruction.JNE.getOpcode()) {
            jne();
        } else if (instruction == Instruction.JB.getOpcode()) {
            jb();
        } else if (instruction == Instruction.JA.getOpcode()) {
            ja();
        } else {
            logger.error("Unknwon instruction: {}", instruction);
        }
    }

    private void add() {
        var rhs = popFromStack();
        var lhs = popFromStack();

        logger.trace("add {} {}", lhs, rhs);
        pushToStack(lhs + rhs);
    }

    private void sub() {
        var rhs = popFromStack();
        var lhs = popFromStack();

        logger.trace("sub {} {}", lhs, rhs);
        pushToStack(lhs - rhs);
    }

    private void mul() {
        var rhs = popFromStack();
        var lhs = popFromStack();

        logger.trace("mul {} {}", lhs, rhs);
        pushToStack(lhs * rhs);
    }

    private void div() {
        var rhs = popFromStack();
        var lhs = popFromStack();

        logger.trace("div {} {}", lhs, rhs);
        pushToStack(lhs / rhs);
    }

    private void mod() {
        var rhs = popFromStack();
        var lhs = popFromStack();

        logger.trace("mod {} {}", lhs, rhs);
        pushToStack(lhs % rhs);
    }

    private void pushConst() {
        var value = readInstruction();
        logger.trace("push {}", value);
        pushToStack(value);
    }

    private void pushVariable() {
        int address = readInstruction();
        int value = readFromVirtualAddress(address);
        logger.trace("push {}", value);
        pushToStack(value);
    }

    private void pop() {
        logger.trace("pop");
        popFromStack();
    }

    private void popVariable() {
        var to = readInstruction();
        var value = popFromStack();

        logger.trace("pop {} to {}", value, to);
        writeToVirtualAddress(to, value);
    }

    private void cmp() {
        var rhs = popFromStack();
        var lhs = popFromStack();
        var result = Utility.clamp(lhs - rhs, -1, 1);

        logger.trace("cmp {} {}. Result: {}", lhs, rhs, result);
        pushToStack(result);
    }

    private void movConst() {
        var to = readInstruction();
        var value = readInstruction();

        logger.trace("mov {} to {}", value, to);
        writeToVirtualAddress(to, value);
    }

    private void movVariable() {
        var to = readInstruction();
        var value = readFromVirtualAddress(readInstruction());

        logger.trace("mov {} to {}", value, to);
        writeToVirtualAddress(to, value);
    }

    private void jmp() {
        int location = readInstruction();
        logger.trace("jmp {}", location);
        realCpu.jump(location);
    }

    private void je() {
        var condition = popFromStack();
        var location = readInstruction();

        if (condition == 0) {
            logger.trace("je executed. Jumping to {}", location);
            realCpu.jump(location);
        }
    }

    private void jne() {
        var condition = popFromStack();
        var location = readInstruction();

        if (condition != 0) {
            logger.trace("jne executed. Jumping to {}", location);
            realCpu.jump(location);
        }
    }

    private void jb() {
        var condition = popFromStack();
        var location = readInstruction();

        if (condition == -1) {
            logger.trace("jb executed. Jumping to {}", location);
            realCpu.jump(location);
        }
    }

    private void ja() {
        var condition = popFromStack();
        var location = readInstruction();

        if (condition == 1) {
            logger.trace("ja executed. Jumping to {}", location);
            realCpu.jump(location);
        }
    }

    private void pushToStack(int value) {
        writeToVirtualAddress(realCpu.getSp(), value);
        realCpu.incrementSp();
    }

    private int popFromStack() {
        realCpu.decrementSp();
        return readFromVirtualAddress(realCpu.getSp());
    }

    private int readInstruction() {
        int instruction = readFromVirtualAddress(realCpu.getPc());
        realCpu.advance();

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