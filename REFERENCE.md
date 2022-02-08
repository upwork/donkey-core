## Donkey IDL Reference

Consider contract definition for a service, called "users":

```
serviceName users

namespace java com.upwork.sample.users
namespace php Upwork.Sample.Users

import namespace java com.upwork.donkey.sample.users.thrift
import namespace php Upwork.Services.Thrift.Sample.Users

import class java com.upwork.donkey.sample.address.thrift.TAddress
import class php Upwork.Services.Thrift.Sample.Address.TAddress

exception UserNotFoundException 1 (404)
exception InvalidUserTypeException 2
exception AddressMalformedException 3

## Provides API to manage users
resource Users "/users" {

    ## Updates a user by name
    PUT "/{name}" void updateUser(pathParam string name, requestBody TUser user)
        throws UserNotFoundException;

    ## Finds and returns users
    GET "/{userType}" TUserList getUsers(
        pathParam string userType,
        queryParam string userFirstName # first name #,
        queryParam default "ACTIVE" list<TUserStatus> userStatus # filters in users having any status from the list #,
        queryParam list<i32> userAge # filters in users having any age from the list #,
        queryParam default "0" i32 offset # offset #,
        queryParam default "10" i32 limit # limit #,
        headerParam headerName(auth) string authenticationHeader
    ) throws InvalidUserTypeException;

    ## Finds and returns one user
    GET "/{name}" TUser getUser(
        pathParam string name # name #
    ) throws UserNotFoundException;

    POST void addUser(requestBody TUser user);

    ## Search for users registered at a given address
    POST "/search-by-addresses" TUserList searchUsersByAddress(requestBody TAddress address)
        throws AddressMalformedException;
        #List of users registered at this address (return type doc example)#
}
```

Donkey does not include DSL for data types definition nor transfer protocol for them. Any framework can be used for that, or no framework at all.

We at Upwork use [Apache Thrift](https://thrift.apache.org/).

### serviceName

Can be used for service discovery, e.g. to read host:port from a configuration file or via auto-discovery tool, such as eureka.

### namespace

namespace is programming language specific, [works as in Apache Thrift](https://thrift.apache.org/docs/idl#namespace): creates classes with specified namespace while creating folder structure accordingly.

### import namespace

Programming language specific. Imports a whole package with data types.

### import class

Programming language specific. Imports one data type.

### exception

Each input/user error needs to be defined as an exception in this block. Providing a specific HTTP status code is optional, by default 400 is used. An internal error code is assigned to each exception to uniquely identify them on the server and all clients.

**Note**. When something goes wrong with the request, the client needs to know which one of the possible errors it was in order to process it correctly. In other words, there needs to be a way to read that "internal error code". Similarly to the Data Type transfer protocol, exception handling mechanism must be agreed upon and communicated between client and server. See the following examples

**Example 1:** This is the approach we use at Upwork. Introduce a designated data type to be used for **all** exceptions:

```
class UserError {
    integer internalErrorCode;
    String errorMessage;
}
```

Use this type in all services, in all generators. Whenever you get a 4xx HTTP status code, de-serialize the payload into an instance of UserError. Then, you can use the code to find out the exact exception type:

```
if (error.internalErrorCode == USER_NOT_FOUND_ERROR_CODE) {
    throw new UserNotFoundException(error.errorMessage);
} elseif (error.internalErrorCode == MALFORMED_USER_NAME_ERROR_CODE) {
    throw new MalformedUserNameException(error.errorMessage);
}
```
(actually *throwing* an exception is not a requirement, of course. It can be used in programming languages that support it.)

**Example 2:** Introduce a Data Type for each exception defined in Donkey DSL

```
struct Error {
    int internalErrorCode
    string errorMessage
}

struct UserNotFoundError extends Error {
    string userGovernmentId
}

struct MalformedUserNameError extends Error {
    int syntaxErrorAt
}
```

This approach provides most flexibility: each error is a type of its own with its own data structure. The internal error code may be transferred via a header or made part of the payload in a way that can be read before de-serializing into a specific error data type.


**Example 3:** Use custom serialization for errors, such as JSON.

Some prefer using header "Content-type: application/problem+json" with JSON payload like this:

```
{errorCode: 3, errorMessage: "User was not found"}
```

**Example 4:** Use a header to transfer error code

It's a simplistic example, but you can send the error code via a response header without including any payload at all. In cases when you don't need to transfer a message nor you need additional metadata - the Donkey exception unique identifier is all you need to know what exactly went wrong.


### resource

A RESTful service may provide access to multiple resources, Donkey provides means for grouping them:

In example above, "users" service only has one group of endpoints grouped under “User”, resources for managing users, for example:

```
POST "/search-by-addresses" TUserList searchUsersByAddress(requestBody TAddress address)
   throws AddressMalformedException;
```

Each definition must include:

* HTTP method
* Path. The path may include parameters
* The return value type. Can be void
* The name of the endpoint
* List of parameters
* List of exceptions the endpoint may throw

### Parameters

* **pathParam** - required
* **queryParam** - always optional
* **requestBody**
* **headerParam** - always optional (followed by headerName(someHeaderNameHere)). data type should always be string in this case

### Types

Besides explicitly imported data types, the following primitives are supported:

* string
* bool
* i16
* i32
* i64
* byte
* double

For queryParam, “list” collection type is supported. E.g.:
  queryParam default "ACTIVE" list<TUserStatus> userStatus
This is to pass multiple values for a query parameter, like:
  http://example.com/?myParam=value1&myParam=value2&...

### Doc-blocks

All comments and doc-blocks are included into generated code.

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
