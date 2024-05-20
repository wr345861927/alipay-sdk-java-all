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
 * ZhimaCreditPayafteruseCreditagreementQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPayafteruseCreditagreementQueryResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_STATUS = "agreement_status";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_STATUS)
  private String agreementStatus;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_BIZ_TIME = "biz_time";
  @SerializedName(SERIALIZED_NAME_BIZ_TIME)
  private String bizTime;

  public static final String SERIALIZED_NAME_CREDIT_AGREEMENT_ID = "credit_agreement_id";
  @SerializedName(SERIALIZED_NAME_CREDIT_AGREEMENT_ID)
  private String creditAgreementId;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_AGREEMENT_NO = "out_agreement_no";
  @SerializedName(SERIALIZED_NAME_OUT_AGREEMENT_NO)
  private String outAgreementNo;

  public ZhimaCreditPayafteruseCreditagreementQueryResponseModel() { 
  }

  public ZhimaCreditPayafteruseCreditagreementQueryResponseModel agreementStatus(String agreementStatus) {
    
    this.agreementStatus = agreementStatus;
    return this;
  }

   /**
   * 开通/授权状态，VALID: 有效，INVALID: 无效
   * @return agreementStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VALID", value = "开通/授权状态，VALID: 有效，INVALID: 无效")

  public String getAgreementStatus() {
    return agreementStatus;
  }


  public void setAgreementStatus(String agreementStatus) {
    this.agreementStatus = agreementStatus;
  }


  public ZhimaCreditPayafteruseCreditagreementQueryResponseModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 蚂蚁统一会员ID
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088091111111111", value = "蚂蚁统一会员ID")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public ZhimaCreditPayafteruseCreditagreementQueryResponseModel bizTime(String bizTime) {
    
    this.bizTime = bizTime;
    return this;
  }

   /**
   * 开通时间，agreement_status为VALID有效。
   * @return bizTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-09-15 11:23:04", value = "开通时间，agreement_status为VALID有效。")

  public String getBizTime() {
    return bizTime;
  }


  public void setBizTime(String bizTime) {
    this.bizTime = bizTime;
  }


  public ZhimaCreditPayafteruseCreditagreementQueryResponseModel creditAgreementId(String creditAgreementId) {
    
    this.creditAgreementId = creditAgreementId;
    return this;
  }

   /**
   * 芝麻开通/授权协议号
   * @return creditAgreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMOP99202011240100520025162811", value = "芝麻开通/授权协议号")

  public String getCreditAgreementId() {
    return creditAgreementId;
  }


  public void setCreditAgreementId(String creditAgreementId) {
    this.creditAgreementId = creditAgreementId;
  }


  public ZhimaCreditPayafteruseCreditagreementQueryResponseModel extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 该字段只在特殊业务场景下，根据业务方约定返回；一般业务场景下不需要消费该字段
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "该字段只在特殊业务场景下，根据业务方约定返回；一般业务场景下不需要消费该字段")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public ZhimaCreditPayafteruseCreditagreementQueryResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 开放ID
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "开放ID")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public ZhimaCreditPayafteruseCreditagreementQueryResponseModel outAgreementNo(String outAgreementNo) {
    
    this.outAgreementNo = outAgreementNo;
    return this;
  }

   /**
   * 商户外部协议号
   * @return outAgreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014070700166653", value = "商户外部协议号")

  public String getOutAgreementNo() {
    return outAgreementNo;
  }


  public void setOutAgreementNo(String outAgreementNo) {
    this.outAgreementNo = outAgreementNo;
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
   * @return the ZhimaCreditPayafteruseCreditagreementQueryResponseModel instance itself
   */
  public ZhimaCreditPayafteruseCreditagreementQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    ZhimaCreditPayafteruseCreditagreementQueryResponseModel zhimaCreditPayafteruseCreditagreementQueryResponseModel = (ZhimaCreditPayafteruseCreditagreementQueryResponseModel) o;
    return Objects.equals(this.agreementStatus, zhimaCreditPayafteruseCreditagreementQueryResponseModel.agreementStatus) &&
        Objects.equals(this.alipayUserId, zhimaCreditPayafteruseCreditagreementQueryResponseModel.alipayUserId) &&
        Objects.equals(this.bizTime, zhimaCreditPayafteruseCreditagreementQueryResponseModel.bizTime) &&
        Objects.equals(this.creditAgreementId, zhimaCreditPayafteruseCreditagreementQueryResponseModel.creditAgreementId) &&
        Objects.equals(this.extInfo, zhimaCreditPayafteruseCreditagreementQueryResponseModel.extInfo) &&
        Objects.equals(this.openId, zhimaCreditPayafteruseCreditagreementQueryResponseModel.openId) &&
        Objects.equals(this.outAgreementNo, zhimaCreditPayafteruseCreditagreementQueryResponseModel.outAgreementNo)&&
        Objects.equals(this.additionalProperties, zhimaCreditPayafteruseCreditagreementQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementStatus, alipayUserId, bizTime, creditAgreementId, extInfo, openId, outAgreementNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPayafteruseCreditagreementQueryResponseModel {\n");
    sb.append("    agreementStatus: ").append(toIndentedString(agreementStatus)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    bizTime: ").append(toIndentedString(bizTime)).append("\n");
    sb.append("    creditAgreementId: ").append(toIndentedString(creditAgreementId)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outAgreementNo: ").append(toIndentedString(outAgreementNo)).append("\n");
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
    openapiFields.add("agreement_status");
    openapiFields.add("alipay_user_id");
    openapiFields.add("biz_time");
    openapiFields.add("credit_agreement_id");
    openapiFields.add("ext_info");
    openapiFields.add("open_id");
    openapiFields.add("out_agreement_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPayafteruseCreditagreementQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPayafteruseCreditagreementQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPayafteruseCreditagreementQueryResponseModel is not found in the empty JSON string", ZhimaCreditPayafteruseCreditagreementQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agreement_status") != null && !jsonObj.get("agreement_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_status").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      if (jsonObj.get("biz_time") != null && !jsonObj.get("biz_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_time").toString()));
      }
      if (jsonObj.get("credit_agreement_id") != null && !jsonObj.get("credit_agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_agreement_id").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_agreement_no") != null && !jsonObj.get("out_agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_agreement_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPayafteruseCreditagreementQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPayafteruseCreditagreementQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPayafteruseCreditagreementQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPayafteruseCreditagreementQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPayafteruseCreditagreementQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPayafteruseCreditagreementQueryResponseModel value) throws IOException {
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
           public ZhimaCreditPayafteruseCreditagreementQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZhimaCreditPayafteruseCreditagreementQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZhimaCreditPayafteruseCreditagreementQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPayafteruseCreditagreementQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPayafteruseCreditagreementQueryResponseModel
  */
  public static ZhimaCreditPayafteruseCreditagreementQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPayafteruseCreditagreementQueryResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPayafteruseCreditagreementQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

