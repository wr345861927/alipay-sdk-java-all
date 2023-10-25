/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-10-25
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


import com.alipay.v3.model.AlipayMarketingCampaignOrderVoucherConsultDefaultResponse;
import com.alipay.v3.model.AlipayMarketingCampaignOrderVoucherConsultModel;
import com.alipay.v3.model.AlipayMarketingCampaignOrderVoucherConsultResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMarketingCampaignOrderVoucherApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMarketingCampaignOrderVoucherApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMarketingCampaignOrderVoucherApi(ApiClient apiClient) {
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
     * Build call for consult
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingCampaignOrderVoucherConsultModel  (optional)
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
    public okhttp3.Call consultCall(String authToken, AlipayMarketingCampaignOrderVoucherConsultModel alipayMarketingCampaignOrderVoucherConsultModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMarketingCampaignOrderVoucherConsultModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/campaign/order/voucher/consult";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auth_token", authToken));
        }

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
    private okhttp3.Call consultValidateBeforeCall(String authToken, AlipayMarketingCampaignOrderVoucherConsultModel alipayMarketingCampaignOrderVoucherConsultModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = consultCall(authToken, alipayMarketingCampaignOrderVoucherConsultModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 订单优惠前置咨询
     * 本接口用于前置优惠咨询，包括本订单可享的优惠券列表，注意该列表并不等价于最终核销时使用的券列表，而是包含了咨询的那一刻该订单能用的所有券，且券满足叠加使用下的互斥等规则
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingCampaignOrderVoucherConsultModel  (optional)
     * @return AlipayMarketingCampaignOrderVoucherConsultResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingCampaignOrderVoucherConsultResponseModel consult(String authToken, AlipayMarketingCampaignOrderVoucherConsultModel alipayMarketingCampaignOrderVoucherConsultModel) throws ApiException {
        ApiResponse<AlipayMarketingCampaignOrderVoucherConsultResponseModel> localVarResp = consultWithHttpInfo(authToken, alipayMarketingCampaignOrderVoucherConsultModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingCampaignOrderVoucherConsultResponseModel consult(String authToken, AlipayMarketingCampaignOrderVoucherConsultModel alipayMarketingCampaignOrderVoucherConsultModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingCampaignOrderVoucherConsultResponseModel> localVarResp = consultWithHttpInfo(authToken, alipayMarketingCampaignOrderVoucherConsultModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 订单优惠前置咨询
     * 本接口用于前置优惠咨询，包括本订单可享的优惠券列表，注意该列表并不等价于最终核销时使用的券列表，而是包含了咨询的那一刻该订单能用的所有券，且券满足叠加使用下的互斥等规则
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingCampaignOrderVoucherConsultModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingCampaignOrderVoucherConsultResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingCampaignOrderVoucherConsultResponseModel> consultWithHttpInfo(String authToken, AlipayMarketingCampaignOrderVoucherConsultModel alipayMarketingCampaignOrderVoucherConsultModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = consultValidateBeforeCall(authToken, alipayMarketingCampaignOrderVoucherConsultModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingCampaignOrderVoucherConsultResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingCampaignOrderVoucherConsultDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 订单优惠前置咨询 (asynchronously)
     * 本接口用于前置优惠咨询，包括本订单可享的优惠券列表，注意该列表并不等价于最终核销时使用的券列表，而是包含了咨询的那一刻该订单能用的所有券，且券满足叠加使用下的互斥等规则
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingCampaignOrderVoucherConsultModel  (optional)
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
    public okhttp3.Call consultAsync(String authToken, AlipayMarketingCampaignOrderVoucherConsultModel alipayMarketingCampaignOrderVoucherConsultModel, final ApiCallback<AlipayMarketingCampaignOrderVoucherConsultResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(authToken, alipayMarketingCampaignOrderVoucherConsultModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingCampaignOrderVoucherConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call consultAsync(String authToken, AlipayMarketingCampaignOrderVoucherConsultModel alipayMarketingCampaignOrderVoucherConsultModel, final ApiCallback<AlipayMarketingCampaignOrderVoucherConsultResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(authToken, alipayMarketingCampaignOrderVoucherConsultModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingCampaignOrderVoucherConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
