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


import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCheckInitializeDefaultResponse;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCheckInitializeModel;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCheckQueryDefaultResponse;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DatadigitalFincloudGeneralsaasFaceCheckApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DatadigitalFincloudGeneralsaasFaceCheckApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DatadigitalFincloudGeneralsaasFaceCheckApi(ApiClient apiClient) {
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
     * @param datadigitalFincloudGeneralsaasFaceCheckInitializeModel  (optional)
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
    public okhttp3.Call initializeCall(DatadigitalFincloudGeneralsaasFaceCheckInitializeModel datadigitalFincloudGeneralsaasFaceCheckInitializeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : datadigitalFincloudGeneralsaasFaceCheckInitializeModel;

        // create path and map variables
        String localVarPath = "/v3/datadigital/fincloud/generalsaas/face/check/initialize";

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
    private okhttp3.Call initializeValidateBeforeCall(DatadigitalFincloudGeneralsaasFaceCheckInitializeModel datadigitalFincloudGeneralsaasFaceCheckInitializeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = initializeCall(datadigitalFincloudGeneralsaasFaceCheckInitializeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 人脸检测初始化
     * 人脸检测业务单据初始化
     * @param datadigitalFincloudGeneralsaasFaceCheckInitializeModel  (optional)
     * @return DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel initialize(DatadigitalFincloudGeneralsaasFaceCheckInitializeModel datadigitalFincloudGeneralsaasFaceCheckInitializeModel) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel> localVarResp = initializeWithHttpInfo(datadigitalFincloudGeneralsaasFaceCheckInitializeModel, null);
        return localVarResp.getData();
    }

    public DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel initialize(DatadigitalFincloudGeneralsaasFaceCheckInitializeModel datadigitalFincloudGeneralsaasFaceCheckInitializeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel> localVarResp = initializeWithHttpInfo(datadigitalFincloudGeneralsaasFaceCheckInitializeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 人脸检测初始化
     * 人脸检测业务单据初始化
     * @param datadigitalFincloudGeneralsaasFaceCheckInitializeModel  (optional)
     * @return ApiResponse&lt;DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel> initializeWithHttpInfo(DatadigitalFincloudGeneralsaasFaceCheckInitializeModel datadigitalFincloudGeneralsaasFaceCheckInitializeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = initializeValidateBeforeCall(datadigitalFincloudGeneralsaasFaceCheckInitializeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<DatadigitalFincloudGeneralsaasFaceCheckInitializeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 人脸检测初始化 (asynchronously)
     * 人脸检测业务单据初始化
     * @param datadigitalFincloudGeneralsaasFaceCheckInitializeModel  (optional)
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
    public okhttp3.Call initializeAsync(DatadigitalFincloudGeneralsaasFaceCheckInitializeModel datadigitalFincloudGeneralsaasFaceCheckInitializeModel, final ApiCallback<DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = initializeValidateBeforeCall(datadigitalFincloudGeneralsaasFaceCheckInitializeModel, _callback, null);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call initializeAsync(DatadigitalFincloudGeneralsaasFaceCheckInitializeModel datadigitalFincloudGeneralsaasFaceCheckInitializeModel, final ApiCallback<DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = initializeValidateBeforeCall(datadigitalFincloudGeneralsaasFaceCheckInitializeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param certifyId 传入初始化接口datadigital.fincloud.generalsaas.face.check.initialize 得到的certify_id (optional)
     * @param needAlivePhoto 是否需要返回活体结果图片，needAlivePhoto：Y_O （原始图片）、Y_M（虚化，背景马赛克）、N（不返图）。非必填，默认为N (optional)
     * @param needScore 该入参已经废弃。 (optional)
     * @param needQualityScore 是否需要返回图片质量分，非必填，默认值为N。 N表示不需要，Y表示需要 (optional)
     * @param needAttackResult 该参数已废弃 (optional)
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
    public okhttp3.Call queryCall(String certifyId, String needAlivePhoto, String needScore, String needQualityScore, String needAttackResult, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/datadigital/fincloud/generalsaas/face/check/query";

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

        if (needScore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("need_score", needScore));
        }

        if (needQualityScore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("need_quality_score", needQualityScore));
        }

        if (needAttackResult != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("need_attack_result", needAttackResult));
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
    private okhttp3.Call queryValidateBeforeCall(String certifyId, String needAlivePhoto, String needScore, String needQualityScore, String needAttackResult, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(certifyId, needAlivePhoto, needScore, needQualityScore, needAttackResult, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 人脸检测结果数据查询
     * 用于查询人脸检测结果的数据。
     * @param certifyId 传入初始化接口datadigital.fincloud.generalsaas.face.check.initialize 得到的certify_id (optional)
     * @param needAlivePhoto 是否需要返回活体结果图片，needAlivePhoto：Y_O （原始图片）、Y_M（虚化，背景马赛克）、N（不返图）。非必填，默认为N (optional)
     * @param needScore 该入参已经废弃。 (optional)
     * @param needQualityScore 是否需要返回图片质量分，非必填，默认值为N。 N表示不需要，Y表示需要 (optional)
     * @param needAttackResult 该参数已废弃 (optional)
     * @return DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel query(String certifyId, String needAlivePhoto, String needScore, String needQualityScore, String needAttackResult) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel> localVarResp = queryWithHttpInfo(certifyId, needAlivePhoto, needScore, needQualityScore, needAttackResult, null);
        return localVarResp.getData();
    }

    public DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel query(String certifyId, String needAlivePhoto, String needScore, String needQualityScore, String needAttackResult, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel> localVarResp = queryWithHttpInfo(certifyId, needAlivePhoto, needScore, needQualityScore, needAttackResult, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 人脸检测结果数据查询
     * 用于查询人脸检测结果的数据。
     * @param certifyId 传入初始化接口datadigital.fincloud.generalsaas.face.check.initialize 得到的certify_id (optional)
     * @param needAlivePhoto 是否需要返回活体结果图片，needAlivePhoto：Y_O （原始图片）、Y_M（虚化，背景马赛克）、N（不返图）。非必填，默认为N (optional)
     * @param needScore 该入参已经废弃。 (optional)
     * @param needQualityScore 是否需要返回图片质量分，非必填，默认值为N。 N表示不需要，Y表示需要 (optional)
     * @param needAttackResult 该参数已废弃 (optional)
     * @return ApiResponse&lt;DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel> queryWithHttpInfo(String certifyId, String needAlivePhoto, String needScore, String needQualityScore, String needAttackResult, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, needAlivePhoto, needScore, needQualityScore, needAttackResult, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<DatadigitalFincloudGeneralsaasFaceCheckQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 人脸检测结果数据查询 (asynchronously)
     * 用于查询人脸检测结果的数据。
     * @param certifyId 传入初始化接口datadigital.fincloud.generalsaas.face.check.initialize 得到的certify_id (optional)
     * @param needAlivePhoto 是否需要返回活体结果图片，needAlivePhoto：Y_O （原始图片）、Y_M（虚化，背景马赛克）、N（不返图）。非必填，默认为N (optional)
     * @param needScore 该入参已经废弃。 (optional)
     * @param needQualityScore 是否需要返回图片质量分，非必填，默认值为N。 N表示不需要，Y表示需要 (optional)
     * @param needAttackResult 该参数已废弃 (optional)
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
    public okhttp3.Call queryAsync(String certifyId, String needAlivePhoto, String needScore, String needQualityScore, String needAttackResult, final ApiCallback<DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, needAlivePhoto, needScore, needQualityScore, needAttackResult, _callback, null);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String certifyId, String needAlivePhoto, String needScore, String needQualityScore, String needAttackResult, final ApiCallback<DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, needAlivePhoto, needScore, needQualityScore, needAttackResult, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
