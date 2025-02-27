/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
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
 * AlipayOpenInstantdeliveryMerchantagreementSignModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenInstantdeliveryMerchantagreementSignModel {
  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayOpenInstantdeliveryMerchantagreementSignModel() { 
  }

  public AlipayOpenInstantdeliveryMerchantagreementSignModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 蚂蚁统一会员ID
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "蚂蚁统一会员ID")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayOpenInstantdeliveryMerchantagreementSignModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 蚂蚁统一会员ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000000000000", value = "蚂蚁统一会员ID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenInstantdeliveryMerchantagreementSignModel alipayOpenInstantdeliveryMerchantagreementSignModel = (AlipayOpenInstantdeliveryMerchantagreementSignModel) o;
    return Objects.equals(this.openId, alipayOpenInstantdeliveryMerchantagreementSignModel.openId) &&
        Objects.equals(this.userId, alipayOpenInstantdeliveryMerchantagreementSignModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenInstantdeliveryMerchantagreementSignModel {\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("open_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenInstantdeliveryMerchantagreementSignModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenInstantdeliveryMerchantagreementSignModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenInstantdeliveryMerchantagreementSignModel is not found in the empty JSON string", AlipayOpenInstantdeliveryMerchantagreementSignModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenInstantdeliveryMerchantagreementSignModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenInstantdeliveryMerchantagreementSignModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenInstantdeliveryMerchantagreementSignModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenInstantdeliveryMerchantagreementSignModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenInstantdeliveryMerchantagreementSignModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenInstantdeliveryMerchantagreementSignModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenInstantdeliveryMerchantagreementSignModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenInstantdeliveryMerchantagreementSignModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenInstantdeliveryMerchantagreementSignModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenInstantdeliveryMerchantagreementSignModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenInstantdeliveryMerchantagreementSignModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenInstantdeliveryMerchantagreementSignModel
  */
  public static AlipayOpenInstantdeliveryMerchantagreementSignModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenInstantdeliveryMerchantagreementSignModel.class);
  }

 /**
  * Convert an instance of AlipayOpenInstantdeliveryMerchantagreementSignModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

