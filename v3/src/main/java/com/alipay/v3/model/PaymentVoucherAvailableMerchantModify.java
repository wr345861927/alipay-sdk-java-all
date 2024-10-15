/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
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
   * @return the PaymentVoucherAvailableMerchantModify instance itself
   */
  public PaymentVoucherAvailableMerchantModify putAdditionalProperty(String key, Object value) {
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
    PaymentVoucherAvailableMerchantModify paymentVoucherAvailableMerchantModify = (PaymentVoucherAvailableMerchantModify) o;
    return Objects.equals(this.availablePids, paymentVoucherAvailableMerchantModify.availablePids) &&
        Objects.equals(this.availableSmids, paymentVoucherAvailableMerchantModify.availableSmids)&&
        Objects.equals(this.additionalProperties, paymentVoucherAvailableMerchantModify.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePids, availableSmids, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentVoucherAvailableMerchantModify {\n");
    sb.append("    availablePids: ").append(toIndentedString(availablePids)).append("\n");
    sb.append("    availableSmids: ").append(toIndentedString(availableSmids)).append("\n");
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
           public PaymentVoucherAvailableMerchantModify read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentVoucherAvailableMerchantModify instance = thisAdapter.fromJsonTree(jsonObj);
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

