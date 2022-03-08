// Generated from Assembly.g4 by ANTLR 4.9.3
package com.gusged.os.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssemblyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssemblyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AssemblyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AssemblyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(AssemblyParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(AssemblyParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(AssemblyParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(AssemblyParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(AssemblyParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#stack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack(AssemblyParser.StackContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(AssemblyParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(AssemblyParser.ControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(AssemblyParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(AssemblyParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(AssemblyParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(AssemblyParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(AssemblyParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop(AssemblyParser.PopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(AssemblyParser.CmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#jmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJmp(AssemblyParser.JmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#je}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJe(AssemblyParser.JeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#jb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJb(AssemblyParser.JbContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#ja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJa(AssemblyParser.JaContext ctx);
}