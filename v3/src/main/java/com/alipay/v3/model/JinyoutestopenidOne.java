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
 * JinyoutestopenidOne
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JinyoutestopenidOne {
  public static final String SERIALIZED_NAME_C1 = "c_1";
  @SerializedName(SERIALIZED_NAME_C1)
  private String c1;

  public static final String SERIALIZED_NAME_Q = "q";
  @SerializedName(SERIALIZED_NAME_Q)
  private String q;

  public static final String SERIALIZED_NAME_Q1_OPEN_ID = "q_1_open_id";
  @SerializedName(SERIALIZED_NAME_Q1_OPEN_ID)
  private String q1OpenId;

  public JinyoutestopenidOne() { 
  }

  public JinyoutestopenidOne c1(String c1) {
    
    this.c1 = c1;
    return this;
  }

   /**
   * 我晚点
   * @return c1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "我晚点")

  public String getC1() {
    return c1;
  }


  public void setC1(String c1) {
    this.c1 = c1;
  }


  public JinyoutestopenidOne q(String q) {
    
    this.q = q;
    return this;
  }

   /**
   * 1
   * @return q
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "1")

  public String getQ() {
    return q;
  }


  public void setQ(String q) {
    this.q = q;
  }


  public JinyoutestopenidOne q1OpenId(String q1OpenId) {
    
    this.q1OpenId = q1OpenId;
    return this;
  }

   /**
   * 1
   * @return q1OpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "1")

  public String getQ1OpenId() {
    return q1OpenId;
  }


  public void setQ1OpenId(String q1OpenId) {
    this.q1OpenId = q1OpenId;
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
   * @return the JinyoutestopenidOne instance itself
   */
  public JinyoutestopenidOne putAdditionalProperty(String key, Object value) {
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
    JinyoutestopenidOne jinyoutestopenidOne = (JinyoutestopenidOne) o;
    return Objects.equals(this.c1, jinyoutestopenidOne.c1) &&
        Objects.equals(this.q, jinyoutestopenidOne.q) &&
        Objects.equals(this.q1OpenId, jinyoutestopenidOne.q1OpenId)&&
        Objects.equals(this.additionalProperties, jinyoutestopenidOne.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c1, q, q1OpenId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JinyoutestopenidOne {\n");
    sb.append("    c1: ").append(toIndentedString(c1)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    q1OpenId: ").append(toIndentedString(q1OpenId)).append("\n");
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
    openapiFields.add("c_1");
    openapiFields.add("q");
    openapiFields.add("q_1_open_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JinyoutestopenidOne
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JinyoutestopenidOne.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JinyoutestopenidOne is not found in the empty JSON string", JinyoutestopenidOne.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("c_1") != null && !jsonObj.get("c_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `c_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("c_1").toString()));
      }
      if (jsonObj.get("q") != null && !jsonObj.get("q").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `q` to be a primitive type in the JSON string but got `%s`", jsonObj.get("q").toString()));
      }
      if (jsonObj.get("q_1_open_id") != null && !jsonObj.get("q_1_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `q_1_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("q_1_open_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JinyoutestopenidOne.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JinyoutestopenidOne' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JinyoutestopenidOne> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JinyoutestopenidOne.class));

       return (TypeAdapter<T>) new TypeAdapter<JinyoutestopenidOne>() {
           @Override
           public void write(JsonWriter out, JinyoutestopenidOne value) throws IOException {
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
           public JinyoutestopenidOne read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JinyoutestopenidOne instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JinyoutestopenidOne given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JinyoutestopenidOne
  * @throws IOException if the JSON string is invalid with respect to JinyoutestopenidOne
  */
  public static JinyoutestopenidOne fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JinyoutestopenidOne.class);
  }

 /**
  * Convert an instance of JinyoutestopenidOne to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

