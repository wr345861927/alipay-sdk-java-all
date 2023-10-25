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
 * AlipayEbppPdeductPayModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppPdeductPayModel {
  public static final String SERIALIZED_NAME_AGENT_CHANNEL = "agent_channel";
  @SerializedName(SERIALIZED_NAME_AGENT_CHANNEL)
  private String agentChannel;

  public static final String SERIALIZED_NAME_AGENT_CODE = "agent_code";
  @SerializedName(SERIALIZED_NAME_AGENT_CODE)
  private String agentCode;

  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_BILL_DATE = "bill_date";
  @SerializedName(SERIALIZED_NAME_BILL_DATE)
  private String billDate;

  public static final String SERIALIZED_NAME_BILL_KEY = "bill_key";
  @SerializedName(SERIALIZED_NAME_BILL_KEY)
  private String billKey;

  public static final String SERIALIZED_NAME_EXTEND_FIELD = "extend_field";
  @SerializedName(SERIALIZED_NAME_EXTEND_FIELD)
  private String extendField;

  public static final String SERIALIZED_NAME_FINE_AMOUNT = "fine_amount";
  @SerializedName(SERIALIZED_NAME_FINE_AMOUNT)
  private String fineAmount;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private String payAmount;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayEbppPdeductPayModel() { 
  }

  public AlipayEbppPdeductPayModel agentChannel(String agentChannel) {
    
    this.agentChannel = agentChannel;
    return this;
  }

   /**
   * 渠道码，如用户通过机构通过服务窗进来签约则是PUBLICFORM，此值可随意传，只要不空就行
   * @return agentChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUBLICFORM", value = "渠道码，如用户通过机构通过服务窗进来签约则是PUBLICFORM，此值可随意传，只要不空就行")

  public String getAgentChannel() {
    return agentChannel;
  }


  public void setAgentChannel(String agentChannel) {
    this.agentChannel = agentChannel;
  }


  public AlipayEbppPdeductPayModel agentCode(String agentCode) {
    
    this.agentCode = agentCode;
    return this;
  }

   /**
   * 二级渠道码，预留字段
   * @return agentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SECOND", value = "二级渠道码，预留字段")

  public String getAgentCode() {
    return agentCode;
  }


  public void setAgentCode(String agentCode) {
    this.agentCode = agentCode;
  }


  public AlipayEbppPdeductPayModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 支付宝代扣协议Id
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234557890", value = "支付宝代扣协议Id")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public AlipayEbppPdeductPayModel billDate(String billDate) {
    
    this.billDate = billDate;
    return this;
  }

   /**
   * 账期
   * @return billDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201410", value = "账期")

  public String getBillDate() {
    return billDate;
  }


  public void setBillDate(String billDate) {
    this.billDate = billDate;
  }


  public AlipayEbppPdeductPayModel billKey(String billKey) {
    
    this.billKey = billKey;
    return this;
  }

   /**
   * 户号，缴费单位用于标识每一户的唯一性的
   * @return billKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "262327843", value = "户号，缴费单位用于标识每一户的唯一性的")

  public String getBillKey() {
    return billKey;
  }


  public void setBillKey(String billKey) {
    this.billKey = billKey;
  }


  public AlipayEbppPdeductPayModel extendField(String extendField) {
    
    this.extendField = extendField;
    return this;
  }

   /**
   * 扩展参数。必须以key value形式定义，  转为json为格式：{\&quot;key1\&quot;:\&quot;value1\&quot;,\&quot;key2\&quot;:\&quot;value2\&quot;,  \&quot;key3\&quot;:\&quot;value3\&quot;,\&quot;key4\&quot;:\&quot;value4\&quot;}   后端会直接转换为MAP对象，转换异常会报参数格式错误
   * @return extendField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key1\":\"value1\",\"key2\":\"value2\",  \"key3\":\"value3\",\"key4\":\"value4\"}", value = "扩展参数。必须以key value形式定义，  转为json为格式：{\"key1\":\"value1\",\"key2\":\"value2\",  \"key3\":\"value3\",\"key4\":\"value4\"}   后端会直接转换为MAP对象，转换异常会报参数格式错误")

  public String getExtendField() {
    return extendField;
  }


  public void setExtendField(String extendField) {
    this.extendField = extendField;
  }


  public AlipayEbppPdeductPayModel fineAmount(String fineAmount) {
    
    this.fineAmount = fineAmount;
    return this;
  }

   /**
   * 滞纳金
   * @return fineAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.00", value = "滞纳金")

  public String getFineAmount() {
    return fineAmount;
  }


  public void setFineAmount(String fineAmount) {
    this.fineAmount = fineAmount;
  }


  public AlipayEbppPdeductPayModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注信息
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "memo", value = "备注信息")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AlipayEbppPdeductPayModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户UserId在应用AppId下的唯一用户标识
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "用户UserId在应用AppId下的唯一用户标识")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayEbppPdeductPayModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 商户外部业务流水号
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18882329324", value = "商户外部业务流水号")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public AlipayEbppPdeductPayModel payAmount(String payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 扣款金额，支付总金额，包含滞纳金
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23.00", value = "扣款金额，支付总金额，包含滞纳金")

  public String getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(String payAmount) {
    this.payAmount = payAmount;
  }


  public AlipayEbppPdeductPayModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 商户PartnerId
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088611103588892", value = "商户PartnerId")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipayEbppPdeductPayModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123411243554", value = "用户ID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppPdeductPayModel alipayEbppPdeductPayModel = (AlipayEbppPdeductPayModel) o;
    return Objects.equals(this.agentChannel, alipayEbppPdeductPayModel.agentChannel) &&
        Objects.equals(this.agentCode, alipayEbppPdeductPayModel.agentCode) &&
        Objects.equals(this.agreementId, alipayEbppPdeductPayModel.agreementId) &&
        Objects.equals(this.billDate, alipayEbppPdeductPayModel.billDate) &&
        Objects.equals(this.billKey, alipayEbppPdeductPayModel.billKey) &&
        Objects.equals(this.extendField, alipayEbppPdeductPayModel.extendField) &&
        Objects.equals(this.fineAmount, alipayEbppPdeductPayModel.fineAmount) &&
        Objects.equals(this.memo, alipayEbppPdeductPayModel.memo) &&
        Objects.equals(this.openId, alipayEbppPdeductPayModel.openId) &&
        Objects.equals(this.outOrderNo, alipayEbppPdeductPayModel.outOrderNo) &&
        Objects.equals(this.payAmount, alipayEbppPdeductPayModel.payAmount) &&
        Objects.equals(this.pid, alipayEbppPdeductPayModel.pid) &&
        Objects.equals(this.userId, alipayEbppPdeductPayModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentChannel, agentCode, agreementId, billDate, billKey, extendField, fineAmount, memo, openId, outOrderNo, payAmount, pid, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppPdeductPayModel {\n");
    sb.append("    agentChannel: ").append(toIndentedString(agentChannel)).append("\n");
    sb.append("    agentCode: ").append(toIndentedString(agentCode)).append("\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    billDate: ").append(toIndentedString(billDate)).append("\n");
    sb.append("    billKey: ").append(toIndentedString(billKey)).append("\n");
    sb.append("    extendField: ").append(toIndentedString(extendField)).append("\n");
    sb.append("    fineAmount: ").append(toIndentedString(fineAmount)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("agent_channel");
    openapiFields.add("agent_code");
    openapiFields.add("agreement_id");
    openapiFields.add("bill_date");
    openapiFields.add("bill_key");
    openapiFields.add("extend_field");
    openapiFields.add("fine_amount");
    openapiFields.add("memo");
    openapiFields.add("open_id");
    openapiFields.add("out_order_no");
    openapiFields.add("pay_amount");
    openapiFields.add("pid");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppPdeductPayModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppPdeductPayModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppPdeductPayModel is not found in the empty JSON string", AlipayEbppPdeductPayModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppPdeductPayModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppPdeductPayModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agent_channel") != null && !jsonObj.get("agent_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_channel").toString()));
      }
      if (jsonObj.get("agent_code") != null && !jsonObj.get("agent_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_code").toString()));
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("bill_date") != null && !jsonObj.get("bill_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_date").toString()));
      }
      if (jsonObj.get("bill_key") != null && !jsonObj.get("bill_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_key").toString()));
      }
      if (jsonObj.get("extend_field") != null && !jsonObj.get("extend_field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_field").toString()));
      }
      if (jsonObj.get("fine_amount") != null && !jsonObj.get("fine_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fine_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fine_amount").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
      if (jsonObj.get("pay_amount") != null && !jsonObj.get("pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_amount").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppPdeductPayModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppPdeductPayModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppPdeductPayModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppPdeductPayModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppPdeductPayModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppPdeductPayModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppPdeductPayModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppPdeductPayModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppPdeductPayModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppPdeductPayModel
  */
  public static AlipayEbppPdeductPayModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppPdeductPayModel.class);
  }

 /**
  * Convert an instance of AlipayEbppPdeductPayModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

