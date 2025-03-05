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
 * AlipayCommerceIotDeviceReportUploadModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceIotDeviceReportUploadModel {
  public static final String SERIALIZED_NAME_REPORT_CONTENT = "report_content";
  @SerializedName(SERIALIZED_NAME_REPORT_CONTENT)
  private String reportContent;

  public static final String SERIALIZED_NAME_SN = "sn";
  @SerializedName(SERIALIZED_NAME_SN)
  private String sn;

  public AlipayCommerceIotDeviceReportUploadModel() { 
  }

  public AlipayCommerceIotDeviceReportUploadModel reportContent(String reportContent) {
    
    this.reportContent = reportContent;
    return this;
  }

   /**
   * 设备检测报告详情
   * @return reportContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "设备检测报告详情JSON字符串", value = "设备检测报告详情")

  public String getReportContent() {
    return reportContent;
  }


  public void setReportContent(String reportContent) {
    this.reportContent = reportContent;
  }


  public AlipayCommerceIotDeviceReportUploadModel sn(String sn) {
    
    this.sn = sn;
    return this;
  }

   /**
   * 设备唯一标识
   * @return sn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SMIT1D2020108003872", value = "设备唯一标识")

  public String getSn() {
    return sn;
  }


  public void setSn(String sn) {
    this.sn = sn;
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
   * @return the AlipayCommerceIotDeviceReportUploadModel instance itself
   */
  public AlipayCommerceIotDeviceReportUploadModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceIotDeviceReportUploadModel alipayCommerceIotDeviceReportUploadModel = (AlipayCommerceIotDeviceReportUploadModel) o;
    return Objects.equals(this.reportContent, alipayCommerceIotDeviceReportUploadModel.reportContent) &&
        Objects.equals(this.sn, alipayCommerceIotDeviceReportUploadModel.sn)&&
        Objects.equals(this.additionalProperties, alipayCommerceIotDeviceReportUploadModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportContent, sn, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceIotDeviceReportUploadModel {\n");
    sb.append("    reportContent: ").append(toIndentedString(reportContent)).append("\n");
    sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
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
    openapiFields.add("report_content");
    openapiFields.add("sn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceIotDeviceReportUploadModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceIotDeviceReportUploadModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceIotDeviceReportUploadModel is not found in the empty JSON string", AlipayCommerceIotDeviceReportUploadModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("report_content") != null && !jsonObj.get("report_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_content").toString()));
      }
      if (jsonObj.get("sn") != null && !jsonObj.get("sn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceIotDeviceReportUploadModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceIotDeviceReportUploadModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceIotDeviceReportUploadModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceIotDeviceReportUploadModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceIotDeviceReportUploadModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceIotDeviceReportUploadModel value) throws IOException {
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
           public AlipayCommerceIotDeviceReportUploadModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceIotDeviceReportUploadModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceIotDeviceReportUploadModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceIotDeviceReportUploadModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceIotDeviceReportUploadModel
  */
  public static AlipayCommerceIotDeviceReportUploadModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceIotDeviceReportUploadModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceIotDeviceReportUploadModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

