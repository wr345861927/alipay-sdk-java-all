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
 * AlipayEcoMycarParkingOvertimecharginginfoSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingOvertimecharginginfoSyncModel {
  public static final String SERIALIZED_NAME_CAR_NUMBER = "car_number";
  @SerializedName(SERIALIZED_NAME_CAR_NUMBER)
  private String carNumber;

  public static final String SERIALIZED_NAME_ISV_URL = "isv_url";
  @SerializedName(SERIALIZED_NAME_ISV_URL)
  private String isvUrl;

  public static final String SERIALIZED_NAME_PARKING_ID = "parking_id";
  @SerializedName(SERIALIZED_NAME_PARKING_ID)
  private String parkingId;

  public static final String SERIALIZED_NAME_SERIAL_NO = "serial_no";
  @SerializedName(SERIALIZED_NAME_SERIAL_NO)
  private String serialNo;

  public AlipayEcoMycarParkingOvertimecharginginfoSyncModel() { 
  }

  public AlipayEcoMycarParkingOvertimecharginginfoSyncModel carNumber(String carNumber) {
    
    this.carNumber = carNumber;
    return this;
  }

   /**
   * 车牌号
   * @return carNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙Axxxxx", value = "车牌号")

  public String getCarNumber() {
    return carNumber;
  }


  public void setCarNumber(String carNumber) {
    this.carNumber = carNumber;
  }


  public AlipayEcoMycarParkingOvertimecharginginfoSyncModel isvUrl(String isvUrl) {
    
    this.isvUrl = isvUrl;
    return this;
  }

   /**
   * 智能助理当前的跳转链接
   * @return isvUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://xxxxx", value = "智能助理当前的跳转链接")

  public String getIsvUrl() {
    return isvUrl;
  }


  public void setIsvUrl(String isvUrl) {
    this.isvUrl = isvUrl;
  }


  public AlipayEcoMycarParkingOvertimecharginginfoSyncModel parkingId(String parkingId) {
    
    this.parkingId = parkingId;
    return this;
  }

   /**
   * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 alipay.eco.mycar.parking.parkinglotinfo.create(录入停车场信息)接口获取。
   * @return parkingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015042321001004720200028594", value = "支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 alipay.eco.mycar.parking.parkinglotinfo.create(录入停车场信息)接口获取。")

  public String getParkingId() {
    return parkingId;
  }


  public void setParkingId(String parkingId) {
    this.parkingId = parkingId;
  }


  public AlipayEcoMycarParkingOvertimecharginginfoSyncModel serialNo(String serialNo) {
    
    this.serialNo = serialNo;
    return this;
  }

   /**
   * 支付宝业务流水号，用于记录车辆从驶入到驶出的全流程
   * @return serialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090711003017233600000001", value = "支付宝业务流水号，用于记录车辆从驶入到驶出的全流程")

  public String getSerialNo() {
    return serialNo;
  }


  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoMycarParkingOvertimecharginginfoSyncModel alipayEcoMycarParkingOvertimecharginginfoSyncModel = (AlipayEcoMycarParkingOvertimecharginginfoSyncModel) o;
    return Objects.equals(this.carNumber, alipayEcoMycarParkingOvertimecharginginfoSyncModel.carNumber) &&
        Objects.equals(this.isvUrl, alipayEcoMycarParkingOvertimecharginginfoSyncModel.isvUrl) &&
        Objects.equals(this.parkingId, alipayEcoMycarParkingOvertimecharginginfoSyncModel.parkingId) &&
        Objects.equals(this.serialNo, alipayEcoMycarParkingOvertimecharginginfoSyncModel.serialNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carNumber, isvUrl, parkingId, serialNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingOvertimecharginginfoSyncModel {\n");
    sb.append("    carNumber: ").append(toIndentedString(carNumber)).append("\n");
    sb.append("    isvUrl: ").append(toIndentedString(isvUrl)).append("\n");
    sb.append("    parkingId: ").append(toIndentedString(parkingId)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
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
    openapiFields.add("isv_url");
    openapiFields.add("parking_id");
    openapiFields.add("serial_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingOvertimecharginginfoSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingOvertimecharginginfoSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingOvertimecharginginfoSyncModel is not found in the empty JSON string", AlipayEcoMycarParkingOvertimecharginginfoSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoMycarParkingOvertimecharginginfoSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoMycarParkingOvertimecharginginfoSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("car_number") != null && !jsonObj.get("car_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `car_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("car_number").toString()));
      }
      if (jsonObj.get("isv_url") != null && !jsonObj.get("isv_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_url").toString()));
      }
      if (jsonObj.get("parking_id") != null && !jsonObj.get("parking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_id").toString()));
      }
      if (jsonObj.get("serial_no") != null && !jsonObj.get("serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingOvertimecharginginfoSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingOvertimecharginginfoSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingOvertimecharginginfoSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingOvertimecharginginfoSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingOvertimecharginginfoSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingOvertimecharginginfoSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoMycarParkingOvertimecharginginfoSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoMycarParkingOvertimecharginginfoSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingOvertimecharginginfoSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingOvertimecharginginfoSyncModel
  */
  public static AlipayEcoMycarParkingOvertimecharginginfoSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingOvertimecharginginfoSyncModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingOvertimecharginginfoSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

