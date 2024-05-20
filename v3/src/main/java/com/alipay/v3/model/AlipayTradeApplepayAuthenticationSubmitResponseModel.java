/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-05-20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.OpenApiResponseHeader;
import com.alipay.v3.model.UpdatedAuthenticationDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AlipayTradeApplepayAuthenticationSubmitResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeApplepayAuthenticationSubmitResponseModel {
  public static final String SERIALIZED_NAME_AUTHENTICATION_ERROR = "authentication_error";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_ERROR)
  private String authenticationError;

  public static final String SERIALIZED_NAME_FALLBACK_AUTHENTICATION_MECHANISMS = "fallback_authentication_mechanisms";
  @SerializedName(SERIALIZED_NAME_FALLBACK_AUTHENTICATION_MECHANISMS)
  private List<String> fallbackAuthenticationMechanisms = null;

  public static final String SERIALIZED_NAME_RESPONSE_HEADER = "response_header";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HEADER)
  private OpenApiResponseHeader responseHeader;

  public static final String SERIALIZED_NAME_RETRY_AUTHENTICATION_MECHANISMS = "retry_authentication_mechanisms";
  @SerializedName(SERIALIZED_NAME_RETRY_AUTHENTICATION_MECHANISMS)
  private List<String> retryAuthenticationMechanisms = null;

  public static final String SERIALIZED_NAME_SIGNING_CERTIFICATE = "signing_certificate";
  @SerializedName(SERIALIZED_NAME_SIGNING_CERTIFICATE)
  private String signingCertificate;

  public static final String SERIALIZED_NAME_UPDATED_AUTHENTICATION_DETAILS = "updated_authentication_details";
  @SerializedName(SERIALIZED_NAME_UPDATED_AUTHENTICATION_DETAILS)
  private UpdatedAuthenticationDetails updatedAuthenticationDetails;

  public static final String SERIALIZED_NAME_UPDATED_TRANSACTION_STATUS = "updated_transaction_status";
  @SerializedName(SERIALIZED_NAME_UPDATED_TRANSACTION_STATUS)
  private String updatedTransactionStatus;

  public AlipayTradeApplepayAuthenticationSubmitResponseModel() { 
  }

  public AlipayTradeApplepayAuthenticationSubmitResponseModel authenticationError(String authenticationError) {
    
    this.authenticationError = authenticationError;
    return this;
  }

   /**
   * 核身错误信息
   * @return authenticationError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PINMaximumTriesExceeded", value = "核身错误信息")

  public String getAuthenticationError() {
    return authenticationError;
  }


  public void setAuthenticationError(String authenticationError) {
    this.authenticationError = authenticationError;
  }


  public AlipayTradeApplepayAuthenticationSubmitResponseModel fallbackAuthenticationMechanisms(List<String> fallbackAuthenticationMechanisms) {
    
    this.fallbackAuthenticationMechanisms = fallbackAuthenticationMechanisms;
    return this;
  }

  public AlipayTradeApplepayAuthenticationSubmitResponseModel addFallbackAuthenticationMechanismsItem(String fallbackAuthenticationMechanismsItem) {
    if (this.fallbackAuthenticationMechanisms == null) {
      this.fallbackAuthenticationMechanisms = new ArrayList<>();
    }
    this.fallbackAuthenticationMechanisms.add(fallbackAuthenticationMechanismsItem);
    return this;
  }

   /**
   * 失败时的鉴权重试机制
   * @return fallbackAuthenticationMechanisms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PaymentPINInput", value = "失败时的鉴权重试机制")

  public List<String> getFallbackAuthenticationMechanisms() {
    return fallbackAuthenticationMechanisms;
  }


  public void setFallbackAuthenticationMechanisms(List<String> fallbackAuthenticationMechanisms) {
    this.fallbackAuthenticationMechanisms = fallbackAuthenticationMechanisms;
  }


  public AlipayTradeApplepayAuthenticationSubmitResponseModel responseHeader(OpenApiResponseHeader responseHeader) {
    
    this.responseHeader = responseHeader;
    return this;
  }

   /**
   * Get responseHeader
   * @return responseHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenApiResponseHeader getResponseHeader() {
    return responseHeader;
  }


  public void setResponseHeader(OpenApiResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
  }


  public AlipayTradeApplepayAuthenticationSubmitResponseModel retryAuthenticationMechanisms(List<String> retryAuthenticationMechanisms) {
    
    this.retryAuthenticationMechanisms = retryAuthenticationMechanisms;
    return this;
  }

  public AlipayTradeApplepayAuthenticationSubmitResponseModel addRetryAuthenticationMechanismsItem(String retryAuthenticationMechanismsItem) {
    if (this.retryAuthenticationMechanisms == null) {
      this.retryAuthenticationMechanisms = new ArrayList<>();
    }
    this.retryAuthenticationMechanisms.add(retryAuthenticationMechanismsItem);
    return this;
  }

   /**
   * 鉴权重试机制
   * @return retryAuthenticationMechanisms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PaymentPINInput", value = "鉴权重试机制")

  public List<String> getRetryAuthenticationMechanisms() {
    return retryAuthenticationMechanisms;
  }


  public void setRetryAuthenticationMechanisms(List<String> retryAuthenticationMechanisms) {
    this.retryAuthenticationMechanisms = retryAuthenticationMechanisms;
  }


  public AlipayTradeApplepayAuthenticationSubmitResponseModel signingCertificate(String signingCertificate) {
    
    this.signingCertificate = signingCertificate;
    return this;
  }

   /**
   * base64之后的证书
   * @return signingCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "R2VuZXJhdGVkIENlcnRpZmljYXRlIERhdGE=", value = "base64之后的证书")

  public String getSigningCertificate() {
    return signingCertificate;
  }


  public void setSigningCertificate(String signingCertificate) {
    this.signingCertificate = signingCertificate;
  }


  public AlipayTradeApplepayAuthenticationSubmitResponseModel updatedAuthenticationDetails(UpdatedAuthenticationDetails updatedAuthenticationDetails) {
    
    this.updatedAuthenticationDetails = updatedAuthenticationDetails;
    return this;
  }

   /**
   * Get updatedAuthenticationDetails
   * @return updatedAuthenticationDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UpdatedAuthenticationDetails getUpdatedAuthenticationDetails() {
    return updatedAuthenticationDetails;
  }


  public void setUpdatedAuthenticationDetails(UpdatedAuthenticationDetails updatedAuthenticationDetails) {
    this.updatedAuthenticationDetails = updatedAuthenticationDetails;
  }


  public AlipayTradeApplepayAuthenticationSubmitResponseModel updatedTransactionStatus(String updatedTransactionStatus) {
    
    this.updatedTransactionStatus = updatedTransactionStatus;
    return this;
  }

   /**
   * 交易状态
   * @return updatedTransactionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Pending", value = "交易状态")

  public String getUpdatedTransactionStatus() {
    return updatedTransactionStatus;
  }


  public void setUpdatedTransactionStatus(String updatedTransactionStatus) {
    this.updatedTransactionStatus = updatedTransactionStatus;
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
   * @return the AlipayTradeApplepayAuthenticationSubmitResponseModel instance itself
   */
  public AlipayTradeApplepayAuthenticationSubmitResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeApplepayAuthenticationSubmitResponseModel alipayTradeApplepayAuthenticationSubmitResponseModel = (AlipayTradeApplepayAuthenticationSubmitResponseModel) o;
    return Objects.equals(this.authenticationError, alipayTradeApplepayAuthenticationSubmitResponseModel.authenticationError) &&
        Objects.equals(this.fallbackAuthenticationMechanisms, alipayTradeApplepayAuthenticationSubmitResponseModel.fallbackAuthenticationMechanisms) &&
        Objects.equals(this.responseHeader, alipayTradeApplepayAuthenticationSubmitResponseModel.responseHeader) &&
        Objects.equals(this.retryAuthenticationMechanisms, alipayTradeApplepayAuthenticationSubmitResponseModel.retryAuthenticationMechanisms) &&
        Objects.equals(this.signingCertificate, alipayTradeApplepayAuthenticationSubmitResponseModel.signingCertificate) &&
        Objects.equals(this.updatedAuthenticationDetails, alipayTradeApplepayAuthenticationSubmitResponseModel.updatedAuthenticationDetails) &&
        Objects.equals(this.updatedTransactionStatus, alipayTradeApplepayAuthenticationSubmitResponseModel.updatedTransactionStatus)&&
        Objects.equals(this.additionalProperties, alipayTradeApplepayAuthenticationSubmitResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationError, fallbackAuthenticationMechanisms, responseHeader, retryAuthenticationMechanisms, signingCertificate, updatedAuthenticationDetails, updatedTransactionStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeApplepayAuthenticationSubmitResponseModel {\n");
    sb.append("    authenticationError: ").append(toIndentedString(authenticationError)).append("\n");
    sb.append("    fallbackAuthenticationMechanisms: ").append(toIndentedString(fallbackAuthenticationMechanisms)).append("\n");
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    retryAuthenticationMechanisms: ").append(toIndentedString(retryAuthenticationMechanisms)).append("\n");
    sb.append("    signingCertificate: ").append(toIndentedString(signingCertificate)).append("\n");
    sb.append("    updatedAuthenticationDetails: ").append(toIndentedString(updatedAuthenticationDetails)).append("\n");
    sb.append("    updatedTransactionStatus: ").append(toIndentedString(updatedTransactionStatus)).append("\n");
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
    openapiFields.add("authentication_error");
    openapiFields.add("fallback_authentication_mechanisms");
    openapiFields.add("response_header");
    openapiFields.add("retry_authentication_mechanisms");
    openapiFields.add("signing_certificate");
    openapiFields.add("updated_authentication_details");
    openapiFields.add("updated_transaction_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeApplepayAuthenticationSubmitResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeApplepayAuthenticationSubmitResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeApplepayAuthenticationSubmitResponseModel is not found in the empty JSON string", AlipayTradeApplepayAuthenticationSubmitResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("authentication_error") != null && !jsonObj.get("authentication_error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authentication_error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authentication_error").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("fallback_authentication_mechanisms") != null && !jsonObj.get("fallback_authentication_mechanisms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallback_authentication_mechanisms` to be an array in the JSON string but got `%s`", jsonObj.get("fallback_authentication_mechanisms").toString()));
      }
      // validate the optional field `response_header`
      if (jsonObj.getAsJsonObject("response_header") != null) {
        OpenApiResponseHeader.validateJsonObject(jsonObj.getAsJsonObject("response_header"));
      }
      // ensure the json data is an array
      if (jsonObj.get("retry_authentication_mechanisms") != null && !jsonObj.get("retry_authentication_mechanisms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `retry_authentication_mechanisms` to be an array in the JSON string but got `%s`", jsonObj.get("retry_authentication_mechanisms").toString()));
      }
      if (jsonObj.get("signing_certificate") != null && !jsonObj.get("signing_certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signing_certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signing_certificate").toString()));
      }
      // validate the optional field `updated_authentication_details`
      if (jsonObj.getAsJsonObject("updated_authentication_details") != null) {
        UpdatedAuthenticationDetails.validateJsonObject(jsonObj.getAsJsonObject("updated_authentication_details"));
      }
      if (jsonObj.get("updated_transaction_status") != null && !jsonObj.get("updated_transaction_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_transaction_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_transaction_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeApplepayAuthenticationSubmitResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeApplepayAuthenticationSubmitResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeApplepayAuthenticationSubmitResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeApplepayAuthenticationSubmitResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeApplepayAuthenticationSubmitResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeApplepayAuthenticationSubmitResponseModel value) throws IOException {
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
           public AlipayTradeApplepayAuthenticationSubmitResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeApplepayAuthenticationSubmitResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeApplepayAuthenticationSubmitResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeApplepayAuthenticationSubmitResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeApplepayAuthenticationSubmitResponseModel
  */
  public static AlipayTradeApplepayAuthenticationSubmitResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeApplepayAuthenticationSubmitResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeApplepayAuthenticationSubmitResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

