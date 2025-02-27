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
 * ZhimaCreditPayafteruseCreditagreementTransferResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPayafteruseCreditagreementTransferResponseModel {
  public static final String SERIALIZED_NAME_CREDIT_AGREEMENT_ID = "credit_agreement_id";
  @SerializedName(SERIALIZED_NAME_CREDIT_AGREEMENT_ID)
  private String creditAgreementId;

  public static final String SERIALIZED_NAME_OUT_AGREEMENT_NO = "out_agreement_no";
  @SerializedName(SERIALIZED_NAME_OUT_AGREEMENT_NO)
  private String outAgreementNo;

  public ZhimaCreditPayafteruseCreditagreementTransferResponseModel() { 
  }

  public ZhimaCreditPayafteruseCreditagreementTransferResponseModel creditAgreementId(String creditAgreementId) {
    
    this.creditAgreementId = creditAgreementId;
    return this;
  }

   /**
   * 芝麻开通协议号
   * @return creditAgreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMOP99202011240100520025162811", value = "芝麻开通协议号")

  public String getCreditAgreementId() {
    return creditAgreementId;
  }


  public void setCreditAgreementId(String creditAgreementId) {
    this.creditAgreementId = creditAgreementId;
  }


  public ZhimaCreditPayafteruseCreditagreementTransferResponseModel outAgreementNo(String outAgreementNo) {
    
    this.outAgreementNo = outAgreementNo;
    return this;
  }

   /**
   * 商户外部协议号
   * @return outAgreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014070700166653", value = "商户外部协议号")

  public String getOutAgreementNo() {
    return outAgreementNo;
  }


  public void setOutAgreementNo(String outAgreementNo) {
    this.outAgreementNo = outAgreementNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCreditPayafteruseCreditagreementTransferResponseModel zhimaCreditPayafteruseCreditagreementTransferResponseModel = (ZhimaCreditPayafteruseCreditagreementTransferResponseModel) o;
    return Objects.equals(this.creditAgreementId, zhimaCreditPayafteruseCreditagreementTransferResponseModel.creditAgreementId) &&
        Objects.equals(this.outAgreementNo, zhimaCreditPayafteruseCreditagreementTransferResponseModel.outAgreementNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAgreementId, outAgreementNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPayafteruseCreditagreementTransferResponseModel {\n");
    sb.append("    creditAgreementId: ").append(toIndentedString(creditAgreementId)).append("\n");
    sb.append("    outAgreementNo: ").append(toIndentedString(outAgreementNo)).append("\n");
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
    openapiFields.add("credit_agreement_id");
    openapiFields.add("out_agreement_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPayafteruseCreditagreementTransferResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPayafteruseCreditagreementTransferResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPayafteruseCreditagreementTransferResponseModel is not found in the empty JSON string", ZhimaCreditPayafteruseCreditagreementTransferResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCreditPayafteruseCreditagreementTransferResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCreditPayafteruseCreditagreementTransferResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("credit_agreement_id") != null && !jsonObj.get("credit_agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_agreement_id").toString()));
      }
      if (jsonObj.get("out_agreement_no") != null && !jsonObj.get("out_agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_agreement_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPayafteruseCreditagreementTransferResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPayafteruseCreditagreementTransferResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPayafteruseCreditagreementTransferResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPayafteruseCreditagreementTransferResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPayafteruseCreditagreementTransferResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPayafteruseCreditagreementTransferResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCreditPayafteruseCreditagreementTransferResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCreditPayafteruseCreditagreementTransferResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPayafteruseCreditagreementTransferResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPayafteruseCreditagreementTransferResponseModel
  */
  public static ZhimaCreditPayafteruseCreditagreementTransferResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPayafteruseCreditagreementTransferResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPayafteruseCreditagreementTransferResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

