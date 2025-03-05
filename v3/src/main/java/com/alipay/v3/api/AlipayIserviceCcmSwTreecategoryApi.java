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


import com.alipay.v3.model.AlipayIserviceCcmSwTreecategoryBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel;
import com.alipay.v3.model.AlipayIserviceCcmSwTreecategoryCreateDefaultResponse;
import com.alipay.v3.model.AlipayIserviceCcmSwTreecategoryCreateModel;
import com.alipay.v3.model.AlipayIserviceCcmSwTreecategoryCreateResponseModel;
import com.alipay.v3.model.AlipayIserviceCcmSwTreecategoryDeleteDefaultResponse;
import com.alipay.v3.model.AlipayIserviceCcmSwTreecategoryModifyDefaultResponse;
import com.alipay.v3.model.AlipayIserviceCcmSwTreecategoryModifyModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayIserviceCcmSwTreecategoryApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayIserviceCcmSwTreecategoryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayIserviceCcmSwTreecategoryApi(ApiClient apiClient) {
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
     * @param ccsInstanceId 子部门ID，不传为默认部门 (optional)
     * @param libraryId 知识库ID (optional)
     * @param name 节点名称 (optional)
     * @param pageNum 页数，page_size不能为空 (optional)
     * @param pageSize 页显示大小，page_num不能为空 (optional)
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
    public okhttp3.Call batchqueryCall(String ccsInstanceId, Integer libraryId, String name, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/iservice/ccm/sw/treecategory/batchquery";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ccsInstanceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ccs_instance_id", ccsInstanceId));
        }

        if (libraryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("library_id", libraryId));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
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
    private okhttp3.Call batchqueryValidateBeforeCall(String ccsInstanceId, Integer libraryId, String name, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(ccsInstanceId, libraryId, name, pageNum, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 知识库-节点-批量查询
     * 知识库-节点-批量查询
     * @param ccsInstanceId 子部门ID，不传为默认部门 (optional)
     * @param libraryId 知识库ID (optional)
     * @param name 节点名称 (optional)
     * @param pageNum 页数，page_size不能为空 (optional)
     * @param pageSize 页显示大小，page_num不能为空 (optional)
     * @return AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel batchquery(String ccsInstanceId, Integer libraryId, String name, Integer pageNum, Integer pageSize) throws ApiException {
        ApiResponse<AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(ccsInstanceId, libraryId, name, pageNum, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel batchquery(String ccsInstanceId, Integer libraryId, String name, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(ccsInstanceId, libraryId, name, pageNum, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 知识库-节点-批量查询
     * 知识库-节点-批量查询
     * @param ccsInstanceId 子部门ID，不传为默认部门 (optional)
     * @param libraryId 知识库ID (optional)
     * @param name 节点名称 (optional)
     * @param pageNum 页数，page_size不能为空 (optional)
     * @param pageSize 页显示大小，page_num不能为空 (optional)
     * @return ApiResponse&lt;AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel> batchqueryWithHttpInfo(String ccsInstanceId, Integer libraryId, String name, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(ccsInstanceId, libraryId, name, pageNum, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayIserviceCcmSwTreecategoryBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 知识库-节点-批量查询 (asynchronously)
     * 知识库-节点-批量查询
     * @param ccsInstanceId 子部门ID，不传为默认部门 (optional)
     * @param libraryId 知识库ID (optional)
     * @param name 节点名称 (optional)
     * @param pageNum 页数，page_size不能为空 (optional)
     * @param pageSize 页显示大小，page_num不能为空 (optional)
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
    public okhttp3.Call batchqueryAsync(String ccsInstanceId, Integer libraryId, String name, Integer pageNum, Integer pageSize, final ApiCallback<AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(ccsInstanceId, libraryId, name, pageNum, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call batchqueryAsync(String ccsInstanceId, Integer libraryId, String name, Integer pageNum, Integer pageSize, final ApiCallback<AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(ccsInstanceId, libraryId, name, pageNum, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for create
     * @param alipayIserviceCcmSwTreecategoryCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayIserviceCcmSwTreecategoryCreateModel alipayIserviceCcmSwTreecategoryCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayIserviceCcmSwTreecategoryCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/iservice/ccm/sw/treecategory/create";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createValidateBeforeCall(AlipayIserviceCcmSwTreecategoryCreateModel alipayIserviceCcmSwTreecategoryCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayIserviceCcmSwTreecategoryCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 知识库-节点-创建
     * 知识库-节点-创建
     * @param alipayIserviceCcmSwTreecategoryCreateModel  (optional)
     * @return AlipayIserviceCcmSwTreecategoryCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayIserviceCcmSwTreecategoryCreateResponseModel create(AlipayIserviceCcmSwTreecategoryCreateModel alipayIserviceCcmSwTreecategoryCreateModel) throws ApiException {
        ApiResponse<AlipayIserviceCcmSwTreecategoryCreateResponseModel> localVarResp = createWithHttpInfo(alipayIserviceCcmSwTreecategoryCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayIserviceCcmSwTreecategoryCreateResponseModel create(AlipayIserviceCcmSwTreecategoryCreateModel alipayIserviceCcmSwTreecategoryCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayIserviceCcmSwTreecategoryCreateResponseModel> localVarResp = createWithHttpInfo(alipayIserviceCcmSwTreecategoryCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 知识库-节点-创建
     * 知识库-节点-创建
     * @param alipayIserviceCcmSwTreecategoryCreateModel  (optional)
     * @return ApiResponse&lt;AlipayIserviceCcmSwTreecategoryCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayIserviceCcmSwTreecategoryCreateResponseModel> createWithHttpInfo(AlipayIserviceCcmSwTreecategoryCreateModel alipayIserviceCcmSwTreecategoryCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayIserviceCcmSwTreecategoryCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayIserviceCcmSwTreecategoryCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayIserviceCcmSwTreecategoryCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 知识库-节点-创建 (asynchronously)
     * 知识库-节点-创建
     * @param alipayIserviceCcmSwTreecategoryCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayIserviceCcmSwTreecategoryCreateModel alipayIserviceCcmSwTreecategoryCreateModel, final ApiCallback<AlipayIserviceCcmSwTreecategoryCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayIserviceCcmSwTreecategoryCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmSwTreecategoryCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call createAsync(AlipayIserviceCcmSwTreecategoryCreateModel alipayIserviceCcmSwTreecategoryCreateModel, final ApiCallback<AlipayIserviceCcmSwTreecategoryCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayIserviceCcmSwTreecategoryCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmSwTreecategoryCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
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
    public okhttp3.Call deleteCall(final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/iservice/ccm/sw/treecategory/delete";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteValidateBeforeCall(final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = deleteCall(_callback, customizedParams);
        return localVarCall;

    }

    /**
     * 知识库-节点-删除
     * 知识库-节点-删除
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object delete() throws ApiException {
        ApiResponse<Object> localVarResp = deleteWithHttpInfo(null);
        return localVarResp.getData();
    }

    public Object delete(CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = deleteWithHttpInfo(customizedParams);
        return localVarResp.getData();
    }

    /**
     * 知识库-节点-删除
     * 知识库-节点-删除
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> deleteWithHttpInfo(CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayIserviceCcmSwTreecategoryDeleteDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 知识库-节点-删除 (asynchronously)
     * 知识库-节点-删除
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
    public okhttp3.Call deleteAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(_callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call deleteAsync(final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(_callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modify
     * @param alipayIserviceCcmSwTreecategoryModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayIserviceCcmSwTreecategoryModifyModel alipayIserviceCcmSwTreecategoryModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayIserviceCcmSwTreecategoryModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/iservice/ccm/sw/treecategory/modify";

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
    private okhttp3.Call modifyValidateBeforeCall(AlipayIserviceCcmSwTreecategoryModifyModel alipayIserviceCcmSwTreecategoryModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayIserviceCcmSwTreecategoryModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 知识库-节点-修改
     * 知识库-节点-修改
     * @param alipayIserviceCcmSwTreecategoryModifyModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object modify(AlipayIserviceCcmSwTreecategoryModifyModel alipayIserviceCcmSwTreecategoryModifyModel) throws ApiException {
        ApiResponse<Object> localVarResp = modifyWithHttpInfo(alipayIserviceCcmSwTreecategoryModifyModel, null);
        return localVarResp.getData();
    }

    public Object modify(AlipayIserviceCcmSwTreecategoryModifyModel alipayIserviceCcmSwTreecategoryModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = modifyWithHttpInfo(alipayIserviceCcmSwTreecategoryModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 知识库-节点-修改
     * 知识库-节点-修改
     * @param alipayIserviceCcmSwTreecategoryModifyModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> modifyWithHttpInfo(AlipayIserviceCcmSwTreecategoryModifyModel alipayIserviceCcmSwTreecategoryModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayIserviceCcmSwTreecategoryModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayIserviceCcmSwTreecategoryModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 知识库-节点-修改 (asynchronously)
     * 知识库-节点-修改
     * @param alipayIserviceCcmSwTreecategoryModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayIserviceCcmSwTreecategoryModifyModel alipayIserviceCcmSwTreecategoryModifyModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayIserviceCcmSwTreecategoryModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call modifyAsync(AlipayIserviceCcmSwTreecategoryModifyModel alipayIserviceCcmSwTreecategoryModifyModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayIserviceCcmSwTreecategoryModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
