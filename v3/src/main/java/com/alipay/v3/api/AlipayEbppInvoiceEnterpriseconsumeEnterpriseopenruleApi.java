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


import com.alipay.v3.model.AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel;
import com.alipay.v3.model.AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel;
import com.alipay.v3.model.AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel;
import com.alipay.v3.model.AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel;
import com.alipay.v3.model.AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi(ApiClient apiClient) {
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
     * @param alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/enterpriseconsume/enterpriseopenrule/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 新增开票规则
     * 新增一条开票规则配置
     * @param alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel  (optional)
     * @return AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel create(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel create(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 新增开票规则
     * 新增一条开票规则配置
     * @param alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel> createWithHttpInfo(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 新增开票规则 (asynchronously)
     * 新增一条开票规则配置
     * @param alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, final ApiCallback<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call createAsync(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, final ApiCallback<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modify
     * @param alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/enterpriseconsume/enterpriseopenrule/modify";

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
    private okhttp3.Call modifyValidateBeforeCall(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 修改开票规则
     * 修改开票规则
     * @param alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel  (optional)
     * @return AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel modify(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel modify(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 修改开票规则
     * 修改开票规则
     * @param alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel> modifyWithHttpInfo(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 修改开票规则 (asynchronously)
     * 修改开票规则
     * @param alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, final ApiCallback<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call modifyAsync(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, final ApiCallback<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param enterpriseId 企业ID (optional)
     * @param invoiceRuleId 开票规则ID (optional)
     * @param accountId 共同账户ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
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
    public okhttp3.Call queryCall(String enterpriseId, String invoiceRuleId, String accountId, String agreementNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/ebpp/invoice/enterpriseconsume/enterpriseopenrule/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (enterpriseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("enterprise_id", enterpriseId));
        }

        if (invoiceRuleId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_rule_id", invoiceRuleId));
        }

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
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
    private okhttp3.Call queryValidateBeforeCall(String enterpriseId, String invoiceRuleId, String accountId, String agreementNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(enterpriseId, invoiceRuleId, accountId, agreementNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询开票规则
     * 根据开票规则ID查询开票规则详情
     * @param enterpriseId 企业ID (optional)
     * @param invoiceRuleId 开票规则ID (optional)
     * @param accountId 共同账户ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @return AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel query(String enterpriseId, String invoiceRuleId, String accountId, String agreementNo) throws ApiException {
        ApiResponse<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel> localVarResp = queryWithHttpInfo(enterpriseId, invoiceRuleId, accountId, agreementNo, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel query(String enterpriseId, String invoiceRuleId, String accountId, String agreementNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel> localVarResp = queryWithHttpInfo(enterpriseId, invoiceRuleId, accountId, agreementNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询开票规则
     * 根据开票规则ID查询开票规则详情
     * @param enterpriseId 企业ID (optional)
     * @param invoiceRuleId 开票规则ID (optional)
     * @param accountId 共同账户ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel> queryWithHttpInfo(String enterpriseId, String invoiceRuleId, String accountId, String agreementNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, invoiceRuleId, accountId, agreementNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询开票规则 (asynchronously)
     * 根据开票规则ID查询开票规则详情
     * @param enterpriseId 企业ID (optional)
     * @param invoiceRuleId 开票规则ID (optional)
     * @param accountId 共同账户ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
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
    public okhttp3.Call queryAsync(String enterpriseId, String invoiceRuleId, String accountId, String agreementNo, final ApiCallback<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, invoiceRuleId, accountId, agreementNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String enterpriseId, String invoiceRuleId, String accountId, String agreementNo, final ApiCallback<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, invoiceRuleId, accountId, agreementNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
