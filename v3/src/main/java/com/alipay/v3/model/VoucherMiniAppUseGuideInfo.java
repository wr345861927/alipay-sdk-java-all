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
 * VoucherMiniAppUseGuideInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherMiniAppUseGuideInfo {
  public static final String SERIALIZED_NAME_MINI_APP_SERVICE_CODES = "mini_app_service_codes";
  @SerializedName(SERIALIZED_NAME_MINI_APP_SERVICE_CODES)
  private List<String> miniAppServiceCodes = null;

  public static final String SERIALIZED_NAME_MINI_APP_URL = "mini_app_url";
  @SerializedName(SERIALIZED_NAME_MINI_APP_URL)
  private String miniAppUrl;

  public VoucherMiniAppUseGuideInfo() { 
  }

  public VoucherMiniAppUseGuideInfo miniAppServiceCodes(List<String> miniAppServiceCodes) {
    
    this.miniAppServiceCodes = miniAppServiceCodes;
    return this;
  }

  public VoucherMiniAppUseGuideInfo addMiniAppServiceCodesItem(String miniAppServiceCodesItem) {
    if (this.miniAppServiceCodes == null) {
      this.miniAppServiceCodes = new ArrayList<>();
    }
    this.miniAppServiceCodes.add(miniAppServiceCodesItem);
    return this;
  }

   /**
   * 小程序服务编码，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。
   * @return miniAppServiceCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序服务编码，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。")

  public List<String> getMiniAppServiceCodes() {
    return miniAppServiceCodes;
  }


  public void setMiniAppServiceCodes(List<String> miniAppServiceCodes) {
    this.miniAppServiceCodes = miniAppServiceCodes;
  }


  public VoucherMiniAppUseGuideInfo miniAppUrl(String miniAppUrl) {
    
    this.miniAppUrl = miniAppUrl;
    return this;
  }

   /**
   * 小程序核销链接
   * @return miniAppUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序核销链接")

  public String getMiniAppUrl() {
    return miniAppUrl;
  }


  public void setMiniAppUrl(String miniAppUrl) {
    this.miniAppUrl = miniAppUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherMiniAppUseGuideInfo voucherMiniAppUseGuideInfo = (VoucherMiniAppUseGuideInfo) o;
    return Objects.equals(this.miniAppServiceCodes, voucherMiniAppUseGuideInfo.miniAppServiceCodes) &&
        Objects.equals(this.miniAppUrl, voucherMiniAppUseGuideInfo.miniAppUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniAppServiceCodes, miniAppUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherMiniAppUseGuideInfo {\n");
    sb.append("    miniAppServiceCodes: ").append(toIndentedString(miniAppServiceCodes)).append("\n");
    sb.append("    miniAppUrl: ").append(toIndentedString(miniAppUrl)).append("\n");
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
    openapiFields.add("mini_app_service_codes");
    openapiFields.add("mini_app_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherMiniAppUseGuideInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherMiniAppUseGuideInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherMiniAppUseGuideInfo is not found in the empty JSON string", VoucherMiniAppUseGuideInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherMiniAppUseGuideInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherMiniAppUseGuideInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("mini_app_service_codes") != null && !jsonObj.get("mini_app_service_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_service_codes` to be an array in the JSON string but got `%s`", jsonObj.get("mini_app_service_codes").toString()));
      }
      if (jsonObj.get("mini_app_url") != null && !jsonObj.get("mini_app_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherMiniAppUseGuideInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherMiniAppUseGuideInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherMiniAppUseGuideInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherMiniAppUseGuideInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherMiniAppUseGuideInfo>() {
           @Override
           public void write(JsonWriter out, VoucherMiniAppUseGuideInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherMiniAppUseGuideInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherMiniAppUseGuideInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherMiniAppUseGuideInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherMiniAppUseGuideInfo
  */
  public static VoucherMiniAppUseGuideInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherMiniAppUseGuideInfo.class);
  }

 /**
  * Convert an instance of VoucherMiniAppUseGuideInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

