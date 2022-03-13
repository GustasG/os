// Generated from Assembly.g4 by ANTLR 4.9.3
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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ADD=5, INC=6, SUB=7, DEC=8, MUL=9, DIV=10, 
		MOD=11, PUSH=12, POP=13, CMP=14, MOV=15, JMP=16, JE=17, JNE=18, JB=19, 
		JA=20, HALT=21, DW=22, INT=23, HEX=24, NAME=25, SPACE=26, COMMENT=27, 
		EOL=28;
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
			"DW", "INT", "HEX", "NAME", "SPACE", "COMMENT", "EOL"
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
			"DW", "INT", "HEX", "NAME", "SPACE", "COMMENT", "EOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00fe\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6R"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bb\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nr\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13z\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0082"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0094\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009c\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a4\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00ac\n\21\3\22\3\22\3\22\3\22\5\22\u00b2\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u00ba\n\23\3\24\3\24\3\24\3\24\5\24\u00c0"+
		"\n\24\3\25\3\25\3\25\3\25\5\25\u00c6\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00d0\n\26\3\27\3\27\3\27\3\27\5\27\u00d6\n\27\3\30\5"+
		"\30\u00d9\n\30\3\30\6\30\u00dc\n\30\r\30\16\30\u00dd\3\31\3\31\3\31\3"+
		"\31\6\31\u00e4\n\31\r\31\16\31\u00e5\3\32\6\32\u00e9\n\32\r\32\16\32\u00ea"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u00f3\n\34\f\34\16\34\u00f6\13\34"+
		"\3\34\3\34\3\35\6\35\u00fb\n\35\r\35\16\35\u00fc\2\2\36\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\7\3\2\62;\5"+
		"\2\62;CHch\7\2\60\60\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0115"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3"+
		"\2\2\2\5A\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13Q\3\2\2\2\rY\3\2\2\2\17a\3\2"+
		"\2\2\21i\3\2\2\2\23q\3\2\2\2\25y\3\2\2\2\27\u0081\3\2\2\2\31\u008b\3\2"+
		"\2\2\33\u0093\3\2\2\2\35\u009b\3\2\2\2\37\u00a3\3\2\2\2!\u00ab\3\2\2\2"+
		"#\u00b1\3\2\2\2%\u00b9\3\2\2\2\'\u00bf\3\2\2\2)\u00c5\3\2\2\2+\u00cf\3"+
		"\2\2\2-\u00d5\3\2\2\2/\u00d8\3\2\2\2\61\u00df\3\2\2\2\63\u00e8\3\2\2\2"+
		"\65\u00ec\3\2\2\2\67\u00f0\3\2\2\29\u00fa\3\2\2\2;<\7&\2\2<=\7F\2\2=>"+
		"\7C\2\2>?\7V\2\2?@\7C\2\2@\4\3\2\2\2AB\7&\2\2BC\7E\2\2CD\7Q\2\2DE\7F\2"+
		"\2EF\7G\2\2F\6\3\2\2\2GH\7<\2\2H\b\3\2\2\2IJ\7.\2\2J\n\3\2\2\2KL\7C\2"+
		"\2LM\7F\2\2MR\7F\2\2NO\7c\2\2OP\7f\2\2PR\7f\2\2QK\3\2\2\2QN\3\2\2\2R\f"+
		"\3\2\2\2ST\7K\2\2TU\7P\2\2UZ\7E\2\2VW\7k\2\2WX\7p\2\2XZ\7e\2\2YS\3\2\2"+
		"\2YV\3\2\2\2Z\16\3\2\2\2[\\\7U\2\2\\]\7W\2\2]b\7D\2\2^_\7u\2\2_`\7w\2"+
		"\2`b\7d\2\2a[\3\2\2\2a^\3\2\2\2b\20\3\2\2\2cd\7F\2\2de\7G\2\2ej\7E\2\2"+
		"fg\7f\2\2gh\7g\2\2hj\7e\2\2ic\3\2\2\2if\3\2\2\2j\22\3\2\2\2kl\7O\2\2l"+
		"m\7W\2\2mr\7N\2\2no\7o\2\2op\7w\2\2pr\7n\2\2qk\3\2\2\2qn\3\2\2\2r\24\3"+
		"\2\2\2st\7F\2\2tu\7K\2\2uz\7X\2\2vw\7f\2\2wx\7k\2\2xz\7x\2\2ys\3\2\2\2"+
		"yv\3\2\2\2z\26\3\2\2\2{|\7O\2\2|}\7Q\2\2}\u0082\7F\2\2~\177\7o\2\2\177"+
		"\u0080\7q\2\2\u0080\u0082\7f\2\2\u0081{\3\2\2\2\u0081~\3\2\2\2\u0082\30"+
		"\3\2\2\2\u0083\u0084\7R\2\2\u0084\u0085\7W\2\2\u0085\u0086\7U\2\2\u0086"+
		"\u008c\7J\2\2\u0087\u0088\7r\2\2\u0088\u0089\7w\2\2\u0089\u008a\7u\2\2"+
		"\u008a\u008c\7j\2\2\u008b\u0083\3\2\2\2\u008b\u0087\3\2\2\2\u008c\32\3"+
		"\2\2\2\u008d\u008e\7R\2\2\u008e\u008f\7Q\2\2\u008f\u0094\7R\2\2\u0090"+
		"\u0091\7r\2\2\u0091\u0092\7q\2\2\u0092\u0094\7r\2\2\u0093\u008d\3\2\2"+
		"\2\u0093\u0090\3\2\2\2\u0094\34\3\2\2\2\u0095\u0096\7E\2\2\u0096\u0097"+
		"\7O\2\2\u0097\u009c\7R\2\2\u0098\u0099\7e\2\2\u0099\u009a\7o\2\2\u009a"+
		"\u009c\7r\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c\36\3\2\2\2"+
		"\u009d\u009e\7O\2\2\u009e\u009f\7Q\2\2\u009f\u00a4\7X\2\2\u00a0\u00a1"+
		"\7o\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a4\7x\2\2\u00a3\u009d\3\2\2\2\u00a3"+
		"\u00a0\3\2\2\2\u00a4 \3\2\2\2\u00a5\u00a6\7L\2\2\u00a6\u00a7\7O\2\2\u00a7"+
		"\u00ac\7R\2\2\u00a8\u00a9\7l\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ac\7r\2\2"+
		"\u00ab\u00a5\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7"+
		"L\2\2\u00ae\u00b2\7G\2\2\u00af\u00b0\7l\2\2\u00b0\u00b2\7g\2\2\u00b1\u00ad"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7L\2\2\u00b4\u00b5"+
		"\7P\2\2\u00b5\u00ba\7G\2\2\u00b6\u00b7\7l\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"\u00ba\7g\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba&\3\2\2\2\u00bb"+
		"\u00bc\7L\2\2\u00bc\u00c0\7D\2\2\u00bd\u00be\7l\2\2\u00be\u00c0\7d\2\2"+
		"\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7"+
		"L\2\2\u00c2\u00c6\7C\2\2\u00c3\u00c4\7l\2\2\u00c4\u00c6\7c\2\2\u00c5\u00c1"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7J\2\2\u00c8\u00c9"+
		"\7C\2\2\u00c9\u00ca\7N\2\2\u00ca\u00d0\7V\2\2\u00cb\u00cc\7j\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce\u00d0\7v\2\2\u00cf\u00c7\3\2\2"+
		"\2\u00cf\u00cb\3\2\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7F\2\2\u00d2\u00d6\7"+
		"Y\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d6\7y\2\2\u00d5\u00d1\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6.\3\2\2\2\u00d7\u00d9\7/\2\2\u00d8\u00d7\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc\t\2\2\2\u00db\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\60\3\2\2\2\u00df\u00e0\7\62\2\2\u00e0\u00e1\7z\2\2\u00e1\u00e3\3\2\2"+
		"\2\u00e2\u00e4\t\3\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\62\3\2\2\2\u00e7\u00e9\t\4\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\t\5\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\b\33\2\2\u00ef\66\3\2\2\2\u00f0\u00f4\7=\2\2\u00f1\u00f3\n\6\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\b\34\2\2\u00f8"+
		"8\3\2\2\2\u00f9\u00fb\t\6\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2"+
		"\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd:\3\2\2\2\33\2QYaiqy\u0081"+
		"\u008b\u0093\u009b\u00a3\u00ab\u00b1\u00b9\u00bf\u00c5\u00cf\u00d5\u00d8"+
		"\u00dd\u00e5\u00ea\u00f4\u00fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}