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
 * AlipayEbppBillAddResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppBillAddResponseModel {
  public static final String SERIALIZED_NAME_ALIPAY_ORDER_NO = "alipay_order_no";
  @SerializedName(SERIALIZED_NAME_ALIPAY_ORDER_NO)
  private String alipayOrderNo;

  public static final String SERIALIZED_NAME_BANK_BILL_NO = "bank_bill_no";
  @SerializedName(SERIALIZED_NAME_BANK_BILL_NO)
  private String bankBillNo;

  public static final String SERIALIZED_NAME_BILL_DATE = "bill_date";
  @SerializedName(SERIALIZED_NAME_BILL_DATE)
  private String billDate;

  public static final String SERIALIZED_NAME_BILL_KEY = "bill_key";
  @SerializedName(SERIALIZED_NAME_BILL_KEY)
  private String billKey;

  public static final String SERIALIZED_NAME_CHARGE_INST = "charge_inst";
  @SerializedName(SERIALIZED_NAME_CHARGE_INST)
  private String chargeInst;

  public static final String SERIALIZED_NAME_CHARGE_INST_NAME = "charge_inst_name";
  @SerializedName(SERIALIZED_NAME_CHARGE_INST_NAME)
  private String chargeInstName;

  public static final String SERIALIZED_NAME_EXTEND_FIELD = "extend_field";
  @SerializedName(SERIALIZED_NAME_EXTEND_FIELD)
  private String extendField;

  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "merchant_order_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "order_type";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private String orderType;

  public static final String SERIALIZED_NAME_OWNER_NAME = "owner_name";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private String payAmount;

  public static final String SERIALIZED_NAME_SERVICE_AMOUNT = "service_amount";
  @SerializedName(SERIALIZED_NAME_SERVICE_AMOUNT)
  private String serviceAmount;

  public static final String SERIALIZED_NAME_SUB_ORDER_TYPE = "sub_order_type";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_TYPE)
  private String subOrderType;

  public AlipayEbppBillAddResponseModel() { 
  }

  public AlipayEbppBillAddResponseModel alipayOrderNo(String alipayOrderNo) {
    
    this.alipayOrderNo = alipayOrderNo;
    return this;
  }

   /**
   * 支付宝的业务订单号，具有唯一性。
   * @return alipayOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201203088888888", value = "支付宝的业务订单号，具有唯一性。")

  public String getAlipayOrderNo() {
    return alipayOrderNo;
  }


  public void setAlipayOrderNo(String alipayOrderNo) {
    this.alipayOrderNo = alipayOrderNo;
  }


  public AlipayEbppBillAddResponseModel bankBillNo(String bankBillNo) {
    
    this.bankBillNo = bankBillNo;
    return this;
  }

   /**
   * 外部订单号，由于对账时回传给外部商户
   * @return bankBillNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20130705", value = "外部订单号，由于对账时回传给外部商户")

  public String getBankBillNo() {
    return bankBillNo;
  }


  public void setBankBillNo(String bankBillNo) {
    this.bankBillNo = bankBillNo;
  }


  public AlipayEbppBillAddResponseModel billDate(String billDate) {
    
    this.billDate = billDate;
    return this;
  }

   /**
   * 账单的账期，格式为 yyyyMMdd。例如：202012表示2020年12月的账单。
   * @return billDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201203", value = "账单的账期，格式为 yyyyMMdd。例如：202012表示2020年12月的账单。")

  public String getBillDate() {
    return billDate;
  }


  public void setBillDate(String billDate) {
    this.billDate = billDate;
  }


  public AlipayEbppBillAddResponseModel billKey(String billKey) {
    
    this.billKey = billKey;
    return this;
  }

   /**
   * 账单单据号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
   * @return billKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3388102012376451", value = "账单单据号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。")

  public String getBillKey() {
    return billKey;
  }


  public void setBillKey(String billKey) {
    this.billKey = billKey;
  }


  public AlipayEbppBillAddResponseModel chargeInst(String chargeInst) {
    
    this.chargeInst = chargeInst;
    return this;
  }

   /**
   * 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。
   * @return chargeInst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BJCEB", value = "支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。")

  public String getChargeInst() {
    return chargeInst;
  }


  public void setChargeInst(String chargeInst) {
    this.chargeInst = chargeInst;
  }


  public AlipayEbppBillAddResponseModel chargeInstName(String chargeInstName) {
    
    this.chargeInstName = chargeInstName;
    return this;
  }

   /**
   * 出账机构中文名称。
   * @return chargeInstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "北京光大", value = "出账机构中文名称。")

  public String getChargeInstName() {
    return chargeInstName;
  }


  public void setChargeInstName(String chargeInstName) {
    this.chargeInstName = chargeInstName;
  }


  public AlipayEbppBillAddResponseModel extendField(String extendField) {
    
    this.extendField = extendField;
    return this;
  }

   /**
   * 扩展属性，该属性值现在用于确保只有一个人可以支付成功  用法：多个人对同一笔外部欠费单创建多个账单时，确保该值不变
   * @return extendField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20140504", value = "扩展属性，该属性值现在用于确保只有一个人可以支付成功  用法：多个人对同一笔外部欠费单创建多个账单时，确保该值不变")

  public String getExtendField() {
    return extendField;
  }


  public void setExtendField(String extendField) {
    this.extendField = extendField;
  }


  public AlipayEbppBillAddResponseModel merchantOrderNo(String merchantOrderNo) {
    
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * 输出机构的业务流水号，需要保证唯一性。
   * @return merchantOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201203031234567", value = "输出机构的业务流水号，需要保证唯一性。")

  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }


  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }


  public AlipayEbppBillAddResponseModel orderType(String orderType) {
    
    this.orderType = orderType;
    return this;
  }

   /**
   * 支付宝订单类型。枚举支持： *JF：公共事业缴纳。 *WUYE：物业缴费。 *HK：信用卡还款。 *TX：通讯缴费。
   * @return orderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JF", value = "支付宝订单类型。枚举支持： *JF：公共事业缴纳。 *WUYE：物业缴费。 *HK：信用卡还款。 *TX：通讯缴费。")

  public String getOrderType() {
    return orderType;
  }


  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }


  public AlipayEbppBillAddResponseModel ownerName(String ownerName) {
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * 拥有该账单的用户姓名
   * @return ownerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "织绫", value = "拥有该账单的用户姓名")

  public String getOwnerName() {
    return ownerName;
  }


  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public AlipayEbppBillAddResponseModel payAmount(String payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 缴费金额。用户支付的总金额。单位为 元（人民币）。取值范围为[0.01，100000000.00]，精确到小数点后两位。
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23.45", value = "缴费金额。用户支付的总金额。单位为 元（人民币）。取值范围为[0.01，100000000.00]，精确到小数点后两位。")

  public String getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(String payAmount) {
    this.payAmount = payAmount;
  }


  public AlipayEbppBillAddResponseModel serviceAmount(String serviceAmount) {
    
    this.serviceAmount = serviceAmount;
    return this;
  }

   /**
   * 账单的服务费
   * @return serviceAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "账单的服务费")

  public String getServiceAmount() {
    return serviceAmount;
  }


  public void setServiceAmount(String serviceAmount) {
    this.serviceAmount = serviceAmount;
  }


  public AlipayEbppBillAddResponseModel subOrderType(String subOrderType) {
    
    this.subOrderType = subOrderType;
    return this;
  }

   /**
   * 子业务类型是业务类型的下一级概念。枚举支持： *WATER：缴水费。 *ELECTRIC：缴电费。 *GAS：缴燃气费。 *COMMUN：缴固话宽带费。 *CATV：缴有线电视费。 *WUYE：缴物业费。 *RC：定期还车贷代扣。 *RH：定期还房贷代扣。 *RR：定期还房租代扣。 *RN：定期还网贷代扣。 *CZ：手机充值代扣。 例如：WATER表示JF下面的水费。
   * @return subOrderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WATER", value = "子业务类型是业务类型的下一级概念。枚举支持： *WATER：缴水费。 *ELECTRIC：缴电费。 *GAS：缴燃气费。 *COMMUN：缴固话宽带费。 *CATV：缴有线电视费。 *WUYE：缴物业费。 *RC：定期还车贷代扣。 *RH：定期还房贷代扣。 *RR：定期还房租代扣。 *RN：定期还网贷代扣。 *CZ：手机充值代扣。 例如：WATER表示JF下面的水费。")

  public String getSubOrderType() {
    return subOrderType;
  }


  public void setSubOrderType(String subOrderType) {
    this.subOrderType = subOrderType;
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
   * @return the AlipayEbppBillAddResponseModel instance itself
   */
  public AlipayEbppBillAddResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppBillAddResponseModel alipayEbppBillAddResponseModel = (AlipayEbppBillAddResponseModel) o;
    return Objects.equals(this.alipayOrderNo, alipayEbppBillAddResponseModel.alipayOrderNo) &&
        Objects.equals(this.bankBillNo, alipayEbppBillAddResponseModel.bankBillNo) &&
        Objects.equals(this.billDate, alipayEbppBillAddResponseModel.billDate) &&
        Objects.equals(this.billKey, alipayEbppBillAddResponseModel.billKey) &&
        Objects.equals(this.chargeInst, alipayEbppBillAddResponseModel.chargeInst) &&
        Objects.equals(this.chargeInstName, alipayEbppBillAddResponseModel.chargeInstName) &&
        Objects.equals(this.extendField, alipayEbppBillAddResponseModel.extendField) &&
        Objects.equals(this.merchantOrderNo, alipayEbppBillAddResponseModel.merchantOrderNo) &&
        Objects.equals(this.orderType, alipayEbppBillAddResponseModel.orderType) &&
        Objects.equals(this.ownerName, alipayEbppBillAddResponseModel.ownerName) &&
        Objects.equals(this.payAmount, alipayEbppBillAddResponseModel.payAmount) &&
        Objects.equals(this.serviceAmount, alipayEbppBillAddResponseModel.serviceAmount) &&
        Objects.equals(this.subOrderType, alipayEbppBillAddResponseModel.subOrderType)&&
        Objects.equals(this.additionalProperties, alipayEbppBillAddResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayOrderNo, bankBillNo, billDate, billKey, chargeInst, chargeInstName, extendField, merchantOrderNo, orderType, ownerName, payAmount, serviceAmount, subOrderType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppBillAddResponseModel {\n");
    sb.append("    alipayOrderNo: ").append(toIndentedString(alipayOrderNo)).append("\n");
    sb.append("    bankBillNo: ").append(toIndentedString(bankBillNo)).append("\n");
    sb.append("    billDate: ").append(toIndentedString(billDate)).append("\n");
    sb.append("    billKey: ").append(toIndentedString(billKey)).append("\n");
    sb.append("    chargeInst: ").append(toIndentedString(chargeInst)).append("\n");
    sb.append("    chargeInstName: ").append(toIndentedString(chargeInstName)).append("\n");
    sb.append("    extendField: ").append(toIndentedString(extendField)).append("\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    serviceAmount: ").append(toIndentedString(serviceAmount)).append("\n");
    sb.append("    subOrderType: ").append(toIndentedString(subOrderType)).append("\n");
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
    openapiFields.add("alipay_order_no");
    openapiFields.add("bank_bill_no");
    openapiFields.add("bill_date");
    openapiFields.add("bill_key");
    openapiFields.add("charge_inst");
    openapiFields.add("charge_inst_name");
    openapiFields.add("extend_field");
    openapiFields.add("merchant_order_no");
    openapiFields.add("order_type");
    openapiFields.add("owner_name");
    openapiFields.add("pay_amount");
    openapiFields.add("service_amount");
    openapiFields.add("sub_order_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppBillAddResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppBillAddResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppBillAddResponseModel is not found in the empty JSON string", AlipayEbppBillAddResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("alipay_order_no") != null && !jsonObj.get("alipay_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_order_no").toString()));
      }
      if (jsonObj.get("bank_bill_no") != null && !jsonObj.get("bank_bill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_bill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_bill_no").toString()));
      }
      if (jsonObj.get("bill_date") != null && !jsonObj.get("bill_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_date").toString()));
      }
      if (jsonObj.get("bill_key") != null && !jsonObj.get("bill_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_key").toString()));
      }
      if (jsonObj.get("charge_inst") != null && !jsonObj.get("charge_inst").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_inst` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_inst").toString()));
      }
      if (jsonObj.get("charge_inst_name") != null && !jsonObj.get("charge_inst_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_inst_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_inst_name").toString()));
      }
      if (jsonObj.get("extend_field") != null && !jsonObj.get("extend_field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_field").toString()));
      }
      if (jsonObj.get("merchant_order_no") != null && !jsonObj.get("merchant_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_order_no").toString()));
      }
      if (jsonObj.get("order_type") != null && !jsonObj.get("order_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_type").toString()));
      }
      if (jsonObj.get("owner_name") != null && !jsonObj.get("owner_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_name").toString()));
      }
      if (jsonObj.get("pay_amount") != null && !jsonObj.get("pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_amount").toString()));
      }
      if (jsonObj.get("service_amount") != null && !jsonObj.get("service_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_amount").toString()));
      }
      if (jsonObj.get("sub_order_type") != null && !jsonObj.get("sub_order_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_order_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_order_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppBillAddResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppBillAddResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppBillAddResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppBillAddResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppBillAddResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppBillAddResponseModel value) throws IOException {
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
           public AlipayEbppBillAddResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppBillAddResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppBillAddResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppBillAddResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppBillAddResponseModel
  */
  public static AlipayEbppBillAddResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppBillAddResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppBillAddResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

