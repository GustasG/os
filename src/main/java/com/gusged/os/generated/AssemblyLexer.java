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
		JA=20, HALT=21, PRINTN=22, DW=23, INT=24, HEX=25, NAME=26, SPACE=27, COMMENT=28, 
		EOL=29;
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
			"PRINTN", "DW", "INT", "HEX", "NAME", "SPACE", "COMMENT", "EOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u010e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6T\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bd\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nt\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13|\n\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0084\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008e\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0096\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u009e\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a6\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00ae\n\21\3\22\3\22\3\22\3\22\5\22\u00b4"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bc\n\23\3\24\3\24\3\24\3\24"+
		"\5\24\u00c2\n\24\3\25\3\25\3\25\3\25\5\25\u00c8\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u00d2\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e0\n\27\3\30\3\30\3\30\3\30\5\30"+
		"\u00e6\n\30\3\31\5\31\u00e9\n\31\3\31\6\31\u00ec\n\31\r\31\16\31\u00ed"+
		"\3\32\3\32\3\32\3\32\6\32\u00f4\n\32\r\32\16\32\u00f5\3\33\6\33\u00f9"+
		"\n\33\r\33\16\33\u00fa\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u0103\n\35\f"+
		"\35\16\35\u0106\13\35\3\35\3\35\3\36\6\36\u010b\n\36\r\36\16\36\u010c"+
		"\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37\3\2\7\3\2\62;\5\2\62;CHch\7\2\60\60\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\2\u0126\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5C\3\2\2\2\7I\3\2\2\2\tK\3\2"+
		"\2\2\13S\3\2\2\2\r[\3\2\2\2\17c\3\2\2\2\21k\3\2\2\2\23s\3\2\2\2\25{\3"+
		"\2\2\2\27\u0083\3\2\2\2\31\u008d\3\2\2\2\33\u0095\3\2\2\2\35\u009d\3\2"+
		"\2\2\37\u00a5\3\2\2\2!\u00ad\3\2\2\2#\u00b3\3\2\2\2%\u00bb\3\2\2\2\'\u00c1"+
		"\3\2\2\2)\u00c7\3\2\2\2+\u00d1\3\2\2\2-\u00df\3\2\2\2/\u00e5\3\2\2\2\61"+
		"\u00e8\3\2\2\2\63\u00ef\3\2\2\2\65\u00f8\3\2\2\2\67\u00fc\3\2\2\29\u0100"+
		"\3\2\2\2;\u010a\3\2\2\2=>\7&\2\2>?\7F\2\2?@\7C\2\2@A\7V\2\2AB\7C\2\2B"+
		"\4\3\2\2\2CD\7&\2\2DE\7E\2\2EF\7Q\2\2FG\7F\2\2GH\7G\2\2H\6\3\2\2\2IJ\7"+
		"<\2\2J\b\3\2\2\2KL\7.\2\2L\n\3\2\2\2MN\7C\2\2NO\7F\2\2OT\7F\2\2PQ\7c\2"+
		"\2QR\7f\2\2RT\7f\2\2SM\3\2\2\2SP\3\2\2\2T\f\3\2\2\2UV\7K\2\2VW\7P\2\2"+
		"W\\\7E\2\2XY\7k\2\2YZ\7p\2\2Z\\\7e\2\2[U\3\2\2\2[X\3\2\2\2\\\16\3\2\2"+
		"\2]^\7U\2\2^_\7W\2\2_d\7D\2\2`a\7u\2\2ab\7w\2\2bd\7d\2\2c]\3\2\2\2c`\3"+
		"\2\2\2d\20\3\2\2\2ef\7F\2\2fg\7G\2\2gl\7E\2\2hi\7f\2\2ij\7g\2\2jl\7e\2"+
		"\2ke\3\2\2\2kh\3\2\2\2l\22\3\2\2\2mn\7O\2\2no\7W\2\2ot\7N\2\2pq\7o\2\2"+
		"qr\7w\2\2rt\7n\2\2sm\3\2\2\2sp\3\2\2\2t\24\3\2\2\2uv\7F\2\2vw\7K\2\2w"+
		"|\7X\2\2xy\7f\2\2yz\7k\2\2z|\7x\2\2{u\3\2\2\2{x\3\2\2\2|\26\3\2\2\2}~"+
		"\7O\2\2~\177\7Q\2\2\177\u0084\7F\2\2\u0080\u0081\7o\2\2\u0081\u0082\7"+
		"q\2\2\u0082\u0084\7f\2\2\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\30\3"+
		"\2\2\2\u0085\u0086\7R\2\2\u0086\u0087\7W\2\2\u0087\u0088\7U\2\2\u0088"+
		"\u008e\7J\2\2\u0089\u008a\7r\2\2\u008a\u008b\7w\2\2\u008b\u008c\7u\2\2"+
		"\u008c\u008e\7j\2\2\u008d\u0085\3\2\2\2\u008d\u0089\3\2\2\2\u008e\32\3"+
		"\2\2\2\u008f\u0090\7R\2\2\u0090\u0091\7Q\2\2\u0091\u0096\7R\2\2\u0092"+
		"\u0093\7r\2\2\u0093\u0094\7q\2\2\u0094\u0096\7r\2\2\u0095\u008f\3\2\2"+
		"\2\u0095\u0092\3\2\2\2\u0096\34\3\2\2\2\u0097\u0098\7E\2\2\u0098\u0099"+
		"\7O\2\2\u0099\u009e\7R\2\2\u009a\u009b\7e\2\2\u009b\u009c\7o\2\2\u009c"+
		"\u009e\7r\2\2\u009d\u0097\3\2\2\2\u009d\u009a\3\2\2\2\u009e\36\3\2\2\2"+
		"\u009f\u00a0\7O\2\2\u00a0\u00a1\7Q\2\2\u00a1\u00a6\7X\2\2\u00a2\u00a3"+
		"\7o\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a6\7x\2\2\u00a5\u009f\3\2\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7L\2\2\u00a8\u00a9\7O\2\2\u00a9"+
		"\u00ae\7R\2\2\u00aa\u00ab\7l\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ae\7r\2\2"+
		"\u00ad\u00a7\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7"+
		"L\2\2\u00b0\u00b4\7G\2\2\u00b1\u00b2\7l\2\2\u00b2\u00b4\7g\2\2\u00b3\u00af"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7L\2\2\u00b6\u00b7"+
		"\7P\2\2\u00b7\u00bc\7G\2\2\u00b8\u00b9\7l\2\2\u00b9\u00ba\7p\2\2\u00ba"+
		"\u00bc\7g\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc&\3\2\2\2\u00bd"+
		"\u00be\7L\2\2\u00be\u00c2\7D\2\2\u00bf\u00c0\7l\2\2\u00c0\u00c2\7d\2\2"+
		"\u00c1\u00bd\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7"+
		"L\2\2\u00c4\u00c8\7C\2\2\u00c5\u00c6\7l\2\2\u00c6\u00c8\7c\2\2\u00c7\u00c3"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7J\2\2\u00ca\u00cb"+
		"\7C\2\2\u00cb\u00cc\7N\2\2\u00cc\u00d2\7V\2\2\u00cd\u00ce\7j\2\2\u00ce"+
		"\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d2\7v\2\2\u00d1\u00c9\3\2\2"+
		"\2\u00d1\u00cd\3\2\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7R\2\2\u00d4\u00d5\7"+
		"T\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7P\2\2\u00d7\u00d8\7V\2\2\u00d8\u00e0"+
		"\7P\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7k\2\2\u00dc"+
		"\u00dd\7p\2\2\u00dd\u00de\7v\2\2\u00de\u00e0\7p\2\2\u00df\u00d3\3\2\2"+
		"\2\u00df\u00d9\3\2\2\2\u00e0.\3\2\2\2\u00e1\u00e2\7F\2\2\u00e2\u00e6\7"+
		"Y\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e6\7y\2\2\u00e5\u00e1\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\60\3\2\2\2\u00e7\u00e9\7/\2\2\u00e8\u00e7\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\t\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\62\3\2\2\2\u00ef\u00f0\7\62\2\2\u00f0\u00f1\7z\2\2\u00f1\u00f3\3\2\2"+
		"\2\u00f2\u00f4\t\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\64\3\2\2\2\u00f7\u00f9\t\4\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\66\3\2\2\2\u00fc\u00fd\t\5\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff"+
		"\b\34\2\2\u00ff8\3\2\2\2\u0100\u0104\7=\2\2\u0101\u0103\n\6\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\b\35\2\2\u0108"+
		":\3\2\2\2\u0109\u010b\t\6\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d<\3\2\2\2\34\2S[cks{\u0083"+
		"\u008d\u0095\u009d\u00a5\u00ad\u00b3\u00bb\u00c1\u00c7\u00d1\u00df\u00e5"+
		"\u00e8\u00ed\u00f5\u00fa\u0104\u010c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}