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
import com.alipay.v3.model.RefundSubFee;
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
 * RefundChargeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RefundChargeInfo {
  public static final String SERIALIZED_NAME_CHARGE_TYPE = "charge_type";
  @SerializedName(SERIALIZED_NAME_CHARGE_TYPE)
  private String chargeType;

  public static final String SERIALIZED_NAME_REFUND_CHARGE_FEE = "refund_charge_fee";
  @SerializedName(SERIALIZED_NAME_REFUND_CHARGE_FEE)
  private String refundChargeFee;

  public static final String SERIALIZED_NAME_REFUND_SUB_FEE_DETAIL_LIST = "refund_sub_fee_detail_list";
  @SerializedName(SERIALIZED_NAME_REFUND_SUB_FEE_DETAIL_LIST)
  private List<RefundSubFee> refundSubFeeDetailList = null;

  public static final String SERIALIZED_NAME_SWITCH_FEE_RATE = "switch_fee_rate";
  @SerializedName(SERIALIZED_NAME_SWITCH_FEE_RATE)
  private String switchFeeRate;

  public RefundChargeInfo() { 
  }

  public RefundChargeInfo chargeType(String chargeType) {
    
    this.chargeType = chargeType;
    return this;
  }

   /**
   * 收单手续费trade，花呗分期手续hbfq，其他手续费charge
   * @return chargeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "收单手续费trade，花呗分期手续hbfq，其他手续费charge")

  public String getChargeType() {
    return chargeType;
  }


  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }


  public RefundChargeInfo refundChargeFee(String refundChargeFee) {
    
    this.refundChargeFee = refundChargeFee;
    return this;
  }

   /**
   * 实退费用。单位：元。
   * @return refundChargeFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "实退费用。单位：元。")

  public String getRefundChargeFee() {
    return refundChargeFee;
  }


  public void setRefundChargeFee(String refundChargeFee) {
    this.refundChargeFee = refundChargeFee;
  }


  public RefundChargeInfo refundSubFeeDetailList(List<RefundSubFee> refundSubFeeDetailList) {
    
    this.refundSubFeeDetailList = refundSubFeeDetailList;
    return this;
  }

  public RefundChargeInfo addRefundSubFeeDetailListItem(RefundSubFee refundSubFeeDetailListItem) {
    if (this.refundSubFeeDetailList == null) {
      this.refundSubFeeDetailList = new ArrayList<>();
    }
    this.refundSubFeeDetailList.add(refundSubFeeDetailListItem);
    return this;
  }

   /**
   * 组合支付退费明细
   * @return refundSubFeeDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "组合支付退费明细")

  public List<RefundSubFee> getRefundSubFeeDetailList() {
    return refundSubFeeDetailList;
  }


  public void setRefundSubFeeDetailList(List<RefundSubFee> refundSubFeeDetailList) {
    this.refundSubFeeDetailList = refundSubFeeDetailList;
  }


  public RefundChargeInfo switchFeeRate(String switchFeeRate) {
    
    this.switchFeeRate = switchFeeRate;
    return this;
  }

   /**
   * 签约费率
   * @return switchFeeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "签约费率")

  public String getSwitchFeeRate() {
    return switchFeeRate;
  }


  public void setSwitchFeeRate(String switchFeeRate) {
    this.switchFeeRate = switchFeeRate;
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
   * @return the RefundChargeInfo instance itself
   */
  public RefundChargeInfo putAdditionalProperty(String key, Object value) {
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
    RefundChargeInfo refundChargeInfo = (RefundChargeInfo) o;
    return Objects.equals(this.chargeType, refundChargeInfo.chargeType) &&
        Objects.equals(this.refundChargeFee, refundChargeInfo.refundChargeFee) &&
        Objects.equals(this.refundSubFeeDetailList, refundChargeInfo.refundSubFeeDetailList) &&
        Objects.equals(this.switchFeeRate, refundChargeInfo.switchFeeRate)&&
        Objects.equals(this.additionalProperties, refundChargeInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeType, refundChargeFee, refundSubFeeDetailList, switchFeeRate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundChargeInfo {\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    refundChargeFee: ").append(toIndentedString(refundChargeFee)).append("\n");
    sb.append("    refundSubFeeDetailList: ").append(toIndentedString(refundSubFeeDetailList)).append("\n");
    sb.append("    switchFeeRate: ").append(toIndentedString(switchFeeRate)).append("\n");
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
    openapiFields.add("charge_type");
    openapiFields.add("refund_charge_fee");
    openapiFields.add("refund_sub_fee_detail_list");
    openapiFields.add("switch_fee_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RefundChargeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RefundChargeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RefundChargeInfo is not found in the empty JSON string", RefundChargeInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("charge_type") != null && !jsonObj.get("charge_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_type").toString()));
      }
      if (jsonObj.get("refund_charge_fee") != null && !jsonObj.get("refund_charge_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_charge_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_charge_fee").toString()));
      }
      JsonArray jsonArrayrefundSubFeeDetailList = jsonObj.getAsJsonArray("refund_sub_fee_detail_list");
      if (jsonArrayrefundSubFeeDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("refund_sub_fee_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `refund_sub_fee_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("refund_sub_fee_detail_list").toString()));
        }

        // validate the optional field `refund_sub_fee_detail_list` (array)
        for (int i = 0; i < jsonArrayrefundSubFeeDetailList.size(); i++) {
          RefundSubFee.validateJsonObject(jsonArrayrefundSubFeeDetailList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("switch_fee_rate") != null && !jsonObj.get("switch_fee_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `switch_fee_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("switch_fee_rate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RefundChargeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefundChargeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefundChargeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefundChargeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RefundChargeInfo>() {
           @Override
           public void write(JsonWriter out, RefundChargeInfo value) throws IOException {
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
           public RefundChargeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RefundChargeInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RefundChargeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RefundChargeInfo
  * @throws IOException if the JSON string is invalid with respect to RefundChargeInfo
  */
  public static RefundChargeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefundChargeInfo.class);
  }

 /**
  * Convert an instance of RefundChargeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

