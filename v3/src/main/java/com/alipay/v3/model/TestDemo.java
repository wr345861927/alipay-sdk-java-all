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
 * TestDemo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestDemo {
  public static final String SERIALIZED_NAME_A_OPEN_ID = "a_open_id";
  @SerializedName(SERIALIZED_NAME_A_OPEN_ID)
  private String aOpenId;

  public static final String SERIALIZED_NAME_A_UID = "a_uid";
  @SerializedName(SERIALIZED_NAME_A_UID)
  private String aUid;

  public static final String SERIALIZED_NAME_DATE_A = "date_a";
  @SerializedName(SERIALIZED_NAME_DATE_A)
  private List<String> dateA = null;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_PRICE_A = "price_a";
  @SerializedName(SERIALIZED_NAME_PRICE_A)
  private List<String> priceA = null;

  public static final String SERIALIZED_NAME_STRING_A = "string_a";
  @SerializedName(SERIALIZED_NAME_STRING_A)
  private List<String> stringA = null;

  public static final String SERIALIZED_NAME_STRING_YINGSHE = "string_yingshe";
  @SerializedName(SERIALIZED_NAME_STRING_YINGSHE)
  private String stringYingshe;

  public static final String SERIALIZED_NAME_STRING_YINGSHE1_OPEN_ID = "string_yingshe_1_open_id";
  @SerializedName(SERIALIZED_NAME_STRING_YINGSHE1_OPEN_ID)
  private String stringYingshe1OpenId;

  public static final String SERIALIZED_NAME_STRING_YINGSHE2_OPENID = "string_yingshe_2_openid";
  @SerializedName(SERIALIZED_NAME_STRING_YINGSHE2_OPENID)
  private String stringYingshe2Openid;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public TestDemo() { 
  }

  public TestDemo aOpenId(String aOpenId) {
    
    this.aOpenId = aOpenId;
    return this;
  }

   /**
   * 1
   * @return aOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1")

  public String getaOpenId() {
    return aOpenId;
  }


  public void setaOpenId(String aOpenId) {
    this.aOpenId = aOpenId;
  }


  public TestDemo aUid(String aUid) {
    
    this.aUid = aUid;
    return this;
  }

   /**
   * 1
   * @return aUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1")

  public String getaUid() {
    return aUid;
  }


  public void setaUid(String aUid) {
    this.aUid = aUid;
  }


  public TestDemo dateA(List<String> dateA) {
    
    this.dateA = dateA;
    return this;
  }

  public TestDemo addDateAItem(String dateAItem) {
    if (this.dateA == null) {
      this.dateA = new ArrayList<>();
    }
    this.dateA.add(dateAItem);
    return this;
  }

   /**
   * test
   * @return dateA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "test")

  public List<String> getDateA() {
    return dateA;
  }


  public void setDateA(List<String> dateA) {
    this.dateA = dateA;
  }


  public TestDemo openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * test(test废弃字段测试)
   * @return openId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "test(test废弃字段测试)")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public TestDemo priceA(List<String> priceA) {
    
    this.priceA = priceA;
    return this;
  }

  public TestDemo addPriceAItem(String priceAItem) {
    if (this.priceA == null) {
      this.priceA = new ArrayList<>();
    }
    this.priceA.add(priceAItem);
    return this;
  }

   /**
   * test
   * @return priceA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "test")

  public List<String> getPriceA() {
    return priceA;
  }


  public void setPriceA(List<String> priceA) {
    this.priceA = priceA;
  }


  public TestDemo stringA(List<String> stringA) {
    
    this.stringA = stringA;
    return this;
  }

  public TestDemo addStringAItem(String stringAItem) {
    if (this.stringA == null) {
      this.stringA = new ArrayList<>();
    }
    this.stringA.add(stringAItem);
    return this;
  }

   /**
   * test
   * @return stringA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "test")

  public List<String> getStringA() {
    return stringA;
  }


  public void setStringA(List<String> stringA) {
    this.stringA = stringA;
  }


  public TestDemo stringYingshe(String stringYingshe) {
    
    this.stringYingshe = stringYingshe;
    return this;
  }

   /**
   * ttes
   * @return stringYingshe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ttes")

  public String getStringYingshe() {
    return stringYingshe;
  }


  public void setStringYingshe(String stringYingshe) {
    this.stringYingshe = stringYingshe;
  }


  public TestDemo stringYingshe1OpenId(String stringYingshe1OpenId) {
    
    this.stringYingshe1OpenId = stringYingshe1OpenId;
    return this;
  }

   /**
   * test
   * @return stringYingshe1OpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "test")

  public String getStringYingshe1OpenId() {
    return stringYingshe1OpenId;
  }


  public void setStringYingshe1OpenId(String stringYingshe1OpenId) {
    this.stringYingshe1OpenId = stringYingshe1OpenId;
  }


  public TestDemo stringYingshe2Openid(String stringYingshe2Openid) {
    
    this.stringYingshe2Openid = stringYingshe2Openid;
    return this;
  }

   /**
   * test
   * @return stringYingshe2Openid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "test")

  public String getStringYingshe2Openid() {
    return stringYingshe2Openid;
  }


  public void setStringYingshe2Openid(String stringYingshe2Openid) {
    this.stringYingshe2Openid = stringYingshe2Openid;
  }


  public TestDemo uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * test(test废弃字段测试)
   * @return uid
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "test(test废弃字段测试)")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
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
   * @return the TestDemo instance itself
   */
  public TestDemo putAdditionalProperty(String key, Object value) {
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
    TestDemo testDemo = (TestDemo) o;
    return Objects.equals(this.aOpenId, testDemo.aOpenId) &&
        Objects.equals(this.aUid, testDemo.aUid) &&
        Objects.equals(this.dateA, testDemo.dateA) &&
        Objects.equals(this.openId, testDemo.openId) &&
        Objects.equals(this.priceA, testDemo.priceA) &&
        Objects.equals(this.stringA, testDemo.stringA) &&
        Objects.equals(this.stringYingshe, testDemo.stringYingshe) &&
        Objects.equals(this.stringYingshe1OpenId, testDemo.stringYingshe1OpenId) &&
        Objects.equals(this.stringYingshe2Openid, testDemo.stringYingshe2Openid) &&
        Objects.equals(this.uid, testDemo.uid)&&
        Objects.equals(this.additionalProperties, testDemo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aOpenId, aUid, dateA, openId, priceA, stringA, stringYingshe, stringYingshe1OpenId, stringYingshe2Openid, uid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestDemo {\n");
    sb.append("    aOpenId: ").append(toIndentedString(aOpenId)).append("\n");
    sb.append("    aUid: ").append(toIndentedString(aUid)).append("\n");
    sb.append("    dateA: ").append(toIndentedString(dateA)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    priceA: ").append(toIndentedString(priceA)).append("\n");
    sb.append("    stringA: ").append(toIndentedString(stringA)).append("\n");
    sb.append("    stringYingshe: ").append(toIndentedString(stringYingshe)).append("\n");
    sb.append("    stringYingshe1OpenId: ").append(toIndentedString(stringYingshe1OpenId)).append("\n");
    sb.append("    stringYingshe2Openid: ").append(toIndentedString(stringYingshe2Openid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("a_open_id");
    openapiFields.add("a_uid");
    openapiFields.add("date_a");
    openapiFields.add("open_id");
    openapiFields.add("price_a");
    openapiFields.add("string_a");
    openapiFields.add("string_yingshe");
    openapiFields.add("string_yingshe_1_open_id");
    openapiFields.add("string_yingshe_2_openid");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestDemo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TestDemo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestDemo is not found in the empty JSON string", TestDemo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("a_open_id") != null && !jsonObj.get("a_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("a_open_id").toString()));
      }
      if (jsonObj.get("a_uid") != null && !jsonObj.get("a_uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("a_uid").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("date_a") != null && !jsonObj.get("date_a").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_a` to be an array in the JSON string but got `%s`", jsonObj.get("date_a").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("price_a") != null && !jsonObj.get("price_a").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_a` to be an array in the JSON string but got `%s`", jsonObj.get("price_a").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("string_a") != null && !jsonObj.get("string_a").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `string_a` to be an array in the JSON string but got `%s`", jsonObj.get("string_a").toString()));
      }
      if (jsonObj.get("string_yingshe") != null && !jsonObj.get("string_yingshe").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `string_yingshe` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string_yingshe").toString()));
      }
      if (jsonObj.get("string_yingshe_1_open_id") != null && !jsonObj.get("string_yingshe_1_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `string_yingshe_1_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string_yingshe_1_open_id").toString()));
      }
      if (jsonObj.get("string_yingshe_2_openid") != null && !jsonObj.get("string_yingshe_2_openid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `string_yingshe_2_openid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string_yingshe_2_openid").toString()));
      }
      if (jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestDemo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestDemo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestDemo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestDemo.class));

       return (TypeAdapter<T>) new TypeAdapter<TestDemo>() {
           @Override
           public void write(JsonWriter out, TestDemo value) throws IOException {
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
           public TestDemo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TestDemo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TestDemo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestDemo
  * @throws IOException if the JSON string is invalid with respect to TestDemo
  */
  public static TestDemo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestDemo.class);
  }

 /**
  * Convert an instance of TestDemo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

