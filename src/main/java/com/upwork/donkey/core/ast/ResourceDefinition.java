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

public class ResourceDefinition {
    private String name;
    private List<MethodDefinition> methodDefinitions = new ArrayList<>();
    private String basePath;
    private List<String> doc;

    private ServiceDefinition serviceDefinition;

    public ResourceDefinition(ServiceDefinition serviceDefinition) {
        this.serviceDefinition = serviceDefinition;
    }

    public ServiceDefinition getServiceDefinition() {
        return serviceDefinition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMethod(MethodDefinition methodDefinition) {
        if (methodDefinitions.stream().anyMatch(definition -> definition.getName().equals(methodDefinition.getName()))) {
            throw new BadInputException("Multiple definitions of method with name " + methodDefinition.getName());
        }
        methodDefinitions.add(methodDefinition);
    }

    public List<MethodDefinition> getMethodDefinitions() {
        return methodDefinitions;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public List<String> getDoc() {
        return doc;
    }

    public void setDoc(List<String> doc) {
        this.doc = doc;
    }
}
