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
 * RoyaltyDetailInfos
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoyaltyDetailInfos {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_AMOUNT_PERCENTAGE = "amount_percentage";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PERCENTAGE)
  private String amountPercentage;

  public static final String SERIALIZED_NAME_BATCH_NO = "batch_no";
  @SerializedName(SERIALIZED_NAME_BATCH_NO)
  private String batchNo;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_OUT_RELATION_ID = "out_relation_id";
  @SerializedName(SERIALIZED_NAME_OUT_RELATION_ID)
  private String outRelationId;

  public static final String SERIALIZED_NAME_SERIAL_NO = "serial_no";
  @SerializedName(SERIALIZED_NAME_SERIAL_NO)
  private Integer serialNo;

  public static final String SERIALIZED_NAME_TRANS_IN = "trans_in";
  @SerializedName(SERIALIZED_NAME_TRANS_IN)
  private String transIn;

  public static final String SERIALIZED_NAME_TRANS_IN_TYPE = "trans_in_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_TYPE)
  private String transInType;

  public static final String SERIALIZED_NAME_TRANS_OUT = "trans_out";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT)
  private String transOut;

  public static final String SERIALIZED_NAME_TRANS_OUT_TYPE = "trans_out_type";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_TYPE)
  private String transOutType;

  public RoyaltyDetailInfos() { 
  }

  public RoyaltyDetailInfos amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 分账的金额，单位为元
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账的金额，单位为元")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public RoyaltyDetailInfos amountPercentage(String amountPercentage) {
    
    this.amountPercentage = amountPercentage;
    return this;
  }

   /**
   * 分账的比例，值为20代表按20%的比例分账
   * @return amountPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账的比例，值为20代表按20%的比例分账")

  public String getAmountPercentage() {
    return amountPercentage;
  }


  public void setAmountPercentage(String amountPercentage) {
    this.amountPercentage = amountPercentage;
  }


  public RoyaltyDetailInfos batchNo(String batchNo) {
    
    this.batchNo = batchNo;
    return this;
  }

   /**
   * 分账批次号  分账批次号。  目前需要和转入账号类型为bankIndex配合使用。
   * @return batchNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账批次号  分账批次号。  目前需要和转入账号类型为bankIndex配合使用。")

  public String getBatchNo() {
    return batchNo;
  }


  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }


  public RoyaltyDetailInfos desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 分账描述信息
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账描述信息")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public RoyaltyDetailInfos outRelationId(String outRelationId) {
    
    this.outRelationId = outRelationId;
    return this;
  }

   /**
   * 商户分账的外部关联号，用于关联到每一笔分账信息，商户需保证其唯一性。  如果为空，该值则默认为“商户网站唯一订单号+分账序列号”
   * @return outRelationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户分账的外部关联号，用于关联到每一笔分账信息，商户需保证其唯一性。  如果为空，该值则默认为“商户网站唯一订单号+分账序列号”")

  public String getOutRelationId() {
    return outRelationId;
  }


  public void setOutRelationId(String outRelationId) {
    this.outRelationId = outRelationId;
  }


  public RoyaltyDetailInfos serialNo(Integer serialNo) {
    
    this.serialNo = serialNo;
    return this;
  }

   /**
   * 分账序列号，表示分账执行的顺序，必须为正整数
   * @return serialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账序列号，表示分账执行的顺序，必须为正整数")

  public Integer getSerialNo() {
    return serialNo;
  }


  public void setSerialNo(Integer serialNo) {
    this.serialNo = serialNo;
  }


  public RoyaltyDetailInfos transIn(String transIn) {
    
    this.transIn = transIn;
    return this;
  }

   /**
   * 如果转入账号类型为userId，本参数为接受分账金额的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。  &amp;#61548; 如果转入账号类型为bankIndex，本参数为28位的银行编号（商户和支付宝签约时确定）。  如果转入账号类型为storeId，本参数为商户的门店ID。
   * @return transIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "如果转入账号类型为userId，本参数为接受分账金额的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。  &#61548; 如果转入账号类型为bankIndex，本参数为28位的银行编号（商户和支付宝签约时确定）。  如果转入账号类型为storeId，本参数为商户的门店ID。")

  public String getTransIn() {
    return transIn;
  }


  public void setTransIn(String transIn) {
    this.transIn = transIn;
  }


  public RoyaltyDetailInfos transInType(String transInType) {
    
    this.transInType = transInType;
    return this;
  }

   /**
   * 接受分账金额的账户类型
   * @return transInType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "接受分账金额的账户类型")

  public String getTransInType() {
    return transInType;
  }


  public void setTransInType(String transInType) {
    this.transInType = transInType;
  }


  public RoyaltyDetailInfos transOut(String transOut) {
    
    this.transOut = transOut;
    return this;
  }

   /**
   * 如果转出账号类型为userId，本参数为要分账的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
   * @return transOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "如果转出账号类型为userId，本参数为要分账的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。")

  public String getTransOut() {
    return transOut;
  }


  public void setTransOut(String transOut) {
    this.transOut = transOut;
  }


  public RoyaltyDetailInfos transOutType(String transOutType) {
    
    this.transOutType = transOutType;
    return this;
  }

   /**
   * 要分账的账户类型。  目前只支持userId：支付宝账号对应的支付宝唯一用户号。  默认值为userId。
   * @return transOutType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "要分账的账户类型。  目前只支持userId：支付宝账号对应的支付宝唯一用户号。  默认值为userId。")

  public String getTransOutType() {
    return transOutType;
  }


  public void setTransOutType(String transOutType) {
    this.transOutType = transOutType;
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
   * @return the RoyaltyDetailInfos instance itself
   */
  public RoyaltyDetailInfos putAdditionalProperty(String key, Object value) {
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
    RoyaltyDetailInfos royaltyDetailInfos = (RoyaltyDetailInfos) o;
    return Objects.equals(this.amount, royaltyDetailInfos.amount) &&
        Objects.equals(this.amountPercentage, royaltyDetailInfos.amountPercentage) &&
        Objects.equals(this.batchNo, royaltyDetailInfos.batchNo) &&
        Objects.equals(this.desc, royaltyDetailInfos.desc) &&
        Objects.equals(this.outRelationId, royaltyDetailInfos.outRelationId) &&
        Objects.equals(this.serialNo, royaltyDetailInfos.serialNo) &&
        Objects.equals(this.transIn, royaltyDetailInfos.transIn) &&
        Objects.equals(this.transInType, royaltyDetailInfos.transInType) &&
        Objects.equals(this.transOut, royaltyDetailInfos.transOut) &&
        Objects.equals(this.transOutType, royaltyDetailInfos.transOutType)&&
        Objects.equals(this.additionalProperties, royaltyDetailInfos.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountPercentage, batchNo, desc, outRelationId, serialNo, transIn, transInType, transOut, transOutType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoyaltyDetailInfos {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountPercentage: ").append(toIndentedString(amountPercentage)).append("\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    outRelationId: ").append(toIndentedString(outRelationId)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    transIn: ").append(toIndentedString(transIn)).append("\n");
    sb.append("    transInType: ").append(toIndentedString(transInType)).append("\n");
    sb.append("    transOut: ").append(toIndentedString(transOut)).append("\n");
    sb.append("    transOutType: ").append(toIndentedString(transOutType)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("amount_percentage");
    openapiFields.add("batch_no");
    openapiFields.add("desc");
    openapiFields.add("out_relation_id");
    openapiFields.add("serial_no");
    openapiFields.add("trans_in");
    openapiFields.add("trans_in_type");
    openapiFields.add("trans_out");
    openapiFields.add("trans_out_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RoyaltyDetailInfos
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RoyaltyDetailInfos.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RoyaltyDetailInfos is not found in the empty JSON string", RoyaltyDetailInfos.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("amount_percentage") != null && !jsonObj.get("amount_percentage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_percentage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_percentage").toString()));
      }
      if (jsonObj.get("batch_no") != null && !jsonObj.get("batch_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_no").toString()));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("out_relation_id") != null && !jsonObj.get("out_relation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_relation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_relation_id").toString()));
      }
      if (jsonObj.get("trans_in") != null && !jsonObj.get("trans_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in").toString()));
      }
      if (jsonObj.get("trans_in_type") != null && !jsonObj.get("trans_in_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_type").toString()));
      }
      if (jsonObj.get("trans_out") != null && !jsonObj.get("trans_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out").toString()));
      }
      if (jsonObj.get("trans_out_type") != null && !jsonObj.get("trans_out_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RoyaltyDetailInfos.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RoyaltyDetailInfos' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RoyaltyDetailInfos> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RoyaltyDetailInfos.class));

       return (TypeAdapter<T>) new TypeAdapter<RoyaltyDetailInfos>() {
           @Override
           public void write(JsonWriter out, RoyaltyDetailInfos value) throws IOException {
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
           public RoyaltyDetailInfos read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RoyaltyDetailInfos instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RoyaltyDetailInfos given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RoyaltyDetailInfos
  * @throws IOException if the JSON string is invalid with respect to RoyaltyDetailInfos
  */
  public static RoyaltyDetailInfos fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoyaltyDetailInfos.class);
  }

 /**
  * Convert an instance of RoyaltyDetailInfos to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

