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
import com.alipay.v3.model.DeliverySingleMaterial;
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
 * DeliveryMaterial
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryMaterial {
  public static final String SERIALIZED_NAME_DELIVERY_SINGLE_MATERIAL = "delivery_single_material";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SINGLE_MATERIAL)
  private DeliverySingleMaterial deliverySingleMaterial;

  public static final String SERIALIZED_NAME_MATERIAL_ID_LIST = "material_id_list";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID_LIST)
  private List<String> materialIdList = null;

  public DeliveryMaterial() { 
  }

  public DeliveryMaterial deliverySingleMaterial(DeliverySingleMaterial deliverySingleMaterial) {
    
    this.deliverySingleMaterial = deliverySingleMaterial;
    return this;
  }

   /**
   * Get deliverySingleMaterial
   * @return deliverySingleMaterial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliverySingleMaterial getDeliverySingleMaterial() {
    return deliverySingleMaterial;
  }


  public void setDeliverySingleMaterial(DeliverySingleMaterial deliverySingleMaterial) {
    this.deliverySingleMaterial = deliverySingleMaterial;
  }


  public DeliveryMaterial materialIdList(List<String> materialIdList) {
    
    this.materialIdList = materialIdList;
    return this;
  }

  public DeliveryMaterial addMaterialIdListItem(String materialIdListItem) {
    if (this.materialIdList == null) {
      this.materialIdList = new ArrayList<>();
    }
    this.materialIdList.add(materialIdListItem);
    return this;
  }

   /**
   * 素材ID，通过alipay.marketing.material.create接口提供的素材组
   * @return materialIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "素材ID，通过alipay.marketing.material.create接口提供的素材组")

  public List<String> getMaterialIdList() {
    return materialIdList;
  }


  public void setMaterialIdList(List<String> materialIdList) {
    this.materialIdList = materialIdList;
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
   * @return the DeliveryMaterial instance itself
   */
  public DeliveryMaterial putAdditionalProperty(String key, Object value) {
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
    DeliveryMaterial deliveryMaterial = (DeliveryMaterial) o;
    return Objects.equals(this.deliverySingleMaterial, deliveryMaterial.deliverySingleMaterial) &&
        Objects.equals(this.materialIdList, deliveryMaterial.materialIdList)&&
        Objects.equals(this.additionalProperties, deliveryMaterial.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliverySingleMaterial, materialIdList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryMaterial {\n");
    sb.append("    deliverySingleMaterial: ").append(toIndentedString(deliverySingleMaterial)).append("\n");
    sb.append("    materialIdList: ").append(toIndentedString(materialIdList)).append("\n");
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
    openapiFields.add("delivery_single_material");
    openapiFields.add("material_id_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryMaterial
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryMaterial.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryMaterial is not found in the empty JSON string", DeliveryMaterial.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `delivery_single_material`
      if (jsonObj.getAsJsonObject("delivery_single_material") != null) {
        DeliverySingleMaterial.validateJsonObject(jsonObj.getAsJsonObject("delivery_single_material"));
      }
      // ensure the json data is an array
      if (jsonObj.get("material_id_list") != null && !jsonObj.get("material_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("material_id_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryMaterial>() {
           @Override
           public void write(JsonWriter out, DeliveryMaterial value) throws IOException {
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
           public DeliveryMaterial read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeliveryMaterial instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeliveryMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryMaterial
  * @throws IOException if the JSON string is invalid with respect to DeliveryMaterial
  */
  public static DeliveryMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryMaterial.class);
  }

 /**
  * Convert an instance of DeliveryMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

