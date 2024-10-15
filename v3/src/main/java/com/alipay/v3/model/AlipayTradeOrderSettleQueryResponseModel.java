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
import com.alipay.v3.model.RoyaltyDetail;
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
 * AlipayTradeOrderSettleQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeOrderSettleQueryResponseModel {
  public static final String SERIALIZED_NAME_OPERATION_DT = "operation_dt";
  @SerializedName(SERIALIZED_NAME_OPERATION_DT)
  private String operationDt;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_ROYALTY_DETAIL_LIST = "royalty_detail_list";
  @SerializedName(SERIALIZED_NAME_ROYALTY_DETAIL_LIST)
  private List<RoyaltyDetail> royaltyDetailList = null;

  public AlipayTradeOrderSettleQueryResponseModel() { 
  }

  public AlipayTradeOrderSettleQueryResponseModel operationDt(String operationDt) {
    
    this.operationDt = operationDt;
    return this;
  }

   /**
   * 分账受理时间
   * @return operationDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-07-30 12:00:00", value = "分账受理时间")

  public String getOperationDt() {
    return operationDt;
  }


  public void setOperationDt(String operationDt) {
    this.operationDt = operationDt;
  }


  public AlipayTradeOrderSettleQueryResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户分账请求单号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20210727001", value = "商户分账请求单号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeOrderSettleQueryResponseModel royaltyDetailList(List<RoyaltyDetail> royaltyDetailList) {
    
    this.royaltyDetailList = royaltyDetailList;
    return this;
  }

  public AlipayTradeOrderSettleQueryResponseModel addRoyaltyDetailListItem(RoyaltyDetail royaltyDetailListItem) {
    if (this.royaltyDetailList == null) {
      this.royaltyDetailList = new ArrayList<>();
    }
    this.royaltyDetailList.add(royaltyDetailListItem);
    return this;
  }

   /**
   * 分账明细
   * @return royaltyDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账明细")

  public List<RoyaltyDetail> getRoyaltyDetailList() {
    return royaltyDetailList;
  }


  public void setRoyaltyDetailList(List<RoyaltyDetail> royaltyDetailList) {
    this.royaltyDetailList = royaltyDetailList;
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
   * @return the AlipayTradeOrderSettleQueryResponseModel instance itself
   */
  public AlipayTradeOrderSettleQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeOrderSettleQueryResponseModel alipayTradeOrderSettleQueryResponseModel = (AlipayTradeOrderSettleQueryResponseModel) o;
    return Objects.equals(this.operationDt, alipayTradeOrderSettleQueryResponseModel.operationDt) &&
        Objects.equals(this.outRequestNo, alipayTradeOrderSettleQueryResponseModel.outRequestNo) &&
        Objects.equals(this.royaltyDetailList, alipayTradeOrderSettleQueryResponseModel.royaltyDetailList)&&
        Objects.equals(this.additionalProperties, alipayTradeOrderSettleQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationDt, outRequestNo, royaltyDetailList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeOrderSettleQueryResponseModel {\n");
    sb.append("    operationDt: ").append(toIndentedString(operationDt)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    royaltyDetailList: ").append(toIndentedString(royaltyDetailList)).append("\n");
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
    openapiFields.add("operation_dt");
    openapiFields.add("out_request_no");
    openapiFields.add("royalty_detail_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeOrderSettleQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeOrderSettleQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeOrderSettleQueryResponseModel is not found in the empty JSON string", AlipayTradeOrderSettleQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("operation_dt") != null && !jsonObj.get("operation_dt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_dt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_dt").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      JsonArray jsonArrayroyaltyDetailList = jsonObj.getAsJsonArray("royalty_detail_list");
      if (jsonArrayroyaltyDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("royalty_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `royalty_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("royalty_detail_list").toString()));
        }

        // validate the optional field `royalty_detail_list` (array)
        for (int i = 0; i < jsonArrayroyaltyDetailList.size(); i++) {
          RoyaltyDetail.validateJsonObject(jsonArrayroyaltyDetailList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeOrderSettleQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeOrderSettleQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeOrderSettleQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeOrderSettleQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeOrderSettleQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeOrderSettleQueryResponseModel value) throws IOException {
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
           public AlipayTradeOrderSettleQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeOrderSettleQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeOrderSettleQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeOrderSettleQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeOrderSettleQueryResponseModel
  */
  public static AlipayTradeOrderSettleQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeOrderSettleQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeOrderSettleQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

