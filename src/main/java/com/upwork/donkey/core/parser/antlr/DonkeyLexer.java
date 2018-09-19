// Generated from Donkey.g4 by ANTLR 4.6
package com.upwork.donkey.core.parser.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DonkeyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, HTTPMethodArgumentType=16, 
		HTTPMethod=17, PrimitiveType=18, CollectionType=19, StartCurlyBracket=20, 
		EndCurlyBracket=21, Identifier=22, IntConstant=23, Literal=24, LineDoc=25, 
		EmbeddedDoc=26, EndOfLine=27, WS=28, COMMENT=29, LINE_COMMENT=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "HTTPMethodArgumentType", 
		"HTTPMethod", "PrimitiveType", "CollectionType", "StartCurlyBracket", 
		"EndCurlyBracket", "Identifier", "IntConstant", "Literal", "LineDoc", 
		"EmbeddedDoc", "EndOfLine", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'>'", "'namespace'", "'import namespace'", "'import class'", 
		"'serviceName'", "'resource'", "';'", "'void'", "'('", "','", "')'", "'default'", 
		"'throws'", "'exception'", null, null, null, "'list'", "'{'", "'}'", null, 
		null, null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "HTTPMethodArgumentType", "HTTPMethod", "PrimitiveType", 
		"CollectionType", "StartCurlyBracket", "EndCurlyBracket", "Identifier", 
		"IntConstant", "Literal", "LineDoc", "EmbeddedDoc", "EndOfLine", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
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


	public DonkeyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Donkey.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u015c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00c5\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00dc\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00fb\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\7\27\u0108\n\27\f\27\16\27\u010b\13\27\3\30\5\30"+
		"\u010e\n\30\3\30\6\30\u0111\n\30\r\30\16\30\u0112\3\31\3\31\7\31\u0117"+
		"\n\31\f\31\16\31\u011a\13\31\3\31\3\31\3\31\7\31\u011f\n\31\f\31\16\31"+
		"\u0122\13\31\3\31\5\31\u0125\n\31\3\32\3\32\3\32\3\32\7\32\u012b\n\32"+
		"\f\32\16\32\u012e\13\32\3\33\3\33\7\33\u0132\n\33\f\33\16\33\u0135\13"+
		"\33\3\33\3\33\3\34\3\34\3\35\6\35\u013c\n\35\r\35\16\35\u013d\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\7\36\u0146\n\36\f\36\16\36\u0149\13\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u0154\n\37\f\37\16\37\u0157\13"+
		"\37\3\37\3\37\3\37\3\37\3\u0147\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\13\5\2C\\aac|\7\2/\60\62;C"+
		"\\aac|\4\2--//\3\2\62;\3\2$$\3\2))\3\2\f\f\3\2%%\5\2\13\f\17\17\"\"\u0172"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tM\3\2\2\2\13^\3\2"+
		"\2\2\rk\3\2\2\2\17w\3\2\2\2\21\u0080\3\2\2\2\23\u0082\3\2\2\2\25\u0087"+
		"\3\2\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2\2\33\u008d\3\2\2\2\35\u0095\3"+
		"\2\2\2\37\u009c\3\2\2\2!\u00c4\3\2\2\2#\u00db\3\2\2\2%\u00fa\3\2\2\2\'"+
		"\u00fc\3\2\2\2)\u0101\3\2\2\2+\u0103\3\2\2\2-\u0105\3\2\2\2/\u010d\3\2"+
		"\2\2\61\u0124\3\2\2\2\63\u0126\3\2\2\2\65\u012f\3\2\2\2\67\u0138\3\2\2"+
		"\29\u013b\3\2\2\2;\u0141\3\2\2\2=\u014f\3\2\2\2?@\7>\2\2@\4\3\2\2\2AB"+
		"\7@\2\2B\6\3\2\2\2CD\7p\2\2DE\7c\2\2EF\7o\2\2FG\7g\2\2GH\7u\2\2HI\7r\2"+
		"\2IJ\7c\2\2JK\7e\2\2KL\7g\2\2L\b\3\2\2\2MN\7k\2\2NO\7o\2\2OP\7r\2\2PQ"+
		"\7q\2\2QR\7t\2\2RS\7v\2\2ST\7\"\2\2TU\7p\2\2UV\7c\2\2VW\7o\2\2WX\7g\2"+
		"\2XY\7u\2\2YZ\7r\2\2Z[\7c\2\2[\\\7e\2\2\\]\7g\2\2]\n\3\2\2\2^_\7k\2\2"+
		"_`\7o\2\2`a\7r\2\2ab\7q\2\2bc\7t\2\2cd\7v\2\2de\7\"\2\2ef\7e\2\2fg\7n"+
		"\2\2gh\7c\2\2hi\7u\2\2ij\7u\2\2j\f\3\2\2\2kl\7u\2\2lm\7g\2\2mn\7t\2\2"+
		"no\7x\2\2op\7k\2\2pq\7e\2\2qr\7g\2\2rs\7P\2\2st\7c\2\2tu\7o\2\2uv\7g\2"+
		"\2v\16\3\2\2\2wx\7t\2\2xy\7g\2\2yz\7u\2\2z{\7q\2\2{|\7w\2\2|}\7t\2\2}"+
		"~\7e\2\2~\177\7g\2\2\177\20\3\2\2\2\u0080\u0081\7=\2\2\u0081\22\3\2\2"+
		"\2\u0082\u0083\7x\2\2\u0083\u0084\7q\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7f\2\2\u0086\24\3\2\2\2\u0087\u0088\7*\2\2\u0088\26\3\2\2\2\u0089\u008a"+
		"\7.\2\2\u008a\30\3\2\2\2\u008b\u008c\7+\2\2\u008c\32\3\2\2\2\u008d\u008e"+
		"\7f\2\2\u008e\u008f\7g\2\2\u008f\u0090\7h\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7w\2\2\u0092\u0093\7n\2\2\u0093\u0094\7v\2\2\u0094\34\3\2\2\2\u0095"+
		"\u0096\7v\2\2\u0096\u0097\7j\2\2\u0097\u0098\7t\2\2\u0098\u0099\7q\2\2"+
		"\u0099\u009a\7y\2\2\u009a\u009b\7u\2\2\u009b\36\3\2\2\2\u009c\u009d\7"+
		"g\2\2\u009d\u009e\7z\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1"+
		"\7r\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\u00a5\7p\2\2\u00a5 \3\2\2\2\u00a6\u00a7\7s\2\2\u00a7\u00a8\7w\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7{\2\2\u00ab\u00ac\7R\2\2"+
		"\u00ac\u00ad\7c\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7c\2\2\u00af\u00c5"+
		"\7o\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7j\2\2\u00b4\u00b5\7R\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7t\2\2"+
		"\u00b7\u00b8\7c\2\2\u00b8\u00c5\7o\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb"+
		"\7g\2\2\u00bb\u00bc\7s\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\u00bf\7u\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7D\2\2\u00c1\u00c2\7q\2\2"+
		"\u00c2\u00c3\7f\2\2\u00c3\u00c5\7{\2\2\u00c4\u00a6\3\2\2\2\u00c4\u00b0"+
		"\3\2\2\2\u00c4\u00b9\3\2\2\2\u00c5\"\3\2\2\2\u00c6\u00c7\7R\2\2\u00c7"+
		"\u00c8\7W\2\2\u00c8\u00dc\7V\2\2\u00c9\u00ca\7I\2\2\u00ca\u00cb\7G\2\2"+
		"\u00cb\u00dc\7V\2\2\u00cc\u00cd\7R\2\2\u00cd\u00ce\7Q\2\2\u00ce\u00cf"+
		"\7U\2\2\u00cf\u00dc\7V\2\2\u00d0\u00d1\7R\2\2\u00d1\u00d2\7C\2\2\u00d2"+
		"\u00d3\7V\2\2\u00d3\u00d4\7E\2\2\u00d4\u00dc\7J\2\2\u00d5\u00d6\7F\2\2"+
		"\u00d6\u00d7\7G\2\2\u00d7\u00d8\7N\2\2\u00d8\u00d9\7G\2\2\u00d9\u00da"+
		"\7V\2\2\u00da\u00dc\7G\2\2\u00db\u00c6\3\2\2\2\u00db\u00c9\3\2\2\2\u00db"+
		"\u00cc\3\2\2\2\u00db\u00d0\3\2\2\2\u00db\u00d5\3\2\2\2\u00dc$\3\2\2\2"+
		"\u00dd\u00de\7d\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7q\2\2\u00e0\u00fb"+
		"\7n\2\2\u00e1\u00e2\7d\2\2\u00e2\u00e3\7{\2\2\u00e3\u00e4\7v\2\2\u00e4"+
		"\u00fb\7g\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7\63\2\2\u00e7\u00fb\78\2"+
		"\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7\65\2\2\u00ea\u00fb\7\64\2\2\u00eb"+
		"\u00ec\7k\2\2\u00ec\u00ed\78\2\2\u00ed\u00fb\7\66\2\2\u00ee\u00ef\7f\2"+
		"\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3"+
		"\7n\2\2\u00f3\u00fb\7g\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7v\2\2\u00f6"+
		"\u00f7\7t\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fb\7i\2\2"+
		"\u00fa\u00dd\3\2\2\2\u00fa\u00e1\3\2\2\2\u00fa\u00e5\3\2\2\2\u00fa\u00e8"+
		"\3\2\2\2\u00fa\u00eb\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fb"+
		"&\3\2\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7u\2\2\u00ff"+
		"\u0100\7v\2\2\u0100(\3\2\2\2\u0101\u0102\7}\2\2\u0102*\3\2\2\2\u0103\u0104"+
		"\7\177\2\2\u0104,\3\2\2\2\u0105\u0109\t\2\2\2\u0106\u0108\t\3\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a.\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\t\4\2\2\u010d\u010c"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0111\t\5\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\60\3\2\2\2\u0114\u0118\7$\2\2\u0115\u0117\n\6\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0125\7$\2\2\u011c\u0120\7)\2"+
		"\2\u011d\u011f\n\7\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0125\7)\2\2\u0124\u0114\3\2\2\2\u0124\u011c\3\2\2\2\u0125\62\3\2\2\2"+
		"\u0126\u0127\7%\2\2\u0127\u0128\7%\2\2\u0128\u012c\3\2\2\2\u0129\u012b"+
		"\n\b\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\64\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0133\7%\2\2"+
		"\u0130\u0132\n\t\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0137\7%\2\2\u0137\66\3\2\2\2\u0138\u0139\7\f\2\2\u01398\3\2\2\2\u013a"+
		"\u013c\t\n\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b\35\2\2\u0140"+
		":\3\2\2\2\u0141\u0142\7\61\2\2\u0142\u0143\7,\2\2\u0143\u0147\3\2\2\2"+
		"\u0144\u0146\13\2\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014b\7,\2\2\u014b\u014c\7\61\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b\36"+
		"\3\2\u014e<\3\2\2\2\u014f\u0150\7\61\2\2\u0150\u0151\7\61\2\2\u0151\u0155"+
		"\3\2\2\2\u0152\u0154\n\b\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0158\u0159\7\f\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b\37\3\2\u015b"+
		">\3\2\2\2\21\2\u00c4\u00db\u00fa\u0109\u010d\u0112\u0118\u0120\u0124\u012c"+
		"\u0133\u013d\u0147\u0155\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}