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
import com.alipay.v3.model.VoucherMiniAppSendGuideInfo;
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
 * VoucherSendGuideInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherSendGuideInfo {
  public static final String SERIALIZED_NAME_MINI_APP_SEND_GUIDE_INFO = "mini_app_send_guide_info";
  @SerializedName(SERIALIZED_NAME_MINI_APP_SEND_GUIDE_INFO)
  private VoucherMiniAppSendGuideInfo miniAppSendGuideInfo;

  public static final String SERIALIZED_NAME_SEND_GUIDE_MODE = "send_guide_mode";
  @SerializedName(SERIALIZED_NAME_SEND_GUIDE_MODE)
  private List<String> sendGuideMode = null;

  public VoucherSendGuideInfo() { 
  }

  public VoucherSendGuideInfo miniAppSendGuideInfo(VoucherMiniAppSendGuideInfo miniAppSendGuideInfo) {
    
    this.miniAppSendGuideInfo = miniAppSendGuideInfo;
    return this;
  }

   /**
   * Get miniAppSendGuideInfo
   * @return miniAppSendGuideInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherMiniAppSendGuideInfo getMiniAppSendGuideInfo() {
    return miniAppSendGuideInfo;
  }


  public void setMiniAppSendGuideInfo(VoucherMiniAppSendGuideInfo miniAppSendGuideInfo) {
    this.miniAppSendGuideInfo = miniAppSendGuideInfo;
  }


  public VoucherSendGuideInfo sendGuideMode(List<String> sendGuideMode) {
    
    this.sendGuideMode = sendGuideMode;
    return this;
  }

  public VoucherSendGuideInfo addSendGuideModeItem(String sendGuideModeItem) {
    if (this.sendGuideMode == null) {
      this.sendGuideMode = new ArrayList<>();
    }
    this.sendGuideMode.add(sendGuideModeItem);
    return this;
  }

   /**
   * 发放引导模式
   * @return sendGuideMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发放引导模式")

  public List<String> getSendGuideMode() {
    return sendGuideMode;
  }


  public void setSendGuideMode(List<String> sendGuideMode) {
    this.sendGuideMode = sendGuideMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherSendGuideInfo voucherSendGuideInfo = (VoucherSendGuideInfo) o;
    return Objects.equals(this.miniAppSendGuideInfo, voucherSendGuideInfo.miniAppSendGuideInfo) &&
        Objects.equals(this.sendGuideMode, voucherSendGuideInfo.sendGuideMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniAppSendGuideInfo, sendGuideMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherSendGuideInfo {\n");
    sb.append("    miniAppSendGuideInfo: ").append(toIndentedString(miniAppSendGuideInfo)).append("\n");
    sb.append("    sendGuideMode: ").append(toIndentedString(sendGuideMode)).append("\n");
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
    openapiFields.add("mini_app_send_guide_info");
    openapiFields.add("send_guide_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherSendGuideInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherSendGuideInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherSendGuideInfo is not found in the empty JSON string", VoucherSendGuideInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherSendGuideInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherSendGuideInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `mini_app_send_guide_info`
      if (jsonObj.getAsJsonObject("mini_app_send_guide_info") != null) {
        VoucherMiniAppSendGuideInfo.validateJsonObject(jsonObj.getAsJsonObject("mini_app_send_guide_info"));
      }
      // ensure the json data is an array
      if (jsonObj.get("send_guide_mode") != null && !jsonObj.get("send_guide_mode").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `send_guide_mode` to be an array in the JSON string but got `%s`", jsonObj.get("send_guide_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherSendGuideInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherSendGuideInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherSendGuideInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherSendGuideInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherSendGuideInfo>() {
           @Override
           public void write(JsonWriter out, VoucherSendGuideInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherSendGuideInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherSendGuideInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherSendGuideInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherSendGuideInfo
  */
  public static VoucherSendGuideInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherSendGuideInfo.class);
  }

 /**
  * Convert an instance of VoucherSendGuideInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

