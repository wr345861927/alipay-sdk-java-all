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
 * AlipayMarketingActivityVoucherpackageBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityVoucherpackageBatchqueryModel {
  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_VOUCHER_PACKAGE_PURCHASE_START_TIME = "voucher_package_purchase_start_time";
  @SerializedName(SERIALIZED_NAME_VOUCHER_PACKAGE_PURCHASE_START_TIME)
  private String voucherPackagePurchaseStartTime;

  public static final String SERIALIZED_NAME_VOUCHER_PACKAGE_STATUS = "voucher_package_status";
  @SerializedName(SERIALIZED_NAME_VOUCHER_PACKAGE_STATUS)
  private String voucherPackageStatus;

  public AlipayMarketingActivityVoucherpackageBatchqueryModel() { 
  }

  public AlipayMarketingActivityVoucherpackageBatchqueryModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 分页参数，需要查询的页码，起始页是1
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "分页参数，需要查询的页码，起始页是1")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayMarketingActivityVoucherpackageBatchqueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页参数，每页记录数，最大不可超过30
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "分页参数，每页记录数，最大不可超过30")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayMarketingActivityVoucherpackageBatchqueryModel voucherPackagePurchaseStartTime(String voucherPackagePurchaseStartTime) {
    
    this.voucherPackagePurchaseStartTime = voucherPackagePurchaseStartTime;
    return this;
  }

   /**
   * 券包购买开始时间。 格式为：yyyy-MM-dd HH:mm:ss
   * @return voucherPackagePurchaseStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "券包购买开始时间。 格式为：yyyy-MM-dd HH:mm:ss")

  public String getVoucherPackagePurchaseStartTime() {
    return voucherPackagePurchaseStartTime;
  }


  public void setVoucherPackagePurchaseStartTime(String voucherPackagePurchaseStartTime) {
    this.voucherPackagePurchaseStartTime = voucherPackagePurchaseStartTime;
  }


  public AlipayMarketingActivityVoucherpackageBatchqueryModel voucherPackageStatus(String voucherPackageStatus) {
    
    this.voucherPackageStatus = voucherPackageStatus;
    return this;
  }

   /**
   * 券包状态：不指定可查全部状态，指定时只支持查单个状态 枚举值： CREATED：已创建, ENABLE：已发布（包含过期）, PAUSED：已暂停, DISABLE：已停止;
   * @return voucherPackageStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENABLE", value = "券包状态：不指定可查全部状态，指定时只支持查单个状态 枚举值： CREATED：已创建, ENABLE：已发布（包含过期）, PAUSED：已暂停, DISABLE：已停止;")

  public String getVoucherPackageStatus() {
    return voucherPackageStatus;
  }


  public void setVoucherPackageStatus(String voucherPackageStatus) {
    this.voucherPackageStatus = voucherPackageStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityVoucherpackageBatchqueryModel alipayMarketingActivityVoucherpackageBatchqueryModel = (AlipayMarketingActivityVoucherpackageBatchqueryModel) o;
    return Objects.equals(this.pageNum, alipayMarketingActivityVoucherpackageBatchqueryModel.pageNum) &&
        Objects.equals(this.pageSize, alipayMarketingActivityVoucherpackageBatchqueryModel.pageSize) &&
        Objects.equals(this.voucherPackagePurchaseStartTime, alipayMarketingActivityVoucherpackageBatchqueryModel.voucherPackagePurchaseStartTime) &&
        Objects.equals(this.voucherPackageStatus, alipayMarketingActivityVoucherpackageBatchqueryModel.voucherPackageStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNum, pageSize, voucherPackagePurchaseStartTime, voucherPackageStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityVoucherpackageBatchqueryModel {\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    voucherPackagePurchaseStartTime: ").append(toIndentedString(voucherPackagePurchaseStartTime)).append("\n");
    sb.append("    voucherPackageStatus: ").append(toIndentedString(voucherPackageStatus)).append("\n");
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
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("voucher_package_purchase_start_time");
    openapiFields.add("voucher_package_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityVoucherpackageBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityVoucherpackageBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityVoucherpackageBatchqueryModel is not found in the empty JSON string", AlipayMarketingActivityVoucherpackageBatchqueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityVoucherpackageBatchqueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityVoucherpackageBatchqueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("voucher_package_purchase_start_time") != null && !jsonObj.get("voucher_package_purchase_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_package_purchase_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_package_purchase_start_time").toString()));
      }
      if (jsonObj.get("voucher_package_status") != null && !jsonObj.get("voucher_package_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_package_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_package_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityVoucherpackageBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityVoucherpackageBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityVoucherpackageBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityVoucherpackageBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityVoucherpackageBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityVoucherpackageBatchqueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityVoucherpackageBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityVoucherpackageBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityVoucherpackageBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityVoucherpackageBatchqueryModel
  */
  public static AlipayMarketingActivityVoucherpackageBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityVoucherpackageBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityVoucherpackageBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

