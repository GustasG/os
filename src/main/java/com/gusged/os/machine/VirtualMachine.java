package com.gusged.os.machine;

import java.util.List;

import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.compiler.Program;
import com.gusged.os.compiler.Instruction;
import com.gusged.os.machine.cpu.ProgramInterrupt;
import com.gusged.os.machine.cpu.SupervisorInterrupt;

import static com.gusged.os.Constants.DATA_SEGMENT_START;
import static com.gusged.os.Constants.CODE_SEGMENT_START;

@Data
public final class VirtualMachine {
    private static final Logger logger = LoggerFactory.getLogger(VirtualMachine.class);

    private final RealMachine realMachine;

    public VirtualMachine(RealMachine realMachine) {
        this.realMachine = realMachine;
    }

    public void loadProgram(Program program) {
        copyToPage(DATA_SEGMENT_START, program.dataSegment());
        copyToPage(CODE_SEGMENT_START, program.codeSegment());
    }

    private void copyToPage(int pageStart, List<Integer> payload) {
        for (int i = 0; i < payload.size(); i++) {
            realMachine.writeToVirtualAddress(pageStart + i, payload.get(i));
        }
    }

    public void step() {
        try {
            execute(readInstruction());
        } catch (IndexOutOfBoundsException e) {
            realMachine.programInterrupt(ProgramInterrupt.INVALID_ADDRESS);
        }
    }

    public boolean test() {
        var processor = realMachine.getProcessor();
        return processor.getSi() != SupervisorInterrupt.NONE || processor.getPi() != ProgramInterrupt.NONE || processor.getTi() == 0;
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
        var rhs = realMachine.popFromStack();
        var lhs = realMachine.popFromStack();
        logger.trace("add {} {}", lhs, rhs);

        realMachine.pushToStack(lhs + rhs);
        decrementTimer(4);
    }

    private void inc() {
        var value = realMachine.popFromStack();
        logger.trace("inc {}", value);

        realMachine.pushToStack(value + 1);
        decrementTimer(3);
    }

    private void sub() {
        var rhs = realMachine.popFromStack();
        var lhs = realMachine.popFromStack();
        logger.trace("sub {} {}", lhs, rhs);

        realMachine.pushToStack(lhs + rhs);
        decrementTimer(4);
    }

    private void dec() {
        var value = realMachine.popFromStack();
        logger.trace("dec {}", value);

        realMachine.pushToStack(value - 1);
        decrementTimer(3);
    }

    private void mul() {
        var rhs = realMachine.popFromStack();
        var lhs = realMachine.popFromStack();
        logger.trace("mul {} {}", lhs, rhs);

        realMachine.pushToStack(lhs * rhs);
        decrementTimer(4);
    }

    private void div() {
        var rhs = realMachine.popFromStack();
        var lhs = realMachine.popFromStack();
        logger.trace("div {} {}", lhs, rhs);

        realMachine.pushToStack(lhs / rhs);
        decrementTimer(4);
    }

    private void mod() {
        var rhs = realMachine.popFromStack();
        var lhs = realMachine.popFromStack();
        logger.trace("mod {} {}", lhs, rhs);

        realMachine.pushToStack(lhs % rhs);
        decrementTimer(4);
    }

    private void pushConst() {
        var value = readInstruction();
        logger.trace("push {}", value);

        realMachine.pushToStack(value);
        decrementTimer(2);
    }

    private void pushVariable() {
        int value = realMachine.readFromVirtualAddress(readInstruction());
        logger.trace("push {}", value);

        realMachine.pushToStack(value);
        decrementTimer(3);
    }

    private void pop() {
        logger.trace("pop");

        realMachine.popFromStack();
        decrementTimer(1);
    }

    private void popVariable() {
        var dest = readInstruction();
        var value = realMachine.popFromStack();
        logger.trace("pop {} to {}", value, dest);

        realMachine.writeToVirtualAddress(dest, value);
        decrementTimer(3);
    }

    private void cmp() {
        var rhs = realMachine.popFromStack();
        var lhs = realMachine.popFromStack();
        var result = Integer.compare(lhs, rhs);
        logger.trace("cmp {} {}. Result: {}", lhs, rhs, result);

        realMachine.pushToStack(result);
        decrementTimer(4);
    }

    private void movConst() {
        var dest = readInstruction();
        var value = readInstruction();
        logger.trace("mov {} to {}", value, dest);

        realMachine.writeToVirtualAddress(dest, value);
        decrementTimer(3);
    }

    private void movVariable() {
        var dest = readInstruction();
        var value = realMachine.readFromVirtualAddress(readInstruction());
        logger.trace("mov {} to {}", value, dest);

        realMachine.writeToVirtualAddress(dest, value);
        decrementTimer(4);
    }

    private void jmp() {
        int location = readInstruction();
        logger.trace("jmp {}", location);

        realMachine.jump(location);
        decrementTimer(2);
    }

    private void je() {
        var condition = realMachine.popFromStack();
        var location = readInstruction();

        if (condition == 0) {
            logger.trace("je executed. Jumping to {}", location);
            realMachine.jump(location);
        }

        decrementTimer(4);
    }

    private void jne() {
        var condition = realMachine.popFromStack();
        var location = readInstruction();

        if (condition != 0) {
            logger.trace("jne executed. Jumping to {}", location);
            realMachine.jump(location);
        }

        decrementTimer(4);
    }

    private void jb() {
        var condition = realMachine.popFromStack();
        var location = readInstruction();

        if (condition < 0) {
            logger.trace("jb executed. Jumping to {}", location);
            realMachine.jump(location);
        }

        decrementTimer(4);
    }

    private void ja() {
        var condition = realMachine.popFromStack();
        var location = readInstruction();

        if (condition > 0) {
            logger.trace("ja executed. Jumping to {}", location);
            realMachine.jump(location);
        }

        decrementTimer(4);
    }

    private void halt() {
        logger.trace("halt");

        realMachine.supervisorInterrupt(SupervisorInterrupt.HALT);
        decrementTimer(1);
    }

    private void printn() {
        logger.trace("printn");

        realMachine.supervisorInterrupt(SupervisorInterrupt.PRINTN);
        decrementTimer(5);
    }

    private int readInstruction() {
        int instruction = realMachine.readFromVirtualAddress(realMachine.getPc());
        realMachine.incrementPc();

        return instruction;
    }

    private void decrementTimer(int delta) {
        realMachine.decrementTimer(delta);
    }
}