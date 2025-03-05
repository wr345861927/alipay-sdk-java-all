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
import com.alipay.v3.model.PaidOuterCardCycleInfoDTO;
import com.alipay.v3.model.PaidOuterCardPurchaseInfoDTO;
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
 * PaidOuterCardExtraInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaidOuterCardExtraInfoDTO {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_CYCLE_INFO = "cycle_info";
  @SerializedName(SERIALIZED_NAME_CYCLE_INFO)
  private PaidOuterCardCycleInfoDTO cycleInfo;

  public static final String SERIALIZED_NAME_PURCHASE_INFO = "purchase_info";
  @SerializedName(SERIALIZED_NAME_PURCHASE_INFO)
  private PaidOuterCardPurchaseInfoDTO purchaseInfo;

  public PaidOuterCardExtraInfoDTO() { 
  }

  public PaidOuterCardExtraInfoDTO action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * 用户操作类型
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户操作类型")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public PaidOuterCardExtraInfoDTO cycleInfo(PaidOuterCardCycleInfoDTO cycleInfo) {
    
    this.cycleInfo = cycleInfo;
    return this;
  }

   /**
   * Get cycleInfo
   * @return cycleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaidOuterCardCycleInfoDTO getCycleInfo() {
    return cycleInfo;
  }


  public void setCycleInfo(PaidOuterCardCycleInfoDTO cycleInfo) {
    this.cycleInfo = cycleInfo;
  }


  public PaidOuterCardExtraInfoDTO purchaseInfo(PaidOuterCardPurchaseInfoDTO purchaseInfo) {
    
    this.purchaseInfo = purchaseInfo;
    return this;
  }

   /**
   * Get purchaseInfo
   * @return purchaseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaidOuterCardPurchaseInfoDTO getPurchaseInfo() {
    return purchaseInfo;
  }


  public void setPurchaseInfo(PaidOuterCardPurchaseInfoDTO purchaseInfo) {
    this.purchaseInfo = purchaseInfo;
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
   * @return the PaidOuterCardExtraInfoDTO instance itself
   */
  public PaidOuterCardExtraInfoDTO putAdditionalProperty(String key, Object value) {
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
    PaidOuterCardExtraInfoDTO paidOuterCardExtraInfoDTO = (PaidOuterCardExtraInfoDTO) o;
    return Objects.equals(this.action, paidOuterCardExtraInfoDTO.action) &&
        Objects.equals(this.cycleInfo, paidOuterCardExtraInfoDTO.cycleInfo) &&
        Objects.equals(this.purchaseInfo, paidOuterCardExtraInfoDTO.purchaseInfo)&&
        Objects.equals(this.additionalProperties, paidOuterCardExtraInfoDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, cycleInfo, purchaseInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaidOuterCardExtraInfoDTO {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    cycleInfo: ").append(toIndentedString(cycleInfo)).append("\n");
    sb.append("    purchaseInfo: ").append(toIndentedString(purchaseInfo)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("cycle_info");
    openapiFields.add("purchase_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaidOuterCardExtraInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaidOuterCardExtraInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaidOuterCardExtraInfoDTO is not found in the empty JSON string", PaidOuterCardExtraInfoDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the optional field `cycle_info`
      if (jsonObj.getAsJsonObject("cycle_info") != null) {
        PaidOuterCardCycleInfoDTO.validateJsonObject(jsonObj.getAsJsonObject("cycle_info"));
      }
      // validate the optional field `purchase_info`
      if (jsonObj.getAsJsonObject("purchase_info") != null) {
        PaidOuterCardPurchaseInfoDTO.validateJsonObject(jsonObj.getAsJsonObject("purchase_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaidOuterCardExtraInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaidOuterCardExtraInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaidOuterCardExtraInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaidOuterCardExtraInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PaidOuterCardExtraInfoDTO>() {
           @Override
           public void write(JsonWriter out, PaidOuterCardExtraInfoDTO value) throws IOException {
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
           public PaidOuterCardExtraInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaidOuterCardExtraInfoDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaidOuterCardExtraInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaidOuterCardExtraInfoDTO
  * @throws IOException if the JSON string is invalid with respect to PaidOuterCardExtraInfoDTO
  */
  public static PaidOuterCardExtraInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaidOuterCardExtraInfoDTO.class);
  }

 /**
  * Convert an instance of PaidOuterCardExtraInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

