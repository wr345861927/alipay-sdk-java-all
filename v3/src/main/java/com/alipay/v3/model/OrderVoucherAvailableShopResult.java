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
import com.alipay.v3.model.OrderVoucherMerchantAllShopResult;
import com.alipay.v3.model.OrderVoucherRealShopFailInfo;
import com.alipay.v3.model.OrderVoucherShopFailInfo;
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
 * OrderVoucherAvailableShopResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderVoucherAvailableShopResult {
  public static final String SERIALIZED_NAME_ORDER_VOUCHER_MERCHANT_ALL_SHOP_RESULT = "order_voucher_merchant_all_shop_result";
  @SerializedName(SERIALIZED_NAME_ORDER_VOUCHER_MERCHANT_ALL_SHOP_RESULT)
  private OrderVoucherMerchantAllShopResult orderVoucherMerchantAllShopResult;

  public static final String SERIALIZED_NAME_REAL_SHOP_FAIL_INFOS = "real_shop_fail_infos";
  @SerializedName(SERIALIZED_NAME_REAL_SHOP_FAIL_INFOS)
  private List<OrderVoucherRealShopFailInfo> realShopFailInfos = null;

  public static final String SERIALIZED_NAME_SHOP_FAIL_INFOS = "shop_fail_infos";
  @SerializedName(SERIALIZED_NAME_SHOP_FAIL_INFOS)
  private List<OrderVoucherShopFailInfo> shopFailInfos = null;

  public static final String SERIALIZED_NAME_SUCCESS_REAL_SHOP_IDS = "success_real_shop_ids";
  @SerializedName(SERIALIZED_NAME_SUCCESS_REAL_SHOP_IDS)
  private List<String> successRealShopIds = null;

  public static final String SERIALIZED_NAME_SUCCESS_SHOP_IDS = "success_shop_ids";
  @SerializedName(SERIALIZED_NAME_SUCCESS_SHOP_IDS)
  private List<String> successShopIds = null;

  public OrderVoucherAvailableShopResult() { 
  }

  public OrderVoucherAvailableShopResult orderVoucherMerchantAllShopResult(OrderVoucherMerchantAllShopResult orderVoucherMerchantAllShopResult) {
    
    this.orderVoucherMerchantAllShopResult = orderVoucherMerchantAllShopResult;
    return this;
  }

   /**
   * Get orderVoucherMerchantAllShopResult
   * @return orderVoucherMerchantAllShopResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderVoucherMerchantAllShopResult getOrderVoucherMerchantAllShopResult() {
    return orderVoucherMerchantAllShopResult;
  }


  public void setOrderVoucherMerchantAllShopResult(OrderVoucherMerchantAllShopResult orderVoucherMerchantAllShopResult) {
    this.orderVoucherMerchantAllShopResult = orderVoucherMerchantAllShopResult;
  }


  public OrderVoucherAvailableShopResult realShopFailInfos(List<OrderVoucherRealShopFailInfo> realShopFailInfos) {
    
    this.realShopFailInfos = realShopFailInfos;
    return this;
  }

  public OrderVoucherAvailableShopResult addRealShopFailInfosItem(OrderVoucherRealShopFailInfo realShopFailInfosItem) {
    if (this.realShopFailInfos == null) {
      this.realShopFailInfos = new ArrayList<>();
    }
    this.realShopFailInfos.add(realShopFailInfosItem);
    return this;
  }

   /**
   * 请求失败的代运营商业关系门店详情
   * @return realShopFailInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求失败的代运营商业关系门店详情")

  public List<OrderVoucherRealShopFailInfo> getRealShopFailInfos() {
    return realShopFailInfos;
  }


  public void setRealShopFailInfos(List<OrderVoucherRealShopFailInfo> realShopFailInfos) {
    this.realShopFailInfos = realShopFailInfos;
  }


  public OrderVoucherAvailableShopResult shopFailInfos(List<OrderVoucherShopFailInfo> shopFailInfos) {
    
    this.shopFailInfos = shopFailInfos;
    return this;
  }

  public OrderVoucherAvailableShopResult addShopFailInfosItem(OrderVoucherShopFailInfo shopFailInfosItem) {
    if (this.shopFailInfos == null) {
      this.shopFailInfos = new ArrayList<>();
    }
    this.shopFailInfos.add(shopFailInfosItem);
    return this;
  }

   /**
   * 请求失败的支付宝门店详情。
   * @return shopFailInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求失败的支付宝门店详情。")

  public List<OrderVoucherShopFailInfo> getShopFailInfos() {
    return shopFailInfos;
  }


  public void setShopFailInfos(List<OrderVoucherShopFailInfo> shopFailInfos) {
    this.shopFailInfos = shopFailInfos;
  }


  public OrderVoucherAvailableShopResult successRealShopIds(List<String> successRealShopIds) {
    
    this.successRealShopIds = successRealShopIds;
    return this;
  }

  public OrderVoucherAvailableShopResult addSuccessRealShopIdsItem(String successRealShopIdsItem) {
    if (this.successRealShopIds == null) {
      this.successRealShopIds = new ArrayList<>();
    }
    this.successRealShopIds.add(successRealShopIdsItem);
    return this;
  }

   /**
   * 请求成功的代运营商业关系门店
   * @return successRealShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求成功的代运营商业关系门店")

  public List<String> getSuccessRealShopIds() {
    return successRealShopIds;
  }


  public void setSuccessRealShopIds(List<String> successRealShopIds) {
    this.successRealShopIds = successRealShopIds;
  }


  public OrderVoucherAvailableShopResult successShopIds(List<String> successShopIds) {
    
    this.successShopIds = successShopIds;
    return this;
  }

  public OrderVoucherAvailableShopResult addSuccessShopIdsItem(String successShopIdsItem) {
    if (this.successShopIds == null) {
      this.successShopIds = new ArrayList<>();
    }
    this.successShopIds.add(successShopIdsItem);
    return this;
  }

   /**
   * 请求成功的支付宝门店。
   * @return successShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求成功的支付宝门店。")

  public List<String> getSuccessShopIds() {
    return successShopIds;
  }


  public void setSuccessShopIds(List<String> successShopIds) {
    this.successShopIds = successShopIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderVoucherAvailableShopResult orderVoucherAvailableShopResult = (OrderVoucherAvailableShopResult) o;
    return Objects.equals(this.orderVoucherMerchantAllShopResult, orderVoucherAvailableShopResult.orderVoucherMerchantAllShopResult) &&
        Objects.equals(this.realShopFailInfos, orderVoucherAvailableShopResult.realShopFailInfos) &&
        Objects.equals(this.shopFailInfos, orderVoucherAvailableShopResult.shopFailInfos) &&
        Objects.equals(this.successRealShopIds, orderVoucherAvailableShopResult.successRealShopIds) &&
        Objects.equals(this.successShopIds, orderVoucherAvailableShopResult.successShopIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderVoucherMerchantAllShopResult, realShopFailInfos, shopFailInfos, successRealShopIds, successShopIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderVoucherAvailableShopResult {\n");
    sb.append("    orderVoucherMerchantAllShopResult: ").append(toIndentedString(orderVoucherMerchantAllShopResult)).append("\n");
    sb.append("    realShopFailInfos: ").append(toIndentedString(realShopFailInfos)).append("\n");
    sb.append("    shopFailInfos: ").append(toIndentedString(shopFailInfos)).append("\n");
    sb.append("    successRealShopIds: ").append(toIndentedString(successRealShopIds)).append("\n");
    sb.append("    successShopIds: ").append(toIndentedString(successShopIds)).append("\n");
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
    openapiFields.add("order_voucher_merchant_all_shop_result");
    openapiFields.add("real_shop_fail_infos");
    openapiFields.add("shop_fail_infos");
    openapiFields.add("success_real_shop_ids");
    openapiFields.add("success_shop_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderVoucherAvailableShopResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderVoucherAvailableShopResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderVoucherAvailableShopResult is not found in the empty JSON string", OrderVoucherAvailableShopResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderVoucherAvailableShopResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderVoucherAvailableShopResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `order_voucher_merchant_all_shop_result`
      if (jsonObj.getAsJsonObject("order_voucher_merchant_all_shop_result") != null) {
        OrderVoucherMerchantAllShopResult.validateJsonObject(jsonObj.getAsJsonObject("order_voucher_merchant_all_shop_result"));
      }
      JsonArray jsonArrayrealShopFailInfos = jsonObj.getAsJsonArray("real_shop_fail_infos");
      if (jsonArrayrealShopFailInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("real_shop_fail_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `real_shop_fail_infos` to be an array in the JSON string but got `%s`", jsonObj.get("real_shop_fail_infos").toString()));
        }

        // validate the optional field `real_shop_fail_infos` (array)
        for (int i = 0; i < jsonArrayrealShopFailInfos.size(); i++) {
          OrderVoucherRealShopFailInfo.validateJsonObject(jsonArrayrealShopFailInfos.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayshopFailInfos = jsonObj.getAsJsonArray("shop_fail_infos");
      if (jsonArrayshopFailInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("shop_fail_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `shop_fail_infos` to be an array in the JSON string but got `%s`", jsonObj.get("shop_fail_infos").toString()));
        }

        // validate the optional field `shop_fail_infos` (array)
        for (int i = 0; i < jsonArrayshopFailInfos.size(); i++) {
          OrderVoucherShopFailInfo.validateJsonObject(jsonArrayshopFailInfos.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("success_real_shop_ids") != null && !jsonObj.get("success_real_shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `success_real_shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("success_real_shop_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("success_shop_ids") != null && !jsonObj.get("success_shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `success_shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("success_shop_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderVoucherAvailableShopResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderVoucherAvailableShopResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderVoucherAvailableShopResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderVoucherAvailableShopResult.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderVoucherAvailableShopResult>() {
           @Override
           public void write(JsonWriter out, OrderVoucherAvailableShopResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderVoucherAvailableShopResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderVoucherAvailableShopResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderVoucherAvailableShopResult
  * @throws IOException if the JSON string is invalid with respect to OrderVoucherAvailableShopResult
  */
  public static OrderVoucherAvailableShopResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderVoucherAvailableShopResult.class);
  }

 /**
  * Convert an instance of OrderVoucherAvailableShopResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

