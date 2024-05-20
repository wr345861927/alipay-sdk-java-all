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
 * ServiceRecordCatRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceRecordCatRequest {
  public static final String SERIALIZED_NAME_CAT_NAME = "cat_name";
  @SerializedName(SERIALIZED_NAME_CAT_NAME)
  private String catName;

  public static final String SERIALIZED_NAME_FIRST_CAT = "first_cat";
  @SerializedName(SERIALIZED_NAME_FIRST_CAT)
  private String firstCat;

  public static final String SERIALIZED_NAME_FOURTH_CAT = "fourth_cat";
  @SerializedName(SERIALIZED_NAME_FOURTH_CAT)
  private String fourthCat;

  public static final String SERIALIZED_NAME_INSTENCE_CODE = "instence_code";
  @SerializedName(SERIALIZED_NAME_INSTENCE_CODE)
  private String instenceCode;

  public static final String SERIALIZED_NAME_SECOND_CAT = "second_cat";
  @SerializedName(SERIALIZED_NAME_SECOND_CAT)
  private String secondCat;

  public static final String SERIALIZED_NAME_THIRD_CAT = "third_cat";
  @SerializedName(SERIALIZED_NAME_THIRD_CAT)
  private String thirdCat;

  public ServiceRecordCatRequest() { 
  }

  public ServiceRecordCatRequest catName(String catName) {
    
    this.catName = catName;
    return this;
  }

   /**
   * 类目名称(需要每一级用;分隔封装)
   * @return catName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "类目名称(需要每一级用;分隔封装)")

  public String getCatName() {
    return catName;
  }


  public void setCatName(String catName) {
    this.catName = catName;
  }


  public ServiceRecordCatRequest firstCat(String firstCat) {
    
    this.firstCat = firstCat;
    return this;
  }

   /**
   * 一级类目编码
   * @return firstCat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "一级类目编码")

  public String getFirstCat() {
    return firstCat;
  }


  public void setFirstCat(String firstCat) {
    this.firstCat = firstCat;
  }


  public ServiceRecordCatRequest fourthCat(String fourthCat) {
    
    this.fourthCat = fourthCat;
    return this;
  }

   /**
   * 四级类目编码
   * @return fourthCat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "四级类目编码")

  public String getFourthCat() {
    return fourthCat;
  }


  public void setFourthCat(String fourthCat) {
    this.fourthCat = fourthCat;
  }


  public ServiceRecordCatRequest instenceCode(String instenceCode) {
    
    this.instenceCode = instenceCode;
    return this;
  }

   /**
   * 类目树编码
   * @return instenceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "类目树编码")

  public String getInstenceCode() {
    return instenceCode;
  }


  public void setInstenceCode(String instenceCode) {
    this.instenceCode = instenceCode;
  }


  public ServiceRecordCatRequest secondCat(String secondCat) {
    
    this.secondCat = secondCat;
    return this;
  }

   /**
   * 二级类目编码
   * @return secondCat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "二级类目编码")

  public String getSecondCat() {
    return secondCat;
  }


  public void setSecondCat(String secondCat) {
    this.secondCat = secondCat;
  }


  public ServiceRecordCatRequest thirdCat(String thirdCat) {
    
    this.thirdCat = thirdCat;
    return this;
  }

   /**
   * 三级类目编码
   * @return thirdCat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "三级类目编码")

  public String getThirdCat() {
    return thirdCat;
  }


  public void setThirdCat(String thirdCat) {
    this.thirdCat = thirdCat;
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
   * @return the ServiceRecordCatRequest instance itself
   */
  public ServiceRecordCatRequest putAdditionalProperty(String key, Object value) {
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
    ServiceRecordCatRequest serviceRecordCatRequest = (ServiceRecordCatRequest) o;
    return Objects.equals(this.catName, serviceRecordCatRequest.catName) &&
        Objects.equals(this.firstCat, serviceRecordCatRequest.firstCat) &&
        Objects.equals(this.fourthCat, serviceRecordCatRequest.fourthCat) &&
        Objects.equals(this.instenceCode, serviceRecordCatRequest.instenceCode) &&
        Objects.equals(this.secondCat, serviceRecordCatRequest.secondCat) &&
        Objects.equals(this.thirdCat, serviceRecordCatRequest.thirdCat)&&
        Objects.equals(this.additionalProperties, serviceRecordCatRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catName, firstCat, fourthCat, instenceCode, secondCat, thirdCat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRecordCatRequest {\n");
    sb.append("    catName: ").append(toIndentedString(catName)).append("\n");
    sb.append("    firstCat: ").append(toIndentedString(firstCat)).append("\n");
    sb.append("    fourthCat: ").append(toIndentedString(fourthCat)).append("\n");
    sb.append("    instenceCode: ").append(toIndentedString(instenceCode)).append("\n");
    sb.append("    secondCat: ").append(toIndentedString(secondCat)).append("\n");
    sb.append("    thirdCat: ").append(toIndentedString(thirdCat)).append("\n");
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
    openapiFields.add("cat_name");
    openapiFields.add("first_cat");
    openapiFields.add("fourth_cat");
    openapiFields.add("instence_code");
    openapiFields.add("second_cat");
    openapiFields.add("third_cat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceRecordCatRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ServiceRecordCatRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceRecordCatRequest is not found in the empty JSON string", ServiceRecordCatRequest.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("cat_name") != null && !jsonObj.get("cat_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cat_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cat_name").toString()));
      }
      if (jsonObj.get("first_cat") != null && !jsonObj.get("first_cat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_cat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_cat").toString()));
      }
      if (jsonObj.get("fourth_cat") != null && !jsonObj.get("fourth_cat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fourth_cat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fourth_cat").toString()));
      }
      if (jsonObj.get("instence_code") != null && !jsonObj.get("instence_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instence_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instence_code").toString()));
      }
      if (jsonObj.get("second_cat") != null && !jsonObj.get("second_cat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `second_cat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("second_cat").toString()));
      }
      if (jsonObj.get("third_cat") != null && !jsonObj.get("third_cat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_cat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_cat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceRecordCatRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceRecordCatRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceRecordCatRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceRecordCatRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceRecordCatRequest>() {
           @Override
           public void write(JsonWriter out, ServiceRecordCatRequest value) throws IOException {
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
           public ServiceRecordCatRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceRecordCatRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceRecordCatRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceRecordCatRequest
  * @throws IOException if the JSON string is invalid with respect to ServiceRecordCatRequest
  */
  public static ServiceRecordCatRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceRecordCatRequest.class);
  }

 /**
  * Convert an instance of ServiceRecordCatRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

