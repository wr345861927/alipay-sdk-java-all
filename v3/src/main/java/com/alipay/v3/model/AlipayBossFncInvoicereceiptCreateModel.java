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
import com.alipay.v3.model.ArMonthlyBillDTO;
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
 * AlipayBossFncInvoicereceiptCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayBossFncInvoicereceiptCreateModel {
  public static final String SERIALIZED_NAME_EVENT_CODE = "event_code";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_MONTHLY_BILL = "monthly_bill";
  @SerializedName(SERIALIZED_NAME_MONTHLY_BILL)
  private ArMonthlyBillDTO monthlyBill;

  public static final String SERIALIZED_NAME_MSG_ID = "msg_id";
  @SerializedName(SERIALIZED_NAME_MSG_ID)
  private String msgId;

  public static final String SERIALIZED_NAME_OUT_BIZ_TYPE = "out_biz_type";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_TYPE)
  private String outBizType;

  public AlipayBossFncInvoicereceiptCreateModel() { 
  }

  public AlipayBossFncInvoicereceiptCreateModel eventCode(String eventCode) {
    
    this.eventCode = eventCode;
    return this;
  }

   /**
   * 账单金额变更消息事件码  AR_MTHLY_BILL_CREATE:应收账单创建,  AR_MTHLY_BILL_CHANGE:应收金额更新
   * @return eventCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AR_MTHLY_BILL_CREATE", value = "账单金额变更消息事件码  AR_MTHLY_BILL_CREATE:应收账单创建,  AR_MTHLY_BILL_CHANGE:应收金额更新")

  public String getEventCode() {
    return eventCode;
  }


  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }


  public AlipayBossFncInvoicereceiptCreateModel eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * 账单金额变更消息事件类型  CREATE:创建事件,UPDATE:更新事件
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREATE", value = "账单金额变更消息事件类型  CREATE:创建事件,UPDATE:更新事件")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public AlipayBossFncInvoicereceiptCreateModel monthlyBill(ArMonthlyBillDTO monthlyBill) {
    
    this.monthlyBill = monthlyBill;
    return this;
  }

   /**
   * Get monthlyBill
   * @return monthlyBill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArMonthlyBillDTO getMonthlyBill() {
    return monthlyBill;
  }


  public void setMonthlyBill(ArMonthlyBillDTO monthlyBill) {
    this.monthlyBill = monthlyBill;
  }


  public AlipayBossFncInvoicereceiptCreateModel msgId(String msgId) {
    
    this.msgId = msgId;
    return this;
  }

   /**
   * 事件全局id，可以使用uuid
   * @return msgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345678996434444", value = "事件全局id，可以使用uuid")

  public String getMsgId() {
    return msgId;
  }


  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }


  public AlipayBossFncInvoicereceiptCreateModel outBizType(String outBizType) {
    
    this.outBizType = outBizType;
    return this;
  }

   /**
   * 消息来源 01:主站，02：芝麻，03:金融云,04:微贷
   * @return outBizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03", value = "消息来源 01:主站，02：芝麻，03:金融云,04:微贷")

  public String getOutBizType() {
    return outBizType;
  }


  public void setOutBizType(String outBizType) {
    this.outBizType = outBizType;
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
   * @return the AlipayBossFncInvoicereceiptCreateModel instance itself
   */
  public AlipayBossFncInvoicereceiptCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayBossFncInvoicereceiptCreateModel alipayBossFncInvoicereceiptCreateModel = (AlipayBossFncInvoicereceiptCreateModel) o;
    return Objects.equals(this.eventCode, alipayBossFncInvoicereceiptCreateModel.eventCode) &&
        Objects.equals(this.eventType, alipayBossFncInvoicereceiptCreateModel.eventType) &&
        Objects.equals(this.monthlyBill, alipayBossFncInvoicereceiptCreateModel.monthlyBill) &&
        Objects.equals(this.msgId, alipayBossFncInvoicereceiptCreateModel.msgId) &&
        Objects.equals(this.outBizType, alipayBossFncInvoicereceiptCreateModel.outBizType)&&
        Objects.equals(this.additionalProperties, alipayBossFncInvoicereceiptCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCode, eventType, monthlyBill, msgId, outBizType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayBossFncInvoicereceiptCreateModel {\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    monthlyBill: ").append(toIndentedString(monthlyBill)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    outBizType: ").append(toIndentedString(outBizType)).append("\n");
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
    openapiFields.add("event_code");
    openapiFields.add("event_type");
    openapiFields.add("monthly_bill");
    openapiFields.add("msg_id");
    openapiFields.add("out_biz_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayBossFncInvoicereceiptCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayBossFncInvoicereceiptCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayBossFncInvoicereceiptCreateModel is not found in the empty JSON string", AlipayBossFncInvoicereceiptCreateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("event_code") != null && !jsonObj.get("event_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_code").toString()));
      }
      if (jsonObj.get("event_type") != null && !jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
      // validate the optional field `monthly_bill`
      if (jsonObj.getAsJsonObject("monthly_bill") != null) {
        ArMonthlyBillDTO.validateJsonObject(jsonObj.getAsJsonObject("monthly_bill"));
      }
      if (jsonObj.get("msg_id") != null && !jsonObj.get("msg_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg_id").toString()));
      }
      if (jsonObj.get("out_biz_type") != null && !jsonObj.get("out_biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayBossFncInvoicereceiptCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayBossFncInvoicereceiptCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayBossFncInvoicereceiptCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayBossFncInvoicereceiptCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayBossFncInvoicereceiptCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayBossFncInvoicereceiptCreateModel value) throws IOException {
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
           public AlipayBossFncInvoicereceiptCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayBossFncInvoicereceiptCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayBossFncInvoicereceiptCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayBossFncInvoicereceiptCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayBossFncInvoicereceiptCreateModel
  */
  public static AlipayBossFncInvoicereceiptCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayBossFncInvoicereceiptCreateModel.class);
  }

 /**
  * Convert an instance of AlipayBossFncInvoicereceiptCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

