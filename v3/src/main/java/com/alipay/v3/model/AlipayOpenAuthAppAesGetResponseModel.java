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
 * AlipayOpenAuthAppAesGetResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAuthAppAesGetResponseModel {
  public static final String SERIALIZED_NAME_AES_KEY = "aes_key";
  @SerializedName(SERIALIZED_NAME_AES_KEY)
  private String aesKey;

  public AlipayOpenAuthAppAesGetResponseModel() { 
  }

  public AlipayOpenAuthAppAesGetResponseModel aesKey(String aesKey) {
    
    this.aesKey = aesKey;
    return this;
  }

   /**
   * 商家应用AES KEY密文，需要ISV使用三方应用配置的AES密钥内容进行解密。详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/isv/grefvl/getaes\&quot;&gt;应用AES密钥管理&lt;/a&gt;。
   * @return aesKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "s6p0cLTHCy7jtJyTKnh", value = "商家应用AES KEY密文，需要ISV使用三方应用配置的AES密钥内容进行解密。详情参见 <a href=\"https://opendocs.alipay.com/isv/grefvl/getaes\">应用AES密钥管理</a>。")

  public String getAesKey() {
    return aesKey;
  }


  public void setAesKey(String aesKey) {
    this.aesKey = aesKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAuthAppAesGetResponseModel alipayOpenAuthAppAesGetResponseModel = (AlipayOpenAuthAppAesGetResponseModel) o;
    return Objects.equals(this.aesKey, alipayOpenAuthAppAesGetResponseModel.aesKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aesKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAuthAppAesGetResponseModel {\n");
    sb.append("    aesKey: ").append(toIndentedString(aesKey)).append("\n");
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
    openapiFields.add("aes_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAuthAppAesGetResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAuthAppAesGetResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAuthAppAesGetResponseModel is not found in the empty JSON string", AlipayOpenAuthAppAesGetResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAuthAppAesGetResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAuthAppAesGetResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("aes_key") != null && !jsonObj.get("aes_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aes_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aes_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAuthAppAesGetResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAuthAppAesGetResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAuthAppAesGetResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAuthAppAesGetResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAuthAppAesGetResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAuthAppAesGetResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAuthAppAesGetResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAuthAppAesGetResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAuthAppAesGetResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAuthAppAesGetResponseModel
  */
  public static AlipayOpenAuthAppAesGetResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAuthAppAesGetResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAuthAppAesGetResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

