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
import com.alipay.v3.model.WidgetGoodsInfo;
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
 * AlipayOpenMiniWidgetGoodsUploadModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniWidgetGoodsUploadModel {
  public static final String SERIALIZED_NAME_GOODS_LIST = "goods_list";
  @SerializedName(SERIALIZED_NAME_GOODS_LIST)
  private List<WidgetGoodsInfo> goodsList = null;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public AlipayOpenMiniWidgetGoodsUploadModel() { 
  }

  public AlipayOpenMiniWidgetGoodsUploadModel goodsList(List<WidgetGoodsInfo> goodsList) {
    
    this.goodsList = goodsList;
    return this;
  }

  public AlipayOpenMiniWidgetGoodsUploadModel addGoodsListItem(WidgetGoodsInfo goodsListItem) {
    if (this.goodsList == null) {
      this.goodsList = new ArrayList<>();
    }
    this.goodsList.add(goodsListItem);
    return this;
  }

   /**
   * 商品信息列表
   * @return goodsList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品信息列表")

  public List<WidgetGoodsInfo> getGoodsList() {
    return goodsList;
  }


  public void setGoodsList(List<WidgetGoodsInfo> goodsList) {
    this.goodsList = goodsList;
  }


  public AlipayOpenMiniWidgetGoodsUploadModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 用于承接品的商家小程序ID
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017072607907880", value = "用于承接品的商家小程序ID")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniWidgetGoodsUploadModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 品的售卖商家，即承接该品的小程序背后的商家。和mini_app_id要求对应
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxx", value = "品的售卖商家，即承接该品的小程序背后的商家。和mini_app_id要求对应")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniWidgetGoodsUploadModel alipayOpenMiniWidgetGoodsUploadModel = (AlipayOpenMiniWidgetGoodsUploadModel) o;
    return Objects.equals(this.goodsList, alipayOpenMiniWidgetGoodsUploadModel.goodsList) &&
        Objects.equals(this.miniAppId, alipayOpenMiniWidgetGoodsUploadModel.miniAppId) &&
        Objects.equals(this.pid, alipayOpenMiniWidgetGoodsUploadModel.pid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsList, miniAppId, pid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniWidgetGoodsUploadModel {\n");
    sb.append("    goodsList: ").append(toIndentedString(goodsList)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
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
    openapiFields.add("goods_list");
    openapiFields.add("mini_app_id");
    openapiFields.add("pid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniWidgetGoodsUploadModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniWidgetGoodsUploadModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniWidgetGoodsUploadModel is not found in the empty JSON string", AlipayOpenMiniWidgetGoodsUploadModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniWidgetGoodsUploadModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniWidgetGoodsUploadModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraygoodsList = jsonObj.getAsJsonArray("goods_list");
      if (jsonArraygoodsList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("goods_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `goods_list` to be an array in the JSON string but got `%s`", jsonObj.get("goods_list").toString()));
        }

        // validate the optional field `goods_list` (array)
        for (int i = 0; i < jsonArraygoodsList.size(); i++) {
          WidgetGoodsInfo.validateJsonObject(jsonArraygoodsList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniWidgetGoodsUploadModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniWidgetGoodsUploadModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniWidgetGoodsUploadModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniWidgetGoodsUploadModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniWidgetGoodsUploadModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniWidgetGoodsUploadModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniWidgetGoodsUploadModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniWidgetGoodsUploadModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniWidgetGoodsUploadModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniWidgetGoodsUploadModel
  */
  public static AlipayOpenMiniWidgetGoodsUploadModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniWidgetGoodsUploadModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniWidgetGoodsUploadModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

