/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-05-20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.JinyoutestopenidOne;
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
 * JinyoutestopenidTwo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JinyoutestopenidTwo {
  public static final String SERIALIZED_NAME_A = "a";
  @SerializedName(SERIALIZED_NAME_A)
  private String a;

  public static final String SERIALIZED_NAME_B = "b";
  @SerializedName(SERIALIZED_NAME_B)
  private String b;

  public static final String SERIALIZED_NAME_B_OPEN_ID = "b_open_id";
  @SerializedName(SERIALIZED_NAME_B_OPEN_ID)
  private String bOpenId;

  public static final String SERIALIZED_NAME_F = "f";
  @SerializedName(SERIALIZED_NAME_F)
  private JinyoutestopenidOne f;

  public JinyoutestopenidTwo() { 
  }

  public JinyoutestopenidTwo a(String a) {
    
    this.a = a;
    return this;
  }

   /**
   * 无openid,有枚举值，有注意事项
   * @return a
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hjkhjc", value = "无openid,有枚举值，有注意事项")

  public String getA() {
    return a;
  }


  public void setA(String a) {
    this.a = a;
  }


  public JinyoutestopenidTwo b(String b) {
    
    this.b = b;
    return this;
  }

   /**
   * 有openid，无枚举值，无注意事项
   * @return b
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7878789", value = "有openid，无枚举值，无注意事项")

  public String getB() {
    return b;
  }


  public void setB(String b) {
    this.b = b;
  }


  public JinyoutestopenidTwo bOpenId(String bOpenId) {
    
    this.bOpenId = bOpenId;
    return this;
  }

   /**
   * 有openid，无枚举值，无注意事项,openid有注意事项
   * @return bOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "有openid，无枚举值，无注意事项,openid有注意事项")

  public String getbOpenId() {
    return bOpenId;
  }


  public void setbOpenId(String bOpenId) {
    this.bOpenId = bOpenId;
  }


  public JinyoutestopenidTwo f(JinyoutestopenidOne f) {
    
    this.f = f;
    return this;
  }

   /**
   * Get f
   * @return f
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JinyoutestopenidOne getF() {
    return f;
  }


  public void setF(JinyoutestopenidOne f) {
    this.f = f;
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
   * @return the JinyoutestopenidTwo instance itself
   */
  public JinyoutestopenidTwo putAdditionalProperty(String key, Object value) {
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
    JinyoutestopenidTwo jinyoutestopenidTwo = (JinyoutestopenidTwo) o;
    return Objects.equals(this.a, jinyoutestopenidTwo.a) &&
        Objects.equals(this.b, jinyoutestopenidTwo.b) &&
        Objects.equals(this.bOpenId, jinyoutestopenidTwo.bOpenId) &&
        Objects.equals(this.f, jinyoutestopenidTwo.f)&&
        Objects.equals(this.additionalProperties, jinyoutestopenidTwo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, b, bOpenId, f, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JinyoutestopenidTwo {\n");
    sb.append("    a: ").append(toIndentedString(a)).append("\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
    sb.append("    bOpenId: ").append(toIndentedString(bOpenId)).append("\n");
    sb.append("    f: ").append(toIndentedString(f)).append("\n");
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
    openapiFields.add("a");
    openapiFields.add("b");
    openapiFields.add("b_open_id");
    openapiFields.add("f");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JinyoutestopenidTwo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JinyoutestopenidTwo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JinyoutestopenidTwo is not found in the empty JSON string", JinyoutestopenidTwo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("a") != null && !jsonObj.get("a").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `a` to be a primitive type in the JSON string but got `%s`", jsonObj.get("a").toString()));
      }
      if (jsonObj.get("b") != null && !jsonObj.get("b").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `b` to be a primitive type in the JSON string but got `%s`", jsonObj.get("b").toString()));
      }
      if (jsonObj.get("b_open_id") != null && !jsonObj.get("b_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `b_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("b_open_id").toString()));
      }
      // validate the optional field `f`
      if (jsonObj.getAsJsonObject("f") != null) {
        JinyoutestopenidOne.validateJsonObject(jsonObj.getAsJsonObject("f"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JinyoutestopenidTwo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JinyoutestopenidTwo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JinyoutestopenidTwo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JinyoutestopenidTwo.class));

       return (TypeAdapter<T>) new TypeAdapter<JinyoutestopenidTwo>() {
           @Override
           public void write(JsonWriter out, JinyoutestopenidTwo value) throws IOException {
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
           public JinyoutestopenidTwo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JinyoutestopenidTwo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JinyoutestopenidTwo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JinyoutestopenidTwo
  * @throws IOException if the JSON string is invalid with respect to JinyoutestopenidTwo
  */
  public static JinyoutestopenidTwo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JinyoutestopenidTwo.class);
  }

 /**
  * Convert an instance of JinyoutestopenidTwo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

