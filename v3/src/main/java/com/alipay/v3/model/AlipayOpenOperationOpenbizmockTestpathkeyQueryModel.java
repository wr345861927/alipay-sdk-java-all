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
 * AlipayOpenOperationOpenbizmockTestpathkeyQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenOperationOpenbizmockTestpathkeyQueryModel {
  public static final String SERIALIZED_NAME_D = "d";
  @SerializedName(SERIALIZED_NAME_D)
  private String d;

  public static final String SERIALIZED_NAME_E = "e";
  @SerializedName(SERIALIZED_NAME_E)
  private String e;

  public AlipayOpenOperationOpenbizmockTestpathkeyQueryModel() { 
  }

  public AlipayOpenOperationOpenbizmockTestpathkeyQueryModel d(String d) {
    
    this.d = d;
    return this;
  }

   /**
   * 4
   * @return d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d", value = "4")

  public String getD() {
    return d;
  }


  public void setD(String d) {
    this.d = d;
  }


  public AlipayOpenOperationOpenbizmockTestpathkeyQueryModel e(String e) {
    
    this.e = e;
    return this;
  }

   /**
   * 1
   * @return e
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "1")

  public String getE() {
    return e;
  }


  public void setE(String e) {
    this.e = e;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenOperationOpenbizmockTestpathkeyQueryModel alipayOpenOperationOpenbizmockTestpathkeyQueryModel = (AlipayOpenOperationOpenbizmockTestpathkeyQueryModel) o;
    return Objects.equals(this.d, alipayOpenOperationOpenbizmockTestpathkeyQueryModel.d) &&
        Objects.equals(this.e, alipayOpenOperationOpenbizmockTestpathkeyQueryModel.e);
  }

  @Override
  public int hashCode() {
    return Objects.hash(d, e);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenOperationOpenbizmockTestpathkeyQueryModel {\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
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
    openapiFields.add("d");
    openapiFields.add("e");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenOperationOpenbizmockTestpathkeyQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenOperationOpenbizmockTestpathkeyQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenOperationOpenbizmockTestpathkeyQueryModel is not found in the empty JSON string", AlipayOpenOperationOpenbizmockTestpathkeyQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenOperationOpenbizmockTestpathkeyQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenOperationOpenbizmockTestpathkeyQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("d") != null && !jsonObj.get("d").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `d` to be a primitive type in the JSON string but got `%s`", jsonObj.get("d").toString()));
      }
      if (jsonObj.get("e") != null && !jsonObj.get("e").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `e` to be a primitive type in the JSON string but got `%s`", jsonObj.get("e").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenOperationOpenbizmockTestpathkeyQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenOperationOpenbizmockTestpathkeyQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenOperationOpenbizmockTestpathkeyQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenOperationOpenbizmockTestpathkeyQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenOperationOpenbizmockTestpathkeyQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenOperationOpenbizmockTestpathkeyQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenOperationOpenbizmockTestpathkeyQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenOperationOpenbizmockTestpathkeyQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenOperationOpenbizmockTestpathkeyQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenOperationOpenbizmockTestpathkeyQueryModel
  */
  public static AlipayOpenOperationOpenbizmockTestpathkeyQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenOperationOpenbizmockTestpathkeyQueryModel.class);
  }

 /**
  * Convert an instance of AlipayOpenOperationOpenbizmockTestpathkeyQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

