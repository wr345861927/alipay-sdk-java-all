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


import com.alipay.v3.model.ZhimaCreditPeZmgoSettleApplyDefaultResponse;
import com.alipay.v3.model.ZhimaCreditPeZmgoSettleApplyModel;
import com.alipay.v3.model.ZhimaCreditPeZmgoSettleApplyResponseModel;
import com.alipay.v3.model.ZhimaCreditPeZmgoSettleRefundDefaultResponse;
import com.alipay.v3.model.ZhimaCreditPeZmgoSettleRefundModel;
import com.alipay.v3.model.ZhimaCreditPeZmgoSettleRefundResponseModel;
import com.alipay.v3.model.ZhimaCreditPeZmgoSettleUnfreezeDefaultResponse;
import com.alipay.v3.model.ZhimaCreditPeZmgoSettleUnfreezeModel;
import com.alipay.v3.model.ZhimaCreditPeZmgoSettleUnfreezeResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ZhimaCreditPeZmgoSettleApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZhimaCreditPeZmgoSettleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZhimaCreditPeZmgoSettleApi(ApiClient apiClient) {
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
     * @param zhimaCreditPeZmgoSettleApplyModel  (optional)
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
    public okhttp3.Call applyCall(ZhimaCreditPeZmgoSettleApplyModel zhimaCreditPeZmgoSettleApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : zhimaCreditPeZmgoSettleApplyModel;

        // create path and map variables
        String localVarPath = "/v3/zhima/credit/pe/zmgo/settle/apply";

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
    private okhttp3.Call applyValidateBeforeCall(ZhimaCreditPeZmgoSettleApplyModel zhimaCreditPeZmgoSettleApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = applyCall(zhimaCreditPeZmgoSettleApplyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 芝麻GO结算申请
     * 用户已经开通芝麻GO后，商户通过此接口解冻转支付用户冻结金额。传入金额必须小于等于冻结金额
     * @param zhimaCreditPeZmgoSettleApplyModel  (optional)
     * @return ZhimaCreditPeZmgoSettleApplyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaCreditPeZmgoSettleApplyResponseModel apply(ZhimaCreditPeZmgoSettleApplyModel zhimaCreditPeZmgoSettleApplyModel) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoSettleApplyResponseModel> localVarResp = applyWithHttpInfo(zhimaCreditPeZmgoSettleApplyModel, null);
        return localVarResp.getData();
    }

    public ZhimaCreditPeZmgoSettleApplyResponseModel apply(ZhimaCreditPeZmgoSettleApplyModel zhimaCreditPeZmgoSettleApplyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoSettleApplyResponseModel> localVarResp = applyWithHttpInfo(zhimaCreditPeZmgoSettleApplyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 芝麻GO结算申请
     * 用户已经开通芝麻GO后，商户通过此接口解冻转支付用户冻结金额。传入金额必须小于等于冻结金额
     * @param zhimaCreditPeZmgoSettleApplyModel  (optional)
     * @return ApiResponse&lt;ZhimaCreditPeZmgoSettleApplyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaCreditPeZmgoSettleApplyResponseModel> applyWithHttpInfo(ZhimaCreditPeZmgoSettleApplyModel zhimaCreditPeZmgoSettleApplyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = applyValidateBeforeCall(zhimaCreditPeZmgoSettleApplyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoSettleApplyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaCreditPeZmgoSettleApplyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 芝麻GO结算申请 (asynchronously)
     * 用户已经开通芝麻GO后，商户通过此接口解冻转支付用户冻结金额。传入金额必须小于等于冻结金额
     * @param zhimaCreditPeZmgoSettleApplyModel  (optional)
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
    public okhttp3.Call applyAsync(ZhimaCreditPeZmgoSettleApplyModel zhimaCreditPeZmgoSettleApplyModel, final ApiCallback<ZhimaCreditPeZmgoSettleApplyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(zhimaCreditPeZmgoSettleApplyModel, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoSettleApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call applyAsync(ZhimaCreditPeZmgoSettleApplyModel zhimaCreditPeZmgoSettleApplyModel, final ApiCallback<ZhimaCreditPeZmgoSettleApplyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(zhimaCreditPeZmgoSettleApplyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoSettleApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for refund
     * @param zhimaCreditPeZmgoSettleRefundModel  (optional)
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
    public okhttp3.Call refundCall(ZhimaCreditPeZmgoSettleRefundModel zhimaCreditPeZmgoSettleRefundModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : zhimaCreditPeZmgoSettleRefundModel;

        // create path and map variables
        String localVarPath = "/v3/zhima/credit/pe/zmgo/settle/refund";

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
    private okhttp3.Call refundValidateBeforeCall(ZhimaCreditPeZmgoSettleRefundModel zhimaCreditPeZmgoSettleRefundModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = refundCall(zhimaCreditPeZmgoSettleRefundModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 芝麻GO结算退款接口
     * 芝麻GO结算金额逆向退款接口: 对zhima.credit.pe.zmgo.settle.apply(芝麻GO结算申请接口) 产生的结算交易发起退款操作
     * @param zhimaCreditPeZmgoSettleRefundModel  (optional)
     * @return ZhimaCreditPeZmgoSettleRefundResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaCreditPeZmgoSettleRefundResponseModel refund(ZhimaCreditPeZmgoSettleRefundModel zhimaCreditPeZmgoSettleRefundModel) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoSettleRefundResponseModel> localVarResp = refundWithHttpInfo(zhimaCreditPeZmgoSettleRefundModel, null);
        return localVarResp.getData();
    }

    public ZhimaCreditPeZmgoSettleRefundResponseModel refund(ZhimaCreditPeZmgoSettleRefundModel zhimaCreditPeZmgoSettleRefundModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoSettleRefundResponseModel> localVarResp = refundWithHttpInfo(zhimaCreditPeZmgoSettleRefundModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 芝麻GO结算退款接口
     * 芝麻GO结算金额逆向退款接口: 对zhima.credit.pe.zmgo.settle.apply(芝麻GO结算申请接口) 产生的结算交易发起退款操作
     * @param zhimaCreditPeZmgoSettleRefundModel  (optional)
     * @return ApiResponse&lt;ZhimaCreditPeZmgoSettleRefundResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaCreditPeZmgoSettleRefundResponseModel> refundWithHttpInfo(ZhimaCreditPeZmgoSettleRefundModel zhimaCreditPeZmgoSettleRefundModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = refundValidateBeforeCall(zhimaCreditPeZmgoSettleRefundModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoSettleRefundResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaCreditPeZmgoSettleRefundDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 芝麻GO结算退款接口 (asynchronously)
     * 芝麻GO结算金额逆向退款接口: 对zhima.credit.pe.zmgo.settle.apply(芝麻GO结算申请接口) 产生的结算交易发起退款操作
     * @param zhimaCreditPeZmgoSettleRefundModel  (optional)
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
    public okhttp3.Call refundAsync(ZhimaCreditPeZmgoSettleRefundModel zhimaCreditPeZmgoSettleRefundModel, final ApiCallback<ZhimaCreditPeZmgoSettleRefundResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = refundValidateBeforeCall(zhimaCreditPeZmgoSettleRefundModel, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoSettleRefundResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call refundAsync(ZhimaCreditPeZmgoSettleRefundModel zhimaCreditPeZmgoSettleRefundModel, final ApiCallback<ZhimaCreditPeZmgoSettleRefundResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = refundValidateBeforeCall(zhimaCreditPeZmgoSettleRefundModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoSettleRefundResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unfreeze
     * @param zhimaCreditPeZmgoSettleUnfreezeModel  (optional)
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
    public okhttp3.Call unfreezeCall(ZhimaCreditPeZmgoSettleUnfreezeModel zhimaCreditPeZmgoSettleUnfreezeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : zhimaCreditPeZmgoSettleUnfreezeModel;

        // create path and map variables
        String localVarPath = "/v3/zhima/credit/pe/zmgo/settle/unfreeze";

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
    private okhttp3.Call unfreezeValidateBeforeCall(ZhimaCreditPeZmgoSettleUnfreezeModel zhimaCreditPeZmgoSettleUnfreezeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = unfreezeCall(zhimaCreditPeZmgoSettleUnfreezeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 芝麻GO解冻接口
     * 用户已经开通芝麻GO后，商户通过此接口解冻转支付用户冻结金额。传入金额必须小于等于冻结金额
     * @param zhimaCreditPeZmgoSettleUnfreezeModel  (optional)
     * @return ZhimaCreditPeZmgoSettleUnfreezeResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaCreditPeZmgoSettleUnfreezeResponseModel unfreeze(ZhimaCreditPeZmgoSettleUnfreezeModel zhimaCreditPeZmgoSettleUnfreezeModel) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoSettleUnfreezeResponseModel> localVarResp = unfreezeWithHttpInfo(zhimaCreditPeZmgoSettleUnfreezeModel, null);
        return localVarResp.getData();
    }

    public ZhimaCreditPeZmgoSettleUnfreezeResponseModel unfreeze(ZhimaCreditPeZmgoSettleUnfreezeModel zhimaCreditPeZmgoSettleUnfreezeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoSettleUnfreezeResponseModel> localVarResp = unfreezeWithHttpInfo(zhimaCreditPeZmgoSettleUnfreezeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 芝麻GO解冻接口
     * 用户已经开通芝麻GO后，商户通过此接口解冻转支付用户冻结金额。传入金额必须小于等于冻结金额
     * @param zhimaCreditPeZmgoSettleUnfreezeModel  (optional)
     * @return ApiResponse&lt;ZhimaCreditPeZmgoSettleUnfreezeResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaCreditPeZmgoSettleUnfreezeResponseModel> unfreezeWithHttpInfo(ZhimaCreditPeZmgoSettleUnfreezeModel zhimaCreditPeZmgoSettleUnfreezeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = unfreezeValidateBeforeCall(zhimaCreditPeZmgoSettleUnfreezeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoSettleUnfreezeResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaCreditPeZmgoSettleUnfreezeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 芝麻GO解冻接口 (asynchronously)
     * 用户已经开通芝麻GO后，商户通过此接口解冻转支付用户冻结金额。传入金额必须小于等于冻结金额
     * @param zhimaCreditPeZmgoSettleUnfreezeModel  (optional)
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
    public okhttp3.Call unfreezeAsync(ZhimaCreditPeZmgoSettleUnfreezeModel zhimaCreditPeZmgoSettleUnfreezeModel, final ApiCallback<ZhimaCreditPeZmgoSettleUnfreezeResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = unfreezeValidateBeforeCall(zhimaCreditPeZmgoSettleUnfreezeModel, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoSettleUnfreezeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call unfreezeAsync(ZhimaCreditPeZmgoSettleUnfreezeModel zhimaCreditPeZmgoSettleUnfreezeModel, final ApiCallback<ZhimaCreditPeZmgoSettleUnfreezeResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = unfreezeValidateBeforeCall(zhimaCreditPeZmgoSettleUnfreezeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoSettleUnfreezeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
