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
import com.alipay.v3.model.OrderVoucherUseRuleResult;
import com.alipay.v3.model.VoucherAvailableScopeResultInfo;
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
 * AlipayMarketingActivityOrdervoucherModifyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityOrdervoucherModifyResponseModel {
  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_RESULT_INFO = "voucher_available_scope_result_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_RESULT_INFO)
  private VoucherAvailableScopeResultInfo voucherAvailableScopeResultInfo;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE_RESULT = "voucher_use_rule_result";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE_RESULT)
  private OrderVoucherUseRuleResult voucherUseRuleResult;

  public AlipayMarketingActivityOrdervoucherModifyResponseModel() { 
  }

  public AlipayMarketingActivityOrdervoucherModifyResponseModel voucherAvailableScopeResultInfo(VoucherAvailableScopeResultInfo voucherAvailableScopeResultInfo) {
    
    this.voucherAvailableScopeResultInfo = voucherAvailableScopeResultInfo;
    return this;
  }

   /**
   * Get voucherAvailableScopeResultInfo
   * @return voucherAvailableScopeResultInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableScopeResultInfo getVoucherAvailableScopeResultInfo() {
    return voucherAvailableScopeResultInfo;
  }


  public void setVoucherAvailableScopeResultInfo(VoucherAvailableScopeResultInfo voucherAvailableScopeResultInfo) {
    this.voucherAvailableScopeResultInfo = voucherAvailableScopeResultInfo;
  }


  public AlipayMarketingActivityOrdervoucherModifyResponseModel voucherUseRuleResult(OrderVoucherUseRuleResult voucherUseRuleResult) {
    
    this.voucherUseRuleResult = voucherUseRuleResult;
    return this;
  }

   /**
   * Get voucherUseRuleResult
   * @return voucherUseRuleResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderVoucherUseRuleResult getVoucherUseRuleResult() {
    return voucherUseRuleResult;
  }


  public void setVoucherUseRuleResult(OrderVoucherUseRuleResult voucherUseRuleResult) {
    this.voucherUseRuleResult = voucherUseRuleResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityOrdervoucherModifyResponseModel alipayMarketingActivityOrdervoucherModifyResponseModel = (AlipayMarketingActivityOrdervoucherModifyResponseModel) o;
    return Objects.equals(this.voucherAvailableScopeResultInfo, alipayMarketingActivityOrdervoucherModifyResponseModel.voucherAvailableScopeResultInfo) &&
        Objects.equals(this.voucherUseRuleResult, alipayMarketingActivityOrdervoucherModifyResponseModel.voucherUseRuleResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherAvailableScopeResultInfo, voucherUseRuleResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityOrdervoucherModifyResponseModel {\n");
    sb.append("    voucherAvailableScopeResultInfo: ").append(toIndentedString(voucherAvailableScopeResultInfo)).append("\n");
    sb.append("    voucherUseRuleResult: ").append(toIndentedString(voucherUseRuleResult)).append("\n");
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
    openapiFields.add("voucher_available_scope_result_info");
    openapiFields.add("voucher_use_rule_result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityOrdervoucherModifyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityOrdervoucherModifyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityOrdervoucherModifyResponseModel is not found in the empty JSON string", AlipayMarketingActivityOrdervoucherModifyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityOrdervoucherModifyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityOrdervoucherModifyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `voucher_available_scope_result_info`
      if (jsonObj.getAsJsonObject("voucher_available_scope_result_info") != null) {
        VoucherAvailableScopeResultInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_scope_result_info"));
      }
      // validate the optional field `voucher_use_rule_result`
      if (jsonObj.getAsJsonObject("voucher_use_rule_result") != null) {
        OrderVoucherUseRuleResult.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule_result"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityOrdervoucherModifyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityOrdervoucherModifyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityOrdervoucherModifyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityOrdervoucherModifyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityOrdervoucherModifyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityOrdervoucherModifyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityOrdervoucherModifyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityOrdervoucherModifyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityOrdervoucherModifyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityOrdervoucherModifyResponseModel
  */
  public static AlipayMarketingActivityOrdervoucherModifyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityOrdervoucherModifyResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityOrdervoucherModifyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

