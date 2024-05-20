/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-05-20
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


import com.alipay.v3.model.AlipayCommerceEcJointaccountbillDetailBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayCommerceEcJointaccountbillDetailApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayCommerceEcJointaccountbillDetailApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayCommerceEcJointaccountbillDetailApi(ApiClient apiClient) {
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
     * Build call for batchquery
     * @param enterpriseId 企业ID (optional)
     * @param bizScene 业务场景。不传默认为ISV_DEFAULT (optional)
     * @param userId 员工支付宝UID (optional)
     * @param openId 员工支付宝UID (optional)
     * @param employeeId 员工id (optional)
     * @param pageNum 页码 (optional)
     * @param pageSize 每页大小 (optional)
     * @param startDate 起始日期 (optional)
     * @param endDate 截止日期 (optional)
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
    public okhttp3.Call batchqueryCall(String enterpriseId, String bizScene, String userId, String openId, String employeeId, String pageNum, String pageSize, String startDate, String endDate, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/commerce/ec/jointaccountbill/detail/batchquery";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (enterpriseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("enterprise_id", enterpriseId));
        }

        if (bizScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_scene", bizScene));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_id", userId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
        }

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employee_id", employeeId));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
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
    private okhttp3.Call batchqueryValidateBeforeCall(String enterpriseId, String bizScene, String userId, String openId, String employeeId, String pageNum, String pageSize, String startDate, String endDate, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(enterpriseId, bizScene, userId, openId, employeeId, pageNum, pageSize, startDate, endDate, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 企业账单批量分页查询
     * 分页查询企业账单
     * @param enterpriseId 企业ID (optional)
     * @param bizScene 业务场景。不传默认为ISV_DEFAULT (optional)
     * @param userId 员工支付宝UID (optional)
     * @param openId 员工支付宝UID (optional)
     * @param employeeId 员工id (optional)
     * @param pageNum 页码 (optional)
     * @param pageSize 每页大小 (optional)
     * @param startDate 起始日期 (optional)
     * @param endDate 截止日期 (optional)
     * @return AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel batchquery(String enterpriseId, String bizScene, String userId, String openId, String employeeId, String pageNum, String pageSize, String startDate, String endDate) throws ApiException {
        ApiResponse<AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(enterpriseId, bizScene, userId, openId, employeeId, pageNum, pageSize, startDate, endDate, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel batchquery(String enterpriseId, String bizScene, String userId, String openId, String employeeId, String pageNum, String pageSize, String startDate, String endDate, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(enterpriseId, bizScene, userId, openId, employeeId, pageNum, pageSize, startDate, endDate, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 企业账单批量分页查询
     * 分页查询企业账单
     * @param enterpriseId 企业ID (optional)
     * @param bizScene 业务场景。不传默认为ISV_DEFAULT (optional)
     * @param userId 员工支付宝UID (optional)
     * @param openId 员工支付宝UID (optional)
     * @param employeeId 员工id (optional)
     * @param pageNum 页码 (optional)
     * @param pageSize 每页大小 (optional)
     * @param startDate 起始日期 (optional)
     * @param endDate 截止日期 (optional)
     * @return ApiResponse&lt;AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel> batchqueryWithHttpInfo(String enterpriseId, String bizScene, String userId, String openId, String employeeId, String pageNum, String pageSize, String startDate, String endDate, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(enterpriseId, bizScene, userId, openId, employeeId, pageNum, pageSize, startDate, endDate, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEcJointaccountbillDetailBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 企业账单批量分页查询 (asynchronously)
     * 分页查询企业账单
     * @param enterpriseId 企业ID (optional)
     * @param bizScene 业务场景。不传默认为ISV_DEFAULT (optional)
     * @param userId 员工支付宝UID (optional)
     * @param openId 员工支付宝UID (optional)
     * @param employeeId 员工id (optional)
     * @param pageNum 页码 (optional)
     * @param pageSize 每页大小 (optional)
     * @param startDate 起始日期 (optional)
     * @param endDate 截止日期 (optional)
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
    public okhttp3.Call batchqueryAsync(String enterpriseId, String bizScene, String userId, String openId, String employeeId, String pageNum, String pageSize, String startDate, String endDate, final ApiCallback<AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(enterpriseId, bizScene, userId, openId, employeeId, pageNum, pageSize, startDate, endDate, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call batchqueryAsync(String enterpriseId, String bizScene, String userId, String openId, String employeeId, String pageNum, String pageSize, String startDate, String endDate, final ApiCallback<AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(enterpriseId, bizScene, userId, openId, employeeId, pageNum, pageSize, startDate, endDate, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
