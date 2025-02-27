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
 * AlipayOpenPublicAccountResetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicAccountResetModel {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_BIND_ACCOUNT_NO = "bind_account_no";
  @SerializedName(SERIALIZED_NAME_BIND_ACCOUNT_NO)
  private String bindAccountNo;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_FROM_USER_ID = "from_user_id";
  @SerializedName(SERIALIZED_NAME_FROM_USER_ID)
  private String fromUserId;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_REAL_NAME = "real_name";
  @SerializedName(SERIALIZED_NAME_REAL_NAME)
  private String realName;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public AlipayOpenPublicAccountResetModel() { 
  }

  public AlipayOpenPublicAccountResetModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 需要重置的协议号，商户会员在支付宝生活号账号中的唯一标识。
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "29022222", value = "需要重置的协议号，商户会员在支付宝生活号账号中的唯一标识。")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public AlipayOpenPublicAccountResetModel bindAccountNo(String bindAccountNo) {
    
    this.bindAccountNo = bindAccountNo;
    return this;
  }

   /**
   * 绑定帐号，建议在开发者的系统中保持唯一性
   * @return bindAccountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test002", value = "绑定帐号，建议在开发者的系统中保持唯一性")

  public String getBindAccountNo() {
    return bindAccountNo;
  }


  public void setBindAccountNo(String bindAccountNo) {
    this.bindAccountNo = bindAccountNo;
  }


  public AlipayOpenPublicAccountResetModel displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * 商户期望在生活号首页看到的关于该用户的显示信息，最长10个字符。 
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test002", value = "商户期望在生活号首页看到的关于该用户的显示信息，最长10个字符。 ")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public AlipayOpenPublicAccountResetModel fromUserId(String fromUserId) {
    
    this.fromUserId = fromUserId;
    return this;
  }

   /**
   * 要绑定的商户会员对应的支付宝唯一标识，2088开头长度为16位的字符串。 
   * @return fromUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088801234567890", value = "要绑定的商户会员对应的支付宝唯一标识，2088开头长度为16位的字符串。 ")

  public String getFromUserId() {
    return fromUserId;
  }


  public void setFromUserId(String fromUserId) {
    this.fromUserId = fromUserId;
  }


  public AlipayOpenPublicAccountResetModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 1
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "1")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayOpenPublicAccountResetModel realName(String realName) {
    
    this.realName = realName;
    return this;
  }

   /**
   * 要绑定的商户会员的真实姓名，最长10个汉字
   * @return realName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "要绑定的商户会员的真实姓名，最长10个汉字")

  public String getRealName() {
    return realName;
  }


  public void setRealName(String realName) {
    this.realName = realName;
  }


  public AlipayOpenPublicAccountResetModel remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 备注信息，开发者可以通过该字段纪录其他的额外信息
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "备注信息", value = "备注信息，开发者可以通过该字段纪录其他的额外信息")

  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicAccountResetModel alipayOpenPublicAccountResetModel = (AlipayOpenPublicAccountResetModel) o;
    return Objects.equals(this.agreementId, alipayOpenPublicAccountResetModel.agreementId) &&
        Objects.equals(this.bindAccountNo, alipayOpenPublicAccountResetModel.bindAccountNo) &&
        Objects.equals(this.displayName, alipayOpenPublicAccountResetModel.displayName) &&
        Objects.equals(this.fromUserId, alipayOpenPublicAccountResetModel.fromUserId) &&
        Objects.equals(this.openId, alipayOpenPublicAccountResetModel.openId) &&
        Objects.equals(this.realName, alipayOpenPublicAccountResetModel.realName) &&
        Objects.equals(this.remark, alipayOpenPublicAccountResetModel.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, bindAccountNo, displayName, fromUserId, openId, realName, remark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicAccountResetModel {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    bindAccountNo: ").append(toIndentedString(bindAccountNo)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fromUserId: ").append(toIndentedString(fromUserId)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
    openapiFields.add("agreement_id");
    openapiFields.add("bind_account_no");
    openapiFields.add("display_name");
    openapiFields.add("from_user_id");
    openapiFields.add("open_id");
    openapiFields.add("real_name");
    openapiFields.add("remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicAccountResetModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicAccountResetModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicAccountResetModel is not found in the empty JSON string", AlipayOpenPublicAccountResetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicAccountResetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicAccountResetModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("bind_account_no") != null && !jsonObj.get("bind_account_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind_account_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind_account_no").toString()));
      }
      if (jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if (jsonObj.get("from_user_id") != null && !jsonObj.get("from_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from_user_id").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("real_name") != null && !jsonObj.get("real_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_name").toString()));
      }
      if (jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicAccountResetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicAccountResetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicAccountResetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicAccountResetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicAccountResetModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicAccountResetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicAccountResetModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicAccountResetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicAccountResetModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicAccountResetModel
  */
  public static AlipayOpenPublicAccountResetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicAccountResetModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicAccountResetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

