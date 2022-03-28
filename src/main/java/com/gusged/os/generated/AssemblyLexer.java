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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u011c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6V\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bf\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\nv\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0086\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0090\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0098\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00a0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a8\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00b0\n\21\3\22\3\22\3\22\3\22\5\22\u00b6"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00be\n\23\3\24\3\24\3\24\3\24"+
		"\5\24\u00c4\n\24\3\25\3\25\3\25\3\25\5\25\u00ca\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u00d4\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e2\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00ee\n\30\3\31\3\31\3\31\3\31\5\31\u00f4"+
		"\n\31\3\32\5\32\u00f7\n\32\3\32\6\32\u00fa\n\32\r\32\16\32\u00fb\3\33"+
		"\3\33\3\33\3\33\6\33\u0102\n\33\r\33\16\33\u0103\3\34\6\34\u0107\n\34"+
		"\r\34\16\34\u0108\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u0111\n\36\f\36\16"+
		"\36\u0114\13\36\3\36\3\36\3\37\6\37\u0119\n\37\r\37\16\37\u011a\2\2 \3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" \3\2\7\3\2\62;\5\2\62;CHch\7\2\60\60\62;C\\aac|\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\2\u0135\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5E\3\2\2\2\7K\3\2\2\2"+
		"\tM\3\2\2\2\13U\3\2\2\2\r]\3\2\2\2\17e\3\2\2\2\21m\3\2\2\2\23u\3\2\2\2"+
		"\25}\3\2\2\2\27\u0085\3\2\2\2\31\u008f\3\2\2\2\33\u0097\3\2\2\2\35\u009f"+
		"\3\2\2\2\37\u00a7\3\2\2\2!\u00af\3\2\2\2#\u00b5\3\2\2\2%\u00bd\3\2\2\2"+
		"\'\u00c3\3\2\2\2)\u00c9\3\2\2\2+\u00d3\3\2\2\2-\u00e1\3\2\2\2/\u00ed\3"+
		"\2\2\2\61\u00f3\3\2\2\2\63\u00f6\3\2\2\2\65\u00fd\3\2\2\2\67\u0106\3\2"+
		"\2\29\u010a\3\2\2\2;\u010e\3\2\2\2=\u0118\3\2\2\2?@\7&\2\2@A\7F\2\2AB"+
		"\7C\2\2BC\7V\2\2CD\7C\2\2D\4\3\2\2\2EF\7&\2\2FG\7E\2\2GH\7Q\2\2HI\7F\2"+
		"\2IJ\7G\2\2J\6\3\2\2\2KL\7<\2\2L\b\3\2\2\2MN\7.\2\2N\n\3\2\2\2OP\7C\2"+
		"\2PQ\7F\2\2QV\7F\2\2RS\7c\2\2ST\7f\2\2TV\7f\2\2UO\3\2\2\2UR\3\2\2\2V\f"+
		"\3\2\2\2WX\7K\2\2XY\7P\2\2Y^\7E\2\2Z[\7k\2\2[\\\7p\2\2\\^\7e\2\2]W\3\2"+
		"\2\2]Z\3\2\2\2^\16\3\2\2\2_`\7U\2\2`a\7W\2\2af\7D\2\2bc\7u\2\2cd\7w\2"+
		"\2df\7d\2\2e_\3\2\2\2eb\3\2\2\2f\20\3\2\2\2gh\7F\2\2hi\7G\2\2in\7E\2\2"+
		"jk\7f\2\2kl\7g\2\2ln\7e\2\2mg\3\2\2\2mj\3\2\2\2n\22\3\2\2\2op\7O\2\2p"+
		"q\7W\2\2qv\7N\2\2rs\7o\2\2st\7w\2\2tv\7n\2\2uo\3\2\2\2ur\3\2\2\2v\24\3"+
		"\2\2\2wx\7F\2\2xy\7K\2\2y~\7X\2\2z{\7f\2\2{|\7k\2\2|~\7x\2\2}w\3\2\2\2"+
		"}z\3\2\2\2~\26\3\2\2\2\177\u0080\7O\2\2\u0080\u0081\7Q\2\2\u0081\u0086"+
		"\7F\2\2\u0082\u0083\7o\2\2\u0083\u0084\7q\2\2\u0084\u0086\7f\2\2\u0085"+
		"\177\3\2\2\2\u0085\u0082\3\2\2\2\u0086\30\3\2\2\2\u0087\u0088\7R\2\2\u0088"+
		"\u0089\7W\2\2\u0089\u008a\7U\2\2\u008a\u0090\7J\2\2\u008b\u008c\7r\2\2"+
		"\u008c\u008d\7w\2\2\u008d\u008e\7u\2\2\u008e\u0090\7j\2\2\u008f\u0087"+
		"\3\2\2\2\u008f\u008b\3\2\2\2\u0090\32\3\2\2\2\u0091\u0092\7R\2\2\u0092"+
		"\u0093\7Q\2\2\u0093\u0098\7R\2\2\u0094\u0095\7r\2\2\u0095\u0096\7q\2\2"+
		"\u0096\u0098\7r\2\2\u0097\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0098\34\3"+
		"\2\2\2\u0099\u009a\7E\2\2\u009a\u009b\7O\2\2\u009b\u00a0\7R\2\2\u009c"+
		"\u009d\7e\2\2\u009d\u009e\7o\2\2\u009e\u00a0\7r\2\2\u009f\u0099\3\2\2"+
		"\2\u009f\u009c\3\2\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7O\2\2\u00a2\u00a3"+
		"\7Q\2\2\u00a3\u00a8\7X\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7q\2\2\u00a6"+
		"\u00a8\7x\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8 \3\2\2\2\u00a9"+
		"\u00aa\7L\2\2\u00aa\u00ab\7O\2\2\u00ab\u00b0\7R\2\2\u00ac\u00ad\7l\2\2"+
		"\u00ad\u00ae\7o\2\2\u00ae\u00b0\7r\2\2\u00af\u00a9\3\2\2\2\u00af\u00ac"+
		"\3\2\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7L\2\2\u00b2\u00b6\7G\2\2\u00b3\u00b4"+
		"\7l\2\2\u00b4\u00b6\7g\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"$\3\2\2\2\u00b7\u00b8\7L\2\2\u00b8\u00b9\7P\2\2\u00b9\u00be\7G\2\2\u00ba"+
		"\u00bb\7l\2\2\u00bb\u00bc\7p\2\2\u00bc\u00be\7g\2\2\u00bd\u00b7\3\2\2"+
		"\2\u00bd\u00ba\3\2\2\2\u00be&\3\2\2\2\u00bf\u00c0\7L\2\2\u00c0\u00c4\7"+
		"D\2\2\u00c1\u00c2\7l\2\2\u00c2\u00c4\7d\2\2\u00c3\u00bf\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4(\3\2\2\2\u00c5\u00c6\7L\2\2\u00c6\u00ca\7C\2\2\u00c7"+
		"\u00c8\7l\2\2\u00c8\u00ca\7c\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7\3\2\2"+
		"\2\u00ca*\3\2\2\2\u00cb\u00cc\7J\2\2\u00cc\u00cd\7C\2\2\u00cd\u00ce\7"+
		"N\2\2\u00ce\u00d4\7V\2\2\u00cf\u00d0\7j\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2"+
		"\7n\2\2\u00d2\u00d4\7v\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4"+
		",\3\2\2\2\u00d5\u00d6\7R\2\2\u00d6\u00d7\7T\2\2\u00d7\u00d8\7K\2\2\u00d8"+
		"\u00d9\7P\2\2\u00d9\u00da\7V\2\2\u00da\u00e2\7P\2\2\u00db\u00dc\7r\2\2"+
		"\u00dc\u00dd\7t\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7p\2\2\u00df\u00e0"+
		"\7v\2\2\u00e0\u00e2\7p\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00db\3\2\2\2\u00e2"+
		".\3\2\2\2\u00e3\u00e4\7U\2\2\u00e4\u00e5\7E\2\2\u00e5\u00e6\7C\2\2\u00e6"+
		"\u00e7\7P\2\2\u00e7\u00ee\7P\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7e\2\2"+
		"\u00ea\u00eb\7c\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ee\7p\2\2\u00ed\u00e3"+
		"\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7F\2\2\u00f0"+
		"\u00f4\7Y\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f4\7y\2\2\u00f3\u00ef\3\2\2"+
		"\2\u00f3\u00f1\3\2\2\2\u00f4\62\3\2\2\2\u00f5\u00f7\7/\2\2\u00f6\u00f5"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00fa\t\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\64\3\2\2\2\u00fd\u00fe\7\62\2\2\u00fe\u00ff\7z\2\2\u00ff\u0101"+
		"\3\2\2\2\u0100\u0102\t\3\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\66\3\2\2\2\u0105\u0107\t\4\2"+
		"\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u01098\3\2\2\2\u010a\u010b\t\5\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\b\35\2\2\u010d:\3\2\2\2\u010e\u0112\7=\2\2\u010f\u0111\n\6\2\2"+
		"\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\b\36\2\2"+
		"\u0116<\3\2\2\2\u0117\u0119\t\6\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3"+
		"\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b>\3\2\2\2\35\2U]e"+
		"mu}\u0085\u008f\u0097\u009f\u00a7\u00af\u00b5\u00bd\u00c3\u00c9\u00d3"+
		"\u00e1\u00ed\u00f3\u00f6\u00fb\u0103\u0108\u0112\u011a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}