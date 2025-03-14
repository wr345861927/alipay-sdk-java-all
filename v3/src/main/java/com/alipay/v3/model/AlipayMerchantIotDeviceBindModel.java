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
 * AlipayMerchantIotDeviceBindModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantIotDeviceBindModel {
  public static final String SERIALIZED_NAME_BIZ_TID = "biz_tid";
  @SerializedName(SERIALIZED_NAME_BIZ_TID)
  private String bizTid;

  public static final String SERIALIZED_NAME_DEVICE_ID_TYPE = "device_id_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID_TYPE)
  private String deviceIdType;

  public static final String SERIALIZED_NAME_DEVICE_SN = "device_sn";
  @SerializedName(SERIALIZED_NAME_DEVICE_SN)
  private String deviceSn;

  public static final String SERIALIZED_NAME_MERCHANT_TYPE = "merchant_type";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TYPE)
  private String merchantType;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public static final String SERIALIZED_NAME_SMID = "smid";
  @SerializedName(SERIALIZED_NAME_SMID)
  private String smid;

  public static final String SERIALIZED_NAME_SUPPLIER_ID = "supplier_id";
  @SerializedName(SERIALIZED_NAME_SUPPLIER_ID)
  private String supplierId;

  public AlipayMerchantIotDeviceBindModel() { 
  }

  public AlipayMerchantIotDeviceBindModel bizTid(String bizTid) {
    
    this.bizTid = bizTid;
    return this;
  }

   /**
   * 设备 ID ，仅device_id_type 为 ID 时填写。
   * @return bizTid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01017gV1CZ1XxASNbqkTJqchletNyVXtsKy1PAs4FKZ6tjRMqyMG2Zk", value = "设备 ID ，仅device_id_type 为 ID 时填写。")

  public String getBizTid() {
    return bizTid;
  }


  public void setBizTid(String bizTid) {
    this.bizTid = bizTid;
  }


  public AlipayMerchantIotDeviceBindModel deviceIdType(String deviceIdType) {
    
    this.deviceIdType = deviceIdType;
    return this;
  }

   /**
   * 可选方式。枚举支持： *  ID：表示使用 biztid 作为设备唯一识别标识， *  SN：表示使用 supplier_id、device_sn联合作为设备唯一识别标识。 注意：由于不同机型的supplier_id不同，推荐使用 ID 。
   * @return deviceIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SN", value = "可选方式。枚举支持： *  ID：表示使用 biztid 作为设备唯一识别标识， *  SN：表示使用 supplier_id、device_sn联合作为设备唯一识别标识。 注意：由于不同机型的supplier_id不同，推荐使用 ID 。")

  public String getDeviceIdType() {
    return deviceIdType;
  }


  public void setDeviceIdType(String deviceIdType) {
    this.deviceIdType = deviceIdType;
  }


  public AlipayMerchantIotDeviceBindModel deviceSn(String deviceSn) {
    
    this.deviceSn = deviceSn;
    return this;
  }

   /**
   * 设备序列号 ，device_id_type 为 SN 时填写。需配合supplier_id使用。
   * @return deviceSn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "QCF420190316000107", value = "设备序列号 ，device_id_type 为 SN 时填写。需配合supplier_id使用。")

  public String getDeviceSn() {
    return deviceSn;
  }


  public void setDeviceSn(String deviceSn) {
    this.deviceSn = deviceSn;
  }


  public AlipayMerchantIotDeviceBindModel merchantType(String merchantType) {
    
    this.merchantType = merchantType;
    return this;
  }

   /**
   * 商户类型。枚举支持： *  direct：直连商户； *  indirect：间连商户。
   * @return merchantType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "indirect", value = "商户类型。枚举支持： *  direct：直连商户； *  indirect：间连商户。")

  public String getMerchantType() {
    return merchantType;
  }


  public void setMerchantType(String merchantType) {
    this.merchantType = merchantType;
  }


  public AlipayMerchantIotDeviceBindModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 直连场景填写商户收单pid。间连场景填写smid绑定的pid（可通过代运营授权API获取）。
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101112139885", value = "直连场景填写商户收单pid。间连场景填写smid绑定的pid（可通过代运营授权API获取）。")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipayMerchantIotDeviceBindModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 商户pid名下的门店 ID。可通过门店管理API获取，需注意请勿使用smid创建门店 ID。
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020081700502012300038796029", value = "商户pid名下的门店 ID。可通过门店管理API获取，需注意请勿使用smid创建门店 ID。")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public AlipayMerchantIotDeviceBindModel smid(String smid) {
    
    this.smid = smid;
    return this;
  }

   /**
   * 直连场景不填，间连场景填写商户收单smid
   * @return smid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101112139886", value = "直连场景不填，间连场景填写商户收单smid")

  public String getSmid() {
    return smid;
  }


  public void setSmid(String smid) {
    this.smid = smid;
  }


  public AlipayMerchantIotDeviceBindModel supplierId(String supplierId) {
    
    this.supplierId = supplierId;
    return this;
  }

   /**
   * 设备供应商ID ，device_id_type 为 SN 时填写。需注意不同机型的供应商ID可能不同。
   * @return supplierId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201812271300540049", value = "设备供应商ID ，device_id_type 为 SN 时填写。需注意不同机型的供应商ID可能不同。")

  public String getSupplierId() {
    return supplierId;
  }


  public void setSupplierId(String supplierId) {
    this.supplierId = supplierId;
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
   * @return the AlipayMerchantIotDeviceBindModel instance itself
   */
  public AlipayMerchantIotDeviceBindModel putAdditionalProperty(String key, Object value) {
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
    AlipayMerchantIotDeviceBindModel alipayMerchantIotDeviceBindModel = (AlipayMerchantIotDeviceBindModel) o;
    return Objects.equals(this.bizTid, alipayMerchantIotDeviceBindModel.bizTid) &&
        Objects.equals(this.deviceIdType, alipayMerchantIotDeviceBindModel.deviceIdType) &&
        Objects.equals(this.deviceSn, alipayMerchantIotDeviceBindModel.deviceSn) &&
        Objects.equals(this.merchantType, alipayMerchantIotDeviceBindModel.merchantType) &&
        Objects.equals(this.pid, alipayMerchantIotDeviceBindModel.pid) &&
        Objects.equals(this.shopId, alipayMerchantIotDeviceBindModel.shopId) &&
        Objects.equals(this.smid, alipayMerchantIotDeviceBindModel.smid) &&
        Objects.equals(this.supplierId, alipayMerchantIotDeviceBindModel.supplierId)&&
        Objects.equals(this.additionalProperties, alipayMerchantIotDeviceBindModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizTid, deviceIdType, deviceSn, merchantType, pid, shopId, smid, supplierId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantIotDeviceBindModel {\n");
    sb.append("    bizTid: ").append(toIndentedString(bizTid)).append("\n");
    sb.append("    deviceIdType: ").append(toIndentedString(deviceIdType)).append("\n");
    sb.append("    deviceSn: ").append(toIndentedString(deviceSn)).append("\n");
    sb.append("    merchantType: ").append(toIndentedString(merchantType)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    smid: ").append(toIndentedString(smid)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
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
    openapiFields.add("biz_tid");
    openapiFields.add("device_id_type");
    openapiFields.add("device_sn");
    openapiFields.add("merchant_type");
    openapiFields.add("pid");
    openapiFields.add("shop_id");
    openapiFields.add("smid");
    openapiFields.add("supplier_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantIotDeviceBindModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantIotDeviceBindModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantIotDeviceBindModel is not found in the empty JSON string", AlipayMerchantIotDeviceBindModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_tid") != null && !jsonObj.get("biz_tid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_tid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_tid").toString()));
      }
      if (jsonObj.get("device_id_type") != null && !jsonObj.get("device_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_id_type").toString()));
      }
      if (jsonObj.get("device_sn") != null && !jsonObj.get("device_sn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_sn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_sn").toString()));
      }
      if (jsonObj.get("merchant_type") != null && !jsonObj.get("merchant_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_type").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
      if (jsonObj.get("smid") != null && !jsonObj.get("smid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smid").toString()));
      }
      if (jsonObj.get("supplier_id") != null && !jsonObj.get("supplier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supplier_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantIotDeviceBindModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantIotDeviceBindModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantIotDeviceBindModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantIotDeviceBindModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantIotDeviceBindModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantIotDeviceBindModel value) throws IOException {
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
           public AlipayMerchantIotDeviceBindModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMerchantIotDeviceBindModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMerchantIotDeviceBindModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantIotDeviceBindModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantIotDeviceBindModel
  */
  public static AlipayMerchantIotDeviceBindModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantIotDeviceBindModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantIotDeviceBindModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

