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
 * AlipayEcoEduKtBillingModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoEduKtBillingModifyModel {
  public static final String SERIALIZED_NAME_BANK_SUCCESS = "bank_success";
  @SerializedName(SERIALIZED_NAME_BANK_SUCCESS)
  private String bankSuccess;

  public static final String SERIALIZED_NAME_BUYER_LOGON_ID = "buyer_logon_id";
  @SerializedName(SERIALIZED_NAME_BUYER_LOGON_ID)
  private String buyerLogonId;

  public static final String SERIALIZED_NAME_BUYER_USER_ID = "buyer_user_id";
  @SerializedName(SERIALIZED_NAME_BUYER_USER_ID)
  private String buyerUserId;

  public static final String SERIALIZED_NAME_BUYER_USER_OPEN_ID = "buyer_user_open_id";
  @SerializedName(SERIALIZED_NAME_BUYER_USER_OPEN_ID)
  private String buyerUserOpenId;

  public static final String SERIALIZED_NAME_FUND_CHANGE = "fund_change";
  @SerializedName(SERIALIZED_NAME_FUND_CHANGE)
  private String fundChange;

  public static final String SERIALIZED_NAME_GMT_REFUND = "gmt_refund";
  @SerializedName(SERIALIZED_NAME_GMT_REFUND)
  private String gmtRefund;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private String refundAmount;

  public static final String SERIALIZED_NAME_REFUND_DETAIL_ITEM_LIST = "refund_detail_item_list";
  @SerializedName(SERIALIZED_NAME_REFUND_DETAIL_ITEM_LIST)
  private String refundDetailItemList;

  public static final String SERIALIZED_NAME_REFUND_REASON = "refund_reason";
  @SerializedName(SERIALIZED_NAME_REFUND_REASON)
  private String refundReason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayEcoEduKtBillingModifyModel() { 
  }

  public AlipayEcoEduKtBillingModifyModel bankSuccess(String bankSuccess) {
    
    this.bankSuccess = bankSuccess;
    return this;
  }

   /**
   * 成功Y，失败N
   * @return bankSuccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "成功Y，失败N")

  public String getBankSuccess() {
    return bankSuccess;
  }


  public void setBankSuccess(String bankSuccess) {
    this.bankSuccess = bankSuccess;
  }


  public AlipayEcoEduKtBillingModifyModel buyerLogonId(String buyerLogonId) {
    
    this.buyerLogonId = buyerLogonId;
    return this;
  }

   /**
   * 退款时，支付宝返回的用户的登录id
   * @return buyerLogonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "159****5620", value = "退款时，支付宝返回的用户的登录id")

  public String getBuyerLogonId() {
    return buyerLogonId;
  }


  public void setBuyerLogonId(String buyerLogonId) {
    this.buyerLogonId = buyerLogonId;
  }


  public AlipayEcoEduKtBillingModifyModel buyerUserId(String buyerUserId) {
    
    this.buyerUserId = buyerUserId;
    return this;
  }

   /**
   * 支付宝返回的买家支付宝用户id
   * @return buyerUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955611", value = "支付宝返回的买家支付宝用户id")

  public String getBuyerUserId() {
    return buyerUserId;
  }


  public void setBuyerUserId(String buyerUserId) {
    this.buyerUserId = buyerUserId;
  }


  public AlipayEcoEduKtBillingModifyModel buyerUserOpenId(String buyerUserOpenId) {
    
    this.buyerUserOpenId = buyerUserOpenId;
    return this;
  }

   /**
   * 支付宝返回的买家支付宝用户id加密后信息
   * @return buyerUserOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝返回的买家支付宝用户id加密后信息")

  public String getBuyerUserOpenId() {
    return buyerUserOpenId;
  }


  public void setBuyerUserOpenId(String buyerUserOpenId) {
    this.buyerUserOpenId = buyerUserOpenId;
  }


  public AlipayEcoEduKtBillingModifyModel fundChange(String fundChange) {
    
    this.fundChange = fundChange;
    return this;
  }

   /**
   * 本次退款是否发生了资金变化
   * @return fundChange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "本次退款是否发生了资金变化")

  public String getFundChange() {
    return fundChange;
  }


  public void setFundChange(String fundChange) {
    this.fundChange = fundChange;
  }


  public AlipayEcoEduKtBillingModifyModel gmtRefund(String gmtRefund) {
    
    this.gmtRefund = gmtRefund;
    return this;
  }

   /**
   * 支付宝返回的退款时间，而不是商户退款申请的时间
   * @return gmtRefund
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-11-27 15:45:57", value = "支付宝返回的退款时间，而不是商户退款申请的时间")

  public String getGmtRefund() {
    return gmtRefund;
  }


  public void setGmtRefund(String gmtRefund) {
    this.gmtRefund = gmtRefund;
  }


  public AlipayEcoEduKtBillingModifyModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传。（若退款时填写，则同步退款状态时也必须填写）
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HZ01RF001", value = "标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传。（若退款时填写，则同步退款状态时也必须填写）")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayEcoEduKtBillingModifyModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * isv系统的订单号
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160101909909354354354", value = "isv系统的订单号")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayEcoEduKtBillingModifyModel refundAmount(String refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200.12", value = "需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数")

  public String getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
  }


  public AlipayEcoEduKtBillingModifyModel refundDetailItemList(String refundDetailItemList) {
    
    this.refundDetailItemList = refundDetailItemList;
    return this;
  }

   /**
   * 支付宝返回的退款资金渠道，json格式字符串
   * @return refundDetailItemList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{   \"fund_channel\":\"ALIPAYACCOUNT\",   \"amount\":12.00,   \"real_amount\":12.00     }", value = "支付宝返回的退款资金渠道，json格式字符串")

  public String getRefundDetailItemList() {
    return refundDetailItemList;
  }


  public void setRefundDetailItemList(String refundDetailItemList) {
    this.refundDetailItemList = refundDetailItemList;
  }


  public AlipayEcoEduKtBillingModifyModel refundReason(String refundReason) {
    
    this.refundReason = refundReason;
    return this;
  }

   /**
   * 退款原因，商家根据客户实际退款原因填写（若退款时填写，则同步退款状态时也必须填写）
   * @return refundReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "正常退款", value = "退款原因，商家根据客户实际退款原因填写（若退款时填写，则同步退款状态时也必须填写）")

  public String getRefundReason() {
    return refundReason;
  }


  public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
  }


  public AlipayEcoEduKtBillingModifyModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 状态：1:缴费成功，2:关闭账单，3、退费  如果为退款状态，需要填写fund_change,   refund_amount, refund_reason,  out_request_no, buyer_logon_id,  gmt_refund,  buyer_user_id, refund_detail_item_list;  4、同步网商返回的状态,如果是网商银行的账单，bank_success这个字段必填
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "状态：1:缴费成功，2:关闭账单，3、退费  如果为退款状态，需要填写fund_change,   refund_amount, refund_reason,  out_request_no, buyer_logon_id,  gmt_refund,  buyer_user_id, refund_detail_item_list;  4、同步网商返回的状态,如果是网商银行的账单，bank_success这个字段必填")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayEcoEduKtBillingModifyModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝返回的交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014112611001004680073956707", value = "支付宝返回的交易号")

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
   * @return the AlipayEcoEduKtBillingModifyModel instance itself
   */
  public AlipayEcoEduKtBillingModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayEcoEduKtBillingModifyModel alipayEcoEduKtBillingModifyModel = (AlipayEcoEduKtBillingModifyModel) o;
    return Objects.equals(this.bankSuccess, alipayEcoEduKtBillingModifyModel.bankSuccess) &&
        Objects.equals(this.buyerLogonId, alipayEcoEduKtBillingModifyModel.buyerLogonId) &&
        Objects.equals(this.buyerUserId, alipayEcoEduKtBillingModifyModel.buyerUserId) &&
        Objects.equals(this.buyerUserOpenId, alipayEcoEduKtBillingModifyModel.buyerUserOpenId) &&
        Objects.equals(this.fundChange, alipayEcoEduKtBillingModifyModel.fundChange) &&
        Objects.equals(this.gmtRefund, alipayEcoEduKtBillingModifyModel.gmtRefund) &&
        Objects.equals(this.outRequestNo, alipayEcoEduKtBillingModifyModel.outRequestNo) &&
        Objects.equals(this.outTradeNo, alipayEcoEduKtBillingModifyModel.outTradeNo) &&
        Objects.equals(this.refundAmount, alipayEcoEduKtBillingModifyModel.refundAmount) &&
        Objects.equals(this.refundDetailItemList, alipayEcoEduKtBillingModifyModel.refundDetailItemList) &&
        Objects.equals(this.refundReason, alipayEcoEduKtBillingModifyModel.refundReason) &&
        Objects.equals(this.status, alipayEcoEduKtBillingModifyModel.status) &&
        Objects.equals(this.tradeNo, alipayEcoEduKtBillingModifyModel.tradeNo)&&
        Objects.equals(this.additionalProperties, alipayEcoEduKtBillingModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankSuccess, buyerLogonId, buyerUserId, buyerUserOpenId, fundChange, gmtRefund, outRequestNo, outTradeNo, refundAmount, refundDetailItemList, refundReason, status, tradeNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoEduKtBillingModifyModel {\n");
    sb.append("    bankSuccess: ").append(toIndentedString(bankSuccess)).append("\n");
    sb.append("    buyerLogonId: ").append(toIndentedString(buyerLogonId)).append("\n");
    sb.append("    buyerUserId: ").append(toIndentedString(buyerUserId)).append("\n");
    sb.append("    buyerUserOpenId: ").append(toIndentedString(buyerUserOpenId)).append("\n");
    sb.append("    fundChange: ").append(toIndentedString(fundChange)).append("\n");
    sb.append("    gmtRefund: ").append(toIndentedString(gmtRefund)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundDetailItemList: ").append(toIndentedString(refundDetailItemList)).append("\n");
    sb.append("    refundReason: ").append(toIndentedString(refundReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("bank_success");
    openapiFields.add("buyer_logon_id");
    openapiFields.add("buyer_user_id");
    openapiFields.add("buyer_user_open_id");
    openapiFields.add("fund_change");
    openapiFields.add("gmt_refund");
    openapiFields.add("out_request_no");
    openapiFields.add("out_trade_no");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_detail_item_list");
    openapiFields.add("refund_reason");
    openapiFields.add("status");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoEduKtBillingModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoEduKtBillingModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoEduKtBillingModifyModel is not found in the empty JSON string", AlipayEcoEduKtBillingModifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("bank_success") != null && !jsonObj.get("bank_success").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_success` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_success").toString()));
      }
      if (jsonObj.get("buyer_logon_id") != null && !jsonObj.get("buyer_logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_logon_id").toString()));
      }
      if (jsonObj.get("buyer_user_id") != null && !jsonObj.get("buyer_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_user_id").toString()));
      }
      if (jsonObj.get("buyer_user_open_id") != null && !jsonObj.get("buyer_user_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_user_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_user_open_id").toString()));
      }
      if (jsonObj.get("fund_change") != null && !jsonObj.get("fund_change").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_change` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_change").toString()));
      }
      if (jsonObj.get("gmt_refund") != null && !jsonObj.get("gmt_refund").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_refund` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_refund").toString()));
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
      if (jsonObj.get("refund_detail_item_list") != null && !jsonObj.get("refund_detail_item_list").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_detail_item_list` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_detail_item_list").toString()));
      }
      if (jsonObj.get("refund_reason") != null && !jsonObj.get("refund_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_reason").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoEduKtBillingModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoEduKtBillingModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoEduKtBillingModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoEduKtBillingModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoEduKtBillingModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoEduKtBillingModifyModel value) throws IOException {
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
           public AlipayEcoEduKtBillingModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEcoEduKtBillingModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEcoEduKtBillingModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoEduKtBillingModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoEduKtBillingModifyModel
  */
  public static AlipayEcoEduKtBillingModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoEduKtBillingModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEcoEduKtBillingModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

