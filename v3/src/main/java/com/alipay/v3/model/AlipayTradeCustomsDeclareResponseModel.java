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
 * AlipayTradeCustomsDeclareResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeCustomsDeclareResponseModel {
  public static final String SERIALIZED_NAME_ALIPAY_DECLARE_NO = "alipay_declare_no";
  @SerializedName(SERIALIZED_NAME_ALIPAY_DECLARE_NO)
  private String alipayDeclareNo;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_IDENTITY_CHECK = "identity_check";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CHECK)
  private String identityCheck;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_PAY_CODE = "pay_code";
  @SerializedName(SERIALIZED_NAME_PAY_CODE)
  private String payCode;

  public static final String SERIALIZED_NAME_PAY_TRANSACTION_ID = "pay_transaction_id";
  @SerializedName(SERIALIZED_NAME_PAY_TRANSACTION_ID)
  private String payTransactionId;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public static final String SERIALIZED_NAME_VER_DEPT = "ver_dept";
  @SerializedName(SERIALIZED_NAME_VER_DEPT)
  private String verDept;

  public AlipayTradeCustomsDeclareResponseModel() { 
  }

  public AlipayTradeCustomsDeclareResponseModel alipayDeclareNo(String alipayDeclareNo) {
    
    this.alipayDeclareNo = alipayDeclareNo;
    return this;
  }

   /**
   * 支付宝报关流水号。
   * @return alipayDeclareNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013112611001004680073956707", value = "支付宝报关流水号。")

  public String getAlipayDeclareNo() {
    return alipayDeclareNo;
  }


  public void setAlipayDeclareNo(String alipayDeclareNo) {
    this.alipayDeclareNo = alipayDeclareNo;
  }


  public AlipayTradeCustomsDeclareResponseModel currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * 币种
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "142", value = "币种")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public AlipayTradeCustomsDeclareResponseModel identityCheck(String identityCheck) {
    
    this.identityCheck = identityCheck;
    return this;
  }

   /**
   * 订购人身份信息和支付人的身份信息验证结果。T表示商户传入的订购人姓名和身份证号和支付人的姓名和身份证号一致。F代表商户传入的订购人姓名和身份证号和支付人的姓名和身份证号不一致。对于同一笔报关单支付宝只会校验一次，如果多次重推不会返回此参数。
   * @return identityCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "订购人身份信息和支付人的身份信息验证结果。T表示商户传入的订购人姓名和身份证号和支付人的姓名和身份证号一致。F代表商户传入的订购人姓名和身份证号和支付人的姓名和身份证号不一致。对于同一笔报关单支付宝只会校验一次，如果多次重推不会返回此参数。")

  public String getIdentityCheck() {
    return identityCheck;
  }


  public void setIdentityCheck(String identityCheck) {
    this.identityCheck = identityCheck;
  }


  public AlipayTradeCustomsDeclareResponseModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 国际站外部订单号
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1422534255340818295", value = "国际站外部订单号")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayTradeCustomsDeclareResponseModel payCode(String payCode) {
    
    this.payCode = payCode;
    return this;
  }

   /**
   * 支付机构注册号
   * @return payCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31222699S7", value = "支付机构注册号")

  public String getPayCode() {
    return payCode;
  }


  public void setPayCode(String payCode) {
    this.payCode = payCode;
  }


  public AlipayTradeCustomsDeclareResponseModel payTransactionId(String payTransactionId) {
    
    this.payTransactionId = payTransactionId;
    return this;
  }

   /**
   * 清算流水号
   * @return payTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019032011082610277150475", value = "清算流水号")

  public String getPayTransactionId() {
    return payTransactionId;
  }


  public void setPayTransactionId(String payTransactionId) {
    this.payTransactionId = payTransactionId;
  }


  public AlipayTradeCustomsDeclareResponseModel totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 交易总金额(单位:分)
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "133000", value = "交易总金额(单位:分)")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public AlipayTradeCustomsDeclareResponseModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝推送到海关的支付单据号。
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013111511001004390000105126", value = "支付宝推送到海关的支付单据号。")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }


  public AlipayTradeCustomsDeclareResponseModel verDept(String verDept) {
    
    this.verDept = verDept;
    return this;
  }

   /**
   * 清算机构标志（1-cup,2-null,3-other）
   * @return verDept
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "清算机构标志（1-cup,2-null,3-other）")

  public String getVerDept() {
    return verDept;
  }


  public void setVerDept(String verDept) {
    this.verDept = verDept;
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
   * @return the AlipayTradeCustomsDeclareResponseModel instance itself
   */
  public AlipayTradeCustomsDeclareResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeCustomsDeclareResponseModel alipayTradeCustomsDeclareResponseModel = (AlipayTradeCustomsDeclareResponseModel) o;
    return Objects.equals(this.alipayDeclareNo, alipayTradeCustomsDeclareResponseModel.alipayDeclareNo) &&
        Objects.equals(this.currency, alipayTradeCustomsDeclareResponseModel.currency) &&
        Objects.equals(this.identityCheck, alipayTradeCustomsDeclareResponseModel.identityCheck) &&
        Objects.equals(this.outTradeNo, alipayTradeCustomsDeclareResponseModel.outTradeNo) &&
        Objects.equals(this.payCode, alipayTradeCustomsDeclareResponseModel.payCode) &&
        Objects.equals(this.payTransactionId, alipayTradeCustomsDeclareResponseModel.payTransactionId) &&
        Objects.equals(this.totalAmount, alipayTradeCustomsDeclareResponseModel.totalAmount) &&
        Objects.equals(this.tradeNo, alipayTradeCustomsDeclareResponseModel.tradeNo) &&
        Objects.equals(this.verDept, alipayTradeCustomsDeclareResponseModel.verDept)&&
        Objects.equals(this.additionalProperties, alipayTradeCustomsDeclareResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayDeclareNo, currency, identityCheck, outTradeNo, payCode, payTransactionId, totalAmount, tradeNo, verDept, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeCustomsDeclareResponseModel {\n");
    sb.append("    alipayDeclareNo: ").append(toIndentedString(alipayDeclareNo)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    identityCheck: ").append(toIndentedString(identityCheck)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    payCode: ").append(toIndentedString(payCode)).append("\n");
    sb.append("    payTransactionId: ").append(toIndentedString(payTransactionId)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
    sb.append("    verDept: ").append(toIndentedString(verDept)).append("\n");
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
    openapiFields.add("alipay_declare_no");
    openapiFields.add("currency");
    openapiFields.add("identity_check");
    openapiFields.add("out_trade_no");
    openapiFields.add("pay_code");
    openapiFields.add("pay_transaction_id");
    openapiFields.add("total_amount");
    openapiFields.add("trade_no");
    openapiFields.add("ver_dept");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeCustomsDeclareResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeCustomsDeclareResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeCustomsDeclareResponseModel is not found in the empty JSON string", AlipayTradeCustomsDeclareResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("alipay_declare_no") != null && !jsonObj.get("alipay_declare_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_declare_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_declare_no").toString()));
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (jsonObj.get("identity_check") != null && !jsonObj.get("identity_check").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_check` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_check").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      if (jsonObj.get("pay_code") != null && !jsonObj.get("pay_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_code").toString()));
      }
      if (jsonObj.get("pay_transaction_id") != null && !jsonObj.get("pay_transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_transaction_id").toString()));
      }
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
      if (jsonObj.get("ver_dept") != null && !jsonObj.get("ver_dept").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ver_dept` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ver_dept").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeCustomsDeclareResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeCustomsDeclareResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeCustomsDeclareResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeCustomsDeclareResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeCustomsDeclareResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeCustomsDeclareResponseModel value) throws IOException {
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
           public AlipayTradeCustomsDeclareResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeCustomsDeclareResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeCustomsDeclareResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeCustomsDeclareResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeCustomsDeclareResponseModel
  */
  public static AlipayTradeCustomsDeclareResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeCustomsDeclareResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeCustomsDeclareResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

