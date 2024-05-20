/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-05-20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.api;

import com.alipay.v3.ApiCallback;
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.ApiResponse;
import com.alipay.v3.Configuration;
import com.alipay.v3.Pair;
import com.alipay.v3.ProgressRequestBody;
import com.alipay.v3.ProgressResponseBody;
import com.alipay.v3.util.AlipayLogger;
import com.alipay.v3.util.model.CustomizedParams;

import com.google.common.base.Strings;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.alipay.v3.model.ZhimaCustomerJobworthAuthenticationQueryDefaultResponse;
import com.alipay.v3.model.ZhimaCustomerJobworthAuthenticationQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ZhimaCustomerJobworthAuthenticationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZhimaCustomerJobworthAuthenticationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZhimaCustomerJobworthAuthenticationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for query
     * @param connKey 调用第一步创建接口的out_agreement_no，由外部传入 (optional)
     * @param onceToken 查询身份认证结果的凭证，在认证结果到达终态后只允许查询成功一次，若需要再次查询，则需要调用第一个接口再拉起受理台 (optional)
     * @param queryType exact:精确查询,dim:模糊查询 (optional)
     * @param identityType 04:教师，其它身份类型联系芝麻技术支持确认 (optional)
     * @param serviceId 信用服务id，商家接入产品功能包时有运营同学分配 (optional)
     * @param userId 蚂蚁统一会员ID 和身份证任选一个传入 (optional)
     * @param openId 蚂蚁统一会员ID 和身份证任选一个传入 (optional)
     * @param certNo 证件号 (optional)
     * @param certType \&quot;身份证 : 0\&quot;，\&quot;护照: 1\&quot;，\&quot;台湾往来通行证：4\&quot;,\&quot;港澳往来通行证：3\&quot;, \&quot;回乡证: 2\&quot;；\&quot;港澳证件：5\&quot; (optional)
     * @param _callback Callback for upload/download progress
     * @param customizedParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryCall(String connKey, String onceToken, String queryType, String identityType, String serviceId, String userId, String openId, String certNo, String certType, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/zhima/customer/jobworth/authentication";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (connKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("conn_key", connKey));
        }

        if (onceToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("once_token", onceToken));
        }

        if (queryType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query_type", queryType));
        }

        if (identityType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identity_type", identityType));
        }

        if (serviceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("service_id", serviceId));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_id", userId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
        }

        if (certNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cert_no", certNo));
        }

        if (certType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cert_type", certType));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (customizedParams != null) {
            //额外query参数
            if (customizedParams.getQueryParams() != null && customizedParams.getQueryParams().size() > 0) {
                for (Map.Entry<String, String> entry : customizedParams.getQueryParams().entrySet()) {
                    localVarQueryParams.addAll(localVarApiClient.parameterToPair(entry.getKey(), entry.getValue()));
                }
            }

            if (!Strings.isNullOrEmpty(customizedParams.getAppAuthToken())) {
                localVarHeaderParams.put("alipay-app-auth-token", customizedParams.getAppAuthToken());
            }

            //额外非全局header参数
            if (customizedParams.getHeaderParams() != null && customizedParams.getHeaderParams().size() > 0) {
                localVarHeaderParams.putAll(customizedParams.getHeaderParams());
            }
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryValidateBeforeCall(String connKey, String onceToken, String queryType, String identityType, String serviceId, String userId, String openId, String certNo, String certType, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(connKey, onceToken, queryType, identityType, serviceId, userId, openId, certNo, certType, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 职得身份认证查询接口
     * 根据一次性token查询用户身份认证结果
     * @param connKey 调用第一步创建接口的out_agreement_no，由外部传入 (optional)
     * @param onceToken 查询身份认证结果的凭证，在认证结果到达终态后只允许查询成功一次，若需要再次查询，则需要调用第一个接口再拉起受理台 (optional)
     * @param queryType exact:精确查询,dim:模糊查询 (optional)
     * @param identityType 04:教师，其它身份类型联系芝麻技术支持确认 (optional)
     * @param serviceId 信用服务id，商家接入产品功能包时有运营同学分配 (optional)
     * @param userId 蚂蚁统一会员ID 和身份证任选一个传入 (optional)
     * @param openId 蚂蚁统一会员ID 和身份证任选一个传入 (optional)
     * @param certNo 证件号 (optional)
     * @param certType \&quot;身份证 : 0\&quot;，\&quot;护照: 1\&quot;，\&quot;台湾往来通行证：4\&quot;,\&quot;港澳往来通行证：3\&quot;, \&quot;回乡证: 2\&quot;；\&quot;港澳证件：5\&quot; (optional)
     * @return ZhimaCustomerJobworthAuthenticationQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaCustomerJobworthAuthenticationQueryResponseModel query(String connKey, String onceToken, String queryType, String identityType, String serviceId, String userId, String openId, String certNo, String certType) throws ApiException {
        ApiResponse<ZhimaCustomerJobworthAuthenticationQueryResponseModel> localVarResp = queryWithHttpInfo(connKey, onceToken, queryType, identityType, serviceId, userId, openId, certNo, certType, null);
        return localVarResp.getData();
    }

    public ZhimaCustomerJobworthAuthenticationQueryResponseModel query(String connKey, String onceToken, String queryType, String identityType, String serviceId, String userId, String openId, String certNo, String certType, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaCustomerJobworthAuthenticationQueryResponseModel> localVarResp = queryWithHttpInfo(connKey, onceToken, queryType, identityType, serviceId, userId, openId, certNo, certType, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 职得身份认证查询接口
     * 根据一次性token查询用户身份认证结果
     * @param connKey 调用第一步创建接口的out_agreement_no，由外部传入 (optional)
     * @param onceToken 查询身份认证结果的凭证，在认证结果到达终态后只允许查询成功一次，若需要再次查询，则需要调用第一个接口再拉起受理台 (optional)
     * @param queryType exact:精确查询,dim:模糊查询 (optional)
     * @param identityType 04:教师，其它身份类型联系芝麻技术支持确认 (optional)
     * @param serviceId 信用服务id，商家接入产品功能包时有运营同学分配 (optional)
     * @param userId 蚂蚁统一会员ID 和身份证任选一个传入 (optional)
     * @param openId 蚂蚁统一会员ID 和身份证任选一个传入 (optional)
     * @param certNo 证件号 (optional)
     * @param certType \&quot;身份证 : 0\&quot;，\&quot;护照: 1\&quot;，\&quot;台湾往来通行证：4\&quot;,\&quot;港澳往来通行证：3\&quot;, \&quot;回乡证: 2\&quot;；\&quot;港澳证件：5\&quot; (optional)
     * @return ApiResponse&lt;ZhimaCustomerJobworthAuthenticationQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaCustomerJobworthAuthenticationQueryResponseModel> queryWithHttpInfo(String connKey, String onceToken, String queryType, String identityType, String serviceId, String userId, String openId, String certNo, String certType, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(connKey, onceToken, queryType, identityType, serviceId, userId, openId, certNo, certType, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaCustomerJobworthAuthenticationQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaCustomerJobworthAuthenticationQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 职得身份认证查询接口 (asynchronously)
     * 根据一次性token查询用户身份认证结果
     * @param connKey 调用第一步创建接口的out_agreement_no，由外部传入 (optional)
     * @param onceToken 查询身份认证结果的凭证，在认证结果到达终态后只允许查询成功一次，若需要再次查询，则需要调用第一个接口再拉起受理台 (optional)
     * @param queryType exact:精确查询,dim:模糊查询 (optional)
     * @param identityType 04:教师，其它身份类型联系芝麻技术支持确认 (optional)
     * @param serviceId 信用服务id，商家接入产品功能包时有运营同学分配 (optional)
     * @param userId 蚂蚁统一会员ID 和身份证任选一个传入 (optional)
     * @param openId 蚂蚁统一会员ID 和身份证任选一个传入 (optional)
     * @param certNo 证件号 (optional)
     * @param certType \&quot;身份证 : 0\&quot;，\&quot;护照: 1\&quot;，\&quot;台湾往来通行证：4\&quot;,\&quot;港澳往来通行证：3\&quot;, \&quot;回乡证: 2\&quot;；\&quot;港澳证件：5\&quot; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call queryAsync(String connKey, String onceToken, String queryType, String identityType, String serviceId, String userId, String openId, String certNo, String certType, final ApiCallback<ZhimaCustomerJobworthAuthenticationQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(connKey, onceToken, queryType, identityType, serviceId, userId, openId, certNo, certType, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaCustomerJobworthAuthenticationQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String connKey, String onceToken, String queryType, String identityType, String serviceId, String userId, String openId, String certNo, String certType, final ApiCallback<ZhimaCustomerJobworthAuthenticationQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(connKey, onceToken, queryType, identityType, serviceId, userId, openId, certNo, certType, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaCustomerJobworthAuthenticationQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
