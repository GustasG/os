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
    private static transient final Logger logger = LoggerFactory.getLogger(CodeGenerator.class);
    private static transient final Integer invalidAddress = -1;

    private transient final Map<String, Integer> dataLabels;
    private transient final Map<String, Integer> codeLabels;
    private transient final Map<String, List<Integer>> jumpLocations;
    private transient final Map<String, List<Integer>> dataLocations;
    private final List<Integer> dataSegment;
    private final List<Integer> codeSegment;

    public CodeGenerator() {
        dataLabels = new HashMap<>();
        codeLabels = new HashMap<>();
        jumpLocations = new HashMap<>();
        dataLocations = new HashMap<>();
        dataSegment = new ArrayList<>();
        codeSegment = new ArrayList<>();
    }

    private void resolveNames() {
        patchBinary(dataLocations, dataLabels);
        patchBinary(jumpLocations, codeLabels);
    }

    private void patchBinary(Map<String, List<Integer>> locations, Map<String, Integer> labels) {
        for (var location : locations.entrySet()) {
            var labelAddress = labels.get(location.getKey());

            if (labelAddress != null) {
                location.getValue()
                        .forEach(address -> codeSegment.set(address, labelAddress));
            } else {
                logger.error("Unknown name: {}", location.getKey());
            }
        }
    }

    @Override
    public Void visitProgram(AssemblyParser.ProgramContext ctx) {
        visitChildren(ctx);
        resolveNames();

        return null;
    }

    @Override
    public Void visitDatadef(AssemblyParser.DatadefContext ctx) {
        var nameNode = ctx.name();
        var valueNode = ctx.value();

        dataLabels.put(nameNode.getText(), dataSegment.size());
        dataSegment.add(Integer.parseInt(valueNode.getText()));

        return null;
    }

    @Override
    public Void visitAdd(AssemblyParser.AddContext ctx) {
        codeSegment.add(Instruction.ADD.getOpcode());
        return null;
    }

    @Override
    public Void visitSub(AssemblyParser.SubContext ctx) {
        codeSegment.add(Instruction.SUB.getOpcode());
        return null;
    }

    @Override
    public Void visitMul(AssemblyParser.MulContext ctx) {
        codeSegment.add(Instruction.MUL.getOpcode());
        return null;
    }

    @Override
    public Void visitDiv(AssemblyParser.DivContext ctx) {
        codeSegment.add(Instruction.DIV.getOpcode());
        return null;
    }

    @Override
    public Void visitMod(AssemblyParser.ModContext ctx) {
        codeSegment.add(Instruction.MOD.getOpcode());
        return null;
    }

    @Override
    public Void visitPush(AssemblyParser.PushContext ctx) {
        if (ctx.value() != null) {
            codeSegment.add(Instruction.PUSH_CONST.getOpcode());
            codeSegment.add(Integer.parseInt(ctx.value().getText()));
        } else {
            codeSegment.add(Instruction.PUSH_VAR.getOpcode());
            insertNameLabel(ctx.name().getText());
        }

        return null;
    }

    @Override
    public Void visitPop(AssemblyParser.PopContext ctx) {
        if (ctx.name() != null) {
            codeSegment.add(Instruction.POP_VAR.getOpcode());
            insertNameLabel(ctx.name().getText());
        } else {
            codeSegment.add(Instruction.POP.getOpcode());
        }

        return null;
    }

    @Override
    public Void visitCmp(AssemblyParser.CmpContext ctx) {
        codeSegment.add(Instruction.CMP.getOpcode());
        return null;
    }

    @Override
    public Void visitMov(AssemblyParser.MovContext ctx) {
        var to = ctx.name(0).getText();

        if (ctx.name(1) != null) {
            codeSegment.add(Instruction.MOV_VAR.getOpcode());
            insertNameLabel(to);
            insertNameLabel(ctx.name(1).getText());
        } else {
            codeSegment.add(Instruction.MOV_CONST.getOpcode());
            insertNameLabel(to);
            codeSegment.add(Integer.parseInt(ctx.value().getText()));
        }

        return null;
    }

    @Override
    public Void visitLabel(AssemblyParser.LabelContext ctx) {
        codeLabels.put(ctx.name().getText(), codeSegment.size());
        return null;
    }

    @Override
    public Void visitJmp(AssemblyParser.JmpContext ctx) {
        codeSegment.add(Instruction.JMP.getOpcode());
        insertJumpLabel(ctx.name().getText());

        return null;
    }

    @Override
    public Void visitJe(AssemblyParser.JeContext ctx) {
        codeSegment.add(Instruction.JE.getOpcode());
        insertJumpLabel(ctx.name().getText());

        return null;
    }

    @Override
    public Void visitJne(AssemblyParser.JneContext ctx) {
        codeSegment.add(Instruction.JNE.getOpcode());
        insertNameLabel(ctx.name().getText());

        return null;
    }

    @Override
    public Void visitJb(AssemblyParser.JbContext ctx) {
        codeSegment.add(Instruction.JB.getOpcode());
        insertJumpLabel(ctx.name().getText());

        return null;
    }

    @Override
    public Void visitJa(AssemblyParser.JaContext ctx) {
        codeSegment.add(Instruction.JA.getOpcode());
        insertJumpLabel(ctx.name().getText());

        return null;
    }

    private void insertJumpLabel(String labelName) {
        codeSegment.add(invalidAddress);

        jumpLocations.computeIfAbsent(labelName, k -> new ArrayList<>());
        jumpLocations.get(labelName)
                .add(codeSegment.size() - 1);
    }

    private void insertNameLabel(String variableName) {
        codeSegment.add(invalidAddress);

        dataLocations.computeIfAbsent(variableName, k -> new ArrayList<>());
        dataLocations.get(variableName)
                .add(codeSegment.size() - 1);
    }
}