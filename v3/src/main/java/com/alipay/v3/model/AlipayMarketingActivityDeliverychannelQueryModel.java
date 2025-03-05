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
import com.alipay.v3.model.DeliveryAgencyMerchantInfo;
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
 * AlipayMarketingActivityDeliverychannelQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityDeliverychannelQueryModel {
  public static final String SERIALIZED_NAME_BELONG_MERCHANT_INFO = "belong_merchant_info";
  @SerializedName(SERIALIZED_NAME_BELONG_MERCHANT_INFO)
  private DeliveryAgencyMerchantInfo belongMerchantInfo;

  public static final String SERIALIZED_NAME_BOOTH_CODE = "booth_code";
  @SerializedName(SERIALIZED_NAME_BOOTH_CODE)
  private String boothCode;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public AlipayMarketingActivityDeliverychannelQueryModel() { 
  }

  public AlipayMarketingActivityDeliverychannelQueryModel belongMerchantInfo(DeliveryAgencyMerchantInfo belongMerchantInfo) {
    
    this.belongMerchantInfo = belongMerchantInfo;
    return this;
  }

   /**
   * Get belongMerchantInfo
   * @return belongMerchantInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryAgencyMerchantInfo getBelongMerchantInfo() {
    return belongMerchantInfo;
  }


  public void setBelongMerchantInfo(DeliveryAgencyMerchantInfo belongMerchantInfo) {
    this.belongMerchantInfo = belongMerchantInfo;
  }


  public AlipayMarketingActivityDeliverychannelQueryModel boothCode(String boothCode) {
    
    this.boothCode = boothCode;
    return this;
  }

   /**
   * 展位码。  boothCode含义：boothCode表达的是某个渠道可以投放的展位码。例如：支付结果页PAY_RESULT  枚举值： PAY_RESULT：支付结果页。  后续新增可投放的展位后，会在文档中新增描述信息
   * @return boothCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAY_RESULT", value = "展位码。  boothCode含义：boothCode表达的是某个渠道可以投放的展位码。例如：支付结果页PAY_RESULT  枚举值： PAY_RESULT：支付结果页。  后续新增可投放的展位后，会在文档中新增描述信息")

  public String getBoothCode() {
    return boothCode;
  }


  public void setBoothCode(String boothCode) {
    this.boothCode = boothCode;
  }


  public AlipayMarketingActivityDeliverychannelQueryModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 查询的页码。  特别说明： 页码从1开始。
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "查询的页码。  特别说明： 页码从1开始。")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayMarketingActivityDeliverychannelQueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页查询的个数，最大值为 100。
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "每页查询的个数，最大值为 100。")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
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
   * @return the AlipayMarketingActivityDeliverychannelQueryModel instance itself
   */
  public AlipayMarketingActivityDeliverychannelQueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingActivityDeliverychannelQueryModel alipayMarketingActivityDeliverychannelQueryModel = (AlipayMarketingActivityDeliverychannelQueryModel) o;
    return Objects.equals(this.belongMerchantInfo, alipayMarketingActivityDeliverychannelQueryModel.belongMerchantInfo) &&
        Objects.equals(this.boothCode, alipayMarketingActivityDeliverychannelQueryModel.boothCode) &&
        Objects.equals(this.pageNum, alipayMarketingActivityDeliverychannelQueryModel.pageNum) &&
        Objects.equals(this.pageSize, alipayMarketingActivityDeliverychannelQueryModel.pageSize)&&
        Objects.equals(this.additionalProperties, alipayMarketingActivityDeliverychannelQueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(belongMerchantInfo, boothCode, pageNum, pageSize, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityDeliverychannelQueryModel {\n");
    sb.append("    belongMerchantInfo: ").append(toIndentedString(belongMerchantInfo)).append("\n");
    sb.append("    boothCode: ").append(toIndentedString(boothCode)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("belong_merchant_info");
    openapiFields.add("booth_code");
    openapiFields.add("page_num");
    openapiFields.add("page_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityDeliverychannelQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityDeliverychannelQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityDeliverychannelQueryModel is not found in the empty JSON string", AlipayMarketingActivityDeliverychannelQueryModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `belong_merchant_info`
      if (jsonObj.getAsJsonObject("belong_merchant_info") != null) {
        DeliveryAgencyMerchantInfo.validateJsonObject(jsonObj.getAsJsonObject("belong_merchant_info"));
      }
      if (jsonObj.get("booth_code") != null && !jsonObj.get("booth_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `booth_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("booth_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityDeliverychannelQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityDeliverychannelQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityDeliverychannelQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityDeliverychannelQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityDeliverychannelQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityDeliverychannelQueryModel value) throws IOException {
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
           public AlipayMarketingActivityDeliverychannelQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingActivityDeliverychannelQueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingActivityDeliverychannelQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityDeliverychannelQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityDeliverychannelQueryModel
  */
  public static AlipayMarketingActivityDeliverychannelQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityDeliverychannelQueryModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityDeliverychannelQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

