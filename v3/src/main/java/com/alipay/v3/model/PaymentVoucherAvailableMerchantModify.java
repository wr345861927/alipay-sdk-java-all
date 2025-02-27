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
import java.util.ArrayList;
import java.util.List;

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
 * PaymentVoucherAvailableMerchantModify
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentVoucherAvailableMerchantModify {
  public static final String SERIALIZED_NAME_AVAILABLE_PIDS = "available_pids";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_PIDS)
  private List<String> availablePids = null;

  public static final String SERIALIZED_NAME_AVAILABLE_SMIDS = "available_smids";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_SMIDS)
  private List<String> availableSmids = null;

  public PaymentVoucherAvailableMerchantModify() { 
  }

  public PaymentVoucherAvailableMerchantModify availablePids(List<String> availablePids) {
    
    this.availablePids = availablePids;
    return this;
  }

  public PaymentVoucherAvailableMerchantModify addAvailablePidsItem(String availablePidsItem) {
    if (this.availablePids == null) {
      this.availablePids = new ArrayList<>();
    }
    this.availablePids.add(availablePidsItem);
    return this;
  }

   /**
   * 优惠券可以核销的直连商户PID。默认不修改。  限制：  1、核销商户范围只能增大不能减小。
   * @return availablePids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088102111111111\"]", value = "优惠券可以核销的直连商户PID。默认不修改。  限制：  1、核销商户范围只能增大不能减小。")

  public List<String> getAvailablePids() {
    return availablePids;
  }


  public void setAvailablePids(List<String> availablePids) {
    this.availablePids = availablePids;
  }


  public PaymentVoucherAvailableMerchantModify availableSmids(List<String> availableSmids) {
    
    this.availableSmids = availableSmids;
    return this;
  }

  public PaymentVoucherAvailableMerchantModify addAvailableSmidsItem(String availableSmidsItem) {
    if (this.availableSmids == null) {
      this.availableSmids = new ArrayList<>();
    }
    this.availableSmids.add(availableSmidsItem);
    return this;
  }

   /**
   * 优惠券可以核销的间连商户SMID。默认不修改。  限制：   1、核销商户范围只能增大不能减小。
   * @return availableSmids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088102111111111\"]", value = "优惠券可以核销的间连商户SMID。默认不修改。  限制：   1、核销商户范围只能增大不能减小。")

  public List<String> getAvailableSmids() {
    return availableSmids;
  }


  public void setAvailableSmids(List<String> availableSmids) {
    this.availableSmids = availableSmids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentVoucherAvailableMerchantModify paymentVoucherAvailableMerchantModify = (PaymentVoucherAvailableMerchantModify) o;
    return Objects.equals(this.availablePids, paymentVoucherAvailableMerchantModify.availablePids) &&
        Objects.equals(this.availableSmids, paymentVoucherAvailableMerchantModify.availableSmids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePids, availableSmids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentVoucherAvailableMerchantModify {\n");
    sb.append("    availablePids: ").append(toIndentedString(availablePids)).append("\n");
    sb.append("    availableSmids: ").append(toIndentedString(availableSmids)).append("\n");
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
    openapiFields.add("available_pids");
    openapiFields.add("available_smids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentVoucherAvailableMerchantModify
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentVoucherAvailableMerchantModify.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentVoucherAvailableMerchantModify is not found in the empty JSON string", PaymentVoucherAvailableMerchantModify.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentVoucherAvailableMerchantModify.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentVoucherAvailableMerchantModify` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("available_pids") != null && !jsonObj.get("available_pids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_pids` to be an array in the JSON string but got `%s`", jsonObj.get("available_pids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("available_smids") != null && !jsonObj.get("available_smids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_smids` to be an array in the JSON string but got `%s`", jsonObj.get("available_smids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentVoucherAvailableMerchantModify.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentVoucherAvailableMerchantModify' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentVoucherAvailableMerchantModify> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentVoucherAvailableMerchantModify.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentVoucherAvailableMerchantModify>() {
           @Override
           public void write(JsonWriter out, PaymentVoucherAvailableMerchantModify value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentVoucherAvailableMerchantModify read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentVoucherAvailableMerchantModify given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentVoucherAvailableMerchantModify
  * @throws IOException if the JSON string is invalid with respect to PaymentVoucherAvailableMerchantModify
  */
  public static PaymentVoucherAvailableMerchantModify fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentVoucherAvailableMerchantModify.class);
  }

 /**
  * Convert an instance of PaymentVoucherAvailableMerchantModify to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

