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


import com.alipay.v3.model.AlipayMarketingActivityBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityBatchqueryModel;
import com.alipay.v3.model.AlipayMarketingActivityBatchqueryResponseModel;
import com.alipay.v3.model.AlipayMarketingActivityConsultDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityConsultModel;
import com.alipay.v3.model.AlipayMarketingActivityConsultResponseModel;
import com.alipay.v3.model.AlipayMarketingActivityQueryDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMarketingActivityApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMarketingActivityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMarketingActivityApi(ApiClient apiClient) {
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
     * Build call for batchquery
     * @param alipayMarketingActivityBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryCall(AlipayMarketingActivityBatchqueryModel alipayMarketingActivityBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMarketingActivityBatchqueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/activity/batchquery";

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
    private okhttp3.Call batchqueryValidateBeforeCall(AlipayMarketingActivityBatchqueryModel alipayMarketingActivityBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(alipayMarketingActivityBatchqueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 条件查询活动列表
     * 通过此接口可查询多个活动的摘要信息。
     * @param alipayMarketingActivityBatchqueryModel  (optional)
     * @return AlipayMarketingActivityBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityBatchqueryResponseModel batchquery(AlipayMarketingActivityBatchqueryModel alipayMarketingActivityBatchqueryModel) throws ApiException {
        ApiResponse<AlipayMarketingActivityBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayMarketingActivityBatchqueryModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityBatchqueryResponseModel batchquery(AlipayMarketingActivityBatchqueryModel alipayMarketingActivityBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayMarketingActivityBatchqueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 条件查询活动列表
     * 通过此接口可查询多个活动的摘要信息。
     * @param alipayMarketingActivityBatchqueryModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityBatchqueryResponseModel> batchqueryWithHttpInfo(AlipayMarketingActivityBatchqueryModel alipayMarketingActivityBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayMarketingActivityBatchqueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 条件查询活动列表 (asynchronously)
     * 通过此接口可查询多个活动的摘要信息。
     * @param alipayMarketingActivityBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryAsync(AlipayMarketingActivityBatchqueryModel alipayMarketingActivityBatchqueryModel, final ApiCallback<AlipayMarketingActivityBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayMarketingActivityBatchqueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call batchqueryAsync(AlipayMarketingActivityBatchqueryModel alipayMarketingActivityBatchqueryModel, final ApiCallback<AlipayMarketingActivityBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayMarketingActivityBatchqueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for consult
     * @param alipayMarketingActivityConsultModel  (optional)
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
    public okhttp3.Call consultCall(AlipayMarketingActivityConsultModel alipayMarketingActivityConsultModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMarketingActivityConsultModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/activity/consult";

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
    private okhttp3.Call consultValidateBeforeCall(AlipayMarketingActivityConsultModel alipayMarketingActivityConsultModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = consultCall(alipayMarketingActivityConsultModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 活动领取咨询接口
     * 通过此接口可以咨询用户是否可以领取该活动优惠券，决定是否对用户展示该活动信息。
     * @param alipayMarketingActivityConsultModel  (optional)
     * @return AlipayMarketingActivityConsultResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityConsultResponseModel consult(AlipayMarketingActivityConsultModel alipayMarketingActivityConsultModel) throws ApiException {
        ApiResponse<AlipayMarketingActivityConsultResponseModel> localVarResp = consultWithHttpInfo(alipayMarketingActivityConsultModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityConsultResponseModel consult(AlipayMarketingActivityConsultModel alipayMarketingActivityConsultModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityConsultResponseModel> localVarResp = consultWithHttpInfo(alipayMarketingActivityConsultModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 活动领取咨询接口
     * 通过此接口可以咨询用户是否可以领取该活动优惠券，决定是否对用户展示该活动信息。
     * @param alipayMarketingActivityConsultModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityConsultResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityConsultResponseModel> consultWithHttpInfo(AlipayMarketingActivityConsultModel alipayMarketingActivityConsultModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = consultValidateBeforeCall(alipayMarketingActivityConsultModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityConsultResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityConsultDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 活动领取咨询接口 (asynchronously)
     * 通过此接口可以咨询用户是否可以领取该活动优惠券，决定是否对用户展示该活动信息。
     * @param alipayMarketingActivityConsultModel  (optional)
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
    public okhttp3.Call consultAsync(AlipayMarketingActivityConsultModel alipayMarketingActivityConsultModel, final ApiCallback<AlipayMarketingActivityConsultResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(alipayMarketingActivityConsultModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call consultAsync(AlipayMarketingActivityConsultModel alipayMarketingActivityConsultModel, final ApiCallback<AlipayMarketingActivityConsultResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(alipayMarketingActivityConsultModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param activityId 活动id (required)
     * @param merchantId 商户PID,默认为当前接口调用商户。 (optional)
     * @param merchantAccessMode 商户接入模式。 (optional)
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
    public okhttp3.Call queryCall(String activityId, String merchantId, String merchantAccessMode, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/marketing/activity/{activity_id}"
            .replaceAll("\\{" + "activity_id" + "\\}", localVarApiClient.escapeString(activityId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (merchantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchant_id", merchantId));
        }

        if (merchantAccessMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchant_access_mode", merchantAccessMode));
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
    private okhttp3.Call queryValidateBeforeCall(String activityId, String merchantId, String merchantAccessMode, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        
        // verify the required path parameter 'activityId' is set
        if (activityId == null) {
            throw new ApiException("Missing the required parameter 'activityId' when calling query(Async)");
        }
        

        okhttp3.Call localVarCall = queryCall(activityId, merchantId, merchantAccessMode, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询活动详情
     * 通过此接口可以查询活动详情，包括支付券和商家券活动。
     * @param activityId 活动id (required)
     * @param merchantId 商户PID,默认为当前接口调用商户。 (optional)
     * @param merchantAccessMode 商户接入模式。 (optional)
     * @return AlipayMarketingActivityQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityQueryResponseModel query(String activityId, String merchantId, String merchantAccessMode) throws ApiException {
        ApiResponse<AlipayMarketingActivityQueryResponseModel> localVarResp = queryWithHttpInfo(activityId, merchantId, merchantAccessMode, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityQueryResponseModel query(String activityId, String merchantId, String merchantAccessMode, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityQueryResponseModel> localVarResp = queryWithHttpInfo(activityId, merchantId, merchantAccessMode, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询活动详情
     * 通过此接口可以查询活动详情，包括支付券和商家券活动。
     * @param activityId 活动id (required)
     * @param merchantId 商户PID,默认为当前接口调用商户。 (optional)
     * @param merchantAccessMode 商户接入模式。 (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityQueryResponseModel> queryWithHttpInfo(String activityId, String merchantId, String merchantAccessMode, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(activityId, merchantId, merchantAccessMode, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询活动详情 (asynchronously)
     * 通过此接口可以查询活动详情，包括支付券和商家券活动。
     * @param activityId 活动id (required)
     * @param merchantId 商户PID,默认为当前接口调用商户。 (optional)
     * @param merchantAccessMode 商户接入模式。 (optional)
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
    public okhttp3.Call queryAsync(String activityId, String merchantId, String merchantAccessMode, final ApiCallback<AlipayMarketingActivityQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(activityId, merchantId, merchantAccessMode, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String activityId, String merchantId, String merchantAccessMode, final ApiCallback<AlipayMarketingActivityQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(activityId, merchantId, merchantAccessMode, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
