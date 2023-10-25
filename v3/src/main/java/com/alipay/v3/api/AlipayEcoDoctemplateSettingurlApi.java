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


import com.alipay.v3.model.AlipayEcoDoctemplateSettingurlQueryDefaultResponse;
import com.alipay.v3.model.AlipayEcoDoctemplateSettingurlQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEcoDoctemplateSettingurlApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEcoDoctemplateSettingurlApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEcoDoctemplateSettingurlApi(ApiClient apiClient) {
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
     * @param targetAppId 目标isv应用ID (optional)
     * @param templateId 合同模板id。通过&lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.doc.template.create\&quot;&gt;创建合同模版&lt;/a&gt;（alipay.eco.doc.template.create）接口获取。 (optional)
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
    public okhttp3.Call queryCall(String targetAppId, String templateId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/eco/doctemplate/settingurl/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targetAppId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_app_id", targetAppId));
        }

        if (templateId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("template_id", templateId));
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
    private okhttp3.Call queryValidateBeforeCall(String targetAppId, String templateId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(targetAppId, templateId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 获取合同模板设置地址（E签宝）
     * 通过创建合同模板接口返回的模板ID（templateId）获取合同模板的配置地址。在模板设置页面上进行模板输入组件、签署区设置后，即可基于模板发起合同签署。
     * @param targetAppId 目标isv应用ID (optional)
     * @param templateId 合同模板id。通过&lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.doc.template.create\&quot;&gt;创建合同模版&lt;/a&gt;（alipay.eco.doc.template.create）接口获取。 (optional)
     * @return AlipayEcoDoctemplateSettingurlQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEcoDoctemplateSettingurlQueryResponseModel query(String targetAppId, String templateId) throws ApiException {
        ApiResponse<AlipayEcoDoctemplateSettingurlQueryResponseModel> localVarResp = queryWithHttpInfo(targetAppId, templateId, null);
        return localVarResp.getData();
    }

    public AlipayEcoDoctemplateSettingurlQueryResponseModel query(String targetAppId, String templateId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEcoDoctemplateSettingurlQueryResponseModel> localVarResp = queryWithHttpInfo(targetAppId, templateId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 获取合同模板设置地址（E签宝）
     * 通过创建合同模板接口返回的模板ID（templateId）获取合同模板的配置地址。在模板设置页面上进行模板输入组件、签署区设置后，即可基于模板发起合同签署。
     * @param targetAppId 目标isv应用ID (optional)
     * @param templateId 合同模板id。通过&lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.doc.template.create\&quot;&gt;创建合同模版&lt;/a&gt;（alipay.eco.doc.template.create）接口获取。 (optional)
     * @return ApiResponse&lt;AlipayEcoDoctemplateSettingurlQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEcoDoctemplateSettingurlQueryResponseModel> queryWithHttpInfo(String targetAppId, String templateId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(targetAppId, templateId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEcoDoctemplateSettingurlQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoDoctemplateSettingurlQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 获取合同模板设置地址（E签宝） (asynchronously)
     * 通过创建合同模板接口返回的模板ID（templateId）获取合同模板的配置地址。在模板设置页面上进行模板输入组件、签署区设置后，即可基于模板发起合同签署。
     * @param targetAppId 目标isv应用ID (optional)
     * @param templateId 合同模板id。通过&lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.doc.template.create\&quot;&gt;创建合同模版&lt;/a&gt;（alipay.eco.doc.template.create）接口获取。 (optional)
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
    public okhttp3.Call queryAsync(String targetAppId, String templateId, final ApiCallback<AlipayEcoDoctemplateSettingurlQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(targetAppId, templateId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEcoDoctemplateSettingurlQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String targetAppId, String templateId, final ApiCallback<AlipayEcoDoctemplateSettingurlQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(targetAppId, templateId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEcoDoctemplateSettingurlQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
