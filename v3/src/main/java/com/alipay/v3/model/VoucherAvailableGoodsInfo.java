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
 * VoucherAvailableGoodsInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherAvailableGoodsInfo {
  public static final String SERIALIZED_NAME_AVAILABLE_GOODS_SKU_IDS = "available_goods_sku_ids";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_GOODS_SKU_IDS)
  private List<String> availableGoodsSkuIds = null;

  public static final String SERIALIZED_NAME_EXCLUDE_GOODS_SKU_IDS = "exclude_goods_sku_ids";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_GOODS_SKU_IDS)
  private List<String> excludeGoodsSkuIds = null;

  public static final String SERIALIZED_NAME_GOODS_DESCRIPTION = "goods_description";
  @SerializedName(SERIALIZED_NAME_GOODS_DESCRIPTION)
  private String goodsDescription;

  public static final String SERIALIZED_NAME_GOODS_DETAIL = "goods_detail";
  @SerializedName(SERIALIZED_NAME_GOODS_DETAIL)
  private String goodsDetail;

  public static final String SERIALIZED_NAME_GOODS_DETAIL_IMAGES = "goods_detail_images";
  @SerializedName(SERIALIZED_NAME_GOODS_DETAIL_IMAGES)
  private List<String> goodsDetailImages = null;

  public static final String SERIALIZED_NAME_GOODS_DETAIL_RICH_DESCRIPTION = "goods_detail_rich_description";
  @SerializedName(SERIALIZED_NAME_GOODS_DETAIL_RICH_DESCRIPTION)
  private String goodsDetailRichDescription;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public static final String SERIALIZED_NAME_ORIGIN_AMOUNT = "origin_amount";
  @SerializedName(SERIALIZED_NAME_ORIGIN_AMOUNT)
  private String originAmount;

  public VoucherAvailableGoodsInfo() { 
  }

  public VoucherAvailableGoodsInfo availableGoodsSkuIds(List<String> availableGoodsSkuIds) {
    
    this.availableGoodsSkuIds = availableGoodsSkuIds;
    return this;
  }

  public VoucherAvailableGoodsInfo addAvailableGoodsSkuIdsItem(String availableGoodsSkuIdsItem) {
    if (this.availableGoodsSkuIds == null) {
      this.availableGoodsSkuIds = new ArrayList<>();
    }
    this.availableGoodsSkuIds.add(availableGoodsSkuIdsItem);
    return this;
  }

   /**
   * 可优惠商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，可以使用优惠券。
   * @return availableGoodsSkuIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "可优惠商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，可以使用优惠券。")

  public List<String> getAvailableGoodsSkuIds() {
    return availableGoodsSkuIds;
  }


  public void setAvailableGoodsSkuIds(List<String> availableGoodsSkuIds) {
    this.availableGoodsSkuIds = availableGoodsSkuIds;
  }


  public VoucherAvailableGoodsInfo excludeGoodsSkuIds(List<String> excludeGoodsSkuIds) {
    
    this.excludeGoodsSkuIds = excludeGoodsSkuIds;
    return this;
  }

  public VoucherAvailableGoodsInfo addExcludeGoodsSkuIdsItem(String excludeGoodsSkuIdsItem) {
    if (this.excludeGoodsSkuIds == null) {
      this.excludeGoodsSkuIds = new ArrayList<>();
    }
    this.excludeGoodsSkuIds.add(excludeGoodsSkuIdsItem);
    return this;
  }

   /**
   * 不可核销商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，不可以使用优惠券。
   * @return excludeGoodsSkuIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "不可核销商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，不可以使用优惠券。")

  public List<String> getExcludeGoodsSkuIds() {
    return excludeGoodsSkuIds;
  }


  public void setExcludeGoodsSkuIds(List<String> excludeGoodsSkuIds) {
    this.excludeGoodsSkuIds = excludeGoodsSkuIds;
  }


  public VoucherAvailableGoodsInfo goodsDescription(String goodsDescription) {
    
    this.goodsDescription = goodsDescription;
    return this;
  }

   /**
   * 商品描述信息。 用于券面展示，向用户介绍商品
   * @return goodsDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品描述信息。 用于券面展示，向用户介绍商品")

  public String getGoodsDescription() {
    return goodsDescription;
  }


  public void setGoodsDescription(String goodsDescription) {
    this.goodsDescription = goodsDescription;
  }


  public VoucherAvailableGoodsInfo goodsDetail(String goodsDetail) {
    
    this.goodsDetail = goodsDetail;
    return this;
  }

   /**
   * 商品详情，会展示在特定渠道(如服务市场团购业务插件的套餐明细)。
   * @return goodsDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品详情，会展示在特定渠道(如服务市场团购业务插件的套餐明细)。")

  public String getGoodsDetail() {
    return goodsDetail;
  }


  public void setGoodsDetail(String goodsDetail) {
    this.goodsDetail = goodsDetail;
  }


  public VoucherAvailableGoodsInfo goodsDetailImages(List<String> goodsDetailImages) {
    
    this.goodsDetailImages = goodsDetailImages;
    return this;
  }

  public VoucherAvailableGoodsInfo addGoodsDetailImagesItem(String goodsDetailImagesItem) {
    if (this.goodsDetailImages == null) {
      this.goodsDetailImages = new ArrayList<>();
    }
    this.goodsDetailImages.add(goodsDetailImagesItem);
    return this;
  }

   /**
   * 商品详情图片列表，会展示在特定渠道(如服务市场团购业务插件的头图)
   * @return goodsDetailImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品详情图片列表，会展示在特定渠道(如服务市场团购业务插件的头图)")

  public List<String> getGoodsDetailImages() {
    return goodsDetailImages;
  }


  public void setGoodsDetailImages(List<String> goodsDetailImages) {
    this.goodsDetailImages = goodsDetailImages;
  }


  public VoucherAvailableGoodsInfo goodsDetailRichDescription(String goodsDetailRichDescription) {
    
    this.goodsDetailRichDescription = goodsDetailRichDescription;
    return this;
  }

   /**
   * 商品详情富文本描述
   * @return goodsDetailRichDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品详情富文本描述")

  public String getGoodsDetailRichDescription() {
    return goodsDetailRichDescription;
  }


  public void setGoodsDetailRichDescription(String goodsDetailRichDescription) {
    this.goodsDetailRichDescription = goodsDetailRichDescription;
  }


  public VoucherAvailableGoodsInfo goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商品名称。
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品名称。")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public VoucherAvailableGoodsInfo originAmount(String originAmount) {
    
    this.originAmount = originAmount;
    return this;
  }

   /**
   * 原价。说明：该字段可不填，填入商品名称goods_name则必填;
   * @return originAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "原价。说明：该字段可不填，填入商品名称goods_name则必填;")

  public String getOriginAmount() {
    return originAmount;
  }


  public void setOriginAmount(String originAmount) {
    this.originAmount = originAmount;
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
   * @return the VoucherAvailableGoodsInfo instance itself
   */
  public VoucherAvailableGoodsInfo putAdditionalProperty(String key, Object value) {
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
    VoucherAvailableGoodsInfo voucherAvailableGoodsInfo = (VoucherAvailableGoodsInfo) o;
    return Objects.equals(this.availableGoodsSkuIds, voucherAvailableGoodsInfo.availableGoodsSkuIds) &&
        Objects.equals(this.excludeGoodsSkuIds, voucherAvailableGoodsInfo.excludeGoodsSkuIds) &&
        Objects.equals(this.goodsDescription, voucherAvailableGoodsInfo.goodsDescription) &&
        Objects.equals(this.goodsDetail, voucherAvailableGoodsInfo.goodsDetail) &&
        Objects.equals(this.goodsDetailImages, voucherAvailableGoodsInfo.goodsDetailImages) &&
        Objects.equals(this.goodsDetailRichDescription, voucherAvailableGoodsInfo.goodsDetailRichDescription) &&
        Objects.equals(this.goodsName, voucherAvailableGoodsInfo.goodsName) &&
        Objects.equals(this.originAmount, voucherAvailableGoodsInfo.originAmount)&&
        Objects.equals(this.additionalProperties, voucherAvailableGoodsInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableGoodsSkuIds, excludeGoodsSkuIds, goodsDescription, goodsDetail, goodsDetailImages, goodsDetailRichDescription, goodsName, originAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherAvailableGoodsInfo {\n");
    sb.append("    availableGoodsSkuIds: ").append(toIndentedString(availableGoodsSkuIds)).append("\n");
    sb.append("    excludeGoodsSkuIds: ").append(toIndentedString(excludeGoodsSkuIds)).append("\n");
    sb.append("    goodsDescription: ").append(toIndentedString(goodsDescription)).append("\n");
    sb.append("    goodsDetail: ").append(toIndentedString(goodsDetail)).append("\n");
    sb.append("    goodsDetailImages: ").append(toIndentedString(goodsDetailImages)).append("\n");
    sb.append("    goodsDetailRichDescription: ").append(toIndentedString(goodsDetailRichDescription)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
    sb.append("    originAmount: ").append(toIndentedString(originAmount)).append("\n");
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
    openapiFields.add("available_goods_sku_ids");
    openapiFields.add("exclude_goods_sku_ids");
    openapiFields.add("goods_description");
    openapiFields.add("goods_detail");
    openapiFields.add("goods_detail_images");
    openapiFields.add("goods_detail_rich_description");
    openapiFields.add("goods_name");
    openapiFields.add("origin_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherAvailableGoodsInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherAvailableGoodsInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherAvailableGoodsInfo is not found in the empty JSON string", VoucherAvailableGoodsInfo.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("available_goods_sku_ids") != null && !jsonObj.get("available_goods_sku_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_goods_sku_ids` to be an array in the JSON string but got `%s`", jsonObj.get("available_goods_sku_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("exclude_goods_sku_ids") != null && !jsonObj.get("exclude_goods_sku_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exclude_goods_sku_ids` to be an array in the JSON string but got `%s`", jsonObj.get("exclude_goods_sku_ids").toString()));
      }
      if (jsonObj.get("goods_description") != null && !jsonObj.get("goods_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_description").toString()));
      }
      if (jsonObj.get("goods_detail") != null && !jsonObj.get("goods_detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_detail").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("goods_detail_images") != null && !jsonObj.get("goods_detail_images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_detail_images` to be an array in the JSON string but got `%s`", jsonObj.get("goods_detail_images").toString()));
      }
      if (jsonObj.get("goods_detail_rich_description") != null && !jsonObj.get("goods_detail_rich_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_detail_rich_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_detail_rich_description").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
      if (jsonObj.get("origin_amount") != null && !jsonObj.get("origin_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherAvailableGoodsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherAvailableGoodsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherAvailableGoodsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherAvailableGoodsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherAvailableGoodsInfo>() {
           @Override
           public void write(JsonWriter out, VoucherAvailableGoodsInfo value) throws IOException {
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
           public VoucherAvailableGoodsInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherAvailableGoodsInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherAvailableGoodsInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherAvailableGoodsInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherAvailableGoodsInfo
  */
  public static VoucherAvailableGoodsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherAvailableGoodsInfo.class);
  }

 /**
  * Convert an instance of VoucherAvailableGoodsInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

