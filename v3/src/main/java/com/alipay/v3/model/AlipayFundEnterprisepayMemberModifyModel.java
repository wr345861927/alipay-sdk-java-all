/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-05-20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.FundExtInfo;
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
 * AlipayFundEnterprisepayMemberModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundEnterprisepayMemberModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_FUND_EXT_INFO = "fund_ext_info";
  @SerializedName(SERIALIZED_NAME_FUND_EXT_INFO)
  private FundExtInfo fundExtInfo;

  public static final String SERIALIZED_NAME_GROUP_ID_LIST = "group_id_list";
  @SerializedName(SERIALIZED_NAME_GROUP_ID_LIST)
  private List<String> groupIdList = null;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OPERATION_TYPE_LIST = "operation_type_list";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE_LIST)
  private List<String> operationTypeList = null;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayFundEnterprisepayMemberModifyModel() { 
  }

  public AlipayFundEnterprisepayMemberModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业签约账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088888888", value = "企业签约账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayFundEnterprisepayMemberModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 平台和企业的三方授权协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1231231321323", value = "平台和企业的三方授权协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayFundEnterprisepayMemberModifyModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 场景码，联系支付宝分配
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ANT_GROUP", value = "场景码，联系支付宝分配")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundEnterprisepayMemberModifyModel fundExtInfo(FundExtInfo fundExtInfo) {
    
    this.fundExtInfo = fundExtInfo;
    return this;
  }

   /**
   * Get fundExtInfo
   * @return fundExtInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FundExtInfo getFundExtInfo() {
    return fundExtInfo;
  }


  public void setFundExtInfo(FundExtInfo fundExtInfo) {
    this.fundExtInfo = fundExtInfo;
  }


  public AlipayFundEnterprisepayMemberModifyModel groupIdList(List<String> groupIdList) {
    
    this.groupIdList = groupIdList;
    return this;
  }

  public AlipayFundEnterprisepayMemberModifyModel addGroupIdListItem(String groupIdListItem) {
    if (this.groupIdList == null) {
      this.groupIdList = new ArrayList<>();
    }
    this.groupIdList.add(groupIdListItem);
    return this;
  }

   /**
   * 员工当前关联的群组ID，支持多个
   * @return groupIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"11\",\"22\",\"33\"]", value = "员工当前关联的群组ID，支持多个")

  public List<String> getGroupIdList() {
    return groupIdList;
  }


  public void setGroupIdList(List<String> groupIdList) {
    this.groupIdList = groupIdList;
  }


  public AlipayFundEnterprisepayMemberModifyModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 蚂蚁统一会员openId
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "蚂蚁统一会员openId")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayFundEnterprisepayMemberModifyModel operationTypeList(List<String> operationTypeList) {
    
    this.operationTypeList = operationTypeList;
    return this;
  }

  public AlipayFundEnterprisepayMemberModifyModel addOperationTypeListItem(String operationTypeListItem) {
    if (this.operationTypeList == null) {
      this.operationTypeList = new ArrayList<>();
    }
    this.operationTypeList.add(operationTypeListItem);
    return this;
  }

   /**
   * 更新操作类型：多个时逗号分隔 GROUP-群组信息 FUND-出资信息 字段不传时，默认全量更新
   * @return operationTypeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"GROUP\",\"FUND\"]", value = "更新操作类型：多个时逗号分隔 GROUP-群组信息 FUND-出资信息 字段不传时，默认全量更新")

  public List<String> getOperationTypeList() {
    return operationTypeList;
  }


  public void setOperationTypeList(List<String> operationTypeList) {
    this.operationTypeList = operationTypeList;
  }


  public AlipayFundEnterprisepayMemberModifyModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 产品码，默认值 ENTERPRISE_PAY
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE_PAY", value = "产品码，默认值 ENTERPRISE_PAY")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public AlipayFundEnterprisepayMemberModifyModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 蚂蚁统一会员ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123123", value = "蚂蚁统一会员ID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
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
   * @return the AlipayFundEnterprisepayMemberModifyModel instance itself
   */
  public AlipayFundEnterprisepayMemberModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayFundEnterprisepayMemberModifyModel alipayFundEnterprisepayMemberModifyModel = (AlipayFundEnterprisepayMemberModifyModel) o;
    return Objects.equals(this.accountId, alipayFundEnterprisepayMemberModifyModel.accountId) &&
        Objects.equals(this.agreementNo, alipayFundEnterprisepayMemberModifyModel.agreementNo) &&
        Objects.equals(this.bizScene, alipayFundEnterprisepayMemberModifyModel.bizScene) &&
        Objects.equals(this.fundExtInfo, alipayFundEnterprisepayMemberModifyModel.fundExtInfo) &&
        Objects.equals(this.groupIdList, alipayFundEnterprisepayMemberModifyModel.groupIdList) &&
        Objects.equals(this.openId, alipayFundEnterprisepayMemberModifyModel.openId) &&
        Objects.equals(this.operationTypeList, alipayFundEnterprisepayMemberModifyModel.operationTypeList) &&
        Objects.equals(this.productCode, alipayFundEnterprisepayMemberModifyModel.productCode) &&
        Objects.equals(this.userId, alipayFundEnterprisepayMemberModifyModel.userId)&&
        Objects.equals(this.additionalProperties, alipayFundEnterprisepayMemberModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, bizScene, fundExtInfo, groupIdList, openId, operationTypeList, productCode, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundEnterprisepayMemberModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    fundExtInfo: ").append(toIndentedString(fundExtInfo)).append("\n");
    sb.append("    groupIdList: ").append(toIndentedString(groupIdList)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    operationTypeList: ").append(toIndentedString(operationTypeList)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("biz_scene");
    openapiFields.add("fund_ext_info");
    openapiFields.add("group_id_list");
    openapiFields.add("open_id");
    openapiFields.add("operation_type_list");
    openapiFields.add("product_code");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundEnterprisepayMemberModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundEnterprisepayMemberModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundEnterprisepayMemberModifyModel is not found in the empty JSON string", AlipayFundEnterprisepayMemberModifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      // validate the optional field `fund_ext_info`
      if (jsonObj.getAsJsonObject("fund_ext_info") != null) {
        FundExtInfo.validateJsonObject(jsonObj.getAsJsonObject("fund_ext_info"));
      }
      // ensure the json data is an array
      if (jsonObj.get("group_id_list") != null && !jsonObj.get("group_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("group_id_list").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("operation_type_list") != null && !jsonObj.get("operation_type_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_type_list` to be an array in the JSON string but got `%s`", jsonObj.get("operation_type_list").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundEnterprisepayMemberModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundEnterprisepayMemberModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundEnterprisepayMemberModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundEnterprisepayMemberModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundEnterprisepayMemberModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundEnterprisepayMemberModifyModel value) throws IOException {
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
           public AlipayFundEnterprisepayMemberModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayFundEnterprisepayMemberModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayFundEnterprisepayMemberModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundEnterprisepayMemberModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundEnterprisepayMemberModifyModel
  */
  public static AlipayFundEnterprisepayMemberModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundEnterprisepayMemberModifyModel.class);
  }

 /**
  * Convert an instance of AlipayFundEnterprisepayMemberModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

