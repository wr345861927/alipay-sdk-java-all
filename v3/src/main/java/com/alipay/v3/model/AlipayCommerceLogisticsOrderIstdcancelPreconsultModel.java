/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
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
 * AlipayCommerceLogisticsOrderIstdcancelPreconsultModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceLogisticsOrderIstdcancelPreconsultModel {
  public static final String SERIALIZED_NAME_CANCEL_REASON = "cancel_reason";
  @SerializedName(SERIALIZED_NAME_CANCEL_REASON)
  private String cancelReason;

  public static final String SERIALIZED_NAME_CANCEL_REASON_ID = "cancel_reason_id";
  @SerializedName(SERIALIZED_NAME_CANCEL_REASON_ID)
  private String cancelReasonId;

  public static final String SERIALIZED_NAME_LOGISTICS_CODE = "logistics_code";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_CODE)
  private String logisticsCode;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_WAYBILL_NO = "waybill_no";
  @SerializedName(SERIALIZED_NAME_WAYBILL_NO)
  private String waybillNo;

  public AlipayCommerceLogisticsOrderIstdcancelPreconsultModel() { 
  }

  public AlipayCommerceLogisticsOrderIstdcancelPreconsultModel cancelReason(String cancelReason) {
    
    this.cancelReason = cancelReason;
    return this;
  }

   /**
   * 取消原因，取消原因id为i_6时必填
   * @return cancelReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "其他原因取消运单", value = "取消原因，取消原因id为i_6时必填")

  public String getCancelReason() {
    return cancelReason;
  }


  public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
  }


  public AlipayCommerceLogisticsOrderIstdcancelPreconsultModel cancelReasonId(String cancelReasonId) {
    
    this.cancelReasonId = cancelReasonId;
    return this;
  }

   /**
   * 取消原因id
   * @return cancelReasonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "i_6", value = "取消原因id")

  public String getCancelReasonId() {
    return cancelReasonId;
  }


  public void setCancelReasonId(String cancelReasonId) {
    this.cancelReasonId = cancelReasonId;
  }


  public AlipayCommerceLogisticsOrderIstdcancelPreconsultModel logisticsCode(String logisticsCode) {
    
    this.logisticsCode = logisticsCode;
    return this;
  }

   /**
   * 即时配送公司编码
   * @return logisticsCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FENGNIAO", value = "即时配送公司编码")

  public String getLogisticsCode() {
    return logisticsCode;
  }


  public void setLogisticsCode(String logisticsCode) {
    this.logisticsCode = logisticsCode;
  }


  public AlipayCommerceLogisticsOrderIstdcancelPreconsultModel orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 支付宝订单流水号
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090411130000000000772400280352", value = "支付宝订单流水号")

  public String getOrderNo() {
    return orderNo;
  }


  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public AlipayCommerceLogisticsOrderIstdcancelPreconsultModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 商家订单号，与order_no不能同时为空
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090411140000000000777000216122", value = "商家订单号，与order_no不能同时为空")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public AlipayCommerceLogisticsOrderIstdcancelPreconsultModel waybillNo(String waybillNo) {
    
    this.waybillNo = waybillNo;
    return this;
  }

   /**
   * 即时配送运单编号
   * @return waybillNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "waybillno001", value = "即时配送运单编号")

  public String getWaybillNo() {
    return waybillNo;
  }


  public void setWaybillNo(String waybillNo) {
    this.waybillNo = waybillNo;
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
   * @return the AlipayCommerceLogisticsOrderIstdcancelPreconsultModel instance itself
   */
  public AlipayCommerceLogisticsOrderIstdcancelPreconsultModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceLogisticsOrderIstdcancelPreconsultModel alipayCommerceLogisticsOrderIstdcancelPreconsultModel = (AlipayCommerceLogisticsOrderIstdcancelPreconsultModel) o;
    return Objects.equals(this.cancelReason, alipayCommerceLogisticsOrderIstdcancelPreconsultModel.cancelReason) &&
        Objects.equals(this.cancelReasonId, alipayCommerceLogisticsOrderIstdcancelPreconsultModel.cancelReasonId) &&
        Objects.equals(this.logisticsCode, alipayCommerceLogisticsOrderIstdcancelPreconsultModel.logisticsCode) &&
        Objects.equals(this.orderNo, alipayCommerceLogisticsOrderIstdcancelPreconsultModel.orderNo) &&
        Objects.equals(this.outOrderNo, alipayCommerceLogisticsOrderIstdcancelPreconsultModel.outOrderNo) &&
        Objects.equals(this.waybillNo, alipayCommerceLogisticsOrderIstdcancelPreconsultModel.waybillNo)&&
        Objects.equals(this.additionalProperties, alipayCommerceLogisticsOrderIstdcancelPreconsultModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelReason, cancelReasonId, logisticsCode, orderNo, outOrderNo, waybillNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceLogisticsOrderIstdcancelPreconsultModel {\n");
    sb.append("    cancelReason: ").append(toIndentedString(cancelReason)).append("\n");
    sb.append("    cancelReasonId: ").append(toIndentedString(cancelReasonId)).append("\n");
    sb.append("    logisticsCode: ").append(toIndentedString(logisticsCode)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    waybillNo: ").append(toIndentedString(waybillNo)).append("\n");
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
    openapiFields.add("cancel_reason");
    openapiFields.add("cancel_reason_id");
    openapiFields.add("logistics_code");
    openapiFields.add("order_no");
    openapiFields.add("out_order_no");
    openapiFields.add("waybill_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceLogisticsOrderIstdcancelPreconsultModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceLogisticsOrderIstdcancelPreconsultModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceLogisticsOrderIstdcancelPreconsultModel is not found in the empty JSON string", AlipayCommerceLogisticsOrderIstdcancelPreconsultModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("cancel_reason") != null && !jsonObj.get("cancel_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancel_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancel_reason").toString()));
      }
      if (jsonObj.get("cancel_reason_id") != null && !jsonObj.get("cancel_reason_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancel_reason_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancel_reason_id").toString()));
      }
      if (jsonObj.get("logistics_code") != null && !jsonObj.get("logistics_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logistics_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logistics_code").toString()));
      }
      if (jsonObj.get("order_no") != null && !jsonObj.get("order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_no").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
      if (jsonObj.get("waybill_no") != null && !jsonObj.get("waybill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waybill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waybill_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceLogisticsOrderIstdcancelPreconsultModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceLogisticsOrderIstdcancelPreconsultModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceLogisticsOrderIstdcancelPreconsultModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceLogisticsOrderIstdcancelPreconsultModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceLogisticsOrderIstdcancelPreconsultModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceLogisticsOrderIstdcancelPreconsultModel value) throws IOException {
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
           public AlipayCommerceLogisticsOrderIstdcancelPreconsultModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceLogisticsOrderIstdcancelPreconsultModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceLogisticsOrderIstdcancelPreconsultModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceLogisticsOrderIstdcancelPreconsultModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceLogisticsOrderIstdcancelPreconsultModel
  */
  public static AlipayCommerceLogisticsOrderIstdcancelPreconsultModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceLogisticsOrderIstdcancelPreconsultModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceLogisticsOrderIstdcancelPreconsultModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

