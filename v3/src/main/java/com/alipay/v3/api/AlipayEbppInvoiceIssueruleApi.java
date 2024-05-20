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


import com.alipay.v3.model.AlipayEbppInvoiceIssueruleCreateDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceIssueruleCreateModel;
import com.alipay.v3.model.AlipayEbppInvoiceIssueruleCreateResponseModel;
import com.alipay.v3.model.AlipayEbppInvoiceIssueruleDeleteDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceIssueruleDeleteModel;
import com.alipay.v3.model.AlipayEbppInvoiceIssueruleDeleteResponseModel;
import com.alipay.v3.model.AlipayEbppInvoiceIssueruleModifyDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceIssueruleModifyModel;
import com.alipay.v3.model.AlipayEbppInvoiceIssueruleModifyResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceIssueruleApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceIssueruleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceIssueruleApi(ApiClient apiClient) {
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
     * @param alipayEbppInvoiceIssueruleCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayEbppInvoiceIssueruleCreateModel alipayEbppInvoiceIssueruleCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceIssueruleCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/issuerule/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayEbppInvoiceIssueruleCreateModel alipayEbppInvoiceIssueruleCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayEbppInvoiceIssueruleCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 新增发放规则
     * 新增发放规则
     * @param alipayEbppInvoiceIssueruleCreateModel  (optional)
     * @return AlipayEbppInvoiceIssueruleCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceIssueruleCreateResponseModel create(AlipayEbppInvoiceIssueruleCreateModel alipayEbppInvoiceIssueruleCreateModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceIssueruleCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceIssueruleCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceIssueruleCreateResponseModel create(AlipayEbppInvoiceIssueruleCreateModel alipayEbppInvoiceIssueruleCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceIssueruleCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceIssueruleCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 新增发放规则
     * 新增发放规则
     * @param alipayEbppInvoiceIssueruleCreateModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceIssueruleCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceIssueruleCreateResponseModel> createWithHttpInfo(AlipayEbppInvoiceIssueruleCreateModel alipayEbppInvoiceIssueruleCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceIssueruleCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceIssueruleCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceIssueruleCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 新增发放规则 (asynchronously)
     * 新增发放规则
     * @param alipayEbppInvoiceIssueruleCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayEbppInvoiceIssueruleCreateModel alipayEbppInvoiceIssueruleCreateModel, final ApiCallback<AlipayEbppInvoiceIssueruleCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceIssueruleCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceIssueruleCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call createAsync(AlipayEbppInvoiceIssueruleCreateModel alipayEbppInvoiceIssueruleCreateModel, final ApiCallback<AlipayEbppInvoiceIssueruleCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceIssueruleCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceIssueruleCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
     * @param alipayEbppInvoiceIssueruleDeleteModel  (optional)
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
    public okhttp3.Call deleteCall(AlipayEbppInvoiceIssueruleDeleteModel alipayEbppInvoiceIssueruleDeleteModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceIssueruleDeleteModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/issuerule/delete";

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
    private okhttp3.Call deleteValidateBeforeCall(AlipayEbppInvoiceIssueruleDeleteModel alipayEbppInvoiceIssueruleDeleteModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = deleteCall(alipayEbppInvoiceIssueruleDeleteModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 删除发放规则
     * 删除发放规则
     * @param alipayEbppInvoiceIssueruleDeleteModel  (optional)
     * @return AlipayEbppInvoiceIssueruleDeleteResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceIssueruleDeleteResponseModel delete(AlipayEbppInvoiceIssueruleDeleteModel alipayEbppInvoiceIssueruleDeleteModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceIssueruleDeleteResponseModel> localVarResp = deleteWithHttpInfo(alipayEbppInvoiceIssueruleDeleteModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceIssueruleDeleteResponseModel delete(AlipayEbppInvoiceIssueruleDeleteModel alipayEbppInvoiceIssueruleDeleteModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceIssueruleDeleteResponseModel> localVarResp = deleteWithHttpInfo(alipayEbppInvoiceIssueruleDeleteModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 删除发放规则
     * 删除发放规则
     * @param alipayEbppInvoiceIssueruleDeleteModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceIssueruleDeleteResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceIssueruleDeleteResponseModel> deleteWithHttpInfo(AlipayEbppInvoiceIssueruleDeleteModel alipayEbppInvoiceIssueruleDeleteModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayEbppInvoiceIssueruleDeleteModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceIssueruleDeleteResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceIssueruleDeleteDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 删除发放规则 (asynchronously)
     * 删除发放规则
     * @param alipayEbppInvoiceIssueruleDeleteModel  (optional)
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
    public okhttp3.Call deleteAsync(AlipayEbppInvoiceIssueruleDeleteModel alipayEbppInvoiceIssueruleDeleteModel, final ApiCallback<AlipayEbppInvoiceIssueruleDeleteResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayEbppInvoiceIssueruleDeleteModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceIssueruleDeleteResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call deleteAsync(AlipayEbppInvoiceIssueruleDeleteModel alipayEbppInvoiceIssueruleDeleteModel, final ApiCallback<AlipayEbppInvoiceIssueruleDeleteResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayEbppInvoiceIssueruleDeleteModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceIssueruleDeleteResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modify
     * @param alipayEbppInvoiceIssueruleModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayEbppInvoiceIssueruleModifyModel alipayEbppInvoiceIssueruleModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceIssueruleModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/issuerule/modify";

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
    private okhttp3.Call modifyValidateBeforeCall(AlipayEbppInvoiceIssueruleModifyModel alipayEbppInvoiceIssueruleModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayEbppInvoiceIssueruleModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 编辑发放规则
     * 编辑发放规则
     * @param alipayEbppInvoiceIssueruleModifyModel  (optional)
     * @return AlipayEbppInvoiceIssueruleModifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceIssueruleModifyResponseModel modify(AlipayEbppInvoiceIssueruleModifyModel alipayEbppInvoiceIssueruleModifyModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceIssueruleModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayEbppInvoiceIssueruleModifyModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceIssueruleModifyResponseModel modify(AlipayEbppInvoiceIssueruleModifyModel alipayEbppInvoiceIssueruleModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceIssueruleModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayEbppInvoiceIssueruleModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 编辑发放规则
     * 编辑发放规则
     * @param alipayEbppInvoiceIssueruleModifyModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceIssueruleModifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceIssueruleModifyResponseModel> modifyWithHttpInfo(AlipayEbppInvoiceIssueruleModifyModel alipayEbppInvoiceIssueruleModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceIssueruleModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceIssueruleModifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceIssueruleModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 编辑发放规则 (asynchronously)
     * 编辑发放规则
     * @param alipayEbppInvoiceIssueruleModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayEbppInvoiceIssueruleModifyModel alipayEbppInvoiceIssueruleModifyModel, final ApiCallback<AlipayEbppInvoiceIssueruleModifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceIssueruleModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceIssueruleModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call modifyAsync(AlipayEbppInvoiceIssueruleModifyModel alipayEbppInvoiceIssueruleModifyModel, final ApiCallback<AlipayEbppInvoiceIssueruleModifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceIssueruleModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceIssueruleModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
