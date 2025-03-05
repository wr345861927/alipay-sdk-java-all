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
 * SubscribeRelation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscribeRelation {
  public static final String SERIALIZED_NAME_KEEP_STATE = "keep_state";
  @SerializedName(SERIALIZED_NAME_KEEP_STATE)
  private String keepState;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private Boolean show;

  public static final String SERIALIZED_NAME_SUBSCRIBE_STATE = "subscribe_state";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_STATE)
  private String subscribeState;

  public static final String SERIALIZED_NAME_SUBSCRIBE_TYPE = "subscribe_type";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_TYPE)
  private String subscribeType;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public SubscribeRelation() { 
  }

  public SubscribeRelation keepState(String keepState) {
    
    this.keepState = keepState;
    return this;
  }

   /**
   * 订阅保持状态，即用户勾选“总是保持以上选择，不再询问”选项时勾选的订阅状态。说明：若用户“总是保持以上选择，不再询问”选项，且选择订阅消息。下次触发消息订阅组件时，支付宝将自动发起一次静默订阅（不再拉起订阅组件，无需用户手动订阅）。
   * @return keepState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "订阅保持状态，即用户勾选“总是保持以上选择，不再询问”选项时勾选的订阅状态。说明：若用户“总是保持以上选择，不再询问”选项，且选择订阅消息。下次触发消息订阅组件时，支付宝将自动发起一次静默订阅（不再拉起订阅组件，无需用户手动订阅）。")

  public String getKeepState() {
    return keepState;
  }


  public void setKeepState(String keepState) {
    this.keepState = keepState;
  }


  public SubscribeRelation show(Boolean show) {
    
    this.show = show;
    return this;
  }

   /**
   * 模板是否展示在订阅组件中
   * @return show
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "模板是否展示在订阅组件中")

  public Boolean getShow() {
    return show;
  }


  public void setShow(Boolean show) {
    this.show = show;
  }


  public SubscribeRelation subscribeState(String subscribeState) {
    
    this.subscribeState = subscribeState;
    return this;
  }

   /**
   * 订阅状态
   * @return subscribeState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "订阅状态")

  public String getSubscribeState() {
    return subscribeState;
  }


  public void setSubscribeState(String subscribeState) {
    this.subscribeState = subscribeState;
  }


  public SubscribeRelation subscribeType(String subscribeType) {
    
    this.subscribeType = subscribeType;
    return this;
  }

   /**
   * 消息模板的订阅类型
   * @return subscribeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "longterm", value = "消息模板的订阅类型")

  public String getSubscribeType() {
    return subscribeType;
  }


  public void setSubscribeType(String subscribeType) {
    this.subscribeType = subscribeType;
  }


  public SubscribeRelation templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 消息模板id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7c866fab64464afaa956223c74ce6cbc", value = "消息模板id")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
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
   * @return the SubscribeRelation instance itself
   */
  public SubscribeRelation putAdditionalProperty(String key, Object value) {
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
    SubscribeRelation subscribeRelation = (SubscribeRelation) o;
    return Objects.equals(this.keepState, subscribeRelation.keepState) &&
        Objects.equals(this.show, subscribeRelation.show) &&
        Objects.equals(this.subscribeState, subscribeRelation.subscribeState) &&
        Objects.equals(this.subscribeType, subscribeRelation.subscribeType) &&
        Objects.equals(this.templateId, subscribeRelation.templateId)&&
        Objects.equals(this.additionalProperties, subscribeRelation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keepState, show, subscribeState, subscribeType, templateId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribeRelation {\n");
    sb.append("    keepState: ").append(toIndentedString(keepState)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    subscribeState: ").append(toIndentedString(subscribeState)).append("\n");
    sb.append("    subscribeType: ").append(toIndentedString(subscribeType)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("keep_state");
    openapiFields.add("show");
    openapiFields.add("subscribe_state");
    openapiFields.add("subscribe_type");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscribeRelation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscribeRelation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscribeRelation is not found in the empty JSON string", SubscribeRelation.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("keep_state") != null && !jsonObj.get("keep_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keep_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keep_state").toString()));
      }
      if (jsonObj.get("subscribe_state") != null && !jsonObj.get("subscribe_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscribe_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscribe_state").toString()));
      }
      if (jsonObj.get("subscribe_type") != null && !jsonObj.get("subscribe_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscribe_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscribe_type").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscribeRelation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscribeRelation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscribeRelation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscribeRelation.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscribeRelation>() {
           @Override
           public void write(JsonWriter out, SubscribeRelation value) throws IOException {
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
           public SubscribeRelation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SubscribeRelation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SubscribeRelation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscribeRelation
  * @throws IOException if the JSON string is invalid with respect to SubscribeRelation
  */
  public static SubscribeRelation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscribeRelation.class);
  }

 /**
  * Convert an instance of SubscribeRelation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

