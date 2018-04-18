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
import com.upwork.donkey.core.parser.antlr.DonkeyBaseListener;
import com.upwork.donkey.core.parser.antlr.DonkeyParser;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public abstract class BaseListener extends DonkeyBaseListener {
    public static final String EMBEDDED_DOC_DELIMITER = "#";
    public static final String LINE_DOC_DELIMITER = "##";
    private static final Pattern VALID_URI_PATH_PATTERN =
            Pattern.compile("[a-zA-Z0-9\\.\\-_~!\\$&'\\(\\)\\*\\+,;=:@%/\\{\\}]+");


    protected String trimEmbeddedDocDelimiter(String embeddedDoc) {
        if (!embeddedDoc.startsWith(EMBEDDED_DOC_DELIMITER) || !embeddedDoc.endsWith(EMBEDDED_DOC_DELIMITER)) {
            throw new BadInputException("Doc should be started and ended with " + EMBEDDED_DOC_DELIMITER);
        }
        return embeddedDoc.substring(EMBEDDED_DOC_DELIMITER.length(), embeddedDoc.length() - EMBEDDED_DOC_DELIMITER.length());
    }

    protected String trimLineDocDelimiter(String lineDoc) {
        // sanity check
        if (!lineDoc.startsWith(LINE_DOC_DELIMITER)) {
            throw new BadInputException("Doc should start with " + LINE_DOC_DELIMITER);
        }
        return lineDoc.substring(LINE_DOC_DELIMITER.length(), lineDoc.length());
    }

    protected void checkPathIsValid(String path) {
        if (!VALID_URI_PATH_PATTERN.matcher(path).matches()) {
            throw new BadInputException("Path " + path + " has invalid characters");
        }
    }

    protected String trimPath(String path) {
        String strippedPath = StringUtils.strip(path, "\"\'");
        checkPathIsValid(strippedPath);
        return strippedPath;
    }

    protected boolean isPrimitiveType(DonkeyParser.SingularTypeReferenceContext singularTypeReferenceContext) {
        return singularTypeReferenceContext.PrimitiveType() != null;
    }
}
