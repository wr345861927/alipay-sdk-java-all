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
 * DeliveryChannelInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryChannelInfo {
  public static final String SERIALIZED_NAME_BOOTH_CODE = "booth_code";
  @SerializedName(SERIALIZED_NAME_BOOTH_CODE)
  private String boothCode;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_CHANNEL_NAME = "channel_name";
  @SerializedName(SERIALIZED_NAME_CHANNEL_NAME)
  private String channelName;

  public DeliveryChannelInfo() { 
  }

  public DeliveryChannelInfo boothCode(String boothCode) {
    
    this.boothCode = boothCode;
    return this;
  }

   /**
   * 展位码:boothCode表达的是具体渠道所属的展位码。例如：支付结果页PAY_RESULT
   * @return boothCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAY_RESULT", value = "展位码:boothCode表达的是具体渠道所属的展位码。例如：支付结果页PAY_RESULT")

  public String getBoothCode() {
    return boothCode;
  }


  public void setBoothCode(String boothCode) {
    this.boothCode = boothCode;
  }


  public DeliveryChannelInfo channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * 可投放的渠道标识.  说明： 针对不同的boot_code，channel值各不相同.接口使用者可以认为channel是不同booth_code展位下的渠道的唯一标识。  例如： booth_code为PAYMENT_RESULT。 channel为某个商户的pid。
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxx", value = "可投放的渠道标识.  说明： 针对不同的boot_code，channel值各不相同.接口使用者可以认为channel是不同booth_code展位下的渠道的唯一标识。  例如： booth_code为PAYMENT_RESULT。 channel为某个商户的pid。")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public DeliveryChannelInfo channelName(String channelName) {
    
    this.channelName = channelName;
    return this;
  }

   /**
   * 渠道的名称。  说明： booth_code：PAYMENT_RESULT，channel_name为商户名称。
   * @return channelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝官方搜索box", value = "渠道的名称。  说明： booth_code：PAYMENT_RESULT，channel_name为商户名称。")

  public String getChannelName() {
    return channelName;
  }


  public void setChannelName(String channelName) {
    this.channelName = channelName;
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
   * @return the DeliveryChannelInfo instance itself
   */
  public DeliveryChannelInfo putAdditionalProperty(String key, Object value) {
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
    DeliveryChannelInfo deliveryChannelInfo = (DeliveryChannelInfo) o;
    return Objects.equals(this.boothCode, deliveryChannelInfo.boothCode) &&
        Objects.equals(this.channel, deliveryChannelInfo.channel) &&
        Objects.equals(this.channelName, deliveryChannelInfo.channelName)&&
        Objects.equals(this.additionalProperties, deliveryChannelInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boothCode, channel, channelName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryChannelInfo {\n");
    sb.append("    boothCode: ").append(toIndentedString(boothCode)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
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
    openapiFields.add("booth_code");
    openapiFields.add("channel");
    openapiFields.add("channel_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryChannelInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryChannelInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryChannelInfo is not found in the empty JSON string", DeliveryChannelInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("booth_code") != null && !jsonObj.get("booth_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `booth_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("booth_code").toString()));
      }
      if (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if (jsonObj.get("channel_name") != null && !jsonObj.get("channel_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryChannelInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryChannelInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryChannelInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryChannelInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryChannelInfo>() {
           @Override
           public void write(JsonWriter out, DeliveryChannelInfo value) throws IOException {
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
           public DeliveryChannelInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeliveryChannelInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeliveryChannelInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryChannelInfo
  * @throws IOException if the JSON string is invalid with respect to DeliveryChannelInfo
  */
  public static DeliveryChannelInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryChannelInfo.class);
  }

 /**
  * Convert an instance of DeliveryChannelInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

