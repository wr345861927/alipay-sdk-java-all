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
 * MerchantMenber
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantMenber {
  public static final String SERIALIZED_NAME_BIRTH = "birth";
  @SerializedName(SERIALIZED_NAME_BIRTH)
  private String birth;

  public static final String SERIALIZED_NAME_CELL = "cell";
  @SerializedName(SERIALIZED_NAME_CELL)
  private String cell;

  public static final String SERIALIZED_NAME_GENDE = "gende";
  @SerializedName(SERIALIZED_NAME_GENDE)
  private String gende;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public MerchantMenber() { 
  }

  public MerchantMenber birth(String birth) {
    
    this.birth = birth;
    return this;
  }

   /**
   * 生日 yyyy-MM-dd
   * @return birth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-06-27", value = "生日 yyyy-MM-dd")

  public String getBirth() {
    return birth;
  }


  public void setBirth(String birth) {
    this.birth = birth;
  }


  public MerchantMenber cell(String cell) {
    
    this.cell = cell;
    return this;
  }

   /**
   * 手机号
   * @return cell
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13000000000", value = "手机号")

  public String getCell() {
    return cell;
  }


  public void setCell(String cell) {
    this.cell = cell;
  }


  public MerchantMenber gende(String gende) {
    
    this.gende = gende;
    return this;
  }

   /**
   * 性别
   * @return gende
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MALE", value = "性别")

  public String getGende() {
    return gende;
  }


  public void setGende(String gende) {
    this.gende = gende;
  }


  public MerchantMenber name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 姓名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "李洋", value = "姓名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
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
   * @return the MerchantMenber instance itself
   */
  public MerchantMenber putAdditionalProperty(String key, Object value) {
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
    MerchantMenber merchantMenber = (MerchantMenber) o;
    return Objects.equals(this.birth, merchantMenber.birth) &&
        Objects.equals(this.cell, merchantMenber.cell) &&
        Objects.equals(this.gende, merchantMenber.gende) &&
        Objects.equals(this.name, merchantMenber.name)&&
        Objects.equals(this.additionalProperties, merchantMenber.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birth, cell, gende, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantMenber {\n");
    sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
    sb.append("    cell: ").append(toIndentedString(cell)).append("\n");
    sb.append("    gende: ").append(toIndentedString(gende)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("birth");
    openapiFields.add("cell");
    openapiFields.add("gende");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantMenber
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantMenber.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantMenber is not found in the empty JSON string", MerchantMenber.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("birth") != null && !jsonObj.get("birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birth").toString()));
      }
      if (jsonObj.get("cell") != null && !jsonObj.get("cell").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cell` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cell").toString()));
      }
      if (jsonObj.get("gende") != null && !jsonObj.get("gende").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gende` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gende").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantMenber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantMenber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantMenber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantMenber.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantMenber>() {
           @Override
           public void write(JsonWriter out, MerchantMenber value) throws IOException {
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
           public MerchantMenber read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantMenber instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantMenber given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantMenber
  * @throws IOException if the JSON string is invalid with respect to MerchantMenber
  */
  public static MerchantMenber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantMenber.class);
  }

 /**
  * Convert an instance of MerchantMenber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

