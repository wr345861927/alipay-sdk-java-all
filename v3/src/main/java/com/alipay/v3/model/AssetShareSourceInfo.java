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
 * AssetShareSourceInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetShareSourceInfo {
  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private String shareMode;

  public static final String SERIALIZED_NAME_SOURCE_ID_LIST = "source_id_list";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID_LIST)
  private List<String> sourceIdList = null;

  public AssetShareSourceInfo() { 
  }

  public AssetShareSourceInfo shareMode(String shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * 当前规则可用的资产来源类型，搭配source_id_list使用。
   * @return shareMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "当前规则可用的资产来源类型，搭配source_id_list使用。")

  public String getShareMode() {
    return shareMode;
  }


  public void setShareMode(String shareMode) {
    this.shareMode = shareMode;
  }


  public AssetShareSourceInfo sourceIdList(List<String> sourceIdList) {
    
    this.sourceIdList = sourceIdList;
    return this;
  }

  public AssetShareSourceInfo addSourceIdListItem(String sourceIdListItem) {
    if (this.sourceIdList == null) {
      this.sourceIdList = new ArrayList<>();
    }
    this.sourceIdList.add(sourceIdListItem);
    return this;
  }

   /**
   * 资产共享来源id列表，与share_mode配合设置，如果share_mode为INSTITUTION，该值则填写制度id列表
   * @return sourceIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "资产共享来源id列表，与share_mode配合设置，如果share_mode为INSTITUTION，该值则填写制度id列表")

  public List<String> getSourceIdList() {
    return sourceIdList;
  }


  public void setSourceIdList(List<String> sourceIdList) {
    this.sourceIdList = sourceIdList;
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
   * @return the AssetShareSourceInfo instance itself
   */
  public AssetShareSourceInfo putAdditionalProperty(String key, Object value) {
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
    AssetShareSourceInfo assetShareSourceInfo = (AssetShareSourceInfo) o;
    return Objects.equals(this.shareMode, assetShareSourceInfo.shareMode) &&
        Objects.equals(this.sourceIdList, assetShareSourceInfo.sourceIdList)&&
        Objects.equals(this.additionalProperties, assetShareSourceInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareMode, sourceIdList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetShareSourceInfo {\n");
    sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
    sb.append("    sourceIdList: ").append(toIndentedString(sourceIdList)).append("\n");
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
    openapiFields.add("share_mode");
    openapiFields.add("source_id_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssetShareSourceInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssetShareSourceInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssetShareSourceInfo is not found in the empty JSON string", AssetShareSourceInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("share_mode") != null && !jsonObj.get("share_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `share_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("share_mode").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("source_id_list") != null && !jsonObj.get("source_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("source_id_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetShareSourceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetShareSourceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetShareSourceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetShareSourceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetShareSourceInfo>() {
           @Override
           public void write(JsonWriter out, AssetShareSourceInfo value) throws IOException {
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
           public AssetShareSourceInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AssetShareSourceInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AssetShareSourceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetShareSourceInfo
  * @throws IOException if the JSON string is invalid with respect to AssetShareSourceInfo
  */
  public static AssetShareSourceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetShareSourceInfo.class);
  }

 /**
  * Convert an instance of AssetShareSourceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

