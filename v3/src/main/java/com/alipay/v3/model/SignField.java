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
import com.alipay.v3.model.Signer;
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
 * SignField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignField {
  public static final String SERIALIZED_NAME_AUTO_EXECUTE = "auto_execute";
  @SerializedName(SERIALIZED_NAME_AUTO_EXECUTE)
  private String autoExecute;

  public static final String SERIALIZED_NAME_SIGNER = "signer";
  @SerializedName(SERIALIZED_NAME_SIGNER)
  private Signer signer;

  public static final String SERIALIZED_NAME_STRUCT_KEY = "struct_key";
  @SerializedName(SERIALIZED_NAME_STRUCT_KEY)
  private String structKey;

  public SignField() { 
  }

  public SignField autoExecute(String autoExecute) {
    
    this.autoExecute = autoExecute;
    return this;
  }

   /**
   * 平台自动签
   * @return autoExecute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "平台自动签")

  public String getAutoExecute() {
    return autoExecute;
  }


  public void setAutoExecute(String autoExecute) {
    this.autoExecute = autoExecute;
  }


  public SignField signer(Signer signer) {
    
    this.signer = signer;
    return this;
  }

   /**
   * Get signer
   * @return signer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Signer getSigner() {
    return signer;
  }


  public void setSigner(Signer signer) {
    this.signer = signer;
  }


  public SignField structKey(String structKey) {
    
    this.structKey = structKey;
    return this;
  }

   /**
   * 模板组件id
   * @return structKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18247776929e433784636126b33b08a3", value = "模板组件id")

  public String getStructKey() {
    return structKey;
  }


  public void setStructKey(String structKey) {
    this.structKey = structKey;
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
   * @return the SignField instance itself
   */
  public SignField putAdditionalProperty(String key, Object value) {
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
    SignField signField = (SignField) o;
    return Objects.equals(this.autoExecute, signField.autoExecute) &&
        Objects.equals(this.signer, signField.signer) &&
        Objects.equals(this.structKey, signField.structKey)&&
        Objects.equals(this.additionalProperties, signField.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoExecute, signer, structKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignField {\n");
    sb.append("    autoExecute: ").append(toIndentedString(autoExecute)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    structKey: ").append(toIndentedString(structKey)).append("\n");
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
    openapiFields.add("auto_execute");
    openapiFields.add("signer");
    openapiFields.add("struct_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SignField.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignField is not found in the empty JSON string", SignField.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("auto_execute") != null && !jsonObj.get("auto_execute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auto_execute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auto_execute").toString()));
      }
      // validate the optional field `signer`
      if (jsonObj.getAsJsonObject("signer") != null) {
        Signer.validateJsonObject(jsonObj.getAsJsonObject("signer"));
      }
      if (jsonObj.get("struct_key") != null && !jsonObj.get("struct_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `struct_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("struct_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignField.class));

       return (TypeAdapter<T>) new TypeAdapter<SignField>() {
           @Override
           public void write(JsonWriter out, SignField value) throws IOException {
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
           public SignField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignField instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SignField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignField
  * @throws IOException if the JSON string is invalid with respect to SignField
  */
  public static SignField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignField.class);
  }

 /**
  * Convert an instance of SignField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

