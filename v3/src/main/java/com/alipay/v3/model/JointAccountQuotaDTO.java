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
 * JointAccountQuotaDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JointAccountQuotaDTO {
  public static final String SERIALIZED_NAME_CUSTOM_BEGIN_DATE = "custom_begin_date";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BEGIN_DATE)
  private String customBeginDate;

  public static final String SERIALIZED_NAME_CUSTOM_END_DATE = "custom_end_date";
  @SerializedName(SERIALIZED_NAME_CUSTOM_END_DATE)
  private String customEndDate;

  public static final String SERIALIZED_NAME_QUOTA_DIMENSION = "quota_dimension";
  @SerializedName(SERIALIZED_NAME_QUOTA_DIMENSION)
  private String quotaDimension;

  public static final String SERIALIZED_NAME_QUOTA_TOTAL = "quota_total";
  @SerializedName(SERIALIZED_NAME_QUOTA_TOTAL)
  private String quotaTotal;

  public JointAccountQuotaDTO() { 
  }

  public JointAccountQuotaDTO customBeginDate(String customBeginDate) {
    
    this.customBeginDate = customBeginDate;
    return this;
  }

   /**
   * 自定义周期起始日期，精确到分钟，yyyy-MM-dd HH:mm
   * @return customBeginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义周期起始日期，精确到分钟，yyyy-MM-dd HH:mm")

  public String getCustomBeginDate() {
    return customBeginDate;
  }


  public void setCustomBeginDate(String customBeginDate) {
    this.customBeginDate = customBeginDate;
  }


  public JointAccountQuotaDTO customEndDate(String customEndDate) {
    
    this.customEndDate = customEndDate;
    return this;
  }

   /**
   * 自定义周期结束日期，精确到分钟，yyyy-MM-dd HH:mm
   * @return customEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义周期结束日期，精确到分钟，yyyy-MM-dd HH:mm")

  public String getCustomEndDate() {
    return customEndDate;
  }


  public void setCustomEndDate(String customEndDate) {
    this.customEndDate = customEndDate;
  }


  public JointAccountQuotaDTO quotaDimension(String quotaDimension) {
    
    this.quotaDimension = quotaDimension;
    return this;
  }

   /**
   * 额度维度 单笔上限：ONCE 日：DAY 月：MONTH 季度：QUARTER 年：YEAR 终身：LIFETIME 一次性使用额度：ONLYONE
   * @return quotaDimension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "额度维度 单笔上限：ONCE 日：DAY 月：MONTH 季度：QUARTER 年：YEAR 终身：LIFETIME 一次性使用额度：ONLYONE")

  public String getQuotaDimension() {
    return quotaDimension;
  }


  public void setQuotaDimension(String quotaDimension) {
    this.quotaDimension = quotaDimension;
  }


  public JointAccountQuotaDTO quotaTotal(String quotaTotal) {
    
    this.quotaTotal = quotaTotal;
    return this;
  }

   /**
   * 协议额度
   * @return quotaTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "协议额度")

  public String getQuotaTotal() {
    return quotaTotal;
  }


  public void setQuotaTotal(String quotaTotal) {
    this.quotaTotal = quotaTotal;
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
   * @return the JointAccountQuotaDTO instance itself
   */
  public JointAccountQuotaDTO putAdditionalProperty(String key, Object value) {
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
    JointAccountQuotaDTO jointAccountQuotaDTO = (JointAccountQuotaDTO) o;
    return Objects.equals(this.customBeginDate, jointAccountQuotaDTO.customBeginDate) &&
        Objects.equals(this.customEndDate, jointAccountQuotaDTO.customEndDate) &&
        Objects.equals(this.quotaDimension, jointAccountQuotaDTO.quotaDimension) &&
        Objects.equals(this.quotaTotal, jointAccountQuotaDTO.quotaTotal)&&
        Objects.equals(this.additionalProperties, jointAccountQuotaDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customBeginDate, customEndDate, quotaDimension, quotaTotal, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JointAccountQuotaDTO {\n");
    sb.append("    customBeginDate: ").append(toIndentedString(customBeginDate)).append("\n");
    sb.append("    customEndDate: ").append(toIndentedString(customEndDate)).append("\n");
    sb.append("    quotaDimension: ").append(toIndentedString(quotaDimension)).append("\n");
    sb.append("    quotaTotal: ").append(toIndentedString(quotaTotal)).append("\n");
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
    openapiFields.add("custom_begin_date");
    openapiFields.add("custom_end_date");
    openapiFields.add("quota_dimension");
    openapiFields.add("quota_total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JointAccountQuotaDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JointAccountQuotaDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JointAccountQuotaDTO is not found in the empty JSON string", JointAccountQuotaDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("custom_begin_date") != null && !jsonObj.get("custom_begin_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_begin_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_begin_date").toString()));
      }
      if (jsonObj.get("custom_end_date") != null && !jsonObj.get("custom_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_end_date").toString()));
      }
      if (jsonObj.get("quota_dimension") != null && !jsonObj.get("quota_dimension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_dimension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_dimension").toString()));
      }
      if (jsonObj.get("quota_total") != null && !jsonObj.get("quota_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_total").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JointAccountQuotaDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JointAccountQuotaDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JointAccountQuotaDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JointAccountQuotaDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<JointAccountQuotaDTO>() {
           @Override
           public void write(JsonWriter out, JointAccountQuotaDTO value) throws IOException {
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
           public JointAccountQuotaDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JointAccountQuotaDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JointAccountQuotaDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JointAccountQuotaDTO
  * @throws IOException if the JSON string is invalid with respect to JointAccountQuotaDTO
  */
  public static JointAccountQuotaDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JointAccountQuotaDTO.class);
  }

 /**
  * Convert an instance of JointAccountQuotaDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

