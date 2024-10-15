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
 * AlipayCommerceLogisticsOrderIstdretryCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceLogisticsOrderIstdretryCreateResponseModel {
  public static final String SERIALIZED_NAME_COUPON_FEE = "coupon_fee";
  @SerializedName(SERIALIZED_NAME_COUPON_FEE)
  private String couponFee;

  public static final String SERIALIZED_NAME_DELIVER_FEE = "deliver_fee";
  @SerializedName(SERIALIZED_NAME_DELIVER_FEE)
  private String deliverFee;

  public static final String SERIALIZED_NAME_DISPATCH_DURATION = "dispatch_duration";
  @SerializedName(SERIALIZED_NAME_DISPATCH_DURATION)
  private Integer dispatchDuration;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private Integer distance;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private String fee;

  public static final String SERIALIZED_NAME_FINISH_CODE = "finish_code";
  @SerializedName(SERIALIZED_NAME_FINISH_CODE)
  private String finishCode;

  public static final String SERIALIZED_NAME_INSURANCE_FEE = "insurance_fee";
  @SerializedName(SERIALIZED_NAME_INSURANCE_FEE)
  private String insuranceFee;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private String payAmount;

  public static final String SERIALIZED_NAME_PICKUP_CODE = "pickup_code";
  @SerializedName(SERIALIZED_NAME_PICKUP_CODE)
  private String pickupCode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_WAYBILL_NO = "waybill_no";
  @SerializedName(SERIALIZED_NAME_WAYBILL_NO)
  private String waybillNo;

  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel() { 
  }

  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel couponFee(String couponFee) {
    
    this.couponFee = couponFee;
    return this;
  }

   /**
   * 优惠券费用
   * @return couponFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.00", value = "优惠券费用")

  public String getCouponFee() {
    return couponFee;
  }


  public void setCouponFee(String couponFee) {
    this.couponFee = couponFee;
  }


  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel deliverFee(String deliverFee) {
    
    this.deliverFee = deliverFee;
    return this;
  }

   /**
   * 运费
   * @return deliverFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "运费")

  public String getDeliverFee() {
    return deliverFee;
  }


  public void setDeliverFee(String deliverFee) {
    this.deliverFee = deliverFee;
  }


  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel dispatchDuration(Integer dispatchDuration) {
    
    this.dispatchDuration = dispatchDuration;
    return this;
  }

   /**
   * 预计骑手还剩多久接单，单位：秒
   * @return dispatchDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60", value = "预计骑手还剩多久接单，单位：秒")

  public Integer getDispatchDuration() {
    return dispatchDuration;
  }


  public void setDispatchDuration(Integer dispatchDuration) {
    this.dispatchDuration = dispatchDuration;
  }


  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel distance(Integer distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * 配送距离(单位：米)
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "配送距离(单位：米)")

  public Integer getDistance() {
    return distance;
  }


  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel fee(String fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * 实际运费
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9.00", value = "实际运费")

  public String getFee() {
    return fee;
  }


  public void setFee(String fee) {
    this.fee = fee;
  }


  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel finishCode(String finishCode) {
    
    this.finishCode = finishCode;
    return this;
  }

   /**
   * 收货码，骑手必须输入收货码才能完成订单妥投
   * @return finishCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx", value = "收货码，骑手必须输入收货码才能完成订单妥投")

  public String getFinishCode() {
    return finishCode;
  }


  public void setFinishCode(String finishCode) {
    this.finishCode = finishCode;
  }


  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel insuranceFee(String insuranceFee) {
    
    this.insuranceFee = insuranceFee;
    return this;
  }

   /**
   * 保价费用
   * @return insuranceFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.00", value = "保价费用")

  public String getInsuranceFee() {
    return insuranceFee;
  }


  public void setInsuranceFee(String insuranceFee) {
    this.insuranceFee = insuranceFee;
  }


  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel orderNo(String orderNo) {
    
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


  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel payAmount(String payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 支付金额, 实际扣减的费用以此字段为准
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9.00", value = "支付金额, 实际扣减的费用以此字段为准")

  public String getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(String payAmount) {
    this.payAmount = payAmount;
  }


  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel pickupCode(String pickupCode) {
    
    this.pickupCode = pickupCode;
    return this;
  }

   /**
   * 取货码, 骑手必须输入取货码才能从商家取货
   * @return pickupCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx", value = "取货码, 骑手必须输入取货码才能从商家取货")

  public String getPickupCode() {
    return pickupCode;
  }


  public void setPickupCode(String pickupCode) {
    this.pickupCode = pickupCode;
  }


  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 即时配送运单状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "i_101", value = "即时配送运单状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel waybillNo(String waybillNo) {
    
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
   * @return the AlipayCommerceLogisticsOrderIstdretryCreateResponseModel instance itself
   */
  public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceLogisticsOrderIstdretryCreateResponseModel alipayCommerceLogisticsOrderIstdretryCreateResponseModel = (AlipayCommerceLogisticsOrderIstdretryCreateResponseModel) o;
    return Objects.equals(this.couponFee, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.couponFee) &&
        Objects.equals(this.deliverFee, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.deliverFee) &&
        Objects.equals(this.dispatchDuration, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.dispatchDuration) &&
        Objects.equals(this.distance, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.distance) &&
        Objects.equals(this.fee, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.fee) &&
        Objects.equals(this.finishCode, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.finishCode) &&
        Objects.equals(this.insuranceFee, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.insuranceFee) &&
        Objects.equals(this.orderNo, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.orderNo) &&
        Objects.equals(this.payAmount, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.payAmount) &&
        Objects.equals(this.pickupCode, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.pickupCode) &&
        Objects.equals(this.status, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.status) &&
        Objects.equals(this.waybillNo, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.waybillNo)&&
        Objects.equals(this.additionalProperties, alipayCommerceLogisticsOrderIstdretryCreateResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponFee, deliverFee, dispatchDuration, distance, fee, finishCode, insuranceFee, orderNo, payAmount, pickupCode, status, waybillNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceLogisticsOrderIstdretryCreateResponseModel {\n");
    sb.append("    couponFee: ").append(toIndentedString(couponFee)).append("\n");
    sb.append("    deliverFee: ").append(toIndentedString(deliverFee)).append("\n");
    sb.append("    dispatchDuration: ").append(toIndentedString(dispatchDuration)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    finishCode: ").append(toIndentedString(finishCode)).append("\n");
    sb.append("    insuranceFee: ").append(toIndentedString(insuranceFee)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    pickupCode: ").append(toIndentedString(pickupCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("coupon_fee");
    openapiFields.add("deliver_fee");
    openapiFields.add("dispatch_duration");
    openapiFields.add("distance");
    openapiFields.add("fee");
    openapiFields.add("finish_code");
    openapiFields.add("insurance_fee");
    openapiFields.add("order_no");
    openapiFields.add("pay_amount");
    openapiFields.add("pickup_code");
    openapiFields.add("status");
    openapiFields.add("waybill_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceLogisticsOrderIstdretryCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceLogisticsOrderIstdretryCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceLogisticsOrderIstdretryCreateResponseModel is not found in the empty JSON string", AlipayCommerceLogisticsOrderIstdretryCreateResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("coupon_fee") != null && !jsonObj.get("coupon_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coupon_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coupon_fee").toString()));
      }
      if (jsonObj.get("deliver_fee") != null && !jsonObj.get("deliver_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliver_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliver_fee").toString()));
      }
      if (jsonObj.get("fee") != null && !jsonObj.get("fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee").toString()));
      }
      if (jsonObj.get("finish_code") != null && !jsonObj.get("finish_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finish_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finish_code").toString()));
      }
      if (jsonObj.get("insurance_fee") != null && !jsonObj.get("insurance_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insurance_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insurance_fee").toString()));
      }
      if (jsonObj.get("order_no") != null && !jsonObj.get("order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_no").toString()));
      }
      if (jsonObj.get("pay_amount") != null && !jsonObj.get("pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_amount").toString()));
      }
      if (jsonObj.get("pickup_code") != null && !jsonObj.get("pickup_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pickup_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pickup_code").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("waybill_no") != null && !jsonObj.get("waybill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waybill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waybill_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceLogisticsOrderIstdretryCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceLogisticsOrderIstdretryCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceLogisticsOrderIstdretryCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceLogisticsOrderIstdretryCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceLogisticsOrderIstdretryCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceLogisticsOrderIstdretryCreateResponseModel value) throws IOException {
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
           public AlipayCommerceLogisticsOrderIstdretryCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceLogisticsOrderIstdretryCreateResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceLogisticsOrderIstdretryCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceLogisticsOrderIstdretryCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceLogisticsOrderIstdretryCreateResponseModel
  */
  public static AlipayCommerceLogisticsOrderIstdretryCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceLogisticsOrderIstdretryCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceLogisticsOrderIstdretryCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

