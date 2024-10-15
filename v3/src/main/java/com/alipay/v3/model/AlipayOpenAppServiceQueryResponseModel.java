/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
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
 * AlipayOpenAppServiceQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAppServiceQueryResponseModel {
  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_SERVICE_XML = "service_xml";
  @SerializedName(SERIALIZED_NAME_SERVICE_XML)
  private String serviceXml;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "template_type";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private String templateType;

  public static final String SERIALIZED_NAME_USER_SERVICE_DELIVERY_TYPE = "user_service_delivery_type";
  @SerializedName(SERIALIZED_NAME_USER_SERVICE_DELIVERY_TYPE)
  private String userServiceDeliveryType;

  public AlipayOpenAppServiceQueryResponseModel() { 
  }

  public AlipayOpenAppServiceQueryResponseModel rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 驳回理由
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "不符合运营规范", value = "驳回理由")

  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public AlipayOpenAppServiceQueryResponseModel serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 服务id
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "s1111", value = "服务id")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public AlipayOpenAppServiceQueryResponseModel serviceXml(String serviceXml) {
    
    this.serviceXml = serviceXml;
    return this;
  }

   /**
   * 服务描述xml格式
   * @return serviceXml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<?xml version=\"1.0\" encoding=\"utf-8\"?</serviceSchema>...<serviceSchema>", value = "服务描述xml格式")

  public String getServiceXml() {
    return serviceXml;
  }


  public void setServiceXml(String serviceXml) {
    this.serviceXml = serviceXml;
  }


  public AlipayOpenAppServiceQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 服务状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDITING", value = "服务状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayOpenAppServiceQueryResponseModel templateType(String templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * 服务模板类型
   * @return templateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "服务模板类型")

  public String getTemplateType() {
    return templateType;
  }


  public void setTemplateType(String templateType) {
    this.templateType = templateType;
  }


  public AlipayOpenAppServiceQueryResponseModel userServiceDeliveryType(String userServiceDeliveryType) {
    
    this.userServiceDeliveryType = userServiceDeliveryType;
    return this;
  }

   /**
   * 服务履约类型
   * @return userServiceDeliveryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SCANE_SERVICE_DELIVERY", value = "服务履约类型")

  public String getUserServiceDeliveryType() {
    return userServiceDeliveryType;
  }


  public void setUserServiceDeliveryType(String userServiceDeliveryType) {
    this.userServiceDeliveryType = userServiceDeliveryType;
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
   * @return the AlipayOpenAppServiceQueryResponseModel instance itself
   */
  public AlipayOpenAppServiceQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenAppServiceQueryResponseModel alipayOpenAppServiceQueryResponseModel = (AlipayOpenAppServiceQueryResponseModel) o;
    return Objects.equals(this.rejectReason, alipayOpenAppServiceQueryResponseModel.rejectReason) &&
        Objects.equals(this.serviceCode, alipayOpenAppServiceQueryResponseModel.serviceCode) &&
        Objects.equals(this.serviceXml, alipayOpenAppServiceQueryResponseModel.serviceXml) &&
        Objects.equals(this.status, alipayOpenAppServiceQueryResponseModel.status) &&
        Objects.equals(this.templateType, alipayOpenAppServiceQueryResponseModel.templateType) &&
        Objects.equals(this.userServiceDeliveryType, alipayOpenAppServiceQueryResponseModel.userServiceDeliveryType)&&
        Objects.equals(this.additionalProperties, alipayOpenAppServiceQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectReason, serviceCode, serviceXml, status, templateType, userServiceDeliveryType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAppServiceQueryResponseModel {\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    serviceXml: ").append(toIndentedString(serviceXml)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    userServiceDeliveryType: ").append(toIndentedString(userServiceDeliveryType)).append("\n");
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
    openapiFields.add("reject_reason");
    openapiFields.add("service_code");
    openapiFields.add("service_xml");
    openapiFields.add("status");
    openapiFields.add("template_type");
    openapiFields.add("user_service_delivery_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAppServiceQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAppServiceQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAppServiceQueryResponseModel is not found in the empty JSON string", AlipayOpenAppServiceQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("reject_reason") != null && !jsonObj.get("reject_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reject_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reject_reason").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("service_xml") != null && !jsonObj.get("service_xml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_xml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_xml").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("template_type") != null && !jsonObj.get("template_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_type").toString()));
      }
      if (jsonObj.get("user_service_delivery_type") != null && !jsonObj.get("user_service_delivery_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_service_delivery_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_service_delivery_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAppServiceQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAppServiceQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAppServiceQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAppServiceQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAppServiceQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAppServiceQueryResponseModel value) throws IOException {
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
           public AlipayOpenAppServiceQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenAppServiceQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenAppServiceQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAppServiceQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAppServiceQueryResponseModel
  */
  public static AlipayOpenAppServiceQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAppServiceQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAppServiceQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

