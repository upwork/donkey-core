// Generated from Donkey.g4 by ANTLR 4.6
package com.upwork.donkey.core.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DonkeyParser}.
 */
public interface DonkeyListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link DonkeyParser#document}.
     *
     * @param ctx the parse tree
     */
    void enterDocument(DonkeyParser.DocumentContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#document}.
     *
     * @param ctx the parse tree
     */
    void exitDocument(DonkeyParser.DocumentContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#definition}.
     *
     * @param ctx the parse tree
     */
    void enterDefinition(DonkeyParser.DefinitionContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#definition}.
     *
     * @param ctx the parse tree
     */
    void exitDefinition(DonkeyParser.DefinitionContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#singularTypeReference}.
     *
     * @param ctx the parse tree
     */
    void enterSingularTypeReference(DonkeyParser.SingularTypeReferenceContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#singularTypeReference}.
     *
     * @param ctx the parse tree
     */
    void exitSingularTypeReference(DonkeyParser.SingularTypeReferenceContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#collectionTypeReference}.
     *
     * @param ctx the parse tree
     */
    void enterCollectionTypeReference(DonkeyParser.CollectionTypeReferenceContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#collectionTypeReference}.
     *
     * @param ctx the parse tree
     */
    void exitCollectionTypeReference(DonkeyParser.CollectionTypeReferenceContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#methodArgumentTypeReference}.
     *
     * @param ctx the parse tree
     */
    void enterMethodArgumentTypeReference(DonkeyParser.MethodArgumentTypeReferenceContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#methodArgumentTypeReference}.
     *
     * @param ctx the parse tree
     */
    void exitMethodArgumentTypeReference(DonkeyParser.MethodArgumentTypeReferenceContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#namespace}.
     *
     * @param ctx the parse tree
     */
    void enterNamespace(DonkeyParser.NamespaceContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#namespace}.
     *
     * @param ctx the parse tree
     */
    void exitNamespace(DonkeyParser.NamespaceContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#namespaceImport}.
     *
     * @param ctx the parse tree
     */
    void enterNamespaceImport(DonkeyParser.NamespaceImportContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#namespaceImport}.
     *
     * @param ctx the parse tree
     */
    void exitNamespaceImport(DonkeyParser.NamespaceImportContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#classImport}.
     *
     * @param ctx the parse tree
     */
    void enterClassImport(DonkeyParser.ClassImportContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#classImport}.
     *
     * @param ctx the parse tree
     */
    void exitClassImport(DonkeyParser.ClassImportContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#language}.
     *
     * @param ctx the parse tree
     */
    void enterLanguage(DonkeyParser.LanguageContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#language}.
     *
     * @param ctx the parse tree
     */
    void exitLanguage(DonkeyParser.LanguageContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#namespaceName}.
     *
     * @param ctx the parse tree
     */
    void enterNamespaceName(DonkeyParser.NamespaceNameContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#namespaceName}.
     *
     * @param ctx the parse tree
     */
    void exitNamespaceName(DonkeyParser.NamespaceNameContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#className}.
     *
     * @param ctx the parse tree
     */
    void enterClassName(DonkeyParser.ClassNameContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#className}.
     *
     * @param ctx the parse tree
     */
    void exitClassName(DonkeyParser.ClassNameContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#serviceName}.
     *
     * @param ctx the parse tree
     */
    void enterServiceName(DonkeyParser.ServiceNameContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#serviceName}.
     *
     * @param ctx the parse tree
     */
    void exitServiceName(DonkeyParser.ServiceNameContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#resource}.
     *
     * @param ctx the parse tree
     */
    void enterResource(DonkeyParser.ResourceContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#resource}.
     *
     * @param ctx the parse tree
     */
    void exitResource(DonkeyParser.ResourceContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#resourceDefaultUrl}.
     *
     * @param ctx the parse tree
     */
    void enterResourceDefaultUrl(DonkeyParser.ResourceDefaultUrlContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#resourceDefaultUrl}.
     *
     * @param ctx the parse tree
     */
    void exitResourceDefaultUrl(DonkeyParser.ResourceDefaultUrlContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#methodDef}.
     *
     * @param ctx the parse tree
     */
    void enterMethodDef(DonkeyParser.MethodDefContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#methodDef}.
     *
     * @param ctx the parse tree
     */
    void exitMethodDef(DonkeyParser.MethodDefContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#methodUrl}.
     *
     * @param ctx the parse tree
     */
    void enterMethodUrl(DonkeyParser.MethodUrlContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#methodUrl}.
     *
     * @param ctx the parse tree
     */
    void exitMethodUrl(DonkeyParser.MethodUrlContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#methodReturnType}.
     *
     * @param ctx the parse tree
     */
    void enterMethodReturnType(DonkeyParser.MethodReturnTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#methodReturnType}.
     *
     * @param ctx the parse tree
     */
    void exitMethodReturnType(DonkeyParser.MethodReturnTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#methodSignature}.
     *
     * @param ctx the parse tree
     */
    void enterMethodSignature(DonkeyParser.MethodSignatureContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#methodSignature}.
     *
     * @param ctx the parse tree
     */
    void exitMethodSignature(DonkeyParser.MethodSignatureContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#methodArgument}.
     *
     * @param ctx the parse tree
     */
    void enterMethodArgument(DonkeyParser.MethodArgumentContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#methodArgument}.
     *
     * @param ctx the parse tree
     */
    void exitMethodArgument(DonkeyParser.MethodArgumentContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#defaultValue}.
     *
     * @param ctx the parse tree
     */
    void enterDefaultValue(DonkeyParser.DefaultValueContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#defaultValue}.
     *
     * @param ctx the parse tree
     */
    void exitDefaultValue(DonkeyParser.DefaultValueContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#methodThrows}.
     *
     * @param ctx the parse tree
     */
    void enterMethodThrows(DonkeyParser.MethodThrowsContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#methodThrows}.
     *
     * @param ctx the parse tree
     */
    void exitMethodThrows(DonkeyParser.MethodThrowsContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#resourceDoc}.
     *
     * @param ctx the parse tree
     */
    void enterResourceDoc(DonkeyParser.ResourceDocContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#resourceDoc}.
     *
     * @param ctx the parse tree
     */
    void exitResourceDoc(DonkeyParser.ResourceDocContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#methodDoc}.
     *
     * @param ctx the parse tree
     */
    void enterMethodDoc(DonkeyParser.MethodDocContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#methodDoc}.
     *
     * @param ctx the parse tree
     */
    void exitMethodDoc(DonkeyParser.MethodDocContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#methodReturnDoc}.
     *
     * @param ctx the parse tree
     */
    void enterMethodReturnDoc(DonkeyParser.MethodReturnDocContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#methodReturnDoc}.
     *
     * @param ctx the parse tree
     */
    void exitMethodReturnDoc(DonkeyParser.MethodReturnDocContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#methodArgumentDoc}.
     *
     * @param ctx the parse tree
     */
    void enterMethodArgumentDoc(DonkeyParser.MethodArgumentDocContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#methodArgumentDoc}.
     *
     * @param ctx the parse tree
     */
    void exitMethodArgumentDoc(DonkeyParser.MethodArgumentDocContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#exception}.
     *
     * @param ctx the parse tree
     */
    void enterException(DonkeyParser.ExceptionContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#exception}.
     *
     * @param ctx the parse tree
     */
    void exitException(DonkeyParser.ExceptionContext ctx);

    /**
     * Enter a parse tree produced by {@link DonkeyParser#exceptionStatus}.
     *
     * @param ctx the parse tree
     */
    void enterExceptionStatus(DonkeyParser.ExceptionStatusContext ctx);

    /**
     * Exit a parse tree produced by {@link DonkeyParser#exceptionStatus}.
     *
     * @param ctx the parse tree
     */
    void exitExceptionStatus(DonkeyParser.ExceptionStatusContext ctx);
}