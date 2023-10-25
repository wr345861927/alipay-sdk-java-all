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
 * AlipayMerchantIotDeviceQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantIotDeviceQueryResponseModel {
  public static final String SERIALIZED_NAME_MERCHANT_TYPE = "merchant_type";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TYPE)
  private String merchantType;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public static final String SERIALIZED_NAME_SMID = "smid";
  @SerializedName(SERIALIZED_NAME_SMID)
  private String smid;

  public AlipayMerchantIotDeviceQueryResponseModel() { 
  }

  public AlipayMerchantIotDeviceQueryResponseModel merchantType(String merchantType) {
    
    this.merchantType = merchantType;
    return this;
  }

   /**
   * 商户类型。direct表示直连商户，indirect表示间连商户。
   * @return merchantType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "indirect", value = "商户类型。direct表示直连商户，indirect表示间连商户。")

  public String getMerchantType() {
    return merchantType;
  }


  public void setMerchantType(String merchantType) {
    this.merchantType = merchantType;
  }


  public AlipayMerchantIotDeviceQueryResponseModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 设备绑定的商户支付宝pid。直连场景为商户收单pid，间连场景为商户smid绑定的pid。
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101112139885", value = "设备绑定的商户支付宝pid。直连场景为商户收单pid，间连场景为商户smid绑定的pid。")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipayMerchantIotDeviceQueryResponseModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 设备绑定的门店ID。
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020081700502012300038796029", value = "设备绑定的门店ID。")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public AlipayMerchantIotDeviceQueryResponseModel smid(String smid) {
    
    this.smid = smid;
    return this;
  }

   /**
   * 商户smid。直连场景为空。
   * @return smid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101112139886", value = "商户smid。直连场景为空。")

  public String getSmid() {
    return smid;
  }


  public void setSmid(String smid) {
    this.smid = smid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMerchantIotDeviceQueryResponseModel alipayMerchantIotDeviceQueryResponseModel = (AlipayMerchantIotDeviceQueryResponseModel) o;
    return Objects.equals(this.merchantType, alipayMerchantIotDeviceQueryResponseModel.merchantType) &&
        Objects.equals(this.pid, alipayMerchantIotDeviceQueryResponseModel.pid) &&
        Objects.equals(this.shopId, alipayMerchantIotDeviceQueryResponseModel.shopId) &&
        Objects.equals(this.smid, alipayMerchantIotDeviceQueryResponseModel.smid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantType, pid, shopId, smid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantIotDeviceQueryResponseModel {\n");
    sb.append("    merchantType: ").append(toIndentedString(merchantType)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    smid: ").append(toIndentedString(smid)).append("\n");
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
    openapiFields.add("merchant_type");
    openapiFields.add("pid");
    openapiFields.add("shop_id");
    openapiFields.add("smid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantIotDeviceQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantIotDeviceQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantIotDeviceQueryResponseModel is not found in the empty JSON string", AlipayMerchantIotDeviceQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMerchantIotDeviceQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMerchantIotDeviceQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("merchant_type") != null && !jsonObj.get("merchant_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_type").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
      if (jsonObj.get("smid") != null && !jsonObj.get("smid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantIotDeviceQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantIotDeviceQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantIotDeviceQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantIotDeviceQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantIotDeviceQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantIotDeviceQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMerchantIotDeviceQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMerchantIotDeviceQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantIotDeviceQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantIotDeviceQueryResponseModel
  */
  public static AlipayMerchantIotDeviceQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantIotDeviceQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantIotDeviceQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

