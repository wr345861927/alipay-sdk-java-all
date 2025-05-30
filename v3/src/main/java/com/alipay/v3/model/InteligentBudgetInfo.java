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
 * InteligentBudgetInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentBudgetInfo {
  public static final String SERIALIZED_NAME_BUDGET_TOTAL = "budget_total";
  @SerializedName(SERIALIZED_NAME_BUDGET_TOTAL)
  private String budgetTotal;

  public static final String SERIALIZED_NAME_BUDGET_TYPE = "budget_type";
  @SerializedName(SERIALIZED_NAME_BUDGET_TYPE)
  private String budgetType;

  public InteligentBudgetInfo() { 
  }

  public InteligentBudgetInfo budgetTotal(String budgetTotal) {
    
    this.budgetTotal = budgetTotal;
    return this;
  }

   /**
   * 预算数量
   * @return budgetTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "999999", value = "预算数量")

  public String getBudgetTotal() {
    return budgetTotal;
  }


  public void setBudgetTotal(String budgetTotal) {
    this.budgetTotal = budgetTotal;
  }


  public InteligentBudgetInfo budgetType(String budgetType) {
    
    this.budgetType = budgetType;
    return this;
  }

   /**
   * 预算类型，枚举（QUANTITY：数量预算）
   * @return budgetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "QUANTITY", value = "预算类型，枚举（QUANTITY：数量预算）")

  public String getBudgetType() {
    return budgetType;
  }


  public void setBudgetType(String budgetType) {
    this.budgetType = budgetType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteligentBudgetInfo inteligentBudgetInfo = (InteligentBudgetInfo) o;
    return Objects.equals(this.budgetTotal, inteligentBudgetInfo.budgetTotal) &&
        Objects.equals(this.budgetType, inteligentBudgetInfo.budgetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetTotal, budgetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentBudgetInfo {\n");
    sb.append("    budgetTotal: ").append(toIndentedString(budgetTotal)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentBudgetInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentBudgetInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentBudgetInfo is not found in the empty JSON string", InteligentBudgetInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentBudgetInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentBudgetInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("budget_total") != null && !jsonObj.get("budget_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budget_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budget_total").toString()));
      }
      if (jsonObj.get("budget_type") != null && !jsonObj.get("budget_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budget_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budget_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentBudgetInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentBudgetInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentBudgetInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentBudgetInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentBudgetInfo>() {
           @Override
           public void write(JsonWriter out, InteligentBudgetInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentBudgetInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentBudgetInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentBudgetInfo
  * @throws IOException if the JSON string is invalid with respect to InteligentBudgetInfo
  */
  public static InteligentBudgetInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentBudgetInfo.class);
  }

 /**
  * Convert an instance of InteligentBudgetInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

