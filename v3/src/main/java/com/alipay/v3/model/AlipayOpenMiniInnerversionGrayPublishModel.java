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
 * AlipayOpenMiniInnerversionGrayPublishModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionGrayPublishModel {
  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private String appOrigin;

  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_BETA_APP_ID_LIST = "beta_app_id_list";
  @SerializedName(SERIALIZED_NAME_BETA_APP_ID_LIST)
  private List<String> betaAppIdList = null;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_GRAY_STRATEGY = "gray_strategy";
  @SerializedName(SERIALIZED_NAME_GRAY_STRATEGY)
  private String grayStrategy;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public AlipayOpenMiniInnerversionGrayPublishModel() { 
  }

  public AlipayOpenMiniInnerversionGrayPublishModel appOrigin(String appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * 业务来源
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAA", value = "业务来源")

  public String getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(String appOrigin) {
    this.appOrigin = appOrigin;
  }


  public AlipayOpenMiniInnerversionGrayPublishModel appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 小程序版本
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.1", value = "小程序版本")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public AlipayOpenMiniInnerversionGrayPublishModel betaAppIdList(List<String> betaAppIdList) {
    
    this.betaAppIdList = betaAppIdList;
    return this;
  }

  public AlipayOpenMiniInnerversionGrayPublishModel addBetaAppIdListItem(String betaAppIdListItem) {
    if (this.betaAppIdList == null) {
      this.betaAppIdList = new ArrayList<>();
    }
    this.betaAppIdList.add(betaAppIdListItem);
    return this;
  }

   /**
   * 待邀测应用列表，灰度插件时使用，如无邀测必要请不要传入
   * @return betaAppIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2021xxxxx\"]", value = "待邀测应用列表，灰度插件时使用，如无邀测必要请不要传入")

  public List<String> getBetaAppIdList() {
    return betaAppIdList;
  }


  public void setBetaAppIdList(List<String> betaAppIdList) {
    this.betaAppIdList = betaAppIdList;
  }


  public AlipayOpenMiniInnerversionGrayPublishModel bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 端信息
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝：com.alipay.alipaywallet 高德：com.amap.app", value = "端信息")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AlipayOpenMiniInnerversionGrayPublishModel grayStrategy(String grayStrategy) {
    
    this.grayStrategy = grayStrategy;
    return this;
  }

   /**
   * 灰度值
   * @return grayStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gray_mayi_rule、gray_alibaba_rule", value = "灰度值")

  public String getGrayStrategy() {
    return grayStrategy;
  }


  public void setGrayStrategy(String grayStrategy) {
    this.grayStrategy = grayStrategy;
  }


  public AlipayOpenMiniInnerversionGrayPublishModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID，仅特殊场景使用，普通业务方无需关注该参数
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019****", value = "小程序ID，仅特殊场景使用，普通业务方无需关注该参数")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerversionGrayPublishModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 小程序所属PID
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088****", value = "小程序所属PID")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
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
   * @return the AlipayOpenMiniInnerversionGrayPublishModel instance itself
   */
  public AlipayOpenMiniInnerversionGrayPublishModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenMiniInnerversionGrayPublishModel alipayOpenMiniInnerversionGrayPublishModel = (AlipayOpenMiniInnerversionGrayPublishModel) o;
    return Objects.equals(this.appOrigin, alipayOpenMiniInnerversionGrayPublishModel.appOrigin) &&
        Objects.equals(this.appVersion, alipayOpenMiniInnerversionGrayPublishModel.appVersion) &&
        Objects.equals(this.betaAppIdList, alipayOpenMiniInnerversionGrayPublishModel.betaAppIdList) &&
        Objects.equals(this.bundleId, alipayOpenMiniInnerversionGrayPublishModel.bundleId) &&
        Objects.equals(this.grayStrategy, alipayOpenMiniInnerversionGrayPublishModel.grayStrategy) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerversionGrayPublishModel.miniAppId) &&
        Objects.equals(this.pid, alipayOpenMiniInnerversionGrayPublishModel.pid)&&
        Objects.equals(this.additionalProperties, alipayOpenMiniInnerversionGrayPublishModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appOrigin, appVersion, betaAppIdList, bundleId, grayStrategy, miniAppId, pid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionGrayPublishModel {\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    betaAppIdList: ").append(toIndentedString(betaAppIdList)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    grayStrategy: ").append(toIndentedString(grayStrategy)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
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
    openapiFields.add("app_origin");
    openapiFields.add("app_version");
    openapiFields.add("beta_app_id_list");
    openapiFields.add("bundle_id");
    openapiFields.add("gray_strategy");
    openapiFields.add("mini_app_id");
    openapiFields.add("pid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionGrayPublishModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionGrayPublishModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionGrayPublishModel is not found in the empty JSON string", AlipayOpenMiniInnerversionGrayPublishModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("app_origin") != null && !jsonObj.get("app_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_origin").toString()));
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("beta_app_id_list") != null && !jsonObj.get("beta_app_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `beta_app_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("beta_app_id_list").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("gray_strategy") != null && !jsonObj.get("gray_strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gray_strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gray_strategy").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionGrayPublishModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionGrayPublishModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionGrayPublishModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionGrayPublishModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionGrayPublishModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionGrayPublishModel value) throws IOException {
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
           public AlipayOpenMiniInnerversionGrayPublishModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenMiniInnerversionGrayPublishModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenMiniInnerversionGrayPublishModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionGrayPublishModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionGrayPublishModel
  */
  public static AlipayOpenMiniInnerversionGrayPublishModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionGrayPublishModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionGrayPublishModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

