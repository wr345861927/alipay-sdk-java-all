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


import com.alipay.v3.model.AlipayMarketingActivityDeliveryCreateDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityDeliveryCreateModel;
import com.alipay.v3.model.AlipayMarketingActivityDeliveryCreateResponseModel;
import com.alipay.v3.model.AlipayMarketingActivityDeliveryQueryDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityDeliveryQueryModel;
import com.alipay.v3.model.AlipayMarketingActivityDeliveryQueryResponseModel;
import com.alipay.v3.model.AlipayMarketingActivityDeliveryStopDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityDeliveryStopModel;
import com.alipay.v3.model.AlipayMarketingActivityDeliveryStopResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMarketingActivityDeliveryApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMarketingActivityDeliveryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMarketingActivityDeliveryApi(ApiClient apiClient) {
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
     * Build call for create
     * @param alipayMarketingActivityDeliveryCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayMarketingActivityDeliveryCreateModel alipayMarketingActivityDeliveryCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : alipayMarketingActivityDeliveryCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/delivery";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createValidateBeforeCall(AlipayMarketingActivityDeliveryCreateModel alipayMarketingActivityDeliveryCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayMarketingActivityDeliveryCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 创建推广计划
     * 为商家提供推广内容能力。创建推广成功后，请依据推广变更消息alipay.marketing.activity.delivery.message感知推广变更状态。
     * @param alipayMarketingActivityDeliveryCreateModel  (optional)
     * @return AlipayMarketingActivityDeliveryCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityDeliveryCreateResponseModel create(AlipayMarketingActivityDeliveryCreateModel alipayMarketingActivityDeliveryCreateModel) throws ApiException {
        ApiResponse<AlipayMarketingActivityDeliveryCreateResponseModel> localVarResp = createWithHttpInfo(alipayMarketingActivityDeliveryCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityDeliveryCreateResponseModel create(AlipayMarketingActivityDeliveryCreateModel alipayMarketingActivityDeliveryCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityDeliveryCreateResponseModel> localVarResp = createWithHttpInfo(alipayMarketingActivityDeliveryCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 创建推广计划
     * 为商家提供推广内容能力。创建推广成功后，请依据推广变更消息alipay.marketing.activity.delivery.message感知推广变更状态。
     * @param alipayMarketingActivityDeliveryCreateModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityDeliveryCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityDeliveryCreateResponseModel> createWithHttpInfo(AlipayMarketingActivityDeliveryCreateModel alipayMarketingActivityDeliveryCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMarketingActivityDeliveryCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityDeliveryCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityDeliveryCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 创建推广计划 (asynchronously)
     * 为商家提供推广内容能力。创建推广成功后，请依据推广变更消息alipay.marketing.activity.delivery.message感知推广变更状态。
     * @param alipayMarketingActivityDeliveryCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayMarketingActivityDeliveryCreateModel alipayMarketingActivityDeliveryCreateModel, final ApiCallback<AlipayMarketingActivityDeliveryCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMarketingActivityDeliveryCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityDeliveryCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call createAsync(AlipayMarketingActivityDeliveryCreateModel alipayMarketingActivityDeliveryCreateModel, final ApiCallback<AlipayMarketingActivityDeliveryCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMarketingActivityDeliveryCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityDeliveryCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param deliveryId 推广计划id (required)
     * @param alipayMarketingActivityDeliveryQueryModel  (optional)
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
    public okhttp3.Call queryCall(String deliveryId, AlipayMarketingActivityDeliveryQueryModel alipayMarketingActivityDeliveryQueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : alipayMarketingActivityDeliveryQueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/delivery/{delivery_id}/query"
            .replaceAll("\\{" + "delivery_id" + "\\}", localVarApiClient.escapeString(deliveryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryValidateBeforeCall(String deliveryId, AlipayMarketingActivityDeliveryQueryModel alipayMarketingActivityDeliveryQueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        
        // verify the required path parameter 'deliveryId' is set
        if (deliveryId == null) {
            throw new ApiException("Missing the required parameter 'deliveryId' when calling query(Async)");
        }
        

        okhttp3.Call localVarCall = queryCall(deliveryId, alipayMarketingActivityDeliveryQueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询推广计划
     * 查询推广计划详情信息。
     * @param deliveryId 推广计划id (required)
     * @param alipayMarketingActivityDeliveryQueryModel  (optional)
     * @return AlipayMarketingActivityDeliveryQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityDeliveryQueryResponseModel query(String deliveryId, AlipayMarketingActivityDeliveryQueryModel alipayMarketingActivityDeliveryQueryModel) throws ApiException {
        ApiResponse<AlipayMarketingActivityDeliveryQueryResponseModel> localVarResp = queryWithHttpInfo(deliveryId, alipayMarketingActivityDeliveryQueryModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityDeliveryQueryResponseModel query(String deliveryId, AlipayMarketingActivityDeliveryQueryModel alipayMarketingActivityDeliveryQueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityDeliveryQueryResponseModel> localVarResp = queryWithHttpInfo(deliveryId, alipayMarketingActivityDeliveryQueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询推广计划
     * 查询推广计划详情信息。
     * @param deliveryId 推广计划id (required)
     * @param alipayMarketingActivityDeliveryQueryModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityDeliveryQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityDeliveryQueryResponseModel> queryWithHttpInfo(String deliveryId, AlipayMarketingActivityDeliveryQueryModel alipayMarketingActivityDeliveryQueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(deliveryId, alipayMarketingActivityDeliveryQueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityDeliveryQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityDeliveryQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询推广计划 (asynchronously)
     * 查询推广计划详情信息。
     * @param deliveryId 推广计划id (required)
     * @param alipayMarketingActivityDeliveryQueryModel  (optional)
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
    public okhttp3.Call queryAsync(String deliveryId, AlipayMarketingActivityDeliveryQueryModel alipayMarketingActivityDeliveryQueryModel, final ApiCallback<AlipayMarketingActivityDeliveryQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(deliveryId, alipayMarketingActivityDeliveryQueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityDeliveryQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String deliveryId, AlipayMarketingActivityDeliveryQueryModel alipayMarketingActivityDeliveryQueryModel, final ApiCallback<AlipayMarketingActivityDeliveryQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(deliveryId, alipayMarketingActivityDeliveryQueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityDeliveryQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for stop
     * @param deliveryId 推广计划id (required)
     * @param alipayMarketingActivityDeliveryStopModel  (optional)
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
    public okhttp3.Call stopCall(String deliveryId, AlipayMarketingActivityDeliveryStopModel alipayMarketingActivityDeliveryStopModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : alipayMarketingActivityDeliveryStopModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/delivery/{delivery_id}/stop"
            .replaceAll("\\{" + "delivery_id" + "\\}", localVarApiClient.escapeString(deliveryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call stopValidateBeforeCall(String deliveryId, AlipayMarketingActivityDeliveryStopModel alipayMarketingActivityDeliveryStopModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        
        // verify the required path parameter 'deliveryId' is set
        if (deliveryId == null) {
            throw new ApiException("Missing the required parameter 'deliveryId' when calling stop(Async)");
        }
        

        okhttp3.Call localVarCall = stopCall(deliveryId, alipayMarketingActivityDeliveryStopModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 停止推广计划
     * 停止推广计划。  注意：停止推广操作成功到推广内容停止生效，可能存在几分钟的延迟。
     * @param deliveryId 推广计划id (required)
     * @param alipayMarketingActivityDeliveryStopModel  (optional)
     * @return AlipayMarketingActivityDeliveryStopResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityDeliveryStopResponseModel stop(String deliveryId, AlipayMarketingActivityDeliveryStopModel alipayMarketingActivityDeliveryStopModel) throws ApiException {
        ApiResponse<AlipayMarketingActivityDeliveryStopResponseModel> localVarResp = stopWithHttpInfo(deliveryId, alipayMarketingActivityDeliveryStopModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityDeliveryStopResponseModel stop(String deliveryId, AlipayMarketingActivityDeliveryStopModel alipayMarketingActivityDeliveryStopModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityDeliveryStopResponseModel> localVarResp = stopWithHttpInfo(deliveryId, alipayMarketingActivityDeliveryStopModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 停止推广计划
     * 停止推广计划。  注意：停止推广操作成功到推广内容停止生效，可能存在几分钟的延迟。
     * @param deliveryId 推广计划id (required)
     * @param alipayMarketingActivityDeliveryStopModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityDeliveryStopResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityDeliveryStopResponseModel> stopWithHttpInfo(String deliveryId, AlipayMarketingActivityDeliveryStopModel alipayMarketingActivityDeliveryStopModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = stopValidateBeforeCall(deliveryId, alipayMarketingActivityDeliveryStopModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityDeliveryStopResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityDeliveryStopDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 停止推广计划 (asynchronously)
     * 停止推广计划。  注意：停止推广操作成功到推广内容停止生效，可能存在几分钟的延迟。
     * @param deliveryId 推广计划id (required)
     * @param alipayMarketingActivityDeliveryStopModel  (optional)
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
    public okhttp3.Call stopAsync(String deliveryId, AlipayMarketingActivityDeliveryStopModel alipayMarketingActivityDeliveryStopModel, final ApiCallback<AlipayMarketingActivityDeliveryStopResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = stopValidateBeforeCall(deliveryId, alipayMarketingActivityDeliveryStopModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityDeliveryStopResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call stopAsync(String deliveryId, AlipayMarketingActivityDeliveryStopModel alipayMarketingActivityDeliveryStopModel, final ApiCallback<AlipayMarketingActivityDeliveryStopResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = stopValidateBeforeCall(deliveryId, alipayMarketingActivityDeliveryStopModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityDeliveryStopResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
