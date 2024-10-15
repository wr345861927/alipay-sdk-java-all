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
 * TicketInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TicketInfo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_RESV_TYPE = "resv_type";
  @SerializedName(SERIALIZED_NAME_RESV_TYPE)
  private String resvType;

  public static final String SERIALIZED_NAME_SHOP = "shop";
  @SerializedName(SERIALIZED_NAME_SHOP)
  private String shop;

  public static final String SERIALIZED_NAME_TICKET_NO = "ticket_no";
  @SerializedName(SERIALIZED_NAME_TICKET_NO)
  private String ticketNo;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public TicketInfo() { 
  }

  public TicketInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 店铺地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "上海市南泉北路447号", value = "店铺地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public TicketInfo endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 截止时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-21 11:30:00", value = "截止时间")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public TicketInfo resvType(String resvType) {
    
    this.resvType = resvType;
    return this;
  }

   /**
   * 凭证预约类型，一般不需要传入。可选值为INSTANT/RESERVATION，其中INSTANT代表是实时凭证，RESERVATION代表是预约凭证，不传入默认为实时凭证。区别在于预约凭证一般不是当场可取，而是用户下单后的很多天之后才可以凭借凭证提取
   * @return resvType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RESERVATION", value = "凭证预约类型，一般不需要传入。可选值为INSTANT/RESERVATION，其中INSTANT代表是实时凭证，RESERVATION代表是预约凭证，不传入默认为实时凭证。区别在于预约凭证一般不是当场可取，而是用户下单后的很多天之后才可以凭借凭证提取")

  public String getResvType() {
    return resvType;
  }


  public void setResvType(String resvType) {
    this.resvType = resvType;
  }


  public TicketInfo shop(String shop) {
    
    this.shop = shop;
    return this;
  }

   /**
   * 凭证可核销门店/货品自提门店，如果自提门店与购买门店不一致，可传入该字段提示用户自提门店
   * @return shop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州面馆西溪路店", value = "凭证可核销门店/货品自提门店，如果自提门店与购买门店不一致，可传入该字段提示用户自提门店")

  public String getShop() {
    return shop;
  }


  public void setShop(String shop) {
    this.shop = shop;
  }


  public TicketInfo ticketNo(String ticketNo) {
    
    this.ticketNo = ticketNo;
    return this;
  }

   /**
   * 单据号 不同类型下单据号含义不同。若类型为MEAL_NUM，则ticket_no表示取餐号；若类型为PICKUP_CODE，则ticket_no表示取件码；其他类型查看小程序订单产品文档
   * @return ticketNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A0001", value = "单据号 不同类型下单据号含义不同。若类型为MEAL_NUM，则ticket_no表示取餐号；若类型为PICKUP_CODE，则ticket_no表示取件码；其他类型查看小程序订单产品文档")

  public String getTicketNo() {
    return ticketNo;
  }


  public void setTicketNo(String ticketNo) {
    this.ticketNo = ticketNo;
  }


  public TicketInfo time(String time) {
    
    this.time = time;
    return this;
  }

   /**
   * 时间
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-21 11:02:02", value = "时间")

  public String getTime() {
    return time;
  }


  public void setTime(String time) {
    this.time = time;
  }


  public TicketInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 凭证类型 具体类型查看产品文档
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MEAL_NUM", value = "凭证类型 具体类型查看产品文档")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
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
   * @return the TicketInfo instance itself
   */
  public TicketInfo putAdditionalProperty(String key, Object value) {
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
    TicketInfo ticketInfo = (TicketInfo) o;
    return Objects.equals(this.address, ticketInfo.address) &&
        Objects.equals(this.endTime, ticketInfo.endTime) &&
        Objects.equals(this.resvType, ticketInfo.resvType) &&
        Objects.equals(this.shop, ticketInfo.shop) &&
        Objects.equals(this.ticketNo, ticketInfo.ticketNo) &&
        Objects.equals(this.time, ticketInfo.time) &&
        Objects.equals(this.type, ticketInfo.type)&&
        Objects.equals(this.additionalProperties, ticketInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, endTime, resvType, shop, ticketNo, time, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketInfo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    resvType: ").append(toIndentedString(resvType)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    ticketNo: ").append(toIndentedString(ticketNo)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("end_time");
    openapiFields.add("resv_type");
    openapiFields.add("shop");
    openapiFields.add("ticket_no");
    openapiFields.add("time");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TicketInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TicketInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TicketInfo is not found in the empty JSON string", TicketInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("resv_type") != null && !jsonObj.get("resv_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resv_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resv_type").toString()));
      }
      if (jsonObj.get("shop") != null && !jsonObj.get("shop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop").toString()));
      }
      if (jsonObj.get("ticket_no") != null && !jsonObj.get("ticket_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticket_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticket_no").toString()));
      }
      if (jsonObj.get("time") != null && !jsonObj.get("time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TicketInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TicketInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TicketInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TicketInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TicketInfo>() {
           @Override
           public void write(JsonWriter out, TicketInfo value) throws IOException {
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
           public TicketInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TicketInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TicketInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TicketInfo
  * @throws IOException if the JSON string is invalid with respect to TicketInfo
  */
  public static TicketInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TicketInfo.class);
  }

 /**
  * Convert an instance of TicketInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

