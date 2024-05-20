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
 * AlipayOpenMiniInnerversionOnlineModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionOnlineModel {
  public static final String SERIALIZED_NAME_APP_OFFLINE_VERSION = "app_offline_version";
  @SerializedName(SERIALIZED_NAME_APP_OFFLINE_VERSION)
  private String appOfflineVersion;

  public static final String SERIALIZED_NAME_APP_ONLINE_VERSION = "app_online_version";
  @SerializedName(SERIALIZED_NAME_APP_ONLINE_VERSION)
  private String appOnlineVersion;

  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private String appOrigin;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_INST_CODE = "inst_code";
  @SerializedName(SERIALIZED_NAME_INST_CODE)
  private String instCode;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public AlipayOpenMiniInnerversionOnlineModel() { 
  }

  public AlipayOpenMiniInnerversionOnlineModel appOfflineVersion(String appOfflineVersion) {
    
    this.appOfflineVersion = appOfflineVersion;
    return this;
  }

   /**
   * 下架版本
   * @return appOfflineVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.5", value = "下架版本")

  public String getAppOfflineVersion() {
    return appOfflineVersion;
  }


  public void setAppOfflineVersion(String appOfflineVersion) {
    this.appOfflineVersion = appOfflineVersion;
  }


  public AlipayOpenMiniInnerversionOnlineModel appOnlineVersion(String appOnlineVersion) {
    
    this.appOnlineVersion = appOnlineVersion;
    return this;
  }

   /**
   * 上架版本
   * @return appOnlineVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.6", value = "上架版本")

  public String getAppOnlineVersion() {
    return appOnlineVersion;
  }


  public void setAppOnlineVersion(String appOnlineVersion) {
    this.appOnlineVersion = appOnlineVersion;
  }


  public AlipayOpenMiniInnerversionOnlineModel appOrigin(String appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * 业务来源
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ASTORE", value = "业务来源")

  public String getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(String appOrigin) {
    this.appOrigin = appOrigin;
  }


  public AlipayOpenMiniInnerversionOnlineModel bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.alipay.alipaywallet", value = "一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AlipayOpenMiniInnerversionOnlineModel instCode(String instCode) {
    
    this.instCode = instCode;
    return this;
  }

   /**
   * 租户code，alipay or taobao
   * @return instCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "taobao", value = "租户code，alipay or taobao")

  public String getInstCode() {
    return instCode;
  }


  public void setInstCode(String instCode) {
    this.instCode = instCode;
  }


  public AlipayOpenMiniInnerversionOnlineModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018012201365222", value = "小程序ID")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
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
   * @return the AlipayOpenMiniInnerversionOnlineModel instance itself
   */
  public AlipayOpenMiniInnerversionOnlineModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenMiniInnerversionOnlineModel alipayOpenMiniInnerversionOnlineModel = (AlipayOpenMiniInnerversionOnlineModel) o;
    return Objects.equals(this.appOfflineVersion, alipayOpenMiniInnerversionOnlineModel.appOfflineVersion) &&
        Objects.equals(this.appOnlineVersion, alipayOpenMiniInnerversionOnlineModel.appOnlineVersion) &&
        Objects.equals(this.appOrigin, alipayOpenMiniInnerversionOnlineModel.appOrigin) &&
        Objects.equals(this.bundleId, alipayOpenMiniInnerversionOnlineModel.bundleId) &&
        Objects.equals(this.instCode, alipayOpenMiniInnerversionOnlineModel.instCode) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerversionOnlineModel.miniAppId)&&
        Objects.equals(this.additionalProperties, alipayOpenMiniInnerversionOnlineModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appOfflineVersion, appOnlineVersion, appOrigin, bundleId, instCode, miniAppId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionOnlineModel {\n");
    sb.append("    appOfflineVersion: ").append(toIndentedString(appOfflineVersion)).append("\n");
    sb.append("    appOnlineVersion: ").append(toIndentedString(appOnlineVersion)).append("\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    instCode: ").append(toIndentedString(instCode)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
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
    openapiFields.add("app_offline_version");
    openapiFields.add("app_online_version");
    openapiFields.add("app_origin");
    openapiFields.add("bundle_id");
    openapiFields.add("inst_code");
    openapiFields.add("mini_app_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionOnlineModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionOnlineModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionOnlineModel is not found in the empty JSON string", AlipayOpenMiniInnerversionOnlineModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("app_offline_version") != null && !jsonObj.get("app_offline_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_offline_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_offline_version").toString()));
      }
      if (jsonObj.get("app_online_version") != null && !jsonObj.get("app_online_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_online_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_online_version").toString()));
      }
      if (jsonObj.get("app_origin") != null && !jsonObj.get("app_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_origin").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("inst_code") != null && !jsonObj.get("inst_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inst_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inst_code").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionOnlineModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionOnlineModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionOnlineModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionOnlineModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionOnlineModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionOnlineModel value) throws IOException {
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
           public AlipayOpenMiniInnerversionOnlineModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenMiniInnerversionOnlineModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenMiniInnerversionOnlineModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionOnlineModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionOnlineModel
  */
  public static AlipayOpenMiniInnerversionOnlineModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionOnlineModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionOnlineModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

