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


import com.alipay.v3.model.ZhimaCreditPeZmgoAgreementQueryDefaultResponse;
import com.alipay.v3.model.ZhimaCreditPeZmgoAgreementQueryResponseModel;
import com.alipay.v3.model.ZhimaCreditPeZmgoAgreementUnsignDefaultResponse;
import com.alipay.v3.model.ZhimaCreditPeZmgoAgreementUnsignModel;
import com.alipay.v3.model.ZhimaCreditPeZmgoAgreementUnsignResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ZhimaCreditPeZmgoAgreementApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZhimaCreditPeZmgoAgreementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZhimaCreditPeZmgoAgreementApi(ApiClient apiClient) {
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
     * @param agreementId 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。 (optional)
     * @param alipayUserId 买家在支付宝的用户id (optional)
     * @param openId 买家在支付宝的用户id (optional)
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
    public okhttp3.Call queryCall(String agreementId, String alipayUserId, String openId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/zhima/credit/pe/zmgo/agreement/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agreementId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_id", agreementId));
        }

        if (alipayUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("alipay_user_id", alipayUserId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
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
    private okhttp3.Call queryValidateBeforeCall(String agreementId, String alipayUserId, String openId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(agreementId, alipayUserId, openId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 芝麻Go协议查询接口
     * 用户已经开通芝麻GO后，通过此接口查询协议。
     * @param agreementId 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。 (optional)
     * @param alipayUserId 买家在支付宝的用户id (optional)
     * @param openId 买家在支付宝的用户id (optional)
     * @return ZhimaCreditPeZmgoAgreementQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaCreditPeZmgoAgreementQueryResponseModel query(String agreementId, String alipayUserId, String openId) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoAgreementQueryResponseModel> localVarResp = queryWithHttpInfo(agreementId, alipayUserId, openId, null);
        return localVarResp.getData();
    }

    public ZhimaCreditPeZmgoAgreementQueryResponseModel query(String agreementId, String alipayUserId, String openId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoAgreementQueryResponseModel> localVarResp = queryWithHttpInfo(agreementId, alipayUserId, openId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 芝麻Go协议查询接口
     * 用户已经开通芝麻GO后，通过此接口查询协议。
     * @param agreementId 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。 (optional)
     * @param alipayUserId 买家在支付宝的用户id (optional)
     * @param openId 买家在支付宝的用户id (optional)
     * @return ApiResponse&lt;ZhimaCreditPeZmgoAgreementQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaCreditPeZmgoAgreementQueryResponseModel> queryWithHttpInfo(String agreementId, String alipayUserId, String openId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(agreementId, alipayUserId, openId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoAgreementQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaCreditPeZmgoAgreementQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 芝麻Go协议查询接口 (asynchronously)
     * 用户已经开通芝麻GO后，通过此接口查询协议。
     * @param agreementId 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。 (optional)
     * @param alipayUserId 买家在支付宝的用户id (optional)
     * @param openId 买家在支付宝的用户id (optional)
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
    public okhttp3.Call queryAsync(String agreementId, String alipayUserId, String openId, final ApiCallback<ZhimaCreditPeZmgoAgreementQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(agreementId, alipayUserId, openId, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoAgreementQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String agreementId, String alipayUserId, String openId, final ApiCallback<ZhimaCreditPeZmgoAgreementQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(agreementId, alipayUserId, openId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoAgreementQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unsign
     * @param zhimaCreditPeZmgoAgreementUnsignModel  (optional)
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
    public okhttp3.Call unsignCall(ZhimaCreditPeZmgoAgreementUnsignModel zhimaCreditPeZmgoAgreementUnsignModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : zhimaCreditPeZmgoAgreementUnsignModel;

        // create path and map variables
        String localVarPath = "/v3/zhima/credit/pe/zmgo/agreement/unsign";

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
    private okhttp3.Call unsignValidateBeforeCall(ZhimaCreditPeZmgoAgreementUnsignModel zhimaCreditPeZmgoAgreementUnsignModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = unsignCall(zhimaCreditPeZmgoAgreementUnsignModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 芝麻GO协议解约
     * 芝麻GO协议解约
     * @param zhimaCreditPeZmgoAgreementUnsignModel  (optional)
     * @return ZhimaCreditPeZmgoAgreementUnsignResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaCreditPeZmgoAgreementUnsignResponseModel unsign(ZhimaCreditPeZmgoAgreementUnsignModel zhimaCreditPeZmgoAgreementUnsignModel) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoAgreementUnsignResponseModel> localVarResp = unsignWithHttpInfo(zhimaCreditPeZmgoAgreementUnsignModel, null);
        return localVarResp.getData();
    }

    public ZhimaCreditPeZmgoAgreementUnsignResponseModel unsign(ZhimaCreditPeZmgoAgreementUnsignModel zhimaCreditPeZmgoAgreementUnsignModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoAgreementUnsignResponseModel> localVarResp = unsignWithHttpInfo(zhimaCreditPeZmgoAgreementUnsignModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 芝麻GO协议解约
     * 芝麻GO协议解约
     * @param zhimaCreditPeZmgoAgreementUnsignModel  (optional)
     * @return ApiResponse&lt;ZhimaCreditPeZmgoAgreementUnsignResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaCreditPeZmgoAgreementUnsignResponseModel> unsignWithHttpInfo(ZhimaCreditPeZmgoAgreementUnsignModel zhimaCreditPeZmgoAgreementUnsignModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = unsignValidateBeforeCall(zhimaCreditPeZmgoAgreementUnsignModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoAgreementUnsignResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaCreditPeZmgoAgreementUnsignDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 芝麻GO协议解约 (asynchronously)
     * 芝麻GO协议解约
     * @param zhimaCreditPeZmgoAgreementUnsignModel  (optional)
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
    public okhttp3.Call unsignAsync(ZhimaCreditPeZmgoAgreementUnsignModel zhimaCreditPeZmgoAgreementUnsignModel, final ApiCallback<ZhimaCreditPeZmgoAgreementUnsignResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = unsignValidateBeforeCall(zhimaCreditPeZmgoAgreementUnsignModel, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoAgreementUnsignResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call unsignAsync(ZhimaCreditPeZmgoAgreementUnsignModel zhimaCreditPeZmgoAgreementUnsignModel, final ApiCallback<ZhimaCreditPeZmgoAgreementUnsignResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = unsignValidateBeforeCall(zhimaCreditPeZmgoAgreementUnsignModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoAgreementUnsignResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
