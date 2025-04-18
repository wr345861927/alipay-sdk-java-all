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
 * ParkingLotChargingRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ParkingLotChargingRuleInfo {
  public static final String SERIALIZED_NAME_CHARGING_PERIOD = "charging_period";
  @SerializedName(SERIALIZED_NAME_CHARGING_PERIOD)
  private String chargingPeriod;

  public static final String SERIALIZED_NAME_CHARGING_STRATEGY = "charging_strategy";
  @SerializedName(SERIALIZED_NAME_CHARGING_STRATEGY)
  private String chargingStrategy;

  public static final String SERIALIZED_NAME_CHARGING_UNIT_FEE = "charging_unit_fee";
  @SerializedName(SERIALIZED_NAME_CHARGING_UNIT_FEE)
  private String chargingUnitFee;

  public static final String SERIALIZED_NAME_CHARGING_UNIT_MINUTES = "charging_unit_minutes";
  @SerializedName(SERIALIZED_NAME_CHARGING_UNIT_MINUTES)
  private String chargingUnitMinutes;

  public static final String SERIALIZED_NAME_ENABLE_ROLLOVER_CHARGE_PERIOD = "enable_rollover_charge_period";
  @SerializedName(SERIALIZED_NAME_ENABLE_ROLLOVER_CHARGE_PERIOD)
  private Boolean enableRolloverChargePeriod;

  public static final String SERIALIZED_NAME_FIRST_CHARGING_SPAN_MINUTES = "first_charging_span_minutes";
  @SerializedName(SERIALIZED_NAME_FIRST_CHARGING_SPAN_MINUTES)
  private String firstChargingSpanMinutes;

  public static final String SERIALIZED_NAME_FIRST_CHARGING_UNIT_FEE = "first_charging_unit_fee";
  @SerializedName(SERIALIZED_NAME_FIRST_CHARGING_UNIT_FEE)
  private String firstChargingUnitFee;

  public static final String SERIALIZED_NAME_FIRST_CHARGING_UNIT_MINUTES = "first_charging_unit_minutes";
  @SerializedName(SERIALIZED_NAME_FIRST_CHARGING_UNIT_MINUTES)
  private String firstChargingUnitMinutes;

  public static final String SERIALIZED_NAME_FREE_ENTER_MINUTES = "free_enter_minutes";
  @SerializedName(SERIALIZED_NAME_FREE_ENTER_MINUTES)
  private String freeEnterMinutes;

  public static final String SERIALIZED_NAME_FREE_EXIT_MINUTES = "free_exit_minutes";
  @SerializedName(SERIALIZED_NAME_FREE_EXIT_MINUTES)
  private String freeExitMinutes;

  public static final String SERIALIZED_NAME_MAX_FEE_PER_DAY = "max_fee_per_day";
  @SerializedName(SERIALIZED_NAME_MAX_FEE_PER_DAY)
  private String maxFeePerDay;

  public ParkingLotChargingRuleInfo() { 
  }

  public ParkingLotChargingRuleInfo chargingPeriod(String chargingPeriod) {
    
    this.chargingPeriod = chargingPeriod;
    return this;
  }

   /**
   * 停车收费时间段，输入24小时制的小时时间段格式:  开始时间-结束时间, 结束时间必须大于开始时间 时间取值范围：0到24
   * @return chargingPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "停车收费时间段，输入24小时制的小时时间段格式:  开始时间-结束时间, 结束时间必须大于开始时间 时间取值范围：0到24")

  public String getChargingPeriod() {
    return chargingPeriod;
  }


  public void setChargingPeriod(String chargingPeriod) {
    this.chargingPeriod = chargingPeriod;
  }


  public ParkingLotChargingRuleInfo chargingStrategy(String chargingStrategy) {
    
    this.chargingStrategy = chargingStrategy;
    return this;
  }

   /**
   * 计费策略； UP：向上取整 DOMN：向下取整
   * @return chargingStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "计费策略； UP：向上取整 DOMN：向下取整")

  public String getChargingStrategy() {
    return chargingStrategy;
  }


  public void setChargingStrategy(String chargingStrategy) {
    this.chargingStrategy = chargingStrategy;
  }


  public ParkingLotChargingRuleInfo chargingUnitFee(String chargingUnitFee) {
    
    this.chargingUnitFee = chargingUnitFee;
    return this;
  }

   /**
   * 跳费金额 单位元
   * @return chargingUnitFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "跳费金额 单位元")

  public String getChargingUnitFee() {
    return chargingUnitFee;
  }


  public void setChargingUnitFee(String chargingUnitFee) {
    this.chargingUnitFee = chargingUnitFee;
  }


  public ParkingLotChargingRuleInfo chargingUnitMinutes(String chargingUnitMinutes) {
    
    this.chargingUnitMinutes = chargingUnitMinutes;
    return this;
  }

   /**
   * 跳费间隔分钟数
   * @return chargingUnitMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "跳费间隔分钟数")

  public String getChargingUnitMinutes() {
    return chargingUnitMinutes;
  }


  public void setChargingUnitMinutes(String chargingUnitMinutes) {
    this.chargingUnitMinutes = chargingUnitMinutes;
  }


  public ParkingLotChargingRuleInfo enableRolloverChargePeriod(Boolean enableRolloverChargePeriod) {
    
    this.enableRolloverChargePeriod = enableRolloverChargePeriod;
    return this;
  }

   /**
   * 超时是否顺延到下个计费区间
   * @return enableRolloverChargePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "超时是否顺延到下个计费区间")

  public Boolean getEnableRolloverChargePeriod() {
    return enableRolloverChargePeriod;
  }


  public void setEnableRolloverChargePeriod(Boolean enableRolloverChargePeriod) {
    this.enableRolloverChargePeriod = enableRolloverChargePeriod;
  }


  public ParkingLotChargingRuleInfo firstChargingSpanMinutes(String firstChargingSpanMinutes) {
    
    this.firstChargingSpanMinutes = firstChargingSpanMinutes;
    return this;
  }

   /**
   * 首段计费周期分钟数
   * @return firstChargingSpanMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "首段计费周期分钟数")

  public String getFirstChargingSpanMinutes() {
    return firstChargingSpanMinutes;
  }


  public void setFirstChargingSpanMinutes(String firstChargingSpanMinutes) {
    this.firstChargingSpanMinutes = firstChargingSpanMinutes;
  }


  public ParkingLotChargingRuleInfo firstChargingUnitFee(String firstChargingUnitFee) {
    
    this.firstChargingUnitFee = firstChargingUnitFee;
    return this;
  }

   /**
   * 首段计费周期跳费金额 单位: 元
   * @return firstChargingUnitFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "首段计费周期跳费金额 单位: 元")

  public String getFirstChargingUnitFee() {
    return firstChargingUnitFee;
  }


  public void setFirstChargingUnitFee(String firstChargingUnitFee) {
    this.firstChargingUnitFee = firstChargingUnitFee;
  }


  public ParkingLotChargingRuleInfo firstChargingUnitMinutes(String firstChargingUnitMinutes) {
    
    this.firstChargingUnitMinutes = firstChargingUnitMinutes;
    return this;
  }

   /**
   * 首段计费周期跳费间隔 单位分钟
   * @return firstChargingUnitMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "首段计费周期跳费间隔 单位分钟")

  public String getFirstChargingUnitMinutes() {
    return firstChargingUnitMinutes;
  }


  public void setFirstChargingUnitMinutes(String firstChargingUnitMinutes) {
    this.firstChargingUnitMinutes = firstChargingUnitMinutes;
  }


  public ParkingLotChargingRuleInfo freeEnterMinutes(String freeEnterMinutes) {
    
    this.freeEnterMinutes = freeEnterMinutes;
    return this;
  }

   /**
   * 入场免费时间 单位:分钟
   * @return freeEnterMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "入场免费时间 单位:分钟")

  public String getFreeEnterMinutes() {
    return freeEnterMinutes;
  }


  public void setFreeEnterMinutes(String freeEnterMinutes) {
    this.freeEnterMinutes = freeEnterMinutes;
  }


  public ParkingLotChargingRuleInfo freeExitMinutes(String freeExitMinutes) {
    
    this.freeExitMinutes = freeExitMinutes;
    return this;
  }

   /**
   * 离场免费时间 单位:分钟
   * @return freeExitMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "离场免费时间 单位:分钟")

  public String getFreeExitMinutes() {
    return freeExitMinutes;
  }


  public void setFreeExitMinutes(String freeExitMinutes) {
    this.freeExitMinutes = freeExitMinutes;
  }


  public ParkingLotChargingRuleInfo maxFeePerDay(String maxFeePerDay) {
    
    this.maxFeePerDay = maxFeePerDay;
    return this;
  }

   /**
   * 日封顶金额 单位: 元
   * @return maxFeePerDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "日封顶金额 单位: 元")

  public String getMaxFeePerDay() {
    return maxFeePerDay;
  }


  public void setMaxFeePerDay(String maxFeePerDay) {
    this.maxFeePerDay = maxFeePerDay;
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
   * @return the ParkingLotChargingRuleInfo instance itself
   */
  public ParkingLotChargingRuleInfo putAdditionalProperty(String key, Object value) {
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
    ParkingLotChargingRuleInfo parkingLotChargingRuleInfo = (ParkingLotChargingRuleInfo) o;
    return Objects.equals(this.chargingPeriod, parkingLotChargingRuleInfo.chargingPeriod) &&
        Objects.equals(this.chargingStrategy, parkingLotChargingRuleInfo.chargingStrategy) &&
        Objects.equals(this.chargingUnitFee, parkingLotChargingRuleInfo.chargingUnitFee) &&
        Objects.equals(this.chargingUnitMinutes, parkingLotChargingRuleInfo.chargingUnitMinutes) &&
        Objects.equals(this.enableRolloverChargePeriod, parkingLotChargingRuleInfo.enableRolloverChargePeriod) &&
        Objects.equals(this.firstChargingSpanMinutes, parkingLotChargingRuleInfo.firstChargingSpanMinutes) &&
        Objects.equals(this.firstChargingUnitFee, parkingLotChargingRuleInfo.firstChargingUnitFee) &&
        Objects.equals(this.firstChargingUnitMinutes, parkingLotChargingRuleInfo.firstChargingUnitMinutes) &&
        Objects.equals(this.freeEnterMinutes, parkingLotChargingRuleInfo.freeEnterMinutes) &&
        Objects.equals(this.freeExitMinutes, parkingLotChargingRuleInfo.freeExitMinutes) &&
        Objects.equals(this.maxFeePerDay, parkingLotChargingRuleInfo.maxFeePerDay)&&
        Objects.equals(this.additionalProperties, parkingLotChargingRuleInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargingPeriod, chargingStrategy, chargingUnitFee, chargingUnitMinutes, enableRolloverChargePeriod, firstChargingSpanMinutes, firstChargingUnitFee, firstChargingUnitMinutes, freeEnterMinutes, freeExitMinutes, maxFeePerDay, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParkingLotChargingRuleInfo {\n");
    sb.append("    chargingPeriod: ").append(toIndentedString(chargingPeriod)).append("\n");
    sb.append("    chargingStrategy: ").append(toIndentedString(chargingStrategy)).append("\n");
    sb.append("    chargingUnitFee: ").append(toIndentedString(chargingUnitFee)).append("\n");
    sb.append("    chargingUnitMinutes: ").append(toIndentedString(chargingUnitMinutes)).append("\n");
    sb.append("    enableRolloverChargePeriod: ").append(toIndentedString(enableRolloverChargePeriod)).append("\n");
    sb.append("    firstChargingSpanMinutes: ").append(toIndentedString(firstChargingSpanMinutes)).append("\n");
    sb.append("    firstChargingUnitFee: ").append(toIndentedString(firstChargingUnitFee)).append("\n");
    sb.append("    firstChargingUnitMinutes: ").append(toIndentedString(firstChargingUnitMinutes)).append("\n");
    sb.append("    freeEnterMinutes: ").append(toIndentedString(freeEnterMinutes)).append("\n");
    sb.append("    freeExitMinutes: ").append(toIndentedString(freeExitMinutes)).append("\n");
    sb.append("    maxFeePerDay: ").append(toIndentedString(maxFeePerDay)).append("\n");
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
    openapiFields.add("charging_period");
    openapiFields.add("charging_strategy");
    openapiFields.add("charging_unit_fee");
    openapiFields.add("charging_unit_minutes");
    openapiFields.add("enable_rollover_charge_period");
    openapiFields.add("first_charging_span_minutes");
    openapiFields.add("first_charging_unit_fee");
    openapiFields.add("first_charging_unit_minutes");
    openapiFields.add("free_enter_minutes");
    openapiFields.add("free_exit_minutes");
    openapiFields.add("max_fee_per_day");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ParkingLotChargingRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ParkingLotChargingRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParkingLotChargingRuleInfo is not found in the empty JSON string", ParkingLotChargingRuleInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("charging_period") != null && !jsonObj.get("charging_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charging_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charging_period").toString()));
      }
      if (jsonObj.get("charging_strategy") != null && !jsonObj.get("charging_strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charging_strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charging_strategy").toString()));
      }
      if (jsonObj.get("charging_unit_fee") != null && !jsonObj.get("charging_unit_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charging_unit_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charging_unit_fee").toString()));
      }
      if (jsonObj.get("charging_unit_minutes") != null && !jsonObj.get("charging_unit_minutes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charging_unit_minutes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charging_unit_minutes").toString()));
      }
      if (jsonObj.get("first_charging_span_minutes") != null && !jsonObj.get("first_charging_span_minutes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_charging_span_minutes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_charging_span_minutes").toString()));
      }
      if (jsonObj.get("first_charging_unit_fee") != null && !jsonObj.get("first_charging_unit_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_charging_unit_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_charging_unit_fee").toString()));
      }
      if (jsonObj.get("first_charging_unit_minutes") != null && !jsonObj.get("first_charging_unit_minutes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_charging_unit_minutes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_charging_unit_minutes").toString()));
      }
      if (jsonObj.get("free_enter_minutes") != null && !jsonObj.get("free_enter_minutes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `free_enter_minutes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("free_enter_minutes").toString()));
      }
      if (jsonObj.get("free_exit_minutes") != null && !jsonObj.get("free_exit_minutes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `free_exit_minutes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("free_exit_minutes").toString()));
      }
      if (jsonObj.get("max_fee_per_day") != null && !jsonObj.get("max_fee_per_day").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_fee_per_day` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_fee_per_day").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParkingLotChargingRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParkingLotChargingRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParkingLotChargingRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParkingLotChargingRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ParkingLotChargingRuleInfo>() {
           @Override
           public void write(JsonWriter out, ParkingLotChargingRuleInfo value) throws IOException {
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
           public ParkingLotChargingRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ParkingLotChargingRuleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ParkingLotChargingRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParkingLotChargingRuleInfo
  * @throws IOException if the JSON string is invalid with respect to ParkingLotChargingRuleInfo
  */
  public static ParkingLotChargingRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParkingLotChargingRuleInfo.class);
  }

 /**
  * Convert an instance of ParkingLotChargingRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

