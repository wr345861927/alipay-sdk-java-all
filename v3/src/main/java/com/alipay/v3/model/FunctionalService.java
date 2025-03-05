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
 * FunctionalService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FunctionalService {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<OrderExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_FUNCTION_CODE = "function_code";
  @SerializedName(SERIALIZED_NAME_FUNCTION_CODE)
  private String functionCode;

  public static final String SERIALIZED_NAME_FUNCTION_NAME = "function_name";
  @SerializedName(SERIALIZED_NAME_FUNCTION_NAME)
  private String functionName;

  public static final String SERIALIZED_NAME_FUNCTION_TYPE = "function_type";
  @SerializedName(SERIALIZED_NAME_FUNCTION_TYPE)
  private String functionType;

  public static final String SERIALIZED_NAME_FUNCTION_URL = "function_url";
  @SerializedName(SERIALIZED_NAME_FUNCTION_URL)
  private String functionUrl;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public FunctionalService() { 
  }

  public FunctionalService content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 功能内容
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "功能内容")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public FunctionalService extInfo(List<OrderExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public FunctionalService addExtInfoItem(OrderExtInfo extInfoItem) {
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


  public FunctionalService functionCode(String functionCode) {
    
    this.functionCode = functionCode;
    return this;
  }

   /**
   * 功能码 支持的功能码请与产品或对应技术确认
   * @return functionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "功能码 支持的功能码请与产品或对应技术确认")

  public String getFunctionCode() {
    return functionCode;
  }


  public void setFunctionCode(String functionCode) {
    this.functionCode = functionCode;
  }


  public FunctionalService functionName(String functionName) {
    
    this.functionName = functionName;
    return this;
  }

   /**
   * 功能名称
   * @return functionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "功能名称")

  public String getFunctionName() {
    return functionName;
  }


  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }


  public FunctionalService functionType(String functionType) {
    
    this.functionType = functionType;
    return this;
  }

   /**
   * 功能类型
   * @return functionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "功能类型")

  public String getFunctionType() {
    return functionType;
  }


  public void setFunctionType(String functionType) {
    this.functionType = functionType;
  }


  public FunctionalService functionUrl(String functionUrl) {
    
    this.functionUrl = functionUrl;
    return this;
  }

   /**
   * 功能入口
   * @return functionUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "功能入口")

  public String getFunctionUrl() {
    return functionUrl;
  }


  public void setFunctionUrl(String functionUrl) {
    this.functionUrl = functionUrl;
  }


  public FunctionalService memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注信息
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "备注信息")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
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
   * @return the FunctionalService instance itself
   */
  public FunctionalService putAdditionalProperty(String key, Object value) {
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
    FunctionalService functionalService = (FunctionalService) o;
    return Objects.equals(this.content, functionalService.content) &&
        Objects.equals(this.extInfo, functionalService.extInfo) &&
        Objects.equals(this.functionCode, functionalService.functionCode) &&
        Objects.equals(this.functionName, functionalService.functionName) &&
        Objects.equals(this.functionType, functionalService.functionType) &&
        Objects.equals(this.functionUrl, functionalService.functionUrl) &&
        Objects.equals(this.memo, functionalService.memo)&&
        Objects.equals(this.additionalProperties, functionalService.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, extInfo, functionCode, functionName, functionType, functionUrl, memo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionalService {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    functionCode: ").append(toIndentedString(functionCode)).append("\n");
    sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
    sb.append("    functionType: ").append(toIndentedString(functionType)).append("\n");
    sb.append("    functionUrl: ").append(toIndentedString(functionUrl)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("ext_info");
    openapiFields.add("function_code");
    openapiFields.add("function_name");
    openapiFields.add("function_type");
    openapiFields.add("function_url");
    openapiFields.add("memo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FunctionalService
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FunctionalService.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FunctionalService is not found in the empty JSON string", FunctionalService.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
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
      if (jsonObj.get("function_code") != null && !jsonObj.get("function_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `function_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("function_code").toString()));
      }
      if (jsonObj.get("function_name") != null && !jsonObj.get("function_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `function_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("function_name").toString()));
      }
      if (jsonObj.get("function_type") != null && !jsonObj.get("function_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `function_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("function_type").toString()));
      }
      if (jsonObj.get("function_url") != null && !jsonObj.get("function_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `function_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("function_url").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FunctionalService.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FunctionalService' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FunctionalService> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FunctionalService.class));

       return (TypeAdapter<T>) new TypeAdapter<FunctionalService>() {
           @Override
           public void write(JsonWriter out, FunctionalService value) throws IOException {
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
           public FunctionalService read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FunctionalService instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FunctionalService given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FunctionalService
  * @throws IOException if the JSON string is invalid with respect to FunctionalService
  */
  public static FunctionalService fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FunctionalService.class);
  }

 /**
  * Convert an instance of FunctionalService to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

