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
 * AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel {
  public static final String SERIALIZED_NAME_ADAPTER_TYPE = "adapter_type";
  @SerializedName(SERIALIZED_NAME_ADAPTER_TYPE)
  private String adapterType;

  public static final String SERIALIZED_NAME_ONWER_OPEN_ID_LIST = "onwer_open_id_list";
  @SerializedName(SERIALIZED_NAME_ONWER_OPEN_ID_LIST)
  private List<String> onwerOpenIdList = null;

  public static final String SERIALIZED_NAME_OWNER_ID_LIST = "owner_id_list";
  @SerializedName(SERIALIZED_NAME_OWNER_ID_LIST)
  private List<String> ownerIdList = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_COUNT = "total_page_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_COUNT)
  private Integer totalPageCount;

  public AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel() { 
  }

  public AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel adapterType(String adapterType) {
    
    this.adapterType = adapterType;
    return this;
  }

   /**
   * 制度适用范围类型
   * @return adapterType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EMPLOYEE_ALL", value = "制度适用范围类型")

  public String getAdapterType() {
    return adapterType;
  }


  public void setAdapterType(String adapterType) {
    this.adapterType = adapterType;
  }


  public AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel onwerOpenIdList(List<String> onwerOpenIdList) {
    
    this.onwerOpenIdList = onwerOpenIdList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel addOnwerOpenIdListItem(String onwerOpenIdListItem) {
    if (this.onwerOpenIdList == null) {
      this.onwerOpenIdList = new ArrayList<>();
    }
    this.onwerOpenIdList.add(onwerOpenIdListItem);
    return this;
  }

   /**
   * 适配开放id列表
   * @return onwerOpenIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"asdfxxxx\"]", value = "适配开放id列表")

  public List<String> getOnwerOpenIdList() {
    return onwerOpenIdList;
  }


  public void setOnwerOpenIdList(List<String> onwerOpenIdList) {
    this.onwerOpenIdList = onwerOpenIdList;
  }


  public AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel ownerIdList(List<String> ownerIdList) {
    
    this.ownerIdList = ownerIdList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel addOwnerIdListItem(String ownerIdListItem) {
    if (this.ownerIdList == null) {
      this.ownerIdList = new ArrayList<>();
    }
    this.ownerIdList.add(ownerIdListItem);
    return this;
  }

   /**
   * 适配id列表
   * @return ownerIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2288078000164693\"]", value = "适配id列表")

  public List<String> getOwnerIdList() {
    return ownerIdList;
  }


  public void setOwnerIdList(List<String> ownerIdList) {
    this.ownerIdList = ownerIdList;
  }


  public AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 页码
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "页码")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页大小
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "页大小")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel totalPageCount(Integer totalPageCount) {
    
    this.totalPageCount = totalPageCount;
    return this;
  }

   /**
   * 总页数
   * @return totalPageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "总页数")

  public Integer getTotalPageCount() {
    return totalPageCount;
  }


  public void setTotalPageCount(Integer totalPageCount) {
    this.totalPageCount = totalPageCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel alipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel = (AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel) o;
    return Objects.equals(this.adapterType, alipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.adapterType) &&
        Objects.equals(this.onwerOpenIdList, alipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.onwerOpenIdList) &&
        Objects.equals(this.ownerIdList, alipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.ownerIdList) &&
        Objects.equals(this.pageNum, alipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.pageSize) &&
        Objects.equals(this.totalPageCount, alipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.totalPageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adapterType, onwerOpenIdList, ownerIdList, pageNum, pageSize, totalPageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel {\n");
    sb.append("    adapterType: ").append(toIndentedString(adapterType)).append("\n");
    sb.append("    onwerOpenIdList: ").append(toIndentedString(onwerOpenIdList)).append("\n");
    sb.append("    ownerIdList: ").append(toIndentedString(ownerIdList)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalPageCount: ").append(toIndentedString(totalPageCount)).append("\n");
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
    openapiFields.add("adapter_type");
    openapiFields.add("onwer_open_id_list");
    openapiFields.add("owner_id_list");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("total_page_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel is not found in the empty JSON string", AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("adapter_type") != null && !jsonObj.get("adapter_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adapter_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adapter_type").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("onwer_open_id_list") != null && !jsonObj.get("onwer_open_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `onwer_open_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("onwer_open_id_list").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("owner_id_list") != null && !jsonObj.get("owner_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("owner_id_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel
  */
  public static AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

