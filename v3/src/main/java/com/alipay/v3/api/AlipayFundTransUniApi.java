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


import com.alipay.v3.model.AlipayFundTransUniTransferDefaultResponse;
import com.alipay.v3.model.AlipayFundTransUniTransferModel;
import com.alipay.v3.model.AlipayFundTransUniTransferResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayFundTransUniApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayFundTransUniApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayFundTransUniApi(ApiClient apiClient) {
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
     * Build call for transfer
     * @param alipayFundTransUniTransferModel  (optional)
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
    public okhttp3.Call transferCall(AlipayFundTransUniTransferModel alipayFundTransUniTransferModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayFundTransUniTransferModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/fund/trans/uni/transfer";

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
    private okhttp3.Call transferValidateBeforeCall(AlipayFundTransUniTransferModel alipayFundTransUniTransferModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = transferCall(alipayFundTransUniTransferModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 单笔转账接口
     * 单笔转账接口是基于支付宝的资金处理能力，为了满足支付宝商家的转账需求，针对有部分开发能力的商家，提供通过API接口完成企业自身支付宝账户到支付宝账户的转账功能。 适用于：C2C现金红包的红包领取、B2C现金红包的红包发放、B2C单笔转账到支付宝账户等。&lt;br /&gt; &lt;b&gt;说明：本接口为公用接口，参数说明不针对特定产品。&lt;/b&gt;不同产品入参请参考对应产品文档。
     * @param alipayFundTransUniTransferModel  (optional)
     * @return AlipayFundTransUniTransferResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundTransUniTransferResponseModel transfer(AlipayFundTransUniTransferModel alipayFundTransUniTransferModel) throws ApiException {
        ApiResponse<AlipayFundTransUniTransferResponseModel> localVarResp = transferWithHttpInfo(alipayFundTransUniTransferModel, null);
        return localVarResp.getData();
    }

    public AlipayFundTransUniTransferResponseModel transfer(AlipayFundTransUniTransferModel alipayFundTransUniTransferModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundTransUniTransferResponseModel> localVarResp = transferWithHttpInfo(alipayFundTransUniTransferModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 单笔转账接口
     * 单笔转账接口是基于支付宝的资金处理能力，为了满足支付宝商家的转账需求，针对有部分开发能力的商家，提供通过API接口完成企业自身支付宝账户到支付宝账户的转账功能。 适用于：C2C现金红包的红包领取、B2C现金红包的红包发放、B2C单笔转账到支付宝账户等。&lt;br /&gt; &lt;b&gt;说明：本接口为公用接口，参数说明不针对特定产品。&lt;/b&gt;不同产品入参请参考对应产品文档。
     * @param alipayFundTransUniTransferModel  (optional)
     * @return ApiResponse&lt;AlipayFundTransUniTransferResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundTransUniTransferResponseModel> transferWithHttpInfo(AlipayFundTransUniTransferModel alipayFundTransUniTransferModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = transferValidateBeforeCall(alipayFundTransUniTransferModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundTransUniTransferResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundTransUniTransferDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 单笔转账接口 (asynchronously)
     * 单笔转账接口是基于支付宝的资金处理能力，为了满足支付宝商家的转账需求，针对有部分开发能力的商家，提供通过API接口完成企业自身支付宝账户到支付宝账户的转账功能。 适用于：C2C现金红包的红包领取、B2C现金红包的红包发放、B2C单笔转账到支付宝账户等。&lt;br /&gt; &lt;b&gt;说明：本接口为公用接口，参数说明不针对特定产品。&lt;/b&gt;不同产品入参请参考对应产品文档。
     * @param alipayFundTransUniTransferModel  (optional)
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
    public okhttp3.Call transferAsync(AlipayFundTransUniTransferModel alipayFundTransUniTransferModel, final ApiCallback<AlipayFundTransUniTransferResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = transferValidateBeforeCall(alipayFundTransUniTransferModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundTransUniTransferResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call transferAsync(AlipayFundTransUniTransferModel alipayFundTransUniTransferModel, final ApiCallback<AlipayFundTransUniTransferResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = transferValidateBeforeCall(alipayFundTransUniTransferModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundTransUniTransferResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
