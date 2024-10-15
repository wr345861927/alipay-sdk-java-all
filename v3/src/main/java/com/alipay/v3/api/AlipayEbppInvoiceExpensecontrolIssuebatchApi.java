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


import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolIssuebatchCancelDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolIssuebatchCreateDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceExpensecontrolIssuebatchApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceExpensecontrolIssuebatchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceExpensecontrolIssuebatchApi(ApiClient apiClient) {
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
     * Build call for cancel
     * @param alipayEbppInvoiceExpensecontrolIssuebatchCancelModel  (optional)
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
    public okhttp3.Call cancelCall(AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceExpensecontrolIssuebatchCancelModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/expensecontrol/issuebatch/cancel";

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
    private okhttp3.Call cancelValidateBeforeCall(AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = cancelCall(alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 作废额度发放
     * 通过发放批次id，作废当前批次下发放的额度
     * @param alipayEbppInvoiceExpensecontrolIssuebatchCancelModel  (optional)
     * @return AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel cancel(AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel alipayEbppInvoiceExpensecontrolIssuebatchCancelModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel> localVarResp = cancelWithHttpInfo(alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel cancel(AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel> localVarResp = cancelWithHttpInfo(alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 作废额度发放
     * 通过发放批次id，作废当前批次下发放的额度
     * @param alipayEbppInvoiceExpensecontrolIssuebatchCancelModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel> cancelWithHttpInfo(AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = cancelValidateBeforeCall(alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceExpensecontrolIssuebatchCancelDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 作废额度发放 (asynchronously)
     * 通过发放批次id，作废当前批次下发放的额度
     * @param alipayEbppInvoiceExpensecontrolIssuebatchCancelModel  (optional)
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
    public okhttp3.Call cancelAsync(AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, final ApiCallback<AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelValidateBeforeCall(alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call cancelAsync(AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, final ApiCallback<AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = cancelValidateBeforeCall(alipayEbppInvoiceExpensecontrolIssuebatchCancelModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for create
     * @param alipayEbppInvoiceExpensecontrolIssuebatchCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceExpensecontrolIssuebatchCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/expensecontrol/issuebatch/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 手动发放额度接口
     * 通过该接口对企业下的员工进行批量的额度发放。
     * @param alipayEbppInvoiceExpensecontrolIssuebatchCreateModel  (optional)
     * @return AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel create(AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel alipayEbppInvoiceExpensecontrolIssuebatchCreateModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel create(AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 手动发放额度接口
     * 通过该接口对企业下的员工进行批量的额度发放。
     * @param alipayEbppInvoiceExpensecontrolIssuebatchCreateModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel> createWithHttpInfo(AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceExpensecontrolIssuebatchCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 手动发放额度接口 (asynchronously)
     * 通过该接口对企业下的员工进行批量的额度发放。
     * @param alipayEbppInvoiceExpensecontrolIssuebatchCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, final ApiCallback<AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call createAsync(AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, final ApiCallback<AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpensecontrolIssuebatchCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
