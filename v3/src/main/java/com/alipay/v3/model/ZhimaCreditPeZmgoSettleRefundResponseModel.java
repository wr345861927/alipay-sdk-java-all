/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-10-25
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
 * ZhimaCreditPeZmgoSettleRefundResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPeZmgoSettleRefundResponseModel {
  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private String refundAmount;

  public static final String SERIALIZED_NAME_REFUND_OPT_NO = "refund_opt_no";
  @SerializedName(SERIALIZED_NAME_REFUND_OPT_NO)
  private String refundOptNo;

  public static final String SERIALIZED_NAME_RETRY = "retry";
  @SerializedName(SERIALIZED_NAME_RETRY)
  private Boolean retry;

  public static final String SERIALIZED_NAME_WITHHOLD_PLAN_NO = "withhold_plan_no";
  @SerializedName(SERIALIZED_NAME_WITHHOLD_PLAN_NO)
  private String withholdPlanNo;

  public ZhimaCreditPeZmgoSettleRefundResponseModel() { 
  }

  public ZhimaCreditPeZmgoSettleRefundResponseModel failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 退款操作错误原因描述
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "退款金额超限", value = "退款操作错误原因描述")

  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public ZhimaCreditPeZmgoSettleRefundResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 外部请求号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99202005050100930053707258", value = "外部请求号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public ZhimaCreditPeZmgoSettleRefundResponseModel refundAmount(String refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 本次请求退款金额
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.00", value = "本次请求退款金额")

  public String getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
  }


  public ZhimaCreditPeZmgoSettleRefundResponseModel refundOptNo(String refundOptNo) {
    
    this.refundOptNo = refundOptNo;
    return this;
  }

   /**
   * 芝麻GO退款生成的内部唯一流水，外部商户可以拿这个参数进行对账
   * @return refundOptNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMGO_OPT202107271002060716000012522x", value = "芝麻GO退款生成的内部唯一流水，外部商户可以拿这个参数进行对账")

  public String getRefundOptNo() {
    return refundOptNo;
  }


  public void setRefundOptNo(String refundOptNo) {
    this.refundOptNo = refundOptNo;
  }


  public ZhimaCreditPeZmgoSettleRefundResponseModel retry(Boolean retry) {
    
    this.retry = retry;
    return this;
  }

   /**
   * 此字段含义，商家接入时需咨询对接技术。
   * @return retry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "此字段含义，商家接入时需咨询对接技术。")

  public Boolean getRetry() {
    return retry;
  }


  public void setRetry(Boolean retry) {
    this.retry = retry;
  }


  public ZhimaCreditPeZmgoSettleRefundResponseModel withholdPlanNo(String withholdPlanNo) {
    
    this.withholdPlanNo = withholdPlanNo;
    return this;
  }

   /**
   * 本次退款的扣款计划单号
   * @return withholdPlanNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMGO_WHD2021010510020603410000006001", value = "本次退款的扣款计划单号")

  public String getWithholdPlanNo() {
    return withholdPlanNo;
  }


  public void setWithholdPlanNo(String withholdPlanNo) {
    this.withholdPlanNo = withholdPlanNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCreditPeZmgoSettleRefundResponseModel zhimaCreditPeZmgoSettleRefundResponseModel = (ZhimaCreditPeZmgoSettleRefundResponseModel) o;
    return Objects.equals(this.failReason, zhimaCreditPeZmgoSettleRefundResponseModel.failReason) &&
        Objects.equals(this.outRequestNo, zhimaCreditPeZmgoSettleRefundResponseModel.outRequestNo) &&
        Objects.equals(this.refundAmount, zhimaCreditPeZmgoSettleRefundResponseModel.refundAmount) &&
        Objects.equals(this.refundOptNo, zhimaCreditPeZmgoSettleRefundResponseModel.refundOptNo) &&
        Objects.equals(this.retry, zhimaCreditPeZmgoSettleRefundResponseModel.retry) &&
        Objects.equals(this.withholdPlanNo, zhimaCreditPeZmgoSettleRefundResponseModel.withholdPlanNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failReason, outRequestNo, refundAmount, refundOptNo, retry, withholdPlanNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPeZmgoSettleRefundResponseModel {\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundOptNo: ").append(toIndentedString(refundOptNo)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    withholdPlanNo: ").append(toIndentedString(withholdPlanNo)).append("\n");
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
    openapiFields.add("fail_reason");
    openapiFields.add("out_request_no");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_opt_no");
    openapiFields.add("retry");
    openapiFields.add("withhold_plan_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPeZmgoSettleRefundResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPeZmgoSettleRefundResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPeZmgoSettleRefundResponseModel is not found in the empty JSON string", ZhimaCreditPeZmgoSettleRefundResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCreditPeZmgoSettleRefundResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCreditPeZmgoSettleRefundResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("fail_reason") != null && !jsonObj.get("fail_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_reason").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("refund_amount") != null && !jsonObj.get("refund_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_amount").toString()));
      }
      if (jsonObj.get("refund_opt_no") != null && !jsonObj.get("refund_opt_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_opt_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_opt_no").toString()));
      }
      if (jsonObj.get("withhold_plan_no") != null && !jsonObj.get("withhold_plan_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withhold_plan_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withhold_plan_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPeZmgoSettleRefundResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPeZmgoSettleRefundResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPeZmgoSettleRefundResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPeZmgoSettleRefundResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPeZmgoSettleRefundResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPeZmgoSettleRefundResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCreditPeZmgoSettleRefundResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCreditPeZmgoSettleRefundResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPeZmgoSettleRefundResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPeZmgoSettleRefundResponseModel
  */
  public static ZhimaCreditPeZmgoSettleRefundResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPeZmgoSettleRefundResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPeZmgoSettleRefundResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

