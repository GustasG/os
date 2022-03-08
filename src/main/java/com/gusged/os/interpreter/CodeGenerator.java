package com.gusged.os.interpreter;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

import lombok.Getter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.generated.AssemblyParser;
import com.gusged.os.generated.AssemblyBaseVisitor;

@Getter
public class CodeGenerator extends AssemblyBaseVisitor<Void> {
    private static final Logger logger = LoggerFactory.getLogger(CodeGenerator.class);
    private static final Integer invalidAddress = -1;

    private final Map<String, Integer> labels;
    private final Map<String, List<Integer>> jumpLocations;
    private final List<Integer> data;
    private final List<Integer> code;

    public CodeGenerator() {
        labels = new HashMap<>();
        jumpLocations = new HashMap<>();
        data = new ArrayList<>();
        code = new ArrayList<>();
    }

    public void resolveNames() {
        for (var location : jumpLocations.entrySet()) {
            var labelAddress = labels.get(location.getKey());

            if (labelAddress != null) {
                location.getValue()
                        .forEach(address -> code.set(address, labelAddress));
            } else {
                logger.error("Unknown label: {}", location.getKey());
            }
        }
    }

    @Override
    public Void visitAdd(AssemblyParser.AddContext ctx) {
        code.add(Instruction.ADD.getOpcode());
        return null;
    }

    @Override
    public Void visitSub(AssemblyParser.SubContext ctx) {
        code.add(Instruction.SUB.getOpcode());
        return null;
    }

    @Override
    public Void visitMul(AssemblyParser.MulContext ctx) {
        code.add(Instruction.MUL.getOpcode());
        return null;
    }

    @Override
    public Void visitDiv(AssemblyParser.DivContext ctx) {
        code.add(Instruction.DIV.getOpcode());
        return null;
    }

    @Override
    public Void visitPush(AssemblyParser.PushContext ctx) {
        var node = ctx.INT();
        code.add(Instruction.PUSH.getOpcode());
        code.add(Integer.parseInt(node.getText()));

        return null;
    }

    @Override
    public Void visitPop(AssemblyParser.PopContext ctx) {
        code.add(Instruction.POP.getOpcode());
        return null;
    }

    @Override
    public Void visitCmp(AssemblyParser.CmpContext ctx) {
        code.add(Instruction.CMP.getOpcode());
        return null;
    }

    @Override
    public Void visitLabel(AssemblyParser.LabelContext ctx) {
        labels.put(ctx.NAME().getText(), code.size());
        return null;
    }

    @Override
    public Void visitJmp(AssemblyParser.JmpContext ctx) {
        var node = ctx.NAME();

        code.add(Instruction.JMP.getOpcode());
        insertJumpLabel(node.getText());

        return null;
    }

    @Override
    public Void visitJe(AssemblyParser.JeContext ctx) {
        var node = ctx.NAME();

        code.add(Instruction.JE.getOpcode());
        insertJumpLabel(node.getText());

        return null;
    }

    @Override
    public Void visitJb(AssemblyParser.JbContext ctx) {
        var node = ctx.NAME();

        code.add(Instruction.JB.getOpcode());
        insertJumpLabel(node.getText());

        return null;
    }

    @Override
    public Void visitJa(AssemblyParser.JaContext ctx) {
        var node = ctx.NAME();

        code.add(Instruction.JA.getOpcode());
        insertJumpLabel(node.getText());

        return null;
    }

    private void insertJumpLabel(String labelName) {
        code.add(invalidAddress);

        jumpLocations.computeIfAbsent(labelName, k -> new ArrayList<>());
        jumpLocations.get(labelName)
                .add(code.size() - 1);
    }
}