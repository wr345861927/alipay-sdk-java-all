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
 * InvoiceTitleModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoiceTitleModel {
  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_LOGON_ID = "logon_id";
  @SerializedName(SERIALIZED_NAME_LOGON_ID)
  private String logonId;

  public static final String SERIALIZED_NAME_OPEN_BANK_ACCOUNT = "open_bank_account";
  @SerializedName(SERIALIZED_NAME_OPEN_BANK_ACCOUNT)
  private String openBankAccount;

  public static final String SERIALIZED_NAME_OPEN_BANK_NAME = "open_bank_name";
  @SerializedName(SERIALIZED_NAME_OPEN_BANK_NAME)
  private String openBankName;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_TAX_REGISTER_NO = "tax_register_no";
  @SerializedName(SERIALIZED_NAME_TAX_REGISTER_NO)
  private String taxRegisterNo;

  public static final String SERIALIZED_NAME_TELE_PHONE_NO = "tele_phone_no";
  @SerializedName(SERIALIZED_NAME_TELE_PHONE_NO)
  private String telePhoneNo;

  public static final String SERIALIZED_NAME_TITLE_NAME = "title_name";
  @SerializedName(SERIALIZED_NAME_TITLE_NAME)
  private String titleName;

  public static final String SERIALIZED_NAME_TITLE_TYPE = "title_type";
  @SerializedName(SERIALIZED_NAME_TITLE_TYPE)
  private String titleType;

  public static final String SERIALIZED_NAME_USER_ADDRESS = "user_address";
  @SerializedName(SERIALIZED_NAME_USER_ADDRESS)
  private String userAddress;

  public static final String SERIALIZED_NAME_USER_EMAIL = "user_email";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USER_MOBILE = "user_mobile";
  @SerializedName(SERIALIZED_NAME_USER_MOBILE)
  private String userMobile;

  public InvoiceTitleModel() { 
  }

  public InvoiceTitleModel isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * 是否为用户设置默认抬头  字段值包括两种情况：  false（非默认）  true（默认抬头）
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否为用户设置默认抬头  字段值包括两种情况：  false（非默认）  true（默认抬头）")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public InvoiceTitleModel logonId(String logonId) {
    
    this.logonId = logonId;
    return this;
  }

   /**
   * 支付宝用户登录名
   * @return logonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝用户登录名")

  public String getLogonId() {
    return logonId;
  }


  public void setLogonId(String logonId) {
    this.logonId = logonId;
  }


  public InvoiceTitleModel openBankAccount(String openBankAccount) {
    
    this.openBankAccount = openBankAccount;
    return this;
  }

   /**
   * 银行账号
   * @return openBankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "银行账号")

  public String getOpenBankAccount() {
    return openBankAccount;
  }


  public void setOpenBankAccount(String openBankAccount) {
    this.openBankAccount = openBankAccount;
  }


  public InvoiceTitleModel openBankName(String openBankName) {
    
    this.openBankName = openBankName;
    return this;
  }

   /**
   * 开户银行
   * @return openBankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开户银行")

  public String getOpenBankName() {
    return openBankName;
  }


  public void setOpenBankName(String openBankName) {
    this.openBankName = openBankName;
  }


  public InvoiceTitleModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户id
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝用户id")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public InvoiceTitleModel taxRegisterNo(String taxRegisterNo) {
    
    this.taxRegisterNo = taxRegisterNo;
    return this;
  }

   /**
   * 纳税人识别号
   * @return taxRegisterNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "纳税人识别号")

  public String getTaxRegisterNo() {
    return taxRegisterNo;
  }


  public void setTaxRegisterNo(String taxRegisterNo) {
    this.taxRegisterNo = taxRegisterNo;
  }


  public InvoiceTitleModel telePhoneNo(String telePhoneNo) {
    
    this.telePhoneNo = telePhoneNo;
    return this;
  }

   /**
   * 用户私人手机号
   * @return telePhoneNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户私人手机号")

  public String getTelePhoneNo() {
    return telePhoneNo;
  }


  public void setTelePhoneNo(String telePhoneNo) {
    this.telePhoneNo = telePhoneNo;
  }


  public InvoiceTitleModel titleName(String titleName) {
    
    this.titleName = titleName;
    return this;
  }

   /**
   * 抬头名称
   * @return titleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "抬头名称")

  public String getTitleName() {
    return titleName;
  }


  public void setTitleName(String titleName) {
    this.titleName = titleName;
  }


  public InvoiceTitleModel titleType(String titleType) {
    
    this.titleType = titleType;
    return this;
  }

   /**
   * 抬头类型  字段值有两种情况抬:  PERSONAL（个人）   CORPORATION（单位）
   * @return titleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "抬头类型  字段值有两种情况抬:  PERSONAL（个人）   CORPORATION（单位）")

  public String getTitleType() {
    return titleType;
  }


  public void setTitleType(String titleType) {
    this.titleType = titleType;
  }


  public InvoiceTitleModel userAddress(String userAddress) {
    
    this.userAddress = userAddress;
    return this;
  }

   /**
   * 地址
   * @return userAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "地址")

  public String getUserAddress() {
    return userAddress;
  }


  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }


  public InvoiceTitleModel userEmail(String userEmail) {
    
    this.userEmail = userEmail;
    return this;
  }

   /**
   * 邮箱
   * @return userEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "邮箱")

  public String getUserEmail() {
    return userEmail;
  }


  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public InvoiceTitleModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 支付宝用户id
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝用户id")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public InvoiceTitleModel userMobile(String userMobile) {
    
    this.userMobile = userMobile;
    return this;
  }

   /**
   * 电话号码
   * @return userMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "电话号码")

  public String getUserMobile() {
    return userMobile;
  }


  public void setUserMobile(String userMobile) {
    this.userMobile = userMobile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceTitleModel invoiceTitleModel = (InvoiceTitleModel) o;
    return Objects.equals(this.isDefault, invoiceTitleModel.isDefault) &&
        Objects.equals(this.logonId, invoiceTitleModel.logonId) &&
        Objects.equals(this.openBankAccount, invoiceTitleModel.openBankAccount) &&
        Objects.equals(this.openBankName, invoiceTitleModel.openBankName) &&
        Objects.equals(this.openId, invoiceTitleModel.openId) &&
        Objects.equals(this.taxRegisterNo, invoiceTitleModel.taxRegisterNo) &&
        Objects.equals(this.telePhoneNo, invoiceTitleModel.telePhoneNo) &&
        Objects.equals(this.titleName, invoiceTitleModel.titleName) &&
        Objects.equals(this.titleType, invoiceTitleModel.titleType) &&
        Objects.equals(this.userAddress, invoiceTitleModel.userAddress) &&
        Objects.equals(this.userEmail, invoiceTitleModel.userEmail) &&
        Objects.equals(this.userId, invoiceTitleModel.userId) &&
        Objects.equals(this.userMobile, invoiceTitleModel.userMobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, logonId, openBankAccount, openBankName, openId, taxRegisterNo, telePhoneNo, titleName, titleType, userAddress, userEmail, userId, userMobile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceTitleModel {\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    logonId: ").append(toIndentedString(logonId)).append("\n");
    sb.append("    openBankAccount: ").append(toIndentedString(openBankAccount)).append("\n");
    sb.append("    openBankName: ").append(toIndentedString(openBankName)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    taxRegisterNo: ").append(toIndentedString(taxRegisterNo)).append("\n");
    sb.append("    telePhoneNo: ").append(toIndentedString(telePhoneNo)).append("\n");
    sb.append("    titleName: ").append(toIndentedString(titleName)).append("\n");
    sb.append("    titleType: ").append(toIndentedString(titleType)).append("\n");
    sb.append("    userAddress: ").append(toIndentedString(userAddress)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userMobile: ").append(toIndentedString(userMobile)).append("\n");
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
    openapiFields.add("is_default");
    openapiFields.add("logon_id");
    openapiFields.add("open_bank_account");
    openapiFields.add("open_bank_name");
    openapiFields.add("open_id");
    openapiFields.add("tax_register_no");
    openapiFields.add("tele_phone_no");
    openapiFields.add("title_name");
    openapiFields.add("title_type");
    openapiFields.add("user_address");
    openapiFields.add("user_email");
    openapiFields.add("user_id");
    openapiFields.add("user_mobile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceTitleModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoiceTitleModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceTitleModel is not found in the empty JSON string", InvoiceTitleModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoiceTitleModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceTitleModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("logon_id") != null && !jsonObj.get("logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logon_id").toString()));
      }
      if (jsonObj.get("open_bank_account") != null && !jsonObj.get("open_bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_bank_account").toString()));
      }
      if (jsonObj.get("open_bank_name") != null && !jsonObj.get("open_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_bank_name").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("tax_register_no") != null && !jsonObj.get("tax_register_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_register_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_register_no").toString()));
      }
      if (jsonObj.get("tele_phone_no") != null && !jsonObj.get("tele_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tele_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tele_phone_no").toString()));
      }
      if (jsonObj.get("title_name") != null && !jsonObj.get("title_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_name").toString()));
      }
      if (jsonObj.get("title_type") != null && !jsonObj.get("title_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_type").toString()));
      }
      if (jsonObj.get("user_address") != null && !jsonObj.get("user_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_address").toString()));
      }
      if (jsonObj.get("user_email") != null && !jsonObj.get("user_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_email").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("user_mobile") != null && !jsonObj.get("user_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_mobile").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceTitleModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceTitleModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceTitleModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceTitleModel.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceTitleModel>() {
           @Override
           public void write(JsonWriter out, InvoiceTitleModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceTitleModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceTitleModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceTitleModel
  * @throws IOException if the JSON string is invalid with respect to InvoiceTitleModel
  */
  public static InvoiceTitleModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceTitleModel.class);
  }

 /**
  * Convert an instance of InvoiceTitleModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

