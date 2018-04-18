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
import com.upwork.donkey.core.ast.ArgumentDefinition;
import com.upwork.donkey.core.ast.CollectionTypeReference;
import com.upwork.donkey.core.ast.SingularTypeReference;
import com.upwork.donkey.core.parser.antlr.DonkeyParser;

public class ArgumentDefinitionListener extends BaseListener {

    ArgumentDefinition argumentDefinition = new ArgumentDefinition();

    public ArgumentDefinition getArgumentDefinition() {
        return argumentDefinition;
    }

    @Override
    public void enterMethodArgument(DonkeyParser.MethodArgumentContext ctx) {
        String kind = ctx.HTTPMethodArgumentType().getText();

        switch (kind) {
            case "queryParam":
                argumentDefinition.setQueryParam(true);
                break;
            case "pathParam":
                argumentDefinition.setPathParam(true);
                break;
            case "requestBody":
                argumentDefinition.setRequestBody(true);
                break;
            default:
                throw new BadInputException("Invalid argument kind " + kind);
        }

        DonkeyParser.CollectionTypeReferenceContext collectionTypeReference = ctx.methodArgumentTypeReference().collectionTypeReference();

        if (collectionTypeReference != null) {
            String collectionType = collectionTypeReference.CollectionType().getText();
            if (!argumentDefinition.isQueryParam()) {
                throw new BadInputException(String.format(
                        "Usage of '%s' collection is not allowed with '%s'",
                        collectionType, kind
                ));
            }

            argumentDefinition.setType(
                    new CollectionTypeReference(collectionType, buildSingularTypeReference(collectionTypeReference.singularTypeReference()))
            );
        } else {
            argumentDefinition.setType(buildSingularTypeReference(ctx.methodArgumentTypeReference().singularTypeReference()));
        }

        String name = ctx.Identifier().getText();

        argumentDefinition.setName(name);

        System.out.printf("--- argument %s, kind %s\n", name, kind);

    }

    @Override
    public void enterDefaultValue(DonkeyParser.DefaultValueContext ctx) {
        String text = ctx.Literal().getText();
        // stripping leading and trailing " or ' which are defined by Literal in .g4
        argumentDefinition.setDefaultValue(text.substring(1, text.length() - 1));

        System.out.printf("--- default value %s\n", text);
    }

    @Override
    public void enterMethodArgumentDoc(DonkeyParser.MethodArgumentDocContext ctx) {
        String doc = trimEmbeddedDocDelimiter(ctx.getText());
        argumentDefinition.setDoc(doc);

        System.out.printf("--- argument doc comment\n");

    }

    private SingularTypeReference buildSingularTypeReference(DonkeyParser.SingularTypeReferenceContext singularTypeReferenceContext) {
        return new SingularTypeReference(
                singularTypeReferenceContext.getText(),
                isPrimitiveType(singularTypeReferenceContext)
        );
    }
}
