# AlipayIserviceCcmOlsChatrecordApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayIserviceCcmOlsChatrecordApi.md#query) | **POST** /v3/alipay/iservice/ccm/ols/chatrecord/query | 查询某通在线服务的聊天记录 |


<a name="query"></a>
# **query**
> AlipayIserviceCcmOlsChatrecordQueryResponseModel query(alipayIserviceCcmOlsChatrecordQueryModel)

查询某通在线服务的聊天记录

ISV或商户根据在线服务记录id查询该通对话的聊天记录及相关信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmOlsChatrecordApi;

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

    AlipayIserviceCcmOlsChatrecordApi apiInstance = new AlipayIserviceCcmOlsChatrecordApi(defaultClient);
    AlipayIserviceCcmOlsChatrecordQueryModel alipayIserviceCcmOlsChatrecordQueryModel = new AlipayIserviceCcmOlsChatrecordQueryModel(); // AlipayIserviceCcmOlsChatrecordQueryModel | 
    try {
      AlipayIserviceCcmOlsChatrecordQueryResponseModel result = apiInstance.query(alipayIserviceCcmOlsChatrecordQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmOlsChatrecordApi#query");
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
| **alipayIserviceCcmOlsChatrecordQueryModel** | **AlipayIserviceCcmOlsChatrecordQueryModel**|  | [optional] |

### Return type

**AlipayIserviceCcmOlsChatrecordQueryResponseModel**

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

