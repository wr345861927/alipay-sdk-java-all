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
 * AlipayEbppInvoiceInstitutionScopeModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceInstitutionScopeModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ADAPTER_TYPE = "adapter_type";
  @SerializedName(SERIALIZED_NAME_ADAPTER_TYPE)
  private String adapterType;

  public static final String SERIALIZED_NAME_ADD_OWNER_ID_LIST = "add_owner_id_list";
  @SerializedName(SERIALIZED_NAME_ADD_OWNER_ID_LIST)
  private List<String> addOwnerIdList = null;

  public static final String SERIALIZED_NAME_ADD_OWNER_OPEN_ID_LIST = "add_owner_open_id_list";
  @SerializedName(SERIALIZED_NAME_ADD_OWNER_OPEN_ID_LIST)
  private List<String> addOwnerOpenIdList = null;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_OWNER_TYPE = "owner_type";
  @SerializedName(SERIALIZED_NAME_OWNER_TYPE)
  private String ownerType;

  public static final String SERIALIZED_NAME_REMOVE_OWNER_ID_LIST = "remove_owner_id_list";
  @SerializedName(SERIALIZED_NAME_REMOVE_OWNER_ID_LIST)
  private List<String> removeOwnerIdList = null;

  public static final String SERIALIZED_NAME_REMOVE_OWNER_OPEN_ID_LIST = "remove_owner_open_id_list";
  @SerializedName(SERIALIZED_NAME_REMOVE_OWNER_OPEN_ID_LIST)
  private List<String> removeOwnerOpenIdList = null;

  public AlipayEbppInvoiceInstitutionScopeModifyModel() { 
  }

  public AlipayEbppInvoiceInstitutionScopeModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业共同账户id
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业共同账户id")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceInstitutionScopeModifyModel adapterType(String adapterType) {
    
    this.adapterType = adapterType;
    return this;
  }

   /**
   * 制度适用范围类型
   * @return adapterType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EMPLOYEE_SELECT", value = "制度适用范围类型")

  public String getAdapterType() {
    return adapterType;
  }


  public void setAdapterType(String adapterType) {
    this.adapterType = adapterType;
  }


  public AlipayEbppInvoiceInstitutionScopeModifyModel addOwnerIdList(List<String> addOwnerIdList) {
    
    this.addOwnerIdList = addOwnerIdList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionScopeModifyModel addAddOwnerIdListItem(String addOwnerIdListItem) {
    if (this.addOwnerIdList == null) {
      this.addOwnerIdList = new ArrayList<>();
    }
    this.addOwnerIdList.add(addOwnerIdListItem);
    return this;
  }

   /**
   * 增加适配id列表
   * @return addOwnerIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088402266061144\",\"2088402266063146\"]", value = "增加适配id列表")

  public List<String> getAddOwnerIdList() {
    return addOwnerIdList;
  }


  public void setAddOwnerIdList(List<String> addOwnerIdList) {
    this.addOwnerIdList = addOwnerIdList;
  }


  public AlipayEbppInvoiceInstitutionScopeModifyModel addOwnerOpenIdList(List<String> addOwnerOpenIdList) {
    
    this.addOwnerOpenIdList = addOwnerOpenIdList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionScopeModifyModel addAddOwnerOpenIdListItem(String addOwnerOpenIdListItem) {
    if (this.addOwnerOpenIdList == null) {
      this.addOwnerOpenIdList = new ArrayList<>();
    }
    this.addOwnerOpenIdList.add(addOwnerOpenIdListItem);
    return this;
  }

   /**
   * 增加适配开放id列表
   * @return addOwnerOpenIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abcdxxxx\"]", value = "增加适配开放id列表")

  public List<String> getAddOwnerOpenIdList() {
    return addOwnerOpenIdList;
  }


  public void setAddOwnerOpenIdList(List<String> addOwnerOpenIdList) {
    this.addOwnerOpenIdList = addOwnerOpenIdList;
  }


  public AlipayEbppInvoiceInstitutionScopeModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001112341234", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceInstitutionScopeModifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceInstitutionScopeModifyModel institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * 制度id
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022072800152617760000002797", value = "制度id")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public AlipayEbppInvoiceInstitutionScopeModifyModel ownerType(String ownerType) {
    
    this.ownerType = ownerType;
    return this;
  }

   /**
   * 归属类型
   * @return ownerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE_PAY_UID", value = "归属类型")

  public String getOwnerType() {
    return ownerType;
  }


  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }


  public AlipayEbppInvoiceInstitutionScopeModifyModel removeOwnerIdList(List<String> removeOwnerIdList) {
    
    this.removeOwnerIdList = removeOwnerIdList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionScopeModifyModel addRemoveOwnerIdListItem(String removeOwnerIdListItem) {
    if (this.removeOwnerIdList == null) {
      this.removeOwnerIdList = new ArrayList<>();
    }
    this.removeOwnerIdList.add(removeOwnerIdListItem);
    return this;
  }

   /**
   * 删除适配id列表
   * @return removeOwnerIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088402266062862\",\"2088402266060390\"]", value = "删除适配id列表")

  public List<String> getRemoveOwnerIdList() {
    return removeOwnerIdList;
  }


  public void setRemoveOwnerIdList(List<String> removeOwnerIdList) {
    this.removeOwnerIdList = removeOwnerIdList;
  }


  public AlipayEbppInvoiceInstitutionScopeModifyModel removeOwnerOpenIdList(List<String> removeOwnerOpenIdList) {
    
    this.removeOwnerOpenIdList = removeOwnerOpenIdList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionScopeModifyModel addRemoveOwnerOpenIdListItem(String removeOwnerOpenIdListItem) {
    if (this.removeOwnerOpenIdList == null) {
      this.removeOwnerOpenIdList = new ArrayList<>();
    }
    this.removeOwnerOpenIdList.add(removeOwnerOpenIdListItem);
    return this;
  }

   /**
   * 删除适配开放id列表
   * @return removeOwnerOpenIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abcdxxxx\"]", value = "删除适配开放id列表")

  public List<String> getRemoveOwnerOpenIdList() {
    return removeOwnerOpenIdList;
  }


  public void setRemoveOwnerOpenIdList(List<String> removeOwnerOpenIdList) {
    this.removeOwnerOpenIdList = removeOwnerOpenIdList;
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
   * @return the AlipayEbppInvoiceInstitutionScopeModifyModel instance itself
   */
  public AlipayEbppInvoiceInstitutionScopeModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceInstitutionScopeModifyModel alipayEbppInvoiceInstitutionScopeModifyModel = (AlipayEbppInvoiceInstitutionScopeModifyModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceInstitutionScopeModifyModel.accountId) &&
        Objects.equals(this.adapterType, alipayEbppInvoiceInstitutionScopeModifyModel.adapterType) &&
        Objects.equals(this.addOwnerIdList, alipayEbppInvoiceInstitutionScopeModifyModel.addOwnerIdList) &&
        Objects.equals(this.addOwnerOpenIdList, alipayEbppInvoiceInstitutionScopeModifyModel.addOwnerOpenIdList) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceInstitutionScopeModifyModel.agreementNo) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceInstitutionScopeModifyModel.enterpriseId) &&
        Objects.equals(this.institutionId, alipayEbppInvoiceInstitutionScopeModifyModel.institutionId) &&
        Objects.equals(this.ownerType, alipayEbppInvoiceInstitutionScopeModifyModel.ownerType) &&
        Objects.equals(this.removeOwnerIdList, alipayEbppInvoiceInstitutionScopeModifyModel.removeOwnerIdList) &&
        Objects.equals(this.removeOwnerOpenIdList, alipayEbppInvoiceInstitutionScopeModifyModel.removeOwnerOpenIdList)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceInstitutionScopeModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adapterType, addOwnerIdList, addOwnerOpenIdList, agreementNo, enterpriseId, institutionId, ownerType, removeOwnerIdList, removeOwnerOpenIdList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceInstitutionScopeModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adapterType: ").append(toIndentedString(adapterType)).append("\n");
    sb.append("    addOwnerIdList: ").append(toIndentedString(addOwnerIdList)).append("\n");
    sb.append("    addOwnerOpenIdList: ").append(toIndentedString(addOwnerOpenIdList)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    removeOwnerIdList: ").append(toIndentedString(removeOwnerIdList)).append("\n");
    sb.append("    removeOwnerOpenIdList: ").append(toIndentedString(removeOwnerOpenIdList)).append("\n");
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
    openapiFields.add("adapter_type");
    openapiFields.add("add_owner_id_list");
    openapiFields.add("add_owner_open_id_list");
    openapiFields.add("agreement_no");
    openapiFields.add("enterprise_id");
    openapiFields.add("institution_id");
    openapiFields.add("owner_type");
    openapiFields.add("remove_owner_id_list");
    openapiFields.add("remove_owner_open_id_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceInstitutionScopeModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceInstitutionScopeModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceInstitutionScopeModifyModel is not found in the empty JSON string", AlipayEbppInvoiceInstitutionScopeModifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("adapter_type") != null && !jsonObj.get("adapter_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adapter_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adapter_type").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("add_owner_id_list") != null && !jsonObj.get("add_owner_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add_owner_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("add_owner_id_list").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("add_owner_open_id_list") != null && !jsonObj.get("add_owner_open_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add_owner_open_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("add_owner_open_id_list").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      if (jsonObj.get("owner_type") != null && !jsonObj.get("owner_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_type").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("remove_owner_id_list") != null && !jsonObj.get("remove_owner_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `remove_owner_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("remove_owner_id_list").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("remove_owner_open_id_list") != null && !jsonObj.get("remove_owner_open_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `remove_owner_open_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("remove_owner_open_id_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceInstitutionScopeModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceInstitutionScopeModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceInstitutionScopeModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceInstitutionScopeModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceInstitutionScopeModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceInstitutionScopeModifyModel value) throws IOException {
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
           public AlipayEbppInvoiceInstitutionScopeModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceInstitutionScopeModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceInstitutionScopeModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceInstitutionScopeModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceInstitutionScopeModifyModel
  */
  public static AlipayEbppInvoiceInstitutionScopeModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceInstitutionScopeModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceInstitutionScopeModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

