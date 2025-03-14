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
import com.alipay.v3.model.StandardConditionInfo;
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
 * ModifyStandardInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModifyStandardInfo {
  public static final String SERIALIZED_NAME_ADD_CONDITION_LIST = "add_condition_list";
  @SerializedName(SERIALIZED_NAME_ADD_CONDITION_LIST)
  private List<StandardConditionInfo> addConditionList = null;

  public static final String SERIALIZED_NAME_CONSUME_MODE = "consume_mode";
  @SerializedName(SERIALIZED_NAME_CONSUME_MODE)
  private String consumeMode;

  public static final String SERIALIZED_NAME_DELETE_CONDITION_ID_LIST = "delete_condition_id_list";
  @SerializedName(SERIALIZED_NAME_DELETE_CONDITION_ID_LIST)
  private List<String> deleteConditionIdList = null;

  public static final String SERIALIZED_NAME_MODIFY_CONDITION_LIST = "modify_condition_list";
  @SerializedName(SERIALIZED_NAME_MODIFY_CONDITION_LIST)
  private List<StandardConditionInfo> modifyConditionList = null;

  public static final String SERIALIZED_NAME_OPEN_RULE_ID = "open_rule_id";
  @SerializedName(SERIALIZED_NAME_OPEN_RULE_ID)
  private String openRuleId;

  public static final String SERIALIZED_NAME_PAYMENT_POLICY = "payment_policy";
  @SerializedName(SERIALIZED_NAME_PAYMENT_POLICY)
  private String paymentPolicy;

  public static final String SERIALIZED_NAME_PERSONAL_QRCODE_MODE = "personal_qrcode_mode";
  @SerializedName(SERIALIZED_NAME_PERSONAL_QRCODE_MODE)
  private Integer personalQrcodeMode;

  public static final String SERIALIZED_NAME_STANDARD_DESC = "standard_desc";
  @SerializedName(SERIALIZED_NAME_STANDARD_DESC)
  private String standardDesc;

  public static final String SERIALIZED_NAME_STANDARD_ID = "standard_id";
  @SerializedName(SERIALIZED_NAME_STANDARD_ID)
  private String standardId;

  public static final String SERIALIZED_NAME_STANDARD_NAME = "standard_name";
  @SerializedName(SERIALIZED_NAME_STANDARD_NAME)
  private String standardName;

  public ModifyStandardInfo() { 
  }

  public ModifyStandardInfo addConditionList(List<StandardConditionInfo> addConditionList) {
    
    this.addConditionList = addConditionList;
    return this;
  }

  public ModifyStandardInfo addAddConditionListItem(StandardConditionInfo addConditionListItem) {
    if (this.addConditionList == null) {
      this.addConditionList = new ArrayList<>();
    }
    this.addConditionList.add(addConditionListItem);
    return this;
  }

   /**
   * 要添加的条件列表
   * @return addConditionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "要添加的条件列表")

  public List<StandardConditionInfo> getAddConditionList() {
    return addConditionList;
  }


  public void setAddConditionList(List<StandardConditionInfo> addConditionList) {
    this.addConditionList = addConditionList;
  }


  public ModifyStandardInfo consumeMode(String consumeMode) {
    
    this.consumeMode = consumeMode;
    return this;
  }

   /**
   * 消费模式
   * @return consumeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COUPON_ONLY", value = "消费模式")

  public String getConsumeMode() {
    return consumeMode;
  }


  public void setConsumeMode(String consumeMode) {
    this.consumeMode = consumeMode;
  }


  public ModifyStandardInfo deleteConditionIdList(List<String> deleteConditionIdList) {
    
    this.deleteConditionIdList = deleteConditionIdList;
    return this;
  }

  public ModifyStandardInfo addDeleteConditionIdListItem(String deleteConditionIdListItem) {
    if (this.deleteConditionIdList == null) {
      this.deleteConditionIdList = new ArrayList<>();
    }
    this.deleteConditionIdList.add(deleteConditionIdListItem);
    return this;
  }

   /**
   * 待删除的条件id列表
   * @return deleteConditionIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2024090500152600000000008502\"]", value = "待删除的条件id列表")

  public List<String> getDeleteConditionIdList() {
    return deleteConditionIdList;
  }


  public void setDeleteConditionIdList(List<String> deleteConditionIdList) {
    this.deleteConditionIdList = deleteConditionIdList;
  }


  public ModifyStandardInfo modifyConditionList(List<StandardConditionInfo> modifyConditionList) {
    
    this.modifyConditionList = modifyConditionList;
    return this;
  }

  public ModifyStandardInfo addModifyConditionListItem(StandardConditionInfo modifyConditionListItem) {
    if (this.modifyConditionList == null) {
      this.modifyConditionList = new ArrayList<>();
    }
    this.modifyConditionList.add(modifyConditionListItem);
    return this;
  }

   /**
   * 修改的条件列表
   * @return modifyConditionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "修改的条件列表")

  public List<StandardConditionInfo> getModifyConditionList() {
    return modifyConditionList;
  }


  public void setModifyConditionList(List<StandardConditionInfo> modifyConditionList) {
    this.modifyConditionList = modifyConditionList;
  }


  public ModifyStandardInfo openRuleId(String openRuleId) {
    
    this.openRuleId = openRuleId;
    return this;
  }

   /**
   * 使用规则绑定的开票规则id
   * @return openRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"2024090500152000040000008668\"", value = "使用规则绑定的开票规则id")

  public String getOpenRuleId() {
    return openRuleId;
  }


  public void setOpenRuleId(String openRuleId) {
    this.openRuleId = openRuleId;
  }


  public ModifyStandardInfo paymentPolicy(String paymentPolicy) {
    
    this.paymentPolicy = paymentPolicy;
    return this;
  }

   /**
   * 支付策略 当笔消费金额大于规则可用余额时，用于控制支付策略。COMBINATION表示支持因公资产和个人资产组合支付，PERSONAL表示整单个人支付。
   * @return paymentPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMBINATION", value = "支付策略 当笔消费金额大于规则可用余额时，用于控制支付策略。COMBINATION表示支持因公资产和个人资产组合支付，PERSONAL表示整单个人支付。")

  public String getPaymentPolicy() {
    return paymentPolicy;
  }


  public void setPaymentPolicy(String paymentPolicy) {
    this.paymentPolicy = paymentPolicy;
  }


  public ModifyStandardInfo personalQrcodeMode(Integer personalQrcodeMode) {
    
    this.personalQrcodeMode = personalQrcodeMode;
    return this;
  }

   /**
   * 个人收款码转账是否支持因公付。可选值：0（不支持）、1（支持）
   * @return personalQrcodeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "个人收款码转账是否支持因公付。可选值：0（不支持）、1（支持）")

  public Integer getPersonalQrcodeMode() {
    return personalQrcodeMode;
  }


  public void setPersonalQrcodeMode(Integer personalQrcodeMode) {
    this.personalQrcodeMode = personalQrcodeMode;
  }


  public ModifyStandardInfo standardDesc(String standardDesc) {
    
    this.standardDesc = standardDesc;
    return this;
  }

   /**
   * 使用规则描述
   * @return standardDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "到店就餐使用规则", value = "使用规则描述")

  public String getStandardDesc() {
    return standardDesc;
  }


  public void setStandardDesc(String standardDesc) {
    this.standardDesc = standardDesc;
  }


  public ModifyStandardInfo standardId(String standardId) {
    
    this.standardId = standardId;
    return this;
  }

   /**
   * 修改的使用规则id
   * @return standardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"2024090500152000000000008502\"", value = "修改的使用规则id")

  public String getStandardId() {
    return standardId;
  }


  public void setStandardId(String standardId) {
    this.standardId = standardId;
  }


  public ModifyStandardInfo standardName(String standardName) {
    
    this.standardName = standardName;
    return this;
  }

   /**
   * 使用规则名称
   * @return standardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "到店规则", value = "使用规则名称")

  public String getStandardName() {
    return standardName;
  }


  public void setStandardName(String standardName) {
    this.standardName = standardName;
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
   * @return the ModifyStandardInfo instance itself
   */
  public ModifyStandardInfo putAdditionalProperty(String key, Object value) {
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
    ModifyStandardInfo modifyStandardInfo = (ModifyStandardInfo) o;
    return Objects.equals(this.addConditionList, modifyStandardInfo.addConditionList) &&
        Objects.equals(this.consumeMode, modifyStandardInfo.consumeMode) &&
        Objects.equals(this.deleteConditionIdList, modifyStandardInfo.deleteConditionIdList) &&
        Objects.equals(this.modifyConditionList, modifyStandardInfo.modifyConditionList) &&
        Objects.equals(this.openRuleId, modifyStandardInfo.openRuleId) &&
        Objects.equals(this.paymentPolicy, modifyStandardInfo.paymentPolicy) &&
        Objects.equals(this.personalQrcodeMode, modifyStandardInfo.personalQrcodeMode) &&
        Objects.equals(this.standardDesc, modifyStandardInfo.standardDesc) &&
        Objects.equals(this.standardId, modifyStandardInfo.standardId) &&
        Objects.equals(this.standardName, modifyStandardInfo.standardName)&&
        Objects.equals(this.additionalProperties, modifyStandardInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addConditionList, consumeMode, deleteConditionIdList, modifyConditionList, openRuleId, paymentPolicy, personalQrcodeMode, standardDesc, standardId, standardName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyStandardInfo {\n");
    sb.append("    addConditionList: ").append(toIndentedString(addConditionList)).append("\n");
    sb.append("    consumeMode: ").append(toIndentedString(consumeMode)).append("\n");
    sb.append("    deleteConditionIdList: ").append(toIndentedString(deleteConditionIdList)).append("\n");
    sb.append("    modifyConditionList: ").append(toIndentedString(modifyConditionList)).append("\n");
    sb.append("    openRuleId: ").append(toIndentedString(openRuleId)).append("\n");
    sb.append("    paymentPolicy: ").append(toIndentedString(paymentPolicy)).append("\n");
    sb.append("    personalQrcodeMode: ").append(toIndentedString(personalQrcodeMode)).append("\n");
    sb.append("    standardDesc: ").append(toIndentedString(standardDesc)).append("\n");
    sb.append("    standardId: ").append(toIndentedString(standardId)).append("\n");
    sb.append("    standardName: ").append(toIndentedString(standardName)).append("\n");
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
    openapiFields.add("add_condition_list");
    openapiFields.add("consume_mode");
    openapiFields.add("delete_condition_id_list");
    openapiFields.add("modify_condition_list");
    openapiFields.add("open_rule_id");
    openapiFields.add("payment_policy");
    openapiFields.add("personal_qrcode_mode");
    openapiFields.add("standard_desc");
    openapiFields.add("standard_id");
    openapiFields.add("standard_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModifyStandardInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModifyStandardInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyStandardInfo is not found in the empty JSON string", ModifyStandardInfo.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayaddConditionList = jsonObj.getAsJsonArray("add_condition_list");
      if (jsonArrayaddConditionList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("add_condition_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `add_condition_list` to be an array in the JSON string but got `%s`", jsonObj.get("add_condition_list").toString()));
        }

        // validate the optional field `add_condition_list` (array)
        for (int i = 0; i < jsonArrayaddConditionList.size(); i++) {
          StandardConditionInfo.validateJsonObject(jsonArrayaddConditionList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("consume_mode") != null && !jsonObj.get("consume_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_mode").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("delete_condition_id_list") != null && !jsonObj.get("delete_condition_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_condition_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("delete_condition_id_list").toString()));
      }
      JsonArray jsonArraymodifyConditionList = jsonObj.getAsJsonArray("modify_condition_list");
      if (jsonArraymodifyConditionList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("modify_condition_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `modify_condition_list` to be an array in the JSON string but got `%s`", jsonObj.get("modify_condition_list").toString()));
        }

        // validate the optional field `modify_condition_list` (array)
        for (int i = 0; i < jsonArraymodifyConditionList.size(); i++) {
          StandardConditionInfo.validateJsonObject(jsonArraymodifyConditionList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("open_rule_id") != null && !jsonObj.get("open_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_rule_id").toString()));
      }
      if (jsonObj.get("payment_policy") != null && !jsonObj.get("payment_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_policy").toString()));
      }
      if (jsonObj.get("standard_desc") != null && !jsonObj.get("standard_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_desc").toString()));
      }
      if (jsonObj.get("standard_id") != null && !jsonObj.get("standard_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_id").toString()));
      }
      if (jsonObj.get("standard_name") != null && !jsonObj.get("standard_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyStandardInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyStandardInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyStandardInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyStandardInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyStandardInfo>() {
           @Override
           public void write(JsonWriter out, ModifyStandardInfo value) throws IOException {
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
           public ModifyStandardInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModifyStandardInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModifyStandardInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModifyStandardInfo
  * @throws IOException if the JSON string is invalid with respect to ModifyStandardInfo
  */
  public static ModifyStandardInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyStandardInfo.class);
  }

 /**
  * Convert an instance of ModifyStandardInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

