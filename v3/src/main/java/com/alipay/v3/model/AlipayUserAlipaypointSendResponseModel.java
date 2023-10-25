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
 * AlipayUserAlipaypointSendResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserAlipaypointSendResponseModel {
  public static final String SERIALIZED_NAME_RECORD_ID = "record_id";
  @SerializedName(SERIALIZED_NAME_RECORD_ID)
  private String recordId;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public AlipayUserAlipaypointSendResponseModel() { 
  }

  public AlipayUserAlipaypointSendResponseModel recordId(String recordId) {
    
    this.recordId = recordId;
    return this;
  }

   /**
   * 发放记录号。
   * @return recordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "无", value = "发放记录号。")

  public String getRecordId() {
    return recordId;
  }


  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }


  public AlipayUserAlipaypointSendResponseModel transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * 对账中心关联订单，一般场景无需关注
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022062910022100195147193863", value = "对账中心关联订单，一般场景无需关注")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserAlipaypointSendResponseModel alipayUserAlipaypointSendResponseModel = (AlipayUserAlipaypointSendResponseModel) o;
    return Objects.equals(this.recordId, alipayUserAlipaypointSendResponseModel.recordId) &&
        Objects.equals(this.transactionId, alipayUserAlipaypointSendResponseModel.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordId, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserAlipaypointSendResponseModel {\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
    openapiFields.add("record_id");
    openapiFields.add("transaction_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserAlipaypointSendResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserAlipaypointSendResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserAlipaypointSendResponseModel is not found in the empty JSON string", AlipayUserAlipaypointSendResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserAlipaypointSendResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserAlipaypointSendResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("record_id") != null && !jsonObj.get("record_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `record_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("record_id").toString()));
      }
      if (jsonObj.get("transaction_id") != null && !jsonObj.get("transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserAlipaypointSendResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserAlipaypointSendResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserAlipaypointSendResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserAlipaypointSendResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserAlipaypointSendResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserAlipaypointSendResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserAlipaypointSendResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserAlipaypointSendResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserAlipaypointSendResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserAlipaypointSendResponseModel
  */
  public static AlipayUserAlipaypointSendResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserAlipaypointSendResponseModel.class);
  }

 /**
  * Convert an instance of AlipayUserAlipaypointSendResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

