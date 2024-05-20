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
import com.alipay.v3.model.ConsumerNotifyIstd;
import com.alipay.v3.model.GoodsDetailIstd;
import com.alipay.v3.model.GoodsInfoIstd;
import com.alipay.v3.model.LogisticsCompanyIstd;
import com.alipay.v3.model.OrderExtIstdForPreOrder;
import com.alipay.v3.model.ReceiverIstd;
import com.alipay.v3.model.SenderIstd;
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
 * AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel {
  public static final String SERIALIZED_NAME_CONSUMER_ID = "consumer_id";
  @SerializedName(SERIALIZED_NAME_CONSUMER_ID)
  private String consumerId;

  public static final String SERIALIZED_NAME_CONSUMER_NOTIFY = "consumer_notify";
  @SerializedName(SERIALIZED_NAME_CONSUMER_NOTIFY)
  private ConsumerNotifyIstd consumerNotify;

  public static final String SERIALIZED_NAME_CONSUMER_SOURCE = "consumer_source";
  @SerializedName(SERIALIZED_NAME_CONSUMER_SOURCE)
  private String consumerSource;

  public static final String SERIALIZED_NAME_GOODS_DETAILS = "goods_details";
  @SerializedName(SERIALIZED_NAME_GOODS_DETAILS)
  private List<GoodsDetailIstd> goodsDetails = null;

  public static final String SERIALIZED_NAME_GOODS_INFO = "goods_info";
  @SerializedName(SERIALIZED_NAME_GOODS_INFO)
  private GoodsInfoIstd goodsInfo;

  public static final String SERIALIZED_NAME_LOGISTICS_COMPANIES = "logistics_companies";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_COMPANIES)
  private List<LogisticsCompanyIstd> logisticsCompanies = null;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_ORDER_EXT_ISTD = "order_ext_istd";
  @SerializedName(SERIALIZED_NAME_ORDER_EXT_ISTD)
  private OrderExtIstdForPreOrder orderExtIstd;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private ReceiverIstd receiver;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private SenderIstd sender;

  public static final String SERIALIZED_NAME_SHOP_NO = "shop_no";
  @SerializedName(SERIALIZED_NAME_SHOP_NO)
  private String shopNo;

  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel() { 
  }

  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel consumerId(String consumerId) {
    
    this.consumerId = consumerId;
    return this;
  }

   /**
   * 消费者id， 如果consumer_source是alipay，则consumer_id必须是支付宝用户uid；如果consumer_source是wx，则consumer_id可以为空
   * @return consumerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxx", value = "消费者id， 如果consumer_source是alipay，则consumer_id必须是支付宝用户uid；如果consumer_source是wx，则consumer_id可以为空")

  public String getConsumerId() {
    return consumerId;
  }


  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }


  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel consumerNotify(ConsumerNotifyIstd consumerNotify) {
    
    this.consumerNotify = consumerNotify;
    return this;
  }

   /**
   * Get consumerNotify
   * @return consumerNotify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsumerNotifyIstd getConsumerNotify() {
    return consumerNotify;
  }


  public void setConsumerNotify(ConsumerNotifyIstd consumerNotify) {
    this.consumerNotify = consumerNotify;
  }


  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel consumerSource(String consumerSource) {
    
    this.consumerSource = consumerSource;
    return this;
  }

   /**
   * 消费者来源, 支付宝：alipay, 微信：wx
   * @return consumerSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipay", value = "消费者来源, 支付宝：alipay, 微信：wx")

  public String getConsumerSource() {
    return consumerSource;
  }


  public void setConsumerSource(String consumerSource) {
    this.consumerSource = consumerSource;
  }


  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel goodsDetails(List<GoodsDetailIstd> goodsDetails) {
    
    this.goodsDetails = goodsDetails;
    return this;
  }

  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel addGoodsDetailsItem(GoodsDetailIstd goodsDetailsItem) {
    if (this.goodsDetails == null) {
      this.goodsDetails = new ArrayList<>();
    }
    this.goodsDetails.add(goodsDetailsItem);
    return this;
  }

   /**
   * 商品明细
   * @return goodsDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品明细")

  public List<GoodsDetailIstd> getGoodsDetails() {
    return goodsDetails;
  }


  public void setGoodsDetails(List<GoodsDetailIstd> goodsDetails) {
    this.goodsDetails = goodsDetails;
  }


  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel goodsInfo(GoodsInfoIstd goodsInfo) {
    
    this.goodsInfo = goodsInfo;
    return this;
  }

   /**
   * Get goodsInfo
   * @return goodsInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GoodsInfoIstd getGoodsInfo() {
    return goodsInfo;
  }


  public void setGoodsInfo(GoodsInfoIstd goodsInfo) {
    this.goodsInfo = goodsInfo;
  }


  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel logisticsCompanies(List<LogisticsCompanyIstd> logisticsCompanies) {
    
    this.logisticsCompanies = logisticsCompanies;
    return this;
  }

  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel addLogisticsCompaniesItem(LogisticsCompanyIstd logisticsCompaniesItem) {
    if (this.logisticsCompanies == null) {
      this.logisticsCompanies = new ArrayList<>();
    }
    this.logisticsCompanies.add(logisticsCompaniesItem);
    return this;
  }

   /**
   * 即时配送公司配置列表
   * @return logisticsCompanies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "即时配送公司配置列表")

  public List<LogisticsCompanyIstd> getLogisticsCompanies() {
    return logisticsCompanies;
  }


  public void setLogisticsCompanies(List<LogisticsCompanyIstd> logisticsCompanies) {
    this.logisticsCompanies = logisticsCompanies;
  }


  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 消费者id， 如果consumer_source是alipay，则consumer_id必须是支付宝的openId；如果consumer_source是wx，则consumer_id可以为空
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "消费者id， 如果consumer_source是alipay，则consumer_id必须是支付宝的openId；如果consumer_source是wx，则consumer_id可以为空")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel orderExtIstd(OrderExtIstdForPreOrder orderExtIstd) {
    
    this.orderExtIstd = orderExtIstd;
    return this;
  }

   /**
   * Get orderExtIstd
   * @return orderExtIstd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderExtIstdForPreOrder getOrderExtIstd() {
    return orderExtIstd;
  }


  public void setOrderExtIstd(OrderExtIstdForPreOrder orderExtIstd) {
    this.orderExtIstd = orderExtIstd;
  }


  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 商家订单号
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090411140000000000777000216122", value = "商家订单号")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel receiver(ReceiverIstd receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReceiverIstd getReceiver() {
    return receiver;
  }


  public void setReceiver(ReceiverIstd receiver) {
    this.receiver = receiver;
  }


  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel sender(SenderIstd sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SenderIstd getSender() {
    return sender;
  }


  public void setSender(SenderIstd sender) {
    this.sender = sender;
  }


  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel shopNo(String shopNo) {
    
    this.shopNo = shopNo;
    return this;
  }

   /**
   * 商家门店编号
   * @return shopNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "shopno001", value = "商家门店编号")

  public String getShopNo() {
    return shopNo;
  }


  public void setShopNo(String shopNo) {
    this.shopNo = shopNo;
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
   * @return the AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel instance itself
   */
  public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel = (AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel) o;
    return Objects.equals(this.consumerId, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.consumerId) &&
        Objects.equals(this.consumerNotify, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.consumerNotify) &&
        Objects.equals(this.consumerSource, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.consumerSource) &&
        Objects.equals(this.goodsDetails, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.goodsDetails) &&
        Objects.equals(this.goodsInfo, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.goodsInfo) &&
        Objects.equals(this.logisticsCompanies, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.logisticsCompanies) &&
        Objects.equals(this.openId, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.openId) &&
        Objects.equals(this.orderExtIstd, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.orderExtIstd) &&
        Objects.equals(this.outOrderNo, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.outOrderNo) &&
        Objects.equals(this.receiver, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.receiver) &&
        Objects.equals(this.sender, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.sender) &&
        Objects.equals(this.shopNo, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.shopNo)&&
        Objects.equals(this.additionalProperties, alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, consumerNotify, consumerSource, goodsDetails, goodsInfo, logisticsCompanies, openId, orderExtIstd, outOrderNo, receiver, sender, shopNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel {\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    consumerNotify: ").append(toIndentedString(consumerNotify)).append("\n");
    sb.append("    consumerSource: ").append(toIndentedString(consumerSource)).append("\n");
    sb.append("    goodsDetails: ").append(toIndentedString(goodsDetails)).append("\n");
    sb.append("    goodsInfo: ").append(toIndentedString(goodsInfo)).append("\n");
    sb.append("    logisticsCompanies: ").append(toIndentedString(logisticsCompanies)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    orderExtIstd: ").append(toIndentedString(orderExtIstd)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    shopNo: ").append(toIndentedString(shopNo)).append("\n");
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
    openapiFields.add("consumer_id");
    openapiFields.add("consumer_notify");
    openapiFields.add("consumer_source");
    openapiFields.add("goods_details");
    openapiFields.add("goods_info");
    openapiFields.add("logistics_companies");
    openapiFields.add("open_id");
    openapiFields.add("order_ext_istd");
    openapiFields.add("out_order_no");
    openapiFields.add("receiver");
    openapiFields.add("sender");
    openapiFields.add("shop_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel is not found in the empty JSON string", AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("consumer_id") != null && !jsonObj.get("consumer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumer_id").toString()));
      }
      // validate the optional field `consumer_notify`
      if (jsonObj.getAsJsonObject("consumer_notify") != null) {
        ConsumerNotifyIstd.validateJsonObject(jsonObj.getAsJsonObject("consumer_notify"));
      }
      if (jsonObj.get("consumer_source") != null && !jsonObj.get("consumer_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumer_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumer_source").toString()));
      }
      JsonArray jsonArraygoodsDetails = jsonObj.getAsJsonArray("goods_details");
      if (jsonArraygoodsDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("goods_details").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `goods_details` to be an array in the JSON string but got `%s`", jsonObj.get("goods_details").toString()));
        }

        // validate the optional field `goods_details` (array)
        for (int i = 0; i < jsonArraygoodsDetails.size(); i++) {
          GoodsDetailIstd.validateJsonObject(jsonArraygoodsDetails.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `goods_info`
      if (jsonObj.getAsJsonObject("goods_info") != null) {
        GoodsInfoIstd.validateJsonObject(jsonObj.getAsJsonObject("goods_info"));
      }
      JsonArray jsonArraylogisticsCompanies = jsonObj.getAsJsonArray("logistics_companies");
      if (jsonArraylogisticsCompanies != null) {
        // ensure the json data is an array
        if (!jsonObj.get("logistics_companies").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `logistics_companies` to be an array in the JSON string but got `%s`", jsonObj.get("logistics_companies").toString()));
        }

        // validate the optional field `logistics_companies` (array)
        for (int i = 0; i < jsonArraylogisticsCompanies.size(); i++) {
          LogisticsCompanyIstd.validateJsonObject(jsonArraylogisticsCompanies.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      // validate the optional field `order_ext_istd`
      if (jsonObj.getAsJsonObject("order_ext_istd") != null) {
        OrderExtIstdForPreOrder.validateJsonObject(jsonObj.getAsJsonObject("order_ext_istd"));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
      // validate the optional field `receiver`
      if (jsonObj.getAsJsonObject("receiver") != null) {
        ReceiverIstd.validateJsonObject(jsonObj.getAsJsonObject("receiver"));
      }
      // validate the optional field `sender`
      if (jsonObj.getAsJsonObject("sender") != null) {
        SenderIstd.validateJsonObject(jsonObj.getAsJsonObject("sender"));
      }
      if (jsonObj.get("shop_no") != null && !jsonObj.get("shop_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel value) throws IOException {
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
           public AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel
  */
  public static AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

