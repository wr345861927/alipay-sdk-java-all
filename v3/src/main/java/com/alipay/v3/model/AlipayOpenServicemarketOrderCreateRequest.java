/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-10-25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.AlipayOpenServicemarketOrderCreateModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
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
 * AlipayOpenServicemarketOrderCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenServicemarketOrderCreateRequest {
  public static final String SERIALIZED_NAME_APP_LOGO = "app_logo";
  @SerializedName(SERIALIZED_NAME_APP_LOGO)
  private File appLogo;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AlipayOpenServicemarketOrderCreateModel data;

  public AlipayOpenServicemarketOrderCreateRequest() { 
  }

  public AlipayOpenServicemarketOrderCreateRequest appLogo(File appLogo) {
    
    this.appLogo = appLogo;
    return this;
  }

   /**
   * Get appLogo
   * @return appLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getAppLogo() {
    return appLogo;
  }


  public void setAppLogo(File appLogo) {
    this.appLogo = appLogo;
  }


  public AlipayOpenServicemarketOrderCreateRequest data(AlipayOpenServicemarketOrderCreateModel data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlipayOpenServicemarketOrderCreateModel getData() {
    return data;
  }


  public void setData(AlipayOpenServicemarketOrderCreateModel data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenServicemarketOrderCreateRequest alipayOpenServicemarketOrderCreateRequest = (AlipayOpenServicemarketOrderCreateRequest) o;
    return Objects.equals(this.appLogo, alipayOpenServicemarketOrderCreateRequest.appLogo) &&
        Objects.equals(this.data, alipayOpenServicemarketOrderCreateRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLogo, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenServicemarketOrderCreateRequest {\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("app_logo");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenServicemarketOrderCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenServicemarketOrderCreateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenServicemarketOrderCreateRequest is not found in the empty JSON string", AlipayOpenServicemarketOrderCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenServicemarketOrderCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenServicemarketOrderCreateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        AlipayOpenServicemarketOrderCreateModel.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenServicemarketOrderCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenServicemarketOrderCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenServicemarketOrderCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenServicemarketOrderCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenServicemarketOrderCreateRequest>() {
           @Override
           public void write(JsonWriter out, AlipayOpenServicemarketOrderCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenServicemarketOrderCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenServicemarketOrderCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenServicemarketOrderCreateRequest
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenServicemarketOrderCreateRequest
  */
  public static AlipayOpenServicemarketOrderCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenServicemarketOrderCreateRequest.class);
  }

 /**
  * Convert an instance of AlipayOpenServicemarketOrderCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

