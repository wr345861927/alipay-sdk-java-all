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
import com.alipay.v3.model.InstitutionBasicInfo;
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
 * AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel {
  public static final String SERIALIZED_NAME_INSTITUTION_BASIC_INFO_LIST = "institution_basic_info_list";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_BASIC_INFO_LIST)
  private List<InstitutionBasicInfo> institutionBasicInfoList = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private String pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_COUNT = "total_page_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_COUNT)
  private Integer totalPageCount;

  public AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel() { 
  }

  public AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel institutionBasicInfoList(List<InstitutionBasicInfo> institutionBasicInfoList) {
    
    this.institutionBasicInfoList = institutionBasicInfoList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel addInstitutionBasicInfoListItem(InstitutionBasicInfo institutionBasicInfoListItem) {
    if (this.institutionBasicInfoList == null) {
      this.institutionBasicInfoList = new ArrayList<>();
    }
    this.institutionBasicInfoList.add(institutionBasicInfoListItem);
    return this;
  }

   /**
   * 制度基本信息列表
   * @return institutionBasicInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "制度基本信息列表")

  public List<InstitutionBasicInfo> getInstitutionBasicInfoList() {
    return institutionBasicInfoList;
  }


  public void setInstitutionBasicInfoList(List<InstitutionBasicInfo> institutionBasicInfoList) {
    this.institutionBasicInfoList = institutionBasicInfoList;
  }


  public AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel pageNum(String pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 页码
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "页码")

  public String getPageNum() {
    return pageNum;
  }


  public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页大小
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "页大小")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel totalPageCount(Integer totalPageCount) {
    
    this.totalPageCount = totalPageCount;
    return this;
  }

   /**
   * 总页数
   * @return totalPageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "总页数")

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
    AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel alipayEbppInvoiceInstitutionPageinfoQueryResponseModel = (AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel) o;
    return Objects.equals(this.institutionBasicInfoList, alipayEbppInvoiceInstitutionPageinfoQueryResponseModel.institutionBasicInfoList) &&
        Objects.equals(this.pageNum, alipayEbppInvoiceInstitutionPageinfoQueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayEbppInvoiceInstitutionPageinfoQueryResponseModel.pageSize) &&
        Objects.equals(this.totalPageCount, alipayEbppInvoiceInstitutionPageinfoQueryResponseModel.totalPageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutionBasicInfoList, pageNum, pageSize, totalPageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel {\n");
    sb.append("    institutionBasicInfoList: ").append(toIndentedString(institutionBasicInfoList)).append("\n");
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
    openapiFields.add("institution_basic_info_list");
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
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel is not found in the empty JSON string", AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayinstitutionBasicInfoList = jsonObj.getAsJsonArray("institution_basic_info_list");
      if (jsonArrayinstitutionBasicInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("institution_basic_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `institution_basic_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("institution_basic_info_list").toString()));
        }

        // validate the optional field `institution_basic_info_list` (array)
        for (int i = 0; i < jsonArrayinstitutionBasicInfoList.size(); i++) {
          InstitutionBasicInfo.validateJsonObject(jsonArrayinstitutionBasicInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("page_num") != null && !jsonObj.get("page_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_num").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel
  */
  public static AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

