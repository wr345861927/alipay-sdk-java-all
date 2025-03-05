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
import com.alipay.v3.model.DeliveryAgencyMerchantInfo;
import com.alipay.v3.model.DeliveryConfig;
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
 * AlipayMarketingActivityDeliveryQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityDeliveryQueryModel {
  public static final String SERIALIZED_NAME_BELONG_MERCHANT_INFO = "belong_merchant_info";
  @SerializedName(SERIALIZED_NAME_BELONG_MERCHANT_INFO)
  private DeliveryAgencyMerchantInfo belongMerchantInfo;

  public static final String SERIALIZED_NAME_DELIVERY_CONFIG_LIST = "delivery_config_list";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CONFIG_LIST)
  private List<DeliveryConfig> deliveryConfigList = null;

  public static final String SERIALIZED_NAME_MERCHANT_ACCESS_MODE = "merchant_access_mode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCESS_MODE)
  private String merchantAccessMode;

  public AlipayMarketingActivityDeliveryQueryModel() { 
  }

  public AlipayMarketingActivityDeliveryQueryModel belongMerchantInfo(DeliveryAgencyMerchantInfo belongMerchantInfo) {
    
    this.belongMerchantInfo = belongMerchantInfo;
    return this;
  }

   /**
   * Get belongMerchantInfo
   * @return belongMerchantInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryAgencyMerchantInfo getBelongMerchantInfo() {
    return belongMerchantInfo;
  }


  public void setBelongMerchantInfo(DeliveryAgencyMerchantInfo belongMerchantInfo) {
    this.belongMerchantInfo = belongMerchantInfo;
  }


  public AlipayMarketingActivityDeliveryQueryModel deliveryConfigList(List<DeliveryConfig> deliveryConfigList) {
    
    this.deliveryConfigList = deliveryConfigList;
    return this;
  }

  public AlipayMarketingActivityDeliveryQueryModel addDeliveryConfigListItem(DeliveryConfig deliveryConfigListItem) {
    if (this.deliveryConfigList == null) {
      this.deliveryConfigList = new ArrayList<>();
    }
    this.deliveryConfigList.add(deliveryConfigListItem);
    return this;
  }

   /**
   * \&quot;[已废弃] 待查询的投放配置列表。 最大数量限制20个。\&quot;
   * @return deliveryConfigList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "\"[已废弃] 待查询的投放配置列表。 最大数量限制20个。\"")

  public List<DeliveryConfig> getDeliveryConfigList() {
    return deliveryConfigList;
  }


  public void setDeliveryConfigList(List<DeliveryConfig> deliveryConfigList) {
    this.deliveryConfigList = deliveryConfigList;
  }


  public AlipayMarketingActivityDeliveryQueryModel merchantAccessMode(String merchantAccessMode) {
    
    this.merchantAccessMode = merchantAccessMode;
    return this;
  }

   /**
   * 商户接入模式
   * @return merchantAccessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SELF_MODE", value = "商户接入模式")

  public String getMerchantAccessMode() {
    return merchantAccessMode;
  }


  public void setMerchantAccessMode(String merchantAccessMode) {
    this.merchantAccessMode = merchantAccessMode;
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
   * @return the AlipayMarketingActivityDeliveryQueryModel instance itself
   */
  public AlipayMarketingActivityDeliveryQueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingActivityDeliveryQueryModel alipayMarketingActivityDeliveryQueryModel = (AlipayMarketingActivityDeliveryQueryModel) o;
    return Objects.equals(this.belongMerchantInfo, alipayMarketingActivityDeliveryQueryModel.belongMerchantInfo) &&
        Objects.equals(this.deliveryConfigList, alipayMarketingActivityDeliveryQueryModel.deliveryConfigList) &&
        Objects.equals(this.merchantAccessMode, alipayMarketingActivityDeliveryQueryModel.merchantAccessMode)&&
        Objects.equals(this.additionalProperties, alipayMarketingActivityDeliveryQueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(belongMerchantInfo, deliveryConfigList, merchantAccessMode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityDeliveryQueryModel {\n");
    sb.append("    belongMerchantInfo: ").append(toIndentedString(belongMerchantInfo)).append("\n");
    sb.append("    deliveryConfigList: ").append(toIndentedString(deliveryConfigList)).append("\n");
    sb.append("    merchantAccessMode: ").append(toIndentedString(merchantAccessMode)).append("\n");
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
    openapiFields.add("belong_merchant_info");
    openapiFields.add("delivery_config_list");
    openapiFields.add("merchant_access_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityDeliveryQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityDeliveryQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityDeliveryQueryModel is not found in the empty JSON string", AlipayMarketingActivityDeliveryQueryModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `belong_merchant_info`
      if (jsonObj.getAsJsonObject("belong_merchant_info") != null) {
        DeliveryAgencyMerchantInfo.validateJsonObject(jsonObj.getAsJsonObject("belong_merchant_info"));
      }
      JsonArray jsonArraydeliveryConfigList = jsonObj.getAsJsonArray("delivery_config_list");
      if (jsonArraydeliveryConfigList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("delivery_config_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `delivery_config_list` to be an array in the JSON string but got `%s`", jsonObj.get("delivery_config_list").toString()));
        }

        // validate the optional field `delivery_config_list` (array)
        for (int i = 0; i < jsonArraydeliveryConfigList.size(); i++) {
          DeliveryConfig.validateJsonObject(jsonArraydeliveryConfigList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("merchant_access_mode") != null && !jsonObj.get("merchant_access_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_access_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_access_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityDeliveryQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityDeliveryQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityDeliveryQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityDeliveryQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityDeliveryQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityDeliveryQueryModel value) throws IOException {
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
           public AlipayMarketingActivityDeliveryQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingActivityDeliveryQueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingActivityDeliveryQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityDeliveryQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityDeliveryQueryModel
  */
  public static AlipayMarketingActivityDeliveryQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityDeliveryQueryModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityDeliveryQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

