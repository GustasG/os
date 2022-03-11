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
		POP=11, CMP=12, MOV=13, JMP=14, JE=15, JNE=16, JB=17, JA=18, HALT=19, 
		DW=20, INT=21, NAME=22, SPACE=23, COMMENT=24, EOL=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "ADD", "SUB", "MUL", "DIV", "MOD", "PUSH", 
			"POP", "CMP", "MOV", "JMP", "JE", "JNE", "JB", "JA", "HALT", "DW", "INT", 
			"NAME", "SPACE", "COMMENT", "EOL"
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
			"POP", "CMP", "MOV", "JMP", "JE", "JNE", "JB", "JA", "HALT", "DW", "INT", 
			"NAME", "SPACE", "COMMENT", "EOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00e2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7T\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"d\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13v\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f~\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0086\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008e\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0096\n\17\3\20\3\20\3\20\3\20\5\20\u009c"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a4\n\21\3\22\3\22\3\22\3\22"+
		"\5\22\u00aa\n\22\3\23\3\23\3\23\3\23\5\23\u00b0\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u00ba\n\24\3\25\3\25\3\25\3\25\5\25\u00c0"+
		"\n\25\3\26\5\26\u00c3\n\26\3\26\3\26\7\26\u00c7\n\26\f\26\16\26\u00ca"+
		"\13\26\3\27\6\27\u00cd\n\27\r\27\16\27\u00ce\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\7\31\u00d7\n\31\f\31\16\31\u00da\13\31\3\31\3\31\3\32\6\32\u00df"+
		"\n\32\r\32\16\32\u00e0\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\3\2\7\3\2\63;\3\2\62;\7\2\60\60\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\4\2\f\f\17\17\2\u00f6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5;\3\2"+
		"\2\2\7A\3\2\2\2\tC\3\2\2\2\13K\3\2\2\2\rS\3\2\2\2\17[\3\2\2\2\21c\3\2"+
		"\2\2\23k\3\2\2\2\25u\3\2\2\2\27}\3\2\2\2\31\u0085\3\2\2\2\33\u008d\3\2"+
		"\2\2\35\u0095\3\2\2\2\37\u009b\3\2\2\2!\u00a3\3\2\2\2#\u00a9\3\2\2\2%"+
		"\u00af\3\2\2\2\'\u00b9\3\2\2\2)\u00bf\3\2\2\2+\u00c2\3\2\2\2-\u00cc\3"+
		"\2\2\2/\u00d0\3\2\2\2\61\u00d4\3\2\2\2\63\u00de\3\2\2\2\65\66\7&\2\2\66"+
		"\67\7F\2\2\678\7C\2\289\7V\2\29:\7C\2\2:\4\3\2\2\2;<\7&\2\2<=\7E\2\2="+
		">\7Q\2\2>?\7F\2\2?@\7G\2\2@\6\3\2\2\2AB\7<\2\2B\b\3\2\2\2CD\7.\2\2D\n"+
		"\3\2\2\2EF\7C\2\2FG\7F\2\2GL\7F\2\2HI\7c\2\2IJ\7f\2\2JL\7f\2\2KE\3\2\2"+
		"\2KH\3\2\2\2L\f\3\2\2\2MN\7U\2\2NO\7W\2\2OT\7D\2\2PQ\7u\2\2QR\7w\2\2R"+
		"T\7d\2\2SM\3\2\2\2SP\3\2\2\2T\16\3\2\2\2UV\7O\2\2VW\7W\2\2W\\\7N\2\2X"+
		"Y\7o\2\2YZ\7w\2\2Z\\\7n\2\2[U\3\2\2\2[X\3\2\2\2\\\20\3\2\2\2]^\7F\2\2"+
		"^_\7K\2\2_d\7X\2\2`a\7f\2\2ab\7k\2\2bd\7x\2\2c]\3\2\2\2c`\3\2\2\2d\22"+
		"\3\2\2\2ef\7O\2\2fg\7Q\2\2gl\7F\2\2hi\7o\2\2ij\7q\2\2jl\7f\2\2ke\3\2\2"+
		"\2kh\3\2\2\2l\24\3\2\2\2mn\7R\2\2no\7W\2\2op\7U\2\2pv\7J\2\2qr\7r\2\2"+
		"rs\7w\2\2st\7u\2\2tv\7j\2\2um\3\2\2\2uq\3\2\2\2v\26\3\2\2\2wx\7R\2\2x"+
		"y\7Q\2\2y~\7R\2\2z{\7r\2\2{|\7q\2\2|~\7r\2\2}w\3\2\2\2}z\3\2\2\2~\30\3"+
		"\2\2\2\177\u0080\7E\2\2\u0080\u0081\7O\2\2\u0081\u0086\7R\2\2\u0082\u0083"+
		"\7e\2\2\u0083\u0084\7o\2\2\u0084\u0086\7r\2\2\u0085\177\3\2\2\2\u0085"+
		"\u0082\3\2\2\2\u0086\32\3\2\2\2\u0087\u0088\7O\2\2\u0088\u0089\7Q\2\2"+
		"\u0089\u008e\7X\2\2\u008a\u008b\7o\2\2\u008b\u008c\7q\2\2\u008c\u008e"+
		"\7x\2\2\u008d\u0087\3\2\2\2\u008d\u008a\3\2\2\2\u008e\34\3\2\2\2\u008f"+
		"\u0090\7L\2\2\u0090\u0091\7O\2\2\u0091\u0096\7R\2\2\u0092\u0093\7l\2\2"+
		"\u0093\u0094\7o\2\2\u0094\u0096\7r\2\2\u0095\u008f\3\2\2\2\u0095\u0092"+
		"\3\2\2\2\u0096\36\3\2\2\2\u0097\u0098\7L\2\2\u0098\u009c\7G\2\2\u0099"+
		"\u009a\7l\2\2\u009a\u009c\7g\2\2\u009b\u0097\3\2\2\2\u009b\u0099\3\2\2"+
		"\2\u009c \3\2\2\2\u009d\u009e\7L\2\2\u009e\u009f\7P\2\2\u009f\u00a4\7"+
		"G\2\2\u00a0\u00a1\7l\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a4\7g\2\2\u00a3\u009d"+
		"\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7L\2\2\u00a6"+
		"\u00aa\7D\2\2\u00a7\u00a8\7l\2\2\u00a8\u00aa\7d\2\2\u00a9\u00a5\3\2\2"+
		"\2\u00a9\u00a7\3\2\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7L\2\2\u00ac\u00b0\7"+
		"C\2\2\u00ad\u00ae\7l\2\2\u00ae\u00b0\7c\2\2\u00af\u00ab\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7J\2\2\u00b2\u00b3\7C\2\2\u00b3"+
		"\u00b4\7N\2\2\u00b4\u00ba\7V\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7c\2\2"+
		"\u00b7\u00b8\7n\2\2\u00b8\u00ba\7v\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b5"+
		"\3\2\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7F\2\2\u00bc\u00c0\7Y\2\2\u00bd\u00be"+
		"\7f\2\2\u00be\u00c0\7y\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"*\3\2\2\2\u00c1\u00c3\7/\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c8\t\2\2\2\u00c5\u00c7\t\3\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		",\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\t\4\2\2\u00cc\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf.\3"+
		"\2\2\2\u00d0\u00d1\t\5\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\30\2\2\u00d3"+
		"\60\3\2\2\2\u00d4\u00d8\7=\2\2\u00d5\u00d7\n\6\2\2\u00d6\u00d5\3\2\2\2"+
		"\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\b\31\2\2\u00dc\62\3\2\2\2\u00dd"+
		"\u00df\t\6\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\64\3\2\2\2\30\2KS[cku}\u0085\u008d\u0095"+
		"\u009b\u00a3\u00a9\u00af\u00b9\u00bf\u00c2\u00c8\u00ce\u00d8\u00e0\3\b"+
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