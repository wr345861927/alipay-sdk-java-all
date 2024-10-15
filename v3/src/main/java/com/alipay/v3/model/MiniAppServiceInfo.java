/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
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
 * MiniAppServiceInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MiniAppServiceInfo {
  public static final String SERIALIZED_NAME_BIZ_STATUS = "biz_status";
  @SerializedName(SERIALIZED_NAME_BIZ_STATUS)
  private String bizStatus;

  public static final String SERIALIZED_NAME_IS_INNER = "is_inner";
  @SerializedName(SERIALIZED_NAME_IS_INNER)
  private Boolean isInner;

  public static final String SERIALIZED_NAME_IS_ORDER = "is_order";
  @SerializedName(SERIALIZED_NAME_IS_ORDER)
  private Boolean isOrder;

  public static final String SERIALIZED_NAME_ISV_APP_ID = "isv_app_id";
  @SerializedName(SERIALIZED_NAME_ISV_APP_ID)
  private String isvAppId;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_MINI_APP_NAME = "mini_app_name";
  @SerializedName(SERIALIZED_NAME_MINI_APP_NAME)
  private String miniAppName;

  public static final String SERIALIZED_NAME_SELLER_ID = "seller_id";
  @SerializedName(SERIALIZED_NAME_SELLER_ID)
  private String sellerId;

  public static final String SERIALIZED_NAME_SELLER_NAME = "seller_name";
  @SerializedName(SERIALIZED_NAME_SELLER_NAME)
  private String sellerName;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_SERVICE_LOGO = "service_logo";
  @SerializedName(SERIALIZED_NAME_SERVICE_LOGO)
  private String serviceLogo;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "service_name";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_SERVICE_SLOGAN = "service_slogan";
  @SerializedName(SERIALIZED_NAME_SERVICE_SLOGAN)
  private String serviceSlogan;

  public static final String SERIALIZED_NAME_SHOW_TYPE = "show_type";
  @SerializedName(SERIALIZED_NAME_SHOW_TYPE)
  private String showType;

  public MiniAppServiceInfo() { 
  }

  public MiniAppServiceInfo bizStatus(String bizStatus) {
    
    this.bizStatus = bizStatus;
    return this;
  }

   /**
   * 插件发布状态码，暂存100，风控审核200，运营审核300，等待上架400，已预发上架500，已上架501，已下架600，已驳回700
   * @return bizStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "插件发布状态码，暂存100，风控审核200，运营审核300，等待上架400，已预发上架500，已上架501，已下架600，已驳回700")

  public String getBizStatus() {
    return bizStatus;
  }


  public void setBizStatus(String bizStatus) {
    this.bizStatus = bizStatus;
  }


  public MiniAppServiceInfo isInner(Boolean isInner) {
    
    this.isInner = isInner;
    return this;
  }

   /**
   * 是否是内部标，true/false
   * @return isInner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否是内部标，true/false")

  public Boolean getIsInner() {
    return isInner;
  }


  public void setIsInner(Boolean isInner) {
    this.isInner = isInner;
  }


  public MiniAppServiceInfo isOrder(Boolean isOrder) {
    
    this.isOrder = isOrder;
    return this;
  }

   /**
   * 是否订购，true/false
   * @return isOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否订购，true/false")

  public Boolean getIsOrder() {
    return isOrder;
  }


  public void setIsOrder(Boolean isOrder) {
    this.isOrder = isOrder;
  }


  public MiniAppServiceInfo isvAppId(String isvAppId) {
    
    this.isvAppId = isvAppId;
    return this;
  }

   /**
   * 三方应用appid
   * @return isvAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021000146612019", value = "三方应用appid")

  public String getIsvAppId() {
    return isvAppId;
  }


  public void setIsvAppId(String isvAppId) {
    this.isvAppId = isvAppId;
  }


  public MiniAppServiceInfo miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 应用id
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021000146613280", value = "应用id")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public MiniAppServiceInfo miniAppName(String miniAppName) {
    
    this.miniAppName = miniAppName;
    return this;
  }

   /**
   * 测试插件
   * @return miniAppName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序名称", value = "测试插件")

  public String getMiniAppName() {
    return miniAppName;
  }


  public void setMiniAppName(String miniAppName) {
    this.miniAppName = miniAppName;
  }


  public MiniAppServiceInfo sellerId(String sellerId) {
    
    this.sellerId = sellerId;
    return this;
  }

   /**
   * 卖家pid
   * @return sellerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301715777422", value = "卖家pid")

  public String getSellerId() {
    return sellerId;
  }


  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }


  public MiniAppServiceInfo sellerName(String sellerName) {
    
    this.sellerName = sellerName;
    return this;
  }

   /**
   * 卖家名
   * @return sellerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "frikwj", value = "卖家名")

  public String getSellerName() {
    return sellerName;
  }


  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }


  public MiniAppServiceInfo serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 商品CODE
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AM010401000000070768", value = "商品CODE")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public MiniAppServiceInfo serviceLogo(String serviceLogo) {
    
    this.serviceLogo = serviceLogo;
    return this;
  }

   /**
   * 服务图标
   * @return serviceLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://appstoreisvpic.alipayobjects.com/dev/50a1a2ad-c9af-4c24-92e0-84127857b634.jpg", value = "服务图标")

  public String getServiceLogo() {
    return serviceLogo;
  }


  public void setServiceLogo(String serviceLogo) {
    this.serviceLogo = serviceLogo;
  }


  public MiniAppServiceInfo serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * 服务名
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "崮城的小程序插件01插件", value = "服务名")

  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public MiniAppServiceInfo serviceSlogan(String serviceSlogan) {
    
    this.serviceSlogan = serviceSlogan;
    return this;
  }

   /**
   * 服务简介
   * @return serviceSlogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "反倒是离开及发的克里斯", value = "服务简介")

  public String getServiceSlogan() {
    return serviceSlogan;
  }


  public void setServiceSlogan(String serviceSlogan) {
    this.serviceSlogan = serviceSlogan;
  }


  public MiniAppServiceInfo showType(String showType) {
    
    this.showType = showType;
    return this;
  }

   /**
   * 是否在服务市场透出，SHOW展示、HIDE隐藏
   * @return showType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SHOW", value = "是否在服务市场透出，SHOW展示、HIDE隐藏")

  public String getShowType() {
    return showType;
  }


  public void setShowType(String showType) {
    this.showType = showType;
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
   * @return the MiniAppServiceInfo instance itself
   */
  public MiniAppServiceInfo putAdditionalProperty(String key, Object value) {
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
    MiniAppServiceInfo miniAppServiceInfo = (MiniAppServiceInfo) o;
    return Objects.equals(this.bizStatus, miniAppServiceInfo.bizStatus) &&
        Objects.equals(this.isInner, miniAppServiceInfo.isInner) &&
        Objects.equals(this.isOrder, miniAppServiceInfo.isOrder) &&
        Objects.equals(this.isvAppId, miniAppServiceInfo.isvAppId) &&
        Objects.equals(this.miniAppId, miniAppServiceInfo.miniAppId) &&
        Objects.equals(this.miniAppName, miniAppServiceInfo.miniAppName) &&
        Objects.equals(this.sellerId, miniAppServiceInfo.sellerId) &&
        Objects.equals(this.sellerName, miniAppServiceInfo.sellerName) &&
        Objects.equals(this.serviceCode, miniAppServiceInfo.serviceCode) &&
        Objects.equals(this.serviceLogo, miniAppServiceInfo.serviceLogo) &&
        Objects.equals(this.serviceName, miniAppServiceInfo.serviceName) &&
        Objects.equals(this.serviceSlogan, miniAppServiceInfo.serviceSlogan) &&
        Objects.equals(this.showType, miniAppServiceInfo.showType)&&
        Objects.equals(this.additionalProperties, miniAppServiceInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizStatus, isInner, isOrder, isvAppId, miniAppId, miniAppName, sellerId, sellerName, serviceCode, serviceLogo, serviceName, serviceSlogan, showType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiniAppServiceInfo {\n");
    sb.append("    bizStatus: ").append(toIndentedString(bizStatus)).append("\n");
    sb.append("    isInner: ").append(toIndentedString(isInner)).append("\n");
    sb.append("    isOrder: ").append(toIndentedString(isOrder)).append("\n");
    sb.append("    isvAppId: ").append(toIndentedString(isvAppId)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    miniAppName: ").append(toIndentedString(miniAppName)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    sellerName: ").append(toIndentedString(sellerName)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    serviceLogo: ").append(toIndentedString(serviceLogo)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceSlogan: ").append(toIndentedString(serviceSlogan)).append("\n");
    sb.append("    showType: ").append(toIndentedString(showType)).append("\n");
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
    openapiFields.add("biz_status");
    openapiFields.add("is_inner");
    openapiFields.add("is_order");
    openapiFields.add("isv_app_id");
    openapiFields.add("mini_app_id");
    openapiFields.add("mini_app_name");
    openapiFields.add("seller_id");
    openapiFields.add("seller_name");
    openapiFields.add("service_code");
    openapiFields.add("service_logo");
    openapiFields.add("service_name");
    openapiFields.add("service_slogan");
    openapiFields.add("show_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MiniAppServiceInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MiniAppServiceInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MiniAppServiceInfo is not found in the empty JSON string", MiniAppServiceInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_status") != null && !jsonObj.get("biz_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_status").toString()));
      }
      if (jsonObj.get("isv_app_id") != null && !jsonObj.get("isv_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_app_id").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("mini_app_name") != null && !jsonObj.get("mini_app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_name").toString()));
      }
      if (jsonObj.get("seller_id") != null && !jsonObj.get("seller_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_id").toString()));
      }
      if (jsonObj.get("seller_name") != null && !jsonObj.get("seller_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_name").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("service_logo") != null && !jsonObj.get("service_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_logo").toString()));
      }
      if (jsonObj.get("service_name") != null && !jsonObj.get("service_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_name").toString()));
      }
      if (jsonObj.get("service_slogan") != null && !jsonObj.get("service_slogan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_slogan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_slogan").toString()));
      }
      if (jsonObj.get("show_type") != null && !jsonObj.get("show_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `show_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("show_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MiniAppServiceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MiniAppServiceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MiniAppServiceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MiniAppServiceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MiniAppServiceInfo>() {
           @Override
           public void write(JsonWriter out, MiniAppServiceInfo value) throws IOException {
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
           public MiniAppServiceInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MiniAppServiceInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MiniAppServiceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MiniAppServiceInfo
  * @throws IOException if the JSON string is invalid with respect to MiniAppServiceInfo
  */
  public static MiniAppServiceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MiniAppServiceInfo.class);
  }

 /**
  * Convert an instance of MiniAppServiceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

