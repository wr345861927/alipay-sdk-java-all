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
import com.alipay.v3.model.SignAddressInfo;
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
 * AlipayOpenAgentOfflinepaymentSignModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAgentOfflinepaymentSignModel {
  public static final String SERIALIZED_NAME_BATCH_NO = "batch_no";
  @SerializedName(SERIALIZED_NAME_BATCH_NO)
  private String batchNo;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_MOBILE = "business_license_mobile";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_MOBILE)
  private String businessLicenseMobile;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_NO = "business_license_no";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_NO)
  private String businessLicenseNo;

  public static final String SERIALIZED_NAME_DATE_LIMITATION = "date_limitation";
  @SerializedName(SERIALIZED_NAME_DATE_LIMITATION)
  private String dateLimitation;

  public static final String SERIALIZED_NAME_DELIVERY_ADDRESS = "delivery_address";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ADDRESS)
  private SignAddressInfo deliveryAddress;

  public static final String SERIALIZED_NAME_LONG_TERM = "long_term";
  @SerializedName(SERIALIZED_NAME_LONG_TERM)
  private Boolean longTerm;

  public static final String SERIALIZED_NAME_MCC_CODE = "mcc_code";
  @SerializedName(SERIALIZED_NAME_MCC_CODE)
  private String mccCode;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_SHOP_ADDRESS = "shop_address";
  @SerializedName(SERIALIZED_NAME_SHOP_ADDRESS)
  private SignAddressInfo shopAddress;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName;

  public AlipayOpenAgentOfflinepaymentSignModel() { 
  }

  public AlipayOpenAgentOfflinepaymentSignModel batchNo(String batchNo) {
    
    this.batchNo = batchNo;
    return this;
  }

   /**
   * 代商户操作事务编号，通过alipay.open.agent.create接口进行创建。
   * @return batchNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017110616474516400082883", value = "代商户操作事务编号，通过alipay.open.agent.create接口进行创建。")

  public String getBatchNo() {
    return batchNo;
  }


  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }


  public AlipayOpenAgentOfflinepaymentSignModel businessLicenseMobile(String businessLicenseMobile) {
    
    this.businessLicenseMobile = businessLicenseMobile;
    return this;
  }

   /**
   * 被邀请授权的营业执照法人手机号码，上传非同人营业执照时必填
   * @return businessLicenseMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13189652239", value = "被邀请授权的营业执照法人手机号码，上传非同人营业执照时必填")

  public String getBusinessLicenseMobile() {
    return businessLicenseMobile;
  }


  public void setBusinessLicenseMobile(String businessLicenseMobile) {
    this.businessLicenseMobile = businessLicenseMobile;
  }


  public AlipayOpenAgentOfflinepaymentSignModel businessLicenseNo(String businessLicenseNo) {
    
    this.businessLicenseNo = businessLicenseNo;
    return this;
  }

   /**
   * 营业执照号码。若填写，请与以下营业执照图片、期限、一起提供。
   * @return businessLicenseNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1532501100006302", value = "营业执照号码。若填写，请与以下营业执照图片、期限、一起提供。")

  public String getBusinessLicenseNo() {
    return businessLicenseNo;
  }


  public void setBusinessLicenseNo(String businessLicenseNo) {
    this.businessLicenseNo = businessLicenseNo;
  }


  public AlipayOpenAgentOfflinepaymentSignModel dateLimitation(String dateLimitation) {
    
    this.dateLimitation = dateLimitation;
    return this;
  }

   /**
   * 营业期限
   * @return dateLimitation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-11", value = "营业期限")

  public String getDateLimitation() {
    return dateLimitation;
  }


  public void setDateLimitation(String dateLimitation) {
    this.dateLimitation = dateLimitation;
  }


  public AlipayOpenAgentOfflinepaymentSignModel deliveryAddress(SignAddressInfo deliveryAddress) {
    
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignAddressInfo getDeliveryAddress() {
    return deliveryAddress;
  }


  public void setDeliveryAddress(SignAddressInfo deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }


  public AlipayOpenAgentOfflinepaymentSignModel longTerm(Boolean longTerm) {
    
    this.longTerm = longTerm;
    return this;
  }

   /**
   * 营业期限是否长期有效
   * @return longTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "营业期限是否长期有效")

  public Boolean getLongTerm() {
    return longTerm;
  }


  public void setLongTerm(Boolean longTerm) {
    this.longTerm = longTerm;
  }


  public AlipayOpenAgentOfflinepaymentSignModel mccCode(String mccCode) {
    
    this.mccCode = mccCode;
    return this;
  }

   /**
   * 所属MCCCode，可参考 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE\&quot;&gt;商家经营类目&lt;/a&gt; 中的“经营类目编码”
   * @return mccCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A_A03_4582", value = "所属MCCCode，可参考 <a href=\"https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE\">商家经营类目</a> 中的“经营类目编码”")

  public String getMccCode() {
    return mccCode;
  }


  public void setMccCode(String mccCode) {
    this.mccCode = mccCode;
  }


  public AlipayOpenAgentOfflinepaymentSignModel rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * 服务费率（%），0.38~3之间，精确到0.01
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.38", value = "服务费率（%），0.38~3之间，精确到0.01")

  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    this.rate = rate;
  }


  public AlipayOpenAgentOfflinepaymentSignModel shopAddress(SignAddressInfo shopAddress) {
    
    this.shopAddress = shopAddress;
    return this;
  }

   /**
   * Get shopAddress
   * @return shopAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignAddressInfo getShopAddress() {
    return shopAddress;
  }


  public void setShopAddress(SignAddressInfo shopAddress) {
    this.shopAddress = shopAddress;
  }


  public AlipayOpenAgentOfflinepaymentSignModel shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 店铺名称
   * @return shopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-", value = "店铺名称")

  public String getShopName() {
    return shopName;
  }


  public void setShopName(String shopName) {
    this.shopName = shopName;
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
   * @return the AlipayOpenAgentOfflinepaymentSignModel instance itself
   */
  public AlipayOpenAgentOfflinepaymentSignModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenAgentOfflinepaymentSignModel alipayOpenAgentOfflinepaymentSignModel = (AlipayOpenAgentOfflinepaymentSignModel) o;
    return Objects.equals(this.batchNo, alipayOpenAgentOfflinepaymentSignModel.batchNo) &&
        Objects.equals(this.businessLicenseMobile, alipayOpenAgentOfflinepaymentSignModel.businessLicenseMobile) &&
        Objects.equals(this.businessLicenseNo, alipayOpenAgentOfflinepaymentSignModel.businessLicenseNo) &&
        Objects.equals(this.dateLimitation, alipayOpenAgentOfflinepaymentSignModel.dateLimitation) &&
        Objects.equals(this.deliveryAddress, alipayOpenAgentOfflinepaymentSignModel.deliveryAddress) &&
        Objects.equals(this.longTerm, alipayOpenAgentOfflinepaymentSignModel.longTerm) &&
        Objects.equals(this.mccCode, alipayOpenAgentOfflinepaymentSignModel.mccCode) &&
        Objects.equals(this.rate, alipayOpenAgentOfflinepaymentSignModel.rate) &&
        Objects.equals(this.shopAddress, alipayOpenAgentOfflinepaymentSignModel.shopAddress) &&
        Objects.equals(this.shopName, alipayOpenAgentOfflinepaymentSignModel.shopName)&&
        Objects.equals(this.additionalProperties, alipayOpenAgentOfflinepaymentSignModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchNo, businessLicenseMobile, businessLicenseNo, dateLimitation, deliveryAddress, longTerm, mccCode, rate, shopAddress, shopName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAgentOfflinepaymentSignModel {\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    businessLicenseMobile: ").append(toIndentedString(businessLicenseMobile)).append("\n");
    sb.append("    businessLicenseNo: ").append(toIndentedString(businessLicenseNo)).append("\n");
    sb.append("    dateLimitation: ").append(toIndentedString(dateLimitation)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    longTerm: ").append(toIndentedString(longTerm)).append("\n");
    sb.append("    mccCode: ").append(toIndentedString(mccCode)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    shopAddress: ").append(toIndentedString(shopAddress)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
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
    openapiFields.add("batch_no");
    openapiFields.add("business_license_mobile");
    openapiFields.add("business_license_no");
    openapiFields.add("date_limitation");
    openapiFields.add("delivery_address");
    openapiFields.add("long_term");
    openapiFields.add("mcc_code");
    openapiFields.add("rate");
    openapiFields.add("shop_address");
    openapiFields.add("shop_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAgentOfflinepaymentSignModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAgentOfflinepaymentSignModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAgentOfflinepaymentSignModel is not found in the empty JSON string", AlipayOpenAgentOfflinepaymentSignModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("batch_no") != null && !jsonObj.get("batch_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_no").toString()));
      }
      if (jsonObj.get("business_license_mobile") != null && !jsonObj.get("business_license_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_license_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_license_mobile").toString()));
      }
      if (jsonObj.get("business_license_no") != null && !jsonObj.get("business_license_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_license_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_license_no").toString()));
      }
      if (jsonObj.get("date_limitation") != null && !jsonObj.get("date_limitation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_limitation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_limitation").toString()));
      }
      // validate the optional field `delivery_address`
      if (jsonObj.getAsJsonObject("delivery_address") != null) {
        SignAddressInfo.validateJsonObject(jsonObj.getAsJsonObject("delivery_address"));
      }
      if (jsonObj.get("mcc_code") != null && !jsonObj.get("mcc_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_code").toString()));
      }
      if (jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate").toString()));
      }
      // validate the optional field `shop_address`
      if (jsonObj.getAsJsonObject("shop_address") != null) {
        SignAddressInfo.validateJsonObject(jsonObj.getAsJsonObject("shop_address"));
      }
      if (jsonObj.get("shop_name") != null && !jsonObj.get("shop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAgentOfflinepaymentSignModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAgentOfflinepaymentSignModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAgentOfflinepaymentSignModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAgentOfflinepaymentSignModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAgentOfflinepaymentSignModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAgentOfflinepaymentSignModel value) throws IOException {
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
           public AlipayOpenAgentOfflinepaymentSignModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenAgentOfflinepaymentSignModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenAgentOfflinepaymentSignModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAgentOfflinepaymentSignModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAgentOfflinepaymentSignModel
  */
  public static AlipayOpenAgentOfflinepaymentSignModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAgentOfflinepaymentSignModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAgentOfflinepaymentSignModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

