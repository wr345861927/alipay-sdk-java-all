/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.TradeFundBillDetail;
import com.alipay.v3.model.TradeInfoDTO;
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
 * AlipayFundJointaccountTradeQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundJointaccountTradeQueryResponseModel {
  public static final String SERIALIZED_NAME_BUYER_ID = "buyer_id";
  @SerializedName(SERIALIZED_NAME_BUYER_ID)
  private String buyerId;

  public static final String SERIALIZED_NAME_BUYER_OPEN_ID = "buyer_open_id";
  @SerializedName(SERIALIZED_NAME_BUYER_OPEN_ID)
  private String buyerOpenId;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public static final String SERIALIZED_NAME_TRADE_FUND_BILL_LIST = "trade_fund_bill_list";
  @SerializedName(SERIALIZED_NAME_TRADE_FUND_BILL_LIST)
  private List<TradeFundBillDetail> tradeFundBillList = null;

  public static final String SERIALIZED_NAME_TRADE_INFO_LIST = "trade_info_list";
  @SerializedName(SERIALIZED_NAME_TRADE_INFO_LIST)
  private List<TradeInfoDTO> tradeInfoList = null;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public static final String SERIALIZED_NAME_TRADE_STATUS = "trade_status";
  @SerializedName(SERIALIZED_NAME_TRADE_STATUS)
  private String tradeStatus;

  public AlipayFundJointaccountTradeQueryResponseModel() { 
  }

  public AlipayFundJointaccountTradeQueryResponseModel buyerId(String buyerId) {
    
    this.buyerId = buyerId;
    return this;
  }

   /**
   * 买家ID
   * @return buyerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088888888", value = "买家ID")

  public String getBuyerId() {
    return buyerId;
  }


  public void setBuyerId(String buyerId) {
    this.buyerId = buyerId;
  }


  public AlipayFundJointaccountTradeQueryResponseModel buyerOpenId(String buyerOpenId) {
    
    this.buyerOpenId = buyerOpenId;
    return this;
  }

   /**
   * 买家的openId
   * @return buyerOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "买家的openId")

  public String getBuyerOpenId() {
    return buyerOpenId;
  }


  public void setBuyerOpenId(String buyerOpenId) {
    this.buyerOpenId = buyerOpenId;
  }


  public AlipayFundJointaccountTradeQueryResponseModel createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 交易创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2010-11-11 11:11:11", value = "交易创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AlipayFundJointaccountTradeQueryResponseModel totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 订单总金额
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "订单总金额")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public AlipayFundJointaccountTradeQueryResponseModel tradeFundBillList(List<TradeFundBillDetail> tradeFundBillList) {
    
    this.tradeFundBillList = tradeFundBillList;
    return this;
  }

  public AlipayFundJointaccountTradeQueryResponseModel addTradeFundBillListItem(TradeFundBillDetail tradeFundBillListItem) {
    if (this.tradeFundBillList == null) {
      this.tradeFundBillList = new ArrayList<>();
    }
    this.tradeFundBillList.add(tradeFundBillListItem);
    return this;
  }

   /**
   * 资金单明细
   * @return tradeFundBillList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "资金单明细")

  public List<TradeFundBillDetail> getTradeFundBillList() {
    return tradeFundBillList;
  }


  public void setTradeFundBillList(List<TradeFundBillDetail> tradeFundBillList) {
    this.tradeFundBillList = tradeFundBillList;
  }


  public AlipayFundJointaccountTradeQueryResponseModel tradeInfoList(List<TradeInfoDTO> tradeInfoList) {
    
    this.tradeInfoList = tradeInfoList;
    return this;
  }

  public AlipayFundJointaccountTradeQueryResponseModel addTradeInfoListItem(TradeInfoDTO tradeInfoListItem) {
    if (this.tradeInfoList == null) {
      this.tradeInfoList = new ArrayList<>();
    }
    this.tradeInfoList.add(tradeInfoListItem);
    return this;
  }

   /**
   * 交易信息集合。查询为批量查询时，使用该结果返回
   * @return tradeInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易信息集合。查询为批量查询时，使用该结果返回")

  public List<TradeInfoDTO> getTradeInfoList() {
    return tradeInfoList;
  }


  public void setTradeInfoList(List<TradeInfoDTO> tradeInfoList) {
    this.tradeInfoList = tradeInfoList;
  }


  public AlipayFundJointaccountTradeQueryResponseModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 交易单号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1231231321321", value = "交易单号")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }


  public AlipayFundJointaccountTradeQueryResponseModel tradeStatus(String tradeStatus) {
    
    this.tradeStatus = tradeStatus;
    return this;
  }

   /**
   * 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
   * @return tradeStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRADE_SUCCESS", value = "交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）")

  public String getTradeStatus() {
    return tradeStatus;
  }


  public void setTradeStatus(String tradeStatus) {
    this.tradeStatus = tradeStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundJointaccountTradeQueryResponseModel alipayFundJointaccountTradeQueryResponseModel = (AlipayFundJointaccountTradeQueryResponseModel) o;
    return Objects.equals(this.buyerId, alipayFundJointaccountTradeQueryResponseModel.buyerId) &&
        Objects.equals(this.buyerOpenId, alipayFundJointaccountTradeQueryResponseModel.buyerOpenId) &&
        Objects.equals(this.createTime, alipayFundJointaccountTradeQueryResponseModel.createTime) &&
        Objects.equals(this.totalAmount, alipayFundJointaccountTradeQueryResponseModel.totalAmount) &&
        Objects.equals(this.tradeFundBillList, alipayFundJointaccountTradeQueryResponseModel.tradeFundBillList) &&
        Objects.equals(this.tradeInfoList, alipayFundJointaccountTradeQueryResponseModel.tradeInfoList) &&
        Objects.equals(this.tradeNo, alipayFundJointaccountTradeQueryResponseModel.tradeNo) &&
        Objects.equals(this.tradeStatus, alipayFundJointaccountTradeQueryResponseModel.tradeStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerId, buyerOpenId, createTime, totalAmount, tradeFundBillList, tradeInfoList, tradeNo, tradeStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundJointaccountTradeQueryResponseModel {\n");
    sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
    sb.append("    buyerOpenId: ").append(toIndentedString(buyerOpenId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    tradeFundBillList: ").append(toIndentedString(tradeFundBillList)).append("\n");
    sb.append("    tradeInfoList: ").append(toIndentedString(tradeInfoList)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
    sb.append("    tradeStatus: ").append(toIndentedString(tradeStatus)).append("\n");
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
    openapiFields.add("buyer_id");
    openapiFields.add("buyer_open_id");
    openapiFields.add("create_time");
    openapiFields.add("total_amount");
    openapiFields.add("trade_fund_bill_list");
    openapiFields.add("trade_info_list");
    openapiFields.add("trade_no");
    openapiFields.add("trade_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundJointaccountTradeQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundJointaccountTradeQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundJointaccountTradeQueryResponseModel is not found in the empty JSON string", AlipayFundJointaccountTradeQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundJointaccountTradeQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundJointaccountTradeQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("buyer_id") != null && !jsonObj.get("buyer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_id").toString()));
      }
      if (jsonObj.get("buyer_open_id") != null && !jsonObj.get("buyer_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_open_id").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
      JsonArray jsonArraytradeFundBillList = jsonObj.getAsJsonArray("trade_fund_bill_list");
      if (jsonArraytradeFundBillList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("trade_fund_bill_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `trade_fund_bill_list` to be an array in the JSON string but got `%s`", jsonObj.get("trade_fund_bill_list").toString()));
        }

        // validate the optional field `trade_fund_bill_list` (array)
        for (int i = 0; i < jsonArraytradeFundBillList.size(); i++) {
          TradeFundBillDetail.validateJsonObject(jsonArraytradeFundBillList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraytradeInfoList = jsonObj.getAsJsonArray("trade_info_list");
      if (jsonArraytradeInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("trade_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `trade_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("trade_info_list").toString()));
        }

        // validate the optional field `trade_info_list` (array)
        for (int i = 0; i < jsonArraytradeInfoList.size(); i++) {
          TradeInfoDTO.validateJsonObject(jsonArraytradeInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
      if (jsonObj.get("trade_status") != null && !jsonObj.get("trade_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundJointaccountTradeQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundJointaccountTradeQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundJointaccountTradeQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundJointaccountTradeQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundJointaccountTradeQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundJointaccountTradeQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundJointaccountTradeQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundJointaccountTradeQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundJointaccountTradeQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundJointaccountTradeQueryResponseModel
  */
  public static AlipayFundJointaccountTradeQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundJointaccountTradeQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundJointaccountTradeQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

