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
import com.alipay.v3.model.PluginUseConfigInfo;
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
 * PluginUseRelationInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PluginUseRelationInfo {
  public static final String SERIALIZED_NAME_BETA_MEMO = "beta_memo";
  @SerializedName(SERIALIZED_NAME_BETA_MEMO)
  private String betaMemo;

  public static final String SERIALIZED_NAME_BETA_PLUGIN_VERSION = "beta_plugin_version";
  @SerializedName(SERIALIZED_NAME_BETA_PLUGIN_VERSION)
  private String betaPluginVersion;

  public static final String SERIALIZED_NAME_BETA_QR_CODE_URL = "beta_qr_code_url";
  @SerializedName(SERIALIZED_NAME_BETA_QR_CODE_URL)
  private String betaQrCodeUrl;

  public static final String SERIALIZED_NAME_BETA_STATUS = "beta_status";
  @SerializedName(SERIALIZED_NAME_BETA_STATUS)
  private String betaStatus;

  public static final String SERIALIZED_NAME_GMT_ACTIVE = "gmt_active";
  @SerializedName(SERIALIZED_NAME_GMT_ACTIVE)
  private String gmtActive;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_INVALID = "gmt_invalid";
  @SerializedName(SERIALIZED_NAME_GMT_INVALID)
  private String gmtInvalid;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_PLUGIN_DEPLOY_VERSION = "plugin_deploy_version";
  @SerializedName(SERIALIZED_NAME_PLUGIN_DEPLOY_VERSION)
  private String pluginDeployVersion;

  public static final String SERIALIZED_NAME_PLUGIN_ID = "plugin_id";
  @SerializedName(SERIALIZED_NAME_PLUGIN_ID)
  private String pluginId;

  public static final String SERIALIZED_NAME_PLUGIN_STATUS = "plugin_status";
  @SerializedName(SERIALIZED_NAME_PLUGIN_STATUS)
  private String pluginStatus;

  public static final String SERIALIZED_NAME_PLUGIN_USE_CONFIG_INFO_LIST = "plugin_use_config_info_list";
  @SerializedName(SERIALIZED_NAME_PLUGIN_USE_CONFIG_INFO_LIST)
  private List<PluginUseConfigInfo> pluginUseConfigInfoList = null;

  public static final String SERIALIZED_NAME_PLUGIN_VERSION = "plugin_version";
  @SerializedName(SERIALIZED_NAME_PLUGIN_VERSION)
  private String pluginVersion;

  public static final String SERIALIZED_NAME_RUN_MODE_TYPE = "run_mode_type";
  @SerializedName(SERIALIZED_NAME_RUN_MODE_TYPE)
  private String runModeType;

  public static final String SERIALIZED_NAME_SOURCE_FROM = "source_from";
  @SerializedName(SERIALIZED_NAME_SOURCE_FROM)
  private String sourceFrom;

  public PluginUseRelationInfo() { 
  }

  public PluginUseRelationInfo betaMemo(String betaMemo) {
    
    this.betaMemo = betaMemo;
    return this;
  }

   /**
   * 邀测驳回原因
   * @return betaMemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试不通过", value = "邀测驳回原因")

  public String getBetaMemo() {
    return betaMemo;
  }


  public void setBetaMemo(String betaMemo) {
    this.betaMemo = betaMemo;
  }


  public PluginUseRelationInfo betaPluginVersion(String betaPluginVersion) {
    
    this.betaPluginVersion = betaPluginVersion;
    return this;
  }

   /**
   * 邀测插件版本号
   * @return betaPluginVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.3", value = "邀测插件版本号")

  public String getBetaPluginVersion() {
    return betaPluginVersion;
  }


  public void setBetaPluginVersion(String betaPluginVersion) {
    this.betaPluginVersion = betaPluginVersion;
  }


  public PluginUseRelationInfo betaQrCodeUrl(String betaQrCodeUrl) {
    
    this.betaQrCodeUrl = betaQrCodeUrl;
    return this;
  }

   /**
   * 邀测二维码
   * @return betaQrCodeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://mobilecodec.alipay.com/show.htm?code=0le14985b5hyws8pcbyah5f", value = "邀测二维码")

  public String getBetaQrCodeUrl() {
    return betaQrCodeUrl;
  }


  public void setBetaQrCodeUrl(String betaQrCodeUrl) {
    this.betaQrCodeUrl = betaQrCodeUrl;
  }


  public PluginUseRelationInfo betaStatus(String betaStatus) {
    
    this.betaStatus = betaStatus;
    return this;
  }

   /**
   * WAITCHECK-待确认;CHECKED-确认;REJECT-拒绝
   * @return betaStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WAITCHECK", value = "WAITCHECK-待确认;CHECKED-确认;REJECT-拒绝")

  public String getBetaStatus() {
    return betaStatus;
  }


  public void setBetaStatus(String betaStatus) {
    this.betaStatus = betaStatus;
  }


  public PluginUseRelationInfo gmtActive(String gmtActive) {
    
    this.gmtActive = gmtActive;
    return this;
  }

   /**
   * 激活时间
   * @return gmtActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-05-10 15:10:25", value = "激活时间")

  public String getGmtActive() {
    return gmtActive;
  }


  public void setGmtActive(String gmtActive) {
    this.gmtActive = gmtActive;
  }


  public PluginUseRelationInfo gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 订购时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-05-10 15:10:25", value = "订购时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public PluginUseRelationInfo gmtInvalid(String gmtInvalid) {
    
    this.gmtInvalid = gmtInvalid;
    return this;
  }

   /**
   * 插件失效时间
   * @return gmtInvalid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9999-12-31 00:00:00", value = "插件失效时间")

  public String getGmtInvalid() {
    return gmtInvalid;
  }


  public void setGmtInvalid(String gmtInvalid) {
    this.gmtInvalid = gmtInvalid;
  }


  public PluginUseRelationInfo miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 应用ID
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012211102012056", value = "应用ID")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public PluginUseRelationInfo pluginDeployVersion(String pluginDeployVersion) {
    
    this.pluginDeployVersion = pluginDeployVersion;
    return this;
  }

   /**
   * 插件构建版本
   * @return pluginDeployVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.2.1812171829.32", value = "插件构建版本")

  public String getPluginDeployVersion() {
    return pluginDeployVersion;
  }


  public void setPluginDeployVersion(String pluginDeployVersion) {
    this.pluginDeployVersion = pluginDeployVersion;
  }


  public PluginUseRelationInfo pluginId(String pluginId) {
    
    this.pluginId = pluginId;
    return this;
  }

   /**
   * 插件ID
   * @return pluginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012211102012088", value = "插件ID")

  public String getPluginId() {
    return pluginId;
  }


  public void setPluginId(String pluginId) {
    this.pluginId = pluginId;
  }


  public PluginUseRelationInfo pluginStatus(String pluginStatus) {
    
    this.pluginStatus = pluginStatus;
    return this;
  }

   /**
   * 插件状态，取值包括EXECUTING/WAIT_WORKING/WORKING/STOP_WORKING/WAIT_BUY
   * @return pluginStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WORKING", value = "插件状态，取值包括EXECUTING/WAIT_WORKING/WORKING/STOP_WORKING/WAIT_BUY")

  public String getPluginStatus() {
    return pluginStatus;
  }


  public void setPluginStatus(String pluginStatus) {
    this.pluginStatus = pluginStatus;
  }


  public PluginUseRelationInfo pluginUseConfigInfoList(List<PluginUseConfigInfo> pluginUseConfigInfoList) {
    
    this.pluginUseConfigInfoList = pluginUseConfigInfoList;
    return this;
  }

  public PluginUseRelationInfo addPluginUseConfigInfoListItem(PluginUseConfigInfo pluginUseConfigInfoListItem) {
    if (this.pluginUseConfigInfoList == null) {
      this.pluginUseConfigInfoList = new ArrayList<>();
    }
    this.pluginUseConfigInfoList.add(pluginUseConfigInfoListItem);
    return this;
  }

   /**
   * 分端版本配置信息列表
   * @return pluginUseConfigInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分端版本配置信息列表")

  public List<PluginUseConfigInfo> getPluginUseConfigInfoList() {
    return pluginUseConfigInfoList;
  }


  public void setPluginUseConfigInfoList(List<PluginUseConfigInfo> pluginUseConfigInfoList) {
    this.pluginUseConfigInfoList = pluginUseConfigInfoList;
  }


  public PluginUseRelationInfo pluginVersion(String pluginVersion) {
    
    this.pluginVersion = pluginVersion;
    return this;
  }

   /**
   * 插件版本
   * @return pluginVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.1", value = "插件版本")

  public String getPluginVersion() {
    return pluginVersion;
  }


  public void setPluginVersion(String pluginVersion) {
    this.pluginVersion = pluginVersion;
  }


  public PluginUseRelationInfo runModeType(String runModeType) {
    
    this.runModeType = runModeType;
    return this;
  }

   /**
   * 插件运行状态，取值包括ONLINE/TRIAL/REVIEW/DEBUG
   * @return runModeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ONLINE", value = "插件运行状态，取值包括ONLINE/TRIAL/REVIEW/DEBUG")

  public String getRunModeType() {
    return runModeType;
  }


  public void setRunModeType(String runModeType) {
    this.runModeType = runModeType;
  }


  public PluginUseRelationInfo sourceFrom(String sourceFrom) {
    
    this.sourceFrom = sourceFrom;
    return this;
  }

   /**
   * 渠道来源，取值包括SHOP_MINI/PLUGIN_DEBUG/PLUGIN_TRIAL/PLUGIN_AUDIT/GENERAL_SHOP_ID
   * @return sourceFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PLUGIN_DEBUG", value = "渠道来源，取值包括SHOP_MINI/PLUGIN_DEBUG/PLUGIN_TRIAL/PLUGIN_AUDIT/GENERAL_SHOP_ID")

  public String getSourceFrom() {
    return sourceFrom;
  }


  public void setSourceFrom(String sourceFrom) {
    this.sourceFrom = sourceFrom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginUseRelationInfo pluginUseRelationInfo = (PluginUseRelationInfo) o;
    return Objects.equals(this.betaMemo, pluginUseRelationInfo.betaMemo) &&
        Objects.equals(this.betaPluginVersion, pluginUseRelationInfo.betaPluginVersion) &&
        Objects.equals(this.betaQrCodeUrl, pluginUseRelationInfo.betaQrCodeUrl) &&
        Objects.equals(this.betaStatus, pluginUseRelationInfo.betaStatus) &&
        Objects.equals(this.gmtActive, pluginUseRelationInfo.gmtActive) &&
        Objects.equals(this.gmtCreate, pluginUseRelationInfo.gmtCreate) &&
        Objects.equals(this.gmtInvalid, pluginUseRelationInfo.gmtInvalid) &&
        Objects.equals(this.miniAppId, pluginUseRelationInfo.miniAppId) &&
        Objects.equals(this.pluginDeployVersion, pluginUseRelationInfo.pluginDeployVersion) &&
        Objects.equals(this.pluginId, pluginUseRelationInfo.pluginId) &&
        Objects.equals(this.pluginStatus, pluginUseRelationInfo.pluginStatus) &&
        Objects.equals(this.pluginUseConfigInfoList, pluginUseRelationInfo.pluginUseConfigInfoList) &&
        Objects.equals(this.pluginVersion, pluginUseRelationInfo.pluginVersion) &&
        Objects.equals(this.runModeType, pluginUseRelationInfo.runModeType) &&
        Objects.equals(this.sourceFrom, pluginUseRelationInfo.sourceFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(betaMemo, betaPluginVersion, betaQrCodeUrl, betaStatus, gmtActive, gmtCreate, gmtInvalid, miniAppId, pluginDeployVersion, pluginId, pluginStatus, pluginUseConfigInfoList, pluginVersion, runModeType, sourceFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginUseRelationInfo {\n");
    sb.append("    betaMemo: ").append(toIndentedString(betaMemo)).append("\n");
    sb.append("    betaPluginVersion: ").append(toIndentedString(betaPluginVersion)).append("\n");
    sb.append("    betaQrCodeUrl: ").append(toIndentedString(betaQrCodeUrl)).append("\n");
    sb.append("    betaStatus: ").append(toIndentedString(betaStatus)).append("\n");
    sb.append("    gmtActive: ").append(toIndentedString(gmtActive)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtInvalid: ").append(toIndentedString(gmtInvalid)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    pluginDeployVersion: ").append(toIndentedString(pluginDeployVersion)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    pluginStatus: ").append(toIndentedString(pluginStatus)).append("\n");
    sb.append("    pluginUseConfigInfoList: ").append(toIndentedString(pluginUseConfigInfoList)).append("\n");
    sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
    sb.append("    runModeType: ").append(toIndentedString(runModeType)).append("\n");
    sb.append("    sourceFrom: ").append(toIndentedString(sourceFrom)).append("\n");
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
    openapiFields.add("beta_memo");
    openapiFields.add("beta_plugin_version");
    openapiFields.add("beta_qr_code_url");
    openapiFields.add("beta_status");
    openapiFields.add("gmt_active");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_invalid");
    openapiFields.add("mini_app_id");
    openapiFields.add("plugin_deploy_version");
    openapiFields.add("plugin_id");
    openapiFields.add("plugin_status");
    openapiFields.add("plugin_use_config_info_list");
    openapiFields.add("plugin_version");
    openapiFields.add("run_mode_type");
    openapiFields.add("source_from");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PluginUseRelationInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PluginUseRelationInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PluginUseRelationInfo is not found in the empty JSON string", PluginUseRelationInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PluginUseRelationInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PluginUseRelationInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("beta_memo") != null && !jsonObj.get("beta_memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beta_memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beta_memo").toString()));
      }
      if (jsonObj.get("beta_plugin_version") != null && !jsonObj.get("beta_plugin_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beta_plugin_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beta_plugin_version").toString()));
      }
      if (jsonObj.get("beta_qr_code_url") != null && !jsonObj.get("beta_qr_code_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beta_qr_code_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beta_qr_code_url").toString()));
      }
      if (jsonObj.get("beta_status") != null && !jsonObj.get("beta_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beta_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beta_status").toString()));
      }
      if (jsonObj.get("gmt_active") != null && !jsonObj.get("gmt_active").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_active` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_active").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_invalid") != null && !jsonObj.get("gmt_invalid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_invalid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_invalid").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("plugin_deploy_version") != null && !jsonObj.get("plugin_deploy_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_deploy_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_deploy_version").toString()));
      }
      if (jsonObj.get("plugin_id") != null && !jsonObj.get("plugin_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_id").toString()));
      }
      if (jsonObj.get("plugin_status") != null && !jsonObj.get("plugin_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_status").toString()));
      }
      JsonArray jsonArraypluginUseConfigInfoList = jsonObj.getAsJsonArray("plugin_use_config_info_list");
      if (jsonArraypluginUseConfigInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("plugin_use_config_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `plugin_use_config_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("plugin_use_config_info_list").toString()));
        }

        // validate the optional field `plugin_use_config_info_list` (array)
        for (int i = 0; i < jsonArraypluginUseConfigInfoList.size(); i++) {
          PluginUseConfigInfo.validateJsonObject(jsonArraypluginUseConfigInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("plugin_version") != null && !jsonObj.get("plugin_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_version").toString()));
      }
      if (jsonObj.get("run_mode_type") != null && !jsonObj.get("run_mode_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `run_mode_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("run_mode_type").toString()));
      }
      if (jsonObj.get("source_from") != null && !jsonObj.get("source_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_from").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PluginUseRelationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PluginUseRelationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PluginUseRelationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PluginUseRelationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PluginUseRelationInfo>() {
           @Override
           public void write(JsonWriter out, PluginUseRelationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PluginUseRelationInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PluginUseRelationInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PluginUseRelationInfo
  * @throws IOException if the JSON string is invalid with respect to PluginUseRelationInfo
  */
  public static PluginUseRelationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PluginUseRelationInfo.class);
  }

 /**
  * Convert an instance of PluginUseRelationInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

