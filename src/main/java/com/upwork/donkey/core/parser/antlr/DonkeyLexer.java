// Generated from Donkey.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, HTTPMethodArgumentType=17, 
		HTTPMethod=18, PrimitiveType=19, CollectionType=20, StartCurlyBracket=21, 
		EndCurlyBracket=22, Identifier=23, IntConstant=24, Literal=25, LineDoc=26, 
		EmbeddedDoc=27, WS=28, COMMENT=29, LINE_COMMENT=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "HTTPMethodArgumentType", 
			"HTTPMethod", "PrimitiveType", "CollectionType", "StartCurlyBracket", 
			"EndCurlyBracket", "Identifier", "IntConstant", "Literal", "LineDoc", 
			"EmbeddedDoc", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'namespace'", "'import namespace'", "'import class'", 
			"'serviceName'", "'resource'", "';'", "'void'", "'('", "','", "')'", 
			"'default'", "'throws'", "'headerName'", "'exception'", null, null, null, 
			"'list'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "HTTPMethodArgumentType", "HTTPMethod", 
			"PrimitiveType", "CollectionType", "StartCurlyBracket", "EndCurlyBracket", 
			"Identifier", "IntConstant", "Literal", "LineDoc", "EmbeddedDoc", "WS", 
			"COMMENT", "LINE_COMMENT"
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
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0170\b\1\4\2\t"+
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
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00db"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f2\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0111"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\7\30\u011e"+
		"\n\30\f\30\16\30\u0121\13\30\3\31\5\31\u0124\n\31\3\31\6\31\u0127\n\31"+
		"\r\31\16\31\u0128\3\32\3\32\7\32\u012d\n\32\f\32\16\32\u0130\13\32\3\32"+
		"\3\32\3\32\7\32\u0135\n\32\f\32\16\32\u0138\13\32\3\32\5\32\u013b\n\32"+
		"\3\33\3\33\3\33\3\33\7\33\u0141\n\33\f\33\16\33\u0144\13\33\3\34\3\34"+
		"\7\34\u0148\n\34\f\34\16\34\u014b\13\34\3\34\3\34\3\35\6\35\u0150\n\35"+
		"\r\35\16\35\u0151\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u015a\n\36\f\36\16"+
		"\36\u015d\13\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u0168"+
		"\n\37\f\37\16\37\u016b\13\37\3\37\3\37\3\37\3\37\3\u015b\2 \3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\13"+
		"\5\2C\\aac|\b\2/\60\62;C\\^^aac|\4\2--//\3\2\62;\3\2$$\3\2))\3\2\f\f\3"+
		"\2%%\5\2\13\f\17\17\"\"\2\u0187\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2"+
		"\7C\3\2\2\2\tM\3\2\2\2\13^\3\2\2\2\rk\3\2\2\2\17w\3\2\2\2\21\u0080\3\2"+
		"\2\2\23\u0082\3\2\2\2\25\u0087\3\2\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2"+
		"\2\33\u008d\3\2\2\2\35\u0095\3\2\2\2\37\u009c\3\2\2\2!\u00a7\3\2\2\2#"+
		"\u00da\3\2\2\2%\u00f1\3\2\2\2\'\u0110\3\2\2\2)\u0112\3\2\2\2+\u0117\3"+
		"\2\2\2-\u0119\3\2\2\2/\u011b\3\2\2\2\61\u0123\3\2\2\2\63\u013a\3\2\2\2"+
		"\65\u013c\3\2\2\2\67\u0145\3\2\2\29\u014f\3\2\2\2;\u0155\3\2\2\2=\u0163"+
		"\3\2\2\2?@\7>\2\2@\4\3\2\2\2AB\7@\2\2B\6\3\2\2\2CD\7p\2\2DE\7c\2\2EF\7"+
		"o\2\2FG\7g\2\2GH\7u\2\2HI\7r\2\2IJ\7c\2\2JK\7e\2\2KL\7g\2\2L\b\3\2\2\2"+
		"MN\7k\2\2NO\7o\2\2OP\7r\2\2PQ\7q\2\2QR\7t\2\2RS\7v\2\2ST\7\"\2\2TU\7p"+
		"\2\2UV\7c\2\2VW\7o\2\2WX\7g\2\2XY\7u\2\2YZ\7r\2\2Z[\7c\2\2[\\\7e\2\2\\"+
		"]\7g\2\2]\n\3\2\2\2^_\7k\2\2_`\7o\2\2`a\7r\2\2ab\7q\2\2bc\7t\2\2cd\7v"+
		"\2\2de\7\"\2\2ef\7e\2\2fg\7n\2\2gh\7c\2\2hi\7u\2\2ij\7u\2\2j\f\3\2\2\2"+
		"kl\7u\2\2lm\7g\2\2mn\7t\2\2no\7x\2\2op\7k\2\2pq\7e\2\2qr\7g\2\2rs\7P\2"+
		"\2st\7c\2\2tu\7o\2\2uv\7g\2\2v\16\3\2\2\2wx\7t\2\2xy\7g\2\2yz\7u\2\2z"+
		"{\7q\2\2{|\7w\2\2|}\7t\2\2}~\7e\2\2~\177\7g\2\2\177\20\3\2\2\2\u0080\u0081"+
		"\7=\2\2\u0081\22\3\2\2\2\u0082\u0083\7x\2\2\u0083\u0084\7q\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7f\2\2\u0086\24\3\2\2\2\u0087\u0088\7*\2\2\u0088\26"+
		"\3\2\2\2\u0089\u008a\7.\2\2\u008a\30\3\2\2\2\u008b\u008c\7+\2\2\u008c"+
		"\32\3\2\2\2\u008d\u008e\7f\2\2\u008e\u008f\7g\2\2\u008f\u0090\7h\2\2\u0090"+
		"\u0091\7c\2\2\u0091\u0092\7w\2\2\u0092\u0093\7n\2\2\u0093\u0094\7v\2\2"+
		"\u0094\34\3\2\2\2\u0095\u0096\7v\2\2\u0096\u0097\7j\2\2\u0097\u0098\7"+
		"t\2\2\u0098\u0099\7q\2\2\u0099\u009a\7y\2\2\u009a\u009b\7u\2\2\u009b\36"+
		"\3\2\2\2\u009c\u009d\7j\2\2\u009d\u009e\7g\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7f\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7P\2\2"+
		"\u00a3\u00a4\7c\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7g\2\2\u00a6 \3\2\2"+
		"\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7z\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7s\2\2\u00b2"+
		"\u00b3\7w\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7{\2\2"+
		"\u00b6\u00b7\7R\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba"+
		"\7c\2\2\u00ba\u00db\7o\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd\7c\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7R\2\2\u00c0\u00c1\7c\2\2"+
		"\u00c1\u00c2\7t\2\2\u00c2\u00c3\7c\2\2\u00c3\u00db\7o\2\2\u00c4\u00c5"+
		"\7t\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7s\2\2\u00c7\u00c8\7w\2\2\u00c8"+
		"\u00c9\7g\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7D\2\2"+
		"\u00cc\u00cd\7q\2\2\u00cd\u00ce\7f\2\2\u00ce\u00db\7{\2\2\u00cf\u00d0"+
		"\7j\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7f\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7R\2\2\u00d6\u00d7\7c\2\2"+
		"\u00d7\u00d8\7t\2\2\u00d8\u00d9\7c\2\2\u00d9\u00db\7o\2\2\u00da\u00b1"+
		"\3\2\2\2\u00da\u00bb\3\2\2\2\u00da\u00c4\3\2\2\2\u00da\u00cf\3\2\2\2\u00db"+
		"$\3\2\2\2\u00dc\u00dd\7R\2\2\u00dd\u00de\7W\2\2\u00de\u00f2\7V\2\2\u00df"+
		"\u00e0\7I\2\2\u00e0\u00e1\7G\2\2\u00e1\u00f2\7V\2\2\u00e2\u00e3\7R\2\2"+
		"\u00e3\u00e4\7Q\2\2\u00e4\u00e5\7U\2\2\u00e5\u00f2\7V\2\2\u00e6\u00e7"+
		"\7R\2\2\u00e7\u00e8\7C\2\2\u00e8\u00e9\7V\2\2\u00e9\u00ea\7E\2\2\u00ea"+
		"\u00f2\7J\2\2\u00eb\u00ec\7F\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee\7N\2\2"+
		"\u00ee\u00ef\7G\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f2\7G\2\2\u00f1\u00dc"+
		"\3\2\2\2\u00f1\u00df\3\2\2\2\u00f1\u00e2\3\2\2\2\u00f1\u00e6\3\2\2\2\u00f1"+
		"\u00eb\3\2\2\2\u00f2&\3\2\2\2\u00f3\u00f4\7d\2\2\u00f4\u00f5\7q\2\2\u00f5"+
		"\u00f6\7q\2\2\u00f6\u0111\7n\2\2\u00f7\u00f8\7d\2\2\u00f8\u00f9\7{\2\2"+
		"\u00f9\u00fa\7v\2\2\u00fa\u0111\7g\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd"+
		"\7\63\2\2\u00fd\u0111\78\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7\65\2\2\u0100"+
		"\u0111\7\64\2\2\u0101\u0102\7k\2\2\u0102\u0103\78\2\2\u0103\u0111\7\66"+
		"\2\2\u0104\u0105\7f\2\2\u0105\u0106\7q\2\2\u0106\u0107\7w\2\2\u0107\u0108"+
		"\7d\2\2\u0108\u0109\7n\2\2\u0109\u0111\7g\2\2\u010a\u010b\7u\2\2\u010b"+
		"\u010c\7v\2\2\u010c\u010d\7t\2\2\u010d\u010e\7k\2\2\u010e\u010f\7p\2\2"+
		"\u010f\u0111\7i\2\2\u0110\u00f3\3\2\2\2\u0110\u00f7\3\2\2\2\u0110\u00fb"+
		"\3\2\2\2\u0110\u00fe\3\2\2\2\u0110\u0101\3\2\2\2\u0110\u0104\3\2\2\2\u0110"+
		"\u010a\3\2\2\2\u0111(\3\2\2\2\u0112\u0113\7n\2\2\u0113\u0114\7k\2\2\u0114"+
		"\u0115\7u\2\2\u0115\u0116\7v\2\2\u0116*\3\2\2\2\u0117\u0118\7}\2\2\u0118"+
		",\3\2\2\2\u0119\u011a\7\177\2\2\u011a.\3\2\2\2\u011b\u011f\t\2\2\2\u011c"+
		"\u011e\t\3\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\60\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124"+
		"\t\4\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0127\t\5\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\62\3\2\2\2\u012a\u012e\7$\2\2\u012b\u012d"+
		"\n\6\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u013b\7$"+
		"\2\2\u0132\u0136\7)\2\2\u0133\u0135\n\7\2\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u013b\7)\2\2\u013a\u012a\3\2\2\2\u013a"+
		"\u0132\3\2\2\2\u013b\64\3\2\2\2\u013c\u013d\7%\2\2\u013d\u013e\7%\2\2"+
		"\u013e\u0142\3\2\2\2\u013f\u0141\n\b\2\2\u0140\u013f\3\2\2\2\u0141\u0144"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\66\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0149\7%\2\2\u0146\u0148\n\t\2\2\u0147\u0146\3\2"+
		"\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7%\2\2\u014d8\3\2\2\2\u014e"+
		"\u0150\t\n\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b\35\2\2\u0154"+
		":\3\2\2\2\u0155\u0156\7\61\2\2\u0156\u0157\7,\2\2\u0157\u015b\3\2\2\2"+
		"\u0158\u015a\13\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u015f\7,\2\2\u015f\u0160\7\61\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b\36"+
		"\3\2\u0162<\3\2\2\2\u0163\u0164\7\61\2\2\u0164\u0165\7\61\2\2\u0165\u0169"+
		"\3\2\2\2\u0166\u0168\n\b\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016c\u016d\7\f\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b\37\3\2\u016f"+
		">\3\2\2\2\21\2\u00da\u00f1\u0110\u011f\u0123\u0128\u012e\u0136\u013a\u0142"+
		"\u0149\u0151\u015b\u0169\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}