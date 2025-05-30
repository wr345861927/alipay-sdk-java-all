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
import com.alipay.v3.model.FaceExtParams;
import com.alipay.v3.model.FaceMachineInfo;
import com.alipay.v3.model.FaceMerchantInfo;
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
 * ZolozAuthenticationSmilepayInitializeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZolozAuthenticationSmilepayInitializeModel {
  public static final String SERIALIZED_NAME_APDID_TOKEN = "apdid_token";
  @SerializedName(SERIALIZED_NAME_APDID_TOKEN)
  private String apdidToken;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_BASE_VER = "base_ver";
  @SerializedName(SERIALIZED_NAME_BASE_VER)
  private String baseVer;

  public static final String SERIALIZED_NAME_BIO_META_INFO = "bio_meta_info";
  @SerializedName(SERIALIZED_NAME_BIO_META_INFO)
  private String bioMetaInfo;

  public static final String SERIALIZED_NAME_DEVICE_MODEL = "device_model";
  @SerializedName(SERIALIZED_NAME_DEVICE_MODEL)
  private String deviceModel;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "device_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private String deviceType;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private FaceExtParams extInfo;

  public static final String SERIALIZED_NAME_MACHINE_INFO = "machine_info";
  @SerializedName(SERIALIZED_NAME_MACHINE_INFO)
  private FaceMachineInfo machineInfo;

  public static final String SERIALIZED_NAME_MERCHANT_INFO = "merchant_info";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INFO)
  private FaceMerchantInfo merchantInfo;

  public static final String SERIALIZED_NAME_OS_VERSION = "os_version";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_REMOTE_LOG_ID = "remote_log_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_LOG_ID)
  private String remoteLogId;

  public static final String SERIALIZED_NAME_ZIM_VER = "zim_ver";
  @SerializedName(SERIALIZED_NAME_ZIM_VER)
  private String zimVer;

  public ZolozAuthenticationSmilepayInitializeModel() { 
  }

  public ZolozAuthenticationSmilepayInitializeModel apdidToken(String apdidToken) {
    
    this.apdidToken = apdidToken;
    return this;
  }

   /**
   * 设备指纹，用于唯一标识一台设备
   * @return apdidToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40Kl9e97cQcMJka5gfT0arVPq7GTaR6yE5f73mj8zqBW9eOPZQEAAA==", value = "设备指纹，用于唯一标识一台设备")

  public String getApdidToken() {
    return apdidToken;
  }


  public void setApdidToken(String apdidToken) {
    this.apdidToken = apdidToken;
  }


  public ZolozAuthenticationSmilepayInitializeModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 人脸识别应用名称
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.alipay.zoloz.smile", value = "人脸识别应用名称")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public ZolozAuthenticationSmilepayInitializeModel appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 人脸识别应用版本号
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.7.0.201809191618", value = "人脸识别应用版本号")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public ZolozAuthenticationSmilepayInitializeModel baseVer(String baseVer) {
    
    this.baseVer = baseVer;
    return this;
  }

   /**
   * 基础包版本号
   * @return baseVer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7.1.1", value = "基础包版本号")

  public String getBaseVer() {
    return baseVer;
  }


  public void setBaseVer(String baseVer) {
    this.baseVer = baseVer;
  }


  public ZolozAuthenticationSmilepayInitializeModel bioMetaInfo(String bioMetaInfo) {
    
    this.bioMetaInfo = bioMetaInfo;
    return this;
  }

   /**
   * 生物识别元信息
   * @return bioMetaInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.13.0:12419136,6", value = "生物识别元信息")

  public String getBioMetaInfo() {
    return bioMetaInfo;
  }


  public void setBioMetaInfo(String bioMetaInfo) {
    this.bioMetaInfo = bioMetaInfo;
  }


  public ZolozAuthenticationSmilepayInitializeModel deviceModel(String deviceModel) {
    
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * 设备型号
   * @return deviceModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T2", value = "设备型号")

  public String getDeviceModel() {
    return deviceModel;
  }


  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }


  public ZolozAuthenticationSmilepayInitializeModel deviceType(String deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * 设备类型
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "android", value = "设备类型")

  public String getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }


  public ZolozAuthenticationSmilepayInitializeModel extInfo(FaceExtParams extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * Get extInfo
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaceExtParams getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(FaceExtParams extInfo) {
    this.extInfo = extInfo;
  }


  public ZolozAuthenticationSmilepayInitializeModel machineInfo(FaceMachineInfo machineInfo) {
    
    this.machineInfo = machineInfo;
    return this;
  }

   /**
   * Get machineInfo
   * @return machineInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaceMachineInfo getMachineInfo() {
    return machineInfo;
  }


  public void setMachineInfo(FaceMachineInfo machineInfo) {
    this.machineInfo = machineInfo;
  }


  public ZolozAuthenticationSmilepayInitializeModel merchantInfo(FaceMerchantInfo merchantInfo) {
    
    this.merchantInfo = merchantInfo;
    return this;
  }

   /**
   * Get merchantInfo
   * @return merchantInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaceMerchantInfo getMerchantInfo() {
    return merchantInfo;
  }


  public void setMerchantInfo(FaceMerchantInfo merchantInfo) {
    this.merchantInfo = merchantInfo;
  }


  public ZolozAuthenticationSmilepayInitializeModel osVersion(String osVersion) {
    
    this.osVersion = osVersion;
    return this;
  }

   /**
   * 操作系统版本号
   * @return osVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7.1.1", value = "操作系统版本号")

  public String getOsVersion() {
    return osVersion;
  }


  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public ZolozAuthenticationSmilepayInitializeModel remoteLogId(String remoteLogId) {
    
    this.remoteLogId = remoteLogId;
    return this;
  }

   /**
   * 业务ID
   * @return remoteLogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bcf71c4290f288f4421ee9d49eedbf1e2840ba", value = "业务ID")

  public String getRemoteLogId() {
    return remoteLogId;
  }


  public void setRemoteLogId(String remoteLogId) {
    this.remoteLogId = remoteLogId;
  }


  public ZolozAuthenticationSmilepayInitializeModel zimVer(String zimVer) {
    
    this.zimVer = zimVer;
    return this;
  }

   /**
   * ZIM版本号
   * @return zimVer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0.0", value = "ZIM版本号")

  public String getZimVer() {
    return zimVer;
  }


  public void setZimVer(String zimVer) {
    this.zimVer = zimVer;
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
   * @return the ZolozAuthenticationSmilepayInitializeModel instance itself
   */
  public ZolozAuthenticationSmilepayInitializeModel putAdditionalProperty(String key, Object value) {
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
    ZolozAuthenticationSmilepayInitializeModel zolozAuthenticationSmilepayInitializeModel = (ZolozAuthenticationSmilepayInitializeModel) o;
    return Objects.equals(this.apdidToken, zolozAuthenticationSmilepayInitializeModel.apdidToken) &&
        Objects.equals(this.appName, zolozAuthenticationSmilepayInitializeModel.appName) &&
        Objects.equals(this.appVersion, zolozAuthenticationSmilepayInitializeModel.appVersion) &&
        Objects.equals(this.baseVer, zolozAuthenticationSmilepayInitializeModel.baseVer) &&
        Objects.equals(this.bioMetaInfo, zolozAuthenticationSmilepayInitializeModel.bioMetaInfo) &&
        Objects.equals(this.deviceModel, zolozAuthenticationSmilepayInitializeModel.deviceModel) &&
        Objects.equals(this.deviceType, zolozAuthenticationSmilepayInitializeModel.deviceType) &&
        Objects.equals(this.extInfo, zolozAuthenticationSmilepayInitializeModel.extInfo) &&
        Objects.equals(this.machineInfo, zolozAuthenticationSmilepayInitializeModel.machineInfo) &&
        Objects.equals(this.merchantInfo, zolozAuthenticationSmilepayInitializeModel.merchantInfo) &&
        Objects.equals(this.osVersion, zolozAuthenticationSmilepayInitializeModel.osVersion) &&
        Objects.equals(this.remoteLogId, zolozAuthenticationSmilepayInitializeModel.remoteLogId) &&
        Objects.equals(this.zimVer, zolozAuthenticationSmilepayInitializeModel.zimVer)&&
        Objects.equals(this.additionalProperties, zolozAuthenticationSmilepayInitializeModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apdidToken, appName, appVersion, baseVer, bioMetaInfo, deviceModel, deviceType, extInfo, machineInfo, merchantInfo, osVersion, remoteLogId, zimVer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZolozAuthenticationSmilepayInitializeModel {\n");
    sb.append("    apdidToken: ").append(toIndentedString(apdidToken)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    baseVer: ").append(toIndentedString(baseVer)).append("\n");
    sb.append("    bioMetaInfo: ").append(toIndentedString(bioMetaInfo)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    machineInfo: ").append(toIndentedString(machineInfo)).append("\n");
    sb.append("    merchantInfo: ").append(toIndentedString(merchantInfo)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    remoteLogId: ").append(toIndentedString(remoteLogId)).append("\n");
    sb.append("    zimVer: ").append(toIndentedString(zimVer)).append("\n");
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
    openapiFields.add("apdid_token");
    openapiFields.add("app_name");
    openapiFields.add("app_version");
    openapiFields.add("base_ver");
    openapiFields.add("bio_meta_info");
    openapiFields.add("device_model");
    openapiFields.add("device_type");
    openapiFields.add("ext_info");
    openapiFields.add("machine_info");
    openapiFields.add("merchant_info");
    openapiFields.add("os_version");
    openapiFields.add("remote_log_id");
    openapiFields.add("zim_ver");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZolozAuthenticationSmilepayInitializeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZolozAuthenticationSmilepayInitializeModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZolozAuthenticationSmilepayInitializeModel is not found in the empty JSON string", ZolozAuthenticationSmilepayInitializeModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("apdid_token") != null && !jsonObj.get("apdid_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apdid_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apdid_token").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("base_ver") != null && !jsonObj.get("base_ver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base_ver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base_ver").toString()));
      }
      if (jsonObj.get("bio_meta_info") != null && !jsonObj.get("bio_meta_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bio_meta_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bio_meta_info").toString()));
      }
      if (jsonObj.get("device_model") != null && !jsonObj.get("device_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_model").toString()));
      }
      if (jsonObj.get("device_type") != null && !jsonObj.get("device_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_type").toString()));
      }
      // validate the optional field `ext_info`
      if (jsonObj.getAsJsonObject("ext_info") != null) {
        FaceExtParams.validateJsonObject(jsonObj.getAsJsonObject("ext_info"));
      }
      // validate the optional field `machine_info`
      if (jsonObj.getAsJsonObject("machine_info") != null) {
        FaceMachineInfo.validateJsonObject(jsonObj.getAsJsonObject("machine_info"));
      }
      // validate the optional field `merchant_info`
      if (jsonObj.getAsJsonObject("merchant_info") != null) {
        FaceMerchantInfo.validateJsonObject(jsonObj.getAsJsonObject("merchant_info"));
      }
      if (jsonObj.get("os_version") != null && !jsonObj.get("os_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_version").toString()));
      }
      if (jsonObj.get("remote_log_id") != null && !jsonObj.get("remote_log_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remote_log_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remote_log_id").toString()));
      }
      if (jsonObj.get("zim_ver") != null && !jsonObj.get("zim_ver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zim_ver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zim_ver").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZolozAuthenticationSmilepayInitializeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZolozAuthenticationSmilepayInitializeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZolozAuthenticationSmilepayInitializeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZolozAuthenticationSmilepayInitializeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZolozAuthenticationSmilepayInitializeModel>() {
           @Override
           public void write(JsonWriter out, ZolozAuthenticationSmilepayInitializeModel value) throws IOException {
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
           public ZolozAuthenticationSmilepayInitializeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZolozAuthenticationSmilepayInitializeModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZolozAuthenticationSmilepayInitializeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZolozAuthenticationSmilepayInitializeModel
  * @throws IOException if the JSON string is invalid with respect to ZolozAuthenticationSmilepayInitializeModel
  */
  public static ZolozAuthenticationSmilepayInitializeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZolozAuthenticationSmilepayInitializeModel.class);
  }

 /**
  * Convert an instance of ZolozAuthenticationSmilepayInitializeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

