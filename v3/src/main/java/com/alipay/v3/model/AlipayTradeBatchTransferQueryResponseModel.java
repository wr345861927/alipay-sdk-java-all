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
import com.alipay.v3.model.BatchRoyaltyDetail;
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
 * AlipayTradeBatchTransferQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeBatchTransferQueryResponseModel {
  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_ROYALTY_DETAIL = "royalty_detail";
  @SerializedName(SERIALIZED_NAME_ROYALTY_DETAIL)
  private List<BatchRoyaltyDetail> royaltyDetail = null;

  public static final String SERIALIZED_NAME_SETTLE_NO = "settle_no";
  @SerializedName(SERIALIZED_NAME_SETTLE_NO)
  private String settleNo;

  public AlipayTradeBatchTransferQueryResponseModel() { 
  }

  public AlipayTradeBatchTransferQueryResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 批量结算时传入的外部流水号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20008", value = "批量结算时传入的外部流水号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeBatchTransferQueryResponseModel royaltyDetail(List<BatchRoyaltyDetail> royaltyDetail) {
    
    this.royaltyDetail = royaltyDetail;
    return this;
  }

  public AlipayTradeBatchTransferQueryResponseModel addRoyaltyDetailItem(BatchRoyaltyDetail royaltyDetailItem) {
    if (this.royaltyDetail == null) {
      this.royaltyDetail = new ArrayList<>();
    }
    this.royaltyDetail.add(royaltyDetailItem);
    return this;
  }

   /**
   * 批量结算详情
   * @return royaltyDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "批量结算详情")

  public List<BatchRoyaltyDetail> getRoyaltyDetail() {
    return royaltyDetail;
  }


  public void setRoyaltyDetail(List<BatchRoyaltyDetail> royaltyDetail) {
    this.royaltyDetail = royaltyDetail;
  }


  public AlipayTradeBatchTransferQueryResponseModel settleNo(String settleNo) {
    
    this.settleNo = settleNo;
    return this;
  }

   /**
   * 结算单据号
   * @return settleNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019050510032002040000053220", value = "结算单据号")

  public String getSettleNo() {
    return settleNo;
  }


  public void setSettleNo(String settleNo) {
    this.settleNo = settleNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeBatchTransferQueryResponseModel alipayTradeBatchTransferQueryResponseModel = (AlipayTradeBatchTransferQueryResponseModel) o;
    return Objects.equals(this.outRequestNo, alipayTradeBatchTransferQueryResponseModel.outRequestNo) &&
        Objects.equals(this.royaltyDetail, alipayTradeBatchTransferQueryResponseModel.royaltyDetail) &&
        Objects.equals(this.settleNo, alipayTradeBatchTransferQueryResponseModel.settleNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outRequestNo, royaltyDetail, settleNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeBatchTransferQueryResponseModel {\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    royaltyDetail: ").append(toIndentedString(royaltyDetail)).append("\n");
    sb.append("    settleNo: ").append(toIndentedString(settleNo)).append("\n");
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
    openapiFields.add("out_request_no");
    openapiFields.add("royalty_detail");
    openapiFields.add("settle_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeBatchTransferQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeBatchTransferQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeBatchTransferQueryResponseModel is not found in the empty JSON string", AlipayTradeBatchTransferQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeBatchTransferQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeBatchTransferQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      JsonArray jsonArrayroyaltyDetail = jsonObj.getAsJsonArray("royalty_detail");
      if (jsonArrayroyaltyDetail != null) {
        // ensure the json data is an array
        if (!jsonObj.get("royalty_detail").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `royalty_detail` to be an array in the JSON string but got `%s`", jsonObj.get("royalty_detail").toString()));
        }

        // validate the optional field `royalty_detail` (array)
        for (int i = 0; i < jsonArrayroyaltyDetail.size(); i++) {
          BatchRoyaltyDetail.validateJsonObject(jsonArrayroyaltyDetail.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("settle_no") != null && !jsonObj.get("settle_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeBatchTransferQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeBatchTransferQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeBatchTransferQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeBatchTransferQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeBatchTransferQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeBatchTransferQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeBatchTransferQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeBatchTransferQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeBatchTransferQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeBatchTransferQueryResponseModel
  */
  public static AlipayTradeBatchTransferQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeBatchTransferQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeBatchTransferQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

