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
import com.alipay.v3.model.IssueRuleInfo;
import com.alipay.v3.model.StandardInfo;
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
 * AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel {
  public static final String SERIALIZED_NAME_CONSULT_MODE = "consult_mode";
  @SerializedName(SERIALIZED_NAME_CONSULT_MODE)
  private String consultMode;

  public static final String SERIALIZED_NAME_EFFECTIVE = "effective";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE)
  private String effective;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_EXPENSE_TYPE = "expense_type";
  @SerializedName(SERIALIZED_NAME_EXPENSE_TYPE)
  private String expenseType;

  public static final String SERIALIZED_NAME_INSTITUTION_DESC = "institution_desc";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_DESC)
  private String institutionDesc;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_ISSUE_RULE_INFO_LIST = "issue_rule_info_list";
  @SerializedName(SERIALIZED_NAME_ISSUE_RULE_INFO_LIST)
  private List<IssueRuleInfo> issueRuleInfoList = null;

  public static final String SERIALIZED_NAME_SCENE_TYPE = "scene_type";
  @SerializedName(SERIALIZED_NAME_SCENE_TYPE)
  private String sceneType;

  public static final String SERIALIZED_NAME_STANDARD_INFO_DETAIL_LIST = "standard_info_detail_list";
  @SerializedName(SERIALIZED_NAME_STANDARD_INFO_DETAIL_LIST)
  private List<StandardInfo> standardInfoDetailList = null;

  public static final String SERIALIZED_NAME_STANDARD_INFO_LIST = "standard_info_list";
  @SerializedName(SERIALIZED_NAME_STANDARD_INFO_LIST)
  private StandardInfo standardInfoList;

  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel() { 
  }

  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel consultMode(String consultMode) {
    
    this.consultMode = consultMode;
    return this;
  }

   /**
   * 费控咨询模式
   * @return consultMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "费控咨询模式")

  public String getConsultMode() {
    return consultMode;
  }


  public void setConsultMode(String consultMode) {
    this.consultMode = consultMode;
  }


  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel effective(String effective) {
    
    this.effective = effective;
    return this;
  }

   /**
   * 制度启用停用状态
   * @return effective
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "制度启用停用状态")

  public String getEffective() {
    return effective;
  }


  public void setEffective(String effective) {
    this.effective = effective;
  }


  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 制度生效结束时间
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2001-01-01 23:59:59", value = "制度生效结束时间")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 制度生效起始时间
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000-01-01 00:00:00", value = "制度生效起始时间")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel expenseType(String expenseType) {
    
    this.expenseType = expenseType;
    return this;
  }

   /**
   * 费用类型
   * @return expenseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MEAL", value = "费用类型")

  public String getExpenseType() {
    return expenseType;
  }


  public void setExpenseType(String expenseType) {
    this.expenseType = expenseType;
  }


  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel institutionDesc(String institutionDesc) {
    
    this.institutionDesc = institutionDesc;
    return this;
  }

   /**
   * 制度描述
   * @return institutionDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "工作餐制度", value = "制度描述")

  public String getInstitutionDesc() {
    return institutionDesc;
  }


  public void setInstitutionDesc(String institutionDesc) {
    this.institutionDesc = institutionDesc;
  }


  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * 制度id
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023042600152617860000076700", value = "制度id")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * 制度名称
   * @return institutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "餐补制度", value = "制度名称")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel issueRuleInfoList(List<IssueRuleInfo> issueRuleInfoList) {
    
    this.issueRuleInfoList = issueRuleInfoList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel addIssueRuleInfoListItem(IssueRuleInfo issueRuleInfoListItem) {
    if (this.issueRuleInfoList == null) {
      this.issueRuleInfoList = new ArrayList<>();
    }
    this.issueRuleInfoList.add(issueRuleInfoListItem);
    return this;
  }

   /**
   * 发放规则信息列表
   * @return issueRuleInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发放规则信息列表")

  public List<IssueRuleInfo> getIssueRuleInfoList() {
    return issueRuleInfoList;
  }


  public void setIssueRuleInfoList(List<IssueRuleInfo> issueRuleInfoList) {
    this.issueRuleInfoList = issueRuleInfoList;
  }


  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel sceneType(String sceneType) {
    
    this.sceneType = sceneType;
    return this;
  }

   /**
   * 因公场景
   * @return sceneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OVERTIME", value = "因公场景")

  public String getSceneType() {
    return sceneType;
  }


  public void setSceneType(String sceneType) {
    this.sceneType = sceneType;
  }


  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel standardInfoDetailList(List<StandardInfo> standardInfoDetailList) {
    
    this.standardInfoDetailList = standardInfoDetailList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel addStandardInfoDetailListItem(StandardInfo standardInfoDetailListItem) {
    if (this.standardInfoDetailList == null) {
      this.standardInfoDetailList = new ArrayList<>();
    }
    this.standardInfoDetailList.add(standardInfoDetailListItem);
    return this;
  }

   /**
   * 使用规则列表
   * @return standardInfoDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "使用规则列表")

  public List<StandardInfo> getStandardInfoDetailList() {
    return standardInfoDetailList;
  }


  public void setStandardInfoDetailList(List<StandardInfo> standardInfoDetailList) {
    this.standardInfoDetailList = standardInfoDetailList;
  }


  public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel standardInfoList(StandardInfo standardInfoList) {
    
    this.standardInfoList = standardInfoList;
    return this;
  }

   /**
   * Get standardInfoList
   * @return standardInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StandardInfo getStandardInfoList() {
    return standardInfoList;
  }


  public void setStandardInfoList(StandardInfo standardInfoList) {
    this.standardInfoList = standardInfoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel = (AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel) o;
    return Objects.equals(this.consultMode, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.consultMode) &&
        Objects.equals(this.effective, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.effective) &&
        Objects.equals(this.effectiveEndDate, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.effectiveStartDate) &&
        Objects.equals(this.expenseType, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.expenseType) &&
        Objects.equals(this.institutionDesc, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.institutionDesc) &&
        Objects.equals(this.institutionId, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.institutionId) &&
        Objects.equals(this.institutionName, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.institutionName) &&
        Objects.equals(this.issueRuleInfoList, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.issueRuleInfoList) &&
        Objects.equals(this.sceneType, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.sceneType) &&
        Objects.equals(this.standardInfoDetailList, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.standardInfoDetailList) &&
        Objects.equals(this.standardInfoList, alipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.standardInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultMode, effective, effectiveEndDate, effectiveStartDate, expenseType, institutionDesc, institutionId, institutionName, issueRuleInfoList, sceneType, standardInfoDetailList, standardInfoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel {\n");
    sb.append("    consultMode: ").append(toIndentedString(consultMode)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    expenseType: ").append(toIndentedString(expenseType)).append("\n");
    sb.append("    institutionDesc: ").append(toIndentedString(institutionDesc)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    issueRuleInfoList: ").append(toIndentedString(issueRuleInfoList)).append("\n");
    sb.append("    sceneType: ").append(toIndentedString(sceneType)).append("\n");
    sb.append("    standardInfoDetailList: ").append(toIndentedString(standardInfoDetailList)).append("\n");
    sb.append("    standardInfoList: ").append(toIndentedString(standardInfoList)).append("\n");
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
    openapiFields.add("consult_mode");
    openapiFields.add("effective");
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("expense_type");
    openapiFields.add("institution_desc");
    openapiFields.add("institution_id");
    openapiFields.add("institution_name");
    openapiFields.add("issue_rule_info_list");
    openapiFields.add("scene_type");
    openapiFields.add("standard_info_detail_list");
    openapiFields.add("standard_info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel is not found in the empty JSON string", AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("consult_mode") != null && !jsonObj.get("consult_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consult_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consult_mode").toString()));
      }
      if (jsonObj.get("effective") != null && !jsonObj.get("effective").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective").toString()));
      }
      if (jsonObj.get("effective_end_date") != null && !jsonObj.get("effective_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_end_date").toString()));
      }
      if (jsonObj.get("effective_start_date") != null && !jsonObj.get("effective_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start_date").toString()));
      }
      if (jsonObj.get("expense_type") != null && !jsonObj.get("expense_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expense_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expense_type").toString()));
      }
      if (jsonObj.get("institution_desc") != null && !jsonObj.get("institution_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_desc").toString()));
      }
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      if (jsonObj.get("institution_name") != null && !jsonObj.get("institution_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_name").toString()));
      }
      JsonArray jsonArrayissueRuleInfoList = jsonObj.getAsJsonArray("issue_rule_info_list");
      if (jsonArrayissueRuleInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("issue_rule_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `issue_rule_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("issue_rule_info_list").toString()));
        }

        // validate the optional field `issue_rule_info_list` (array)
        for (int i = 0; i < jsonArrayissueRuleInfoList.size(); i++) {
          IssueRuleInfo.validateJsonObject(jsonArrayissueRuleInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("scene_type") != null && !jsonObj.get("scene_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_type").toString()));
      }
      JsonArray jsonArraystandardInfoDetailList = jsonObj.getAsJsonArray("standard_info_detail_list");
      if (jsonArraystandardInfoDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("standard_info_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `standard_info_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("standard_info_detail_list").toString()));
        }

        // validate the optional field `standard_info_detail_list` (array)
        for (int i = 0; i < jsonArraystandardInfoDetailList.size(); i++) {
          StandardInfo.validateJsonObject(jsonArraystandardInfoDetailList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `standard_info_list`
      if (jsonObj.getAsJsonObject("standard_info_list") != null) {
        StandardInfo.validateJsonObject(jsonObj.getAsJsonObject("standard_info_list"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel
  */
  public static AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

