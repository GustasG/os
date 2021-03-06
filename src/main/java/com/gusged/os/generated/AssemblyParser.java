// Generated from Assembly.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ADD=5, INC=6, SUB=7, DEC=8, MUL=9, DIV=10, 
		MOD=11, PUSH=12, POP=13, CMP=14, MOV=15, JMP=16, JE=17, JNE=18, JB=19, 
		JA=20, HALT=21, PRINTN=22, DW=23, INT=24, HEX=25, NAME=26, SPACE=27, COMMENT=28, 
		EOL=29;
	public static final int
		RULE_program = 0, RULE_dataseg = 1, RULE_datablock = 2, RULE_codeseg = 3, 
		RULE_codeblock = 4, RULE_dataline = 5, RULE_datadef = 6, RULE_datadefname = 7, 
		RULE_codeline = 8, RULE_label = 9, RULE_asmdirective = 10, RULE_comment = 11, 
		RULE_arithmetic = 12, RULE_stack = 13, RULE_directive = 14, RULE_control = 15, 
		RULE_interrupt = 16, RULE_add = 17, RULE_inc = 18, RULE_sub = 19, RULE_dec = 20, 
		RULE_mul = 21, RULE_div = 22, RULE_mod = 23, RULE_push = 24, RULE_pop = 25, 
		RULE_cmp = 26, RULE_jmp = 27, RULE_je = 28, RULE_jne = 29, RULE_jb = 30, 
		RULE_ja = 31, RULE_jumpdest = 32, RULE_mov = 33, RULE_supervisor = 34, 
		RULE_halt = 35, RULE_print = 36, RULE_printn = 37, RULE_datasegname = 38, 
		RULE_name = 39, RULE_literal = 40, RULE_number = 41, RULE_decimal = 42, 
		RULE_hexadecimal = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dataseg", "datablock", "codeseg", "codeblock", "dataline", 
			"datadef", "datadefname", "codeline", "label", "asmdirective", "comment", 
			"arithmetic", "stack", "directive", "control", "interrupt", "add", "inc", 
			"sub", "dec", "mul", "div", "mod", "push", "pop", "cmp", "jmp", "je", 
			"jne", "jb", "ja", "jumpdest", "mov", "supervisor", "halt", "print", 
			"printn", "datasegname", "name", "literal", "number", "decimal", "hexadecimal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$DATA'", "'$CODE'", "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ADD", "INC", "SUB", "DEC", "MUL", "DIV", 
			"MOD", "PUSH", "POP", "CMP", "MOV", "JMP", "JE", "JNE", "JB", "JA", "HALT", 
			"PRINTN", "DW", "INT", "HEX", "NAME", "SPACE", "COMMENT", "EOL"
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
		public TerminalNode EOF() { return getToken(AssemblyParser.EOF, 0); }
		public DatasegContext dataseg() {
			return getRuleContext(DatasegContext.class,0);
		}
		public CodesegContext codeseg() {
			return getRuleContext(CodesegContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(88);
				dataseg();
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(91);
				codeseg();
				}
			}

			setState(94);
			match(EOF);
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

	public static class DatasegContext extends ParserRuleContext {
		public DatablockContext datablock() {
			return getRuleContext(DatablockContext.class,0);
		}
		public DatasegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataseg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterDataseg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitDataseg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitDataseg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasegContext dataseg() throws RecognitionException {
		DatasegContext _localctx = new DatasegContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dataseg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__0);
			setState(97);
			datablock();
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

	public static class DatablockContext extends ParserRuleContext {
		public List<DatalineContext> dataline() {
			return getRuleContexts(DatalineContext.class);
		}
		public DatalineContext dataline(int i) {
			return getRuleContext(DatalineContext.class,i);
		}
		public DatablockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datablock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterDatablock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitDatablock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitDatablock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatablockContext datablock() throws RecognitionException {
		DatablockContext _localctx = new DatablockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_datablock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << COMMENT) | (1L << EOL))) != 0)) {
				{
				{
				setState(99);
				dataline();
				}
				}
				setState(104);
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

	public static class CodesegContext extends ParserRuleContext {
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public CodesegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeseg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterCodeseg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitCodeseg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitCodeseg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodesegContext codeseg() throws RecognitionException {
		CodesegContext _localctx = new CodesegContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_codeseg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__1);
			setState(106);
			codeblock();
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

	public static class CodeblockContext extends ParserRuleContext {
		public List<CodelineContext> codeline() {
			return getRuleContexts(CodelineContext.class);
		}
		public CodelineContext codeline(int i) {
			return getRuleContext(CodelineContext.class,i);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_codeblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << INC) | (1L << SUB) | (1L << DEC) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << PUSH) | (1L << POP) | (1L << CMP) | (1L << MOV) | (1L << JMP) | (1L << JE) | (1L << JNE) | (1L << JB) | (1L << JA) | (1L << HALT) | (1L << PRINTN) | (1L << NAME) | (1L << COMMENT) | (1L << EOL))) != 0)) {
				{
				{
				setState(108);
				codeline();
				}
				}
				setState(113);
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

	public static class DatalineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(AssemblyParser.EOL, 0); }
		public DatadefContext datadef() {
			return getRuleContext(DatadefContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public DatalineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterDataline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitDataline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitDataline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatalineContext dataline() throws RecognitionException {
		DatalineContext _localctx = new DatalineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dataline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(114);
				datadef();
				}
			}

			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(117);
				comment();
				}
			}

			setState(120);
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

	public static class DatadefContext extends ParserRuleContext {
		public DatadefnameContext datadefname() {
			return getRuleContext(DatadefnameContext.class,0);
		}
		public TerminalNode DW() { return getToken(AssemblyParser.DW, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DatadefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datadef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterDatadef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitDatadef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitDatadef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatadefContext datadef() throws RecognitionException {
		DatadefContext _localctx = new DatadefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_datadef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			datadefname();
			setState(123);
			match(DW);
			setState(124);
			number();
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

	public static class DatadefnameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DatadefnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datadefname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterDatadefname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitDatadefname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitDatadefname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatadefnameContext datadefname() throws RecognitionException {
		DatadefnameContext _localctx = new DatadefnameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_datadefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			name();
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

	public static class CodelineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(AssemblyParser.EOL, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public AsmdirectiveContext asmdirective() {
			return getRuleContext(AsmdirectiveContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CodelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterCodeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitCodeline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitCodeline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodelineContext codeline() throws RecognitionException {
		CodelineContext _localctx = new CodelineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_codeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(128);
				label();
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << INC) | (1L << SUB) | (1L << DEC) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << PUSH) | (1L << POP) | (1L << CMP) | (1L << MOV) | (1L << JMP) | (1L << JE) | (1L << JNE) | (1L << JB) | (1L << JA) | (1L << HALT) | (1L << PRINTN))) != 0)) {
				{
				setState(131);
				asmdirective();
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(134);
				comment();
				}
			}

			setState(137);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			name();
			setState(140);
			match(T__2);
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

	public static class AsmdirectiveContext extends ParserRuleContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public StackContext stack() {
			return getRuleContext(StackContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public InterruptContext interrupt() {
			return getRuleContext(InterruptContext.class,0);
		}
		public AsmdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterAsmdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitAsmdirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitAsmdirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmdirectiveContext asmdirective() throws RecognitionException {
		AsmdirectiveContext _localctx = new AsmdirectiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asmdirective);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case INC:
			case SUB:
			case DEC:
			case MUL:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				arithmetic();
				}
				break;
			case PUSH:
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				stack();
				}
				break;
			case CMP:
			case MOV:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				directive();
				}
				break;
			case JMP:
			case JE:
			case JNE:
			case JB:
			case JA:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				control();
				}
				break;
			case HALT:
			case PRINTN:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				interrupt();
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
		enterRule(_localctx, 22, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
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
		enterRule(_localctx, 24, RULE_arithmetic);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				add();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				inc();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				sub();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				dec();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				mul();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				div();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				mod();
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
		enterRule(_localctx, 26, RULE_stack);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				push();
				}
				break;
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
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

	public static class DirectiveContext extends ParserRuleContext {
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public MovContext mov() {
			return getRuleContext(MovContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_directive);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				cmp();
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				mov();
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

	public static class ControlContext extends ParserRuleContext {
		public JmpContext jmp() {
			return getRuleContext(JmpContext.class,0);
		}
		public JeContext je() {
			return getRuleContext(JeContext.class,0);
		}
		public JneContext jne() {
			return getRuleContext(JneContext.class,0);
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
		enterRule(_localctx, 30, RULE_control);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				jmp();
				}
				break;
			case JE:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				je();
				}
				break;
			case JNE:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				jne();
				}
				break;
			case JB:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				jb();
				}
				break;
			case JA:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
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

	public static class InterruptContext extends ParserRuleContext {
		public SupervisorContext supervisor() {
			return getRuleContext(SupervisorContext.class,0);
		}
		public InterruptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interrupt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterInterrupt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitInterrupt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitInterrupt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterruptContext interrupt() throws RecognitionException {
		InterruptContext _localctx = new InterruptContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interrupt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			supervisor();
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
		enterRule(_localctx, 34, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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

	public static class IncContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(AssemblyParser.INC, 0); }
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(INC);
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
		enterRule(_localctx, 38, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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

	public static class DecContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(AssemblyParser.DEC, 0); }
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(DEC);
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
		enterRule(_localctx, 42, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		enterRule(_localctx, 44, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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

	public static class ModContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(AssemblyParser.MOD, 0); }
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(MOD);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DatasegnameContext datasegname() {
			return getRuleContext(DatasegnameContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(PUSH);
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case HEX:
				{
				setState(192);
				number();
				}
				break;
			case NAME:
				{
				setState(193);
				datasegname();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PopContext extends ParserRuleContext {
		public TerminalNode POP() { return getToken(AssemblyParser.POP, 0); }
		public DatasegnameContext datasegname() {
			return getRuleContext(DatasegnameContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_pop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(POP);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(197);
				datasegname();
				}
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
		enterRule(_localctx, 52, RULE_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		public JumpdestContext jumpdest() {
			return getRuleContext(JumpdestContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_jmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(JMP);
			setState(203);
			jumpdest();
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
		public JumpdestContext jumpdest() {
			return getRuleContext(JumpdestContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_je);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(JE);
			setState(206);
			jumpdest();
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

	public static class JneContext extends ParserRuleContext {
		public TerminalNode JNE() { return getToken(AssemblyParser.JNE, 0); }
		public JumpdestContext jumpdest() {
			return getRuleContext(JumpdestContext.class,0);
		}
		public JneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterJne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitJne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitJne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JneContext jne() throws RecognitionException {
		JneContext _localctx = new JneContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_jne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(JNE);
			setState(209);
			jumpdest();
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
		public JumpdestContext jumpdest() {
			return getRuleContext(JumpdestContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_jb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(JB);
			setState(212);
			jumpdest();
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
		public JumpdestContext jumpdest() {
			return getRuleContext(JumpdestContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_ja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(JA);
			setState(215);
			jumpdest();
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

	public static class JumpdestContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(AssemblyParser.NAME, 0); }
		public JumpdestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpdest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterJumpdest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitJumpdest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitJumpdest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpdestContext jumpdest() throws RecognitionException {
		JumpdestContext _localctx = new JumpdestContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_jumpdest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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

	public static class MovContext extends ParserRuleContext {
		public TerminalNode MOV() { return getToken(AssemblyParser.MOV, 0); }
		public List<DatasegnameContext> datasegname() {
			return getRuleContexts(DatasegnameContext.class);
		}
		public DatasegnameContext datasegname(int i) {
			return getRuleContext(DatasegnameContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public MovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterMov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitMov(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitMov(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovContext mov() throws RecognitionException {
		MovContext _localctx = new MovContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(MOV);
			setState(220);
			datasegname();
			setState(221);
			match(T__3);
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(222);
				datasegname();
				}
				break;
			case INT:
			case HEX:
				{
				setState(223);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SupervisorContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public HaltContext halt() {
			return getRuleContext(HaltContext.class,0);
		}
		public SupervisorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supervisor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterSupervisor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitSupervisor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitSupervisor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupervisorContext supervisor() throws RecognitionException {
		SupervisorContext _localctx = new SupervisorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_supervisor);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTN:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				print();
				}
				break;
			case HALT:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				halt();
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

	public static class HaltContext extends ParserRuleContext {
		public TerminalNode HALT() { return getToken(AssemblyParser.HALT, 0); }
		public HaltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_halt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterHalt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitHalt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitHalt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HaltContext halt() throws RecognitionException {
		HaltContext _localctx = new HaltContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_halt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(HALT);
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

	public static class PrintContext extends ParserRuleContext {
		public PrintnContext printn() {
			return getRuleContext(PrintnContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			printn();
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

	public static class PrintnContext extends ParserRuleContext {
		public TerminalNode PRINTN() { return getToken(AssemblyParser.PRINTN, 0); }
		public PrintnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterPrintn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitPrintn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitPrintn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintnContext printn() throws RecognitionException {
		PrintnContext _localctx = new PrintnContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_printn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(PRINTN);
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

	public static class DatasegnameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DatasegnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasegname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterDatasegname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitDatasegname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitDatasegname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasegnameContext datasegname() throws RecognitionException {
		DatasegnameContext _localctx = new DatasegnameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_datasegname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			name();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(AssemblyParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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

	public static class LiteralContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			number();
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

	public static class NumberContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public HexadecimalContext hexadecimal() {
			return getRuleContext(HexadecimalContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_number);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				decimal();
				}
				break;
			case HEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				hexadecimal();
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

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AssemblyParser.INT, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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

	public static class HexadecimalContext extends ParserRuleContext {
		public TerminalNode HEX() { return getToken(AssemblyParser.HEX, 0); }
		public HexadecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterHexadecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitHexadecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitHexadecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalContext hexadecimal() throws RecognitionException {
		HexadecimalContext _localctx = new HexadecimalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_hexadecimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(HEX);
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
		"\u0004\u0001\u001d\u00fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000"+
		"\u0003\u0000Z\b\u0000\u0001\u0000\u0003\u0000]\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002e\b"+
		"\u0002\n\u0002\f\u0002h\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0005\u0004n\b\u0004\n\u0004\f\u0004q\t\u0004\u0001\u0005\u0003"+
		"\u0005t\b\u0005\u0001\u0005\u0003\u0005w\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0003\b\u0082\b\b\u0001\b\u0003\b\u0085\b\b\u0001\b\u0003\b\u0088"+
		"\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0094\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009f\b\f\u0001\r\u0001\r\u0003"+
		"\r\u00a3\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u00a7\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ae\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u00c3\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u00c7\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u00e1\b!\u0001"+
		"\"\u0001\"\u0003\"\u00e5\b\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0003)\u00f5"+
		"\b)\u0001*\u0001*\u0001+\u0001+\u0001+\u0000\u0000,\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0000\u00ec\u0000Y\u0001\u0000\u0000"+
		"\u0000\u0002`\u0001\u0000\u0000\u0000\u0004f\u0001\u0000\u0000\u0000\u0006"+
		"i\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\ns\u0001\u0000\u0000"+
		"\u0000\fz\u0001\u0000\u0000\u0000\u000e~\u0001\u0000\u0000\u0000\u0010"+
		"\u0081\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014"+
		"\u0093\u0001\u0000\u0000\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018"+
		"\u009e\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c"+
		"\u00a6\u0001\u0000\u0000\u0000\u001e\u00ad\u0001\u0000\u0000\u0000 \u00af"+
		"\u0001\u0000\u0000\u0000\"\u00b1\u0001\u0000\u0000\u0000$\u00b3\u0001"+
		"\u0000\u0000\u0000&\u00b5\u0001\u0000\u0000\u0000(\u00b7\u0001\u0000\u0000"+
		"\u0000*\u00b9\u0001\u0000\u0000\u0000,\u00bb\u0001\u0000\u0000\u0000."+
		"\u00bd\u0001\u0000\u0000\u00000\u00bf\u0001\u0000\u0000\u00002\u00c4\u0001"+
		"\u0000\u0000\u00004\u00c8\u0001\u0000\u0000\u00006\u00ca\u0001\u0000\u0000"+
		"\u00008\u00cd\u0001\u0000\u0000\u0000:\u00d0\u0001\u0000\u0000\u0000<"+
		"\u00d3\u0001\u0000\u0000\u0000>\u00d6\u0001\u0000\u0000\u0000@\u00d9\u0001"+
		"\u0000\u0000\u0000B\u00db\u0001\u0000\u0000\u0000D\u00e4\u0001\u0000\u0000"+
		"\u0000F\u00e6\u0001\u0000\u0000\u0000H\u00e8\u0001\u0000\u0000\u0000J"+
		"\u00ea\u0001\u0000\u0000\u0000L\u00ec\u0001\u0000\u0000\u0000N\u00ee\u0001"+
		"\u0000\u0000\u0000P\u00f0\u0001\u0000\u0000\u0000R\u00f4\u0001\u0000\u0000"+
		"\u0000T\u00f6\u0001\u0000\u0000\u0000V\u00f8\u0001\u0000\u0000\u0000X"+
		"Z\u0003\u0002\u0001\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z\\\u0001\u0000\u0000\u0000[]\u0003\u0006\u0003\u0000\\[\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005"+
		"\u0000\u0000\u0001_\u0001\u0001\u0000\u0000\u0000`a\u0005\u0001\u0000"+
		"\u0000ab\u0003\u0004\u0002\u0000b\u0003\u0001\u0000\u0000\u0000ce\u0003"+
		"\n\u0005\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0005\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u0002\u0000\u0000jk\u0003\b\u0004"+
		"\u0000k\u0007\u0001\u0000\u0000\u0000ln\u0003\u0010\b\u0000ml\u0001\u0000"+
		"\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000p\t\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"rt\u0003\f\u0006\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tv\u0001\u0000\u0000\u0000uw\u0003\u0016\u000b\u0000vu\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u001d"+
		"\u0000\u0000y\u000b\u0001\u0000\u0000\u0000z{\u0003\u000e\u0007\u0000"+
		"{|\u0005\u0017\u0000\u0000|}\u0003R)\u0000}\r\u0001\u0000\u0000\u0000"+
		"~\u007f\u0003N\'\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\u0003\u0012\t\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0085\u0003"+
		"\u0014\n\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0016"+
		"\u000b\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u001d"+
		"\u0000\u0000\u008a\u0011\u0001\u0000\u0000\u0000\u008b\u008c\u0003N\'"+
		"\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u0013\u0001\u0000\u0000"+
		"\u0000\u008e\u0094\u0003\u0018\f\u0000\u008f\u0094\u0003\u001a\r\u0000"+
		"\u0090\u0094\u0003\u001c\u000e\u0000\u0091\u0094\u0003\u001e\u000f\u0000"+
		"\u0092\u0094\u0003 \u0010\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093"+
		"\u008f\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0015\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u001c\u0000\u0000\u0096"+
		"\u0017\u0001\u0000\u0000\u0000\u0097\u009f\u0003\"\u0011\u0000\u0098\u009f"+
		"\u0003$\u0012\u0000\u0099\u009f\u0003&\u0013\u0000\u009a\u009f\u0003("+
		"\u0014\u0000\u009b\u009f\u0003*\u0015\u0000\u009c\u009f\u0003,\u0016\u0000"+
		"\u009d\u009f\u0003.\u0017\u0000\u009e\u0097\u0001\u0000\u0000\u0000\u009e"+
		"\u0098\u0001\u0000\u0000\u0000\u009e\u0099\u0001\u0000\u0000\u0000\u009e"+
		"\u009a\u0001\u0000\u0000\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u0019\u0001\u0000\u0000\u0000\u00a0\u00a3\u00030\u0018\u0000\u00a1\u00a3"+
		"\u00032\u0019\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u001b\u0001\u0000\u0000\u0000\u00a4\u00a7\u0003"+
		"4\u001a\u0000\u00a5\u00a7\u0003B!\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u001d\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ae\u00036\u001b\u0000\u00a9\u00ae\u00038\u001c\u0000\u00aa"+
		"\u00ae\u0003:\u001d\u0000\u00ab\u00ae\u0003<\u001e\u0000\u00ac\u00ae\u0003"+
		">\u001f\u0000\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u001f\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0003D\"\u0000\u00b0!\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0005\u0005\u0000\u0000\u00b2#\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0005\u0006\u0000\u0000\u00b4%\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0007\u0000\u0000\u00b6\'\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\b\u0000\u0000\u00b8)\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\t\u0000"+
		"\u0000\u00ba+\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\n\u0000\u0000"+
		"\u00bc-\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u000b\u0000\u0000\u00be"+
		"/\u0001\u0000\u0000\u0000\u00bf\u00c2\u0005\f\u0000\u0000\u00c0\u00c3"+
		"\u0003R)\u0000\u00c1\u00c3\u0003L&\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c31\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c6\u0005\r\u0000\u0000\u00c5\u00c7\u0003L&\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c73\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005\u000e\u0000\u0000\u00c95\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005\u0010\u0000\u0000\u00cb\u00cc\u0003@ \u0000"+
		"\u00cc7\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0011\u0000\u0000\u00ce"+
		"\u00cf\u0003@ \u0000\u00cf9\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0012\u0000\u0000\u00d1\u00d2\u0003@ \u0000\u00d2;\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0013\u0000\u0000\u00d4\u00d5\u0003@ \u0000\u00d5"+
		"=\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0014\u0000\u0000\u00d7\u00d8"+
		"\u0003@ \u0000\u00d8?\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u001a"+
		"\u0000\u0000\u00daA\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u000f\u0000"+
		"\u0000\u00dc\u00dd\u0003L&\u0000\u00dd\u00e0\u0005\u0004\u0000\u0000\u00de"+
		"\u00e1\u0003L&\u0000\u00df\u00e1\u0003R)\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1C\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0003H$\u0000\u00e3\u00e5\u0003F#\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5E\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0005\u0015\u0000\u0000\u00e7G\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0003J%\u0000\u00e9I\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0016\u0000\u0000\u00ebK\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0003N\'\u0000\u00edM\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005"+
		"\u001a\u0000\u0000\u00efO\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003R)"+
		"\u0000\u00f1Q\u0001\u0000\u0000\u0000\u00f2\u00f5\u0003T*\u0000\u00f3"+
		"\u00f5\u0003V+\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5S\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0018"+
		"\u0000\u0000\u00f7U\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0019\u0000"+
		"\u0000\u00f9W\u0001\u0000\u0000\u0000\u0013Y\\fosv\u0081\u0084\u0087\u0093"+
		"\u009e\u00a2\u00a6\u00ad\u00c2\u00c6\u00e0\u00e4\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}