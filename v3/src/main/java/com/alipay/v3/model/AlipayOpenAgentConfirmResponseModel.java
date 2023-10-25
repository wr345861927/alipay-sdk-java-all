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
 * AlipayOpenAgentConfirmResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAgentConfirmResponseModel {
  public static final String SERIALIZED_NAME_APP_AUTH_TOKEN = "app_auth_token";
  @SerializedName(SERIALIZED_NAME_APP_AUTH_TOKEN)
  private String appAuthToken;

  public static final String SERIALIZED_NAME_APP_REFRESH_TOKEN = "app_refresh_token";
  @SerializedName(SERIALIZED_NAME_APP_REFRESH_TOKEN)
  private String appRefreshToken;

  public static final String SERIALIZED_NAME_AUTH_APP_ID = "auth_app_id";
  @SerializedName(SERIALIZED_NAME_AUTH_APP_ID)
  private String authAppId;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private String expiresIn;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public static final String SERIALIZED_NAME_RE_EXPIRES_IN = "re_expires_in";
  @SerializedName(SERIALIZED_NAME_RE_EXPIRES_IN)
  private String reExpiresIn;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayOpenAgentConfirmResponseModel() { 
  }

  public AlipayOpenAgentConfirmResponseModel appAuthToken(String appAuthToken) {
    
    this.appAuthToken = appAuthToken;
    return this;
  }

   /**
   * 应用授权令牌
   * @return appAuthToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201509BBeff9351ad1874306903e96b91d248A36", value = "应用授权令牌")

  public String getAppAuthToken() {
    return appAuthToken;
  }


  public void setAppAuthToken(String appAuthToken) {
    this.appAuthToken = appAuthToken;
  }


  public AlipayOpenAgentConfirmResponseModel appRefreshToken(String appRefreshToken) {
    
    this.appRefreshToken = appRefreshToken;
    return this;
  }

   /**
   * 刷新令牌
   * @return appRefreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201509BBdcba1e3347de4e75ba3fed2c9abebE36", value = "刷新令牌")

  public String getAppRefreshToken() {
    return appRefreshToken;
  }


  public void setAppRefreshToken(String appRefreshToken) {
    this.appRefreshToken = appRefreshToken;
  }


  public AlipayOpenAgentConfirmResponseModel authAppId(String authAppId) {
    
    this.authAppId = authAppId;
    return this;
  }

   /**
   * 授权商户的appid
   * @return authAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013121100055554", value = "授权商户的appid")

  public String getAuthAppId() {
    return authAppId;
  }


  public void setAuthAppId(String authAppId) {
    this.authAppId = authAppId;
  }


  public AlipayOpenAgentConfirmResponseModel expiresIn(String expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * 应用授权令牌的有效时间（从接口调用时间作为起始时间），单位到秒
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "应用授权令牌的有效时间（从接口调用时间作为起始时间），单位到秒")

  public String getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }


  public AlipayOpenAgentConfirmResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 授权商户的user_id
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "授权商户的user_id")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayOpenAgentConfirmResponseModel orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 签约单号，如果是签约必返回
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211020034000100000027428505085", value = "签约单号，如果是签约必返回")

  public String getOrderNo() {
    return orderNo;
  }


  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public AlipayOpenAgentConfirmResponseModel reExpiresIn(String reExpiresIn) {
    
    this.reExpiresIn = reExpiresIn;
    return this;
  }

   /**
   * 刷新令牌的有效时间（从接口调用时间作为起始时间），单位到秒
   * @return reExpiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "刷新令牌的有效时间（从接口调用时间作为起始时间），单位到秒")

  public String getReExpiresIn() {
    return reExpiresIn;
  }


  public void setReExpiresIn(String reExpiresIn) {
    this.reExpiresIn = reExpiresIn;
  }


  public AlipayOpenAgentConfirmResponseModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 授权商户的user_id
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102150527498", value = "授权商户的user_id")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAgentConfirmResponseModel alipayOpenAgentConfirmResponseModel = (AlipayOpenAgentConfirmResponseModel) o;
    return Objects.equals(this.appAuthToken, alipayOpenAgentConfirmResponseModel.appAuthToken) &&
        Objects.equals(this.appRefreshToken, alipayOpenAgentConfirmResponseModel.appRefreshToken) &&
        Objects.equals(this.authAppId, alipayOpenAgentConfirmResponseModel.authAppId) &&
        Objects.equals(this.expiresIn, alipayOpenAgentConfirmResponseModel.expiresIn) &&
        Objects.equals(this.openId, alipayOpenAgentConfirmResponseModel.openId) &&
        Objects.equals(this.orderNo, alipayOpenAgentConfirmResponseModel.orderNo) &&
        Objects.equals(this.reExpiresIn, alipayOpenAgentConfirmResponseModel.reExpiresIn) &&
        Objects.equals(this.userId, alipayOpenAgentConfirmResponseModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appAuthToken, appRefreshToken, authAppId, expiresIn, openId, orderNo, reExpiresIn, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAgentConfirmResponseModel {\n");
    sb.append("    appAuthToken: ").append(toIndentedString(appAuthToken)).append("\n");
    sb.append("    appRefreshToken: ").append(toIndentedString(appRefreshToken)).append("\n");
    sb.append("    authAppId: ").append(toIndentedString(authAppId)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    reExpiresIn: ").append(toIndentedString(reExpiresIn)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("app_auth_token");
    openapiFields.add("app_refresh_token");
    openapiFields.add("auth_app_id");
    openapiFields.add("expires_in");
    openapiFields.add("open_id");
    openapiFields.add("order_no");
    openapiFields.add("re_expires_in");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAgentConfirmResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAgentConfirmResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAgentConfirmResponseModel is not found in the empty JSON string", AlipayOpenAgentConfirmResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAgentConfirmResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAgentConfirmResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_auth_token") != null && !jsonObj.get("app_auth_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_auth_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_auth_token").toString()));
      }
      if (jsonObj.get("app_refresh_token") != null && !jsonObj.get("app_refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_refresh_token").toString()));
      }
      if (jsonObj.get("auth_app_id") != null && !jsonObj.get("auth_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_app_id").toString()));
      }
      if (jsonObj.get("expires_in") != null && !jsonObj.get("expires_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires_in").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("order_no") != null && !jsonObj.get("order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_no").toString()));
      }
      if (jsonObj.get("re_expires_in") != null && !jsonObj.get("re_expires_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `re_expires_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("re_expires_in").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAgentConfirmResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAgentConfirmResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAgentConfirmResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAgentConfirmResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAgentConfirmResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAgentConfirmResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAgentConfirmResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAgentConfirmResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAgentConfirmResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAgentConfirmResponseModel
  */
  public static AlipayOpenAgentConfirmResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAgentConfirmResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAgentConfirmResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

