/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
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
 * AliosOpenAutoInfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AliosOpenAutoInfoQueryResponseModel {
  public static final String SERIALIZED_NAME_ENGINE_NO = "engine_no";
  @SerializedName(SERIALIZED_NAME_ENGINE_NO)
  private String engineNo;

  public static final String SERIALIZED_NAME_LICENSE_NO = "license_no";
  @SerializedName(SERIALIZED_NAME_LICENSE_NO)
  private String licenseNo;

  public static final String SERIALIZED_NAME_USER_ACTIVATION_TIME = "user_activation_time";
  @SerializedName(SERIALIZED_NAME_USER_ACTIVATION_TIME)
  private String userActivationTime;

  public static final String SERIALIZED_NAME_VEHICLE_TYPE = "vehicle_type";
  @SerializedName(SERIALIZED_NAME_VEHICLE_TYPE)
  private String vehicleType;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private String vin;

  public AliosOpenAutoInfoQueryResponseModel() { 
  }

  public AliosOpenAutoInfoQueryResponseModel engineNo(String engineNo) {
    
    this.engineNo = engineNo;
    return this;
  }

   /**
   * 发动机号
   * @return engineNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "234534634523", value = "发动机号")

  public String getEngineNo() {
    return engineNo;
  }


  public void setEngineNo(String engineNo) {
    this.engineNo = engineNo;
  }


  public AliosOpenAutoInfoQueryResponseModel licenseNo(String licenseNo) {
    
    this.licenseNo = licenseNo;
    return this;
  }

   /**
   * 车牌号
   * @return licenseNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "京FW12A7", value = "车牌号")

  public String getLicenseNo() {
    return licenseNo;
  }


  public void setLicenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
  }


  public AliosOpenAutoInfoQueryResponseModel userActivationTime(String userActivationTime) {
    
    this.userActivationTime = userActivationTime;
    return this;
  }

   /**
   * 用户激活时间
   * @return userActivationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-29 15:53:11", value = "用户激活时间")

  public String getUserActivationTime() {
    return userActivationTime;
  }


  public void setUserActivationTime(String userActivationTime) {
    this.userActivationTime = userActivationTime;
  }


  public AliosOpenAutoInfoQueryResponseModel vehicleType(String vehicleType) {
    
    this.vehicleType = vehicleType;
    return this;
  }

   /**
   * 车辆类型
   * @return vehicleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02", value = "车辆类型")

  public String getVehicleType() {
    return vehicleType;
  }


  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }


  public AliosOpenAutoInfoQueryResponseModel vin(String vin) {
    
    this.vin = vin;
    return this;
  }

   /**
   * 车辆识别号码
   * @return vin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T1D234E567A890H", value = "车辆识别号码")

  public String getVin() {
    return vin;
  }


  public void setVin(String vin) {
    this.vin = vin;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AliosOpenAutoInfoQueryResponseModel instance itself
   */
  public AliosOpenAutoInfoQueryResponseModel putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AliosOpenAutoInfoQueryResponseModel aliosOpenAutoInfoQueryResponseModel = (AliosOpenAutoInfoQueryResponseModel) o;
    return Objects.equals(this.engineNo, aliosOpenAutoInfoQueryResponseModel.engineNo) &&
        Objects.equals(this.licenseNo, aliosOpenAutoInfoQueryResponseModel.licenseNo) &&
        Objects.equals(this.userActivationTime, aliosOpenAutoInfoQueryResponseModel.userActivationTime) &&
        Objects.equals(this.vehicleType, aliosOpenAutoInfoQueryResponseModel.vehicleType) &&
        Objects.equals(this.vin, aliosOpenAutoInfoQueryResponseModel.vin)&&
        Objects.equals(this.additionalProperties, aliosOpenAutoInfoQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineNo, licenseNo, userActivationTime, vehicleType, vin, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AliosOpenAutoInfoQueryResponseModel {\n");
    sb.append("    engineNo: ").append(toIndentedString(engineNo)).append("\n");
    sb.append("    licenseNo: ").append(toIndentedString(licenseNo)).append("\n");
    sb.append("    userActivationTime: ").append(toIndentedString(userActivationTime)).append("\n");
    sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("engine_no");
    openapiFields.add("license_no");
    openapiFields.add("user_activation_time");
    openapiFields.add("vehicle_type");
    openapiFields.add("vin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AliosOpenAutoInfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AliosOpenAutoInfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AliosOpenAutoInfoQueryResponseModel is not found in the empty JSON string", AliosOpenAutoInfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("engine_no") != null && !jsonObj.get("engine_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_no").toString()));
      }
      if (jsonObj.get("license_no") != null && !jsonObj.get("license_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_no").toString()));
      }
      if (jsonObj.get("user_activation_time") != null && !jsonObj.get("user_activation_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_activation_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_activation_time").toString()));
      }
      if (jsonObj.get("vehicle_type") != null && !jsonObj.get("vehicle_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vehicle_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vehicle_type").toString()));
      }
      if (jsonObj.get("vin") != null && !jsonObj.get("vin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AliosOpenAutoInfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AliosOpenAutoInfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AliosOpenAutoInfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AliosOpenAutoInfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AliosOpenAutoInfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AliosOpenAutoInfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AliosOpenAutoInfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AliosOpenAutoInfoQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AliosOpenAutoInfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AliosOpenAutoInfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AliosOpenAutoInfoQueryResponseModel
  */
  public static AliosOpenAutoInfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AliosOpenAutoInfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of AliosOpenAutoInfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

