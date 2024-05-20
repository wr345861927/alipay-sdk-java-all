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
 * AlipayOpenServicemarketOrderItemCancelModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenServicemarketOrderItemCancelModel {
  public static final String SERIALIZED_NAME_CANCEL_REASON = "cancel_reason";
  @SerializedName(SERIALIZED_NAME_CANCEL_REASON)
  private String cancelReason;

  public static final String SERIALIZED_NAME_COMMODITY_ORDER_ID = "commodity_order_id";
  @SerializedName(SERIALIZED_NAME_COMMODITY_ORDER_ID)
  private String commodityOrderId;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public AlipayOpenServicemarketOrderItemCancelModel() { 
  }

  public AlipayOpenServicemarketOrderItemCancelModel cancelReason(String cancelReason) {
    
    this.cancelReason = cancelReason;
    return this;
  }

   /**
   * 当前门店区域不支持实施
   * @return cancelReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "该门店暂无法实施完成", value = "当前门店区域不支持实施")

  public String getCancelReason() {
    return cancelReason;
  }


  public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
  }


  public AlipayOpenServicemarketOrderItemCancelModel commodityOrderId(String commodityOrderId) {
    
    this.commodityOrderId = commodityOrderId;
    return this;
  }

   /**
   * 订购服务订单ID，通过支付宝发送的 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_3/alipay.open.servicemarket.order.notify\&quot;&gt;服务市场商户确认订购通知&lt;/a&gt; 通知获取。
   * @return commodityOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160010200000000033400", value = "订购服务订单ID，通过支付宝发送的 <a href=\"https://opendocs.alipay.com/apis/api_3/alipay.open.servicemarket.order.notify\">服务市场商户确认订购通知</a> 通知获取。")

  public String getCommodityOrderId() {
    return commodityOrderId;
  }


  public void setCommodityOrderId(String commodityOrderId) {
    this.commodityOrderId = commodityOrderId;
  }


  public AlipayOpenServicemarketOrderItemCancelModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 商家订购服务选择的某一小程序的APPID，如果该订单为蚂蚁服务市场发布的小程序插件服务所产生的订单，则此字段必填
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017121800945174", value = "商家订购服务选择的某一小程序的APPID，如果该订单为蚂蚁服务市场发布的小程序插件服务所产生的订单，则此字段必填")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenServicemarketOrderItemCancelModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 商家订购服务选择的某一门店的ID。若该订单：  为支付宝服务市场发布的服务所产生订单则该参数可选。
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015052000077000000000182140", value = "商家订购服务选择的某一门店的ID。若该订单：  为支付宝服务市场发布的服务所产生订单则该参数可选。")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
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
   * @return the AlipayOpenServicemarketOrderItemCancelModel instance itself
   */
  public AlipayOpenServicemarketOrderItemCancelModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenServicemarketOrderItemCancelModel alipayOpenServicemarketOrderItemCancelModel = (AlipayOpenServicemarketOrderItemCancelModel) o;
    return Objects.equals(this.cancelReason, alipayOpenServicemarketOrderItemCancelModel.cancelReason) &&
        Objects.equals(this.commodityOrderId, alipayOpenServicemarketOrderItemCancelModel.commodityOrderId) &&
        Objects.equals(this.miniAppId, alipayOpenServicemarketOrderItemCancelModel.miniAppId) &&
        Objects.equals(this.shopId, alipayOpenServicemarketOrderItemCancelModel.shopId)&&
        Objects.equals(this.additionalProperties, alipayOpenServicemarketOrderItemCancelModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelReason, commodityOrderId, miniAppId, shopId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenServicemarketOrderItemCancelModel {\n");
    sb.append("    cancelReason: ").append(toIndentedString(cancelReason)).append("\n");
    sb.append("    commodityOrderId: ").append(toIndentedString(commodityOrderId)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
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
    openapiFields.add("cancel_reason");
    openapiFields.add("commodity_order_id");
    openapiFields.add("mini_app_id");
    openapiFields.add("shop_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenServicemarketOrderItemCancelModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenServicemarketOrderItemCancelModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenServicemarketOrderItemCancelModel is not found in the empty JSON string", AlipayOpenServicemarketOrderItemCancelModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("cancel_reason") != null && !jsonObj.get("cancel_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancel_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancel_reason").toString()));
      }
      if (jsonObj.get("commodity_order_id") != null && !jsonObj.get("commodity_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commodity_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commodity_order_id").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenServicemarketOrderItemCancelModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenServicemarketOrderItemCancelModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenServicemarketOrderItemCancelModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenServicemarketOrderItemCancelModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenServicemarketOrderItemCancelModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenServicemarketOrderItemCancelModel value) throws IOException {
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
           public AlipayOpenServicemarketOrderItemCancelModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenServicemarketOrderItemCancelModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenServicemarketOrderItemCancelModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenServicemarketOrderItemCancelModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenServicemarketOrderItemCancelModel
  */
  public static AlipayOpenServicemarketOrderItemCancelModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenServicemarketOrderItemCancelModel.class);
  }

 /**
  * Convert an instance of AlipayOpenServicemarketOrderItemCancelModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

