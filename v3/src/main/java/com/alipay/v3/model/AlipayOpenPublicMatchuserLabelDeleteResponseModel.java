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
import com.alipay.v3.model.ErrorMatcher;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AlipayOpenPublicMatchuserLabelDeleteResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicMatchuserLabelDeleteResponseModel {
  public static final String SERIALIZED_NAME_ERROR_COUNT = "error_count";
  @SerializedName(SERIALIZED_NAME_ERROR_COUNT)
  private Integer errorCount;

  public static final String SERIALIZED_NAME_ERROR_MATCHERS = "error_matchers";
  @SerializedName(SERIALIZED_NAME_ERROR_MATCHERS)
  private List<ErrorMatcher> errorMatchers = null;

  public AlipayOpenPublicMatchuserLabelDeleteResponseModel() { 
  }

  public AlipayOpenPublicMatchuserLabelDeleteResponseModel errorCount(Integer errorCount) {
    
    this.errorCount = errorCount;
    return this;
  }

   /**
   * 用户打标失败数量
   * @return errorCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "用户打标失败数量")

  public Integer getErrorCount() {
    return errorCount;
  }


  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  public AlipayOpenPublicMatchuserLabelDeleteResponseModel errorMatchers(List<ErrorMatcher> errorMatchers) {
    
    this.errorMatchers = errorMatchers;
    return this;
  }

  public AlipayOpenPublicMatchuserLabelDeleteResponseModel addErrorMatchersItem(ErrorMatcher errorMatchersItem) {
    if (this.errorMatchers == null) {
      this.errorMatchers = new ArrayList<>();
    }
    this.errorMatchers.add(errorMatchersItem);
    return this;
  }

   /**
   * 出错的匹配器列表
   * @return errorMatchers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "出错的匹配器列表")

  public List<ErrorMatcher> getErrorMatchers() {
    return errorMatchers;
  }


  public void setErrorMatchers(List<ErrorMatcher> errorMatchers) {
    this.errorMatchers = errorMatchers;
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
   * @return the AlipayOpenPublicMatchuserLabelDeleteResponseModel instance itself
   */
  public AlipayOpenPublicMatchuserLabelDeleteResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenPublicMatchuserLabelDeleteResponseModel alipayOpenPublicMatchuserLabelDeleteResponseModel = (AlipayOpenPublicMatchuserLabelDeleteResponseModel) o;
    return Objects.equals(this.errorCount, alipayOpenPublicMatchuserLabelDeleteResponseModel.errorCount) &&
        Objects.equals(this.errorMatchers, alipayOpenPublicMatchuserLabelDeleteResponseModel.errorMatchers)&&
        Objects.equals(this.additionalProperties, alipayOpenPublicMatchuserLabelDeleteResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCount, errorMatchers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicMatchuserLabelDeleteResponseModel {\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    errorMatchers: ").append(toIndentedString(errorMatchers)).append("\n");
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
    openapiFields.add("error_count");
    openapiFields.add("error_matchers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicMatchuserLabelDeleteResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicMatchuserLabelDeleteResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicMatchuserLabelDeleteResponseModel is not found in the empty JSON string", AlipayOpenPublicMatchuserLabelDeleteResponseModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayerrorMatchers = jsonObj.getAsJsonArray("error_matchers");
      if (jsonArrayerrorMatchers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("error_matchers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `error_matchers` to be an array in the JSON string but got `%s`", jsonObj.get("error_matchers").toString()));
        }

        // validate the optional field `error_matchers` (array)
        for (int i = 0; i < jsonArrayerrorMatchers.size(); i++) {
          ErrorMatcher.validateJsonObject(jsonArrayerrorMatchers.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicMatchuserLabelDeleteResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicMatchuserLabelDeleteResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicMatchuserLabelDeleteResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicMatchuserLabelDeleteResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicMatchuserLabelDeleteResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicMatchuserLabelDeleteResponseModel value) throws IOException {
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
           public AlipayOpenPublicMatchuserLabelDeleteResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenPublicMatchuserLabelDeleteResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenPublicMatchuserLabelDeleteResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicMatchuserLabelDeleteResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicMatchuserLabelDeleteResponseModel
  */
  public static AlipayOpenPublicMatchuserLabelDeleteResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicMatchuserLabelDeleteResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicMatchuserLabelDeleteResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

