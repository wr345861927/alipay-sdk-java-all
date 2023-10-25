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
 * McardNotifyMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class McardNotifyMessage {
  public static final String SERIALIZED_NAME_CHANGE_REASON = "change_reason";
  @SerializedName(SERIALIZED_NAME_CHANGE_REASON)
  private String changeReason;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "message_type";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private String messageType;

  public McardNotifyMessage() { 
  }

  public McardNotifyMessage changeReason(String changeReason) {
    
    this.changeReason = changeReason;
    return this;
  }

   /**
   * 用户提醒信息，按如下格式拼装，需要ISV提供change_reason。  积分变动模板：{change_reason}，您的积分有变动  余额变动模板：{change_reason}，您的余额有变动  等级变更无需提供原因。
   * @return changeReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "由于你的消费", value = "用户提醒信息，按如下格式拼装，需要ISV提供change_reason。  积分变动模板：{change_reason}，您的积分有变动  余额变动模板：{change_reason}，您的余额有变动  等级变更无需提供原因。")

  public String getChangeReason() {
    return changeReason;
  }


  public void setChangeReason(String changeReason) {
    this.changeReason = changeReason;
  }


  public McardNotifyMessage extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * JSON格式扩展信息，主要是发送消息中的变量
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "JSON格式扩展信息，主要是发送消息中的变量")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public McardNotifyMessage messageType(String messageType) {
    
    this.messageType = messageType;
    return this;
  }

   /**
   * 消息类型，每种消息都定义了固定消息模板
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPEN_CARD", value = "消息类型，每种消息都定义了固定消息模板")

  public String getMessageType() {
    return messageType;
  }


  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    McardNotifyMessage mcardNotifyMessage = (McardNotifyMessage) o;
    return Objects.equals(this.changeReason, mcardNotifyMessage.changeReason) &&
        Objects.equals(this.extInfo, mcardNotifyMessage.extInfo) &&
        Objects.equals(this.messageType, mcardNotifyMessage.messageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeReason, extInfo, messageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McardNotifyMessage {\n");
    sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
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
    openapiFields.add("change_reason");
    openapiFields.add("ext_info");
    openapiFields.add("message_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to McardNotifyMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (McardNotifyMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in McardNotifyMessage is not found in the empty JSON string", McardNotifyMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!McardNotifyMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `McardNotifyMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("change_reason") != null && !jsonObj.get("change_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `change_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("change_reason").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("message_type") != null && !jsonObj.get("message_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!McardNotifyMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'McardNotifyMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<McardNotifyMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(McardNotifyMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<McardNotifyMessage>() {
           @Override
           public void write(JsonWriter out, McardNotifyMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public McardNotifyMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of McardNotifyMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of McardNotifyMessage
  * @throws IOException if the JSON string is invalid with respect to McardNotifyMessage
  */
  public static McardNotifyMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, McardNotifyMessage.class);
  }

 /**
  * Convert an instance of McardNotifyMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

