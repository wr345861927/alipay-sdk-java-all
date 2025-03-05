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
import com.alipay.v3.model.OrderExtInfo;
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
 * OrderShopInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderShopInfo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ALIPAY_SHOP_ID = "alipay_shop_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_SHOP_ID)
  private String alipayShopId;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<OrderExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_MERCHANT_SHOP_ID = "merchant_shop_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_SHOP_ID)
  private String merchantShopId;

  public static final String SERIALIZED_NAME_MERCHANT_SHOP_LINK_PAGE = "merchant_shop_link_page";
  @SerializedName(SERIALIZED_NAME_MERCHANT_SHOP_LINK_PAGE)
  private String merchantShopLinkPage;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE_NUM = "phone_num";
  @SerializedName(SERIALIZED_NAME_PHONE_NUM)
  private String phoneNum;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public OrderShopInfo() { 
  }

  public OrderShopInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 店铺地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "店铺地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public OrderShopInfo alipayShopId(String alipayShopId) {
    
    this.alipayShopId = alipayShopId;
    return this;
  }

   /**
   * 蚂蚁门店shop_id
   * @return alipayShopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "蚂蚁门店shop_id")

  public String getAlipayShopId() {
    return alipayShopId;
  }


  public void setAlipayShopId(String alipayShopId) {
    this.alipayShopId = alipayShopId;
  }


  public OrderShopInfo extInfo(List<OrderExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public OrderShopInfo addExtInfoItem(OrderExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * 门店其他业务属性，不同业务场景KEY枚举值不同，使用前请参考产品文档
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门店其他业务属性，不同业务场景KEY枚举值不同，使用前请参考产品文档")

  public List<OrderExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<OrderExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public OrderShopInfo merchantShopId(String merchantShopId) {
    
    this.merchantShopId = merchantShopId;
    return this;
  }

   /**
   * 商户门店id 支持英文、数字的组合
   * @return merchantShopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户门店id 支持英文、数字的组合")

  public String getMerchantShopId() {
    return merchantShopId;
  }


  public void setMerchantShopId(String merchantShopId) {
    this.merchantShopId = merchantShopId;
  }


  public OrderShopInfo merchantShopLinkPage(String merchantShopLinkPage) {
    
    this.merchantShopLinkPage = merchantShopLinkPage;
    return this;
  }

   /**
   * 店铺详情链接地址
   * @return merchantShopLinkPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "店铺详情链接地址")

  public String getMerchantShopLinkPage() {
    return merchantShopLinkPage;
  }


  public void setMerchantShopLinkPage(String merchantShopLinkPage) {
    this.merchantShopLinkPage = merchantShopLinkPage;
  }


  public OrderShopInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 店铺名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "店铺名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OrderShopInfo phoneNum(String phoneNum) {
    
    this.phoneNum = phoneNum;
    return this;
  }

   /**
   * 联系电话-支持固话或手机号 仅支持数字、+、- 。例如 手机：1380***1111、固话：021-888**888
   * @return phoneNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "联系电话-支持固话或手机号 仅支持数字、+、- 。例如 手机：1380***1111、固话：021-888**888")

  public String getPhoneNum() {
    return phoneNum;
  }


  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }


  public OrderShopInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 仅当alipay_shop_id字段值为非标准蚂蚁门店时使用，其他场景无需传入
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "仅当alipay_shop_id字段值为非标准蚂蚁门店时使用，其他场景无需传入")

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
   * @return the OrderShopInfo instance itself
   */
  public OrderShopInfo putAdditionalProperty(String key, Object value) {
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
    OrderShopInfo orderShopInfo = (OrderShopInfo) o;
    return Objects.equals(this.address, orderShopInfo.address) &&
        Objects.equals(this.alipayShopId, orderShopInfo.alipayShopId) &&
        Objects.equals(this.extInfo, orderShopInfo.extInfo) &&
        Objects.equals(this.merchantShopId, orderShopInfo.merchantShopId) &&
        Objects.equals(this.merchantShopLinkPage, orderShopInfo.merchantShopLinkPage) &&
        Objects.equals(this.name, orderShopInfo.name) &&
        Objects.equals(this.phoneNum, orderShopInfo.phoneNum) &&
        Objects.equals(this.type, orderShopInfo.type)&&
        Objects.equals(this.additionalProperties, orderShopInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, alipayShopId, extInfo, merchantShopId, merchantShopLinkPage, name, phoneNum, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderShopInfo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    alipayShopId: ").append(toIndentedString(alipayShopId)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    merchantShopId: ").append(toIndentedString(merchantShopId)).append("\n");
    sb.append("    merchantShopLinkPage: ").append(toIndentedString(merchantShopLinkPage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNum: ").append(toIndentedString(phoneNum)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("alipay_shop_id");
    openapiFields.add("ext_info");
    openapiFields.add("merchant_shop_id");
    openapiFields.add("merchant_shop_link_page");
    openapiFields.add("name");
    openapiFields.add("phone_num");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderShopInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderShopInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderShopInfo is not found in the empty JSON string", OrderShopInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("alipay_shop_id") != null && !jsonObj.get("alipay_shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_shop_id").toString()));
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          OrderExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("merchant_shop_id") != null && !jsonObj.get("merchant_shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_shop_id").toString()));
      }
      if (jsonObj.get("merchant_shop_link_page") != null && !jsonObj.get("merchant_shop_link_page").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_shop_link_page` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_shop_link_page").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("phone_num") != null && !jsonObj.get("phone_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_num").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderShopInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderShopInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderShopInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderShopInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderShopInfo>() {
           @Override
           public void write(JsonWriter out, OrderShopInfo value) throws IOException {
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
           public OrderShopInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrderShopInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrderShopInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderShopInfo
  * @throws IOException if the JSON string is invalid with respect to OrderShopInfo
  */
  public static OrderShopInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderShopInfo.class);
  }

 /**
  * Convert an instance of OrderShopInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

