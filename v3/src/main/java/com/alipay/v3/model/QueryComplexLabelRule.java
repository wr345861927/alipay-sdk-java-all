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
 * QueryComplexLabelRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryComplexLabelRule {
  public static final String SERIALIZED_NAME_LABEL_ID = "label_id";
  @SerializedName(SERIALIZED_NAME_LABEL_ID)
  private String labelId;

  public static final String SERIALIZED_NAME_LABEL_NAME = "label_name";
  @SerializedName(SERIALIZED_NAME_LABEL_NAME)
  private String labelName;

  public static final String SERIALIZED_NAME_LABEL_VALUE = "label_value";
  @SerializedName(SERIALIZED_NAME_LABEL_VALUE)
  private String labelValue;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public QueryComplexLabelRule() { 
  }

  public QueryComplexLabelRule labelId(String labelId) {
    
    this.labelId = labelId;
    return this;
  }

   /**
   * 标签id
   * @return labelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "标签id")

  public String getLabelId() {
    return labelId;
  }


  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }


  public QueryComplexLabelRule labelName(String labelName) {
    
    this.labelName = labelName;
    return this;
  }

   /**
   * 标签名
   * @return labelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "职业", value = "标签名")

  public String getLabelName() {
    return labelName;
  }


  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }


  public QueryComplexLabelRule labelValue(String labelValue) {
    
    this.labelValue = labelValue;
    return this;
  }

   /**
   * 当有多个取值时用英文\&quot;,\&quot;分隔，不允许传入下划线\&quot;_\&quot;、竖线\&quot;|\&quot;或者空格\&quot; \&quot;
   * @return labelValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "程序员", value = "当有多个取值时用英文\",\"分隔，不允许传入下划线\"_\"、竖线\"|\"或者空格\" \"")

  public String getLabelValue() {
    return labelValue;
  }


  public void setLabelValue(String labelValue) {
    this.labelValue = labelValue;
  }


  public QueryComplexLabelRule operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 运算符
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EQ", value = "运算符")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
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
   * @return the QueryComplexLabelRule instance itself
   */
  public QueryComplexLabelRule putAdditionalProperty(String key, Object value) {
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
    QueryComplexLabelRule queryComplexLabelRule = (QueryComplexLabelRule) o;
    return Objects.equals(this.labelId, queryComplexLabelRule.labelId) &&
        Objects.equals(this.labelName, queryComplexLabelRule.labelName) &&
        Objects.equals(this.labelValue, queryComplexLabelRule.labelValue) &&
        Objects.equals(this.operator, queryComplexLabelRule.operator)&&
        Objects.equals(this.additionalProperties, queryComplexLabelRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelId, labelName, labelValue, operator, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryComplexLabelRule {\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
    sb.append("    labelValue: ").append(toIndentedString(labelValue)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
    openapiFields.add("label_id");
    openapiFields.add("label_name");
    openapiFields.add("label_value");
    openapiFields.add("operator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueryComplexLabelRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueryComplexLabelRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryComplexLabelRule is not found in the empty JSON string", QueryComplexLabelRule.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("label_id") != null && !jsonObj.get("label_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_id").toString()));
      }
      if (jsonObj.get("label_name") != null && !jsonObj.get("label_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_name").toString()));
      }
      if (jsonObj.get("label_value") != null && !jsonObj.get("label_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_value").toString()));
      }
      if (jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryComplexLabelRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryComplexLabelRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryComplexLabelRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryComplexLabelRule.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryComplexLabelRule>() {
           @Override
           public void write(JsonWriter out, QueryComplexLabelRule value) throws IOException {
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
           public QueryComplexLabelRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             QueryComplexLabelRule instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of QueryComplexLabelRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryComplexLabelRule
  * @throws IOException if the JSON string is invalid with respect to QueryComplexLabelRule
  */
  public static QueryComplexLabelRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryComplexLabelRule.class);
  }

 /**
  * Convert an instance of QueryComplexLabelRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

