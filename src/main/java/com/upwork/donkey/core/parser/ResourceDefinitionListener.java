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

import com.upwork.donkey.core.ast.ResourceDefinition;
import com.upwork.donkey.core.ast.ServiceDefinition;
import com.upwork.donkey.core.parser.antlr.DonkeyParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;
import java.util.stream.Collectors;

public class ResourceDefinitionListener extends BaseListener {

    private ResourceDefinition resourceDefinition;

    public ResourceDefinitionListener(ServiceDefinition serviceDefinition) {
        this.resourceDefinition = new ResourceDefinition(serviceDefinition);
    }

    public ResourceDefinition getResourceDefinition() {
        return resourceDefinition;
    }

    @Override
    public void enterResource(DonkeyParser.ResourceContext ctx) {
        String resourceName = ctx.Identifier().getText();

        resourceDefinition.setName(resourceName);

        System.out.printf("- resource name %s\n", resourceName);
    }

    @Override
    public void enterResourceDefaultUrl(DonkeyParser.ResourceDefaultUrlContext ctx) {
        String basePath = trimPath(ctx.getText());

        resourceDefinition.setBasePath(basePath);

        System.out.printf("-- resource base path %s\n", basePath);
    }

    @Override
    public void enterResourceDoc(DonkeyParser.ResourceDocContext ctx) {
        if (ctx == null || ctx.LineDoc().isEmpty()) {
            return;
        }

        List<String> lines = ctx.LineDoc().stream().map(docNode -> trimLineDocDelimiter(docNode.getText())).collect(Collectors.toList());
        resourceDefinition.setDoc(lines);

        System.out.printf("-- resource doc block, %d lines of text\n", ctx.LineDoc().size());
    }

    @Override
    public void enterMethodDef(DonkeyParser.MethodDefContext ctx) {
        MethodDefinitionListener methodListener = new MethodDefinitionListener(this.resourceDefinition);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(methodListener, ctx);
        resourceDefinition.addMethod(methodListener.getMethodDefinition());
    }
}
