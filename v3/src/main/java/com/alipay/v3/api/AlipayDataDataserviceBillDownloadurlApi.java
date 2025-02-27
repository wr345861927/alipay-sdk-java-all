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


import com.alipay.v3.model.AlipayDataDataserviceBillDownloadurlQueryDefaultResponse;
import com.alipay.v3.model.AlipayDataDataserviceBillDownloadurlQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayDataDataserviceBillDownloadurlApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayDataDataserviceBillDownloadurlApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayDataDataserviceBillDownloadurlApi(ApiClient apiClient) {
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
     * @param billType 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型，支持： trade：商户基于支付宝交易收单的业务账单； signcustomer：基于商户支付宝余额收入及支出等资金变动的账务账单； merchant_act：营销活动账单，包含营销活动的发放，核销记录 trade_zft_merchant：直付通二级商户查询交易的业务账单； zft_acc：直付通平台商查询二级商户流水使用，返回所有二级商户流水。 (optional)
     * @param billDate 账单时间：  * 日账单格式为yyyy-MM-dd，最早可下载2016年1月1日开始的日账单。不支持下载当日账单，只能下载前一日24点前的账单数据（T+1），当日数据一般于次日 9 点前生成，特殊情况可能延迟。  * 月账单格式为yyyy-MM，最早可下载2016年1月开始的月账单。不支持下载当月账单，只能下载上一月账单数据，当月账单一般在次月 3 日生成，特殊情况可能延迟。 (optional)
     * @param smid 二级商户smid，这个参数只在bill_type是trade_zft_merchant时才能使用 (optional)
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
    public okhttp3.Call queryCall(String billType, String billDate, String smid, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/data/dataservice/bill/downloadurl/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (billType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("bill_type", billType));
        }

        if (billDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("bill_date", billDate));
        }

        if (smid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("smid", smid));
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
    private okhttp3.Call queryValidateBeforeCall(String billType, String billDate, String smid, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(billType, billDate, smid, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询对账单下载地址
     * 为方便商户快速查账，支持商户通过本接口获取商户离线账单下载地址
     * @param billType 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型，支持： trade：商户基于支付宝交易收单的业务账单； signcustomer：基于商户支付宝余额收入及支出等资金变动的账务账单； merchant_act：营销活动账单，包含营销活动的发放，核销记录 trade_zft_merchant：直付通二级商户查询交易的业务账单； zft_acc：直付通平台商查询二级商户流水使用，返回所有二级商户流水。 (optional)
     * @param billDate 账单时间：  * 日账单格式为yyyy-MM-dd，最早可下载2016年1月1日开始的日账单。不支持下载当日账单，只能下载前一日24点前的账单数据（T+1），当日数据一般于次日 9 点前生成，特殊情况可能延迟。  * 月账单格式为yyyy-MM，最早可下载2016年1月开始的月账单。不支持下载当月账单，只能下载上一月账单数据，当月账单一般在次月 3 日生成，特殊情况可能延迟。 (optional)
     * @param smid 二级商户smid，这个参数只在bill_type是trade_zft_merchant时才能使用 (optional)
     * @return AlipayDataDataserviceBillDownloadurlQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayDataDataserviceBillDownloadurlQueryResponseModel query(String billType, String billDate, String smid) throws ApiException {
        ApiResponse<AlipayDataDataserviceBillDownloadurlQueryResponseModel> localVarResp = queryWithHttpInfo(billType, billDate, smid, null);
        return localVarResp.getData();
    }

    public AlipayDataDataserviceBillDownloadurlQueryResponseModel query(String billType, String billDate, String smid, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayDataDataserviceBillDownloadurlQueryResponseModel> localVarResp = queryWithHttpInfo(billType, billDate, smid, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询对账单下载地址
     * 为方便商户快速查账，支持商户通过本接口获取商户离线账单下载地址
     * @param billType 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型，支持： trade：商户基于支付宝交易收单的业务账单； signcustomer：基于商户支付宝余额收入及支出等资金变动的账务账单； merchant_act：营销活动账单，包含营销活动的发放，核销记录 trade_zft_merchant：直付通二级商户查询交易的业务账单； zft_acc：直付通平台商查询二级商户流水使用，返回所有二级商户流水。 (optional)
     * @param billDate 账单时间：  * 日账单格式为yyyy-MM-dd，最早可下载2016年1月1日开始的日账单。不支持下载当日账单，只能下载前一日24点前的账单数据（T+1），当日数据一般于次日 9 点前生成，特殊情况可能延迟。  * 月账单格式为yyyy-MM，最早可下载2016年1月开始的月账单。不支持下载当月账单，只能下载上一月账单数据，当月账单一般在次月 3 日生成，特殊情况可能延迟。 (optional)
     * @param smid 二级商户smid，这个参数只在bill_type是trade_zft_merchant时才能使用 (optional)
     * @return ApiResponse&lt;AlipayDataDataserviceBillDownloadurlQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayDataDataserviceBillDownloadurlQueryResponseModel> queryWithHttpInfo(String billType, String billDate, String smid, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(billType, billDate, smid, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayDataDataserviceBillDownloadurlQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayDataDataserviceBillDownloadurlQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询对账单下载地址 (asynchronously)
     * 为方便商户快速查账，支持商户通过本接口获取商户离线账单下载地址
     * @param billType 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型，支持： trade：商户基于支付宝交易收单的业务账单； signcustomer：基于商户支付宝余额收入及支出等资金变动的账务账单； merchant_act：营销活动账单，包含营销活动的发放，核销记录 trade_zft_merchant：直付通二级商户查询交易的业务账单； zft_acc：直付通平台商查询二级商户流水使用，返回所有二级商户流水。 (optional)
     * @param billDate 账单时间：  * 日账单格式为yyyy-MM-dd，最早可下载2016年1月1日开始的日账单。不支持下载当日账单，只能下载前一日24点前的账单数据（T+1），当日数据一般于次日 9 点前生成，特殊情况可能延迟。  * 月账单格式为yyyy-MM，最早可下载2016年1月开始的月账单。不支持下载当月账单，只能下载上一月账单数据，当月账单一般在次月 3 日生成，特殊情况可能延迟。 (optional)
     * @param smid 二级商户smid，这个参数只在bill_type是trade_zft_merchant时才能使用 (optional)
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
    public okhttp3.Call queryAsync(String billType, String billDate, String smid, final ApiCallback<AlipayDataDataserviceBillDownloadurlQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(billType, billDate, smid, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayDataDataserviceBillDownloadurlQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String billType, String billDate, String smid, final ApiCallback<AlipayDataDataserviceBillDownloadurlQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(billType, billDate, smid, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayDataDataserviceBillDownloadurlQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
