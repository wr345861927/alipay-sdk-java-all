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


import com.alipay.v3.model.AlipayCommerceEcEnterpriseCreateDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseCreateModel;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseCreateResponseModel;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseDeleteDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseDeleteModel;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseDeleteResponseModel;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseUnsignDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseUnsignResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayCommerceEcEnterpriseApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayCommerceEcEnterpriseApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayCommerceEcEnterpriseApi(ApiClient apiClient) {
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
     * Build call for create
     * @param alipayCommerceEcEnterpriseCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayCommerceEcEnterpriseCreateModel alipayCommerceEcEnterpriseCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayCommerceEcEnterpriseCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/commerce/ec/enterprise/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayCommerceEcEnterpriseCreateModel alipayCommerceEcEnterpriseCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayCommerceEcEnterpriseCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 企业签约注册
     * 企业注册企业码，并返回因公付签约链接，通过该链接，企业可操作完成出资账户绑定
     * @param alipayCommerceEcEnterpriseCreateModel  (optional)
     * @return AlipayCommerceEcEnterpriseCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEcEnterpriseCreateResponseModel create(AlipayCommerceEcEnterpriseCreateModel alipayCommerceEcEnterpriseCreateModel) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseCreateResponseModel> localVarResp = createWithHttpInfo(alipayCommerceEcEnterpriseCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEcEnterpriseCreateResponseModel create(AlipayCommerceEcEnterpriseCreateModel alipayCommerceEcEnterpriseCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseCreateResponseModel> localVarResp = createWithHttpInfo(alipayCommerceEcEnterpriseCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 企业签约注册
     * 企业注册企业码，并返回因公付签约链接，通过该链接，企业可操作完成出资账户绑定
     * @param alipayCommerceEcEnterpriseCreateModel  (optional)
     * @return ApiResponse&lt;AlipayCommerceEcEnterpriseCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEcEnterpriseCreateResponseModel> createWithHttpInfo(AlipayCommerceEcEnterpriseCreateModel alipayCommerceEcEnterpriseCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayCommerceEcEnterpriseCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEcEnterpriseCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 企业签约注册 (asynchronously)
     * 企业注册企业码，并返回因公付签约链接，通过该链接，企业可操作完成出资账户绑定
     * @param alipayCommerceEcEnterpriseCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayCommerceEcEnterpriseCreateModel alipayCommerceEcEnterpriseCreateModel, final ApiCallback<AlipayCommerceEcEnterpriseCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayCommerceEcEnterpriseCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call createAsync(AlipayCommerceEcEnterpriseCreateModel alipayCommerceEcEnterpriseCreateModel, final ApiCallback<AlipayCommerceEcEnterpriseCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayCommerceEcEnterpriseCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
     * @param alipayCommerceEcEnterpriseDeleteModel  (optional)
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
    public okhttp3.Call deleteCall(AlipayCommerceEcEnterpriseDeleteModel alipayCommerceEcEnterpriseDeleteModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayCommerceEcEnterpriseDeleteModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/commerce/ec/enterprise/delete";

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
    private okhttp3.Call deleteValidateBeforeCall(AlipayCommerceEcEnterpriseDeleteModel alipayCommerceEcEnterpriseDeleteModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = deleteCall(alipayCommerceEcEnterpriseDeleteModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 企业注销
     * 企业注销，清理企业数据
     * @param alipayCommerceEcEnterpriseDeleteModel  (optional)
     * @return AlipayCommerceEcEnterpriseDeleteResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEcEnterpriseDeleteResponseModel delete(AlipayCommerceEcEnterpriseDeleteModel alipayCommerceEcEnterpriseDeleteModel) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseDeleteResponseModel> localVarResp = deleteWithHttpInfo(alipayCommerceEcEnterpriseDeleteModel, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEcEnterpriseDeleteResponseModel delete(AlipayCommerceEcEnterpriseDeleteModel alipayCommerceEcEnterpriseDeleteModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseDeleteResponseModel> localVarResp = deleteWithHttpInfo(alipayCommerceEcEnterpriseDeleteModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 企业注销
     * 企业注销，清理企业数据
     * @param alipayCommerceEcEnterpriseDeleteModel  (optional)
     * @return ApiResponse&lt;AlipayCommerceEcEnterpriseDeleteResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEcEnterpriseDeleteResponseModel> deleteWithHttpInfo(AlipayCommerceEcEnterpriseDeleteModel alipayCommerceEcEnterpriseDeleteModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayCommerceEcEnterpriseDeleteModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseDeleteResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEcEnterpriseDeleteDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 企业注销 (asynchronously)
     * 企业注销，清理企业数据
     * @param alipayCommerceEcEnterpriseDeleteModel  (optional)
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
    public okhttp3.Call deleteAsync(AlipayCommerceEcEnterpriseDeleteModel alipayCommerceEcEnterpriseDeleteModel, final ApiCallback<AlipayCommerceEcEnterpriseDeleteResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayCommerceEcEnterpriseDeleteModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseDeleteResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call deleteAsync(AlipayCommerceEcEnterpriseDeleteModel alipayCommerceEcEnterpriseDeleteModel, final ApiCallback<AlipayCommerceEcEnterpriseDeleteResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayCommerceEcEnterpriseDeleteModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseDeleteResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unsign
     * @param enterpriseId 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。 (optional)
     * @param accountId 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。(为兼容企业码1.0老接口的参数，已过时，新接客户请传企业ID) (optional)
     * @param agreementNo 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。(为兼容企业码1.0老接口的参数，已过时，新接客户请传企业ID) (optional)
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
    public okhttp3.Call unsignCall(String enterpriseId, String accountId, String agreementNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/commerce/ec/enterprise/unsignurl";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (enterpriseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("enterprise_id", enterpriseId));
        }

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
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
    private okhttp3.Call unsignValidateBeforeCall(String enterpriseId, String accountId, String agreementNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = unsignCall(enterpriseId, accountId, agreementNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 企业解约
     * 企业解约，获取解约链接，点击链接跳转到解约页面，进行解约协议
     * @param enterpriseId 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。 (optional)
     * @param accountId 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。(为兼容企业码1.0老接口的参数，已过时，新接客户请传企业ID) (optional)
     * @param agreementNo 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。(为兼容企业码1.0老接口的参数，已过时，新接客户请传企业ID) (optional)
     * @return AlipayCommerceEcEnterpriseUnsignResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEcEnterpriseUnsignResponseModel unsign(String enterpriseId, String accountId, String agreementNo) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseUnsignResponseModel> localVarResp = unsignWithHttpInfo(enterpriseId, accountId, agreementNo, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEcEnterpriseUnsignResponseModel unsign(String enterpriseId, String accountId, String agreementNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseUnsignResponseModel> localVarResp = unsignWithHttpInfo(enterpriseId, accountId, agreementNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 企业解约
     * 企业解约，获取解约链接，点击链接跳转到解约页面，进行解约协议
     * @param enterpriseId 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。 (optional)
     * @param accountId 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。(为兼容企业码1.0老接口的参数，已过时，新接客户请传企业ID) (optional)
     * @param agreementNo 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。(为兼容企业码1.0老接口的参数，已过时，新接客户请传企业ID) (optional)
     * @return ApiResponse&lt;AlipayCommerceEcEnterpriseUnsignResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEcEnterpriseUnsignResponseModel> unsignWithHttpInfo(String enterpriseId, String accountId, String agreementNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = unsignValidateBeforeCall(enterpriseId, accountId, agreementNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseUnsignResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEcEnterpriseUnsignDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 企业解约 (asynchronously)
     * 企业解约，获取解约链接，点击链接跳转到解约页面，进行解约协议
     * @param enterpriseId 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。 (optional)
     * @param accountId 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。(为兼容企业码1.0老接口的参数，已过时，新接客户请传企业ID) (optional)
     * @param agreementNo 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。(为兼容企业码1.0老接口的参数，已过时，新接客户请传企业ID) (optional)
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
    public okhttp3.Call unsignAsync(String enterpriseId, String accountId, String agreementNo, final ApiCallback<AlipayCommerceEcEnterpriseUnsignResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = unsignValidateBeforeCall(enterpriseId, accountId, agreementNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseUnsignResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call unsignAsync(String enterpriseId, String accountId, String agreementNo, final ApiCallback<AlipayCommerceEcEnterpriseUnsignResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = unsignValidateBeforeCall(enterpriseId, accountId, agreementNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseUnsignResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
