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
import com.alipay.v3.model.ShopCategoryConfigInfo;
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
 * AlipayOfflineMarketShopCategoryQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOfflineMarketShopCategoryQueryResponseModel {
  public static final String SERIALIZED_NAME_SHOP_CATEGORY_CONFIG_INFOS = "shop_category_config_infos";
  @SerializedName(SERIALIZED_NAME_SHOP_CATEGORY_CONFIG_INFOS)
  private List<ShopCategoryConfigInfo> shopCategoryConfigInfos = null;

  public AlipayOfflineMarketShopCategoryQueryResponseModel() { 
  }

  public AlipayOfflineMarketShopCategoryQueryResponseModel shopCategoryConfigInfos(List<ShopCategoryConfigInfo> shopCategoryConfigInfos) {
    
    this.shopCategoryConfigInfos = shopCategoryConfigInfos;
    return this;
  }

  public AlipayOfflineMarketShopCategoryQueryResponseModel addShopCategoryConfigInfosItem(ShopCategoryConfigInfo shopCategoryConfigInfosItem) {
    if (this.shopCategoryConfigInfos == null) {
      this.shopCategoryConfigInfos = new ArrayList<>();
    }
    this.shopCategoryConfigInfos.add(shopCategoryConfigInfosItem);
    return this;
  }

   /**
   * 门店类目配置信息，包括能够开店的叶子节点类目信息，以及类目约束配置信息。
   * @return shopCategoryConfigInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门店类目配置信息，包括能够开店的叶子节点类目信息，以及类目约束配置信息。")

  public List<ShopCategoryConfigInfo> getShopCategoryConfigInfos() {
    return shopCategoryConfigInfos;
  }


  public void setShopCategoryConfigInfos(List<ShopCategoryConfigInfo> shopCategoryConfigInfos) {
    this.shopCategoryConfigInfos = shopCategoryConfigInfos;
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
   * @return the AlipayOfflineMarketShopCategoryQueryResponseModel instance itself
   */
  public AlipayOfflineMarketShopCategoryQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOfflineMarketShopCategoryQueryResponseModel alipayOfflineMarketShopCategoryQueryResponseModel = (AlipayOfflineMarketShopCategoryQueryResponseModel) o;
    return Objects.equals(this.shopCategoryConfigInfos, alipayOfflineMarketShopCategoryQueryResponseModel.shopCategoryConfigInfos)&&
        Objects.equals(this.additionalProperties, alipayOfflineMarketShopCategoryQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopCategoryConfigInfos, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOfflineMarketShopCategoryQueryResponseModel {\n");
    sb.append("    shopCategoryConfigInfos: ").append(toIndentedString(shopCategoryConfigInfos)).append("\n");
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
    openapiFields.add("shop_category_config_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOfflineMarketShopCategoryQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOfflineMarketShopCategoryQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOfflineMarketShopCategoryQueryResponseModel is not found in the empty JSON string", AlipayOfflineMarketShopCategoryQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayshopCategoryConfigInfos = jsonObj.getAsJsonArray("shop_category_config_infos");
      if (jsonArrayshopCategoryConfigInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("shop_category_config_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `shop_category_config_infos` to be an array in the JSON string but got `%s`", jsonObj.get("shop_category_config_infos").toString()));
        }

        // validate the optional field `shop_category_config_infos` (array)
        for (int i = 0; i < jsonArrayshopCategoryConfigInfos.size(); i++) {
          ShopCategoryConfigInfo.validateJsonObject(jsonArrayshopCategoryConfigInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOfflineMarketShopCategoryQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOfflineMarketShopCategoryQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOfflineMarketShopCategoryQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOfflineMarketShopCategoryQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOfflineMarketShopCategoryQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOfflineMarketShopCategoryQueryResponseModel value) throws IOException {
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
           public AlipayOfflineMarketShopCategoryQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOfflineMarketShopCategoryQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOfflineMarketShopCategoryQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOfflineMarketShopCategoryQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOfflineMarketShopCategoryQueryResponseModel
  */
  public static AlipayOfflineMarketShopCategoryQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOfflineMarketShopCategoryQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOfflineMarketShopCategoryQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

