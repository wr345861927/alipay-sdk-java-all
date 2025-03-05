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
 * AccountLogItemResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountLogItemResult {
  public static final String SERIALIZED_NAME_ACCOUNT_LOG_ID = "account_log_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_LOG_ID)
  private String accountLogId;

  public static final String SERIALIZED_NAME_ALIPAY_ORDER_NO = "alipay_order_no";
  @SerializedName(SERIALIZED_NAME_ALIPAY_ORDER_NO)
  private String alipayOrderNo;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;

  public static final String SERIALIZED_NAME_BILL_SOURCE = "bill_source";
  @SerializedName(SERIALIZED_NAME_BILL_SOURCE)
  private String billSource;

  public static final String SERIALIZED_NAME_BIZ_DESC = "biz_desc";
  @SerializedName(SERIALIZED_NAME_BIZ_DESC)
  private String bizDesc;

  public static final String SERIALIZED_NAME_BIZ_NOS = "biz_nos";
  @SerializedName(SERIALIZED_NAME_BIZ_NOS)
  private String bizNos;

  public static final String SERIALIZED_NAME_BIZ_ORIG_NO = "biz_orig_no";
  @SerializedName(SERIALIZED_NAME_BIZ_ORIG_NO)
  private String bizOrigNo;

  public static final String SERIALIZED_NAME_COMPLEMENT_INFO = "complement_info";
  @SerializedName(SERIALIZED_NAME_COMPLEMENT_INFO)
  private String complementInfo;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private String direction;

  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "merchant_order_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_MERCHANT_OUT_REFUND_NO = "merchant_out_refund_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_OUT_REFUND_NO)
  private String merchantOutRefundNo;

  public static final String SERIALIZED_NAME_OTHER_ACCOUNT = "other_account";
  @SerializedName(SERIALIZED_NAME_OTHER_ACCOUNT)
  private String otherAccount;

  public static final String SERIALIZED_NAME_STORE_NAME = "store_name";
  @SerializedName(SERIALIZED_NAME_STORE_NAME)
  private String storeName;

  public static final String SERIALIZED_NAME_TRANS_AMOUNT = "trans_amount";
  @SerializedName(SERIALIZED_NAME_TRANS_AMOUNT)
  private String transAmount;

  public static final String SERIALIZED_NAME_TRANS_DT = "trans_dt";
  @SerializedName(SERIALIZED_NAME_TRANS_DT)
  private String transDt;

  public static final String SERIALIZED_NAME_TRANS_MEMO = "trans_memo";
  @SerializedName(SERIALIZED_NAME_TRANS_MEMO)
  private String transMemo;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AccountLogItemResult() { 
  }

  public AccountLogItemResult accountLogId(String accountLogId) {
    
    this.accountLogId = accountLogId;
    return this;
  }

   /**
   * 支付宝账务流水号。对账使用，不脱敏
   * @return accountLogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1***", value = "支付宝账务流水号。对账使用，不脱敏")

  public String getAccountLogId() {
    return accountLogId;
  }


  public void setAccountLogId(String accountLogId) {
    this.accountLogId = accountLogId;
  }


  public AccountLogItemResult alipayOrderNo(String alipayOrderNo) {
    
    this.alipayOrderNo = alipayOrderNo;
    return this;
  }

   /**
   * 支付宝订单号。对账使用，不脱敏
   * @return alipayOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190101***", value = "支付宝订单号。对账使用，不脱敏")

  public String getAlipayOrderNo() {
    return alipayOrderNo;
  }


  public void setAlipayOrderNo(String alipayOrderNo) {
    this.alipayOrderNo = alipayOrderNo;
  }


  public AccountLogItemResult balance(String balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 余额，仅供参考。由于架构原因，余额变动并不保证连续。也就是余额不一定等于上一笔余额减去当笔金额。但是会保证最终一致。
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000.00", value = "余额，仅供参考。由于架构原因，余额变动并不保证连续。也就是余额不一定等于上一笔余额减去当笔金额。但是会保证最终一致。")

  public String getBalance() {
    return balance;
  }


  public void setBalance(String balance) {
    this.balance = balance;
  }


  public AccountLogItemResult billSource(String billSource) {
    
    this.billSource = billSource;
    return this;
  }

   /**
   * 业务账单来源，资金收支对应的上游业务订单数据来源，确认业务订单出处。此字段供商户对账使用，不脱敏。
   * @return billSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商家中心", value = "业务账单来源，资金收支对应的上游业务订单数据来源，确认业务订单出处。此字段供商户对账使用，不脱敏。")

  public String getBillSource() {
    return billSource;
  }


  public void setBillSource(String billSource) {
    this.billSource = billSource;
  }


  public AccountLogItemResult bizDesc(String bizDesc) {
    
    this.bizDesc = bizDesc;
    return this;
  }

   /**
   * 业务描述，资金收支对应的详细业务场景信息。此字段供商户对账使用，不脱敏。
   * @return bizDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "002***|交易退款", value = "业务描述，资金收支对应的详细业务场景信息。此字段供商户对账使用，不脱敏。")

  public String getBizDesc() {
    return bizDesc;
  }


  public void setBizDesc(String bizDesc) {
    this.bizDesc = bizDesc;
  }


  public AccountLogItemResult bizNos(String bizNos) {
    
    this.bizNos = bizNos;
    return this;
  }

   /**
   * 业务订单号，资金收支相关的业务场景订单号明细，字母大写；M：平台交易主单号，S：平台交易子单号，O：业务系统单据号（如退款订单号）。此字段供商户对账使用，不脱敏。
   * @return bizNos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "M{330***}|S{330***}|O{192***}", value = "业务订单号，资金收支相关的业务场景订单号明细，字母大写；M：平台交易主单号，S：平台交易子单号，O：业务系统单据号（如退款订单号）。此字段供商户对账使用，不脱敏。")

  public String getBizNos() {
    return bizNos;
  }


  public void setBizNos(String bizNos) {
    this.bizNos = bizNos;
  }


  public AccountLogItemResult bizOrigNo(String bizOrigNo) {
    
    this.bizOrigNo = bizOrigNo;
    return this;
  }

   /**
   * 业务基础订单号，资金收支对应的原始业务订单唯一识别编号。此字段供商户对账使用，不脱敏。
   * @return bizOrigNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330***", value = "业务基础订单号，资金收支对应的原始业务订单唯一识别编号。此字段供商户对账使用，不脱敏。")

  public String getBizOrigNo() {
    return bizOrigNo;
  }


  public void setBizOrigNo(String bizOrigNo) {
    this.bizOrigNo = bizOrigNo;
  }


  public AccountLogItemResult complementInfo(String complementInfo) {
    
    this.complementInfo = complementInfo;
    return this;
  }

   /**
   * 账单的补全信息，用于特殊场景，普通商户不需要传值，对账时可忽略。
   * @return complementInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商家中心", value = "账单的补全信息，用于特殊场景，普通商户不需要传值，对账时可忽略。")

  public String getComplementInfo() {
    return complementInfo;
  }


  public void setComplementInfo(String complementInfo) {
    this.complementInfo = complementInfo;
  }


  public AccountLogItemResult direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * 收入/支出。表示收支。amount是正数，返回“收入”。amount是负数，返回“支出”
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "收入", value = "收入/支出。表示收支。amount是正数，返回“收入”。amount是负数，返回“支出”")

  public String getDirection() {
    return direction;
  }


  public void setDirection(String direction) {
    this.direction = direction;
  }


  public AccountLogItemResult merchantOrderNo(String merchantOrderNo) {
    
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * 商户订单号，创建支付宝交易时传入的信息。对账使用，不脱敏
   * @return merchantOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TX***", value = "商户订单号，创建支付宝交易时传入的信息。对账使用，不脱敏")

  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }


  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }


  public AccountLogItemResult merchantOutRefundNo(String merchantOutRefundNo) {
    
    this.merchantOutRefundNo = merchantOutRefundNo;
    return this;
  }

   /**
   * 支付宝交易商户退款请求号。对应商户在调用收单退款接口openApi请求传入的outRequestNo参数值
   * @return merchantOutRefundNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211119***", value = "支付宝交易商户退款请求号。对应商户在调用收单退款接口openApi请求传入的outRequestNo参数值")

  public String getMerchantOutRefundNo() {
    return merchantOutRefundNo;
  }


  public void setMerchantOutRefundNo(String merchantOutRefundNo) {
    this.merchantOutRefundNo = merchantOutRefundNo;
  }


  public AccountLogItemResult otherAccount(String otherAccount) {
    
    this.otherAccount = otherAccount;
    return this;
  }

   /**
   * 对方账户
   * @return otherAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张*(a*@alipay.com)", value = "对方账户")

  public String getOtherAccount() {
    return otherAccount;
  }


  public void setOtherAccount(String otherAccount) {
    this.otherAccount = otherAccount;
  }


  public AccountLogItemResult storeName(String storeName) {
    
    this.storeName = storeName;
    return this;
  }

   /**
   * 门店信息
   * @return storeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州一店", value = "门店信息")

  public String getStoreName() {
    return storeName;
  }


  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }


  public AccountLogItemResult transAmount(String transAmount) {
    
    this.transAmount = transAmount;
    return this;
  }

   /**
   * 金额
   * @return transAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.00", value = "金额")

  public String getTransAmount() {
    return transAmount;
  }


  public void setTransAmount(String transAmount) {
    this.transAmount = transAmount;
  }


  public AccountLogItemResult transDt(String transDt) {
    
    this.transDt = transDt;
    return this;
  }

   /**
   * 入账时间
   * @return transDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01 00:00:00", value = "入账时间")

  public String getTransDt() {
    return transDt;
  }


  public void setTransDt(String transDt) {
    this.transDt = transDt;
  }


  public AccountLogItemResult transMemo(String transMemo) {
    
    this.transMemo = transMemo;
    return this;
  }

   /**
   * 账务备注。由上游业务决定，不可依赖此字段进行对账
   * @return transMemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "备注1", value = "账务备注。由上游业务决定，不可依赖此字段进行对账")

  public String getTransMemo() {
    return transMemo;
  }


  public void setTransMemo(String transMemo) {
    this.transMemo = transMemo;
  }


  public AccountLogItemResult type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 账务记录的类型，仅供参考
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "交易", value = "账务记录的类型，仅供参考")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
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
   * @return the AccountLogItemResult instance itself
   */
  public AccountLogItemResult putAdditionalProperty(String key, Object value) {
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
    AccountLogItemResult accountLogItemResult = (AccountLogItemResult) o;
    return Objects.equals(this.accountLogId, accountLogItemResult.accountLogId) &&
        Objects.equals(this.alipayOrderNo, accountLogItemResult.alipayOrderNo) &&
        Objects.equals(this.balance, accountLogItemResult.balance) &&
        Objects.equals(this.billSource, accountLogItemResult.billSource) &&
        Objects.equals(this.bizDesc, accountLogItemResult.bizDesc) &&
        Objects.equals(this.bizNos, accountLogItemResult.bizNos) &&
        Objects.equals(this.bizOrigNo, accountLogItemResult.bizOrigNo) &&
        Objects.equals(this.complementInfo, accountLogItemResult.complementInfo) &&
        Objects.equals(this.direction, accountLogItemResult.direction) &&
        Objects.equals(this.merchantOrderNo, accountLogItemResult.merchantOrderNo) &&
        Objects.equals(this.merchantOutRefundNo, accountLogItemResult.merchantOutRefundNo) &&
        Objects.equals(this.otherAccount, accountLogItemResult.otherAccount) &&
        Objects.equals(this.storeName, accountLogItemResult.storeName) &&
        Objects.equals(this.transAmount, accountLogItemResult.transAmount) &&
        Objects.equals(this.transDt, accountLogItemResult.transDt) &&
        Objects.equals(this.transMemo, accountLogItemResult.transMemo) &&
        Objects.equals(this.type, accountLogItemResult.type)&&
        Objects.equals(this.additionalProperties, accountLogItemResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLogId, alipayOrderNo, balance, billSource, bizDesc, bizNos, bizOrigNo, complementInfo, direction, merchantOrderNo, merchantOutRefundNo, otherAccount, storeName, transAmount, transDt, transMemo, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLogItemResult {\n");
    sb.append("    accountLogId: ").append(toIndentedString(accountLogId)).append("\n");
    sb.append("    alipayOrderNo: ").append(toIndentedString(alipayOrderNo)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    billSource: ").append(toIndentedString(billSource)).append("\n");
    sb.append("    bizDesc: ").append(toIndentedString(bizDesc)).append("\n");
    sb.append("    bizNos: ").append(toIndentedString(bizNos)).append("\n");
    sb.append("    bizOrigNo: ").append(toIndentedString(bizOrigNo)).append("\n");
    sb.append("    complementInfo: ").append(toIndentedString(complementInfo)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    merchantOutRefundNo: ").append(toIndentedString(merchantOutRefundNo)).append("\n");
    sb.append("    otherAccount: ").append(toIndentedString(otherAccount)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    transAmount: ").append(toIndentedString(transAmount)).append("\n");
    sb.append("    transDt: ").append(toIndentedString(transDt)).append("\n");
    sb.append("    transMemo: ").append(toIndentedString(transMemo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("account_log_id");
    openapiFields.add("alipay_order_no");
    openapiFields.add("balance");
    openapiFields.add("bill_source");
    openapiFields.add("biz_desc");
    openapiFields.add("biz_nos");
    openapiFields.add("biz_orig_no");
    openapiFields.add("complement_info");
    openapiFields.add("direction");
    openapiFields.add("merchant_order_no");
    openapiFields.add("merchant_out_refund_no");
    openapiFields.add("other_account");
    openapiFields.add("store_name");
    openapiFields.add("trans_amount");
    openapiFields.add("trans_dt");
    openapiFields.add("trans_memo");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountLogItemResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccountLogItemResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountLogItemResult is not found in the empty JSON string", AccountLogItemResult.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_log_id") != null && !jsonObj.get("account_log_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_log_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_log_id").toString()));
      }
      if (jsonObj.get("alipay_order_no") != null && !jsonObj.get("alipay_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_order_no").toString()));
      }
      if (jsonObj.get("balance") != null && !jsonObj.get("balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance").toString()));
      }
      if (jsonObj.get("bill_source") != null && !jsonObj.get("bill_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_source").toString()));
      }
      if (jsonObj.get("biz_desc") != null && !jsonObj.get("biz_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_desc").toString()));
      }
      if (jsonObj.get("biz_nos") != null && !jsonObj.get("biz_nos").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_nos` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_nos").toString()));
      }
      if (jsonObj.get("biz_orig_no") != null && !jsonObj.get("biz_orig_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_orig_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_orig_no").toString()));
      }
      if (jsonObj.get("complement_info") != null && !jsonObj.get("complement_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complement_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complement_info").toString()));
      }
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      if (jsonObj.get("merchant_order_no") != null && !jsonObj.get("merchant_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_order_no").toString()));
      }
      if (jsonObj.get("merchant_out_refund_no") != null && !jsonObj.get("merchant_out_refund_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_out_refund_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_out_refund_no").toString()));
      }
      if (jsonObj.get("other_account") != null && !jsonObj.get("other_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_account").toString()));
      }
      if (jsonObj.get("store_name") != null && !jsonObj.get("store_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_name").toString()));
      }
      if (jsonObj.get("trans_amount") != null && !jsonObj.get("trans_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_amount").toString()));
      }
      if (jsonObj.get("trans_dt") != null && !jsonObj.get("trans_dt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_dt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_dt").toString()));
      }
      if (jsonObj.get("trans_memo") != null && !jsonObj.get("trans_memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_memo").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountLogItemResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountLogItemResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountLogItemResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountLogItemResult.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountLogItemResult>() {
           @Override
           public void write(JsonWriter out, AccountLogItemResult value) throws IOException {
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
           public AccountLogItemResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccountLogItemResult instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccountLogItemResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountLogItemResult
  * @throws IOException if the JSON string is invalid with respect to AccountLogItemResult
  */
  public static AccountLogItemResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountLogItemResult.class);
  }

 /**
  * Convert an instance of AccountLogItemResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

