/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
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
 * EnterpriseInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterpriseInfoDTO {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACTIVATE = "activate";
  @SerializedName(SERIALIZED_NAME_ACTIVATE)
  private String activate;

  public static final String SERIALIZED_NAME_AUTH_LEVEL = "auth_level";
  @SerializedName(SERIALIZED_NAME_AUTH_LEVEL)
  private String authLevel;

  public static final String SERIALIZED_NAME_AUTH_STATUS = "auth_status";
  @SerializedName(SERIALIZED_NAME_AUTH_STATUS)
  private String authStatus;

  public static final String SERIALIZED_NAME_AUTH_TIME = "auth_time";
  @SerializedName(SERIALIZED_NAME_AUTH_TIME)
  private String authTime;

  public static final String SERIALIZED_NAME_ENTERPRISE_ALIAS = "enterprise_alias";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ALIAS)
  private String enterpriseAlias;

  public static final String SERIALIZED_NAME_ENTERPRISE_CODE = "enterprise_code";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_CODE)
  private String enterpriseCode;

  public static final String SERIALIZED_NAME_ENTERPRISE_EMAIL = "enterprise_email";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_EMAIL)
  private String enterpriseEmail;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_ENTERPRISE_NAME = "enterprise_name";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_NAME)
  private String enterpriseName;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_IOT_GROUP_ID = "iot_group_id";
  @SerializedName(SERIALIZED_NAME_IOT_GROUP_ID)
  private String iotGroupId;

  public static final String SERIALIZED_NAME_IOT_LOGIC_GROUP_ID = "iot_logic_group_id";
  @SerializedName(SERIALIZED_NAME_IOT_LOGIC_GROUP_ID)
  private String iotLogicGroupId;

  public static final String SERIALIZED_NAME_PLATFORM_CODE = "platform_code";
  @SerializedName(SERIALIZED_NAME_PLATFORM_CODE)
  private String platformCode;

  public static final String SERIALIZED_NAME_PLATFORM_OUT_ID = "platform_out_id";
  @SerializedName(SERIALIZED_NAME_PLATFORM_OUT_ID)
  private String platformOutId;

  public static final String SERIALIZED_NAME_SIGN_STATUS = "sign_status";
  @SerializedName(SERIALIZED_NAME_SIGN_STATUS)
  private String signStatus;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public EnterpriseInfoDTO() { 
  }

  public EnterpriseInfoDTO accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户id
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "共同账户id")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public EnterpriseInfoDTO activate(String activate) {
    
    this.activate = activate;
    return this;
  }

   /**
   * 因公签约状态
   * @return activate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "因公签约状态")

  public String getActivate() {
    return activate;
  }


  public void setActivate(String activate) {
    this.activate = activate;
  }


  public EnterpriseInfoDTO authLevel(String authLevel) {
    
    this.authLevel = authLevel;
    return this;
  }

   /**
   * 企业认证等级
   * @return authLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业认证等级")

  public String getAuthLevel() {
    return authLevel;
  }


  public void setAuthLevel(String authLevel) {
    this.authLevel = authLevel;
  }


  public EnterpriseInfoDTO authStatus(String authStatus) {
    
    this.authStatus = authStatus;
    return this;
  }

   /**
   * 认证状态
   * @return authStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "认证状态")

  public String getAuthStatus() {
    return authStatus;
  }


  public void setAuthStatus(String authStatus) {
    this.authStatus = authStatus;
  }


  public EnterpriseInfoDTO authTime(String authTime) {
    
    this.authTime = authTime;
    return this;
  }

   /**
   * 认证时间
   * @return authTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "认证时间")

  public String getAuthTime() {
    return authTime;
  }


  public void setAuthTime(String authTime) {
    this.authTime = authTime;
  }


  public EnterpriseInfoDTO enterpriseAlias(String enterpriseAlias) {
    
    this.enterpriseAlias = enterpriseAlias;
    return this;
  }

   /**
   * 企业简称
   * @return enterpriseAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业简称")

  public String getEnterpriseAlias() {
    return enterpriseAlias;
  }


  public void setEnterpriseAlias(String enterpriseAlias) {
    this.enterpriseAlias = enterpriseAlias;
  }


  public EnterpriseInfoDTO enterpriseCode(String enterpriseCode) {
    
    this.enterpriseCode = enterpriseCode;
    return this;
  }

   /**
   * 统一社会信用码
   * @return enterpriseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "统一社会信用码")

  public String getEnterpriseCode() {
    return enterpriseCode;
  }


  public void setEnterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
  }


  public EnterpriseInfoDTO enterpriseEmail(String enterpriseEmail) {
    
    this.enterpriseEmail = enterpriseEmail;
    return this;
  }

   /**
   * 企业邮箱
   * @return enterpriseEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业邮箱")

  public String getEnterpriseEmail() {
    return enterpriseEmail;
  }


  public void setEnterpriseEmail(String enterpriseEmail) {
    this.enterpriseEmail = enterpriseEmail;
  }


  public EnterpriseInfoDTO enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public EnterpriseInfoDTO enterpriseName(String enterpriseName) {
    
    this.enterpriseName = enterpriseName;
    return this;
  }

   /**
   * 企业名称
   * @return enterpriseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业名称")

  public String getEnterpriseName() {
    return enterpriseName;
  }


  public void setEnterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }


  public EnterpriseInfoDTO gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public EnterpriseInfoDTO gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 更新时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "更新时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public EnterpriseInfoDTO iotGroupId(String iotGroupId) {
    
    this.iotGroupId = iotGroupId;
    return this;
  }

   /**
   * 封闭场景（如班车）的人脸库id
   * @return iotGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "封闭场景（如班车）的人脸库id")

  public String getIotGroupId() {
    return iotGroupId;
  }


  public void setIotGroupId(String iotGroupId) {
    this.iotGroupId = iotGroupId;
  }


  public EnterpriseInfoDTO iotLogicGroupId(String iotLogicGroupId) {
    
    this.iotLogicGroupId = iotLogicGroupId;
    return this;
  }

   /**
   * 开放场景（如团餐）的人脸库id
   * @return iotLogicGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开放场景（如团餐）的人脸库id")

  public String getIotLogicGroupId() {
    return iotLogicGroupId;
  }


  public void setIotLogicGroupId(String iotLogicGroupId) {
    this.iotLogicGroupId = iotLogicGroupId;
  }


  public EnterpriseInfoDTO platformCode(String platformCode) {
    
    this.platformCode = platformCode;
    return this;
  }

   /**
   * 外部平台code
   * @return platformCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外部平台code")

  public String getPlatformCode() {
    return platformCode;
  }


  public void setPlatformCode(String platformCode) {
    this.platformCode = platformCode;
  }


  public EnterpriseInfoDTO platformOutId(String platformOutId) {
    
    this.platformOutId = platformOutId;
    return this;
  }

   /**
   * 外部平台id
   * @return platformOutId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外部平台id")

  public String getPlatformOutId() {
    return platformOutId;
  }


  public void setPlatformOutId(String platformOutId) {
    this.platformOutId = platformOutId;
  }


  public EnterpriseInfoDTO signStatus(String signStatus) {
    
    this.signStatus = signStatus;
    return this;
  }

   /**
   * 企业码服务协议签约状态
   * @return signStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业码服务协议签约状态")

  public String getSignStatus() {
    return signStatus;
  }


  public void setSignStatus(String signStatus) {
    this.signStatus = signStatus;
  }


  public EnterpriseInfoDTO status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 企业当前状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业当前状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the EnterpriseInfoDTO instance itself
   */
  public EnterpriseInfoDTO putAdditionalProperty(String key, Object value) {
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
    EnterpriseInfoDTO enterpriseInfoDTO = (EnterpriseInfoDTO) o;
    return Objects.equals(this.accountId, enterpriseInfoDTO.accountId) &&
        Objects.equals(this.activate, enterpriseInfoDTO.activate) &&
        Objects.equals(this.authLevel, enterpriseInfoDTO.authLevel) &&
        Objects.equals(this.authStatus, enterpriseInfoDTO.authStatus) &&
        Objects.equals(this.authTime, enterpriseInfoDTO.authTime) &&
        Objects.equals(this.enterpriseAlias, enterpriseInfoDTO.enterpriseAlias) &&
        Objects.equals(this.enterpriseCode, enterpriseInfoDTO.enterpriseCode) &&
        Objects.equals(this.enterpriseEmail, enterpriseInfoDTO.enterpriseEmail) &&
        Objects.equals(this.enterpriseId, enterpriseInfoDTO.enterpriseId) &&
        Objects.equals(this.enterpriseName, enterpriseInfoDTO.enterpriseName) &&
        Objects.equals(this.gmtCreate, enterpriseInfoDTO.gmtCreate) &&
        Objects.equals(this.gmtModified, enterpriseInfoDTO.gmtModified) &&
        Objects.equals(this.iotGroupId, enterpriseInfoDTO.iotGroupId) &&
        Objects.equals(this.iotLogicGroupId, enterpriseInfoDTO.iotLogicGroupId) &&
        Objects.equals(this.platformCode, enterpriseInfoDTO.platformCode) &&
        Objects.equals(this.platformOutId, enterpriseInfoDTO.platformOutId) &&
        Objects.equals(this.signStatus, enterpriseInfoDTO.signStatus) &&
        Objects.equals(this.status, enterpriseInfoDTO.status)&&
        Objects.equals(this.additionalProperties, enterpriseInfoDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, activate, authLevel, authStatus, authTime, enterpriseAlias, enterpriseCode, enterpriseEmail, enterpriseId, enterpriseName, gmtCreate, gmtModified, iotGroupId, iotLogicGroupId, platformCode, platformOutId, signStatus, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseInfoDTO {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    activate: ").append(toIndentedString(activate)).append("\n");
    sb.append("    authLevel: ").append(toIndentedString(authLevel)).append("\n");
    sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
    sb.append("    authTime: ").append(toIndentedString(authTime)).append("\n");
    sb.append("    enterpriseAlias: ").append(toIndentedString(enterpriseAlias)).append("\n");
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    enterpriseEmail: ").append(toIndentedString(enterpriseEmail)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    enterpriseName: ").append(toIndentedString(enterpriseName)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    iotGroupId: ").append(toIndentedString(iotGroupId)).append("\n");
    sb.append("    iotLogicGroupId: ").append(toIndentedString(iotLogicGroupId)).append("\n");
    sb.append("    platformCode: ").append(toIndentedString(platformCode)).append("\n");
    sb.append("    platformOutId: ").append(toIndentedString(platformOutId)).append("\n");
    sb.append("    signStatus: ").append(toIndentedString(signStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("activate");
    openapiFields.add("auth_level");
    openapiFields.add("auth_status");
    openapiFields.add("auth_time");
    openapiFields.add("enterprise_alias");
    openapiFields.add("enterprise_code");
    openapiFields.add("enterprise_email");
    openapiFields.add("enterprise_id");
    openapiFields.add("enterprise_name");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("iot_group_id");
    openapiFields.add("iot_logic_group_id");
    openapiFields.add("platform_code");
    openapiFields.add("platform_out_id");
    openapiFields.add("sign_status");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EnterpriseInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EnterpriseInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnterpriseInfoDTO is not found in the empty JSON string", EnterpriseInfoDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("activate") != null && !jsonObj.get("activate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activate").toString()));
      }
      if (jsonObj.get("auth_level") != null && !jsonObj.get("auth_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_level").toString()));
      }
      if (jsonObj.get("auth_status") != null && !jsonObj.get("auth_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_status").toString()));
      }
      if (jsonObj.get("auth_time") != null && !jsonObj.get("auth_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_time").toString()));
      }
      if (jsonObj.get("enterprise_alias") != null && !jsonObj.get("enterprise_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_alias").toString()));
      }
      if (jsonObj.get("enterprise_code") != null && !jsonObj.get("enterprise_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_code").toString()));
      }
      if (jsonObj.get("enterprise_email") != null && !jsonObj.get("enterprise_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_email").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("enterprise_name") != null && !jsonObj.get("enterprise_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_name").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("iot_group_id") != null && !jsonObj.get("iot_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iot_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iot_group_id").toString()));
      }
      if (jsonObj.get("iot_logic_group_id") != null && !jsonObj.get("iot_logic_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iot_logic_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iot_logic_group_id").toString()));
      }
      if (jsonObj.get("platform_code") != null && !jsonObj.get("platform_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform_code").toString()));
      }
      if (jsonObj.get("platform_out_id") != null && !jsonObj.get("platform_out_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform_out_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform_out_id").toString()));
      }
      if (jsonObj.get("sign_status") != null && !jsonObj.get("sign_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_status").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseInfoDTO>() {
           @Override
           public void write(JsonWriter out, EnterpriseInfoDTO value) throws IOException {
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
           public EnterpriseInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EnterpriseInfoDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EnterpriseInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseInfoDTO
  * @throws IOException if the JSON string is invalid with respect to EnterpriseInfoDTO
  */
  public static EnterpriseInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseInfoDTO.class);
  }

 /**
  * Convert an instance of EnterpriseInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

