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
 * AlipayFundAuthOrderFreezeResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAuthOrderFreezeResponseModel {
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

  public static final String SERIALIZED_NAME_PAYER_LOGON_ID = "payer_logon_id";
  @SerializedName(SERIALIZED_NAME_PAYER_LOGON_ID)
  private String payerLogonId;

  public static final String SERIALIZED_NAME_PAYER_OPEN_ID = "payer_open_id";
  @SerializedName(SERIALIZED_NAME_PAYER_OPEN_ID)
  private String payerOpenId;

  public static final String SERIALIZED_NAME_PAYER_USER_ID = "payer_user_id";
  @SerializedName(SERIALIZED_NAME_PAYER_USER_ID)
  private String payerUserId;

  public static final String SERIALIZED_NAME_PRE_AUTH_TYPE = "pre_auth_type";
  @SerializedName(SERIALIZED_NAME_PRE_AUTH_TYPE)
  private String preAuthType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRANS_CURRENCY = "trans_currency";
  @SerializedName(SERIALIZED_NAME_TRANS_CURRENCY)
  private String transCurrency;

  public AlipayFundAuthOrderFreezeResponseModel() { 
  }

  public AlipayFundAuthOrderFreezeResponseModel amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 本次操作冻结的金额，单位为：元（人民币），精确到小数点后两位
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.01", value = "本次操作冻结的金额，单位为：元（人民币），精确到小数点后两位")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AlipayFundAuthOrderFreezeResponseModel authNo(String authNo) {
    
    this.authNo = authNo;
    return this;
  }

   /**
   * 支付宝的资金授权订单号
   * @return authNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014070800002001550000014417", value = "支付宝的资金授权订单号")

  public String getAuthNo() {
    return authNo;
  }


  public void setAuthNo(String authNo) {
    this.authNo = authNo;
  }


  public AlipayFundAuthOrderFreezeResponseModel creditAmount(String creditAmount) {
    
    this.creditAmount = creditAmount;
    return this;
  }

   /**
   * 本次冻结操作中信用冻结金额，单位为：元（人民币），精确到小数点后两位
   * @return creditAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.01", value = "本次冻结操作中信用冻结金额，单位为：元（人民币），精确到小数点后两位")

  public String getCreditAmount() {
    return creditAmount;
  }


  public void setCreditAmount(String creditAmount) {
    this.creditAmount = creditAmount;
  }


  public AlipayFundAuthOrderFreezeResponseModel fundAmount(String fundAmount) {
    
    this.fundAmount = fundAmount;
    return this;
  }

   /**
   * 本次冻结操作中自有资金冻结金额，单位为：元（人民币），精确到小数点后两位
   * @return fundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.01", value = "本次冻结操作中自有资金冻结金额，单位为：元（人民币），精确到小数点后两位")

  public String getFundAmount() {
    return fundAmount;
  }


  public void setFundAmount(String fundAmount) {
    this.fundAmount = fundAmount;
  }


  public AlipayFundAuthOrderFreezeResponseModel gmtTrans(String gmtTrans) {
    
    this.gmtTrans = gmtTrans;
    return this;
  }

   /**
   * 资金授权成功时间  格式：YYYY-MM-DD HH:MM:SS
   * @return gmtTrans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-09-15 11:23:04", value = "资金授权成功时间  格式：YYYY-MM-DD HH:MM:SS")

  public String getGmtTrans() {
    return gmtTrans;
  }


  public void setGmtTrans(String gmtTrans) {
    this.gmtTrans = gmtTrans;
  }


  public AlipayFundAuthOrderFreezeResponseModel operationId(String operationId) {
    
    this.operationId = operationId;
    return this;
  }

   /**
   * 支付宝的资金操作流水号
   * @return operationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014070800032850551", value = "支付宝的资金操作流水号")

  public String getOperationId() {
    return operationId;
  }


  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  public AlipayFundAuthOrderFreezeResponseModel outOrderNo(String outOrderNo) {
    
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


  public AlipayFundAuthOrderFreezeResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户本次资金操作的请求流水号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014070700166653", value = "商户本次资金操作的请求流水号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayFundAuthOrderFreezeResponseModel payerLogonId(String payerLogonId) {
    
    this.payerLogonId = payerLogonId;
    return this;
  }

   /**
   * 付款方支付宝账号（Email或手机号）
   * @return payerLogonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test***@alitest.com", value = "付款方支付宝账号（Email或手机号）")

  public String getPayerLogonId() {
    return payerLogonId;
  }


  public void setPayerLogonId(String payerLogonId) {
    this.payerLogonId = payerLogonId;
  }


  public AlipayFundAuthOrderFreezeResponseModel payerOpenId(String payerOpenId) {
    
    this.payerOpenId = payerOpenId;
    return this;
  }

   /**
   * 支付宝openId，用户（userId）在应用（appId）下的唯一用户标识。
   * @return payerOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03914IMEfXsS9K-tSvHy-IisrLlOfthFgDVo-hU30XtKPg9", value = "支付宝openId，用户（userId）在应用（appId）下的唯一用户标识。")

  public String getPayerOpenId() {
    return payerOpenId;
  }


  public void setPayerOpenId(String payerOpenId) {
    this.payerOpenId = payerOpenId;
  }


  public AlipayFundAuthOrderFreezeResponseModel payerUserId(String payerUserId) {
    
    this.payerUserId = payerUserId;
    return this;
  }

   /**
   * 付款方支付宝用户号
   * @return payerUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102000275885", value = "付款方支付宝用户号")

  public String getPayerUserId() {
    return payerUserId;
  }


  public void setPayerUserId(String payerUserId) {
    this.payerUserId = payerUserId;
  }


  public AlipayFundAuthOrderFreezeResponseModel preAuthType(String preAuthType) {
    
    this.preAuthType = preAuthType;
    return this;
  }

   /**
   * 预授权类型，目前支持 CREDIT_AUTH(信用预授权);  商户可根据该标识来判断该笔预授权的类型，当返回值为\&quot;CREDIT_AUTH\&quot;表明该笔预授权为信用预授权，没有真实冻结资金；当返回值为空或者不为\&quot;CREDIT_AUTH\&quot;则表明该笔预授权为普通资金预授权，会冻结用户资金。
   * @return preAuthType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREDIT_AUTH", value = "预授权类型，目前支持 CREDIT_AUTH(信用预授权);  商户可根据该标识来判断该笔预授权的类型，当返回值为\"CREDIT_AUTH\"表明该笔预授权为信用预授权，没有真实冻结资金；当返回值为空或者不为\"CREDIT_AUTH\"则表明该笔预授权为普通资金预授权，会冻结用户资金。")

  public String getPreAuthType() {
    return preAuthType;
  }


  public void setPreAuthType(String preAuthType) {
    this.preAuthType = preAuthType;
  }


  public AlipayFundAuthOrderFreezeResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 资金预授权明细的状态  目前支持：    INIT：初始  SUCCESS: 成功  CLOSED：关闭
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "资金预授权明细的状态  目前支持：    INIT：初始  SUCCESS: 成功  CLOSED：关闭")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayFundAuthOrderFreezeResponseModel transCurrency(String transCurrency) {
    
    this.transCurrency = transCurrency;
    return this;
  }

   /**
   * 标价币种,  amount 对应的币种单位。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
   * @return transCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "标价币种,  amount 对应的币种单位。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP")

  public String getTransCurrency() {
    return transCurrency;
  }


  public void setTransCurrency(String transCurrency) {
    this.transCurrency = transCurrency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundAuthOrderFreezeResponseModel alipayFundAuthOrderFreezeResponseModel = (AlipayFundAuthOrderFreezeResponseModel) o;
    return Objects.equals(this.amount, alipayFundAuthOrderFreezeResponseModel.amount) &&
        Objects.equals(this.authNo, alipayFundAuthOrderFreezeResponseModel.authNo) &&
        Objects.equals(this.creditAmount, alipayFundAuthOrderFreezeResponseModel.creditAmount) &&
        Objects.equals(this.fundAmount, alipayFundAuthOrderFreezeResponseModel.fundAmount) &&
        Objects.equals(this.gmtTrans, alipayFundAuthOrderFreezeResponseModel.gmtTrans) &&
        Objects.equals(this.operationId, alipayFundAuthOrderFreezeResponseModel.operationId) &&
        Objects.equals(this.outOrderNo, alipayFundAuthOrderFreezeResponseModel.outOrderNo) &&
        Objects.equals(this.outRequestNo, alipayFundAuthOrderFreezeResponseModel.outRequestNo) &&
        Objects.equals(this.payerLogonId, alipayFundAuthOrderFreezeResponseModel.payerLogonId) &&
        Objects.equals(this.payerOpenId, alipayFundAuthOrderFreezeResponseModel.payerOpenId) &&
        Objects.equals(this.payerUserId, alipayFundAuthOrderFreezeResponseModel.payerUserId) &&
        Objects.equals(this.preAuthType, alipayFundAuthOrderFreezeResponseModel.preAuthType) &&
        Objects.equals(this.status, alipayFundAuthOrderFreezeResponseModel.status) &&
        Objects.equals(this.transCurrency, alipayFundAuthOrderFreezeResponseModel.transCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, authNo, creditAmount, fundAmount, gmtTrans, operationId, outOrderNo, outRequestNo, payerLogonId, payerOpenId, payerUserId, preAuthType, status, transCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAuthOrderFreezeResponseModel {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    authNo: ").append(toIndentedString(authNo)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    fundAmount: ").append(toIndentedString(fundAmount)).append("\n");
    sb.append("    gmtTrans: ").append(toIndentedString(gmtTrans)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    payerLogonId: ").append(toIndentedString(payerLogonId)).append("\n");
    sb.append("    payerOpenId: ").append(toIndentedString(payerOpenId)).append("\n");
    sb.append("    payerUserId: ").append(toIndentedString(payerUserId)).append("\n");
    sb.append("    preAuthType: ").append(toIndentedString(preAuthType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transCurrency: ").append(toIndentedString(transCurrency)).append("\n");
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
    openapiFields.add("payer_logon_id");
    openapiFields.add("payer_open_id");
    openapiFields.add("payer_user_id");
    openapiFields.add("pre_auth_type");
    openapiFields.add("status");
    openapiFields.add("trans_currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAuthOrderFreezeResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAuthOrderFreezeResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAuthOrderFreezeResponseModel is not found in the empty JSON string", AlipayFundAuthOrderFreezeResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundAuthOrderFreezeResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundAuthOrderFreezeResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("payer_logon_id") != null && !jsonObj.get("payer_logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_logon_id").toString()));
      }
      if (jsonObj.get("payer_open_id") != null && !jsonObj.get("payer_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_open_id").toString()));
      }
      if (jsonObj.get("payer_user_id") != null && !jsonObj.get("payer_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_user_id").toString()));
      }
      if (jsonObj.get("pre_auth_type") != null && !jsonObj.get("pre_auth_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pre_auth_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pre_auth_type").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("trans_currency") != null && !jsonObj.get("trans_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAuthOrderFreezeResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAuthOrderFreezeResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAuthOrderFreezeResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAuthOrderFreezeResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAuthOrderFreezeResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAuthOrderFreezeResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundAuthOrderFreezeResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundAuthOrderFreezeResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAuthOrderFreezeResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAuthOrderFreezeResponseModel
  */
  public static AlipayFundAuthOrderFreezeResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAuthOrderFreezeResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundAuthOrderFreezeResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

