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
 * AlipayTradeRefundApplyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeRefundApplyResponseModel {
  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private String refundAmount;

  public static final String SERIALIZED_NAME_REFUND_STATUS = "refund_status";
  @SerializedName(SERIALIZED_NAME_REFUND_STATUS)
  private String refundStatus;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeRefundApplyResponseModel() { 
  }

  public AlipayTradeRefundApplyResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 本笔退款对应的退款请求号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HZ01RF001", value = "本笔退款对应的退款请求号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeRefundApplyResponseModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 商户订单号
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20150320010101001", value = "商户订单号")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayTradeRefundApplyResponseModel refundAmount(String refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 本次退款请求，对应的退款金额
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200.12", value = "本次退款请求，对应的退款金额")

  public String getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
  }


  public AlipayTradeRefundApplyResponseModel refundStatus(String refundStatus) {
    
    this.refundStatus = refundStatus;
    return this;
  }

   /**
   * REFUND_PROCESSING 退款处理中；REFUND_SUCCESS 退款处理成功；REFUND_FAIL 退款失败
   * @return refundStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "REFUND_PROCESSING", value = "REFUND_PROCESSING 退款处理中；REFUND_SUCCESS 退款处理成功；REFUND_FAIL 退款失败")

  public String getRefundStatus() {
    return refundStatus;
  }


  public void setRefundStatus(String refundStatus) {
    this.refundStatus = refundStatus;
  }


  public AlipayTradeRefundApplyResponseModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014112611001004680073956707", value = "支付宝交易号")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeRefundApplyResponseModel alipayTradeRefundApplyResponseModel = (AlipayTradeRefundApplyResponseModel) o;
    return Objects.equals(this.outRequestNo, alipayTradeRefundApplyResponseModel.outRequestNo) &&
        Objects.equals(this.outTradeNo, alipayTradeRefundApplyResponseModel.outTradeNo) &&
        Objects.equals(this.refundAmount, alipayTradeRefundApplyResponseModel.refundAmount) &&
        Objects.equals(this.refundStatus, alipayTradeRefundApplyResponseModel.refundStatus) &&
        Objects.equals(this.tradeNo, alipayTradeRefundApplyResponseModel.tradeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outRequestNo, outTradeNo, refundAmount, refundStatus, tradeNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeRefundApplyResponseModel {\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("out_request_no");
    openapiFields.add("out_trade_no");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_status");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeRefundApplyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeRefundApplyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeRefundApplyResponseModel is not found in the empty JSON string", AlipayTradeRefundApplyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeRefundApplyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeRefundApplyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      if (jsonObj.get("refund_amount") != null && !jsonObj.get("refund_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_amount").toString()));
      }
      if (jsonObj.get("refund_status") != null && !jsonObj.get("refund_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_status").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeRefundApplyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeRefundApplyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeRefundApplyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeRefundApplyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeRefundApplyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeRefundApplyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeRefundApplyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeRefundApplyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeRefundApplyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeRefundApplyResponseModel
  */
  public static AlipayTradeRefundApplyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeRefundApplyResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeRefundApplyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

