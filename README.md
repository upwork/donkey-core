## What is donkey


Donkey is DSL for defining RESTful services and code generation tool. Donkey "maps" the business logic of your microservice to HTTP semantics, making the application available as a RESTful service:

```
## API for managing users
resource Users "/users" {

    GET "/{name}" User getUser(pathParam string name) throws UserNotFoundException;

    POST void addUser(requestBody User user, headerParam headerName(some.header.name) string someHeader);

    ## Search for users registered at a given address
    POST "/search-by-addresses" UserList searchUsersByAddress(requestBody Address address)
        throws AddressMalformedException;
}
```

With Donkey code generator, you can create a client from the IDL file for any programming language or framework. See examples for Java (Springboot) and PHP (Symfony4, Guzzle) [here](http://github.com/upwork/donkey-example).

We have used Donkey at [Upwork](http://upwork.com) to support our microservice architecture. We enjoy qualities of [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) and its simplicity, while using Donkey allows us to evolve infrastructure rapidly, by fully decoupling service contract from implementation details.

## Donkey IDL reference

See [REFERENCE.md](REFERENCE.md) for complete Donkey IDL reference

## Installation and CLI

`donkey-core` provides the DSL and the generic mechanism for code generation. For data types there are plenty of good solutions that you can re-use, such as Apache Thrift. For the RESTful service and client, however, it depends on your framework of choice and various infrastructure detail specific to your company and your project. For that reason, the actual generators need to be implemented by you.

### Build a custom CLI tool with Donkey

This is what we do at Upwork. We set up a maven project called "donkey-upwork" with Upwork specific generators (for different Java frameworks and for PHP frontend). Donkey is included as a library:

```
    <groupId>com.upwork.donkey</groupId>
    <artifactId>donkey-upwork</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>com.upwork.donkey</groupId>
            <artifactId>donkey-core</artifactId>
            <version>0.1</version>
        </dependency>
```

we set Donkey's Main class as the entry point for the application:

```
<build>
<plugins>
    <plugin>
        <inherited>true</inherited>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-shade-plugin</artifactId>
        <executions>
            <execution>
                <phase>package</phase>
                <goals>
                    <goal>shade</goal>
                </goals>
                <configuration>
                    <transformers>
                        <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                            <mainClass>com.upwork.donkey.core.Main</mainClass>
                        </transformer>
                    </transformers>
                </configuration>
            </execution>
        </executions>
    </plugin>
    ...
```
which allows us to generate code from the command line as follows:

```
java -jar donkey-upwork-1.0.jar -i ./service.idl -o ./ -g com.upwork.donkey.generators.ClientGenerator
```

## Contribution

For bugs, questions and discussions please use the [GitHub Issues](https://github.com/upwork/donkey-core/issues).

Donkey grammar is based on Donkey.g4 file and uses ANTLR v4.6 parser generated based on that grammar. Use `antlr4 Donkey.g4 -o ../../java/com/upwork/donkey/core/parser/antlr -package com.upwork.donkey.core.parser.antlr` to generate parser classes if you changed Donkey.g4 grammar. Get `antlr4` as per instructions [here](http://www.antlr.org)

## LICENSE

Copyright 2018 Upwork Global Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

<http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
