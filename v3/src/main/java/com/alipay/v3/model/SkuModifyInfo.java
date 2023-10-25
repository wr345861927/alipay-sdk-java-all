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
import com.alipay.v3.model.ItemSkuPropertyInfo;
import com.alipay.v3.model.MaterialModifyInfo;
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
 * SkuModifyInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SkuModifyInfo {
  public static final String SERIALIZED_NAME_INVENTORY = "inventory";
  @SerializedName(SERIALIZED_NAME_INVENTORY)
  private Integer inventory;

  public static final String SERIALIZED_NAME_MATERIAL_LIST = "material_list";
  @SerializedName(SERIALIZED_NAME_MATERIAL_LIST)
  private List<MaterialModifyInfo> materialList = null;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "original_price";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private Integer originalPrice;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_PROPERTY_LIST = "property_list";
  @SerializedName(SERIALIZED_NAME_PROPERTY_LIST)
  private List<ItemSkuPropertyInfo> propertyList = null;

  public static final String SERIALIZED_NAME_SKU_ID = "sku_id";
  @SerializedName(SERIALIZED_NAME_SKU_ID)
  private String skuId;

  public SkuModifyInfo() { 
  }

  public SkuModifyInfo inventory(Integer inventory) {
    
    this.inventory = inventory;
    return this;
  }

   /**
   * 库存
   * @return inventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "库存")

  public Integer getInventory() {
    return inventory;
  }


  public void setInventory(Integer inventory) {
    this.inventory = inventory;
  }


  public SkuModifyInfo materialList(List<MaterialModifyInfo> materialList) {
    
    this.materialList = materialList;
    return this;
  }

  public SkuModifyInfo addMaterialListItem(MaterialModifyInfo materialListItem) {
    if (this.materialList == null) {
      this.materialList = new ArrayList<>();
    }
    this.materialList.add(materialListItem);
    return this;
  }

   /**
   * SKU素材列表（会和SKU已存在素材做差异化比较后做增删改操作）
   * @return materialList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SKU素材列表（会和SKU已存在素材做差异化比较后做增删改操作）")

  public List<MaterialModifyInfo> getMaterialList() {
    return materialList;
  }


  public void setMaterialList(List<MaterialModifyInfo> materialList) {
    this.materialList = materialList;
  }


  public SkuModifyInfo originalPrice(Integer originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * 标价，单位分
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "标价，单位分")

  public Integer getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(Integer originalPrice) {
    this.originalPrice = originalPrice;
  }


  public SkuModifyInfo price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * 售价，单位分
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "售价，单位分")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public SkuModifyInfo propertyList(List<ItemSkuPropertyInfo> propertyList) {
    
    this.propertyList = propertyList;
    return this;
  }

  public SkuModifyInfo addPropertyListItem(ItemSkuPropertyInfo propertyListItem) {
    if (this.propertyList == null) {
      this.propertyList = new ArrayList<>();
    }
    this.propertyList.add(propertyListItem);
    return this;
  }

   /**
   * SKU属性列表（覆盖SKU已存在属性）
   * @return propertyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SKU属性列表（覆盖SKU已存在属性）")

  public List<ItemSkuPropertyInfo> getPropertyList() {
    return propertyList;
  }


  public void setPropertyList(List<ItemSkuPropertyInfo> propertyList) {
    this.propertyList = propertyList;
  }


  public SkuModifyInfo skuId(String skuId) {
    
    this.skuId = skuId;
    return this;
  }

   /**
   * SKU ID（传空表示新增对应SKU）
   * @return skuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018092600502220000000100274", value = "SKU ID（传空表示新增对应SKU）")

  public String getSkuId() {
    return skuId;
  }


  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkuModifyInfo skuModifyInfo = (SkuModifyInfo) o;
    return Objects.equals(this.inventory, skuModifyInfo.inventory) &&
        Objects.equals(this.materialList, skuModifyInfo.materialList) &&
        Objects.equals(this.originalPrice, skuModifyInfo.originalPrice) &&
        Objects.equals(this.price, skuModifyInfo.price) &&
        Objects.equals(this.propertyList, skuModifyInfo.propertyList) &&
        Objects.equals(this.skuId, skuModifyInfo.skuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventory, materialList, originalPrice, price, propertyList, skuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuModifyInfo {\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    materialList: ").append(toIndentedString(materialList)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    propertyList: ").append(toIndentedString(propertyList)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
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
    openapiFields.add("inventory");
    openapiFields.add("material_list");
    openapiFields.add("original_price");
    openapiFields.add("price");
    openapiFields.add("property_list");
    openapiFields.add("sku_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkuModifyInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SkuModifyInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkuModifyInfo is not found in the empty JSON string", SkuModifyInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SkuModifyInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SkuModifyInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraymaterialList = jsonObj.getAsJsonArray("material_list");
      if (jsonArraymaterialList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("material_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `material_list` to be an array in the JSON string but got `%s`", jsonObj.get("material_list").toString()));
        }

        // validate the optional field `material_list` (array)
        for (int i = 0; i < jsonArraymaterialList.size(); i++) {
          MaterialModifyInfo.validateJsonObject(jsonArraymaterialList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraypropertyList = jsonObj.getAsJsonArray("property_list");
      if (jsonArraypropertyList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("property_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `property_list` to be an array in the JSON string but got `%s`", jsonObj.get("property_list").toString()));
        }

        // validate the optional field `property_list` (array)
        for (int i = 0; i < jsonArraypropertyList.size(); i++) {
          ItemSkuPropertyInfo.validateJsonObject(jsonArraypropertyList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("sku_id") != null && !jsonObj.get("sku_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkuModifyInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkuModifyInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkuModifyInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkuModifyInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SkuModifyInfo>() {
           @Override
           public void write(JsonWriter out, SkuModifyInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SkuModifyInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SkuModifyInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkuModifyInfo
  * @throws IOException if the JSON string is invalid with respect to SkuModifyInfo
  */
  public static SkuModifyInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkuModifyInfo.class);
  }

 /**
  * Convert an instance of SkuModifyInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

