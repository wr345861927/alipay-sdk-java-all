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
import com.alipay.v3.model.JointAccountDTO;
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
 * AlipayFundJointaccountListQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundJointaccountListQueryResponseModel {
  public static final String SERIALIZED_NAME_ACCOUNT_LIST = "account_list";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_LIST)
  private List<JointAccountDTO> accountList = null;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public AlipayFundJointaccountListQueryResponseModel() { 
  }

  public AlipayFundJointaccountListQueryResponseModel accountList(List<JointAccountDTO> accountList) {
    
    this.accountList = accountList;
    return this;
  }

  public AlipayFundJointaccountListQueryResponseModel addAccountListItem(JointAccountDTO accountListItem) {
    if (this.accountList == null) {
      this.accountList = new ArrayList<>();
    }
    this.accountList.add(accountListItem);
    return this;
  }

   /**
   * 共同账户列表
   * @return accountList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "共同账户列表")

  public List<JointAccountDTO> getAccountList() {
    return accountList;
  }


  public void setAccountList(List<JointAccountDTO> accountList) {
    this.accountList = accountList;
  }


  public AlipayFundJointaccountListQueryResponseModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 场景
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "场景")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundJointaccountListQueryResponseModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 产品码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE_PAY", value = "产品码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
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
   * @return the AlipayFundJointaccountListQueryResponseModel instance itself
   */
  public AlipayFundJointaccountListQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayFundJointaccountListQueryResponseModel alipayFundJointaccountListQueryResponseModel = (AlipayFundJointaccountListQueryResponseModel) o;
    return Objects.equals(this.accountList, alipayFundJointaccountListQueryResponseModel.accountList) &&
        Objects.equals(this.bizScene, alipayFundJointaccountListQueryResponseModel.bizScene) &&
        Objects.equals(this.productCode, alipayFundJointaccountListQueryResponseModel.productCode)&&
        Objects.equals(this.additionalProperties, alipayFundJointaccountListQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountList, bizScene, productCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundJointaccountListQueryResponseModel {\n");
    sb.append("    accountList: ").append(toIndentedString(accountList)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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
    openapiFields.add("account_list");
    openapiFields.add("biz_scene");
    openapiFields.add("product_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundJointaccountListQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundJointaccountListQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundJointaccountListQueryResponseModel is not found in the empty JSON string", AlipayFundJointaccountListQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayaccountList = jsonObj.getAsJsonArray("account_list");
      if (jsonArrayaccountList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("account_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `account_list` to be an array in the JSON string but got `%s`", jsonObj.get("account_list").toString()));
        }

        // validate the optional field `account_list` (array)
        for (int i = 0; i < jsonArrayaccountList.size(); i++) {
          JointAccountDTO.validateJsonObject(jsonArrayaccountList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundJointaccountListQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundJointaccountListQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundJointaccountListQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundJointaccountListQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundJointaccountListQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundJointaccountListQueryResponseModel value) throws IOException {
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
           public AlipayFundJointaccountListQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayFundJointaccountListQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayFundJointaccountListQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundJointaccountListQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundJointaccountListQueryResponseModel
  */
  public static AlipayFundJointaccountListQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundJointaccountListQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundJointaccountListQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

