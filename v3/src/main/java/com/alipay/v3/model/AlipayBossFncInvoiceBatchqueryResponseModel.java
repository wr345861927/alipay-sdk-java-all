/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.ArInvoiceOpenApiResponse;
import com.alipay.v3.model.MultiCurrencyMoneyOpenApi;
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
 * AlipayBossFncInvoiceBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayBossFncInvoiceBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_AMT = "amt";
  @SerializedName(SERIALIZED_NAME_AMT)
  private MultiCurrencyMoneyOpenApi amt;

  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_ITEMS_PAGE = "items_page";
  @SerializedName(SERIALIZED_NAME_ITEMS_PAGE)
  private Integer itemsPage;

  public static final String SERIALIZED_NAME_RESULT_SET = "result_set";
  @SerializedName(SERIALIZED_NAME_RESULT_SET)
  private List<ArInvoiceOpenApiResponse> resultSet = null;

  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "total_items";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private Integer totalItems;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public AlipayBossFncInvoiceBatchqueryResponseModel() { 
  }

  public AlipayBossFncInvoiceBatchqueryResponseModel amt(MultiCurrencyMoneyOpenApi amt) {
    
    this.amt = amt;
    return this;
  }

   /**
   * Get amt
   * @return amt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiCurrencyMoneyOpenApi getAmt() {
    return amt;
  }


  public void setAmt(MultiCurrencyMoneyOpenApi amt) {
    this.amt = amt;
  }


  public AlipayBossFncInvoiceBatchqueryResponseModel currentPage(Integer currentPage) {
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * 当前页码
   * @return currentPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "当前页码")

  public Integer getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }


  public AlipayBossFncInvoiceBatchqueryResponseModel itemsPage(Integer itemsPage) {
    
    this.itemsPage = itemsPage;
    return this;
  }

   /**
   * 每页条数
   * @return itemsPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "每页条数")

  public Integer getItemsPage() {
    return itemsPage;
  }


  public void setItemsPage(Integer itemsPage) {
    this.itemsPage = itemsPage;
  }


  public AlipayBossFncInvoiceBatchqueryResponseModel resultSet(List<ArInvoiceOpenApiResponse> resultSet) {
    
    this.resultSet = resultSet;
    return this;
  }

  public AlipayBossFncInvoiceBatchqueryResponseModel addResultSetItem(ArInvoiceOpenApiResponse resultSetItem) {
    if (this.resultSet == null) {
      this.resultSet = new ArrayList<>();
    }
    this.resultSet.add(resultSetItem);
    return this;
  }

   /**
   * 结果对象,发票对象的集合
   * @return resultSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结果对象,发票对象的集合")

  public List<ArInvoiceOpenApiResponse> getResultSet() {
    return resultSet;
  }


  public void setResultSet(List<ArInvoiceOpenApiResponse> resultSet) {
    this.resultSet = resultSet;
  }


  public AlipayBossFncInvoiceBatchqueryResponseModel totalItems(Integer totalItems) {
    
    this.totalItems = totalItems;
    return this;
  }

   /**
   * 查询到的结果总数
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "查询到的结果总数")

  public Integer getTotalItems() {
    return totalItems;
  }


  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }


  public AlipayBossFncInvoiceBatchqueryResponseModel totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * 总页数
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "总页数")

  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
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
   * @return the AlipayBossFncInvoiceBatchqueryResponseModel instance itself
   */
  public AlipayBossFncInvoiceBatchqueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayBossFncInvoiceBatchqueryResponseModel alipayBossFncInvoiceBatchqueryResponseModel = (AlipayBossFncInvoiceBatchqueryResponseModel) o;
    return Objects.equals(this.amt, alipayBossFncInvoiceBatchqueryResponseModel.amt) &&
        Objects.equals(this.currentPage, alipayBossFncInvoiceBatchqueryResponseModel.currentPage) &&
        Objects.equals(this.itemsPage, alipayBossFncInvoiceBatchqueryResponseModel.itemsPage) &&
        Objects.equals(this.resultSet, alipayBossFncInvoiceBatchqueryResponseModel.resultSet) &&
        Objects.equals(this.totalItems, alipayBossFncInvoiceBatchqueryResponseModel.totalItems) &&
        Objects.equals(this.totalPages, alipayBossFncInvoiceBatchqueryResponseModel.totalPages)&&
        Objects.equals(this.additionalProperties, alipayBossFncInvoiceBatchqueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amt, currentPage, itemsPage, resultSet, totalItems, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayBossFncInvoiceBatchqueryResponseModel {\n");
    sb.append("    amt: ").append(toIndentedString(amt)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    itemsPage: ").append(toIndentedString(itemsPage)).append("\n");
    sb.append("    resultSet: ").append(toIndentedString(resultSet)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
    openapiFields.add("amt");
    openapiFields.add("current_page");
    openapiFields.add("items_page");
    openapiFields.add("result_set");
    openapiFields.add("total_items");
    openapiFields.add("total_pages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayBossFncInvoiceBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayBossFncInvoiceBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayBossFncInvoiceBatchqueryResponseModel is not found in the empty JSON string", AlipayBossFncInvoiceBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `amt`
      if (jsonObj.getAsJsonObject("amt") != null) {
        MultiCurrencyMoneyOpenApi.validateJsonObject(jsonObj.getAsJsonObject("amt"));
      }
      JsonArray jsonArrayresultSet = jsonObj.getAsJsonArray("result_set");
      if (jsonArrayresultSet != null) {
        // ensure the json data is an array
        if (!jsonObj.get("result_set").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `result_set` to be an array in the JSON string but got `%s`", jsonObj.get("result_set").toString()));
        }

        // validate the optional field `result_set` (array)
        for (int i = 0; i < jsonArrayresultSet.size(); i++) {
          ArInvoiceOpenApiResponse.validateJsonObject(jsonArrayresultSet.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayBossFncInvoiceBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayBossFncInvoiceBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayBossFncInvoiceBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayBossFncInvoiceBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayBossFncInvoiceBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayBossFncInvoiceBatchqueryResponseModel value) throws IOException {
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
           public AlipayBossFncInvoiceBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayBossFncInvoiceBatchqueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayBossFncInvoiceBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayBossFncInvoiceBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayBossFncInvoiceBatchqueryResponseModel
  */
  public static AlipayBossFncInvoiceBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayBossFncInvoiceBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayBossFncInvoiceBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

