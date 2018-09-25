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

import com.upwork.donkey.core.BadInputException;
import com.upwork.donkey.core.ast.ExceptionDefinition;
import com.upwork.donkey.core.ast.ServiceDefinition;
import com.upwork.donkey.core.parser.antlr.DonkeyParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ServiceDefinitionListener extends BaseListener {

    private final static int DEFAULT_EXCEPTION_STATUS_CODE = 400;

    private ServiceDefinition serviceDefinition = new ServiceDefinition();

    public ServiceDefinition getServiceDefinition() {
        return serviceDefinition;
    }

    @Override
    public void enterException(DonkeyParser.ExceptionContext ctx) {
        String exceptionClassName = ctx.Identifier().getText();
        int errorCode = Integer.parseInt(ctx.IntConstant().getText());
        int statusCode = ctx.exceptionStatus() == null
                ? DEFAULT_EXCEPTION_STATUS_CODE
                : Integer.parseInt(ctx.exceptionStatus().IntConstant().getText());

        if (statusCode < 400 || statusCode >= 500) {
            throw new BadInputException("Exception status code must be >= 400 and <= 500");
        }

        serviceDefinition.addException(new ExceptionDefinition(serviceDefinition, exceptionClassName, statusCode, errorCode));

        System.out.printf("- exception %s with HTTP status code %d and error code %d\n",
                exceptionClassName, statusCode, errorCode);
    }

    @Override
    public void enterNamespace(DonkeyParser.NamespaceContext ctx) {
        String language = ctx.language().getText();
        String namespaceName = ctx.namespaceName().getText();

        serviceDefinition.setNamespace(language, namespaceName);

        System.out.printf("- namespace %s for language %s\n", namespaceName, language);
    }

    @Override
    public void enterNamespaceImport(DonkeyParser.NamespaceImportContext ctx) {
        TerminalNode language = ctx.language().Identifier();
        TerminalNode namespaceName = ctx.namespaceName().Identifier();

        if (!(language instanceof ErrorNode) && !(namespaceName instanceof ErrorNode)) {
            serviceDefinition.setNamespaceImport(language.getText(), namespaceName.getText());
        } else {
            throw new BadInputException(
                String.format("Error at '%s', line %s", ctx.getText(), ctx.getStart().getLine())
            );
        }

        System.out.printf("- namespace import %s for language %s\n", namespaceName, language);

    }

    @Override
    public void enterClassImport(DonkeyParser.ClassImportContext ctx) {
        TerminalNode language = ctx.language().Identifier();
        TerminalNode className = ctx.className().Identifier();

        if (!(language instanceof ErrorNode) && !(className instanceof ErrorNode)) {
            serviceDefinition.addClassImport(language.getText(), className.getText());
        } else {
            throw new BadInputException(
                String.format("Error at '%s', line %s", ctx.getText(), ctx.getStart().getLine())
            );
        }

        System.out.printf("- class import %s for language %s\n", className, language);
    }

    @Override
    public void enterServiceName(DonkeyParser.ServiceNameContext ctx) {
        String serviceName = ctx.Identifier().getText();

        serviceDefinition.setName(serviceName);

        System.out.printf("service name %s\n", serviceName);
    }

    @Override
    public void enterResource(DonkeyParser.ResourceContext ctx) {
        ResourceDefinitionListener resourceDefinitionListener = new ResourceDefinitionListener(this.serviceDefinition);

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(resourceDefinitionListener, ctx);

        serviceDefinition.addResource(resourceDefinitionListener.getResourceDefinition());
    }
}
