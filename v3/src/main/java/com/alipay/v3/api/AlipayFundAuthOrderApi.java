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


import com.alipay.v3.model.AlipayFundAuthOrderFreezeDefaultResponse;
import com.alipay.v3.model.AlipayFundAuthOrderFreezeModel;
import com.alipay.v3.model.AlipayFundAuthOrderFreezeResponseModel;
import com.alipay.v3.model.AlipayFundAuthOrderUnfreezeDefaultResponse;
import com.alipay.v3.model.AlipayFundAuthOrderUnfreezeModel;
import com.alipay.v3.model.AlipayFundAuthOrderUnfreezeResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayFundAuthOrderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayFundAuthOrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayFundAuthOrderApi(ApiClient apiClient) {
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
     * Build call for freeze
     * @param alipayFundAuthOrderFreezeModel  (optional)
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
    public okhttp3.Call freezeCall(AlipayFundAuthOrderFreezeModel alipayFundAuthOrderFreezeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayFundAuthOrderFreezeModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/fund/auth/order/freeze";

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
    private okhttp3.Call freezeValidateBeforeCall(AlipayFundAuthOrderFreezeModel alipayFundAuthOrderFreezeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = freezeCall(alipayFundAuthOrderFreezeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 资金授权冻结接口
     * 收银员使用扫码设备读取用户支付宝钱包“付款码”后，将条码信息和订单信息通过本接口上送至支付宝发起资金冻结。
     * @param alipayFundAuthOrderFreezeModel  (optional)
     * @return AlipayFundAuthOrderFreezeResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundAuthOrderFreezeResponseModel freeze(AlipayFundAuthOrderFreezeModel alipayFundAuthOrderFreezeModel) throws ApiException {
        ApiResponse<AlipayFundAuthOrderFreezeResponseModel> localVarResp = freezeWithHttpInfo(alipayFundAuthOrderFreezeModel, null);
        return localVarResp.getData();
    }

    public AlipayFundAuthOrderFreezeResponseModel freeze(AlipayFundAuthOrderFreezeModel alipayFundAuthOrderFreezeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundAuthOrderFreezeResponseModel> localVarResp = freezeWithHttpInfo(alipayFundAuthOrderFreezeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 资金授权冻结接口
     * 收银员使用扫码设备读取用户支付宝钱包“付款码”后，将条码信息和订单信息通过本接口上送至支付宝发起资金冻结。
     * @param alipayFundAuthOrderFreezeModel  (optional)
     * @return ApiResponse&lt;AlipayFundAuthOrderFreezeResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundAuthOrderFreezeResponseModel> freezeWithHttpInfo(AlipayFundAuthOrderFreezeModel alipayFundAuthOrderFreezeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = freezeValidateBeforeCall(alipayFundAuthOrderFreezeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundAuthOrderFreezeResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundAuthOrderFreezeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 资金授权冻结接口 (asynchronously)
     * 收银员使用扫码设备读取用户支付宝钱包“付款码”后，将条码信息和订单信息通过本接口上送至支付宝发起资金冻结。
     * @param alipayFundAuthOrderFreezeModel  (optional)
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
    public okhttp3.Call freezeAsync(AlipayFundAuthOrderFreezeModel alipayFundAuthOrderFreezeModel, final ApiCallback<AlipayFundAuthOrderFreezeResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = freezeValidateBeforeCall(alipayFundAuthOrderFreezeModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundAuthOrderFreezeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call freezeAsync(AlipayFundAuthOrderFreezeModel alipayFundAuthOrderFreezeModel, final ApiCallback<AlipayFundAuthOrderFreezeResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = freezeValidateBeforeCall(alipayFundAuthOrderFreezeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundAuthOrderFreezeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unfreeze
     * @param alipayFundAuthOrderUnfreezeModel  (optional)
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
    public okhttp3.Call unfreezeCall(AlipayFundAuthOrderUnfreezeModel alipayFundAuthOrderUnfreezeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayFundAuthOrderUnfreezeModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/fund/auth/order/unfreeze";

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
    private okhttp3.Call unfreezeValidateBeforeCall(AlipayFundAuthOrderUnfreezeModel alipayFundAuthOrderUnfreezeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = unfreezeCall(alipayFundAuthOrderUnfreezeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 资金授权解冻接口
     * 当资金授权发生之后一段时间内，由于买家或者商家等其他原因需要要解冻资金，商家可通过资金授权解冻接口将授权资金进行解冻，支付宝将在收到解冻请求并验证成功后，按解冻规则将冻结资金按原路进行解冻
     * @param alipayFundAuthOrderUnfreezeModel  (optional)
     * @return AlipayFundAuthOrderUnfreezeResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundAuthOrderUnfreezeResponseModel unfreeze(AlipayFundAuthOrderUnfreezeModel alipayFundAuthOrderUnfreezeModel) throws ApiException {
        ApiResponse<AlipayFundAuthOrderUnfreezeResponseModel> localVarResp = unfreezeWithHttpInfo(alipayFundAuthOrderUnfreezeModel, null);
        return localVarResp.getData();
    }

    public AlipayFundAuthOrderUnfreezeResponseModel unfreeze(AlipayFundAuthOrderUnfreezeModel alipayFundAuthOrderUnfreezeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundAuthOrderUnfreezeResponseModel> localVarResp = unfreezeWithHttpInfo(alipayFundAuthOrderUnfreezeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 资金授权解冻接口
     * 当资金授权发生之后一段时间内，由于买家或者商家等其他原因需要要解冻资金，商家可通过资金授权解冻接口将授权资金进行解冻，支付宝将在收到解冻请求并验证成功后，按解冻规则将冻结资金按原路进行解冻
     * @param alipayFundAuthOrderUnfreezeModel  (optional)
     * @return ApiResponse&lt;AlipayFundAuthOrderUnfreezeResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundAuthOrderUnfreezeResponseModel> unfreezeWithHttpInfo(AlipayFundAuthOrderUnfreezeModel alipayFundAuthOrderUnfreezeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = unfreezeValidateBeforeCall(alipayFundAuthOrderUnfreezeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundAuthOrderUnfreezeResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundAuthOrderUnfreezeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 资金授权解冻接口 (asynchronously)
     * 当资金授权发生之后一段时间内，由于买家或者商家等其他原因需要要解冻资金，商家可通过资金授权解冻接口将授权资金进行解冻，支付宝将在收到解冻请求并验证成功后，按解冻规则将冻结资金按原路进行解冻
     * @param alipayFundAuthOrderUnfreezeModel  (optional)
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
    public okhttp3.Call unfreezeAsync(AlipayFundAuthOrderUnfreezeModel alipayFundAuthOrderUnfreezeModel, final ApiCallback<AlipayFundAuthOrderUnfreezeResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = unfreezeValidateBeforeCall(alipayFundAuthOrderUnfreezeModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundAuthOrderUnfreezeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call unfreezeAsync(AlipayFundAuthOrderUnfreezeModel alipayFundAuthOrderUnfreezeModel, final ApiCallback<AlipayFundAuthOrderUnfreezeResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = unfreezeValidateBeforeCall(alipayFundAuthOrderUnfreezeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundAuthOrderUnfreezeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
