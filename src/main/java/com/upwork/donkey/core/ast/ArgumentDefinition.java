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

public class ArgumentDefinition {

    private TypeReference type;
    private String defaultValue;
    private String name;

    private boolean queryParam;
    private boolean pathParam;
    private boolean requestBody;

    private String doc;

    public TypeReference getType() {
        return type;
    }

    public void setType(TypeReference type) {
        this.type = type;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public boolean isWithDefaultValue() {
        return defaultValue != null;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isQueryParam() {
        return queryParam;
    }

    public void setQueryParam(boolean queryParam) {
        this.queryParam = queryParam;
    }

    public boolean isPathParam() {
        return pathParam;
    }

    public void setPathParam(boolean pathParam) {
        this.pathParam = pathParam;
    }

    public boolean isRequestBody() {
        return requestBody;
    }

    public void setRequestBody(boolean requestBody) {
        this.requestBody = requestBody;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
}
