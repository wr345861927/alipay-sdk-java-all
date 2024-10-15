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
 * AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DEAL_TIME = "deal_time";
  @SerializedName(SERIALIZED_NAME_DEAL_TIME)
  private String dealTime;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID_TYPE = "employee_id_type";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID_TYPE)
  private Integer employeeIdType;

  public static final String SERIALIZED_NAME_EMPLOYEE_OPEN_ID = "employee_open_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_OPEN_ID)
  private String employeeOpenId;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_EXTEND = "extend";
  @SerializedName(SERIALIZED_NAME_EXTEND)
  private String extend;

  public static final String SERIALIZED_NAME_IS_OFF_SET = "is_off_set";
  @SerializedName(SERIALIZED_NAME_IS_OFF_SET)
  private Integer isOffSet;

  public static final String SERIALIZED_NAME_OUT_SOURCE_ID = "out_source_id";
  @SerializedName(SERIALIZED_NAME_OUT_SOURCE_ID)
  private String outSourceId;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_RELATE_NO = "relate_no";
  @SerializedName(SERIALIZED_NAME_RELATE_NO)
  private String relateNo;

  public static final String SERIALIZED_NAME_STANDARD_ID = "standard_id";
  @SerializedName(SERIALIZED_NAME_STANDARD_ID)
  private String standardId;

  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel() { 
  }

  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业共同账户id
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业共同账户id")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001112341234", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 消费金额
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "消费金额")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel dealTime(String dealTime) {
    
    this.dealTime = dealTime;
    return this;
  }

   /**
   * 交易发生时间
   * @return dealTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 12:00:00", value = "交易发生时间")

  public String getDealTime() {
    return dealTime;
  }


  public void setDealTime(String dealTime) {
    this.dealTime = dealTime;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 员工id
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088210888827370", value = "员工id")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel employeeIdType(Integer employeeIdType) {
    
    this.employeeIdType = employeeIdType;
    return this;
  }

   /**
   * 员工账号类型
   * @return employeeIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "员工账号类型")

  public Integer getEmployeeIdType() {
    return employeeIdType;
  }


  public void setEmployeeIdType(Integer employeeIdType) {
    this.employeeIdType = employeeIdType;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel employeeOpenId(String employeeOpenId) {
    
    this.employeeOpenId = employeeOpenId;
    return this;
  }

   /**
   * 员工开放id
   * @return employeeOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcdxxxx", value = "员工开放id")

  public String getEmployeeOpenId() {
    return employeeOpenId;
  }


  public void setEmployeeOpenId(String employeeOpenId) {
    this.employeeOpenId = employeeOpenId;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel extend(String extend) {
    
    this.extend = extend;
    return this;
  }

   /**
   * 拓展参数
   * @return extend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\\\"adcode\\\":\\\"310000\\\"}", value = "拓展参数")

  public String getExtend() {
    return extend;
  }


  public void setExtend(String extend) {
    this.extend = extend;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel isOffSet(Integer isOffSet) {
    
    this.isOffSet = isOffSet;
    return this;
  }

   /**
   * 交易类型
   * @return isOffSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "交易类型")

  public Integer getIsOffSet() {
    return isOffSet;
  }


  public void setIsOffSet(Integer isOffSet) {
    this.isOffSet = isOffSet;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel outSourceId(String outSourceId) {
    
    this.outSourceId = outSourceId;
    return this;
  }

   /**
   * 外部交易支付单号
   * @return outSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TN00000000000001", value = "外部交易支付单号")

  public String getOutSourceId() {
    return outSourceId;
  }


  public void setOutSourceId(String outSourceId) {
    this.outSourceId = outSourceId;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 外部平台编码
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DAO_AN", value = "外部平台编码")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel relateNo(String relateNo) {
    
    this.relateNo = relateNo;
    return this;
  }

   /**
   * 外部交易退款单号
   * @return relateNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200222222222", value = "外部交易退款单号")

  public String getRelateNo() {
    return relateNo;
  }


  public void setRelateNo(String relateNo) {
    this.relateNo = relateNo;
  }


  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel standardId(String standardId) {
    
    this.standardId = standardId;
    return this;
  }

   /**
   * 费控规则ID
   * @return standardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021082700152601730000003677", value = "费控规则ID")

  public String getStandardId() {
    return standardId;
  }


  public void setStandardId(String standardId) {
    this.standardId = standardId;
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
   * @return the AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel instance itself
   */
  public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel alipayEbppInvoiceExpensecomsueOutsourceNotifyModel = (AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.agreementNo) &&
        Objects.equals(this.amount, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.amount) &&
        Objects.equals(this.dealTime, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.dealTime) &&
        Objects.equals(this.employeeId, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.employeeId) &&
        Objects.equals(this.employeeIdType, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.employeeIdType) &&
        Objects.equals(this.employeeOpenId, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.employeeOpenId) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.enterpriseId) &&
        Objects.equals(this.extend, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.extend) &&
        Objects.equals(this.isOffSet, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.isOffSet) &&
        Objects.equals(this.outSourceId, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.outSourceId) &&
        Objects.equals(this.platform, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.platform) &&
        Objects.equals(this.relateNo, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.relateNo) &&
        Objects.equals(this.standardId, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.standardId)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceExpensecomsueOutsourceNotifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, amount, dealTime, employeeId, employeeIdType, employeeOpenId, enterpriseId, extend, isOffSet, outSourceId, platform, relateNo, standardId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dealTime: ").append(toIndentedString(dealTime)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeIdType: ").append(toIndentedString(employeeIdType)).append("\n");
    sb.append("    employeeOpenId: ").append(toIndentedString(employeeOpenId)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
    sb.append("    isOffSet: ").append(toIndentedString(isOffSet)).append("\n");
    sb.append("    outSourceId: ").append(toIndentedString(outSourceId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    relateNo: ").append(toIndentedString(relateNo)).append("\n");
    sb.append("    standardId: ").append(toIndentedString(standardId)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("agreement_no");
    openapiFields.add("amount");
    openapiFields.add("deal_time");
    openapiFields.add("employee_id");
    openapiFields.add("employee_id_type");
    openapiFields.add("employee_open_id");
    openapiFields.add("enterprise_id");
    openapiFields.add("extend");
    openapiFields.add("is_off_set");
    openapiFields.add("out_source_id");
    openapiFields.add("platform");
    openapiFields.add("relate_no");
    openapiFields.add("standard_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel is not found in the empty JSON string", AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("deal_time") != null && !jsonObj.get("deal_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deal_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deal_time").toString()));
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("employee_open_id") != null && !jsonObj.get("employee_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_open_id").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("extend") != null && !jsonObj.get("extend").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend").toString()));
      }
      if (jsonObj.get("out_source_id") != null && !jsonObj.get("out_source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_source_id").toString()));
      }
      if (jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if (jsonObj.get("relate_no") != null && !jsonObj.get("relate_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relate_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relate_no").toString()));
      }
      if (jsonObj.get("standard_id") != null && !jsonObj.get("standard_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel value) throws IOException {
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
           public AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel
  */
  public static AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

