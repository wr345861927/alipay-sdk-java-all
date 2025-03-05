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
import com.alipay.v3.model.ContactModel;
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
 * AlipayOpenAgentCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAgentCreateModel {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_CONTACT_INFO = "contact_info";
  @SerializedName(SERIALIZED_NAME_CONTACT_INFO)
  private ContactModel contactInfo;

  public static final String SERIALIZED_NAME_ORDER_TICKET = "order_ticket";
  @SerializedName(SERIALIZED_NAME_ORDER_TICKET)
  private String orderTicket;

  public static final String SERIALIZED_NAME_SIGN_MODE = "sign_mode";
  @SerializedName(SERIALIZED_NAME_SIGN_MODE)
  private String signMode;

  public AlipayOpenAgentCreateModel() { 
  }

  public AlipayOpenAgentCreateModel account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * isv代操作的商户账号，可以是支付宝账号，也可以是pid（2088开头）
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test@alipay.com", value = "isv代操作的商户账号，可以是支付宝账号，也可以是pid（2088开头）")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public AlipayOpenAgentCreateModel contactInfo(ContactModel contactInfo) {
    
    this.contactInfo = contactInfo;
    return this;
  }

   /**
   * Get contactInfo
   * @return contactInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactModel getContactInfo() {
    return contactInfo;
  }


  public void setContactInfo(ContactModel contactInfo) {
    this.contactInfo = contactInfo;
  }


  public AlipayOpenAgentCreateModel orderTicket(String orderTicket) {
    
    this.orderTicket = orderTicket;
    return this;
  }

   /**
   * 订单授权凭证。若传入本参数，则对应事务提交后进入预授权模式。
   * @return orderTicket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00ee2d475f374ad097ee0f1ac223fX00", value = "订单授权凭证。若传入本参数，则对应事务提交后进入预授权模式。")

  public String getOrderTicket() {
    return orderTicket;
  }


  public void setOrderTicket(String orderTicket) {
    this.orderTicket = orderTicket;
  }


  public AlipayOpenAgentCreateModel signMode(String signMode) {
    
    this.signMode = signMode;
    return this;
  }

   /**
   * 签约模式：目前只支持批量签约并不通知商户确认 使用场景：批量签约并授权场景，先调用签约接口进行签约，然后调用授权接口授权，在批量模式下，一次性签约多个产品，要么都成功要么都失败，同时在授权接口传入orderNo，会一起发送签约确认和授权确认，商户只需要确认一次；如果不是批量签约并授权场景，不要传此参数，否则商户无法收到确认签约通知；
   * @return signMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BATCH_SIGN_NOT_NOTIFY", value = "签约模式：目前只支持批量签约并不通知商户确认 使用场景：批量签约并授权场景，先调用签约接口进行签约，然后调用授权接口授权，在批量模式下，一次性签约多个产品，要么都成功要么都失败，同时在授权接口传入orderNo，会一起发送签约确认和授权确认，商户只需要确认一次；如果不是批量签约并授权场景，不要传此参数，否则商户无法收到确认签约通知；")

  public String getSignMode() {
    return signMode;
  }


  public void setSignMode(String signMode) {
    this.signMode = signMode;
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
   * @return the AlipayOpenAgentCreateModel instance itself
   */
  public AlipayOpenAgentCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenAgentCreateModel alipayOpenAgentCreateModel = (AlipayOpenAgentCreateModel) o;
    return Objects.equals(this.account, alipayOpenAgentCreateModel.account) &&
        Objects.equals(this.contactInfo, alipayOpenAgentCreateModel.contactInfo) &&
        Objects.equals(this.orderTicket, alipayOpenAgentCreateModel.orderTicket) &&
        Objects.equals(this.signMode, alipayOpenAgentCreateModel.signMode)&&
        Objects.equals(this.additionalProperties, alipayOpenAgentCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, contactInfo, orderTicket, signMode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAgentCreateModel {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    orderTicket: ").append(toIndentedString(orderTicket)).append("\n");
    sb.append("    signMode: ").append(toIndentedString(signMode)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("contact_info");
    openapiFields.add("order_ticket");
    openapiFields.add("sign_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAgentCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAgentCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAgentCreateModel is not found in the empty JSON string", AlipayOpenAgentCreateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account").toString()));
      }
      // validate the optional field `contact_info`
      if (jsonObj.getAsJsonObject("contact_info") != null) {
        ContactModel.validateJsonObject(jsonObj.getAsJsonObject("contact_info"));
      }
      if (jsonObj.get("order_ticket") != null && !jsonObj.get("order_ticket").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_ticket` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_ticket").toString()));
      }
      if (jsonObj.get("sign_mode") != null && !jsonObj.get("sign_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAgentCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAgentCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAgentCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAgentCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAgentCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAgentCreateModel value) throws IOException {
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
           public AlipayOpenAgentCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenAgentCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenAgentCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAgentCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAgentCreateModel
  */
  public static AlipayOpenAgentCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAgentCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAgentCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

