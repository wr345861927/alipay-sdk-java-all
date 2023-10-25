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
import com.alipay.v3.model.PluginBetaItemInfo;
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
 * AlipayOpenMiniInnerversionBetainfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionBetainfoQueryResponseModel {
  public static final String SERIALIZED_NAME_PLUGIN_BETA_ITEM_LIST = "plugin_beta_item_list";
  @SerializedName(SERIALIZED_NAME_PLUGIN_BETA_ITEM_LIST)
  private List<PluginBetaItemInfo> pluginBetaItemList = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayOpenMiniInnerversionBetainfoQueryResponseModel() { 
  }

  public AlipayOpenMiniInnerversionBetainfoQueryResponseModel pluginBetaItemList(List<PluginBetaItemInfo> pluginBetaItemList) {
    
    this.pluginBetaItemList = pluginBetaItemList;
    return this;
  }

  public AlipayOpenMiniInnerversionBetainfoQueryResponseModel addPluginBetaItemListItem(PluginBetaItemInfo pluginBetaItemListItem) {
    if (this.pluginBetaItemList == null) {
      this.pluginBetaItemList = new ArrayList<>();
    }
    this.pluginBetaItemList.add(pluginBetaItemListItem);
    return this;
  }

   /**
   * 邀测结果列表
   * @return pluginBetaItemList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "邀测结果列表")

  public List<PluginBetaItemInfo> getPluginBetaItemList() {
    return pluginBetaItemList;
  }


  public void setPluginBetaItemList(List<PluginBetaItemInfo> pluginBetaItemList) {
    this.pluginBetaItemList = pluginBetaItemList;
  }


  public AlipayOpenMiniInnerversionBetainfoQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 邀测状态，待确认WAITCHECK/确认CHECKED/拒绝REJECT
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WAITCHECK", value = "邀测状态，待确认WAITCHECK/确认CHECKED/拒绝REJECT")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerversionBetainfoQueryResponseModel alipayOpenMiniInnerversionBetainfoQueryResponseModel = (AlipayOpenMiniInnerversionBetainfoQueryResponseModel) o;
    return Objects.equals(this.pluginBetaItemList, alipayOpenMiniInnerversionBetainfoQueryResponseModel.pluginBetaItemList) &&
        Objects.equals(this.status, alipayOpenMiniInnerversionBetainfoQueryResponseModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pluginBetaItemList, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionBetainfoQueryResponseModel {\n");
    sb.append("    pluginBetaItemList: ").append(toIndentedString(pluginBetaItemList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("plugin_beta_item_list");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionBetainfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionBetainfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionBetainfoQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniInnerversionBetainfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerversionBetainfoQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerversionBetainfoQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraypluginBetaItemList = jsonObj.getAsJsonArray("plugin_beta_item_list");
      if (jsonArraypluginBetaItemList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("plugin_beta_item_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `plugin_beta_item_list` to be an array in the JSON string but got `%s`", jsonObj.get("plugin_beta_item_list").toString()));
        }

        // validate the optional field `plugin_beta_item_list` (array)
        for (int i = 0; i < jsonArraypluginBetaItemList.size(); i++) {
          PluginBetaItemInfo.validateJsonObject(jsonArraypluginBetaItemList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionBetainfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionBetainfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionBetainfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionBetainfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionBetainfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionBetainfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerversionBetainfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerversionBetainfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionBetainfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionBetainfoQueryResponseModel
  */
  public static AlipayOpenMiniInnerversionBetainfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionBetainfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionBetainfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

