/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-10-25
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
 * CardUserInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CardUserInfo {
  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_USER_UNI_ID = "user_uni_id";
  @SerializedName(SERIALIZED_NAME_USER_UNI_ID)
  private String userUniId;

  public static final String SERIALIZED_NAME_USER_UNI_ID_TYPE = "user_uni_id_type";
  @SerializedName(SERIALIZED_NAME_USER_UNI_ID_TYPE)
  private String userUniIdType;

  public CardUserInfo() { 
  }

  public CardUserInfo openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户open_id
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户open_id")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public CardUserInfo userUniId(String userUniId) {
    
    this.userUniId = userUniId;
    return this;
  }

   /**
   * 用户唯一标识, 根据user_uni_id_type类型来定 （目前暂支持支付宝userId）  支付宝userId说明：支付宝用户号是以2088开头的16位纯数字组成
   * @return userUniId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户唯一标识, 根据user_uni_id_type类型来定 （目前暂支持支付宝userId）  支付宝userId说明：支付宝用户号是以2088开头的16位纯数字组成")

  public String getUserUniId() {
    return userUniId;
  }


  public void setUserUniId(String userUniId) {
    this.userUniId = userUniId;
  }


  public CardUserInfo userUniIdType(String userUniIdType) {
    
    this.userUniIdType = userUniIdType;
    return this;
  }

   /**
   * 用户唯一标识类型
   * @return userUniIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户唯一标识类型")

  public String getUserUniIdType() {
    return userUniIdType;
  }


  public void setUserUniIdType(String userUniIdType) {
    this.userUniIdType = userUniIdType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardUserInfo cardUserInfo = (CardUserInfo) o;
    return Objects.equals(this.openId, cardUserInfo.openId) &&
        Objects.equals(this.userUniId, cardUserInfo.userUniId) &&
        Objects.equals(this.userUniIdType, cardUserInfo.userUniIdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openId, userUniId, userUniIdType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardUserInfo {\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    userUniId: ").append(toIndentedString(userUniId)).append("\n");
    sb.append("    userUniIdType: ").append(toIndentedString(userUniIdType)).append("\n");
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
    openapiFields.add("open_id");
    openapiFields.add("user_uni_id");
    openapiFields.add("user_uni_id_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardUserInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CardUserInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardUserInfo is not found in the empty JSON string", CardUserInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CardUserInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CardUserInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("user_uni_id") != null && !jsonObj.get("user_uni_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_uni_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_uni_id").toString()));
      }
      if (jsonObj.get("user_uni_id_type") != null && !jsonObj.get("user_uni_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_uni_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_uni_id_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardUserInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardUserInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardUserInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardUserInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CardUserInfo>() {
           @Override
           public void write(JsonWriter out, CardUserInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardUserInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardUserInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardUserInfo
  * @throws IOException if the JSON string is invalid with respect to CardUserInfo
  */
  public static CardUserInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardUserInfo.class);
  }

 /**
  * Convert an instance of CardUserInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

