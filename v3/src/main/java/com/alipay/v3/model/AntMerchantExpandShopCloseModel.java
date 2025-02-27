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
 * AntMerchantExpandShopCloseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandShopCloseModel {
  public static final String SERIALIZED_NAME_IP_ROLE_ID = "ip_role_id";
  @SerializedName(SERIALIZED_NAME_IP_ROLE_ID)
  private String ipRoleId;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public AntMerchantExpandShopCloseModel() { 
  }

  public AntMerchantExpandShopCloseModel ipRoleId(String ipRoleId) {
    
    this.ipRoleId = ipRoleId;
    return this;
  }

   /**
   * 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。若未传入shop_id 则本参数与store_id均必填。
   * @return ipRoleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301155943087", value = "商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。若未传入shop_id 则本参数与store_id均必填。")

  public String getIpRoleId() {
    return ipRoleId;
  }


  public void setIpRoleId(String ipRoleId) {
    this.ipRoleId = ipRoleId;
  }


  public AntMerchantExpandShopCloseModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 支付宝侧蚂蚁店铺 id。传入本参数后可不填 store_id 及 ip_role_id。
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018011900502000000005124744", value = "支付宝侧蚂蚁店铺 id。传入本参数后可不填 store_id 及 ip_role_id。")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public AntMerchantExpandShopCloseModel storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 商户侧门店编号。表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号。若未传入 shop_id  则本参数与与ip_role_id均必填。
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO0001", value = "商户侧门店编号。表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号。若未传入 shop_id  则本参数与与ip_role_id均必填。")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntMerchantExpandShopCloseModel antMerchantExpandShopCloseModel = (AntMerchantExpandShopCloseModel) o;
    return Objects.equals(this.ipRoleId, antMerchantExpandShopCloseModel.ipRoleId) &&
        Objects.equals(this.shopId, antMerchantExpandShopCloseModel.shopId) &&
        Objects.equals(this.storeId, antMerchantExpandShopCloseModel.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipRoleId, shopId, storeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandShopCloseModel {\n");
    sb.append("    ipRoleId: ").append(toIndentedString(ipRoleId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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
    openapiFields.add("ip_role_id");
    openapiFields.add("shop_id");
    openapiFields.add("store_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandShopCloseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandShopCloseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandShopCloseModel is not found in the empty JSON string", AntMerchantExpandShopCloseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AntMerchantExpandShopCloseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AntMerchantExpandShopCloseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ip_role_id") != null && !jsonObj.get("ip_role_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_role_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_role_id").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
      if (jsonObj.get("store_id") != null && !jsonObj.get("store_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandShopCloseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandShopCloseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandShopCloseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandShopCloseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandShopCloseModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandShopCloseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AntMerchantExpandShopCloseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AntMerchantExpandShopCloseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandShopCloseModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandShopCloseModel
  */
  public static AntMerchantExpandShopCloseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandShopCloseModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandShopCloseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

