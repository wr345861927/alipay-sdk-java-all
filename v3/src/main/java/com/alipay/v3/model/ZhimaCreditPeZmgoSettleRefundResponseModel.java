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
   * 本次请求退款金额，单位为：元（人民币），精确到小数点后两位
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.00", value = "本次请求退款金额，单位为：元（人民币），精确到小数点后两位")

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
   * @return the ZhimaCreditPeZmgoSettleRefundResponseModel instance itself
   */
  public ZhimaCreditPeZmgoSettleRefundResponseModel putAdditionalProperty(String key, Object value) {
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
    ZhimaCreditPeZmgoSettleRefundResponseModel zhimaCreditPeZmgoSettleRefundResponseModel = (ZhimaCreditPeZmgoSettleRefundResponseModel) o;
    return Objects.equals(this.failReason, zhimaCreditPeZmgoSettleRefundResponseModel.failReason) &&
        Objects.equals(this.outRequestNo, zhimaCreditPeZmgoSettleRefundResponseModel.outRequestNo) &&
        Objects.equals(this.refundAmount, zhimaCreditPeZmgoSettleRefundResponseModel.refundAmount) &&
        Objects.equals(this.refundOptNo, zhimaCreditPeZmgoSettleRefundResponseModel.refundOptNo) &&
        Objects.equals(this.retry, zhimaCreditPeZmgoSettleRefundResponseModel.retry) &&
        Objects.equals(this.withholdPlanNo, zhimaCreditPeZmgoSettleRefundResponseModel.withholdPlanNo)&&
        Objects.equals(this.additionalProperties, zhimaCreditPeZmgoSettleRefundResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failReason, outRequestNo, refundAmount, refundOptNo, retry, withholdPlanNo, additionalProperties);
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
           public ZhimaCreditPeZmgoSettleRefundResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZhimaCreditPeZmgoSettleRefundResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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

