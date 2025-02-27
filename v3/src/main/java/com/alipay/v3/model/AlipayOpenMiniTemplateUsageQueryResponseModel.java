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
import com.alipay.v3.model.TemplateUsageInfo;
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
 * AlipayOpenMiniTemplateUsageQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniTemplateUsageQueryResponseModel {
  public static final String SERIALIZED_NAME_APP_IDS = "app_ids";
  @SerializedName(SERIALIZED_NAME_APP_IDS)
  private List<String> appIds = null;

  public static final String SERIALIZED_NAME_TEMPLATE_USAGE_INFO_LIST = "template_usage_info_list";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_USAGE_INFO_LIST)
  private List<TemplateUsageInfo> templateUsageInfoList = null;

  public AlipayOpenMiniTemplateUsageQueryResponseModel() { 
  }

  public AlipayOpenMiniTemplateUsageQueryResponseModel appIds(List<String> appIds) {
    
    this.appIds = appIds;
    return this;
  }

  public AlipayOpenMiniTemplateUsageQueryResponseModel addAppIdsItem(String appIdsItem) {
    if (this.appIds == null) {
      this.appIds = new ArrayList<>();
    }
    this.appIds.add(appIdsItem);
    return this;
  }

   /**
   * 小程序appId列表
   * @return appIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "208812345678", value = "小程序appId列表")

  public List<String> getAppIds() {
    return appIds;
  }


  public void setAppIds(List<String> appIds) {
    this.appIds = appIds;
  }


  public AlipayOpenMiniTemplateUsageQueryResponseModel templateUsageInfoList(List<TemplateUsageInfo> templateUsageInfoList) {
    
    this.templateUsageInfoList = templateUsageInfoList;
    return this;
  }

  public AlipayOpenMiniTemplateUsageQueryResponseModel addTemplateUsageInfoListItem(TemplateUsageInfo templateUsageInfoListItem) {
    if (this.templateUsageInfoList == null) {
      this.templateUsageInfoList = new ArrayList<>();
    }
    this.templateUsageInfoList.add(templateUsageInfoListItem);
    return this;
  }

   /**
   * 模板使用信息
   * @return templateUsageInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "模板使用信息")

  public List<TemplateUsageInfo> getTemplateUsageInfoList() {
    return templateUsageInfoList;
  }


  public void setTemplateUsageInfoList(List<TemplateUsageInfo> templateUsageInfoList) {
    this.templateUsageInfoList = templateUsageInfoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniTemplateUsageQueryResponseModel alipayOpenMiniTemplateUsageQueryResponseModel = (AlipayOpenMiniTemplateUsageQueryResponseModel) o;
    return Objects.equals(this.appIds, alipayOpenMiniTemplateUsageQueryResponseModel.appIds) &&
        Objects.equals(this.templateUsageInfoList, alipayOpenMiniTemplateUsageQueryResponseModel.templateUsageInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appIds, templateUsageInfoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniTemplateUsageQueryResponseModel {\n");
    sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
    sb.append("    templateUsageInfoList: ").append(toIndentedString(templateUsageInfoList)).append("\n");
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
    openapiFields.add("app_ids");
    openapiFields.add("template_usage_info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniTemplateUsageQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniTemplateUsageQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniTemplateUsageQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniTemplateUsageQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniTemplateUsageQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniTemplateUsageQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("app_ids") != null && !jsonObj.get("app_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_ids` to be an array in the JSON string but got `%s`", jsonObj.get("app_ids").toString()));
      }
      JsonArray jsonArraytemplateUsageInfoList = jsonObj.getAsJsonArray("template_usage_info_list");
      if (jsonArraytemplateUsageInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("template_usage_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `template_usage_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("template_usage_info_list").toString()));
        }

        // validate the optional field `template_usage_info_list` (array)
        for (int i = 0; i < jsonArraytemplateUsageInfoList.size(); i++) {
          TemplateUsageInfo.validateJsonObject(jsonArraytemplateUsageInfoList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniTemplateUsageQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniTemplateUsageQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniTemplateUsageQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniTemplateUsageQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniTemplateUsageQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniTemplateUsageQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniTemplateUsageQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniTemplateUsageQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniTemplateUsageQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniTemplateUsageQueryResponseModel
  */
  public static AlipayOpenMiniTemplateUsageQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniTemplateUsageQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniTemplateUsageQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

