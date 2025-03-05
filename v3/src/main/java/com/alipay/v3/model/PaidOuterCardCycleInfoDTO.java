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
 * PaidOuterCardCycleInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaidOuterCardCycleInfoDTO {
  public static final String SERIALIZED_NAME_ALIPAY_DEDUCT_AGREEMENT = "alipay_deduct_agreement";
  @SerializedName(SERIALIZED_NAME_ALIPAY_DEDUCT_AGREEMENT)
  private String alipayDeductAgreement;

  public static final String SERIALIZED_NAME_ALIPAY_DEDUCT_PRODUCT_CODE = "alipay_deduct_product_code";
  @SerializedName(SERIALIZED_NAME_ALIPAY_DEDUCT_PRODUCT_CODE)
  private String alipayDeductProductCode;

  public static final String SERIALIZED_NAME_ALIPAY_DEDUCT_SCENE = "alipay_deduct_scene";
  @SerializedName(SERIALIZED_NAME_ALIPAY_DEDUCT_SCENE)
  private String alipayDeductScene;

  public static final String SERIALIZED_NAME_CLOSE_REASON = "close_reason";
  @SerializedName(SERIALIZED_NAME_CLOSE_REASON)
  private String closeReason;

  public static final String SERIALIZED_NAME_CYCLE_TYPE = "cycle_type";
  @SerializedName(SERIALIZED_NAME_CYCLE_TYPE)
  private String cycleType;

  public static final String SERIALIZED_NAME_OPEN_STATUS = "open_status";
  @SerializedName(SERIALIZED_NAME_OPEN_STATUS)
  private String openStatus;

  public PaidOuterCardCycleInfoDTO() { 
  }

  public PaidOuterCardCycleInfoDTO alipayDeductAgreement(String alipayDeductAgreement) {
    
    this.alipayDeductAgreement = alipayDeductAgreement;
    return this;
  }

   /**
   * 支付宝用户签约协议号
   * @return alipayDeductAgreement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝用户签约协议号")

  public String getAlipayDeductAgreement() {
    return alipayDeductAgreement;
  }


  public void setAlipayDeductAgreement(String alipayDeductAgreement) {
    this.alipayDeductAgreement = alipayDeductAgreement;
  }


  public PaidOuterCardCycleInfoDTO alipayDeductProductCode(String alipayDeductProductCode) {
    
    this.alipayDeductProductCode = alipayDeductProductCode;
    return this;
  }

   /**
   * 支付宝代扣产品码
   * @return alipayDeductProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝代扣产品码")

  public String getAlipayDeductProductCode() {
    return alipayDeductProductCode;
  }


  public void setAlipayDeductProductCode(String alipayDeductProductCode) {
    this.alipayDeductProductCode = alipayDeductProductCode;
  }


  public PaidOuterCardCycleInfoDTO alipayDeductScene(String alipayDeductScene) {
    
    this.alipayDeductScene = alipayDeductScene;
    return this;
  }

   /**
   * 支付宝代扣场景码
   * @return alipayDeductScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝代扣场景码")

  public String getAlipayDeductScene() {
    return alipayDeductScene;
  }


  public void setAlipayDeductScene(String alipayDeductScene) {
    this.alipayDeductScene = alipayDeductScene;
  }


  public PaidOuterCardCycleInfoDTO closeReason(String closeReason) {
    
    this.closeReason = closeReason;
    return this;
  }

   /**
   * 关闭连续购买原因。
   * @return closeReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关闭连续购买原因。")

  public String getCloseReason() {
    return closeReason;
  }


  public void setCloseReason(String closeReason) {
    this.closeReason = closeReason;
  }


  public PaidOuterCardCycleInfoDTO cycleType(String cycleType) {
    
    this.cycleType = cycleType;
    return this;
  }

   /**
   * 用户开通连续购买类型。
   * @return cycleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户开通连续购买类型。")

  public String getCycleType() {
    return cycleType;
  }


  public void setCycleType(String cycleType) {
    this.cycleType = cycleType;
  }


  public PaidOuterCardCycleInfoDTO openStatus(String openStatus) {
    
    this.openStatus = openStatus;
    return this;
  }

   /**
   * 开通连续购买状态。
   * @return openStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开通连续购买状态。")

  public String getOpenStatus() {
    return openStatus;
  }


  public void setOpenStatus(String openStatus) {
    this.openStatus = openStatus;
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
   * @return the PaidOuterCardCycleInfoDTO instance itself
   */
  public PaidOuterCardCycleInfoDTO putAdditionalProperty(String key, Object value) {
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
    PaidOuterCardCycleInfoDTO paidOuterCardCycleInfoDTO = (PaidOuterCardCycleInfoDTO) o;
    return Objects.equals(this.alipayDeductAgreement, paidOuterCardCycleInfoDTO.alipayDeductAgreement) &&
        Objects.equals(this.alipayDeductProductCode, paidOuterCardCycleInfoDTO.alipayDeductProductCode) &&
        Objects.equals(this.alipayDeductScene, paidOuterCardCycleInfoDTO.alipayDeductScene) &&
        Objects.equals(this.closeReason, paidOuterCardCycleInfoDTO.closeReason) &&
        Objects.equals(this.cycleType, paidOuterCardCycleInfoDTO.cycleType) &&
        Objects.equals(this.openStatus, paidOuterCardCycleInfoDTO.openStatus)&&
        Objects.equals(this.additionalProperties, paidOuterCardCycleInfoDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayDeductAgreement, alipayDeductProductCode, alipayDeductScene, closeReason, cycleType, openStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaidOuterCardCycleInfoDTO {\n");
    sb.append("    alipayDeductAgreement: ").append(toIndentedString(alipayDeductAgreement)).append("\n");
    sb.append("    alipayDeductProductCode: ").append(toIndentedString(alipayDeductProductCode)).append("\n");
    sb.append("    alipayDeductScene: ").append(toIndentedString(alipayDeductScene)).append("\n");
    sb.append("    closeReason: ").append(toIndentedString(closeReason)).append("\n");
    sb.append("    cycleType: ").append(toIndentedString(cycleType)).append("\n");
    sb.append("    openStatus: ").append(toIndentedString(openStatus)).append("\n");
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
    openapiFields.add("alipay_deduct_agreement");
    openapiFields.add("alipay_deduct_product_code");
    openapiFields.add("alipay_deduct_scene");
    openapiFields.add("close_reason");
    openapiFields.add("cycle_type");
    openapiFields.add("open_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaidOuterCardCycleInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaidOuterCardCycleInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaidOuterCardCycleInfoDTO is not found in the empty JSON string", PaidOuterCardCycleInfoDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("alipay_deduct_agreement") != null && !jsonObj.get("alipay_deduct_agreement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_deduct_agreement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_deduct_agreement").toString()));
      }
      if (jsonObj.get("alipay_deduct_product_code") != null && !jsonObj.get("alipay_deduct_product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_deduct_product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_deduct_product_code").toString()));
      }
      if (jsonObj.get("alipay_deduct_scene") != null && !jsonObj.get("alipay_deduct_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_deduct_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_deduct_scene").toString()));
      }
      if (jsonObj.get("close_reason") != null && !jsonObj.get("close_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `close_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("close_reason").toString()));
      }
      if (jsonObj.get("cycle_type") != null && !jsonObj.get("cycle_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_type").toString()));
      }
      if (jsonObj.get("open_status") != null && !jsonObj.get("open_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaidOuterCardCycleInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaidOuterCardCycleInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaidOuterCardCycleInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaidOuterCardCycleInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PaidOuterCardCycleInfoDTO>() {
           @Override
           public void write(JsonWriter out, PaidOuterCardCycleInfoDTO value) throws IOException {
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
           public PaidOuterCardCycleInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaidOuterCardCycleInfoDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaidOuterCardCycleInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaidOuterCardCycleInfoDTO
  * @throws IOException if the JSON string is invalid with respect to PaidOuterCardCycleInfoDTO
  */
  public static PaidOuterCardCycleInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaidOuterCardCycleInfoDTO.class);
  }

 /**
  * Convert an instance of PaidOuterCardCycleInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

