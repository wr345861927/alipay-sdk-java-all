/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.UserTradeInfoDTO;
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
 * AlipayFundUsertradeBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundUsertradeBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_HAS_NEXT = "has_next";
  @SerializedName(SERIALIZED_NAME_HAS_NEXT)
  private Boolean hasNext;

  public static final String SERIALIZED_NAME_PAGE_INDEX = "page_index";
  @SerializedName(SERIALIZED_NAME_PAGE_INDEX)
  private String pageIndex;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_TRADE_INFO_LIST = "trade_info_list";
  @SerializedName(SERIALIZED_NAME_TRADE_INFO_LIST)
  private List<UserTradeInfoDTO> tradeInfoList = null;

  public AlipayFundUsertradeBatchqueryResponseModel() { 
  }

  public AlipayFundUsertradeBatchqueryResponseModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 拉取的结束时间，格式yyyy-MM-dd HH:mm:ss
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-11 00:00:00", value = "拉取的结束时间，格式yyyy-MM-dd HH:mm:ss")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayFundUsertradeBatchqueryResponseModel hasNext(Boolean hasNext) {
    
    this.hasNext = hasNext;
    return this;
  }

   /**
   * 是否有下一页
   * @return hasNext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否有下一页")

  public Boolean getHasNext() {
    return hasNext;
  }


  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }


  public AlipayFundUsertradeBatchqueryResponseModel pageIndex(String pageIndex) {
    
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * 入参中的分页页码
   * @return pageIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "入参中的分页页码")

  public String getPageIndex() {
    return pageIndex;
  }


  public void setPageIndex(String pageIndex) {
    this.pageIndex = pageIndex;
  }


  public AlipayFundUsertradeBatchqueryResponseModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 入参中的分页大小
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "入参中的分页大小")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayFundUsertradeBatchqueryResponseModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 拉取的起始时间，格式yyyy-MM-dd HH:mm:ss
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-10 00:00:00", value = "拉取的起始时间，格式yyyy-MM-dd HH:mm:ss")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AlipayFundUsertradeBatchqueryResponseModel totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 交易时间区间内的总交易数
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120", value = "交易时间区间内的总交易数")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public AlipayFundUsertradeBatchqueryResponseModel tradeInfoList(List<UserTradeInfoDTO> tradeInfoList) {
    
    this.tradeInfoList = tradeInfoList;
    return this;
  }

  public AlipayFundUsertradeBatchqueryResponseModel addTradeInfoListItem(UserTradeInfoDTO tradeInfoListItem) {
    if (this.tradeInfoList == null) {
      this.tradeInfoList = new ArrayList<>();
    }
    this.tradeInfoList.add(tradeInfoListItem);
    return this;
  }

   /**
   * 用户交易数据
   * @return tradeInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户交易数据")

  public List<UserTradeInfoDTO> getTradeInfoList() {
    return tradeInfoList;
  }


  public void setTradeInfoList(List<UserTradeInfoDTO> tradeInfoList) {
    this.tradeInfoList = tradeInfoList;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AlipayFundUsertradeBatchqueryResponseModel instance itself
   */
  public AlipayFundUsertradeBatchqueryResponseModel putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundUsertradeBatchqueryResponseModel alipayFundUsertradeBatchqueryResponseModel = (AlipayFundUsertradeBatchqueryResponseModel) o;
    return Objects.equals(this.endTime, alipayFundUsertradeBatchqueryResponseModel.endTime) &&
        Objects.equals(this.hasNext, alipayFundUsertradeBatchqueryResponseModel.hasNext) &&
        Objects.equals(this.pageIndex, alipayFundUsertradeBatchqueryResponseModel.pageIndex) &&
        Objects.equals(this.pageSize, alipayFundUsertradeBatchqueryResponseModel.pageSize) &&
        Objects.equals(this.startTime, alipayFundUsertradeBatchqueryResponseModel.startTime) &&
        Objects.equals(this.totalCount, alipayFundUsertradeBatchqueryResponseModel.totalCount) &&
        Objects.equals(this.tradeInfoList, alipayFundUsertradeBatchqueryResponseModel.tradeInfoList)&&
        Objects.equals(this.additionalProperties, alipayFundUsertradeBatchqueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, hasNext, pageIndex, pageSize, startTime, totalCount, tradeInfoList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundUsertradeBatchqueryResponseModel {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    tradeInfoList: ").append(toIndentedString(tradeInfoList)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("has_next");
    openapiFields.add("page_index");
    openapiFields.add("page_size");
    openapiFields.add("start_time");
    openapiFields.add("total_count");
    openapiFields.add("trade_info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundUsertradeBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundUsertradeBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundUsertradeBatchqueryResponseModel is not found in the empty JSON string", AlipayFundUsertradeBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("page_index") != null && !jsonObj.get("page_index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_index").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      JsonArray jsonArraytradeInfoList = jsonObj.getAsJsonArray("trade_info_list");
      if (jsonArraytradeInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("trade_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `trade_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("trade_info_list").toString()));
        }

        // validate the optional field `trade_info_list` (array)
        for (int i = 0; i < jsonArraytradeInfoList.size(); i++) {
          UserTradeInfoDTO.validateJsonObject(jsonArraytradeInfoList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundUsertradeBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundUsertradeBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundUsertradeBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundUsertradeBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundUsertradeBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundUsertradeBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundUsertradeBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayFundUsertradeBatchqueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundUsertradeBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundUsertradeBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundUsertradeBatchqueryResponseModel
  */
  public static AlipayFundUsertradeBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundUsertradeBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundUsertradeBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

