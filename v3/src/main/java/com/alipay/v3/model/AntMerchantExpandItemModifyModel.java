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
import com.alipay.v3.model.ItemLabelModifyInfo;
import com.alipay.v3.model.ItemSkuModifyInfo;
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
 * AntMerchantExpandItemModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandItemModifyModel {
  public static final String SERIALIZED_NAME_DETAIL_URL = "detail_url";
  @SerializedName(SERIALIZED_NAME_DETAIL_URL)
  private String detailUrl;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_EXTERNAL_ITEM_ID = "external_item_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ITEM_ID)
  private String externalItemId;

  public static final String SERIALIZED_NAME_FRONT_CATEGORY_ID = "front_category_id";
  @SerializedName(SERIALIZED_NAME_FRONT_CATEGORY_ID)
  private String frontCategoryId;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_LABEL_LIST = "label_list";
  @SerializedName(SERIALIZED_NAME_LABEL_LIST)
  private List<ItemLabelModifyInfo> labelList = null;

  public static final String SERIALIZED_NAME_MAIN_PIC = "main_pic";
  @SerializedName(SERIALIZED_NAME_MAIN_PIC)
  private String mainPic;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OP_TIMESTAMP = "op_timestamp";
  @SerializedName(SERIALIZED_NAME_OP_TIMESTAMP)
  private Integer opTimestamp;

  public static final String SERIALIZED_NAME_SCENE = "scene";
  @SerializedName(SERIALIZED_NAME_SCENE)
  private String scene;

  public static final String SERIALIZED_NAME_SKU_LIST = "sku_list";
  @SerializedName(SERIALIZED_NAME_SKU_LIST)
  private List<ItemSkuModifyInfo> skuList = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AntMerchantExpandItemModifyModel() { 
  }

  public AntMerchantExpandItemModifyModel detailUrl(String detailUrl) {
    
    this.detailUrl = detailUrl;
    return this;
  }

   /**
   * 商品详情地址
   * @return detailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.alipay.com/item/detail01.html", value = "商品详情地址")

  public String getDetailUrl() {
    return detailUrl;
  }


  public void setDetailUrl(String detailUrl) {
    this.detailUrl = detailUrl;
  }


  public AntMerchantExpandItemModifyModel extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 商品扩展信息：可以解析成 Map&lt;String, String&gt; 的 json string
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\\\"OIL_GUNS\\\":\\\"[7,8,9,10]\\\", \\\"DISCOUNT\\\":\\\"95\\\"}", value = "商品扩展信息：可以解析成 Map<String, String> 的 json string")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public AntMerchantExpandItemModifyModel externalItemId(String externalItemId) {
    
    this.externalItemId = externalItemId;
    return this;
  }

   /**
   * 外部商品ID（item_id不为空时作为普通更新项，item_id为空时作为更新KEY）
   * @return externalItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190916123423654241312", value = "外部商品ID（item_id不为空时作为普通更新项，item_id为空时作为更新KEY）")

  public String getExternalItemId() {
    return externalItemId;
  }


  public void setExternalItemId(String externalItemId) {
    this.externalItemId = externalItemId;
  }


  public AntMerchantExpandItemModifyModel frontCategoryId(String frontCategoryId) {
    
    this.frontCategoryId = frontCategoryId;
    return this;
  }

   /**
   * 前台类目id, null表示未分类
   * @return frontCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018091300502200002600105884", value = "前台类目id, null表示未分类")

  public String getFrontCategoryId() {
    return frontCategoryId;
  }


  public void setFrontCategoryId(String frontCategoryId) {
    this.frontCategoryId = frontCategoryId;
  }


  public AntMerchantExpandItemModifyModel itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 商品id(和external_item_id不能同时为空)
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018091300502200002600104169", value = "商品id(和external_item_id不能同时为空)")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public AntMerchantExpandItemModifyModel labelList(List<ItemLabelModifyInfo> labelList) {
    
    this.labelList = labelList;
    return this;
  }

  public AntMerchantExpandItemModifyModel addLabelListItem(ItemLabelModifyInfo labelListItem) {
    if (this.labelList == null) {
      this.labelList = new ArrayList<>();
    }
    this.labelList.add(labelListItem);
    return this;
  }

   /**
   * 商品标签列表，null表示不修改标签列表，空list表示清空标签
   * @return labelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品标签列表，null表示不修改标签列表，空list表示清空标签")

  public List<ItemLabelModifyInfo> getLabelList() {
    return labelList;
  }


  public void setLabelList(List<ItemLabelModifyInfo> labelList) {
    this.labelList = labelList;
  }


  public AntMerchantExpandItemModifyModel mainPic(String mainPic) {
    
    this.mainPic = mainPic;
    return this;
  }

   /**
   * 商品主图
   * @return mainPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://img.alicdn.com/imgextra/i4/263168616/O1CN01qp60TQ2DWB06jyvVg_!!263168616.jpg", value = "商品主图")

  public String getMainPic() {
    return mainPic;
  }


  public void setMainPic(String mainPic) {
    this.mainPic = mainPic;
  }


  public AntMerchantExpandItemModifyModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 商品名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "西红柿炒蛋", value = "商品名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AntMerchantExpandItemModifyModel opTimestamp(Integer opTimestamp) {
    
    this.opTimestamp = opTimestamp;
    return this;
  }

   /**
   * 更新时间戳（只处理时间戳最大的一次请求）
   * @return opTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234352342353", value = "更新时间戳（只处理时间戳最大的一次请求）")

  public Integer getOpTimestamp() {
    return opTimestamp;
  }


  public void setOpTimestamp(Integer opTimestamp) {
    this.opTimestamp = opTimestamp;
  }


  public AntMerchantExpandItemModifyModel scene(String scene) {
    
    this.scene = scene;
    return this;
  }

   /**
   * 场景：GAS_CHARGE（加油）
   * @return scene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GAS_CHARGE", value = "场景：GAS_CHARGE（加油）")

  public String getScene() {
    return scene;
  }


  public void setScene(String scene) {
    this.scene = scene;
  }


  public AntMerchantExpandItemModifyModel skuList(List<ItemSkuModifyInfo> skuList) {
    
    this.skuList = skuList;
    return this;
  }

  public AntMerchantExpandItemModifyModel addSkuListItem(ItemSkuModifyInfo skuListItem) {
    if (this.skuList == null) {
      this.skuList = new ArrayList<>();
    }
    this.skuList.add(skuListItem);
    return this;
  }

   /**
   * SKU列表（会和商品已存在SKU做差异化比较后做增删改操作）
   * @return skuList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SKU列表（会和商品已存在SKU做差异化比较后做增删改操作）")

  public List<ItemSkuModifyInfo> getSkuList() {
    return skuList;
  }


  public void setSkuList(List<ItemSkuModifyInfo> skuList) {
    this.skuList = skuList;
  }


  public AntMerchantExpandItemModifyModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 商品状态：  EFFECT（有效）、 INVALID（无效）
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EFFECT", value = "商品状态：  EFFECT（有效）、 INVALID（无效）")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the AntMerchantExpandItemModifyModel instance itself
   */
  public AntMerchantExpandItemModifyModel putAdditionalProperty(String key, Object value) {
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
    AntMerchantExpandItemModifyModel antMerchantExpandItemModifyModel = (AntMerchantExpandItemModifyModel) o;
    return Objects.equals(this.detailUrl, antMerchantExpandItemModifyModel.detailUrl) &&
        Objects.equals(this.extInfo, antMerchantExpandItemModifyModel.extInfo) &&
        Objects.equals(this.externalItemId, antMerchantExpandItemModifyModel.externalItemId) &&
        Objects.equals(this.frontCategoryId, antMerchantExpandItemModifyModel.frontCategoryId) &&
        Objects.equals(this.itemId, antMerchantExpandItemModifyModel.itemId) &&
        Objects.equals(this.labelList, antMerchantExpandItemModifyModel.labelList) &&
        Objects.equals(this.mainPic, antMerchantExpandItemModifyModel.mainPic) &&
        Objects.equals(this.name, antMerchantExpandItemModifyModel.name) &&
        Objects.equals(this.opTimestamp, antMerchantExpandItemModifyModel.opTimestamp) &&
        Objects.equals(this.scene, antMerchantExpandItemModifyModel.scene) &&
        Objects.equals(this.skuList, antMerchantExpandItemModifyModel.skuList) &&
        Objects.equals(this.status, antMerchantExpandItemModifyModel.status)&&
        Objects.equals(this.additionalProperties, antMerchantExpandItemModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailUrl, extInfo, externalItemId, frontCategoryId, itemId, labelList, mainPic, name, opTimestamp, scene, skuList, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandItemModifyModel {\n");
    sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    externalItemId: ").append(toIndentedString(externalItemId)).append("\n");
    sb.append("    frontCategoryId: ").append(toIndentedString(frontCategoryId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
    sb.append("    mainPic: ").append(toIndentedString(mainPic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    opTimestamp: ").append(toIndentedString(opTimestamp)).append("\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
    sb.append("    skuList: ").append(toIndentedString(skuList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("detail_url");
    openapiFields.add("ext_info");
    openapiFields.add("external_item_id");
    openapiFields.add("front_category_id");
    openapiFields.add("item_id");
    openapiFields.add("label_list");
    openapiFields.add("main_pic");
    openapiFields.add("name");
    openapiFields.add("op_timestamp");
    openapiFields.add("scene");
    openapiFields.add("sku_list");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandItemModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandItemModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandItemModifyModel is not found in the empty JSON string", AntMerchantExpandItemModifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("detail_url") != null && !jsonObj.get("detail_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail_url").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("external_item_id") != null && !jsonObj.get("external_item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_item_id").toString()));
      }
      if (jsonObj.get("front_category_id") != null && !jsonObj.get("front_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `front_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("front_category_id").toString()));
      }
      if (jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      JsonArray jsonArraylabelList = jsonObj.getAsJsonArray("label_list");
      if (jsonArraylabelList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("label_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `label_list` to be an array in the JSON string but got `%s`", jsonObj.get("label_list").toString()));
        }

        // validate the optional field `label_list` (array)
        for (int i = 0; i < jsonArraylabelList.size(); i++) {
          ItemLabelModifyInfo.validateJsonObject(jsonArraylabelList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("main_pic") != null && !jsonObj.get("main_pic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `main_pic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("main_pic").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("scene") != null && !jsonObj.get("scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene").toString()));
      }
      JsonArray jsonArrayskuList = jsonObj.getAsJsonArray("sku_list");
      if (jsonArrayskuList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sku_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sku_list` to be an array in the JSON string but got `%s`", jsonObj.get("sku_list").toString()));
        }

        // validate the optional field `sku_list` (array)
        for (int i = 0; i < jsonArrayskuList.size(); i++) {
          ItemSkuModifyInfo.validateJsonObject(jsonArrayskuList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandItemModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandItemModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandItemModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandItemModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandItemModifyModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandItemModifyModel value) throws IOException {
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
           public AntMerchantExpandItemModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AntMerchantExpandItemModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AntMerchantExpandItemModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandItemModifyModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandItemModifyModel
  */
  public static AntMerchantExpandItemModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandItemModifyModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandItemModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

