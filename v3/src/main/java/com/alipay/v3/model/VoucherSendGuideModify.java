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
 * VoucherSendGuideModify
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherSendGuideModify {
  public static final String SERIALIZED_NAME_VOUCHER_DETAIL_URL = "voucher_detail_url";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DETAIL_URL)
  private String voucherDetailUrl;

  public VoucherSendGuideModify() { 
  }

  public VoucherSendGuideModify voucherDetailUrl(String voucherDetailUrl) {
    
    this.voucherDetailUrl = voucherDetailUrl;
    return this;
  }

   /**
   * 领（购）券详情页链接，从支付宝公域跳转到服务商（商户）自定义领(购)券详情页。说明：当 voucher_type&#x3D;EXCHANGE_VOUCHER 时，该字段可修改，其他不允许修改。
   * @return voucherDetailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId=xxxx", value = "领（购）券详情页链接，从支付宝公域跳转到服务商（商户）自定义领(购)券详情页。说明：当 voucher_type=EXCHANGE_VOUCHER 时，该字段可修改，其他不允许修改。")

  public String getVoucherDetailUrl() {
    return voucherDetailUrl;
  }


  public void setVoucherDetailUrl(String voucherDetailUrl) {
    this.voucherDetailUrl = voucherDetailUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherSendGuideModify voucherSendGuideModify = (VoucherSendGuideModify) o;
    return Objects.equals(this.voucherDetailUrl, voucherSendGuideModify.voucherDetailUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherDetailUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherSendGuideModify {\n");
    sb.append("    voucherDetailUrl: ").append(toIndentedString(voucherDetailUrl)).append("\n");
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
    openapiFields.add("voucher_detail_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherSendGuideModify
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherSendGuideModify.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherSendGuideModify is not found in the empty JSON string", VoucherSendGuideModify.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherSendGuideModify.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherSendGuideModify` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("voucher_detail_url") != null && !jsonObj.get("voucher_detail_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_detail_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_detail_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherSendGuideModify.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherSendGuideModify' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherSendGuideModify> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherSendGuideModify.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherSendGuideModify>() {
           @Override
           public void write(JsonWriter out, VoucherSendGuideModify value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherSendGuideModify read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherSendGuideModify given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherSendGuideModify
  * @throws IOException if the JSON string is invalid with respect to VoucherSendGuideModify
  */
  public static VoucherSendGuideModify fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherSendGuideModify.class);
  }

 /**
  * Convert an instance of VoucherSendGuideModify to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

