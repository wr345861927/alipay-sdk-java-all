/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-05-20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.VoucherDeductThresholdInfo;
import com.alipay.v3.model.VoucherExchangeGoodsInfo;
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
 * ExchangeVoucherInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExchangeVoucherInfo {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_EXCHANGE_GOODS_INFO = "exchange_goods_info";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_GOODS_INFO)
  private VoucherExchangeGoodsInfo exchangeGoodsInfo;

  public static final String SERIALIZED_NAME_FLOOR_AMOUNT = "floor_amount";
  @SerializedName(SERIALIZED_NAME_FLOOR_AMOUNT)
  private String floorAmount;

  public static final String SERIALIZED_NAME_VOUCHER_DEDUCT_THRESHOLD_INFO = "voucher_deduct_threshold_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DEDUCT_THRESHOLD_INFO)
  private VoucherDeductThresholdInfo voucherDeductThresholdInfo;

  public ExchangeVoucherInfo() { 
  }

  public ExchangeVoucherInfo amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 券的价值
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券的价值")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ExchangeVoucherInfo bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 兑换券业务类型。 注意：兑换券通过大促活动权益报名能力推广至支付宝会场时，本参数必填。
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "兑换券业务类型。 注意：兑换券通过大促活动权益报名能力推广至支付宝会场时，本参数必填。")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public ExchangeVoucherInfo exchangeGoodsInfo(VoucherExchangeGoodsInfo exchangeGoodsInfo) {
    
    this.exchangeGoodsInfo = exchangeGoodsInfo;
    return this;
  }

   /**
   * Get exchangeGoodsInfo
   * @return exchangeGoodsInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherExchangeGoodsInfo getExchangeGoodsInfo() {
    return exchangeGoodsInfo;
  }


  public void setExchangeGoodsInfo(VoucherExchangeGoodsInfo exchangeGoodsInfo) {
    this.exchangeGoodsInfo = exchangeGoodsInfo;
  }


  public ExchangeVoucherInfo floorAmount(String floorAmount) {
    
    this.floorAmount = floorAmount;
    return this;
  }

   /**
   * 优惠门槛金额，表示只有当订单金额大于等于门槛金额时券才能使用。该字段为空时表示无门槛。  门槛金额的校验由服务商(商户)核销时自行校验，支付宝侧只做展示使用。
   * @return floorAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "优惠门槛金额，表示只有当订单金额大于等于门槛金额时券才能使用。该字段为空时表示无门槛。  门槛金额的校验由服务商(商户)核销时自行校验，支付宝侧只做展示使用。")

  public String getFloorAmount() {
    return floorAmount;
  }


  public void setFloorAmount(String floorAmount) {
    this.floorAmount = floorAmount;
  }


  public ExchangeVoucherInfo voucherDeductThresholdInfo(VoucherDeductThresholdInfo voucherDeductThresholdInfo) {
    
    this.voucherDeductThresholdInfo = voucherDeductThresholdInfo;
    return this;
  }

   /**
   * Get voucherDeductThresholdInfo
   * @return voucherDeductThresholdInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDeductThresholdInfo getVoucherDeductThresholdInfo() {
    return voucherDeductThresholdInfo;
  }


  public void setVoucherDeductThresholdInfo(VoucherDeductThresholdInfo voucherDeductThresholdInfo) {
    this.voucherDeductThresholdInfo = voucherDeductThresholdInfo;
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
   * @return the ExchangeVoucherInfo instance itself
   */
  public ExchangeVoucherInfo putAdditionalProperty(String key, Object value) {
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
    ExchangeVoucherInfo exchangeVoucherInfo = (ExchangeVoucherInfo) o;
    return Objects.equals(this.amount, exchangeVoucherInfo.amount) &&
        Objects.equals(this.bizType, exchangeVoucherInfo.bizType) &&
        Objects.equals(this.exchangeGoodsInfo, exchangeVoucherInfo.exchangeGoodsInfo) &&
        Objects.equals(this.floorAmount, exchangeVoucherInfo.floorAmount) &&
        Objects.equals(this.voucherDeductThresholdInfo, exchangeVoucherInfo.voucherDeductThresholdInfo)&&
        Objects.equals(this.additionalProperties, exchangeVoucherInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bizType, exchangeGoodsInfo, floorAmount, voucherDeductThresholdInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeVoucherInfo {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    exchangeGoodsInfo: ").append(toIndentedString(exchangeGoodsInfo)).append("\n");
    sb.append("    floorAmount: ").append(toIndentedString(floorAmount)).append("\n");
    sb.append("    voucherDeductThresholdInfo: ").append(toIndentedString(voucherDeductThresholdInfo)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("biz_type");
    openapiFields.add("exchange_goods_info");
    openapiFields.add("floor_amount");
    openapiFields.add("voucher_deduct_threshold_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExchangeVoucherInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExchangeVoucherInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExchangeVoucherInfo is not found in the empty JSON string", ExchangeVoucherInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      // validate the optional field `exchange_goods_info`
      if (jsonObj.getAsJsonObject("exchange_goods_info") != null) {
        VoucherExchangeGoodsInfo.validateJsonObject(jsonObj.getAsJsonObject("exchange_goods_info"));
      }
      if (jsonObj.get("floor_amount") != null && !jsonObj.get("floor_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floor_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floor_amount").toString()));
      }
      // validate the optional field `voucher_deduct_threshold_info`
      if (jsonObj.getAsJsonObject("voucher_deduct_threshold_info") != null) {
        VoucherDeductThresholdInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_deduct_threshold_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExchangeVoucherInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExchangeVoucherInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExchangeVoucherInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExchangeVoucherInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ExchangeVoucherInfo>() {
           @Override
           public void write(JsonWriter out, ExchangeVoucherInfo value) throws IOException {
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
           public ExchangeVoucherInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExchangeVoucherInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExchangeVoucherInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExchangeVoucherInfo
  * @throws IOException if the JSON string is invalid with respect to ExchangeVoucherInfo
  */
  public static ExchangeVoucherInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExchangeVoucherInfo.class);
  }

 /**
  * Convert an instance of ExchangeVoucherInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

