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
 * ChargeItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChargeItems {
  public static final String SERIALIZED_NAME_ITEM_MANDATORY = "item_mandatory";
  @SerializedName(SERIALIZED_NAME_ITEM_MANDATORY)
  private String itemMandatory;

  public static final String SERIALIZED_NAME_ITEM_MAXIMUM = "item_maximum";
  @SerializedName(SERIALIZED_NAME_ITEM_MAXIMUM)
  private Integer itemMaximum;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public static final String SERIALIZED_NAME_ITEM_PRICE = "item_price";
  @SerializedName(SERIALIZED_NAME_ITEM_PRICE)
  private String itemPrice;

  public static final String SERIALIZED_NAME_ITEM_SERIAL_NUMBER = "item_serial_number";
  @SerializedName(SERIALIZED_NAME_ITEM_SERIAL_NUMBER)
  private Integer itemSerialNumber;

  public ChargeItems() { 
  }

  public ChargeItems itemMandatory(String itemMandatory) {
    
    this.itemMandatory = itemMandatory;
    return this;
  }

   /**
   * 缴费项是否必选  如果缴费项是多选模式，此参数生效。 “Y”表示必填，“N”或空表示非必填。
   * @return itemMandatory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "N", value = "缴费项是否必选  如果缴费项是多选模式，此参数生效。 “Y”表示必填，“N”或空表示非必填。")

  public String getItemMandatory() {
    return itemMandatory;
  }


  public void setItemMandatory(String itemMandatory) {
    this.itemMandatory = itemMandatory;
  }


  public ChargeItems itemMaximum(Integer itemMaximum) {
    
    this.itemMaximum = itemMaximum;
    return this;
  }

   /**
   * 缴费项最大可选数  如果缴费项是多选模式，此参数生效，范围是1-9，如果为空，则最大项默认为9
   * @return itemMaximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "缴费项最大可选数  如果缴费项是多选模式，此参数生效，范围是1-9，如果为空，则最大项默认为9")

  public Integer getItemMaximum() {
    return itemMaximum;
  }


  public void setItemMaximum(Integer itemMaximum) {
    this.itemMaximum = itemMaximum;
  }


  public ChargeItems itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * 缴费项名称
   * @return itemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "校服费", value = "缴费项名称")

  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public ChargeItems itemPrice(String itemPrice) {
    
    this.itemPrice = itemPrice;
    return this;
  }

   /**
   * 缴费项金额
   * @return itemPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.88", value = "缴费项金额")

  public String getItemPrice() {
    return itemPrice;
  }


  public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
  }


  public ChargeItems itemSerialNumber(Integer itemSerialNumber) {
    
    this.itemSerialNumber = itemSerialNumber;
    return this;
  }

   /**
   * 缴费项序号，如果缴费项是多选模式，此项为必填，建议从1开始的连续数字，  用户支付成功后，通过passback_params参数带回已选择的缴费项。例如:orderNo&#x3D;uoo234234&amp;isvOrderNo&#x3D;24werwe&amp;items&#x3D;1-2|2-1|3-5  1-2|2-1|3-5 表示：缴费项序列号-缴费项数|缴费项序列号-缴费项数
   * @return itemSerialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "缴费项序号，如果缴费项是多选模式，此项为必填，建议从1开始的连续数字，  用户支付成功后，通过passback_params参数带回已选择的缴费项。例如:orderNo=uoo234234&isvOrderNo=24werwe&items=1-2|2-1|3-5  1-2|2-1|3-5 表示：缴费项序列号-缴费项数|缴费项序列号-缴费项数")

  public Integer getItemSerialNumber() {
    return itemSerialNumber;
  }


  public void setItemSerialNumber(Integer itemSerialNumber) {
    this.itemSerialNumber = itemSerialNumber;
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
   * @return the ChargeItems instance itself
   */
  public ChargeItems putAdditionalProperty(String key, Object value) {
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
    ChargeItems chargeItems = (ChargeItems) o;
    return Objects.equals(this.itemMandatory, chargeItems.itemMandatory) &&
        Objects.equals(this.itemMaximum, chargeItems.itemMaximum) &&
        Objects.equals(this.itemName, chargeItems.itemName) &&
        Objects.equals(this.itemPrice, chargeItems.itemPrice) &&
        Objects.equals(this.itemSerialNumber, chargeItems.itemSerialNumber)&&
        Objects.equals(this.additionalProperties, chargeItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemMandatory, itemMaximum, itemName, itemPrice, itemSerialNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeItems {\n");
    sb.append("    itemMandatory: ").append(toIndentedString(itemMandatory)).append("\n");
    sb.append("    itemMaximum: ").append(toIndentedString(itemMaximum)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    itemSerialNumber: ").append(toIndentedString(itemSerialNumber)).append("\n");
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
    openapiFields.add("item_mandatory");
    openapiFields.add("item_maximum");
    openapiFields.add("item_name");
    openapiFields.add("item_price");
    openapiFields.add("item_serial_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChargeItems
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ChargeItems.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChargeItems is not found in the empty JSON string", ChargeItems.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("item_mandatory") != null && !jsonObj.get("item_mandatory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_mandatory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_mandatory").toString()));
      }
      if (jsonObj.get("item_name") != null && !jsonObj.get("item_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_name").toString()));
      }
      if (jsonObj.get("item_price") != null && !jsonObj.get("item_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_price").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargeItems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargeItems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargeItems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargeItems.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargeItems>() {
           @Override
           public void write(JsonWriter out, ChargeItems value) throws IOException {
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
           public ChargeItems read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChargeItems instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChargeItems given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargeItems
  * @throws IOException if the JSON string is invalid with respect to ChargeItems
  */
  public static ChargeItems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargeItems.class);
  }

 /**
  * Convert an instance of ChargeItems to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

