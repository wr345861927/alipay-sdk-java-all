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
import com.alipay.v3.model.UserInvoiceInfoOpenApiResponse;
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
 * AlipayBossFncUserinvoiceinfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayBossFncUserinvoiceinfoQueryResponseModel {
  public static final String SERIALIZED_NAME_RESULT_SET = "result_set";
  @SerializedName(SERIALIZED_NAME_RESULT_SET)
  private UserInvoiceInfoOpenApiResponse resultSet;

  public AlipayBossFncUserinvoiceinfoQueryResponseModel() { 
  }

  public AlipayBossFncUserinvoiceinfoQueryResponseModel resultSet(UserInvoiceInfoOpenApiResponse resultSet) {
    
    this.resultSet = resultSet;
    return this;
  }

   /**
   * Get resultSet
   * @return resultSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserInvoiceInfoOpenApiResponse getResultSet() {
    return resultSet;
  }


  public void setResultSet(UserInvoiceInfoOpenApiResponse resultSet) {
    this.resultSet = resultSet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayBossFncUserinvoiceinfoQueryResponseModel alipayBossFncUserinvoiceinfoQueryResponseModel = (AlipayBossFncUserinvoiceinfoQueryResponseModel) o;
    return Objects.equals(this.resultSet, alipayBossFncUserinvoiceinfoQueryResponseModel.resultSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayBossFncUserinvoiceinfoQueryResponseModel {\n");
    sb.append("    resultSet: ").append(toIndentedString(resultSet)).append("\n");
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
    openapiFields.add("result_set");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayBossFncUserinvoiceinfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayBossFncUserinvoiceinfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayBossFncUserinvoiceinfoQueryResponseModel is not found in the empty JSON string", AlipayBossFncUserinvoiceinfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayBossFncUserinvoiceinfoQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayBossFncUserinvoiceinfoQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `result_set`
      if (jsonObj.getAsJsonObject("result_set") != null) {
        UserInvoiceInfoOpenApiResponse.validateJsonObject(jsonObj.getAsJsonObject("result_set"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayBossFncUserinvoiceinfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayBossFncUserinvoiceinfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayBossFncUserinvoiceinfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayBossFncUserinvoiceinfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayBossFncUserinvoiceinfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayBossFncUserinvoiceinfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayBossFncUserinvoiceinfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayBossFncUserinvoiceinfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayBossFncUserinvoiceinfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayBossFncUserinvoiceinfoQueryResponseModel
  */
  public static AlipayBossFncUserinvoiceinfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayBossFncUserinvoiceinfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayBossFncUserinvoiceinfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

