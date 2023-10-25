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
import com.alipay.v3.model.AdvertItem;
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
 * Advert
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Advert {
  public static final String SERIALIZED_NAME_ADVERT_GROUP = "advert_group";
  @SerializedName(SERIALIZED_NAME_ADVERT_GROUP)
  private String advertGroup;

  public static final String SERIALIZED_NAME_ADVERT_ID = "advert_id";
  @SerializedName(SERIALIZED_NAME_ADVERT_ID)
  private String advertId;

  public static final String SERIALIZED_NAME_ADVERT_ITEMS = "advert_items";
  @SerializedName(SERIALIZED_NAME_ADVERT_ITEMS)
  private List<AdvertItem> advertItems = null;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_MOBILE_CLIENT_TYPE = "mobile_client_type";
  @SerializedName(SERIALIZED_NAME_MOBILE_CLIENT_TYPE)
  private String mobileClientType;

  public Advert() { 
  }

  public Advert advertGroup(String advertGroup) {
    
    this.advertGroup = advertGroup;
    return this;
  }

   /**
   * 广告组标识
   * @return advertGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CG202008041013200064690", value = "广告组标识")

  public String getAdvertGroup() {
    return advertGroup;
  }


  public void setAdvertGroup(String advertGroup) {
    this.advertGroup = advertGroup;
  }


  public Advert advertId(String advertId) {
    
    this.advertId = advertId;
    return this;
  }

   /**
   * 广告位id
   * @return advertId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "广告位id")

  public String getAdvertId() {
    return advertId;
  }


  public void setAdvertId(String advertId) {
    this.advertId = advertId;
  }


  public Advert advertItems(List<AdvertItem> advertItems) {
    
    this.advertItems = advertItems;
    return this;
  }

  public Advert addAdvertItemsItem(AdvertItem advertItemsItem) {
    if (this.advertItems == null) {
      this.advertItems = new ArrayList<>();
    }
    this.advertItems.add(advertItemsItem);
    return this;
  }

   /**
   * 广告位轮播内容列表
   * @return advertItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "广告位轮播内容列表")

  public List<AdvertItem> getAdvertItems() {
    return advertItems;
  }


  public void setAdvertItems(List<AdvertItem> advertItems) {
    this.advertItems = advertItems;
  }


  public Advert groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 投放人群分组id
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RQ20191025100100595279", value = "投放人群分组id")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public Advert mobileClientType(String mobileClientType) {
    
    this.mobileClientType = mobileClientType;
    return this;
  }

   /**
   * 手机客户端类型，iphone、android、wp,空为不区分机型
   * @return mobileClientType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "android", value = "手机客户端类型，iphone、android、wp,空为不区分机型")

  public String getMobileClientType() {
    return mobileClientType;
  }


  public void setMobileClientType(String mobileClientType) {
    this.mobileClientType = mobileClientType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Advert advert = (Advert) o;
    return Objects.equals(this.advertGroup, advert.advertGroup) &&
        Objects.equals(this.advertId, advert.advertId) &&
        Objects.equals(this.advertItems, advert.advertItems) &&
        Objects.equals(this.groupId, advert.groupId) &&
        Objects.equals(this.mobileClientType, advert.mobileClientType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertGroup, advertId, advertItems, groupId, mobileClientType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Advert {\n");
    sb.append("    advertGroup: ").append(toIndentedString(advertGroup)).append("\n");
    sb.append("    advertId: ").append(toIndentedString(advertId)).append("\n");
    sb.append("    advertItems: ").append(toIndentedString(advertItems)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    mobileClientType: ").append(toIndentedString(mobileClientType)).append("\n");
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
    openapiFields.add("advert_group");
    openapiFields.add("advert_id");
    openapiFields.add("advert_items");
    openapiFields.add("group_id");
    openapiFields.add("mobile_client_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Advert
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Advert.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Advert is not found in the empty JSON string", Advert.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Advert.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Advert` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("advert_group") != null && !jsonObj.get("advert_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advert_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advert_group").toString()));
      }
      if (jsonObj.get("advert_id") != null && !jsonObj.get("advert_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advert_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advert_id").toString()));
      }
      JsonArray jsonArrayadvertItems = jsonObj.getAsJsonArray("advert_items");
      if (jsonArrayadvertItems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("advert_items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `advert_items` to be an array in the JSON string but got `%s`", jsonObj.get("advert_items").toString()));
        }

        // validate the optional field `advert_items` (array)
        for (int i = 0; i < jsonArrayadvertItems.size(); i++) {
          AdvertItem.validateJsonObject(jsonArrayadvertItems.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("group_id") != null && !jsonObj.get("group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_id").toString()));
      }
      if (jsonObj.get("mobile_client_type") != null && !jsonObj.get("mobile_client_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_client_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_client_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Advert.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Advert' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Advert> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Advert.class));

       return (TypeAdapter<T>) new TypeAdapter<Advert>() {
           @Override
           public void write(JsonWriter out, Advert value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Advert read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Advert given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Advert
  * @throws IOException if the JSON string is invalid with respect to Advert
  */
  public static Advert fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Advert.class);
  }

 /**
  * Convert an instance of Advert to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

