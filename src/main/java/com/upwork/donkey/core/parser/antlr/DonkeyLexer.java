// Generated from Donkey.g4 by ANTLR 4.6
package com.upwork.donkey.core.parser.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DonkeyLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, HTTPMethodArgumentType = 16,
            HTTPMethod = 17, PrimitiveType = 18, CollectionType = 19, StartCurlyBracket = 20,
            EndCurlyBracket = 21, Identifier = 22, IntConstant = 23, Literal = 24, LineDoc = 25,
            EmbeddedDoc = 26, WS = 27, COMMENT = 28, LINE_COMMENT = 29;
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
            "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "HTTPMethodArgumentType",
            "HTTPMethod", "PrimitiveType", "CollectionType", "StartCurlyBracket",
            "EndCurlyBracket", "Identifier", "IntConstant", "Literal", "LineDoc",
            "EmbeddedDoc", "WS", "COMMENT", "LINE_COMMENT"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'<'", "'>'", "'namespace'", "'import namespace'", "'import class'",
            "'serviceName'", "'resource'", "';'", "'void'", "'('", "','", "')'", "'default'",
            "'throws'", "'exception'", null, null, null, "'list'", "'{'", "'}'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, "HTTPMethodArgumentType", "HTTPMethod", "PrimitiveType",
            "CollectionType", "StartCurlyBracket", "EndCurlyBracket", "Identifier",
            "IntConstant", "Literal", "LineDoc", "EmbeddedDoc", "WS", "COMMENT", "LINE_COMMENT"
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
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "Donkey.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u0158\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3" +
                    "\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
                    "\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" +
                    "\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13" +
                    "\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17" +
                    "\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
                    "\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\3\21\5\21\u00c3\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22" +
                    "\u00da\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23" +
                    "\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23" +
                    "\3\23\3\23\3\23\5\23\u00f9\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26" +
                    "\3\26\3\27\3\27\7\27\u0106\n\27\f\27\16\27\u0109\13\27\3\30\5\30\u010c" +
                    "\n\30\3\30\6\30\u010f\n\30\r\30\16\30\u0110\3\31\3\31\7\31\u0115\n\31" +
                    "\f\31\16\31\u0118\13\31\3\31\3\31\3\31\7\31\u011d\n\31\f\31\16\31\u0120" +
                    "\13\31\3\31\5\31\u0123\n\31\3\32\3\32\3\32\3\32\7\32\u0129\n\32\f\32\16" +
                    "\32\u012c\13\32\3\33\3\33\7\33\u0130\n\33\f\33\16\33\u0133\13\33\3\33" +
                    "\3\33\3\34\6\34\u0138\n\34\r\34\16\34\u0139\3\34\3\34\3\35\3\35\3\35\3" +
                    "\35\7\35\u0142\n\35\f\35\16\35\u0145\13\35\3\35\3\35\3\35\3\35\3\35\3" +
                    "\36\3\36\3\36\3\36\7\36\u0150\n\36\f\36\16\36\u0153\13\36\3\36\3\36\3" +
                    "\36\3\36\3\u0143\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27" +
                    "\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33" +
                    "\65\34\67\359\36;\37\3\2\13\5\2C\\aac|\7\2/\60\62;C\\aac|\4\2--//\3\2" +
                    "\62;\3\2$$\3\2))\3\2\f\f\3\2%%\5\2\13\f\17\17\"\"\u016e\2\3\3\2\2\2\2" +
                    "\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2" +
                    "\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2" +
                    "\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2" +
                    "\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2" +
                    "\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2" +
                    "\2\5?\3\2\2\2\7A\3\2\2\2\tK\3\2\2\2\13\\\3\2\2\2\ri\3\2\2\2\17u\3\2\2" +
                    "\2\21~\3\2\2\2\23\u0080\3\2\2\2\25\u0085\3\2\2\2\27\u0087\3\2\2\2\31\u0089" +
                    "\3\2\2\2\33\u008b\3\2\2\2\35\u0093\3\2\2\2\37\u009a\3\2\2\2!\u00c2\3\2" +
                    "\2\2#\u00d9\3\2\2\2%\u00f8\3\2\2\2\'\u00fa\3\2\2\2)\u00ff\3\2\2\2+\u0101" +
                    "\3\2\2\2-\u0103\3\2\2\2/\u010b\3\2\2\2\61\u0122\3\2\2\2\63\u0124\3\2\2" +
                    "\2\65\u012d\3\2\2\2\67\u0137\3\2\2\29\u013d\3\2\2\2;\u014b\3\2\2\2=>\7" +
                    ">\2\2>\4\3\2\2\2?@\7@\2\2@\6\3\2\2\2AB\7p\2\2BC\7c\2\2CD\7o\2\2DE\7g\2" +
                    "\2EF\7u\2\2FG\7r\2\2GH\7c\2\2HI\7e\2\2IJ\7g\2\2J\b\3\2\2\2KL\7k\2\2LM" +
                    "\7o\2\2MN\7r\2\2NO\7q\2\2OP\7t\2\2PQ\7v\2\2QR\7\"\2\2RS\7p\2\2ST\7c\2" +
                    "\2TU\7o\2\2UV\7g\2\2VW\7u\2\2WX\7r\2\2XY\7c\2\2YZ\7e\2\2Z[\7g\2\2[\n\3" +
                    "\2\2\2\\]\7k\2\2]^\7o\2\2^_\7r\2\2_`\7q\2\2`a\7t\2\2ab\7v\2\2bc\7\"\2" +
                    "\2cd\7e\2\2de\7n\2\2ef\7c\2\2fg\7u\2\2gh\7u\2\2h\f\3\2\2\2ij\7u\2\2jk" +
                    "\7g\2\2kl\7t\2\2lm\7x\2\2mn\7k\2\2no\7e\2\2op\7g\2\2pq\7P\2\2qr\7c\2\2" +
                    "rs\7o\2\2st\7g\2\2t\16\3\2\2\2uv\7t\2\2vw\7g\2\2wx\7u\2\2xy\7q\2\2yz\7" +
                    "w\2\2z{\7t\2\2{|\7e\2\2|}\7g\2\2}\20\3\2\2\2~\177\7=\2\2\177\22\3\2\2" +
                    "\2\u0080\u0081\7x\2\2\u0081\u0082\7q\2\2\u0082\u0083\7k\2\2\u0083\u0084" +
                    "\7f\2\2\u0084\24\3\2\2\2\u0085\u0086\7*\2\2\u0086\26\3\2\2\2\u0087\u0088" +
                    "\7.\2\2\u0088\30\3\2\2\2\u0089\u008a\7+\2\2\u008a\32\3\2\2\2\u008b\u008c" +
                    "\7f\2\2\u008c\u008d\7g\2\2\u008d\u008e\7h\2\2\u008e\u008f\7c\2\2\u008f" +
                    "\u0090\7w\2\2\u0090\u0091\7n\2\2\u0091\u0092\7v\2\2\u0092\34\3\2\2\2\u0093" +
                    "\u0094\7v\2\2\u0094\u0095\7j\2\2\u0095\u0096\7t\2\2\u0096\u0097\7q\2\2" +
                    "\u0097\u0098\7y\2\2\u0098\u0099\7u\2\2\u0099\36\3\2\2\2\u009a\u009b\7" +
                    "g\2\2\u009b\u009c\7z\2\2\u009c\u009d\7e\2\2\u009d\u009e\7g\2\2\u009e\u009f" +
                    "\7r\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7q\2\2\u00a2" +
                    "\u00a3\7p\2\2\u00a3 \3\2\2\2\u00a4\u00a5\7s\2\2\u00a5\u00a6\7w\2\2\u00a6" +
                    "\u00a7\7g\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7{\2\2\u00a9\u00aa\7R\2\2" +
                    "\u00aa\u00ab\7c\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7c\2\2\u00ad\u00c3" +
                    "\7o\2\2\u00ae\u00af\7r\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1" +
                    "\u00b2\7j\2\2\u00b2\u00b3\7R\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7t\2\2" +
                    "\u00b5\u00b6\7c\2\2\u00b6\u00c3\7o\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9" +
                    "\7g\2\2\u00b9\u00ba\7s\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7g\2\2\u00bc" +
                    "\u00bd\7u\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7D\2\2\u00bf\u00c0\7q\2\2" +
                    "\u00c0\u00c1\7f\2\2\u00c1\u00c3\7{\2\2\u00c2\u00a4\3\2\2\2\u00c2\u00ae" +
                    "\3\2\2\2\u00c2\u00b7\3\2\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7R\2\2\u00c5" +
                    "\u00c6\7W\2\2\u00c6\u00da\7V\2\2\u00c7\u00c8\7I\2\2\u00c8\u00c9\7G\2\2" +
                    "\u00c9\u00da\7V\2\2\u00ca\u00cb\7R\2\2\u00cb\u00cc\7Q\2\2\u00cc\u00cd" +
                    "\7U\2\2\u00cd\u00da\7V\2\2\u00ce\u00cf\7R\2\2\u00cf\u00d0\7C\2\2\u00d0" +
                    "\u00d1\7V\2\2\u00d1\u00d2\7E\2\2\u00d2\u00da\7J\2\2\u00d3\u00d4\7F\2\2" +
                    "\u00d4\u00d5\7G\2\2\u00d5\u00d6\7N\2\2\u00d6\u00d7\7G\2\2\u00d7\u00d8" +
                    "\7V\2\2\u00d8\u00da\7G\2\2\u00d9\u00c4\3\2\2\2\u00d9\u00c7\3\2\2\2\u00d9" +
                    "\u00ca\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00d3\3\2\2\2\u00da$\3\2\2\2" +
                    "\u00db\u00dc\7d\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7q\2\2\u00de\u00f9" +
                    "\7n\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7{\2\2\u00e1\u00e2\7v\2\2\u00e2" +
                    "\u00f9\7g\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7\63\2\2\u00e5\u00f9\78\2" +
                    "\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7\65\2\2\u00e8\u00f9\7\64\2\2\u00e9" +
                    "\u00ea\7k\2\2\u00ea\u00eb\78\2\2\u00eb\u00f9\7\66\2\2\u00ec\u00ed\7f\2" +
                    "\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7d\2\2\u00f0\u00f1" +
                    "\7n\2\2\u00f1\u00f9\7g\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7v\2\2\u00f4" +
                    "\u00f5\7t\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f9\7i\2\2" +
                    "\u00f8\u00db\3\2\2\2\u00f8\u00df\3\2\2\2\u00f8\u00e3\3\2\2\2\u00f8\u00e6" +
                    "\3\2\2\2\u00f8\u00e9\3\2\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f9" +
                    "&\3\2\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7u\2\2\u00fd" +
                    "\u00fe\7v\2\2\u00fe(\3\2\2\2\u00ff\u0100\7}\2\2\u0100*\3\2\2\2\u0101\u0102" +
                    "\7\177\2\2\u0102,\3\2\2\2\u0103\u0107\t\2\2\2\u0104\u0106\t\3\2\2\u0105" +
                    "\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2" +
                    "\2\2\u0108.\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\t\4\2\2\u010b\u010a" +
                    "\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010f\t\5\2\2\u010e" +
                    "\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2" +
                    "\2\2\u0111\60\3\2\2\2\u0112\u0116\7$\2\2\u0113\u0115\n\6\2\2\u0114\u0113" +
                    "\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117" +
                    "\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u0123\7$\2\2\u011a\u011e\7)\2" +
                    "\2\u011b\u011d\n\7\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c" +
                    "\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121" +
                    "\u0123\7)\2\2\u0122\u0112\3\2\2\2\u0122\u011a\3\2\2\2\u0123\62\3\2\2\2" +
                    "\u0124\u0125\7%\2\2\u0125\u0126\7%\2\2\u0126\u012a\3\2\2\2\u0127\u0129" +
                    "\n\b\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a" +
                    "\u012b\3\2\2\2\u012b\64\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0131\7%\2\2" +
                    "\u012e\u0130\n\t\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f" +
                    "\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134" +
                    "\u0135\7%\2\2\u0135\66\3\2\2\2\u0136\u0138\t\n\2\2\u0137\u0136\3\2\2\2" +
                    "\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b" +
                    "\3\2\2\2\u013b\u013c\b\34\2\2\u013c8\3\2\2\2\u013d\u013e\7\61\2\2\u013e" +
                    "\u013f\7,\2\2\u013f\u0143\3\2\2\2\u0140\u0142\13\2\2\2\u0141\u0140\3\2" +
                    "\2\2\u0142\u0145\3\2\2\2\u0143\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144" +
                    "\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7,\2\2\u0147\u0148\7\61" +
                    "\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b\35\3\2\u014a:\3\2\2\2\u014b\u014c" +
                    "\7\61\2\2\u014c\u014d\7\61\2\2\u014d\u0151\3\2\2\2\u014e\u0150\n\b\2\2" +
                    "\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152" +
                    "\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\f\2\2\u0155" +
                    "\u0156\3\2\2\2\u0156\u0157\b\36\3\2\u0157<\3\2\2\2\21\2\u00c2\u00d9\u00f8" +
                    "\u0107\u010b\u0110\u0116\u011e\u0122\u012a\u0131\u0139\u0143\u0151\4\b" +
                    "\2\2\2\3\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}