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
 * ConsumerNotifyIstd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsumerNotifyIstd {
  public static final String SERIALIZED_NAME_GOODS_COUNT = "goods_count";
  @SerializedName(SERIALIZED_NAME_GOODS_COUNT)
  private Integer goodsCount;

  public static final String SERIALIZED_NAME_GOODS_IMG = "goods_img";
  @SerializedName(SERIALIZED_NAME_GOODS_IMG)
  private String goodsImg;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public static final String SERIALIZED_NAME_MERCHANT_MOBILE = "merchant_mobile";
  @SerializedName(SERIALIZED_NAME_MERCHANT_MOBILE)
  private String merchantMobile;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_TINY_APP_ID = "tiny_app_id";
  @SerializedName(SERIALIZED_NAME_TINY_APP_ID)
  private String tinyAppId;

  public static final String SERIALIZED_NAME_TINY_APP_URL = "tiny_app_url";
  @SerializedName(SERIALIZED_NAME_TINY_APP_URL)
  private String tinyAppUrl;

  public ConsumerNotifyIstd() { 
  }

  public ConsumerNotifyIstd goodsCount(Integer goodsCount) {
    
    this.goodsCount = goodsCount;
    return this;
  }

   /**
   * 商品数量
   * @return goodsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品数量")

  public Integer getGoodsCount() {
    return goodsCount;
  }


  public void setGoodsCount(Integer goodsCount) {
    this.goodsCount = goodsCount;
  }


  public ConsumerNotifyIstd goodsImg(String goodsImg) {
    
    this.goodsImg = goodsImg;
    return this;
  }

   /**
   * 商品缩略图url，支持格式：bmp、jpg、jpeg、png、gif
   * @return goodsImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品缩略图url，支持格式：bmp、jpg、jpeg、png、gif")

  public String getGoodsImg() {
    return goodsImg;
  }


  public void setGoodsImg(String goodsImg) {
    this.goodsImg = goodsImg;
  }


  public ConsumerNotifyIstd goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商品名称
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品名称")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public ConsumerNotifyIstd merchantMobile(String merchantMobile) {
    
    this.merchantMobile = merchantMobile;
    return this;
  }

   /**
   * 商家电话
   * @return merchantMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家电话")

  public String getMerchantMobile() {
    return merchantMobile;
  }


  public void setMerchantMobile(String merchantMobile) {
    this.merchantMobile = merchantMobile;
  }


  public ConsumerNotifyIstd merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * 商家名称，tiny_app_id和merchant_name不能同时为空
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家名称，tiny_app_id和merchant_name不能同时为空")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public ConsumerNotifyIstd tinyAppId(String tinyAppId) {
    
    this.tinyAppId = tinyAppId;
    return this;
  }

   /**
   * 商家小程序appid
   * @return tinyAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家小程序appid")

  public String getTinyAppId() {
    return tinyAppId;
  }


  public void setTinyAppId(String tinyAppId) {
    this.tinyAppId = tinyAppId;
  }


  public ConsumerNotifyIstd tinyAppUrl(String tinyAppUrl) {
    
    this.tinyAppUrl = tinyAppUrl;
    return this;
  }

   /**
   * 商家小程序的路径，建议为订单页面
   * @return tinyAppUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家小程序的路径，建议为订单页面")

  public String getTinyAppUrl() {
    return tinyAppUrl;
  }


  public void setTinyAppUrl(String tinyAppUrl) {
    this.tinyAppUrl = tinyAppUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerNotifyIstd consumerNotifyIstd = (ConsumerNotifyIstd) o;
    return Objects.equals(this.goodsCount, consumerNotifyIstd.goodsCount) &&
        Objects.equals(this.goodsImg, consumerNotifyIstd.goodsImg) &&
        Objects.equals(this.goodsName, consumerNotifyIstd.goodsName) &&
        Objects.equals(this.merchantMobile, consumerNotifyIstd.merchantMobile) &&
        Objects.equals(this.merchantName, consumerNotifyIstd.merchantName) &&
        Objects.equals(this.tinyAppId, consumerNotifyIstd.tinyAppId) &&
        Objects.equals(this.tinyAppUrl, consumerNotifyIstd.tinyAppUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsCount, goodsImg, goodsName, merchantMobile, merchantName, tinyAppId, tinyAppUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerNotifyIstd {\n");
    sb.append("    goodsCount: ").append(toIndentedString(goodsCount)).append("\n");
    sb.append("    goodsImg: ").append(toIndentedString(goodsImg)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
    sb.append("    merchantMobile: ").append(toIndentedString(merchantMobile)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    tinyAppId: ").append(toIndentedString(tinyAppId)).append("\n");
    sb.append("    tinyAppUrl: ").append(toIndentedString(tinyAppUrl)).append("\n");
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
    openapiFields.add("goods_count");
    openapiFields.add("goods_img");
    openapiFields.add("goods_name");
    openapiFields.add("merchant_mobile");
    openapiFields.add("merchant_name");
    openapiFields.add("tiny_app_id");
    openapiFields.add("tiny_app_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsumerNotifyIstd
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConsumerNotifyIstd.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsumerNotifyIstd is not found in the empty JSON string", ConsumerNotifyIstd.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsumerNotifyIstd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsumerNotifyIstd` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("goods_img") != null && !jsonObj.get("goods_img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_img").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
      if (jsonObj.get("merchant_mobile") != null && !jsonObj.get("merchant_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_mobile").toString()));
      }
      if (jsonObj.get("merchant_name") != null && !jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      if (jsonObj.get("tiny_app_id") != null && !jsonObj.get("tiny_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tiny_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tiny_app_id").toString()));
      }
      if (jsonObj.get("tiny_app_url") != null && !jsonObj.get("tiny_app_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tiny_app_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tiny_app_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsumerNotifyIstd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsumerNotifyIstd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsumerNotifyIstd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsumerNotifyIstd.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsumerNotifyIstd>() {
           @Override
           public void write(JsonWriter out, ConsumerNotifyIstd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsumerNotifyIstd read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsumerNotifyIstd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsumerNotifyIstd
  * @throws IOException if the JSON string is invalid with respect to ConsumerNotifyIstd
  */
  public static ConsumerNotifyIstd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsumerNotifyIstd.class);
  }

 /**
  * Convert an instance of ConsumerNotifyIstd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

