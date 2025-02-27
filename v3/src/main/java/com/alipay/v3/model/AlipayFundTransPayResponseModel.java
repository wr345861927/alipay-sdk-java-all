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
 * AlipayFundTransPayResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundTransPayResponseModel {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PAY_FUND_ORDER_ID = "pay_fund_order_id";
  @SerializedName(SERIALIZED_NAME_PAY_FUND_ORDER_ID)
  private String payFundOrderId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRANS_PAY_TIME = "trans_pay_time";
  @SerializedName(SERIALIZED_NAME_TRANS_PAY_TIME)
  private String transPayTime;

  public AlipayFundTransPayResponseModel() { 
  }

  public AlipayFundTransPayResponseModel orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 该笔转账在支付宝系统内部的单据ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180629110070001502040007320562", value = "该笔转账在支付宝系统内部的单据ID")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public AlipayFundTransPayResponseModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 商户端的唯一订单号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201806300001", value = "商户端的唯一订单号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayFundTransPayResponseModel payFundOrderId(String payFundOrderId) {
    
    this.payFundOrderId = payFundOrderId;
    return this;
  }

   /**
   * 支付宝支付资金流水号
   * @return payFundOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190801110070001506380000251556", value = "支付宝支付资金流水号")

  public String getPayFundOrderId() {
    return payFundOrderId;
  }


  public void setPayFundOrderId(String payFundOrderId) {
    this.payFundOrderId = payFundOrderId;
  }


  public AlipayFundTransPayResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * SUCCESS：支付成功；  FAIL：支付失败；  UNKNOWN：未知；建议通过查询确认最新状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "SUCCESS：支付成功；  FAIL：支付失败；  UNKNOWN：未知；建议通过查询确认最新状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayFundTransPayResponseModel transPayTime(String transPayTime) {
    
    this.transPayTime = transPayTime;
    return this;
  }

   /**
   * 订单支付时间，格式为yyyy-MM-dd HH:mm:ss
   * @return transPayTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-08-21 00:00:00", value = "订单支付时间，格式为yyyy-MM-dd HH:mm:ss")

  public String getTransPayTime() {
    return transPayTime;
  }


  public void setTransPayTime(String transPayTime) {
    this.transPayTime = transPayTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundTransPayResponseModel alipayFundTransPayResponseModel = (AlipayFundTransPayResponseModel) o;
    return Objects.equals(this.orderId, alipayFundTransPayResponseModel.orderId) &&
        Objects.equals(this.outBizNo, alipayFundTransPayResponseModel.outBizNo) &&
        Objects.equals(this.payFundOrderId, alipayFundTransPayResponseModel.payFundOrderId) &&
        Objects.equals(this.status, alipayFundTransPayResponseModel.status) &&
        Objects.equals(this.transPayTime, alipayFundTransPayResponseModel.transPayTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, outBizNo, payFundOrderId, status, transPayTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundTransPayResponseModel {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    payFundOrderId: ").append(toIndentedString(payFundOrderId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transPayTime: ").append(toIndentedString(transPayTime)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("out_biz_no");
    openapiFields.add("pay_fund_order_id");
    openapiFields.add("status");
    openapiFields.add("trans_pay_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundTransPayResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundTransPayResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundTransPayResponseModel is not found in the empty JSON string", AlipayFundTransPayResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundTransPayResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundTransPayResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("pay_fund_order_id") != null && !jsonObj.get("pay_fund_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_fund_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_fund_order_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("trans_pay_time") != null && !jsonObj.get("trans_pay_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_pay_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_pay_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundTransPayResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundTransPayResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundTransPayResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundTransPayResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundTransPayResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundTransPayResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundTransPayResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundTransPayResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundTransPayResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundTransPayResponseModel
  */
  public static AlipayFundTransPayResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundTransPayResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundTransPayResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

