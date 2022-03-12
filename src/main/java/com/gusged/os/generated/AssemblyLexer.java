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
		DW=20, INT=21, HEX=22, NAME=23, SPACE=24, COMMENT=25, EOL=26;
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
			"HEX", "NAME", "SPACE", "COMMENT", "EOL"
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
			"HEX", "NAME", "SPACE", "COMMENT", "EOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00ec\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7V\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b^\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tf\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13x\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0088\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0090"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0098\n\17\3\20\3\20\3\20\3\20"+
		"\5\20\u009e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a6\n\21\3\22\3"+
		"\22\3\22\3\22\5\22\u00ac\n\22\3\23\3\23\3\23\3\23\5\23\u00b2\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00bc\n\24\3\25\3\25\3\25\3\25"+
		"\5\25\u00c2\n\25\3\26\5\26\u00c5\n\26\3\26\3\26\7\26\u00c9\n\26\f\26\16"+
		"\26\u00cc\13\26\3\27\3\27\3\27\3\27\6\27\u00d2\n\27\r\27\16\27\u00d3\3"+
		"\30\6\30\u00d7\n\30\r\30\16\30\u00d8\3\31\3\31\3\31\3\31\3\32\3\32\7\32"+
		"\u00e1\n\32\f\32\16\32\u00e4\13\32\3\32\3\32\3\33\6\33\u00e9\n\33\r\33"+
		"\16\33\u00ea\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\3\2\b\3\2\63;\3\2\62;\5\2\62;CHch\7\2\60\60\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\4\2\f\f\17\17\2\u0101\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\3\67\3\2\2\2\5=\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13M\3\2\2\2\rU\3\2\2"+
		"\2\17]\3\2\2\2\21e\3\2\2\2\23m\3\2\2\2\25w\3\2\2\2\27\177\3\2\2\2\31\u0087"+
		"\3\2\2\2\33\u008f\3\2\2\2\35\u0097\3\2\2\2\37\u009d\3\2\2\2!\u00a5\3\2"+
		"\2\2#\u00ab\3\2\2\2%\u00b1\3\2\2\2\'\u00bb\3\2\2\2)\u00c1\3\2\2\2+\u00c4"+
		"\3\2\2\2-\u00cd\3\2\2\2/\u00d6\3\2\2\2\61\u00da\3\2\2\2\63\u00de\3\2\2"+
		"\2\65\u00e8\3\2\2\2\678\7&\2\289\7F\2\29:\7C\2\2:;\7V\2\2;<\7C\2\2<\4"+
		"\3\2\2\2=>\7&\2\2>?\7E\2\2?@\7Q\2\2@A\7F\2\2AB\7G\2\2B\6\3\2\2\2CD\7<"+
		"\2\2D\b\3\2\2\2EF\7.\2\2F\n\3\2\2\2GH\7C\2\2HI\7F\2\2IN\7F\2\2JK\7c\2"+
		"\2KL\7f\2\2LN\7f\2\2MG\3\2\2\2MJ\3\2\2\2N\f\3\2\2\2OP\7U\2\2PQ\7W\2\2"+
		"QV\7D\2\2RS\7u\2\2ST\7w\2\2TV\7d\2\2UO\3\2\2\2UR\3\2\2\2V\16\3\2\2\2W"+
		"X\7O\2\2XY\7W\2\2Y^\7N\2\2Z[\7o\2\2[\\\7w\2\2\\^\7n\2\2]W\3\2\2\2]Z\3"+
		"\2\2\2^\20\3\2\2\2_`\7F\2\2`a\7K\2\2af\7X\2\2bc\7f\2\2cd\7k\2\2df\7x\2"+
		"\2e_\3\2\2\2eb\3\2\2\2f\22\3\2\2\2gh\7O\2\2hi\7Q\2\2in\7F\2\2jk\7o\2\2"+
		"kl\7q\2\2ln\7f\2\2mg\3\2\2\2mj\3\2\2\2n\24\3\2\2\2op\7R\2\2pq\7W\2\2q"+
		"r\7U\2\2rx\7J\2\2st\7r\2\2tu\7w\2\2uv\7u\2\2vx\7j\2\2wo\3\2\2\2ws\3\2"+
		"\2\2x\26\3\2\2\2yz\7R\2\2z{\7Q\2\2{\u0080\7R\2\2|}\7r\2\2}~\7q\2\2~\u0080"+
		"\7r\2\2\177y\3\2\2\2\177|\3\2\2\2\u0080\30\3\2\2\2\u0081\u0082\7E\2\2"+
		"\u0082\u0083\7O\2\2\u0083\u0088\7R\2\2\u0084\u0085\7e\2\2\u0085\u0086"+
		"\7o\2\2\u0086\u0088\7r\2\2\u0087\u0081\3\2\2\2\u0087\u0084\3\2\2\2\u0088"+
		"\32\3\2\2\2\u0089\u008a\7O\2\2\u008a\u008b\7Q\2\2\u008b\u0090\7X\2\2\u008c"+
		"\u008d\7o\2\2\u008d\u008e\7q\2\2\u008e\u0090\7x\2\2\u008f\u0089\3\2\2"+
		"\2\u008f\u008c\3\2\2\2\u0090\34\3\2\2\2\u0091\u0092\7L\2\2\u0092\u0093"+
		"\7O\2\2\u0093\u0098\7R\2\2\u0094\u0095\7l\2\2\u0095\u0096\7o\2\2\u0096"+
		"\u0098\7r\2\2\u0097\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0098\36\3\2\2\2"+
		"\u0099\u009a\7L\2\2\u009a\u009e\7G\2\2\u009b\u009c\7l\2\2\u009c\u009e"+
		"\7g\2\2\u009d\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e \3\2\2\2\u009f\u00a0"+
		"\7L\2\2\u00a0\u00a1\7P\2\2\u00a1\u00a6\7G\2\2\u00a2\u00a3\7l\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a6\7g\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a2\3\2\2"+
		"\2\u00a6\"\3\2\2\2\u00a7\u00a8\7L\2\2\u00a8\u00ac\7D\2\2\u00a9\u00aa\7"+
		"l\2\2\u00aa\u00ac\7d\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"$\3\2\2\2\u00ad\u00ae\7L\2\2\u00ae\u00b2\7C\2\2\u00af\u00b0\7l\2\2\u00b0"+
		"\u00b2\7c\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2&\3\2\2\2\u00b3"+
		"\u00b4\7J\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6\7N\2\2\u00b6\u00bc\7V\2\2"+
		"\u00b7\u00b8\7j\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bc"+
		"\7v\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc(\3\2\2\2\u00bd\u00be"+
		"\7F\2\2\u00be\u00c2\7Y\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c2\7y\2\2\u00c1"+
		"\u00bd\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2*\3\2\2\2\u00c3\u00c5\7/\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ca\t\2"+
		"\2\2\u00c7\u00c9\t\3\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb,\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cd\u00ce\7\62\2\2\u00ce\u00cf\7z\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00d2"+
		"\t\4\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4.\3\2\2\2\u00d5\u00d7\t\5\2\2\u00d6\u00d5\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\60"+
		"\3\2\2\2\u00da\u00db\t\6\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\31\2\2"+
		"\u00dd\62\3\2\2\2\u00de\u00e2\7=\2\2\u00df\u00e1\n\7\2\2\u00e0\u00df\3"+
		"\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\b\32\2\2\u00e6\64\3\2\2"+
		"\2\u00e7\u00e9\t\7\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\66\3\2\2\2\31\2MU]emw\177\u0087\u008f"+
		"\u0097\u009d\u00a5\u00ab\u00b1\u00bb\u00c1\u00c4\u00ca\u00d3\u00d8\u00e2"+
		"\u00ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}