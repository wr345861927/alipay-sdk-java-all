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
import com.alipay.v3.model.AuthorizeDetailDTO;
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
 * AuthorizedRuleDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthorizedRuleDTO {
  public static final String SERIALIZED_NAME_AUTHORIZED_DETAIL_LIST = "authorized_detail_list";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_DETAIL_LIST)
  private List<AuthorizeDetailDTO> authorizedDetailList = null;

  public static final String SERIALIZED_NAME_AUTHORIZED_TYPE = "authorized_type";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_TYPE)
  private String authorizedType;

  public AuthorizedRuleDTO() { 
  }

  public AuthorizedRuleDTO authorizedDetailList(List<AuthorizeDetailDTO> authorizedDetailList) {
    
    this.authorizedDetailList = authorizedDetailList;
    return this;
  }

  public AuthorizedRuleDTO addAuthorizedDetailListItem(AuthorizeDetailDTO authorizedDetailListItem) {
    if (this.authorizedDetailList == null) {
      this.authorizedDetailList = new ArrayList<>();
    }
    this.authorizedDetailList.add(authorizedDetailListItem);
    return this;
  }

   /**
   * 授权商户列表
   * @return authorizedDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "授权商户列表")

  public List<AuthorizeDetailDTO> getAuthorizedDetailList() {
    return authorizedDetailList;
  }


  public void setAuthorizedDetailList(List<AuthorizeDetailDTO> authorizedDetailList) {
    this.authorizedDetailList = authorizedDetailList;
  }


  public AuthorizedRuleDTO authorizedType(String authorizedType) {
    
    this.authorizedType = authorizedType;
    return this;
  }

   /**
   * WHITELIST-白名单 ALL-全部
   * @return authorizedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "WHITELIST-白名单 ALL-全部")

  public String getAuthorizedType() {
    return authorizedType;
  }


  public void setAuthorizedType(String authorizedType) {
    this.authorizedType = authorizedType;
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
   * @return the AuthorizedRuleDTO instance itself
   */
  public AuthorizedRuleDTO putAdditionalProperty(String key, Object value) {
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
    AuthorizedRuleDTO authorizedRuleDTO = (AuthorizedRuleDTO) o;
    return Objects.equals(this.authorizedDetailList, authorizedRuleDTO.authorizedDetailList) &&
        Objects.equals(this.authorizedType, authorizedRuleDTO.authorizedType)&&
        Objects.equals(this.additionalProperties, authorizedRuleDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedDetailList, authorizedType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedRuleDTO {\n");
    sb.append("    authorizedDetailList: ").append(toIndentedString(authorizedDetailList)).append("\n");
    sb.append("    authorizedType: ").append(toIndentedString(authorizedType)).append("\n");
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
    openapiFields.add("authorized_detail_list");
    openapiFields.add("authorized_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizedRuleDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthorizedRuleDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizedRuleDTO is not found in the empty JSON string", AuthorizedRuleDTO.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayauthorizedDetailList = jsonObj.getAsJsonArray("authorized_detail_list");
      if (jsonArrayauthorizedDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("authorized_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `authorized_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("authorized_detail_list").toString()));
        }

        // validate the optional field `authorized_detail_list` (array)
        for (int i = 0; i < jsonArrayauthorizedDetailList.size(); i++) {
          AuthorizeDetailDTO.validateJsonObject(jsonArrayauthorizedDetailList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("authorized_type") != null && !jsonObj.get("authorized_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorized_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorized_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizedRuleDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizedRuleDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizedRuleDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizedRuleDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizedRuleDTO>() {
           @Override
           public void write(JsonWriter out, AuthorizedRuleDTO value) throws IOException {
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
           public AuthorizedRuleDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthorizedRuleDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthorizedRuleDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizedRuleDTO
  * @throws IOException if the JSON string is invalid with respect to AuthorizedRuleDTO
  */
  public static AuthorizedRuleDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizedRuleDTO.class);
  }

 /**
  * Convert an instance of AuthorizedRuleDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

