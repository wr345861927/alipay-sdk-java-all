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
import com.alipay.v3.model.GavintestNewLeveaOne;
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
 * GavintestNewonline
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GavintestNewonline {
  public static final String SERIALIZED_NAME_DEM = "dem";
  @SerializedName(SERIALIZED_NAME_DEM)
  private List<String> dem = null;

  public static final String SERIALIZED_NAME_STRING = "string";
  @SerializedName(SERIALIZED_NAME_STRING)
  private GavintestNewLeveaOne string;

  public GavintestNewonline() { 
  }

  public GavintestNewonline dem(List<String> dem) {
    
    this.dem = dem;
    return this;
  }

  public GavintestNewonline addDemItem(String demItem) {
    if (this.dem == null) {
      this.dem = new ArrayList<>();
    }
    this.dem.add(demItem);
    return this;
  }

   /**
   * 1
   * @return dem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21", value = "1")

  public List<String> getDem() {
    return dem;
  }


  public void setDem(List<String> dem) {
    this.dem = dem;
  }


  public GavintestNewonline string(GavintestNewLeveaOne string) {
    
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GavintestNewLeveaOne getString() {
    return string;
  }


  public void setString(GavintestNewLeveaOne string) {
    this.string = string;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GavintestNewonline gavintestNewonline = (GavintestNewonline) o;
    return Objects.equals(this.dem, gavintestNewonline.dem) &&
        Objects.equals(this.string, gavintestNewonline.string);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dem, string);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GavintestNewonline {\n");
    sb.append("    dem: ").append(toIndentedString(dem)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
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
    openapiFields.add("dem");
    openapiFields.add("string");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GavintestNewonline
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GavintestNewonline.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GavintestNewonline is not found in the empty JSON string", GavintestNewonline.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GavintestNewonline.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GavintestNewonline` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("dem") != null && !jsonObj.get("dem").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dem` to be an array in the JSON string but got `%s`", jsonObj.get("dem").toString()));
      }
      // validate the optional field `string`
      if (jsonObj.getAsJsonObject("string") != null) {
        GavintestNewLeveaOne.validateJsonObject(jsonObj.getAsJsonObject("string"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GavintestNewonline.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GavintestNewonline' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GavintestNewonline> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GavintestNewonline.class));

       return (TypeAdapter<T>) new TypeAdapter<GavintestNewonline>() {
           @Override
           public void write(JsonWriter out, GavintestNewonline value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GavintestNewonline read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GavintestNewonline given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GavintestNewonline
  * @throws IOException if the JSON string is invalid with respect to GavintestNewonline
  */
  public static GavintestNewonline fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GavintestNewonline.class);
  }

 /**
  * Convert an instance of GavintestNewonline to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

