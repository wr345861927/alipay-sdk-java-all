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
import com.alipay.v3.model.FailVoucherCodeDetail;
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
 * AlipayMarketingActivityOrdervoucherCodedepositResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityOrdervoucherCodedepositResponseModel {
  public static final String SERIALIZED_NAME_FAIL_COUNT = "fail_count";
  @SerializedName(SERIALIZED_NAME_FAIL_COUNT)
  private Integer failCount;

  public static final String SERIALIZED_NAME_FAIL_VOUCHER_CODE_DETAIL_LIST = "fail_voucher_code_detail_list";
  @SerializedName(SERIALIZED_NAME_FAIL_VOUCHER_CODE_DETAIL_LIST)
  private List<FailVoucherCodeDetail> failVoucherCodeDetailList = null;

  public static final String SERIALIZED_NAME_SUCCESS_COUNT = "success_count";
  @SerializedName(SERIALIZED_NAME_SUCCESS_COUNT)
  private Integer successCount;

  public static final String SERIALIZED_NAME_SUCCESS_VOUCHER_CODE_LIST = "success_voucher_code_list";
  @SerializedName(SERIALIZED_NAME_SUCCESS_VOUCHER_CODE_LIST)
  private List<String> successVoucherCodeList = null;

  public AlipayMarketingActivityOrdervoucherCodedepositResponseModel() { 
  }

  public AlipayMarketingActivityOrdervoucherCodedepositResponseModel failCount(Integer failCount) {
    
    this.failCount = failCount;
    return this;
  }

   /**
   * 导入失败的券码数量
   * @return failCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "导入失败的券码数量")

  public Integer getFailCount() {
    return failCount;
  }


  public void setFailCount(Integer failCount) {
    this.failCount = failCount;
  }


  public AlipayMarketingActivityOrdervoucherCodedepositResponseModel failVoucherCodeDetailList(List<FailVoucherCodeDetail> failVoucherCodeDetailList) {
    
    this.failVoucherCodeDetailList = failVoucherCodeDetailList;
    return this;
  }

  public AlipayMarketingActivityOrdervoucherCodedepositResponseModel addFailVoucherCodeDetailListItem(FailVoucherCodeDetail failVoucherCodeDetailListItem) {
    if (this.failVoucherCodeDetailList == null) {
      this.failVoucherCodeDetailList = new ArrayList<>();
    }
    this.failVoucherCodeDetailList.add(failVoucherCodeDetailListItem);
    return this;
  }

   /**
   * 上传失败券码详情列表，包括上传失败的券码及对应的错误码和错误原因
   * @return failVoucherCodeDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上传失败券码详情列表，包括上传失败的券码及对应的错误码和错误原因")

  public List<FailVoucherCodeDetail> getFailVoucherCodeDetailList() {
    return failVoucherCodeDetailList;
  }


  public void setFailVoucherCodeDetailList(List<FailVoucherCodeDetail> failVoucherCodeDetailList) {
    this.failVoucherCodeDetailList = failVoucherCodeDetailList;
  }


  public AlipayMarketingActivityOrdervoucherCodedepositResponseModel successCount(Integer successCount) {
    
    this.successCount = successCount;
    return this;
  }

   /**
   * 导入成功的券码数量
   * @return successCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "导入成功的券码数量")

  public Integer getSuccessCount() {
    return successCount;
  }


  public void setSuccessCount(Integer successCount) {
    this.successCount = successCount;
  }


  public AlipayMarketingActivityOrdervoucherCodedepositResponseModel successVoucherCodeList(List<String> successVoucherCodeList) {
    
    this.successVoucherCodeList = successVoucherCodeList;
    return this;
  }

  public AlipayMarketingActivityOrdervoucherCodedepositResponseModel addSuccessVoucherCodeListItem(String successVoucherCodeListItem) {
    if (this.successVoucherCodeList == null) {
      this.successVoucherCodeList = new ArrayList<>();
    }
    this.successVoucherCodeList.add(successVoucherCodeListItem);
    return this;
  }

   /**
   * 上传成功的券码列表
   * @return successVoucherCodeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"123AB\",\"45zz6\"]", value = "上传成功的券码列表")

  public List<String> getSuccessVoucherCodeList() {
    return successVoucherCodeList;
  }


  public void setSuccessVoucherCodeList(List<String> successVoucherCodeList) {
    this.successVoucherCodeList = successVoucherCodeList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityOrdervoucherCodedepositResponseModel alipayMarketingActivityOrdervoucherCodedepositResponseModel = (AlipayMarketingActivityOrdervoucherCodedepositResponseModel) o;
    return Objects.equals(this.failCount, alipayMarketingActivityOrdervoucherCodedepositResponseModel.failCount) &&
        Objects.equals(this.failVoucherCodeDetailList, alipayMarketingActivityOrdervoucherCodedepositResponseModel.failVoucherCodeDetailList) &&
        Objects.equals(this.successCount, alipayMarketingActivityOrdervoucherCodedepositResponseModel.successCount) &&
        Objects.equals(this.successVoucherCodeList, alipayMarketingActivityOrdervoucherCodedepositResponseModel.successVoucherCodeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failCount, failVoucherCodeDetailList, successCount, successVoucherCodeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityOrdervoucherCodedepositResponseModel {\n");
    sb.append("    failCount: ").append(toIndentedString(failCount)).append("\n");
    sb.append("    failVoucherCodeDetailList: ").append(toIndentedString(failVoucherCodeDetailList)).append("\n");
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
    sb.append("    successVoucherCodeList: ").append(toIndentedString(successVoucherCodeList)).append("\n");
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
    openapiFields.add("fail_count");
    openapiFields.add("fail_voucher_code_detail_list");
    openapiFields.add("success_count");
    openapiFields.add("success_voucher_code_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityOrdervoucherCodedepositResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityOrdervoucherCodedepositResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityOrdervoucherCodedepositResponseModel is not found in the empty JSON string", AlipayMarketingActivityOrdervoucherCodedepositResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityOrdervoucherCodedepositResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityOrdervoucherCodedepositResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayfailVoucherCodeDetailList = jsonObj.getAsJsonArray("fail_voucher_code_detail_list");
      if (jsonArrayfailVoucherCodeDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fail_voucher_code_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fail_voucher_code_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("fail_voucher_code_detail_list").toString()));
        }

        // validate the optional field `fail_voucher_code_detail_list` (array)
        for (int i = 0; i < jsonArrayfailVoucherCodeDetailList.size(); i++) {
          FailVoucherCodeDetail.validateJsonObject(jsonArrayfailVoucherCodeDetailList.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("success_voucher_code_list") != null && !jsonObj.get("success_voucher_code_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `success_voucher_code_list` to be an array in the JSON string but got `%s`", jsonObj.get("success_voucher_code_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityOrdervoucherCodedepositResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityOrdervoucherCodedepositResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityOrdervoucherCodedepositResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityOrdervoucherCodedepositResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityOrdervoucherCodedepositResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityOrdervoucherCodedepositResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityOrdervoucherCodedepositResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityOrdervoucherCodedepositResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityOrdervoucherCodedepositResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityOrdervoucherCodedepositResponseModel
  */
  public static AlipayMarketingActivityOrdervoucherCodedepositResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityOrdervoucherCodedepositResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityOrdervoucherCodedepositResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

