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
 * MoreInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MoreInfoDTO {
  public static final String SERIALIZED_NAME_DESCS = "descs";
  @SerializedName(SERIALIZED_NAME_DESCS)
  private List<String> descs = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private String params;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public MoreInfoDTO() { 
  }

  public MoreInfoDTO descs(List<String> descs) {
    
    this.descs = descs;
    return this;
  }

  public MoreInfoDTO addDescsItem(String descsItem) {
    if (this.descs == null) {
      this.descs = new ArrayList<>();
    }
    this.descs.add(descsItem);
    return this;
  }

   /**
   * 描述，当operate_type为openNative必填
   * @return descs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "描述，当operate_type为openNative必填")

  public List<String> getDescs() {
    return descs;
  }


  public void setDescs(List<String> descs) {
    this.descs = descs;
  }


  public MoreInfoDTO params(String params) {
    
    this.params = params;
    return this;
  }

   /**
   * 扩展参数，需要URL地址回带的值，JSON格式(openweb时填)
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展参数，需要URL地址回带的值，JSON格式(openweb时填)")

  public String getParams() {
    return params;
  }


  public void setParams(String params) {
    this.params = params;
  }


  public MoreInfoDTO title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 二级页面标题，只有当operate_type为openNative时有效。
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "二级页面标题，只有当operate_type为openNative时有效。")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public MoreInfoDTO url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 超链接(选择openweb的时候必须填写url参数内容)
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "超链接(选择openweb的时候必须填写url参数内容)")

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
   * @return the MoreInfoDTO instance itself
   */
  public MoreInfoDTO putAdditionalProperty(String key, Object value) {
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
    MoreInfoDTO moreInfoDTO = (MoreInfoDTO) o;
    return Objects.equals(this.descs, moreInfoDTO.descs) &&
        Objects.equals(this.params, moreInfoDTO.params) &&
        Objects.equals(this.title, moreInfoDTO.title) &&
        Objects.equals(this.url, moreInfoDTO.url)&&
        Objects.equals(this.additionalProperties, moreInfoDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descs, params, title, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoreInfoDTO {\n");
    sb.append("    descs: ").append(toIndentedString(descs)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("descs");
    openapiFields.add("params");
    openapiFields.add("title");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MoreInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MoreInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MoreInfoDTO is not found in the empty JSON string", MoreInfoDTO.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("descs") != null && !jsonObj.get("descs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `descs` to be an array in the JSON string but got `%s`", jsonObj.get("descs").toString()));
      }
      if (jsonObj.get("params") != null && !jsonObj.get("params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("params").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MoreInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MoreInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MoreInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MoreInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MoreInfoDTO>() {
           @Override
           public void write(JsonWriter out, MoreInfoDTO value) throws IOException {
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
           public MoreInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MoreInfoDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MoreInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MoreInfoDTO
  * @throws IOException if the JSON string is invalid with respect to MoreInfoDTO
  */
  public static MoreInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MoreInfoDTO.class);
  }

 /**
  * Convert an instance of MoreInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

