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
 * IssueQuotaCheckInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IssueQuotaCheckInfo {
  public static final String SERIALIZED_NAME_ISSUE_QUOTA = "issue_quota";
  @SerializedName(SERIALIZED_NAME_ISSUE_QUOTA)
  private String issueQuota;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_OWNER_OPEN_ID = "owner_open_id";
  @SerializedName(SERIALIZED_NAME_OWNER_OPEN_ID)
  private String ownerOpenId;

  public static final String SERIALIZED_NAME_OWNER_TYPE = "owner_type";
  @SerializedName(SERIALIZED_NAME_OWNER_TYPE)
  private String ownerType;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Boolean result;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public IssueQuotaCheckInfo() { 
  }

  public IssueQuotaCheckInfo issueQuota(String issueQuota) {
    
    this.issueQuota = issueQuota;
    return this;
  }

   /**
   * 发放点券和余额时，单位为元，发放次卡时，单位为次
   * @return issueQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发放点券和余额时，单位为元，发放次卡时，单位为次")

  public String getIssueQuota() {
    return issueQuota;
  }


  public void setIssueQuota(String issueQuota) {
    this.issueQuota = issueQuota;
  }


  public IssueQuotaCheckInfo message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 校验结果的原因
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "校验结果的原因")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public IssueQuotaCheckInfo ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * 入参的 owner_id
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "入参的 owner_id")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public IssueQuotaCheckInfo ownerOpenId(String ownerOpenId) {
    
    this.ownerOpenId = ownerOpenId;
    return this;
  }

   /**
   * 入参的  owner_open_id
   * @return ownerOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "入参的  owner_open_id")

  public String getOwnerOpenId() {
    return ownerOpenId;
  }


  public void setOwnerOpenId(String ownerOpenId) {
    this.ownerOpenId = ownerOpenId;
  }


  public IssueQuotaCheckInfo ownerType(String ownerType) {
    
    this.ownerType = ownerType;
    return this;
  }

   /**
   * owner_type
   * @return ownerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "owner_type")

  public String getOwnerType() {
    return ownerType;
  }


  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }


  public IssueQuotaCheckInfo result(Boolean result) {
    
    this.result = result;
    return this;
  }

   /**
   * 校验结果
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "校验结果")

  public Boolean getResult() {
    return result;
  }


  public void setResult(Boolean result) {
    this.result = result;
  }


  public IssueQuotaCheckInfo userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 用户姓名
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户姓名")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
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
   * @return the IssueQuotaCheckInfo instance itself
   */
  public IssueQuotaCheckInfo putAdditionalProperty(String key, Object value) {
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
    IssueQuotaCheckInfo issueQuotaCheckInfo = (IssueQuotaCheckInfo) o;
    return Objects.equals(this.issueQuota, issueQuotaCheckInfo.issueQuota) &&
        Objects.equals(this.message, issueQuotaCheckInfo.message) &&
        Objects.equals(this.ownerId, issueQuotaCheckInfo.ownerId) &&
        Objects.equals(this.ownerOpenId, issueQuotaCheckInfo.ownerOpenId) &&
        Objects.equals(this.ownerType, issueQuotaCheckInfo.ownerType) &&
        Objects.equals(this.result, issueQuotaCheckInfo.result) &&
        Objects.equals(this.userName, issueQuotaCheckInfo.userName)&&
        Objects.equals(this.additionalProperties, issueQuotaCheckInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueQuota, message, ownerId, ownerOpenId, ownerType, result, userName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueQuotaCheckInfo {\n");
    sb.append("    issueQuota: ").append(toIndentedString(issueQuota)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerOpenId: ").append(toIndentedString(ownerOpenId)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("issue_quota");
    openapiFields.add("message");
    openapiFields.add("owner_id");
    openapiFields.add("owner_open_id");
    openapiFields.add("owner_type");
    openapiFields.add("result");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueQuotaCheckInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueQuotaCheckInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueQuotaCheckInfo is not found in the empty JSON string", IssueQuotaCheckInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("issue_quota") != null && !jsonObj.get("issue_quota").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_quota` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_quota").toString()));
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("owner_id") != null && !jsonObj.get("owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_id").toString()));
      }
      if (jsonObj.get("owner_open_id") != null && !jsonObj.get("owner_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_open_id").toString()));
      }
      if (jsonObj.get("owner_type") != null && !jsonObj.get("owner_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_type").toString()));
      }
      if (jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueQuotaCheckInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueQuotaCheckInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueQuotaCheckInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueQuotaCheckInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueQuotaCheckInfo>() {
           @Override
           public void write(JsonWriter out, IssueQuotaCheckInfo value) throws IOException {
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
           public IssueQuotaCheckInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IssueQuotaCheckInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IssueQuotaCheckInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueQuotaCheckInfo
  * @throws IOException if the JSON string is invalid with respect to IssueQuotaCheckInfo
  */
  public static IssueQuotaCheckInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueQuotaCheckInfo.class);
  }

 /**
  * Convert an instance of IssueQuotaCheckInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

