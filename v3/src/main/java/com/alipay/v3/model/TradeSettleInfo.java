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
import com.alipay.v3.model.TradeSettleDetail;
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
 * TradeSettleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TradeSettleInfo {
  public static final String SERIALIZED_NAME_TRADE_SETTLE_DETAIL_LIST = "trade_settle_detail_list";
  @SerializedName(SERIALIZED_NAME_TRADE_SETTLE_DETAIL_LIST)
  private List<TradeSettleDetail> tradeSettleDetailList = null;

  public static final String SERIALIZED_NAME_TRADE_UNSETTLED_AMOUNT = "trade_unsettled_amount";
  @SerializedName(SERIALIZED_NAME_TRADE_UNSETTLED_AMOUNT)
  private String tradeUnsettledAmount;

  public TradeSettleInfo() { 
  }

  public TradeSettleInfo tradeSettleDetailList(List<TradeSettleDetail> tradeSettleDetailList) {
    
    this.tradeSettleDetailList = tradeSettleDetailList;
    return this;
  }

  public TradeSettleInfo addTradeSettleDetailListItem(TradeSettleDetail tradeSettleDetailListItem) {
    if (this.tradeSettleDetailList == null) {
      this.tradeSettleDetailList = new ArrayList<>();
    }
    this.tradeSettleDetailList.add(tradeSettleDetailListItem);
    return this;
  }

   /**
   * 交易结算明细信息
   * @return tradeSettleDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易结算明细信息")

  public List<TradeSettleDetail> getTradeSettleDetailList() {
    return tradeSettleDetailList;
  }


  public void setTradeSettleDetailList(List<TradeSettleDetail> tradeSettleDetailList) {
    this.tradeSettleDetailList = tradeSettleDetailList;
  }


  public TradeSettleInfo tradeUnsettledAmount(String tradeUnsettledAmount) {
    
    this.tradeUnsettledAmount = tradeUnsettledAmount;
    return this;
  }

   /**
   * 直付通账期、直连账期下返回，其他场景为空，表示一笔订单剩余待结算金额
   * @return tradeUnsettledAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.1", value = "直付通账期、直连账期下返回，其他场景为空，表示一笔订单剩余待结算金额")

  public String getTradeUnsettledAmount() {
    return tradeUnsettledAmount;
  }


  public void setTradeUnsettledAmount(String tradeUnsettledAmount) {
    this.tradeUnsettledAmount = tradeUnsettledAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeSettleInfo tradeSettleInfo = (TradeSettleInfo) o;
    return Objects.equals(this.tradeSettleDetailList, tradeSettleInfo.tradeSettleDetailList) &&
        Objects.equals(this.tradeUnsettledAmount, tradeSettleInfo.tradeUnsettledAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeSettleDetailList, tradeUnsettledAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeSettleInfo {\n");
    sb.append("    tradeSettleDetailList: ").append(toIndentedString(tradeSettleDetailList)).append("\n");
    sb.append("    tradeUnsettledAmount: ").append(toIndentedString(tradeUnsettledAmount)).append("\n");
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
    openapiFields.add("trade_settle_detail_list");
    openapiFields.add("trade_unsettled_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TradeSettleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TradeSettleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TradeSettleInfo is not found in the empty JSON string", TradeSettleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TradeSettleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TradeSettleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraytradeSettleDetailList = jsonObj.getAsJsonArray("trade_settle_detail_list");
      if (jsonArraytradeSettleDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("trade_settle_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `trade_settle_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("trade_settle_detail_list").toString()));
        }

        // validate the optional field `trade_settle_detail_list` (array)
        for (int i = 0; i < jsonArraytradeSettleDetailList.size(); i++) {
          TradeSettleDetail.validateJsonObject(jsonArraytradeSettleDetailList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("trade_unsettled_amount") != null && !jsonObj.get("trade_unsettled_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_unsettled_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_unsettled_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TradeSettleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TradeSettleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TradeSettleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TradeSettleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TradeSettleInfo>() {
           @Override
           public void write(JsonWriter out, TradeSettleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TradeSettleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TradeSettleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TradeSettleInfo
  * @throws IOException if the JSON string is invalid with respect to TradeSettleInfo
  */
  public static TradeSettleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TradeSettleInfo.class);
  }

 /**
  * Convert an instance of TradeSettleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

