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
 * AlipayEcoEduKtSchoolinfoModifyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoEduKtSchoolinfoModifyResponseModel {
  public static final String SERIALIZED_NAME_SCHOOL_NO = "school_no";
  @SerializedName(SERIALIZED_NAME_SCHOOL_NO)
  private String schoolNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayEcoEduKtSchoolinfoModifyResponseModel() { 
  }

  public AlipayEcoEduKtSchoolinfoModifyResponseModel schoolNo(String schoolNo) {
    
    this.schoolNo = schoolNo;
    return this;
  }

   /**
   * 支付宝分配给学校的编码，作为学校在支付宝的标识
   * @return schoolNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11010100000002", value = "支付宝分配给学校的编码，作为学校在支付宝的标识")

  public String getSchoolNo() {
    return schoolNo;
  }


  public void setSchoolNo(String schoolNo) {
    this.schoolNo = schoolNo;
  }


  public AlipayEcoEduKtSchoolinfoModifyResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Y：代表成功；N：代表失败
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "Y：代表成功；N：代表失败")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoEduKtSchoolinfoModifyResponseModel alipayEcoEduKtSchoolinfoModifyResponseModel = (AlipayEcoEduKtSchoolinfoModifyResponseModel) o;
    return Objects.equals(this.schoolNo, alipayEcoEduKtSchoolinfoModifyResponseModel.schoolNo) &&
        Objects.equals(this.status, alipayEcoEduKtSchoolinfoModifyResponseModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schoolNo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoEduKtSchoolinfoModifyResponseModel {\n");
    sb.append("    schoolNo: ").append(toIndentedString(schoolNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("school_no");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoEduKtSchoolinfoModifyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoEduKtSchoolinfoModifyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoEduKtSchoolinfoModifyResponseModel is not found in the empty JSON string", AlipayEcoEduKtSchoolinfoModifyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoEduKtSchoolinfoModifyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoEduKtSchoolinfoModifyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("school_no") != null && !jsonObj.get("school_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_no").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoEduKtSchoolinfoModifyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoEduKtSchoolinfoModifyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoEduKtSchoolinfoModifyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoEduKtSchoolinfoModifyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoEduKtSchoolinfoModifyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoEduKtSchoolinfoModifyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoEduKtSchoolinfoModifyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoEduKtSchoolinfoModifyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoEduKtSchoolinfoModifyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoEduKtSchoolinfoModifyResponseModel
  */
  public static AlipayEcoEduKtSchoolinfoModifyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoEduKtSchoolinfoModifyResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoEduKtSchoolinfoModifyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

