/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
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
 * AmountTypeSyncData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AmountTypeSyncData {
  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private String discountAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_DESC = "discount_desc";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_DESC)
  private String discountDesc;

  public static final String SERIALIZED_NAME_HAS_ALIPAY_TRADE = "has_alipay_trade";
  @SerializedName(SERIALIZED_NAME_HAS_ALIPAY_TRADE)
  private Boolean hasAlipayTrade;

  public static final String SERIALIZED_NAME_TASK_AMOUNT = "task_amount";
  @SerializedName(SERIALIZED_NAME_TASK_AMOUNT)
  private String taskAmount;

  public static final String SERIALIZED_NAME_TASK_DESC = "task_desc";
  @SerializedName(SERIALIZED_NAME_TASK_DESC)
  private String taskDesc;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AmountTypeSyncData() { 
  }

  public AmountTypeSyncData discountAmount(String discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * 商户回传的优惠金额，如用户享受的红包金额，单位元
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.75", value = "商户回传的优惠金额，如用户享受的红包金额，单位元")

  public String getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }


  public AmountTypeSyncData discountDesc(String discountDesc) {
    
    this.discountDesc = discountDesc;
    return this;
  }

   /**
   * 商户数据回传的优惠信息的名称。
   * @return discountDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "消费满减优惠001", value = "商户数据回传的优惠信息的名称。")

  public String getDiscountDesc() {
    return discountDesc;
  }


  public void setDiscountDesc(String discountDesc) {
    this.discountDesc = discountDesc;
  }


  public AmountTypeSyncData hasAlipayTrade(Boolean hasAlipayTrade) {
    
    this.hasAlipayTrade = hasAlipayTrade;
    return this;
  }

   /**
   * 是否为支付宝交易，默认false，表示是否要做支付宝交易关联。此时tradeNo必须传支付宝交易号。
   * @return hasAlipayTrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是否为支付宝交易，默认false，表示是否要做支付宝交易关联。此时tradeNo必须传支付宝交易号。")

  public Boolean getHasAlipayTrade() {
    return hasAlipayTrade;
  }


  public void setHasAlipayTrade(Boolean hasAlipayTrade) {
    this.hasAlipayTrade = hasAlipayTrade;
  }


  public AmountTypeSyncData taskAmount(String taskAmount) {
    
    this.taskAmount = taskAmount;
    return this;
  }

   /**
   * 用户和商户发生交易的交易单金额，单位元。
   * @return taskAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.57", value = "用户和商户发生交易的交易单金额，单位元。")

  public String getTaskAmount() {
    return taskAmount;
  }


  public void setTaskAmount(String taskAmount) {
    this.taskAmount = taskAmount;
  }


  public AmountTypeSyncData taskDesc(String taskDesc) {
    
    this.taskDesc = taskDesc;
    return this;
  }

   /**
   * 任务描述
   * @return taskDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "完成一次任务001", value = "任务描述")

  public String getTaskDesc() {
    return taskDesc;
  }


  public void setTaskDesc(String taskDesc) {
    this.taskDesc = taskDesc;
  }


  public AmountTypeSyncData tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 用户和商户发生金额类交易的交易单号。
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020081722001435461000061785", value = "用户和商户发生金额类交易的交易单号。")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
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
   * @return the AmountTypeSyncData instance itself
   */
  public AmountTypeSyncData putAdditionalProperty(String key, Object value) {
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
    AmountTypeSyncData amountTypeSyncData = (AmountTypeSyncData) o;
    return Objects.equals(this.discountAmount, amountTypeSyncData.discountAmount) &&
        Objects.equals(this.discountDesc, amountTypeSyncData.discountDesc) &&
        Objects.equals(this.hasAlipayTrade, amountTypeSyncData.hasAlipayTrade) &&
        Objects.equals(this.taskAmount, amountTypeSyncData.taskAmount) &&
        Objects.equals(this.taskDesc, amountTypeSyncData.taskDesc) &&
        Objects.equals(this.tradeNo, amountTypeSyncData.tradeNo)&&
        Objects.equals(this.additionalProperties, amountTypeSyncData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAmount, discountDesc, hasAlipayTrade, taskAmount, taskDesc, tradeNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountTypeSyncData {\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountDesc: ").append(toIndentedString(discountDesc)).append("\n");
    sb.append("    hasAlipayTrade: ").append(toIndentedString(hasAlipayTrade)).append("\n");
    sb.append("    taskAmount: ").append(toIndentedString(taskAmount)).append("\n");
    sb.append("    taskDesc: ").append(toIndentedString(taskDesc)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("discount_amount");
    openapiFields.add("discount_desc");
    openapiFields.add("has_alipay_trade");
    openapiFields.add("task_amount");
    openapiFields.add("task_desc");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AmountTypeSyncData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AmountTypeSyncData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AmountTypeSyncData is not found in the empty JSON string", AmountTypeSyncData.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("discount_amount") != null && !jsonObj.get("discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_amount").toString()));
      }
      if (jsonObj.get("discount_desc") != null && !jsonObj.get("discount_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_desc").toString()));
      }
      if (jsonObj.get("task_amount") != null && !jsonObj.get("task_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_amount").toString()));
      }
      if (jsonObj.get("task_desc") != null && !jsonObj.get("task_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_desc").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmountTypeSyncData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmountTypeSyncData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmountTypeSyncData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmountTypeSyncData.class));

       return (TypeAdapter<T>) new TypeAdapter<AmountTypeSyncData>() {
           @Override
           public void write(JsonWriter out, AmountTypeSyncData value) throws IOException {
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
           public AmountTypeSyncData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AmountTypeSyncData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AmountTypeSyncData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AmountTypeSyncData
  * @throws IOException if the JSON string is invalid with respect to AmountTypeSyncData
  */
  public static AmountTypeSyncData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmountTypeSyncData.class);
  }

 /**
  * Convert an instance of AmountTypeSyncData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

