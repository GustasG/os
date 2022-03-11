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
		T__0=1, T__1=2, T__2=3, T__3=4, ADD=5, SUB=6, MUL=7, DIV=8, MOD=9, PUSH=10, 
		POP=11, CMP=12, MOV=13, JMP=14, JE=15, JNE=16, JB=17, JA=18, DW=19, INT=20, 
		NAME=21, SPACE=22, COMMENT=23, EOL=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "ADD", "SUB", "MUL", "DIV", "MOD", "PUSH", 
			"POP", "CMP", "MOV", "JMP", "JE", "JNE", "JB", "JA", "DW", "INT", "NAME", 
			"SPACE", "COMMENT", "EOL"
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
			null, null, null, null, null, "ADD", "SUB", "MUL", "DIV", "MOD", "PUSH", 
			"POP", "CMP", "MOV", "JMP", "JE", "JNE", "JB", "JA", "DW", "INT", "NAME", 
			"SPACE", "COMMENT", "EOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00d6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"t\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0084"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008c\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0094\n\17\3\20\3\20\3\20\3\20\5\20\u009a\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00a2\n\21\3\22\3\22\3\22\3\22\5\22\u00a8"+
		"\n\22\3\23\3\23\3\23\3\23\5\23\u00ae\n\23\3\24\3\24\3\24\3\24\5\24\u00b4"+
		"\n\24\3\25\5\25\u00b7\n\25\3\25\3\25\7\25\u00bb\n\25\f\25\16\25\u00be"+
		"\13\25\3\26\6\26\u00c1\n\26\r\26\16\26\u00c2\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\7\30\u00cb\n\30\f\30\16\30\u00ce\13\30\3\30\3\30\3\31\6\31\u00d3"+
		"\n\31\r\31\16\31\u00d4\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\3\2\7\3\2\63;\3\2\62;\7\2\60\60\62;C\\aac|\5\2\13\f\17\17\"\"\4\2"+
		"\f\f\17\17\2\u00e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\59\3\2\2\2\7?\3\2\2\2\tA\3"+
		"\2\2\2\13I\3\2\2\2\rQ\3\2\2\2\17Y\3\2\2\2\21a\3\2\2\2\23i\3\2\2\2\25s"+
		"\3\2\2\2\27{\3\2\2\2\31\u0083\3\2\2\2\33\u008b\3\2\2\2\35\u0093\3\2\2"+
		"\2\37\u0099\3\2\2\2!\u00a1\3\2\2\2#\u00a7\3\2\2\2%\u00ad\3\2\2\2\'\u00b3"+
		"\3\2\2\2)\u00b6\3\2\2\2+\u00c0\3\2\2\2-\u00c4\3\2\2\2/\u00c8\3\2\2\2\61"+
		"\u00d2\3\2\2\2\63\64\7&\2\2\64\65\7F\2\2\65\66\7C\2\2\66\67\7V\2\2\67"+
		"8\7C\2\28\4\3\2\2\29:\7&\2\2:;\7E\2\2;<\7Q\2\2<=\7F\2\2=>\7G\2\2>\6\3"+
		"\2\2\2?@\7<\2\2@\b\3\2\2\2AB\7.\2\2B\n\3\2\2\2CD\7C\2\2DE\7F\2\2EJ\7F"+
		"\2\2FG\7c\2\2GH\7f\2\2HJ\7f\2\2IC\3\2\2\2IF\3\2\2\2J\f\3\2\2\2KL\7U\2"+
		"\2LM\7W\2\2MR\7D\2\2NO\7u\2\2OP\7w\2\2PR\7d\2\2QK\3\2\2\2QN\3\2\2\2R\16"+
		"\3\2\2\2ST\7O\2\2TU\7W\2\2UZ\7N\2\2VW\7o\2\2WX\7w\2\2XZ\7n\2\2YS\3\2\2"+
		"\2YV\3\2\2\2Z\20\3\2\2\2[\\\7F\2\2\\]\7K\2\2]b\7X\2\2^_\7f\2\2_`\7k\2"+
		"\2`b\7x\2\2a[\3\2\2\2a^\3\2\2\2b\22\3\2\2\2cd\7O\2\2de\7Q\2\2ej\7F\2\2"+
		"fg\7o\2\2gh\7q\2\2hj\7f\2\2ic\3\2\2\2if\3\2\2\2j\24\3\2\2\2kl\7R\2\2l"+
		"m\7W\2\2mn\7U\2\2nt\7J\2\2op\7r\2\2pq\7w\2\2qr\7u\2\2rt\7j\2\2sk\3\2\2"+
		"\2so\3\2\2\2t\26\3\2\2\2uv\7R\2\2vw\7Q\2\2w|\7R\2\2xy\7r\2\2yz\7q\2\2"+
		"z|\7r\2\2{u\3\2\2\2{x\3\2\2\2|\30\3\2\2\2}~\7E\2\2~\177\7O\2\2\177\u0084"+
		"\7R\2\2\u0080\u0081\7e\2\2\u0081\u0082\7o\2\2\u0082\u0084\7r\2\2\u0083"+
		"}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\32\3\2\2\2\u0085\u0086\7O\2\2\u0086"+
		"\u0087\7Q\2\2\u0087\u008c\7X\2\2\u0088\u0089\7o\2\2\u0089\u008a\7q\2\2"+
		"\u008a\u008c\7x\2\2\u008b\u0085\3\2\2\2\u008b\u0088\3\2\2\2\u008c\34\3"+
		"\2\2\2\u008d\u008e\7L\2\2\u008e\u008f\7O\2\2\u008f\u0094\7R\2\2\u0090"+
		"\u0091\7l\2\2\u0091\u0092\7o\2\2\u0092\u0094\7r\2\2\u0093\u008d\3\2\2"+
		"\2\u0093\u0090\3\2\2\2\u0094\36\3\2\2\2\u0095\u0096\7L\2\2\u0096\u009a"+
		"\7G\2\2\u0097\u0098\7l\2\2\u0098\u009a\7g\2\2\u0099\u0095\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a \3\2\2\2\u009b\u009c\7L\2\2\u009c\u009d\7P\2\2\u009d"+
		"\u00a2\7G\2\2\u009e\u009f\7l\2\2\u009f\u00a0\7p\2\2\u00a0\u00a2\7g\2\2"+
		"\u00a1\u009b\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7"+
		"L\2\2\u00a4\u00a8\7D\2\2\u00a5\u00a6\7l\2\2\u00a6\u00a8\7d\2\2\u00a7\u00a3"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7L\2\2\u00aa\u00ae"+
		"\7C\2\2\u00ab\u00ac\7l\2\2\u00ac\u00ae\7c\2\2\u00ad\u00a9\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae&\3\2\2\2\u00af\u00b0\7F\2\2\u00b0\u00b4\7Y\2\2\u00b1"+
		"\u00b2\7f\2\2\u00b2\u00b4\7y\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b4(\3\2\2\2\u00b5\u00b7\7/\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\t\2\2\2\u00b9\u00bb\t\3\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd*\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\t\4\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		",\3\2\2\2\u00c4\u00c5\t\5\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\27\2\2"+
		"\u00c7.\3\2\2\2\u00c8\u00cc\7=\2\2\u00c9\u00cb\n\6\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b\30\2\2\u00d0\60\3\2\2"+
		"\2\u00d1\u00d3\t\6\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\62\3\2\2\2\27\2IQYais{\u0083\u008b"+
		"\u0093\u0099\u00a1\u00a7\u00ad\u00b3\u00b6\u00bc\u00c2\u00cc\u00d4\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}