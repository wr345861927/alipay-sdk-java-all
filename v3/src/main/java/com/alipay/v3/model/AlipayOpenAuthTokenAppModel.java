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
 * AlipayOpenAuthTokenAppModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAuthTokenAppModel {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_GRANT_TYPE = "grant_type";
  @SerializedName(SERIALIZED_NAME_GRANT_TYPE)
  private String grantType;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public AlipayOpenAuthTokenAppModel() { 
  }

  public AlipayOpenAuthTokenAppModel code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 应用授权码，传入应用授权后得到的  app_auth_code。 说明： grant_type 为 authorization_code 时，本参数必填； grant_type 为 refresh_token 时不填。
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1cc19911172e4f8aaa509c8fb5d12F56", value = "应用授权码，传入应用授权后得到的  app_auth_code。 说明： grant_type 为 authorization_code 时，本参数必填； grant_type 为 refresh_token 时不填。")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public AlipayOpenAuthTokenAppModel grantType(String grantType) {
    
    this.grantType = grantType;
    return this;
  }

   /**
   * 授权方式。支持： authorization_code：使用应用授权码换取应用授权令牌app_auth_token。 refresh_token：使用app_refresh_token刷新获取新授权令牌。 
   * @return grantType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "authorization_code或者refresh_token", value = "授权方式。支持： authorization_code：使用应用授权码换取应用授权令牌app_auth_token。 refresh_token：使用app_refresh_token刷新获取新授权令牌。 ")

  public String getGrantType() {
    return grantType;
  }


  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }


  public AlipayOpenAuthTokenAppModel refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填，且该值来源于此接口的返回值 app_refresh_token（即至少需要通过 grant_type&#x3D;authorization_code 调用此接口一次才能获取）。
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201509BBdcba1e3347de4e75ba3fed2c9abebE36", value = "刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填，且该值来源于此接口的返回值 app_refresh_token（即至少需要通过 grant_type=authorization_code 调用此接口一次才能获取）。")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAuthTokenAppModel alipayOpenAuthTokenAppModel = (AlipayOpenAuthTokenAppModel) o;
    return Objects.equals(this.code, alipayOpenAuthTokenAppModel.code) &&
        Objects.equals(this.grantType, alipayOpenAuthTokenAppModel.grantType) &&
        Objects.equals(this.refreshToken, alipayOpenAuthTokenAppModel.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, grantType, refreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAuthTokenAppModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("grant_type");
    openapiFields.add("refresh_token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAuthTokenAppModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAuthTokenAppModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAuthTokenAppModel is not found in the empty JSON string", AlipayOpenAuthTokenAppModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAuthTokenAppModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAuthTokenAppModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("grant_type") != null && !jsonObj.get("grant_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grant_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grant_type").toString()));
      }
      if (jsonObj.get("refresh_token") != null && !jsonObj.get("refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refresh_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAuthTokenAppModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAuthTokenAppModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAuthTokenAppModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAuthTokenAppModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAuthTokenAppModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAuthTokenAppModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAuthTokenAppModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAuthTokenAppModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAuthTokenAppModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAuthTokenAppModel
  */
  public static AlipayOpenAuthTokenAppModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAuthTokenAppModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAuthTokenAppModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

