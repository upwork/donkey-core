/*
 * Copyright 2018 Upwork Global Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.upwork.donkey.core.parser;

import com.upwork.donkey.core.ast.MethodDefinition;
import com.upwork.donkey.core.ast.ResourceDefinition;
import com.upwork.donkey.core.ast.SingularTypeReference;
import com.upwork.donkey.core.parser.antlr.DonkeyParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class MethodDefinitionListener extends BaseListener {

    MethodDefinition methodDefinition;

    public MethodDefinitionListener(ResourceDefinition resourceDefinition) {
        this.methodDefinition = new MethodDefinition(resourceDefinition);
    }

    public MethodDefinition getMethodDefinition() {
        return methodDefinition;
    }

    @Override
    public void enterMethodSignature(DonkeyParser.MethodSignatureContext ctx) {
        String name = ctx.Identifier().getText();

        methodDefinition.setName(name);

        System.out.printf("-- method %s\n", name);
    }

    @Override
    public void enterMethodDef(DonkeyParser.MethodDefContext ctx) {
        String httpMethod = ctx.HTTPMethod().getText().toLowerCase();

        methodDefinition.setHttpMethod(httpMethod);

        System.out.printf("--- http method %s\n", httpMethod);
    }

    @Override
    public void enterMethodUrl(DonkeyParser.MethodUrlContext ctx) {
        String path = trimPath(ctx.getText());

        methodDefinition.setPath(path);

        System.out.printf("--- path %s\n", path);
    }

    @Override
    public void enterMethodReturnType(DonkeyParser.MethodReturnTypeContext ctx) {
        // return type is null for void methods
        if (ctx.singularTypeReference() != null) {
            String returnType = ctx.singularTypeReference().getText();
            methodDefinition.setReturnType(new SingularTypeReference(returnType, isPrimitiveType(ctx.singularTypeReference())));
            System.out.printf("--- return type %s\n", returnType);
        } else {
            System.out.println("--- return type is void");
        }

    }

    @Override
    public void enterMethodDoc(DonkeyParser.MethodDocContext ctx) {
        if (ctx == null || ctx.LineDoc().isEmpty()) {
            System.out.println("--- no method doc block");
            return;
        }

        List<String> lines = ctx.LineDoc().stream().map(docNode -> trimLineDocDelimiter(docNode.getText()))
                .collect(Collectors.toList());

        methodDefinition.setDoc(lines);

        System.out.printf("--- method doc block, %d lines of text\n", ctx.LineDoc().size());
    }

    @Override
    public void enterMethodThrows(DonkeyParser.MethodThrowsContext ctx) {
        List<String> throwableExceptions = ctx.Identifier().stream().map(TerminalNode::getText)
                .collect(Collectors.toList());
        methodDefinition.setThrowableExceptions(throwableExceptions);

        System.out.printf("--- may throw exceptions: %s\n", StringUtils.join(throwableExceptions, ","));
    }

    @Override
    public void enterMethodReturnDoc(DonkeyParser.MethodReturnDocContext ctx) {
        methodDefinition.setReturnDoc(trimEmbeddedDocDelimiter(ctx.getText()));
        System.out.printf("--- return doc block\n");

    }

    @Override
    public void enterMethodArgument(DonkeyParser.MethodArgumentContext ctx) {
        ArgumentDefinitionListener argumentDefinitionListener = new ArgumentDefinitionListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(argumentDefinitionListener, ctx);
        methodDefinition.addArgument(argumentDefinitionListener.getArgumentDefinition());
    }
}
