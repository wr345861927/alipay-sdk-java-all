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


import com.alipay.v3.model.AlipayFundJointaccountDetailQueryDefaultResponse;
import com.alipay.v3.model.AlipayFundJointaccountDetailQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayFundJointaccountDetailApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayFundJointaccountDetailApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayFundJointaccountDetailApi(ApiClient apiClient) {
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
     * @param productCode 销售产品码 (optional)
     * @param bizScene 业务场景码 (optional)
     * @param accountId 合花群ID（查询方式二：通过传入account_id+agreement_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。&lt;br&gt; -该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。 (optional)
     * @param agreementNo 授权协议号（查询方式二：通过传入account_id+agreement_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。&lt;br&gt; -该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。 (optional)
     * @param outBizNo 商户侧单号（查询方式一：通过传入 out_biz_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段与签约接口alipay.fund.jointaccount.sign请求参数中传入值保持一致 (optional)
     * @param channel 业务渠道&lt;/br&gt; 补充说明：&lt;/br&gt; 需要商户侧必传，支付宝侧不做强校验 (optional)
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
    public okhttp3.Call queryCall(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, String channel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/fund/jointaccount/detail/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (productCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("product_code", productCode));
        }

        if (bizScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_scene", bizScene));
        }

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
        }

        if (outBizNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_biz_no", outBizNo));
        }

        if (channel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("channel", channel));
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
    private okhttp3.Call queryValidateBeforeCall(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, String channel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(productCode, bizScene, accountId, agreementNo, outBizNo, channel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 共享资金-查询账户详情
     * 发起人在商户上点击查看账户详情，商户服务端进行受理，并调用支付宝进行处理。处理结果，同步返回给商户。
     * @param productCode 销售产品码 (optional)
     * @param bizScene 业务场景码 (optional)
     * @param accountId 合花群ID（查询方式二：通过传入account_id+agreement_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。&lt;br&gt; -该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。 (optional)
     * @param agreementNo 授权协议号（查询方式二：通过传入account_id+agreement_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。&lt;br&gt; -该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。 (optional)
     * @param outBizNo 商户侧单号（查询方式一：通过传入 out_biz_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段与签约接口alipay.fund.jointaccount.sign请求参数中传入值保持一致 (optional)
     * @param channel 业务渠道&lt;/br&gt; 补充说明：&lt;/br&gt; 需要商户侧必传，支付宝侧不做强校验 (optional)
     * @return AlipayFundJointaccountDetailQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundJointaccountDetailQueryResponseModel query(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, String channel) throws ApiException {
        ApiResponse<AlipayFundJointaccountDetailQueryResponseModel> localVarResp = queryWithHttpInfo(productCode, bizScene, accountId, agreementNo, outBizNo, channel, null);
        return localVarResp.getData();
    }

    public AlipayFundJointaccountDetailQueryResponseModel query(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, String channel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundJointaccountDetailQueryResponseModel> localVarResp = queryWithHttpInfo(productCode, bizScene, accountId, agreementNo, outBizNo, channel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 共享资金-查询账户详情
     * 发起人在商户上点击查看账户详情，商户服务端进行受理，并调用支付宝进行处理。处理结果，同步返回给商户。
     * @param productCode 销售产品码 (optional)
     * @param bizScene 业务场景码 (optional)
     * @param accountId 合花群ID（查询方式二：通过传入account_id+agreement_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。&lt;br&gt; -该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。 (optional)
     * @param agreementNo 授权协议号（查询方式二：通过传入account_id+agreement_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。&lt;br&gt; -该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。 (optional)
     * @param outBizNo 商户侧单号（查询方式一：通过传入 out_biz_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段与签约接口alipay.fund.jointaccount.sign请求参数中传入值保持一致 (optional)
     * @param channel 业务渠道&lt;/br&gt; 补充说明：&lt;/br&gt; 需要商户侧必传，支付宝侧不做强校验 (optional)
     * @return ApiResponse&lt;AlipayFundJointaccountDetailQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundJointaccountDetailQueryResponseModel> queryWithHttpInfo(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, String channel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, accountId, agreementNo, outBizNo, channel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundJointaccountDetailQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundJointaccountDetailQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 共享资金-查询账户详情 (asynchronously)
     * 发起人在商户上点击查看账户详情，商户服务端进行受理，并调用支付宝进行处理。处理结果，同步返回给商户。
     * @param productCode 销售产品码 (optional)
     * @param bizScene 业务场景码 (optional)
     * @param accountId 合花群ID（查询方式二：通过传入account_id+agreement_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。&lt;br&gt; -该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。 (optional)
     * @param agreementNo 授权协议号（查询方式二：通过传入account_id+agreement_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。&lt;br&gt; -该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。 (optional)
     * @param outBizNo 商户侧单号（查询方式一：通过传入 out_biz_no查询）&lt;br&gt; 补充说明：&lt;br&gt; -该字段与签约接口alipay.fund.jointaccount.sign请求参数中传入值保持一致 (optional)
     * @param channel 业务渠道&lt;/br&gt; 补充说明：&lt;/br&gt; 需要商户侧必传，支付宝侧不做强校验 (optional)
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
    public okhttp3.Call queryAsync(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, String channel, final ApiCallback<AlipayFundJointaccountDetailQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, accountId, agreementNo, outBizNo, channel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundJointaccountDetailQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, String channel, final ApiCallback<AlipayFundJointaccountDetailQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, accountId, agreementNo, outBizNo, channel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundJointaccountDetailQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
