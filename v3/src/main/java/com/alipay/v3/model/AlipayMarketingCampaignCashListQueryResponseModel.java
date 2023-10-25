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
import com.alipay.v3.model.CashCampaignInfo;
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
 * AlipayMarketingCampaignCashListQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCampaignCashListQueryResponseModel {
  public static final String SERIALIZED_NAME_CAMP_LIST = "camp_list";
  @SerializedName(SERIALIZED_NAME_CAMP_LIST)
  private List<CashCampaignInfo> campList = null;

  public static final String SERIALIZED_NAME_PAGE_INDEX = "page_index";
  @SerializedName(SERIALIZED_NAME_PAGE_INDEX)
  private String pageIndex;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private String totalSize;

  public AlipayMarketingCampaignCashListQueryResponseModel() { 
  }

  public AlipayMarketingCampaignCashListQueryResponseModel campList(List<CashCampaignInfo> campList) {
    
    this.campList = campList;
    return this;
  }

  public AlipayMarketingCampaignCashListQueryResponseModel addCampListItem(CashCampaignInfo campListItem) {
    if (this.campList == null) {
      this.campList = new ArrayList<>();
    }
    this.campList.add(campListItem);
    return this;
  }

   /**
   * 活动列表
   * @return campList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "活动列表")

  public List<CashCampaignInfo> getCampList() {
    return campList;
  }


  public void setCampList(List<CashCampaignInfo> campList) {
    this.campList = campList;
  }


  public AlipayMarketingCampaignCashListQueryResponseModel pageIndex(String pageIndex) {
    
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * 分页的页码,起始从1开始
   * @return pageIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "分页的页码,起始从1开始")

  public String getPageIndex() {
    return pageIndex;
  }


  public void setPageIndex(String pageIndex) {
    this.pageIndex = pageIndex;
  }


  public AlipayMarketingCampaignCashListQueryResponseModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页每页大小
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "分页每页大小")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayMarketingCampaignCashListQueryResponseModel totalSize(String totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * 活动总个数
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "活动总个数")

  public String getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(String totalSize) {
    this.totalSize = totalSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCampaignCashListQueryResponseModel alipayMarketingCampaignCashListQueryResponseModel = (AlipayMarketingCampaignCashListQueryResponseModel) o;
    return Objects.equals(this.campList, alipayMarketingCampaignCashListQueryResponseModel.campList) &&
        Objects.equals(this.pageIndex, alipayMarketingCampaignCashListQueryResponseModel.pageIndex) &&
        Objects.equals(this.pageSize, alipayMarketingCampaignCashListQueryResponseModel.pageSize) &&
        Objects.equals(this.totalSize, alipayMarketingCampaignCashListQueryResponseModel.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campList, pageIndex, pageSize, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCampaignCashListQueryResponseModel {\n");
    sb.append("    campList: ").append(toIndentedString(campList)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
    openapiFields.add("camp_list");
    openapiFields.add("page_index");
    openapiFields.add("page_size");
    openapiFields.add("total_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCampaignCashListQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCampaignCashListQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCampaignCashListQueryResponseModel is not found in the empty JSON string", AlipayMarketingCampaignCashListQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCampaignCashListQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCampaignCashListQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycampList = jsonObj.getAsJsonArray("camp_list");
      if (jsonArraycampList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("camp_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `camp_list` to be an array in the JSON string but got `%s`", jsonObj.get("camp_list").toString()));
        }

        // validate the optional field `camp_list` (array)
        for (int i = 0; i < jsonArraycampList.size(); i++) {
          CashCampaignInfo.validateJsonObject(jsonArraycampList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("page_index") != null && !jsonObj.get("page_index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_index").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      if (jsonObj.get("total_size") != null && !jsonObj.get("total_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCampaignCashListQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCampaignCashListQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCampaignCashListQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCampaignCashListQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCampaignCashListQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCampaignCashListQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCampaignCashListQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCampaignCashListQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCampaignCashListQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCampaignCashListQueryResponseModel
  */
  public static AlipayMarketingCampaignCashListQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCampaignCashListQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCampaignCashListQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

