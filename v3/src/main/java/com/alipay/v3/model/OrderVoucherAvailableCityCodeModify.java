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
 * OrderVoucherAvailableCityCodeModify
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderVoucherAvailableCityCodeModify {
  public static final String SERIALIZED_NAME_CITY_CODES = "city_codes";
  @SerializedName(SERIALIZED_NAME_CITY_CODES)
  private List<String> cityCodes = null;

  public OrderVoucherAvailableCityCodeModify() { 
  }

  public OrderVoucherAvailableCityCodeModify cityCodes(List<String> cityCodes) {
    
    this.cityCodes = cityCodes;
    return this;
  }

  public OrderVoucherAvailableCityCodeModify addCityCodesItem(String cityCodesItem) {
    if (this.cityCodes == null) {
      this.cityCodes = new ArrayList<>();
    }
    this.cityCodes.add(cityCodesItem);
    return this;
  }

   /**
   * 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
   * @return cityCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"100100\"]", value = "城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）")

  public List<String> getCityCodes() {
    return cityCodes;
  }


  public void setCityCodes(List<String> cityCodes) {
    this.cityCodes = cityCodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderVoucherAvailableCityCodeModify orderVoucherAvailableCityCodeModify = (OrderVoucherAvailableCityCodeModify) o;
    return Objects.equals(this.cityCodes, orderVoucherAvailableCityCodeModify.cityCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderVoucherAvailableCityCodeModify {\n");
    sb.append("    cityCodes: ").append(toIndentedString(cityCodes)).append("\n");
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
    openapiFields.add("city_codes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderVoucherAvailableCityCodeModify
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderVoucherAvailableCityCodeModify.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderVoucherAvailableCityCodeModify is not found in the empty JSON string", OrderVoucherAvailableCityCodeModify.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderVoucherAvailableCityCodeModify.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderVoucherAvailableCityCodeModify` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("city_codes") != null && !jsonObj.get("city_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_codes` to be an array in the JSON string but got `%s`", jsonObj.get("city_codes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderVoucherAvailableCityCodeModify.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderVoucherAvailableCityCodeModify' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderVoucherAvailableCityCodeModify> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderVoucherAvailableCityCodeModify.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderVoucherAvailableCityCodeModify>() {
           @Override
           public void write(JsonWriter out, OrderVoucherAvailableCityCodeModify value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderVoucherAvailableCityCodeModify read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderVoucherAvailableCityCodeModify given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderVoucherAvailableCityCodeModify
  * @throws IOException if the JSON string is invalid with respect to OrderVoucherAvailableCityCodeModify
  */
  public static OrderVoucherAvailableCityCodeModify fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderVoucherAvailableCityCodeModify.class);
  }

 /**
  * Convert an instance of OrderVoucherAvailableCityCodeModify to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

