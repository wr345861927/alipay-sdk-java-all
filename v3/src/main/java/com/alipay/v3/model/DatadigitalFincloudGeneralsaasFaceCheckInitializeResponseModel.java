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
 * DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel {
  public static final String SERIALIZED_NAME_CERTIFY_ID = "certify_id";
  @SerializedName(SERIALIZED_NAME_CERTIFY_ID)
  private String certifyId;

  public static final String SERIALIZED_NAME_PAGE_URL = "page_url";
  @SerializedName(SERIALIZED_NAME_PAGE_URL)
  private String pageUrl;

  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl;

  public DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel() { 
  }

  public DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel certifyId(String certifyId) {
    
    this.certifyId = certifyId;
    return this;
  }

   /**
   * 人脸检测流水ID，请保留方便排查问题
   * @return certifyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxxxeee888fffss", value = "人脸检测流水ID，请保留方便排查问题")

  public String getCertifyId() {
    return certifyId;
  }


  public void setCertifyId(String certifyId) {
    this.certifyId = certifyId;
  }


  public DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel pageUrl(String pageUrl) {
    
    this.pageUrl = pageUrl;
    return this;
  }

   /**
   * 检测页面url，需要给到终端SDK(该参数后续不再维护，建议使用该参数的商户进行如下升级： 1.在App端活体检测场景中使用了该参数的商户，新版客户端SDK不再依赖该参数，请参考产品官方文档接入指南中的&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/04pxpy?pathHash&#x3D;950007fa&amp;ref&#x3D;api\&quot;&gt;App端活体检测&lt;/a&gt;部分，进行客户端升级； 2.在H5活体检测场景中使用了该参数的商户，请替换为web_url进行认证。)
   * @return pageUrl
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://ssseee.com/", value = "检测页面url，需要给到终端SDK(该参数后续不再维护，建议使用该参数的商户进行如下升级： 1.在App端活体检测场景中使用了该参数的商户，新版客户端SDK不再依赖该参数，请参考产品官方文档接入指南中的<a href=\"https://opendocs.alipay.com/open/04pxpy?pathHash=950007fa&ref=api\">App端活体检测</a>部分，进行客户端升级； 2.在H5活体检测场景中使用了该参数的商户，请替换为web_url进行认证。)")

  public String getPageUrl() {
    return pageUrl;
  }


  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
  }


  public DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * H5活体检测地址
   * @return webUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alipay.com/xxx", value = "H5活体检测地址")

  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
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
   * @return the DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel instance itself
   */
  public DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel putAdditionalProperty(String key, Object value) {
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
    DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel datadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel = (DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel) o;
    return Objects.equals(this.certifyId, datadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel.certifyId) &&
        Objects.equals(this.pageUrl, datadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel.pageUrl) &&
        Objects.equals(this.webUrl, datadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel.webUrl)&&
        Objects.equals(this.additionalProperties, datadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certifyId, pageUrl, webUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel {\n");
    sb.append("    certifyId: ").append(toIndentedString(certifyId)).append("\n");
    sb.append("    pageUrl: ").append(toIndentedString(pageUrl)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
    openapiFields.add("certify_id");
    openapiFields.add("page_url");
    openapiFields.add("web_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel is not found in the empty JSON string", DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("certify_id") != null && !jsonObj.get("certify_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certify_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certify_id").toString()));
      }
      if (jsonObj.get("page_url") != null && !jsonObj.get("page_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_url").toString()));
      }
      if (jsonObj.get("web_url") != null && !jsonObj.get("web_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `web_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("web_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel>() {
           @Override
           public void write(JsonWriter out, DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel value) throws IOException {
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
           public DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel
  * @throws IOException if the JSON string is invalid with respect to DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel
  */
  public static DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel.class);
  }

 /**
  * Convert an instance of DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

