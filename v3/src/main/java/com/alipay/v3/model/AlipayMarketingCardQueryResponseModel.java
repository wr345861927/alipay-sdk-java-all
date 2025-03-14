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
import com.alipay.v3.model.MerchantCard;
import com.alipay.v3.model.PaidOuterCardExtraInfoDTO;
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
 * AlipayMarketingCardQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardQueryResponseModel {
  public static final String SERIALIZED_NAME_CARD_INFO = "card_info";
  @SerializedName(SERIALIZED_NAME_CARD_INFO)
  private MerchantCard cardInfo;

  public static final String SERIALIZED_NAME_PAID_OUTER_CARD_INFO = "paid_outer_card_info";
  @SerializedName(SERIALIZED_NAME_PAID_OUTER_CARD_INFO)
  private PaidOuterCardExtraInfoDTO paidOuterCardInfo;

  public static final String SERIALIZED_NAME_PASS_ID = "pass_id";
  @SerializedName(SERIALIZED_NAME_PASS_ID)
  private String passId;

  public static final String SERIALIZED_NAME_SCHEMA_URL = "schema_url";
  @SerializedName(SERIALIZED_NAME_SCHEMA_URL)
  private String schemaUrl;

  public AlipayMarketingCardQueryResponseModel() { 
  }

  public AlipayMarketingCardQueryResponseModel cardInfo(MerchantCard cardInfo) {
    
    this.cardInfo = cardInfo;
    return this;
  }

   /**
   * Get cardInfo
   * @return cardInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantCard getCardInfo() {
    return cardInfo;
  }


  public void setCardInfo(MerchantCard cardInfo) {
    this.cardInfo = cardInfo;
  }


  public AlipayMarketingCardQueryResponseModel paidOuterCardInfo(PaidOuterCardExtraInfoDTO paidOuterCardInfo) {
    
    this.paidOuterCardInfo = paidOuterCardInfo;
    return this;
  }

   /**
   * Get paidOuterCardInfo
   * @return paidOuterCardInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaidOuterCardExtraInfoDTO getPaidOuterCardInfo() {
    return paidOuterCardInfo;
  }


  public void setPaidOuterCardInfo(PaidOuterCardExtraInfoDTO paidOuterCardInfo) {
    this.paidOuterCardInfo = paidOuterCardInfo;
  }


  public AlipayMarketingCardQueryResponseModel passId(String passId) {
    
    this.passId = passId;
    return this;
  }

   /**
   * 商家会员卡页面跳转到支付宝卡券详情页的pass_id，对应schema地址中的参数p， 主要用于小程序跳往会员卡详情的链接拼接
   * @return passId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21942125", value = "商家会员卡页面跳转到支付宝卡券详情页的pass_id，对应schema地址中的参数p， 主要用于小程序跳往会员卡详情的链接拼接")

  public String getPassId() {
    return passId;
  }


  public void setPassId(String passId) {
    this.passId = passId;
  }


  public AlipayMarketingCardQueryResponseModel schemaUrl(String schemaUrl) {
    
    this.schemaUrl = schemaUrl;
    return this;
  }

   /**
   * 商家会员卡页面跳转到支付宝卡券详情页面的schema地址
   * @return schemaUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId=20000021&b=m&p=111", value = "商家会员卡页面跳转到支付宝卡券详情页面的schema地址")

  public String getSchemaUrl() {
    return schemaUrl;
  }


  public void setSchemaUrl(String schemaUrl) {
    this.schemaUrl = schemaUrl;
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
   * @return the AlipayMarketingCardQueryResponseModel instance itself
   */
  public AlipayMarketingCardQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingCardQueryResponseModel alipayMarketingCardQueryResponseModel = (AlipayMarketingCardQueryResponseModel) o;
    return Objects.equals(this.cardInfo, alipayMarketingCardQueryResponseModel.cardInfo) &&
        Objects.equals(this.paidOuterCardInfo, alipayMarketingCardQueryResponseModel.paidOuterCardInfo) &&
        Objects.equals(this.passId, alipayMarketingCardQueryResponseModel.passId) &&
        Objects.equals(this.schemaUrl, alipayMarketingCardQueryResponseModel.schemaUrl)&&
        Objects.equals(this.additionalProperties, alipayMarketingCardQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardInfo, paidOuterCardInfo, passId, schemaUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardQueryResponseModel {\n");
    sb.append("    cardInfo: ").append(toIndentedString(cardInfo)).append("\n");
    sb.append("    paidOuterCardInfo: ").append(toIndentedString(paidOuterCardInfo)).append("\n");
    sb.append("    passId: ").append(toIndentedString(passId)).append("\n");
    sb.append("    schemaUrl: ").append(toIndentedString(schemaUrl)).append("\n");
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
    openapiFields.add("card_info");
    openapiFields.add("paid_outer_card_info");
    openapiFields.add("pass_id");
    openapiFields.add("schema_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardQueryResponseModel is not found in the empty JSON string", AlipayMarketingCardQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `card_info`
      if (jsonObj.getAsJsonObject("card_info") != null) {
        MerchantCard.validateJsonObject(jsonObj.getAsJsonObject("card_info"));
      }
      // validate the optional field `paid_outer_card_info`
      if (jsonObj.getAsJsonObject("paid_outer_card_info") != null) {
        PaidOuterCardExtraInfoDTO.validateJsonObject(jsonObj.getAsJsonObject("paid_outer_card_info"));
      }
      if (jsonObj.get("pass_id") != null && !jsonObj.get("pass_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pass_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pass_id").toString()));
      }
      if (jsonObj.get("schema_url") != null && !jsonObj.get("schema_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardQueryResponseModel value) throws IOException {
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
           public AlipayMarketingCardQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingCardQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingCardQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardQueryResponseModel
  */
  public static AlipayMarketingCardQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

