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
import com.alipay.v3.model.IssueQuotaCheckInfo;
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
 * AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel {
  public static final String SERIALIZED_NAME_ISSUE_BATCH_ID = "issue_batch_id";
  @SerializedName(SERIALIZED_NAME_ISSUE_BATCH_ID)
  private String issueBatchId;

  public static final String SERIALIZED_NAME_ISSUE_QUOTA_CHECK_FAILED_LIST = "issue_quota_check_failed_list";
  @SerializedName(SERIALIZED_NAME_ISSUE_QUOTA_CHECK_FAILED_LIST)
  private List<IssueQuotaCheckInfo> issueQuotaCheckFailedList = null;

  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel() { 
  }

  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel issueBatchId(String issueBatchId) {
    
    this.issueBatchId = issueBatchId;
    return this;
  }

   /**
   * 发放批次id
   * @return issueBatchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022070500152622690000017754", value = "发放批次id")

  public String getIssueBatchId() {
    return issueBatchId;
  }


  public void setIssueBatchId(String issueBatchId) {
    this.issueBatchId = issueBatchId;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel issueQuotaCheckFailedList(List<IssueQuotaCheckInfo> issueQuotaCheckFailedList) {
    
    this.issueQuotaCheckFailedList = issueQuotaCheckFailedList;
    return this;
  }

  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel addIssueQuotaCheckFailedListItem(IssueQuotaCheckInfo issueQuotaCheckFailedListItem) {
    if (this.issueQuotaCheckFailedList == null) {
      this.issueQuotaCheckFailedList = new ArrayList<>();
    }
    this.issueQuotaCheckFailedList.add(issueQuotaCheckFailedListItem);
    return this;
  }

   /**
   * 校验失败的数据
   * @return issueQuotaCheckFailedList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "校验失败的数据")

  public List<IssueQuotaCheckInfo> getIssueQuotaCheckFailedList() {
    return issueQuotaCheckFailedList;
  }


  public void setIssueQuotaCheckFailedList(List<IssueQuotaCheckInfo> issueQuotaCheckFailedList) {
    this.issueQuotaCheckFailedList = issueQuotaCheckFailedList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel alipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel = (AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel) o;
    return Objects.equals(this.issueBatchId, alipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel.issueBatchId) &&
        Objects.equals(this.issueQuotaCheckFailedList, alipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel.issueQuotaCheckFailedList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueBatchId, issueQuotaCheckFailedList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel {\n");
    sb.append("    issueBatchId: ").append(toIndentedString(issueBatchId)).append("\n");
    sb.append("    issueQuotaCheckFailedList: ").append(toIndentedString(issueQuotaCheckFailedList)).append("\n");
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
    openapiFields.add("issue_batch_id");
    openapiFields.add("issue_quota_check_failed_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel is not found in the empty JSON string", AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("issue_batch_id") != null && !jsonObj.get("issue_batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_batch_id").toString()));
      }
      JsonArray jsonArrayissueQuotaCheckFailedList = jsonObj.getAsJsonArray("issue_quota_check_failed_list");
      if (jsonArrayissueQuotaCheckFailedList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("issue_quota_check_failed_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `issue_quota_check_failed_list` to be an array in the JSON string but got `%s`", jsonObj.get("issue_quota_check_failed_list").toString()));
        }

        // validate the optional field `issue_quota_check_failed_list` (array)
        for (int i = 0; i < jsonArrayissueQuotaCheckFailedList.size(); i++) {
          IssueQuotaCheckInfo.validateJsonObject(jsonArrayissueQuotaCheckFailedList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel
  */
  public static AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

