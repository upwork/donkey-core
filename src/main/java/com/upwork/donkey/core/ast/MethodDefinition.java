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
package com.upwork.donkey.core.ast;

import com.upwork.donkey.core.BadInputException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodDefinition {
    private String name;
    private String path;
    private String httpMethod;
    private SingularTypeReference returnType;

    private List<String> throwableExceptions = new ArrayList<>();
    private List<ArgumentDefinition> argumentDefinitions = new ArrayList<>();
    private List<String> doc;
    private String returnDoc;

    private boolean withPathParams = false;

    private ResourceDefinition resourceDefinition;

    public MethodDefinition(ResourceDefinition resourceDefinition) {
        this.resourceDefinition = resourceDefinition;
    }

    public ResourceDefinition getResourceDefinition() {
        return resourceDefinition;
    }

    public List<String> getThrowableExceptions() {
        return throwableExceptions;
    }

    public void setThrowableExceptions(List<String> throwableExceptions) {
        throwableExceptions.stream().forEach(exceptionReference -> {
            if (resourceDefinition.getServiceDefinition().getExceptionDefinitions().stream().noneMatch(
                    definition -> definition.getClassName().equals(exceptionReference))) {
                throw new BadInputException("No exception definition found for " + exceptionReference);
            }
        });
        this.throwableExceptions = throwableExceptions;
    }

    public void addArgument(ArgumentDefinition argumentDefinition) {
        if (argumentDefinitions.stream().anyMatch(definition -> definition.getName().equals(argumentDefinition.getName()))) {
            throw new BadInputException("Multiple definitions of argument with name " + argumentDefinition.getName());
        }
        argumentDefinitions.add(argumentDefinition);
        if (argumentDefinition.isPathParam()) {
            withPathParams = true;
        }
    }

    public boolean isWithPathParams() {
        return withPathParams;
    }

    public List<ArgumentDefinition> getArgumentDefinitions() {
        return argumentDefinitions;
    }

    public boolean isWithRequiredParams() {
        return !getRequiredArgumentDefinitions().isEmpty();
    }

    public boolean isWithOptionalParams() {
        return !getOptionalArgumentDefinitions().isEmpty();
    }

    public boolean isWithBodyParam() {
        return getArgumentDefinitions().stream().anyMatch(ArgumentDefinition::isRequestBody);
    }

    public List<ArgumentDefinition> getRequiredArgumentDefinitions() {
        return argumentDefinitions.stream().filter(argumentDefinition -> !argumentDefinition.isQueryParam())
                .collect(Collectors.toList());
    }

    public List<ArgumentDefinition> getOptionalArgumentDefinitions() {
        return argumentDefinitions.stream().filter(ArgumentDefinition::isQueryParam)
                .collect(Collectors.toList());
    }

    public List<ArgumentDefinition> getPathParams() {
        return argumentDefinitions.stream().filter(ArgumentDefinition::isPathParam).collect(Collectors.toList());
    }

    public List<ArgumentDefinition> getQueryParams() {
        return argumentDefinitions.stream().filter(ArgumentDefinition::isQueryParam).collect(Collectors.toList());
    }

    public ArgumentDefinition getRequestBody() {
        return argumentDefinitions.stream().filter(ArgumentDefinition::isRequestBody).findFirst().orElse(null);
    }

    public List<String> getDoc() {
        return doc;
    }

    public void setDoc(List<String> doc) {
        this.doc = doc;
    }

    public SingularTypeReference getReturnType() {
        return returnType;
    }

    public void setReturnType(SingularTypeReference returnType) {
        this.returnType = returnType;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReturnDoc() {
        return returnDoc;
    }

    public void setReturnDoc(String returnDoc) {
        this.returnDoc = returnDoc;
    }
}
