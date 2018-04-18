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

public class CollectionTypeReference implements TypeReference {
    private final String collectionType;
    private final SingularTypeReference elementType;

    public CollectionTypeReference(String collectionType, SingularTypeReference elementType) {
        this.collectionType = collectionType;
        this.elementType = elementType;
    }

    public String getCollectionType() {
        return collectionType;
    }

    public SingularTypeReference getElementType() {
        return elementType;
    }
}
