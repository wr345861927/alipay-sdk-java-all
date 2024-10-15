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
import com.alipay.v3.model.SearchOrderBrandDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * SearchOrderDetailDataBrandItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchOrderDetailDataBrandItems {
  public static final String SERIALIZED_NAME_BIZ_ID = "biz_id";
  @SerializedName(SERIALIZED_NAME_BIZ_ID)
  private String bizId;

  public static final String SERIALIZED_NAME_BOX_STATUS = "box_status";
  @SerializedName(SERIALIZED_NAME_BOX_STATUS)
  private String boxStatus;

  public static final String SERIALIZED_NAME_BRAND_BOX_KEYWORDS = "brand_box_keywords";
  @SerializedName(SERIALIZED_NAME_BRAND_BOX_KEYWORDS)
  private String brandBoxKeywords;

  public static final String SERIALIZED_NAME_BRAND_DETAIL_LIST = "brand_detail_list";
  @SerializedName(SERIALIZED_NAME_BRAND_DETAIL_LIST)
  private List<SearchOrderBrandDetail> brandDetailList = null;

  public static final String SERIALIZED_NAME_BRAND_TEMPLATE_ID = "brand_template_id";
  @SerializedName(SERIALIZED_NAME_BRAND_TEMPLATE_ID)
  private String brandTemplateId;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_MERCHANT_TYPE = "merchant_type";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TYPE)
  private String merchantType;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public SearchOrderDetailDataBrandItems() { 
  }

  public SearchOrderDetailDataBrandItems bizId(String bizId) {
    
    this.bizId = bizId;
    return this;
  }

   /**
   * 工单详情bizid
   * @return bizId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C100038430_2020081121000352488483_FUNCTION", value = "工单详情bizid")

  public String getBizId() {
    return bizId;
  }


  public void setBizId(String bizId) {
    this.bizId = bizId;
  }


  public SearchOrderDetailDataBrandItems boxStatus(String boxStatus) {
    
    this.boxStatus = boxStatus;
    return this;
  }

   /**
   * 上下架状态
   * @return boxStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ONLINE", value = "上下架状态")

  public String getBoxStatus() {
    return boxStatus;
  }


  public void setBoxStatus(String boxStatus) {
    this.boxStatus = boxStatus;
  }


  public SearchOrderDetailDataBrandItems brandBoxKeywords(String brandBoxKeywords) {
    
    this.brandBoxKeywords = brandBoxKeywords;
    return this;
  }

   /**
   * 关键词信息
   * @return brandBoxKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "烟草", value = "关键词信息")

  public String getBrandBoxKeywords() {
    return brandBoxKeywords;
  }


  public void setBrandBoxKeywords(String brandBoxKeywords) {
    this.brandBoxKeywords = brandBoxKeywords;
  }


  public SearchOrderDetailDataBrandItems brandDetailList(List<SearchOrderBrandDetail> brandDetailList) {
    
    this.brandDetailList = brandDetailList;
    return this;
  }

  public SearchOrderDetailDataBrandItems addBrandDetailListItem(SearchOrderBrandDetail brandDetailListItem) {
    if (this.brandDetailList == null) {
      this.brandDetailList = new ArrayList<>();
    }
    this.brandDetailList.add(brandDetailListItem);
    return this;
  }

   /**
   * 工单详情数据信息
   * @return brandDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "工单详情数据信息")

  public List<SearchOrderBrandDetail> getBrandDetailList() {
    return brandDetailList;
  }


  public void setBrandDetailList(List<SearchOrderBrandDetail> brandDetailList) {
    this.brandDetailList = brandDetailList;
  }


  public SearchOrderDetailDataBrandItems brandTemplateId(String brandTemplateId) {
    
    this.brandTemplateId = brandTemplateId;
    return this;
  }

   /**
   * 品牌展示模板类型
   * @return brandTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ONE_WITH_TWO", value = "品牌展示模板类型")

  public String getBrandTemplateId() {
    return brandTemplateId;
  }


  public void setBrandTemplateId(String brandTemplateId) {
    this.brandTemplateId = brandTemplateId;
  }


  public SearchOrderDetailDataBrandItems channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * 工单详情数据channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPENINSIGHT", value = "工单详情数据channel")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public SearchOrderDetailDataBrandItems merchantType(String merchantType) {
    
    this.merchantType = merchantType;
    return this;
  }

   /**
   * 工单详情数据merchant_type
   * @return merchantType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GENERAL", value = "工单详情数据merchant_type")

  public String getMerchantType() {
    return merchantType;
  }


  public void setMerchantType(String merchantType) {
    this.merchantType = merchantType;
  }


  public SearchOrderDetailDataBrandItems templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 模板id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WALLET-SEARCH@boxContent", value = "模板id")

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
   * @return the SearchOrderDetailDataBrandItems instance itself
   */
  public SearchOrderDetailDataBrandItems putAdditionalProperty(String key, Object value) {
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
    SearchOrderDetailDataBrandItems searchOrderDetailDataBrandItems = (SearchOrderDetailDataBrandItems) o;
    return Objects.equals(this.bizId, searchOrderDetailDataBrandItems.bizId) &&
        Objects.equals(this.boxStatus, searchOrderDetailDataBrandItems.boxStatus) &&
        Objects.equals(this.brandBoxKeywords, searchOrderDetailDataBrandItems.brandBoxKeywords) &&
        Objects.equals(this.brandDetailList, searchOrderDetailDataBrandItems.brandDetailList) &&
        Objects.equals(this.brandTemplateId, searchOrderDetailDataBrandItems.brandTemplateId) &&
        Objects.equals(this.channel, searchOrderDetailDataBrandItems.channel) &&
        Objects.equals(this.merchantType, searchOrderDetailDataBrandItems.merchantType) &&
        Objects.equals(this.templateId, searchOrderDetailDataBrandItems.templateId)&&
        Objects.equals(this.additionalProperties, searchOrderDetailDataBrandItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizId, boxStatus, brandBoxKeywords, brandDetailList, brandTemplateId, channel, merchantType, templateId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOrderDetailDataBrandItems {\n");
    sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
    sb.append("    boxStatus: ").append(toIndentedString(boxStatus)).append("\n");
    sb.append("    brandBoxKeywords: ").append(toIndentedString(brandBoxKeywords)).append("\n");
    sb.append("    brandDetailList: ").append(toIndentedString(brandDetailList)).append("\n");
    sb.append("    brandTemplateId: ").append(toIndentedString(brandTemplateId)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    merchantType: ").append(toIndentedString(merchantType)).append("\n");
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
    openapiFields.add("biz_id");
    openapiFields.add("box_status");
    openapiFields.add("brand_box_keywords");
    openapiFields.add("brand_detail_list");
    openapiFields.add("brand_template_id");
    openapiFields.add("channel");
    openapiFields.add("merchant_type");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchOrderDetailDataBrandItems
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchOrderDetailDataBrandItems.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchOrderDetailDataBrandItems is not found in the empty JSON string", SearchOrderDetailDataBrandItems.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_id") != null && !jsonObj.get("biz_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_id").toString()));
      }
      if (jsonObj.get("box_status") != null && !jsonObj.get("box_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_status").toString()));
      }
      if (jsonObj.get("brand_box_keywords") != null && !jsonObj.get("brand_box_keywords").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_box_keywords` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_box_keywords").toString()));
      }
      JsonArray jsonArraybrandDetailList = jsonObj.getAsJsonArray("brand_detail_list");
      if (jsonArraybrandDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("brand_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `brand_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("brand_detail_list").toString()));
        }

        // validate the optional field `brand_detail_list` (array)
        for (int i = 0; i < jsonArraybrandDetailList.size(); i++) {
          SearchOrderBrandDetail.validateJsonObject(jsonArraybrandDetailList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("brand_template_id") != null && !jsonObj.get("brand_template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_template_id").toString()));
      }
      if (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if (jsonObj.get("merchant_type") != null && !jsonObj.get("merchant_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_type").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchOrderDetailDataBrandItems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchOrderDetailDataBrandItems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchOrderDetailDataBrandItems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchOrderDetailDataBrandItems.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchOrderDetailDataBrandItems>() {
           @Override
           public void write(JsonWriter out, SearchOrderDetailDataBrandItems value) throws IOException {
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
           public SearchOrderDetailDataBrandItems read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchOrderDetailDataBrandItems instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SearchOrderDetailDataBrandItems given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchOrderDetailDataBrandItems
  * @throws IOException if the JSON string is invalid with respect to SearchOrderDetailDataBrandItems
  */
  public static SearchOrderDetailDataBrandItems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchOrderDetailDataBrandItems.class);
  }

 /**
  * Convert an instance of SearchOrderDetailDataBrandItems to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

