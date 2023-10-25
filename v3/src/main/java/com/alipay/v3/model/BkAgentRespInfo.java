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
 * BkAgentRespInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BkAgentRespInfo {
  public static final String SERIALIZED_NAME_BINDCLRISSR_ID = "bindclrissr_id";
  @SerializedName(SERIALIZED_NAME_BINDCLRISSR_ID)
  private String bindclrissrId;

  public static final String SERIALIZED_NAME_BINDPYERACCTBK_ID = "bindpyeracctbk_id";
  @SerializedName(SERIALIZED_NAME_BINDPYERACCTBK_ID)
  private String bindpyeracctbkId;

  public static final String SERIALIZED_NAME_BINDTRX_ID = "bindtrx_id";
  @SerializedName(SERIALIZED_NAME_BINDTRX_ID)
  private String bindtrxId;

  public static final String SERIALIZED_NAME_BKPYERUSER_CODE = "bkpyeruser_code";
  @SerializedName(SERIALIZED_NAME_BKPYERUSER_CODE)
  private String bkpyeruserCode;

  public static final String SERIALIZED_NAME_ESTTER_LOCATION = "estter_location";
  @SerializedName(SERIALIZED_NAME_ESTTER_LOCATION)
  private String estterLocation;

  public BkAgentRespInfo() { 
  }

  public BkAgentRespInfo bindclrissrId(String bindclrissrId) {
    
    this.bindclrissrId = bindclrissrId;
    return this;
  }

   /**
   * 枚举值，01 银联；02 网联；03 连通等
   * @return bindclrissrId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "枚举值，01 银联；02 网联；03 连通等")

  public String getBindclrissrId() {
    return bindclrissrId;
  }


  public void setBindclrissrId(String bindclrissrId) {
    this.bindclrissrId = bindclrissrId;
  }


  public BkAgentRespInfo bindpyeracctbkId(String bindpyeracctbkId) {
    
    this.bindpyeracctbkId = bindpyeracctbkId;
    return this;
  }

   /**
   * 付款机构在清算组织登记或分配的机构代码
   * @return bindpyeracctbkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "付款机构在清算组织登记或分配的机构代码")

  public String getBindpyeracctbkId() {
    return bindpyeracctbkId;
  }


  public void setBindpyeracctbkId(String bindpyeracctbkId) {
    this.bindpyeracctbkId = bindpyeracctbkId;
  }


  public BkAgentRespInfo bindtrxId(String bindtrxId) {
    
    this.bindtrxId = bindtrxId;
    return this;
  }

   /**
   * 原快捷交易流水号
   * @return bindtrxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "原快捷交易流水号")

  public String getBindtrxId() {
    return bindtrxId;
  }


  public void setBindtrxId(String bindtrxId) {
    this.bindtrxId = bindtrxId;
  }


  public BkAgentRespInfo bkpyeruserCode(String bkpyeruserCode) {
    
    this.bkpyeruserCode = bkpyeruserCode;
    return this;
  }

   /**
   * 用户在银行付款账号的标记化处理编号
   * @return bkpyeruserCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户在银行付款账号的标记化处理编号")

  public String getBkpyeruserCode() {
    return bkpyeruserCode;
  }


  public void setBkpyeruserCode(String bkpyeruserCode) {
    this.bkpyeruserCode = bkpyeruserCode;
  }


  public BkAgentRespInfo estterLocation(String estterLocation) {
    
    this.estterLocation = estterLocation;
    return this;
  }

   /**
   * 设备推测位置
   * @return estterLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设备推测位置")

  public String getEstterLocation() {
    return estterLocation;
  }


  public void setEstterLocation(String estterLocation) {
    this.estterLocation = estterLocation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BkAgentRespInfo bkAgentRespInfo = (BkAgentRespInfo) o;
    return Objects.equals(this.bindclrissrId, bkAgentRespInfo.bindclrissrId) &&
        Objects.equals(this.bindpyeracctbkId, bkAgentRespInfo.bindpyeracctbkId) &&
        Objects.equals(this.bindtrxId, bkAgentRespInfo.bindtrxId) &&
        Objects.equals(this.bkpyeruserCode, bkAgentRespInfo.bkpyeruserCode) &&
        Objects.equals(this.estterLocation, bkAgentRespInfo.estterLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindclrissrId, bindpyeracctbkId, bindtrxId, bkpyeruserCode, estterLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BkAgentRespInfo {\n");
    sb.append("    bindclrissrId: ").append(toIndentedString(bindclrissrId)).append("\n");
    sb.append("    bindpyeracctbkId: ").append(toIndentedString(bindpyeracctbkId)).append("\n");
    sb.append("    bindtrxId: ").append(toIndentedString(bindtrxId)).append("\n");
    sb.append("    bkpyeruserCode: ").append(toIndentedString(bkpyeruserCode)).append("\n");
    sb.append("    estterLocation: ").append(toIndentedString(estterLocation)).append("\n");
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
    openapiFields.add("bindclrissr_id");
    openapiFields.add("bindpyeracctbk_id");
    openapiFields.add("bindtrx_id");
    openapiFields.add("bkpyeruser_code");
    openapiFields.add("estter_location");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BkAgentRespInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BkAgentRespInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BkAgentRespInfo is not found in the empty JSON string", BkAgentRespInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BkAgentRespInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BkAgentRespInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bindclrissr_id") != null && !jsonObj.get("bindclrissr_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bindclrissr_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bindclrissr_id").toString()));
      }
      if (jsonObj.get("bindpyeracctbk_id") != null && !jsonObj.get("bindpyeracctbk_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bindpyeracctbk_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bindpyeracctbk_id").toString()));
      }
      if (jsonObj.get("bindtrx_id") != null && !jsonObj.get("bindtrx_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bindtrx_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bindtrx_id").toString()));
      }
      if (jsonObj.get("bkpyeruser_code") != null && !jsonObj.get("bkpyeruser_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bkpyeruser_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bkpyeruser_code").toString()));
      }
      if (jsonObj.get("estter_location") != null && !jsonObj.get("estter_location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `estter_location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("estter_location").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BkAgentRespInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BkAgentRespInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BkAgentRespInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BkAgentRespInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BkAgentRespInfo>() {
           @Override
           public void write(JsonWriter out, BkAgentRespInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BkAgentRespInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BkAgentRespInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BkAgentRespInfo
  * @throws IOException if the JSON string is invalid with respect to BkAgentRespInfo
  */
  public static BkAgentRespInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BkAgentRespInfo.class);
  }

 /**
  * Convert an instance of BkAgentRespInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

