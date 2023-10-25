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
 * AlipaySecurityProdTianwutestModifyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipaySecurityProdTianwutestModifyResponseModel {
  public static final String SERIALIZED_NAME_CESHI = "ceshi";
  @SerializedName(SERIALIZED_NAME_CESHI)
  private String ceshi;

  public AlipaySecurityProdTianwutestModifyResponseModel() { 
  }

  public AlipaySecurityProdTianwutestModifyResponseModel ceshi(String ceshi) {
    
    this.ceshi = ceshi;
    return this;
  }

   /**
   * 测试
   * @return ceshi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test", value = "测试")

  public String getCeshi() {
    return ceshi;
  }


  public void setCeshi(String ceshi) {
    this.ceshi = ceshi;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipaySecurityProdTianwutestModifyResponseModel alipaySecurityProdTianwutestModifyResponseModel = (AlipaySecurityProdTianwutestModifyResponseModel) o;
    return Objects.equals(this.ceshi, alipaySecurityProdTianwutestModifyResponseModel.ceshi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ceshi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipaySecurityProdTianwutestModifyResponseModel {\n");
    sb.append("    ceshi: ").append(toIndentedString(ceshi)).append("\n");
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
    openapiFields.add("ceshi");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipaySecurityProdTianwutestModifyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipaySecurityProdTianwutestModifyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipaySecurityProdTianwutestModifyResponseModel is not found in the empty JSON string", AlipaySecurityProdTianwutestModifyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipaySecurityProdTianwutestModifyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipaySecurityProdTianwutestModifyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ceshi") != null && !jsonObj.get("ceshi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ceshi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ceshi").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipaySecurityProdTianwutestModifyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipaySecurityProdTianwutestModifyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipaySecurityProdTianwutestModifyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipaySecurityProdTianwutestModifyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipaySecurityProdTianwutestModifyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipaySecurityProdTianwutestModifyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipaySecurityProdTianwutestModifyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipaySecurityProdTianwutestModifyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipaySecurityProdTianwutestModifyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipaySecurityProdTianwutestModifyResponseModel
  */
  public static AlipaySecurityProdTianwutestModifyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipaySecurityProdTianwutestModifyResponseModel.class);
  }

 /**
  * Convert an instance of AlipaySecurityProdTianwutestModifyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

