/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
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
 * UserMailInfoOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserMailInfoOrder {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTY_DISTRICT = "county_district";
  @SerializedName(SERIALIZED_NAME_COUNTY_DISTRICT)
  private String countyDistrict;

  public static final String SERIALIZED_NAME_DETAIL_ADDRESS = "detail_address";
  @SerializedName(SERIALIZED_NAME_DETAIL_ADDRESS)
  private String detailAddress;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_IP_ROLE_ID = "ip_role_id";
  @SerializedName(SERIALIZED_NAME_IP_ROLE_ID)
  private String ipRoleId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private String province;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public UserMailInfoOrder() { 
  }

  public UserMailInfoOrder city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 联系所在城市
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "联系所在城市")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public UserMailInfoOrder country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * 联系人国家
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "联系人国家")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public UserMailInfoOrder countyDistrict(String countyDistrict) {
    
    this.countyDistrict = countyDistrict;
    return this;
  }

   /**
   * 联系人所在县/区
   * @return countyDistrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "联系人所在县/区")

  public String getCountyDistrict() {
    return countyDistrict;
  }


  public void setCountyDistrict(String countyDistrict) {
    this.countyDistrict = countyDistrict;
  }


  public UserMailInfoOrder detailAddress(String detailAddress) {
    
    this.detailAddress = detailAddress;
    return this;
  }

   /**
   * 联系所在详细地址
   * @return detailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "联系所在详细地址")

  public String getDetailAddress() {
    return detailAddress;
  }


  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }


  public UserMailInfoOrder email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 电子邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "电子邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserMailInfoOrder ipRoleId(String ipRoleId) {
    
    this.ipRoleId = ipRoleId;
    return this;
  }

   /**
   * 商户ipRole(pid)
   * @return ipRoleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户ipRole(pid)")

  public String getIpRoleId() {
    return ipRoleId;
  }


  public void setIpRoleId(String ipRoleId) {
    this.ipRoleId = ipRoleId;
  }


  public UserMailInfoOrder name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 联系人名字
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "联系人名字")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserMailInfoOrder province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * 联系人省份
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "联系人省份")

  public String getProvince() {
    return province;
  }


  public void setProvince(String province) {
    this.province = province;
  }


  public UserMailInfoOrder street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * 联系人所在街道
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "联系人所在街道")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public UserMailInfoOrder telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * 联系人电话
   * @return telephone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "联系人电话")

  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
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
   * @return the UserMailInfoOrder instance itself
   */
  public UserMailInfoOrder putAdditionalProperty(String key, Object value) {
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
    UserMailInfoOrder userMailInfoOrder = (UserMailInfoOrder) o;
    return Objects.equals(this.city, userMailInfoOrder.city) &&
        Objects.equals(this.country, userMailInfoOrder.country) &&
        Objects.equals(this.countyDistrict, userMailInfoOrder.countyDistrict) &&
        Objects.equals(this.detailAddress, userMailInfoOrder.detailAddress) &&
        Objects.equals(this.email, userMailInfoOrder.email) &&
        Objects.equals(this.ipRoleId, userMailInfoOrder.ipRoleId) &&
        Objects.equals(this.name, userMailInfoOrder.name) &&
        Objects.equals(this.province, userMailInfoOrder.province) &&
        Objects.equals(this.street, userMailInfoOrder.street) &&
        Objects.equals(this.telephone, userMailInfoOrder.telephone)&&
        Objects.equals(this.additionalProperties, userMailInfoOrder.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, countyDistrict, detailAddress, email, ipRoleId, name, province, street, telephone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMailInfoOrder {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countyDistrict: ").append(toIndentedString(countyDistrict)).append("\n");
    sb.append("    detailAddress: ").append(toIndentedString(detailAddress)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ipRoleId: ").append(toIndentedString(ipRoleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("county_district");
    openapiFields.add("detail_address");
    openapiFields.add("email");
    openapiFields.add("ip_role_id");
    openapiFields.add("name");
    openapiFields.add("province");
    openapiFields.add("street");
    openapiFields.add("telephone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserMailInfoOrder
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserMailInfoOrder.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserMailInfoOrder is not found in the empty JSON string", UserMailInfoOrder.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("county_district") != null && !jsonObj.get("county_district").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `county_district` to be a primitive type in the JSON string but got `%s`", jsonObj.get("county_district").toString()));
      }
      if (jsonObj.get("detail_address") != null && !jsonObj.get("detail_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail_address").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("ip_role_id") != null && !jsonObj.get("ip_role_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_role_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_role_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("province") != null && !jsonObj.get("province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province").toString()));
      }
      if (jsonObj.get("street") != null && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if (jsonObj.get("telephone") != null && !jsonObj.get("telephone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserMailInfoOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserMailInfoOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserMailInfoOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserMailInfoOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<UserMailInfoOrder>() {
           @Override
           public void write(JsonWriter out, UserMailInfoOrder value) throws IOException {
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
           public UserMailInfoOrder read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserMailInfoOrder instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserMailInfoOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserMailInfoOrder
  * @throws IOException if the JSON string is invalid with respect to UserMailInfoOrder
  */
  public static UserMailInfoOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserMailInfoOrder.class);
  }

 /**
  * Convert an instance of UserMailInfoOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

