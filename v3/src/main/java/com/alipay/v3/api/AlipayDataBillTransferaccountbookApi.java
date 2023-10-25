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


import com.alipay.v3.model.AlipayDataBillTransferaccountbookQueryDefaultResponse;
import com.alipay.v3.model.AlipayDataBillTransferaccountbookQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayDataBillTransferaccountbookApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayDataBillTransferaccountbookApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayDataBillTransferaccountbookApi(ApiClient apiClient) {
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
     * @param startTime 充值、转账、提现流水业务时间的起始范围 (optional)
     * @param endTime 充值、转账、提现流水业务时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间 (optional)
     * @param type 转账类型：充值-DEPOSIT，提现-WITHDRAW，转账-TRANSFER。 (optional)
     * @param agreementNo 协议号 (optional)
     * @param storeNo 子账本号，或者子账本名称。模糊查询 (optional)
     * @param pageNo 分页号，从1开始 (optional)
     * @param pageSize 分页大小1000-2000，默认2000 (optional)
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
    public okhttp3.Call queryCall(String startTime, String endTime, String type, String agreementNo, String storeNo, String pageNo, String pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/data/bill/transferaccountbook/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
        }

        if (storeNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("store_no", storeNo));
        }

        if (pageNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_no", pageNo));
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
    private okhttp3.Call queryValidateBeforeCall(String startTime, String endTime, String type, String agreementNo, String storeNo, String pageNo, String pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(startTime, endTime, type, agreementNo, storeNo, pageNo, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 子账本充提转账单查询(incubating)
     * 子账本充提转账单查询（子账本业务定制接口）
     * @param startTime 充值、转账、提现流水业务时间的起始范围 (optional)
     * @param endTime 充值、转账、提现流水业务时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间 (optional)
     * @param type 转账类型：充值-DEPOSIT，提现-WITHDRAW，转账-TRANSFER。 (optional)
     * @param agreementNo 协议号 (optional)
     * @param storeNo 子账本号，或者子账本名称。模糊查询 (optional)
     * @param pageNo 分页号，从1开始 (optional)
     * @param pageSize 分页大小1000-2000，默认2000 (optional)
     * @return AlipayDataBillTransferaccountbookQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayDataBillTransferaccountbookQueryResponseModel query(String startTime, String endTime, String type, String agreementNo, String storeNo, String pageNo, String pageSize) throws ApiException {
        ApiResponse<AlipayDataBillTransferaccountbookQueryResponseModel> localVarResp = queryWithHttpInfo(startTime, endTime, type, agreementNo, storeNo, pageNo, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayDataBillTransferaccountbookQueryResponseModel query(String startTime, String endTime, String type, String agreementNo, String storeNo, String pageNo, String pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayDataBillTransferaccountbookQueryResponseModel> localVarResp = queryWithHttpInfo(startTime, endTime, type, agreementNo, storeNo, pageNo, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 子账本充提转账单查询(incubating)
     * 子账本充提转账单查询（子账本业务定制接口）
     * @param startTime 充值、转账、提现流水业务时间的起始范围 (optional)
     * @param endTime 充值、转账、提现流水业务时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间 (optional)
     * @param type 转账类型：充值-DEPOSIT，提现-WITHDRAW，转账-TRANSFER。 (optional)
     * @param agreementNo 协议号 (optional)
     * @param storeNo 子账本号，或者子账本名称。模糊查询 (optional)
     * @param pageNo 分页号，从1开始 (optional)
     * @param pageSize 分页大小1000-2000，默认2000 (optional)
     * @return ApiResponse&lt;AlipayDataBillTransferaccountbookQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayDataBillTransferaccountbookQueryResponseModel> queryWithHttpInfo(String startTime, String endTime, String type, String agreementNo, String storeNo, String pageNo, String pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(startTime, endTime, type, agreementNo, storeNo, pageNo, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayDataBillTransferaccountbookQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayDataBillTransferaccountbookQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 子账本充提转账单查询(incubating) (asynchronously)
     * 子账本充提转账单查询（子账本业务定制接口）
     * @param startTime 充值、转账、提现流水业务时间的起始范围 (optional)
     * @param endTime 充值、转账、提现流水业务时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间 (optional)
     * @param type 转账类型：充值-DEPOSIT，提现-WITHDRAW，转账-TRANSFER。 (optional)
     * @param agreementNo 协议号 (optional)
     * @param storeNo 子账本号，或者子账本名称。模糊查询 (optional)
     * @param pageNo 分页号，从1开始 (optional)
     * @param pageSize 分页大小1000-2000，默认2000 (optional)
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
    public okhttp3.Call queryAsync(String startTime, String endTime, String type, String agreementNo, String storeNo, String pageNo, String pageSize, final ApiCallback<AlipayDataBillTransferaccountbookQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(startTime, endTime, type, agreementNo, storeNo, pageNo, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayDataBillTransferaccountbookQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String startTime, String endTime, String type, String agreementNo, String storeNo, String pageNo, String pageSize, final ApiCallback<AlipayDataBillTransferaccountbookQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(startTime, endTime, type, agreementNo, storeNo, pageNo, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayDataBillTransferaccountbookQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
