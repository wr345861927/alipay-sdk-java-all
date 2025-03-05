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
import com.alipay.v3.model.ZMGOCycleFlexConfig;
import com.alipay.v3.model.ZMGOCycleWithholdConfig;
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
 * ZMGOSettlementConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZMGOSettlementConfig {
  public static final String SERIALIZED_NAME_CUSTOM_FEE_NAME = "custom_fee_name";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FEE_NAME)
  private String customFeeName;

  public static final String SERIALIZED_NAME_CYCLE_FLEX_WITHHOLD_CONFIG = "cycle_flex_withhold_config";
  @SerializedName(SERIALIZED_NAME_CYCLE_FLEX_WITHHOLD_CONFIG)
  private ZMGOCycleFlexConfig cycleFlexWithholdConfig;

  public static final String SERIALIZED_NAME_CYCLE_WITHHOLD_CONFIG = "cycle_withhold_config";
  @SerializedName(SERIALIZED_NAME_CYCLE_WITHHOLD_CONFIG)
  private ZMGOCycleWithholdConfig cycleWithholdConfig;

  public static final String SERIALIZED_NAME_EXP_STOP_DELAY_DAYS = "exp_stop_delay_days";
  @SerializedName(SERIALIZED_NAME_EXP_STOP_DELAY_DAYS)
  private Integer expStopDelayDays;

  public static final String SERIALIZED_NAME_EXP_STOP_TIME = "exp_stop_time";
  @SerializedName(SERIALIZED_NAME_EXP_STOP_TIME)
  private String expStopTime;

  public static final String SERIALIZED_NAME_EXP_STOP_TIME_MODE = "exp_stop_time_mode";
  @SerializedName(SERIALIZED_NAME_EXP_STOP_TIME_MODE)
  private String expStopTimeMode;

  public static final String SERIALIZED_NAME_FULFILLTIMES_CUSTOM_SETTLEMENT_PLAN = "fulfilltimes_custom_settlement_plan";
  @SerializedName(SERIALIZED_NAME_FULFILLTIMES_CUSTOM_SETTLEMENT_PLAN)
  private String fulfilltimesCustomSettlementPlan;

  public static final String SERIALIZED_NAME_SETTLEMENT_TYPE = "settlement_type";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_TYPE)
  private String settlementType;

  public ZMGOSettlementConfig() { 
  }

  public ZMGOSettlementConfig customFeeName(String customFeeName) {
    
    this.customFeeName = customFeeName;
    return this;
  }

   /**
   * 会员费扣费名称
   * @return customFeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会员费扣费名称")

  public String getCustomFeeName() {
    return customFeeName;
  }


  public void setCustomFeeName(String customFeeName) {
    this.customFeeName = customFeeName;
  }


  public ZMGOSettlementConfig cycleFlexWithholdConfig(ZMGOCycleFlexConfig cycleFlexWithholdConfig) {
    
    this.cycleFlexWithholdConfig = cycleFlexWithholdConfig;
    return this;
  }

   /**
   * Get cycleFlexWithholdConfig
   * @return cycleFlexWithholdConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZMGOCycleFlexConfig getCycleFlexWithholdConfig() {
    return cycleFlexWithholdConfig;
  }


  public void setCycleFlexWithholdConfig(ZMGOCycleFlexConfig cycleFlexWithholdConfig) {
    this.cycleFlexWithholdConfig = cycleFlexWithholdConfig;
  }


  public ZMGOSettlementConfig cycleWithholdConfig(ZMGOCycleWithholdConfig cycleWithholdConfig) {
    
    this.cycleWithholdConfig = cycleWithholdConfig;
    return this;
  }

   /**
   * Get cycleWithholdConfig
   * @return cycleWithholdConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZMGOCycleWithholdConfig getCycleWithholdConfig() {
    return cycleWithholdConfig;
  }


  public void setCycleWithholdConfig(ZMGOCycleWithholdConfig cycleWithholdConfig) {
    this.cycleWithholdConfig = cycleWithholdConfig;
  }


  public ZMGOSettlementConfig expStopDelayDays(Integer expStopDelayDays) {
    
    this.expStopDelayDays = expStopDelayDays;
    return this;
  }

   /**
   * 预计结算延迟天数，当exp_stop_time_mode取值RELATIVE_DATE、ABSOLATE_DATE、ABSOLUTE_PLUS_1_DATE时，必传
   * @return expStopDelayDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预计结算延迟天数，当exp_stop_time_mode取值RELATIVE_DATE、ABSOLATE_DATE、ABSOLUTE_PLUS_1_DATE时，必传")

  public Integer getExpStopDelayDays() {
    return expStopDelayDays;
  }


  public void setExpStopDelayDays(Integer expStopDelayDays) {
    this.expStopDelayDays = expStopDelayDays;
  }


  public ZMGOSettlementConfig expStopTime(String expStopTime) {
    
    this.expStopTime = expStopTime;
    return this;
  }

   /**
   * 预期结算时间，当exp_stop_time_mode取值APPOINT_DATE时，必传
   * @return expStopTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预期结算时间，当exp_stop_time_mode取值APPOINT_DATE时，必传")

  public String getExpStopTime() {
    return expStopTime;
  }


  public void setExpStopTime(String expStopTime) {
    this.expStopTime = expStopTime;
  }


  public ZMGOSettlementConfig expStopTimeMode(String expStopTimeMode) {
    
    this.expStopTimeMode = expStopTimeMode;
    return this;
  }

   /**
   * 预计结算时间模式，取值：（1）RELATIVE_DATE(\&quot;RELATIVE_DATE\&quot;, \&quot;相对日期\&quot;), （2）ABSOLATE_DATE(\&quot;ABSOLATE_DATE\&quot;, \&quot;绝对日期(当日开始计算)\&quot;), （3）ABSOLUTE_PLUS_1_DATE(\&quot;ABSOLUTE_PLUS_1_DATE\&quot;, \&quot;绝对日期(次日开始计算)\&quot;), （4）APPOINT_DATE(\&quot;APPOINT_DATE\&quot;, \&quot;指定日期\&quot;)
   * @return expStopTimeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预计结算时间模式，取值：（1）RELATIVE_DATE(\"RELATIVE_DATE\", \"相对日期\"), （2）ABSOLATE_DATE(\"ABSOLATE_DATE\", \"绝对日期(当日开始计算)\"), （3）ABSOLUTE_PLUS_1_DATE(\"ABSOLUTE_PLUS_1_DATE\", \"绝对日期(次日开始计算)\"), （4）APPOINT_DATE(\"APPOINT_DATE\", \"指定日期\")")

  public String getExpStopTimeMode() {
    return expStopTimeMode;
  }


  public void setExpStopTimeMode(String expStopTimeMode) {
    this.expStopTimeMode = expStopTimeMode;
  }


  public ZMGOSettlementConfig fulfilltimesCustomSettlementPlan(String fulfilltimesCustomSettlementPlan) {
    
    this.fulfilltimesCustomSettlementPlan = fulfilltimesCustomSettlementPlan;
    return this;
  }

   /**
   * 按履约次数灵活扣款计划。当settlement_type取值为fulfillTimesCustomSettlement时，此属性必传
   * @return fulfilltimesCustomSettlementPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "按履约次数灵活扣款计划。当settlement_type取值为fulfillTimesCustomSettlement时，此属性必传")

  public String getFulfilltimesCustomSettlementPlan() {
    return fulfilltimesCustomSettlementPlan;
  }


  public void setFulfilltimesCustomSettlementPlan(String fulfilltimesCustomSettlementPlan) {
    this.fulfilltimesCustomSettlementPlan = fulfilltimesCustomSettlementPlan;
  }


  public ZMGOSettlementConfig settlementType(String settlementType) {
    
    this.settlementType = settlementType;
    return this;
  }

   /**
   * 结算类型，取值：     BENEFIT_SETTLEMENT(\&quot;benefitSettlement\&quot;, \&quot;按权益金额结算\&quot;),     FULFILL_TIMES_CUSTOM_SETTLEMENT(\&quot;fulfillTimesCustomSettlement\&quot;,\&quot;按履约次数扣款\&quot;)
   * @return settlementType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结算类型，取值：     BENEFIT_SETTLEMENT(\"benefitSettlement\", \"按权益金额结算\"),     FULFILL_TIMES_CUSTOM_SETTLEMENT(\"fulfillTimesCustomSettlement\",\"按履约次数扣款\")")

  public String getSettlementType() {
    return settlementType;
  }


  public void setSettlementType(String settlementType) {
    this.settlementType = settlementType;
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
   * @return the ZMGOSettlementConfig instance itself
   */
  public ZMGOSettlementConfig putAdditionalProperty(String key, Object value) {
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
    ZMGOSettlementConfig zmGOSettlementConfig = (ZMGOSettlementConfig) o;
    return Objects.equals(this.customFeeName, zmGOSettlementConfig.customFeeName) &&
        Objects.equals(this.cycleFlexWithholdConfig, zmGOSettlementConfig.cycleFlexWithholdConfig) &&
        Objects.equals(this.cycleWithholdConfig, zmGOSettlementConfig.cycleWithholdConfig) &&
        Objects.equals(this.expStopDelayDays, zmGOSettlementConfig.expStopDelayDays) &&
        Objects.equals(this.expStopTime, zmGOSettlementConfig.expStopTime) &&
        Objects.equals(this.expStopTimeMode, zmGOSettlementConfig.expStopTimeMode) &&
        Objects.equals(this.fulfilltimesCustomSettlementPlan, zmGOSettlementConfig.fulfilltimesCustomSettlementPlan) &&
        Objects.equals(this.settlementType, zmGOSettlementConfig.settlementType)&&
        Objects.equals(this.additionalProperties, zmGOSettlementConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFeeName, cycleFlexWithholdConfig, cycleWithholdConfig, expStopDelayDays, expStopTime, expStopTimeMode, fulfilltimesCustomSettlementPlan, settlementType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZMGOSettlementConfig {\n");
    sb.append("    customFeeName: ").append(toIndentedString(customFeeName)).append("\n");
    sb.append("    cycleFlexWithholdConfig: ").append(toIndentedString(cycleFlexWithholdConfig)).append("\n");
    sb.append("    cycleWithholdConfig: ").append(toIndentedString(cycleWithholdConfig)).append("\n");
    sb.append("    expStopDelayDays: ").append(toIndentedString(expStopDelayDays)).append("\n");
    sb.append("    expStopTime: ").append(toIndentedString(expStopTime)).append("\n");
    sb.append("    expStopTimeMode: ").append(toIndentedString(expStopTimeMode)).append("\n");
    sb.append("    fulfilltimesCustomSettlementPlan: ").append(toIndentedString(fulfilltimesCustomSettlementPlan)).append("\n");
    sb.append("    settlementType: ").append(toIndentedString(settlementType)).append("\n");
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
    openapiFields.add("custom_fee_name");
    openapiFields.add("cycle_flex_withhold_config");
    openapiFields.add("cycle_withhold_config");
    openapiFields.add("exp_stop_delay_days");
    openapiFields.add("exp_stop_time");
    openapiFields.add("exp_stop_time_mode");
    openapiFields.add("fulfilltimes_custom_settlement_plan");
    openapiFields.add("settlement_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZMGOSettlementConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZMGOSettlementConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZMGOSettlementConfig is not found in the empty JSON string", ZMGOSettlementConfig.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("custom_fee_name") != null && !jsonObj.get("custom_fee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_fee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_fee_name").toString()));
      }
      // validate the optional field `cycle_flex_withhold_config`
      if (jsonObj.getAsJsonObject("cycle_flex_withhold_config") != null) {
        ZMGOCycleFlexConfig.validateJsonObject(jsonObj.getAsJsonObject("cycle_flex_withhold_config"));
      }
      // validate the optional field `cycle_withhold_config`
      if (jsonObj.getAsJsonObject("cycle_withhold_config") != null) {
        ZMGOCycleWithholdConfig.validateJsonObject(jsonObj.getAsJsonObject("cycle_withhold_config"));
      }
      if (jsonObj.get("exp_stop_time") != null && !jsonObj.get("exp_stop_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exp_stop_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exp_stop_time").toString()));
      }
      if (jsonObj.get("exp_stop_time_mode") != null && !jsonObj.get("exp_stop_time_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exp_stop_time_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exp_stop_time_mode").toString()));
      }
      if (jsonObj.get("fulfilltimes_custom_settlement_plan") != null && !jsonObj.get("fulfilltimes_custom_settlement_plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfilltimes_custom_settlement_plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfilltimes_custom_settlement_plan").toString()));
      }
      if (jsonObj.get("settlement_type") != null && !jsonObj.get("settlement_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZMGOSettlementConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZMGOSettlementConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZMGOSettlementConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZMGOSettlementConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ZMGOSettlementConfig>() {
           @Override
           public void write(JsonWriter out, ZMGOSettlementConfig value) throws IOException {
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
           public ZMGOSettlementConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZMGOSettlementConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZMGOSettlementConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZMGOSettlementConfig
  * @throws IOException if the JSON string is invalid with respect to ZMGOSettlementConfig
  */
  public static ZMGOSettlementConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZMGOSettlementConfig.class);
  }

 /**
  * Convert an instance of ZMGOSettlementConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

