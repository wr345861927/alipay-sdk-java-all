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
 * VoucherDescDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherDescDetail {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<String> details = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<String> images = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public VoucherDescDetail() { 
  }

  public VoucherDescDetail details(List<String> details) {
    
    this.details = details;
    return this;
  }

  public VoucherDescDetail addDetailsItem(String detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * 具体描述信息列表
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "周一到周五可用", value = "具体描述信息列表")

  public List<String> getDetails() {
    return details;
  }


  public void setDetails(List<String> details) {
    this.details = details;
  }


  public VoucherDescDetail images(List<String> images) {
    
    this.images = images;
    return this;
  }

  public VoucherDescDetail addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * 图片描述信息
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://dl.django.t.taobao.com/rest/1.0/image?fileIds=RY7twkJVR26nz8OeXRIjvAAAACMAAQED&zoom=original", value = "图片描述信息")

  public List<String> getImages() {
    return images;
  }


  public void setImages(List<String> images) {
    this.images = images;
  }


  public VoucherDescDetail title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 券说明的标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "温馨提示", value = "券说明的标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public VoucherDescDetail url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 券外部详情描述
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "www.alipay.com", value = "券外部详情描述")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherDescDetail voucherDescDetail = (VoucherDescDetail) o;
    return Objects.equals(this.details, voucherDescDetail.details) &&
        Objects.equals(this.images, voucherDescDetail.images) &&
        Objects.equals(this.title, voucherDescDetail.title) &&
        Objects.equals(this.url, voucherDescDetail.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, images, title, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherDescDetail {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("details");
    openapiFields.add("images");
    openapiFields.add("title");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherDescDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherDescDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherDescDetail is not found in the empty JSON string", VoucherDescDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherDescDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherDescDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be an array in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherDescDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherDescDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherDescDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherDescDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherDescDetail>() {
           @Override
           public void write(JsonWriter out, VoucherDescDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherDescDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherDescDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherDescDetail
  * @throws IOException if the JSON string is invalid with respect to VoucherDescDetail
  */
  public static VoucherDescDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherDescDetail.class);
  }

 /**
  * Convert an instance of VoucherDescDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

