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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceDefinition {
    private String name;

    private Map<String, String> namespaceByLanguage = new HashMap<>();
    private Map<String, String> namespaceImportByLanguage = new HashMap<>();
    private Map<String, List<String>> classImportsByLanguage = new HashMap<>();
    private List<ExceptionDefinition> exceptionDefinitions = new ArrayList<>();
    private List<ResourceDefinition> resourceDefinitions = new ArrayList<>();

    public void addException(ExceptionDefinition exceptionDefinition) {
        if (exceptionDefinitions.contains(exceptionDefinition)) {
            throw new BadInputException("Multiple definitions of exception "
                    + exceptionDefinition.getClassName());
        }
        exceptionDefinitions.add(exceptionDefinition);
    }

    public List<ExceptionDefinition> getExceptionDefinitions() {
        return exceptionDefinitions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getNamespaces() {
        return namespaceByLanguage;
    }

    public void setNamespace(String language, String namespace) {
        if (namespaceByLanguage.containsKey(language)) {
            throw new BadInputException("Namespace for language " + language + " defined multiple times");
        }
        namespaceByLanguage.put(language, namespace);
    }

    public Map<String, String> getNamespaceImports() {
        return namespaceImportByLanguage;
    }

    public void setNamespaceImport(String language, String namespaceImport) {
        if (namespaceImportByLanguage.containsKey(language)) {
            throw new BadInputException("Only one namespace import is allowed for language " + language);
        }
        namespaceImportByLanguage.put(language, namespaceImport);
    }

    public Map<String, List<String>> getClassImports() {
        return classImportsByLanguage;
    }

    public void addClassImport(String language, String classImport) {
        classImportsByLanguage.putIfAbsent(language, new ArrayList<>());
        classImportsByLanguage.get(language).add(classImport);
    }

    public List<ResourceDefinition> getResourceDefinitions() {
        return resourceDefinitions;
    }

    public void addResource(ResourceDefinition resourceDefinition) {
        if (resourceDefinitions.stream().anyMatch(definition -> definition.getName().equals(resourceDefinition.getName()))) {
            throw new BadInputException("Multiple definitions of resource with name " + resourceDefinition.getName());
        }
        resourceDefinitions.add(resourceDefinition);
    }
}
