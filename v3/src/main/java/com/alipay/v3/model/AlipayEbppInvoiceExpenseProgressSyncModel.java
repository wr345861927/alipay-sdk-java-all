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
 * AlipayEbppInvoiceExpenseProgressSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpenseProgressSyncModel {
  public static final String SERIALIZED_NAME_APPLY_ID = "apply_id";
  @SerializedName(SERIALIZED_NAME_APPLY_ID)
  private String applyId;

  public static final String SERIALIZED_NAME_BUSINESS_TIME = "business_time";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TIME)
  private String businessTime;

  public static final String SERIALIZED_NAME_EXPENSE_DETAIL_URL = "expense_detail_url";
  @SerializedName(SERIALIZED_NAME_EXPENSE_DETAIL_URL)
  private String expenseDetailUrl;

  public static final String SERIALIZED_NAME_EXPENSE_ORDER_NO = "expense_order_no";
  @SerializedName(SERIALIZED_NAME_EXPENSE_ORDER_NO)
  private String expenseOrderNo;

  public static final String SERIALIZED_NAME_EXPENSE_TAX_NO = "expense_tax_no";
  @SerializedName(SERIALIZED_NAME_EXPENSE_TAX_NO)
  private String expenseTaxNo;

  public static final String SERIALIZED_NAME_INVOICE_CODE = "invoice_code";
  @SerializedName(SERIALIZED_NAME_INVOICE_CODE)
  private String invoiceCode;

  public static final String SERIALIZED_NAME_INVOICE_NO = "invoice_no";
  @SerializedName(SERIALIZED_NAME_INVOICE_NO)
  private String invoiceNo;

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

  public AlipayEbppInvoiceExpenseProgressSyncModel() { 
  }

  public AlipayEbppInvoiceExpenseProgressSyncModel applyId(String applyId) {
    
    this.applyId = applyId;
    return this;
  }

   /**
   * 同步申请id，每次发起同步时生成，isv每次请求需要保证唯一
   * @return applyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BxpO0dtPbcLLpwD8h5H47ehQXkBdI", value = "同步申请id，每次发起同步时生成，isv每次请求需要保证唯一")

  public String getApplyId() {
    return applyId;
  }


  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }


  public AlipayEbppInvoiceExpenseProgressSyncModel businessTime(String businessTime) {
    
    this.businessTime = businessTime;
    return this;
  }

   /**
   * 报销状态变更执行时间
   * @return businessTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-08-14 10:10:00", value = "报销状态变更执行时间")

  public String getBusinessTime() {
    return businessTime;
  }


  public void setBusinessTime(String businessTime) {
    this.businessTime = businessTime;
  }


  public AlipayEbppInvoiceExpenseProgressSyncModel expenseDetailUrl(String expenseDetailUrl) {
    
    this.expenseDetailUrl = expenseDetailUrl;
    return this;
  }

   /**
   * 报销详情地址，提供用户通过发票管家查看报销进度的地址  如果报销企业入驻发票管家时需要isv传入报销详情地址，则必须提供
   * @return expenseDetailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.baidu.com", value = "报销详情地址，提供用户通过发票管家查看报销进度的地址  如果报销企业入驻发票管家时需要isv传入报销详情地址，则必须提供")

  public String getExpenseDetailUrl() {
    return expenseDetailUrl;
  }


  public void setExpenseDetailUrl(String expenseDetailUrl) {
    this.expenseDetailUrl = expenseDetailUrl;
  }


  public AlipayEbppInvoiceExpenseProgressSyncModel expenseOrderNo(String expenseOrderNo) {
    
    this.expenseOrderNo = expenseOrderNo;
    return this;
  }

   /**
   * 报销单据号
   * @return expenseOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "报销单据号")

  public String getExpenseOrderNo() {
    return expenseOrderNo;
  }


  public void setExpenseOrderNo(String expenseOrderNo) {
    this.expenseOrderNo = expenseOrderNo;
  }


  public AlipayEbppInvoiceExpenseProgressSyncModel expenseTaxNo(String expenseTaxNo) {
    
    this.expenseTaxNo = expenseTaxNo;
    return this;
  }

   /**
   * 报销企业税号
   * @return expenseTaxNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "报销企业税号")

  public String getExpenseTaxNo() {
    return expenseTaxNo;
  }


  public void setExpenseTaxNo(String expenseTaxNo) {
    this.expenseTaxNo = expenseTaxNo;
  }


  public AlipayEbppInvoiceExpenseProgressSyncModel invoiceCode(String invoiceCode) {
    
    this.invoiceCode = invoiceCode;
    return this;
  }

   /**
   * 发票代码
   * @return invoiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890", value = "发票代码")

  public String getInvoiceCode() {
    return invoiceCode;
  }


  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }


  public AlipayEbppInvoiceExpenseProgressSyncModel invoiceNo(String invoiceNo) {
    
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * 发票号码
   * @return invoiceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345678", value = "发票号码")

  public String getInvoiceNo() {
    return invoiceNo;
  }


  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }


  public AlipayEbppInvoiceExpenseProgressSyncModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "财务已打款", value = "备注")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AlipayEbppInvoiceExpenseProgressSyncModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * open_id，支付宝用户id
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "open_id，支付宝用户id")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayEbppInvoiceExpenseProgressSyncModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 报销操作
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXPENSE_APPLY", value = "报销操作")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayEbppInvoiceExpenseProgressSyncModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 发票归属用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000000000000", value = "发票归属用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。")

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
   * @return the AlipayEbppInvoiceExpenseProgressSyncModel instance itself
   */
  public AlipayEbppInvoiceExpenseProgressSyncModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceExpenseProgressSyncModel alipayEbppInvoiceExpenseProgressSyncModel = (AlipayEbppInvoiceExpenseProgressSyncModel) o;
    return Objects.equals(this.applyId, alipayEbppInvoiceExpenseProgressSyncModel.applyId) &&
        Objects.equals(this.businessTime, alipayEbppInvoiceExpenseProgressSyncModel.businessTime) &&
        Objects.equals(this.expenseDetailUrl, alipayEbppInvoiceExpenseProgressSyncModel.expenseDetailUrl) &&
        Objects.equals(this.expenseOrderNo, alipayEbppInvoiceExpenseProgressSyncModel.expenseOrderNo) &&
        Objects.equals(this.expenseTaxNo, alipayEbppInvoiceExpenseProgressSyncModel.expenseTaxNo) &&
        Objects.equals(this.invoiceCode, alipayEbppInvoiceExpenseProgressSyncModel.invoiceCode) &&
        Objects.equals(this.invoiceNo, alipayEbppInvoiceExpenseProgressSyncModel.invoiceNo) &&
        Objects.equals(this.memo, alipayEbppInvoiceExpenseProgressSyncModel.memo) &&
        Objects.equals(this.openId, alipayEbppInvoiceExpenseProgressSyncModel.openId) &&
        Objects.equals(this.status, alipayEbppInvoiceExpenseProgressSyncModel.status) &&
        Objects.equals(this.userId, alipayEbppInvoiceExpenseProgressSyncModel.userId)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceExpenseProgressSyncModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyId, businessTime, expenseDetailUrl, expenseOrderNo, expenseTaxNo, invoiceCode, invoiceNo, memo, openId, status, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpenseProgressSyncModel {\n");
    sb.append("    applyId: ").append(toIndentedString(applyId)).append("\n");
    sb.append("    businessTime: ").append(toIndentedString(businessTime)).append("\n");
    sb.append("    expenseDetailUrl: ").append(toIndentedString(expenseDetailUrl)).append("\n");
    sb.append("    expenseOrderNo: ").append(toIndentedString(expenseOrderNo)).append("\n");
    sb.append("    expenseTaxNo: ").append(toIndentedString(expenseTaxNo)).append("\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
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
    openapiFields.add("apply_id");
    openapiFields.add("business_time");
    openapiFields.add("expense_detail_url");
    openapiFields.add("expense_order_no");
    openapiFields.add("expense_tax_no");
    openapiFields.add("invoice_code");
    openapiFields.add("invoice_no");
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
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpenseProgressSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpenseProgressSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpenseProgressSyncModel is not found in the empty JSON string", AlipayEbppInvoiceExpenseProgressSyncModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("apply_id") != null && !jsonObj.get("apply_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_id").toString()));
      }
      if (jsonObj.get("business_time") != null && !jsonObj.get("business_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_time").toString()));
      }
      if (jsonObj.get("expense_detail_url") != null && !jsonObj.get("expense_detail_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expense_detail_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expense_detail_url").toString()));
      }
      if (jsonObj.get("expense_order_no") != null && !jsonObj.get("expense_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expense_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expense_order_no").toString()));
      }
      if (jsonObj.get("expense_tax_no") != null && !jsonObj.get("expense_tax_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expense_tax_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expense_tax_no").toString()));
      }
      if (jsonObj.get("invoice_code") != null && !jsonObj.get("invoice_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_code").toString()));
      }
      if (jsonObj.get("invoice_no") != null && !jsonObj.get("invoice_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_no").toString()));
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
       if (!AlipayEbppInvoiceExpenseProgressSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpenseProgressSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpenseProgressSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpenseProgressSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpenseProgressSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpenseProgressSyncModel value) throws IOException {
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
           public AlipayEbppInvoiceExpenseProgressSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceExpenseProgressSyncModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceExpenseProgressSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpenseProgressSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpenseProgressSyncModel
  */
  public static AlipayEbppInvoiceExpenseProgressSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpenseProgressSyncModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpenseProgressSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

