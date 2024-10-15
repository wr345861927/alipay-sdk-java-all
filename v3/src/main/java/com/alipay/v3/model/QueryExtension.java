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
import com.alipay.v3.model.ExtensionArea;
import com.alipay.v3.model.QueryLabelRule;
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
 * QueryExtension
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryExtension {
  public static final String SERIALIZED_NAME_AREAS = "areas";
  @SerializedName(SERIALIZED_NAME_AREAS)
  private List<ExtensionArea> areas = null;

  public static final String SERIALIZED_NAME_EXTENSION_KEY = "extension_key";
  @SerializedName(SERIALIZED_NAME_EXTENSION_KEY)
  private String extensionKey;

  public static final String SERIALIZED_NAME_LABEL_RULES = "label_rules";
  @SerializedName(SERIALIZED_NAME_LABEL_RULES)
  private List<QueryLabelRule> labelRules = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public QueryExtension() { 
  }

  public QueryExtension areas(List<ExtensionArea> areas) {
    
    this.areas = areas;
    return this;
  }

  public QueryExtension addAreasItem(ExtensionArea areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<>();
    }
    this.areas.add(areasItem);
    return this;
  }

   /**
   * 扩展区列表
   * @return areas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展区列表")

  public List<ExtensionArea> getAreas() {
    return areas;
  }


  public void setAreas(List<ExtensionArea> areas) {
    this.areas = areas;
  }


  public QueryExtension extensionKey(String extensionKey) {
    
    this.extensionKey = extensionKey;
    return this;
  }

   /**
   * 扩展区套id
   * @return extensionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013121100055552_7c3cb211-e239-42c0-abb0-fe80d02cfe51", value = "扩展区套id")

  public String getExtensionKey() {
    return extensionKey;
  }


  public void setExtensionKey(String extensionKey) {
    this.extensionKey = extensionKey;
  }


  public QueryExtension labelRules(List<QueryLabelRule> labelRules) {
    
    this.labelRules = labelRules;
    return this;
  }

  public QueryExtension addLabelRulesItem(QueryLabelRule labelRulesItem) {
    if (this.labelRules == null) {
      this.labelRules = new ArrayList<>();
    }
    this.labelRules.add(labelRulesItem);
    return this;
  }

   /**
   * 标签规则列表
   * @return labelRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签规则列表")

  public List<QueryLabelRule> getLabelRules() {
    return labelRules;
  }


  public void setLabelRules(List<QueryLabelRule> labelRules) {
    this.labelRules = labelRules;
  }


  public QueryExtension status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 扩展区状态，\&quot;ON\&quot;代表上线，\&quot;OFF\&quot;代表下线，只有上线的扩展区才能被用户看到
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ON", value = "扩展区状态，\"ON\"代表上线，\"OFF\"代表下线，只有上线的扩展区才能被用户看到")

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
   * @return the QueryExtension instance itself
   */
  public QueryExtension putAdditionalProperty(String key, Object value) {
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
    QueryExtension queryExtension = (QueryExtension) o;
    return Objects.equals(this.areas, queryExtension.areas) &&
        Objects.equals(this.extensionKey, queryExtension.extensionKey) &&
        Objects.equals(this.labelRules, queryExtension.labelRules) &&
        Objects.equals(this.status, queryExtension.status)&&
        Objects.equals(this.additionalProperties, queryExtension.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areas, extensionKey, labelRules, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryExtension {\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    extensionKey: ").append(toIndentedString(extensionKey)).append("\n");
    sb.append("    labelRules: ").append(toIndentedString(labelRules)).append("\n");
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
    openapiFields.add("areas");
    openapiFields.add("extension_key");
    openapiFields.add("label_rules");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueryExtension
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueryExtension.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryExtension is not found in the empty JSON string", QueryExtension.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayareas = jsonObj.getAsJsonArray("areas");
      if (jsonArrayareas != null) {
        // ensure the json data is an array
        if (!jsonObj.get("areas").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `areas` to be an array in the JSON string but got `%s`", jsonObj.get("areas").toString()));
        }

        // validate the optional field `areas` (array)
        for (int i = 0; i < jsonArrayareas.size(); i++) {
          ExtensionArea.validateJsonObject(jsonArrayareas.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("extension_key") != null && !jsonObj.get("extension_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension_key").toString()));
      }
      JsonArray jsonArraylabelRules = jsonObj.getAsJsonArray("label_rules");
      if (jsonArraylabelRules != null) {
        // ensure the json data is an array
        if (!jsonObj.get("label_rules").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `label_rules` to be an array in the JSON string but got `%s`", jsonObj.get("label_rules").toString()));
        }

        // validate the optional field `label_rules` (array)
        for (int i = 0; i < jsonArraylabelRules.size(); i++) {
          QueryLabelRule.validateJsonObject(jsonArraylabelRules.get(i).getAsJsonObject());
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
       if (!QueryExtension.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryExtension' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryExtension> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryExtension.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryExtension>() {
           @Override
           public void write(JsonWriter out, QueryExtension value) throws IOException {
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
           public QueryExtension read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             QueryExtension instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of QueryExtension given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryExtension
  * @throws IOException if the JSON string is invalid with respect to QueryExtension
  */
  public static QueryExtension fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryExtension.class);
  }

 /**
  * Convert an instance of QueryExtension to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

