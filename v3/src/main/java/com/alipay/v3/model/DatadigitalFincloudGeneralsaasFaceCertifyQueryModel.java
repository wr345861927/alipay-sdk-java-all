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
 * DatadigitalFincloudGeneralsaasFaceCertifyQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatadigitalFincloudGeneralsaasFaceCertifyQueryModel {
  public static final String SERIALIZED_NAME_CERTIFY_ID = "certify_id";
  @SerializedName(SERIALIZED_NAME_CERTIFY_ID)
  private String certifyId;

  public DatadigitalFincloudGeneralsaasFaceCertifyQueryModel() { 
  }

  public DatadigitalFincloudGeneralsaasFaceCertifyQueryModel certifyId(String certifyId) {
    
    this.certifyId = certifyId;
    return this;
  }

   /**
   * 本次申请操作的唯一标识，通过initialize(身份认证初始化服务)接口同步响应获取。
   * @return certifyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OC201809253000000393900404029253", value = "本次申请操作的唯一标识，通过initialize(身份认证初始化服务)接口同步响应获取。")

  public String getCertifyId() {
    return certifyId;
  }


  public void setCertifyId(String certifyId) {
    this.certifyId = certifyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatadigitalFincloudGeneralsaasFaceCertifyQueryModel datadigitalFincloudGeneralsaasFaceCertifyQueryModel = (DatadigitalFincloudGeneralsaasFaceCertifyQueryModel) o;
    return Objects.equals(this.certifyId, datadigitalFincloudGeneralsaasFaceCertifyQueryModel.certifyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certifyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadigitalFincloudGeneralsaasFaceCertifyQueryModel {\n");
    sb.append("    certifyId: ").append(toIndentedString(certifyId)).append("\n");
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
    openapiFields.add("certify_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatadigitalFincloudGeneralsaasFaceCertifyQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DatadigitalFincloudGeneralsaasFaceCertifyQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadigitalFincloudGeneralsaasFaceCertifyQueryModel is not found in the empty JSON string", DatadigitalFincloudGeneralsaasFaceCertifyQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DatadigitalFincloudGeneralsaasFaceCertifyQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatadigitalFincloudGeneralsaasFaceCertifyQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("certify_id") != null && !jsonObj.get("certify_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certify_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certify_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatadigitalFincloudGeneralsaasFaceCertifyQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadigitalFincloudGeneralsaasFaceCertifyQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadigitalFincloudGeneralsaasFaceCertifyQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadigitalFincloudGeneralsaasFaceCertifyQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadigitalFincloudGeneralsaasFaceCertifyQueryModel>() {
           @Override
           public void write(JsonWriter out, DatadigitalFincloudGeneralsaasFaceCertifyQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatadigitalFincloudGeneralsaasFaceCertifyQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatadigitalFincloudGeneralsaasFaceCertifyQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatadigitalFincloudGeneralsaasFaceCertifyQueryModel
  * @throws IOException if the JSON string is invalid with respect to DatadigitalFincloudGeneralsaasFaceCertifyQueryModel
  */
  public static DatadigitalFincloudGeneralsaasFaceCertifyQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadigitalFincloudGeneralsaasFaceCertifyQueryModel.class);
  }

 /**
  * Convert an instance of DatadigitalFincloudGeneralsaasFaceCertifyQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

