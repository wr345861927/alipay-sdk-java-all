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
 * PromoDeliveryInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PromoDeliveryInfo {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_BOOTH_CODE = "booth_code";
  @SerializedName(SERIALIZED_NAME_BOOTH_CODE)
  private String boothCode;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_CHANNEL_NAME = "channel_name";
  @SerializedName(SERIALIZED_NAME_CHANNEL_NAME)
  private String channelName;

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "delivery_status";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private String deliveryStatus;

  public PromoDeliveryInfo() { 
  }

  public PromoDeliveryInfo activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动id
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016042700826004508401111111", value = "活动id")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public PromoDeliveryInfo boothCode(String boothCode) {
    
    this.boothCode = boothCode;
    return this;
  }

   /**
   * 展位码:boothCode表达的是具体渠道所属的展位码。例如：支付结果页PAYMENT_RESULT
   * @return boothCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAYMENT_RESULT", value = "展位码:boothCode表达的是具体渠道所属的展位码。例如：支付结果页PAYMENT_RESULT")

  public String getBoothCode() {
    return boothCode;
  }


  public void setBoothCode(String boothCode) {
    this.boothCode = boothCode;
  }


  public PromoDeliveryInfo channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * 可投放的渠道标识.
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxx", value = "可投放的渠道标识.")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public PromoDeliveryInfo channelName(String channelName) {
    
    this.channelName = channelName;
    return this;
  }

   /**
   * 渠道名称
   * @return channelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝官方渠道", value = "渠道名称")

  public String getChannelName() {
    return channelName;
  }


  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }


  public PromoDeliveryInfo deliveryStatus(String deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * 投放状态。
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVE", value = "投放状态。")

  public String getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
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
   * @return the PromoDeliveryInfo instance itself
   */
  public PromoDeliveryInfo putAdditionalProperty(String key, Object value) {
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
    PromoDeliveryInfo promoDeliveryInfo = (PromoDeliveryInfo) o;
    return Objects.equals(this.activityId, promoDeliveryInfo.activityId) &&
        Objects.equals(this.boothCode, promoDeliveryInfo.boothCode) &&
        Objects.equals(this.channel, promoDeliveryInfo.channel) &&
        Objects.equals(this.channelName, promoDeliveryInfo.channelName) &&
        Objects.equals(this.deliveryStatus, promoDeliveryInfo.deliveryStatus)&&
        Objects.equals(this.additionalProperties, promoDeliveryInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, boothCode, channel, channelName, deliveryStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoDeliveryInfo {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    boothCode: ").append(toIndentedString(boothCode)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("booth_code");
    openapiFields.add("channel");
    openapiFields.add("channel_name");
    openapiFields.add("delivery_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PromoDeliveryInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PromoDeliveryInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromoDeliveryInfo is not found in the empty JSON string", PromoDeliveryInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
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
      if (jsonObj.get("delivery_status") != null && !jsonObj.get("delivery_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromoDeliveryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromoDeliveryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromoDeliveryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromoDeliveryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PromoDeliveryInfo>() {
           @Override
           public void write(JsonWriter out, PromoDeliveryInfo value) throws IOException {
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
           public PromoDeliveryInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PromoDeliveryInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PromoDeliveryInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromoDeliveryInfo
  * @throws IOException if the JSON string is invalid with respect to PromoDeliveryInfo
  */
  public static PromoDeliveryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromoDeliveryInfo.class);
  }

 /**
  * Convert an instance of PromoDeliveryInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

