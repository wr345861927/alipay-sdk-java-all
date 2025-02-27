/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.CampusInfo;
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
 * SchoolBaseInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SchoolBaseInfo {
  public static final String SERIALIZED_NAME_CAMPUS_INFO = "campus_info";
  @SerializedName(SERIALIZED_NAME_CAMPUS_INFO)
  private List<CampusInfo> campusInfo = null;

  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_INST_ID = "inst_id";
  @SerializedName(SERIALIZED_NAME_INST_ID)
  private String instId;

  public static final String SERIALIZED_NAME_INST_NAME = "inst_name";
  @SerializedName(SERIALIZED_NAME_INST_NAME)
  private String instName;

  public static final String SERIALIZED_NAME_INST_STD_CODE = "inst_std_code";
  @SerializedName(SERIALIZED_NAME_INST_STD_CODE)
  private String instStdCode;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public SchoolBaseInfo() { 
  }

  public SchoolBaseInfo campusInfo(List<CampusInfo> campusInfo) {
    
    this.campusInfo = campusInfo;
    return this;
  }

  public SchoolBaseInfo addCampusInfoItem(CampusInfo campusInfoItem) {
    if (this.campusInfo == null) {
      this.campusInfo = new ArrayList<>();
    }
    this.campusInfo.add(campusInfoItem);
    return this;
  }

   /**
   * 校区信息
   * @return campusInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "校区信息")

  public List<CampusInfo> getCampusInfo() {
    return campusInfo;
  }


  public void setCampusInfo(List<CampusInfo> campusInfo) {
    this.campusInfo = campusInfo;
  }


  public SchoolBaseInfo cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 城市编码
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "620900", value = "城市编码")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public SchoolBaseInfo instId(String instId) {
    
    this.instId = instId;
    return this;
  }

   /**
   * 学校内标
   * @return instId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000151541822", value = "学校内标")

  public String getInstId() {
    return instId;
  }


  public void setInstId(String instId) {
    this.instId = instId;
  }


  public SchoolBaseInfo instName(String instName) {
    
    this.instName = instName;
    return this;
  }

   /**
   * 学校名称
   * @return instName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "复旦大学", value = "学校名称")

  public String getInstName() {
    return instName;
  }


  public void setInstName(String instName) {
    this.instName = instName;
  }


  public SchoolBaseInfo instStdCode(String instStdCode) {
    
    this.instStdCode = instStdCode;
    return this;
  }

   /**
   * 学校外标
   * @return instStdCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12510181450882098Q", value = "学校外标")

  public String getInstStdCode() {
    return instStdCode;
  }


  public void setInstStdCode(String instStdCode) {
    this.instStdCode = instStdCode;
  }


  public SchoolBaseInfo provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * 省份编码
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "370000", value = "省份编码")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchoolBaseInfo schoolBaseInfo = (SchoolBaseInfo) o;
    return Objects.equals(this.campusInfo, schoolBaseInfo.campusInfo) &&
        Objects.equals(this.cityCode, schoolBaseInfo.cityCode) &&
        Objects.equals(this.instId, schoolBaseInfo.instId) &&
        Objects.equals(this.instName, schoolBaseInfo.instName) &&
        Objects.equals(this.instStdCode, schoolBaseInfo.instStdCode) &&
        Objects.equals(this.provinceCode, schoolBaseInfo.provinceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campusInfo, cityCode, instId, instName, instStdCode, provinceCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolBaseInfo {\n");
    sb.append("    campusInfo: ").append(toIndentedString(campusInfo)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    instId: ").append(toIndentedString(instId)).append("\n");
    sb.append("    instName: ").append(toIndentedString(instName)).append("\n");
    sb.append("    instStdCode: ").append(toIndentedString(instStdCode)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
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
    openapiFields.add("campus_info");
    openapiFields.add("city_code");
    openapiFields.add("inst_id");
    openapiFields.add("inst_name");
    openapiFields.add("inst_std_code");
    openapiFields.add("province_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SchoolBaseInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SchoolBaseInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SchoolBaseInfo is not found in the empty JSON string", SchoolBaseInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SchoolBaseInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SchoolBaseInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycampusInfo = jsonObj.getAsJsonArray("campus_info");
      if (jsonArraycampusInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("campus_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `campus_info` to be an array in the JSON string but got `%s`", jsonObj.get("campus_info").toString()));
        }

        // validate the optional field `campus_info` (array)
        for (int i = 0; i < jsonArraycampusInfo.size(); i++) {
          CampusInfo.validateJsonObject(jsonArraycampusInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("inst_id") != null && !jsonObj.get("inst_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inst_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inst_id").toString()));
      }
      if (jsonObj.get("inst_name") != null && !jsonObj.get("inst_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inst_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inst_name").toString()));
      }
      if (jsonObj.get("inst_std_code") != null && !jsonObj.get("inst_std_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inst_std_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inst_std_code").toString()));
      }
      if (jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SchoolBaseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SchoolBaseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SchoolBaseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SchoolBaseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SchoolBaseInfo>() {
           @Override
           public void write(JsonWriter out, SchoolBaseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SchoolBaseInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SchoolBaseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SchoolBaseInfo
  * @throws IOException if the JSON string is invalid with respect to SchoolBaseInfo
  */
  public static SchoolBaseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SchoolBaseInfo.class);
  }

 /**
  * Convert an instance of SchoolBaseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

