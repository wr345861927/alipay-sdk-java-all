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


import com.alipay.v3.model.AlipayOpenPublicArticlesummaryDataBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenPublicArticlesummaryDataBatchqueryModel;
import com.alipay.v3.model.AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenPublicArticlesummaryDataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenPublicArticlesummaryDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenPublicArticlesummaryDataApi(ApiClient apiClient) {
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
     * @param alipayOpenPublicArticlesummaryDataBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryCall(AlipayOpenPublicArticlesummaryDataBatchqueryModel alipayOpenPublicArticlesummaryDataBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenPublicArticlesummaryDataBatchqueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/public/articlesummary/data/batchquery";

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
    private okhttp3.Call batchqueryValidateBeforeCall(AlipayOpenPublicArticlesummaryDataBatchqueryModel alipayOpenPublicArticlesummaryDataBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(alipayOpenPublicArticlesummaryDataBatchqueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 图文分析-按时间查询数据接口
     * 开发者可以通过图文分析接口查询30天内，所有历史发布的图文消息的数据，包括送达人数、曝光人数、图文阅读人数、分享人数等信息。
     * @param alipayOpenPublicArticlesummaryDataBatchqueryModel  (optional)
     * @return AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel batchquery(AlipayOpenPublicArticlesummaryDataBatchqueryModel alipayOpenPublicArticlesummaryDataBatchqueryModel) throws ApiException {
        ApiResponse<AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayOpenPublicArticlesummaryDataBatchqueryModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel batchquery(AlipayOpenPublicArticlesummaryDataBatchqueryModel alipayOpenPublicArticlesummaryDataBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayOpenPublicArticlesummaryDataBatchqueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 图文分析-按时间查询数据接口
     * 开发者可以通过图文分析接口查询30天内，所有历史发布的图文消息的数据，包括送达人数、曝光人数、图文阅读人数、分享人数等信息。
     * @param alipayOpenPublicArticlesummaryDataBatchqueryModel  (optional)
     * @return ApiResponse&lt;AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel> batchqueryWithHttpInfo(AlipayOpenPublicArticlesummaryDataBatchqueryModel alipayOpenPublicArticlesummaryDataBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOpenPublicArticlesummaryDataBatchqueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenPublicArticlesummaryDataBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 图文分析-按时间查询数据接口 (asynchronously)
     * 开发者可以通过图文分析接口查询30天内，所有历史发布的图文消息的数据，包括送达人数、曝光人数、图文阅读人数、分享人数等信息。
     * @param alipayOpenPublicArticlesummaryDataBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryAsync(AlipayOpenPublicArticlesummaryDataBatchqueryModel alipayOpenPublicArticlesummaryDataBatchqueryModel, final ApiCallback<AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOpenPublicArticlesummaryDataBatchqueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call batchqueryAsync(AlipayOpenPublicArticlesummaryDataBatchqueryModel alipayOpenPublicArticlesummaryDataBatchqueryModel, final ApiCallback<AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOpenPublicArticlesummaryDataBatchqueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
