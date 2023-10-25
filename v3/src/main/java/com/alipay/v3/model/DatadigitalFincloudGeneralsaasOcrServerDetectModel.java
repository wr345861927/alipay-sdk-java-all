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
 * DatadigitalFincloudGeneralsaasOcrServerDetectModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatadigitalFincloudGeneralsaasOcrServerDetectModel {
  public static final String SERIALIZED_NAME_OCR_TYPE = "ocr_type";
  @SerializedName(SERIALIZED_NAME_OCR_TYPE)
  private String ocrType;

  public static final String SERIALIZED_NAME_OUTER_ORDER_NO = "outer_order_no";
  @SerializedName(SERIALIZED_NAME_OUTER_ORDER_NO)
  private String outerOrderNo;

  public DatadigitalFincloudGeneralsaasOcrServerDetectModel() { 
  }

  public DatadigitalFincloudGeneralsaasOcrServerDetectModel ocrType(String ocrType) {
    
    this.ocrType = ocrType;
    return this;
  }

   /**
   * 可识别OCR类型。如，ID_CARD_FRONT 大陆身份证正面；ID_CARD_BACK 大陆身份证反面等。具体支持的类型以接入文档为准。
   * @return ocrType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ID_CARD_FRONT", value = "可识别OCR类型。如，ID_CARD_FRONT 大陆身份证正面；ID_CARD_BACK 大陆身份证反面等。具体支持的类型以接入文档为准。")

  public String getOcrType() {
    return ocrType;
  }


  public void setOcrType(String ocrType) {
    this.ocrType = ocrType;
  }


  public DatadigitalFincloudGeneralsaasOcrServerDetectModel outerOrderNo(String outerOrderNo) {
    
    this.outerOrderNo = outerOrderNo;
    return this;
  }

   /**
   * 客户业务单据号，请保证幂等性。
   * @return outerOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dfdsdfsdf", value = "客户业务单据号，请保证幂等性。")

  public String getOuterOrderNo() {
    return outerOrderNo;
  }


  public void setOuterOrderNo(String outerOrderNo) {
    this.outerOrderNo = outerOrderNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatadigitalFincloudGeneralsaasOcrServerDetectModel datadigitalFincloudGeneralsaasOcrServerDetectModel = (DatadigitalFincloudGeneralsaasOcrServerDetectModel) o;
    return Objects.equals(this.ocrType, datadigitalFincloudGeneralsaasOcrServerDetectModel.ocrType) &&
        Objects.equals(this.outerOrderNo, datadigitalFincloudGeneralsaasOcrServerDetectModel.outerOrderNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ocrType, outerOrderNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadigitalFincloudGeneralsaasOcrServerDetectModel {\n");
    sb.append("    ocrType: ").append(toIndentedString(ocrType)).append("\n");
    sb.append("    outerOrderNo: ").append(toIndentedString(outerOrderNo)).append("\n");
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
    openapiFields.add("ocr_type");
    openapiFields.add("outer_order_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatadigitalFincloudGeneralsaasOcrServerDetectModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DatadigitalFincloudGeneralsaasOcrServerDetectModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadigitalFincloudGeneralsaasOcrServerDetectModel is not found in the empty JSON string", DatadigitalFincloudGeneralsaasOcrServerDetectModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DatadigitalFincloudGeneralsaasOcrServerDetectModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatadigitalFincloudGeneralsaasOcrServerDetectModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ocr_type") != null && !jsonObj.get("ocr_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ocr_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ocr_type").toString()));
      }
      if (jsonObj.get("outer_order_no") != null && !jsonObj.get("outer_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outer_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outer_order_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatadigitalFincloudGeneralsaasOcrServerDetectModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadigitalFincloudGeneralsaasOcrServerDetectModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadigitalFincloudGeneralsaasOcrServerDetectModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadigitalFincloudGeneralsaasOcrServerDetectModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadigitalFincloudGeneralsaasOcrServerDetectModel>() {
           @Override
           public void write(JsonWriter out, DatadigitalFincloudGeneralsaasOcrServerDetectModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatadigitalFincloudGeneralsaasOcrServerDetectModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatadigitalFincloudGeneralsaasOcrServerDetectModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatadigitalFincloudGeneralsaasOcrServerDetectModel
  * @throws IOException if the JSON string is invalid with respect to DatadigitalFincloudGeneralsaasOcrServerDetectModel
  */
  public static DatadigitalFincloudGeneralsaasOcrServerDetectModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadigitalFincloudGeneralsaasOcrServerDetectModel.class);
  }

 /**
  * Convert an instance of DatadigitalFincloudGeneralsaasOcrServerDetectModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

