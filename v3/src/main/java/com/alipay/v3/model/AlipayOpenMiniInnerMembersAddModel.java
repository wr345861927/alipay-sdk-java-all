/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
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
 * AlipayOpenMiniInnerMembersAddModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerMembersAddModel {
  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private String appOrigin;

  public static final String SERIALIZED_NAME_DOMAIN_ACCOUNT = "domain_account";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ACCOUNT)
  private String domainAccount;

  public static final String SERIALIZED_NAME_LOGIN_ID = "login_id";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private String loginId;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AlipayOpenMiniInnerMembersAddModel() { 
  }

  public AlipayOpenMiniInnerMembersAddModel appOrigin(String appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * 业务来源
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALIPAY", value = "业务来源")

  public String getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(String appOrigin) {
    this.appOrigin = appOrigin;
  }


  public AlipayOpenMiniInnerMembersAddModel domainAccount(String domainAccount) {
    
    this.domainAccount = domainAccount;
    return this;
  }

   /**
   * 域账号（不为空时会添加联系人）
   * @return domainAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "域账号", value = "域账号（不为空时会添加联系人）")

  public String getDomainAccount() {
    return domainAccount;
  }


  public void setDomainAccount(String domainAccount) {
    this.domainAccount = domainAccount;
  }


  public AlipayOpenMiniInnerMembersAddModel loginId(String loginId) {
    
    this.loginId = loginId;
    return this;
  }

   /**
   * 支付宝登陆账号
   * @return loginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝登陆账号", value = "支付宝登陆账号")

  public String getLoginId() {
    return loginId;
  }


  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  public AlipayOpenMiniInnerMembersAddModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 业务appId
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021125678974521", value = "业务appId")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerMembersAddModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 成员类型
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEVELOPER", value = "成员类型")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
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
   * @return the AlipayOpenMiniInnerMembersAddModel instance itself
   */
  public AlipayOpenMiniInnerMembersAddModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenMiniInnerMembersAddModel alipayOpenMiniInnerMembersAddModel = (AlipayOpenMiniInnerMembersAddModel) o;
    return Objects.equals(this.appOrigin, alipayOpenMiniInnerMembersAddModel.appOrigin) &&
        Objects.equals(this.domainAccount, alipayOpenMiniInnerMembersAddModel.domainAccount) &&
        Objects.equals(this.loginId, alipayOpenMiniInnerMembersAddModel.loginId) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerMembersAddModel.miniAppId) &&
        Objects.equals(this.type, alipayOpenMiniInnerMembersAddModel.type)&&
        Objects.equals(this.additionalProperties, alipayOpenMiniInnerMembersAddModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appOrigin, domainAccount, loginId, miniAppId, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerMembersAddModel {\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    domainAccount: ").append(toIndentedString(domainAccount)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("domain_account");
    openapiFields.add("login_id");
    openapiFields.add("mini_app_id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerMembersAddModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerMembersAddModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerMembersAddModel is not found in the empty JSON string", AlipayOpenMiniInnerMembersAddModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("app_origin") != null && !jsonObj.get("app_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_origin").toString()));
      }
      if (jsonObj.get("domain_account") != null && !jsonObj.get("domain_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain_account").toString()));
      }
      if (jsonObj.get("login_id") != null && !jsonObj.get("login_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_id").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerMembersAddModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerMembersAddModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerMembersAddModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerMembersAddModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerMembersAddModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerMembersAddModel value) throws IOException {
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
           public AlipayOpenMiniInnerMembersAddModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenMiniInnerMembersAddModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenMiniInnerMembersAddModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerMembersAddModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerMembersAddModel
  */
  public static AlipayOpenMiniInnerMembersAddModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerMembersAddModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerMembersAddModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

