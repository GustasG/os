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
		T__0=1, ADD=2, SUB=3, MUL=4, DIV=5, PUSH=6, POP=7, CMP=8, JMP=9, JE=10, 
		JB=11, JA=12, INT=13, NAME=14, SPACE=15, COMMENT=16, EOL=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ADD", "SUB", "MUL", "DIV", "PUSH", "POP", "CMP", "JMP", "JE", 
			"JB", "JA", "INT", "NAME", "SPACE", "COMMENT", "EOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6F\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bX\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nh\n\n\3\13\3\13\3\13\3\13\5\13n\n\13\3\f\3\f\3\f\3\f\5\ft\n\f\3\r\3"+
		"\r\3\r\3\r\5\rz\n\r\3\16\3\16\7\16~\n\16\f\16\16\16\u0081\13\16\3\17\6"+
		"\17\u0084\n\17\r\17\16\17\u0085\3\20\3\20\3\20\3\20\3\21\3\21\7\21\u008e"+
		"\n\21\f\21\16\21\u0091\13\21\3\21\3\21\3\22\6\22\u0096\n\22\r\22\16\22"+
		"\u0097\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23\3\2\7\3\2\63;\3\2\62;\7\2\60\60\62;C\\aac|"+
		"\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00a7\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5-\3\2\2\2\7"+
		"\65\3\2\2\2\t=\3\2\2\2\13E\3\2\2\2\rO\3\2\2\2\17W\3\2\2\2\21_\3\2\2\2"+
		"\23g\3\2\2\2\25m\3\2\2\2\27s\3\2\2\2\31y\3\2\2\2\33{\3\2\2\2\35\u0083"+
		"\3\2\2\2\37\u0087\3\2\2\2!\u008b\3\2\2\2#\u0095\3\2\2\2%&\7<\2\2&\4\3"+
		"\2\2\2\'(\7C\2\2()\7F\2\2).\7F\2\2*+\7c\2\2+,\7f\2\2,.\7f\2\2-\'\3\2\2"+
		"\2-*\3\2\2\2.\6\3\2\2\2/\60\7U\2\2\60\61\7W\2\2\61\66\7D\2\2\62\63\7u"+
		"\2\2\63\64\7w\2\2\64\66\7d\2\2\65/\3\2\2\2\65\62\3\2\2\2\66\b\3\2\2\2"+
		"\678\7O\2\289\7W\2\29>\7N\2\2:;\7o\2\2;<\7w\2\2<>\7n\2\2=\67\3\2\2\2="+
		":\3\2\2\2>\n\3\2\2\2?@\7F\2\2@A\7K\2\2AF\7X\2\2BC\7f\2\2CD\7k\2\2DF\7"+
		"x\2\2E?\3\2\2\2EB\3\2\2\2F\f\3\2\2\2GH\7R\2\2HI\7W\2\2IJ\7U\2\2JP\7J\2"+
		"\2KL\7r\2\2LM\7w\2\2MN\7u\2\2NP\7j\2\2OG\3\2\2\2OK\3\2\2\2P\16\3\2\2\2"+
		"QR\7R\2\2RS\7Q\2\2SX\7R\2\2TU\7r\2\2UV\7q\2\2VX\7r\2\2WQ\3\2\2\2WT\3\2"+
		"\2\2X\20\3\2\2\2YZ\7E\2\2Z[\7O\2\2[`\7R\2\2\\]\7e\2\2]^\7o\2\2^`\7r\2"+
		"\2_Y\3\2\2\2_\\\3\2\2\2`\22\3\2\2\2ab\7L\2\2bc\7O\2\2ch\7R\2\2de\7l\2"+
		"\2ef\7o\2\2fh\7r\2\2ga\3\2\2\2gd\3\2\2\2h\24\3\2\2\2ij\7L\2\2jn\7G\2\2"+
		"kl\7l\2\2ln\7g\2\2mi\3\2\2\2mk\3\2\2\2n\26\3\2\2\2op\7L\2\2pt\7D\2\2q"+
		"r\7l\2\2rt\7d\2\2so\3\2\2\2sq\3\2\2\2t\30\3\2\2\2uv\7L\2\2vz\7C\2\2wx"+
		"\7l\2\2xz\7c\2\2yu\3\2\2\2yw\3\2\2\2z\32\3\2\2\2{\177\t\2\2\2|~\t\3\2"+
		"\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\34\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0082\u0084\t\4\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\36\3\2\2"+
		"\2\u0087\u0088\t\5\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\20\2\2\u008a"+
		" \3\2\2\2\u008b\u008f\7=\2\2\u008c\u008e\n\6\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0093\b\21\2\2\u0093\"\3\2\2\2\u0094\u0096"+
		"\t\6\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098$\3\2\2\2\22\2-\65=EOW_gmsy\177\u0085\u008f\u0097"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}