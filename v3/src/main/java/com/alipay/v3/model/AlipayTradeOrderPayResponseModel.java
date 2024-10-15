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
 * AlipayTradeOrderPayResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeOrderPayResponseModel {
  public static final String SERIALIZED_NAME_ASYNC_PAYMENT_MODE = "async_payment_mode";
  @SerializedName(SERIALIZED_NAME_ASYNC_PAYMENT_MODE)
  private String asyncPaymentMode;

  public static final String SERIALIZED_NAME_FULFILLMENT_AMOUNT = "fulfillment_amount";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_AMOUNT)
  private String fulfillmentAmount;

  public static final String SERIALIZED_NAME_GMT_PAYMENT = "gmt_payment";
  @SerializedName(SERIALIZED_NAME_GMT_PAYMENT)
  private String gmtPayment;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeOrderPayResponseModel() { 
  }

  public AlipayTradeOrderPayResponseModel asyncPaymentMode(String asyncPaymentMode) {
    
    this.asyncPaymentMode = asyncPaymentMode;
    return this;
  }

   /**
   * 异步支付模式。订单使用异步支付模式时才有值。 目前有五种值： ASYNC_DELAY_PAY(异步延时付款); ASYNC_REALTIME_PAY(异步准实时付款); SYNC_DIRECT_PAY(同步直接扣款); NORMAL_ASYNC_PAY(纯异步付款); QUOTA_OCCUPYIED_ASYNC_PAY(异步支付并且预占了先享后付额度);
   * @return asyncPaymentMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL_ASYNC_PAY", value = "异步支付模式。订单使用异步支付模式时才有值。 目前有五种值： ASYNC_DELAY_PAY(异步延时付款); ASYNC_REALTIME_PAY(异步准实时付款); SYNC_DIRECT_PAY(同步直接扣款); NORMAL_ASYNC_PAY(纯异步付款); QUOTA_OCCUPYIED_ASYNC_PAY(异步支付并且预占了先享后付额度);")

  public String getAsyncPaymentMode() {
    return asyncPaymentMode;
  }


  public void setAsyncPaymentMode(String asyncPaymentMode) {
    this.asyncPaymentMode = asyncPaymentMode;
  }


  public AlipayTradeOrderPayResponseModel fulfillmentAmount(String fulfillmentAmount) {
    
    this.fulfillmentAmount = fulfillmentAmount;
    return this;
  }

   /**
   * 实际履约金额，单位（元）。仅履约场景才会返回
   * @return fulfillmentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.24", value = "实际履约金额，单位（元）。仅履约场景才会返回")

  public String getFulfillmentAmount() {
    return fulfillmentAmount;
  }


  public void setFulfillmentAmount(String fulfillmentAmount) {
    this.fulfillmentAmount = fulfillmentAmount;
  }


  public AlipayTradeOrderPayResponseModel gmtPayment(String gmtPayment) {
    
    this.gmtPayment = gmtPayment;
    return this;
  }

   /**
   * 交易支付时间
   * @return gmtPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-17 09:45:57", value = "交易支付时间")

  public String getGmtPayment() {
    return gmtPayment;
  }


  public void setGmtPayment(String gmtPayment) {
    this.gmtPayment = gmtPayment;
  }


  public AlipayTradeOrderPayResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户请求号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180623001001", value = "商户请求号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeOrderPayResponseModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 商户订单号
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180623001001", value = "商户订单号")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayTradeOrderPayResponseModel totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 订单总金额。元为单元，精确到2位小数。
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120.88", value = "订单总金额。元为单元，精确到2位小数。")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public AlipayTradeOrderPayResponseModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018062721001004150200645134", value = "支付宝交易号")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
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
   * @return the AlipayTradeOrderPayResponseModel instance itself
   */
  public AlipayTradeOrderPayResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeOrderPayResponseModel alipayTradeOrderPayResponseModel = (AlipayTradeOrderPayResponseModel) o;
    return Objects.equals(this.asyncPaymentMode, alipayTradeOrderPayResponseModel.asyncPaymentMode) &&
        Objects.equals(this.fulfillmentAmount, alipayTradeOrderPayResponseModel.fulfillmentAmount) &&
        Objects.equals(this.gmtPayment, alipayTradeOrderPayResponseModel.gmtPayment) &&
        Objects.equals(this.outRequestNo, alipayTradeOrderPayResponseModel.outRequestNo) &&
        Objects.equals(this.outTradeNo, alipayTradeOrderPayResponseModel.outTradeNo) &&
        Objects.equals(this.totalAmount, alipayTradeOrderPayResponseModel.totalAmount) &&
        Objects.equals(this.tradeNo, alipayTradeOrderPayResponseModel.tradeNo)&&
        Objects.equals(this.additionalProperties, alipayTradeOrderPayResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asyncPaymentMode, fulfillmentAmount, gmtPayment, outRequestNo, outTradeNo, totalAmount, tradeNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeOrderPayResponseModel {\n");
    sb.append("    asyncPaymentMode: ").append(toIndentedString(asyncPaymentMode)).append("\n");
    sb.append("    fulfillmentAmount: ").append(toIndentedString(fulfillmentAmount)).append("\n");
    sb.append("    gmtPayment: ").append(toIndentedString(gmtPayment)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("async_payment_mode");
    openapiFields.add("fulfillment_amount");
    openapiFields.add("gmt_payment");
    openapiFields.add("out_request_no");
    openapiFields.add("out_trade_no");
    openapiFields.add("total_amount");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeOrderPayResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeOrderPayResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeOrderPayResponseModel is not found in the empty JSON string", AlipayTradeOrderPayResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("async_payment_mode") != null && !jsonObj.get("async_payment_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `async_payment_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("async_payment_mode").toString()));
      }
      if (jsonObj.get("fulfillment_amount") != null && !jsonObj.get("fulfillment_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillment_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillment_amount").toString()));
      }
      if (jsonObj.get("gmt_payment") != null && !jsonObj.get("gmt_payment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_payment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_payment").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeOrderPayResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeOrderPayResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeOrderPayResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeOrderPayResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeOrderPayResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeOrderPayResponseModel value) throws IOException {
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
           public AlipayTradeOrderPayResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeOrderPayResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeOrderPayResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeOrderPayResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeOrderPayResponseModel
  */
  public static AlipayTradeOrderPayResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeOrderPayResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeOrderPayResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

