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
import com.alipay.v3.model.CompleteVoucherInfo;
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
 * AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_APPLY_DATE = "apply_date";
  @SerializedName(SERIALIZED_NAME_APPLY_DATE)
  private String applyDate;

  public static final String SERIALIZED_NAME_BATCH_ID = "batch_id";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;

  public static final String SERIALIZED_NAME_BATCH_STATUS = "batch_status";
  @SerializedName(SERIALIZED_NAME_BATCH_STATUS)
  private String batchStatus;

  public static final String SERIALIZED_NAME_COMPLETE_VOUCHER_LIST = "complete_voucher_list";
  @SerializedName(SERIALIZED_NAME_COMPLETE_VOUCHER_LIST)
  private List<CompleteVoucherInfo> completeVoucherList = null;

  public static final String SERIALIZED_NAME_GMT_BIZ_END = "gmt_biz_end";
  @SerializedName(SERIALIZED_NAME_GMT_BIZ_END)
  private String gmtBizEnd;

  public static final String SERIALIZED_NAME_GMT_BIZ_START = "gmt_biz_start";
  @SerializedName(SERIALIZED_NAME_GMT_BIZ_START)
  private String gmtBizStart;

  public static final String SERIALIZED_NAME_STATUS_SHOW_CONTENT = "status_show_content";
  @SerializedName(SERIALIZED_NAME_STATUS_SHOW_CONTENT)
  private String statusShowContent;

  public static final String SERIALIZED_NAME_SUMMARY_ID = "summary_id";
  @SerializedName(SERIALIZED_NAME_SUMMARY_ID)
  private String summaryId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel() { 
  }

  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业汇总场景下，即企业ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000237836238", value = "企业汇总场景下，即企业ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel applyDate(String applyDate) {
    
    this.applyDate = applyDate;
    return this;
  }

   /**
   * 申请时间
   * @return applyDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-26 11:11:11", value = "申请时间")

  public String getApplyDate() {
    return applyDate;
  }


  public void setApplyDate(String applyDate) {
    this.applyDate = applyDate;
  }


  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * 已废弃，开票批次 ID（建议使用summary_id）
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021080400152500230000000881", value = "已废弃，开票批次 ID（建议使用summary_id）")

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel batchStatus(String batchStatus) {
    
    this.batchStatus = batchStatus;
    return this;
  }

   /**
   * 批次状态&lt;br/&gt;     INIT：汇总批次初始化状态，未进行汇总&lt;br/&gt;     SUMMARY：汇总批次化汇总完成，汇总金额计算完成&lt;br/&gt;     PROCESS：汇总批次初始化状态，汇总开票申请提交成功&lt;br/&gt;     NOT_SUPPORT：汇总开票商户业务能力不支持&lt;br/&gt;     FAIL：汇总批次申请失败状态&lt;br/&gt;     SUCCESS：汇总批次申请成功状态，此时发票已回传&lt;br/&gt;     MANUAL_CONFIRM：汇总批次人工确认收票&lt;br/&gt;
   * @return batchStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "批次状态<br/>     INIT：汇总批次初始化状态，未进行汇总<br/>     SUMMARY：汇总批次化汇总完成，汇总金额计算完成<br/>     PROCESS：汇总批次初始化状态，汇总开票申请提交成功<br/>     NOT_SUPPORT：汇总开票商户业务能力不支持<br/>     FAIL：汇总批次申请失败状态<br/>     SUCCESS：汇总批次申请成功状态，此时发票已回传<br/>     MANUAL_CONFIRM：汇总批次人工确认收票<br/>")

  public String getBatchStatus() {
    return batchStatus;
  }


  public void setBatchStatus(String batchStatus) {
    this.batchStatus = batchStatus;
  }


  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel completeVoucherList(List<CompleteVoucherInfo> completeVoucherList) {
    
    this.completeVoucherList = completeVoucherList;
    return this;
  }

  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel addCompleteVoucherListItem(CompleteVoucherInfo completeVoucherListItem) {
    if (this.completeVoucherList == null) {
      this.completeVoucherList = new ArrayList<>();
    }
    this.completeVoucherList.add(completeVoucherListItem);
    return this;
  }

   /**
   * 发票内容
   * @return completeVoucherList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票内容")

  public List<CompleteVoucherInfo> getCompleteVoucherList() {
    return completeVoucherList;
  }


  public void setCompleteVoucherList(List<CompleteVoucherInfo> completeVoucherList) {
    this.completeVoucherList = completeVoucherList;
  }


  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel gmtBizEnd(String gmtBizEnd) {
    
    this.gmtBizEnd = gmtBizEnd;
    return this;
  }

   /**
   * 账期结束时间
   * @return gmtBizEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-09 00:00:59", value = "账期结束时间")

  public String getGmtBizEnd() {
    return gmtBizEnd;
  }


  public void setGmtBizEnd(String gmtBizEnd) {
    this.gmtBizEnd = gmtBizEnd;
  }


  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel gmtBizStart(String gmtBizStart) {
    
    this.gmtBizStart = gmtBizStart;
    return this;
  }

   /**
   * 账期起始时间
   * @return gmtBizStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-09 00:00:59", value = "账期起始时间")

  public String getGmtBizStart() {
    return gmtBizStart;
  }


  public void setGmtBizStart(String gmtBizStart) {
    this.gmtBizStart = gmtBizStart;
  }


  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel statusShowContent(String statusShowContent) {
    
    this.statusShowContent = statusShowContent;
    return this;
  }

   /**
   * 状态对应的展示明细内容&lt;br/&gt;     初始化&lt;br/&gt;     汇总完成&lt;br/&gt;     开票中...&lt;br/&gt;     不支持开票&lt;br/&gt;     开票失败&lt;br/&gt;     已开票&lt;br/&gt;     确认已收票&lt;br/&gt;
   * @return statusShowContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "已开票", value = "状态对应的展示明细内容<br/>     初始化<br/>     汇总完成<br/>     开票中...<br/>     不支持开票<br/>     开票失败<br/>     已开票<br/>     确认已收票<br/>")

  public String getStatusShowContent() {
    return statusShowContent;
  }


  public void setStatusShowContent(String statusShowContent) {
    this.statusShowContent = statusShowContent;
  }


  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel summaryId(String summaryId) {
    
    this.summaryId = summaryId;
    return this;
  }

   /**
   * 开票批次 ID
   * @return summaryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021080400152500230000000881", value = "开票批次 ID")

  public String getSummaryId() {
    return summaryId;
  }


  public void setSummaryId(String summaryId) {
    this.summaryId = summaryId;
  }


  public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 企业汇总场景下，即企业ID（请使用account_id）
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000237836238", value = "企业汇总场景下，即企业ID（请使用account_id）")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel alipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel = (AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.accountId) &&
        Objects.equals(this.applyDate, alipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.applyDate) &&
        Objects.equals(this.batchId, alipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.batchId) &&
        Objects.equals(this.batchStatus, alipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.batchStatus) &&
        Objects.equals(this.completeVoucherList, alipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.completeVoucherList) &&
        Objects.equals(this.gmtBizEnd, alipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.gmtBizEnd) &&
        Objects.equals(this.gmtBizStart, alipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.gmtBizStart) &&
        Objects.equals(this.statusShowContent, alipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.statusShowContent) &&
        Objects.equals(this.summaryId, alipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.summaryId) &&
        Objects.equals(this.userId, alipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, applyDate, batchId, batchStatus, completeVoucherList, gmtBizEnd, gmtBizStart, statusShowContent, summaryId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    applyDate: ").append(toIndentedString(applyDate)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchStatus: ").append(toIndentedString(batchStatus)).append("\n");
    sb.append("    completeVoucherList: ").append(toIndentedString(completeVoucherList)).append("\n");
    sb.append("    gmtBizEnd: ").append(toIndentedString(gmtBizEnd)).append("\n");
    sb.append("    gmtBizStart: ").append(toIndentedString(gmtBizStart)).append("\n");
    sb.append("    statusShowContent: ").append(toIndentedString(statusShowContent)).append("\n");
    sb.append("    summaryId: ").append(toIndentedString(summaryId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("apply_date");
    openapiFields.add("batch_id");
    openapiFields.add("batch_status");
    openapiFields.add("complete_voucher_list");
    openapiFields.add("gmt_biz_end");
    openapiFields.add("gmt_biz_start");
    openapiFields.add("status_show_content");
    openapiFields.add("summary_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel is not found in the empty JSON string", AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("apply_date") != null && !jsonObj.get("apply_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_date").toString()));
      }
      if (jsonObj.get("batch_id") != null && !jsonObj.get("batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_id").toString()));
      }
      if (jsonObj.get("batch_status") != null && !jsonObj.get("batch_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_status").toString()));
      }
      JsonArray jsonArraycompleteVoucherList = jsonObj.getAsJsonArray("complete_voucher_list");
      if (jsonArraycompleteVoucherList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("complete_voucher_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `complete_voucher_list` to be an array in the JSON string but got `%s`", jsonObj.get("complete_voucher_list").toString()));
        }

        // validate the optional field `complete_voucher_list` (array)
        for (int i = 0; i < jsonArraycompleteVoucherList.size(); i++) {
          CompleteVoucherInfo.validateJsonObject(jsonArraycompleteVoucherList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("gmt_biz_end") != null && !jsonObj.get("gmt_biz_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_biz_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_biz_end").toString()));
      }
      if (jsonObj.get("gmt_biz_start") != null && !jsonObj.get("gmt_biz_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_biz_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_biz_start").toString()));
      }
      if (jsonObj.get("status_show_content") != null && !jsonObj.get("status_show_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_show_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_show_content").toString()));
      }
      if (jsonObj.get("summary_id") != null && !jsonObj.get("summary_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel
  */
  public static AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

