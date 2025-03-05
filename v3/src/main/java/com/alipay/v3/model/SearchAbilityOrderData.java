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


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.SearchAbilityOrderInfoOpenApi;
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
 * SearchAbilityOrderData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchAbilityOrderData {
  public static final String SERIALIZED_NAME_ACCESS_TYPE = "access_type";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private String accessType;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_STATUS = "app_status";
  @SerializedName(SERIALIZED_NAME_APP_STATUS)
  private String appStatus;

  public static final String SERIALIZED_NAME_APPID = "appid";
  @SerializedName(SERIALIZED_NAME_APPID)
  private String appid;

  public static final String SERIALIZED_NAME_APPLY_ID = "apply_id";
  @SerializedName(SERIALIZED_NAME_APPLY_ID)
  private String applyId;

  public static final String SERIALIZED_NAME_APPLY_TYPE = "apply_type";
  @SerializedName(SERIALIZED_NAME_APPLY_TYPE)
  private String applyType;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private String auditStatus;

  public static final String SERIALIZED_NAME_BIZ_ID = "biz_id";
  @SerializedName(SERIALIZED_NAME_BIZ_ID)
  private String bizId;

  public static final String SERIALIZED_NAME_BOX_STATUS = "box_status";
  @SerializedName(SERIALIZED_NAME_BOX_STATUS)
  private String boxStatus;

  public static final String SERIALIZED_NAME_BRAND_TEMPLATE_ID = "brand_template_id";
  @SerializedName(SERIALIZED_NAME_BRAND_TEMPLATE_ID)
  private String brandTemplateId;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<SearchAbilityOrderInfoOpenApi> children = null;

  public static final String SERIALIZED_NAME_DATA_KEY = "data_key";
  @SerializedName(SERIALIZED_NAME_DATA_KEY)
  private String dataKey;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_OLD_DATA = "is_old_data";
  @SerializedName(SERIALIZED_NAME_IS_OLD_DATA)
  private String isOldData;

  public static final String SERIALIZED_NAME_MAJOR_STATUS = "major_status";
  @SerializedName(SERIALIZED_NAME_MAJOR_STATUS)
  private String majorStatus;

  public static final String SERIALIZED_NAME_ONLINE_TIME = "online_time";
  @SerializedName(SERIALIZED_NAME_ONLINE_TIME)
  private String onlineTime;

  public static final String SERIALIZED_NAME_OPEN_STATUS = "open_status";
  @SerializedName(SERIALIZED_NAME_OPEN_STATUS)
  private Boolean openStatus;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason;

  public static final String SERIALIZED_NAME_SCENE_CODE = "scene_code";
  @SerializedName(SERIALIZED_NAME_SCENE_CODE)
  private String sceneCode;

  public static final String SERIALIZED_NAME_SCENE_NAME = "scene_name";
  @SerializedName(SERIALIZED_NAME_SCENE_NAME)
  private String sceneName;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_SUB_SERVICE_DESC = "sub_service_desc";
  @SerializedName(SERIALIZED_NAME_SUB_SERVICE_DESC)
  private String subServiceDesc;

  public static final String SERIALIZED_NAME_SUB_SERVICE_NAME = "sub_service_name";
  @SerializedName(SERIALIZED_NAME_SUB_SERVICE_NAME)
  private String subServiceName;

  public SearchAbilityOrderData() { 
  }

  public SearchAbilityOrderData accessType(String accessType) {
    
    this.accessType = accessType;
    return this;
  }

   /**
   * 申请单类型
   * @return accessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BRAND_BOX", value = "申请单类型")

  public String getAccessType() {
    return accessType;
  }


  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }


  public SearchAbilityOrderData appName(String appName) {
    
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


  public SearchAbilityOrderData appStatus(String appStatus) {
    
    this.appStatus = appStatus;
    return this;
  }

   /**
   * 小程序状态 ON_LINE、OFF_LINE
   * @return appStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ON_LINE", value = "小程序状态 ON_LINE、OFF_LINE")

  public String getAppStatus() {
    return appStatus;
  }


  public void setAppStatus(String appStatus) {
    this.appStatus = appStatus;
  }


  public SearchAbilityOrderData appid(String appid) {
    
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


  public SearchAbilityOrderData applyId(String applyId) {
    
    this.applyId = applyId;
    return this;
  }

   /**
   * 申请单id
   * @return applyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AP20200212100002488", value = "申请单id")

  public String getApplyId() {
    return applyId;
  }


  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }


  public SearchAbilityOrderData applyType(String applyType) {
    
    this.applyType = applyType;
    return this;
  }

   /**
   * 申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
   * @return applyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BRAND_BOX", value = "申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达")

  public String getApplyType() {
    return applyType;
  }


  public void setApplyType(String applyType) {
    this.applyType = applyType;
  }


  public SearchAbilityOrderData auditStatus(String auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * 申请状态 AGREE、REJECT、EDIT、AUDIT
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AGREE", value = "申请状态 AGREE、REJECT、EDIT、AUDIT")

  public String getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
  }


  public SearchAbilityOrderData bizId(String bizId) {
    
    this.bizId = bizId;
    return this;
  }

   /**
   * bizId 为品牌box的boxID
   * @return bizId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C100038430_2019042421000001069599_FUNCTION", value = "bizId 为品牌box的boxID")

  public String getBizId() {
    return bizId;
  }


  public void setBizId(String bizId) {
    this.bizId = bizId;
  }


  public SearchAbilityOrderData boxStatus(String boxStatus) {
    
    this.boxStatus = boxStatus;
    return this;
  }

   /**
   * 品牌box的上下架状态 ONLINE OFFLINE
   * @return boxStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ONLINE", value = "品牌box的上下架状态 ONLINE OFFLINE")

  public String getBoxStatus() {
    return boxStatus;
  }


  public void setBoxStatus(String boxStatus) {
    this.boxStatus = boxStatus;
  }


  public SearchAbilityOrderData brandTemplateId(String brandTemplateId) {
    
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


  public SearchAbilityOrderData children(List<SearchAbilityOrderInfoOpenApi> children) {
    
    this.children = children;
    return this;
  }

  public SearchAbilityOrderData addChildrenItem(SearchAbilityOrderInfoOpenApi childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * 二级服务信息
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "二级服务信息")

  public List<SearchAbilityOrderInfoOpenApi> getChildren() {
    return children;
  }


  public void setChildren(List<SearchAbilityOrderInfoOpenApi> children) {
    this.children = children;
  }


  public SearchAbilityOrderData dataKey(String dataKey) {
    
    this.dataKey = dataKey;
    return this;
  }

   /**
   * 二级服务的唯一标识
   * @return dataKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019042421000001069599", value = "二级服务的唯一标识")

  public String getDataKey() {
    return dataKey;
  }


  public void setDataKey(String dataKey) {
    this.dataKey = dataKey;
  }


  public SearchAbilityOrderData gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 更新时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-16 12:00:21", value = "更新时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public SearchAbilityOrderData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 服务的唯一标识（优先使用serviceCode可忽略）
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3131231", value = "服务的唯一标识（优先使用serviceCode可忽略）")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SearchAbilityOrderData isOldData(String isOldData) {
    
    this.isOldData = isOldData;
    return this;
  }

   /**
   * 是否是老工单
   * @return isOldData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是否是老工单")

  public String getIsOldData() {
    return isOldData;
  }


  public void setIsOldData(String isOldData) {
    this.isOldData = isOldData;
  }


  public SearchAbilityOrderData majorStatus(String majorStatus) {
    
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


  public SearchAbilityOrderData onlineTime(String onlineTime) {
    
    this.onlineTime = onlineTime;
    return this;
  }

   /**
   * 上架时间
   * @return onlineTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-10 12:32:31", value = "上架时间")

  public String getOnlineTime() {
    return onlineTime;
  }


  public void setOnlineTime(String onlineTime) {
    this.onlineTime = onlineTime;
  }


  public SearchAbilityOrderData openStatus(Boolean openStatus) {
    
    this.openStatus = openStatus;
    return this;
  }

   /**
   * 服务的可见性状态
   * @return openStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "服务的可见性状态")

  public Boolean getOpenStatus() {
    return openStatus;
  }


  public void setOpenStatus(Boolean openStatus) {
    this.openStatus = openStatus;
  }


  public SearchAbilityOrderData operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 下架操作者
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20881231231", value = "下架操作者")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public SearchAbilityOrderData rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 驳回原因
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "驳回原因", value = "驳回原因")

  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public SearchAbilityOrderData sceneCode(String sceneCode) {
    
    this.sceneCode = sceneCode;
    return this;
  }

   /**
   * 场景码
   * @return sceneCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HOT_WORD_RANKING", value = "场景码")

  public String getSceneCode() {
    return sceneCode;
  }


  public void setSceneCode(String sceneCode) {
    this.sceneCode = sceneCode;
  }


  public SearchAbilityOrderData sceneName(String sceneName) {
    
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


  public SearchAbilityOrderData serviceCode(String serviceCode) {
    
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


  public SearchAbilityOrderData subServiceDesc(String subServiceDesc) {
    
    this.subServiceDesc = subServiceDesc;
    return this;
  }

   /**
   * 子功能描述
   * @return subServiceDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "子功能描述", value = "子功能描述")

  public String getSubServiceDesc() {
    return subServiceDesc;
  }


  public void setSubServiceDesc(String subServiceDesc) {
    this.subServiceDesc = subServiceDesc;
  }


  public SearchAbilityOrderData subServiceName(String subServiceName) {
    
    this.subServiceName = subServiceName;
    return this;
  }

   /**
   * 子功能名称
   * @return subServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "子功能名称", value = "子功能名称")

  public String getSubServiceName() {
    return subServiceName;
  }


  public void setSubServiceName(String subServiceName) {
    this.subServiceName = subServiceName;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SearchAbilityOrderData instance itself
   */
  public SearchAbilityOrderData putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAbilityOrderData searchAbilityOrderData = (SearchAbilityOrderData) o;
    return Objects.equals(this.accessType, searchAbilityOrderData.accessType) &&
        Objects.equals(this.appName, searchAbilityOrderData.appName) &&
        Objects.equals(this.appStatus, searchAbilityOrderData.appStatus) &&
        Objects.equals(this.appid, searchAbilityOrderData.appid) &&
        Objects.equals(this.applyId, searchAbilityOrderData.applyId) &&
        Objects.equals(this.applyType, searchAbilityOrderData.applyType) &&
        Objects.equals(this.auditStatus, searchAbilityOrderData.auditStatus) &&
        Objects.equals(this.bizId, searchAbilityOrderData.bizId) &&
        Objects.equals(this.boxStatus, searchAbilityOrderData.boxStatus) &&
        Objects.equals(this.brandTemplateId, searchAbilityOrderData.brandTemplateId) &&
        Objects.equals(this.children, searchAbilityOrderData.children) &&
        Objects.equals(this.dataKey, searchAbilityOrderData.dataKey) &&
        Objects.equals(this.gmtModified, searchAbilityOrderData.gmtModified) &&
        Objects.equals(this.id, searchAbilityOrderData.id) &&
        Objects.equals(this.isOldData, searchAbilityOrderData.isOldData) &&
        Objects.equals(this.majorStatus, searchAbilityOrderData.majorStatus) &&
        Objects.equals(this.onlineTime, searchAbilityOrderData.onlineTime) &&
        Objects.equals(this.openStatus, searchAbilityOrderData.openStatus) &&
        Objects.equals(this.operator, searchAbilityOrderData.operator) &&
        Objects.equals(this.rejectReason, searchAbilityOrderData.rejectReason) &&
        Objects.equals(this.sceneCode, searchAbilityOrderData.sceneCode) &&
        Objects.equals(this.sceneName, searchAbilityOrderData.sceneName) &&
        Objects.equals(this.serviceCode, searchAbilityOrderData.serviceCode) &&
        Objects.equals(this.subServiceDesc, searchAbilityOrderData.subServiceDesc) &&
        Objects.equals(this.subServiceName, searchAbilityOrderData.subServiceName)&&
        Objects.equals(this.additionalProperties, searchAbilityOrderData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, appName, appStatus, appid, applyId, applyType, auditStatus, bizId, boxStatus, brandTemplateId, children, dataKey, gmtModified, id, isOldData, majorStatus, onlineTime, openStatus, operator, rejectReason, sceneCode, sceneName, serviceCode, subServiceDesc, subServiceName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAbilityOrderData {\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appStatus: ").append(toIndentedString(appStatus)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    applyId: ").append(toIndentedString(applyId)).append("\n");
    sb.append("    applyType: ").append(toIndentedString(applyType)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
    sb.append("    boxStatus: ").append(toIndentedString(boxStatus)).append("\n");
    sb.append("    brandTemplateId: ").append(toIndentedString(brandTemplateId)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    dataKey: ").append(toIndentedString(dataKey)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isOldData: ").append(toIndentedString(isOldData)).append("\n");
    sb.append("    majorStatus: ").append(toIndentedString(majorStatus)).append("\n");
    sb.append("    onlineTime: ").append(toIndentedString(onlineTime)).append("\n");
    sb.append("    openStatus: ").append(toIndentedString(openStatus)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    sceneCode: ").append(toIndentedString(sceneCode)).append("\n");
    sb.append("    sceneName: ").append(toIndentedString(sceneName)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    subServiceDesc: ").append(toIndentedString(subServiceDesc)).append("\n");
    sb.append("    subServiceName: ").append(toIndentedString(subServiceName)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("app_status");
    openapiFields.add("appid");
    openapiFields.add("apply_id");
    openapiFields.add("apply_type");
    openapiFields.add("audit_status");
    openapiFields.add("biz_id");
    openapiFields.add("box_status");
    openapiFields.add("brand_template_id");
    openapiFields.add("children");
    openapiFields.add("data_key");
    openapiFields.add("gmt_modified");
    openapiFields.add("id");
    openapiFields.add("is_old_data");
    openapiFields.add("major_status");
    openapiFields.add("online_time");
    openapiFields.add("open_status");
    openapiFields.add("operator");
    openapiFields.add("reject_reason");
    openapiFields.add("scene_code");
    openapiFields.add("scene_name");
    openapiFields.add("service_code");
    openapiFields.add("sub_service_desc");
    openapiFields.add("sub_service_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchAbilityOrderData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchAbilityOrderData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchAbilityOrderData is not found in the empty JSON string", SearchAbilityOrderData.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("access_type") != null && !jsonObj.get("access_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_type").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_status") != null && !jsonObj.get("app_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_status").toString()));
      }
      if (jsonObj.get("appid") != null && !jsonObj.get("appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appid").toString()));
      }
      if (jsonObj.get("apply_id") != null && !jsonObj.get("apply_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_id").toString()));
      }
      if (jsonObj.get("apply_type") != null && !jsonObj.get("apply_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_type").toString()));
      }
      if (jsonObj.get("audit_status") != null && !jsonObj.get("audit_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_status").toString()));
      }
      if (jsonObj.get("biz_id") != null && !jsonObj.get("biz_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_id").toString()));
      }
      if (jsonObj.get("box_status") != null && !jsonObj.get("box_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_status").toString()));
      }
      if (jsonObj.get("brand_template_id") != null && !jsonObj.get("brand_template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_template_id").toString()));
      }
      JsonArray jsonArraychildren = jsonObj.getAsJsonArray("children");
      if (jsonArraychildren != null) {
        // ensure the json data is an array
        if (!jsonObj.get("children").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
        }

        // validate the optional field `children` (array)
        for (int i = 0; i < jsonArraychildren.size(); i++) {
          SearchAbilityOrderInfoOpenApi.validateJsonObject(jsonArraychildren.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("data_key") != null && !jsonObj.get("data_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_key").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("is_old_data") != null && !jsonObj.get("is_old_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_old_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_old_data").toString()));
      }
      if (jsonObj.get("major_status") != null && !jsonObj.get("major_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `major_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("major_status").toString()));
      }
      if (jsonObj.get("online_time") != null && !jsonObj.get("online_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `online_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("online_time").toString()));
      }
      if (jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      if (jsonObj.get("reject_reason") != null && !jsonObj.get("reject_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reject_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reject_reason").toString()));
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
      if (jsonObj.get("sub_service_desc") != null && !jsonObj.get("sub_service_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_service_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_service_desc").toString()));
      }
      if (jsonObj.get("sub_service_name") != null && !jsonObj.get("sub_service_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_service_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_service_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchAbilityOrderData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchAbilityOrderData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchAbilityOrderData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchAbilityOrderData.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchAbilityOrderData>() {
           @Override
           public void write(JsonWriter out, SearchAbilityOrderData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchAbilityOrderData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchAbilityOrderData instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchAbilityOrderData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchAbilityOrderData
  * @throws IOException if the JSON string is invalid with respect to SearchAbilityOrderData
  */
  public static SearchAbilityOrderData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchAbilityOrderData.class);
  }

 /**
  * Convert an instance of SearchAbilityOrderData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

