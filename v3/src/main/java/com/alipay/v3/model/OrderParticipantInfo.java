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
import com.alipay.v3.model.OrderExtInfo;
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
 * OrderParticipantInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderParticipantInfo {
  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<OrderExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_LOGO_MATERIAL_ID = "logo_material_id";
  @SerializedName(SERIALIZED_NAME_LOGO_MATERIAL_ID)
  private String logoMaterialId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_NAME = "short_name";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public OrderParticipantInfo() { 
  }

  public OrderParticipantInfo extInfo(List<OrderExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public OrderParticipantInfo addExtInfoItem(OrderExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * 扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展信息")

  public List<OrderExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<OrderExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public OrderParticipantInfo logoMaterialId(String logoMaterialId) {
    
    this.logoMaterialId = logoMaterialId;
    return this;
  }

   /**
   * 参与方logo素材id 开发者通过 alipay.merchant.item.file.upload(商品文件上传接口)上传图片，获取到对应的素材 ID( material_id )
   * @return logoMaterialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019010100502200000000000001", value = "参与方logo素材id 开发者通过 alipay.merchant.item.file.upload(商品文件上传接口)上传图片，获取到对应的素材 ID( material_id )")

  public String getLogoMaterialId() {
    return logoMaterialId;
  }


  public void setLogoMaterialId(String logoMaterialId) {
    this.logoMaterialId = logoMaterialId;
  }


  public OrderParticipantInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 参与方名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "东方航空", value = "参与方名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OrderParticipantInfo shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * 参与方简称
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "东航", value = "参与方简称")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public OrderParticipantInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 参与方类型
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "服务提供商", value = "参与方类型")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public OrderParticipantInfo uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * 参与方支付宝uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088202905583404", value = "参与方支付宝uid")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
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
   * @return the OrderParticipantInfo instance itself
   */
  public OrderParticipantInfo putAdditionalProperty(String key, Object value) {
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
    OrderParticipantInfo orderParticipantInfo = (OrderParticipantInfo) o;
    return Objects.equals(this.extInfo, orderParticipantInfo.extInfo) &&
        Objects.equals(this.logoMaterialId, orderParticipantInfo.logoMaterialId) &&
        Objects.equals(this.name, orderParticipantInfo.name) &&
        Objects.equals(this.shortName, orderParticipantInfo.shortName) &&
        Objects.equals(this.type, orderParticipantInfo.type) &&
        Objects.equals(this.uid, orderParticipantInfo.uid)&&
        Objects.equals(this.additionalProperties, orderParticipantInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extInfo, logoMaterialId, name, shortName, type, uid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderParticipantInfo {\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    logoMaterialId: ").append(toIndentedString(logoMaterialId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("ext_info");
    openapiFields.add("logo_material_id");
    openapiFields.add("name");
    openapiFields.add("short_name");
    openapiFields.add("type");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderParticipantInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderParticipantInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderParticipantInfo is not found in the empty JSON string", OrderParticipantInfo.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          OrderExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("logo_material_id") != null && !jsonObj.get("logo_material_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_material_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_material_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("short_name") != null && !jsonObj.get("short_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_name").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderParticipantInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderParticipantInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderParticipantInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderParticipantInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderParticipantInfo>() {
           @Override
           public void write(JsonWriter out, OrderParticipantInfo value) throws IOException {
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
           public OrderParticipantInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrderParticipantInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrderParticipantInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderParticipantInfo
  * @throws IOException if the JSON string is invalid with respect to OrderParticipantInfo
  */
  public static OrderParticipantInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderParticipantInfo.class);
  }

 /**
  * Convert an instance of OrderParticipantInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

