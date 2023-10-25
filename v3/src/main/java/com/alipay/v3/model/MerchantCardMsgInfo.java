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
 * MerchantCardMsgInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantCardMsgInfo {
  public static final String SERIALIZED_NAME_CHANGED_POINT = "changed_point";
  @SerializedName(SERIALIZED_NAME_CHANGED_POINT)
  private String changedPoint;

  public MerchantCardMsgInfo() { 
  }

  public MerchantCardMsgInfo changedPoint(String changedPoint) {
    
    this.changedPoint = changedPoint;
    return this;
  }

   /**
   * 本次消息通知的变动积分，积分必须为数字型（可为浮点型，带2位小数点），格式非法则不发送消息。例如： 100，则代表增加100积分。 -100，则代表减少100积分。
   * @return changedPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "本次消息通知的变动积分，积分必须为数字型（可为浮点型，带2位小数点），格式非法则不发送消息。例如： 100，则代表增加100积分。 -100，则代表减少100积分。")

  public String getChangedPoint() {
    return changedPoint;
  }


  public void setChangedPoint(String changedPoint) {
    this.changedPoint = changedPoint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantCardMsgInfo merchantCardMsgInfo = (MerchantCardMsgInfo) o;
    return Objects.equals(this.changedPoint, merchantCardMsgInfo.changedPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantCardMsgInfo {\n");
    sb.append("    changedPoint: ").append(toIndentedString(changedPoint)).append("\n");
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
    openapiFields.add("changed_point");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantCardMsgInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantCardMsgInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantCardMsgInfo is not found in the empty JSON string", MerchantCardMsgInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantCardMsgInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantCardMsgInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("changed_point") != null && !jsonObj.get("changed_point").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changed_point` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changed_point").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantCardMsgInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantCardMsgInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantCardMsgInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantCardMsgInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantCardMsgInfo>() {
           @Override
           public void write(JsonWriter out, MerchantCardMsgInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantCardMsgInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantCardMsgInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantCardMsgInfo
  * @throws IOException if the JSON string is invalid with respect to MerchantCardMsgInfo
  */
  public static MerchantCardMsgInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantCardMsgInfo.class);
  }

 /**
  * Convert an instance of MerchantCardMsgInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

