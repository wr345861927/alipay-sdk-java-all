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
 * ZMGOBasicConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZMGOBasicConfig {
  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private String contact;

  public static final String SERIALIZED_NAME_ISV_PID = "isv_pid";
  @SerializedName(SERIALIZED_NAME_ISV_PID)
  private String isvPid;

  public static final String SERIALIZED_NAME_MERCHANT_CUSTOM_LOGO = "merchant_custom_logo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CUSTOM_LOGO)
  private String merchantCustomLogo;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "template_name";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_TEMPLATE_NO = "template_no";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NO)
  private String templateNo;

  public ZMGOBasicConfig() { 
  }

  public ZMGOBasicConfig bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 商户在芝麻GO配置的业务身份编码
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户在芝麻GO配置的业务身份编码")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public ZMGOBasicConfig contact(String contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * 商家客服电话
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家客服电话")

  public String getContact() {
    return contact;
  }


  public void setContact(String contact) {
    this.contact = contact;
  }


  public ZMGOBasicConfig isvPid(String isvPid) {
    
    this.isvPid = isvPid;
    return this;
  }

   /**
   * 运营商商户支付宝ID。若非ISV代理模式，也就是商户自运营模式，此属性取值与partner_id一致。
   * @return isvPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "运营商商户支付宝ID。若非ISV代理模式，也就是商户自运营模式，此属性取值与partner_id一致。")

  public String getIsvPid() {
    return isvPid;
  }


  public void setIsvPid(String isvPid) {
    this.isvPid = isvPid;
  }


  public ZMGOBasicConfig merchantCustomLogo(String merchantCustomLogo) {
    
    this.merchantCustomLogo = merchantCustomLogo;
    return this;
  }

   /**
   * 商户LOGO
   * @return merchantCustomLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户LOGO")

  public String getMerchantCustomLogo() {
    return merchantCustomLogo;
  }


  public void setMerchantCustomLogo(String merchantCustomLogo) {
    this.merchantCustomLogo = merchantCustomLogo;
  }


  public ZMGOBasicConfig outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务单号，供幂等使用，需保证每次请求的值都不同
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外部业务单号，供幂等使用，需保证每次请求的值都不同")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public ZMGOBasicConfig partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 商户的支付宝ID，即为此商户创建芝麻GO模板
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户的支付宝ID，即为此商户创建芝麻GO模板")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public ZMGOBasicConfig templateName(String templateName) {
    
    this.templateName = templateName;
    return this;
  }

   /**
   * 芝麻GO模板名称
   * @return templateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "芝麻GO模板名称")

  public String getTemplateName() {
    return templateName;
  }


  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public ZMGOBasicConfig templateNo(String templateNo) {
    
    this.templateNo = templateNo;
    return this;
  }

   /**
   * 模板编号
   * @return templateNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "模板编号")

  public String getTemplateNo() {
    return templateNo;
  }


  public void setTemplateNo(String templateNo) {
    this.templateNo = templateNo;
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
   * @return the ZMGOBasicConfig instance itself
   */
  public ZMGOBasicConfig putAdditionalProperty(String key, Object value) {
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
    ZMGOBasicConfig zmGOBasicConfig = (ZMGOBasicConfig) o;
    return Objects.equals(this.bizType, zmGOBasicConfig.bizType) &&
        Objects.equals(this.contact, zmGOBasicConfig.contact) &&
        Objects.equals(this.isvPid, zmGOBasicConfig.isvPid) &&
        Objects.equals(this.merchantCustomLogo, zmGOBasicConfig.merchantCustomLogo) &&
        Objects.equals(this.outBizNo, zmGOBasicConfig.outBizNo) &&
        Objects.equals(this.partnerId, zmGOBasicConfig.partnerId) &&
        Objects.equals(this.templateName, zmGOBasicConfig.templateName) &&
        Objects.equals(this.templateNo, zmGOBasicConfig.templateNo)&&
        Objects.equals(this.additionalProperties, zmGOBasicConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizType, contact, isvPid, merchantCustomLogo, outBizNo, partnerId, templateName, templateNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZMGOBasicConfig {\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    isvPid: ").append(toIndentedString(isvPid)).append("\n");
    sb.append("    merchantCustomLogo: ").append(toIndentedString(merchantCustomLogo)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    templateNo: ").append(toIndentedString(templateNo)).append("\n");
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
    openapiFields.add("biz_type");
    openapiFields.add("contact");
    openapiFields.add("isv_pid");
    openapiFields.add("merchant_custom_logo");
    openapiFields.add("out_biz_no");
    openapiFields.add("partner_id");
    openapiFields.add("template_name");
    openapiFields.add("template_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZMGOBasicConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZMGOBasicConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZMGOBasicConfig is not found in the empty JSON string", ZMGOBasicConfig.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      if (jsonObj.get("contact") != null && !jsonObj.get("contact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact").toString()));
      }
      if (jsonObj.get("isv_pid") != null && !jsonObj.get("isv_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_pid").toString()));
      }
      if (jsonObj.get("merchant_custom_logo") != null && !jsonObj.get("merchant_custom_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_custom_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_custom_logo").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("template_name") != null && !jsonObj.get("template_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_name").toString()));
      }
      if (jsonObj.get("template_no") != null && !jsonObj.get("template_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZMGOBasicConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZMGOBasicConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZMGOBasicConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZMGOBasicConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ZMGOBasicConfig>() {
           @Override
           public void write(JsonWriter out, ZMGOBasicConfig value) throws IOException {
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
           public ZMGOBasicConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZMGOBasicConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZMGOBasicConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZMGOBasicConfig
  * @throws IOException if the JSON string is invalid with respect to ZMGOBasicConfig
  */
  public static ZMGOBasicConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZMGOBasicConfig.class);
  }

 /**
  * Convert an instance of ZMGOBasicConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

