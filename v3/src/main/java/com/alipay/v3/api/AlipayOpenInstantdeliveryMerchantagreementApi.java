/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
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


import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantagreementQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantagreementSignDefaultResponse;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantagreementSignModel;
import com.alipay.v3.model.AlipayOpenInstantdeliveryMerchantagreementSignResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenInstantdeliveryMerchantagreementApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenInstantdeliveryMerchantagreementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenInstantdeliveryMerchantagreementApi(ApiClient apiClient) {
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
    public okhttp3.Call queryCall(final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/instantdelivery/merchantagreement/query";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryValidateBeforeCall(final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(_callback, customizedParams);
        return localVarCall;

    }

    /**
     * 协议签署查询api
     * 协议签署查询api, 提供isv查询商户物流代扣协议签署情况
     * @return AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel query() throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel> localVarResp = queryWithHttpInfo(null);
        return localVarResp.getData();
    }

    public AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel query(CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel> localVarResp = queryWithHttpInfo(customizedParams);
        return localVarResp.getData();
    }

    /**
     * 协议签署查询api
     * 协议签署查询api, 提供isv查询商户物流代扣协议签署情况
     * @return ApiResponse&lt;AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel> queryWithHttpInfo(CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenInstantdeliveryMerchantagreementQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 协议签署查询api (asynchronously)
     * 协议签署查询api, 提供isv查询商户物流代扣协议签署情况
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
    public okhttp3.Call queryAsync(final ApiCallback<AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(_callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(final ApiCallback<AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(_callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sign
     * @param alipayOpenInstantdeliveryMerchantagreementSignModel  (optional)
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
    public okhttp3.Call signCall(AlipayOpenInstantdeliveryMerchantagreementSignModel alipayOpenInstantdeliveryMerchantagreementSignModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenInstantdeliveryMerchantagreementSignModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/instantdelivery/merchantagreement/sign";

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
    private okhttp3.Call signValidateBeforeCall(AlipayOpenInstantdeliveryMerchantagreementSignModel alipayOpenInstantdeliveryMerchantagreementSignModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = signCall(alipayOpenInstantdeliveryMerchantagreementSignModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 即时配送中商家代扣协议签署
     * 即时配送中商家代扣协议签署
     * @param alipayOpenInstantdeliveryMerchantagreementSignModel  (optional)
     * @return AlipayOpenInstantdeliveryMerchantagreementSignResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenInstantdeliveryMerchantagreementSignResponseModel sign(AlipayOpenInstantdeliveryMerchantagreementSignModel alipayOpenInstantdeliveryMerchantagreementSignModel) throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantagreementSignResponseModel> localVarResp = signWithHttpInfo(alipayOpenInstantdeliveryMerchantagreementSignModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenInstantdeliveryMerchantagreementSignResponseModel sign(AlipayOpenInstantdeliveryMerchantagreementSignModel alipayOpenInstantdeliveryMerchantagreementSignModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenInstantdeliveryMerchantagreementSignResponseModel> localVarResp = signWithHttpInfo(alipayOpenInstantdeliveryMerchantagreementSignModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 即时配送中商家代扣协议签署
     * 即时配送中商家代扣协议签署
     * @param alipayOpenInstantdeliveryMerchantagreementSignModel  (optional)
     * @return ApiResponse&lt;AlipayOpenInstantdeliveryMerchantagreementSignResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenInstantdeliveryMerchantagreementSignResponseModel> signWithHttpInfo(AlipayOpenInstantdeliveryMerchantagreementSignModel alipayOpenInstantdeliveryMerchantagreementSignModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = signValidateBeforeCall(alipayOpenInstantdeliveryMerchantagreementSignModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantagreementSignResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenInstantdeliveryMerchantagreementSignDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 即时配送中商家代扣协议签署 (asynchronously)
     * 即时配送中商家代扣协议签署
     * @param alipayOpenInstantdeliveryMerchantagreementSignModel  (optional)
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
    public okhttp3.Call signAsync(AlipayOpenInstantdeliveryMerchantagreementSignModel alipayOpenInstantdeliveryMerchantagreementSignModel, final ApiCallback<AlipayOpenInstantdeliveryMerchantagreementSignResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = signValidateBeforeCall(alipayOpenInstantdeliveryMerchantagreementSignModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantagreementSignResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call signAsync(AlipayOpenInstantdeliveryMerchantagreementSignModel alipayOpenInstantdeliveryMerchantagreementSignModel, final ApiCallback<AlipayOpenInstantdeliveryMerchantagreementSignResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = signValidateBeforeCall(alipayOpenInstantdeliveryMerchantagreementSignModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenInstantdeliveryMerchantagreementSignResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
