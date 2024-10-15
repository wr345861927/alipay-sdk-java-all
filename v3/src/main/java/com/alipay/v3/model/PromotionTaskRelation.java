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
 * PromotionTaskRelation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PromotionTaskRelation {
  public static final String SERIALIZED_NAME_APPLY_REASON = "apply_reason";
  @SerializedName(SERIALIZED_NAME_APPLY_REASON)
  private String applyReason;

  public static final String SERIALIZED_NAME_COMMODITY_ID = "commodity_id";
  @SerializedName(SERIALIZED_NAME_COMMODITY_ID)
  private String commodityId;

  public static final String SERIALIZED_NAME_COMMODITY_NAME = "commodity_name";
  @SerializedName(SERIALIZED_NAME_COMMODITY_NAME)
  private String commodityName;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_PROMOTER_CONTACT_NAME = "promoter_contact_name";
  @SerializedName(SERIALIZED_NAME_PROMOTER_CONTACT_NAME)
  private String promoterContactName;

  public static final String SERIALIZED_NAME_PROMOTER_CONTACT_PHONE = "promoter_contact_phone";
  @SerializedName(SERIALIZED_NAME_PROMOTER_CONTACT_PHONE)
  private String promoterContactPhone;

  public static final String SERIALIZED_NAME_PROMOTER_NAME = "promoter_name";
  @SerializedName(SERIALIZED_NAME_PROMOTER_NAME)
  private String promoterName;

  public static final String SERIALIZED_NAME_PROMOTER_PID = "promoter_pid";
  @SerializedName(SERIALIZED_NAME_PROMOTER_PID)
  private String promoterPid;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private String promotionId;

  public static final String SERIALIZED_NAME_PROMOTION_NAME = "promotion_name";
  @SerializedName(SERIALIZED_NAME_PROMOTION_NAME)
  private String promotionName;

  public PromotionTaskRelation() { 
  }

  public PromotionTaskRelation applyReason(String applyReason) {
    
    this.applyReason = applyReason;
    return this;
  }

   /**
   * 申请推广时填写的申请理由，自定义的内容
   * @return applyReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XXX", value = "申请推广时填写的申请理由，自定义的内容")

  public String getApplyReason() {
    return applyReason;
  }


  public void setApplyReason(String applyReason) {
    this.applyReason = applyReason;
  }


  public PromotionTaskRelation commodityId(String commodityId) {
    
    this.commodityId = commodityId;
    return this;
  }

   /**
   * 服务商品ID
   * @return commodityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SS010101000000003954", value = "服务商品ID")

  public String getCommodityId() {
    return commodityId;
  }


  public void setCommodityId(String commodityId) {
    this.commodityId = commodityId;
  }


  public PromotionTaskRelation commodityName(String commodityName) {
    
    this.commodityName = commodityName;
    return this;
  }

   /**
   * 服务商品名称
   * @return commodityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试服务", value = "服务商品名称")

  public String getCommodityName() {
    return commodityName;
  }


  public void setCommodityName(String commodityName) {
    this.commodityName = commodityName;
  }


  public PromotionTaskRelation createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 推广关系创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-12 12:10:10", value = "推广关系创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public PromotionTaskRelation promoterContactName(String promoterContactName) {
    
    this.promoterContactName = promoterContactName;
    return this;
  }

   /**
   * 推广服务商联系人名称
   * @return promoterContactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "推广服务商联系人名称")

  public String getPromoterContactName() {
    return promoterContactName;
  }


  public void setPromoterContactName(String promoterContactName) {
    this.promoterContactName = promoterContactName;
  }


  public PromotionTaskRelation promoterContactPhone(String promoterContactPhone) {
    
    this.promoterContactPhone = promoterContactPhone;
    return this;
  }

   /**
   * 推广服务商联系电话
   * @return promoterContactPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "136xxxxxxxx", value = "推广服务商联系电话")

  public String getPromoterContactPhone() {
    return promoterContactPhone;
  }


  public void setPromoterContactPhone(String promoterContactPhone) {
    this.promoterContactPhone = promoterContactPhone;
  }


  public PromotionTaskRelation promoterName(String promoterName) {
    
    this.promoterName = promoterName;
    return this;
  }

   /**
   * 推广服务商的名称
   * @return promoterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xx商户", value = "推广服务商的名称")

  public String getPromoterName() {
    return promoterName;
  }


  public void setPromoterName(String promoterName) {
    this.promoterName = promoterName;
  }


  public PromotionTaskRelation promoterPid(String promoterPid) {
    
    this.promoterPid = promoterPid;
    return this;
  }

   /**
   * 推广服务商的pid
   * @return promoterPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20883013xxxxxxxx", value = "推广服务商的pid")

  public String getPromoterPid() {
    return promoterPid;
  }


  public void setPromoterPid(String promoterPid) {
    this.promoterPid = promoterPid;
  }


  public PromotionTaskRelation promotionId(String promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 推广任务id
   * @return promotionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018052401048283", value = "推广任务id")

  public String getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }


  public PromotionTaskRelation promotionName(String promotionName) {
    
    this.promotionName = promotionName;
    return this;
  }

   /**
   * 推广任务的名称
   * @return promotionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试推广任务", value = "推广任务的名称")

  public String getPromotionName() {
    return promotionName;
  }


  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
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
   * @return the PromotionTaskRelation instance itself
   */
  public PromotionTaskRelation putAdditionalProperty(String key, Object value) {
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
    PromotionTaskRelation promotionTaskRelation = (PromotionTaskRelation) o;
    return Objects.equals(this.applyReason, promotionTaskRelation.applyReason) &&
        Objects.equals(this.commodityId, promotionTaskRelation.commodityId) &&
        Objects.equals(this.commodityName, promotionTaskRelation.commodityName) &&
        Objects.equals(this.createTime, promotionTaskRelation.createTime) &&
        Objects.equals(this.promoterContactName, promotionTaskRelation.promoterContactName) &&
        Objects.equals(this.promoterContactPhone, promotionTaskRelation.promoterContactPhone) &&
        Objects.equals(this.promoterName, promotionTaskRelation.promoterName) &&
        Objects.equals(this.promoterPid, promotionTaskRelation.promoterPid) &&
        Objects.equals(this.promotionId, promotionTaskRelation.promotionId) &&
        Objects.equals(this.promotionName, promotionTaskRelation.promotionName)&&
        Objects.equals(this.additionalProperties, promotionTaskRelation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyReason, commodityId, commodityName, createTime, promoterContactName, promoterContactPhone, promoterName, promoterPid, promotionId, promotionName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionTaskRelation {\n");
    sb.append("    applyReason: ").append(toIndentedString(applyReason)).append("\n");
    sb.append("    commodityId: ").append(toIndentedString(commodityId)).append("\n");
    sb.append("    commodityName: ").append(toIndentedString(commodityName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    promoterContactName: ").append(toIndentedString(promoterContactName)).append("\n");
    sb.append("    promoterContactPhone: ").append(toIndentedString(promoterContactPhone)).append("\n");
    sb.append("    promoterName: ").append(toIndentedString(promoterName)).append("\n");
    sb.append("    promoterPid: ").append(toIndentedString(promoterPid)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
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
    openapiFields.add("apply_reason");
    openapiFields.add("commodity_id");
    openapiFields.add("commodity_name");
    openapiFields.add("create_time");
    openapiFields.add("promoter_contact_name");
    openapiFields.add("promoter_contact_phone");
    openapiFields.add("promoter_name");
    openapiFields.add("promoter_pid");
    openapiFields.add("promotion_id");
    openapiFields.add("promotion_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PromotionTaskRelation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PromotionTaskRelation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromotionTaskRelation is not found in the empty JSON string", PromotionTaskRelation.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("apply_reason") != null && !jsonObj.get("apply_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_reason").toString()));
      }
      if (jsonObj.get("commodity_id") != null && !jsonObj.get("commodity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commodity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commodity_id").toString()));
      }
      if (jsonObj.get("commodity_name") != null && !jsonObj.get("commodity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commodity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commodity_name").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("promoter_contact_name") != null && !jsonObj.get("promoter_contact_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promoter_contact_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promoter_contact_name").toString()));
      }
      if (jsonObj.get("promoter_contact_phone") != null && !jsonObj.get("promoter_contact_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promoter_contact_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promoter_contact_phone").toString()));
      }
      if (jsonObj.get("promoter_name") != null && !jsonObj.get("promoter_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promoter_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promoter_name").toString()));
      }
      if (jsonObj.get("promoter_pid") != null && !jsonObj.get("promoter_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promoter_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promoter_pid").toString()));
      }
      if (jsonObj.get("promotion_id") != null && !jsonObj.get("promotion_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotion_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotion_id").toString()));
      }
      if (jsonObj.get("promotion_name") != null && !jsonObj.get("promotion_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotion_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotion_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionTaskRelation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionTaskRelation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionTaskRelation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionTaskRelation.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionTaskRelation>() {
           @Override
           public void write(JsonWriter out, PromotionTaskRelation value) throws IOException {
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
           public PromotionTaskRelation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PromotionTaskRelation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PromotionTaskRelation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionTaskRelation
  * @throws IOException if the JSON string is invalid with respect to PromotionTaskRelation
  */
  public static PromotionTaskRelation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionTaskRelation.class);
  }

 /**
  * Convert an instance of PromotionTaskRelation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

