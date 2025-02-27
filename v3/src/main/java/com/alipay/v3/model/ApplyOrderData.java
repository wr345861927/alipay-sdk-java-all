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


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.SearchPartAgreeInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * ApplyOrderData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApplyOrderData {
  public static final String SERIALIZED_NAME_ACCESS_TYPE = "access_type";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private String accessType;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APPID = "appid";
  @SerializedName(SERIALIZED_NAME_APPID)
  private String appid;

  public static final String SERIALIZED_NAME_AUDIT_REASON = "audit_reason";
  @SerializedName(SERIALIZED_NAME_AUDIT_REASON)
  private String auditReason;

  public static final String SERIALIZED_NAME_BRAND_TEMPLATE_ID = "brand_template_id";
  @SerializedName(SERIALIZED_NAME_BRAND_TEMPLATE_ID)
  private String brandTemplateId;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_IS_OLD_DATA = "is_old_data";
  @SerializedName(SERIALIZED_NAME_IS_OLD_DATA)
  private Boolean isOldData;

  public static final String SERIALIZED_NAME_LATEST = "latest";
  @SerializedName(SERIALIZED_NAME_LATEST)
  private Boolean latest;

  public static final String SERIALIZED_NAME_MAJOR_STATUS = "major_status";
  @SerializedName(SERIALIZED_NAME_MAJOR_STATUS)
  private String majorStatus;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_PART_AGREE_INFO = "part_agree_info";
  @SerializedName(SERIALIZED_NAME_PART_AGREE_INFO)
  private List<SearchPartAgreeInfo> partAgreeInfo = null;

  public static final String SERIALIZED_NAME_SCENE_CODE = "scene_code";
  @SerializedName(SERIALIZED_NAME_SCENE_CODE)
  private String sceneCode;

  public static final String SERIALIZED_NAME_SCENE_NAME = "scene_name";
  @SerializedName(SERIALIZED_NAME_SCENE_NAME)
  private String sceneName;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUB_SERVICE_NAME = "sub_service_name";
  @SerializedName(SERIALIZED_NAME_SUB_SERVICE_NAME)
  private String subServiceName;

  public ApplyOrderData() { 
  }

  public ApplyOrderData accessType(String accessType) {
    
    this.accessType = accessType;
    return this;
  }

   /**
   * 申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
   * @return accessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BRAND_BOX", value = "申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达")

  public String getAccessType() {
    return accessType;
  }


  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }


  public ApplyOrderData appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序名称
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序名称", value = "小程序名称")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public ApplyOrderData appid(String appid) {
    
    this.appid = appid;
    return this;
  }

   /**
   * 小程序id
   * @return appid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001105612404", value = "小程序id")

  public String getAppid() {
    return appid;
  }


  public void setAppid(String appid) {
    this.appid = appid;
  }


  public ApplyOrderData auditReason(String auditReason) {
    
    this.auditReason = auditReason;
    return this;
  }

   /**
   * 审核原因
   * @return auditReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "审核原因", value = "审核原因")

  public String getAuditReason() {
    return auditReason;
  }


  public void setAuditReason(String auditReason) {
    this.auditReason = auditReason;
  }


  public ApplyOrderData brandTemplateId(String brandTemplateId) {
    
    this.brandTemplateId = brandTemplateId;
    return this;
  }

   /**
   * 品牌的模板id ONE_WITH_TWO：一拖二、DEFAULT：一拖四
   * @return brandTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "品牌的模板id ONE_WITH_TWO：一拖二、DEFAULT：一拖四")

  public String getBrandTemplateId() {
    return brandTemplateId;
  }


  public void setBrandTemplateId(String brandTemplateId) {
    this.brandTemplateId = brandTemplateId;
  }


  public ApplyOrderData createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-16 12:32:40", value = "创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ApplyOrderData isOldData(Boolean isOldData) {
    
    this.isOldData = isOldData;
    return this;
  }

   /**
   * 标识老工单
   * @return isOldData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "标识老工单")

  public Boolean getIsOldData() {
    return isOldData;
  }


  public void setIsOldData(Boolean isOldData) {
    this.isOldData = isOldData;
  }


  public ApplyOrderData latest(Boolean latest) {
    
    this.latest = latest;
    return this;
  }

   /**
   * 是不是最新的工单
   * @return latest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是不是最新的工单")

  public Boolean getLatest() {
    return latest;
  }


  public void setLatest(Boolean latest) {
    this.latest = latest;
  }


  public ApplyOrderData majorStatus(String majorStatus) {
    
    this.majorStatus = majorStatus;
    return this;
  }

   /**
   * 服务主状态,INITIAL:初始化；VALID：已生效；INVALID：已失效
   * @return majorStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INITIAL", value = "服务主状态,INITIAL:初始化；VALID：已生效；INVALID：已失效")

  public String getMajorStatus() {
    return majorStatus;
  }


  public void setMajorStatus(String majorStatus) {
    this.majorStatus = majorStatus;
  }


  public ApplyOrderData orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 申请单ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AP20200212100002488", value = "申请单ID")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public ApplyOrderData partAgreeInfo(List<SearchPartAgreeInfo> partAgreeInfo) {
    
    this.partAgreeInfo = partAgreeInfo;
    return this;
  }

  public ApplyOrderData addPartAgreeInfoItem(SearchPartAgreeInfo partAgreeInfoItem) {
    if (this.partAgreeInfo == null) {
      this.partAgreeInfo = new ArrayList<>();
    }
    this.partAgreeInfo.add(partAgreeInfoItem);
    return this;
  }

   /**
   * 审核提效部分剔除数据的信息
   * @return partAgreeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "审核提效部分剔除数据的信息")

  public List<SearchPartAgreeInfo> getPartAgreeInfo() {
    return partAgreeInfo;
  }


  public void setPartAgreeInfo(List<SearchPartAgreeInfo> partAgreeInfo) {
    this.partAgreeInfo = partAgreeInfo;
  }


  public ApplyOrderData sceneCode(String sceneCode) {
    
    this.sceneCode = sceneCode;
    return this;
  }

   /**
   * 场景编码
   * @return sceneCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HOT_WORD_RANKING", value = "场景编码")

  public String getSceneCode() {
    return sceneCode;
  }


  public void setSceneCode(String sceneCode) {
    this.sceneCode = sceneCode;
  }


  public ApplyOrderData sceneName(String sceneName) {
    
    this.sceneName = sceneName;
    return this;
  }

   /**
   * 场景名称
   * @return sceneName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "场景名称", value = "场景名称")

  public String getSceneName() {
    return sceneName;
  }


  public void setSceneName(String sceneName) {
    this.sceneName = sceneName;
  }


  public ApplyOrderData serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 服务码
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019121121000102523089", value = "服务码")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public ApplyOrderData status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 申请状态 AGREE、REJECT、EDIT、AUDIT
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AGREE", value = "申请状态 AGREE、REJECT、EDIT、AUDIT")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ApplyOrderData subServiceName(String subServiceName) {
    
    this.subServiceName = subServiceName;
    return this;
  }

   /**
   * 子服务名称
   * @return subServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "子服务名称", value = "子服务名称")

  public String getSubServiceName() {
    return subServiceName;
  }


  public void setSubServiceName(String subServiceName) {
    this.subServiceName = subServiceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyOrderData applyOrderData = (ApplyOrderData) o;
    return Objects.equals(this.accessType, applyOrderData.accessType) &&
        Objects.equals(this.appName, applyOrderData.appName) &&
        Objects.equals(this.appid, applyOrderData.appid) &&
        Objects.equals(this.auditReason, applyOrderData.auditReason) &&
        Objects.equals(this.brandTemplateId, applyOrderData.brandTemplateId) &&
        Objects.equals(this.createTime, applyOrderData.createTime) &&
        Objects.equals(this.isOldData, applyOrderData.isOldData) &&
        Objects.equals(this.latest, applyOrderData.latest) &&
        Objects.equals(this.majorStatus, applyOrderData.majorStatus) &&
        Objects.equals(this.orderId, applyOrderData.orderId) &&
        Objects.equals(this.partAgreeInfo, applyOrderData.partAgreeInfo) &&
        Objects.equals(this.sceneCode, applyOrderData.sceneCode) &&
        Objects.equals(this.sceneName, applyOrderData.sceneName) &&
        Objects.equals(this.serviceCode, applyOrderData.serviceCode) &&
        Objects.equals(this.status, applyOrderData.status) &&
        Objects.equals(this.subServiceName, applyOrderData.subServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, appName, appid, auditReason, brandTemplateId, createTime, isOldData, latest, majorStatus, orderId, partAgreeInfo, sceneCode, sceneName, serviceCode, status, subServiceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyOrderData {\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    auditReason: ").append(toIndentedString(auditReason)).append("\n");
    sb.append("    brandTemplateId: ").append(toIndentedString(brandTemplateId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    isOldData: ").append(toIndentedString(isOldData)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    majorStatus: ").append(toIndentedString(majorStatus)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    partAgreeInfo: ").append(toIndentedString(partAgreeInfo)).append("\n");
    sb.append("    sceneCode: ").append(toIndentedString(sceneCode)).append("\n");
    sb.append("    sceneName: ").append(toIndentedString(sceneName)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subServiceName: ").append(toIndentedString(subServiceName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("access_type");
    openapiFields.add("app_name");
    openapiFields.add("appid");
    openapiFields.add("audit_reason");
    openapiFields.add("brand_template_id");
    openapiFields.add("create_time");
    openapiFields.add("is_old_data");
    openapiFields.add("latest");
    openapiFields.add("major_status");
    openapiFields.add("order_id");
    openapiFields.add("part_agree_info");
    openapiFields.add("scene_code");
    openapiFields.add("scene_name");
    openapiFields.add("service_code");
    openapiFields.add("status");
    openapiFields.add("sub_service_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplyOrderData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApplyOrderData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplyOrderData is not found in the empty JSON string", ApplyOrderData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplyOrderData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplyOrderData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("access_type") != null && !jsonObj.get("access_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_type").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("appid") != null && !jsonObj.get("appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appid").toString()));
      }
      if (jsonObj.get("audit_reason") != null && !jsonObj.get("audit_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_reason").toString()));
      }
      if (jsonObj.get("brand_template_id") != null && !jsonObj.get("brand_template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_template_id").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("major_status") != null && !jsonObj.get("major_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `major_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("major_status").toString()));
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      JsonArray jsonArraypartAgreeInfo = jsonObj.getAsJsonArray("part_agree_info");
      if (jsonArraypartAgreeInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("part_agree_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `part_agree_info` to be an array in the JSON string but got `%s`", jsonObj.get("part_agree_info").toString()));
        }

        // validate the optional field `part_agree_info` (array)
        for (int i = 0; i < jsonArraypartAgreeInfo.size(); i++) {
          SearchPartAgreeInfo.validateJsonObject(jsonArraypartAgreeInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("scene_code") != null && !jsonObj.get("scene_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_code").toString()));
      }
      if (jsonObj.get("scene_name") != null && !jsonObj.get("scene_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_name").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("sub_service_name") != null && !jsonObj.get("sub_service_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_service_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_service_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplyOrderData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplyOrderData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplyOrderData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplyOrderData.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplyOrderData>() {
           @Override
           public void write(JsonWriter out, ApplyOrderData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplyOrderData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplyOrderData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplyOrderData
  * @throws IOException if the JSON string is invalid with respect to ApplyOrderData
  */
  public static ApplyOrderData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplyOrderData.class);
  }

 /**
  * Convert an instance of ApplyOrderData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

