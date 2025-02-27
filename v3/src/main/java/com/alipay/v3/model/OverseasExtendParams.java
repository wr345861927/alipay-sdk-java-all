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
 * OverseasExtendParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OverseasExtendParams {
  public static final String SERIALIZED_NAME_GOODS_DETAIL = "goods_detail";
  @SerializedName(SERIALIZED_NAME_GOODS_DETAIL)
  private String goodsDetail;

  public OverseasExtendParams() { 
  }

  public OverseasExtendParams goodsDetail(String goodsDetail) {
    
    this.goodsDetail = goodsDetail;
    return this;
  }

   /**
   * 商品明细列表
   * @return goodsDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\\\"goods_id\\\":\\\"001\\\",\\\"goods_amount\\\":\\\"100\\\"}]", value = "商品明细列表")

  public String getGoodsDetail() {
    return goodsDetail;
  }


  public void setGoodsDetail(String goodsDetail) {
    this.goodsDetail = goodsDetail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverseasExtendParams overseasExtendParams = (OverseasExtendParams) o;
    return Objects.equals(this.goodsDetail, overseasExtendParams.goodsDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverseasExtendParams {\n");
    sb.append("    goodsDetail: ").append(toIndentedString(goodsDetail)).append("\n");
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
    openapiFields.add("goods_detail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OverseasExtendParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OverseasExtendParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OverseasExtendParams is not found in the empty JSON string", OverseasExtendParams.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OverseasExtendParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OverseasExtendParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("goods_detail") != null && !jsonObj.get("goods_detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_detail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OverseasExtendParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OverseasExtendParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OverseasExtendParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OverseasExtendParams.class));

       return (TypeAdapter<T>) new TypeAdapter<OverseasExtendParams>() {
           @Override
           public void write(JsonWriter out, OverseasExtendParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OverseasExtendParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OverseasExtendParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OverseasExtendParams
  * @throws IOException if the JSON string is invalid with respect to OverseasExtendParams
  */
  public static OverseasExtendParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OverseasExtendParams.class);
  }

 /**
  * Convert an instance of OverseasExtendParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

