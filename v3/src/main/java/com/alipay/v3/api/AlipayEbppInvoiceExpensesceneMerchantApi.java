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


import com.alipay.v3.model.AlipayEbppInvoiceExpensesceneMerchantQueryDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceExpensesceneMerchantApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceExpensesceneMerchantApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceExpensesceneMerchantApi(ApiClient apiClient) {
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
     * @param accountId 共同账户ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param enterpriseId 企业ID (optional)
     * @param roleId 商户ID (optional)
     * @param pid 商户ID (optional)
     * @param shopId 门店ID (optional)
     * @param expenseType 费用类型 MEAL - 工作餐 (optional)
     * @param pageNum 页码 (optional)
     * @param pageSize 每页行数（最大100） (optional)
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
    public okhttp3.Call queryCall(String accountId, String agreementNo, String enterpriseId, String roleId, String pid, String shopId, String expenseType, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/ebpp/invoice/expensescene/merchant/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
        }

        if (enterpriseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("enterprise_id", enterpriseId));
        }

        if (roleId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("role_id", roleId));
        }

        if (pid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pid", pid));
        }

        if (shopId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("shop_id", shopId));
        }

        if (expenseType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expense_type", expenseType));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call queryValidateBeforeCall(String accountId, String agreementNo, String enterpriseId, String roleId, String pid, String shopId, String expenseType, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(accountId, agreementNo, enterpriseId, roleId, pid, shopId, expenseType, pageNum, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询企业可用商户信息
     * 查询企业可用商户信息
     * @param accountId 共同账户ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param enterpriseId 企业ID (optional)
     * @param roleId 商户ID (optional)
     * @param pid 商户ID (optional)
     * @param shopId 门店ID (optional)
     * @param expenseType 费用类型 MEAL - 工作餐 (optional)
     * @param pageNum 页码 (optional)
     * @param pageSize 每页行数（最大100） (optional)
     * @return AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel query(String accountId, String agreementNo, String enterpriseId, String roleId, String pid, String shopId, String expenseType, Integer pageNum, Integer pageSize) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel> localVarResp = queryWithHttpInfo(accountId, agreementNo, enterpriseId, roleId, pid, shopId, expenseType, pageNum, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel query(String accountId, String agreementNo, String enterpriseId, String roleId, String pid, String shopId, String expenseType, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel> localVarResp = queryWithHttpInfo(accountId, agreementNo, enterpriseId, roleId, pid, shopId, expenseType, pageNum, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询企业可用商户信息
     * 查询企业可用商户信息
     * @param accountId 共同账户ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param enterpriseId 企业ID (optional)
     * @param roleId 商户ID (optional)
     * @param pid 商户ID (optional)
     * @param shopId 门店ID (optional)
     * @param expenseType 费用类型 MEAL - 工作餐 (optional)
     * @param pageNum 页码 (optional)
     * @param pageSize 每页行数（最大100） (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel> queryWithHttpInfo(String accountId, String agreementNo, String enterpriseId, String roleId, String pid, String shopId, String expenseType, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(accountId, agreementNo, enterpriseId, roleId, pid, shopId, expenseType, pageNum, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceExpensesceneMerchantQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询企业可用商户信息 (asynchronously)
     * 查询企业可用商户信息
     * @param accountId 共同账户ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param enterpriseId 企业ID (optional)
     * @param roleId 商户ID (optional)
     * @param pid 商户ID (optional)
     * @param shopId 门店ID (optional)
     * @param expenseType 费用类型 MEAL - 工作餐 (optional)
     * @param pageNum 页码 (optional)
     * @param pageSize 每页行数（最大100） (optional)
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
    public okhttp3.Call queryAsync(String accountId, String agreementNo, String enterpriseId, String roleId, String pid, String shopId, String expenseType, Integer pageNum, Integer pageSize, final ApiCallback<AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(accountId, agreementNo, enterpriseId, roleId, pid, shopId, expenseType, pageNum, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String accountId, String agreementNo, String enterpriseId, String roleId, String pid, String shopId, String expenseType, Integer pageNum, Integer pageSize, final ApiCallback<AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(accountId, agreementNo, enterpriseId, roleId, pid, shopId, expenseType, pageNum, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
