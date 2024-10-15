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
import com.alipay.v3.model.ArticleAttachmentInfo;
import com.alipay.v3.model.ArticleCategoryInfo;
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
 * ArticleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArticleInfo {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<ArticleAttachmentInfo> attachments = null;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CATEGORY_NAME_PATH = "category_name_path";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME_PATH)
  private String categoryNamePath;

  public static final String SERIALIZED_NAME_CATEGORY_PATH = "category_path";
  @SerializedName(SERIALIZED_NAME_CATEGORY_PATH)
  private List<ArticleCategoryInfo> categoryPath = null;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private String creatorId;

  public static final String SERIALIZED_NAME_EXTEND_TITLES = "extend_titles";
  @SerializedName(SERIALIZED_NAME_EXTEND_TITLES)
  private List<String> extendTitles = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords = null;

  public static final String SERIALIZED_NAME_LIBRARY_ID = "library_id";
  @SerializedName(SERIALIZED_NAME_LIBRARY_ID)
  private Integer libraryId;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private Integer orderNo;

  public static final String SERIALIZED_NAME_PICTURES = "pictures";
  @SerializedName(SERIALIZED_NAME_PICTURES)
  private List<ArticleAttachmentInfo> pictures = null;

  public static final String SERIALIZED_NAME_PUBLISH_END = "publish_end";
  @SerializedName(SERIALIZED_NAME_PUBLISH_END)
  private String publishEnd;

  public static final String SERIALIZED_NAME_PUBLISH_START = "publish_start";
  @SerializedName(SERIALIZED_NAME_PUBLISH_START)
  private String publishStart;

  public static final String SERIALIZED_NAME_SCENE_CODES = "scene_codes";
  @SerializedName(SERIALIZED_NAME_SCENE_CODES)
  private List<String> sceneCodes = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private String statusCode;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_UPDATER_ID = "updater_id";
  @SerializedName(SERIALIZED_NAME_UPDATER_ID)
  private String updaterId;

  public static final String SERIALIZED_NAME_UPDATER_NAME = "updater_name";
  @SerializedName(SERIALIZED_NAME_UPDATER_NAME)
  private String updaterName;

  public ArticleInfo() { 
  }

  public ArticleInfo attachments(List<ArticleAttachmentInfo> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public ArticleInfo addAttachmentsItem(ArticleAttachmentInfo attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * 文章对应附件集合
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "文章对应附件集合")

  public List<ArticleAttachmentInfo> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<ArticleAttachmentInfo> attachments) {
    this.attachments = attachments;
  }


  public ArticleInfo categoryId(Integer categoryId) {
    
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


  public ArticleInfo categoryNamePath(String categoryNamePath) {
    
    this.categoryNamePath = categoryNamePath;
    return this;
  }

   /**
   * 类目名称路径
   * @return categoryNamePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "知识库-演示", value = "类目名称路径")

  public String getCategoryNamePath() {
    return categoryNamePath;
  }


  public void setCategoryNamePath(String categoryNamePath) {
    this.categoryNamePath = categoryNamePath;
  }


  public ArticleInfo categoryPath(List<ArticleCategoryInfo> categoryPath) {
    
    this.categoryPath = categoryPath;
    return this;
  }

  public ArticleInfo addCategoryPathItem(ArticleCategoryInfo categoryPathItem) {
    if (this.categoryPath == null) {
      this.categoryPath = new ArrayList<>();
    }
    this.categoryPath.add(categoryPathItem);
    return this;
  }

   /**
   * 类目路径
   * @return categoryPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "类目路径")

  public List<ArticleCategoryInfo> getCategoryPath() {
    return categoryPath;
  }


  public void setCategoryPath(List<ArticleCategoryInfo> categoryPath) {
    this.categoryPath = categoryPath;
  }


  public ArticleInfo content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 内容
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我是文章内容", value = "内容")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ArticleInfo createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-31 23:59:59", value = "创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ArticleInfo creatorId(String creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * 创建人
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10001", value = "创建人")

  public String getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public ArticleInfo extendTitles(List<String> extendTitles) {
    
    this.extendTitles = extendTitles;
    return this;
  }

  public ArticleInfo addExtendTitlesItem(String extendTitlesItem) {
    if (this.extendTitles == null) {
      this.extendTitles = new ArrayList<>();
    }
    this.extendTitles.add(extendTitlesItem);
    return this;
  }

   /**
   * 扩展标题
   * @return extendTitles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"支付宝\",\"知识库\"]", value = "扩展标题")

  public List<String> getExtendTitles() {
    return extendTitles;
  }


  public void setExtendTitles(List<String> extendTitles) {
    this.extendTitles = extendTitles;
  }


  public ArticleInfo id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 文章ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "文章ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ArticleInfo keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public ArticleInfo addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * 标签
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"标签\"]", value = "标签")

  public List<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public ArticleInfo libraryId(Integer libraryId) {
    
    this.libraryId = libraryId;
    return this;
  }

   /**
   * 知识库ID
   * @return libraryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "知识库ID")

  public Integer getLibraryId() {
    return libraryId;
  }


  public void setLibraryId(Integer libraryId) {
    this.libraryId = libraryId;
  }


  public ArticleInfo orderNo(Integer orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 排序值
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "排序值")

  public Integer getOrderNo() {
    return orderNo;
  }


  public void setOrderNo(Integer orderNo) {
    this.orderNo = orderNo;
  }


  public ArticleInfo pictures(List<ArticleAttachmentInfo> pictures) {
    
    this.pictures = pictures;
    return this;
  }

  public ArticleInfo addPicturesItem(ArticleAttachmentInfo picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<>();
    }
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * 文章对应图片集合
   * @return pictures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "文章对应图片集合")

  public List<ArticleAttachmentInfo> getPictures() {
    return pictures;
  }


  public void setPictures(List<ArticleAttachmentInfo> pictures) {
    this.pictures = pictures;
  }


  public ArticleInfo publishEnd(String publishEnd) {
    
    this.publishEnd = publishEnd;
    return this;
  }

   /**
   * 有效期止
   * @return publishEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-11 16:14:58", value = "有效期止")

  public String getPublishEnd() {
    return publishEnd;
  }


  public void setPublishEnd(String publishEnd) {
    this.publishEnd = publishEnd;
  }


  public ArticleInfo publishStart(String publishStart) {
    
    this.publishStart = publishStart;
    return this;
  }

   /**
   * 有效期起始
   * @return publishStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-11 16:14:58", value = "有效期起始")

  public String getPublishStart() {
    return publishStart;
  }


  public void setPublishStart(String publishStart) {
    this.publishStart = publishStart;
  }


  public ArticleInfo sceneCodes(List<String> sceneCodes) {
    
    this.sceneCodes = sceneCodes;
    return this;
  }

  public ArticleInfo addSceneCodesItem(String sceneCodesItem) {
    if (this.sceneCodes == null) {
      this.sceneCodes = new ArrayList<>();
    }
    this.sceneCodes.add(sceneCodesItem);
    return this;
  }

   /**
   * 场景ID。1（内部知识库）；2（机器人）;3（帮助中心）；4（无线帮助中心）
   * @return sceneCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"1\",\"2\",\"3\",\"4\"]", value = "场景ID。1（内部知识库）；2（机器人）;3（帮助中心）；4（无线帮助中心）")

  public List<String> getSceneCodes() {
    return sceneCodes;
  }


  public void setSceneCodes(List<String> sceneCodes) {
    this.sceneCodes = sceneCodes;
  }


  public ArticleInfo source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 来源
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "网关录入", value = "来源")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public ArticleInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 文章状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "已发布", value = "文章状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ArticleInfo statusCode(String statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * 文章状态码
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUBLISHED", value = "文章状态码")

  public String getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  public ArticleInfo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我是文章标题", value = "标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ArticleInfo updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 修改时间
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-31 23:59:59", value = "修改时间")

  public String getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public ArticleInfo updaterId(String updaterId) {
    
    this.updaterId = updaterId;
    return this;
  }

   /**
   * 修改人
   * @return updaterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10001", value = "修改人")

  public String getUpdaterId() {
    return updaterId;
  }


  public void setUpdaterId(String updaterId) {
    this.updaterId = updaterId;
  }


  public ArticleInfo updaterName(String updaterName) {
    
    this.updaterName = updaterName;
    return this;
  }

   /**
   * 修改人名称
   * @return updaterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "admin", value = "修改人名称")

  public String getUpdaterName() {
    return updaterName;
  }


  public void setUpdaterName(String updaterName) {
    this.updaterName = updaterName;
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
   * @return the ArticleInfo instance itself
   */
  public ArticleInfo putAdditionalProperty(String key, Object value) {
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
    ArticleInfo articleInfo = (ArticleInfo) o;
    return Objects.equals(this.attachments, articleInfo.attachments) &&
        Objects.equals(this.categoryId, articleInfo.categoryId) &&
        Objects.equals(this.categoryNamePath, articleInfo.categoryNamePath) &&
        Objects.equals(this.categoryPath, articleInfo.categoryPath) &&
        Objects.equals(this.content, articleInfo.content) &&
        Objects.equals(this.createTime, articleInfo.createTime) &&
        Objects.equals(this.creatorId, articleInfo.creatorId) &&
        Objects.equals(this.extendTitles, articleInfo.extendTitles) &&
        Objects.equals(this.id, articleInfo.id) &&
        Objects.equals(this.keywords, articleInfo.keywords) &&
        Objects.equals(this.libraryId, articleInfo.libraryId) &&
        Objects.equals(this.orderNo, articleInfo.orderNo) &&
        Objects.equals(this.pictures, articleInfo.pictures) &&
        Objects.equals(this.publishEnd, articleInfo.publishEnd) &&
        Objects.equals(this.publishStart, articleInfo.publishStart) &&
        Objects.equals(this.sceneCodes, articleInfo.sceneCodes) &&
        Objects.equals(this.source, articleInfo.source) &&
        Objects.equals(this.status, articleInfo.status) &&
        Objects.equals(this.statusCode, articleInfo.statusCode) &&
        Objects.equals(this.title, articleInfo.title) &&
        Objects.equals(this.updateTime, articleInfo.updateTime) &&
        Objects.equals(this.updaterId, articleInfo.updaterId) &&
        Objects.equals(this.updaterName, articleInfo.updaterName)&&
        Objects.equals(this.additionalProperties, articleInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, categoryId, categoryNamePath, categoryPath, content, createTime, creatorId, extendTitles, id, keywords, libraryId, orderNo, pictures, publishEnd, publishStart, sceneCodes, source, status, statusCode, title, updateTime, updaterId, updaterName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleInfo {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryNamePath: ").append(toIndentedString(categoryNamePath)).append("\n");
    sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    extendTitles: ").append(toIndentedString(extendTitles)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    libraryId: ").append(toIndentedString(libraryId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    publishEnd: ").append(toIndentedString(publishEnd)).append("\n");
    sb.append("    publishStart: ").append(toIndentedString(publishStart)).append("\n");
    sb.append("    sceneCodes: ").append(toIndentedString(sceneCodes)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
    sb.append("    updaterName: ").append(toIndentedString(updaterName)).append("\n");
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
    openapiFields.add("attachments");
    openapiFields.add("category_id");
    openapiFields.add("category_name_path");
    openapiFields.add("category_path");
    openapiFields.add("content");
    openapiFields.add("create_time");
    openapiFields.add("creator_id");
    openapiFields.add("extend_titles");
    openapiFields.add("id");
    openapiFields.add("keywords");
    openapiFields.add("library_id");
    openapiFields.add("order_no");
    openapiFields.add("pictures");
    openapiFields.add("publish_end");
    openapiFields.add("publish_start");
    openapiFields.add("scene_codes");
    openapiFields.add("source");
    openapiFields.add("status");
    openapiFields.add("status_code");
    openapiFields.add("title");
    openapiFields.add("update_time");
    openapiFields.add("updater_id");
    openapiFields.add("updater_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArticleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArticleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArticleInfo is not found in the empty JSON string", ArticleInfo.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
      if (jsonArrayattachments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attachments").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
        }

        // validate the optional field `attachments` (array)
        for (int i = 0; i < jsonArrayattachments.size(); i++) {
          ArticleAttachmentInfo.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("category_name_path") != null && !jsonObj.get("category_name_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_name_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_name_path").toString()));
      }
      JsonArray jsonArraycategoryPath = jsonObj.getAsJsonArray("category_path");
      if (jsonArraycategoryPath != null) {
        // ensure the json data is an array
        if (!jsonObj.get("category_path").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `category_path` to be an array in the JSON string but got `%s`", jsonObj.get("category_path").toString()));
        }

        // validate the optional field `category_path` (array)
        for (int i = 0; i < jsonArraycategoryPath.size(); i++) {
          ArticleCategoryInfo.validateJsonObject(jsonArraycategoryPath.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("creator_id") != null && !jsonObj.get("creator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("extend_titles") != null && !jsonObj.get("extend_titles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_titles` to be an array in the JSON string but got `%s`", jsonObj.get("extend_titles").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("keywords") != null && !jsonObj.get("keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keywords` to be an array in the JSON string but got `%s`", jsonObj.get("keywords").toString()));
      }
      JsonArray jsonArraypictures = jsonObj.getAsJsonArray("pictures");
      if (jsonArraypictures != null) {
        // ensure the json data is an array
        if (!jsonObj.get("pictures").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `pictures` to be an array in the JSON string but got `%s`", jsonObj.get("pictures").toString()));
        }

        // validate the optional field `pictures` (array)
        for (int i = 0; i < jsonArraypictures.size(); i++) {
          ArticleAttachmentInfo.validateJsonObject(jsonArraypictures.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("publish_end") != null && !jsonObj.get("publish_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_end").toString()));
      }
      if (jsonObj.get("publish_start") != null && !jsonObj.get("publish_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_start").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("scene_codes") != null && !jsonObj.get("scene_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_codes` to be an array in the JSON string but got `%s`", jsonObj.get("scene_codes").toString()));
      }
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("status_code") != null && !jsonObj.get("status_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_code").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("update_time") != null && !jsonObj.get("update_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `update_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("update_time").toString()));
      }
      if (jsonObj.get("updater_id") != null && !jsonObj.get("updater_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updater_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updater_id").toString()));
      }
      if (jsonObj.get("updater_name") != null && !jsonObj.get("updater_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updater_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updater_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArticleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArticleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArticleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArticleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ArticleInfo>() {
           @Override
           public void write(JsonWriter out, ArticleInfo value) throws IOException {
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
           public ArticleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ArticleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ArticleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArticleInfo
  * @throws IOException if the JSON string is invalid with respect to ArticleInfo
  */
  public static ArticleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArticleInfo.class);
  }

 /**
  * Convert an instance of ArticleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

