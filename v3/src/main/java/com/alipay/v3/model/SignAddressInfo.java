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
 * SignAddressInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignAddressInfo {
  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_DETAIL_ADDRESS = "detail_address";
  @SerializedName(SERIALIZED_NAME_DETAIL_ADDRESS)
  private String detailAddress;

  public static final String SERIALIZED_NAME_DISTRICT_CODE = "district_code";
  @SerializedName(SERIALIZED_NAME_DISTRICT_CODE)
  private String districtCode;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public SignAddressInfo() { 
  }

  public SignAddressInfo cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 城市编码。请按照&lt;a href&#x3D;\&quot;https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx\&quot;&gt;表格&lt;/a&gt; 中内容填写。 （参考资料： &lt;a href&#x3D;\&quot;http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\&quot;&gt;参考资料&lt;/a&gt;）
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "城市编码。请按照<a href=\"https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx\">表格</a> 中内容填写。 （参考资料： <a href=\"http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\">参考资料</a>）")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public SignAddressInfo countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 国家编码，中国默认：156
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "国家编码，中国默认：156")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public SignAddressInfo detailAddress(String detailAddress) {
    
    this.detailAddress = detailAddress;
    return this;
  }

   /**
   * 详细地址
   * @return detailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "详细地址")

  public String getDetailAddress() {
    return detailAddress;
  }


  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }


  public SignAddressInfo districtCode(String districtCode) {
    
    this.districtCode = districtCode;
    return this;
  }

   /**
   * 区县编码。请按照&lt;a href&#x3D;\&quot;https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx\&quot;&gt;表格&lt;/a&gt; 中内容填写。 （参考资料： &lt;a href&#x3D;\&quot;http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\&quot;&gt;参考资料&lt;/a&gt;）
   * @return districtCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "区县编码。请按照<a href=\"https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx\">表格</a> 中内容填写。 （参考资料： <a href=\"http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\">参考资料</a>）")

  public String getDistrictCode() {
    return districtCode;
  }


  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }


  public SignAddressInfo latitude(String latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * 纬度，浮点型,小数点后最多保留6位 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：&lt;a href&#x3D;\&quot;http://lbs.amap.com/console/show/picker\&quot;&gt;查询地址&lt;/a&gt;
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "纬度，浮点型,小数点后最多保留6位 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：<a href=\"http://lbs.amap.com/console/show/picker\">查询地址</a>")

  public String getLatitude() {
    return latitude;
  }


  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public SignAddressInfo longitude(String longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * 经度，浮点型, 小数点后最多保留6位。 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：&lt;a href&#x3D;\&quot;http://lbs.amap.com/console/show/picker\&quot;&gt;查询地址&lt;/a&gt;
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "经度，浮点型, 小数点后最多保留6位。 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：<a href=\"http://lbs.amap.com/console/show/picker\">查询地址</a>")

  public String getLongitude() {
    return longitude;
  }


  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public SignAddressInfo provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * 省份编码。请按照&lt;a href&#x3D;\&quot;https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx\&quot;&gt;表格&lt;/a&gt; 中内容填写。 （参考资料： &lt;a href&#x3D;\&quot;http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\&quot;&gt;参考资料&lt;/a&gt;）
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "省份编码。请按照<a href=\"https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx\">表格</a> 中内容填写。 （参考资料： <a href=\"http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\">参考资料</a>）")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
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
   * @return the SignAddressInfo instance itself
   */
  public SignAddressInfo putAdditionalProperty(String key, Object value) {
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
    SignAddressInfo signAddressInfo = (SignAddressInfo) o;
    return Objects.equals(this.cityCode, signAddressInfo.cityCode) &&
        Objects.equals(this.countryCode, signAddressInfo.countryCode) &&
        Objects.equals(this.detailAddress, signAddressInfo.detailAddress) &&
        Objects.equals(this.districtCode, signAddressInfo.districtCode) &&
        Objects.equals(this.latitude, signAddressInfo.latitude) &&
        Objects.equals(this.longitude, signAddressInfo.longitude) &&
        Objects.equals(this.provinceCode, signAddressInfo.provinceCode)&&
        Objects.equals(this.additionalProperties, signAddressInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityCode, countryCode, detailAddress, districtCode, latitude, longitude, provinceCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignAddressInfo {\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    detailAddress: ").append(toIndentedString(detailAddress)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
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
    openapiFields.add("city_code");
    openapiFields.add("country_code");
    openapiFields.add("detail_address");
    openapiFields.add("district_code");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("province_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignAddressInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SignAddressInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignAddressInfo is not found in the empty JSON string", SignAddressInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if (jsonObj.get("detail_address") != null && !jsonObj.get("detail_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail_address").toString()));
      }
      if (jsonObj.get("district_code") != null && !jsonObj.get("district_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_code").toString()));
      }
      if (jsonObj.get("latitude") != null && !jsonObj.get("latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latitude").toString()));
      }
      if (jsonObj.get("longitude") != null && !jsonObj.get("longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longitude").toString()));
      }
      if (jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignAddressInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignAddressInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignAddressInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignAddressInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SignAddressInfo>() {
           @Override
           public void write(JsonWriter out, SignAddressInfo value) throws IOException {
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
           public SignAddressInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignAddressInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SignAddressInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignAddressInfo
  * @throws IOException if the JSON string is invalid with respect to SignAddressInfo
  */
  public static SignAddressInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignAddressInfo.class);
  }

 /**
  * Convert an instance of SignAddressInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

