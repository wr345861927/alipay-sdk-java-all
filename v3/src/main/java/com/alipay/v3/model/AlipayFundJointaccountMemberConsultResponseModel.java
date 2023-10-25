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
import com.alipay.v3.model.MemberStatusRespDTO;
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
 * AlipayFundJointaccountMemberConsultResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundJointaccountMemberConsultResponseModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MEMBER_LIST = "member_list";
  @SerializedName(SERIALIZED_NAME_MEMBER_LIST)
  private List<MemberStatusRespDTO> memberList = null;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public AlipayFundJointaccountMemberConsultResponseModel() { 
  }

  public AlipayFundJointaccountMemberConsultResponseModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088900976746215", value = "企业ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayFundJointaccountMemberConsultResponseModel code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 返回码 10000-成功 其他都是失败
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "返回码 10000-成功 其他都是失败")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public AlipayFundJointaccountMemberConsultResponseModel memberList(List<MemberStatusRespDTO> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public AlipayFundJointaccountMemberConsultResponseModel addMemberListItem(MemberStatusRespDTO memberListItem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<>();
    }
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * 员工列表
   * @return memberList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "员工列表")

  public List<MemberStatusRespDTO> getMemberList() {
    return memberList;
  }


  public void setMemberList(List<MemberStatusRespDTO> memberList) {
    this.memberList = memberList;
  }


  public AlipayFundJointaccountMemberConsultResponseModel msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * 描述信息
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Success", value = "描述信息")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundJointaccountMemberConsultResponseModel alipayFundJointaccountMemberConsultResponseModel = (AlipayFundJointaccountMemberConsultResponseModel) o;
    return Objects.equals(this.accountId, alipayFundJointaccountMemberConsultResponseModel.accountId) &&
        Objects.equals(this.code, alipayFundJointaccountMemberConsultResponseModel.code) &&
        Objects.equals(this.memberList, alipayFundJointaccountMemberConsultResponseModel.memberList) &&
        Objects.equals(this.msg, alipayFundJointaccountMemberConsultResponseModel.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, code, memberList, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundJointaccountMemberConsultResponseModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("member_list");
    openapiFields.add("msg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundJointaccountMemberConsultResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundJointaccountMemberConsultResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundJointaccountMemberConsultResponseModel is not found in the empty JSON string", AlipayFundJointaccountMemberConsultResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundJointaccountMemberConsultResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundJointaccountMemberConsultResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      JsonArray jsonArraymemberList = jsonObj.getAsJsonArray("member_list");
      if (jsonArraymemberList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("member_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `member_list` to be an array in the JSON string but got `%s`", jsonObj.get("member_list").toString()));
        }

        // validate the optional field `member_list` (array)
        for (int i = 0; i < jsonArraymemberList.size(); i++) {
          MemberStatusRespDTO.validateJsonObject(jsonArraymemberList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("msg") != null && !jsonObj.get("msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundJointaccountMemberConsultResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundJointaccountMemberConsultResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundJointaccountMemberConsultResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundJointaccountMemberConsultResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundJointaccountMemberConsultResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundJointaccountMemberConsultResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundJointaccountMemberConsultResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundJointaccountMemberConsultResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundJointaccountMemberConsultResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundJointaccountMemberConsultResponseModel
  */
  public static AlipayFundJointaccountMemberConsultResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundJointaccountMemberConsultResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundJointaccountMemberConsultResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

