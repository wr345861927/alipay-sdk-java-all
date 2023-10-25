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
import com.alipay.v3.model.TopicItem;
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
 * Topic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Topic {
  public static final String SERIALIZED_NAME_IMG_URL = "img_url";
  @SerializedName(SERIALIZED_NAME_IMG_URL)
  private String imgUrl;

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private String linkType;

  public static final String SERIALIZED_NAME_LINK_URL = "link_url";
  @SerializedName(SERIALIZED_NAME_LINK_URL)
  private String linkUrl;

  public static final String SERIALIZED_NAME_SUB_TITLE = "sub_title";
  @SerializedName(SERIALIZED_NAME_SUB_TITLE)
  private String subTitle;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TOPIC_ID = "topic_id";
  @SerializedName(SERIALIZED_NAME_TOPIC_ID)
  private String topicId;

  public static final String SERIALIZED_NAME_TOPIC_ITEMS = "topic_items";
  @SerializedName(SERIALIZED_NAME_TOPIC_ITEMS)
  private List<TopicItem> topicItems = null;

  public Topic() { 
  }

  public Topic imgUrl(String imgUrl) {
    
    this.imgUrl = imgUrl;
    return this;
  }

   /**
   * 营销位图片url
   * @return imgUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://oalipay-dl-django.alicdn.com/rest/1.0/image?fileIds=xxx&zoom=xxx", value = "营销位图片url")

  public String getImgUrl() {
    return imgUrl;
  }


  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public Topic linkType(String linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * 跳转类型，网页:HTTP、小程序:APP
   * @return linkType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HTTP", value = "跳转类型，网页:HTTP、小程序:APP")

  public String getLinkType() {
    return linkType;
  }


  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }


  public Topic linkUrl(String linkUrl) {
    
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * 营销位跳转地址，点击营销位头图跳到的链接url。
   * @return linkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.alipay.com", value = "营销位跳转地址，点击营销位头图跳到的链接url。")

  public String getLinkUrl() {
    return linkUrl;
  }


  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }


  public Topic subTitle(String subTitle) {
    
    this.subTitle = subTitle;
    return this;
  }

   /**
   * 营销位描述
   * @return subTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "营销位描述", value = "营销位描述")

  public String getSubTitle() {
    return subTitle;
  }


  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public Topic title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 营销位名称
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "营销位名称", value = "营销位名称")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Topic topicId(String topicId) {
    
    this.topicId = topicId;
    return this;
  }

   /**
   * 营销位id
   * @return topicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CG202011131013300867029", value = "营销位id")

  public String getTopicId() {
    return topicId;
  }


  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }


  public Topic topicItems(List<TopicItem> topicItems) {
    
    this.topicItems = topicItems;
    return this;
  }

  public Topic addTopicItemsItem(TopicItem topicItemsItem) {
    if (this.topicItems == null) {
      this.topicItems = new ArrayList<>();
    }
    this.topicItems.add(topicItemsItem);
    return this;
  }

   /**
   * 营销位内容列表
   * @return topicItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营销位内容列表")

  public List<TopicItem> getTopicItems() {
    return topicItems;
  }


  public void setTopicItems(List<TopicItem> topicItems) {
    this.topicItems = topicItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Topic topic = (Topic) o;
    return Objects.equals(this.imgUrl, topic.imgUrl) &&
        Objects.equals(this.linkType, topic.linkType) &&
        Objects.equals(this.linkUrl, topic.linkUrl) &&
        Objects.equals(this.subTitle, topic.subTitle) &&
        Objects.equals(this.title, topic.title) &&
        Objects.equals(this.topicId, topic.topicId) &&
        Objects.equals(this.topicItems, topic.topicItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imgUrl, linkType, linkUrl, subTitle, title, topicId, topicItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Topic {\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    topicItems: ").append(toIndentedString(topicItems)).append("\n");
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
    openapiFields.add("img_url");
    openapiFields.add("link_type");
    openapiFields.add("link_url");
    openapiFields.add("sub_title");
    openapiFields.add("title");
    openapiFields.add("topic_id");
    openapiFields.add("topic_items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Topic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Topic.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Topic is not found in the empty JSON string", Topic.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Topic.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Topic` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("img_url") != null && !jsonObj.get("img_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `img_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("img_url").toString()));
      }
      if (jsonObj.get("link_type") != null && !jsonObj.get("link_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_type").toString()));
      }
      if (jsonObj.get("link_url") != null && !jsonObj.get("link_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_url").toString()));
      }
      if (jsonObj.get("sub_title") != null && !jsonObj.get("sub_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_title").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("topic_id") != null && !jsonObj.get("topic_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic_id").toString()));
      }
      JsonArray jsonArraytopicItems = jsonObj.getAsJsonArray("topic_items");
      if (jsonArraytopicItems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("topic_items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `topic_items` to be an array in the JSON string but got `%s`", jsonObj.get("topic_items").toString()));
        }

        // validate the optional field `topic_items` (array)
        for (int i = 0; i < jsonArraytopicItems.size(); i++) {
          TopicItem.validateJsonObject(jsonArraytopicItems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Topic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Topic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Topic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Topic.class));

       return (TypeAdapter<T>) new TypeAdapter<Topic>() {
           @Override
           public void write(JsonWriter out, Topic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Topic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Topic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Topic
  * @throws IOException if the JSON string is invalid with respect to Topic
  */
  public static Topic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Topic.class);
  }

 /**
  * Convert an instance of Topic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

