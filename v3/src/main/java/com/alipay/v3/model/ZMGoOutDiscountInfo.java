/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
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
 * ZMGoOutDiscountInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZMGoOutDiscountInfo {
  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private String discountAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_NAME = "discount_name";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_NAME)
  private String discountName;

  public static final String SERIALIZED_NAME_DISCOUNT_TYPE = "discount_type";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TYPE)
  private String discountType;

  public ZMGoOutDiscountInfo() { 
  }

  public ZMGoOutDiscountInfo discountAmount(String discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * 商户回传的优惠金额，如用户享受的红包金额，单位元
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.75", value = "商户回传的优惠金额，如用户享受的红包金额，单位元")

  public String getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }


  public ZMGoOutDiscountInfo discountName(String discountName) {
    
    this.discountName = discountName;
    return this;
  }

   /**
   * 商户数据回传的优惠信息的名称
   * @return discountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "滴滴打车优惠001", value = "商户数据回传的优惠信息的名称")

  public String getDiscountName() {
    return discountName;
  }


  public void setDiscountName(String discountName) {
    this.discountName = discountName;
  }


  public ZMGoOutDiscountInfo discountType(String discountType) {
    
    this.discountType = discountType;
    return this;
  }

   /**
   * 优惠信息的类型。为枚举值，商户可任意选择一个值作为入参传入。可取值： (\&quot;exclusiveBenefit\&quot;,\&quot;专享优惠\&quot;), (\&quot;exclusiveDiscount\&quot;,\&quot;专享折扣\&quot;), (\&quot;appreciationBenefit\&quot;, \&quot;增值权益\&quot;), (\&quot;memberPoint\&quot;, \&quot;会员积分\&quot;)
   * @return discountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "exclusiveBenefit", value = "优惠信息的类型。为枚举值，商户可任意选择一个值作为入参传入。可取值： (\"exclusiveBenefit\",\"专享优惠\"), (\"exclusiveDiscount\",\"专享折扣\"), (\"appreciationBenefit\", \"增值权益\"), (\"memberPoint\", \"会员积分\")")

  public String getDiscountType() {
    return discountType;
  }


  public void setDiscountType(String discountType) {
    this.discountType = discountType;
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
   * @return the ZMGoOutDiscountInfo instance itself
   */
  public ZMGoOutDiscountInfo putAdditionalProperty(String key, Object value) {
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
    ZMGoOutDiscountInfo zmGoOutDiscountInfo = (ZMGoOutDiscountInfo) o;
    return Objects.equals(this.discountAmount, zmGoOutDiscountInfo.discountAmount) &&
        Objects.equals(this.discountName, zmGoOutDiscountInfo.discountName) &&
        Objects.equals(this.discountType, zmGoOutDiscountInfo.discountType)&&
        Objects.equals(this.additionalProperties, zmGoOutDiscountInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAmount, discountName, discountType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZMGoOutDiscountInfo {\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountName: ").append(toIndentedString(discountName)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
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
    openapiFields.add("discount_amount");
    openapiFields.add("discount_name");
    openapiFields.add("discount_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZMGoOutDiscountInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZMGoOutDiscountInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZMGoOutDiscountInfo is not found in the empty JSON string", ZMGoOutDiscountInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("discount_amount") != null && !jsonObj.get("discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_amount").toString()));
      }
      if (jsonObj.get("discount_name") != null && !jsonObj.get("discount_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_name").toString()));
      }
      if (jsonObj.get("discount_type") != null && !jsonObj.get("discount_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZMGoOutDiscountInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZMGoOutDiscountInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZMGoOutDiscountInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZMGoOutDiscountInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ZMGoOutDiscountInfo>() {
           @Override
           public void write(JsonWriter out, ZMGoOutDiscountInfo value) throws IOException {
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
           public ZMGoOutDiscountInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZMGoOutDiscountInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZMGoOutDiscountInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZMGoOutDiscountInfo
  * @throws IOException if the JSON string is invalid with respect to ZMGoOutDiscountInfo
  */
  public static ZMGoOutDiscountInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZMGoOutDiscountInfo.class);
  }

 /**
  * Convert an instance of ZMGoOutDiscountInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

