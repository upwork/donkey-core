// Generated from Donkey.g4 by ANTLR 4.6
package com.upwork.donkey.core.parser.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DonkeyParser extends Parser {
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
    public static final int
            RULE_document = 0, RULE_definition = 1, RULE_singularTypeReference = 2,
            RULE_collectionTypeReference = 3, RULE_methodArgumentTypeReference = 4,
            RULE_namespace = 5, RULE_namespaceImport = 6, RULE_classImport = 7, RULE_language = 8,
            RULE_namespaceName = 9, RULE_className = 10, RULE_serviceName = 11, RULE_resource = 12,
            RULE_resourceDefaultUrl = 13, RULE_methodDef = 14, RULE_methodUrl = 15,
            RULE_methodReturnType = 16, RULE_methodSignature = 17, RULE_methodArgument = 18,
            RULE_defaultValue = 19, RULE_methodThrows = 20, RULE_resourceDoc = 21,
            RULE_methodDoc = 22, RULE_methodReturnDoc = 23, RULE_methodArgumentDoc = 24,
            RULE_exception = 25, RULE_exceptionStatus = 26;
    public static final String[] ruleNames = {
            "document", "definition", "singularTypeReference", "collectionTypeReference",
            "methodArgumentTypeReference", "namespace", "namespaceImport", "classImport",
            "language", "namespaceName", "className", "serviceName", "resource", "resourceDefaultUrl",
            "methodDef", "methodUrl", "methodReturnType", "methodSignature", "methodArgument",
            "defaultValue", "methodThrows", "resourceDoc", "methodDoc", "methodReturnDoc",
            "methodArgumentDoc", "exception", "exceptionStatus"
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
    public ATN getATN() {
        return _ATN;
    }

    public DonkeyParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class DocumentContext extends ParserRuleContext {
        public TerminalNode EOF() {
            return getToken(DonkeyParser.EOF, 0);
        }

        public List<DefinitionContext> definition() {
            return getRuleContexts(DefinitionContext.class);
        }

        public DefinitionContext definition(int i) {
            return getRuleContext(DefinitionContext.class, i);
        }

        public DocumentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_document;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterDocument(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitDocument(this);
        }
    }

    public final DocumentContext document() throws RecognitionException {
        DocumentContext _localctx = new DocumentContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_document);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(57);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__14) | (1L << LineDoc))) != 0)) {
                    {
                        {
                            setState(54);
                            definition();
                        }
                    }
                    setState(59);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(60);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DefinitionContext extends ParserRuleContext {
        public NamespaceContext namespace() {
            return getRuleContext(NamespaceContext.class, 0);
        }

        public NamespaceImportContext namespaceImport() {
            return getRuleContext(NamespaceImportContext.class, 0);
        }

        public ClassImportContext classImport() {
            return getRuleContext(ClassImportContext.class, 0);
        }

        public ResourceContext resource() {
            return getRuleContext(ResourceContext.class, 0);
        }

        public ExceptionContext exception() {
            return getRuleContext(ExceptionContext.class, 0);
        }

        public ServiceNameContext serviceName() {
            return getRuleContext(ServiceNameContext.class, 0);
        }

        public DefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterDefinition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitDefinition(this);
        }
    }

    public final DefinitionContext definition() throws RecognitionException {
        DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_definition);
        try {
            setState(68);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__2:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(62);
                    namespace();
                }
                break;
                case T__3:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(63);
                    namespaceImport();
                }
                break;
                case T__4:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(64);
                    classImport();
                }
                break;
                case T__6:
                case LineDoc:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(65);
                    resource();
                }
                break;
                case T__14:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(66);
                    exception();
                }
                break;
                case T__5:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(67);
                    serviceName();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SingularTypeReferenceContext extends ParserRuleContext {
        public TerminalNode PrimitiveType() {
            return getToken(DonkeyParser.PrimitiveType, 0);
        }

        public TerminalNode Identifier() {
            return getToken(DonkeyParser.Identifier, 0);
        }

        public SingularTypeReferenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singularTypeReference;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterSingularTypeReference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitSingularTypeReference(this);
        }
    }

    public final SingularTypeReferenceContext singularTypeReference() throws RecognitionException {
        SingularTypeReferenceContext _localctx = new SingularTypeReferenceContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_singularTypeReference);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(70);
                _la = _input.LA(1);
                if (!(_la == PrimitiveType || _la == Identifier)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CollectionTypeReferenceContext extends ParserRuleContext {
        public TerminalNode CollectionType() {
            return getToken(DonkeyParser.CollectionType, 0);
        }

        public SingularTypeReferenceContext singularTypeReference() {
            return getRuleContext(SingularTypeReferenceContext.class, 0);
        }

        public CollectionTypeReferenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_collectionTypeReference;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterCollectionTypeReference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitCollectionTypeReference(this);
        }
    }

    public final CollectionTypeReferenceContext collectionTypeReference() throws RecognitionException {
        CollectionTypeReferenceContext _localctx = new CollectionTypeReferenceContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_collectionTypeReference);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(72);
                match(CollectionType);
                setState(73);
                match(T__0);
                setState(74);
                singularTypeReference();
                setState(75);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodArgumentTypeReferenceContext extends ParserRuleContext {
        public SingularTypeReferenceContext singularTypeReference() {
            return getRuleContext(SingularTypeReferenceContext.class, 0);
        }

        public CollectionTypeReferenceContext collectionTypeReference() {
            return getRuleContext(CollectionTypeReferenceContext.class, 0);
        }

        public MethodArgumentTypeReferenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodArgumentTypeReference;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterMethodArgumentTypeReference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitMethodArgumentTypeReference(this);
        }
    }

    public final MethodArgumentTypeReferenceContext methodArgumentTypeReference() throws RecognitionException {
        MethodArgumentTypeReferenceContext _localctx = new MethodArgumentTypeReferenceContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_methodArgumentTypeReference);
        try {
            setState(79);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case PrimitiveType:
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(77);
                    singularTypeReference();
                }
                break;
                case CollectionType:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(78);
                    collectionTypeReference();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NamespaceContext extends ParserRuleContext {
        public LanguageContext language() {
            return getRuleContext(LanguageContext.class, 0);
        }

        public NamespaceNameContext namespaceName() {
            return getRuleContext(NamespaceNameContext.class, 0);
        }

        public NamespaceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namespace;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterNamespace(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitNamespace(this);
        }
    }

    public final NamespaceContext namespace() throws RecognitionException {
        NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_namespace);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(81);
                match(T__2);
                setState(82);
                language();
                setState(83);
                namespaceName();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NamespaceImportContext extends ParserRuleContext {
        public LanguageContext language() {
            return getRuleContext(LanguageContext.class, 0);
        }

        public NamespaceNameContext namespaceName() {
            return getRuleContext(NamespaceNameContext.class, 0);
        }

        public NamespaceImportContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namespaceImport;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterNamespaceImport(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitNamespaceImport(this);
        }
    }

    public final NamespaceImportContext namespaceImport() throws RecognitionException {
        NamespaceImportContext _localctx = new NamespaceImportContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_namespaceImport);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(85);
                match(T__3);
                setState(86);
                language();
                setState(87);
                namespaceName();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassImportContext extends ParserRuleContext {
        public LanguageContext language() {
            return getRuleContext(LanguageContext.class, 0);
        }

        public ClassNameContext className() {
            return getRuleContext(ClassNameContext.class, 0);
        }

        public ClassImportContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classImport;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterClassImport(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitClassImport(this);
        }
    }

    public final ClassImportContext classImport() throws RecognitionException {
        ClassImportContext _localctx = new ClassImportContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_classImport);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(89);
                match(T__4);
                setState(90);
                language();
                setState(91);
                className();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LanguageContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(DonkeyParser.Identifier, 0);
        }

        public LanguageContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_language;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterLanguage(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitLanguage(this);
        }
    }

    public final LanguageContext language() throws RecognitionException {
        LanguageContext _localctx = new LanguageContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_language);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(93);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NamespaceNameContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(DonkeyParser.Identifier, 0);
        }

        public NamespaceNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namespaceName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterNamespaceName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitNamespaceName(this);
        }
    }

    public final NamespaceNameContext namespaceName() throws RecognitionException {
        NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_namespaceName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(95);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassNameContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(DonkeyParser.Identifier, 0);
        }

        public ClassNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_className;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterClassName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitClassName(this);
        }
    }

    public final ClassNameContext className() throws RecognitionException {
        ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_className);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(97);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ServiceNameContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(DonkeyParser.Identifier, 0);
        }

        public ServiceNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_serviceName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterServiceName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitServiceName(this);
        }
    }

    public final ServiceNameContext serviceName() throws RecognitionException {
        ServiceNameContext _localctx = new ServiceNameContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_serviceName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(99);
                match(T__5);
                setState(100);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ResourceContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(DonkeyParser.Identifier, 0);
        }

        public TerminalNode StartCurlyBracket() {
            return getToken(DonkeyParser.StartCurlyBracket, 0);
        }

        public TerminalNode EndCurlyBracket() {
            return getToken(DonkeyParser.EndCurlyBracket, 0);
        }

        public ResourceDocContext resourceDoc() {
            return getRuleContext(ResourceDocContext.class, 0);
        }

        public ResourceDefaultUrlContext resourceDefaultUrl() {
            return getRuleContext(ResourceDefaultUrlContext.class, 0);
        }

        public List<MethodDefContext> methodDef() {
            return getRuleContexts(MethodDefContext.class);
        }

        public MethodDefContext methodDef(int i) {
            return getRuleContext(MethodDefContext.class, i);
        }

        public ResourceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resource;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterResource(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitResource(this);
        }
    }

    public final ResourceContext resource() throws RecognitionException {
        ResourceContext _localctx = new ResourceContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_resource);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(103);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LineDoc) {
                    {
                        setState(102);
                        resourceDoc();
                    }
                }

                setState(105);
                match(T__6);
                setState(106);
                match(Identifier);
                setState(108);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Literal) {
                    {
                        setState(107);
                        resourceDefaultUrl();
                    }
                }

                setState(110);
                match(StartCurlyBracket);
                setState(112);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(111);
                            methodDef();
                        }
                    }
                    setState(114);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == HTTPMethod || _la == LineDoc);
                setState(116);
                match(EndCurlyBracket);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ResourceDefaultUrlContext extends ParserRuleContext {
        public TerminalNode Literal() {
            return getToken(DonkeyParser.Literal, 0);
        }

        public ResourceDefaultUrlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resourceDefaultUrl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterResourceDefaultUrl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitResourceDefaultUrl(this);
        }
    }

    public final ResourceDefaultUrlContext resourceDefaultUrl() throws RecognitionException {
        ResourceDefaultUrlContext _localctx = new ResourceDefaultUrlContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_resourceDefaultUrl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(118);
                match(Literal);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodDefContext extends ParserRuleContext {
        public TerminalNode HTTPMethod() {
            return getToken(DonkeyParser.HTTPMethod, 0);
        }

        public MethodReturnTypeContext methodReturnType() {
            return getRuleContext(MethodReturnTypeContext.class, 0);
        }

        public MethodSignatureContext methodSignature() {
            return getRuleContext(MethodSignatureContext.class, 0);
        }

        public MethodDocContext methodDoc() {
            return getRuleContext(MethodDocContext.class, 0);
        }

        public MethodUrlContext methodUrl() {
            return getRuleContext(MethodUrlContext.class, 0);
        }

        public MethodThrowsContext methodThrows() {
            return getRuleContext(MethodThrowsContext.class, 0);
        }

        public MethodReturnDocContext methodReturnDoc() {
            return getRuleContext(MethodReturnDocContext.class, 0);
        }

        public MethodDefContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodDef;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterMethodDef(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitMethodDef(this);
        }
    }

    public final MethodDefContext methodDef() throws RecognitionException {
        MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_methodDef);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(121);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LineDoc) {
                    {
                        setState(120);
                        methodDoc();
                    }
                }

                setState(123);
                match(HTTPMethod);
                setState(125);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Literal) {
                    {
                        setState(124);
                        methodUrl();
                    }
                }

                setState(127);
                methodReturnType();
                setState(128);
                methodSignature();
                setState(130);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__13) {
                    {
                        setState(129);
                        methodThrows();
                    }
                }

                setState(132);
                match(T__7);
                setState(134);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EmbeddedDoc) {
                    {
                        setState(133);
                        methodReturnDoc();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodUrlContext extends ParserRuleContext {
        public TerminalNode Literal() {
            return getToken(DonkeyParser.Literal, 0);
        }

        public MethodUrlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodUrl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterMethodUrl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitMethodUrl(this);
        }
    }

    public final MethodUrlContext methodUrl() throws RecognitionException {
        MethodUrlContext _localctx = new MethodUrlContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_methodUrl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(136);
                match(Literal);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodReturnTypeContext extends ParserRuleContext {
        public SingularTypeReferenceContext singularTypeReference() {
            return getRuleContext(SingularTypeReferenceContext.class, 0);
        }

        public MethodReturnTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodReturnType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterMethodReturnType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitMethodReturnType(this);
        }
    }

    public final MethodReturnTypeContext methodReturnType() throws RecognitionException {
        MethodReturnTypeContext _localctx = new MethodReturnTypeContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_methodReturnType);
        try {
            setState(140);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__8:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(138);
                    match(T__8);
                }
                break;
                case PrimitiveType:
                case Identifier:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(139);
                    singularTypeReference();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodSignatureContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(DonkeyParser.Identifier, 0);
        }

        public List<MethodArgumentContext> methodArgument() {
            return getRuleContexts(MethodArgumentContext.class);
        }

        public MethodArgumentContext methodArgument(int i) {
            return getRuleContext(MethodArgumentContext.class, i);
        }

        public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodSignature;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterMethodSignature(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitMethodSignature(this);
        }
    }

    public final MethodSignatureContext methodSignature() throws RecognitionException {
        MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_methodSignature);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(142);
                match(Identifier);
                setState(143);
                match(T__9);
                setState(145);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == HTTPMethodArgumentType) {
                    {
                        setState(144);
                        methodArgument();
                    }
                }

                setState(151);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(147);
                            match(T__10);
                            setState(148);
                            methodArgument();
                        }
                    }
                    setState(153);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(154);
                match(T__11);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodArgumentContext extends ParserRuleContext {
        public TerminalNode HTTPMethodArgumentType() {
            return getToken(DonkeyParser.HTTPMethodArgumentType, 0);
        }

        public MethodArgumentTypeReferenceContext methodArgumentTypeReference() {
            return getRuleContext(MethodArgumentTypeReferenceContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(DonkeyParser.Identifier, 0);
        }

        public DefaultValueContext defaultValue() {
            return getRuleContext(DefaultValueContext.class, 0);
        }

        public MethodArgumentDocContext methodArgumentDoc() {
            return getRuleContext(MethodArgumentDocContext.class, 0);
        }

        public MethodArgumentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodArgument;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterMethodArgument(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitMethodArgument(this);
        }
    }

    public final MethodArgumentContext methodArgument() throws RecognitionException {
        MethodArgumentContext _localctx = new MethodArgumentContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_methodArgument);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(156);
                match(HTTPMethodArgumentType);
                setState(158);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__12) {
                    {
                        setState(157);
                        defaultValue();
                    }
                }

                setState(160);
                methodArgumentTypeReference();
                setState(161);
                match(Identifier);
                setState(163);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EmbeddedDoc) {
                    {
                        setState(162);
                        methodArgumentDoc();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DefaultValueContext extends ParserRuleContext {
        public TerminalNode Literal() {
            return getToken(DonkeyParser.Literal, 0);
        }

        public DefaultValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defaultValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterDefaultValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitDefaultValue(this);
        }
    }

    public final DefaultValueContext defaultValue() throws RecognitionException {
        DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_defaultValue);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(165);
                match(T__12);
                setState(166);
                match(Literal);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodThrowsContext extends ParserRuleContext {
        public List<TerminalNode> Identifier() {
            return getTokens(DonkeyParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(DonkeyParser.Identifier, i);
        }

        public MethodThrowsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodThrows;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterMethodThrows(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitMethodThrows(this);
        }
    }

    public final MethodThrowsContext methodThrows() throws RecognitionException {
        MethodThrowsContext _localctx = new MethodThrowsContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_methodThrows);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(168);
                match(T__13);
                setState(169);
                match(Identifier);
                setState(174);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(170);
                            match(T__10);
                            setState(171);
                            match(Identifier);
                        }
                    }
                    setState(176);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ResourceDocContext extends ParserRuleContext {
        public List<TerminalNode> LineDoc() {
            return getTokens(DonkeyParser.LineDoc);
        }

        public TerminalNode LineDoc(int i) {
            return getToken(DonkeyParser.LineDoc, i);
        }

        public ResourceDocContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resourceDoc;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterResourceDoc(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitResourceDoc(this);
        }
    }

    public final ResourceDocContext resourceDoc() throws RecognitionException {
        ResourceDocContext _localctx = new ResourceDocContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_resourceDoc);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(178);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(177);
                            match(LineDoc);
                        }
                    }
                    setState(180);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == LineDoc);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodDocContext extends ParserRuleContext {
        public List<TerminalNode> LineDoc() {
            return getTokens(DonkeyParser.LineDoc);
        }

        public TerminalNode LineDoc(int i) {
            return getToken(DonkeyParser.LineDoc, i);
        }

        public MethodDocContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodDoc;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterMethodDoc(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitMethodDoc(this);
        }
    }

    public final MethodDocContext methodDoc() throws RecognitionException {
        MethodDocContext _localctx = new MethodDocContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_methodDoc);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(183);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(182);
                            match(LineDoc);
                        }
                    }
                    setState(185);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == LineDoc);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodReturnDocContext extends ParserRuleContext {
        public TerminalNode EmbeddedDoc() {
            return getToken(DonkeyParser.EmbeddedDoc, 0);
        }

        public MethodReturnDocContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodReturnDoc;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterMethodReturnDoc(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitMethodReturnDoc(this);
        }
    }

    public final MethodReturnDocContext methodReturnDoc() throws RecognitionException {
        MethodReturnDocContext _localctx = new MethodReturnDocContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_methodReturnDoc);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(187);
                match(EmbeddedDoc);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodArgumentDocContext extends ParserRuleContext {
        public TerminalNode EmbeddedDoc() {
            return getToken(DonkeyParser.EmbeddedDoc, 0);
        }

        public MethodArgumentDocContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodArgumentDoc;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterMethodArgumentDoc(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitMethodArgumentDoc(this);
        }
    }

    public final MethodArgumentDocContext methodArgumentDoc() throws RecognitionException {
        MethodArgumentDocContext _localctx = new MethodArgumentDocContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_methodArgumentDoc);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(189);
                match(EmbeddedDoc);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExceptionContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(DonkeyParser.Identifier, 0);
        }

        public TerminalNode IntConstant() {
            return getToken(DonkeyParser.IntConstant, 0);
        }

        public ExceptionStatusContext exceptionStatus() {
            return getRuleContext(ExceptionStatusContext.class, 0);
        }

        public ExceptionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exception;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterException(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitException(this);
        }
    }

    public final ExceptionContext exception() throws RecognitionException {
        ExceptionContext _localctx = new ExceptionContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_exception);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(191);
                match(T__14);
                setState(192);
                match(Identifier);
                setState(193);
                match(IntConstant);
                setState(195);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__9) {
                    {
                        setState(194);
                        exceptionStatus();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExceptionStatusContext extends ParserRuleContext {
        public TerminalNode IntConstant() {
            return getToken(DonkeyParser.IntConstant, 0);
        }

        public ExceptionStatusContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exceptionStatus;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).enterExceptionStatus(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DonkeyListener) ((DonkeyListener) listener).exitExceptionStatus(this);
        }
    }

    public final ExceptionStatusContext exceptionStatus() throws RecognitionException {
        ExceptionStatusContext _localctx = new ExceptionStatusContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_exceptionStatus);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(197);
                match(T__9);
                setState(198);
                match(IntConstant);
                setState(199);
                match(T__11);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00cc\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6" +
                    "R\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13" +
                    "\3\f\3\f\3\r\3\r\3\r\3\16\5\16j\n\16\3\16\3\16\3\16\5\16o\n\16\3\16\3" +
                    "\16\6\16s\n\16\r\16\16\16t\3\16\3\16\3\17\3\17\3\20\5\20|\n\20\3\20\3" +
                    "\20\5\20\u0080\n\20\3\20\3\20\3\20\5\20\u0085\n\20\3\20\3\20\5\20\u0089" +
                    "\n\20\3\21\3\21\3\22\3\22\5\22\u008f\n\22\3\23\3\23\3\23\5\23\u0094\n" +
                    "\23\3\23\3\23\7\23\u0098\n\23\f\23\16\23\u009b\13\23\3\23\3\23\3\24\3" +
                    "\24\5\24\u00a1\n\24\3\24\3\24\3\24\5\24\u00a6\n\24\3\25\3\25\3\25\3\26" +
                    "\3\26\3\26\3\26\7\26\u00af\n\26\f\26\16\26\u00b2\13\26\3\27\6\27\u00b5" +
                    "\n\27\r\27\16\27\u00b6\3\30\6\30\u00ba\n\30\r\30\16\30\u00bb\3\31\3\31" +
                    "\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00c6\n\33\3\34\3\34\3\34\3\34\3\34" +
                    "\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2" +
                    "\3\4\2\24\24\30\30\u00c7\2;\3\2\2\2\4F\3\2\2\2\6H\3\2\2\2\bJ\3\2\2\2\n" +
                    "Q\3\2\2\2\fS\3\2\2\2\16W\3\2\2\2\20[\3\2\2\2\22_\3\2\2\2\24a\3\2\2\2\26" +
                    "c\3\2\2\2\30e\3\2\2\2\32i\3\2\2\2\34x\3\2\2\2\36{\3\2\2\2 \u008a\3\2\2" +
                    "\2\"\u008e\3\2\2\2$\u0090\3\2\2\2&\u009e\3\2\2\2(\u00a7\3\2\2\2*\u00aa" +
                    "\3\2\2\2,\u00b4\3\2\2\2.\u00b9\3\2\2\2\60\u00bd\3\2\2\2\62\u00bf\3\2\2" +
                    "\2\64\u00c1\3\2\2\2\66\u00c7\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3" +
                    "\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\2\2\3?\3\3\2\2\2@G\5\f\7\2AG" +
                    "\5\16\b\2BG\5\20\t\2CG\5\32\16\2DG\5\64\33\2EG\5\30\r\2F@\3\2\2\2FA\3" +
                    "\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\5\3\2\2\2HI\t\2\2\2I\7" +
                    "\3\2\2\2JK\7\25\2\2KL\7\3\2\2LM\5\6\4\2MN\7\4\2\2N\t\3\2\2\2OR\5\6\4\2" +
                    "PR\5\b\5\2QO\3\2\2\2QP\3\2\2\2R\13\3\2\2\2ST\7\5\2\2TU\5\22\n\2UV\5\24" +
                    "\13\2V\r\3\2\2\2WX\7\6\2\2XY\5\22\n\2YZ\5\24\13\2Z\17\3\2\2\2[\\\7\7\2" +
                    "\2\\]\5\22\n\2]^\5\26\f\2^\21\3\2\2\2_`\7\30\2\2`\23\3\2\2\2ab\7\30\2" +
                    "\2b\25\3\2\2\2cd\7\30\2\2d\27\3\2\2\2ef\7\b\2\2fg\7\30\2\2g\31\3\2\2\2" +
                    "hj\5,\27\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\t\2\2ln\7\30\2\2mo\5\34\17" +
                    "\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pr\7\26\2\2qs\5\36\20\2rq\3\2\2\2st\3" +
                    "\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\27\2\2w\33\3\2\2\2xy\7\32\2\2" +
                    "y\35\3\2\2\2z|\5.\30\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\7\23\2\2~\u0080" +
                    "\5 \21\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082" +
                    "\5\"\22\2\u0082\u0084\5$\23\2\u0083\u0085\5*\26\2\u0084\u0083\3\2\2\2" +
                    "\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\n\2\2\u0087\u0089" +
                    "\5\60\31\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\37\3\2\2\2\u008a" +
                    "\u008b\7\32\2\2\u008b!\3\2\2\2\u008c\u008f\7\13\2\2\u008d\u008f\5\6\4" +
                    "\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f#\3\2\2\2\u0090\u0091" +
                    "\7\30\2\2\u0091\u0093\7\f\2\2\u0092\u0094\5&\24\2\u0093\u0092\3\2\2\2" +
                    "\u0093\u0094\3\2\2\2\u0094\u0099\3\2\2\2\u0095\u0096\7\r\2\2\u0096\u0098" +
                    "\5&\24\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099" +
                    "\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\16" +
                    "\2\2\u009d%\3\2\2\2\u009e\u00a0\7\22\2\2\u009f\u00a1\5(\25\2\u00a0\u009f" +
                    "\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5\n\6\2\u00a3" +
                    "\u00a5\7\30\2\2\u00a4\u00a6\5\62\32\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6" +
                    "\3\2\2\2\u00a6\'\3\2\2\2\u00a7\u00a8\7\17\2\2\u00a8\u00a9\7\32\2\2\u00a9" +
                    ")\3\2\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00b0\7\30\2\2\u00ac\u00ad\7\r\2" +
                    "\2\u00ad\u00af\7\30\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0" +
                    "\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1+\3\2\2\2\u00b2\u00b0\3\2\2\2" +
                    "\u00b3\u00b5\7\33\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4" +
                    "\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7-\3\2\2\2\u00b8\u00ba\7\33\2\2\u00b9" +
                    "\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2" +
                    "\2\2\u00bc/\3\2\2\2\u00bd\u00be\7\34\2\2\u00be\61\3\2\2\2\u00bf\u00c0" +
                    "\7\34\2\2\u00c0\63\3\2\2\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3\7\30\2\2\u00c3" +
                    "\u00c5\7\31\2\2\u00c4\u00c6\5\66\34\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6" +
                    "\3\2\2\2\u00c6\65\3\2\2\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\7\31\2\2\u00c9" +
                    "\u00ca\7\16\2\2\u00ca\67\3\2\2\2\25;FQint{\177\u0084\u0088\u008e\u0093" +
                    "\u0099\u00a0\u00a5\u00b0\u00b6\u00bb\u00c5";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}