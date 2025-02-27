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


import com.alipay.v3.model.ZhimaCreditPayafteruseCreditagreementQueryDefaultResponse;
import com.alipay.v3.model.ZhimaCreditPayafteruseCreditagreementQueryResponseModel;
import com.alipay.v3.model.ZhimaCreditPayafteruseCreditagreementTransferDefaultResponse;
import com.alipay.v3.model.ZhimaCreditPayafteruseCreditagreementTransferModel;
import com.alipay.v3.model.ZhimaCreditPayafteruseCreditagreementTransferResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ZhimaCreditPayafteruseCreditagreementApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZhimaCreditPayafteruseCreditagreementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZhimaCreditPayafteruseCreditagreementApi(ApiClient apiClient) {
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
     * @param outAgreementNo 商户外部协议号 (optional)
     * @param creditAgreementId 芝麻开通/授权协议号，out_agreement_no与credit_agreement_id必填一个，推荐使用credit_agreement_id。 (optional)
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
    public okhttp3.Call queryCall(String outAgreementNo, String creditAgreementId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/zhima/credit/payafteruse/creditagreement/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (outAgreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_agreement_no", outAgreementNo));
        }

        if (creditAgreementId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("credit_agreement_id", creditAgreementId));
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
    private okhttp3.Call queryValidateBeforeCall(String outAgreementNo, String creditAgreementId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(outAgreementNo, creditAgreementId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询服务开通/授权信息
     * 使用商户外部协议号或开通/授权协议号，查询服务开通/授权信息。
     * @param outAgreementNo 商户外部协议号 (optional)
     * @param creditAgreementId 芝麻开通/授权协议号，out_agreement_no与credit_agreement_id必填一个，推荐使用credit_agreement_id。 (optional)
     * @return ZhimaCreditPayafteruseCreditagreementQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaCreditPayafteruseCreditagreementQueryResponseModel query(String outAgreementNo, String creditAgreementId) throws ApiException {
        ApiResponse<ZhimaCreditPayafteruseCreditagreementQueryResponseModel> localVarResp = queryWithHttpInfo(outAgreementNo, creditAgreementId, null);
        return localVarResp.getData();
    }

    public ZhimaCreditPayafteruseCreditagreementQueryResponseModel query(String outAgreementNo, String creditAgreementId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaCreditPayafteruseCreditagreementQueryResponseModel> localVarResp = queryWithHttpInfo(outAgreementNo, creditAgreementId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询服务开通/授权信息
     * 使用商户外部协议号或开通/授权协议号，查询服务开通/授权信息。
     * @param outAgreementNo 商户外部协议号 (optional)
     * @param creditAgreementId 芝麻开通/授权协议号，out_agreement_no与credit_agreement_id必填一个，推荐使用credit_agreement_id。 (optional)
     * @return ApiResponse&lt;ZhimaCreditPayafteruseCreditagreementQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaCreditPayafteruseCreditagreementQueryResponseModel> queryWithHttpInfo(String outAgreementNo, String creditAgreementId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(outAgreementNo, creditAgreementId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaCreditPayafteruseCreditagreementQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaCreditPayafteruseCreditagreementQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询服务开通/授权信息 (asynchronously)
     * 使用商户外部协议号或开通/授权协议号，查询服务开通/授权信息。
     * @param outAgreementNo 商户外部协议号 (optional)
     * @param creditAgreementId 芝麻开通/授权协议号，out_agreement_no与credit_agreement_id必填一个，推荐使用credit_agreement_id。 (optional)
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
    public okhttp3.Call queryAsync(String outAgreementNo, String creditAgreementId, final ApiCallback<ZhimaCreditPayafteruseCreditagreementQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(outAgreementNo, creditAgreementId, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaCreditPayafteruseCreditagreementQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String outAgreementNo, String creditAgreementId, final ApiCallback<ZhimaCreditPayafteruseCreditagreementQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(outAgreementNo, creditAgreementId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaCreditPayafteruseCreditagreementQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for transfer
     * @param zhimaCreditPayafteruseCreditagreementTransferModel  (optional)
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
    public okhttp3.Call transferCall(ZhimaCreditPayafteruseCreditagreementTransferModel zhimaCreditPayafteruseCreditagreementTransferModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : zhimaCreditPayafteruseCreditagreementTransferModel;

        // create path and map variables
        String localVarPath = "/v3/zhima/credit/payafteruse/creditagreement/transfer";

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
    private okhttp3.Call transferValidateBeforeCall(ZhimaCreditPayafteruseCreditagreementTransferModel zhimaCreditPayafteruseCreditagreementTransferModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = transferCall(zhimaCreditPayafteruseCreditagreementTransferModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 转换为芝麻先享
     * 其他产品功能（例如信用代扣），通过该接口，可以转换为芝麻先享
     * @param zhimaCreditPayafteruseCreditagreementTransferModel  (optional)
     * @return ZhimaCreditPayafteruseCreditagreementTransferResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaCreditPayafteruseCreditagreementTransferResponseModel transfer(ZhimaCreditPayafteruseCreditagreementTransferModel zhimaCreditPayafteruseCreditagreementTransferModel) throws ApiException {
        ApiResponse<ZhimaCreditPayafteruseCreditagreementTransferResponseModel> localVarResp = transferWithHttpInfo(zhimaCreditPayafteruseCreditagreementTransferModel, null);
        return localVarResp.getData();
    }

    public ZhimaCreditPayafteruseCreditagreementTransferResponseModel transfer(ZhimaCreditPayafteruseCreditagreementTransferModel zhimaCreditPayafteruseCreditagreementTransferModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaCreditPayafteruseCreditagreementTransferResponseModel> localVarResp = transferWithHttpInfo(zhimaCreditPayafteruseCreditagreementTransferModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 转换为芝麻先享
     * 其他产品功能（例如信用代扣），通过该接口，可以转换为芝麻先享
     * @param zhimaCreditPayafteruseCreditagreementTransferModel  (optional)
     * @return ApiResponse&lt;ZhimaCreditPayafteruseCreditagreementTransferResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaCreditPayafteruseCreditagreementTransferResponseModel> transferWithHttpInfo(ZhimaCreditPayafteruseCreditagreementTransferModel zhimaCreditPayafteruseCreditagreementTransferModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = transferValidateBeforeCall(zhimaCreditPayafteruseCreditagreementTransferModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaCreditPayafteruseCreditagreementTransferResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaCreditPayafteruseCreditagreementTransferDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 转换为芝麻先享 (asynchronously)
     * 其他产品功能（例如信用代扣），通过该接口，可以转换为芝麻先享
     * @param zhimaCreditPayafteruseCreditagreementTransferModel  (optional)
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
    public okhttp3.Call transferAsync(ZhimaCreditPayafteruseCreditagreementTransferModel zhimaCreditPayafteruseCreditagreementTransferModel, final ApiCallback<ZhimaCreditPayafteruseCreditagreementTransferResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = transferValidateBeforeCall(zhimaCreditPayafteruseCreditagreementTransferModel, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaCreditPayafteruseCreditagreementTransferResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call transferAsync(ZhimaCreditPayafteruseCreditagreementTransferModel zhimaCreditPayafteruseCreditagreementTransferModel, final ApiCallback<ZhimaCreditPayafteruseCreditagreementTransferResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = transferValidateBeforeCall(zhimaCreditPayafteruseCreditagreementTransferModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaCreditPayafteruseCreditagreementTransferResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
