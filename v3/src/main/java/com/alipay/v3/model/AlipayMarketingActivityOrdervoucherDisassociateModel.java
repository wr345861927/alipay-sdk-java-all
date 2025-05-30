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
 * AlipayMarketingActivityOrdervoucherDisassociateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityOrdervoucherDisassociateModel {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_MERCHANT_ACCESS_MODE = "merchant_access_mode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCESS_MODE)
  private String merchantAccessMode;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public static final String SERIALIZED_NAME_VOUCHER_CODE = "voucher_code";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CODE)
  private String voucherCode;

  public AlipayMarketingActivityOrdervoucherDisassociateModel() { 
  }

  public AlipayMarketingActivityOrdervoucherDisassociateModel activityId(String activityId) {
    
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


  public AlipayMarketingActivityOrdervoucherDisassociateModel merchantAccessMode(String merchantAccessMode) {
    
    this.merchantAccessMode = merchantAccessMode;
    return this;
  }

   /**
   * 商户接入模式
   * @return merchantAccessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AGENCY_MODE", value = "商户接入模式")

  public String getMerchantAccessMode() {
    return merchantAccessMode;
  }


  public void setMerchantAccessMode(String merchantAccessMode) {
    this.merchantAccessMode = merchantAccessMode;
  }


  public AlipayMarketingActivityOrdervoucherDisassociateModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170101000001654bb46ba", value = "外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayMarketingActivityOrdervoucherDisassociateModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 该交易在支付宝系统中的交易流水号。
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021042322001426261436764012", value = "该交易在支付宝系统中的交易流水号。")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }


  public AlipayMarketingActivityOrdervoucherDisassociateModel voucherCode(String voucherCode) {
    
    this.voucherCode = voucherCode;
    return this;
  }

   /**
   * 券码。 限制: 券码必须已发放给用户。
   * @return voucherCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ABE44", value = "券码。 限制: 券码必须已发放给用户。")

  public String getVoucherCode() {
    return voucherCode;
  }


  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
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
   * @return the AlipayMarketingActivityOrdervoucherDisassociateModel instance itself
   */
  public AlipayMarketingActivityOrdervoucherDisassociateModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingActivityOrdervoucherDisassociateModel alipayMarketingActivityOrdervoucherDisassociateModel = (AlipayMarketingActivityOrdervoucherDisassociateModel) o;
    return Objects.equals(this.activityId, alipayMarketingActivityOrdervoucherDisassociateModel.activityId) &&
        Objects.equals(this.merchantAccessMode, alipayMarketingActivityOrdervoucherDisassociateModel.merchantAccessMode) &&
        Objects.equals(this.outBizNo, alipayMarketingActivityOrdervoucherDisassociateModel.outBizNo) &&
        Objects.equals(this.tradeNo, alipayMarketingActivityOrdervoucherDisassociateModel.tradeNo) &&
        Objects.equals(this.voucherCode, alipayMarketingActivityOrdervoucherDisassociateModel.voucherCode)&&
        Objects.equals(this.additionalProperties, alipayMarketingActivityOrdervoucherDisassociateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, merchantAccessMode, outBizNo, tradeNo, voucherCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityOrdervoucherDisassociateModel {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    merchantAccessMode: ").append(toIndentedString(merchantAccessMode)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
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
    openapiFields.add("merchant_access_mode");
    openapiFields.add("out_biz_no");
    openapiFields.add("trade_no");
    openapiFields.add("voucher_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityOrdervoucherDisassociateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityOrdervoucherDisassociateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityOrdervoucherDisassociateModel is not found in the empty JSON string", AlipayMarketingActivityOrdervoucherDisassociateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      if (jsonObj.get("merchant_access_mode") != null && !jsonObj.get("merchant_access_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_access_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_access_mode").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
      if (jsonObj.get("voucher_code") != null && !jsonObj.get("voucher_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityOrdervoucherDisassociateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityOrdervoucherDisassociateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityOrdervoucherDisassociateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityOrdervoucherDisassociateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityOrdervoucherDisassociateModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityOrdervoucherDisassociateModel value) throws IOException {
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
           public AlipayMarketingActivityOrdervoucherDisassociateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingActivityOrdervoucherDisassociateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingActivityOrdervoucherDisassociateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityOrdervoucherDisassociateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityOrdervoucherDisassociateModel
  */
  public static AlipayMarketingActivityOrdervoucherDisassociateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityOrdervoucherDisassociateModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityOrdervoucherDisassociateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

