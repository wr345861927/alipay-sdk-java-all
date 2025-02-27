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
import com.alipay.v3.model.DeliveryFullSendConfig;
import com.alipay.v3.model.DeliverySingleSendConfig;
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
 * DeliveryPlayConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryPlayConfig {
  public static final String SERIALIZED_NAME_DELIVERY_FULL_SEND_CONFIG = "delivery_full_send_config";
  @SerializedName(SERIALIZED_NAME_DELIVERY_FULL_SEND_CONFIG)
  private DeliveryFullSendConfig deliveryFullSendConfig;

  public static final String SERIALIZED_NAME_DELIVERY_SINGLE_SEND_CONFIG = "delivery_single_send_config";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SINGLE_SEND_CONFIG)
  private DeliverySingleSendConfig deliverySingleSendConfig;

  public DeliveryPlayConfig() { 
  }

  public DeliveryPlayConfig deliveryFullSendConfig(DeliveryFullSendConfig deliveryFullSendConfig) {
    
    this.deliveryFullSendConfig = deliveryFullSendConfig;
    return this;
  }

   /**
   * Get deliveryFullSendConfig
   * @return deliveryFullSendConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryFullSendConfig getDeliveryFullSendConfig() {
    return deliveryFullSendConfig;
  }


  public void setDeliveryFullSendConfig(DeliveryFullSendConfig deliveryFullSendConfig) {
    this.deliveryFullSendConfig = deliveryFullSendConfig;
  }


  public DeliveryPlayConfig deliverySingleSendConfig(DeliverySingleSendConfig deliverySingleSendConfig) {
    
    this.deliverySingleSendConfig = deliverySingleSendConfig;
    return this;
  }

   /**
   * Get deliverySingleSendConfig
   * @return deliverySingleSendConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliverySingleSendConfig getDeliverySingleSendConfig() {
    return deliverySingleSendConfig;
  }


  public void setDeliverySingleSendConfig(DeliverySingleSendConfig deliverySingleSendConfig) {
    this.deliverySingleSendConfig = deliverySingleSendConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryPlayConfig deliveryPlayConfig = (DeliveryPlayConfig) o;
    return Objects.equals(this.deliveryFullSendConfig, deliveryPlayConfig.deliveryFullSendConfig) &&
        Objects.equals(this.deliverySingleSendConfig, deliveryPlayConfig.deliverySingleSendConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryFullSendConfig, deliverySingleSendConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryPlayConfig {\n");
    sb.append("    deliveryFullSendConfig: ").append(toIndentedString(deliveryFullSendConfig)).append("\n");
    sb.append("    deliverySingleSendConfig: ").append(toIndentedString(deliverySingleSendConfig)).append("\n");
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
    openapiFields.add("delivery_full_send_config");
    openapiFields.add("delivery_single_send_config");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryPlayConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryPlayConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryPlayConfig is not found in the empty JSON string", DeliveryPlayConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeliveryPlayConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryPlayConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `delivery_full_send_config`
      if (jsonObj.getAsJsonObject("delivery_full_send_config") != null) {
        DeliveryFullSendConfig.validateJsonObject(jsonObj.getAsJsonObject("delivery_full_send_config"));
      }
      // validate the optional field `delivery_single_send_config`
      if (jsonObj.getAsJsonObject("delivery_single_send_config") != null) {
        DeliverySingleSendConfig.validateJsonObject(jsonObj.getAsJsonObject("delivery_single_send_config"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryPlayConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryPlayConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryPlayConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryPlayConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryPlayConfig>() {
           @Override
           public void write(JsonWriter out, DeliveryPlayConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryPlayConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryPlayConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryPlayConfig
  * @throws IOException if the JSON string is invalid with respect to DeliveryPlayConfig
  */
  public static DeliveryPlayConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryPlayConfig.class);
  }

 /**
  * Convert an instance of DeliveryPlayConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

