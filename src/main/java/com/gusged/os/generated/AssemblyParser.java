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
		T__0=1, T__1=2, T__2=3, T__3=4, ADD=5, INC=6, SUB=7, DEC=8, MUL=9, DIV=10, 
		MOD=11, PUSH=12, POP=13, CMP=14, MOV=15, JMP=16, JE=17, JNE=18, JB=19, 
		JA=20, HALT=21, PRINTN=22, SCANN=23, DW=24, INT=25, HEX=26, NAME=27, SPACE=28, 
		COMMENT=29, EOL=30;
	public static final int
		RULE_program = 0, RULE_dataseg = 1, RULE_datablock = 2, RULE_codeseg = 3, 
		RULE_codeblock = 4, RULE_dataline = 5, RULE_datadef = 6, RULE_datadefname = 7, 
		RULE_codeline = 8, RULE_label = 9, RULE_asmdirective = 10, RULE_comment = 11, 
		RULE_arithmetic = 12, RULE_stack = 13, RULE_directive = 14, RULE_control = 15, 
		RULE_interrupt = 16, RULE_add = 17, RULE_inc = 18, RULE_sub = 19, RULE_dec = 20, 
		RULE_mul = 21, RULE_div = 22, RULE_mod = 23, RULE_push = 24, RULE_pop = 25, 
		RULE_cmp = 26, RULE_jmp = 27, RULE_je = 28, RULE_jne = 29, RULE_jb = 30, 
		RULE_ja = 31, RULE_jumpdest = 32, RULE_mov = 33, RULE_supervisor = 34, 
		RULE_halt = 35, RULE_print = 36, RULE_scan = 37, RULE_printn = 38, RULE_scann = 39, 
		RULE_datasegname = 40, RULE_name = 41, RULE_literal = 42, RULE_number = 43, 
		RULE_decimal = 44, RULE_hexadecimal = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dataseg", "datablock", "codeseg", "codeblock", "dataline", 
			"datadef", "datadefname", "codeline", "label", "asmdirective", "comment", 
			"arithmetic", "stack", "directive", "control", "interrupt", "add", "inc", 
			"sub", "dec", "mul", "div", "mod", "push", "pop", "cmp", "jmp", "je", 
			"jne", "jb", "ja", "jumpdest", "mov", "supervisor", "halt", "print", 
			"scan", "printn", "scann", "datasegname", "name", "literal", "number", 
			"decimal", "hexadecimal"
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
			"PRINTN", "SCANN", "DW", "INT", "HEX", "NAME", "SPACE", "COMMENT", "EOL"
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
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(92);
				dataseg();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(95);
				codeseg();
				}
			}

			setState(98);
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
			setState(100);
			match(T__0);
			setState(101);
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
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << COMMENT) | (1L << EOL))) != 0)) {
				{
				{
				setState(103);
				dataline();
				}
				}
				setState(108);
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
			setState(109);
			match(T__1);
			setState(110);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << INC) | (1L << SUB) | (1L << DEC) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << PUSH) | (1L << POP) | (1L << CMP) | (1L << MOV) | (1L << JMP) | (1L << JE) | (1L << JNE) | (1L << JB) | (1L << JA) | (1L << HALT) | (1L << PRINTN) | (1L << SCANN) | (1L << NAME) | (1L << COMMENT) | (1L << EOL))) != 0)) {
				{
				{
				setState(112);
				codeline();
				}
				}
				setState(117);
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(118);
				datadef();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(121);
				comment();
				}
			}

			setState(124);
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
			setState(126);
			datadefname();
			setState(127);
			match(DW);
			setState(128);
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
			setState(130);
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
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(132);
				label();
				}
			}

			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << INC) | (1L << SUB) | (1L << DEC) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << PUSH) | (1L << POP) | (1L << CMP) | (1L << MOV) | (1L << JMP) | (1L << JE) | (1L << JNE) | (1L << JB) | (1L << JA) | (1L << HALT) | (1L << PRINTN) | (1L << SCANN))) != 0)) {
				{
				setState(135);
				asmdirective();
				}
			}

			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(138);
				comment();
				}
			}

			setState(141);
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
			setState(143);
			name();
			setState(144);
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
			setState(151);
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
				setState(146);
				arithmetic();
				}
				break;
			case PUSH:
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				stack();
				}
				break;
			case CMP:
			case MOV:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
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
				setState(149);
				control();
				}
				break;
			case HALT:
			case PRINTN:
			case SCANN:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
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
			setState(153);
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				add();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				inc();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				sub();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				dec();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				mul();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				div();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
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
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				push();
				}
				break;
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				cmp();
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
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
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				jmp();
				}
				break;
			case JE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				je();
				}
				break;
			case JNE:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				jne();
				}
				break;
			case JB:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				jb();
				}
				break;
			case JA:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
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
			setState(179);
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
			setState(181);
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
			setState(183);
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
			setState(185);
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
			setState(187);
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
			setState(189);
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
			setState(191);
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
			setState(193);
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
			setState(195);
			match(PUSH);
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case HEX:
				{
				setState(196);
				number();
				}
				break;
			case NAME:
				{
				setState(197);
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
			setState(200);
			match(POP);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(201);
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
			setState(204);
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
			setState(206);
			match(JMP);
			setState(207);
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
			setState(209);
			match(JE);
			setState(210);
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
			setState(212);
			match(JNE);
			setState(213);
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
			setState(215);
			match(JB);
			setState(216);
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
			setState(218);
			match(JA);
			setState(219);
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
			setState(221);
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
			setState(223);
			match(MOV);
			setState(224);
			datasegname();
			setState(225);
			match(T__3);
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(226);
				datasegname();
				}
				break;
			case INT:
			case HEX:
				{
				setState(227);
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
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
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
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTN:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				print();
				}
				break;
			case SCANN:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				scan();
				}
				break;
			case HALT:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
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
			setState(235);
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
			setState(237);
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

	public static class ScanContext extends ParserRuleContext {
		public ScannContext scann() {
			return getRuleContext(ScannContext.class,0);
		}
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			scann();
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
		enterRule(_localctx, 76, RULE_printn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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

	public static class ScannContext extends ParserRuleContext {
		public TerminalNode SCANN() { return getToken(AssemblyParser.SCANN, 0); }
		public ScannContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scann; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterScann(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitScann(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitScann(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScannContext scann() throws RecognitionException {
		ScannContext _localctx = new ScannContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_scann);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(SCANN);
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
		enterRule(_localctx, 80, RULE_datasegname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 82, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 84, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 86, RULE_number);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				decimal();
				}
				break;
			case HEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
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
		enterRule(_localctx, 88, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		enterRule(_localctx, 90, RULE_hexadecimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0106\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\5\2`\n\2\3\2\5\2c\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\7\4k\n\4\f\4\16\4n\13\4\3\5\3\5\3\5\3\6\7\6t\n\6\f\6\16\6w\13\6\3\7"+
		"\5\7z\n\7\3\7\5\7}\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\5\n\u0088\n"+
		"\n\3\n\5\n\u008b\n\n\3\n\5\n\u008e\n\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u009a\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00a5\n\16\3\17\3\17\5\17\u00a9\n\17\3\20\3\20\5\20\u00ad\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00b4\n\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32"+
		"\u00c9\n\32\3\33\3\33\5\33\u00cd\n\33\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3#\5#\u00e7"+
		"\n#\3$\3$\3$\5$\u00ec\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\5-\u0100\n-\3.\3.\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\2\2\u00f6\2_\3"+
		"\2\2\2\4f\3\2\2\2\6l\3\2\2\2\bo\3\2\2\2\nu\3\2\2\2\fy\3\2\2\2\16\u0080"+
		"\3\2\2\2\20\u0084\3\2\2\2\22\u0087\3\2\2\2\24\u0091\3\2\2\2\26\u0099\3"+
		"\2\2\2\30\u009b\3\2\2\2\32\u00a4\3\2\2\2\34\u00a8\3\2\2\2\36\u00ac\3\2"+
		"\2\2 \u00b3\3\2\2\2\"\u00b5\3\2\2\2$\u00b7\3\2\2\2&\u00b9\3\2\2\2(\u00bb"+
		"\3\2\2\2*\u00bd\3\2\2\2,\u00bf\3\2\2\2.\u00c1\3\2\2\2\60\u00c3\3\2\2\2"+
		"\62\u00c5\3\2\2\2\64\u00ca\3\2\2\2\66\u00ce\3\2\2\28\u00d0\3\2\2\2:\u00d3"+
		"\3\2\2\2<\u00d6\3\2\2\2>\u00d9\3\2\2\2@\u00dc\3\2\2\2B\u00df\3\2\2\2D"+
		"\u00e1\3\2\2\2F\u00eb\3\2\2\2H\u00ed\3\2\2\2J\u00ef\3\2\2\2L\u00f1\3\2"+
		"\2\2N\u00f3\3\2\2\2P\u00f5\3\2\2\2R\u00f7\3\2\2\2T\u00f9\3\2\2\2V\u00fb"+
		"\3\2\2\2X\u00ff\3\2\2\2Z\u0101\3\2\2\2\\\u0103\3\2\2\2^`\5\4\3\2_^\3\2"+
		"\2\2_`\3\2\2\2`b\3\2\2\2ac\5\b\5\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\2"+
		"\2\3e\3\3\2\2\2fg\7\3\2\2gh\5\6\4\2h\5\3\2\2\2ik\5\f\7\2ji\3\2\2\2kn\3"+
		"\2\2\2lj\3\2\2\2lm\3\2\2\2m\7\3\2\2\2nl\3\2\2\2op\7\4\2\2pq\5\n\6\2q\t"+
		"\3\2\2\2rt\5\22\n\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\13\3\2\2"+
		"\2wu\3\2\2\2xz\5\16\b\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\5\30\r\2|{\3\2"+
		"\2\2|}\3\2\2\2}~\3\2\2\2~\177\7 \2\2\177\r\3\2\2\2\u0080\u0081\5\20\t"+
		"\2\u0081\u0082\7\32\2\2\u0082\u0083\5X-\2\u0083\17\3\2\2\2\u0084\u0085"+
		"\5T+\2\u0085\21\3\2\2\2\u0086\u0088\5\24\13\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u008b\5\26\f\2\u008a\u0089\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008e\5\30\r\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7 "+
		"\2\2\u0090\23\3\2\2\2\u0091\u0092\5T+\2\u0092\u0093\7\5\2\2\u0093\25\3"+
		"\2\2\2\u0094\u009a\5\32\16\2\u0095\u009a\5\34\17\2\u0096\u009a\5\36\20"+
		"\2\u0097\u009a\5 \21\2\u0098\u009a\5\"\22\2\u0099\u0094\3\2\2\2\u0099"+
		"\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2"+
		"\2\2\u009a\27\3\2\2\2\u009b\u009c\7\37\2\2\u009c\31\3\2\2\2\u009d\u00a5"+
		"\5$\23\2\u009e\u00a5\5&\24\2\u009f\u00a5\5(\25\2\u00a0\u00a5\5*\26\2\u00a1"+
		"\u00a5\5,\27\2\u00a2\u00a5\5.\30\2\u00a3\u00a5\5\60\31\2\u00a4\u009d\3"+
		"\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4"+
		"\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\33\3\2\2"+
		"\2\u00a6\u00a9\5\62\32\2\u00a7\u00a9\5\64\33\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00ad\5\66\34\2\u00ab\u00ad\5D#"+
		"\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\37\3\2\2\2\u00ae\u00b4"+
		"\58\35\2\u00af\u00b4\5:\36\2\u00b0\u00b4\5<\37\2\u00b1\u00b4\5> \2\u00b2"+
		"\u00b4\5@!\2\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4!\3\2\2\2\u00b5\u00b6"+
		"\5F$\2\u00b6#\3\2\2\2\u00b7\u00b8\7\7\2\2\u00b8%\3\2\2\2\u00b9\u00ba\7"+
		"\b\2\2\u00ba\'\3\2\2\2\u00bb\u00bc\7\t\2\2\u00bc)\3\2\2\2\u00bd\u00be"+
		"\7\n\2\2\u00be+\3\2\2\2\u00bf\u00c0\7\13\2\2\u00c0-\3\2\2\2\u00c1\u00c2"+
		"\7\f\2\2\u00c2/\3\2\2\2\u00c3\u00c4\7\r\2\2\u00c4\61\3\2\2\2\u00c5\u00c8"+
		"\7\16\2\2\u00c6\u00c9\5X-\2\u00c7\u00c9\5R*\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\63\3\2\2\2\u00ca\u00cc\7\17\2\2\u00cb\u00cd\5R*\2"+
		"\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\65\3\2\2\2\u00ce\u00cf"+
		"\7\20\2\2\u00cf\67\3\2\2\2\u00d0\u00d1\7\22\2\2\u00d1\u00d2\5B\"\2\u00d2"+
		"9\3\2\2\2\u00d3\u00d4\7\23\2\2\u00d4\u00d5\5B\"\2\u00d5;\3\2\2\2\u00d6"+
		"\u00d7\7\24\2\2\u00d7\u00d8\5B\"\2\u00d8=\3\2\2\2\u00d9\u00da\7\25\2\2"+
		"\u00da\u00db\5B\"\2\u00db?\3\2\2\2\u00dc\u00dd\7\26\2\2\u00dd\u00de\5"+
		"B\"\2\u00deA\3\2\2\2\u00df\u00e0\7\35\2\2\u00e0C\3\2\2\2\u00e1\u00e2\7"+
		"\21\2\2\u00e2\u00e3\5R*\2\u00e3\u00e6\7\6\2\2\u00e4\u00e7\5R*\2\u00e5"+
		"\u00e7\5X-\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7E\3\2\2\2\u00e8"+
		"\u00ec\5J&\2\u00e9\u00ec\5L\'\2\u00ea\u00ec\5H%\2\u00eb\u00e8\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ecG\3\2\2\2\u00ed\u00ee\7"+
		"\27\2\2\u00eeI\3\2\2\2\u00ef\u00f0\5N(\2\u00f0K\3\2\2\2\u00f1\u00f2\5"+
		"P)\2\u00f2M\3\2\2\2\u00f3\u00f4\7\30\2\2\u00f4O\3\2\2\2\u00f5\u00f6\7"+
		"\31\2\2\u00f6Q\3\2\2\2\u00f7\u00f8\5T+\2\u00f8S\3\2\2\2\u00f9\u00fa\7"+
		"\35\2\2\u00faU\3\2\2\2\u00fb\u00fc\5X-\2\u00fcW\3\2\2\2\u00fd\u0100\5"+
		"Z.\2\u00fe\u0100\5\\/\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"Y\3\2\2\2\u0101\u0102\7\33\2\2\u0102[\3\2\2\2\u0103\u0104\7\34\2\2\u0104"+
		"]\3\2\2\2\25_bluy|\u0087\u008a\u008d\u0099\u00a4\u00a8\u00ac\u00b3\u00c8"+
		"\u00cc\u00e6\u00eb\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}