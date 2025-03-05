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
 * AlipayOpenMiniTemplateMarketingCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniTemplateMarketingCreateModel {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_GMT_END = "gmt_end";
  @SerializedName(SERIALIZED_NAME_GMT_END)
  private String gmtEnd;

  public static final String SERIALIZED_NAME_GMT_START = "gmt_start";
  @SerializedName(SERIALIZED_NAME_GMT_START)
  private String gmtStart;

  public static final String SERIALIZED_NAME_TEMPLATE_IDS = "template_ids";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IDS)
  private List<String> templateIds = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AlipayOpenMiniTemplateMarketingCreateModel() { 
  }

  public AlipayOpenMiniTemplateMarketingCreateModel activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 营销活动id
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022xxxx", value = "营销活动id")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public AlipayOpenMiniTemplateMarketingCreateModel gmtEnd(String gmtEnd) {
    
    this.gmtEnd = gmtEnd;
    return this;
  }

   /**
   * 活动结束时间
   * @return gmtEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-10 22:00:00", value = "活动结束时间")

  public String getGmtEnd() {
    return gmtEnd;
  }


  public void setGmtEnd(String gmtEnd) {
    this.gmtEnd = gmtEnd;
  }


  public AlipayOpenMiniTemplateMarketingCreateModel gmtStart(String gmtStart) {
    
    this.gmtStart = gmtStart;
    return this;
  }

   /**
   * 活动开始时间
   * @return gmtStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-01 10:00:00", value = "活动开始时间")

  public String getGmtStart() {
    return gmtStart;
  }


  public void setGmtStart(String gmtStart) {
    this.gmtStart = gmtStart;
  }


  public AlipayOpenMiniTemplateMarketingCreateModel templateIds(List<String> templateIds) {
    
    this.templateIds = templateIds;
    return this;
  }

  public AlipayOpenMiniTemplateMarketingCreateModel addTemplateIdsItem(String templateIdsItem) {
    if (this.templateIds == null) {
      this.templateIds = new ArrayList<>();
    }
    this.templateIds.add(templateIdsItem);
    return this;
  }

   /**
   * 消息模板id列表，最多50个模板id
   * @return templateIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"a\",\"b\",\"c\"]", value = "消息模板id列表，最多50个模板id")

  public List<String> getTemplateIds() {
    return templateIds;
  }


  public void setTemplateIds(List<String> templateIds) {
    this.templateIds = templateIds;
  }


  public AlipayOpenMiniTemplateMarketingCreateModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 消息运营位名称，不填默认使用券名称
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "优惠活动xxx", value = "消息运营位名称，不填默认使用券名称")

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
   * @return the AlipayOpenMiniTemplateMarketingCreateModel instance itself
   */
  public AlipayOpenMiniTemplateMarketingCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenMiniTemplateMarketingCreateModel alipayOpenMiniTemplateMarketingCreateModel = (AlipayOpenMiniTemplateMarketingCreateModel) o;
    return Objects.equals(this.activityId, alipayOpenMiniTemplateMarketingCreateModel.activityId) &&
        Objects.equals(this.gmtEnd, alipayOpenMiniTemplateMarketingCreateModel.gmtEnd) &&
        Objects.equals(this.gmtStart, alipayOpenMiniTemplateMarketingCreateModel.gmtStart) &&
        Objects.equals(this.templateIds, alipayOpenMiniTemplateMarketingCreateModel.templateIds) &&
        Objects.equals(this.title, alipayOpenMiniTemplateMarketingCreateModel.title)&&
        Objects.equals(this.additionalProperties, alipayOpenMiniTemplateMarketingCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, gmtEnd, gmtStart, templateIds, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniTemplateMarketingCreateModel {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    gmtEnd: ").append(toIndentedString(gmtEnd)).append("\n");
    sb.append("    gmtStart: ").append(toIndentedString(gmtStart)).append("\n");
    sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("gmt_end");
    openapiFields.add("gmt_start");
    openapiFields.add("template_ids");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniTemplateMarketingCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniTemplateMarketingCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniTemplateMarketingCreateModel is not found in the empty JSON string", AlipayOpenMiniTemplateMarketingCreateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      if (jsonObj.get("gmt_end") != null && !jsonObj.get("gmt_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_end").toString()));
      }
      if (jsonObj.get("gmt_start") != null && !jsonObj.get("gmt_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_start").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("template_ids") != null && !jsonObj.get("template_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_ids` to be an array in the JSON string but got `%s`", jsonObj.get("template_ids").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniTemplateMarketingCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniTemplateMarketingCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniTemplateMarketingCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniTemplateMarketingCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniTemplateMarketingCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniTemplateMarketingCreateModel value) throws IOException {
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
           public AlipayOpenMiniTemplateMarketingCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenMiniTemplateMarketingCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenMiniTemplateMarketingCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniTemplateMarketingCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniTemplateMarketingCreateModel
  */
  public static AlipayOpenMiniTemplateMarketingCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniTemplateMarketingCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniTemplateMarketingCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

