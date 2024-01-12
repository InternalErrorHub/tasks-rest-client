# TaskControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](TaskControllerApi.md#create) | **POST** /api/task/create |  |
| [**delete**](TaskControllerApi.md#delete) | **POST** /api/task/delete |  |
| [**read**](TaskControllerApi.md#read) | **POST** /api/task/read |  |
| [**readAll**](TaskControllerApi.md#readAll) | **POST** /api/task/read-all |  |
| [**readDue**](TaskControllerApi.md#readDue) | **POST** /api/task/read-due |  |
| [**update1**](TaskControllerApi.md#update1) | **POST** /api/task/update |  |


<a id="create"></a>
# **create**
> CreateTaskResponse create(createTaskRequest)



### Example
```java
// Import classes:
import net.internalerror.invoker.ApiClient;
import net.internalerror.invoker.ApiException;
import net.internalerror.invoker.Configuration;
import net.internalerror.invoker.models.*;
import net.internalerror.api.TaskControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    TaskControllerApi apiInstance = new TaskControllerApi(defaultClient);
    CreateTaskRequest createTaskRequest = new CreateTaskRequest(); // CreateTaskRequest | 
    try {
      CreateTaskResponse result = apiInstance.create(createTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskControllerApi#create");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createTaskRequest** | [**CreateTaskRequest**](CreateTaskRequest.md)|  | |

### Return type

[**CreateTaskResponse**](CreateTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="delete"></a>
# **delete**
> DeleteTaskResponse delete(deleteTaskRequest)



### Example
```java
// Import classes:
import net.internalerror.invoker.ApiClient;
import net.internalerror.invoker.ApiException;
import net.internalerror.invoker.Configuration;
import net.internalerror.invoker.models.*;
import net.internalerror.api.TaskControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    TaskControllerApi apiInstance = new TaskControllerApi(defaultClient);
    DeleteTaskRequest deleteTaskRequest = new DeleteTaskRequest(); // DeleteTaskRequest | 
    try {
      DeleteTaskResponse result = apiInstance.delete(deleteTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskControllerApi#delete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteTaskRequest** | [**DeleteTaskRequest**](DeleteTaskRequest.md)|  | |

### Return type

[**DeleteTaskResponse**](DeleteTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="read"></a>
# **read**
> ReadTaskResponse read(readTaskRequest)



### Example
```java
// Import classes:
import net.internalerror.invoker.ApiClient;
import net.internalerror.invoker.ApiException;
import net.internalerror.invoker.Configuration;
import net.internalerror.invoker.models.*;
import net.internalerror.api.TaskControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    TaskControllerApi apiInstance = new TaskControllerApi(defaultClient);
    ReadTaskRequest readTaskRequest = new ReadTaskRequest(); // ReadTaskRequest | 
    try {
      ReadTaskResponse result = apiInstance.read(readTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskControllerApi#read");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **readTaskRequest** | [**ReadTaskRequest**](ReadTaskRequest.md)|  | |

### Return type

[**ReadTaskResponse**](ReadTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readAll"></a>
# **readAll**
> ReadAllTaskResponse readAll(readAllTaskRequest)



### Example
```java
// Import classes:
import net.internalerror.invoker.ApiClient;
import net.internalerror.invoker.ApiException;
import net.internalerror.invoker.Configuration;
import net.internalerror.invoker.models.*;
import net.internalerror.api.TaskControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    TaskControllerApi apiInstance = new TaskControllerApi(defaultClient);
    ReadAllTaskRequest readAllTaskRequest = new ReadAllTaskRequest(); // ReadAllTaskRequest | 
    try {
      ReadAllTaskResponse result = apiInstance.readAll(readAllTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskControllerApi#readAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **readAllTaskRequest** | [**ReadAllTaskRequest**](ReadAllTaskRequest.md)|  | |

### Return type

[**ReadAllTaskResponse**](ReadAllTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readDue"></a>
# **readDue**
> ReadDueTaskResponse readDue(readDueTaskRequest)



### Example
```java
// Import classes:
import net.internalerror.invoker.ApiClient;
import net.internalerror.invoker.ApiException;
import net.internalerror.invoker.Configuration;
import net.internalerror.invoker.models.*;
import net.internalerror.api.TaskControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    TaskControllerApi apiInstance = new TaskControllerApi(defaultClient);
    ReadDueTaskRequest readDueTaskRequest = new ReadDueTaskRequest(); // ReadDueTaskRequest | 
    try {
      ReadDueTaskResponse result = apiInstance.readDue(readDueTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskControllerApi#readDue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **readDueTaskRequest** | [**ReadDueTaskRequest**](ReadDueTaskRequest.md)|  | |

### Return type

[**ReadDueTaskResponse**](ReadDueTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="update1"></a>
# **update1**
> UpdateTaskResponse update1(updateTaskRequest)



### Example
```java
// Import classes:
import net.internalerror.invoker.ApiClient;
import net.internalerror.invoker.ApiException;
import net.internalerror.invoker.Configuration;
import net.internalerror.invoker.models.*;
import net.internalerror.api.TaskControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    TaskControllerApi apiInstance = new TaskControllerApi(defaultClient);
    UpdateTaskRequest updateTaskRequest = new UpdateTaskRequest(); // UpdateTaskRequest | 
    try {
      UpdateTaskResponse result = apiInstance.update1(updateTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskControllerApi#update1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateTaskRequest** | [**UpdateTaskRequest**](UpdateTaskRequest.md)|  | |

### Return type

[**UpdateTaskResponse**](UpdateTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

