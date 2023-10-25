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


import com.alipay.v3.model.AlipayTradeOrderPayDefaultResponse;
import com.alipay.v3.model.AlipayTradeOrderPayModel;
import com.alipay.v3.model.AlipayTradeOrderPayResponseModel;
import com.alipay.v3.model.AlipayTradeOrderSettleDefaultResponse;
import com.alipay.v3.model.AlipayTradeOrderSettleModel;
import com.alipay.v3.model.AlipayTradeOrderSettleResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayTradeOrderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayTradeOrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayTradeOrderApi(ApiClient apiClient) {
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
     * Build call for pay
     * @param alipayTradeOrderPayModel  (optional)
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
    public okhttp3.Call payCall(AlipayTradeOrderPayModel alipayTradeOrderPayModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayTradeOrderPayModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/trade/order/pay";

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
    private okhttp3.Call payValidateBeforeCall(AlipayTradeOrderPayModel alipayTradeOrderPayModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = payCall(alipayTradeOrderPayModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 统一收单交易订单支付接口
     * 商户用已创建的交易进行支付（需要使用该接口请联系接口owner）
     * @param alipayTradeOrderPayModel  (optional)
     * @return AlipayTradeOrderPayResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayTradeOrderPayResponseModel pay(AlipayTradeOrderPayModel alipayTradeOrderPayModel) throws ApiException {
        ApiResponse<AlipayTradeOrderPayResponseModel> localVarResp = payWithHttpInfo(alipayTradeOrderPayModel, null);
        return localVarResp.getData();
    }

    public AlipayTradeOrderPayResponseModel pay(AlipayTradeOrderPayModel alipayTradeOrderPayModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayTradeOrderPayResponseModel> localVarResp = payWithHttpInfo(alipayTradeOrderPayModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 统一收单交易订单支付接口
     * 商户用已创建的交易进行支付（需要使用该接口请联系接口owner）
     * @param alipayTradeOrderPayModel  (optional)
     * @return ApiResponse&lt;AlipayTradeOrderPayResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayTradeOrderPayResponseModel> payWithHttpInfo(AlipayTradeOrderPayModel alipayTradeOrderPayModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = payValidateBeforeCall(alipayTradeOrderPayModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayTradeOrderPayResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayTradeOrderPayDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 统一收单交易订单支付接口 (asynchronously)
     * 商户用已创建的交易进行支付（需要使用该接口请联系接口owner）
     * @param alipayTradeOrderPayModel  (optional)
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
    public okhttp3.Call payAsync(AlipayTradeOrderPayModel alipayTradeOrderPayModel, final ApiCallback<AlipayTradeOrderPayResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = payValidateBeforeCall(alipayTradeOrderPayModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayTradeOrderPayResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call payAsync(AlipayTradeOrderPayModel alipayTradeOrderPayModel, final ApiCallback<AlipayTradeOrderPayResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = payValidateBeforeCall(alipayTradeOrderPayModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayTradeOrderPayResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for settle
     * @param alipayTradeOrderSettleModel  (optional)
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
    public okhttp3.Call settleCall(AlipayTradeOrderSettleModel alipayTradeOrderSettleModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayTradeOrderSettleModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/trade/order/settle";

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
    private okhttp3.Call settleValidateBeforeCall(AlipayTradeOrderSettleModel alipayTradeOrderSettleModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = settleCall(alipayTradeOrderSettleModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 统一收单交易结算接口
     * 用于在卖家交易成功之后，基于交易订单，进行卖家与第三方（如供应商或平台商）的资金再分配。一般用于第三方从卖家抽佣场景。
     * @param alipayTradeOrderSettleModel  (optional)
     * @return AlipayTradeOrderSettleResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayTradeOrderSettleResponseModel settle(AlipayTradeOrderSettleModel alipayTradeOrderSettleModel) throws ApiException {
        ApiResponse<AlipayTradeOrderSettleResponseModel> localVarResp = settleWithHttpInfo(alipayTradeOrderSettleModel, null);
        return localVarResp.getData();
    }

    public AlipayTradeOrderSettleResponseModel settle(AlipayTradeOrderSettleModel alipayTradeOrderSettleModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayTradeOrderSettleResponseModel> localVarResp = settleWithHttpInfo(alipayTradeOrderSettleModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 统一收单交易结算接口
     * 用于在卖家交易成功之后，基于交易订单，进行卖家与第三方（如供应商或平台商）的资金再分配。一般用于第三方从卖家抽佣场景。
     * @param alipayTradeOrderSettleModel  (optional)
     * @return ApiResponse&lt;AlipayTradeOrderSettleResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayTradeOrderSettleResponseModel> settleWithHttpInfo(AlipayTradeOrderSettleModel alipayTradeOrderSettleModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = settleValidateBeforeCall(alipayTradeOrderSettleModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayTradeOrderSettleResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayTradeOrderSettleDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 统一收单交易结算接口 (asynchronously)
     * 用于在卖家交易成功之后，基于交易订单，进行卖家与第三方（如供应商或平台商）的资金再分配。一般用于第三方从卖家抽佣场景。
     * @param alipayTradeOrderSettleModel  (optional)
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
    public okhttp3.Call settleAsync(AlipayTradeOrderSettleModel alipayTradeOrderSettleModel, final ApiCallback<AlipayTradeOrderSettleResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = settleValidateBeforeCall(alipayTradeOrderSettleModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayTradeOrderSettleResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call settleAsync(AlipayTradeOrderSettleModel alipayTradeOrderSettleModel, final ApiCallback<AlipayTradeOrderSettleResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = settleValidateBeforeCall(alipayTradeOrderSettleModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayTradeOrderSettleResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
