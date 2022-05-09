// Generated from Assembly.g4 by ANTLR 4.10.1
package com.gusged.os.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ADD=5, INC=6, SUB=7, DEC=8, MUL=9, DIV=10, 
		MOD=11, PUSH=12, POP=13, CMP=14, MOV=15, JMP=16, JE=17, JNE=18, JB=19, 
		JA=20, HALT=21, PRINTN=22, SCANN=23, DW=24, INT=25, HEX=26, NAME=27, SPACE=28, 
		COMMENT=29, EOL=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "ADD", "INC", "SUB", "DEC", "MUL", "DIV", 
			"MOD", "PUSH", "POP", "CMP", "MOV", "JMP", "JE", "JNE", "JB", "JA", "HALT", 
			"PRINTN", "SCANN", "DW", "INT", "HEX", "NAME", "SPACE", "COMMENT", "EOL"
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


	public AssemblyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Assembly.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001e\u011a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004T\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\\\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006d\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007l\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bt\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t|\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0084\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u008e\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0096\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u009e\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00a6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ae\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b4\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00bc\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00c2\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00c8\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d2\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00e0\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u00ec\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00f2\b\u0017\u0001\u0018\u0003\u0018\u00f5\b\u0018\u0001\u0018\u0004"+
		"\u0018\u00f8\b\u0018\u000b\u0018\f\u0018\u00f9\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0004\u0019\u0100\b\u0019\u000b\u0019\f\u0019"+
		"\u0101\u0001\u001a\u0004\u001a\u0105\b\u001a\u000b\u001a\f\u001a\u0106"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u010f\b\u001c\n\u001c\f\u001c\u0112\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0004\u001d\u0117\b\u001d\u000b\u001d\f\u001d\u0118"+
		"\u0000\u0000\u001e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e\u0001"+
		"\u0000\u0005\u0001\u000009\u0003\u000009AFaf\u0005\u0000..09AZ__az\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0133\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000\u0000\u0003C"+
		"\u0001\u0000\u0000\u0000\u0005I\u0001\u0000\u0000\u0000\u0007K\u0001\u0000"+
		"\u0000\u0000\tS\u0001\u0000\u0000\u0000\u000b[\u0001\u0000\u0000\u0000"+
		"\rc\u0001\u0000\u0000\u0000\u000fk\u0001\u0000\u0000\u0000\u0011s\u0001"+
		"\u0000\u0000\u0000\u0013{\u0001\u0000\u0000\u0000\u0015\u0083\u0001\u0000"+
		"\u0000\u0000\u0017\u008d\u0001\u0000\u0000\u0000\u0019\u0095\u0001\u0000"+
		"\u0000\u0000\u001b\u009d\u0001\u0000\u0000\u0000\u001d\u00a5\u0001\u0000"+
		"\u0000\u0000\u001f\u00ad\u0001\u0000\u0000\u0000!\u00b3\u0001\u0000\u0000"+
		"\u0000#\u00bb\u0001\u0000\u0000\u0000%\u00c1\u0001\u0000\u0000\u0000\'"+
		"\u00c7\u0001\u0000\u0000\u0000)\u00d1\u0001\u0000\u0000\u0000+\u00df\u0001"+
		"\u0000\u0000\u0000-\u00eb\u0001\u0000\u0000\u0000/\u00f1\u0001\u0000\u0000"+
		"\u00001\u00f4\u0001\u0000\u0000\u00003\u00fb\u0001\u0000\u0000\u00005"+
		"\u0104\u0001\u0000\u0000\u00007\u0108\u0001\u0000\u0000\u00009\u010c\u0001"+
		"\u0000\u0000\u0000;\u0116\u0001\u0000\u0000\u0000=>\u0005$\u0000\u0000"+
		">?\u0005D\u0000\u0000?@\u0005A\u0000\u0000@A\u0005T\u0000\u0000AB\u0005"+
		"A\u0000\u0000B\u0002\u0001\u0000\u0000\u0000CD\u0005$\u0000\u0000DE\u0005"+
		"C\u0000\u0000EF\u0005O\u0000\u0000FG\u0005D\u0000\u0000GH\u0005E\u0000"+
		"\u0000H\u0004\u0001\u0000\u0000\u0000IJ\u0005:\u0000\u0000J\u0006\u0001"+
		"\u0000\u0000\u0000KL\u0005,\u0000\u0000L\b\u0001\u0000\u0000\u0000MN\u0005"+
		"A\u0000\u0000NO\u0005D\u0000\u0000OT\u0005D\u0000\u0000PQ\u0005a\u0000"+
		"\u0000QR\u0005d\u0000\u0000RT\u0005d\u0000\u0000SM\u0001\u0000\u0000\u0000"+
		"SP\u0001\u0000\u0000\u0000T\n\u0001\u0000\u0000\u0000UV\u0005I\u0000\u0000"+
		"VW\u0005N\u0000\u0000W\\\u0005C\u0000\u0000XY\u0005i\u0000\u0000YZ\u0005"+
		"n\u0000\u0000Z\\\u0005c\u0000\u0000[U\u0001\u0000\u0000\u0000[X\u0001"+
		"\u0000\u0000\u0000\\\f\u0001\u0000\u0000\u0000]^\u0005S\u0000\u0000^_"+
		"\u0005U\u0000\u0000_d\u0005B\u0000\u0000`a\u0005s\u0000\u0000ab\u0005"+
		"u\u0000\u0000bd\u0005b\u0000\u0000c]\u0001\u0000\u0000\u0000c`\u0001\u0000"+
		"\u0000\u0000d\u000e\u0001\u0000\u0000\u0000ef\u0005D\u0000\u0000fg\u0005"+
		"E\u0000\u0000gl\u0005C\u0000\u0000hi\u0005d\u0000\u0000ij\u0005e\u0000"+
		"\u0000jl\u0005c\u0000\u0000ke\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000"+
		"\u0000l\u0010\u0001\u0000\u0000\u0000mn\u0005M\u0000\u0000no\u0005U\u0000"+
		"\u0000ot\u0005L\u0000\u0000pq\u0005m\u0000\u0000qr\u0005u\u0000\u0000"+
		"rt\u0005l\u0000\u0000sm\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000"+
		"t\u0012\u0001\u0000\u0000\u0000uv\u0005D\u0000\u0000vw\u0005I\u0000\u0000"+
		"w|\u0005V\u0000\u0000xy\u0005d\u0000\u0000yz\u0005i\u0000\u0000z|\u0005"+
		"v\u0000\u0000{u\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|\u0014"+
		"\u0001\u0000\u0000\u0000}~\u0005M\u0000\u0000~\u007f\u0005O\u0000\u0000"+
		"\u007f\u0084\u0005D\u0000\u0000\u0080\u0081\u0005m\u0000\u0000\u0081\u0082"+
		"\u0005o\u0000\u0000\u0082\u0084\u0005d\u0000\u0000\u0083}\u0001\u0000"+
		"\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0084\u0016\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005P\u0000\u0000\u0086\u0087\u0005U\u0000\u0000"+
		"\u0087\u0088\u0005S\u0000\u0000\u0088\u008e\u0005H\u0000\u0000\u0089\u008a"+
		"\u0005p\u0000\u0000\u008a\u008b\u0005u\u0000\u0000\u008b\u008c\u0005s"+
		"\u0000\u0000\u008c\u008e\u0005h\u0000\u0000\u008d\u0085\u0001\u0000\u0000"+
		"\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008e\u0018\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005P\u0000\u0000\u0090\u0091\u0005O\u0000\u0000\u0091"+
		"\u0096\u0005P\u0000\u0000\u0092\u0093\u0005p\u0000\u0000\u0093\u0094\u0005"+
		"o\u0000\u0000\u0094\u0096\u0005p\u0000\u0000\u0095\u008f\u0001\u0000\u0000"+
		"\u0000\u0095\u0092\u0001\u0000\u0000\u0000\u0096\u001a\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005C\u0000\u0000\u0098\u0099\u0005M\u0000\u0000\u0099"+
		"\u009e\u0005P\u0000\u0000\u009a\u009b\u0005c\u0000\u0000\u009b\u009c\u0005"+
		"m\u0000\u0000\u009c\u009e\u0005p\u0000\u0000\u009d\u0097\u0001\u0000\u0000"+
		"\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009e\u001c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005M\u0000\u0000\u00a0\u00a1\u0005O\u0000\u0000\u00a1"+
		"\u00a6\u0005V\u0000\u0000\u00a2\u00a3\u0005m\u0000\u0000\u00a3\u00a4\u0005"+
		"o\u0000\u0000\u00a4\u00a6\u0005v\u0000\u0000\u00a5\u009f\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a6\u001e\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005J\u0000\u0000\u00a8\u00a9\u0005M\u0000\u0000\u00a9"+
		"\u00ae\u0005P\u0000\u0000\u00aa\u00ab\u0005j\u0000\u0000\u00ab\u00ac\u0005"+
		"m\u0000\u0000\u00ac\u00ae\u0005p\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000"+
		"\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ae \u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005J\u0000\u0000\u00b0\u00b4\u0005E\u0000\u0000\u00b1\u00b2"+
		"\u0005j\u0000\u0000\u00b2\u00b4\u0005e\u0000\u0000\u00b3\u00af\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\"\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005J\u0000\u0000\u00b6\u00b7\u0005N\u0000\u0000\u00b7"+
		"\u00bc\u0005E\u0000\u0000\u00b8\u00b9\u0005j\u0000\u0000\u00b9\u00ba\u0005"+
		"n\u0000\u0000\u00ba\u00bc\u0005e\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bc$\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005J\u0000\u0000\u00be\u00c2\u0005B\u0000\u0000\u00bf\u00c0"+
		"\u0005j\u0000\u0000\u00c0\u00c2\u0005b\u0000\u0000\u00c1\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2&\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005J\u0000\u0000\u00c4\u00c8\u0005A\u0000\u0000\u00c5"+
		"\u00c6\u0005j\u0000\u0000\u00c6\u00c8\u0005a\u0000\u0000\u00c7\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8(\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005H\u0000\u0000\u00ca\u00cb\u0005A\u0000\u0000"+
		"\u00cb\u00cc\u0005L\u0000\u0000\u00cc\u00d2\u0005T\u0000\u0000\u00cd\u00ce"+
		"\u0005h\u0000\u0000\u00ce\u00cf\u0005a\u0000\u0000\u00cf\u00d0\u0005l"+
		"\u0000\u0000\u00d0\u00d2\u0005t\u0000\u0000\u00d1\u00c9\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000\u00d2*\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0005P\u0000\u0000\u00d4\u00d5\u0005R\u0000\u0000\u00d5\u00d6"+
		"\u0005I\u0000\u0000\u00d6\u00d7\u0005N\u0000\u0000\u00d7\u00d8\u0005T"+
		"\u0000\u0000\u00d8\u00e0\u0005N\u0000\u0000\u00d9\u00da\u0005p\u0000\u0000"+
		"\u00da\u00db\u0005r\u0000\u0000\u00db\u00dc\u0005i\u0000\u0000\u00dc\u00dd"+
		"\u0005n\u0000\u0000\u00dd\u00de\u0005t\u0000\u0000\u00de\u00e0\u0005n"+
		"\u0000\u0000\u00df\u00d3\u0001\u0000\u0000\u0000\u00df\u00d9\u0001\u0000"+
		"\u0000\u0000\u00e0,\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005S\u0000\u0000"+
		"\u00e2\u00e3\u0005C\u0000\u0000\u00e3\u00e4\u0005A\u0000\u0000\u00e4\u00e5"+
		"\u0005N\u0000\u0000\u00e5\u00ec\u0005N\u0000\u0000\u00e6\u00e7\u0005s"+
		"\u0000\u0000\u00e7\u00e8\u0005c\u0000\u0000\u00e8\u00e9\u0005a\u0000\u0000"+
		"\u00e9\u00ea\u0005n\u0000\u0000\u00ea\u00ec\u0005n\u0000\u0000\u00eb\u00e1"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00ec.\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005D\u0000\u0000\u00ee\u00f2\u0005W\u0000"+
		"\u0000\u00ef\u00f0\u0005d\u0000\u0000\u00f0\u00f2\u0005w\u0000\u0000\u00f1"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2"+
		"0\u0001\u0000\u0000\u0000\u00f3\u00f5\u0005-\u0000\u0000\u00f4\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f8\u0007\u0000\u0000\u0000\u00f7\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa2\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u00050\u0000\u0000\u00fc\u00fd\u0005x\u0000\u0000"+
		"\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u0100\u0007\u0001\u0000\u0000"+
		"\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000"+
		"\u01024\u0001\u0000\u0000\u0000\u0103\u0105\u0007\u0002\u0000\u0000\u0104"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"6\u0001\u0000\u0000\u0000\u0108\u0109\u0007\u0003\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0006\u001b\u0000\u0000\u010b8\u0001"+
		"\u0000\u0000\u0000\u010c\u0110\u0005;\u0000\u0000\u010d\u010f\b\u0004"+
		"\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0006\u001c\u0000\u0000\u0114:\u0001\u0000\u0000"+
		"\u0000\u0115\u0117\u0007\u0004\u0000\u0000\u0116\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119<\u0001\u0000\u0000\u0000"+
		"\u001b\u0000S[cks{\u0083\u008d\u0095\u009d\u00a5\u00ad\u00b3\u00bb\u00c1"+
		"\u00c7\u00d1\u00df\u00eb\u00f1\u00f4\u00f9\u0101\u0106\u0110\u0118\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}