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


import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceVerificationInitializeDefaultResponse;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceVerificationQueryDefaultResponse;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DatadigitalFincloudGeneralsaasFaceVerificationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DatadigitalFincloudGeneralsaasFaceVerificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DatadigitalFincloudGeneralsaasFaceVerificationApi(ApiClient apiClient) {
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
     * Build call for initialize
     * @param datadigitalFincloudGeneralsaasFaceVerificationInitializeModel  (optional)
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
    public okhttp3.Call initializeCall(DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : datadigitalFincloudGeneralsaasFaceVerificationInitializeModel;

        // create path and map variables
        String localVarPath = "/v3/datadigital/fincloud/generalsaas/face/verification/initialize";

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
    private okhttp3.Call initializeValidateBeforeCall(DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = initializeCall(datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 人脸核身初始化
     * 人脸核身初始化接口
     * @param datadigitalFincloudGeneralsaasFaceVerificationInitializeModel  (optional)
     * @return DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel initialize(DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel datadigitalFincloudGeneralsaasFaceVerificationInitializeModel) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel> localVarResp = initializeWithHttpInfo(datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, null);
        return localVarResp.getData();
    }

    public DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel initialize(DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel> localVarResp = initializeWithHttpInfo(datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 人脸核身初始化
     * 人脸核身初始化接口
     * @param datadigitalFincloudGeneralsaasFaceVerificationInitializeModel  (optional)
     * @return ApiResponse&lt;DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel> initializeWithHttpInfo(DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = initializeValidateBeforeCall(datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<DatadigitalFincloudGeneralsaasFaceVerificationInitializeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 人脸核身初始化 (asynchronously)
     * 人脸核身初始化接口
     * @param datadigitalFincloudGeneralsaasFaceVerificationInitializeModel  (optional)
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
    public okhttp3.Call initializeAsync(DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, final ApiCallback<DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = initializeValidateBeforeCall(datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, _callback, null);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call initializeAsync(DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, final ApiCallback<DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = initializeValidateBeforeCall(datadigitalFincloudGeneralsaasFaceVerificationInitializeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param certifyId 填入人脸核身初始化阶段获取到的certify_id (optional)
     * @param needAlivePhoto 是否需要返回活体结果图片，默认为N（不返图） (optional)
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
    public okhttp3.Call queryCall(String certifyId, String needAlivePhoto, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/datadigital/fincloud/generalsaas/face/verification/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (certifyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("certify_id", certifyId));
        }

        if (needAlivePhoto != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("need_alive_photo", needAlivePhoto));
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
    private okhttp3.Call queryValidateBeforeCall(String certifyId, String needAlivePhoto, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(certifyId, needAlivePhoto, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 人脸核身结果查询
     * 查询核身结果
     * @param certifyId 填入人脸核身初始化阶段获取到的certify_id (optional)
     * @param needAlivePhoto 是否需要返回活体结果图片，默认为N（不返图） (optional)
     * @return DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel query(String certifyId, String needAlivePhoto) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel> localVarResp = queryWithHttpInfo(certifyId, needAlivePhoto, null);
        return localVarResp.getData();
    }

    public DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel query(String certifyId, String needAlivePhoto, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel> localVarResp = queryWithHttpInfo(certifyId, needAlivePhoto, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 人脸核身结果查询
     * 查询核身结果
     * @param certifyId 填入人脸核身初始化阶段获取到的certify_id (optional)
     * @param needAlivePhoto 是否需要返回活体结果图片，默认为N（不返图） (optional)
     * @return ApiResponse&lt;DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel> queryWithHttpInfo(String certifyId, String needAlivePhoto, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, needAlivePhoto, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<DatadigitalFincloudGeneralsaasFaceVerificationQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 人脸核身结果查询 (asynchronously)
     * 查询核身结果
     * @param certifyId 填入人脸核身初始化阶段获取到的certify_id (optional)
     * @param needAlivePhoto 是否需要返回活体结果图片，默认为N（不返图） (optional)
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
    public okhttp3.Call queryAsync(String certifyId, String needAlivePhoto, final ApiCallback<DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, needAlivePhoto, _callback, null);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String certifyId, String needAlivePhoto, final ApiCallback<DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, needAlivePhoto, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
