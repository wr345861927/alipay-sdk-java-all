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
 * VoucherAvailableOutItemInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherAvailableOutItemInfo {
  public static final String SERIALIZED_NAME_ITEM_APP_ID = "item_app_id";
  @SerializedName(SERIALIZED_NAME_ITEM_APP_ID)
  private String itemAppId;

  public static final String SERIALIZED_NAME_OUT_ITEM_ID = "out_item_id";
  @SerializedName(SERIALIZED_NAME_OUT_ITEM_ID)
  private String outItemId;

  public VoucherAvailableOutItemInfo() { 
  }

  public VoucherAvailableOutItemInfo itemAppId(String itemAppId) {
    
    this.itemAppId = itemAppId;
    return this;
  }

   /**
   * 小程序ID
   * @return itemAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序ID")

  public String getItemAppId() {
    return itemAppId;
  }


  public void setItemAppId(String itemAppId) {
    this.itemAppId = itemAppId;
  }


  public VoucherAvailableOutItemInfo outItemId(String outItemId) {
    
    this.outItemId = outItemId;
    return this;
  }

   /**
   * 外部商品ID
   * @return outItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外部商品ID")

  public String getOutItemId() {
    return outItemId;
  }


  public void setOutItemId(String outItemId) {
    this.outItemId = outItemId;
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
   * @return the VoucherAvailableOutItemInfo instance itself
   */
  public VoucherAvailableOutItemInfo putAdditionalProperty(String key, Object value) {
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
    VoucherAvailableOutItemInfo voucherAvailableOutItemInfo = (VoucherAvailableOutItemInfo) o;
    return Objects.equals(this.itemAppId, voucherAvailableOutItemInfo.itemAppId) &&
        Objects.equals(this.outItemId, voucherAvailableOutItemInfo.outItemId)&&
        Objects.equals(this.additionalProperties, voucherAvailableOutItemInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemAppId, outItemId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherAvailableOutItemInfo {\n");
    sb.append("    itemAppId: ").append(toIndentedString(itemAppId)).append("\n");
    sb.append("    outItemId: ").append(toIndentedString(outItemId)).append("\n");
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
    openapiFields.add("item_app_id");
    openapiFields.add("out_item_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherAvailableOutItemInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherAvailableOutItemInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherAvailableOutItemInfo is not found in the empty JSON string", VoucherAvailableOutItemInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("item_app_id") != null && !jsonObj.get("item_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_app_id").toString()));
      }
      if (jsonObj.get("out_item_id") != null && !jsonObj.get("out_item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_item_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherAvailableOutItemInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherAvailableOutItemInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherAvailableOutItemInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherAvailableOutItemInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherAvailableOutItemInfo>() {
           @Override
           public void write(JsonWriter out, VoucherAvailableOutItemInfo value) throws IOException {
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
           public VoucherAvailableOutItemInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherAvailableOutItemInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherAvailableOutItemInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherAvailableOutItemInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherAvailableOutItemInfo
  */
  public static VoucherAvailableOutItemInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherAvailableOutItemInfo.class);
  }

 /**
  * Convert an instance of VoucherAvailableOutItemInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

