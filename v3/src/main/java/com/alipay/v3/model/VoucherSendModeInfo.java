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
import com.alipay.v3.model.VoucherPackageModeInfo;
import com.alipay.v3.model.VoucherSaleModeInfo;
import com.alipay.v3.model.VoucherSendRuleInfo;
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
 * VoucherSendModeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherSendModeInfo {
  public static final String SERIALIZED_NAME_VOUCHER_PACKAGE_MODE_INFO = "voucher_package_mode_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_PACKAGE_MODE_INFO)
  private VoucherPackageModeInfo voucherPackageModeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SALE_MODE_INFO = "voucher_sale_mode_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SALE_MODE_INFO)
  private VoucherSaleModeInfo voucherSaleModeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_MODE = "voucher_send_mode";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_MODE)
  private String voucherSendMode;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_RULE_INFO = "voucher_send_rule_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_RULE_INFO)
  private VoucherSendRuleInfo voucherSendRuleInfo;

  public VoucherSendModeInfo() { 
  }

  public VoucherSendModeInfo voucherPackageModeInfo(VoucherPackageModeInfo voucherPackageModeInfo) {
    
    this.voucherPackageModeInfo = voucherPackageModeInfo;
    return this;
  }

   /**
   * Get voucherPackageModeInfo
   * @return voucherPackageModeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherPackageModeInfo getVoucherPackageModeInfo() {
    return voucherPackageModeInfo;
  }


  public void setVoucherPackageModeInfo(VoucherPackageModeInfo voucherPackageModeInfo) {
    this.voucherPackageModeInfo = voucherPackageModeInfo;
  }


  public VoucherSendModeInfo voucherSaleModeInfo(VoucherSaleModeInfo voucherSaleModeInfo) {
    
    this.voucherSaleModeInfo = voucherSaleModeInfo;
    return this;
  }

   /**
   * Get voucherSaleModeInfo
   * @return voucherSaleModeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSaleModeInfo getVoucherSaleModeInfo() {
    return voucherSaleModeInfo;
  }


  public void setVoucherSaleModeInfo(VoucherSaleModeInfo voucherSaleModeInfo) {
    this.voucherSaleModeInfo = voucherSaleModeInfo;
  }


  public VoucherSendModeInfo voucherSendMode(String voucherSendMode) {
    
    this.voucherSendMode = voucherSendMode;
    return this;
  }

   /**
   * 券发放模式。
   * @return voucherSendMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券发放模式。")

  public String getVoucherSendMode() {
    return voucherSendMode;
  }


  public void setVoucherSendMode(String voucherSendMode) {
    this.voucherSendMode = voucherSendMode;
  }


  public VoucherSendModeInfo voucherSendRuleInfo(VoucherSendRuleInfo voucherSendRuleInfo) {
    
    this.voucherSendRuleInfo = voucherSendRuleInfo;
    return this;
  }

   /**
   * Get voucherSendRuleInfo
   * @return voucherSendRuleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSendRuleInfo getVoucherSendRuleInfo() {
    return voucherSendRuleInfo;
  }


  public void setVoucherSendRuleInfo(VoucherSendRuleInfo voucherSendRuleInfo) {
    this.voucherSendRuleInfo = voucherSendRuleInfo;
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
   * @return the VoucherSendModeInfo instance itself
   */
  public VoucherSendModeInfo putAdditionalProperty(String key, Object value) {
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
    VoucherSendModeInfo voucherSendModeInfo = (VoucherSendModeInfo) o;
    return Objects.equals(this.voucherPackageModeInfo, voucherSendModeInfo.voucherPackageModeInfo) &&
        Objects.equals(this.voucherSaleModeInfo, voucherSendModeInfo.voucherSaleModeInfo) &&
        Objects.equals(this.voucherSendMode, voucherSendModeInfo.voucherSendMode) &&
        Objects.equals(this.voucherSendRuleInfo, voucherSendModeInfo.voucherSendRuleInfo)&&
        Objects.equals(this.additionalProperties, voucherSendModeInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherPackageModeInfo, voucherSaleModeInfo, voucherSendMode, voucherSendRuleInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherSendModeInfo {\n");
    sb.append("    voucherPackageModeInfo: ").append(toIndentedString(voucherPackageModeInfo)).append("\n");
    sb.append("    voucherSaleModeInfo: ").append(toIndentedString(voucherSaleModeInfo)).append("\n");
    sb.append("    voucherSendMode: ").append(toIndentedString(voucherSendMode)).append("\n");
    sb.append("    voucherSendRuleInfo: ").append(toIndentedString(voucherSendRuleInfo)).append("\n");
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
    openapiFields.add("voucher_package_mode_info");
    openapiFields.add("voucher_sale_mode_info");
    openapiFields.add("voucher_send_mode");
    openapiFields.add("voucher_send_rule_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherSendModeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherSendModeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherSendModeInfo is not found in the empty JSON string", VoucherSendModeInfo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `voucher_package_mode_info`
      if (jsonObj.getAsJsonObject("voucher_package_mode_info") != null) {
        VoucherPackageModeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_package_mode_info"));
      }
      // validate the optional field `voucher_sale_mode_info`
      if (jsonObj.getAsJsonObject("voucher_sale_mode_info") != null) {
        VoucherSaleModeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_sale_mode_info"));
      }
      if (jsonObj.get("voucher_send_mode") != null && !jsonObj.get("voucher_send_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_send_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_send_mode").toString()));
      }
      // validate the optional field `voucher_send_rule_info`
      if (jsonObj.getAsJsonObject("voucher_send_rule_info") != null) {
        VoucherSendRuleInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_rule_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherSendModeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherSendModeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherSendModeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherSendModeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherSendModeInfo>() {
           @Override
           public void write(JsonWriter out, VoucherSendModeInfo value) throws IOException {
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
           public VoucherSendModeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherSendModeInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherSendModeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherSendModeInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherSendModeInfo
  */
  public static VoucherSendModeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherSendModeInfo.class);
  }

 /**
  * Convert an instance of VoucherSendModeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

