# tasks-rest-client

OpenAPI definition
- API version: v0
  - Build date: 2024-01-14T11:17:44.966882440Z[Etc/UTC]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>net.internalerror</groupId>
  <artifactId>tasks-rest-client</artifactId>
  <version>1.0.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'tasks-rest-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'tasks-rest-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "net.internalerror:tasks-rest-client:1.0.0-SNAPSHOT"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/tasks-rest-client-1.0.0-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import net.internalerror.invoker.ApiClient;
import net.internalerror.invoker.ApiException;
import net.internalerror.invoker.Configuration;
import net.internalerror.invoker.models.*;
import net.internalerror.api.AuthControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AuthControllerApi apiInstance = new AuthControllerApi(defaultClient);
    LoginRequest loginRequest = new LoginRequest(); // LoginRequest | 
    try {
      LoginResponse result = apiInstance.login(loginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthControllerApi#login");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthControllerApi* | [**login**](docs/AuthControllerApi.md#login) | **POST** /api/auth/login | 
*AuthControllerApi* | [**register**](docs/AuthControllerApi.md#register) | **POST** /api/auth/register | 
*TaskControllerApi* | [**create**](docs/TaskControllerApi.md#create) | **POST** /api/task/create | 
*TaskControllerApi* | [**delete**](docs/TaskControllerApi.md#delete) | **POST** /api/task/delete | 
*TaskControllerApi* | [**read**](docs/TaskControllerApi.md#read) | **POST** /api/task/read | 
*TaskControllerApi* | [**readAll**](docs/TaskControllerApi.md#readAll) | **POST** /api/task/read-all | 
*TaskControllerApi* | [**readDue**](docs/TaskControllerApi.md#readDue) | **POST** /api/task/read-due | 
*TaskControllerApi* | [**update1**](docs/TaskControllerApi.md#update1) | **POST** /api/task/update | 
*UserControllerApi* | [**update**](docs/UserControllerApi.md#update) | **POST** /api/user/update | 


## Documentation for Models

 - [CreateTaskRequest](docs/CreateTaskRequest.md)
 - [CreateTaskResponse](docs/CreateTaskResponse.md)
 - [DeleteTaskRequest](docs/DeleteTaskRequest.md)
 - [DeleteTaskResponse](docs/DeleteTaskResponse.md)
 - [DueInfo](docs/DueInfo.md)
 - [DueInfoUnit](docs/DueInfoUnit.md)
 - [DueInfoUnitDuration](docs/DueInfoUnitDuration.md)
 - [DueInfoUnitDurationUnitsInner](docs/DueInfoUnitDurationUnitsInner.md)
 - [LoginRequest](docs/LoginRequest.md)
 - [LoginResponse](docs/LoginResponse.md)
 - [ReadAllTaskRequest](docs/ReadAllTaskRequest.md)
 - [ReadAllTaskResponse](docs/ReadAllTaskResponse.md)
 - [ReadDueTaskRequest](docs/ReadDueTaskRequest.md)
 - [ReadDueTaskResponse](docs/ReadDueTaskResponse.md)
 - [ReadTaskRequest](docs/ReadTaskRequest.md)
 - [ReadTaskResponse](docs/ReadTaskResponse.md)
 - [RegisterRequest](docs/RegisterRequest.md)
 - [RegisterResponse](docs/RegisterResponse.md)
 - [TaskInfo](docs/TaskInfo.md)
 - [UpdateTaskRequest](docs/UpdateTaskRequest.md)
 - [UpdateTaskResponse](docs/UpdateTaskResponse.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)
 - [UpdateUserResponse](docs/UpdateUserResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



