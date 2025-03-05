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
 * IssueRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IssueRuleInfo {
  public static final String SERIALIZED_NAME_EFFECTIVE_PERIOD = "effective_period";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_PERIOD)
  private String effectivePeriod;

  public static final String SERIALIZED_NAME_INVALID_MODE = "invalid_mode";
  @SerializedName(SERIALIZED_NAME_INVALID_MODE)
  private Integer invalidMode;

  public static final String SERIALIZED_NAME_INVALID_MODE_VALUE = "invalid_mode_value";
  @SerializedName(SERIALIZED_NAME_INVALID_MODE_VALUE)
  private String invalidModeValue;

  public static final String SERIALIZED_NAME_ISSUE_AMOUNT_VALUE = "issue_amount_value";
  @SerializedName(SERIALIZED_NAME_ISSUE_AMOUNT_VALUE)
  private String issueAmountValue;

  public static final String SERIALIZED_NAME_ISSUE_END_DATE = "issue_end_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_END_DATE)
  private String issueEndDate;

  public static final String SERIALIZED_NAME_ISSUE_RULE_ID = "issue_rule_id";
  @SerializedName(SERIALIZED_NAME_ISSUE_RULE_ID)
  private String issueRuleId;

  public static final String SERIALIZED_NAME_ISSUE_RULE_NAME = "issue_rule_name";
  @SerializedName(SERIALIZED_NAME_ISSUE_RULE_NAME)
  private String issueRuleName;

  public static final String SERIALIZED_NAME_ISSUE_START_DATE = "issue_start_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_START_DATE)
  private String issueStartDate;

  public static final String SERIALIZED_NAME_ISSUE_TYPE = "issue_type";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE)
  private String issueType;

  public static final String SERIALIZED_NAME_OUTER_SOURCE_ID = "outer_source_id";
  @SerializedName(SERIALIZED_NAME_OUTER_SOURCE_ID)
  private String outerSourceId;

  public static final String SERIALIZED_NAME_QUOTA_TYPE = "quota_type";
  @SerializedName(SERIALIZED_NAME_QUOTA_TYPE)
  private String quotaType;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private Integer shareMode;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public IssueRuleInfo() { 
  }

  public IssueRuleInfo effectivePeriod(String effectivePeriod) {
    
    this.effectivePeriod = effectivePeriod;
    return this;
  }

   /**
   * 生效时间段
   * @return effectivePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "生效时间段")

  public String getEffectivePeriod() {
    return effectivePeriod;
  }


  public void setEffectivePeriod(String effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
  }


  public IssueRuleInfo invalidMode(Integer invalidMode) {
    
    this.invalidMode = invalidMode;
    return this;
  }

   /**
   * 累计类型，默认为0 可选值：0（不可累计）、1（可累计）、2（累计天数）、3（累计到指定日期）
   * @return invalidMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "累计类型，默认为0 可选值：0（不可累计）、1（可累计）、2（累计天数）、3（累计到指定日期）")

  public Integer getInvalidMode() {
    return invalidMode;
  }


  public void setInvalidMode(Integer invalidMode) {
    this.invalidMode = invalidMode;
  }


  public IssueRuleInfo invalidModeValue(String invalidModeValue) {
    
    this.invalidModeValue = invalidModeValue;
    return this;
  }

   /**
   * 累计类型值
   * @return invalidModeValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "累计类型值")

  public String getInvalidModeValue() {
    return invalidModeValue;
  }


  public void setInvalidModeValue(String invalidModeValue) {
    this.invalidModeValue = invalidModeValue;
  }


  public IssueRuleInfo issueAmountValue(String issueAmountValue) {
    
    this.issueAmountValue = issueAmountValue;
    return this;
  }

   /**
   * 发放金额，单位元
   * @return issueAmountValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发放金额，单位元")

  public String getIssueAmountValue() {
    return issueAmountValue;
  }


  public void setIssueAmountValue(String issueAmountValue) {
    this.issueAmountValue = issueAmountValue;
  }


  public IssueRuleInfo issueEndDate(String issueEndDate) {
    
    this.issueEndDate = issueEndDate;
    return this;
  }

   /**
   * 发放规则有效结束时间
   * @return issueEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发放规则有效结束时间")

  public String getIssueEndDate() {
    return issueEndDate;
  }


  public void setIssueEndDate(String issueEndDate) {
    this.issueEndDate = issueEndDate;
  }


  public IssueRuleInfo issueRuleId(String issueRuleId) {
    
    this.issueRuleId = issueRuleId;
    return this;
  }

   /**
   * 发放规则id
   * @return issueRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发放规则id")

  public String getIssueRuleId() {
    return issueRuleId;
  }


  public void setIssueRuleId(String issueRuleId) {
    this.issueRuleId = issueRuleId;
  }


  public IssueRuleInfo issueRuleName(String issueRuleName) {
    
    this.issueRuleName = issueRuleName;
    return this;
  }

   /**
   * 发放规则名称
   * @return issueRuleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发放规则名称")

  public String getIssueRuleName() {
    return issueRuleName;
  }


  public void setIssueRuleName(String issueRuleName) {
    this.issueRuleName = issueRuleName;
  }


  public IssueRuleInfo issueStartDate(String issueStartDate) {
    
    this.issueStartDate = issueStartDate;
    return this;
  }

   /**
   * 发放规则有效起始时间
   * @return issueStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发放规则有效起始时间")

  public String getIssueStartDate() {
    return issueStartDate;
  }


  public void setIssueStartDate(String issueStartDate) {
    this.issueStartDate = issueStartDate;
  }


  public IssueRuleInfo issueType(String issueType) {
    
    this.issueType = issueType;
    return this;
  }

   /**
   * 发放类型
   * @return issueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发放类型")

  public String getIssueType() {
    return issueType;
  }


  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }


  public IssueRuleInfo outerSourceId(String outerSourceId) {
    
    this.outerSourceId = outerSourceId;
    return this;
  }

   /**
   * 外部发放规则id
   * @return outerSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外部发放规则id")

  public String getOuterSourceId() {
    return outerSourceId;
  }


  public void setOuterSourceId(String outerSourceId) {
    this.outerSourceId = outerSourceId;
  }


  public IssueRuleInfo quotaType(String quotaType) {
    
    this.quotaType = quotaType;
    return this;
  }

   /**
   * 额度类型
   * @return quotaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "额度类型")

  public String getQuotaType() {
    return quotaType;
  }


  public void setQuotaType(String quotaType) {
    this.quotaType = quotaType;
  }


  public IssueRuleInfo shareMode(Integer shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * 是否可转赠
   * @return shareMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否可转赠")

  public Integer getShareMode() {
    return shareMode;
  }


  public void setShareMode(Integer shareMode) {
    this.shareMode = shareMode;
  }


  public IssueRuleInfo targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 目标id
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "目标id")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public IssueRuleInfo targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * 发放规则归属的目标类型
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发放规则归属的目标类型")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
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
   * @return the IssueRuleInfo instance itself
   */
  public IssueRuleInfo putAdditionalProperty(String key, Object value) {
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
    IssueRuleInfo issueRuleInfo = (IssueRuleInfo) o;
    return Objects.equals(this.effectivePeriod, issueRuleInfo.effectivePeriod) &&
        Objects.equals(this.invalidMode, issueRuleInfo.invalidMode) &&
        Objects.equals(this.invalidModeValue, issueRuleInfo.invalidModeValue) &&
        Objects.equals(this.issueAmountValue, issueRuleInfo.issueAmountValue) &&
        Objects.equals(this.issueEndDate, issueRuleInfo.issueEndDate) &&
        Objects.equals(this.issueRuleId, issueRuleInfo.issueRuleId) &&
        Objects.equals(this.issueRuleName, issueRuleInfo.issueRuleName) &&
        Objects.equals(this.issueStartDate, issueRuleInfo.issueStartDate) &&
        Objects.equals(this.issueType, issueRuleInfo.issueType) &&
        Objects.equals(this.outerSourceId, issueRuleInfo.outerSourceId) &&
        Objects.equals(this.quotaType, issueRuleInfo.quotaType) &&
        Objects.equals(this.shareMode, issueRuleInfo.shareMode) &&
        Objects.equals(this.targetId, issueRuleInfo.targetId) &&
        Objects.equals(this.targetType, issueRuleInfo.targetType)&&
        Objects.equals(this.additionalProperties, issueRuleInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectivePeriod, invalidMode, invalidModeValue, issueAmountValue, issueEndDate, issueRuleId, issueRuleName, issueStartDate, issueType, outerSourceId, quotaType, shareMode, targetId, targetType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueRuleInfo {\n");
    sb.append("    effectivePeriod: ").append(toIndentedString(effectivePeriod)).append("\n");
    sb.append("    invalidMode: ").append(toIndentedString(invalidMode)).append("\n");
    sb.append("    invalidModeValue: ").append(toIndentedString(invalidModeValue)).append("\n");
    sb.append("    issueAmountValue: ").append(toIndentedString(issueAmountValue)).append("\n");
    sb.append("    issueEndDate: ").append(toIndentedString(issueEndDate)).append("\n");
    sb.append("    issueRuleId: ").append(toIndentedString(issueRuleId)).append("\n");
    sb.append("    issueRuleName: ").append(toIndentedString(issueRuleName)).append("\n");
    sb.append("    issueStartDate: ").append(toIndentedString(issueStartDate)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    outerSourceId: ").append(toIndentedString(outerSourceId)).append("\n");
    sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
    sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
    openapiFields.add("effective_period");
    openapiFields.add("invalid_mode");
    openapiFields.add("invalid_mode_value");
    openapiFields.add("issue_amount_value");
    openapiFields.add("issue_end_date");
    openapiFields.add("issue_rule_id");
    openapiFields.add("issue_rule_name");
    openapiFields.add("issue_start_date");
    openapiFields.add("issue_type");
    openapiFields.add("outer_source_id");
    openapiFields.add("quota_type");
    openapiFields.add("share_mode");
    openapiFields.add("target_id");
    openapiFields.add("target_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueRuleInfo is not found in the empty JSON string", IssueRuleInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("effective_period") != null && !jsonObj.get("effective_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_period").toString()));
      }
      if (jsonObj.get("invalid_mode_value") != null && !jsonObj.get("invalid_mode_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invalid_mode_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invalid_mode_value").toString()));
      }
      if (jsonObj.get("issue_amount_value") != null && !jsonObj.get("issue_amount_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_amount_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_amount_value").toString()));
      }
      if (jsonObj.get("issue_end_date") != null && !jsonObj.get("issue_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_end_date").toString()));
      }
      if (jsonObj.get("issue_rule_id") != null && !jsonObj.get("issue_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_rule_id").toString()));
      }
      if (jsonObj.get("issue_rule_name") != null && !jsonObj.get("issue_rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_rule_name").toString()));
      }
      if (jsonObj.get("issue_start_date") != null && !jsonObj.get("issue_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_start_date").toString()));
      }
      if (jsonObj.get("issue_type") != null && !jsonObj.get("issue_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_type").toString()));
      }
      if (jsonObj.get("outer_source_id") != null && !jsonObj.get("outer_source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outer_source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outer_source_id").toString()));
      }
      if (jsonObj.get("quota_type") != null && !jsonObj.get("quota_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_type").toString()));
      }
      if (jsonObj.get("target_id") != null && !jsonObj.get("target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_id").toString()));
      }
      if (jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueRuleInfo>() {
           @Override
           public void write(JsonWriter out, IssueRuleInfo value) throws IOException {
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
           public IssueRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IssueRuleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IssueRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueRuleInfo
  * @throws IOException if the JSON string is invalid with respect to IssueRuleInfo
  */
  public static IssueRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueRuleInfo.class);
  }

 /**
  * Convert an instance of IssueRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

