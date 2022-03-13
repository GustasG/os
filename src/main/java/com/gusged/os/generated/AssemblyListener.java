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
	 * Enter a parse tree produced by {@link AssemblyParser#dataseg}.
	 * @param ctx the parse tree
	 */
	void enterDataseg(AssemblyParser.DatasegContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#dataseg}.
	 * @param ctx the parse tree
	 */
	void exitDataseg(AssemblyParser.DatasegContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#datablock}.
	 * @param ctx the parse tree
	 */
	void enterDatablock(AssemblyParser.DatablockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#datablock}.
	 * @param ctx the parse tree
	 */
	void exitDatablock(AssemblyParser.DatablockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#codeseg}.
	 * @param ctx the parse tree
	 */
	void enterCodeseg(AssemblyParser.CodesegContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#codeseg}.
	 * @param ctx the parse tree
	 */
	void exitCodeseg(AssemblyParser.CodesegContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(AssemblyParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(AssemblyParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#dataline}.
	 * @param ctx the parse tree
	 */
	void enterDataline(AssemblyParser.DatalineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#dataline}.
	 * @param ctx the parse tree
	 */
	void exitDataline(AssemblyParser.DatalineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#datadef}.
	 * @param ctx the parse tree
	 */
	void enterDatadef(AssemblyParser.DatadefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#datadef}.
	 * @param ctx the parse tree
	 */
	void exitDatadef(AssemblyParser.DatadefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#datadefname}.
	 * @param ctx the parse tree
	 */
	void enterDatadefname(AssemblyParser.DatadefnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#datadefname}.
	 * @param ctx the parse tree
	 */
	void exitDatadefname(AssemblyParser.DatadefnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#codeline}.
	 * @param ctx the parse tree
	 */
	void enterCodeline(AssemblyParser.CodelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#codeline}.
	 * @param ctx the parse tree
	 */
	void exitCodeline(AssemblyParser.CodelineContext ctx);
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
	 * Enter a parse tree produced by {@link AssemblyParser#asmdirective}.
	 * @param ctx the parse tree
	 */
	void enterAsmdirective(AssemblyParser.AsmdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#asmdirective}.
	 * @param ctx the parse tree
	 */
	void exitAsmdirective(AssemblyParser.AsmdirectiveContext ctx);
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
	 * Enter a parse tree produced by {@link AssemblyParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(AssemblyParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(AssemblyParser.DirectiveContext ctx);
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
	 * Enter a parse tree produced by {@link AssemblyParser#interrupt}.
	 * @param ctx the parse tree
	 */
	void enterInterrupt(AssemblyParser.InterruptContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#interrupt}.
	 * @param ctx the parse tree
	 */
	void exitInterrupt(AssemblyParser.InterruptContext ctx);
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
	 * Enter a parse tree produced by {@link AssemblyParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(AssemblyParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(AssemblyParser.IncContext ctx);
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
	 * Enter a parse tree produced by {@link AssemblyParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(AssemblyParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(AssemblyParser.DecContext ctx);
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
	 * Enter a parse tree produced by {@link AssemblyParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(AssemblyParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(AssemblyParser.ModContext ctx);
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
	 * Enter a parse tree produced by {@link AssemblyParser#jne}.
	 * @param ctx the parse tree
	 */
	void enterJne(AssemblyParser.JneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#jne}.
	 * @param ctx the parse tree
	 */
	void exitJne(AssemblyParser.JneContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#jumpdest}.
	 * @param ctx the parse tree
	 */
	void enterJumpdest(AssemblyParser.JumpdestContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#jumpdest}.
	 * @param ctx the parse tree
	 */
	void exitJumpdest(AssemblyParser.JumpdestContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#mov}.
	 * @param ctx the parse tree
	 */
	void enterMov(AssemblyParser.MovContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#mov}.
	 * @param ctx the parse tree
	 */
	void exitMov(AssemblyParser.MovContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#supervisor}.
	 * @param ctx the parse tree
	 */
	void enterSupervisor(AssemblyParser.SupervisorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#supervisor}.
	 * @param ctx the parse tree
	 */
	void exitSupervisor(AssemblyParser.SupervisorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#halt}.
	 * @param ctx the parse tree
	 */
	void enterHalt(AssemblyParser.HaltContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#halt}.
	 * @param ctx the parse tree
	 */
	void exitHalt(AssemblyParser.HaltContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#datasegname}.
	 * @param ctx the parse tree
	 */
	void enterDatasegname(AssemblyParser.DatasegnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#datasegname}.
	 * @param ctx the parse tree
	 */
	void exitDatasegname(AssemblyParser.DatasegnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(AssemblyParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(AssemblyParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AssemblyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AssemblyParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AssemblyParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AssemblyParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(AssemblyParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(AssemblyParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#hexadecimal}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimal(AssemblyParser.HexadecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#hexadecimal}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimal(AssemblyParser.HexadecimalContext ctx);
}