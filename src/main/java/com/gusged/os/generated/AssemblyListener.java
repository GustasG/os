// Generated from Assembly.g4 by ANTLR 4.9.3
package com.gusged.os.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblyParser}.
 */
public interface AssemblyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AssemblyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AssemblyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AssemblyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AssemblyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(AssemblyParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(AssemblyParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(AssemblyParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(AssemblyParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(AssemblyParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(AssemblyParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(AssemblyParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(AssemblyParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(AssemblyParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(AssemblyParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#stack}.
	 * @param ctx the parse tree
	 */
	void enterStack(AssemblyParser.StackContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#stack}.
	 * @param ctx the parse tree
	 */
	void exitStack(AssemblyParser.StackContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(AssemblyParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(AssemblyParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(AssemblyParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(AssemblyParser.ControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(AssemblyParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(AssemblyParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(AssemblyParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(AssemblyParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(AssemblyParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(AssemblyParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(AssemblyParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(AssemblyParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(AssemblyParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(AssemblyParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#pop}.
	 * @param ctx the parse tree
	 */
	void enterPop(AssemblyParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#pop}.
	 * @param ctx the parse tree
	 */
	void exitPop(AssemblyParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(AssemblyParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(AssemblyParser.CmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#jmp}.
	 * @param ctx the parse tree
	 */
	void enterJmp(AssemblyParser.JmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#jmp}.
	 * @param ctx the parse tree
	 */
	void exitJmp(AssemblyParser.JmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#je}.
	 * @param ctx the parse tree
	 */
	void enterJe(AssemblyParser.JeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#je}.
	 * @param ctx the parse tree
	 */
	void exitJe(AssemblyParser.JeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#jb}.
	 * @param ctx the parse tree
	 */
	void enterJb(AssemblyParser.JbContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#jb}.
	 * @param ctx the parse tree
	 */
	void exitJb(AssemblyParser.JbContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#ja}.
	 * @param ctx the parse tree
	 */
	void enterJa(AssemblyParser.JaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#ja}.
	 * @param ctx the parse tree
	 */
	void exitJa(AssemblyParser.JaContext ctx);
}