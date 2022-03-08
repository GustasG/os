// Generated from Assembly.g4 by ANTLR 4.9.3
package com.gusged.os.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ADD=2, SUB=3, MUL=4, DIV=5, PUSH=6, POP=7, CMP=8, JMP=9, JE=10, 
		JB=11, JA=12, INT=13, NAME=14, SPACE=15, COMMENT=16, EOL=17;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_line = 2, RULE_label = 3, RULE_stat = 4, 
		RULE_comment = 5, RULE_arithmetic = 6, RULE_stack = 7, RULE_logic = 8, 
		RULE_control = 9, RULE_add = 10, RULE_sub = 11, RULE_mul = 12, RULE_div = 13, 
		RULE_push = 14, RULE_pop = 15, RULE_cmp = 16, RULE_jmp = 17, RULE_je = 18, 
		RULE_jb = 19, RULE_ja = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "line", "label", "stat", "comment", "arithmetic", 
			"stack", "logic", "control", "add", "sub", "mul", "div", "push", "pop", 
			"cmp", "jmp", "je", "jb", "ja"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ADD", "SUB", "MUL", "DIV", "PUSH", "POP", "CMP", "JMP", 
			"JE", "JB", "JA", "INT", "NAME", "SPACE", "COMMENT", "EOL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Assembly.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssemblyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << PUSH) | (1L << POP) | (1L << CMP) | (1L << JMP) | (1L << JE) | (1L << JB) | (1L << JA) | (1L << NAME) | (1L << COMMENT) | (1L << EOL))) != 0)) {
				{
				{
				setState(44);
				line();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(AssemblyParser.EOL, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(50);
				label();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << PUSH) | (1L << POP) | (1L << CMP) | (1L << JMP) | (1L << JE) | (1L << JB) | (1L << JA))) != 0)) {
				{
				setState(53);
				stat();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(56);
				comment();
				}
			}

			setState(59);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(AssemblyParser.NAME, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(NAME);
			setState(62);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public StackContext stack() {
			return getRuleContext(StackContext.class,0);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stat);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MUL:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				arithmetic();
				}
				break;
			case PUSH:
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				stack();
				}
				break;
			case CMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				logic();
				}
				break;
			case JMP:
			case JE:
			case JB:
			case JA:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				control();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(AssemblyParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arithmetic);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				add();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				sub();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				mul();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				div();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StackContext extends ParserRuleContext {
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public PopContext pop() {
			return getRuleContext(PopContext.class,0);
		}
		public StackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterStack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitStack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitStack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackContext stack() throws RecognitionException {
		StackContext _localctx = new StackContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stack);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				push();
				}
				break;
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				pop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicContext extends ParserRuleContext {
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			cmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlContext extends ParserRuleContext {
		public JmpContext jmp() {
			return getRuleContext(JmpContext.class,0);
		}
		public JeContext je() {
			return getRuleContext(JeContext.class,0);
		}
		public JbContext jb() {
			return getRuleContext(JbContext.class,0);
		}
		public JaContext ja() {
			return getRuleContext(JaContext.class,0);
		}
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_control);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				jmp();
				}
				break;
			case JE:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				je();
				}
				break;
			case JB:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				jb();
				}
				break;
			case JA:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				ja();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(AssemblyParser.ADD, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ADD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(AssemblyParser.SUB, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(SUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(AssemblyParser.MUL, 0); }
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(AssemblyParser.DIV, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(DIV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(AssemblyParser.PUSH, 0); }
		public TerminalNode INT() { return getToken(AssemblyParser.INT, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(PUSH);
			setState(99);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PopContext extends ParserRuleContext {
		public TerminalNode POP() { return getToken(AssemblyParser.POP, 0); }
		public PopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitPop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitPop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopContext pop() throws RecognitionException {
		PopContext _localctx = new PopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(POP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmpContext extends ParserRuleContext {
		public TerminalNode CMP() { return getToken(AssemblyParser.CMP, 0); }
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(CMP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JmpContext extends ParserRuleContext {
		public TerminalNode JMP() { return getToken(AssemblyParser.JMP, 0); }
		public TerminalNode NAME() { return getToken(AssemblyParser.NAME, 0); }
		public JmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterJmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitJmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitJmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JmpContext jmp() throws RecognitionException {
		JmpContext _localctx = new JmpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(JMP);
			setState(106);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JeContext extends ParserRuleContext {
		public TerminalNode JE() { return getToken(AssemblyParser.JE, 0); }
		public TerminalNode NAME() { return getToken(AssemblyParser.NAME, 0); }
		public JeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_je; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterJe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitJe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitJe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JeContext je() throws RecognitionException {
		JeContext _localctx = new JeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_je);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(JE);
			setState(109);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JbContext extends ParserRuleContext {
		public TerminalNode JB() { return getToken(AssemblyParser.JB, 0); }
		public TerminalNode NAME() { return getToken(AssemblyParser.NAME, 0); }
		public JbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterJb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitJb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitJb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JbContext jb() throws RecognitionException {
		JbContext _localctx = new JbContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(JB);
			setState(112);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JaContext extends ParserRuleContext {
		public TerminalNode JA() { return getToken(AssemblyParser.JA, 0); }
		public TerminalNode NAME() { return getToken(AssemblyParser.NAME, 0); }
		public JaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterJa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitJa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitJa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JaContext ja() throws RecognitionException {
		JaContext _localctx = new JaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(JA);
			setState(115);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23x\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\4\5\4\66\n\4\3\4\5\49\n\4\3\4\5\4<\n\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6G\n\6\3\7\3\7\3\b\3\b\3\b\3\b\5\bO\n\b\3\t\3\t\5\tS\n"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13[\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\2\2p\2,\3\2\2\2\4\61\3\2\2\2\6\65\3\2\2\2\b?"+
		"\3\2\2\2\nF\3\2\2\2\fH\3\2\2\2\16N\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24"+
		"Z\3\2\2\2\26\\\3\2\2\2\30^\3\2\2\2\32`\3\2\2\2\34b\3\2\2\2\36d\3\2\2\2"+
		" g\3\2\2\2\"i\3\2\2\2$k\3\2\2\2&n\3\2\2\2(q\3\2\2\2*t\3\2\2\2,-\5\4\3"+
		"\2-\3\3\2\2\2.\60\5\6\4\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64\66\5\b\5\2\65\64\3\2\2\2\65\66\3"+
		"\2\2\2\668\3\2\2\2\679\5\n\6\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5\f\7"+
		"\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\23\2\2>\7\3\2\2\2?@\7\20\2\2@A\7"+
		"\3\2\2A\t\3\2\2\2BG\5\16\b\2CG\5\20\t\2DG\5\22\n\2EG\5\24\13\2FB\3\2\2"+
		"\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\13\3\2\2\2HI\7\22\2\2I\r\3\2\2\2JO\5"+
		"\26\f\2KO\5\30\r\2LO\5\32\16\2MO\5\34\17\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2"+
		"\2NM\3\2\2\2O\17\3\2\2\2PS\5\36\20\2QS\5 \21\2RP\3\2\2\2RQ\3\2\2\2S\21"+
		"\3\2\2\2TU\5\"\22\2U\23\3\2\2\2V[\5$\23\2W[\5&\24\2X[\5(\25\2Y[\5*\26"+
		"\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\25\3\2\2\2\\]\7\4\2\2]\27"+
		"\3\2\2\2^_\7\5\2\2_\31\3\2\2\2`a\7\6\2\2a\33\3\2\2\2bc\7\7\2\2c\35\3\2"+
		"\2\2de\7\b\2\2ef\7\17\2\2f\37\3\2\2\2gh\7\t\2\2h!\3\2\2\2ij\7\n\2\2j#"+
		"\3\2\2\2kl\7\13\2\2lm\7\20\2\2m%\3\2\2\2no\7\f\2\2op\7\20\2\2p\'\3\2\2"+
		"\2qr\7\r\2\2rs\7\20\2\2s)\3\2\2\2tu\7\16\2\2uv\7\20\2\2v+\3\2\2\2\n\61"+
		"\658;FNRZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}