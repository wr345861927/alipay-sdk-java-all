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


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.ActivityBaseInfo;
import com.alipay.v3.model.CommonVoucherDisplayLiteInfo;
import com.alipay.v3.model.CommonVoucherUseRuleLiteInfo;
import com.alipay.v3.model.UserVoucherBaseInfo;
import com.alipay.v3.model.VoucherAvailableScopeInfo;
import com.alipay.v3.model.VoucherCustomerGuideInfo;
import com.alipay.v3.model.VoucherDeductInfo;
import com.alipay.v3.model.VoucherDisplayPatternInfo;
import com.alipay.v3.model.VoucherSendModeInfo;
import com.alipay.v3.model.VoucherUseRuleInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * UserVoucherInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserVoucherInfo {
  public static final String SERIALIZED_NAME_ACTIVITY_BASE_INFO = "activity_base_info";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_BASE_INFO)
  private ActivityBaseInfo activityBaseInfo;

  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_AVAILABLE_BEGIN_TIME = "available_begin_time";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BEGIN_TIME)
  private String availableBeginTime;

  public static final String SERIALIZED_NAME_AVAILABLE_END_TIME = "available_end_time";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_END_TIME)
  private String availableEndTime;

  public static final String SERIALIZED_NAME_BELONG_MERCHANT_ID = "belong_merchant_id";
  @SerializedName(SERIALIZED_NAME_BELONG_MERCHANT_ID)
  private String belongMerchantId;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_USER_VOUCHER_BASE_INFO = "user_voucher_base_info";
  @SerializedName(SERIALIZED_NAME_USER_VOUCHER_BASE_INFO)
  private UserVoucherBaseInfo userVoucherBaseInfo;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO = "voucher_available_scope_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO)
  private VoucherAvailableScopeInfo voucherAvailableScopeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_CUSTOMER_GUIDE_INFO = "voucher_customer_guide_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CUSTOMER_GUIDE_INFO)
  private VoucherCustomerGuideInfo voucherCustomerGuideInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DEDUCT_INFO = "voucher_deduct_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DEDUCT_INFO)
  private VoucherDeductInfo voucherDeductInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_LITE_INFO = "voucher_display_lite_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_LITE_INFO)
  private CommonVoucherDisplayLiteInfo voucherDisplayLiteInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO = "voucher_display_pattern_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO)
  private VoucherDisplayPatternInfo voucherDisplayPatternInfo;

  public static final String SERIALIZED_NAME_VOUCHER_ID = "voucher_id";
  @SerializedName(SERIALIZED_NAME_VOUCHER_ID)
  private String voucherId;

  public static final String SERIALIZED_NAME_VOUCHER_NAME = "voucher_name";
  @SerializedName(SERIALIZED_NAME_VOUCHER_NAME)
  private String voucherName;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO = "voucher_send_mode_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO)
  private VoucherSendModeInfo voucherSendModeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_STATUS = "voucher_status";
  @SerializedName(SERIALIZED_NAME_VOUCHER_STATUS)
  private String voucherStatus;

  public static final String SERIALIZED_NAME_VOUCHER_TYPE = "voucher_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TYPE)
  private String voucherType;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE_INFO = "voucher_use_rule_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE_INFO)
  private VoucherUseRuleInfo voucherUseRuleInfo;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE_LITE_INFO = "voucher_use_rule_lite_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE_LITE_INFO)
  private CommonVoucherUseRuleLiteInfo voucherUseRuleLiteInfo;

  public UserVoucherInfo() { 
  }

  public UserVoucherInfo activityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    
    this.activityBaseInfo = activityBaseInfo;
    return this;
  }

   /**
   * Get activityBaseInfo
   * @return activityBaseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActivityBaseInfo getActivityBaseInfo() {
    return activityBaseInfo;
  }


  public void setActivityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    this.activityBaseInfo = activityBaseInfo;
  }


  public UserVoucherInfo activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动id
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016042700826004508401111111", value = "活动id")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public UserVoucherInfo availableBeginTime(String availableBeginTime) {
    
    this.availableBeginTime = availableBeginTime;
    return this;
  }

   /**
   * 券可用开始时间。
   * @return availableBeginTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "券可用开始时间。")

  public String getAvailableBeginTime() {
    return availableBeginTime;
  }


  public void setAvailableBeginTime(String availableBeginTime) {
    this.availableBeginTime = availableBeginTime;
  }


  public UserVoucherInfo availableEndTime(String availableEndTime) {
    
    this.availableEndTime = availableEndTime;
    return this;
  }

   /**
   * 券可用结束时间。
   * @return availableEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "券可用结束时间。")

  public String getAvailableEndTime() {
    return availableEndTime;
  }


  public void setAvailableEndTime(String availableEndTime) {
    this.availableEndTime = availableEndTime;
  }


  public UserVoucherInfo belongMerchantId(String belongMerchantId) {
    
    this.belongMerchantId = belongMerchantId;
    return this;
  }

   /**
   * 归属商户PID
   * @return belongMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088202967380463", value = "归属商户PID")

  public String getBelongMerchantId() {
    return belongMerchantId;
  }


  public void setBelongMerchantId(String belongMerchantId) {
    this.belongMerchantId = belongMerchantId;
  }


  public UserVoucherInfo createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 用户领券时间。
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "用户领券时间。")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public UserVoucherInfo userVoucherBaseInfo(UserVoucherBaseInfo userVoucherBaseInfo) {
    
    this.userVoucherBaseInfo = userVoucherBaseInfo;
    return this;
  }

   /**
   * Get userVoucherBaseInfo
   * @return userVoucherBaseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserVoucherBaseInfo getUserVoucherBaseInfo() {
    return userVoucherBaseInfo;
  }


  public void setUserVoucherBaseInfo(UserVoucherBaseInfo userVoucherBaseInfo) {
    this.userVoucherBaseInfo = userVoucherBaseInfo;
  }


  public UserVoucherInfo voucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
    return this;
  }

   /**
   * Get voucherAvailableScopeInfo
   * @return voucherAvailableScopeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableScopeInfo getVoucherAvailableScopeInfo() {
    return voucherAvailableScopeInfo;
  }


  public void setVoucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
  }


  public UserVoucherInfo voucherCustomerGuideInfo(VoucherCustomerGuideInfo voucherCustomerGuideInfo) {
    
    this.voucherCustomerGuideInfo = voucherCustomerGuideInfo;
    return this;
  }

   /**
   * Get voucherCustomerGuideInfo
   * @return voucherCustomerGuideInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherCustomerGuideInfo getVoucherCustomerGuideInfo() {
    return voucherCustomerGuideInfo;
  }


  public void setVoucherCustomerGuideInfo(VoucherCustomerGuideInfo voucherCustomerGuideInfo) {
    this.voucherCustomerGuideInfo = voucherCustomerGuideInfo;
  }


  public UserVoucherInfo voucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
    
    this.voucherDeductInfo = voucherDeductInfo;
    return this;
  }

   /**
   * Get voucherDeductInfo
   * @return voucherDeductInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDeductInfo getVoucherDeductInfo() {
    return voucherDeductInfo;
  }


  public void setVoucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
    this.voucherDeductInfo = voucherDeductInfo;
  }


  public UserVoucherInfo voucherDisplayLiteInfo(CommonVoucherDisplayLiteInfo voucherDisplayLiteInfo) {
    
    this.voucherDisplayLiteInfo = voucherDisplayLiteInfo;
    return this;
  }

   /**
   * Get voucherDisplayLiteInfo
   * @return voucherDisplayLiteInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonVoucherDisplayLiteInfo getVoucherDisplayLiteInfo() {
    return voucherDisplayLiteInfo;
  }


  public void setVoucherDisplayLiteInfo(CommonVoucherDisplayLiteInfo voucherDisplayLiteInfo) {
    this.voucherDisplayLiteInfo = voucherDisplayLiteInfo;
  }


  public UserVoucherInfo voucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    
    this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
    return this;
  }

   /**
   * Get voucherDisplayPatternInfo
   * @return voucherDisplayPatternInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDisplayPatternInfo getVoucherDisplayPatternInfo() {
    return voucherDisplayPatternInfo;
  }


  public void setVoucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
  }


  public UserVoucherInfo voucherId(String voucherId) {
    
    this.voucherId = voucherId;
    return this;
  }

   /**
   * 用户券 id。支付宝为用户优惠券唯一分配的 id。
   * @return voucherId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021072900073002214009F8QHR3", value = "用户券 id。支付宝为用户优惠券唯一分配的 id。")

  public String getVoucherId() {
    return voucherId;
  }


  public void setVoucherId(String voucherId) {
    this.voucherId = voucherId;
  }


  public UserVoucherInfo voucherName(String voucherName) {
    
    this.voucherName = voucherName;
    return this;
  }

   /**
   * 对消费者展示的券(商品)名称。
   * @return voucherName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "满10减1", value = "对消费者展示的券(商品)名称。")

  public String getVoucherName() {
    return voucherName;
  }


  public void setVoucherName(String voucherName) {
    this.voucherName = voucherName;
  }


  public UserVoucherInfo voucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    
    this.voucherSendModeInfo = voucherSendModeInfo;
    return this;
  }

   /**
   * Get voucherSendModeInfo
   * @return voucherSendModeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSendModeInfo getVoucherSendModeInfo() {
    return voucherSendModeInfo;
  }


  public void setVoucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    this.voucherSendModeInfo = voucherSendModeInfo;
  }


  public UserVoucherInfo voucherStatus(String voucherStatus) {
    
    this.voucherStatus = voucherStatus;
    return this;
  }

   /**
   * 券状态。
   * @return voucherStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SENDED", value = "券状态。")

  public String getVoucherStatus() {
    return voucherStatus;
  }


  public void setVoucherStatus(String voucherStatus) {
    this.voucherStatus = voucherStatus;
  }


  public UserVoucherInfo voucherType(String voucherType) {
    
    this.voucherType = voucherType;
    return this;
  }

   /**
   * 券类型
   * @return voucherType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FIX_VOUCHER", value = "券类型")

  public String getVoucherType() {
    return voucherType;
  }


  public void setVoucherType(String voucherType) {
    this.voucherType = voucherType;
  }


  public UserVoucherInfo voucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    
    this.voucherUseRuleInfo = voucherUseRuleInfo;
    return this;
  }

   /**
   * Get voucherUseRuleInfo
   * @return voucherUseRuleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherUseRuleInfo getVoucherUseRuleInfo() {
    return voucherUseRuleInfo;
  }


  public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    this.voucherUseRuleInfo = voucherUseRuleInfo;
  }


  public UserVoucherInfo voucherUseRuleLiteInfo(CommonVoucherUseRuleLiteInfo voucherUseRuleLiteInfo) {
    
    this.voucherUseRuleLiteInfo = voucherUseRuleLiteInfo;
    return this;
  }

   /**
   * Get voucherUseRuleLiteInfo
   * @return voucherUseRuleLiteInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonVoucherUseRuleLiteInfo getVoucherUseRuleLiteInfo() {
    return voucherUseRuleLiteInfo;
  }


  public void setVoucherUseRuleLiteInfo(CommonVoucherUseRuleLiteInfo voucherUseRuleLiteInfo) {
    this.voucherUseRuleLiteInfo = voucherUseRuleLiteInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserVoucherInfo userVoucherInfo = (UserVoucherInfo) o;
    return Objects.equals(this.activityBaseInfo, userVoucherInfo.activityBaseInfo) &&
        Objects.equals(this.activityId, userVoucherInfo.activityId) &&
        Objects.equals(this.availableBeginTime, userVoucherInfo.availableBeginTime) &&
        Objects.equals(this.availableEndTime, userVoucherInfo.availableEndTime) &&
        Objects.equals(this.belongMerchantId, userVoucherInfo.belongMerchantId) &&
        Objects.equals(this.createTime, userVoucherInfo.createTime) &&
        Objects.equals(this.userVoucherBaseInfo, userVoucherInfo.userVoucherBaseInfo) &&
        Objects.equals(this.voucherAvailableScopeInfo, userVoucherInfo.voucherAvailableScopeInfo) &&
        Objects.equals(this.voucherCustomerGuideInfo, userVoucherInfo.voucherCustomerGuideInfo) &&
        Objects.equals(this.voucherDeductInfo, userVoucherInfo.voucherDeductInfo) &&
        Objects.equals(this.voucherDisplayLiteInfo, userVoucherInfo.voucherDisplayLiteInfo) &&
        Objects.equals(this.voucherDisplayPatternInfo, userVoucherInfo.voucherDisplayPatternInfo) &&
        Objects.equals(this.voucherId, userVoucherInfo.voucherId) &&
        Objects.equals(this.voucherName, userVoucherInfo.voucherName) &&
        Objects.equals(this.voucherSendModeInfo, userVoucherInfo.voucherSendModeInfo) &&
        Objects.equals(this.voucherStatus, userVoucherInfo.voucherStatus) &&
        Objects.equals(this.voucherType, userVoucherInfo.voucherType) &&
        Objects.equals(this.voucherUseRuleInfo, userVoucherInfo.voucherUseRuleInfo) &&
        Objects.equals(this.voucherUseRuleLiteInfo, userVoucherInfo.voucherUseRuleLiteInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityBaseInfo, activityId, availableBeginTime, availableEndTime, belongMerchantId, createTime, userVoucherBaseInfo, voucherAvailableScopeInfo, voucherCustomerGuideInfo, voucherDeductInfo, voucherDisplayLiteInfo, voucherDisplayPatternInfo, voucherId, voucherName, voucherSendModeInfo, voucherStatus, voucherType, voucherUseRuleInfo, voucherUseRuleLiteInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVoucherInfo {\n");
    sb.append("    activityBaseInfo: ").append(toIndentedString(activityBaseInfo)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    availableBeginTime: ").append(toIndentedString(availableBeginTime)).append("\n");
    sb.append("    availableEndTime: ").append(toIndentedString(availableEndTime)).append("\n");
    sb.append("    belongMerchantId: ").append(toIndentedString(belongMerchantId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    userVoucherBaseInfo: ").append(toIndentedString(userVoucherBaseInfo)).append("\n");
    sb.append("    voucherAvailableScopeInfo: ").append(toIndentedString(voucherAvailableScopeInfo)).append("\n");
    sb.append("    voucherCustomerGuideInfo: ").append(toIndentedString(voucherCustomerGuideInfo)).append("\n");
    sb.append("    voucherDeductInfo: ").append(toIndentedString(voucherDeductInfo)).append("\n");
    sb.append("    voucherDisplayLiteInfo: ").append(toIndentedString(voucherDisplayLiteInfo)).append("\n");
    sb.append("    voucherDisplayPatternInfo: ").append(toIndentedString(voucherDisplayPatternInfo)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
    sb.append("    voucherName: ").append(toIndentedString(voucherName)).append("\n");
    sb.append("    voucherSendModeInfo: ").append(toIndentedString(voucherSendModeInfo)).append("\n");
    sb.append("    voucherStatus: ").append(toIndentedString(voucherStatus)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
    sb.append("    voucherUseRuleInfo: ").append(toIndentedString(voucherUseRuleInfo)).append("\n");
    sb.append("    voucherUseRuleLiteInfo: ").append(toIndentedString(voucherUseRuleLiteInfo)).append("\n");
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
    openapiFields.add("activity_base_info");
    openapiFields.add("activity_id");
    openapiFields.add("available_begin_time");
    openapiFields.add("available_end_time");
    openapiFields.add("belong_merchant_id");
    openapiFields.add("create_time");
    openapiFields.add("user_voucher_base_info");
    openapiFields.add("voucher_available_scope_info");
    openapiFields.add("voucher_customer_guide_info");
    openapiFields.add("voucher_deduct_info");
    openapiFields.add("voucher_display_lite_info");
    openapiFields.add("voucher_display_pattern_info");
    openapiFields.add("voucher_id");
    openapiFields.add("voucher_name");
    openapiFields.add("voucher_send_mode_info");
    openapiFields.add("voucher_status");
    openapiFields.add("voucher_type");
    openapiFields.add("voucher_use_rule_info");
    openapiFields.add("voucher_use_rule_lite_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserVoucherInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserVoucherInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserVoucherInfo is not found in the empty JSON string", UserVoucherInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserVoucherInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserVoucherInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `activity_base_info`
      if (jsonObj.getAsJsonObject("activity_base_info") != null) {
        ActivityBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("activity_base_info"));
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      if (jsonObj.get("available_begin_time") != null && !jsonObj.get("available_begin_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_begin_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_begin_time").toString()));
      }
      if (jsonObj.get("available_end_time") != null && !jsonObj.get("available_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_end_time").toString()));
      }
      if (jsonObj.get("belong_merchant_id") != null && !jsonObj.get("belong_merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `belong_merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("belong_merchant_id").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      // validate the optional field `user_voucher_base_info`
      if (jsonObj.getAsJsonObject("user_voucher_base_info") != null) {
        UserVoucherBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("user_voucher_base_info"));
      }
      // validate the optional field `voucher_available_scope_info`
      if (jsonObj.getAsJsonObject("voucher_available_scope_info") != null) {
        VoucherAvailableScopeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_scope_info"));
      }
      // validate the optional field `voucher_customer_guide_info`
      if (jsonObj.getAsJsonObject("voucher_customer_guide_info") != null) {
        VoucherCustomerGuideInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_customer_guide_info"));
      }
      // validate the optional field `voucher_deduct_info`
      if (jsonObj.getAsJsonObject("voucher_deduct_info") != null) {
        VoucherDeductInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_deduct_info"));
      }
      // validate the optional field `voucher_display_lite_info`
      if (jsonObj.getAsJsonObject("voucher_display_lite_info") != null) {
        CommonVoucherDisplayLiteInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_lite_info"));
      }
      // validate the optional field `voucher_display_pattern_info`
      if (jsonObj.getAsJsonObject("voucher_display_pattern_info") != null) {
        VoucherDisplayPatternInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_pattern_info"));
      }
      if (jsonObj.get("voucher_id") != null && !jsonObj.get("voucher_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_id").toString()));
      }
      if (jsonObj.get("voucher_name") != null && !jsonObj.get("voucher_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_name").toString()));
      }
      // validate the optional field `voucher_send_mode_info`
      if (jsonObj.getAsJsonObject("voucher_send_mode_info") != null) {
        VoucherSendModeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_mode_info"));
      }
      if (jsonObj.get("voucher_status") != null && !jsonObj.get("voucher_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_status").toString()));
      }
      if (jsonObj.get("voucher_type") != null && !jsonObj.get("voucher_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_type").toString()));
      }
      // validate the optional field `voucher_use_rule_info`
      if (jsonObj.getAsJsonObject("voucher_use_rule_info") != null) {
        VoucherUseRuleInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule_info"));
      }
      // validate the optional field `voucher_use_rule_lite_info`
      if (jsonObj.getAsJsonObject("voucher_use_rule_lite_info") != null) {
        CommonVoucherUseRuleLiteInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule_lite_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserVoucherInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserVoucherInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserVoucherInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserVoucherInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<UserVoucherInfo>() {
           @Override
           public void write(JsonWriter out, UserVoucherInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserVoucherInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserVoucherInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserVoucherInfo
  * @throws IOException if the JSON string is invalid with respect to UserVoucherInfo
  */
  public static UserVoucherInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserVoucherInfo.class);
  }

 /**
  * Convert an instance of UserVoucherInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

