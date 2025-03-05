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
import com.alipay.v3.model.UnfreezeExtendParams;
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
 * ZhimaCreditPeZmgoSettleUnfreezeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPeZmgoSettleUnfreezeModel {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_ALIPAY_OPEN_ID = "alipay_open_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_OPEN_ID)
  private String alipayOpenId;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_BIZ_TIME = "biz_time";
  @SerializedName(SERIALIZED_NAME_BIZ_TIME)
  private String bizTime;

  public static final String SERIALIZED_NAME_ORDER_TITLE = "order_title";
  @SerializedName(SERIALIZED_NAME_ORDER_TITLE)
  private String orderTitle;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_UNFREEZE_AMOUNT = "unfreeze_amount";
  @SerializedName(SERIALIZED_NAME_UNFREEZE_AMOUNT)
  private String unfreezeAmount;

  public static final String SERIALIZED_NAME_UNFREEZE_EXTEND_PARAMS = "unfreeze_extend_params";
  @SerializedName(SERIALIZED_NAME_UNFREEZE_EXTEND_PARAMS)
  private UnfreezeExtendParams unfreezeExtendParams;

  public ZhimaCreditPeZmgoSettleUnfreezeModel() { 
  }

  public ZhimaCreditPeZmgoSettleUnfreezeModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20185513447859192007", value = "支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public ZhimaCreditPeZmgoSettleUnfreezeModel alipayOpenId(String alipayOpenId) {
    
    this.alipayOpenId = alipayOpenId;
    return this;
  }

   /**
   * 买家在支付宝的用户id
   * @return alipayOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "买家在支付宝的用户id")

  public String getAlipayOpenId() {
    return alipayOpenId;
  }


  public void setAlipayOpenId(String alipayOpenId) {
    this.alipayOpenId = alipayOpenId;
  }


  public ZhimaCreditPeZmgoSettleUnfreezeModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 买家在支付宝的用户id
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955611", value = "买家在支付宝的用户id")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public ZhimaCreditPeZmgoSettleUnfreezeModel bizTime(String bizTime) {
    
    this.bizTime = bizTime;
    return this;
  }

   /**
   * 解冻成功时间
   * @return bizTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-09-15 11:23:04", value = "解冻成功时间")

  public String getBizTime() {
    return bizTime;
  }


  public void setBizTime(String bizTime) {
    this.bizTime = bizTime;
  }


  public ZhimaCreditPeZmgoSettleUnfreezeModel orderTitle(String orderTitle) {
    
    this.orderTitle = orderTitle;
    return this;
  }

   /**
   * 解冻的描述
   * @return orderTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088411663864410", value = "解冻的描述")

  public String getOrderTitle() {
    return orderTitle;
  }


  public void setOrderTitle(String orderTitle) {
    this.orderTitle = orderTitle;
  }


  public ZhimaCreditPeZmgoSettleUnfreezeModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户本次操作的请求流水号，用于标识请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。由商户传入，最终返回给商户。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8077735255938032", value = "商户本次操作的请求流水号，用于标识请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。由商户传入，最终返回给商户。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public ZhimaCreditPeZmgoSettleUnfreezeModel partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 商户ID
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088411663864410", value = "商户ID")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public ZhimaCreditPeZmgoSettleUnfreezeModel unfreezeAmount(String unfreezeAmount) {
    
    this.unfreezeAmount = unfreezeAmount;
    return this;
  }

   /**
   * 解冻金额
   * @return unfreezeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.00", value = "解冻金额")

  public String getUnfreezeAmount() {
    return unfreezeAmount;
  }


  public void setUnfreezeAmount(String unfreezeAmount) {
    this.unfreezeAmount = unfreezeAmount;
  }


  public ZhimaCreditPeZmgoSettleUnfreezeModel unfreezeExtendParams(UnfreezeExtendParams unfreezeExtendParams) {
    
    this.unfreezeExtendParams = unfreezeExtendParams;
    return this;
  }

   /**
   * Get unfreezeExtendParams
   * @return unfreezeExtendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UnfreezeExtendParams getUnfreezeExtendParams() {
    return unfreezeExtendParams;
  }


  public void setUnfreezeExtendParams(UnfreezeExtendParams unfreezeExtendParams) {
    this.unfreezeExtendParams = unfreezeExtendParams;
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
   * @return the ZhimaCreditPeZmgoSettleUnfreezeModel instance itself
   */
  public ZhimaCreditPeZmgoSettleUnfreezeModel putAdditionalProperty(String key, Object value) {
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
    ZhimaCreditPeZmgoSettleUnfreezeModel zhimaCreditPeZmgoSettleUnfreezeModel = (ZhimaCreditPeZmgoSettleUnfreezeModel) o;
    return Objects.equals(this.agreementId, zhimaCreditPeZmgoSettleUnfreezeModel.agreementId) &&
        Objects.equals(this.alipayOpenId, zhimaCreditPeZmgoSettleUnfreezeModel.alipayOpenId) &&
        Objects.equals(this.alipayUserId, zhimaCreditPeZmgoSettleUnfreezeModel.alipayUserId) &&
        Objects.equals(this.bizTime, zhimaCreditPeZmgoSettleUnfreezeModel.bizTime) &&
        Objects.equals(this.orderTitle, zhimaCreditPeZmgoSettleUnfreezeModel.orderTitle) &&
        Objects.equals(this.outRequestNo, zhimaCreditPeZmgoSettleUnfreezeModel.outRequestNo) &&
        Objects.equals(this.partnerId, zhimaCreditPeZmgoSettleUnfreezeModel.partnerId) &&
        Objects.equals(this.unfreezeAmount, zhimaCreditPeZmgoSettleUnfreezeModel.unfreezeAmount) &&
        Objects.equals(this.unfreezeExtendParams, zhimaCreditPeZmgoSettleUnfreezeModel.unfreezeExtendParams)&&
        Objects.equals(this.additionalProperties, zhimaCreditPeZmgoSettleUnfreezeModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, alipayOpenId, alipayUserId, bizTime, orderTitle, outRequestNo, partnerId, unfreezeAmount, unfreezeExtendParams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPeZmgoSettleUnfreezeModel {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    alipayOpenId: ").append(toIndentedString(alipayOpenId)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    bizTime: ").append(toIndentedString(bizTime)).append("\n");
    sb.append("    orderTitle: ").append(toIndentedString(orderTitle)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    unfreezeAmount: ").append(toIndentedString(unfreezeAmount)).append("\n");
    sb.append("    unfreezeExtendParams: ").append(toIndentedString(unfreezeExtendParams)).append("\n");
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
    openapiFields.add("agreement_id");
    openapiFields.add("alipay_open_id");
    openapiFields.add("alipay_user_id");
    openapiFields.add("biz_time");
    openapiFields.add("order_title");
    openapiFields.add("out_request_no");
    openapiFields.add("partner_id");
    openapiFields.add("unfreeze_amount");
    openapiFields.add("unfreeze_extend_params");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPeZmgoSettleUnfreezeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPeZmgoSettleUnfreezeModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPeZmgoSettleUnfreezeModel is not found in the empty JSON string", ZhimaCreditPeZmgoSettleUnfreezeModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("alipay_open_id") != null && !jsonObj.get("alipay_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_open_id").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      if (jsonObj.get("biz_time") != null && !jsonObj.get("biz_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_time").toString()));
      }
      if (jsonObj.get("order_title") != null && !jsonObj.get("order_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_title").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("unfreeze_amount") != null && !jsonObj.get("unfreeze_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unfreeze_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unfreeze_amount").toString()));
      }
      // validate the optional field `unfreeze_extend_params`
      if (jsonObj.getAsJsonObject("unfreeze_extend_params") != null) {
        UnfreezeExtendParams.validateJsonObject(jsonObj.getAsJsonObject("unfreeze_extend_params"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPeZmgoSettleUnfreezeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPeZmgoSettleUnfreezeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPeZmgoSettleUnfreezeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPeZmgoSettleUnfreezeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPeZmgoSettleUnfreezeModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPeZmgoSettleUnfreezeModel value) throws IOException {
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
           public ZhimaCreditPeZmgoSettleUnfreezeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZhimaCreditPeZmgoSettleUnfreezeModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZhimaCreditPeZmgoSettleUnfreezeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPeZmgoSettleUnfreezeModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPeZmgoSettleUnfreezeModel
  */
  public static ZhimaCreditPeZmgoSettleUnfreezeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPeZmgoSettleUnfreezeModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPeZmgoSettleUnfreezeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

