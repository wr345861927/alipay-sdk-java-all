/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
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


import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantshopBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantshopBatchqueryModel;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantshopCreateDefaultResponse;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantshopCreateModel;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantshopCreateResponseModel;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantshopModifyDefaultResponse;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantshopModifyModel;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantshopModifyResponseModel;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantshopQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantshopQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenInstantdeliveryMerchantshopApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenInstantdeliveryMerchantshopApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenInstantdeliveryMerchantshopApi(ApiClient apiClient) {
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
     * @param alipayOpenInstantdeliveryMerchantshopBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryCall(AlipayOpenInstantdeliveryMerchantshopBatchqueryModel alipayOpenInstantdeliveryMerchantshopBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenInstantdeliveryMerchantshopBatchqueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/instantdelivery/merchantshop/batchquery";

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
    private okhttp3.Call batchqueryValidateBeforeCall(AlipayOpenInstantdeliveryMerchantshopBatchqueryModel alipayOpenInstantdeliveryMerchantshopBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(alipayOpenInstantdeliveryMerchantshopBatchqueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 即时配送商家门店分页查询
     * 即时配送场景，商家门店信息分页查询
     * @param alipayOpenInstantdeliveryMerchantshopBatchqueryModel  (optional)
     * @return AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel batchquery(AlipayOpenInstantdeliveryMerchantshopBatchqueryModel alipayOpenInstantdeliveryMerchantshopBatchqueryModel) throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayOpenInstantdeliveryMerchantshopBatchqueryModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel batchquery(AlipayOpenInstantdeliveryMerchantshopBatchqueryModel alipayOpenInstantdeliveryMerchantshopBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayOpenInstantdeliveryMerchantshopBatchqueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 即时配送商家门店分页查询
     * 即时配送场景，商家门店信息分页查询
     * @param alipayOpenInstantdeliveryMerchantshopBatchqueryModel  (optional)
     * @return ApiResponse&lt;AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel> batchqueryWithHttpInfo(AlipayOpenInstantdeliveryMerchantshopBatchqueryModel alipayOpenInstantdeliveryMerchantshopBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOpenInstantdeliveryMerchantshopBatchqueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenInstantdeliveryMerchantshopBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 即时配送商家门店分页查询 (asynchronously)
     * 即时配送场景，商家门店信息分页查询
     * @param alipayOpenInstantdeliveryMerchantshopBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryAsync(AlipayOpenInstantdeliveryMerchantshopBatchqueryModel alipayOpenInstantdeliveryMerchantshopBatchqueryModel, final ApiCallback<AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOpenInstantdeliveryMerchantshopBatchqueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call batchqueryAsync(AlipayOpenInstantdeliveryMerchantshopBatchqueryModel alipayOpenInstantdeliveryMerchantshopBatchqueryModel, final ApiCallback<AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOpenInstantdeliveryMerchantshopBatchqueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for create
     * @param alipayOpenInstantdeliveryMerchantshopCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayOpenInstantdeliveryMerchantshopCreateModel alipayOpenInstantdeliveryMerchantshopCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenInstantdeliveryMerchantshopCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/instantdelivery/merchantshop/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayOpenInstantdeliveryMerchantshopCreateModel alipayOpenInstantdeliveryMerchantshopCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayOpenInstantdeliveryMerchantshopCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 即时配送商家门店创建
     * 帮商家在即时配送公司创建门店。名称+地址必须全局唯一；pid下的shopNo必须唯一。
     * @param alipayOpenInstantdeliveryMerchantshopCreateModel  (optional)
     * @return AlipayOpenInstantdeliveryMerchantshopCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenInstantdeliveryMerchantshopCreateResponseModel create(AlipayOpenInstantdeliveryMerchantshopCreateModel alipayOpenInstantdeliveryMerchantshopCreateModel) throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantshopCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenInstantdeliveryMerchantshopCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenInstantdeliveryMerchantshopCreateResponseModel create(AlipayOpenInstantdeliveryMerchantshopCreateModel alipayOpenInstantdeliveryMerchantshopCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantshopCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenInstantdeliveryMerchantshopCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 即时配送商家门店创建
     * 帮商家在即时配送公司创建门店。名称+地址必须全局唯一；pid下的shopNo必须唯一。
     * @param alipayOpenInstantdeliveryMerchantshopCreateModel  (optional)
     * @return ApiResponse&lt;AlipayOpenInstantdeliveryMerchantshopCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenInstantdeliveryMerchantshopCreateResponseModel> createWithHttpInfo(AlipayOpenInstantdeliveryMerchantshopCreateModel alipayOpenInstantdeliveryMerchantshopCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenInstantdeliveryMerchantshopCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenInstantdeliveryMerchantshopCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 即时配送商家门店创建 (asynchronously)
     * 帮商家在即时配送公司创建门店。名称+地址必须全局唯一；pid下的shopNo必须唯一。
     * @param alipayOpenInstantdeliveryMerchantshopCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayOpenInstantdeliveryMerchantshopCreateModel alipayOpenInstantdeliveryMerchantshopCreateModel, final ApiCallback<AlipayOpenInstantdeliveryMerchantshopCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenInstantdeliveryMerchantshopCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call createAsync(AlipayOpenInstantdeliveryMerchantshopCreateModel alipayOpenInstantdeliveryMerchantshopCreateModel, final ApiCallback<AlipayOpenInstantdeliveryMerchantshopCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenInstantdeliveryMerchantshopCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modify
     * @param alipayOpenInstantdeliveryMerchantshopModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayOpenInstantdeliveryMerchantshopModifyModel alipayOpenInstantdeliveryMerchantshopModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenInstantdeliveryMerchantshopModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/instantdelivery/merchantshop/modify";

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
    private okhttp3.Call modifyValidateBeforeCall(AlipayOpenInstantdeliveryMerchantshopModifyModel alipayOpenInstantdeliveryMerchantshopModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayOpenInstantdeliveryMerchantshopModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 即时配送商家门店更新
     * 帮商家更新在即时配送公司的门店
     * @param alipayOpenInstantdeliveryMerchantshopModifyModel  (optional)
     * @return AlipayOpenInstantdeliveryMerchantshopModifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenInstantdeliveryMerchantshopModifyResponseModel modify(AlipayOpenInstantdeliveryMerchantshopModifyModel alipayOpenInstantdeliveryMerchantshopModifyModel) throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantshopModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayOpenInstantdeliveryMerchantshopModifyModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenInstantdeliveryMerchantshopModifyResponseModel modify(AlipayOpenInstantdeliveryMerchantshopModifyModel alipayOpenInstantdeliveryMerchantshopModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantshopModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayOpenInstantdeliveryMerchantshopModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 即时配送商家门店更新
     * 帮商家更新在即时配送公司的门店
     * @param alipayOpenInstantdeliveryMerchantshopModifyModel  (optional)
     * @return ApiResponse&lt;AlipayOpenInstantdeliveryMerchantshopModifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenInstantdeliveryMerchantshopModifyResponseModel> modifyWithHttpInfo(AlipayOpenInstantdeliveryMerchantshopModifyModel alipayOpenInstantdeliveryMerchantshopModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOpenInstantdeliveryMerchantshopModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopModifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenInstantdeliveryMerchantshopModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 即时配送商家门店更新 (asynchronously)
     * 帮商家更新在即时配送公司的门店
     * @param alipayOpenInstantdeliveryMerchantshopModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayOpenInstantdeliveryMerchantshopModifyModel alipayOpenInstantdeliveryMerchantshopModifyModel, final ApiCallback<AlipayOpenInstantdeliveryMerchantshopModifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOpenInstantdeliveryMerchantshopModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call modifyAsync(AlipayOpenInstantdeliveryMerchantshopModifyModel alipayOpenInstantdeliveryMerchantshopModifyModel, final ApiCallback<AlipayOpenInstantdeliveryMerchantshopModifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOpenInstantdeliveryMerchantshopModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param shopNo 商家门店编码。 (optional)
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
    public okhttp3.Call queryCall(String shopNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/instantdelivery/merchantshop/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (shopNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("shop_no", shopNo));
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
    private okhttp3.Call queryValidateBeforeCall(String shopNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(shopNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 即时配送商家门店详情查询
     * 即时配送场景，查询商家门店详情信息。
     * @param shopNo 商家门店编码。 (optional)
     * @return AlipayOpenInstantdeliveryMerchantshopQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenInstantdeliveryMerchantshopQueryResponseModel query(String shopNo) throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantshopQueryResponseModel> localVarResp = queryWithHttpInfo(shopNo, null);
        return localVarResp.getData();
    }

    public AlipayOpenInstantdeliveryMerchantshopQueryResponseModel query(String shopNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantshopQueryResponseModel> localVarResp = queryWithHttpInfo(shopNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 即时配送商家门店详情查询
     * 即时配送场景，查询商家门店详情信息。
     * @param shopNo 商家门店编码。 (optional)
     * @return ApiResponse&lt;AlipayOpenInstantdeliveryMerchantshopQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenInstantdeliveryMerchantshopQueryResponseModel> queryWithHttpInfo(String shopNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(shopNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenInstantdeliveryMerchantshopQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 即时配送商家门店详情查询 (asynchronously)
     * 即时配送场景，查询商家门店详情信息。
     * @param shopNo 商家门店编码。 (optional)
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
    public okhttp3.Call queryAsync(String shopNo, final ApiCallback<AlipayOpenInstantdeliveryMerchantshopQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(shopNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String shopNo, final ApiCallback<AlipayOpenInstantdeliveryMerchantshopQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(shopNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantshopQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
