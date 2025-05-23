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
import com.alipay.v3.model.CustomsDeclareBuyerInfo;
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
 * AlipayTradeCustomsDeclareModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeCustomsDeclareModel {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BUYER_INFO = "buyer_info";
  @SerializedName(SERIALIZED_NAME_BUYER_INFO)
  private CustomsDeclareBuyerInfo buyerInfo;

  public static final String SERIALIZED_NAME_CUSTOMS_PLACE = "customs_place";
  @SerializedName(SERIALIZED_NAME_CUSTOMS_PLACE)
  private String customsPlace;

  public static final String SERIALIZED_NAME_DECLARE_MODE = "declare_mode";
  @SerializedName(SERIALIZED_NAME_DECLARE_MODE)
  private Integer declareMode;

  public static final String SERIALIZED_NAME_DEPOSIT_TRADE_NO = "deposit_trade_no";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_TRADE_NO)
  private String depositTradeNo;

  public static final String SERIALIZED_NAME_IS_SPLIT = "is_split";
  @SerializedName(SERIALIZED_NAME_IS_SPLIT)
  private String isSplit;

  public static final String SERIALIZED_NAME_MERCHANT_CUSTOMS_CODE = "merchant_customs_code";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CUSTOMS_CODE)
  private String merchantCustomsCode;

  public static final String SERIALIZED_NAME_MERCHANT_CUSTOMS_NAME = "merchant_customs_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CUSTOMS_NAME)
  private String merchantCustomsName;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_SUB_OUT_BIZ_NO = "sub_out_biz_no";
  @SerializedName(SERIALIZED_NAME_SUB_OUT_BIZ_NO)
  private String subOutBizNo;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeCustomsDeclareModel() { 
  }

  public AlipayTradeCustomsDeclareModel amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 报关金额，单位为人民币“元”，精确到小数点后2位。
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "报关金额，单位为人民币“元”，精确到小数点后2位。")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AlipayTradeCustomsDeclareModel buyerInfo(CustomsDeclareBuyerInfo buyerInfo) {
    
    this.buyerInfo = buyerInfo;
    return this;
  }

   /**
   * Get buyerInfo
   * @return buyerInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomsDeclareBuyerInfo getBuyerInfo() {
    return buyerInfo;
  }


  public void setBuyerInfo(CustomsDeclareBuyerInfo buyerInfo) {
    this.buyerInfo = buyerInfo;
  }


  public AlipayTradeCustomsDeclareModel customsPlace(String customsPlace) {
    
    this.customsPlace = customsPlace;
    return this;
  }

   /**
   * 海关编号（大小写皆可）。参见“ &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/pre-open/01x3kh#%E6%B5%B7%E5%85%B3%E7%BC%96%E5%8F%B7\&quot;&gt;海关编号&lt;/a&gt;”。
   * @return customsPlace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZONGSHU", value = "海关编号（大小写皆可）。参见“ <a href=\"https://opendocs.alipay.com/pre-open/01x3kh#%E6%B5%B7%E5%85%B3%E7%BC%96%E5%8F%B7\">海关编号</a>”。")

  public String getCustomsPlace() {
    return customsPlace;
  }


  public void setCustomsPlace(String customsPlace) {
    this.customsPlace = customsPlace;
  }


  public AlipayTradeCustomsDeclareModel declareMode(Integer declareMode) {
    
    this.declareMode = declareMode;
    return this;
  }

   /**
   * 报关模式，默认可空，1表示需要强校验买家和支付人的身份信息。
   * @return declareMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "报关模式，默认可空，1表示需要强校验买家和支付人的身份信息。")

  public Integer getDeclareMode() {
    return declareMode;
  }


  public void setDeclareMode(Integer declareMode) {
    this.declareMode = declareMode;
  }


  public AlipayTradeCustomsDeclareModel depositTradeNo(String depositTradeNo) {
    
    this.depositTradeNo = depositTradeNo;
    return this;
  }

   /**
   * 定金在支付宝系统中的交易流水号，最长64位。当该参数不为空时，代表为”定金+尾款“报关场景。
   * @return depositTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022110322001431071435352949", value = "定金在支付宝系统中的交易流水号，最长64位。当该参数不为空时，代表为”定金+尾款“报关场景。")

  public String getDepositTradeNo() {
    return depositTradeNo;
  }


  public void setDepositTradeNo(String depositTradeNo) {
    this.depositTradeNo = depositTradeNo;
  }


  public AlipayTradeCustomsDeclareModel isSplit(String isSplit) {
    
    this.isSplit = isSplit;
    return this;
  }

   /**
   * 商户控制本单是否拆单的报关参数。  仅当该参数传值为T或者t时，才会触发拆单。
   * @return isSplit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "商户控制本单是否拆单的报关参数。  仅当该参数传值为T或者t时，才会触发拆单。")

  public String getIsSplit() {
    return isSplit;
  }


  public void setIsSplit(String isSplit) {
    this.isSplit = isSplit;
  }


  public AlipayTradeCustomsDeclareModel merchantCustomsCode(String merchantCustomsCode) {
    
    this.merchantCustomsCode = merchantCustomsCode;
    return this;
  }

   /**
   * 商户在海关备案的编号。
   * @return merchantCustomsCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "737203458", value = "商户在海关备案的编号。")

  public String getMerchantCustomsCode() {
    return merchantCustomsCode;
  }


  public void setMerchantCustomsCode(String merchantCustomsCode) {
    this.merchantCustomsCode = merchantCustomsCode;
  }


  public AlipayTradeCustomsDeclareModel merchantCustomsName(String merchantCustomsName) {
    
    this.merchantCustomsName = merchantCustomsName;
    return this;
  }

   /**
   * 商户海关备案名称。
   * @return merchantCustomsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "龙腾国际贸易有限公司", value = "商户海关备案名称。")

  public String getMerchantCustomsName() {
    return merchantCustomsName;
  }


  public void setMerchantCustomsName(String merchantCustomsName) {
    this.merchantCustomsName = merchantCustomsName;
  }


  public AlipayTradeCustomsDeclareModel merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 国际站商户标识
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2188120005907173", value = "国际站商户标识")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public AlipayTradeCustomsDeclareModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 报关流水号。商户生成的用于唯一标识一次报关操作的业务编号。 建议生成规则：yyyymmdd型8位日期拼接4位序列号。每个报关请求号仅允许传入：数字、英文字母、下划线”_”、短横线”－” 。长度6-64位前后不能有空格
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9193457120563834", value = "报关流水号。商户生成的用于唯一标识一次报关操作的业务编号。 建议生成规则：yyyymmdd型8位日期拼接4位序列号。每个报关请求号仅允许传入：数字、英文字母、下划线”_”、短横线”－” 。长度6-64位前后不能有空格")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeCustomsDeclareModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 国际站外部订单号
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1422534255340818295", value = "国际站外部订单号")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayTradeCustomsDeclareModel subOutBizNo(String subOutBizNo) {
    
    this.subOutBizNo = subOutBizNo;
    return this;
  }

   /**
   * 拆单报关的商户子订单号。 用于区别拆单时不同子单。拆单时必须传入，否则会报INVALID_PARAMETER错误码。
   * @return subOutBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015080811223212345453", value = "拆单报关的商户子订单号。 用于区别拆单时不同子单。拆单时必须传入，否则会报INVALID_PARAMETER错误码。")

  public String getSubOutBizNo() {
    return subOutBizNo;
  }


  public void setSubOutBizNo(String subOutBizNo) {
    this.subOutBizNo = subOutBizNo;
  }


  public AlipayTradeCustomsDeclareModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号。该交易在支付宝系统中的交易流水号，最长64位。
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015051446800462", value = "支付宝交易号。该交易在支付宝系统中的交易流水号，最长64位。")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
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
   * @return the AlipayTradeCustomsDeclareModel instance itself
   */
  public AlipayTradeCustomsDeclareModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeCustomsDeclareModel alipayTradeCustomsDeclareModel = (AlipayTradeCustomsDeclareModel) o;
    return Objects.equals(this.amount, alipayTradeCustomsDeclareModel.amount) &&
        Objects.equals(this.buyerInfo, alipayTradeCustomsDeclareModel.buyerInfo) &&
        Objects.equals(this.customsPlace, alipayTradeCustomsDeclareModel.customsPlace) &&
        Objects.equals(this.declareMode, alipayTradeCustomsDeclareModel.declareMode) &&
        Objects.equals(this.depositTradeNo, alipayTradeCustomsDeclareModel.depositTradeNo) &&
        Objects.equals(this.isSplit, alipayTradeCustomsDeclareModel.isSplit) &&
        Objects.equals(this.merchantCustomsCode, alipayTradeCustomsDeclareModel.merchantCustomsCode) &&
        Objects.equals(this.merchantCustomsName, alipayTradeCustomsDeclareModel.merchantCustomsName) &&
        Objects.equals(this.merchantId, alipayTradeCustomsDeclareModel.merchantId) &&
        Objects.equals(this.outRequestNo, alipayTradeCustomsDeclareModel.outRequestNo) &&
        Objects.equals(this.outTradeNo, alipayTradeCustomsDeclareModel.outTradeNo) &&
        Objects.equals(this.subOutBizNo, alipayTradeCustomsDeclareModel.subOutBizNo) &&
        Objects.equals(this.tradeNo, alipayTradeCustomsDeclareModel.tradeNo)&&
        Objects.equals(this.additionalProperties, alipayTradeCustomsDeclareModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, buyerInfo, customsPlace, declareMode, depositTradeNo, isSplit, merchantCustomsCode, merchantCustomsName, merchantId, outRequestNo, outTradeNo, subOutBizNo, tradeNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeCustomsDeclareModel {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    buyerInfo: ").append(toIndentedString(buyerInfo)).append("\n");
    sb.append("    customsPlace: ").append(toIndentedString(customsPlace)).append("\n");
    sb.append("    declareMode: ").append(toIndentedString(declareMode)).append("\n");
    sb.append("    depositTradeNo: ").append(toIndentedString(depositTradeNo)).append("\n");
    sb.append("    isSplit: ").append(toIndentedString(isSplit)).append("\n");
    sb.append("    merchantCustomsCode: ").append(toIndentedString(merchantCustomsCode)).append("\n");
    sb.append("    merchantCustomsName: ").append(toIndentedString(merchantCustomsName)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    subOutBizNo: ").append(toIndentedString(subOutBizNo)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("buyer_info");
    openapiFields.add("customs_place");
    openapiFields.add("declare_mode");
    openapiFields.add("deposit_trade_no");
    openapiFields.add("is_split");
    openapiFields.add("merchant_customs_code");
    openapiFields.add("merchant_customs_name");
    openapiFields.add("merchant_id");
    openapiFields.add("out_request_no");
    openapiFields.add("out_trade_no");
    openapiFields.add("sub_out_biz_no");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeCustomsDeclareModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeCustomsDeclareModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeCustomsDeclareModel is not found in the empty JSON string", AlipayTradeCustomsDeclareModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      // validate the optional field `buyer_info`
      if (jsonObj.getAsJsonObject("buyer_info") != null) {
        CustomsDeclareBuyerInfo.validateJsonObject(jsonObj.getAsJsonObject("buyer_info"));
      }
      if (jsonObj.get("customs_place") != null && !jsonObj.get("customs_place").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customs_place` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customs_place").toString()));
      }
      if (jsonObj.get("deposit_trade_no") != null && !jsonObj.get("deposit_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deposit_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deposit_trade_no").toString()));
      }
      if (jsonObj.get("is_split") != null && !jsonObj.get("is_split").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_split` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_split").toString()));
      }
      if (jsonObj.get("merchant_customs_code") != null && !jsonObj.get("merchant_customs_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_customs_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_customs_code").toString()));
      }
      if (jsonObj.get("merchant_customs_name") != null && !jsonObj.get("merchant_customs_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_customs_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_customs_name").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      if (jsonObj.get("sub_out_biz_no") != null && !jsonObj.get("sub_out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_out_biz_no").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeCustomsDeclareModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeCustomsDeclareModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeCustomsDeclareModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeCustomsDeclareModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeCustomsDeclareModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeCustomsDeclareModel value) throws IOException {
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
           public AlipayTradeCustomsDeclareModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeCustomsDeclareModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeCustomsDeclareModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeCustomsDeclareModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeCustomsDeclareModel
  */
  public static AlipayTradeCustomsDeclareModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeCustomsDeclareModel.class);
  }

 /**
  * Convert an instance of AlipayTradeCustomsDeclareModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

