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
 * AlipayOpenSearchBoxactivityBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchBoxactivityBatchqueryModel {
  public static final String SERIALIZED_NAME_BOX_ID = "box_id";
  @SerializedName(SERIALIZED_NAME_BOX_ID)
  private String boxId;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "page_number";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public AlipayOpenSearchBoxactivityBatchqueryModel() { 
  }

  public AlipayOpenSearchBoxactivityBatchqueryModel boxId(String boxId) {
    
    this.boxId = boxId;
    return this;
  }

   /**
   * 搜索直达id
   * @return boxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211130000000100415", value = "搜索直达id")

  public String getBoxId() {
    return boxId;
  }


  public void setBoxId(String boxId) {
    this.boxId = boxId;
  }


  public AlipayOpenSearchBoxactivityBatchqueryModel merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\&quot;运营支付宝小程序\&quot;授权。
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxxxxx", value = "商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\"运营支付宝小程序\"授权。")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public AlipayOpenSearchBoxactivityBatchqueryModel pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * 分页查询的当前页号,从1开始
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "分页查询的当前页号,从1开始")

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public AlipayOpenSearchBoxactivityBatchqueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页查询的数量，默认10，不超过50
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "每页查询的数量，默认10，不超过50")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSearchBoxactivityBatchqueryModel alipayOpenSearchBoxactivityBatchqueryModel = (AlipayOpenSearchBoxactivityBatchqueryModel) o;
    return Objects.equals(this.boxId, alipayOpenSearchBoxactivityBatchqueryModel.boxId) &&
        Objects.equals(this.merchantId, alipayOpenSearchBoxactivityBatchqueryModel.merchantId) &&
        Objects.equals(this.pageNumber, alipayOpenSearchBoxactivityBatchqueryModel.pageNumber) &&
        Objects.equals(this.pageSize, alipayOpenSearchBoxactivityBatchqueryModel.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxId, merchantId, pageNumber, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchBoxactivityBatchqueryModel {\n");
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("box_id");
    openapiFields.add("merchant_id");
    openapiFields.add("page_number");
    openapiFields.add("page_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchBoxactivityBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchBoxactivityBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchBoxactivityBatchqueryModel is not found in the empty JSON string", AlipayOpenSearchBoxactivityBatchqueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSearchBoxactivityBatchqueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSearchBoxactivityBatchqueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("box_id") != null && !jsonObj.get("box_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_id").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchBoxactivityBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchBoxactivityBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchBoxactivityBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchBoxactivityBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchBoxactivityBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchBoxactivityBatchqueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSearchBoxactivityBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSearchBoxactivityBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchBoxactivityBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchBoxactivityBatchqueryModel
  */
  public static AlipayOpenSearchBoxactivityBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchBoxactivityBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchBoxactivityBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

