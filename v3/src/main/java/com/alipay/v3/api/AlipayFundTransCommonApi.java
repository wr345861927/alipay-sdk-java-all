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


import com.alipay.v3.model.AlipayFundTransCommonQueryDefaultResponse;
import com.alipay.v3.model.AlipayFundTransCommonQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayFundTransCommonApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayFundTransCommonApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayFundTransCommonApi(ApiClient apiClient) {
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
     * @param productCode 销售产品码，商家和支付宝签约的产品码，如果传递了out_biz_no则该字段为必传。可传值如下： STD_RED_PACKET：现金红包 TRANS_ACCOUNT_NO_PWD：单笔无密转账到支付宝账户 TRANS_BANKCARD_NO_PWD：单笔无密转账到银行卡 (optional)
     * @param bizScene 描述特定的业务场景，如果传递了out_biz_no则该字段为必传。可取的业务场景如下：  PERSONAL_PAY：C2C现金红包-发红包；  PERSONAL_COLLECTION：C2C现金红包-领红包；  REFUND：C2C现金红包-红包退回；  DIRECT_TRANSFER：B2C现金红包、单笔无密转账 (optional)
     * @param outBizNo 商户转账唯一订单号，发起转账来源方定义的转账单据ID。  本参数和order_id（支付宝转账单据号）、pay_fund_order_id（支付宝支付资金流水号）三者不能同时为空。 当三者同时传入时，将用pay_fund_order_id（支付宝支付资金流水号）进行查询，忽略其余两者； 当本参数和支付宝转账单据号同时提供时，将用支付宝转账单据号进行查询，忽略本参数。 (optional)
     * @param orderId 支付宝转账单据号。 本参数和out_biz_no（商户转账唯一订单号）、pay_fund_order_id（支付宝支付资金流水号）三者不能同时为空。  当三者同时传入时，将用pay_fund_order_id（支付宝支付资金流水号）进行查询，忽略其余两者； 当本参数和pay_fund_order_id（支付宝支付资金流水号）同时提供时，将用支付宝支付资金流水号进行查询，忽略本参数；  当本参数和out_biz_no（商户转账唯一订单号）同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。 (optional)
     * @param payFundOrderId 支付宝支付资金流水号。本参数和支付宝转账单据号、商户转账唯一订单号三者不能同时为空。  当本参数和out_biz_no（商户转账唯一订单号）、order_id（支付宝转账单据号）同时提供时，将用本参数进行查询，忽略其余两者； 当本参数和order_id（支付宝转账单据号）同时提供时，将用本参数进行查询，忽略支付宝转账单据号；  当本参数和out_biz_no（商户转账唯一订单号）同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。 (optional)
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
    public okhttp3.Call queryCall(String productCode, String bizScene, String outBizNo, String orderId, String payFundOrderId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/fund/trans/common/query";

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

        if (outBizNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_biz_no", outBizNo));
        }

        if (orderId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_id", orderId));
        }

        if (payFundOrderId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pay_fund_order_id", payFundOrderId));
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
    private okhttp3.Call queryValidateBeforeCall(String productCode, String bizScene, String outBizNo, String orderId, String payFundOrderId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(productCode, bizScene, outBizNo, orderId, payFundOrderId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 转账业务单据查询接口
     * 商户可通过该接口查询转账业务单据的状态，主要应用于统一转账接口(alipay.fund.trans.uni.transfer)、无线转账接口(alipay.fund.trans.app.pay)、单笔转账到支付宝账户接口（alipay.fund.trans.toaccount.transfer）
     * @param productCode 销售产品码，商家和支付宝签约的产品码，如果传递了out_biz_no则该字段为必传。可传值如下： STD_RED_PACKET：现金红包 TRANS_ACCOUNT_NO_PWD：单笔无密转账到支付宝账户 TRANS_BANKCARD_NO_PWD：单笔无密转账到银行卡 (optional)
     * @param bizScene 描述特定的业务场景，如果传递了out_biz_no则该字段为必传。可取的业务场景如下：  PERSONAL_PAY：C2C现金红包-发红包；  PERSONAL_COLLECTION：C2C现金红包-领红包；  REFUND：C2C现金红包-红包退回；  DIRECT_TRANSFER：B2C现金红包、单笔无密转账 (optional)
     * @param outBizNo 商户转账唯一订单号，发起转账来源方定义的转账单据ID。  本参数和order_id（支付宝转账单据号）、pay_fund_order_id（支付宝支付资金流水号）三者不能同时为空。 当三者同时传入时，将用pay_fund_order_id（支付宝支付资金流水号）进行查询，忽略其余两者； 当本参数和支付宝转账单据号同时提供时，将用支付宝转账单据号进行查询，忽略本参数。 (optional)
     * @param orderId 支付宝转账单据号。 本参数和out_biz_no（商户转账唯一订单号）、pay_fund_order_id（支付宝支付资金流水号）三者不能同时为空。  当三者同时传入时，将用pay_fund_order_id（支付宝支付资金流水号）进行查询，忽略其余两者； 当本参数和pay_fund_order_id（支付宝支付资金流水号）同时提供时，将用支付宝支付资金流水号进行查询，忽略本参数；  当本参数和out_biz_no（商户转账唯一订单号）同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。 (optional)
     * @param payFundOrderId 支付宝支付资金流水号。本参数和支付宝转账单据号、商户转账唯一订单号三者不能同时为空。  当本参数和out_biz_no（商户转账唯一订单号）、order_id（支付宝转账单据号）同时提供时，将用本参数进行查询，忽略其余两者； 当本参数和order_id（支付宝转账单据号）同时提供时，将用本参数进行查询，忽略支付宝转账单据号；  当本参数和out_biz_no（商户转账唯一订单号）同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。 (optional)
     * @return AlipayFundTransCommonQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundTransCommonQueryResponseModel query(String productCode, String bizScene, String outBizNo, String orderId, String payFundOrderId) throws ApiException {
        ApiResponse<AlipayFundTransCommonQueryResponseModel> localVarResp = queryWithHttpInfo(productCode, bizScene, outBizNo, orderId, payFundOrderId, null);
        return localVarResp.getData();
    }

    public AlipayFundTransCommonQueryResponseModel query(String productCode, String bizScene, String outBizNo, String orderId, String payFundOrderId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundTransCommonQueryResponseModel> localVarResp = queryWithHttpInfo(productCode, bizScene, outBizNo, orderId, payFundOrderId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 转账业务单据查询接口
     * 商户可通过该接口查询转账业务单据的状态，主要应用于统一转账接口(alipay.fund.trans.uni.transfer)、无线转账接口(alipay.fund.trans.app.pay)、单笔转账到支付宝账户接口（alipay.fund.trans.toaccount.transfer）
     * @param productCode 销售产品码，商家和支付宝签约的产品码，如果传递了out_biz_no则该字段为必传。可传值如下： STD_RED_PACKET：现金红包 TRANS_ACCOUNT_NO_PWD：单笔无密转账到支付宝账户 TRANS_BANKCARD_NO_PWD：单笔无密转账到银行卡 (optional)
     * @param bizScene 描述特定的业务场景，如果传递了out_biz_no则该字段为必传。可取的业务场景如下：  PERSONAL_PAY：C2C现金红包-发红包；  PERSONAL_COLLECTION：C2C现金红包-领红包；  REFUND：C2C现金红包-红包退回；  DIRECT_TRANSFER：B2C现金红包、单笔无密转账 (optional)
     * @param outBizNo 商户转账唯一订单号，发起转账来源方定义的转账单据ID。  本参数和order_id（支付宝转账单据号）、pay_fund_order_id（支付宝支付资金流水号）三者不能同时为空。 当三者同时传入时，将用pay_fund_order_id（支付宝支付资金流水号）进行查询，忽略其余两者； 当本参数和支付宝转账单据号同时提供时，将用支付宝转账单据号进行查询，忽略本参数。 (optional)
     * @param orderId 支付宝转账单据号。 本参数和out_biz_no（商户转账唯一订单号）、pay_fund_order_id（支付宝支付资金流水号）三者不能同时为空。  当三者同时传入时，将用pay_fund_order_id（支付宝支付资金流水号）进行查询，忽略其余两者； 当本参数和pay_fund_order_id（支付宝支付资金流水号）同时提供时，将用支付宝支付资金流水号进行查询，忽略本参数；  当本参数和out_biz_no（商户转账唯一订单号）同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。 (optional)
     * @param payFundOrderId 支付宝支付资金流水号。本参数和支付宝转账单据号、商户转账唯一订单号三者不能同时为空。  当本参数和out_biz_no（商户转账唯一订单号）、order_id（支付宝转账单据号）同时提供时，将用本参数进行查询，忽略其余两者； 当本参数和order_id（支付宝转账单据号）同时提供时，将用本参数进行查询，忽略支付宝转账单据号；  当本参数和out_biz_no（商户转账唯一订单号）同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。 (optional)
     * @return ApiResponse&lt;AlipayFundTransCommonQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundTransCommonQueryResponseModel> queryWithHttpInfo(String productCode, String bizScene, String outBizNo, String orderId, String payFundOrderId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, outBizNo, orderId, payFundOrderId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundTransCommonQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundTransCommonQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 转账业务单据查询接口 (asynchronously)
     * 商户可通过该接口查询转账业务单据的状态，主要应用于统一转账接口(alipay.fund.trans.uni.transfer)、无线转账接口(alipay.fund.trans.app.pay)、单笔转账到支付宝账户接口（alipay.fund.trans.toaccount.transfer）
     * @param productCode 销售产品码，商家和支付宝签约的产品码，如果传递了out_biz_no则该字段为必传。可传值如下： STD_RED_PACKET：现金红包 TRANS_ACCOUNT_NO_PWD：单笔无密转账到支付宝账户 TRANS_BANKCARD_NO_PWD：单笔无密转账到银行卡 (optional)
     * @param bizScene 描述特定的业务场景，如果传递了out_biz_no则该字段为必传。可取的业务场景如下：  PERSONAL_PAY：C2C现金红包-发红包；  PERSONAL_COLLECTION：C2C现金红包-领红包；  REFUND：C2C现金红包-红包退回；  DIRECT_TRANSFER：B2C现金红包、单笔无密转账 (optional)
     * @param outBizNo 商户转账唯一订单号，发起转账来源方定义的转账单据ID。  本参数和order_id（支付宝转账单据号）、pay_fund_order_id（支付宝支付资金流水号）三者不能同时为空。 当三者同时传入时，将用pay_fund_order_id（支付宝支付资金流水号）进行查询，忽略其余两者； 当本参数和支付宝转账单据号同时提供时，将用支付宝转账单据号进行查询，忽略本参数。 (optional)
     * @param orderId 支付宝转账单据号。 本参数和out_biz_no（商户转账唯一订单号）、pay_fund_order_id（支付宝支付资金流水号）三者不能同时为空。  当三者同时传入时，将用pay_fund_order_id（支付宝支付资金流水号）进行查询，忽略其余两者； 当本参数和pay_fund_order_id（支付宝支付资金流水号）同时提供时，将用支付宝支付资金流水号进行查询，忽略本参数；  当本参数和out_biz_no（商户转账唯一订单号）同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。 (optional)
     * @param payFundOrderId 支付宝支付资金流水号。本参数和支付宝转账单据号、商户转账唯一订单号三者不能同时为空。  当本参数和out_biz_no（商户转账唯一订单号）、order_id（支付宝转账单据号）同时提供时，将用本参数进行查询，忽略其余两者； 当本参数和order_id（支付宝转账单据号）同时提供时，将用本参数进行查询，忽略支付宝转账单据号；  当本参数和out_biz_no（商户转账唯一订单号）同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。 (optional)
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
    public okhttp3.Call queryAsync(String productCode, String bizScene, String outBizNo, String orderId, String payFundOrderId, final ApiCallback<AlipayFundTransCommonQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, outBizNo, orderId, payFundOrderId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundTransCommonQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String productCode, String bizScene, String outBizNo, String orderId, String payFundOrderId, final ApiCallback<AlipayFundTransCommonQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, outBizNo, orderId, payFundOrderId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundTransCommonQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
