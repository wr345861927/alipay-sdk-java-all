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
import com.alipay.v3.model.OpenApiRefundFundDetailPojo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AlipayTradeRefundApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeRefundApplyModel {
  public static final String SERIALIZED_NAME_EXTEND_PARAMS = "extend_params";
  @SerializedName(SERIALIZED_NAME_EXTEND_PARAMS)
  private String extendParams;

  public static final String SERIALIZED_NAME_NOTIFY_URL = "notify_url";
  @SerializedName(SERIALIZED_NAME_NOTIFY_URL)
  private String notifyUrl;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "operator_id";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private String operatorId;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private String refundAmount;

  public static final String SERIALIZED_NAME_REFUND_FUND_DETAILS = "refund_fund_details";
  @SerializedName(SERIALIZED_NAME_REFUND_FUND_DETAILS)
  private List<OpenApiRefundFundDetailPojo> refundFundDetails = null;

  public static final String SERIALIZED_NAME_REFUND_REASON = "refund_reason";
  @SerializedName(SERIALIZED_NAME_REFUND_REASON)
  private String refundReason;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_TERMINAL_ID = "terminal_id";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeRefundApplyModel() { 
  }

  public AlipayTradeRefundApplyModel extendParams(String extendParams) {
    
    this.extendParams = extendParams;
    return this;
  }

   /**
   * 商户传入业务信息，具体值要和支付宝约定，格式为json格式。  医保退款场景下，DESIGNATED_REFUND_ASSET为INNER_ASSET表示只退自费部分，DESIGNATED_REFUND_ASSET为OUTSIDE_ASSET表示只退医保部分，医保部分不支持部分退。退医保资金必需传cancel_bill_no和cancel_serial_no。
   * @return extendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"DESIGNATED_REFUND_ASSET\" :\"OUTSIDE_ASSET\",\"cancel_bill_no\":\"ZF26039675\",\"cancel_serial_no\":\"77640503\"}", value = "商户传入业务信息，具体值要和支付宝约定，格式为json格式。  医保退款场景下，DESIGNATED_REFUND_ASSET为INNER_ASSET表示只退自费部分，DESIGNATED_REFUND_ASSET为OUTSIDE_ASSET表示只退医保部分，医保部分不支持部分退。退医保资金必需传cancel_bill_no和cancel_serial_no。")

  public String getExtendParams() {
    return extendParams;
  }


  public void setExtendParams(String extendParams) {
    this.extendParams = extendParams;
  }


  public AlipayTradeRefundApplyModel notifyUrl(String notifyUrl) {
    
    this.notifyUrl = notifyUrl;
    return this;
  }

   /**
   * 通知地址
   * @return notifyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "通知地址")

  public String getNotifyUrl() {
    return notifyUrl;
  }


  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }


  public AlipayTradeRefundApplyModel operatorId(String operatorId) {
    
    this.operatorId = operatorId;
    return this;
  }

   /**
   * 商户的操作员编号
   * @return operatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OP001", value = "商户的操作员编号")

  public String getOperatorId() {
    return operatorId;
  }


  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }


  public AlipayTradeRefundApplyModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HZ01RF001", value = "标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeRefundApplyModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 订单支付时传入的商户订单号,不能和 trade_no同时为空
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20150320010101001", value = "订单支付时传入的商户订单号,不能和 trade_no同时为空")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayTradeRefundApplyModel refundAmount(String refundAmount) {
    
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


  public AlipayTradeRefundApplyModel refundFundDetails(List<OpenApiRefundFundDetailPojo> refundFundDetails) {
    
    this.refundFundDetails = refundFundDetails;
    return this;
  }

  public AlipayTradeRefundApplyModel addRefundFundDetailsItem(OpenApiRefundFundDetailPojo refundFundDetailsItem) {
    if (this.refundFundDetails == null) {
      this.refundFundDetails = new ArrayList<>();
    }
    this.refundFundDetails.add(refundFundDetailsItem);
    return this;
  }

   /**
   * 退款资金明细  注：目前只有SETTLE_OFFLINE_GROUP产品的退款支持该字段
   * @return refundFundDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "退款资金明细  注：目前只有SETTLE_OFFLINE_GROUP产品的退款支持该字段")

  public List<OpenApiRefundFundDetailPojo> getRefundFundDetails() {
    return refundFundDetails;
  }


  public void setRefundFundDetails(List<OpenApiRefundFundDetailPojo> refundFundDetails) {
    this.refundFundDetails = refundFundDetails;
  }


  public AlipayTradeRefundApplyModel refundReason(String refundReason) {
    
    this.refundReason = refundReason;
    return this;
  }

   /**
   * 退款的原因说明
   * @return refundReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "正常退款", value = "退款的原因说明")

  public String getRefundReason() {
    return refundReason;
  }


  public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
  }


  public AlipayTradeRefundApplyModel storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 商户的门店编号
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NJ_S_001", value = "商户的门店编号")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public AlipayTradeRefundApplyModel terminalId(String terminalId) {
    
    this.terminalId = terminalId;
    return this;
  }

   /**
   * 商户的终端编号
   * @return terminalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NJ_T_001", value = "商户的终端编号")

  public String getTerminalId() {
    return terminalId;
  }


  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  public AlipayTradeRefundApplyModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号，和商户订单号不能同时为空
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014112611001004680073956707", value = "支付宝交易号，和商户订单号不能同时为空")

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
   * @return the AlipayTradeRefundApplyModel instance itself
   */
  public AlipayTradeRefundApplyModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeRefundApplyModel alipayTradeRefundApplyModel = (AlipayTradeRefundApplyModel) o;
    return Objects.equals(this.extendParams, alipayTradeRefundApplyModel.extendParams) &&
        Objects.equals(this.notifyUrl, alipayTradeRefundApplyModel.notifyUrl) &&
        Objects.equals(this.operatorId, alipayTradeRefundApplyModel.operatorId) &&
        Objects.equals(this.outRequestNo, alipayTradeRefundApplyModel.outRequestNo) &&
        Objects.equals(this.outTradeNo, alipayTradeRefundApplyModel.outTradeNo) &&
        Objects.equals(this.refundAmount, alipayTradeRefundApplyModel.refundAmount) &&
        Objects.equals(this.refundFundDetails, alipayTradeRefundApplyModel.refundFundDetails) &&
        Objects.equals(this.refundReason, alipayTradeRefundApplyModel.refundReason) &&
        Objects.equals(this.storeId, alipayTradeRefundApplyModel.storeId) &&
        Objects.equals(this.terminalId, alipayTradeRefundApplyModel.terminalId) &&
        Objects.equals(this.tradeNo, alipayTradeRefundApplyModel.tradeNo)&&
        Objects.equals(this.additionalProperties, alipayTradeRefundApplyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendParams, notifyUrl, operatorId, outRequestNo, outTradeNo, refundAmount, refundFundDetails, refundReason, storeId, terminalId, tradeNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeRefundApplyModel {\n");
    sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundFundDetails: ").append(toIndentedString(refundFundDetails)).append("\n");
    sb.append("    refundReason: ").append(toIndentedString(refundReason)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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
    openapiFields.add("extend_params");
    openapiFields.add("notify_url");
    openapiFields.add("operator_id");
    openapiFields.add("out_request_no");
    openapiFields.add("out_trade_no");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_fund_details");
    openapiFields.add("refund_reason");
    openapiFields.add("store_id");
    openapiFields.add("terminal_id");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeRefundApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeRefundApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeRefundApplyModel is not found in the empty JSON string", AlipayTradeRefundApplyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("extend_params") != null && !jsonObj.get("extend_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_params").toString()));
      }
      if (jsonObj.get("notify_url") != null && !jsonObj.get("notify_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_url").toString()));
      }
      if (jsonObj.get("operator_id") != null && !jsonObj.get("operator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator_id").toString()));
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
      JsonArray jsonArrayrefundFundDetails = jsonObj.getAsJsonArray("refund_fund_details");
      if (jsonArrayrefundFundDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("refund_fund_details").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `refund_fund_details` to be an array in the JSON string but got `%s`", jsonObj.get("refund_fund_details").toString()));
        }

        // validate the optional field `refund_fund_details` (array)
        for (int i = 0; i < jsonArrayrefundFundDetails.size(); i++) {
          OpenApiRefundFundDetailPojo.validateJsonObject(jsonArrayrefundFundDetails.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("refund_reason") != null && !jsonObj.get("refund_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_reason").toString()));
      }
      if (jsonObj.get("store_id") != null && !jsonObj.get("store_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_id").toString()));
      }
      if (jsonObj.get("terminal_id") != null && !jsonObj.get("terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_id").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeRefundApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeRefundApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeRefundApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeRefundApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeRefundApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeRefundApplyModel value) throws IOException {
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
           public AlipayTradeRefundApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeRefundApplyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeRefundApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeRefundApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeRefundApplyModel
  */
  public static AlipayTradeRefundApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeRefundApplyModel.class);
  }

 /**
  * Convert an instance of AlipayTradeRefundApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

