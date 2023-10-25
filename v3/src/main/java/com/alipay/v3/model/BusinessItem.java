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
 * BusinessItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BusinessItem {
  public static final String SERIALIZED_NAME_BUSINESS_APPID = "business_appid";
  @SerializedName(SERIALIZED_NAME_BUSINESS_APPID)
  private String businessAppid;

  public static final String SERIALIZED_NAME_BUSINESS_PAYEE_ID = "business_payee_id";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAYEE_ID)
  private String businessPayeeId;

  public static final String SERIALIZED_NAME_BUSINESS_PID = "business_pid";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PID)
  private String businessPid;

  public static final String SERIALIZED_NAME_BUSINESS_TYPE = "business_type";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TYPE)
  private String businessType;

  public BusinessItem() { 
  }

  public BusinessItem businessAppid(String businessAppid) {
    
    this.businessAppid = businessAppid;
    return this;
  }

   /**
   * 业务归属appid
   * @return businessAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "业务归属appid")

  public String getBusinessAppid() {
    return businessAppid;
  }


  public void setBusinessAppid(String businessAppid) {
    this.businessAppid = businessAppid;
  }


  public BusinessItem businessPayeeId(String businessPayeeId) {
    
    this.businessPayeeId = businessPayeeId;
    return this;
  }

   /**
   * 业务收款pid，business_type为AGREEMENT_PAY时，此参数必传
   * @return businessPayeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "业务收款pid，business_type为AGREEMENT_PAY时，此参数必传")

  public String getBusinessPayeeId() {
    return businessPayeeId;
  }


  public void setBusinessPayeeId(String businessPayeeId) {
    this.businessPayeeId = businessPayeeId;
  }


  public BusinessItem businessPid(String businessPid) {
    
    this.businessPid = businessPid;
    return this;
  }

   /**
   * 业务归属pid
   * @return businessPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "业务归属pid")

  public String getBusinessPid() {
    return businessPid;
  }


  public void setBusinessPid(String businessPid) {
    this.businessPid = businessPid;
  }


  public BusinessItem businessType(String businessType) {
    
    this.businessType = businessType;
    return this;
  }

   /**
   * 业务类型ONLINE_PAY(在线缴费) 、AGREEMENT_PAY(无感停车) DEVICE_ONLINE_PAY(车机在线缴费)
   * @return businessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "业务类型ONLINE_PAY(在线缴费) 、AGREEMENT_PAY(无感停车) DEVICE_ONLINE_PAY(车机在线缴费)")

  public String getBusinessType() {
    return businessType;
  }


  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessItem businessItem = (BusinessItem) o;
    return Objects.equals(this.businessAppid, businessItem.businessAppid) &&
        Objects.equals(this.businessPayeeId, businessItem.businessPayeeId) &&
        Objects.equals(this.businessPid, businessItem.businessPid) &&
        Objects.equals(this.businessType, businessItem.businessType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessAppid, businessPayeeId, businessPid, businessType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessItem {\n");
    sb.append("    businessAppid: ").append(toIndentedString(businessAppid)).append("\n");
    sb.append("    businessPayeeId: ").append(toIndentedString(businessPayeeId)).append("\n");
    sb.append("    businessPid: ").append(toIndentedString(businessPid)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
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
    openapiFields.add("business_appid");
    openapiFields.add("business_payee_id");
    openapiFields.add("business_pid");
    openapiFields.add("business_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessItem is not found in the empty JSON string", BusinessItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("business_appid") != null && !jsonObj.get("business_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_appid").toString()));
      }
      if (jsonObj.get("business_payee_id") != null && !jsonObj.get("business_payee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_payee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_payee_id").toString()));
      }
      if (jsonObj.get("business_pid") != null && !jsonObj.get("business_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_pid").toString()));
      }
      if (jsonObj.get("business_type") != null && !jsonObj.get("business_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessItem>() {
           @Override
           public void write(JsonWriter out, BusinessItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessItem
  * @throws IOException if the JSON string is invalid with respect to BusinessItem
  */
  public static BusinessItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessItem.class);
  }

 /**
  * Convert an instance of BusinessItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

