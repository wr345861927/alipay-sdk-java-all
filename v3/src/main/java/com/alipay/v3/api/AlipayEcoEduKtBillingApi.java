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


import com.alipay.v3.model.AlipayEcoEduKtBillingModifyDefaultResponse;
import com.alipay.v3.model.AlipayEcoEduKtBillingModifyModel;
import com.alipay.v3.model.AlipayEcoEduKtBillingModifyResponseModel;
import com.alipay.v3.model.AlipayEcoEduKtBillingQueryDefaultResponse;
import com.alipay.v3.model.AlipayEcoEduKtBillingQueryResponseModel;
import com.alipay.v3.model.AlipayEcoEduKtBillingSendDefaultResponse;
import com.alipay.v3.model.AlipayEcoEduKtBillingSendModel;
import com.alipay.v3.model.AlipayEcoEduKtBillingSendResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEcoEduKtBillingApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEcoEduKtBillingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEcoEduKtBillingApi(ApiClient apiClient) {
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
     * Build call for modify
     * @param alipayEcoEduKtBillingModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayEcoEduKtBillingModifyModel alipayEcoEduKtBillingModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEcoEduKtBillingModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/eco/edu/kt/billing/modify";

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
    private okhttp3.Call modifyValidateBeforeCall(AlipayEcoEduKtBillingModifyModel alipayEcoEduKtBillingModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayEcoEduKtBillingModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 教育缴费账单状态同步接口
     * isv向支付宝－中小学－教育缴费发送教育缴费账单后，家长在支付宝－中小学－教育缴费中对账单完成支付操作且支付成功，ISV在自有系统内容对账，完成后通过此接口同步对账后的账单状态。状态分为：缴费成功、缴费失败。
     * @param alipayEcoEduKtBillingModifyModel  (optional)
     * @return AlipayEcoEduKtBillingModifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEcoEduKtBillingModifyResponseModel modify(AlipayEcoEduKtBillingModifyModel alipayEcoEduKtBillingModifyModel) throws ApiException {
        ApiResponse<AlipayEcoEduKtBillingModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayEcoEduKtBillingModifyModel, null);
        return localVarResp.getData();
    }

    public AlipayEcoEduKtBillingModifyResponseModel modify(AlipayEcoEduKtBillingModifyModel alipayEcoEduKtBillingModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEcoEduKtBillingModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayEcoEduKtBillingModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 教育缴费账单状态同步接口
     * isv向支付宝－中小学－教育缴费发送教育缴费账单后，家长在支付宝－中小学－教育缴费中对账单完成支付操作且支付成功，ISV在自有系统内容对账，完成后通过此接口同步对账后的账单状态。状态分为：缴费成功、缴费失败。
     * @param alipayEcoEduKtBillingModifyModel  (optional)
     * @return ApiResponse&lt;AlipayEcoEduKtBillingModifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEcoEduKtBillingModifyResponseModel> modifyWithHttpInfo(AlipayEcoEduKtBillingModifyModel alipayEcoEduKtBillingModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEcoEduKtBillingModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEcoEduKtBillingModifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoEduKtBillingModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 教育缴费账单状态同步接口 (asynchronously)
     * isv向支付宝－中小学－教育缴费发送教育缴费账单后，家长在支付宝－中小学－教育缴费中对账单完成支付操作且支付成功，ISV在自有系统内容对账，完成后通过此接口同步对账后的账单状态。状态分为：缴费成功、缴费失败。
     * @param alipayEcoEduKtBillingModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayEcoEduKtBillingModifyModel alipayEcoEduKtBillingModifyModel, final ApiCallback<AlipayEcoEduKtBillingModifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEcoEduKtBillingModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEcoEduKtBillingModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call modifyAsync(AlipayEcoEduKtBillingModifyModel alipayEcoEduKtBillingModifyModel, final ApiCallback<AlipayEcoEduKtBillingModifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEcoEduKtBillingModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEcoEduKtBillingModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param isvPid Isv pid (optional)
     * @param schoolPid 学校支付宝pid，直付通填写smid (optional)
     * @param outTradeNo ISV调用发送账单接口，返回给商户的order_no (optional)
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
    public okhttp3.Call queryCall(String isvPid, String schoolPid, String outTradeNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/eco/edu/kt/billing/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (isvPid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("isv_pid", isvPid));
        }

        if (schoolPid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("school_pid", schoolPid));
        }

        if (outTradeNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_trade_no", outTradeNo));
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
    private okhttp3.Call queryValidateBeforeCall(String isvPid, String schoolPid, String outTradeNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(isvPid, schoolPid, outTradeNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 缴费账单查询
     * 缴费账单查询
     * @param isvPid Isv pid (optional)
     * @param schoolPid 学校支付宝pid，直付通填写smid (optional)
     * @param outTradeNo ISV调用发送账单接口，返回给商户的order_no (optional)
     * @return AlipayEcoEduKtBillingQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEcoEduKtBillingQueryResponseModel query(String isvPid, String schoolPid, String outTradeNo) throws ApiException {
        ApiResponse<AlipayEcoEduKtBillingQueryResponseModel> localVarResp = queryWithHttpInfo(isvPid, schoolPid, outTradeNo, null);
        return localVarResp.getData();
    }

    public AlipayEcoEduKtBillingQueryResponseModel query(String isvPid, String schoolPid, String outTradeNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEcoEduKtBillingQueryResponseModel> localVarResp = queryWithHttpInfo(isvPid, schoolPid, outTradeNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 缴费账单查询
     * 缴费账单查询
     * @param isvPid Isv pid (optional)
     * @param schoolPid 学校支付宝pid，直付通填写smid (optional)
     * @param outTradeNo ISV调用发送账单接口，返回给商户的order_no (optional)
     * @return ApiResponse&lt;AlipayEcoEduKtBillingQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEcoEduKtBillingQueryResponseModel> queryWithHttpInfo(String isvPid, String schoolPid, String outTradeNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(isvPid, schoolPid, outTradeNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEcoEduKtBillingQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoEduKtBillingQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 缴费账单查询 (asynchronously)
     * 缴费账单查询
     * @param isvPid Isv pid (optional)
     * @param schoolPid 学校支付宝pid，直付通填写smid (optional)
     * @param outTradeNo ISV调用发送账单接口，返回给商户的order_no (optional)
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
    public okhttp3.Call queryAsync(String isvPid, String schoolPid, String outTradeNo, final ApiCallback<AlipayEcoEduKtBillingQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(isvPid, schoolPid, outTradeNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEcoEduKtBillingQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String isvPid, String schoolPid, String outTradeNo, final ApiCallback<AlipayEcoEduKtBillingQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(isvPid, schoolPid, outTradeNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEcoEduKtBillingQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for send
     * @param alipayEcoEduKtBillingSendModel  (optional)
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
    public okhttp3.Call sendCall(AlipayEcoEduKtBillingSendModel alipayEcoEduKtBillingSendModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEcoEduKtBillingSendModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/eco/edu/kt/billing/send";

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
    private okhttp3.Call sendValidateBeforeCall(AlipayEcoEduKtBillingSendModel alipayEcoEduKtBillingSendModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = sendCall(alipayEcoEduKtBillingSendModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 教育缴费账单发送接口
     * 商家发送教育缴费账单给孩子，家长在支付宝可以查看自己绑定的孩子的缴费账单。
     * @param alipayEcoEduKtBillingSendModel  (optional)
     * @return AlipayEcoEduKtBillingSendResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEcoEduKtBillingSendResponseModel send(AlipayEcoEduKtBillingSendModel alipayEcoEduKtBillingSendModel) throws ApiException {
        ApiResponse<AlipayEcoEduKtBillingSendResponseModel> localVarResp = sendWithHttpInfo(alipayEcoEduKtBillingSendModel, null);
        return localVarResp.getData();
    }

    public AlipayEcoEduKtBillingSendResponseModel send(AlipayEcoEduKtBillingSendModel alipayEcoEduKtBillingSendModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEcoEduKtBillingSendResponseModel> localVarResp = sendWithHttpInfo(alipayEcoEduKtBillingSendModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 教育缴费账单发送接口
     * 商家发送教育缴费账单给孩子，家长在支付宝可以查看自己绑定的孩子的缴费账单。
     * @param alipayEcoEduKtBillingSendModel  (optional)
     * @return ApiResponse&lt;AlipayEcoEduKtBillingSendResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEcoEduKtBillingSendResponseModel> sendWithHttpInfo(AlipayEcoEduKtBillingSendModel alipayEcoEduKtBillingSendModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = sendValidateBeforeCall(alipayEcoEduKtBillingSendModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEcoEduKtBillingSendResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoEduKtBillingSendDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 教育缴费账单发送接口 (asynchronously)
     * 商家发送教育缴费账单给孩子，家长在支付宝可以查看自己绑定的孩子的缴费账单。
     * @param alipayEcoEduKtBillingSendModel  (optional)
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
    public okhttp3.Call sendAsync(AlipayEcoEduKtBillingSendModel alipayEcoEduKtBillingSendModel, final ApiCallback<AlipayEcoEduKtBillingSendResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendValidateBeforeCall(alipayEcoEduKtBillingSendModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEcoEduKtBillingSendResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call sendAsync(AlipayEcoEduKtBillingSendModel alipayEcoEduKtBillingSendModel, final ApiCallback<AlipayEcoEduKtBillingSendResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = sendValidateBeforeCall(alipayEcoEduKtBillingSendModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEcoEduKtBillingSendResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
