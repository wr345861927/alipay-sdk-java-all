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


import com.alipay.v3.model.AlipayOpenMiniInnerappServicePublishDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniInnerappServicePublishModel;
import com.alipay.v3.model.AlipayOpenMiniInnerappServicePublishResponseModel;
import com.alipay.v3.model.AlipayOpenMiniInnerappServiceQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniInnerappServiceQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenMiniInnerappServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenMiniInnerappServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenMiniInnerappServiceApi(ApiClient apiClient) {
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
     * Build call for publish
     * @param alipayOpenMiniInnerappServicePublishModel  (optional)
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
    public okhttp3.Call publishCall(AlipayOpenMiniInnerappServicePublishModel alipayOpenMiniInnerappServicePublishModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniInnerappServicePublishModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/innerapp/service/publish";

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
    private okhttp3.Call publishValidateBeforeCall(AlipayOpenMiniInnerappServicePublishModel alipayOpenMiniInnerappServicePublishModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = publishCall(alipayOpenMiniInnerappServicePublishModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小程序模板发布服务市场
     * 小程序提供一套针对一二方场景的开发者提供一套统一的内部能力开放体系，定向输出赋能
     * @param alipayOpenMiniInnerappServicePublishModel  (optional)
     * @return AlipayOpenMiniInnerappServicePublishResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniInnerappServicePublishResponseModel publish(AlipayOpenMiniInnerappServicePublishModel alipayOpenMiniInnerappServicePublishModel) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerappServicePublishResponseModel> localVarResp = publishWithHttpInfo(alipayOpenMiniInnerappServicePublishModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniInnerappServicePublishResponseModel publish(AlipayOpenMiniInnerappServicePublishModel alipayOpenMiniInnerappServicePublishModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerappServicePublishResponseModel> localVarResp = publishWithHttpInfo(alipayOpenMiniInnerappServicePublishModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小程序模板发布服务市场
     * 小程序提供一套针对一二方场景的开发者提供一套统一的内部能力开放体系，定向输出赋能
     * @param alipayOpenMiniInnerappServicePublishModel  (optional)
     * @return ApiResponse&lt;AlipayOpenMiniInnerappServicePublishResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniInnerappServicePublishResponseModel> publishWithHttpInfo(AlipayOpenMiniInnerappServicePublishModel alipayOpenMiniInnerappServicePublishModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = publishValidateBeforeCall(alipayOpenMiniInnerappServicePublishModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerappServicePublishResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniInnerappServicePublishDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小程序模板发布服务市场 (asynchronously)
     * 小程序提供一套针对一二方场景的开发者提供一套统一的内部能力开放体系，定向输出赋能
     * @param alipayOpenMiniInnerappServicePublishModel  (optional)
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
    public okhttp3.Call publishAsync(AlipayOpenMiniInnerappServicePublishModel alipayOpenMiniInnerappServicePublishModel, final ApiCallback<AlipayOpenMiniInnerappServicePublishResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = publishValidateBeforeCall(alipayOpenMiniInnerappServicePublishModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerappServicePublishResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call publishAsync(AlipayOpenMiniInnerappServicePublishModel alipayOpenMiniInnerappServicePublishModel, final ApiCallback<AlipayOpenMiniInnerappServicePublishResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = publishValidateBeforeCall(alipayOpenMiniInnerappServicePublishModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerappServicePublishResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param miniAppId 插件id或模板id (optional)
     * @param appSubType 小程序应用子类型 (optional)
     * @param showType 是否在服务市场透出，SHOW展示、HIDE隐藏 (optional)
     * @param keyword 关键词 (optional)
     * @param pageNum 页码，默认第一页 (optional)
     * @param pageSize 分页数，默认每页10个 (optional)
     * @param appOrigin 业务来源，新接入方需要向支付宝申请专用来源，否则不予接入。https://yuque.antfin-inc.com/tinyapp-all/qddncu/bidushixiang (optional)
     * @param includeOffline 是否需要展示offline状态插件，不传默认为false（不展示） (optional)
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
    public okhttp3.Call queryCall(String miniAppId, String appSubType, String showType, String keyword, String pageNum, String pageSize, String appOrigin, Boolean includeOffline, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/mini/innerapp/service/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (miniAppId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mini_app_id", miniAppId));
        }

        if (appSubType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_sub_type", appSubType));
        }

        if (showType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("show_type", showType));
        }

        if (keyword != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("keyword", keyword));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (appOrigin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_origin", appOrigin));
        }

        if (includeOffline != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_offline", includeOffline));
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
    private okhttp3.Call queryValidateBeforeCall(String miniAppId, String appSubType, String showType, String keyword, String pageNum, String pageSize, String appOrigin, Boolean includeOffline, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(miniAppId, appSubType, showType, keyword, pageNum, pageSize, appOrigin, includeOffline, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小程序服务市场搜索
     * 小程序服务市场搜索，包括搜索模板和插件
     * @param miniAppId 插件id或模板id (optional)
     * @param appSubType 小程序应用子类型 (optional)
     * @param showType 是否在服务市场透出，SHOW展示、HIDE隐藏 (optional)
     * @param keyword 关键词 (optional)
     * @param pageNum 页码，默认第一页 (optional)
     * @param pageSize 分页数，默认每页10个 (optional)
     * @param appOrigin 业务来源，新接入方需要向支付宝申请专用来源，否则不予接入。https://yuque.antfin-inc.com/tinyapp-all/qddncu/bidushixiang (optional)
     * @param includeOffline 是否需要展示offline状态插件，不传默认为false（不展示） (optional)
     * @return AlipayOpenMiniInnerappServiceQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniInnerappServiceQueryResponseModel query(String miniAppId, String appSubType, String showType, String keyword, String pageNum, String pageSize, String appOrigin, Boolean includeOffline) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerappServiceQueryResponseModel> localVarResp = queryWithHttpInfo(miniAppId, appSubType, showType, keyword, pageNum, pageSize, appOrigin, includeOffline, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniInnerappServiceQueryResponseModel query(String miniAppId, String appSubType, String showType, String keyword, String pageNum, String pageSize, String appOrigin, Boolean includeOffline, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerappServiceQueryResponseModel> localVarResp = queryWithHttpInfo(miniAppId, appSubType, showType, keyword, pageNum, pageSize, appOrigin, includeOffline, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小程序服务市场搜索
     * 小程序服务市场搜索，包括搜索模板和插件
     * @param miniAppId 插件id或模板id (optional)
     * @param appSubType 小程序应用子类型 (optional)
     * @param showType 是否在服务市场透出，SHOW展示、HIDE隐藏 (optional)
     * @param keyword 关键词 (optional)
     * @param pageNum 页码，默认第一页 (optional)
     * @param pageSize 分页数，默认每页10个 (optional)
     * @param appOrigin 业务来源，新接入方需要向支付宝申请专用来源，否则不予接入。https://yuque.antfin-inc.com/tinyapp-all/qddncu/bidushixiang (optional)
     * @param includeOffline 是否需要展示offline状态插件，不传默认为false（不展示） (optional)
     * @return ApiResponse&lt;AlipayOpenMiniInnerappServiceQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniInnerappServiceQueryResponseModel> queryWithHttpInfo(String miniAppId, String appSubType, String showType, String keyword, String pageNum, String pageSize, String appOrigin, Boolean includeOffline, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(miniAppId, appSubType, showType, keyword, pageNum, pageSize, appOrigin, includeOffline, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerappServiceQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniInnerappServiceQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小程序服务市场搜索 (asynchronously)
     * 小程序服务市场搜索，包括搜索模板和插件
     * @param miniAppId 插件id或模板id (optional)
     * @param appSubType 小程序应用子类型 (optional)
     * @param showType 是否在服务市场透出，SHOW展示、HIDE隐藏 (optional)
     * @param keyword 关键词 (optional)
     * @param pageNum 页码，默认第一页 (optional)
     * @param pageSize 分页数，默认每页10个 (optional)
     * @param appOrigin 业务来源，新接入方需要向支付宝申请专用来源，否则不予接入。https://yuque.antfin-inc.com/tinyapp-all/qddncu/bidushixiang (optional)
     * @param includeOffline 是否需要展示offline状态插件，不传默认为false（不展示） (optional)
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
    public okhttp3.Call queryAsync(String miniAppId, String appSubType, String showType, String keyword, String pageNum, String pageSize, String appOrigin, Boolean includeOffline, final ApiCallback<AlipayOpenMiniInnerappServiceQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(miniAppId, appSubType, showType, keyword, pageNum, pageSize, appOrigin, includeOffline, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerappServiceQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String miniAppId, String appSubType, String showType, String keyword, String pageNum, String pageSize, String appOrigin, Boolean includeOffline, final ApiCallback<AlipayOpenMiniInnerappServiceQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(miniAppId, appSubType, showType, keyword, pageNum, pageSize, appOrigin, includeOffline, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerappServiceQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
