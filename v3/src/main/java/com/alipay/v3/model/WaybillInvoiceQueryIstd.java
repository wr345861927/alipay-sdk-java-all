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
 * WaybillInvoiceQueryIstd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WaybillInvoiceQueryIstd {
  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_SHOP_NO = "shop_no";
  @SerializedName(SERIALIZED_NAME_SHOP_NO)
  private String shopNo;

  public static final String SERIALIZED_NAME_WAYBILL_AMOUNT = "waybill_amount";
  @SerializedName(SERIALIZED_NAME_WAYBILL_AMOUNT)
  private String waybillAmount;

  public static final String SERIALIZED_NAME_WAYBILL_INVOICE_STATUS = "waybill_invoice_status";
  @SerializedName(SERIALIZED_NAME_WAYBILL_INVOICE_STATUS)
  private Integer waybillInvoiceStatus;

  public static final String SERIALIZED_NAME_WAYBILL_NO = "waybill_no";
  @SerializedName(SERIALIZED_NAME_WAYBILL_NO)
  private String waybillNo;

  public WaybillInvoiceQueryIstd() { 
  }

  public WaybillInvoiceQueryIstd reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 失败原因，需要传单个即时配送运单的驳回原因
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "开票金额错误", value = "失败原因，需要传单个即时配送运单的驳回原因")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public WaybillInvoiceQueryIstd shopNo(String shopNo) {
    
    this.shopNo = shopNo;
    return this;
  }

   /**
   * 商家门店编号
   * @return shopNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "shop_no_20200818", value = "商家门店编号")

  public String getShopNo() {
    return shopNo;
  }


  public void setShopNo(String shopNo) {
    this.shopNo = shopNo;
  }


  public WaybillInvoiceQueryIstd waybillAmount(String waybillAmount) {
    
    this.waybillAmount = waybillAmount;
    return this;
  }

   /**
   * 即时配送运单金额，waybill_invoce_status为1的情况下不能为空
   * @return waybillAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "即时配送运单金额，waybill_invoce_status为1的情况下不能为空")

  public String getWaybillAmount() {
    return waybillAmount;
  }


  public void setWaybillAmount(String waybillAmount) {
    this.waybillAmount = waybillAmount;
  }


  public WaybillInvoiceQueryIstd waybillInvoiceStatus(Integer waybillInvoiceStatus) {
    
    this.waybillInvoiceStatus = waybillInvoiceStatus;
    return this;
  }

   /**
   * 明细的运单开票状态，1：开票成功 2：不可开票 3：可开票；整体开票状态为0的情况下，无开票明细；整体开票状态为1，明细开票状态全部是1；整体开票状态为2，明细开票状态全部为2
   * @return waybillInvoiceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "明细的运单开票状态，1：开票成功 2：不可开票 3：可开票；整体开票状态为0的情况下，无开票明细；整体开票状态为1，明细开票状态全部是1；整体开票状态为2，明细开票状态全部为2")

  public Integer getWaybillInvoiceStatus() {
    return waybillInvoiceStatus;
  }


  public void setWaybillInvoiceStatus(Integer waybillInvoiceStatus) {
    this.waybillInvoiceStatus = waybillInvoiceStatus;
  }


  public WaybillInvoiceQueryIstd waybillNo(String waybillNo) {
    
    this.waybillNo = waybillNo;
    return this;
  }

   /**
   * 即时配送运单编号
   * @return waybillNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "waybill_no_20200811", value = "即时配送运单编号")

  public String getWaybillNo() {
    return waybillNo;
  }


  public void setWaybillNo(String waybillNo) {
    this.waybillNo = waybillNo;
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
   * @return the WaybillInvoiceQueryIstd instance itself
   */
  public WaybillInvoiceQueryIstd putAdditionalProperty(String key, Object value) {
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
    WaybillInvoiceQueryIstd waybillInvoiceQueryIstd = (WaybillInvoiceQueryIstd) o;
    return Objects.equals(this.reason, waybillInvoiceQueryIstd.reason) &&
        Objects.equals(this.shopNo, waybillInvoiceQueryIstd.shopNo) &&
        Objects.equals(this.waybillAmount, waybillInvoiceQueryIstd.waybillAmount) &&
        Objects.equals(this.waybillInvoiceStatus, waybillInvoiceQueryIstd.waybillInvoiceStatus) &&
        Objects.equals(this.waybillNo, waybillInvoiceQueryIstd.waybillNo)&&
        Objects.equals(this.additionalProperties, waybillInvoiceQueryIstd.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, shopNo, waybillAmount, waybillInvoiceStatus, waybillNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaybillInvoiceQueryIstd {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    shopNo: ").append(toIndentedString(shopNo)).append("\n");
    sb.append("    waybillAmount: ").append(toIndentedString(waybillAmount)).append("\n");
    sb.append("    waybillInvoiceStatus: ").append(toIndentedString(waybillInvoiceStatus)).append("\n");
    sb.append("    waybillNo: ").append(toIndentedString(waybillNo)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("shop_no");
    openapiFields.add("waybill_amount");
    openapiFields.add("waybill_invoice_status");
    openapiFields.add("waybill_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WaybillInvoiceQueryIstd
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WaybillInvoiceQueryIstd.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WaybillInvoiceQueryIstd is not found in the empty JSON string", WaybillInvoiceQueryIstd.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (jsonObj.get("shop_no") != null && !jsonObj.get("shop_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_no").toString()));
      }
      if (jsonObj.get("waybill_amount") != null && !jsonObj.get("waybill_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waybill_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waybill_amount").toString()));
      }
      if (jsonObj.get("waybill_no") != null && !jsonObj.get("waybill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waybill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waybill_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WaybillInvoiceQueryIstd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WaybillInvoiceQueryIstd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WaybillInvoiceQueryIstd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WaybillInvoiceQueryIstd.class));

       return (TypeAdapter<T>) new TypeAdapter<WaybillInvoiceQueryIstd>() {
           @Override
           public void write(JsonWriter out, WaybillInvoiceQueryIstd value) throws IOException {
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
           public WaybillInvoiceQueryIstd read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WaybillInvoiceQueryIstd instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WaybillInvoiceQueryIstd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WaybillInvoiceQueryIstd
  * @throws IOException if the JSON string is invalid with respect to WaybillInvoiceQueryIstd
  */
  public static WaybillInvoiceQueryIstd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WaybillInvoiceQueryIstd.class);
  }

 /**
  * Convert an instance of WaybillInvoiceQueryIstd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

