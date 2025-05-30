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
 * AlipayMarketingCardActivateformQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardActivateformQueryResponseModel {
  public static final String SERIALIZED_NAME_INFOS = "infos";
  @SerializedName(SERIALIZED_NAME_INFOS)
  private String infos;

  public AlipayMarketingCardActivateformQueryResponseModel() { 
  }

  public AlipayMarketingCardActivateformQueryResponseModel infos(String infos) {
    
    this.infos = infos;
    return this;
  }

   /**
   * 表单提交信息各个字段的值JSON数组    通用表单字段名称如下示例：  OPEN_FORM_FIELD_MOBILE – 手机号  OPEN_FORM_FIELD_GENDER – 性别  OPEN_FORM_FIELD_NAME – 姓名  OPEN_FORM_FIELD_BIRTHDAY – 生日  OPEN_FORM_FIELD_IDCARD – 身份证  OPEN_FORM_FIELD_EMAIL – 邮箱  OPEN_FORM_FIELD_ADDRESS – 地址    详细字段名称列表见会员卡开卡表单模板配置接口：alipay.marketing.card.formtemplate.set    注：  1. 证件类型字段(OPEN_FORM_FIELD_CERT_TYPE)返回结果取值如下:      0 -- 身份证      1 -- 护照      2 -- 港澳居民通行证      3 -- 台湾居民通行证
   * @return infos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"OPEN_FORM_FIELD_GENDER\":\"男\"},{\"OPEN_FORM_FIELD_MOBILE\":\"13888888888\"},{\"OPEN_FORM_FIELD_NAME\":\"李四\"}]", value = "表单提交信息各个字段的值JSON数组    通用表单字段名称如下示例：  OPEN_FORM_FIELD_MOBILE – 手机号  OPEN_FORM_FIELD_GENDER – 性别  OPEN_FORM_FIELD_NAME – 姓名  OPEN_FORM_FIELD_BIRTHDAY – 生日  OPEN_FORM_FIELD_IDCARD – 身份证  OPEN_FORM_FIELD_EMAIL – 邮箱  OPEN_FORM_FIELD_ADDRESS – 地址    详细字段名称列表见会员卡开卡表单模板配置接口：alipay.marketing.card.formtemplate.set    注：  1. 证件类型字段(OPEN_FORM_FIELD_CERT_TYPE)返回结果取值如下:      0 -- 身份证      1 -- 护照      2 -- 港澳居民通行证      3 -- 台湾居民通行证")

  public String getInfos() {
    return infos;
  }


  public void setInfos(String infos) {
    this.infos = infos;
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
   * @return the AlipayMarketingCardActivateformQueryResponseModel instance itself
   */
  public AlipayMarketingCardActivateformQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingCardActivateformQueryResponseModel alipayMarketingCardActivateformQueryResponseModel = (AlipayMarketingCardActivateformQueryResponseModel) o;
    return Objects.equals(this.infos, alipayMarketingCardActivateformQueryResponseModel.infos)&&
        Objects.equals(this.additionalProperties, alipayMarketingCardActivateformQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infos, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardActivateformQueryResponseModel {\n");
    sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
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
    openapiFields.add("infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardActivateformQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardActivateformQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardActivateformQueryResponseModel is not found in the empty JSON string", AlipayMarketingCardActivateformQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("infos") != null && !jsonObj.get("infos").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `infos` to be a primitive type in the JSON string but got `%s`", jsonObj.get("infos").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardActivateformQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardActivateformQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardActivateformQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardActivateformQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardActivateformQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardActivateformQueryResponseModel value) throws IOException {
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
           public AlipayMarketingCardActivateformQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingCardActivateformQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingCardActivateformQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardActivateformQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardActivateformQueryResponseModel
  */
  public static AlipayMarketingCardActivateformQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardActivateformQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardActivateformQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

