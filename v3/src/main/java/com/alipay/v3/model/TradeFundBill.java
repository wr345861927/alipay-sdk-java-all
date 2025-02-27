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
 * TradeFundBill
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TradeFundBill {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_FUND_CHANNEL = "fund_channel";
  @SerializedName(SERIALIZED_NAME_FUND_CHANNEL)
  private String fundChannel;

  public static final String SERIALIZED_NAME_FUND_TYPE = "fund_type";
  @SerializedName(SERIALIZED_NAME_FUND_TYPE)
  private String fundType;

  public static final String SERIALIZED_NAME_REAL_AMOUNT = "real_amount";
  @SerializedName(SERIALIZED_NAME_REAL_AMOUNT)
  private String realAmount;

  public TradeFundBill() { 
  }

  public TradeFundBill amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 该支付工具类型所使用的金额
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该支付工具类型所使用的金额")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TradeFundBill bankCode(String bankCode) {
    
    this.bankCode = bankCode;
    return this;
  }

   /**
   * 银行卡支付时的银行代码
   * @return bankCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "银行卡支付时的银行代码")

  public String getBankCode() {
    return bankCode;
  }


  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }


  public TradeFundBill fundChannel(String fundChannel) {
    
    this.fundChannel = fundChannel;
    return this;
  }

   /**
   * 交易使用的资金渠道，详见 &lt;a href&#x3D;\&quot;https://doc.open.alipay.com/doc2/detail?treeId&#x3D;26&amp;articleId&#x3D;103259&amp;docType&#x3D;1\&quot;&gt;支付渠道列表&lt;/a&gt;
   * @return fundChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易使用的资金渠道，详见 <a href=\"https://doc.open.alipay.com/doc2/detail?treeId=26&articleId=103259&docType=1\">支付渠道列表</a>")

  public String getFundChannel() {
    return fundChannel;
  }


  public void setFundChannel(String fundChannel) {
    this.fundChannel = fundChannel;
  }


  public TradeFundBill fundType(String fundType) {
    
    this.fundType = fundType;
    return this;
  }

   /**
   * 渠道所使用的资金类型,目前只在资金渠道(fund_channel)是银行卡渠道(BANKCARD)的情况下才返回该信息
   * @return fundType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "渠道所使用的资金类型,目前只在资金渠道(fund_channel)是银行卡渠道(BANKCARD)的情况下才返回该信息")

  public String getFundType() {
    return fundType;
  }


  public void setFundType(String fundType) {
    this.fundType = fundType;
  }


  public TradeFundBill realAmount(String realAmount) {
    
    this.realAmount = realAmount;
    return this;
  }

   /**
   * 渠道实际付款金额
   * @return realAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "渠道实际付款金额")

  public String getRealAmount() {
    return realAmount;
  }


  public void setRealAmount(String realAmount) {
    this.realAmount = realAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeFundBill tradeFundBill = (TradeFundBill) o;
    return Objects.equals(this.amount, tradeFundBill.amount) &&
        Objects.equals(this.bankCode, tradeFundBill.bankCode) &&
        Objects.equals(this.fundChannel, tradeFundBill.fundChannel) &&
        Objects.equals(this.fundType, tradeFundBill.fundType) &&
        Objects.equals(this.realAmount, tradeFundBill.realAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bankCode, fundChannel, fundType, realAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeFundBill {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    fundChannel: ").append(toIndentedString(fundChannel)).append("\n");
    sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
    sb.append("    realAmount: ").append(toIndentedString(realAmount)).append("\n");
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
    openapiFields.add("bank_code");
    openapiFields.add("fund_channel");
    openapiFields.add("fund_type");
    openapiFields.add("real_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TradeFundBill
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TradeFundBill.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TradeFundBill is not found in the empty JSON string", TradeFundBill.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TradeFundBill.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TradeFundBill` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("bank_code") != null && !jsonObj.get("bank_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_code").toString()));
      }
      if (jsonObj.get("fund_channel") != null && !jsonObj.get("fund_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_channel").toString()));
      }
      if (jsonObj.get("fund_type") != null && !jsonObj.get("fund_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_type").toString()));
      }
      if (jsonObj.get("real_amount") != null && !jsonObj.get("real_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TradeFundBill.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TradeFundBill' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TradeFundBill> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TradeFundBill.class));

       return (TypeAdapter<T>) new TypeAdapter<TradeFundBill>() {
           @Override
           public void write(JsonWriter out, TradeFundBill value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TradeFundBill read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TradeFundBill given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TradeFundBill
  * @throws IOException if the JSON string is invalid with respect to TradeFundBill
  */
  public static TradeFundBill fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TradeFundBill.class);
  }

 /**
  * Convert an instance of TradeFundBill to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

