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
 * AlipayEbppInvoiceApplyResultSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceApplyResultSyncModel {
  public static final String SERIALIZED_NAME_APPLY_ID = "apply_id";
  @SerializedName(SERIALIZED_NAME_APPLY_ID)
  private String applyId;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_RESULT_CODE = "result_code";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_RESULT_MSG = "result_msg";
  @SerializedName(SERIALIZED_NAME_RESULT_MSG)
  private String resultMsg;

  public static final String SERIALIZED_NAME_TAX_APPLY_ID = "tax_apply_id";
  @SerializedName(SERIALIZED_NAME_TAX_APPLY_ID)
  private String taxApplyId;

  public AlipayEbppInvoiceApplyResultSyncModel() { 
  }

  public AlipayEbppInvoiceApplyResultSyncModel applyId(String applyId) {
    
    this.applyId = applyId;
    return this;
  }

   /**
   * 支付宝发起开票申请的id，该id具有唯一性，该字段由支付宝向税控发起申请的时候带过去，作为支付宝向税控开票申请的唯一标志
   * @return applyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023000000000000000000000001", value = "支付宝发起开票申请的id，该id具有唯一性，该字段由支付宝向税控发起申请的时候带过去，作为支付宝向税控开票申请的唯一标志")

  public String getApplyId() {
    return applyId;
  }


  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }


  public AlipayEbppInvoiceApplyResultSyncModel result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * 支付宝向税控商或ISV发起发票申请后，对应这笔申请的发票开具结果。  取值如下：  SUCCESS:成功;FAIL:失败
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "支付宝向税控商或ISV发起发票申请后，对应这笔申请的发票开具结果。  取值如下：  SUCCESS:成功;FAIL:失败")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public AlipayEbppInvoiceApplyResultSyncModel resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 结果码，支付宝向税控商或ISV发起发票申请后，对应这笔申请的发票开具结果进行详细说明的结果码。  取值如下：  成功(SUCCESS),  参数不合法(PARAMETER_ILLEGAL),  商户税控设备异常(MERCHANT_TAX_DEVICE_ERROR).
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "结果码，支付宝向税控商或ISV发起发票申请后，对应这笔申请的发票开具结果进行详细说明的结果码。  取值如下：  成功(SUCCESS),  参数不合法(PARAMETER_ILLEGAL),  商户税控设备异常(MERCHANT_TAX_DEVICE_ERROR).")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public AlipayEbppInvoiceApplyResultSyncModel resultMsg(String resultMsg) {
    
    this.resultMsg = resultMsg;
    return this;
  }

   /**
   * 结果描述，支付宝向税控商或ISV发起发票申请后，对应这笔申请的发票开具结果描述信息。
   * @return resultMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "成功", value = "结果描述，支付宝向税控商或ISV发起发票申请后，对应这笔申请的发票开具结果描述信息。")

  public String getResultMsg() {
    return resultMsg;
  }


  public void setResultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
  }


  public AlipayEbppInvoiceApplyResultSyncModel taxApplyId(String taxApplyId) {
    
    this.taxApplyId = taxApplyId;
    return this;
  }

   /**
   * 该字段是税控商或ISV收到支付宝开票请求后生成的申请id，由税控商或isv自己生成，该id具有唯一性  当ISV接入时是按照tax_apply_id来查询发票信息时，该字段必填。
   * @return taxApplyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160707399929991001", value = "该字段是税控商或ISV收到支付宝开票请求后生成的申请id，由税控商或isv自己生成，该id具有唯一性  当ISV接入时是按照tax_apply_id来查询发票信息时，该字段必填。")

  public String getTaxApplyId() {
    return taxApplyId;
  }


  public void setTaxApplyId(String taxApplyId) {
    this.taxApplyId = taxApplyId;
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
   * @return the AlipayEbppInvoiceApplyResultSyncModel instance itself
   */
  public AlipayEbppInvoiceApplyResultSyncModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceApplyResultSyncModel alipayEbppInvoiceApplyResultSyncModel = (AlipayEbppInvoiceApplyResultSyncModel) o;
    return Objects.equals(this.applyId, alipayEbppInvoiceApplyResultSyncModel.applyId) &&
        Objects.equals(this.result, alipayEbppInvoiceApplyResultSyncModel.result) &&
        Objects.equals(this.resultCode, alipayEbppInvoiceApplyResultSyncModel.resultCode) &&
        Objects.equals(this.resultMsg, alipayEbppInvoiceApplyResultSyncModel.resultMsg) &&
        Objects.equals(this.taxApplyId, alipayEbppInvoiceApplyResultSyncModel.taxApplyId)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceApplyResultSyncModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyId, result, resultCode, resultMsg, taxApplyId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceApplyResultSyncModel {\n");
    sb.append("    applyId: ").append(toIndentedString(applyId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultMsg: ").append(toIndentedString(resultMsg)).append("\n");
    sb.append("    taxApplyId: ").append(toIndentedString(taxApplyId)).append("\n");
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
    openapiFields.add("apply_id");
    openapiFields.add("result");
    openapiFields.add("result_code");
    openapiFields.add("result_msg");
    openapiFields.add("tax_apply_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceApplyResultSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceApplyResultSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceApplyResultSyncModel is not found in the empty JSON string", AlipayEbppInvoiceApplyResultSyncModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("apply_id") != null && !jsonObj.get("apply_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_id").toString()));
      }
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      if (jsonObj.get("result_code") != null && !jsonObj.get("result_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_code").toString()));
      }
      if (jsonObj.get("result_msg") != null && !jsonObj.get("result_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_msg").toString()));
      }
      if (jsonObj.get("tax_apply_id") != null && !jsonObj.get("tax_apply_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_apply_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_apply_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceApplyResultSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceApplyResultSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceApplyResultSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceApplyResultSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceApplyResultSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceApplyResultSyncModel value) throws IOException {
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
           public AlipayEbppInvoiceApplyResultSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceApplyResultSyncModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceApplyResultSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceApplyResultSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceApplyResultSyncModel
  */
  public static AlipayEbppInvoiceApplyResultSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceApplyResultSyncModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceApplyResultSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

