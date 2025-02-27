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
 * KeyWordInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyWordInfo {
  public static final String SERIALIZED_NAME_APPLY_NO = "apply_no";
  @SerializedName(SERIALIZED_NAME_APPLY_NO)
  private String applyNo;

  public static final String SERIALIZED_NAME_AUDIT_KEY_WORD = "audit_key_word";
  @SerializedName(SERIALIZED_NAME_AUDIT_KEY_WORD)
  private String auditKeyWord;

  public static final String SERIALIZED_NAME_AUDIT_REASON = "audit_reason";
  @SerializedName(SERIALIZED_NAME_AUDIT_REASON)
  private String auditReason;

  public static final String SERIALIZED_NAME_AUDIT_TIME = "audit_time";
  @SerializedName(SERIALIZED_NAME_AUDIT_TIME)
  private String auditTime;

  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private String configId;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_KEY_WORD = "key_word";
  @SerializedName(SERIALIZED_NAME_KEY_WORD)
  private String keyWord;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public KeyWordInfo() { 
  }

  public KeyWordInfo applyNo(String applyNo) {
    
    this.applyNo = applyNo;
    return this;
  }

   /**
   * 审核单号
   * @return applyNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "审核单号")

  public String getApplyNo() {
    return applyNo;
  }


  public void setApplyNo(String applyNo) {
    this.applyNo = applyNo;
  }


  public KeyWordInfo auditKeyWord(String auditKeyWord) {
    
    this.auditKeyWord = auditKeyWord;
    return this;
  }

   /**
   * 审核中的关键词
   * @return auditKeyWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "审核中的关键词")

  public String getAuditKeyWord() {
    return auditKeyWord;
  }


  public void setAuditKeyWord(String auditKeyWord) {
    this.auditKeyWord = auditKeyWord;
  }


  public KeyWordInfo auditReason(String auditReason) {
    
    this.auditReason = auditReason;
    return this;
  }

   /**
   * 审核人的备注信息
   * @return auditReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "审核人的备注信息")

  public String getAuditReason() {
    return auditReason;
  }


  public void setAuditReason(String auditReason) {
    this.auditReason = auditReason;
  }


  public KeyWordInfo auditTime(String auditTime) {
    
    this.auditTime = auditTime;
    return this;
  }

   /**
   * 审核时间
   * @return auditTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "审核时间")

  public String getAuditTime() {
    return auditTime;
  }


  public void setAuditTime(String auditTime) {
    this.auditTime = auditTime;
  }


  public KeyWordInfo configId(String configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * 关键词配置ID
   * @return configId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关键词配置ID")

  public String getConfigId() {
    return configId;
  }


  public void setConfigId(String configId) {
    this.configId = configId;
  }


  public KeyWordInfo gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public KeyWordInfo keyWord(String keyWord) {
    
    this.keyWord = keyWord;
    return this;
  }

   /**
   * 审核完成的关键词
   * @return keyWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "审核完成的关键词")

  public String getKeyWord() {
    return keyWord;
  }


  public void setKeyWord(String keyWord) {
    this.keyWord = keyWord;
  }


  public KeyWordInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 关键词当前状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关键词当前状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyWordInfo keyWordInfo = (KeyWordInfo) o;
    return Objects.equals(this.applyNo, keyWordInfo.applyNo) &&
        Objects.equals(this.auditKeyWord, keyWordInfo.auditKeyWord) &&
        Objects.equals(this.auditReason, keyWordInfo.auditReason) &&
        Objects.equals(this.auditTime, keyWordInfo.auditTime) &&
        Objects.equals(this.configId, keyWordInfo.configId) &&
        Objects.equals(this.gmtCreate, keyWordInfo.gmtCreate) &&
        Objects.equals(this.keyWord, keyWordInfo.keyWord) &&
        Objects.equals(this.status, keyWordInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyNo, auditKeyWord, auditReason, auditTime, configId, gmtCreate, keyWord, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyWordInfo {\n");
    sb.append("    applyNo: ").append(toIndentedString(applyNo)).append("\n");
    sb.append("    auditKeyWord: ").append(toIndentedString(auditKeyWord)).append("\n");
    sb.append("    auditReason: ").append(toIndentedString(auditReason)).append("\n");
    sb.append("    auditTime: ").append(toIndentedString(auditTime)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("apply_no");
    openapiFields.add("audit_key_word");
    openapiFields.add("audit_reason");
    openapiFields.add("audit_time");
    openapiFields.add("config_id");
    openapiFields.add("gmt_create");
    openapiFields.add("key_word");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyWordInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KeyWordInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyWordInfo is not found in the empty JSON string", KeyWordInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyWordInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyWordInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("apply_no") != null && !jsonObj.get("apply_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_no").toString()));
      }
      if (jsonObj.get("audit_key_word") != null && !jsonObj.get("audit_key_word").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_key_word` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_key_word").toString()));
      }
      if (jsonObj.get("audit_reason") != null && !jsonObj.get("audit_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_reason").toString()));
      }
      if (jsonObj.get("audit_time") != null && !jsonObj.get("audit_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_time").toString()));
      }
      if (jsonObj.get("config_id") != null && !jsonObj.get("config_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `config_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("config_id").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("key_word") != null && !jsonObj.get("key_word").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_word` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_word").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyWordInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyWordInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyWordInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyWordInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyWordInfo>() {
           @Override
           public void write(JsonWriter out, KeyWordInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyWordInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyWordInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyWordInfo
  * @throws IOException if the JSON string is invalid with respect to KeyWordInfo
  */
  public static KeyWordInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyWordInfo.class);
  }

 /**
  * Convert an instance of KeyWordInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

