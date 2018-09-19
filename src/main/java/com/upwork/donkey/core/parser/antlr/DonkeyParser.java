// Generated from Donkey.g4 by ANTLR 4.6
package com.upwork.donkey.core.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DonkeyParser extends Parser {
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

	@Override
	public String getGrammarFileName() { return "Donkey.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DonkeyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DonkeyParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitDocument(this);
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public NamespaceImportContext namespaceImport() {
			return getRuleContext(NamespaceImportContext.class,0);
		}
		public ClassImportContext classImport() {
			return getRuleContext(ClassImportContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public ExceptionContext exception() {
			return getRuleContext(ExceptionContext.class,0);
		}
		public ServiceNameContext serviceName() {
			return getRuleContext(ServiceNameContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitDefinition(this);
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingularTypeReferenceContext extends ParserRuleContext {
		public TerminalNode PrimitiveType() { return getToken(DonkeyParser.PrimitiveType, 0); }
		public TerminalNode Identifier() { return getToken(DonkeyParser.Identifier, 0); }
		public SingularTypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singularTypeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterSingularTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitSingularTypeReference(this);
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
			if ( !(_la==PrimitiveType || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionTypeReferenceContext extends ParserRuleContext {
		public TerminalNode CollectionType() { return getToken(DonkeyParser.CollectionType, 0); }
		public SingularTypeReferenceContext singularTypeReference() {
			return getRuleContext(SingularTypeReferenceContext.class,0);
		}
		public CollectionTypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionTypeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterCollectionTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitCollectionTypeReference(this);
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgumentTypeReferenceContext extends ParserRuleContext {
		public SingularTypeReferenceContext singularTypeReference() {
			return getRuleContext(SingularTypeReferenceContext.class,0);
		}
		public CollectionTypeReferenceContext collectionTypeReference() {
			return getRuleContext(CollectionTypeReferenceContext.class,0);
		}
		public MethodArgumentTypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgumentTypeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterMethodArgumentTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitMethodArgumentTypeReference(this);
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public LanguageContext language() {
			return getRuleContext(LanguageContext.class,0);
		}
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode EndOfLine() { return getToken(DonkeyParser.EndOfLine, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitNamespace(this);
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
			setState(84);
			match(EndOfLine);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceImportContext extends ParserRuleContext {
		public LanguageContext language() {
			return getRuleContext(LanguageContext.class,0);
		}
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode EndOfLine() { return getToken(DonkeyParser.EndOfLine, 0); }
		public NamespaceImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterNamespaceImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitNamespaceImport(this);
		}
	}

	public final NamespaceImportContext namespaceImport() throws RecognitionException {
		NamespaceImportContext _localctx = new NamespaceImportContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_namespaceImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__3);
			setState(87);
			language();
			setState(88);
			namespaceName();
			setState(89);
			match(EndOfLine);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassImportContext extends ParserRuleContext {
		public LanguageContext language() {
			return getRuleContext(LanguageContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode EndOfLine() { return getToken(DonkeyParser.EndOfLine, 0); }
		public ClassImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterClassImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitClassImport(this);
		}
	}

	public final ClassImportContext classImport() throws RecognitionException {
		ClassImportContext _localctx = new ClassImportContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__4);
			setState(92);
			language();
			setState(93);
			className();
			setState(94);
			match(EndOfLine);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LanguageContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DonkeyParser.Identifier, 0); }
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitLanguage(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_language);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DonkeyParser.Identifier, 0); }
		public NamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitNamespaceName(this);
		}
	}

	public final NamespaceNameContext namespaceName() throws RecognitionException {
		NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_namespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DonkeyParser.Identifier, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServiceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DonkeyParser.Identifier, 0); }
		public TerminalNode EndOfLine() { return getToken(DonkeyParser.EndOfLine, 0); }
		public ServiceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterServiceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitServiceName(this);
		}
	}

	public final ServiceNameContext serviceName() throws RecognitionException {
		ServiceNameContext _localctx = new ServiceNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_serviceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__5);
			setState(103);
			match(Identifier);
			setState(104);
			match(EndOfLine);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DonkeyParser.Identifier, 0); }
		public TerminalNode StartCurlyBracket() { return getToken(DonkeyParser.StartCurlyBracket, 0); }
		public TerminalNode EndCurlyBracket() { return getToken(DonkeyParser.EndCurlyBracket, 0); }
		public ResourceDocContext resourceDoc() {
			return getRuleContext(ResourceDocContext.class,0);
		}
		public ResourceDefaultUrlContext resourceDefaultUrl() {
			return getRuleContext(ResourceDefaultUrlContext.class,0);
		}
		public List<MethodDefContext> methodDef() {
			return getRuleContexts(MethodDefContext.class);
		}
		public MethodDefContext methodDef(int i) {
			return getRuleContext(MethodDefContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LineDoc) {
				{
				setState(106);
				resourceDoc();
				}
			}

			setState(109);
			match(T__6);
			setState(110);
			match(Identifier);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Literal) {
				{
				setState(111);
				resourceDefaultUrl();
				}
			}

			setState(114);
			match(StartCurlyBracket);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				methodDef();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HTTPMethod || _la==LineDoc );
			setState(120);
			match(EndCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceDefaultUrlContext extends ParserRuleContext {
		public TerminalNode Literal() { return getToken(DonkeyParser.Literal, 0); }
		public ResourceDefaultUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceDefaultUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterResourceDefaultUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitResourceDefaultUrl(this);
		}
	}

	public final ResourceDefaultUrlContext resourceDefaultUrl() throws RecognitionException {
		ResourceDefaultUrlContext _localctx = new ResourceDefaultUrlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_resourceDefaultUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(Literal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefContext extends ParserRuleContext {
		public TerminalNode HTTPMethod() { return getToken(DonkeyParser.HTTPMethod, 0); }
		public MethodReturnTypeContext methodReturnType() {
			return getRuleContext(MethodReturnTypeContext.class,0);
		}
		public MethodSignatureContext methodSignature() {
			return getRuleContext(MethodSignatureContext.class,0);
		}
		public MethodDocContext methodDoc() {
			return getRuleContext(MethodDocContext.class,0);
		}
		public MethodUrlContext methodUrl() {
			return getRuleContext(MethodUrlContext.class,0);
		}
		public MethodThrowsContext methodThrows() {
			return getRuleContext(MethodThrowsContext.class,0);
		}
		public MethodReturnDocContext methodReturnDoc() {
			return getRuleContext(MethodReturnDocContext.class,0);
		}
		public MethodDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterMethodDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitMethodDef(this);
		}
	}

	public final MethodDefContext methodDef() throws RecognitionException {
		MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LineDoc) {
				{
				setState(124);
				methodDoc();
				}
			}

			setState(127);
			match(HTTPMethod);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Literal) {
				{
				setState(128);
				methodUrl();
				}
			}

			setState(131);
			methodReturnType();
			setState(132);
			methodSignature();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(133);
				methodThrows();
				}
			}

			setState(136);
			match(T__7);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EmbeddedDoc) {
				{
				setState(137);
				methodReturnDoc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodUrlContext extends ParserRuleContext {
		public TerminalNode Literal() { return getToken(DonkeyParser.Literal, 0); }
		public MethodUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterMethodUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitMethodUrl(this);
		}
	}

	public final MethodUrlContext methodUrl() throws RecognitionException {
		MethodUrlContext _localctx = new MethodUrlContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(Literal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReturnTypeContext extends ParserRuleContext {
		public SingularTypeReferenceContext singularTypeReference() {
			return getRuleContext(SingularTypeReferenceContext.class,0);
		}
		public MethodReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterMethodReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitMethodReturnType(this);
		}
	}

	public final MethodReturnTypeContext methodReturnType() throws RecognitionException {
		MethodReturnTypeContext _localctx = new MethodReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodReturnType);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__8);
				}
				break;
			case PrimitiveType:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				singularTypeReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodSignatureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DonkeyParser.Identifier, 0); }
		public List<MethodArgumentContext> methodArgument() {
			return getRuleContexts(MethodArgumentContext.class);
		}
		public MethodArgumentContext methodArgument(int i) {
			return getRuleContext(MethodArgumentContext.class,i);
		}
		public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterMethodSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitMethodSignature(this);
		}
	}

	public final MethodSignatureContext methodSignature() throws RecognitionException {
		MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(Identifier);
			setState(147);
			match(T__9);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTTPMethodArgumentType) {
				{
				setState(148);
				methodArgument();
				}
			}

			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(151);
				match(T__10);
				setState(152);
				methodArgument();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgumentContext extends ParserRuleContext {
		public TerminalNode HTTPMethodArgumentType() { return getToken(DonkeyParser.HTTPMethodArgumentType, 0); }
		public MethodArgumentTypeReferenceContext methodArgumentTypeReference() {
			return getRuleContext(MethodArgumentTypeReferenceContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(DonkeyParser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public MethodArgumentDocContext methodArgumentDoc() {
			return getRuleContext(MethodArgumentDocContext.class,0);
		}
		public MethodArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterMethodArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitMethodArgument(this);
		}
	}

	public final MethodArgumentContext methodArgument() throws RecognitionException {
		MethodArgumentContext _localctx = new MethodArgumentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(HTTPMethodArgumentType);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(161);
				defaultValue();
				}
			}

			setState(164);
			methodArgumentTypeReference();
			setState(165);
			match(Identifier);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EmbeddedDoc) {
				{
				setState(166);
				methodArgumentDoc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode Literal() { return getToken(DonkeyParser.Literal, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__12);
			setState(170);
			match(Literal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodThrowsContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(DonkeyParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DonkeyParser.Identifier, i);
		}
		public MethodThrowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodThrows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterMethodThrows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitMethodThrows(this);
		}
	}

	public final MethodThrowsContext methodThrows() throws RecognitionException {
		MethodThrowsContext _localctx = new MethodThrowsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodThrows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__13);
			setState(173);
			match(Identifier);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(174);
				match(T__10);
				setState(175);
				match(Identifier);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceDocContext extends ParserRuleContext {
		public List<TerminalNode> LineDoc() { return getTokens(DonkeyParser.LineDoc); }
		public TerminalNode LineDoc(int i) {
			return getToken(DonkeyParser.LineDoc, i);
		}
		public ResourceDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceDoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterResourceDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitResourceDoc(this);
		}
	}

	public final ResourceDocContext resourceDoc() throws RecognitionException {
		ResourceDocContext _localctx = new ResourceDocContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_resourceDoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				match(LineDoc);
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LineDoc );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDocContext extends ParserRuleContext {
		public List<TerminalNode> LineDoc() { return getTokens(DonkeyParser.LineDoc); }
		public TerminalNode LineDoc(int i) {
			return getToken(DonkeyParser.LineDoc, i);
		}
		public MethodDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterMethodDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitMethodDoc(this);
		}
	}

	public final MethodDocContext methodDoc() throws RecognitionException {
		MethodDocContext _localctx = new MethodDocContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodDoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				match(LineDoc);
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LineDoc );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReturnDocContext extends ParserRuleContext {
		public TerminalNode EmbeddedDoc() { return getToken(DonkeyParser.EmbeddedDoc, 0); }
		public MethodReturnDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReturnDoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterMethodReturnDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitMethodReturnDoc(this);
		}
	}

	public final MethodReturnDocContext methodReturnDoc() throws RecognitionException {
		MethodReturnDocContext _localctx = new MethodReturnDocContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodReturnDoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(EmbeddedDoc);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgumentDocContext extends ParserRuleContext {
		public TerminalNode EmbeddedDoc() { return getToken(DonkeyParser.EmbeddedDoc, 0); }
		public MethodArgumentDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgumentDoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterMethodArgumentDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitMethodArgumentDoc(this);
		}
	}

	public final MethodArgumentDocContext methodArgumentDoc() throws RecognitionException {
		MethodArgumentDocContext _localctx = new MethodArgumentDocContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodArgumentDoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(EmbeddedDoc);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DonkeyParser.Identifier, 0); }
		public TerminalNode IntConstant() { return getToken(DonkeyParser.IntConstant, 0); }
		public ExceptionStatusContext exceptionStatus() {
			return getRuleContext(ExceptionStatusContext.class,0);
		}
		public ExceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitException(this);
		}
	}

	public final ExceptionContext exception() throws RecognitionException {
		ExceptionContext _localctx = new ExceptionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exception);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__14);
			setState(196);
			match(Identifier);
			setState(197);
			match(IntConstant);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(198);
				exceptionStatus();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionStatusContext extends ParserRuleContext {
		public TerminalNode IntConstant() { return getToken(DonkeyParser.IntConstant, 0); }
		public ExceptionStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionStatus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).enterExceptionStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonkeyListener ) ((DonkeyListener)listener).exitExceptionStatus(this);
		}
	}

	public final ExceptionStatusContext exceptionStatus() throws RecognitionException {
		ExceptionStatusContext _localctx = new ExceptionStatusContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exceptionStatus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__9);
			setState(202);
			match(IntConstant);
			setState(203);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6"+
		"R\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\5\16n\n\16\3\16\3\16\3\16"+
		"\5\16s\n\16\3\16\3\16\6\16w\n\16\r\16\16\16x\3\16\3\16\3\17\3\17\3\20"+
		"\5\20\u0080\n\20\3\20\3\20\5\20\u0084\n\20\3\20\3\20\3\20\5\20\u0089\n"+
		"\20\3\20\3\20\5\20\u008d\n\20\3\21\3\21\3\22\3\22\5\22\u0093\n\22\3\23"+
		"\3\23\3\23\5\23\u0098\n\23\3\23\3\23\7\23\u009c\n\23\f\23\16\23\u009f"+
		"\13\23\3\23\3\23\3\24\3\24\5\24\u00a5\n\24\3\24\3\24\3\24\5\24\u00aa\n"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00b3\n\26\f\26\16\26\u00b6"+
		"\13\26\3\27\6\27\u00b9\n\27\r\27\16\27\u00ba\3\30\6\30\u00be\n\30\r\30"+
		"\16\30\u00bf\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00ca\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\3\4\2\24\24\30\30\u00cb\2;\3\2\2\2\4F\3\2\2\2"+
		"\6H\3\2\2\2\bJ\3\2\2\2\nQ\3\2\2\2\fS\3\2\2\2\16X\3\2\2\2\20]\3\2\2\2\22"+
		"b\3\2\2\2\24d\3\2\2\2\26f\3\2\2\2\30h\3\2\2\2\32m\3\2\2\2\34|\3\2\2\2"+
		"\36\177\3\2\2\2 \u008e\3\2\2\2\"\u0092\3\2\2\2$\u0094\3\2\2\2&\u00a2\3"+
		"\2\2\2(\u00ab\3\2\2\2*\u00ae\3\2\2\2,\u00b8\3\2\2\2.\u00bd\3\2\2\2\60"+
		"\u00c1\3\2\2\2\62\u00c3\3\2\2\2\64\u00c5\3\2\2\2\66\u00cb\3\2\2\28:\5"+
		"\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7"+
		"\2\2\3?\3\3\2\2\2@G\5\f\7\2AG\5\16\b\2BG\5\20\t\2CG\5\32\16\2DG\5\64\33"+
		"\2EG\5\30\r\2F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2"+
		"\2\2G\5\3\2\2\2HI\t\2\2\2I\7\3\2\2\2JK\7\25\2\2KL\7\3\2\2LM\5\6\4\2MN"+
		"\7\4\2\2N\t\3\2\2\2OR\5\6\4\2PR\5\b\5\2QO\3\2\2\2QP\3\2\2\2R\13\3\2\2"+
		"\2ST\7\5\2\2TU\5\22\n\2UV\5\24\13\2VW\7\35\2\2W\r\3\2\2\2XY\7\6\2\2YZ"+
		"\5\22\n\2Z[\5\24\13\2[\\\7\35\2\2\\\17\3\2\2\2]^\7\7\2\2^_\5\22\n\2_`"+
		"\5\26\f\2`a\7\35\2\2a\21\3\2\2\2bc\7\30\2\2c\23\3\2\2\2de\7\30\2\2e\25"+
		"\3\2\2\2fg\7\30\2\2g\27\3\2\2\2hi\7\b\2\2ij\7\30\2\2jk\7\35\2\2k\31\3"+
		"\2\2\2ln\5,\27\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\t\2\2pr\7\30\2\2qs"+
		"\5\34\17\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\7\26\2\2uw\5\36\20\2vu\3\2"+
		"\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\27\2\2{\33\3\2\2\2|}"+
		"\7\32\2\2}\35\3\2\2\2~\u0080\5.\30\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\7\23\2\2\u0082\u0084\5 \21\2\u0083\u0082\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5\"\22\2\u0086"+
		"\u0088\5$\23\2\u0087\u0089\5*\26\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008c\7\n\2\2\u008b\u008d\5\60\31\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\37\3\2\2\2\u008e\u008f\7\32\2"+
		"\2\u008f!\3\2\2\2\u0090\u0093\7\13\2\2\u0091\u0093\5\6\4\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0091\3\2\2\2\u0093#\3\2\2\2\u0094\u0095\7\30\2\2\u0095"+
		"\u0097\7\f\2\2\u0096\u0098\5&\24\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009d\3\2\2\2\u0099\u009a\7\r\2\2\u009a\u009c\5&\24\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\16\2\2\u00a1"+
		"%\3\2\2\2\u00a2\u00a4\7\22\2\2\u00a3\u00a5\5(\25\2\u00a4\u00a3\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\n\6\2\u00a7\u00a9"+
		"\7\30\2\2\u00a8\u00aa\5\62\32\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2"+
		"\2\u00aa\'\3\2\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\7\32\2\2\u00ad)\3"+
		"\2\2\2\u00ae\u00af\7\20\2\2\u00af\u00b4\7\30\2\2\u00b0\u00b1\7\r\2\2\u00b1"+
		"\u00b3\7\30\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5+\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9"+
		"\7\33\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb-\3\2\2\2\u00bc\u00be\7\33\2\2\u00bd\u00bc\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"/\3\2\2\2\u00c1\u00c2\7\34\2\2\u00c2\61\3\2\2\2\u00c3\u00c4\7\34\2\2\u00c4"+
		"\63\3\2\2\2\u00c5\u00c6\7\21\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c9\7\31"+
		"\2\2\u00c8\u00ca\5\66\34\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\65\3\2\2\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd\7\31\2\2\u00cd\u00ce\7\16"+
		"\2\2\u00ce\67\3\2\2\2\25;FQmrx\177\u0083\u0088\u008c\u0092\u0097\u009d"+
		"\u00a4\u00a9\u00b4\u00ba\u00bf\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}