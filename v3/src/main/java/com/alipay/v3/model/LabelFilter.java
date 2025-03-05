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
 * LabelFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LabelFilter {
  public static final String SERIALIZED_NAME_COLUMN_NAME = "column_name";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
  private String columnName;

  public static final String SERIALIZED_NAME_OP = "op";
  @SerializedName(SERIALIZED_NAME_OP)
  private String op;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = null;

  public LabelFilter() { 
  }

  public LabelFilter columnName(String columnName) {
    
    this.columnName = columnName;
    return this;
  }

   /**
   * 标签组名，商户自定义的标签固定为label_id_list，支付宝开放的标签详见&lt;a href&#x3D;\&quot;http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/FirstPartOfTagsFromAlipay.xlsx\&quot;&gt;支付宝开放标签&lt;/a&gt;
   * @return columnName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "label_id_list", value = "标签组名，商户自定义的标签固定为label_id_list，支付宝开放的标签详见<a href=\"http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/FirstPartOfTagsFromAlipay.xlsx\">支付宝开放标签</a>")

  public String getColumnName() {
    return columnName;
  }


  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  public LabelFilter op(String op) {
    
    this.op = op;
    return this;
  }

   /**
   * 操作符，支持&#x3D;、!&#x3D;、in三个操作符；其中in表示是某几个标签中的一个
   * @return op
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "=", value = "操作符，支持=、!=、in三个操作符；其中in表示是某几个标签中的一个")

  public String getOp() {
    return op;
  }


  public void setOp(String op) {
    this.op = op;
  }


  public LabelFilter values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public LabelFilter addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * 标签数组，用于组装最后的表达式
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100509", value = "标签数组，用于组装最后的表达式")

  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
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
   * @return the LabelFilter instance itself
   */
  public LabelFilter putAdditionalProperty(String key, Object value) {
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
    LabelFilter labelFilter = (LabelFilter) o;
    return Objects.equals(this.columnName, labelFilter.columnName) &&
        Objects.equals(this.op, labelFilter.op) &&
        Objects.equals(this.values, labelFilter.values)&&
        Objects.equals(this.additionalProperties, labelFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, op, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelFilter {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("column_name");
    openapiFields.add("op");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LabelFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LabelFilter.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LabelFilter is not found in the empty JSON string", LabelFilter.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("column_name") != null && !jsonObj.get("column_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `column_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("column_name").toString()));
      }
      if (jsonObj.get("op") != null && !jsonObj.get("op").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `op` to be a primitive type in the JSON string but got `%s`", jsonObj.get("op").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LabelFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LabelFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LabelFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LabelFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<LabelFilter>() {
           @Override
           public void write(JsonWriter out, LabelFilter value) throws IOException {
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
           public LabelFilter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LabelFilter instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LabelFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LabelFilter
  * @throws IOException if the JSON string is invalid with respect to LabelFilter
  */
  public static LabelFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LabelFilter.class);
  }

 /**
  * Convert an instance of LabelFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

