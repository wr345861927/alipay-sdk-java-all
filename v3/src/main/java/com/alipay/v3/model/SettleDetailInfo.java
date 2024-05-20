/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-05-20
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
 * SettleDetailInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SettleDetailInfo {
  public static final String SERIALIZED_NAME_ACTUAL_AMOUNT = "actual_amount";
  @SerializedName(SERIALIZED_NAME_ACTUAL_AMOUNT)
  private String actualAmount;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_SETTLE_ENTITY_ID = "settle_entity_id";
  @SerializedName(SERIALIZED_NAME_SETTLE_ENTITY_ID)
  private String settleEntityId;

  public static final String SERIALIZED_NAME_SETTLE_ENTITY_TYPE = "settle_entity_type";
  @SerializedName(SERIALIZED_NAME_SETTLE_ENTITY_TYPE)
  private String settleEntityType;

  public static final String SERIALIZED_NAME_SUMMARY_DIMENSION = "summary_dimension";
  @SerializedName(SERIALIZED_NAME_SUMMARY_DIMENSION)
  private String summaryDimension;

  public static final String SERIALIZED_NAME_TRANS_IN = "trans_in";
  @SerializedName(SERIALIZED_NAME_TRANS_IN)
  private String transIn;

  public static final String SERIALIZED_NAME_TRANS_IN_TYPE = "trans_in_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_TYPE)
  private String transInType;

  public SettleDetailInfo() { 
  }

  public SettleDetailInfo actualAmount(String actualAmount) {
    
    this.actualAmount = actualAmount;
    return this;
  }

   /**
   * 仅在直付通账期模式下，当一笔交易需要分多次发起部分确认结算时使用，表示本次确认结算的实际结算金额。传递本字段后，原amount字段不再生效，结算金额以本字段为准。如已经发生过部分确认结算、不传递本字段则默认按剩余待结算金额一次性结算。
   * @return actualAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "仅在直付通账期模式下，当一笔交易需要分多次发起部分确认结算时使用，表示本次确认结算的实际结算金额。传递本字段后，原amount字段不再生效，结算金额以本字段为准。如已经发生过部分确认结算、不传递本字段则默认按剩余待结算金额一次性结算。")

  public String getActualAmount() {
    return actualAmount;
  }


  public void setActualAmount(String actualAmount) {
    this.actualAmount = actualAmount;
  }


  public SettleDetailInfo amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 结算的金额，单位为元。在创建订单和支付接口时必须和交易金额相同。在结算确认接口时必须等于交易金额减去已退款金额。直付通账期模式下，如使用部分结算能力、传递了actual_amount字段，则忽略本字段的校验、可不传。
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结算的金额，单位为元。在创建订单和支付接口时必须和交易金额相同。在结算确认接口时必须等于交易金额减去已退款金额。直付通账期模式下，如使用部分结算能力、传递了actual_amount字段，则忽略本字段的校验、可不传。")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public SettleDetailInfo settleEntityId(String settleEntityId) {
    
    this.settleEntityId = settleEntityId;
    return this;
  }

   /**
   * 结算主体标识。当结算主体类型为SecondMerchant时，为二级商户的SecondMerchantID；当结算主体类型为Store时，为门店的外标。
   * @return settleEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结算主体标识。当结算主体类型为SecondMerchant时，为二级商户的SecondMerchantID；当结算主体类型为Store时，为门店的外标。")

  public String getSettleEntityId() {
    return settleEntityId;
  }


  public void setSettleEntityId(String settleEntityId) {
    this.settleEntityId = settleEntityId;
  }


  public SettleDetailInfo settleEntityType(String settleEntityType) {
    
    this.settleEntityType = settleEntityType;
    return this;
  }

   /**
   * 结算主体类型。
   * @return settleEntityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结算主体类型。")

  public String getSettleEntityType() {
    return settleEntityType;
  }


  public void setSettleEntityType(String settleEntityType) {
    this.settleEntityType = settleEntityType;
  }


  public SettleDetailInfo summaryDimension(String summaryDimension) {
    
    this.summaryDimension = summaryDimension;
    return this;
  }

   /**
   * 结算汇总维度，按照这个维度汇总成批次结算，由商户指定。  目前需要和结算收款方账户类型为cardAliasNo配合使用
   * @return summaryDimension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结算汇总维度，按照这个维度汇总成批次结算，由商户指定。  目前需要和结算收款方账户类型为cardAliasNo配合使用")

  public String getSummaryDimension() {
    return summaryDimension;
  }


  public void setSummaryDimension(String summaryDimension) {
    this.summaryDimension = summaryDimension;
  }


  public SettleDetailInfo transIn(String transIn) {
    
    this.transIn = transIn;
    return this;
  }

   /**
   * 结算收款方。当结算收款方类型是cardAliasNo时，本参数为用户在支付宝绑定的卡编号；结算收款方类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；当结算收款方类型是loginName时，本参数为用户的支付宝登录号；当结算收款方类型是defaultSettle时，本参数不能传值，保持为空。
   * @return transIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结算收款方。当结算收款方类型是cardAliasNo时，本参数为用户在支付宝绑定的卡编号；结算收款方类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；当结算收款方类型是loginName时，本参数为用户的支付宝登录号；当结算收款方类型是defaultSettle时，本参数不能传值，保持为空。")

  public String getTransIn() {
    return transIn;
  }


  public void setTransIn(String transIn) {
    this.transIn = transIn;
  }


  public SettleDetailInfo transInType(String transInType) {
    
    this.transInType = transInType;
    return this;
  }

   /**
   * 结算收款方的账户类型。
   * @return transInType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结算收款方的账户类型。")

  public String getTransInType() {
    return transInType;
  }


  public void setTransInType(String transInType) {
    this.transInType = transInType;
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
   * @return the SettleDetailInfo instance itself
   */
  public SettleDetailInfo putAdditionalProperty(String key, Object value) {
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
    SettleDetailInfo settleDetailInfo = (SettleDetailInfo) o;
    return Objects.equals(this.actualAmount, settleDetailInfo.actualAmount) &&
        Objects.equals(this.amount, settleDetailInfo.amount) &&
        Objects.equals(this.settleEntityId, settleDetailInfo.settleEntityId) &&
        Objects.equals(this.settleEntityType, settleDetailInfo.settleEntityType) &&
        Objects.equals(this.summaryDimension, settleDetailInfo.summaryDimension) &&
        Objects.equals(this.transIn, settleDetailInfo.transIn) &&
        Objects.equals(this.transInType, settleDetailInfo.transInType)&&
        Objects.equals(this.additionalProperties, settleDetailInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualAmount, amount, settleEntityId, settleEntityType, summaryDimension, transIn, transInType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettleDetailInfo {\n");
    sb.append("    actualAmount: ").append(toIndentedString(actualAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    settleEntityId: ").append(toIndentedString(settleEntityId)).append("\n");
    sb.append("    settleEntityType: ").append(toIndentedString(settleEntityType)).append("\n");
    sb.append("    summaryDimension: ").append(toIndentedString(summaryDimension)).append("\n");
    sb.append("    transIn: ").append(toIndentedString(transIn)).append("\n");
    sb.append("    transInType: ").append(toIndentedString(transInType)).append("\n");
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
    openapiFields.add("actual_amount");
    openapiFields.add("amount");
    openapiFields.add("settle_entity_id");
    openapiFields.add("settle_entity_type");
    openapiFields.add("summary_dimension");
    openapiFields.add("trans_in");
    openapiFields.add("trans_in_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SettleDetailInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SettleDetailInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettleDetailInfo is not found in the empty JSON string", SettleDetailInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("actual_amount") != null && !jsonObj.get("actual_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_amount").toString()));
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("settle_entity_id") != null && !jsonObj.get("settle_entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_entity_id").toString()));
      }
      if (jsonObj.get("settle_entity_type") != null && !jsonObj.get("settle_entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_entity_type").toString()));
      }
      if (jsonObj.get("summary_dimension") != null && !jsonObj.get("summary_dimension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary_dimension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary_dimension").toString()));
      }
      if (jsonObj.get("trans_in") != null && !jsonObj.get("trans_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in").toString()));
      }
      if (jsonObj.get("trans_in_type") != null && !jsonObj.get("trans_in_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettleDetailInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettleDetailInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettleDetailInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettleDetailInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SettleDetailInfo>() {
           @Override
           public void write(JsonWriter out, SettleDetailInfo value) throws IOException {
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
           public SettleDetailInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SettleDetailInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SettleDetailInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettleDetailInfo
  * @throws IOException if the JSON string is invalid with respect to SettleDetailInfo
  */
  public static SettleDetailInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettleDetailInfo.class);
  }

 /**
  * Convert an instance of SettleDetailInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

