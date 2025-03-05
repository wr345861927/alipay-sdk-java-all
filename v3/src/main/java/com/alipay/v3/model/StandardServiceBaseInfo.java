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
 * StandardServiceBaseInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StandardServiceBaseInfo {
  public static final String SERIALIZED_NAME_BIZ_STATUS = "biz_status";
  @SerializedName(SERIALIZED_NAME_BIZ_STATUS)
  private String bizStatus;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "service_name";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public StandardServiceBaseInfo() { 
  }

  public StandardServiceBaseInfo bizStatus(String bizStatus) {
    
    this.bizStatus = bizStatus;
    return this;
  }

   /**
   * 服务状态
   * @return bizStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INVALID", value = "服务状态")

  public String getBizStatus() {
    return bizStatus;
  }


  public void setBizStatus(String bizStatus) {
    this.bizStatus = bizStatus;
  }


  public StandardServiceBaseInfo categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 类目id
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C154984121", value = "类目id")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public StandardServiceBaseInfo serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 服务code
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "S11111", value = "服务code")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public StandardServiceBaseInfo serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * 服务名称
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "肯德基", value = "服务名称")

  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
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
   * @return the StandardServiceBaseInfo instance itself
   */
  public StandardServiceBaseInfo putAdditionalProperty(String key, Object value) {
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
    StandardServiceBaseInfo standardServiceBaseInfo = (StandardServiceBaseInfo) o;
    return Objects.equals(this.bizStatus, standardServiceBaseInfo.bizStatus) &&
        Objects.equals(this.categoryId, standardServiceBaseInfo.categoryId) &&
        Objects.equals(this.serviceCode, standardServiceBaseInfo.serviceCode) &&
        Objects.equals(this.serviceName, standardServiceBaseInfo.serviceName)&&
        Objects.equals(this.additionalProperties, standardServiceBaseInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizStatus, categoryId, serviceCode, serviceName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardServiceBaseInfo {\n");
    sb.append("    bizStatus: ").append(toIndentedString(bizStatus)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
    openapiFields.add("biz_status");
    openapiFields.add("category_id");
    openapiFields.add("service_code");
    openapiFields.add("service_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StandardServiceBaseInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StandardServiceBaseInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StandardServiceBaseInfo is not found in the empty JSON string", StandardServiceBaseInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_status") != null && !jsonObj.get("biz_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_status").toString()));
      }
      if (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("service_name") != null && !jsonObj.get("service_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StandardServiceBaseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StandardServiceBaseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StandardServiceBaseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StandardServiceBaseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StandardServiceBaseInfo>() {
           @Override
           public void write(JsonWriter out, StandardServiceBaseInfo value) throws IOException {
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
           public StandardServiceBaseInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StandardServiceBaseInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StandardServiceBaseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StandardServiceBaseInfo
  * @throws IOException if the JSON string is invalid with respect to StandardServiceBaseInfo
  */
  public static StandardServiceBaseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StandardServiceBaseInfo.class);
  }

 /**
  * Convert an instance of StandardServiceBaseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

