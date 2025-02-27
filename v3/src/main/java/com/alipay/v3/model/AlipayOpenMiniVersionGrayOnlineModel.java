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
 * AlipayOpenMiniVersionGrayOnlineModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniVersionGrayOnlineModel {
  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_GRAY_STRATEGY = "gray_strategy";
  @SerializedName(SERIALIZED_NAME_GRAY_STRATEGY)
  private String grayStrategy;

  public AlipayOpenMiniVersionGrayOnlineModel() { 
  }

  public AlipayOpenMiniVersionGrayOnlineModel appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 商家小程序版本号，需为审核通过状态的小程序版本。
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.1", value = "商家小程序版本号，需为审核通过状态的小程序版本。")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public AlipayOpenMiniVersionGrayOnlineModel bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 小程序投放的端参数，例如投放到支付宝钱包是支付宝端。默认支付宝端。支持： com.alipay.alipaywallet:支付宝端； com.alipay.iot.xpaas：支付宝IoT端。
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.alipay.alipaywallet", value = "小程序投放的端参数，例如投放到支付宝钱包是支付宝端。默认支付宝端。支持： com.alipay.alipaywallet:支付宝端； com.alipay.iot.xpaas：支付宝IoT端。")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AlipayOpenMiniVersionGrayOnlineModel grayStrategy(String grayStrategy) {
    
    this.grayStrategy = grayStrategy;
    return this;
  }

   /**
   * 小程序灰度策略值。枚举支持：p10、p30、p50。其中 p10 代表 10% 的用户，p30 代表 30% 的用户，p50 代表 50% 的用户。
   * @return grayStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "p10", value = "小程序灰度策略值。枚举支持：p10、p30、p50。其中 p10 代表 10% 的用户，p30 代表 30% 的用户，p50 代表 50% 的用户。")

  public String getGrayStrategy() {
    return grayStrategy;
  }


  public void setGrayStrategy(String grayStrategy) {
    this.grayStrategy = grayStrategy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniVersionGrayOnlineModel alipayOpenMiniVersionGrayOnlineModel = (AlipayOpenMiniVersionGrayOnlineModel) o;
    return Objects.equals(this.appVersion, alipayOpenMiniVersionGrayOnlineModel.appVersion) &&
        Objects.equals(this.bundleId, alipayOpenMiniVersionGrayOnlineModel.bundleId) &&
        Objects.equals(this.grayStrategy, alipayOpenMiniVersionGrayOnlineModel.grayStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVersion, bundleId, grayStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniVersionGrayOnlineModel {\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    grayStrategy: ").append(toIndentedString(grayStrategy)).append("\n");
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
    openapiFields.add("app_version");
    openapiFields.add("bundle_id");
    openapiFields.add("gray_strategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniVersionGrayOnlineModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniVersionGrayOnlineModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniVersionGrayOnlineModel is not found in the empty JSON string", AlipayOpenMiniVersionGrayOnlineModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniVersionGrayOnlineModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniVersionGrayOnlineModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("gray_strategy") != null && !jsonObj.get("gray_strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gray_strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gray_strategy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniVersionGrayOnlineModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniVersionGrayOnlineModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniVersionGrayOnlineModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniVersionGrayOnlineModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniVersionGrayOnlineModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniVersionGrayOnlineModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniVersionGrayOnlineModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniVersionGrayOnlineModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniVersionGrayOnlineModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniVersionGrayOnlineModel
  */
  public static AlipayOpenMiniVersionGrayOnlineModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniVersionGrayOnlineModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniVersionGrayOnlineModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

