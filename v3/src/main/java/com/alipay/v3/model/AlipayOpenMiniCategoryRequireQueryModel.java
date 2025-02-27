/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
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
 * AlipayOpenMiniCategoryRequireQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniCategoryRequireQueryModel {
  public static final String SERIALIZED_NAME_CATEGORY_CODE_LIST = "category_code_list";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODE_LIST)
  private List<String> categoryCodeList = null;

  public AlipayOpenMiniCategoryRequireQueryModel() { 
  }

  public AlipayOpenMiniCategoryRequireQueryModel categoryCodeList(List<String> categoryCodeList) {
    
    this.categoryCodeList = categoryCodeList;
    return this;
  }

  public AlipayOpenMiniCategoryRequireQueryModel addCategoryCodeListItem(String categoryCodeListItem) {
    if (this.categoryCodeList == null) {
      this.categoryCodeList = new ArrayList<>();
    }
    this.categoryCodeList.add(categoryCodeListItem);
    return this;
  }

   /**
   * 类目列表，不超过五个
   * @return categoryCodeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[ \"XS1001_XS2002_XS3008\",\"XS1022_XS2182\"]", value = "类目列表，不超过五个")

  public List<String> getCategoryCodeList() {
    return categoryCodeList;
  }


  public void setCategoryCodeList(List<String> categoryCodeList) {
    this.categoryCodeList = categoryCodeList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniCategoryRequireQueryModel alipayOpenMiniCategoryRequireQueryModel = (AlipayOpenMiniCategoryRequireQueryModel) o;
    return Objects.equals(this.categoryCodeList, alipayOpenMiniCategoryRequireQueryModel.categoryCodeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCodeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniCategoryRequireQueryModel {\n");
    sb.append("    categoryCodeList: ").append(toIndentedString(categoryCodeList)).append("\n");
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
    openapiFields.add("category_code_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniCategoryRequireQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniCategoryRequireQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniCategoryRequireQueryModel is not found in the empty JSON string", AlipayOpenMiniCategoryRequireQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniCategoryRequireQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniCategoryRequireQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("category_code_list") != null && !jsonObj.get("category_code_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_code_list` to be an array in the JSON string but got `%s`", jsonObj.get("category_code_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniCategoryRequireQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniCategoryRequireQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniCategoryRequireQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniCategoryRequireQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniCategoryRequireQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniCategoryRequireQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniCategoryRequireQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniCategoryRequireQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniCategoryRequireQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniCategoryRequireQueryModel
  */
  public static AlipayOpenMiniCategoryRequireQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniCategoryRequireQueryModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniCategoryRequireQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

