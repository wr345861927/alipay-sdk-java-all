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
 * AlipayEcoMycarParkingVehicleQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingVehicleQueryResponseModel {
  public static final String SERIALIZED_NAME_CAR_NUMBER = "car_number";
  @SerializedName(SERIALIZED_NAME_CAR_NUMBER)
  private String carNumber;

  public AlipayEcoMycarParkingVehicleQueryResponseModel() { 
  }

  public AlipayEcoMycarParkingVehicleQueryResponseModel carNumber(String carNumber) {
    
    this.carNumber = carNumber;
    return this;
  }

   /**
   * 车牌信息（utf-8编码）
   * @return carNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "川Axxxxxx", value = "车牌信息（utf-8编码）")

  public String getCarNumber() {
    return carNumber;
  }


  public void setCarNumber(String carNumber) {
    this.carNumber = carNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoMycarParkingVehicleQueryResponseModel alipayEcoMycarParkingVehicleQueryResponseModel = (AlipayEcoMycarParkingVehicleQueryResponseModel) o;
    return Objects.equals(this.carNumber, alipayEcoMycarParkingVehicleQueryResponseModel.carNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingVehicleQueryResponseModel {\n");
    sb.append("    carNumber: ").append(toIndentedString(carNumber)).append("\n");
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
    openapiFields.add("car_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingVehicleQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingVehicleQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingVehicleQueryResponseModel is not found in the empty JSON string", AlipayEcoMycarParkingVehicleQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoMycarParkingVehicleQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoMycarParkingVehicleQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("car_number") != null && !jsonObj.get("car_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `car_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("car_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingVehicleQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingVehicleQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingVehicleQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingVehicleQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingVehicleQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingVehicleQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoMycarParkingVehicleQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoMycarParkingVehicleQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingVehicleQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingVehicleQueryResponseModel
  */
  public static AlipayEcoMycarParkingVehicleQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingVehicleQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingVehicleQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

