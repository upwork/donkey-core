// Copyright 2018 Upwork Global Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

grammar Donkey;

document            : (definition)* EOF;

definition        : namespace | namespaceImport| classImport | resource | exception | serviceName;

singularTypeReference : PrimitiveType | Identifier;
collectionTypeReference: CollectionType '<' singularTypeReference '>';
methodArgumentTypeReference: singularTypeReference | collectionTypeReference;

namespace               : 'namespace' language namespaceName EndOfLine;
namespaceImport         : 'import namespace' language namespaceName EndOfLine;
classImport             : 'import class' language className EndOfLine;
language                : Identifier; // arbitrary programming languages are supported as long as generators support them
namespaceName           : Identifier;
className               : Identifier;

serviceName       : 'serviceName' Identifier EndOfLine;

resource           : resourceDoc? 'resource' Identifier resourceDefaultUrl? StartCurlyBracket methodDef+ EndCurlyBracket;
resourceDefaultUrl : Literal;

methodDef          : methodDoc? HTTPMethod methodUrl? methodReturnType methodSignature methodThrows? ';' methodReturnDoc?;

methodUrl          : Literal;
methodReturnType   : 'void' | singularTypeReference;
methodSignature    : Identifier '(' methodArgument? (',' methodArgument)* ')';
methodArgument     : HTTPMethodArgumentType defaultValue? methodArgumentTypeReference Identifier methodArgumentDoc?;
defaultValue       : 'default' Literal; // default value only makes sense for optional query parameters
methodThrows       : 'throws' Identifier (',' Identifier)*;

resourceDoc        : LineDoc+;
methodDoc          : LineDoc+;
methodReturnDoc    : EmbeddedDoc;
methodArgumentDoc  : EmbeddedDoc;

//http status and error code specific for exception
exception         : 'exception' Identifier IntConstant exceptionStatus?;
exceptionStatus   : '('IntConstant')';

HTTPMethodArgumentType: 'queryParam' | 'pathParam' | 'requestBody';
HTTPMethod        : 'PUT' | 'GET' | 'POST' | 'PATCH' | 'DELETE';
PrimitiveType          : 'bool' | 'byte' | 'i16' | 'i32' | 'i64' | 'double' | 'string';
CollectionType     : 'list';
StartCurlyBracket : '{';
EndCurlyBracket   : '}';
Identifier        : [a-zA-Z_] [a-zA-Z_0-9.\\\-]*;
IntConstant       : ('+' | '-')? [0-9]+;
Literal           : ('"' (~'"')* '"') | ('\'' (~'\'')* '\'');
LineDoc           : '##' (~'\n')*;
EmbeddedDoc       : '#' (~'#')* '#';
EndOfLine         : '\n';

WS                : [ \t\r\n]+ -> skip ;
COMMENT           : '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT      : ('//') ~'\n'* '\n' -> channel(HIDDEN) ;