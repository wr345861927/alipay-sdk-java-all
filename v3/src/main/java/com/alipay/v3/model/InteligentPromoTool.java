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
import com.alipay.v3.model.InteligentSendRule;
import com.alipay.v3.model.InteligentVoucher;
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
 * InteligentPromoTool
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentPromoTool {
  public static final String SERIALIZED_NAME_INTELIGENT_SEND_RULE = "inteligent_send_rule";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_SEND_RULE)
  private InteligentSendRule inteligentSendRule;

  public static final String SERIALIZED_NAME_INTELIGENT_VOUCHER = "inteligent_voucher";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_VOUCHER)
  private InteligentVoucher inteligentVoucher;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_VOUCHER_NO = "voucher_no";
  @SerializedName(SERIALIZED_NAME_VOUCHER_NO)
  private String voucherNo;

  public InteligentPromoTool() { 
  }

  public InteligentPromoTool inteligentSendRule(InteligentSendRule inteligentSendRule) {
    
    this.inteligentSendRule = inteligentSendRule;
    return this;
  }

   /**
   * Get inteligentSendRule
   * @return inteligentSendRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteligentSendRule getInteligentSendRule() {
    return inteligentSendRule;
  }


  public void setInteligentSendRule(InteligentSendRule inteligentSendRule) {
    this.inteligentSendRule = inteligentSendRule;
  }


  public InteligentPromoTool inteligentVoucher(InteligentVoucher inteligentVoucher) {
    
    this.inteligentVoucher = inteligentVoucher;
    return this;
  }

   /**
   * Get inteligentVoucher
   * @return inteligentVoucher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteligentVoucher getInteligentVoucher() {
    return inteligentVoucher;
  }


  public void setInteligentVoucher(InteligentVoucher inteligentVoucher) {
    this.inteligentVoucher = inteligentVoucher;
  }


  public InteligentPromoTool status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 单个营销工具的生效状态，当在招商部分券失效后会使用这个字段
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STARTED", value = "单个营销工具的生效状态，当在招商部分券失效后会使用这个字段")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public InteligentPromoTool voucherNo(String voucherNo) {
    
    this.voucherNo = voucherNo;
    return this;
  }

   /**
   * 营销工具uid,创建营销活动时无需设置
   * @return voucherNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2342343245234234", value = "营销工具uid,创建营销活动时无需设置")

  public String getVoucherNo() {
    return voucherNo;
  }


  public void setVoucherNo(String voucherNo) {
    this.voucherNo = voucherNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteligentPromoTool inteligentPromoTool = (InteligentPromoTool) o;
    return Objects.equals(this.inteligentSendRule, inteligentPromoTool.inteligentSendRule) &&
        Objects.equals(this.inteligentVoucher, inteligentPromoTool.inteligentVoucher) &&
        Objects.equals(this.status, inteligentPromoTool.status) &&
        Objects.equals(this.voucherNo, inteligentPromoTool.voucherNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inteligentSendRule, inteligentVoucher, status, voucherNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentPromoTool {\n");
    sb.append("    inteligentSendRule: ").append(toIndentedString(inteligentSendRule)).append("\n");
    sb.append("    inteligentVoucher: ").append(toIndentedString(inteligentVoucher)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    voucherNo: ").append(toIndentedString(voucherNo)).append("\n");
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
    openapiFields.add("inteligent_send_rule");
    openapiFields.add("inteligent_voucher");
    openapiFields.add("status");
    openapiFields.add("voucher_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentPromoTool
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentPromoTool.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentPromoTool is not found in the empty JSON string", InteligentPromoTool.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentPromoTool.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentPromoTool` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `inteligent_send_rule`
      if (jsonObj.getAsJsonObject("inteligent_send_rule") != null) {
        InteligentSendRule.validateJsonObject(jsonObj.getAsJsonObject("inteligent_send_rule"));
      }
      // validate the optional field `inteligent_voucher`
      if (jsonObj.getAsJsonObject("inteligent_voucher") != null) {
        InteligentVoucher.validateJsonObject(jsonObj.getAsJsonObject("inteligent_voucher"));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("voucher_no") != null && !jsonObj.get("voucher_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentPromoTool.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentPromoTool' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentPromoTool> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentPromoTool.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentPromoTool>() {
           @Override
           public void write(JsonWriter out, InteligentPromoTool value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentPromoTool read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentPromoTool given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentPromoTool
  * @throws IOException if the JSON string is invalid with respect to InteligentPromoTool
  */
  public static InteligentPromoTool fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentPromoTool.class);
  }

 /**
  * Convert an instance of InteligentPromoTool to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

