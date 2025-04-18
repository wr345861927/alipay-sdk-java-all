/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.VoucherAvailableAccountInfo;
import com.alipay.v3.model.VoucherAvailableAppInfo;
import com.alipay.v3.model.VoucherAvailableGeographyScopeInfo;
import com.alipay.v3.model.VoucherAvailableGoodsInfo;
import com.alipay.v3.model.VoucherAvailableItemInfo;
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
 * VoucherAvailableScopeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherAvailableScopeInfo {
  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_ACCOUNT_INFO = "voucher_available_account_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_ACCOUNT_INFO)
  private VoucherAvailableAccountInfo voucherAvailableAccountInfo;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_APP_INFO = "voucher_available_app_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_APP_INFO)
  private VoucherAvailableAppInfo voucherAvailableAppInfo;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_GEOGRAPHY_SCOPE_INFO = "voucher_available_geography_scope_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_GEOGRAPHY_SCOPE_INFO)
  private VoucherAvailableGeographyScopeInfo voucherAvailableGeographyScopeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_GOODS_INFO = "voucher_available_goods_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_GOODS_INFO)
  private VoucherAvailableGoodsInfo voucherAvailableGoodsInfo;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_ITEM_INFO = "voucher_available_item_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_ITEM_INFO)
  private VoucherAvailableItemInfo voucherAvailableItemInfo;

  public VoucherAvailableScopeInfo() { 
  }

  public VoucherAvailableScopeInfo voucherAvailableAccountInfo(VoucherAvailableAccountInfo voucherAvailableAccountInfo) {
    
    this.voucherAvailableAccountInfo = voucherAvailableAccountInfo;
    return this;
  }

   /**
   * Get voucherAvailableAccountInfo
   * @return voucherAvailableAccountInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableAccountInfo getVoucherAvailableAccountInfo() {
    return voucherAvailableAccountInfo;
  }


  public void setVoucherAvailableAccountInfo(VoucherAvailableAccountInfo voucherAvailableAccountInfo) {
    this.voucherAvailableAccountInfo = voucherAvailableAccountInfo;
  }


  public VoucherAvailableScopeInfo voucherAvailableAppInfo(VoucherAvailableAppInfo voucherAvailableAppInfo) {
    
    this.voucherAvailableAppInfo = voucherAvailableAppInfo;
    return this;
  }

   /**
   * Get voucherAvailableAppInfo
   * @return voucherAvailableAppInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableAppInfo getVoucherAvailableAppInfo() {
    return voucherAvailableAppInfo;
  }


  public void setVoucherAvailableAppInfo(VoucherAvailableAppInfo voucherAvailableAppInfo) {
    this.voucherAvailableAppInfo = voucherAvailableAppInfo;
  }


  public VoucherAvailableScopeInfo voucherAvailableGeographyScopeInfo(VoucherAvailableGeographyScopeInfo voucherAvailableGeographyScopeInfo) {
    
    this.voucherAvailableGeographyScopeInfo = voucherAvailableGeographyScopeInfo;
    return this;
  }

   /**
   * Get voucherAvailableGeographyScopeInfo
   * @return voucherAvailableGeographyScopeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableGeographyScopeInfo getVoucherAvailableGeographyScopeInfo() {
    return voucherAvailableGeographyScopeInfo;
  }


  public void setVoucherAvailableGeographyScopeInfo(VoucherAvailableGeographyScopeInfo voucherAvailableGeographyScopeInfo) {
    this.voucherAvailableGeographyScopeInfo = voucherAvailableGeographyScopeInfo;
  }


  public VoucherAvailableScopeInfo voucherAvailableGoodsInfo(VoucherAvailableGoodsInfo voucherAvailableGoodsInfo) {
    
    this.voucherAvailableGoodsInfo = voucherAvailableGoodsInfo;
    return this;
  }

   /**
   * Get voucherAvailableGoodsInfo
   * @return voucherAvailableGoodsInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableGoodsInfo getVoucherAvailableGoodsInfo() {
    return voucherAvailableGoodsInfo;
  }


  public void setVoucherAvailableGoodsInfo(VoucherAvailableGoodsInfo voucherAvailableGoodsInfo) {
    this.voucherAvailableGoodsInfo = voucherAvailableGoodsInfo;
  }


  public VoucherAvailableScopeInfo voucherAvailableItemInfo(VoucherAvailableItemInfo voucherAvailableItemInfo) {
    
    this.voucherAvailableItemInfo = voucherAvailableItemInfo;
    return this;
  }

   /**
   * Get voucherAvailableItemInfo
   * @return voucherAvailableItemInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableItemInfo getVoucherAvailableItemInfo() {
    return voucherAvailableItemInfo;
  }


  public void setVoucherAvailableItemInfo(VoucherAvailableItemInfo voucherAvailableItemInfo) {
    this.voucherAvailableItemInfo = voucherAvailableItemInfo;
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
   * @return the VoucherAvailableScopeInfo instance itself
   */
  public VoucherAvailableScopeInfo putAdditionalProperty(String key, Object value) {
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
    VoucherAvailableScopeInfo voucherAvailableScopeInfo = (VoucherAvailableScopeInfo) o;
    return Objects.equals(this.voucherAvailableAccountInfo, voucherAvailableScopeInfo.voucherAvailableAccountInfo) &&
        Objects.equals(this.voucherAvailableAppInfo, voucherAvailableScopeInfo.voucherAvailableAppInfo) &&
        Objects.equals(this.voucherAvailableGeographyScopeInfo, voucherAvailableScopeInfo.voucherAvailableGeographyScopeInfo) &&
        Objects.equals(this.voucherAvailableGoodsInfo, voucherAvailableScopeInfo.voucherAvailableGoodsInfo) &&
        Objects.equals(this.voucherAvailableItemInfo, voucherAvailableScopeInfo.voucherAvailableItemInfo)&&
        Objects.equals(this.additionalProperties, voucherAvailableScopeInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherAvailableAccountInfo, voucherAvailableAppInfo, voucherAvailableGeographyScopeInfo, voucherAvailableGoodsInfo, voucherAvailableItemInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherAvailableScopeInfo {\n");
    sb.append("    voucherAvailableAccountInfo: ").append(toIndentedString(voucherAvailableAccountInfo)).append("\n");
    sb.append("    voucherAvailableAppInfo: ").append(toIndentedString(voucherAvailableAppInfo)).append("\n");
    sb.append("    voucherAvailableGeographyScopeInfo: ").append(toIndentedString(voucherAvailableGeographyScopeInfo)).append("\n");
    sb.append("    voucherAvailableGoodsInfo: ").append(toIndentedString(voucherAvailableGoodsInfo)).append("\n");
    sb.append("    voucherAvailableItemInfo: ").append(toIndentedString(voucherAvailableItemInfo)).append("\n");
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
    openapiFields.add("voucher_available_account_info");
    openapiFields.add("voucher_available_app_info");
    openapiFields.add("voucher_available_geography_scope_info");
    openapiFields.add("voucher_available_goods_info");
    openapiFields.add("voucher_available_item_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherAvailableScopeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherAvailableScopeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherAvailableScopeInfo is not found in the empty JSON string", VoucherAvailableScopeInfo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `voucher_available_account_info`
      if (jsonObj.getAsJsonObject("voucher_available_account_info") != null) {
        VoucherAvailableAccountInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_account_info"));
      }
      // validate the optional field `voucher_available_app_info`
      if (jsonObj.getAsJsonObject("voucher_available_app_info") != null) {
        VoucherAvailableAppInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_app_info"));
      }
      // validate the optional field `voucher_available_geography_scope_info`
      if (jsonObj.getAsJsonObject("voucher_available_geography_scope_info") != null) {
        VoucherAvailableGeographyScopeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_geography_scope_info"));
      }
      // validate the optional field `voucher_available_goods_info`
      if (jsonObj.getAsJsonObject("voucher_available_goods_info") != null) {
        VoucherAvailableGoodsInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_goods_info"));
      }
      // validate the optional field `voucher_available_item_info`
      if (jsonObj.getAsJsonObject("voucher_available_item_info") != null) {
        VoucherAvailableItemInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_item_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherAvailableScopeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherAvailableScopeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherAvailableScopeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherAvailableScopeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherAvailableScopeInfo>() {
           @Override
           public void write(JsonWriter out, VoucherAvailableScopeInfo value) throws IOException {
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
           public VoucherAvailableScopeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherAvailableScopeInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherAvailableScopeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherAvailableScopeInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherAvailableScopeInfo
  */
  public static VoucherAvailableScopeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherAvailableScopeInfo.class);
  }

 /**
  * Convert an instance of VoucherAvailableScopeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

