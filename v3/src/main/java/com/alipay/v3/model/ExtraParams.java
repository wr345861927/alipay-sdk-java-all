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
 * ExtraParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExtraParams {
  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period;

  public static final String SERIALIZED_NAME_PERIOD_SUMMARY_INFO = "period_summary_info";
  @SerializedName(SERIALIZED_NAME_PERIOD_SUMMARY_INFO)
  private String periodSummaryInfo;

  public static final String SERIALIZED_NAME_QUIT_TYPE = "quit_type";
  @SerializedName(SERIALIZED_NAME_QUIT_TYPE)
  private String quitType;

  public static final String SERIALIZED_NAME_WITHHOLD_INDEX = "withhold_index";
  @SerializedName(SERIALIZED_NAME_WITHHOLD_INDEX)
  private String withholdIndex;

  public ExtraParams() { 
  }

  public ExtraParams period(String period) {
    
    this.period = period;
    return this;
  }

   /**
   * 轻会员场景下协议结算周期，由协议生效日期到失效日期拼接(yyyyMMddHHmmss-yyyyMMddHHmmss)，精确到秒。
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20181223235059-20181230235010", value = "轻会员场景下协议结算周期，由协议生效日期到失效日期拼接(yyyyMMddHHmmss-yyyyMMddHHmmss)，精确到秒。")

  public String getPeriod() {
    return period;
  }


  public void setPeriod(String period) {
    this.period = period;
  }


  public ExtraParams periodSummaryInfo(String periodSummaryInfo) {
    
    this.periodSummaryInfo = periodSummaryInfo;
    return this;
  }

   /**
   * 轻会员费用结算原始信息。详细字段说明：total_real_pay_amount轻会员周期内累计支付宝支付金额， total_pay_count轻会员周期内累计支付宝支付次数，total_discount_amount轻会员周期内累计享受的轻会员优惠。（上面金额字段单位为元，精确小数点后两位）
   * @return periodSummaryInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"total_real_pay_amount\":\"100.00\",\"total_pay_count\":\"4\",\"total_discount_amount\":\"2.31\"}", value = "轻会员费用结算原始信息。详细字段说明：total_real_pay_amount轻会员周期内累计支付宝支付金额， total_pay_count轻会员周期内累计支付宝支付次数，total_discount_amount轻会员周期内累计享受的轻会员优惠。（上面金额字段单位为元，精确小数点后两位）")

  public String getPeriodSummaryInfo() {
    return periodSummaryInfo;
  }


  public void setPeriodSummaryInfo(String periodSummaryInfo) {
    this.periodSummaryInfo = periodSummaryInfo;
  }


  public ExtraParams quitType(String quitType) {
    
    this.quitType = quitType;
    return this;
  }

   /**
   * 用户主动意愿退出：USER_CANCEL_QUIT; 商户结算退出：SETTLE_APPLY_QUIT; 默认值为SETTLE_APPLY_QUIT；这个字段会影响用户在芝麻信用合约的状态
   * @return quitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SETTLE_APPLY_QUIT", value = "用户主动意愿退出：USER_CANCEL_QUIT; 商户结算退出：SETTLE_APPLY_QUIT; 默认值为SETTLE_APPLY_QUIT；这个字段会影响用户在芝麻信用合约的状态")

  public String getQuitType() {
    return quitType;
  }


  public void setQuitType(String quitType) {
    this.quitType = quitType;
  }


  public ExtraParams withholdIndex(String withholdIndex) {
    
    this.withholdIndex = withholdIndex;
    return this;
  }

   /**
   * 代扣期数，周期扣场景PERIOD_SETTLE下需要传递
   * @return withholdIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "代扣期数，周期扣场景PERIOD_SETTLE下需要传递")

  public String getWithholdIndex() {
    return withholdIndex;
  }


  public void setWithholdIndex(String withholdIndex) {
    this.withholdIndex = withholdIndex;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraParams extraParams = (ExtraParams) o;
    return Objects.equals(this.period, extraParams.period) &&
        Objects.equals(this.periodSummaryInfo, extraParams.periodSummaryInfo) &&
        Objects.equals(this.quitType, extraParams.quitType) &&
        Objects.equals(this.withholdIndex, extraParams.withholdIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, periodSummaryInfo, quitType, withholdIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraParams {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodSummaryInfo: ").append(toIndentedString(periodSummaryInfo)).append("\n");
    sb.append("    quitType: ").append(toIndentedString(quitType)).append("\n");
    sb.append("    withholdIndex: ").append(toIndentedString(withholdIndex)).append("\n");
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
    openapiFields.add("period");
    openapiFields.add("period_summary_info");
    openapiFields.add("quit_type");
    openapiFields.add("withhold_index");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExtraParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExtraParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtraParams is not found in the empty JSON string", ExtraParams.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExtraParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExtraParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("period") != null && !jsonObj.get("period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period").toString()));
      }
      if (jsonObj.get("period_summary_info") != null && !jsonObj.get("period_summary_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period_summary_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period_summary_info").toString()));
      }
      if (jsonObj.get("quit_type") != null && !jsonObj.get("quit_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quit_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quit_type").toString()));
      }
      if (jsonObj.get("withhold_index") != null && !jsonObj.get("withhold_index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withhold_index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withhold_index").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtraParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtraParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtraParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtraParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtraParams>() {
           @Override
           public void write(JsonWriter out, ExtraParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExtraParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExtraParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExtraParams
  * @throws IOException if the JSON string is invalid with respect to ExtraParams
  */
  public static ExtraParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtraParams.class);
  }

 /**
  * Convert an instance of ExtraParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

