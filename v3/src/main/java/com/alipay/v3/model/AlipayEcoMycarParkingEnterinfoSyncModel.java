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
 * AlipayEcoMycarParkingEnterinfoSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingEnterinfoSyncModel {
  public static final String SERIALIZED_NAME_AGREEMENT_QUERY = "agreement_query";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_QUERY)
  private Boolean agreementQuery;

  public static final String SERIALIZED_NAME_CAR_COLOR = "car_color";
  @SerializedName(SERIALIZED_NAME_CAR_COLOR)
  private String carColor;

  public static final String SERIALIZED_NAME_CAR_NUMBER = "car_number";
  @SerializedName(SERIALIZED_NAME_CAR_NUMBER)
  private String carNumber;

  public static final String SERIALIZED_NAME_ENTRANCE_ID = "entrance_id";
  @SerializedName(SERIALIZED_NAME_ENTRANCE_ID)
  private String entranceId;

  public static final String SERIALIZED_NAME_FREE_MINUTES = "free_minutes";
  @SerializedName(SERIALIZED_NAME_FREE_MINUTES)
  private Integer freeMinutes;

  public static final String SERIALIZED_NAME_IN_TIME = "in_time";
  @SerializedName(SERIALIZED_NAME_IN_TIME)
  private String inTime;

  public static final String SERIALIZED_NAME_IS_ENCRYPT_CAR_NUMBER = "is_encrypt_car_number";
  @SerializedName(SERIALIZED_NAME_IS_ENCRYPT_CAR_NUMBER)
  private Boolean isEncryptCarNumber;

  public static final String SERIALIZED_NAME_ISV_URL = "isv_url";
  @SerializedName(SERIALIZED_NAME_ISV_URL)
  private String isvUrl;

  public static final String SERIALIZED_NAME_OUT_SERIAL_NO = "out_serial_no";
  @SerializedName(SERIALIZED_NAME_OUT_SERIAL_NO)
  private String outSerialNo;

  public static final String SERIALIZED_NAME_PARKING_ID = "parking_id";
  @SerializedName(SERIALIZED_NAME_PARKING_ID)
  private String parkingId;

  public static final String SERIALIZED_NAME_SPACE_NUMBER = "space_number";
  @SerializedName(SERIALIZED_NAME_SPACE_NUMBER)
  private String spaceNumber;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public AlipayEcoMycarParkingEnterinfoSyncModel() { 
  }

  public AlipayEcoMycarParkingEnterinfoSyncModel agreementQuery(Boolean agreementQuery) {
    
    this.agreementQuery = agreementQuery;
    return this;
  }

   /**
   * 是否启用车牌代扣状态查询功能，true为启用，false为停用
   * @return agreementQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否启用车牌代扣状态查询功能，true为启用，false为停用")

  public Boolean getAgreementQuery() {
    return agreementQuery;
  }


  public void setAgreementQuery(Boolean agreementQuery) {
    this.agreementQuery = agreementQuery;
  }


  public AlipayEcoMycarParkingEnterinfoSyncModel carColor(String carColor) {
    
    this.carColor = carColor;
    return this;
  }

   /**
   * 车牌颜色，车牌颜色，枚举支持： *BLUE：蓝。 *GREEN：绿。 *YELLOW：黄。 *WHITE：白。 *BLACK：黑。 *LIMEGREEN：黄绿色。
   * @return carColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BLUE", value = "车牌颜色，车牌颜色，枚举支持： *BLUE：蓝。 *GREEN：绿。 *YELLOW：黄。 *WHITE：白。 *BLACK：黑。 *LIMEGREEN：黄绿色。")

  public String getCarColor() {
    return carColor;
  }


  public void setCarColor(String carColor) {
    this.carColor = carColor;
  }


  public AlipayEcoMycarParkingEnterinfoSyncModel carNumber(String carNumber) {
    
    this.carNumber = carNumber;
    return this;
  }

   /**
   * 车牌号
   * @return carNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "豫C33333", value = "车牌号")

  public String getCarNumber() {
    return carNumber;
  }


  public void setCarNumber(String carNumber) {
    this.carNumber = carNumber;
  }


  public AlipayEcoMycarParkingEnterinfoSyncModel entranceId(String entranceId) {
    
    this.entranceId = entranceId;
    return this;
  }

   /**
   * 用于识别车辆进口，多出入口车场适用
   * @return entranceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SN001", value = "用于识别车辆进口，多出入口车场适用")

  public String getEntranceId() {
    return entranceId;
  }


  public void setEntranceId(String entranceId) {
    this.entranceId = entranceId;
  }


  public AlipayEcoMycarParkingEnterinfoSyncModel freeMinutes(Integer freeMinutes) {
    
    this.freeMinutes = freeMinutes;
    return this;
  }

   /**
   * 当前停车场的入场免费时长分钟数
   * @return freeMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "当前停车场的入场免费时长分钟数")

  public Integer getFreeMinutes() {
    return freeMinutes;
  }


  public void setFreeMinutes(Integer freeMinutes) {
    this.freeMinutes = freeMinutes;
  }


  public AlipayEcoMycarParkingEnterinfoSyncModel inTime(String inTime) {
    
    this.inTime = inTime;
    return this;
  }

   /**
   * 车辆入场的时间，格式\&quot;YYYY-MM-DD HH:mm:ss\&quot;，24小时制，请保证服务器时间准确，入场时间不应晚于当前网络时间
   * @return inTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-07-24 03:07:50", value = "车辆入场的时间，格式\"YYYY-MM-DD HH:mm:ss\"，24小时制，请保证服务器时间准确，入场时间不应晚于当前网络时间")

  public String getInTime() {
    return inTime;
  }


  public void setInTime(String inTime) {
    this.inTime = inTime;
  }


  public AlipayEcoMycarParkingEnterinfoSyncModel isEncryptCarNumber(Boolean isEncryptCarNumber) {
    
    this.isEncryptCarNumber = isEncryptCarNumber;
    return this;
  }

   /**
   * 是否加密，默认为false
   * @return isEncryptCarNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否加密，默认为false")

  public Boolean getIsEncryptCarNumber() {
    return isEncryptCarNumber;
  }


  public void setIsEncryptCarNumber(Boolean isEncryptCarNumber) {
    this.isEncryptCarNumber = isEncryptCarNumber;
  }


  public AlipayEcoMycarParkingEnterinfoSyncModel isvUrl(String isvUrl) {
    
    this.isvUrl = isvUrl;
    return this;
  }

   /**
   * 智能助理当前的跳转链接。为ISV/商家小程序或H5页面地址。
   * @return isvUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://xxxxx", value = "智能助理当前的跳转链接。为ISV/商家小程序或H5页面地址。")

  public String getIsvUrl() {
    return isvUrl;
  }


  public void setIsvUrl(String isvUrl) {
    this.isvUrl = isvUrl;
  }


  public AlipayEcoMycarParkingEnterinfoSyncModel outSerialNo(String outSerialNo) {
    
    this.outSerialNo = outSerialNo;
    return this;
  }

   /**
   * 外部停车流水号(用于串通进场与出场信息)
   * @return outSerialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090711003017233600000001", value = "外部停车流水号(用于串通进场与出场信息)")

  public String getOutSerialNo() {
    return outSerialNo;
  }


  public void setOutSerialNo(String outSerialNo) {
    this.outSerialNo = outSerialNo;
  }


  public AlipayEcoMycarParkingEnterinfoSyncModel parkingId(String parkingId) {
    
    this.parkingId = parkingId;
    return this;
  }

   /**
   * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口获取。
   * @return parkingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015042321001004720200028594", value = "支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 <a href=\"https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口获取。")

  public String getParkingId() {
    return parkingId;
  }


  public void setParkingId(String parkingId) {
    this.parkingId = parkingId;
  }


  public AlipayEcoMycarParkingEnterinfoSyncModel spaceNumber(String spaceNumber) {
    
    this.spaceNumber = spaceNumber;
    return this;
  }

   /**
   * 用于标识车辆停放车位编号，路侧适用
   * @return spaceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PK001", value = "用于标识车辆停放车位编号，路侧适用")

  public String getSpaceNumber() {
    return spaceNumber;
  }


  public void setSpaceNumber(String spaceNumber) {
    this.spaceNumber = spaceNumber;
  }


  public AlipayEcoMycarParkingEnterinfoSyncModel storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 与parking_id对应的外部停车场编号，在门店中维护
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "360xx", value = "与parking_id对应的外部停车场编号，在门店中维护")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoMycarParkingEnterinfoSyncModel alipayEcoMycarParkingEnterinfoSyncModel = (AlipayEcoMycarParkingEnterinfoSyncModel) o;
    return Objects.equals(this.agreementQuery, alipayEcoMycarParkingEnterinfoSyncModel.agreementQuery) &&
        Objects.equals(this.carColor, alipayEcoMycarParkingEnterinfoSyncModel.carColor) &&
        Objects.equals(this.carNumber, alipayEcoMycarParkingEnterinfoSyncModel.carNumber) &&
        Objects.equals(this.entranceId, alipayEcoMycarParkingEnterinfoSyncModel.entranceId) &&
        Objects.equals(this.freeMinutes, alipayEcoMycarParkingEnterinfoSyncModel.freeMinutes) &&
        Objects.equals(this.inTime, alipayEcoMycarParkingEnterinfoSyncModel.inTime) &&
        Objects.equals(this.isEncryptCarNumber, alipayEcoMycarParkingEnterinfoSyncModel.isEncryptCarNumber) &&
        Objects.equals(this.isvUrl, alipayEcoMycarParkingEnterinfoSyncModel.isvUrl) &&
        Objects.equals(this.outSerialNo, alipayEcoMycarParkingEnterinfoSyncModel.outSerialNo) &&
        Objects.equals(this.parkingId, alipayEcoMycarParkingEnterinfoSyncModel.parkingId) &&
        Objects.equals(this.spaceNumber, alipayEcoMycarParkingEnterinfoSyncModel.spaceNumber) &&
        Objects.equals(this.storeId, alipayEcoMycarParkingEnterinfoSyncModel.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementQuery, carColor, carNumber, entranceId, freeMinutes, inTime, isEncryptCarNumber, isvUrl, outSerialNo, parkingId, spaceNumber, storeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingEnterinfoSyncModel {\n");
    sb.append("    agreementQuery: ").append(toIndentedString(agreementQuery)).append("\n");
    sb.append("    carColor: ").append(toIndentedString(carColor)).append("\n");
    sb.append("    carNumber: ").append(toIndentedString(carNumber)).append("\n");
    sb.append("    entranceId: ").append(toIndentedString(entranceId)).append("\n");
    sb.append("    freeMinutes: ").append(toIndentedString(freeMinutes)).append("\n");
    sb.append("    inTime: ").append(toIndentedString(inTime)).append("\n");
    sb.append("    isEncryptCarNumber: ").append(toIndentedString(isEncryptCarNumber)).append("\n");
    sb.append("    isvUrl: ").append(toIndentedString(isvUrl)).append("\n");
    sb.append("    outSerialNo: ").append(toIndentedString(outSerialNo)).append("\n");
    sb.append("    parkingId: ").append(toIndentedString(parkingId)).append("\n");
    sb.append("    spaceNumber: ").append(toIndentedString(spaceNumber)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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
    openapiFields.add("agreement_query");
    openapiFields.add("car_color");
    openapiFields.add("car_number");
    openapiFields.add("entrance_id");
    openapiFields.add("free_minutes");
    openapiFields.add("in_time");
    openapiFields.add("is_encrypt_car_number");
    openapiFields.add("isv_url");
    openapiFields.add("out_serial_no");
    openapiFields.add("parking_id");
    openapiFields.add("space_number");
    openapiFields.add("store_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingEnterinfoSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingEnterinfoSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingEnterinfoSyncModel is not found in the empty JSON string", AlipayEcoMycarParkingEnterinfoSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoMycarParkingEnterinfoSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoMycarParkingEnterinfoSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("car_color") != null && !jsonObj.get("car_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `car_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("car_color").toString()));
      }
      if (jsonObj.get("car_number") != null && !jsonObj.get("car_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `car_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("car_number").toString()));
      }
      if (jsonObj.get("entrance_id") != null && !jsonObj.get("entrance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entrance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entrance_id").toString()));
      }
      if (jsonObj.get("in_time") != null && !jsonObj.get("in_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in_time").toString()));
      }
      if (jsonObj.get("isv_url") != null && !jsonObj.get("isv_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_url").toString()));
      }
      if (jsonObj.get("out_serial_no") != null && !jsonObj.get("out_serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_serial_no").toString()));
      }
      if (jsonObj.get("parking_id") != null && !jsonObj.get("parking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_id").toString()));
      }
      if (jsonObj.get("space_number") != null && !jsonObj.get("space_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `space_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("space_number").toString()));
      }
      if (jsonObj.get("store_id") != null && !jsonObj.get("store_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingEnterinfoSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingEnterinfoSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingEnterinfoSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingEnterinfoSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingEnterinfoSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingEnterinfoSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoMycarParkingEnterinfoSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoMycarParkingEnterinfoSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingEnterinfoSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingEnterinfoSyncModel
  */
  public static AlipayEcoMycarParkingEnterinfoSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingEnterinfoSyncModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingEnterinfoSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

