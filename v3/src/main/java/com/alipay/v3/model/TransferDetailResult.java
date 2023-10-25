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
 * TransferDetailResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransferDetailResult {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_FUND_DESC = "fund_desc";
  @SerializedName(SERIALIZED_NAME_FUND_DESC)
  private String fundDesc;

  public static final String SERIALIZED_NAME_INSTRUCTION_ID = "instruction_id";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION_ID)
  private String instructionId;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public static final String SERIALIZED_NAME_SERVICE_FEE = "service_fee";
  @SerializedName(SERIALIZED_NAME_SERVICE_FEE)
  private String serviceFee;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUB_TYPE_DESC = "sub_type_desc";
  @SerializedName(SERIALIZED_NAME_SUB_TYPE_DESC)
  private String subTypeDesc;

  public static final String SERIALIZED_NAME_TRANS_DT = "trans_dt";
  @SerializedName(SERIALIZED_NAME_TRANS_DT)
  private String transDt;

  public static final String SERIALIZED_NAME_TYPE_DESC = "type_desc";
  @SerializedName(SERIALIZED_NAME_TYPE_DESC)
  private String typeDesc;

  public TransferDetailResult() { 
  }

  public TransferDetailResult account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * 付款/收款账户。充值记录中是付款账户。提现、转账记录中是收款账户。支付宝名称及账号脱敏；银行账户的户名脱敏，银行账户显示银行名称+银行卡号后四位
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "*三（招商银行2456）", value = "付款/收款账户。充值记录中是付款账户。提现、转账记录中是收款账户。支付宝名称及账号脱敏；银行账户的户名脱敏，银行账户显示银行名称+银行卡号后四位")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public TransferDetailResult amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 金额
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "金额")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferDetailResult fundDesc(String fundDesc) {
    
    this.fundDesc = fundDesc;
    return this;
  }

   /**
   * 资金来源/去向类型。在充值记录中，表示资金来源类型，在转账和提现类型中，表示去向类型
   * @return fundDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "银行卡", value = "资金来源/去向类型。在充值记录中，表示资金来源类型，在转账和提现类型中，表示去向类型")

  public String getFundDesc() {
    return fundDesc;
  }


  public void setFundDesc(String fundDesc) {
    this.fundDesc = fundDesc;
  }


  public TransferDetailResult instructionId(String instructionId) {
    
    this.instructionId = instructionId;
    return this;
  }

   /**
   * 银行单据号。对账使用，无需脱敏
   * @return instructionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190101***", value = "银行单据号。对账使用，无需脱敏")

  public String getInstructionId() {
    return instructionId;
  }


  public void setInstructionId(String instructionId) {
    this.instructionId = instructionId;
  }


  public TransferDetailResult memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注信息
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "普通充值", value = "备注信息")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public TransferDetailResult orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 业务订单号。该笔业务单据的唯一识别编号
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190101***", value = "业务订单号。该笔业务单据的唯一识别编号")

  public String getOrderNo() {
    return orderNo;
  }


  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public TransferDetailResult serviceFee(String serviceFee) {
    
    this.serviceFee = serviceFee;
    return this;
  }

   /**
   * 服务费金额
   * @return serviceFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.00", value = "服务费金额")

  public String getServiceFee() {
    return serviceFee;
  }


  public void setServiceFee(String serviceFee) {
    this.serviceFee = serviceFee;
  }


  public TransferDetailResult status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 资金状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "成功", value = "资金状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public TransferDetailResult subTypeDesc(String subTypeDesc) {
    
    this.subTypeDesc = subTypeDesc;
    return this;
  }

   /**
   * 子类型。“充值类型”，普通充值、大额充值。“转账类型”，暂无实现。转账至支付宝账户、转账至银行卡、批量转账支付宝账户、批量转账至银行卡、批量付款。“提现类型”，暂无实现。普通提现、批量委托提现。对账使用，无需脱敏
   * @return subTypeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "普通充值", value = "子类型。“充值类型”，普通充值、大额充值。“转账类型”，暂无实现。转账至支付宝账户、转账至银行卡、批量转账支付宝账户、批量转账至银行卡、批量付款。“提现类型”，暂无实现。普通提现、批量委托提现。对账使用，无需脱敏")

  public String getSubTypeDesc() {
    return subTypeDesc;
  }


  public void setSubTypeDesc(String subTypeDesc) {
    this.subTypeDesc = subTypeDesc;
  }


  public TransferDetailResult transDt(String transDt) {
    
    this.transDt = transDt;
    return this;
  }

   /**
   * 业务发生时间
   * @return transDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01 00:00:00", value = "业务发生时间")

  public String getTransDt() {
    return transDt;
  }


  public void setTransDt(String transDt) {
    this.transDt = transDt;
  }


  public TransferDetailResult typeDesc(String typeDesc) {
    
    this.typeDesc = typeDesc;
    return this;
  }

   /**
   * 查询类型描述：充值、转账、提现
   * @return typeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "充值", value = "查询类型描述：充值、转账、提现")

  public String getTypeDesc() {
    return typeDesc;
  }


  public void setTypeDesc(String typeDesc) {
    this.typeDesc = typeDesc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferDetailResult transferDetailResult = (TransferDetailResult) o;
    return Objects.equals(this.account, transferDetailResult.account) &&
        Objects.equals(this.amount, transferDetailResult.amount) &&
        Objects.equals(this.fundDesc, transferDetailResult.fundDesc) &&
        Objects.equals(this.instructionId, transferDetailResult.instructionId) &&
        Objects.equals(this.memo, transferDetailResult.memo) &&
        Objects.equals(this.orderNo, transferDetailResult.orderNo) &&
        Objects.equals(this.serviceFee, transferDetailResult.serviceFee) &&
        Objects.equals(this.status, transferDetailResult.status) &&
        Objects.equals(this.subTypeDesc, transferDetailResult.subTypeDesc) &&
        Objects.equals(this.transDt, transferDetailResult.transDt) &&
        Objects.equals(this.typeDesc, transferDetailResult.typeDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount, fundDesc, instructionId, memo, orderNo, serviceFee, status, subTypeDesc, transDt, typeDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferDetailResult {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fundDesc: ").append(toIndentedString(fundDesc)).append("\n");
    sb.append("    instructionId: ").append(toIndentedString(instructionId)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    serviceFee: ").append(toIndentedString(serviceFee)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subTypeDesc: ").append(toIndentedString(subTypeDesc)).append("\n");
    sb.append("    transDt: ").append(toIndentedString(transDt)).append("\n");
    sb.append("    typeDesc: ").append(toIndentedString(typeDesc)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("amount");
    openapiFields.add("fund_desc");
    openapiFields.add("instruction_id");
    openapiFields.add("memo");
    openapiFields.add("order_no");
    openapiFields.add("service_fee");
    openapiFields.add("status");
    openapiFields.add("sub_type_desc");
    openapiFields.add("trans_dt");
    openapiFields.add("type_desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransferDetailResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransferDetailResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferDetailResult is not found in the empty JSON string", TransferDetailResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransferDetailResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferDetailResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account").toString()));
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("fund_desc") != null && !jsonObj.get("fund_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_desc").toString()));
      }
      if (jsonObj.get("instruction_id") != null && !jsonObj.get("instruction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instruction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instruction_id").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("order_no") != null && !jsonObj.get("order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_no").toString()));
      }
      if (jsonObj.get("service_fee") != null && !jsonObj.get("service_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_fee").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("sub_type_desc") != null && !jsonObj.get("sub_type_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_type_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_type_desc").toString()));
      }
      if (jsonObj.get("trans_dt") != null && !jsonObj.get("trans_dt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_dt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_dt").toString()));
      }
      if (jsonObj.get("type_desc") != null && !jsonObj.get("type_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferDetailResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferDetailResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferDetailResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferDetailResult.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferDetailResult>() {
           @Override
           public void write(JsonWriter out, TransferDetailResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferDetailResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferDetailResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferDetailResult
  * @throws IOException if the JSON string is invalid with respect to TransferDetailResult
  */
  public static TransferDetailResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferDetailResult.class);
  }

 /**
  * Convert an instance of TransferDetailResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

