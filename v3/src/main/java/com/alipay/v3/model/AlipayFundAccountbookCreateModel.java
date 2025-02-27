/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
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
 * AlipayFundAccountbookCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAccountbookCreateModel {
  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_MERCHANT_USER_ID = "merchant_user_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_USER_ID)
  private String merchantUserId;

  public static final String SERIALIZED_NAME_MERCHANT_USER_TYPE = "merchant_user_type";
  @SerializedName(SERIALIZED_NAME_MERCHANT_USER_TYPE)
  private String merchantUserType;

  public static final String SERIALIZED_NAME_SCENE_CODE = "scene_code";
  @SerializedName(SERIALIZED_NAME_SCENE_CODE)
  private String sceneCode;

  public AlipayFundAccountbookCreateModel() { 
  }

  public AlipayFundAccountbookCreateModel extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * JSON格式，传递业务扩展参数
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"agreement_no\":\"2019000000000\",\"cert_no\":\"61102619921108888\"}", value = "JSON格式，传递业务扩展参数")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public AlipayFundAccountbookCreateModel merchantUserId(String merchantUserId) {
    
    this.merchantUserId = merchantUserId;
    return this;
  }

   /**
   * 外部商户系统会员的唯一标识，自定义传入
   * @return merchantUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000001", value = "外部商户系统会员的唯一标识，自定义传入")

  public String getMerchantUserId() {
    return merchantUserId;
  }


  public void setMerchantUserId(String merchantUserId) {
    this.merchantUserId = merchantUserId;
  }


  public AlipayFundAccountbookCreateModel merchantUserType(String merchantUserType) {
    
    this.merchantUserType = merchantUserType;
    return this;
  }

   /**
   * 外部商户用户类型:BUSINESS_EMPLOYEE
   * @return merchantUserType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BUSINESS_ORGANIZATION", value = "外部商户用户类型:BUSINESS_EMPLOYEE")

  public String getMerchantUserType() {
    return merchantUserType;
  }


  public void setMerchantUserType(String merchantUserType) {
    this.merchantUserType = merchantUserType;
  }


  public AlipayFundAccountbookCreateModel sceneCode(String sceneCode) {
    
    this.sceneCode = sceneCode;
    return this;
  }

   /**
   * 资金记账本的业务场景
   * @return sceneCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SATF_FUND_BOOK", value = "资金记账本的业务场景")

  public String getSceneCode() {
    return sceneCode;
  }


  public void setSceneCode(String sceneCode) {
    this.sceneCode = sceneCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundAccountbookCreateModel alipayFundAccountbookCreateModel = (AlipayFundAccountbookCreateModel) o;
    return Objects.equals(this.extInfo, alipayFundAccountbookCreateModel.extInfo) &&
        Objects.equals(this.merchantUserId, alipayFundAccountbookCreateModel.merchantUserId) &&
        Objects.equals(this.merchantUserType, alipayFundAccountbookCreateModel.merchantUserType) &&
        Objects.equals(this.sceneCode, alipayFundAccountbookCreateModel.sceneCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extInfo, merchantUserId, merchantUserType, sceneCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAccountbookCreateModel {\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    merchantUserId: ").append(toIndentedString(merchantUserId)).append("\n");
    sb.append("    merchantUserType: ").append(toIndentedString(merchantUserType)).append("\n");
    sb.append("    sceneCode: ").append(toIndentedString(sceneCode)).append("\n");
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
    openapiFields.add("ext_info");
    openapiFields.add("merchant_user_id");
    openapiFields.add("merchant_user_type");
    openapiFields.add("scene_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAccountbookCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAccountbookCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAccountbookCreateModel is not found in the empty JSON string", AlipayFundAccountbookCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundAccountbookCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundAccountbookCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("merchant_user_id") != null && !jsonObj.get("merchant_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_user_id").toString()));
      }
      if (jsonObj.get("merchant_user_type") != null && !jsonObj.get("merchant_user_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_user_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_user_type").toString()));
      }
      if (jsonObj.get("scene_code") != null && !jsonObj.get("scene_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAccountbookCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAccountbookCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAccountbookCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAccountbookCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAccountbookCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAccountbookCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundAccountbookCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundAccountbookCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAccountbookCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAccountbookCreateModel
  */
  public static AlipayFundAccountbookCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAccountbookCreateModel.class);
  }

 /**
  * Convert an instance of AlipayFundAccountbookCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

