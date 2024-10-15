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
import com.alipay.v3.model.SpuDetail;
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
 * AlipayIserviceCcmSwKnowledgeModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmSwKnowledgeModifyModel {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_EXT_ID = "ext_id";
  @SerializedName(SERIALIZED_NAME_EXT_ID)
  private String extId;

  public static final String SERIALIZED_NAME_EXTEND_TITLES = "extend_titles";
  @SerializedName(SERIALIZED_NAME_EXTEND_TITLES)
  private List<String> extendTitles = null;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IS_DELETE = "is_delete";
  @SerializedName(SERIALIZED_NAME_IS_DELETE)
  private Boolean isDelete;

  public static final String SERIALIZED_NAME_IS_SEARCHABLE = "is_searchable";
  @SerializedName(SERIALIZED_NAME_IS_SEARCHABLE)
  private Boolean isSearchable;

  public static final String SERIALIZED_NAME_LIBRARY_ID = "library_id";
  @SerializedName(SERIALIZED_NAME_LIBRARY_ID)
  private Integer libraryId;

  public static final String SERIALIZED_NAME_LIBRARY_NAME = "library_name";
  @SerializedName(SERIALIZED_NAME_LIBRARY_NAME)
  private String libraryName;

  public static final String SERIALIZED_NAME_SPU = "spu";
  @SerializedName(SERIALIZED_NAME_SPU)
  private SpuDetail spu;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AlipayIserviceCcmSwKnowledgeModifyModel() { 
  }

  public AlipayIserviceCcmSwKnowledgeModifyModel categoryId(Integer categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 所属类目ID
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "所属类目ID")

  public Integer getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 知识点所属类目
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "平板电脑", value = "知识点所属类目")

  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 知识点答案内容
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商品的发货地是广东佛山", value = "知识点答案内容")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel extId(String extId) {
    
    this.extId = extId;
    return this;
  }

   /**
   * 外部知识点ID
   * @return extId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "qa0002003004005006", value = "外部知识点ID")

  public String getExtId() {
    return extId;
  }


  public void setExtId(String extId) {
    this.extId = extId;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel extendTitles(List<String> extendTitles) {
    
    this.extendTitles = extendTitles;
    return this;
  }

  public AlipayIserviceCcmSwKnowledgeModifyModel addExtendTitlesItem(String extendTitlesItem) {
    if (this.extendTitles == null) {
      this.extendTitles = new ArrayList<>();
    }
    this.extendTitles.add(extendTitlesItem);
    return this;
  }

   /**
   * 扩展标题（问法）
   * @return extendTitles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"商品从哪里发货\"]", value = "扩展标题（问法）")

  public List<String> getExtendTitles() {
    return extendTitles;
  }


  public void setExtendTitles(List<String> extendTitles) {
    this.extendTitles = extendTitles;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * 问答关联图片附件地址
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://image.baidu.com/search/detail?ct=503316480&z=0", value = "问答关联图片附件地址")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 知识点ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "知识点ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel isDelete(Boolean isDelete) {
    
    this.isDelete = isDelete;
    return this;
  }

   /**
   * 默认为false，为true且id非空时，表示删除知识点
   * @return isDelete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "默认为false，为true且id非空时，表示删除知识点")

  public Boolean getIsDelete() {
    return isDelete;
  }


  public void setIsDelete(Boolean isDelete) {
    this.isDelete = isDelete;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel isSearchable(Boolean isSearchable) {
    
    this.isSearchable = isSearchable;
    return this;
  }

   /**
   * 是否被检索到，默认false，系统希望为true
   * @return isSearchable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否被检索到，默认false，系统希望为true")

  public Boolean getIsSearchable() {
    return isSearchable;
  }


  public void setIsSearchable(Boolean isSearchable) {
    this.isSearchable = isSearchable;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel libraryId(Integer libraryId) {
    
    this.libraryId = libraryId;
    return this;
  }

   /**
   * 知识库ID
   * @return libraryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23", value = "知识库ID")

  public Integer getLibraryId() {
    return libraryId;
  }


  public void setLibraryId(Integer libraryId) {
    this.libraryId = libraryId;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel libraryName(String libraryName) {
    
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


  public AlipayIserviceCcmSwKnowledgeModifyModel spu(SpuDetail spu) {
    
    this.spu = spu;
    return this;
  }

   /**
   * Get spu
   * @return spu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpuDetail getSpu() {
    return spu;
  }


  public void setSpu(SpuDetail spu) {
    this.spu = spu;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public AlipayIserviceCcmSwKnowledgeModifyModel addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 以逗号分割的字符串列表
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"发货地\",\"发货点\"]", value = "以逗号分割的字符串列表")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public AlipayIserviceCcmSwKnowledgeModifyModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 知识点标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商品的发货地是哪里?", value = "知识点标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
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
   * @return the AlipayIserviceCcmSwKnowledgeModifyModel instance itself
   */
  public AlipayIserviceCcmSwKnowledgeModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayIserviceCcmSwKnowledgeModifyModel alipayIserviceCcmSwKnowledgeModifyModel = (AlipayIserviceCcmSwKnowledgeModifyModel) o;
    return Objects.equals(this.categoryId, alipayIserviceCcmSwKnowledgeModifyModel.categoryId) &&
        Objects.equals(this.categoryName, alipayIserviceCcmSwKnowledgeModifyModel.categoryName) &&
        Objects.equals(this.content, alipayIserviceCcmSwKnowledgeModifyModel.content) &&
        Objects.equals(this.extId, alipayIserviceCcmSwKnowledgeModifyModel.extId) &&
        Objects.equals(this.extendTitles, alipayIserviceCcmSwKnowledgeModifyModel.extendTitles) &&
        Objects.equals(this.icon, alipayIserviceCcmSwKnowledgeModifyModel.icon) &&
        Objects.equals(this.id, alipayIserviceCcmSwKnowledgeModifyModel.id) &&
        Objects.equals(this.isDelete, alipayIserviceCcmSwKnowledgeModifyModel.isDelete) &&
        Objects.equals(this.isSearchable, alipayIserviceCcmSwKnowledgeModifyModel.isSearchable) &&
        Objects.equals(this.libraryId, alipayIserviceCcmSwKnowledgeModifyModel.libraryId) &&
        Objects.equals(this.libraryName, alipayIserviceCcmSwKnowledgeModifyModel.libraryName) &&
        Objects.equals(this.spu, alipayIserviceCcmSwKnowledgeModifyModel.spu) &&
        Objects.equals(this.tags, alipayIserviceCcmSwKnowledgeModifyModel.tags) &&
        Objects.equals(this.title, alipayIserviceCcmSwKnowledgeModifyModel.title)&&
        Objects.equals(this.additionalProperties, alipayIserviceCcmSwKnowledgeModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryName, content, extId, extendTitles, icon, id, isDelete, isSearchable, libraryId, libraryName, spu, tags, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmSwKnowledgeModifyModel {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    extId: ").append(toIndentedString(extId)).append("\n");
    sb.append("    extendTitles: ").append(toIndentedString(extendTitles)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
    sb.append("    isSearchable: ").append(toIndentedString(isSearchable)).append("\n");
    sb.append("    libraryId: ").append(toIndentedString(libraryId)).append("\n");
    sb.append("    libraryName: ").append(toIndentedString(libraryName)).append("\n");
    sb.append("    spu: ").append(toIndentedString(spu)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("category_id");
    openapiFields.add("category_name");
    openapiFields.add("content");
    openapiFields.add("ext_id");
    openapiFields.add("extend_titles");
    openapiFields.add("icon");
    openapiFields.add("id");
    openapiFields.add("is_delete");
    openapiFields.add("is_searchable");
    openapiFields.add("library_id");
    openapiFields.add("library_name");
    openapiFields.add("spu");
    openapiFields.add("tags");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmSwKnowledgeModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmSwKnowledgeModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmSwKnowledgeModifyModel is not found in the empty JSON string", AlipayIserviceCcmSwKnowledgeModifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("category_name") != null && !jsonObj.get("category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_name").toString()));
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("ext_id") != null && !jsonObj.get("ext_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("extend_titles") != null && !jsonObj.get("extend_titles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_titles` to be an array in the JSON string but got `%s`", jsonObj.get("extend_titles").toString()));
      }
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (jsonObj.get("library_name") != null && !jsonObj.get("library_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `library_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("library_name").toString()));
      }
      // validate the optional field `spu`
      if (jsonObj.getAsJsonObject("spu") != null) {
        SpuDetail.validateJsonObject(jsonObj.getAsJsonObject("spu"));
      }
      // ensure the json data is an array
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmSwKnowledgeModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmSwKnowledgeModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmSwKnowledgeModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmSwKnowledgeModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmSwKnowledgeModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmSwKnowledgeModifyModel value) throws IOException {
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
           public AlipayIserviceCcmSwKnowledgeModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayIserviceCcmSwKnowledgeModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayIserviceCcmSwKnowledgeModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmSwKnowledgeModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmSwKnowledgeModifyModel
  */
  public static AlipayIserviceCcmSwKnowledgeModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmSwKnowledgeModifyModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmSwKnowledgeModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

