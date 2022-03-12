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
	 * Visit a parse tree produced by {@link AssemblyParser#dataseg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataseg(AssemblyParser.DatasegContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#datablock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatablock(AssemblyParser.DatablockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#codeseg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeseg(AssemblyParser.CodesegContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(AssemblyParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#dataline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataline(AssemblyParser.DatalineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#datadef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatadef(AssemblyParser.DatadefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#datadefname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatadefname(AssemblyParser.DatadefnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#codeline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeline(AssemblyParser.CodelineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(AssemblyParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#asmdirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmdirective(AssemblyParser.AsmdirectiveContext ctx);
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
	 * Visit a parse tree produced by {@link AssemblyParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(AssemblyParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(AssemblyParser.ControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#interrupt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterrupt(AssemblyParser.InterruptContext ctx);
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
	 * Visit a parse tree produced by {@link AssemblyParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(AssemblyParser.ModContext ctx);
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
	 * Visit a parse tree produced by {@link AssemblyParser#jne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJne(AssemblyParser.JneContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#jumpdest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpdest(AssemblyParser.JumpdestContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#mov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov(AssemblyParser.MovContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#supervisor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupervisor(AssemblyParser.SupervisorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#halt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHalt(AssemblyParser.HaltContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#datasegname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasegname(AssemblyParser.DatasegnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(AssemblyParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AssemblyParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AssemblyParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(AssemblyParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#hexadecimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimal(AssemblyParser.HexadecimalContext ctx);
}