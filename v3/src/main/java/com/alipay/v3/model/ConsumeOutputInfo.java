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
 * ConsumeOutputInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsumeOutputInfo {
  public static final String SERIALIZED_NAME_BILL_NO = "bill_no";
  @SerializedName(SERIALIZED_NAME_BILL_NO)
  private String billNo;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_CONSUME_AMOUNT = "consume_amount";
  @SerializedName(SERIALIZED_NAME_CONSUME_AMOUNT)
  private String consumeAmount;

  public static final String SERIALIZED_NAME_CONSUME_DATE = "consume_date";
  @SerializedName(SERIALIZED_NAME_CONSUME_DATE)
  private String consumeDate;

  public static final String SERIALIZED_NAME_CONSUME_TITLE = "consume_title";
  @SerializedName(SERIALIZED_NAME_CONSUME_TITLE)
  private String consumeTitle;

  public static final String SERIALIZED_NAME_PAYEE_NAME = "payee_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_NAME)
  private String payeeName;

  public ConsumeOutputInfo() { 
  }

  public ConsumeOutputInfo billNo(String billNo) {
    
    this.billNo = billNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return billNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020010900003001020000033189", value = "支付宝交易号")

  public String getBillNo() {
    return billNo;
  }


  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }


  public ConsumeOutputInfo categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 账单分类
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "餐饮", value = "账单分类")

  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public ConsumeOutputInfo consumeAmount(String consumeAmount) {
    
    this.consumeAmount = consumeAmount;
    return this;
  }

   /**
   * 金额
   * @return consumeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30.29", value = "金额")

  public String getConsumeAmount() {
    return consumeAmount;
  }


  public void setConsumeAmount(String consumeAmount) {
    this.consumeAmount = consumeAmount;
  }


  public ConsumeOutputInfo consumeDate(String consumeDate) {
    
    this.consumeDate = consumeDate;
    return this;
  }

   /**
   * 日期
   * @return consumeDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-03-20", value = "日期")

  public String getConsumeDate() {
    return consumeDate;
  }


  public void setConsumeDate(String consumeDate) {
    this.consumeDate = consumeDate;
  }


  public ConsumeOutputInfo consumeTitle(String consumeTitle) {
    
    this.consumeTitle = consumeTitle;
    return this;
  }

   /**
   * 交易记录标题
   * @return consumeTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx餐厅套餐一份", value = "交易记录标题")

  public String getConsumeTitle() {
    return consumeTitle;
  }


  public void setConsumeTitle(String consumeTitle) {
    this.consumeTitle = consumeTitle;
  }


  public ConsumeOutputInfo payeeName(String payeeName) {
    
    this.payeeName = payeeName;
    return this;
  }

   /**
   * 商家名称
   * @return payeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "肯德基", value = "商家名称")

  public String getPayeeName() {
    return payeeName;
  }


  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumeOutputInfo consumeOutputInfo = (ConsumeOutputInfo) o;
    return Objects.equals(this.billNo, consumeOutputInfo.billNo) &&
        Objects.equals(this.categoryName, consumeOutputInfo.categoryName) &&
        Objects.equals(this.consumeAmount, consumeOutputInfo.consumeAmount) &&
        Objects.equals(this.consumeDate, consumeOutputInfo.consumeDate) &&
        Objects.equals(this.consumeTitle, consumeOutputInfo.consumeTitle) &&
        Objects.equals(this.payeeName, consumeOutputInfo.payeeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billNo, categoryName, consumeAmount, consumeDate, consumeTitle, payeeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumeOutputInfo {\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    consumeAmount: ").append(toIndentedString(consumeAmount)).append("\n");
    sb.append("    consumeDate: ").append(toIndentedString(consumeDate)).append("\n");
    sb.append("    consumeTitle: ").append(toIndentedString(consumeTitle)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
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
    openapiFields.add("bill_no");
    openapiFields.add("category_name");
    openapiFields.add("consume_amount");
    openapiFields.add("consume_date");
    openapiFields.add("consume_title");
    openapiFields.add("payee_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsumeOutputInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConsumeOutputInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsumeOutputInfo is not found in the empty JSON string", ConsumeOutputInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsumeOutputInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsumeOutputInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bill_no") != null && !jsonObj.get("bill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_no").toString()));
      }
      if (jsonObj.get("category_name") != null && !jsonObj.get("category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_name").toString()));
      }
      if (jsonObj.get("consume_amount") != null && !jsonObj.get("consume_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_amount").toString()));
      }
      if (jsonObj.get("consume_date") != null && !jsonObj.get("consume_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_date").toString()));
      }
      if (jsonObj.get("consume_title") != null && !jsonObj.get("consume_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_title").toString()));
      }
      if (jsonObj.get("payee_name") != null && !jsonObj.get("payee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsumeOutputInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsumeOutputInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsumeOutputInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsumeOutputInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsumeOutputInfo>() {
           @Override
           public void write(JsonWriter out, ConsumeOutputInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsumeOutputInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsumeOutputInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsumeOutputInfo
  * @throws IOException if the JSON string is invalid with respect to ConsumeOutputInfo
  */
  public static ConsumeOutputInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsumeOutputInfo.class);
  }

 /**
  * Convert an instance of ConsumeOutputInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

