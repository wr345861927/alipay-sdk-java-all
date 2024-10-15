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
import com.alipay.v3.model.SearchOperPageQueryRequest;
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
 * AlipayOpenSearchAbilityBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchAbilityBatchqueryModel {
  public static final String SERIALIZED_NAME_BIZ_DATA = "biz_data";
  @SerializedName(SERIALIZED_NAME_BIZ_DATA)
  private SearchOperPageQueryRequest bizData;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_OPT_TYPE = "opt_type";
  @SerializedName(SERIALIZED_NAME_OPT_TYPE)
  private String optType;

  public AlipayOpenSearchAbilityBatchqueryModel() { 
  }

  public AlipayOpenSearchAbilityBatchqueryModel bizData(SearchOperPageQueryRequest bizData) {
    
    this.bizData = bizData;
    return this;
  }

   /**
   * Get bizData
   * @return bizData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchOperPageQueryRequest getBizData() {
    return bizData;
  }


  public void setBizData(SearchOperPageQueryRequest bizData) {
    this.bizData = bizData;
  }


  public AlipayOpenSearchAbilityBatchqueryModel bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 表示修改内容的业务类型
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SEARCH_ABILITY_BATCH_QUERY", value = "表示修改内容的业务类型")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public AlipayOpenSearchAbilityBatchqueryModel optType(String optType) {
    
    this.optType = optType;
    return this;
  }

   /**
   * 进行具体操作的类型比如：query
   * @return optType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "query", value = "进行具体操作的类型比如：query")

  public String getOptType() {
    return optType;
  }


  public void setOptType(String optType) {
    this.optType = optType;
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
   * @return the AlipayOpenSearchAbilityBatchqueryModel instance itself
   */
  public AlipayOpenSearchAbilityBatchqueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenSearchAbilityBatchqueryModel alipayOpenSearchAbilityBatchqueryModel = (AlipayOpenSearchAbilityBatchqueryModel) o;
    return Objects.equals(this.bizData, alipayOpenSearchAbilityBatchqueryModel.bizData) &&
        Objects.equals(this.bizType, alipayOpenSearchAbilityBatchqueryModel.bizType) &&
        Objects.equals(this.optType, alipayOpenSearchAbilityBatchqueryModel.optType)&&
        Objects.equals(this.additionalProperties, alipayOpenSearchAbilityBatchqueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizData, bizType, optType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchAbilityBatchqueryModel {\n");
    sb.append("    bizData: ").append(toIndentedString(bizData)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    optType: ").append(toIndentedString(optType)).append("\n");
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
    openapiFields.add("biz_data");
    openapiFields.add("biz_type");
    openapiFields.add("opt_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchAbilityBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchAbilityBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchAbilityBatchqueryModel is not found in the empty JSON string", AlipayOpenSearchAbilityBatchqueryModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `biz_data`
      if (jsonObj.getAsJsonObject("biz_data") != null) {
        SearchOperPageQueryRequest.validateJsonObject(jsonObj.getAsJsonObject("biz_data"));
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      if (jsonObj.get("opt_type") != null && !jsonObj.get("opt_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `opt_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("opt_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchAbilityBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchAbilityBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchAbilityBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchAbilityBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchAbilityBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchAbilityBatchqueryModel value) throws IOException {
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
           public AlipayOpenSearchAbilityBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenSearchAbilityBatchqueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenSearchAbilityBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchAbilityBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchAbilityBatchqueryModel
  */
  public static AlipayOpenSearchAbilityBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchAbilityBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchAbilityBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

