/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
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


import com.alipay.v3.model.AlipayOpenSearchSubservicekeywordApplyDefaultResponse;
import com.alipay.v3.model.AlipayOpenSearchSubservicekeywordApplyModel;
import com.alipay.v3.model.AlipayOpenSearchSubservicekeywordApplyResponseModel;
import com.alipay.v3.model.AlipayOpenSearchSubservicekeywordBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenSearchSubservicekeywordBatchqueryResponseModel;
import com.alipay.v3.model.AlipayOpenSearchSubservicekeywordDeleteDefaultResponse;
import com.alipay.v3.model.AlipayOpenSearchSubservicekeywordDeleteModel;
import com.alipay.v3.model.AlipayOpenSearchSubservicekeywordQuerystatusDefaultResponse;
import com.alipay.v3.model.AlipayOpenSearchSubservicekeywordQuerystatusResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenSearchSubservicekeywordApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenSearchSubservicekeywordApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenSearchSubservicekeywordApi(ApiClient apiClient) {
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
     * Build call for apply
     * @param alipayOpenSearchSubservicekeywordApplyModel  (optional)
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
    public okhttp3.Call applyCall(AlipayOpenSearchSubservicekeywordApplyModel alipayOpenSearchSubservicekeywordApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenSearchSubservicekeywordApplyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/search/subservicekeyword/apply";

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
    private okhttp3.Call applyValidateBeforeCall(AlipayOpenSearchSubservicekeywordApplyModel alipayOpenSearchSubservicekeywordApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = applyCall(alipayOpenSearchSubservicekeywordApplyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 提报服务关键词
     * 小程序-服务推广-提报服务关键词
     * @param alipayOpenSearchSubservicekeywordApplyModel  (optional)
     * @return AlipayOpenSearchSubservicekeywordApplyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenSearchSubservicekeywordApplyResponseModel apply(AlipayOpenSearchSubservicekeywordApplyModel alipayOpenSearchSubservicekeywordApplyModel) throws ApiException {
        ApiResponse<AlipayOpenSearchSubservicekeywordApplyResponseModel> localVarResp = applyWithHttpInfo(alipayOpenSearchSubservicekeywordApplyModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenSearchSubservicekeywordApplyResponseModel apply(AlipayOpenSearchSubservicekeywordApplyModel alipayOpenSearchSubservicekeywordApplyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenSearchSubservicekeywordApplyResponseModel> localVarResp = applyWithHttpInfo(alipayOpenSearchSubservicekeywordApplyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 提报服务关键词
     * 小程序-服务推广-提报服务关键词
     * @param alipayOpenSearchSubservicekeywordApplyModel  (optional)
     * @return ApiResponse&lt;AlipayOpenSearchSubservicekeywordApplyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenSearchSubservicekeywordApplyResponseModel> applyWithHttpInfo(AlipayOpenSearchSubservicekeywordApplyModel alipayOpenSearchSubservicekeywordApplyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayOpenSearchSubservicekeywordApplyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenSearchSubservicekeywordApplyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenSearchSubservicekeywordApplyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 提报服务关键词 (asynchronously)
     * 小程序-服务推广-提报服务关键词
     * @param alipayOpenSearchSubservicekeywordApplyModel  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call applyAsync(AlipayOpenSearchSubservicekeywordApplyModel alipayOpenSearchSubservicekeywordApplyModel, final ApiCallback<AlipayOpenSearchSubservicekeywordApplyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayOpenSearchSubservicekeywordApplyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchSubservicekeywordApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call applyAsync(AlipayOpenSearchSubservicekeywordApplyModel alipayOpenSearchSubservicekeywordApplyModel, final ApiCallback<AlipayOpenSearchSubservicekeywordApplyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayOpenSearchSubservicekeywordApplyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchSubservicekeywordApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for batchquery
     * @param targetAppid 小程序id (optional)
     * @param status 审核状态，服务关键词的审核状态，枚举值，不传该字段表示查询所有状态 (optional)
     * @param pageNumber 分页参数，分页查询时使用 (optional)
     * @param pageSize 分页参数，分页查询时使用 (optional)
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
    public okhttp3.Call batchqueryCall(String targetAppid, String status, Integer pageNumber, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/search/subservicekeyword/batchquery";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targetAppid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_appid", targetAppid));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (pageNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_number", pageNumber));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call batchqueryValidateBeforeCall(String targetAppid, String status, Integer pageNumber, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(targetAppid, status, pageNumber, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 服务关键词批量查询接口
     * 批量查询小程序的服务关键词
     * @param targetAppid 小程序id (optional)
     * @param status 审核状态，服务关键词的审核状态，枚举值，不传该字段表示查询所有状态 (optional)
     * @param pageNumber 分页参数，分页查询时使用 (optional)
     * @param pageSize 分页参数，分页查询时使用 (optional)
     * @return AlipayOpenSearchSubservicekeywordBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenSearchSubservicekeywordBatchqueryResponseModel batchquery(String targetAppid, String status, Integer pageNumber, Integer pageSize) throws ApiException {
        ApiResponse<AlipayOpenSearchSubservicekeywordBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(targetAppid, status, pageNumber, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayOpenSearchSubservicekeywordBatchqueryResponseModel batchquery(String targetAppid, String status, Integer pageNumber, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenSearchSubservicekeywordBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(targetAppid, status, pageNumber, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 服务关键词批量查询接口
     * 批量查询小程序的服务关键词
     * @param targetAppid 小程序id (optional)
     * @param status 审核状态，服务关键词的审核状态，枚举值，不传该字段表示查询所有状态 (optional)
     * @param pageNumber 分页参数，分页查询时使用 (optional)
     * @param pageSize 分页参数，分页查询时使用 (optional)
     * @return ApiResponse&lt;AlipayOpenSearchSubservicekeywordBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenSearchSubservicekeywordBatchqueryResponseModel> batchqueryWithHttpInfo(String targetAppid, String status, Integer pageNumber, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(targetAppid, status, pageNumber, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenSearchSubservicekeywordBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenSearchSubservicekeywordBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 服务关键词批量查询接口 (asynchronously)
     * 批量查询小程序的服务关键词
     * @param targetAppid 小程序id (optional)
     * @param status 审核状态，服务关键词的审核状态，枚举值，不传该字段表示查询所有状态 (optional)
     * @param pageNumber 分页参数，分页查询时使用 (optional)
     * @param pageSize 分页参数，分页查询时使用 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchqueryAsync(String targetAppid, String status, Integer pageNumber, Integer pageSize, final ApiCallback<AlipayOpenSearchSubservicekeywordBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(targetAppid, status, pageNumber, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchSubservicekeywordBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call batchqueryAsync(String targetAppid, String status, Integer pageNumber, Integer pageSize, final ApiCallback<AlipayOpenSearchSubservicekeywordBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(targetAppid, status, pageNumber, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchSubservicekeywordBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
     * @param alipayOpenSearchSubservicekeywordDeleteModel  (optional)
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
    public okhttp3.Call deleteCall(AlipayOpenSearchSubservicekeywordDeleteModel alipayOpenSearchSubservicekeywordDeleteModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenSearchSubservicekeywordDeleteModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/search/subservicekeyword/delete";

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
    private okhttp3.Call deleteValidateBeforeCall(AlipayOpenSearchSubservicekeywordDeleteModel alipayOpenSearchSubservicekeywordDeleteModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = deleteCall(alipayOpenSearchSubservicekeywordDeleteModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 删除服务关键词
     * 删除服务关键词
     * @param alipayOpenSearchSubservicekeywordDeleteModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object delete(AlipayOpenSearchSubservicekeywordDeleteModel alipayOpenSearchSubservicekeywordDeleteModel) throws ApiException {
        ApiResponse<Object> localVarResp = deleteWithHttpInfo(alipayOpenSearchSubservicekeywordDeleteModel, null);
        return localVarResp.getData();
    }

    public Object delete(AlipayOpenSearchSubservicekeywordDeleteModel alipayOpenSearchSubservicekeywordDeleteModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = deleteWithHttpInfo(alipayOpenSearchSubservicekeywordDeleteModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 删除服务关键词
     * 删除服务关键词
     * @param alipayOpenSearchSubservicekeywordDeleteModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> deleteWithHttpInfo(AlipayOpenSearchSubservicekeywordDeleteModel alipayOpenSearchSubservicekeywordDeleteModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayOpenSearchSubservicekeywordDeleteModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenSearchSubservicekeywordDeleteDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 删除服务关键词 (asynchronously)
     * 删除服务关键词
     * @param alipayOpenSearchSubservicekeywordDeleteModel  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAsync(AlipayOpenSearchSubservicekeywordDeleteModel alipayOpenSearchSubservicekeywordDeleteModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayOpenSearchSubservicekeywordDeleteModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call deleteAsync(AlipayOpenSearchSubservicekeywordDeleteModel alipayOpenSearchSubservicekeywordDeleteModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayOpenSearchSubservicekeywordDeleteModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for querystatus
     * @param targetAppid 小程序id (optional)
     * @param applyNo 审核工单id，提报接口的返回值 (optional)
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
    public okhttp3.Call querystatusCall(String targetAppid, String applyNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/search/subservicekeyword/querystatus";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targetAppid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_appid", targetAppid));
        }

        if (applyNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("apply_no", applyNo));
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
    private okhttp3.Call querystatusValidateBeforeCall(String targetAppid, String applyNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = querystatusCall(targetAppid, applyNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询小程序服务关键词的审核工单的状态
     * 查询小程序服务关键词的审核工单的状态
     * @param targetAppid 小程序id (optional)
     * @param applyNo 审核工单id，提报接口的返回值 (optional)
     * @return AlipayOpenSearchSubservicekeywordQuerystatusResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenSearchSubservicekeywordQuerystatusResponseModel querystatus(String targetAppid, String applyNo) throws ApiException {
        ApiResponse<AlipayOpenSearchSubservicekeywordQuerystatusResponseModel> localVarResp = querystatusWithHttpInfo(targetAppid, applyNo, null);
        return localVarResp.getData();
    }

    public AlipayOpenSearchSubservicekeywordQuerystatusResponseModel querystatus(String targetAppid, String applyNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenSearchSubservicekeywordQuerystatusResponseModel> localVarResp = querystatusWithHttpInfo(targetAppid, applyNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询小程序服务关键词的审核工单的状态
     * 查询小程序服务关键词的审核工单的状态
     * @param targetAppid 小程序id (optional)
     * @param applyNo 审核工单id，提报接口的返回值 (optional)
     * @return ApiResponse&lt;AlipayOpenSearchSubservicekeywordQuerystatusResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenSearchSubservicekeywordQuerystatusResponseModel> querystatusWithHttpInfo(String targetAppid, String applyNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = querystatusValidateBeforeCall(targetAppid, applyNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenSearchSubservicekeywordQuerystatusResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenSearchSubservicekeywordQuerystatusDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询小程序服务关键词的审核工单的状态 (asynchronously)
     * 查询小程序服务关键词的审核工单的状态
     * @param targetAppid 小程序id (optional)
     * @param applyNo 审核工单id，提报接口的返回值 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call querystatusAsync(String targetAppid, String applyNo, final ApiCallback<AlipayOpenSearchSubservicekeywordQuerystatusResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = querystatusValidateBeforeCall(targetAppid, applyNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchSubservicekeywordQuerystatusResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call querystatusAsync(String targetAppid, String applyNo, final ApiCallback<AlipayOpenSearchSubservicekeywordQuerystatusResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = querystatusValidateBeforeCall(targetAppid, applyNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchSubservicekeywordQuerystatusResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
