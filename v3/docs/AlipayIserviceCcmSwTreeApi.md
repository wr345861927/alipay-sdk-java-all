# AlipayIserviceCcmSwTreeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayIserviceCcmSwTreeApi.md#batchquery) | **POST** /v3/alipay/iservice/ccm/sw/tree/batchquery | 知识库-类目-批量查询 |
| [**create**](AlipayIserviceCcmSwTreeApi.md#create) | **POST** /v3/alipay/iservice/ccm/sw/tree/create | 知识库-类目-创建 |
| [**delete**](AlipayIserviceCcmSwTreeApi.md#delete) | **POST** /v3/alipay/iservice/ccm/sw/tree/delete | 知识库-类目-删除 |
| [**get**](AlipayIserviceCcmSwTreeApi.md#get) | **POST** /v3/alipay/iservice/ccm/sw/tree/get | 知识库-类目-获取 |
| [**modify**](AlipayIserviceCcmSwTreeApi.md#modify) | **POST** /v3/alipay/iservice/ccm/sw/tree/modify | 知识库-类目-修改 |
| [**publish**](AlipayIserviceCcmSwTreeApi.md#publish) | **POST** /v3/alipay/iservice/ccm/sw/tree/publish | 知识库-类目-发布 |


<a name="batchquery"></a>
# **batchquery**
> AlipayIserviceCcmSwTreeBatchqueryResponseModel batchquery(alipayIserviceCcmSwTreeBatchqueryModel)

知识库-类目-批量查询

知识库-类目-批量查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwTreeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");
    // 设置alipayConfig参数（全局设置一次）
    AlipayConfig config = new AlipayConfig();
    config.setAppId("app_id");
    config.setPrivateKey("private_key");
    config.setAlipayPublicKey("alipay_public_key");
    config.setEncryptKey("encrypt_key");
    defaultClient.setAlipayConfig(config);

    AlipayIserviceCcmSwTreeApi apiInstance = new AlipayIserviceCcmSwTreeApi(defaultClient);
    AlipayIserviceCcmSwTreeBatchqueryModel alipayIserviceCcmSwTreeBatchqueryModel = new AlipayIserviceCcmSwTreeBatchqueryModel(); // AlipayIserviceCcmSwTreeBatchqueryModel | 
    try {
      AlipayIserviceCcmSwTreeBatchqueryResponseModel result = apiInstance.batchquery(alipayIserviceCcmSwTreeBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwTreeApi#batchquery");
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
| **alipayIserviceCcmSwTreeBatchqueryModel** | **AlipayIserviceCcmSwTreeBatchqueryModel**|  | [optional] |

### Return type

**AlipayIserviceCcmSwTreeBatchqueryResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="create"></a>
# **create**
> AlipayIserviceCcmSwTreeCreateResponseModel create(alipayIserviceCcmSwTreeCreateModel)

知识库-类目-创建

知识库-类目-创建

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwTreeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");
    // 设置alipayConfig参数（全局设置一次）
    AlipayConfig config = new AlipayConfig();
    config.setAppId("app_id");
    config.setPrivateKey("private_key");
    config.setAlipayPublicKey("alipay_public_key");
    config.setEncryptKey("encrypt_key");
    defaultClient.setAlipayConfig(config);

    AlipayIserviceCcmSwTreeApi apiInstance = new AlipayIserviceCcmSwTreeApi(defaultClient);
    AlipayIserviceCcmSwTreeCreateModel alipayIserviceCcmSwTreeCreateModel = new AlipayIserviceCcmSwTreeCreateModel(); // AlipayIserviceCcmSwTreeCreateModel | 
    try {
      AlipayIserviceCcmSwTreeCreateResponseModel result = apiInstance.create(alipayIserviceCcmSwTreeCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwTreeApi#create");
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
| **alipayIserviceCcmSwTreeCreateModel** | **AlipayIserviceCcmSwTreeCreateModel**|  | [optional] |

### Return type

**AlipayIserviceCcmSwTreeCreateResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="delete"></a>
# **delete**
> Object delete(alipayIserviceCcmSwTreeDeleteModel)

知识库-类目-删除

知识库-类目-删除

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwTreeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");
    // 设置alipayConfig参数（全局设置一次）
    AlipayConfig config = new AlipayConfig();
    config.setAppId("app_id");
    config.setPrivateKey("private_key");
    config.setAlipayPublicKey("alipay_public_key");
    config.setEncryptKey("encrypt_key");
    defaultClient.setAlipayConfig(config);

    AlipayIserviceCcmSwTreeApi apiInstance = new AlipayIserviceCcmSwTreeApi(defaultClient);
    AlipayIserviceCcmSwTreeDeleteModel alipayIserviceCcmSwTreeDeleteModel = new AlipayIserviceCcmSwTreeDeleteModel(); // AlipayIserviceCcmSwTreeDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayIserviceCcmSwTreeDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwTreeApi#delete");
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
| **alipayIserviceCcmSwTreeDeleteModel** | **AlipayIserviceCcmSwTreeDeleteModel**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="get"></a>
# **get**
> AlipayIserviceCcmSwTreeGetResponseModel get(alipayIserviceCcmSwTreeGetModel)

知识库-类目-获取

知识库-类目-获取

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwTreeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");
    // 设置alipayConfig参数（全局设置一次）
    AlipayConfig config = new AlipayConfig();
    config.setAppId("app_id");
    config.setPrivateKey("private_key");
    config.setAlipayPublicKey("alipay_public_key");
    config.setEncryptKey("encrypt_key");
    defaultClient.setAlipayConfig(config);

    AlipayIserviceCcmSwTreeApi apiInstance = new AlipayIserviceCcmSwTreeApi(defaultClient);
    AlipayIserviceCcmSwTreeGetModel alipayIserviceCcmSwTreeGetModel = new AlipayIserviceCcmSwTreeGetModel(); // AlipayIserviceCcmSwTreeGetModel | 
    try {
      AlipayIserviceCcmSwTreeGetResponseModel result = apiInstance.get(alipayIserviceCcmSwTreeGetModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwTreeApi#get");
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
| **alipayIserviceCcmSwTreeGetModel** | **AlipayIserviceCcmSwTreeGetModel**|  | [optional] |

### Return type

**AlipayIserviceCcmSwTreeGetResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="modify"></a>
# **modify**
> Object modify(alipayIserviceCcmSwTreeModifyModel)

知识库-类目-修改

知识库-类目-修改

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwTreeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");
    // 设置alipayConfig参数（全局设置一次）
    AlipayConfig config = new AlipayConfig();
    config.setAppId("app_id");
    config.setPrivateKey("private_key");
    config.setAlipayPublicKey("alipay_public_key");
    config.setEncryptKey("encrypt_key");
    defaultClient.setAlipayConfig(config);

    AlipayIserviceCcmSwTreeApi apiInstance = new AlipayIserviceCcmSwTreeApi(defaultClient);
    AlipayIserviceCcmSwTreeModifyModel alipayIserviceCcmSwTreeModifyModel = new AlipayIserviceCcmSwTreeModifyModel(); // AlipayIserviceCcmSwTreeModifyModel | 
    try {
      Object result = apiInstance.modify(alipayIserviceCcmSwTreeModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwTreeApi#modify");
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
| **alipayIserviceCcmSwTreeModifyModel** | **AlipayIserviceCcmSwTreeModifyModel**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="publish"></a>
# **publish**
> Object publish(alipayIserviceCcmSwTreePublishModel)

知识库-类目-发布

知识库-类目-发布

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwTreeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");
    // 设置alipayConfig参数（全局设置一次）
    AlipayConfig config = new AlipayConfig();
    config.setAppId("app_id");
    config.setPrivateKey("private_key");
    config.setAlipayPublicKey("alipay_public_key");
    config.setEncryptKey("encrypt_key");
    defaultClient.setAlipayConfig(config);

    AlipayIserviceCcmSwTreeApi apiInstance = new AlipayIserviceCcmSwTreeApi(defaultClient);
    AlipayIserviceCcmSwTreePublishModel alipayIserviceCcmSwTreePublishModel = new AlipayIserviceCcmSwTreePublishModel(); // AlipayIserviceCcmSwTreePublishModel | 
    try {
      Object result = apiInstance.publish(alipayIserviceCcmSwTreePublishModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwTreeApi#publish");
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
| **alipayIserviceCcmSwTreePublishModel** | **AlipayIserviceCcmSwTreePublishModel**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

