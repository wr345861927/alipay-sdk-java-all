/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-10-25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.SpuAttribute;
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
 * AlipayIserviceCcmSwSpuSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmSwSpuSyncModel {
  public static final String SERIALIZED_NAME_ATTRIBUTE = "attribute";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE)
  private List<SpuAttribute> attribute = null;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_IS_DELETE = "is_delete";
  @SerializedName(SERIALIZED_NAME_IS_DELETE)
  private String isDelete;

  public static final String SERIALIZED_NAME_LIBRARY_ID = "library_id";
  @SerializedName(SERIALIZED_NAME_LIBRARY_ID)
  private Integer libraryId;

  public static final String SERIALIZED_NAME_LIBRARY_NAME = "library_name";
  @SerializedName(SERIALIZED_NAME_LIBRARY_NAME)
  private String libraryName;

  public static final String SERIALIZED_NAME_LINK_URL = "link_url";
  @SerializedName(SERIALIZED_NAME_LINK_URL)
  private String linkUrl;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "original_price";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private String originalPrice;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_SPU_ID = "spu_id";
  @SerializedName(SERIALIZED_NAME_SPU_ID)
  private String spuId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AlipayIserviceCcmSwSpuSyncModel() { 
  }

  public AlipayIserviceCcmSwSpuSyncModel attribute(List<SpuAttribute> attribute) {
    
    this.attribute = attribute;
    return this;
  }

  public AlipayIserviceCcmSwSpuSyncModel addAttributeItem(SpuAttribute attributeItem) {
    if (this.attribute == null) {
      this.attribute = new ArrayList<>();
    }
    this.attribute.add(attributeItem);
    return this;
  }

   /**
   * 商品属性列表
   * @return attribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品属性列表")

  public List<SpuAttribute> getAttribute() {
    return attribute;
  }


  public void setAttribute(List<SpuAttribute> attribute) {
    this.attribute = attribute;
  }


  public AlipayIserviceCcmSwSpuSyncModel brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * 商品品牌
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "米其林", value = "商品品牌")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public AlipayIserviceCcmSwSpuSyncModel category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * 商品类目，用于商品库中分类
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "美妆", value = "商品类目，用于商品库中分类")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public AlipayIserviceCcmSwSpuSyncModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 商品描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商品质量符合XX标准，支持7天无理由退换", value = "商品描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AlipayIserviceCcmSwSpuSyncModel icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * 商品图片链接 特殊可选规则：is_delete&#x3D;false的情况下必填
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d", value = "商品图片链接 特殊可选规则：is_delete=false的情况下必填")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public AlipayIserviceCcmSwSpuSyncModel isDelete(String isDelete) {
    
    this.isDelete = isDelete;
    return this;
  }

   /**
   * 默认为false，为true，表示删除知识点
   * @return isDelete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "默认为false，为true，表示删除知识点")

  public String getIsDelete() {
    return isDelete;
  }


  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }


  public AlipayIserviceCcmSwSpuSyncModel libraryId(Integer libraryId) {
    
    this.libraryId = libraryId;
    return this;
  }

   /**
   * 知识库id
   * @return libraryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23", value = "知识库id")

  public Integer getLibraryId() {
    return libraryId;
  }


  public void setLibraryId(Integer libraryId) {
    this.libraryId = libraryId;
  }


  public AlipayIserviceCcmSwSpuSyncModel libraryName(String libraryName) {
    
    this.libraryName = libraryName;
    return this;
  }

   /**
   * 知识库名称
   * @return libraryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商品知识库", value = "知识库名称")

  public String getLibraryName() {
    return libraryName;
  }


  public void setLibraryName(String libraryName) {
    this.libraryName = libraryName;
  }


  public AlipayIserviceCcmSwSpuSyncModel linkUrl(String linkUrl) {
    
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * 商品链接 特殊可选规则：is_delete&#x3D;false的情况下必填
   * @return linkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://detail.tmall.com/item.htm?id=530187047412&ali_trackid=2:mm_26632614_0_0:1603785697_244_935652742", value = "商品链接 特殊可选规则：is_delete=false的情况下必填")

  public String getLinkUrl() {
    return linkUrl;
  }


  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }


  public AlipayIserviceCcmSwSpuSyncModel originalPrice(String originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * 商品原价
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123.58", value = "商品原价")

  public String getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
  }


  public AlipayIserviceCcmSwSpuSyncModel price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * 商品售价 特殊可选规则：is_delete&#x3D;false的情况下必填
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99.99", value = "商品售价 特殊可选规则：is_delete=false的情况下必填")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public AlipayIserviceCcmSwSpuSyncModel spuId(String spuId) {
    
    this.spuId = spuId;
    return this;
  }

   /**
   * 商品ID
   * @return spuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "spu1212391923", value = "商品ID")

  public String getSpuId() {
    return spuId;
  }


  public void setSpuId(String spuId) {
    this.spuId = spuId;
  }


  public AlipayIserviceCcmSwSpuSyncModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 商品状态：AVAILABLE 表示可售卖,SOLD_OUT为售罄/不可卖，默认可售卖
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AVAILABLE", value = "商品状态：AVAILABLE 表示可售卖,SOLD_OUT为售罄/不可卖，默认可售卖")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayIserviceCcmSwSpuSyncModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 商品名称 特殊可选规则：is_delete&#x3D;false的情况下必填
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "汽车盲点BSD并线辅助系统盲点监测变道后视镜盲区监控雷达预警", value = "商品名称 特殊可选规则：is_delete=false的情况下必填")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmSwSpuSyncModel alipayIserviceCcmSwSpuSyncModel = (AlipayIserviceCcmSwSpuSyncModel) o;
    return Objects.equals(this.attribute, alipayIserviceCcmSwSpuSyncModel.attribute) &&
        Objects.equals(this.brand, alipayIserviceCcmSwSpuSyncModel.brand) &&
        Objects.equals(this.category, alipayIserviceCcmSwSpuSyncModel.category) &&
        Objects.equals(this.description, alipayIserviceCcmSwSpuSyncModel.description) &&
        Objects.equals(this.icon, alipayIserviceCcmSwSpuSyncModel.icon) &&
        Objects.equals(this.isDelete, alipayIserviceCcmSwSpuSyncModel.isDelete) &&
        Objects.equals(this.libraryId, alipayIserviceCcmSwSpuSyncModel.libraryId) &&
        Objects.equals(this.libraryName, alipayIserviceCcmSwSpuSyncModel.libraryName) &&
        Objects.equals(this.linkUrl, alipayIserviceCcmSwSpuSyncModel.linkUrl) &&
        Objects.equals(this.originalPrice, alipayIserviceCcmSwSpuSyncModel.originalPrice) &&
        Objects.equals(this.price, alipayIserviceCcmSwSpuSyncModel.price) &&
        Objects.equals(this.spuId, alipayIserviceCcmSwSpuSyncModel.spuId) &&
        Objects.equals(this.status, alipayIserviceCcmSwSpuSyncModel.status) &&
        Objects.equals(this.title, alipayIserviceCcmSwSpuSyncModel.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, brand, category, description, icon, isDelete, libraryId, libraryName, linkUrl, originalPrice, price, spuId, status, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmSwSpuSyncModel {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
    sb.append("    libraryId: ").append(toIndentedString(libraryId)).append("\n");
    sb.append("    libraryName: ").append(toIndentedString(libraryName)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("attribute");
    openapiFields.add("brand");
    openapiFields.add("category");
    openapiFields.add("description");
    openapiFields.add("icon");
    openapiFields.add("is_delete");
    openapiFields.add("library_id");
    openapiFields.add("library_name");
    openapiFields.add("link_url");
    openapiFields.add("original_price");
    openapiFields.add("price");
    openapiFields.add("spu_id");
    openapiFields.add("status");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmSwSpuSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmSwSpuSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmSwSpuSyncModel is not found in the empty JSON string", AlipayIserviceCcmSwSpuSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmSwSpuSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmSwSpuSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayattribute = jsonObj.getAsJsonArray("attribute");
      if (jsonArrayattribute != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attribute").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `attribute` to be an array in the JSON string but got `%s`", jsonObj.get("attribute").toString()));
        }

        // validate the optional field `attribute` (array)
        for (int i = 0; i < jsonArrayattribute.size(); i++) {
          SpuAttribute.validateJsonObject(jsonArrayattribute.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (jsonObj.get("is_delete") != null && !jsonObj.get("is_delete").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_delete` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_delete").toString()));
      }
      if (jsonObj.get("library_name") != null && !jsonObj.get("library_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `library_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("library_name").toString()));
      }
      if (jsonObj.get("link_url") != null && !jsonObj.get("link_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_url").toString()));
      }
      if (jsonObj.get("original_price") != null && !jsonObj.get("original_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_price").toString()));
      }
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if (jsonObj.get("spu_id") != null && !jsonObj.get("spu_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spu_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spu_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmSwSpuSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmSwSpuSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmSwSpuSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmSwSpuSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmSwSpuSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmSwSpuSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmSwSpuSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmSwSpuSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmSwSpuSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmSwSpuSyncModel
  */
  public static AlipayIserviceCcmSwSpuSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmSwSpuSyncModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmSwSpuSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

