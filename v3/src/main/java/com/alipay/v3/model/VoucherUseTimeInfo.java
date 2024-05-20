/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-05-20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.VoucherAbsolutePeriodInfo;
import com.alipay.v3.model.VoucherRelativePeriodInfo;
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
 * VoucherUseTimeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherUseTimeInfo {
  public static final String SERIALIZED_NAME_ABSOLUTE_PERIOD_INFO = "absolute_period_info";
  @SerializedName(SERIALIZED_NAME_ABSOLUTE_PERIOD_INFO)
  private VoucherAbsolutePeriodInfo absolutePeriodInfo;

  public static final String SERIALIZED_NAME_PERIOD_TYPE = "period_type";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPE)
  private String periodType;

  public static final String SERIALIZED_NAME_RELATIVE_PERIOD_INFO = "relative_period_info";
  @SerializedName(SERIALIZED_NAME_RELATIVE_PERIOD_INFO)
  private VoucherRelativePeriodInfo relativePeriodInfo;

  public VoucherUseTimeInfo() { 
  }

  public VoucherUseTimeInfo absolutePeriodInfo(VoucherAbsolutePeriodInfo absolutePeriodInfo) {
    
    this.absolutePeriodInfo = absolutePeriodInfo;
    return this;
  }

   /**
   * Get absolutePeriodInfo
   * @return absolutePeriodInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAbsolutePeriodInfo getAbsolutePeriodInfo() {
    return absolutePeriodInfo;
  }


  public void setAbsolutePeriodInfo(VoucherAbsolutePeriodInfo absolutePeriodInfo) {
    this.absolutePeriodInfo = absolutePeriodInfo;
  }


  public VoucherUseTimeInfo periodType(String periodType) {
    
    this.periodType = periodType;
    return this;
  }

   /**
   * 券有效期。
   * @return periodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券有效期。")

  public String getPeriodType() {
    return periodType;
  }


  public void setPeriodType(String periodType) {
    this.periodType = periodType;
  }


  public VoucherUseTimeInfo relativePeriodInfo(VoucherRelativePeriodInfo relativePeriodInfo) {
    
    this.relativePeriodInfo = relativePeriodInfo;
    return this;
  }

   /**
   * Get relativePeriodInfo
   * @return relativePeriodInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherRelativePeriodInfo getRelativePeriodInfo() {
    return relativePeriodInfo;
  }


  public void setRelativePeriodInfo(VoucherRelativePeriodInfo relativePeriodInfo) {
    this.relativePeriodInfo = relativePeriodInfo;
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
   * @return the VoucherUseTimeInfo instance itself
   */
  public VoucherUseTimeInfo putAdditionalProperty(String key, Object value) {
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
    VoucherUseTimeInfo voucherUseTimeInfo = (VoucherUseTimeInfo) o;
    return Objects.equals(this.absolutePeriodInfo, voucherUseTimeInfo.absolutePeriodInfo) &&
        Objects.equals(this.periodType, voucherUseTimeInfo.periodType) &&
        Objects.equals(this.relativePeriodInfo, voucherUseTimeInfo.relativePeriodInfo)&&
        Objects.equals(this.additionalProperties, voucherUseTimeInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolutePeriodInfo, periodType, relativePeriodInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherUseTimeInfo {\n");
    sb.append("    absolutePeriodInfo: ").append(toIndentedString(absolutePeriodInfo)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    relativePeriodInfo: ").append(toIndentedString(relativePeriodInfo)).append("\n");
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
    openapiFields.add("absolute_period_info");
    openapiFields.add("period_type");
    openapiFields.add("relative_period_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherUseTimeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherUseTimeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherUseTimeInfo is not found in the empty JSON string", VoucherUseTimeInfo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `absolute_period_info`
      if (jsonObj.getAsJsonObject("absolute_period_info") != null) {
        VoucherAbsolutePeriodInfo.validateJsonObject(jsonObj.getAsJsonObject("absolute_period_info"));
      }
      if (jsonObj.get("period_type") != null && !jsonObj.get("period_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period_type").toString()));
      }
      // validate the optional field `relative_period_info`
      if (jsonObj.getAsJsonObject("relative_period_info") != null) {
        VoucherRelativePeriodInfo.validateJsonObject(jsonObj.getAsJsonObject("relative_period_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherUseTimeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherUseTimeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherUseTimeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherUseTimeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherUseTimeInfo>() {
           @Override
           public void write(JsonWriter out, VoucherUseTimeInfo value) throws IOException {
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
           public VoucherUseTimeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherUseTimeInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherUseTimeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherUseTimeInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherUseTimeInfo
  */
  public static VoucherUseTimeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherUseTimeInfo.class);
  }

 /**
  * Convert an instance of VoucherUseTimeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

