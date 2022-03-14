package com.gusged.os.machine.vm;

import java.util.List;
import java.io.IOException;

import lombok.Data;
import lombok.ToString;

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
import com.gusged.os.machine.rm.RealMachine;
import com.gusged.os.machine.rm.cpu.ProgramInterrupt;
import com.gusged.os.machine.rm.cpu.SupervisorInterrupt;

import static com.gusged.os.Constants.PAGE_SIZE;
import static com.gusged.os.Constants.DATA_SEGMENT_START;
import static com.gusged.os.Constants.CODE_SEGMENT_START;

@Data
public class VirtualMachine {
    private static transient final Logger logger = LoggerFactory.getLogger(VirtualMachine.class);
    private static transient long lastId = 0;

    private final long id;
    private final VirtualCpu virtualCpu;
    @ToString.Exclude private final RealMachine realMachine;
    @ToString.Exclude private final Page[] virtualMemory;

    public VirtualMachine(RealMachine realMachine, Page[] virtualMemory) {
        this.id = lastId++;
        this.virtualCpu = new VirtualCpu();
        this.realMachine = realMachine;
        this.virtualMemory = virtualMemory;
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

    public void step() {
        try {
            int instruction = readInstruction();
            execute(instruction);
        } catch (IndexOutOfBoundsException e) {
            logger.error("VM Invalid Memory Access", e);
            realMachine.programInterrupt(ProgramInterrupt.INVALID_ADDRESS);
        }
    }

    private void execute(int instruction) {
        if (instruction == Instruction.ADD.getOpcode()) {
            add();
        } else if (instruction == Instruction.INC.getOpcode()) {
            inc();
        } else if (instruction == Instruction.SUB.getOpcode()) {
            sub();
        } else if (instruction == Instruction.DEC.getOpcode()) {
            dec();
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
        } else if (instruction == Instruction.HALT.getOpcode()) {
            halt();
        } else if(instruction == Instruction.PRINTN.getOpcode()) {
            printn();
        } else {
            logger.error("Unknwon instruction: {}", instruction);
            realMachine.programInterrupt(ProgramInterrupt.INCORRECT_OPCODE);
        }
    }

    private void add() {
        var rhs = popFromStack();
        var lhs = popFromStack();
        logger.trace("add {} {}", lhs, rhs);

        pushToStack(lhs + rhs);
        realMachine.decrementTimer(4);
    }

    private void inc() {
        var value = popFromStack();
        logger.trace("inc {}", value);

        pushToStack(value + 1);
        realMachine.decrementTimer(3);
    }

    private void sub() {
        var rhs = popFromStack();
        var lhs = popFromStack();
        logger.trace("sub {} {}", lhs, rhs);

        pushToStack(lhs - rhs);
        realMachine.decrementTimer(4);
    }

    private void dec() {
        var value = popFromStack();
        logger.trace("dec {}", value);

        pushToStack(value - 1);
        realMachine.decrementTimer(3);
    }

    private void mul() {
        var rhs = popFromStack();
        var lhs = popFromStack();
        logger.trace("mul {} {}", lhs, rhs);

        pushToStack(lhs * rhs);
        realMachine.decrementTimer(4);
    }

    private void div() {
        var rhs = popFromStack();
        var lhs = popFromStack();
        logger.trace("div {} {}", lhs, rhs);

        pushToStack(lhs / rhs);
        realMachine.decrementTimer(4);
    }

    private void mod() {
        var rhs = popFromStack();
        var lhs = popFromStack();
        logger.trace("mod {} {}", lhs, rhs);

        pushToStack(lhs % rhs);
        realMachine.decrementTimer(4);
    }

    private void pushConst() {
        var value = readInstruction();
        logger.trace("push {}", value);

        pushToStack(value);
        realMachine.decrementTimer(2);
    }

    private void pushVariable() {
        int value = readFromVirtualAddress(readInstruction());
        logger.trace("push {}", value);

        pushToStack(value);
        realMachine.decrementTimer(3);
    }

    private void pop() {
        logger.trace("pop");

        popFromStack();
        realMachine.decrementTimer(1);
    }

    private void popVariable() {
        var dest = readInstruction();
        var value = popFromStack();
        logger.trace("pop {} to {}", value, dest);

        writeToVirtualAddress(dest, value);
        realMachine.decrementTimer(3);
    }

    private void cmp() {
        var rhs = popFromStack();
        var lhs = popFromStack();
        var result = Utility.clamp(lhs - rhs, -1, 1);
        logger.trace("cmp {} {}. Result: {}", lhs, rhs, result);

        pushToStack(result);
        realMachine.decrementTimer(4);
    }

    private void movConst() {
        var dest = readInstruction();
        var value = readInstruction();
        logger.trace("mov {} to {}", value, dest);

        writeToVirtualAddress(dest, value);
        realMachine.decrementTimer(3);
    }

    private void movVariable() {
        var dest = readInstruction();
        var value = readFromVirtualAddress(readInstruction());
        logger.trace("mov {} to {}", value, dest);

        writeToVirtualAddress(dest, value);
        realMachine.decrementTimer(4);
    }

    private void jmp() {
        int location = readInstruction();
        logger.trace("jmp {}", location);

        virtualCpu.jump(location);
        realMachine.decrementTimer(2);
    }

    private void je() {
        var condition = popFromStack();
        var location = readInstruction();

        if (condition == 0) {
            logger.trace("je executed. Jumping to {}", location);
            virtualCpu.jump(location);
        }

        realMachine.decrementTimer(4);
    }

    private void jne() {
        var condition = popFromStack();
        var location = readInstruction();

        if (condition != 0) {
            logger.trace("jne executed. Jumping to {}", location);
            virtualCpu.jump(location);
        }

        realMachine.decrementTimer(4);
    }

    private void jb() {
        var condition = popFromStack();
        var location = readInstruction();

        if (condition == -1) {
            logger.trace("jb executed. Jumping to {}", location);
            virtualCpu.jump(location);
        }

        realMachine.decrementTimer(4);
    }

    private void ja() {
        var condition = popFromStack();
        var location = readInstruction();

        if (condition == 1) {
            logger.trace("ja executed. Jumping to {}", location);
            virtualCpu.jump(location);
        }

        realMachine.decrementTimer(4);
    }

    private void halt() {
        logger.trace("halt");

        realMachine.supervisorInterrupt(SupervisorInterrupt.HALT);
        realMachine.decrementTimer(1);
    }

    private void printn() {
        var value = popFromStack();

        // TODO: Make this as proper interrupt
        System.out.println(value);
        realMachine.decrementTimer(1);
    }

    private void pushToStack(int value) {
        writeToVirtualAddress(virtualCpu.getSp(), value);
        virtualCpu.incrementSp();
    }

    private int popFromStack() {
        virtualCpu.decrementSp();
        return readFromVirtualAddress(virtualCpu.getSp());
    }

    private int readInstruction() {
        int instruction = readFromVirtualAddress(virtualCpu.getPc());
        virtualCpu.advance();

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

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof VirtualMachine otherVirtualMachine)) {
            return false;
        }

        return this.id == otherVirtualMachine.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}