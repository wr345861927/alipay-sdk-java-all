/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-10-25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.BankActivityInfo;
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
 * AlipayCommerceOperationBankActivityQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceOperationBankActivityQueryResponseModel {
  public static final String SERIALIZED_NAME_ACTIVITY_INFO_LIST = "activity_info_list";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_INFO_LIST)
  private List<BankActivityInfo> activityInfoList = null;

  public static final String SERIALIZED_NAME_MERCHANT_TAG = "merchant_tag";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TAG)
  private String merchantTag;

  public AlipayCommerceOperationBankActivityQueryResponseModel() { 
  }

  public AlipayCommerceOperationBankActivityQueryResponseModel activityInfoList(List<BankActivityInfo> activityInfoList) {
    
    this.activityInfoList = activityInfoList;
    return this;
  }

  public AlipayCommerceOperationBankActivityQueryResponseModel addActivityInfoListItem(BankActivityInfo activityInfoListItem) {
    if (this.activityInfoList == null) {
      this.activityInfoList = new ArrayList<>();
    }
    this.activityInfoList.add(activityInfoListItem);
    return this;
  }

   /**
   * 活动信息列表
   * @return activityInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "活动信息列表")

  public List<BankActivityInfo> getActivityInfoList() {
    return activityInfoList;
  }


  public void setActivityInfoList(List<BankActivityInfo> activityInfoList) {
    this.activityInfoList = activityInfoList;
  }


  public AlipayCommerceOperationBankActivityQueryResponseModel merchantTag(String merchantTag) {
    
    this.merchantTag = merchantTag;
    return this;
  }

   /**
   * 商户标签
   * @return merchantTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28949219098127398", value = "商户标签")

  public String getMerchantTag() {
    return merchantTag;
  }


  public void setMerchantTag(String merchantTag) {
    this.merchantTag = merchantTag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceOperationBankActivityQueryResponseModel alipayCommerceOperationBankActivityQueryResponseModel = (AlipayCommerceOperationBankActivityQueryResponseModel) o;
    return Objects.equals(this.activityInfoList, alipayCommerceOperationBankActivityQueryResponseModel.activityInfoList) &&
        Objects.equals(this.merchantTag, alipayCommerceOperationBankActivityQueryResponseModel.merchantTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityInfoList, merchantTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceOperationBankActivityQueryResponseModel {\n");
    sb.append("    activityInfoList: ").append(toIndentedString(activityInfoList)).append("\n");
    sb.append("    merchantTag: ").append(toIndentedString(merchantTag)).append("\n");
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
    openapiFields.add("activity_info_list");
    openapiFields.add("merchant_tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceOperationBankActivityQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceOperationBankActivityQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceOperationBankActivityQueryResponseModel is not found in the empty JSON string", AlipayCommerceOperationBankActivityQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceOperationBankActivityQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceOperationBankActivityQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayactivityInfoList = jsonObj.getAsJsonArray("activity_info_list");
      if (jsonArrayactivityInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("activity_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `activity_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("activity_info_list").toString()));
        }

        // validate the optional field `activity_info_list` (array)
        for (int i = 0; i < jsonArrayactivityInfoList.size(); i++) {
          BankActivityInfo.validateJsonObject(jsonArrayactivityInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("merchant_tag") != null && !jsonObj.get("merchant_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceOperationBankActivityQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceOperationBankActivityQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceOperationBankActivityQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceOperationBankActivityQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceOperationBankActivityQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceOperationBankActivityQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceOperationBankActivityQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceOperationBankActivityQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceOperationBankActivityQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceOperationBankActivityQueryResponseModel
  */
  public static AlipayCommerceOperationBankActivityQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceOperationBankActivityQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceOperationBankActivityQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

