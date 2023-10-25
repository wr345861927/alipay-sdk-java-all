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
 * MaterialField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MaterialField {
  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_FIELD_VALUE = "field_value";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUE)
  private List<String> fieldValue = null;

  public MaterialField() { 
  }

  public MaterialField fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * 素材字段名称，来源于素材规范定义的字段名称。注意一次素材提报中字段名称不能重复。
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "serviceBigPic", value = "素材字段名称，来源于素材规范定义的字段名称。注意一次素材提报中字段名称不能重复。")

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public MaterialField fieldValue(List<String> fieldValue) {
    
    this.fieldValue = fieldValue;
    return this;
  }

  public MaterialField addFieldValueItem(String fieldValueItem) {
    if (this.fieldValue == null) {
      this.fieldValue = new ArrayList<>();
    }
    this.fieldValue.add(fieldValueItem);
    return this;
  }

   /**
   * 素材字段值，素材字段提报的实际值，支持多值，具体的要求请查看素材规范或对应的产品文档。
   * @return fieldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"A*WXYTAswgww\"]", value = "素材字段值，素材字段提报的实际值，支持多值，具体的要求请查看素材规范或对应的产品文档。")

  public List<String> getFieldValue() {
    return fieldValue;
  }


  public void setFieldValue(List<String> fieldValue) {
    this.fieldValue = fieldValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialField materialField = (MaterialField) o;
    return Objects.equals(this.fieldName, materialField.fieldName) &&
        Objects.equals(this.fieldValue, materialField.fieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, fieldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialField {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
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
    openapiFields.add("field_name");
    openapiFields.add("field_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MaterialField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MaterialField.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MaterialField is not found in the empty JSON string", MaterialField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MaterialField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MaterialField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("field_name") != null && !jsonObj.get("field_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_name").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("field_value") != null && !jsonObj.get("field_value").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_value` to be an array in the JSON string but got `%s`", jsonObj.get("field_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MaterialField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MaterialField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MaterialField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MaterialField.class));

       return (TypeAdapter<T>) new TypeAdapter<MaterialField>() {
           @Override
           public void write(JsonWriter out, MaterialField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MaterialField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MaterialField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MaterialField
  * @throws IOException if the JSON string is invalid with respect to MaterialField
  */
  public static MaterialField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MaterialField.class);
  }

 /**
  * Convert an instance of MaterialField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

