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
 * VoucherBalanceRechargeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherBalanceRechargeInfo {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_LOGON_ID = "logon_id";
  @SerializedName(SERIALIZED_NAME_LOGON_ID)
  private String logonId;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public VoucherBalanceRechargeInfo() { 
  }

  public VoucherBalanceRechargeInfo amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 支付宝余额充值金额  限制：   1.币种为人民币，单位元。   2. 总预算&#x3D;优惠金额*总发券张数
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝余额充值金额  限制：   1.币种为人民币，单位元。   2. 总预算=优惠金额*总发券张数")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public VoucherBalanceRechargeInfo logonId(String logonId) {
    
    this.logonId = logonId;
    return this;
  }

   /**
   * 出资的商户支付宝登录账号  限制:  logon_id和partner_id必须且只能二选一
   * @return logonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "出资的商户支付宝登录账号  限制:  logon_id和partner_id必须且只能二选一")

  public String getLogonId() {
    return logonId;
  }


  public void setLogonId(String logonId) {
    this.logonId = logonId;
  }


  public VoucherBalanceRechargeInfo partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 出资的商户支付宝ID  限制:  logon_id和partner_id必须且只能二选一
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "出资的商户支付宝ID  限制:  logon_id和partner_id必须且只能二选一")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherBalanceRechargeInfo voucherBalanceRechargeInfo = (VoucherBalanceRechargeInfo) o;
    return Objects.equals(this.amount, voucherBalanceRechargeInfo.amount) &&
        Objects.equals(this.logonId, voucherBalanceRechargeInfo.logonId) &&
        Objects.equals(this.partnerId, voucherBalanceRechargeInfo.partnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, logonId, partnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherBalanceRechargeInfo {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    logonId: ").append(toIndentedString(logonId)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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
    openapiFields.add("logon_id");
    openapiFields.add("partner_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherBalanceRechargeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherBalanceRechargeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherBalanceRechargeInfo is not found in the empty JSON string", VoucherBalanceRechargeInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherBalanceRechargeInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherBalanceRechargeInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("logon_id") != null && !jsonObj.get("logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logon_id").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherBalanceRechargeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherBalanceRechargeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherBalanceRechargeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherBalanceRechargeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherBalanceRechargeInfo>() {
           @Override
           public void write(JsonWriter out, VoucherBalanceRechargeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherBalanceRechargeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherBalanceRechargeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherBalanceRechargeInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherBalanceRechargeInfo
  */
  public static VoucherBalanceRechargeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherBalanceRechargeInfo.class);
  }

 /**
  * Convert an instance of VoucherBalanceRechargeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

