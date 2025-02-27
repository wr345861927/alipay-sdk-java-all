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
 * ExpenseCtrlEmployeeRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseCtrlEmployeeRuleInfo {
  public static final String SERIALIZED_NAME_EFFECTIVE = "effective";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE)
  private Integer effective;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_OWNER_TYPE = "owner_type";
  @SerializedName(SERIALIZED_NAME_OWNER_TYPE)
  private String ownerType;

  public static final String SERIALIZED_NAME_STANDARD_ID = "standard_id";
  @SerializedName(SERIALIZED_NAME_STANDARD_ID)
  private String standardId;

  public static final String SERIALIZED_NAME_STANDARD_NAME = "standard_name";
  @SerializedName(SERIALIZED_NAME_STANDARD_NAME)
  private String standardName;

  public ExpenseCtrlEmployeeRuleInfo() { 
  }

  public ExpenseCtrlEmployeeRuleInfo effective(Integer effective) {
    
    this.effective = effective;
    return this;
  }

   /**
   * 费控规则状态，1表示有效，0表示无效
   * @return effective
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "费控规则状态，1表示有效，0表示无效")

  public Integer getEffective() {
    return effective;
  }


  public void setEffective(Integer effective) {
    this.effective = effective;
  }


  public ExpenseCtrlEmployeeRuleInfo effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 费控规则有效期截止
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-08-08 00:00:00", value = "费控规则有效期截止")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public ExpenseCtrlEmployeeRuleInfo effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 费控规则有效期起始
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-08 00:00:00", value = "费控规则有效期起始")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public ExpenseCtrlEmployeeRuleInfo ownerType(String ownerType) {
    
    this.ownerType = ownerType;
    return this;
  }

   /**
   * 费控规则作用范围， EMPLOYEE表示员工，ENTERPRISE表示企业
   * @return ownerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EMPLOYEE", value = "费控规则作用范围， EMPLOYEE表示员工，ENTERPRISE表示企业")

  public String getOwnerType() {
    return ownerType;
  }


  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }


  public ExpenseCtrlEmployeeRuleInfo standardId(String standardId) {
    
    this.standardId = standardId;
    return this;
  }

   /**
   * 费控规则ID
   * @return standardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "202106280015260135000000xxxx", value = "费控规则ID")

  public String getStandardId() {
    return standardId;
  }


  public void setStandardId(String standardId) {
    this.standardId = standardId;
  }


  public ExpenseCtrlEmployeeRuleInfo standardName(String standardName) {
    
    this.standardName = standardName;
    return this;
  }

   /**
   * 费控规则名称
   * @return standardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试规则", value = "费控规则名称")

  public String getStandardName() {
    return standardName;
  }


  public void setStandardName(String standardName) {
    this.standardName = standardName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseCtrlEmployeeRuleInfo expenseCtrlEmployeeRuleInfo = (ExpenseCtrlEmployeeRuleInfo) o;
    return Objects.equals(this.effective, expenseCtrlEmployeeRuleInfo.effective) &&
        Objects.equals(this.effectiveEndDate, expenseCtrlEmployeeRuleInfo.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, expenseCtrlEmployeeRuleInfo.effectiveStartDate) &&
        Objects.equals(this.ownerType, expenseCtrlEmployeeRuleInfo.ownerType) &&
        Objects.equals(this.standardId, expenseCtrlEmployeeRuleInfo.standardId) &&
        Objects.equals(this.standardName, expenseCtrlEmployeeRuleInfo.standardName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effective, effectiveEndDate, effectiveStartDate, ownerType, standardId, standardName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseCtrlEmployeeRuleInfo {\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    standardId: ").append(toIndentedString(standardId)).append("\n");
    sb.append("    standardName: ").append(toIndentedString(standardName)).append("\n");
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
    openapiFields.add("effective");
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("owner_type");
    openapiFields.add("standard_id");
    openapiFields.add("standard_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseCtrlEmployeeRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExpenseCtrlEmployeeRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseCtrlEmployeeRuleInfo is not found in the empty JSON string", ExpenseCtrlEmployeeRuleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExpenseCtrlEmployeeRuleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExpenseCtrlEmployeeRuleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("effective_end_date") != null && !jsonObj.get("effective_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_end_date").toString()));
      }
      if (jsonObj.get("effective_start_date") != null && !jsonObj.get("effective_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start_date").toString()));
      }
      if (jsonObj.get("owner_type") != null && !jsonObj.get("owner_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_type").toString()));
      }
      if (jsonObj.get("standard_id") != null && !jsonObj.get("standard_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_id").toString()));
      }
      if (jsonObj.get("standard_name") != null && !jsonObj.get("standard_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseCtrlEmployeeRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseCtrlEmployeeRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseCtrlEmployeeRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseCtrlEmployeeRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseCtrlEmployeeRuleInfo>() {
           @Override
           public void write(JsonWriter out, ExpenseCtrlEmployeeRuleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExpenseCtrlEmployeeRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExpenseCtrlEmployeeRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseCtrlEmployeeRuleInfo
  * @throws IOException if the JSON string is invalid with respect to ExpenseCtrlEmployeeRuleInfo
  */
  public static ExpenseCtrlEmployeeRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseCtrlEmployeeRuleInfo.class);
  }

 /**
  * Convert an instance of ExpenseCtrlEmployeeRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

