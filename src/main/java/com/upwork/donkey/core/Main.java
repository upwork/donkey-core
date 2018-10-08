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

import com.upwork.donkey.core.ast.ServiceDefinition;
import com.upwork.donkey.core.parser.ServiceDefinitionListener;
import com.upwork.donkey.core.parser.antlr.DonkeyLexer;
import com.upwork.donkey.core.parser.antlr.DonkeyParser;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

public class Main {

    public static void main(String[] args) throws Exception {
        Option gOption = new Option("g", "generators", true, "The list of generators to use");
        gOption.setRequired(true);
        Option iOption = new Option("i", "idl", true, "The source IDL file to use");
        iOption.setRequired(true);
        Option oOption = new Option("o", "output", true, "The target output directory for generators");
        oOption.setRequired(true);
        Option generatorOptions = new Option(
                null,
                "generator-properties",
                true,
                "Key-value pairs that will be passed to the generators. Value is optional"
        );
        Options options = new Options();
        options
                .addOption(gOption)
                .addOption(iOption)
                .addOption(oOption)
                .addOption(generatorOptions);
        try {
            CommandLine input = new PosixParser().parse(options, args);
            String pathToIDL = getSourceIdlPath(input);
            String pathToOutputDirectory = input.getOptionValue("o");

            ServiceDefinition serviceDefinition = createServiceDefinition(pathToIDL);

            Map<String, Optional<String>> generatorProperties =
                    new GeneratorPropertiesParser().parse(input.getOptionValue("generator-properties"));

            getGenerators(input).stream().forEach(generator -> {
                System.out.printf("Generating files with %s\n", generator.getClass().getName());
                writeFiles(pathToOutputDirectory, generator.generateSources(serviceDefinition, generatorProperties));
            });

            System.out.println("Generation completed");
        } catch (Exception e) {
            if (e instanceof ParseException || e instanceof BadInputException) {
                System.out.printf("ERROR: %s\n", e.getMessage());
            } else {
                e.printStackTrace();
            }
            new HelpFormatter().printHelp("donkey", options, true);
        }
    }

    private static ServiceDefinition createServiceDefinition(String pathToIDL) throws IOException {
        DonkeyLexer lexer = new DonkeyLexer(new ANTLRFileStream(pathToIDL));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DonkeyParser parser = new DonkeyParser(tokens);
        parser.addErrorListener(
            new BaseErrorListener() {
                @Override
                public void syntaxError(final Recognizer<?, ?> recognizer, final Object offendingSymbol, final int line, final int charPositionInLine, final String msg, final RecognitionException e) {
                    throw new ParseCancellationException(
                        String.format(
                            "Syntax error '%s' at line %d:%d",
                            msg, line, charPositionInLine
                        )
                    );
                }
            }
        );

        ParseTreeWalker walker = new ParseTreeWalker();
        ServiceDefinitionListener serviceDefinitionListener = new ServiceDefinitionListener();
        walker.walk(serviceDefinitionListener, parser.document());

        return serviceDefinitionListener.getServiceDefinition();
    }

    private static List<Generator> getGenerators(CommandLine input) {
        return Arrays.asList(input.getOptionValue("g").trim().split(",")).stream().map(className -> {
            Class<?> clazz;
            try {
                clazz = Class.forName(className);
            } catch (ClassNotFoundException firstAttemptException) {
                // attempting to load the class using default namespace
                try {
                    clazz = Class.forName("com.upwork.donkey.generators." + className);
                } catch (ClassNotFoundException defaultNamespaceException) {
                    throw new BadInputException("Could not find " + className + " generator", firstAttemptException);
                }
            }
            try {
                return (Generator) clazz.newInstance();
            } catch (IllegalAccessException | InstantiationException e) {
                throw new BadInputException("Could not instantiate " + className + " generator", e);
            }
        }).collect(Collectors.toList());
    }

    private static void writeFiles(String outputDirectory, Map<String, String> generatedSourceCodes) {
        for (Map.Entry<String, String> entry : generatedSourceCodes.entrySet()) {

            String outputFileName = outputDirectory + "/" + entry.getKey();
            String sourceCode = entry.getValue();

            File outputFile = new File(outputFileName);
            if (!outputFile.getParentFile().exists()) {
                if (!outputFile.getParentFile().mkdirs()) {
                    throw new BadInputException("Could not create directories to write file " + outputFileName);
                }
            }
            try (BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))) {
                out.write(sourceCode);
                System.out.printf("- file written %s\n", outputFileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static String getSourceIdlPath(CommandLine input) {
        String pathToIdl = input.getOptionValue("i");
        if (Files.notExists(Paths.get(pathToIdl))) {
            throw new BadInputException(pathToIdl + " doesn't exist");
        }
        return pathToIdl;
    }
}
