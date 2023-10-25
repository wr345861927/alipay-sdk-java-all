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
 * AlipayIserviceCcmSwTreecategoryModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmSwTreecategoryModifyModel {
  public static final String SERIALIZED_NAME_CCS_INSTANCE_ID = "ccs_instance_id";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_ID)
  private String ccsInstanceId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FATHER_ID = "father_id";
  @SerializedName(SERIALIZED_NAME_FATHER_ID)
  private String fatherId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags;

  public AlipayIserviceCcmSwTreecategoryModifyModel() { 
  }

  public AlipayIserviceCcmSwTreecategoryModifyModel ccsInstanceId(String ccsInstanceId) {
    
    this.ccsInstanceId = ccsInstanceId;
    return this;
  }

   /**
   * 子部门ID，不传为默认部门
   * @return ccsInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZPNASDK", value = "子部门ID，不传为默认部门")

  public String getCcsInstanceId() {
    return ccsInstanceId;
  }


  public void setCcsInstanceId(String ccsInstanceId) {
    this.ccsInstanceId = ccsInstanceId;
  }


  public AlipayIserviceCcmSwTreecategoryModifyModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一段描述", value = "描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AlipayIserviceCcmSwTreecategoryModifyModel fatherId(String fatherId) {
    
    this.fatherId = fatherId;
    return this;
  }

   /**
   * 父节点ID
   * @return fatherId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "父节点ID")

  public String getFatherId() {
    return fatherId;
  }


  public void setFatherId(String fatherId) {
    this.fatherId = fatherId;
  }


  public AlipayIserviceCcmSwTreecategoryModifyModel id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 节点ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "节点ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public AlipayIserviceCcmSwTreecategoryModifyModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 节点名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "服务群", value = "节点名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AlipayIserviceCcmSwTreecategoryModifyModel tags(String tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * 标签。KNOWLEDGE（知识库）；PLATFORM（公有云工作台）；HELP（公有云帮助中心）
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"KNOWLEDGE\",\"PLATFORM\",\"HELP\"]", value = "标签。KNOWLEDGE（知识库）；PLATFORM（公有云工作台）；HELP（公有云帮助中心）")

  public String getTags() {
    return tags;
  }


  public void setTags(String tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmSwTreecategoryModifyModel alipayIserviceCcmSwTreecategoryModifyModel = (AlipayIserviceCcmSwTreecategoryModifyModel) o;
    return Objects.equals(this.ccsInstanceId, alipayIserviceCcmSwTreecategoryModifyModel.ccsInstanceId) &&
        Objects.equals(this.description, alipayIserviceCcmSwTreecategoryModifyModel.description) &&
        Objects.equals(this.fatherId, alipayIserviceCcmSwTreecategoryModifyModel.fatherId) &&
        Objects.equals(this.id, alipayIserviceCcmSwTreecategoryModifyModel.id) &&
        Objects.equals(this.name, alipayIserviceCcmSwTreecategoryModifyModel.name) &&
        Objects.equals(this.tags, alipayIserviceCcmSwTreecategoryModifyModel.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccsInstanceId, description, fatherId, id, name, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmSwTreecategoryModifyModel {\n");
    sb.append("    ccsInstanceId: ").append(toIndentedString(ccsInstanceId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fatherId: ").append(toIndentedString(fatherId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("ccs_instance_id");
    openapiFields.add("description");
    openapiFields.add("father_id");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmSwTreecategoryModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmSwTreecategoryModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmSwTreecategoryModifyModel is not found in the empty JSON string", AlipayIserviceCcmSwTreecategoryModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmSwTreecategoryModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmSwTreecategoryModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ccs_instance_id") != null && !jsonObj.get("ccs_instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccs_instance_id").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("father_id") != null && !jsonObj.get("father_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `father_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("father_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmSwTreecategoryModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmSwTreecategoryModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmSwTreecategoryModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmSwTreecategoryModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmSwTreecategoryModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmSwTreecategoryModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmSwTreecategoryModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmSwTreecategoryModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmSwTreecategoryModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmSwTreecategoryModifyModel
  */
  public static AlipayIserviceCcmSwTreecategoryModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmSwTreecategoryModifyModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmSwTreecategoryModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

