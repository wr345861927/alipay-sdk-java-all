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
 * AlipayFundAuthOrderUnfreezeResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAuthOrderUnfreezeResponseModel {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_AUTH_NO = "auth_no";
  @SerializedName(SERIALIZED_NAME_AUTH_NO)
  private String authNo;

  public static final String SERIALIZED_NAME_CREDIT_AMOUNT = "credit_amount";
  @SerializedName(SERIALIZED_NAME_CREDIT_AMOUNT)
  private String creditAmount;

  public static final String SERIALIZED_NAME_FUND_AMOUNT = "fund_amount";
  @SerializedName(SERIALIZED_NAME_FUND_AMOUNT)
  private String fundAmount;

  public static final String SERIALIZED_NAME_GMT_TRANS = "gmt_trans";
  @SerializedName(SERIALIZED_NAME_GMT_TRANS)
  private String gmtTrans;

  public static final String SERIALIZED_NAME_OPERATION_ID = "operation_id";
  @SerializedName(SERIALIZED_NAME_OPERATION_ID)
  private String operationId;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayFundAuthOrderUnfreezeResponseModel() { 
  }

  public AlipayFundAuthOrderUnfreezeResponseModel amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 本次操作解冻的金额，单位为：元（人民币），精确到小数点后两位，取值范围：[0.01,100000000.00]
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.81", value = "本次操作解冻的金额，单位为：元（人民币），精确到小数点后两位，取值范围：[0.01,100000000.00]")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AlipayFundAuthOrderUnfreezeResponseModel authNo(String authNo) {
    
    this.authNo = authNo;
    return this;
  }

   /**
   * 支付宝资金授权订单号
   * @return authNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014070800002001550000014417", value = "支付宝资金授权订单号")

  public String getAuthNo() {
    return authNo;
  }


  public void setAuthNo(String authNo) {
    this.authNo = authNo;
  }


  public AlipayFundAuthOrderUnfreezeResponseModel creditAmount(String creditAmount) {
    
    this.creditAmount = creditAmount;
    return this;
  }

   /**
   * 本次解冻操作中信用解冻金额，单位为：元（人民币），精确到小数点后两位
   * @return creditAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.01", value = "本次解冻操作中信用解冻金额，单位为：元（人民币），精确到小数点后两位")

  public String getCreditAmount() {
    return creditAmount;
  }


  public void setCreditAmount(String creditAmount) {
    this.creditAmount = creditAmount;
  }


  public AlipayFundAuthOrderUnfreezeResponseModel fundAmount(String fundAmount) {
    
    this.fundAmount = fundAmount;
    return this;
  }

   /**
   * 本次解冻操作中自有资金解冻金额，单位为：元（人民币），精确到小数点后两位
   * @return fundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.01", value = "本次解冻操作中自有资金解冻金额，单位为：元（人民币），精确到小数点后两位")

  public String getFundAmount() {
    return fundAmount;
  }


  public void setFundAmount(String fundAmount) {
    this.fundAmount = fundAmount;
  }


  public AlipayFundAuthOrderUnfreezeResponseModel gmtTrans(String gmtTrans) {
    
    this.gmtTrans = gmtTrans;
    return this;
  }

   /**
   * 授权资金解冻成功时间，格式：YYYY-MM-DD HH:MM:SS
   * @return gmtTrans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-09-15 11:23:04", value = "授权资金解冻成功时间，格式：YYYY-MM-DD HH:MM:SS")

  public String getGmtTrans() {
    return gmtTrans;
  }


  public void setGmtTrans(String gmtTrans) {
    this.gmtTrans = gmtTrans;
  }


  public AlipayFundAuthOrderUnfreezeResponseModel operationId(String operationId) {
    
    this.operationId = operationId;
    return this;
  }

   /**
   * 支付宝资金操作流水号
   * @return operationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014070800032850551", value = "支付宝资金操作流水号")

  public String getOperationId() {
    return operationId;
  }


  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  public AlipayFundAuthOrderUnfreezeResponseModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 商户的授权资金订单号
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4977164666634053", value = "商户的授权资金订单号")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public AlipayFundAuthOrderUnfreezeResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户本次资金操作的请求流水号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20140707001555633", value = "商户本次资金操作的请求流水号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayFundAuthOrderUnfreezeResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 资金操作流水的状态 目前支持：SUCCESS：成功
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "资金操作流水的状态 目前支持：SUCCESS：成功")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the AlipayFundAuthOrderUnfreezeResponseModel instance itself
   */
  public AlipayFundAuthOrderUnfreezeResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayFundAuthOrderUnfreezeResponseModel alipayFundAuthOrderUnfreezeResponseModel = (AlipayFundAuthOrderUnfreezeResponseModel) o;
    return Objects.equals(this.amount, alipayFundAuthOrderUnfreezeResponseModel.amount) &&
        Objects.equals(this.authNo, alipayFundAuthOrderUnfreezeResponseModel.authNo) &&
        Objects.equals(this.creditAmount, alipayFundAuthOrderUnfreezeResponseModel.creditAmount) &&
        Objects.equals(this.fundAmount, alipayFundAuthOrderUnfreezeResponseModel.fundAmount) &&
        Objects.equals(this.gmtTrans, alipayFundAuthOrderUnfreezeResponseModel.gmtTrans) &&
        Objects.equals(this.operationId, alipayFundAuthOrderUnfreezeResponseModel.operationId) &&
        Objects.equals(this.outOrderNo, alipayFundAuthOrderUnfreezeResponseModel.outOrderNo) &&
        Objects.equals(this.outRequestNo, alipayFundAuthOrderUnfreezeResponseModel.outRequestNo) &&
        Objects.equals(this.status, alipayFundAuthOrderUnfreezeResponseModel.status)&&
        Objects.equals(this.additionalProperties, alipayFundAuthOrderUnfreezeResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, authNo, creditAmount, fundAmount, gmtTrans, operationId, outOrderNo, outRequestNo, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAuthOrderUnfreezeResponseModel {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    authNo: ").append(toIndentedString(authNo)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    fundAmount: ").append(toIndentedString(fundAmount)).append("\n");
    sb.append("    gmtTrans: ").append(toIndentedString(gmtTrans)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("auth_no");
    openapiFields.add("credit_amount");
    openapiFields.add("fund_amount");
    openapiFields.add("gmt_trans");
    openapiFields.add("operation_id");
    openapiFields.add("out_order_no");
    openapiFields.add("out_request_no");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAuthOrderUnfreezeResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAuthOrderUnfreezeResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAuthOrderUnfreezeResponseModel is not found in the empty JSON string", AlipayFundAuthOrderUnfreezeResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("auth_no") != null && !jsonObj.get("auth_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_no").toString()));
      }
      if (jsonObj.get("credit_amount") != null && !jsonObj.get("credit_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_amount").toString()));
      }
      if (jsonObj.get("fund_amount") != null && !jsonObj.get("fund_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_amount").toString()));
      }
      if (jsonObj.get("gmt_trans") != null && !jsonObj.get("gmt_trans").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_trans` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_trans").toString()));
      }
      if (jsonObj.get("operation_id") != null && !jsonObj.get("operation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_id").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAuthOrderUnfreezeResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAuthOrderUnfreezeResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAuthOrderUnfreezeResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAuthOrderUnfreezeResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAuthOrderUnfreezeResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAuthOrderUnfreezeResponseModel value) throws IOException {
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
           public AlipayFundAuthOrderUnfreezeResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayFundAuthOrderUnfreezeResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayFundAuthOrderUnfreezeResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAuthOrderUnfreezeResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAuthOrderUnfreezeResponseModel
  */
  public static AlipayFundAuthOrderUnfreezeResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAuthOrderUnfreezeResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundAuthOrderUnfreezeResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

