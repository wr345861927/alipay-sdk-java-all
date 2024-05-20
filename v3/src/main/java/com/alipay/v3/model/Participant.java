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
import com.alipay.v3.model.BankcardExtInfo;
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
 * Participant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Participant {
  public static final String SERIALIZED_NAME_BANKCARD_EXT_INFO = "bankcard_ext_info";
  @SerializedName(SERIALIZED_NAME_BANKCARD_EXT_INFO)
  private BankcardExtInfo bankcardExtInfo;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_MERCHANT_USER_INFO = "merchant_user_info";
  @SerializedName(SERIALIZED_NAME_MERCHANT_USER_INFO)
  private String merchantUserInfo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public Participant() { 
  }

  public Participant bankcardExtInfo(BankcardExtInfo bankcardExtInfo) {
    
    this.bankcardExtInfo = bankcardExtInfo;
    return this;
  }

   /**
   * Get bankcardExtInfo
   * @return bankcardExtInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankcardExtInfo getBankcardExtInfo() {
    return bankcardExtInfo;
  }


  public void setBankcardExtInfo(BankcardExtInfo bankcardExtInfo) {
    this.bankcardExtInfo = bankcardExtInfo;
  }


  public Participant extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 描述参与方信息的扩展属性，使用前请与支付宝工程师确认
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "描述参与方信息的扩展属性，使用前请与支付宝工程师确认")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public Participant identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * 参与方的唯一标识
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "参与方的唯一标识")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public Participant identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * 参与方的标识类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式 3、ALIPAY_OPEN_ID：支付宝openid
   * @return identityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "参与方的标识类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式 3、ALIPAY_OPEN_ID：支付宝openid")

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public Participant merchantUserInfo(String merchantUserInfo) {
    
    this.merchantUserInfo = merchantUserInfo;
    return this;
  }

   /**
   * 商户端的用户信息描述，目前可指定如下属性：  merchant_user_id：商户端的用户唯一ID  merchant_user_name：商户端的用户名  merchant_user_nickname：商户端的用户昵称  merchant_user_mobile：商户端的手机号
   * @return merchantUserInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户端的用户信息描述，目前可指定如下属性：  merchant_user_id：商户端的用户唯一ID  merchant_user_name：商户端的用户名  merchant_user_nickname：商户端的用户昵称  merchant_user_mobile：商户端的手机号")

  public String getMerchantUserInfo() {
    return merchantUserInfo;
  }


  public void setMerchantUserInfo(String merchantUserInfo) {
    this.merchantUserInfo = merchantUserInfo;
  }


  public Participant name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 参与方真实姓名，如果非空，将校验收款支付宝账号姓名一致性。当identity_type&#x3D;ALIPAY_LOGON_ID时，本字段必填。
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "参与方真实姓名，如果非空，将校验收款支付宝账号姓名一致性。当identity_type=ALIPAY_LOGON_ID时，本字段必填。")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
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
   * @return the Participant instance itself
   */
  public Participant putAdditionalProperty(String key, Object value) {
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
    Participant participant = (Participant) o;
    return Objects.equals(this.bankcardExtInfo, participant.bankcardExtInfo) &&
        Objects.equals(this.extInfo, participant.extInfo) &&
        Objects.equals(this.identity, participant.identity) &&
        Objects.equals(this.identityType, participant.identityType) &&
        Objects.equals(this.merchantUserInfo, participant.merchantUserInfo) &&
        Objects.equals(this.name, participant.name)&&
        Objects.equals(this.additionalProperties, participant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankcardExtInfo, extInfo, identity, identityType, merchantUserInfo, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    sb.append("    bankcardExtInfo: ").append(toIndentedString(bankcardExtInfo)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    merchantUserInfo: ").append(toIndentedString(merchantUserInfo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("bankcard_ext_info");
    openapiFields.add("ext_info");
    openapiFields.add("identity");
    openapiFields.add("identity_type");
    openapiFields.add("merchant_user_info");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Participant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Participant.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Participant is not found in the empty JSON string", Participant.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `bankcard_ext_info`
      if (jsonObj.getAsJsonObject("bankcard_ext_info") != null) {
        BankcardExtInfo.validateJsonObject(jsonObj.getAsJsonObject("bankcard_ext_info"));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if (jsonObj.get("identity_type") != null && !jsonObj.get("identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_type").toString()));
      }
      if (jsonObj.get("merchant_user_info") != null && !jsonObj.get("merchant_user_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_user_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_user_info").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Participant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Participant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Participant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Participant.class));

       return (TypeAdapter<T>) new TypeAdapter<Participant>() {
           @Override
           public void write(JsonWriter out, Participant value) throws IOException {
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
           public Participant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Participant instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Participant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Participant
  * @throws IOException if the JSON string is invalid with respect to Participant
  */
  public static Participant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Participant.class);
  }

 /**
  * Convert an instance of Participant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

