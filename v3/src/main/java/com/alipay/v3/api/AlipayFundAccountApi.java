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


import com.alipay.v3.model.AlipayFundAccountQueryDefaultResponse;
import com.alipay.v3.model.AlipayFundAccountQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayFundAccountApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayFundAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayFundAccountApi(ApiClient apiClient) {
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
     * @param merchantUserId 商户会员的唯一标识。如果传入的user_id为虚拟账户userId，此字段必传并比对一致性。 (optional)
     * @param alipayUserId 支付宝会员 id。 (optional)
     * @param alipayOpenId 支付宝openId (optional)
     * @param accountProductCode 开户产品码。如果查询托管子户余额，必传且必须传入与开户时传入的值一致。 (optional)
     * @param accountType 查询的账号类型，查询余额账户值为ACCTRANS_ACCOUNT。必填。 (optional)
     * @param accountSceneCode 开户场景码，与开户产品码不可同时传递。 (optional)
     * @param extInfo JSON格式，传递业务扩展参数。 (optional)
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
    public okhttp3.Call queryCall(String merchantUserId, String alipayUserId, String alipayOpenId, String accountProductCode, String accountType, String accountSceneCode, String extInfo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/fund/account/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (merchantUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchant_user_id", merchantUserId));
        }

        if (alipayUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("alipay_user_id", alipayUserId));
        }

        if (alipayOpenId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("alipay_open_id", alipayOpenId));
        }

        if (accountProductCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_product_code", accountProductCode));
        }

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type", accountType));
        }

        if (accountSceneCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_scene_code", accountSceneCode));
        }

        if (extInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ext_info", extInfo));
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
    private okhttp3.Call queryValidateBeforeCall(String merchantUserId, String alipayUserId, String alipayOpenId, String accountProductCode, String accountType, String accountSceneCode, String extInfo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(merchantUserId, alipayUserId, alipayOpenId, accountProductCode, accountType, accountSceneCode, extInfo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 支付宝资金账户资产查询接口
     * 可查询请求方的支付宝账户余额信息。
     * @param merchantUserId 商户会员的唯一标识。如果传入的user_id为虚拟账户userId，此字段必传并比对一致性。 (optional)
     * @param alipayUserId 支付宝会员 id。 (optional)
     * @param alipayOpenId 支付宝openId (optional)
     * @param accountProductCode 开户产品码。如果查询托管子户余额，必传且必须传入与开户时传入的值一致。 (optional)
     * @param accountType 查询的账号类型，查询余额账户值为ACCTRANS_ACCOUNT。必填。 (optional)
     * @param accountSceneCode 开户场景码，与开户产品码不可同时传递。 (optional)
     * @param extInfo JSON格式，传递业务扩展参数。 (optional)
     * @return AlipayFundAccountQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundAccountQueryResponseModel query(String merchantUserId, String alipayUserId, String alipayOpenId, String accountProductCode, String accountType, String accountSceneCode, String extInfo) throws ApiException {
        ApiResponse<AlipayFundAccountQueryResponseModel> localVarResp = queryWithHttpInfo(merchantUserId, alipayUserId, alipayOpenId, accountProductCode, accountType, accountSceneCode, extInfo, null);
        return localVarResp.getData();
    }

    public AlipayFundAccountQueryResponseModel query(String merchantUserId, String alipayUserId, String alipayOpenId, String accountProductCode, String accountType, String accountSceneCode, String extInfo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundAccountQueryResponseModel> localVarResp = queryWithHttpInfo(merchantUserId, alipayUserId, alipayOpenId, accountProductCode, accountType, accountSceneCode, extInfo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 支付宝资金账户资产查询接口
     * 可查询请求方的支付宝账户余额信息。
     * @param merchantUserId 商户会员的唯一标识。如果传入的user_id为虚拟账户userId，此字段必传并比对一致性。 (optional)
     * @param alipayUserId 支付宝会员 id。 (optional)
     * @param alipayOpenId 支付宝openId (optional)
     * @param accountProductCode 开户产品码。如果查询托管子户余额，必传且必须传入与开户时传入的值一致。 (optional)
     * @param accountType 查询的账号类型，查询余额账户值为ACCTRANS_ACCOUNT。必填。 (optional)
     * @param accountSceneCode 开户场景码，与开户产品码不可同时传递。 (optional)
     * @param extInfo JSON格式，传递业务扩展参数。 (optional)
     * @return ApiResponse&lt;AlipayFundAccountQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundAccountQueryResponseModel> queryWithHttpInfo(String merchantUserId, String alipayUserId, String alipayOpenId, String accountProductCode, String accountType, String accountSceneCode, String extInfo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(merchantUserId, alipayUserId, alipayOpenId, accountProductCode, accountType, accountSceneCode, extInfo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundAccountQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundAccountQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 支付宝资金账户资产查询接口 (asynchronously)
     * 可查询请求方的支付宝账户余额信息。
     * @param merchantUserId 商户会员的唯一标识。如果传入的user_id为虚拟账户userId，此字段必传并比对一致性。 (optional)
     * @param alipayUserId 支付宝会员 id。 (optional)
     * @param alipayOpenId 支付宝openId (optional)
     * @param accountProductCode 开户产品码。如果查询托管子户余额，必传且必须传入与开户时传入的值一致。 (optional)
     * @param accountType 查询的账号类型，查询余额账户值为ACCTRANS_ACCOUNT。必填。 (optional)
     * @param accountSceneCode 开户场景码，与开户产品码不可同时传递。 (optional)
     * @param extInfo JSON格式，传递业务扩展参数。 (optional)
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
    public okhttp3.Call queryAsync(String merchantUserId, String alipayUserId, String alipayOpenId, String accountProductCode, String accountType, String accountSceneCode, String extInfo, final ApiCallback<AlipayFundAccountQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(merchantUserId, alipayUserId, alipayOpenId, accountProductCode, accountType, accountSceneCode, extInfo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundAccountQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String merchantUserId, String alipayUserId, String alipayOpenId, String accountProductCode, String accountType, String accountSceneCode, String extInfo, final ApiCallback<AlipayFundAccountQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(merchantUserId, alipayUserId, alipayOpenId, accountProductCode, accountType, accountSceneCode, extInfo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundAccountQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
