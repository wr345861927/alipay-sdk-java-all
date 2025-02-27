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
 * FixVoucher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FixVoucher {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_FLOOR_AMOUNT = "floor_amount";
  @SerializedName(SERIALIZED_NAME_FLOOR_AMOUNT)
  private String floorAmount;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public FixVoucher() { 
  }

  public FixVoucher amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 面额，每张代金券可以抵扣的金额。
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "面额，每张代金券可以抵扣的金额。")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public FixVoucher floorAmount(String floorAmount) {
    
    this.floorAmount = floorAmount;
    return this;
  }

   /**
   * 门槛金额。该字段不填写，认为无门槛。
   * @return floorAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门槛金额。该字段不填写，认为无门槛。")

  public String getFloorAmount() {
    return floorAmount;
  }


  public void setFloorAmount(String floorAmount) {
    this.floorAmount = floorAmount;
  }


  public FixVoucher goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商品名称。
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品名称。")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixVoucher fixVoucher = (FixVoucher) o;
    return Objects.equals(this.amount, fixVoucher.amount) &&
        Objects.equals(this.floorAmount, fixVoucher.floorAmount) &&
        Objects.equals(this.goodsName, fixVoucher.goodsName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, floorAmount, goodsName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixVoucher {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    floorAmount: ").append(toIndentedString(floorAmount)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("floor_amount");
    openapiFields.add("goods_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FixVoucher
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FixVoucher.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FixVoucher is not found in the empty JSON string", FixVoucher.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FixVoucher.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FixVoucher` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("floor_amount") != null && !jsonObj.get("floor_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floor_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floor_amount").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FixVoucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FixVoucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FixVoucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FixVoucher.class));

       return (TypeAdapter<T>) new TypeAdapter<FixVoucher>() {
           @Override
           public void write(JsonWriter out, FixVoucher value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FixVoucher read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FixVoucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FixVoucher
  * @throws IOException if the JSON string is invalid with respect to FixVoucher
  */
  public static FixVoucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FixVoucher.class);
  }

 /**
  * Convert an instance of FixVoucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

