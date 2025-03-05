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
 * DeliveryMiniAppContentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryMiniAppContentInfo {
  public static final String SERIALIZED_NAME_MINI_APP_DELIVERY_TYPE = "mini_app_delivery_type";
  @SerializedName(SERIALIZED_NAME_MINI_APP_DELIVERY_TYPE)
  private String miniAppDeliveryType;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_SERVICE_CODE_LIST = "service_code_list";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE_LIST)
  private List<String> serviceCodeList = null;

  public DeliveryMiniAppContentInfo() { 
  }

  public DeliveryMiniAppContentInfo miniAppDeliveryType(String miniAppDeliveryType) {
    
    this.miniAppDeliveryType = miniAppDeliveryType;
    return this;
  }

   /**
   * 仅小程序推广可用。
   * @return miniAppDeliveryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "仅小程序推广可用。")

  public String getMiniAppDeliveryType() {
    return miniAppDeliveryType;
  }


  public void setMiniAppDeliveryType(String miniAppDeliveryType) {
    this.miniAppDeliveryType = miniAppDeliveryType;
  }


  public DeliveryMiniAppContentInfo miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序ID")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public DeliveryMiniAppContentInfo serviceCodeList(List<String> serviceCodeList) {
    
    this.serviceCodeList = serviceCodeList;
    return this;
  }

  public DeliveryMiniAppContentInfo addServiceCodeListItem(String serviceCodeListItem) {
    if (this.serviceCodeList == null) {
      this.serviceCodeList = new ArrayList<>();
    }
    this.serviceCodeList.add(serviceCodeListItem);
    return this;
  }

   /**
   * 小程序服务编码/home_page，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。 限制: 1.只有mini_app_id有值时该值传入才会有效 2.当前只支持一个服务code 3.service_codes必须是已传入的mini_app_id下的小程序
   * @return serviceCodeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序服务编码/home_page，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。 限制: 1.只有mini_app_id有值时该值传入才会有效 2.当前只支持一个服务code 3.service_codes必须是已传入的mini_app_id下的小程序")

  public List<String> getServiceCodeList() {
    return serviceCodeList;
  }


  public void setServiceCodeList(List<String> serviceCodeList) {
    this.serviceCodeList = serviceCodeList;
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
   * @return the DeliveryMiniAppContentInfo instance itself
   */
  public DeliveryMiniAppContentInfo putAdditionalProperty(String key, Object value) {
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
    DeliveryMiniAppContentInfo deliveryMiniAppContentInfo = (DeliveryMiniAppContentInfo) o;
    return Objects.equals(this.miniAppDeliveryType, deliveryMiniAppContentInfo.miniAppDeliveryType) &&
        Objects.equals(this.miniAppId, deliveryMiniAppContentInfo.miniAppId) &&
        Objects.equals(this.serviceCodeList, deliveryMiniAppContentInfo.serviceCodeList)&&
        Objects.equals(this.additionalProperties, deliveryMiniAppContentInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniAppDeliveryType, miniAppId, serviceCodeList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryMiniAppContentInfo {\n");
    sb.append("    miniAppDeliveryType: ").append(toIndentedString(miniAppDeliveryType)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    serviceCodeList: ").append(toIndentedString(serviceCodeList)).append("\n");
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
    openapiFields.add("mini_app_delivery_type");
    openapiFields.add("mini_app_id");
    openapiFields.add("service_code_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryMiniAppContentInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryMiniAppContentInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryMiniAppContentInfo is not found in the empty JSON string", DeliveryMiniAppContentInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("mini_app_delivery_type") != null && !jsonObj.get("mini_app_delivery_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_delivery_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_delivery_type").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("service_code_list") != null && !jsonObj.get("service_code_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code_list` to be an array in the JSON string but got `%s`", jsonObj.get("service_code_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryMiniAppContentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryMiniAppContentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryMiniAppContentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryMiniAppContentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryMiniAppContentInfo>() {
           @Override
           public void write(JsonWriter out, DeliveryMiniAppContentInfo value) throws IOException {
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
           public DeliveryMiniAppContentInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeliveryMiniAppContentInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeliveryMiniAppContentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryMiniAppContentInfo
  * @throws IOException if the JSON string is invalid with respect to DeliveryMiniAppContentInfo
  */
  public static DeliveryMiniAppContentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryMiniAppContentInfo.class);
  }

 /**
  * Convert an instance of DeliveryMiniAppContentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

