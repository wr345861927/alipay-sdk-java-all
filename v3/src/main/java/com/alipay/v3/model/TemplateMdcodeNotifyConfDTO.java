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
 * TemplateMdcodeNotifyConfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateMdcodeNotifyConfDTO {
  public static final String SERIALIZED_NAME_EXT_PARAMS = "ext_params";
  @SerializedName(SERIALIZED_NAME_EXT_PARAMS)
  private String extParams;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public TemplateMdcodeNotifyConfDTO() { 
  }

  public TemplateMdcodeNotifyConfDTO extParams(String extParams) {
    
    this.extParams = extParams;
    return this;
  }

   /**
   * 扩展参数信息；  格式为key-value键值对；  支付宝POST请求指定url时，除BizCardNo等固定参数外，将带上ext_params中配置的所有key-value参数。
   * @return extParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展参数信息；  格式为key-value键值对；  支付宝POST请求指定url时，除BizCardNo等固定参数外，将带上ext_params中配置的所有key-value参数。")

  public String getExtParams() {
    return extParams;
  }


  public void setExtParams(String extParams) {
    this.extParams = extParams;
  }


  public TemplateMdcodeNotifyConfDTO url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 商户接收发码通知的地址链接；  只支持https地址；  用户打开会员卡时，支付宝提交POST请求此url地址，通知商户发码。
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户接收发码通知的地址链接；  只支持https地址；  用户打开会员卡时，支付宝提交POST请求此url地址，通知商户发码。")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
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
   * @return the TemplateMdcodeNotifyConfDTO instance itself
   */
  public TemplateMdcodeNotifyConfDTO putAdditionalProperty(String key, Object value) {
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
    TemplateMdcodeNotifyConfDTO templateMdcodeNotifyConfDTO = (TemplateMdcodeNotifyConfDTO) o;
    return Objects.equals(this.extParams, templateMdcodeNotifyConfDTO.extParams) &&
        Objects.equals(this.url, templateMdcodeNotifyConfDTO.url)&&
        Objects.equals(this.additionalProperties, templateMdcodeNotifyConfDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extParams, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateMdcodeNotifyConfDTO {\n");
    sb.append("    extParams: ").append(toIndentedString(extParams)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("ext_params");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateMdcodeNotifyConfDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TemplateMdcodeNotifyConfDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateMdcodeNotifyConfDTO is not found in the empty JSON string", TemplateMdcodeNotifyConfDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("ext_params") != null && !jsonObj.get("ext_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_params").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateMdcodeNotifyConfDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateMdcodeNotifyConfDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateMdcodeNotifyConfDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateMdcodeNotifyConfDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateMdcodeNotifyConfDTO>() {
           @Override
           public void write(JsonWriter out, TemplateMdcodeNotifyConfDTO value) throws IOException {
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
           public TemplateMdcodeNotifyConfDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TemplateMdcodeNotifyConfDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TemplateMdcodeNotifyConfDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateMdcodeNotifyConfDTO
  * @throws IOException if the JSON string is invalid with respect to TemplateMdcodeNotifyConfDTO
  */
  public static TemplateMdcodeNotifyConfDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateMdcodeNotifyConfDTO.class);
  }

 /**
  * Convert an instance of TemplateMdcodeNotifyConfDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

