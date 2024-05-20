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
import com.alipay.v3.model.VoucherAvailableGeographyAllShopResultInfo;
import com.alipay.v3.model.VoucherFailShopInfo;
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
 * VoucherAvailableGeographyShopResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherAvailableGeographyShopResultInfo {
  public static final String SERIALIZED_NAME_AVAILABLE_GEOGRAPHY_ALL_SHOP_RESULT_INFO = "available_geography_all_shop_result_info";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_GEOGRAPHY_ALL_SHOP_RESULT_INFO)
  private VoucherAvailableGeographyAllShopResultInfo availableGeographyAllShopResultInfo;

  public static final String SERIALIZED_NAME_FAIL_AVAILABLE_REAL_SHOP_INFOS = "fail_available_real_shop_infos";
  @SerializedName(SERIALIZED_NAME_FAIL_AVAILABLE_REAL_SHOP_INFOS)
  private List<VoucherFailShopInfo> failAvailableRealShopInfos = null;

  public static final String SERIALIZED_NAME_FAIL_AVAILABLE_SHOP_INFOS = "fail_available_shop_infos";
  @SerializedName(SERIALIZED_NAME_FAIL_AVAILABLE_SHOP_INFOS)
  private List<VoucherFailShopInfo> failAvailableShopInfos = null;

  public static final String SERIALIZED_NAME_SUCCESS_AVAILABLE_REAL_SHOP_IDS = "success_available_real_shop_ids";
  @SerializedName(SERIALIZED_NAME_SUCCESS_AVAILABLE_REAL_SHOP_IDS)
  private List<String> successAvailableRealShopIds = null;

  public static final String SERIALIZED_NAME_SUCCESS_AVAILABLE_SHOP_IDS = "success_available_shop_ids";
  @SerializedName(SERIALIZED_NAME_SUCCESS_AVAILABLE_SHOP_IDS)
  private List<String> successAvailableShopIds = null;

  public VoucherAvailableGeographyShopResultInfo() { 
  }

  public VoucherAvailableGeographyShopResultInfo availableGeographyAllShopResultInfo(VoucherAvailableGeographyAllShopResultInfo availableGeographyAllShopResultInfo) {
    
    this.availableGeographyAllShopResultInfo = availableGeographyAllShopResultInfo;
    return this;
  }

   /**
   * Get availableGeographyAllShopResultInfo
   * @return availableGeographyAllShopResultInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableGeographyAllShopResultInfo getAvailableGeographyAllShopResultInfo() {
    return availableGeographyAllShopResultInfo;
  }


  public void setAvailableGeographyAllShopResultInfo(VoucherAvailableGeographyAllShopResultInfo availableGeographyAllShopResultInfo) {
    this.availableGeographyAllShopResultInfo = availableGeographyAllShopResultInfo;
  }


  public VoucherAvailableGeographyShopResultInfo failAvailableRealShopInfos(List<VoucherFailShopInfo> failAvailableRealShopInfos) {
    
    this.failAvailableRealShopInfos = failAvailableRealShopInfos;
    return this;
  }

  public VoucherAvailableGeographyShopResultInfo addFailAvailableRealShopInfosItem(VoucherFailShopInfo failAvailableRealShopInfosItem) {
    if (this.failAvailableRealShopInfos == null) {
      this.failAvailableRealShopInfos = new ArrayList<>();
    }
    this.failAvailableRealShopInfos.add(failAvailableRealShopInfosItem);
    return this;
  }

   /**
   * 失败的物理门店详情。
   * @return failAvailableRealShopInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "失败的物理门店详情。")

  public List<VoucherFailShopInfo> getFailAvailableRealShopInfos() {
    return failAvailableRealShopInfos;
  }


  public void setFailAvailableRealShopInfos(List<VoucherFailShopInfo> failAvailableRealShopInfos) {
    this.failAvailableRealShopInfos = failAvailableRealShopInfos;
  }


  public VoucherAvailableGeographyShopResultInfo failAvailableShopInfos(List<VoucherFailShopInfo> failAvailableShopInfos) {
    
    this.failAvailableShopInfos = failAvailableShopInfos;
    return this;
  }

  public VoucherAvailableGeographyShopResultInfo addFailAvailableShopInfosItem(VoucherFailShopInfo failAvailableShopInfosItem) {
    if (this.failAvailableShopInfos == null) {
      this.failAvailableShopInfos = new ArrayList<>();
    }
    this.failAvailableShopInfos.add(failAvailableShopInfosItem);
    return this;
  }

   /**
   * 失败的可用门店。
   * @return failAvailableShopInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "失败的可用门店。")

  public List<VoucherFailShopInfo> getFailAvailableShopInfos() {
    return failAvailableShopInfos;
  }


  public void setFailAvailableShopInfos(List<VoucherFailShopInfo> failAvailableShopInfos) {
    this.failAvailableShopInfos = failAvailableShopInfos;
  }


  public VoucherAvailableGeographyShopResultInfo successAvailableRealShopIds(List<String> successAvailableRealShopIds) {
    
    this.successAvailableRealShopIds = successAvailableRealShopIds;
    return this;
  }

  public VoucherAvailableGeographyShopResultInfo addSuccessAvailableRealShopIdsItem(String successAvailableRealShopIdsItem) {
    if (this.successAvailableRealShopIds == null) {
      this.successAvailableRealShopIds = new ArrayList<>();
    }
    this.successAvailableRealShopIds.add(successAvailableRealShopIdsItem);
    return this;
  }

   /**
   * 代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id  接口参数是列表类型。
   * @return successAvailableRealShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id  接口参数是列表类型。")

  public List<String> getSuccessAvailableRealShopIds() {
    return successAvailableRealShopIds;
  }


  public void setSuccessAvailableRealShopIds(List<String> successAvailableRealShopIds) {
    this.successAvailableRealShopIds = successAvailableRealShopIds;
  }


  public VoucherAvailableGeographyShopResultInfo successAvailableShopIds(List<String> successAvailableShopIds) {
    
    this.successAvailableShopIds = successAvailableShopIds;
    return this;
  }

  public VoucherAvailableGeographyShopResultInfo addSuccessAvailableShopIdsItem(String successAvailableShopIdsItem) {
    if (this.successAvailableShopIds == null) {
      this.successAvailableShopIds = new ArrayList<>();
    }
    this.successAvailableShopIds.add(successAvailableShopIdsItem);
    return this;
  }

   /**
   * 券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id  接口参数是列表类型。
   * @return successAvailableShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id  接口参数是列表类型。")

  public List<String> getSuccessAvailableShopIds() {
    return successAvailableShopIds;
  }


  public void setSuccessAvailableShopIds(List<String> successAvailableShopIds) {
    this.successAvailableShopIds = successAvailableShopIds;
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
   * @return the VoucherAvailableGeographyShopResultInfo instance itself
   */
  public VoucherAvailableGeographyShopResultInfo putAdditionalProperty(String key, Object value) {
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
    VoucherAvailableGeographyShopResultInfo voucherAvailableGeographyShopResultInfo = (VoucherAvailableGeographyShopResultInfo) o;
    return Objects.equals(this.availableGeographyAllShopResultInfo, voucherAvailableGeographyShopResultInfo.availableGeographyAllShopResultInfo) &&
        Objects.equals(this.failAvailableRealShopInfos, voucherAvailableGeographyShopResultInfo.failAvailableRealShopInfos) &&
        Objects.equals(this.failAvailableShopInfos, voucherAvailableGeographyShopResultInfo.failAvailableShopInfos) &&
        Objects.equals(this.successAvailableRealShopIds, voucherAvailableGeographyShopResultInfo.successAvailableRealShopIds) &&
        Objects.equals(this.successAvailableShopIds, voucherAvailableGeographyShopResultInfo.successAvailableShopIds)&&
        Objects.equals(this.additionalProperties, voucherAvailableGeographyShopResultInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableGeographyAllShopResultInfo, failAvailableRealShopInfos, failAvailableShopInfos, successAvailableRealShopIds, successAvailableShopIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherAvailableGeographyShopResultInfo {\n");
    sb.append("    availableGeographyAllShopResultInfo: ").append(toIndentedString(availableGeographyAllShopResultInfo)).append("\n");
    sb.append("    failAvailableRealShopInfos: ").append(toIndentedString(failAvailableRealShopInfos)).append("\n");
    sb.append("    failAvailableShopInfos: ").append(toIndentedString(failAvailableShopInfos)).append("\n");
    sb.append("    successAvailableRealShopIds: ").append(toIndentedString(successAvailableRealShopIds)).append("\n");
    sb.append("    successAvailableShopIds: ").append(toIndentedString(successAvailableShopIds)).append("\n");
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
    openapiFields.add("available_geography_all_shop_result_info");
    openapiFields.add("fail_available_real_shop_infos");
    openapiFields.add("fail_available_shop_infos");
    openapiFields.add("success_available_real_shop_ids");
    openapiFields.add("success_available_shop_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherAvailableGeographyShopResultInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherAvailableGeographyShopResultInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherAvailableGeographyShopResultInfo is not found in the empty JSON string", VoucherAvailableGeographyShopResultInfo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `available_geography_all_shop_result_info`
      if (jsonObj.getAsJsonObject("available_geography_all_shop_result_info") != null) {
        VoucherAvailableGeographyAllShopResultInfo.validateJsonObject(jsonObj.getAsJsonObject("available_geography_all_shop_result_info"));
      }
      JsonArray jsonArrayfailAvailableRealShopInfos = jsonObj.getAsJsonArray("fail_available_real_shop_infos");
      if (jsonArrayfailAvailableRealShopInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fail_available_real_shop_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fail_available_real_shop_infos` to be an array in the JSON string but got `%s`", jsonObj.get("fail_available_real_shop_infos").toString()));
        }

        // validate the optional field `fail_available_real_shop_infos` (array)
        for (int i = 0; i < jsonArrayfailAvailableRealShopInfos.size(); i++) {
          VoucherFailShopInfo.validateJsonObject(jsonArrayfailAvailableRealShopInfos.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayfailAvailableShopInfos = jsonObj.getAsJsonArray("fail_available_shop_infos");
      if (jsonArrayfailAvailableShopInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fail_available_shop_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fail_available_shop_infos` to be an array in the JSON string but got `%s`", jsonObj.get("fail_available_shop_infos").toString()));
        }

        // validate the optional field `fail_available_shop_infos` (array)
        for (int i = 0; i < jsonArrayfailAvailableShopInfos.size(); i++) {
          VoucherFailShopInfo.validateJsonObject(jsonArrayfailAvailableShopInfos.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("success_available_real_shop_ids") != null && !jsonObj.get("success_available_real_shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `success_available_real_shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("success_available_real_shop_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("success_available_shop_ids") != null && !jsonObj.get("success_available_shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `success_available_shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("success_available_shop_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherAvailableGeographyShopResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherAvailableGeographyShopResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherAvailableGeographyShopResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherAvailableGeographyShopResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherAvailableGeographyShopResultInfo>() {
           @Override
           public void write(JsonWriter out, VoucherAvailableGeographyShopResultInfo value) throws IOException {
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
           public VoucherAvailableGeographyShopResultInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherAvailableGeographyShopResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherAvailableGeographyShopResultInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherAvailableGeographyShopResultInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherAvailableGeographyShopResultInfo
  */
  public static VoucherAvailableGeographyShopResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherAvailableGeographyShopResultInfo.class);
  }

 /**
  * Convert an instance of VoucherAvailableGeographyShopResultInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

