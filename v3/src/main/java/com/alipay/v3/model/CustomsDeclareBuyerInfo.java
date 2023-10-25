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
 * CustomsDeclareBuyerInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomsDeclareBuyerInfo {
  public static final String SERIALIZED_NAME_BUYER_CERT_NO = "buyer_cert_no";
  @SerializedName(SERIALIZED_NAME_BUYER_CERT_NO)
  private String buyerCertNo;

  public static final String SERIALIZED_NAME_BUYER_NAME = "buyer_name";
  @SerializedName(SERIALIZED_NAME_BUYER_NAME)
  private String buyerName;

  public CustomsDeclareBuyerInfo() { 
  }

  public CustomsDeclareBuyerInfo buyerCertNo(String buyerCertNo) {
    
    this.buyerCertNo = buyerCertNo;
    return this;
  }

   /**
   * 订购人身份证号。即订购人留在商户处的身份证信息
   * @return buyerCertNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "230227198707201827", value = "订购人身份证号。即订购人留在商户处的身份证信息")

  public String getBuyerCertNo() {
    return buyerCertNo;
  }


  public void setBuyerCertNo(String buyerCertNo) {
    this.buyerCertNo = buyerCertNo;
  }


  public CustomsDeclareBuyerInfo buyerName(String buyerName) {
    
    this.buyerName = buyerName;
    return this;
  }

   /**
   * 订购人姓名。即订购人留在商户处的姓名信息
   * @return buyerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "王一", value = "订购人姓名。即订购人留在商户处的姓名信息")

  public String getBuyerName() {
    return buyerName;
  }


  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomsDeclareBuyerInfo customsDeclareBuyerInfo = (CustomsDeclareBuyerInfo) o;
    return Objects.equals(this.buyerCertNo, customsDeclareBuyerInfo.buyerCertNo) &&
        Objects.equals(this.buyerName, customsDeclareBuyerInfo.buyerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerCertNo, buyerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomsDeclareBuyerInfo {\n");
    sb.append("    buyerCertNo: ").append(toIndentedString(buyerCertNo)).append("\n");
    sb.append("    buyerName: ").append(toIndentedString(buyerName)).append("\n");
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
    openapiFields.add("buyer_cert_no");
    openapiFields.add("buyer_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomsDeclareBuyerInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomsDeclareBuyerInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomsDeclareBuyerInfo is not found in the empty JSON string", CustomsDeclareBuyerInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomsDeclareBuyerInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomsDeclareBuyerInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("buyer_cert_no") != null && !jsonObj.get("buyer_cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_cert_no").toString()));
      }
      if (jsonObj.get("buyer_name") != null && !jsonObj.get("buyer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomsDeclareBuyerInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomsDeclareBuyerInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomsDeclareBuyerInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomsDeclareBuyerInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomsDeclareBuyerInfo>() {
           @Override
           public void write(JsonWriter out, CustomsDeclareBuyerInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomsDeclareBuyerInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomsDeclareBuyerInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomsDeclareBuyerInfo
  * @throws IOException if the JSON string is invalid with respect to CustomsDeclareBuyerInfo
  */
  public static CustomsDeclareBuyerInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomsDeclareBuyerInfo.class);
  }

 /**
  * Convert an instance of CustomsDeclareBuyerInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

