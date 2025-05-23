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
import com.alipay.v3.model.SearchBaseItems;
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
 * SearchBaseOrderCreateApiRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchBaseOrderCreateApiRequest {
  public static final String SERIALIZED_NAME_ACCESS_TYPE = "access_type";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private String accessType;

  public static final String SERIALIZED_NAME_APPID = "appid";
  @SerializedName(SERIALIZED_NAME_APPID)
  private String appid;

  public static final String SERIALIZED_NAME_BASE_ITEMS = "base_items";
  @SerializedName(SERIALIZED_NAME_BASE_ITEMS)
  private SearchBaseItems baseItems;

  public static final String SERIALIZED_NAME_DESCPRISE = "descprise";
  @SerializedName(SERIALIZED_NAME_DESCPRISE)
  private String descprise;

  public static final String SERIALIZED_NAME_IS_DRAFT = "is_draft";
  @SerializedName(SERIALIZED_NAME_IS_DRAFT)
  private Boolean isDraft;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_SPEC_CODE = "spec_code";
  @SerializedName(SERIALIZED_NAME_SPEC_CODE)
  private String specCode;

  public SearchBaseOrderCreateApiRequest() { 
  }

  public SearchBaseOrderCreateApiRequest accessType(String accessType) {
    
    this.accessType = accessType;
    return this;
  }

   /**
   * 搜索直达类型 BASE：基础信息，只支持基础信息工单提报
   * @return accessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BASE", value = "搜索直达类型 BASE：基础信息，只支持基础信息工单提报")

  public String getAccessType() {
    return accessType;
  }


  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }


  public SearchBaseOrderCreateApiRequest appid(String appid) {
    
    this.appid = appid;
    return this;
  }

   /**
   * 小程序Id
   * @return appid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001105612404", value = "小程序Id")

  public String getAppid() {
    return appid;
  }


  public void setAppid(String appid) {
    this.appid = appid;
  }


  public SearchBaseOrderCreateApiRequest baseItems(SearchBaseItems baseItems) {
    
    this.baseItems = baseItems;
    return this;
  }

   /**
   * Get baseItems
   * @return baseItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchBaseItems getBaseItems() {
    return baseItems;
  }


  public void setBaseItems(SearchBaseItems baseItems) {
    this.baseItems = baseItems;
  }


  public SearchBaseOrderCreateApiRequest descprise(String descprise) {
    
    this.descprise = descprise;
    return this;
  }

   /**
   * 服务描述
   * @return descprise
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "服务描述", value = "服务描述")

  public String getDescprise() {
    return descprise;
  }


  public void setDescprise(String descprise) {
    this.descprise = descprise;
  }


  public SearchBaseOrderCreateApiRequest isDraft(Boolean isDraft) {
    
    this.isDraft = isDraft;
    return this;
  }

   /**
   * 是否为草稿态
   * @return isDraft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否为草稿态")

  public Boolean getIsDraft() {
    return isDraft;
  }


  public void setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
  }


  public SearchBaseOrderCreateApiRequest orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 申请单id，仅仅驳回或修改是传入
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AP20200212100002488", value = "申请单id，仅仅驳回或修改是传入")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public SearchBaseOrderCreateApiRequest specCode(String specCode) {
    
    this.specCode = specCode;
    return this;
  }

   /**
   * 服务的类型 SP_MINI_APP 小程序 SP_PUBLIC_APP 生活号
   * @return specCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SP_MINI_APP", value = "服务的类型 SP_MINI_APP 小程序 SP_PUBLIC_APP 生活号")

  public String getSpecCode() {
    return specCode;
  }


  public void setSpecCode(String specCode) {
    this.specCode = specCode;
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
   * @return the SearchBaseOrderCreateApiRequest instance itself
   */
  public SearchBaseOrderCreateApiRequest putAdditionalProperty(String key, Object value) {
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
    SearchBaseOrderCreateApiRequest searchBaseOrderCreateApiRequest = (SearchBaseOrderCreateApiRequest) o;
    return Objects.equals(this.accessType, searchBaseOrderCreateApiRequest.accessType) &&
        Objects.equals(this.appid, searchBaseOrderCreateApiRequest.appid) &&
        Objects.equals(this.baseItems, searchBaseOrderCreateApiRequest.baseItems) &&
        Objects.equals(this.descprise, searchBaseOrderCreateApiRequest.descprise) &&
        Objects.equals(this.isDraft, searchBaseOrderCreateApiRequest.isDraft) &&
        Objects.equals(this.orderId, searchBaseOrderCreateApiRequest.orderId) &&
        Objects.equals(this.specCode, searchBaseOrderCreateApiRequest.specCode)&&
        Objects.equals(this.additionalProperties, searchBaseOrderCreateApiRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, appid, baseItems, descprise, isDraft, orderId, specCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBaseOrderCreateApiRequest {\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    baseItems: ").append(toIndentedString(baseItems)).append("\n");
    sb.append("    descprise: ").append(toIndentedString(descprise)).append("\n");
    sb.append("    isDraft: ").append(toIndentedString(isDraft)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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
    openapiFields.add("access_type");
    openapiFields.add("appid");
    openapiFields.add("base_items");
    openapiFields.add("descprise");
    openapiFields.add("is_draft");
    openapiFields.add("order_id");
    openapiFields.add("spec_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchBaseOrderCreateApiRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchBaseOrderCreateApiRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchBaseOrderCreateApiRequest is not found in the empty JSON string", SearchBaseOrderCreateApiRequest.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("access_type") != null && !jsonObj.get("access_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_type").toString()));
      }
      if (jsonObj.get("appid") != null && !jsonObj.get("appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appid").toString()));
      }
      // validate the optional field `base_items`
      if (jsonObj.getAsJsonObject("base_items") != null) {
        SearchBaseItems.validateJsonObject(jsonObj.getAsJsonObject("base_items"));
      }
      if (jsonObj.get("descprise") != null && !jsonObj.get("descprise").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descprise` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descprise").toString()));
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("spec_code") != null && !jsonObj.get("spec_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spec_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spec_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchBaseOrderCreateApiRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchBaseOrderCreateApiRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchBaseOrderCreateApiRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchBaseOrderCreateApiRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchBaseOrderCreateApiRequest>() {
           @Override
           public void write(JsonWriter out, SearchBaseOrderCreateApiRequest value) throws IOException {
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
           public SearchBaseOrderCreateApiRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchBaseOrderCreateApiRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SearchBaseOrderCreateApiRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchBaseOrderCreateApiRequest
  * @throws IOException if the JSON string is invalid with respect to SearchBaseOrderCreateApiRequest
  */
  public static SearchBaseOrderCreateApiRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchBaseOrderCreateApiRequest.class);
  }

 /**
  * Convert an instance of SearchBaseOrderCreateApiRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

