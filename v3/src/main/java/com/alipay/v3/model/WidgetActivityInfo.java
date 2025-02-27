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
 * WidgetActivityInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WidgetActivityInfo {
  public static final String SERIALIZED_NAME_ACTIVITY_CLICK_URL = "activity_click_url";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_CLICK_URL)
  private String activityClickUrl;

  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_ACTIVITY_NAME = "activity_name";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_NAME)
  private String activityName;

  public static final String SERIALIZED_NAME_ACTIVITY_PICTURE_URLS = "activity_picture_urls";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_PICTURE_URLS)
  private List<String> activityPictureUrls = null;

  public WidgetActivityInfo() { 
  }

  public WidgetActivityInfo activityClickUrl(String activityClickUrl) {
    
    this.activityClickUrl = activityClickUrl;
    return this;
  }

   /**
   * 活动点击跳转到小程序的链接地址
   * @return activityClickUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId= 2017072607907880&page=pages/index/index?param=xxxx", value = "活动点击跳转到小程序的链接地址")

  public String getActivityClickUrl() {
    return activityClickUrl;
  }


  public void setActivityClickUrl(String activityClickUrl) {
    this.activityClickUrl = activityClickUrl;
  }


  public WidgetActivityInfo activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动的唯一标识，同一个小程序橱窗下，该标识唯一，请开发者自行保证
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8948968498", value = "活动的唯一标识，同一个小程序橱窗下，该标识唯一，请开发者自行保证")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public WidgetActivityInfo activityName(String activityName) {
    
    this.activityName = activityName;
    return this;
  }

   /**
   * 活动名称
   * @return activityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一个活动名称", value = "活动名称")

  public String getActivityName() {
    return activityName;
  }


  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }


  public WidgetActivityInfo activityPictureUrls(List<String> activityPictureUrls) {
    
    this.activityPictureUrls = activityPictureUrls;
    return this;
  }

  public WidgetActivityInfo addActivityPictureUrlsItem(String activityPictureUrlsItem) {
    if (this.activityPictureUrls == null) {
      this.activityPictureUrls = new ArrayList<>();
    }
    this.activityPictureUrls.add(activityPictureUrlsItem);
    return this;
  }

   /**
   * 活动图片链接,最多不能超过5个
   * @return activityPictureUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"https://xxx.xxx.com/xxx.jpg\"]", value = "活动图片链接,最多不能超过5个")

  public List<String> getActivityPictureUrls() {
    return activityPictureUrls;
  }


  public void setActivityPictureUrls(List<String> activityPictureUrls) {
    this.activityPictureUrls = activityPictureUrls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetActivityInfo widgetActivityInfo = (WidgetActivityInfo) o;
    return Objects.equals(this.activityClickUrl, widgetActivityInfo.activityClickUrl) &&
        Objects.equals(this.activityId, widgetActivityInfo.activityId) &&
        Objects.equals(this.activityName, widgetActivityInfo.activityName) &&
        Objects.equals(this.activityPictureUrls, widgetActivityInfo.activityPictureUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityClickUrl, activityId, activityName, activityPictureUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetActivityInfo {\n");
    sb.append("    activityClickUrl: ").append(toIndentedString(activityClickUrl)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityPictureUrls: ").append(toIndentedString(activityPictureUrls)).append("\n");
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
    openapiFields.add("activity_click_url");
    openapiFields.add("activity_id");
    openapiFields.add("activity_name");
    openapiFields.add("activity_picture_urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WidgetActivityInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WidgetActivityInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WidgetActivityInfo is not found in the empty JSON string", WidgetActivityInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WidgetActivityInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WidgetActivityInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("activity_click_url") != null && !jsonObj.get("activity_click_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_click_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_click_url").toString()));
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      if (jsonObj.get("activity_name") != null && !jsonObj.get("activity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_name").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("activity_picture_urls") != null && !jsonObj.get("activity_picture_urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_picture_urls` to be an array in the JSON string but got `%s`", jsonObj.get("activity_picture_urls").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WidgetActivityInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WidgetActivityInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WidgetActivityInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WidgetActivityInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<WidgetActivityInfo>() {
           @Override
           public void write(JsonWriter out, WidgetActivityInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WidgetActivityInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WidgetActivityInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WidgetActivityInfo
  * @throws IOException if the JSON string is invalid with respect to WidgetActivityInfo
  */
  public static WidgetActivityInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WidgetActivityInfo.class);
  }

 /**
  * Convert an instance of WidgetActivityInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

