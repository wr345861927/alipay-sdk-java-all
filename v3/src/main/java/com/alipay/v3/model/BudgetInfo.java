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
 * BudgetInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BudgetInfo {
  public static final String SERIALIZED_NAME_BUDGET_TOTAL = "budget_total";
  @SerializedName(SERIALIZED_NAME_BUDGET_TOTAL)
  private String budgetTotal;

  public static final String SERIALIZED_NAME_BUDGET_TYPE = "budget_type";
  @SerializedName(SERIALIZED_NAME_BUDGET_TYPE)
  private String budgetType;

  public static final String SERIALIZED_NAME_SUB_BUDGET_DIMENSION = "sub_budget_dimension";
  @SerializedName(SERIALIZED_NAME_SUB_BUDGET_DIMENSION)
  private String subBudgetDimension;

  public static final String SERIALIZED_NAME_SUB_VALUE = "sub_value";
  @SerializedName(SERIALIZED_NAME_SUB_VALUE)
  private String subValue;

  public BudgetInfo() { 
  }

  public BudgetInfo budgetTotal(String budgetTotal) {
    
    this.budgetTotal = budgetTotal;
    return this;
  }

   /**
   * 预算数量
   * @return budgetTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10258", value = "预算数量")

  public String getBudgetTotal() {
    return budgetTotal;
  }


  public void setBudgetTotal(String budgetTotal) {
    this.budgetTotal = budgetTotal;
  }


  public BudgetInfo budgetType(String budgetType) {
    
    this.budgetType = budgetType;
    return this;
  }

   /**
   * 预算类型
   * @return budgetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "QUANTITY", value = "预算类型")

  public String getBudgetType() {
    return budgetType;
  }


  public void setBudgetType(String budgetType) {
    this.budgetType = budgetType;
  }


  public BudgetInfo subBudgetDimension(String subBudgetDimension) {
    
    this.subBudgetDimension = subBudgetDimension;
    return this;
  }

   /**
   * 设置每天的预算，如每天的预算设置为100，即该活动一天最多发放100次
   * @return subBudgetDimension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "D:表示每天的预算;", value = "设置每天的预算，如每天的预算设置为100，即该活动一天最多发放100次")

  public String getSubBudgetDimension() {
    return subBudgetDimension;
  }


  public void setSubBudgetDimension(String subBudgetDimension) {
    this.subBudgetDimension = subBudgetDimension;
  }


  public BudgetInfo subValue(String subValue) {
    
    this.subValue = subValue;
    return this;
  }

   /**
   * 用于控制子纬度的预算数量
   * @return subValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100:表示sub_dimension定义的纬度预算为100，若sub_dimension为D的话，则表示每天最多发放100张", value = "用于控制子纬度的预算数量")

  public String getSubValue() {
    return subValue;
  }


  public void setSubValue(String subValue) {
    this.subValue = subValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetInfo budgetInfo = (BudgetInfo) o;
    return Objects.equals(this.budgetTotal, budgetInfo.budgetTotal) &&
        Objects.equals(this.budgetType, budgetInfo.budgetType) &&
        Objects.equals(this.subBudgetDimension, budgetInfo.subBudgetDimension) &&
        Objects.equals(this.subValue, budgetInfo.subValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetTotal, budgetType, subBudgetDimension, subValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetInfo {\n");
    sb.append("    budgetTotal: ").append(toIndentedString(budgetTotal)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    subBudgetDimension: ").append(toIndentedString(subBudgetDimension)).append("\n");
    sb.append("    subValue: ").append(toIndentedString(subValue)).append("\n");
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
    openapiFields.add("budget_total");
    openapiFields.add("budget_type");
    openapiFields.add("sub_budget_dimension");
    openapiFields.add("sub_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BudgetInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BudgetInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BudgetInfo is not found in the empty JSON string", BudgetInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BudgetInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BudgetInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("budget_total") != null && !jsonObj.get("budget_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budget_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budget_total").toString()));
      }
      if (jsonObj.get("budget_type") != null && !jsonObj.get("budget_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budget_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budget_type").toString()));
      }
      if (jsonObj.get("sub_budget_dimension") != null && !jsonObj.get("sub_budget_dimension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_budget_dimension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_budget_dimension").toString()));
      }
      if (jsonObj.get("sub_value") != null && !jsonObj.get("sub_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BudgetInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BudgetInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BudgetInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BudgetInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BudgetInfo>() {
           @Override
           public void write(JsonWriter out, BudgetInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BudgetInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BudgetInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BudgetInfo
  * @throws IOException if the JSON string is invalid with respect to BudgetInfo
  */
  public static BudgetInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BudgetInfo.class);
  }

 /**
  * Convert an instance of BudgetInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

