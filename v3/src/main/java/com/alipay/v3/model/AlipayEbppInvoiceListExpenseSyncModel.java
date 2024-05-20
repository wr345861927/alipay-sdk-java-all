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
import com.alipay.v3.model.InvoiceElementStatusSyncOpenModel;
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
 * AlipayEbppInvoiceListExpenseSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceListExpenseSyncModel {
  public static final String SERIALIZED_NAME_BUSINESS_TIME = "business_time";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TIME)
  private String businessTime;

  public static final String SERIALIZED_NAME_EXPENSE_ORDER_NO = "expense_order_no";
  @SerializedName(SERIALIZED_NAME_EXPENSE_ORDER_NO)
  private String expenseOrderNo;

  public static final String SERIALIZED_NAME_EXPENSE_TAX_NO = "expense_tax_no";
  @SerializedName(SERIALIZED_NAME_EXPENSE_TAX_NO)
  private String expenseTaxNo;

  public static final String SERIALIZED_NAME_INVOICE_ELEMENT_LIST = "invoice_element_list";
  @SerializedName(SERIALIZED_NAME_INVOICE_ELEMENT_LIST)
  private List<InvoiceElementStatusSyncOpenModel> invoiceElementList = null;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayEbppInvoiceListExpenseSyncModel() { 
  }

  public AlipayEbppInvoiceListExpenseSyncModel businessTime(String businessTime) {
    
    this.businessTime = businessTime;
    return this;
  }

   /**
   * 报销进度变更时间
   * @return businessTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-08-14 10:10:00", value = "报销进度变更时间")

  public String getBusinessTime() {
    return businessTime;
  }


  public void setBusinessTime(String businessTime) {
    this.businessTime = businessTime;
  }


  public AlipayEbppInvoiceListExpenseSyncModel expenseOrderNo(String expenseOrderNo) {
    
    this.expenseOrderNo = expenseOrderNo;
    return this;
  }

   /**
   * 商户报销单据号
   * @return expenseOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180808128739874213", value = "商户报销单据号")

  public String getExpenseOrderNo() {
    return expenseOrderNo;
  }


  public void setExpenseOrderNo(String expenseOrderNo) {
    this.expenseOrderNo = expenseOrderNo;
  }


  public AlipayEbppInvoiceListExpenseSyncModel expenseTaxNo(String expenseTaxNo) {
    
    this.expenseTaxNo = expenseTaxNo;
    return this;
  }

   /**
   * 报销企业税号
   * @return expenseTaxNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "113071TRDX8RQU8", value = "报销企业税号")

  public String getExpenseTaxNo() {
    return expenseTaxNo;
  }


  public void setExpenseTaxNo(String expenseTaxNo) {
    this.expenseTaxNo = expenseTaxNo;
  }


  public AlipayEbppInvoiceListExpenseSyncModel invoiceElementList(List<InvoiceElementStatusSyncOpenModel> invoiceElementList) {
    
    this.invoiceElementList = invoiceElementList;
    return this;
  }

  public AlipayEbppInvoiceListExpenseSyncModel addInvoiceElementListItem(InvoiceElementStatusSyncOpenModel invoiceElementListItem) {
    if (this.invoiceElementList == null) {
      this.invoiceElementList = new ArrayList<>();
    }
    this.invoiceElementList.add(invoiceElementListItem);
    return this;
  }

   /**
   * 需要同步报销状态的发票列表
   * @return invoiceElementList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "需要同步报销状态的发票列表")

  public List<InvoiceElementStatusSyncOpenModel> getInvoiceElementList() {
    return invoiceElementList;
  }


  public void setInvoiceElementList(List<InvoiceElementStatusSyncOpenModel> invoiceElementList) {
    this.invoiceElementList = invoiceElementList;
  }


  public AlipayEbppInvoiceListExpenseSyncModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 报销审批备注
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "财务已打款", value = "报销审批备注")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AlipayEbppInvoiceListExpenseSyncModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户uid
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "用户uid")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayEbppInvoiceListExpenseSyncModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * EXPENSE_APPLY:报销申请提交;EXPENSE_APPROVAL_PASS:报销申请审核通过;EXPENSE_FINISHED:报销申请完成;EXPENSE_CANCEL:报销申请撤回
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXPENSE_APPLY", value = "EXPENSE_APPLY:报销申请提交;EXPENSE_APPROVAL_PASS:报销申请审核通过;EXPENSE_FINISHED:报销申请完成;EXPENSE_CANCEL:报销申请撤回")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayEbppInvoiceListExpenseSyncModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户uid
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088002000321000", value = "用户uid")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
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
   * @return the AlipayEbppInvoiceListExpenseSyncModel instance itself
   */
  public AlipayEbppInvoiceListExpenseSyncModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceListExpenseSyncModel alipayEbppInvoiceListExpenseSyncModel = (AlipayEbppInvoiceListExpenseSyncModel) o;
    return Objects.equals(this.businessTime, alipayEbppInvoiceListExpenseSyncModel.businessTime) &&
        Objects.equals(this.expenseOrderNo, alipayEbppInvoiceListExpenseSyncModel.expenseOrderNo) &&
        Objects.equals(this.expenseTaxNo, alipayEbppInvoiceListExpenseSyncModel.expenseTaxNo) &&
        Objects.equals(this.invoiceElementList, alipayEbppInvoiceListExpenseSyncModel.invoiceElementList) &&
        Objects.equals(this.memo, alipayEbppInvoiceListExpenseSyncModel.memo) &&
        Objects.equals(this.openId, alipayEbppInvoiceListExpenseSyncModel.openId) &&
        Objects.equals(this.status, alipayEbppInvoiceListExpenseSyncModel.status) &&
        Objects.equals(this.userId, alipayEbppInvoiceListExpenseSyncModel.userId)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceListExpenseSyncModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessTime, expenseOrderNo, expenseTaxNo, invoiceElementList, memo, openId, status, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceListExpenseSyncModel {\n");
    sb.append("    businessTime: ").append(toIndentedString(businessTime)).append("\n");
    sb.append("    expenseOrderNo: ").append(toIndentedString(expenseOrderNo)).append("\n");
    sb.append("    expenseTaxNo: ").append(toIndentedString(expenseTaxNo)).append("\n");
    sb.append("    invoiceElementList: ").append(toIndentedString(invoiceElementList)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("business_time");
    openapiFields.add("expense_order_no");
    openapiFields.add("expense_tax_no");
    openapiFields.add("invoice_element_list");
    openapiFields.add("memo");
    openapiFields.add("open_id");
    openapiFields.add("status");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceListExpenseSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceListExpenseSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceListExpenseSyncModel is not found in the empty JSON string", AlipayEbppInvoiceListExpenseSyncModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("business_time") != null && !jsonObj.get("business_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_time").toString()));
      }
      if (jsonObj.get("expense_order_no") != null && !jsonObj.get("expense_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expense_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expense_order_no").toString()));
      }
      if (jsonObj.get("expense_tax_no") != null && !jsonObj.get("expense_tax_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expense_tax_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expense_tax_no").toString()));
      }
      JsonArray jsonArrayinvoiceElementList = jsonObj.getAsJsonArray("invoice_element_list");
      if (jsonArrayinvoiceElementList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("invoice_element_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `invoice_element_list` to be an array in the JSON string but got `%s`", jsonObj.get("invoice_element_list").toString()));
        }

        // validate the optional field `invoice_element_list` (array)
        for (int i = 0; i < jsonArrayinvoiceElementList.size(); i++) {
          InvoiceElementStatusSyncOpenModel.validateJsonObject(jsonArrayinvoiceElementList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceListExpenseSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceListExpenseSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceListExpenseSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceListExpenseSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceListExpenseSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceListExpenseSyncModel value) throws IOException {
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
           public AlipayEbppInvoiceListExpenseSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceListExpenseSyncModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceListExpenseSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceListExpenseSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceListExpenseSyncModel
  */
  public static AlipayEbppInvoiceListExpenseSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceListExpenseSyncModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceListExpenseSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

