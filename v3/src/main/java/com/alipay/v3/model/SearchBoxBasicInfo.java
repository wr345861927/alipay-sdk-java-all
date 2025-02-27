/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
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
 * SearchBoxBasicInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchBoxBasicInfo {
  public static final String SERIALIZED_NAME_BOX_ID = "box_id";
  @SerializedName(SERIALIZED_NAME_BOX_ID)
  private String boxId;

  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TARGET_APPID = "target_appid";
  @SerializedName(SERIALIZED_NAME_TARGET_APPID)
  private String targetAppid;

  public SearchBoxBasicInfo() { 
  }

  public SearchBoxBasicInfo boxId(String boxId) {
    
    this.boxId = boxId;
    return this;
  }

   /**
   * 搜索直达配置id
   * @return boxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220117000000112680", value = "搜索直达配置id")

  public String getBoxId() {
    return boxId;
  }


  public void setBoxId(String boxId) {
    this.boxId = boxId;
  }


  public SearchBoxBasicInfo brandId(String brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 品牌id
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000467882", value = "品牌id")

  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public SearchBoxBasicInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 搜索直达名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "搜索直达名称", value = "搜索直达名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SearchBoxBasicInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 搜索直达配置状态，INITIAL-初始/ONLINE-已上架/EXPIRE-已失效/OFFLINE-已下架
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ONLINE", value = "搜索直达配置状态，INITIAL-初始/ONLINE-已上架/EXPIRE-已失效/OFFLINE-已下架")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public SearchBoxBasicInfo targetAppid(String targetAppid) {
    
    this.targetAppid = targetAppid;
    return this;
  }

   /**
   * 小程序id
   * @return targetAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018092561507369", value = "小程序id")

  public String getTargetAppid() {
    return targetAppid;
  }


  public void setTargetAppid(String targetAppid) {
    this.targetAppid = targetAppid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBoxBasicInfo searchBoxBasicInfo = (SearchBoxBasicInfo) o;
    return Objects.equals(this.boxId, searchBoxBasicInfo.boxId) &&
        Objects.equals(this.brandId, searchBoxBasicInfo.brandId) &&
        Objects.equals(this.name, searchBoxBasicInfo.name) &&
        Objects.equals(this.status, searchBoxBasicInfo.status) &&
        Objects.equals(this.targetAppid, searchBoxBasicInfo.targetAppid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxId, brandId, name, status, targetAppid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBoxBasicInfo {\n");
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetAppid: ").append(toIndentedString(targetAppid)).append("\n");
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
    openapiFields.add("box_id");
    openapiFields.add("brand_id");
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("target_appid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchBoxBasicInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchBoxBasicInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchBoxBasicInfo is not found in the empty JSON string", SearchBoxBasicInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchBoxBasicInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchBoxBasicInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("box_id") != null && !jsonObj.get("box_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_id").toString()));
      }
      if (jsonObj.get("brand_id") != null && !jsonObj.get("brand_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("target_appid") != null && !jsonObj.get("target_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchBoxBasicInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchBoxBasicInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchBoxBasicInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchBoxBasicInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchBoxBasicInfo>() {
           @Override
           public void write(JsonWriter out, SearchBoxBasicInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchBoxBasicInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchBoxBasicInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchBoxBasicInfo
  * @throws IOException if the JSON string is invalid with respect to SearchBoxBasicInfo
  */
  public static SearchBoxBasicInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchBoxBasicInfo.class);
  }

 /**
  * Convert an instance of SearchBoxBasicInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

