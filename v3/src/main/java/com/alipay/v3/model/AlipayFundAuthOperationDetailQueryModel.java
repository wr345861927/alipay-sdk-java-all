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
 * AlipayFundAuthOperationDetailQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAuthOperationDetailQueryModel {
  public static final String SERIALIZED_NAME_AUTH_NO = "auth_no";
  @SerializedName(SERIALIZED_NAME_AUTH_NO)
  private String authNo;

  public static final String SERIALIZED_NAME_OPERATION_ID = "operation_id";
  @SerializedName(SERIALIZED_NAME_OPERATION_ID)
  private String operationId;

  public static final String SERIALIZED_NAME_OPERATION_TYPE = "operation_type";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE)
  private String operationType;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_QUERY_OPTIONS = "query_options";
  @SerializedName(SERIALIZED_NAME_QUERY_OPTIONS)
  private List<String> queryOptions = null;

  public AlipayFundAuthOperationDetailQueryModel() { 
  }

  public AlipayFundAuthOperationDetailQueryModel authNo(String authNo) {
    
    this.authNo = authNo;
    return this;
  }

   /**
   * 支付宝授权资金订单号。 与商户的授权资金订单号不能同时为空，二者都传入时，以支付宝资金授权订单号为准，该参数与支付宝授权资金操作流水号配对使用。
   * @return authNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014021601002000640012345678", value = "支付宝授权资金订单号。 与商户的授权资金订单号不能同时为空，二者都传入时，以支付宝资金授权订单号为准，该参数与支付宝授权资金操作流水号配对使用。")

  public String getAuthNo() {
    return authNo;
  }


  public void setAuthNo(String authNo) {
    this.authNo = authNo;
  }


  public AlipayFundAuthOperationDetailQueryModel operationId(String operationId) {
    
    this.operationId = operationId;
    return this;
  }

   /**
   * 支付宝的授权资金操作流水号。 与商户的授权资金操作流水号不能同时为空，二者都传入时，以支付宝的授权资金操作流水号为准，该参数与支付宝授权资金订单号配对使用。
   * @return operationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20140216010020006400", value = "支付宝的授权资金操作流水号。 与商户的授权资金操作流水号不能同时为空，二者都传入时，以支付宝的授权资金操作流水号为准，该参数与支付宝授权资金订单号配对使用。")

  public String getOperationId() {
    return operationId;
  }


  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  public AlipayFundAuthOperationDetailQueryModel operationType(String operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * 需要查询的授权资金操作类型。 未传入本参数时，如果仅查询出单笔明细则直接返回，如果查询出多笔则优先返回冻结明细、无冻结明细时返回解冻明细； 当传入本参数时，则严格按照该操作类型返回对应明细
   * @return operationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FREEZE", value = "需要查询的授权资金操作类型。 未传入本参数时，如果仅查询出单笔明细则直接返回，如果查询出多笔则优先返回冻结明细、无冻结明细时返回解冻明细； 当传入本参数时，则严格按照该操作类型返回对应明细")

  public String getOperationType() {
    return operationType;
  }


  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }


  public AlipayFundAuthOperationDetailQueryModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 商户的授权资金订单号。 与支付宝的授权资金订单号不能同时为空，二者都传入时，以支付宝的授权资金订单号为准，该参数与商户的授权资金操作流水号配对使用。 该值与资金冻结时 out_order_no一致。
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8077735255938023", value = "商户的授权资金订单号。 与支付宝的授权资金订单号不能同时为空，二者都传入时，以支付宝的授权资金订单号为准，该参数与商户的授权资金操作流水号配对使用。 该值与资金冻结时 out_order_no一致。")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public AlipayFundAuthOperationDetailQueryModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户的授权资金操作流水号。 与支付宝的授权资金操作流水号不能同时为空，二者都传入时，以支付宝的授权资金操作流水号为准，该参数与商户的授权资金订单号配对使用。 查询冻结明细时，该值与发起冻结操作时传入的out_request_no一致； 查询解冻明细时，该值与发起解冻操作时传入的out_request_no一致； 查询支付明细时，该值与发起转支付操作时传入的out_trade_no一致。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20140216001001", value = "商户的授权资金操作流水号。 与支付宝的授权资金操作流水号不能同时为空，二者都传入时，以支付宝的授权资金操作流水号为准，该参数与商户的授权资金订单号配对使用。 查询冻结明细时，该值与发起冻结操作时传入的out_request_no一致； 查询解冻明细时，该值与发起解冻操作时传入的out_request_no一致； 查询支付明细时，该值与发起转支付操作时传入的out_trade_no一致。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayFundAuthOperationDetailQueryModel queryOptions(List<String> queryOptions) {
    
    this.queryOptions = queryOptions;
    return this;
  }

  public AlipayFundAuthOperationDetailQueryModel addQueryOptionsItem(String queryOptionsItem) {
    if (this.queryOptions == null) {
      this.queryOptions = new ArrayList<>();
    }
    this.queryOptions.add(queryOptionsItem);
    return this;
  }

   /**
   * 需要查询的额外信息
   * @return queryOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"credit_risk_info\"]", value = "需要查询的额外信息")

  public List<String> getQueryOptions() {
    return queryOptions;
  }


  public void setQueryOptions(List<String> queryOptions) {
    this.queryOptions = queryOptions;
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
   * @return the AlipayFundAuthOperationDetailQueryModel instance itself
   */
  public AlipayFundAuthOperationDetailQueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayFundAuthOperationDetailQueryModel alipayFundAuthOperationDetailQueryModel = (AlipayFundAuthOperationDetailQueryModel) o;
    return Objects.equals(this.authNo, alipayFundAuthOperationDetailQueryModel.authNo) &&
        Objects.equals(this.operationId, alipayFundAuthOperationDetailQueryModel.operationId) &&
        Objects.equals(this.operationType, alipayFundAuthOperationDetailQueryModel.operationType) &&
        Objects.equals(this.outOrderNo, alipayFundAuthOperationDetailQueryModel.outOrderNo) &&
        Objects.equals(this.outRequestNo, alipayFundAuthOperationDetailQueryModel.outRequestNo) &&
        Objects.equals(this.queryOptions, alipayFundAuthOperationDetailQueryModel.queryOptions)&&
        Objects.equals(this.additionalProperties, alipayFundAuthOperationDetailQueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authNo, operationId, operationType, outOrderNo, outRequestNo, queryOptions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAuthOperationDetailQueryModel {\n");
    sb.append("    authNo: ").append(toIndentedString(authNo)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    queryOptions: ").append(toIndentedString(queryOptions)).append("\n");
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
    openapiFields.add("auth_no");
    openapiFields.add("operation_id");
    openapiFields.add("operation_type");
    openapiFields.add("out_order_no");
    openapiFields.add("out_request_no");
    openapiFields.add("query_options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAuthOperationDetailQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAuthOperationDetailQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAuthOperationDetailQueryModel is not found in the empty JSON string", AlipayFundAuthOperationDetailQueryModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("auth_no") != null && !jsonObj.get("auth_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_no").toString()));
      }
      if (jsonObj.get("operation_id") != null && !jsonObj.get("operation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_id").toString()));
      }
      if (jsonObj.get("operation_type") != null && !jsonObj.get("operation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_type").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("query_options") != null && !jsonObj.get("query_options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_options` to be an array in the JSON string but got `%s`", jsonObj.get("query_options").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAuthOperationDetailQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAuthOperationDetailQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAuthOperationDetailQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAuthOperationDetailQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAuthOperationDetailQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAuthOperationDetailQueryModel value) throws IOException {
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
           public AlipayFundAuthOperationDetailQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayFundAuthOperationDetailQueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayFundAuthOperationDetailQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAuthOperationDetailQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAuthOperationDetailQueryModel
  */
  public static AlipayFundAuthOperationDetailQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAuthOperationDetailQueryModel.class);
  }

 /**
  * Convert an instance of AlipayFundAuthOperationDetailQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

