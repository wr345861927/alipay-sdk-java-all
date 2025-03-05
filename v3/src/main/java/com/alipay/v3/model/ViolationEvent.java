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
 * ViolationEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ViolationEvent {
  public static final String SERIALIZED_NAME_CAN_APPEAL = "can_appeal";
  @SerializedName(SERIALIZED_NAME_CAN_APPEAL)
  private Boolean canAppeal;

  public static final String SERIALIZED_NAME_CAN_RECTIFY = "can_rectify";
  @SerializedName(SERIALIZED_NAME_CAN_RECTIFY)
  private Boolean canRectify;

  public static final String SERIALIZED_NAME_PUNISH_ACTION = "punish_action";
  @SerializedName(SERIALIZED_NAME_PUNISH_ACTION)
  private String punishAction;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target_name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public static final String SERIALIZED_NAME_VIOLATION_RECORD_ID = "violation_record_id";
  @SerializedName(SERIALIZED_NAME_VIOLATION_RECORD_ID)
  private String violationRecordId;

  public static final String SERIALIZED_NAME_VIOLATION_TIME = "violation_time";
  @SerializedName(SERIALIZED_NAME_VIOLATION_TIME)
  private String violationTime;

  public static final String SERIALIZED_NAME_VIOLATION_TYPE = "violation_type";
  @SerializedName(SERIALIZED_NAME_VIOLATION_TYPE)
  private String violationType;

  public ViolationEvent() { 
  }

  public ViolationEvent canAppeal(Boolean canAppeal) {
    
    this.canAppeal = canAppeal;
    return this;
  }

   /**
   * 商家是否可以申诉
   * @return canAppeal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "商家是否可以申诉")

  public Boolean getCanAppeal() {
    return canAppeal;
  }


  public void setCanAppeal(Boolean canAppeal) {
    this.canAppeal = canAppeal;
  }


  public ViolationEvent canRectify(Boolean canRectify) {
    
    this.canRectify = canRectify;
    return this;
  }

   /**
   * 商家是否可以整改
   * @return canRectify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "商家是否可以整改")

  public Boolean getCanRectify() {
    return canRectify;
  }


  public void setCanRectify(Boolean canRectify) {
    this.canRectify = canRectify;
  }


  public ViolationEvent punishAction(String punishAction) {
    
    this.punishAction = punishAction;
    return this;
  }

   /**
   * 处罚动作及有效期
   * @return punishAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[ \"警告_2020-02-14 14:23:12-2020-03-14 14:23:12\",\"小程序应用下架_2020-02-14 14:23:12-2020-03-14 14:23:12\"]", value = "处罚动作及有效期")

  public String getPunishAction() {
    return punishAction;
  }


  public void setPunishAction(String punishAction) {
    this.punishAction = punishAction;
  }


  public ViolationEvent status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 违规工单状态枚举
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUNISH_DONE", value = "违规工单状态枚举")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ViolationEvent targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 违规对象ID
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022000000000011", value = "违规对象ID")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public ViolationEvent targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * 违规对象名称
   * @return targetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx测试小程序", value = "违规对象名称")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public ViolationEvent targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * 违规对象类型 小程序ID:APPID  生活号ID:PUBLICID
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPID", value = "违规对象类型 小程序ID:APPID  生活号ID:PUBLICID")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }


  public ViolationEvent violationRecordId(String violationRecordId) {
    
    this.violationRecordId = violationRecordId;
    return this;
  }

   /**
   * 支付宝侧生成的违规记录唯一标识
   * @return violationRecordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220524001020000000000001", value = "支付宝侧生成的违规记录唯一标识")

  public String getViolationRecordId() {
    return violationRecordId;
  }


  public void setViolationRecordId(String violationRecordId) {
    this.violationRecordId = violationRecordId;
  }


  public ViolationEvent violationTime(String violationTime) {
    
    this.violationTime = violationTime;
    return this;
  }

   /**
   * 违规时间，格式为 yyyy-MM-dd HH:mm:ss
   * @return violationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 00:00:01", value = "违规时间，格式为 yyyy-MM-dd HH:mm:ss")

  public String getViolationTime() {
    return violationTime;
  }


  public void setViolationTime(String violationTime) {
    this.violationTime = violationTime;
  }


  public ViolationEvent violationType(String violationType) {
    
    this.violationType = violationType;
    return this;
  }

   /**
   * 即平台依据平台规范/规则，判定商户的违规类型
   * @return violationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "数据和系统安全/敏感参数泄露风险", value = "即平台依据平台规范/规则，判定商户的违规类型")

  public String getViolationType() {
    return violationType;
  }


  public void setViolationType(String violationType) {
    this.violationType = violationType;
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
   * @return the ViolationEvent instance itself
   */
  public ViolationEvent putAdditionalProperty(String key, Object value) {
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
    ViolationEvent violationEvent = (ViolationEvent) o;
    return Objects.equals(this.canAppeal, violationEvent.canAppeal) &&
        Objects.equals(this.canRectify, violationEvent.canRectify) &&
        Objects.equals(this.punishAction, violationEvent.punishAction) &&
        Objects.equals(this.status, violationEvent.status) &&
        Objects.equals(this.targetId, violationEvent.targetId) &&
        Objects.equals(this.targetName, violationEvent.targetName) &&
        Objects.equals(this.targetType, violationEvent.targetType) &&
        Objects.equals(this.violationRecordId, violationEvent.violationRecordId) &&
        Objects.equals(this.violationTime, violationEvent.violationTime) &&
        Objects.equals(this.violationType, violationEvent.violationType)&&
        Objects.equals(this.additionalProperties, violationEvent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canAppeal, canRectify, punishAction, status, targetId, targetName, targetType, violationRecordId, violationTime, violationType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViolationEvent {\n");
    sb.append("    canAppeal: ").append(toIndentedString(canAppeal)).append("\n");
    sb.append("    canRectify: ").append(toIndentedString(canRectify)).append("\n");
    sb.append("    punishAction: ").append(toIndentedString(punishAction)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    violationRecordId: ").append(toIndentedString(violationRecordId)).append("\n");
    sb.append("    violationTime: ").append(toIndentedString(violationTime)).append("\n");
    sb.append("    violationType: ").append(toIndentedString(violationType)).append("\n");
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
    openapiFields.add("can_appeal");
    openapiFields.add("can_rectify");
    openapiFields.add("punish_action");
    openapiFields.add("status");
    openapiFields.add("target_id");
    openapiFields.add("target_name");
    openapiFields.add("target_type");
    openapiFields.add("violation_record_id");
    openapiFields.add("violation_time");
    openapiFields.add("violation_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ViolationEvent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ViolationEvent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViolationEvent is not found in the empty JSON string", ViolationEvent.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("punish_action") != null && !jsonObj.get("punish_action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `punish_action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("punish_action").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("target_id") != null && !jsonObj.get("target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_id").toString()));
      }
      if (jsonObj.get("target_name") != null && !jsonObj.get("target_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_name").toString()));
      }
      if (jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
      if (jsonObj.get("violation_record_id") != null && !jsonObj.get("violation_record_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `violation_record_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("violation_record_id").toString()));
      }
      if (jsonObj.get("violation_time") != null && !jsonObj.get("violation_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `violation_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("violation_time").toString()));
      }
      if (jsonObj.get("violation_type") != null && !jsonObj.get("violation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `violation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("violation_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViolationEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViolationEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViolationEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViolationEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<ViolationEvent>() {
           @Override
           public void write(JsonWriter out, ViolationEvent value) throws IOException {
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
           public ViolationEvent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ViolationEvent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ViolationEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViolationEvent
  * @throws IOException if the JSON string is invalid with respect to ViolationEvent
  */
  public static ViolationEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViolationEvent.class);
  }

 /**
  * Convert an instance of ViolationEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

