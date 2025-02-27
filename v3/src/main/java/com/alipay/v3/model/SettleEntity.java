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
 * SettleEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SettleEntity {
  public static final String SERIALIZED_NAME_SETTLE_ENTITY_BIZ_TYPE = "settle_entity_biz_type";
  @SerializedName(SERIALIZED_NAME_SETTLE_ENTITY_BIZ_TYPE)
  private String settleEntityBizType;

  public static final String SERIALIZED_NAME_SETTLE_ENTITY_ID = "settle_entity_id";
  @SerializedName(SERIALIZED_NAME_SETTLE_ENTITY_ID)
  private String settleEntityId;

  public static final String SERIALIZED_NAME_SETTLE_ENTITY_TYPE = "settle_entity_type";
  @SerializedName(SERIALIZED_NAME_SETTLE_ENTITY_TYPE)
  private String settleEntityType;

  public SettleEntity() { 
  }

  public SettleEntity settleEntityBizType(String settleEntityBizType) {
    
    this.settleEntityBizType = settleEntityBizType;
    return this;
  }

   /**
   * 结算主体资产业务类型，settled 表示已结算资产
   * @return settleEntityBizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "settled", value = "结算主体资产业务类型，settled 表示已结算资产")

  public String getSettleEntityBizType() {
    return settleEntityBizType;
  }


  public void setSettleEntityBizType(String settleEntityBizType) {
    this.settleEntityBizType = settleEntityBizType;
  }


  public SettleEntity settleEntityId(String settleEntityId) {
    
    this.settleEntityId = settleEntityId;
    return this;
  }

   /**
   * 结算主体账号 当结算主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID；当结算主体类型为MerchantStore，本参数为商户门店ID。
   * @return settleEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19023454", value = "结算主体账号 当结算主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID；当结算主体类型为MerchantStore，本参数为商户门店ID。")

  public String getSettleEntityId() {
    return settleEntityId;
  }


  public void setSettleEntityId(String settleEntityId) {
    this.settleEntityId = settleEntityId;
  }


  public SettleEntity settleEntityType(String settleEntityType) {
    
    this.settleEntityType = settleEntityType;
    return this;
  }

   /**
   * 结算主体类型 SecondMerchant：结算主体为二级商户；Store：结算主体为商户门店
   * @return settleEntityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SecondMerchant", value = "结算主体类型 SecondMerchant：结算主体为二级商户；Store：结算主体为商户门店")

  public String getSettleEntityType() {
    return settleEntityType;
  }


  public void setSettleEntityType(String settleEntityType) {
    this.settleEntityType = settleEntityType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettleEntity settleEntity = (SettleEntity) o;
    return Objects.equals(this.settleEntityBizType, settleEntity.settleEntityBizType) &&
        Objects.equals(this.settleEntityId, settleEntity.settleEntityId) &&
        Objects.equals(this.settleEntityType, settleEntity.settleEntityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settleEntityBizType, settleEntityId, settleEntityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettleEntity {\n");
    sb.append("    settleEntityBizType: ").append(toIndentedString(settleEntityBizType)).append("\n");
    sb.append("    settleEntityId: ").append(toIndentedString(settleEntityId)).append("\n");
    sb.append("    settleEntityType: ").append(toIndentedString(settleEntityType)).append("\n");
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
    openapiFields.add("settle_entity_biz_type");
    openapiFields.add("settle_entity_id");
    openapiFields.add("settle_entity_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SettleEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SettleEntity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettleEntity is not found in the empty JSON string", SettleEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SettleEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SettleEntity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("settle_entity_biz_type") != null && !jsonObj.get("settle_entity_biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_entity_biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_entity_biz_type").toString()));
      }
      if (jsonObj.get("settle_entity_id") != null && !jsonObj.get("settle_entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_entity_id").toString()));
      }
      if (jsonObj.get("settle_entity_type") != null && !jsonObj.get("settle_entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_entity_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettleEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettleEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettleEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettleEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<SettleEntity>() {
           @Override
           public void write(JsonWriter out, SettleEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettleEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettleEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettleEntity
  * @throws IOException if the JSON string is invalid with respect to SettleEntity
  */
  public static SettleEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettleEntity.class);
  }

 /**
  * Convert an instance of SettleEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

