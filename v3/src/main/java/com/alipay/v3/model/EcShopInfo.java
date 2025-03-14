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
 * EcShopInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EcShopInfo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY_ID = "city_id";
  @SerializedName(SERIALIZED_NAME_CITY_ID)
  private String cityId;

  public static final String SERIALIZED_NAME_CITY_NAME = "city_name";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName;

  public static final String SERIALIZED_NAME_DISTRICT_ID = "district_id";
  @SerializedName(SERIALIZED_NAME_DISTRICT_ID)
  private String districtId;

  public static final String SERIALIZED_NAME_DISTRICT_NAME = "district_name";
  @SerializedName(SERIALIZED_NAME_DISTRICT_NAME)
  private String districtName;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_MCC_CODE1 = "mcc_code_1";
  @SerializedName(SERIALIZED_NAME_MCC_CODE1)
  private String mccCode1;

  public static final String SERIALIZED_NAME_MCC_CODE2 = "mcc_code_2";
  @SerializedName(SERIALIZED_NAME_MCC_CODE2)
  private String mccCode2;

  public static final String SERIALIZED_NAME_MCC_NAME1 = "mcc_name_1";
  @SerializedName(SERIALIZED_NAME_MCC_NAME1)
  private String mccName1;

  public static final String SERIALIZED_NAME_MCC_NAME2 = "mcc_name_2";
  @SerializedName(SERIALIZED_NAME_MCC_NAME2)
  private String mccName2;

  public static final String SERIALIZED_NAME_OUTDOOR_IMG_URL = "outdoor_img_url";
  @SerializedName(SERIALIZED_NAME_OUTDOOR_IMG_URL)
  private String outdoorImgUrl;

  public static final String SERIALIZED_NAME_POI_ID = "poi_id";
  @SerializedName(SERIALIZED_NAME_POI_ID)
  private String poiId;

  public static final String SERIALIZED_NAME_PROVINCE_ID = "province_id";
  @SerializedName(SERIALIZED_NAME_PROVINCE_ID)
  private String provinceId;

  public static final String SERIALIZED_NAME_PROVINCE_NAME = "province_name";
  @SerializedName(SERIALIZED_NAME_PROVINCE_NAME)
  private String provinceName;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName;

  public EcShopInfo() { 
  }

  public EcShopInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 门店地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx大道xxx号", value = "门店地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public EcShopInfo cityId(String cityId) {
    
    this.cityId = cityId;
    return this;
  }

   /**
   * 城市编码
   * @return cityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330100", value = "城市编码")

  public String getCityId() {
    return cityId;
  }


  public void setCityId(String cityId) {
    this.cityId = cityId;
  }


  public EcShopInfo cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 城市名称
   * @return cityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "成都市", value = "城市名称")

  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public EcShopInfo districtId(String districtId) {
    
    this.districtId = districtId;
    return this;
  }

   /**
   * 区编码
   * @return districtId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330101", value = "区编码")

  public String getDistrictId() {
    return districtId;
  }


  public void setDistrictId(String districtId) {
    this.districtId = districtId;
  }


  public EcShopInfo districtName(String districtName) {
    
    this.districtName = districtName;
    return this;
  }

   /**
   * 区名称
   * @return districtName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "武侯区", value = "区名称")

  public String getDistrictName() {
    return districtName;
  }


  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }


  public EcShopInfo latitude(String latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * 纬度
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "29.333", value = "纬度")

  public String getLatitude() {
    return latitude;
  }


  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public EcShopInfo longitude(String longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * 经度
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "121.222", value = "经度")

  public String getLongitude() {
    return longitude;
  }


  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public EcShopInfo mccCode1(String mccCode1) {
    
    this.mccCode1 = mccCode1;
    return this;
  }

   /**
   * 一级mcc编码
   * @return mccCode1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A0001", value = "一级mcc编码")

  public String getMccCode1() {
    return mccCode1;
  }


  public void setMccCode1(String mccCode1) {
    this.mccCode1 = mccCode1;
  }


  public EcShopInfo mccCode2(String mccCode2) {
    
    this.mccCode2 = mccCode2;
    return this;
  }

   /**
   * 二级mcc编码
   * @return mccCode2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B0001", value = "二级mcc编码")

  public String getMccCode2() {
    return mccCode2;
  }


  public void setMccCode2(String mccCode2) {
    this.mccCode2 = mccCode2;
  }


  public EcShopInfo mccName1(String mccName1) {
    
    this.mccName1 = mccName1;
    return this;
  }

   /**
   * 一级mcc名称
   * @return mccName1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "餐饮", value = "一级mcc名称")

  public String getMccName1() {
    return mccName1;
  }


  public void setMccName1(String mccName1) {
    this.mccName1 = mccName1;
  }


  public EcShopInfo mccName2(String mccName2) {
    
    this.mccName2 = mccName2;
    return this;
  }

   /**
   * 二级mcc名称
   * @return mccName2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "中式快餐", value = "二级mcc名称")

  public String getMccName2() {
    return mccName2;
  }


  public void setMccName2(String mccName2) {
    this.mccName2 = mccName2;
  }


  public EcShopInfo outdoorImgUrl(String outdoorImgUrl) {
    
    this.outdoorImgUrl = outdoorImgUrl;
    return this;
  }

   /**
   * 门头照地址
   * @return outdoorImgUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://xxxx.png", value = "门头照地址")

  public String getOutdoorImgUrl() {
    return outdoorImgUrl;
  }


  public void setOutdoorImgUrl(String outdoorImgUrl) {
    this.outdoorImgUrl = outdoorImgUrl;
  }


  public EcShopInfo poiId(String poiId) {
    
    this.poiId = poiId;
    return this;
  }

   /**
   * 高德poiId
   * @return poiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B0G29CP65Q", value = "高德poiId")

  public String getPoiId() {
    return poiId;
  }


  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }


  public EcShopInfo provinceId(String provinceId) {
    
    this.provinceId = provinceId;
    return this;
  }

   /**
   * 省份编码
   * @return provinceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330000", value = "省份编码")

  public String getProvinceId() {
    return provinceId;
  }


  public void setProvinceId(String provinceId) {
    this.provinceId = provinceId;
  }


  public EcShopInfo provinceName(String provinceName) {
    
    this.provinceName = provinceName;
    return this;
  }

   /**
   * 省份名称
   * @return provinceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "四川省", value = "省份名称")

  public String getProvinceName() {
    return provinceName;
  }


  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }


  public EcShopInfo shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 门店名称
   * @return shopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx门店", value = "门店名称")

  public String getShopName() {
    return shopName;
  }


  public void setShopName(String shopName) {
    this.shopName = shopName;
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
   * @return the EcShopInfo instance itself
   */
  public EcShopInfo putAdditionalProperty(String key, Object value) {
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
    EcShopInfo ecShopInfo = (EcShopInfo) o;
    return Objects.equals(this.address, ecShopInfo.address) &&
        Objects.equals(this.cityId, ecShopInfo.cityId) &&
        Objects.equals(this.cityName, ecShopInfo.cityName) &&
        Objects.equals(this.districtId, ecShopInfo.districtId) &&
        Objects.equals(this.districtName, ecShopInfo.districtName) &&
        Objects.equals(this.latitude, ecShopInfo.latitude) &&
        Objects.equals(this.longitude, ecShopInfo.longitude) &&
        Objects.equals(this.mccCode1, ecShopInfo.mccCode1) &&
        Objects.equals(this.mccCode2, ecShopInfo.mccCode2) &&
        Objects.equals(this.mccName1, ecShopInfo.mccName1) &&
        Objects.equals(this.mccName2, ecShopInfo.mccName2) &&
        Objects.equals(this.outdoorImgUrl, ecShopInfo.outdoorImgUrl) &&
        Objects.equals(this.poiId, ecShopInfo.poiId) &&
        Objects.equals(this.provinceId, ecShopInfo.provinceId) &&
        Objects.equals(this.provinceName, ecShopInfo.provinceName) &&
        Objects.equals(this.shopName, ecShopInfo.shopName)&&
        Objects.equals(this.additionalProperties, ecShopInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, cityId, cityName, districtId, districtName, latitude, longitude, mccCode1, mccCode2, mccName1, mccName2, outdoorImgUrl, poiId, provinceId, provinceName, shopName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcShopInfo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    mccCode1: ").append(toIndentedString(mccCode1)).append("\n");
    sb.append("    mccCode2: ").append(toIndentedString(mccCode2)).append("\n");
    sb.append("    mccName1: ").append(toIndentedString(mccName1)).append("\n");
    sb.append("    mccName2: ").append(toIndentedString(mccName2)).append("\n");
    sb.append("    outdoorImgUrl: ").append(toIndentedString(outdoorImgUrl)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    provinceId: ").append(toIndentedString(provinceId)).append("\n");
    sb.append("    provinceName: ").append(toIndentedString(provinceName)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("city_id");
    openapiFields.add("city_name");
    openapiFields.add("district_id");
    openapiFields.add("district_name");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("mcc_code_1");
    openapiFields.add("mcc_code_2");
    openapiFields.add("mcc_name_1");
    openapiFields.add("mcc_name_2");
    openapiFields.add("outdoor_img_url");
    openapiFields.add("poi_id");
    openapiFields.add("province_id");
    openapiFields.add("province_name");
    openapiFields.add("shop_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EcShopInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EcShopInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EcShopInfo is not found in the empty JSON string", EcShopInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("city_id") != null && !jsonObj.get("city_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_id").toString()));
      }
      if (jsonObj.get("city_name") != null && !jsonObj.get("city_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_name").toString()));
      }
      if (jsonObj.get("district_id") != null && !jsonObj.get("district_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_id").toString()));
      }
      if (jsonObj.get("district_name") != null && !jsonObj.get("district_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_name").toString()));
      }
      if (jsonObj.get("latitude") != null && !jsonObj.get("latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latitude").toString()));
      }
      if (jsonObj.get("longitude") != null && !jsonObj.get("longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longitude").toString()));
      }
      if (jsonObj.get("mcc_code_1") != null && !jsonObj.get("mcc_code_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_code_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_code_1").toString()));
      }
      if (jsonObj.get("mcc_code_2") != null && !jsonObj.get("mcc_code_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_code_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_code_2").toString()));
      }
      if (jsonObj.get("mcc_name_1") != null && !jsonObj.get("mcc_name_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_name_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_name_1").toString()));
      }
      if (jsonObj.get("mcc_name_2") != null && !jsonObj.get("mcc_name_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_name_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_name_2").toString()));
      }
      if (jsonObj.get("outdoor_img_url") != null && !jsonObj.get("outdoor_img_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outdoor_img_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outdoor_img_url").toString()));
      }
      if (jsonObj.get("poi_id") != null && !jsonObj.get("poi_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poi_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poi_id").toString()));
      }
      if (jsonObj.get("province_id") != null && !jsonObj.get("province_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_id").toString()));
      }
      if (jsonObj.get("province_name") != null && !jsonObj.get("province_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_name").toString()));
      }
      if (jsonObj.get("shop_name") != null && !jsonObj.get("shop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EcShopInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EcShopInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EcShopInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EcShopInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<EcShopInfo>() {
           @Override
           public void write(JsonWriter out, EcShopInfo value) throws IOException {
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
           public EcShopInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EcShopInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EcShopInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EcShopInfo
  * @throws IOException if the JSON string is invalid with respect to EcShopInfo
  */
  public static EcShopInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EcShopInfo.class);
  }

 /**
  * Convert an instance of EcShopInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

