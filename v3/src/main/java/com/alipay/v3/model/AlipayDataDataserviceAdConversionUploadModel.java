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
import com.alipay.v3.model.ConversionData;
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
 * AlipayDataDataserviceAdConversionUploadModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayDataDataserviceAdConversionUploadModel {
  public static final String SERIALIZED_NAME_BIZ_TOKEN = "biz_token";
  @SerializedName(SERIALIZED_NAME_BIZ_TOKEN)
  private String bizToken;

  public static final String SERIALIZED_NAME_CONVERSION_DATA_LIST = "conversion_data_list";
  @SerializedName(SERIALIZED_NAME_CONVERSION_DATA_LIST)
  private List<ConversionData> conversionDataList = null;

  public AlipayDataDataserviceAdConversionUploadModel() { 
  }

  public AlipayDataDataserviceAdConversionUploadModel bizToken(String bizToken) {
    
    this.bizToken = bizToken;
    return this;
  }

   /**
   * 代理商访问灯火平台的token
   * @return bizToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HYjofejnnlp89730202bcklHH", value = "代理商访问灯火平台的token")

  public String getBizToken() {
    return bizToken;
  }


  public void setBizToken(String bizToken) {
    this.bizToken = bizToken;
  }


  public AlipayDataDataserviceAdConversionUploadModel conversionDataList(List<ConversionData> conversionDataList) {
    
    this.conversionDataList = conversionDataList;
    return this;
  }

  public AlipayDataDataserviceAdConversionUploadModel addConversionDataListItem(ConversionData conversionDataListItem) {
    if (this.conversionDataList == null) {
      this.conversionDataList = new ArrayList<>();
    }
    this.conversionDataList.add(conversionDataListItem);
    return this;
  }

   /**
   * 转化数据列表, 最多1000条
   * @return conversionDataList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "转化数据列表, 最多1000条")

  public List<ConversionData> getConversionDataList() {
    return conversionDataList;
  }


  public void setConversionDataList(List<ConversionData> conversionDataList) {
    this.conversionDataList = conversionDataList;
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
   * @return the AlipayDataDataserviceAdConversionUploadModel instance itself
   */
  public AlipayDataDataserviceAdConversionUploadModel putAdditionalProperty(String key, Object value) {
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
    AlipayDataDataserviceAdConversionUploadModel alipayDataDataserviceAdConversionUploadModel = (AlipayDataDataserviceAdConversionUploadModel) o;
    return Objects.equals(this.bizToken, alipayDataDataserviceAdConversionUploadModel.bizToken) &&
        Objects.equals(this.conversionDataList, alipayDataDataserviceAdConversionUploadModel.conversionDataList)&&
        Objects.equals(this.additionalProperties, alipayDataDataserviceAdConversionUploadModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizToken, conversionDataList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayDataDataserviceAdConversionUploadModel {\n");
    sb.append("    bizToken: ").append(toIndentedString(bizToken)).append("\n");
    sb.append("    conversionDataList: ").append(toIndentedString(conversionDataList)).append("\n");
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
    openapiFields.add("biz_token");
    openapiFields.add("conversion_data_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayDataDataserviceAdConversionUploadModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayDataDataserviceAdConversionUploadModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayDataDataserviceAdConversionUploadModel is not found in the empty JSON string", AlipayDataDataserviceAdConversionUploadModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_token") != null && !jsonObj.get("biz_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_token").toString()));
      }
      JsonArray jsonArrayconversionDataList = jsonObj.getAsJsonArray("conversion_data_list");
      if (jsonArrayconversionDataList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("conversion_data_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `conversion_data_list` to be an array in the JSON string but got `%s`", jsonObj.get("conversion_data_list").toString()));
        }

        // validate the optional field `conversion_data_list` (array)
        for (int i = 0; i < jsonArrayconversionDataList.size(); i++) {
          ConversionData.validateJsonObject(jsonArrayconversionDataList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayDataDataserviceAdConversionUploadModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayDataDataserviceAdConversionUploadModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayDataDataserviceAdConversionUploadModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayDataDataserviceAdConversionUploadModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayDataDataserviceAdConversionUploadModel>() {
           @Override
           public void write(JsonWriter out, AlipayDataDataserviceAdConversionUploadModel value) throws IOException {
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
           public AlipayDataDataserviceAdConversionUploadModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayDataDataserviceAdConversionUploadModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayDataDataserviceAdConversionUploadModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayDataDataserviceAdConversionUploadModel
  * @throws IOException if the JSON string is invalid with respect to AlipayDataDataserviceAdConversionUploadModel
  */
  public static AlipayDataDataserviceAdConversionUploadModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayDataDataserviceAdConversionUploadModel.class);
  }

 /**
  * Convert an instance of AlipayDataDataserviceAdConversionUploadModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

