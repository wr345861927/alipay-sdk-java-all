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
import com.alipay.v3.model.EnterpriseInfoDTO;
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
 * AlipayCommerceEcUserEnterpriseQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcUserEnterpriseQueryResponseModel {
  public static final String SERIALIZED_NAME_ENTERPRISE_INFO_LIST = "enterprise_info_list";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_INFO_LIST)
  private List<EnterpriseInfoDTO> enterpriseInfoList = null;

  public AlipayCommerceEcUserEnterpriseQueryResponseModel() { 
  }

  public AlipayCommerceEcUserEnterpriseQueryResponseModel enterpriseInfoList(List<EnterpriseInfoDTO> enterpriseInfoList) {
    
    this.enterpriseInfoList = enterpriseInfoList;
    return this;
  }

  public AlipayCommerceEcUserEnterpriseQueryResponseModel addEnterpriseInfoListItem(EnterpriseInfoDTO enterpriseInfoListItem) {
    if (this.enterpriseInfoList == null) {
      this.enterpriseInfoList = new ArrayList<>();
    }
    this.enterpriseInfoList.add(enterpriseInfoListItem);
    return this;
  }

   /**
   * 用户所属企业列表
   * @return enterpriseInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户所属企业列表")

  public List<EnterpriseInfoDTO> getEnterpriseInfoList() {
    return enterpriseInfoList;
  }


  public void setEnterpriseInfoList(List<EnterpriseInfoDTO> enterpriseInfoList) {
    this.enterpriseInfoList = enterpriseInfoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceEcUserEnterpriseQueryResponseModel alipayCommerceEcUserEnterpriseQueryResponseModel = (AlipayCommerceEcUserEnterpriseQueryResponseModel) o;
    return Objects.equals(this.enterpriseInfoList, alipayCommerceEcUserEnterpriseQueryResponseModel.enterpriseInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterpriseInfoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcUserEnterpriseQueryResponseModel {\n");
    sb.append("    enterpriseInfoList: ").append(toIndentedString(enterpriseInfoList)).append("\n");
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
    openapiFields.add("enterprise_info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcUserEnterpriseQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcUserEnterpriseQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcUserEnterpriseQueryResponseModel is not found in the empty JSON string", AlipayCommerceEcUserEnterpriseQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceEcUserEnterpriseQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceEcUserEnterpriseQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayenterpriseInfoList = jsonObj.getAsJsonArray("enterprise_info_list");
      if (jsonArrayenterpriseInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("enterprise_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `enterprise_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("enterprise_info_list").toString()));
        }

        // validate the optional field `enterprise_info_list` (array)
        for (int i = 0; i < jsonArrayenterpriseInfoList.size(); i++) {
          EnterpriseInfoDTO.validateJsonObject(jsonArrayenterpriseInfoList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcUserEnterpriseQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcUserEnterpriseQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcUserEnterpriseQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcUserEnterpriseQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcUserEnterpriseQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcUserEnterpriseQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceEcUserEnterpriseQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceEcUserEnterpriseQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcUserEnterpriseQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcUserEnterpriseQueryResponseModel
  */
  public static AlipayCommerceEcUserEnterpriseQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcUserEnterpriseQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcUserEnterpriseQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

