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
package com.upwork.donkey.core;

import org.apache.commons.cli.ParseException;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GeneratorPropertiesParser {
    public Map<String, Optional<String>> parse(String generatorPropertiesString) throws ParseException {
        Map<String, Optional<String>> generatorPropertiesMap = new HashMap<>();

        if (StringUtils.isBlank(generatorPropertiesString)) {
            return generatorPropertiesMap;
        }

        String[] keyValuePairs = generatorPropertiesString.split("(?<!\\\\),");
        for (String keyValuePair : keyValuePairs) {
            String[] keyAndValue = keyValuePair.replace("\\,", ",").split("(?<!\\\\)=");
            String key = keyAndValue[0].replace("\\=", "=");
            if (StringUtils.isBlank(key)) {
                throw new ParseException("Syntax error in generator properties. Missing key.");
            }

            Optional<String> value = Optional.empty();
            if (keyAndValue.length > 1 && StringUtils.isNotBlank(keyAndValue[1])) {
                value = Optional.of(keyAndValue[1].replace("\\=", "="));
            }

            generatorPropertiesMap.put(key, value);
        }

        return generatorPropertiesMap;
    }
}
