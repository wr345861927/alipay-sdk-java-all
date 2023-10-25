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
 * ExtendParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExtendParams {
  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_HB_FQ_NUM = "hb_fq_num";
  @SerializedName(SERIALIZED_NAME_HB_FQ_NUM)
  private String hbFqNum;

  public static final String SERIALIZED_NAME_HB_FQ_SELLER_PERCENT = "hb_fq_seller_percent";
  @SerializedName(SERIALIZED_NAME_HB_FQ_SELLER_PERCENT)
  private String hbFqSellerPercent;

  public static final String SERIALIZED_NAME_INDUSTRY_REFLUX_INFO = "industry_reflux_info";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_REFLUX_INFO)
  private String industryRefluxInfo;

  public static final String SERIALIZED_NAME_ROYALTY_FREEZE = "royalty_freeze";
  @SerializedName(SERIALIZED_NAME_ROYALTY_FREEZE)
  private String royaltyFreeze;

  public static final String SERIALIZED_NAME_SPECIFIED_SELLER_NAME = "specified_seller_name";
  @SerializedName(SERIALIZED_NAME_SPECIFIED_SELLER_NAME)
  private String specifiedSellerName;

  public static final String SERIALIZED_NAME_SYS_SERVICE_PROVIDER_ID = "sys_service_provider_id";
  @SerializedName(SERIALIZED_NAME_SYS_SERVICE_PROVIDER_ID)
  private String sysServiceProviderId;

  public static final String SERIALIZED_NAME_TRADE_COMPONENT_ORDER_ID = "trade_component_order_id";
  @SerializedName(SERIALIZED_NAME_TRADE_COMPONENT_ORDER_ID)
  private String tradeComponentOrderId;

  public ExtendParams() { 
  }

  public ExtendParams cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * 卡类型
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "卡类型")

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public ExtendParams hbFqNum(String hbFqNum) {
    
    this.hbFqNum = hbFqNum;
    return this;
  }

   /**
   * 使用花呗分期要进行的分期数
   * @return hbFqNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "使用花呗分期要进行的分期数")

  public String getHbFqNum() {
    return hbFqNum;
  }


  public void setHbFqNum(String hbFqNum) {
    this.hbFqNum = hbFqNum;
  }


  public ExtendParams hbFqSellerPercent(String hbFqSellerPercent) {
    
    this.hbFqSellerPercent = hbFqSellerPercent;
    return this;
  }

   /**
   * 使用花呗分期需要卖家承担的手续费比例的百分值，传入100代表100%
   * @return hbFqSellerPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "使用花呗分期需要卖家承担的手续费比例的百分值，传入100代表100%")

  public String getHbFqSellerPercent() {
    return hbFqSellerPercent;
  }


  public void setHbFqSellerPercent(String hbFqSellerPercent) {
    this.hbFqSellerPercent = hbFqSellerPercent;
  }


  public ExtendParams industryRefluxInfo(String industryRefluxInfo) {
    
    this.industryRefluxInfo = industryRefluxInfo;
    return this;
  }

   /**
   * 行业数据回流信息, 详见：地铁支付接口参数补充说明
   * @return industryRefluxInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "行业数据回流信息, 详见：地铁支付接口参数补充说明")

  public String getIndustryRefluxInfo() {
    return industryRefluxInfo;
  }


  public void setIndustryRefluxInfo(String industryRefluxInfo) {
    this.industryRefluxInfo = industryRefluxInfo;
  }


  public ExtendParams royaltyFreeze(String royaltyFreeze) {
    
    this.royaltyFreeze = royaltyFreeze;
    return this;
  }

   /**
   * 是否进行资金冻结，用于后续分账，true表示资金冻结，false或不传表示资金不冻结
   * @return royaltyFreeze
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否进行资金冻结，用于后续分账，true表示资金冻结，false或不传表示资金不冻结")

  public String getRoyaltyFreeze() {
    return royaltyFreeze;
  }


  public void setRoyaltyFreeze(String royaltyFreeze) {
    this.royaltyFreeze = royaltyFreeze;
  }


  public ExtendParams specifiedSellerName(String specifiedSellerName) {
    
    this.specifiedSellerName = specifiedSellerName;
    return this;
  }

   /**
   * 特殊场景下，允许商户指定交易展示的卖家名称
   * @return specifiedSellerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "特殊场景下，允许商户指定交易展示的卖家名称")

  public String getSpecifiedSellerName() {
    return specifiedSellerName;
  }


  public void setSpecifiedSellerName(String specifiedSellerName) {
    this.specifiedSellerName = specifiedSellerName;
  }


  public ExtendParams sysServiceProviderId(String sysServiceProviderId) {
    
    this.sysServiceProviderId = sysServiceProviderId;
    return this;
  }

   /**
   * 系统商编号  该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
   * @return sysServiceProviderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统商编号  该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID")

  public String getSysServiceProviderId() {
    return sysServiceProviderId;
  }


  public void setSysServiceProviderId(String sysServiceProviderId) {
    this.sysServiceProviderId = sysServiceProviderId;
  }


  public ExtendParams tradeComponentOrderId(String tradeComponentOrderId) {
    
    this.tradeComponentOrderId = tradeComponentOrderId;
    return this;
  }

   /**
   * 公域商品交易业务订单ID
   * @return tradeComponentOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "公域商品交易业务订单ID")

  public String getTradeComponentOrderId() {
    return tradeComponentOrderId;
  }


  public void setTradeComponentOrderId(String tradeComponentOrderId) {
    this.tradeComponentOrderId = tradeComponentOrderId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendParams extendParams = (ExtendParams) o;
    return Objects.equals(this.cardType, extendParams.cardType) &&
        Objects.equals(this.hbFqNum, extendParams.hbFqNum) &&
        Objects.equals(this.hbFqSellerPercent, extendParams.hbFqSellerPercent) &&
        Objects.equals(this.industryRefluxInfo, extendParams.industryRefluxInfo) &&
        Objects.equals(this.royaltyFreeze, extendParams.royaltyFreeze) &&
        Objects.equals(this.specifiedSellerName, extendParams.specifiedSellerName) &&
        Objects.equals(this.sysServiceProviderId, extendParams.sysServiceProviderId) &&
        Objects.equals(this.tradeComponentOrderId, extendParams.tradeComponentOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardType, hbFqNum, hbFqSellerPercent, industryRefluxInfo, royaltyFreeze, specifiedSellerName, sysServiceProviderId, tradeComponentOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendParams {\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    hbFqNum: ").append(toIndentedString(hbFqNum)).append("\n");
    sb.append("    hbFqSellerPercent: ").append(toIndentedString(hbFqSellerPercent)).append("\n");
    sb.append("    industryRefluxInfo: ").append(toIndentedString(industryRefluxInfo)).append("\n");
    sb.append("    royaltyFreeze: ").append(toIndentedString(royaltyFreeze)).append("\n");
    sb.append("    specifiedSellerName: ").append(toIndentedString(specifiedSellerName)).append("\n");
    sb.append("    sysServiceProviderId: ").append(toIndentedString(sysServiceProviderId)).append("\n");
    sb.append("    tradeComponentOrderId: ").append(toIndentedString(tradeComponentOrderId)).append("\n");
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
    openapiFields.add("card_type");
    openapiFields.add("hb_fq_num");
    openapiFields.add("hb_fq_seller_percent");
    openapiFields.add("industry_reflux_info");
    openapiFields.add("royalty_freeze");
    openapiFields.add("specified_seller_name");
    openapiFields.add("sys_service_provider_id");
    openapiFields.add("trade_component_order_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExtendParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExtendParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtendParams is not found in the empty JSON string", ExtendParams.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExtendParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExtendParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      if (jsonObj.get("hb_fq_num") != null && !jsonObj.get("hb_fq_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hb_fq_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hb_fq_num").toString()));
      }
      if (jsonObj.get("hb_fq_seller_percent") != null && !jsonObj.get("hb_fq_seller_percent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hb_fq_seller_percent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hb_fq_seller_percent").toString()));
      }
      if (jsonObj.get("industry_reflux_info") != null && !jsonObj.get("industry_reflux_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `industry_reflux_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("industry_reflux_info").toString()));
      }
      if (jsonObj.get("royalty_freeze") != null && !jsonObj.get("royalty_freeze").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `royalty_freeze` to be a primitive type in the JSON string but got `%s`", jsonObj.get("royalty_freeze").toString()));
      }
      if (jsonObj.get("specified_seller_name") != null && !jsonObj.get("specified_seller_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specified_seller_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specified_seller_name").toString()));
      }
      if (jsonObj.get("sys_service_provider_id") != null && !jsonObj.get("sys_service_provider_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sys_service_provider_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sys_service_provider_id").toString()));
      }
      if (jsonObj.get("trade_component_order_id") != null && !jsonObj.get("trade_component_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_component_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_component_order_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtendParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtendParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtendParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtendParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtendParams>() {
           @Override
           public void write(JsonWriter out, ExtendParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExtendParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExtendParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExtendParams
  * @throws IOException if the JSON string is invalid with respect to ExtendParams
  */
  public static ExtendParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtendParams.class);
  }

 /**
  * Convert an instance of ExtendParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

