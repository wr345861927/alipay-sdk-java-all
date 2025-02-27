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
 * AlipayFundAuthOrderVoucherCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAuthOrderVoucherCreateResponseModel {
  public static final String SERIALIZED_NAME_CODE_TYPE = "code_type";
  @SerializedName(SERIALIZED_NAME_CODE_TYPE)
  private String codeType;

  public static final String SERIALIZED_NAME_CODE_URL = "code_url";
  @SerializedName(SERIALIZED_NAME_CODE_URL)
  private String codeUrl;

  public static final String SERIALIZED_NAME_CODE_VALUE = "code_value";
  @SerializedName(SERIALIZED_NAME_CODE_VALUE)
  private String codeValue;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public AlipayFundAuthOrderVoucherCreateResponseModel() { 
  }

  public AlipayFundAuthOrderVoucherCreateResponseModel codeType(String codeType) {
    
    this.codeType = codeType;
    return this;
  }

   /**
   * 码类型，分为  barCode：条形码 (一维码) 和 qrCode:二维码(qrCode) ；  目前发码只支持 qrCode
   * @return codeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "qrCode", value = "码类型，分为  barCode：条形码 (一维码) 和 qrCode:二维码(qrCode) ；  目前发码只支持 qrCode")

  public String getCodeType() {
    return codeType;
  }


  public void setCodeType(String codeType) {
    this.codeType = codeType;
  }


  public AlipayFundAuthOrderVoucherCreateResponseModel codeUrl(String codeUrl) {
    
    this.codeUrl = codeUrl;
    return this;
  }

   /**
   * 生成的带有支付宝logo的二维码地址，如：http://mobilecodec.alipay.com/show.htm?code&#x3D;aeparsv2dknkqf3018556a；商户端通过在末尾追加picSize来指定要显示的图片大小，如  显示1280大小的URL:http://mobilecodec.alipay.com/show.htm?code&#x3D;aeparsv2dknkqf3018556a&amp;picSize&#x3D;1280；目前支持的大小有：256, 227, 270, 344, 430, 512, 570, 860, 1280, 1546；
   * @return codeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://mobilecodec.alipay.com/show.htm?code=aeparsv2dknkqf3018556a", value = "生成的带有支付宝logo的二维码地址，如：http://mobilecodec.alipay.com/show.htm?code=aeparsv2dknkqf3018556a；商户端通过在末尾追加picSize来指定要显示的图片大小，如  显示1280大小的URL:http://mobilecodec.alipay.com/show.htm?code=aeparsv2dknkqf3018556a&picSize=1280；目前支持的大小有：256, 227, 270, 344, 430, 512, 570, 860, 1280, 1546；")

  public String getCodeUrl() {
    return codeUrl;
  }


  public void setCodeUrl(String codeUrl) {
    this.codeUrl = codeUrl;
  }


  public AlipayFundAuthOrderVoucherCreateResponseModel codeValue(String codeValue) {
    
    this.codeValue = codeValue;
    return this;
  }

   /**
   * 当前发码请求生成的二维码码串，商户端可以利用二维码生成工具根据该码串值生成对应的二维码
   * @return codeValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://qr.alipay.com/aax017928umnzqo0uswmzd3", value = "当前发码请求生成的二维码码串，商户端可以利用二维码生成工具根据该码串值生成对应的二维码")

  public String getCodeValue() {
    return codeValue;
  }


  public void setCodeValue(String codeValue) {
    this.codeValue = codeValue;
  }


  public AlipayFundAuthOrderVoucherCreateResponseModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 商户的授权资金订单号
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8077735255938023", value = "商户的授权资金订单号")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public AlipayFundAuthOrderVoucherCreateResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户本次资金操作的请求流水号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8077735255938032", value = "商户本次资金操作的请求流水号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundAuthOrderVoucherCreateResponseModel alipayFundAuthOrderVoucherCreateResponseModel = (AlipayFundAuthOrderVoucherCreateResponseModel) o;
    return Objects.equals(this.codeType, alipayFundAuthOrderVoucherCreateResponseModel.codeType) &&
        Objects.equals(this.codeUrl, alipayFundAuthOrderVoucherCreateResponseModel.codeUrl) &&
        Objects.equals(this.codeValue, alipayFundAuthOrderVoucherCreateResponseModel.codeValue) &&
        Objects.equals(this.outOrderNo, alipayFundAuthOrderVoucherCreateResponseModel.outOrderNo) &&
        Objects.equals(this.outRequestNo, alipayFundAuthOrderVoucherCreateResponseModel.outRequestNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeType, codeUrl, codeValue, outOrderNo, outRequestNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAuthOrderVoucherCreateResponseModel {\n");
    sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
    sb.append("    codeUrl: ").append(toIndentedString(codeUrl)).append("\n");
    sb.append("    codeValue: ").append(toIndentedString(codeValue)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
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
    openapiFields.add("code_type");
    openapiFields.add("code_url");
    openapiFields.add("code_value");
    openapiFields.add("out_order_no");
    openapiFields.add("out_request_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAuthOrderVoucherCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAuthOrderVoucherCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAuthOrderVoucherCreateResponseModel is not found in the empty JSON string", AlipayFundAuthOrderVoucherCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundAuthOrderVoucherCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundAuthOrderVoucherCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("code_type") != null && !jsonObj.get("code_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code_type").toString()));
      }
      if (jsonObj.get("code_url") != null && !jsonObj.get("code_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code_url").toString()));
      }
      if (jsonObj.get("code_value") != null && !jsonObj.get("code_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code_value").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAuthOrderVoucherCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAuthOrderVoucherCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAuthOrderVoucherCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAuthOrderVoucherCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAuthOrderVoucherCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAuthOrderVoucherCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundAuthOrderVoucherCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundAuthOrderVoucherCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAuthOrderVoucherCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAuthOrderVoucherCreateResponseModel
  */
  public static AlipayFundAuthOrderVoucherCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAuthOrderVoucherCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundAuthOrderVoucherCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

