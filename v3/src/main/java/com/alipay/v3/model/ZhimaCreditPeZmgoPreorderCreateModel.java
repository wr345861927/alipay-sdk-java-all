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
import com.alipay.v3.model.ExtTemplateConf;
import com.alipay.v3.model.PreOrderExtInfo;
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
 * ZhimaCreditPeZmgoPreorderCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPeZmgoPreorderCreateModel {
  public static final String SERIALIZED_NAME_ALIPAY_OPEN_ID = "alipay_open_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_OPEN_ID)
  private String alipayOpenId;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_BIZ_TIME = "biz_time";
  @SerializedName(SERIALIZED_NAME_BIZ_TIME)
  private String bizTime;

  public static final String SERIALIZED_NAME_CUSTOM_TEMP_CONF = "custom_temp_conf";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TEMP_CONF)
  private String customTempConf;

  public static final String SERIALIZED_NAME_EXPIRE_AISLE_DATA = "expire_aisle_data";
  @SerializedName(SERIALIZED_NAME_EXPIRE_AISLE_DATA)
  private String expireAisleData;

  public static final String SERIALIZED_NAME_EXT_TEMPLATE_CONF = "ext_template_conf";
  @SerializedName(SERIALIZED_NAME_EXT_TEMPLATE_CONF)
  private ExtTemplateConf extTemplateConf;

  public static final String SERIALIZED_NAME_EXTEND_PARAMS = "extend_params";
  @SerializedName(SERIALIZED_NAME_EXTEND_PARAMS)
  private PreOrderExtInfo extendParams;

  public static final String SERIALIZED_NAME_FREEZE_AMOUNT = "freeze_amount";
  @SerializedName(SERIALIZED_NAME_FREEZE_AMOUNT)
  private String freezeAmount;

  public static final String SERIALIZED_NAME_ISV_PID = "isv_pid";
  @SerializedName(SERIALIZED_NAME_ISV_PID)
  private String isvPid;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_PARTNER_USER_IDENTIFIER = "partner_user_identifier";
  @SerializedName(SERIALIZED_NAME_PARTNER_USER_IDENTIFIER)
  private String partnerUserIdentifier;

  public static final String SERIALIZED_NAME_PAY_AISLE_DATA = "pay_aisle_data";
  @SerializedName(SERIALIZED_NAME_PAY_AISLE_DATA)
  private String payAisleData;

  public static final String SERIALIZED_NAME_SIGN_AISLE_DATA = "sign_aisle_data";
  @SerializedName(SERIALIZED_NAME_SIGN_AISLE_DATA)
  private String signAisleData;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TIMEOUT_EXPRESS = "timeout_express";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_EXPRESS)
  private String timeoutExpress;

  public ZhimaCreditPeZmgoPreorderCreateModel() { 
  }

  public ZhimaCreditPeZmgoPreorderCreateModel alipayOpenId(String alipayOpenId) {
    
    this.alipayOpenId = alipayOpenId;
    return this;
  }

   /**
   * 支付宝用户ID。同一个外部请求号，调用方要确保支付宝userId取值不变
   * @return alipayOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户ID。同一个外部请求号，调用方要确保支付宝userId取值不变")

  public String getAlipayOpenId() {
    return alipayOpenId;
  }


  public void setAlipayOpenId(String alipayOpenId) {
    this.alipayOpenId = alipayOpenId;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 支付宝用户ID。同一个外部请求号，调用方要确保支付宝userId取值不变
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088759402857364", value = "支付宝用户ID。同一个外部请求号，调用方要确保支付宝userId取值不变")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel bizTime(String bizTime) {
    
    this.bizTime = bizTime;
    return this;
  }

   /**
   * 业务发生时间，如2016-07-06 00:00:02 签约超时关单时间依赖这个时间 这个时间会做幂等校验，如果创单幂等，但时间不同会失败
   * @return bizTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-07-06 00:00:02", value = "业务发生时间，如2016-07-06 00:00:02 签约超时关单时间依赖这个时间 这个时间会做幂等校验，如果创单幂等，但时间不同会失败")

  public String getBizTime() {
    return bizTime;
  }


  public void setBizTime(String bizTime) {
    this.bizTime = bizTime;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel customTempConf(String customTempConf) {
    
    this.customTempConf = customTempConf;
    return this;
  }

   /**
   * 废弃字段，勿用
   * @return customTempConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SHOW_AGREEMENT_LIST=true", value = "废弃字段，勿用")

  public String getCustomTempConf() {
    return customTempConf;
  }


  public void setCustomTempConf(String customTempConf) {
    this.customTempConf = customTempConf;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel expireAisleData(String expireAisleData) {
    
    this.expireAisleData = expireAisleData;
    return this;
  }

   /**
   * 协议到期后通知
   * @return expireAisleData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "业务方到期标识", value = "协议到期后通知")

  public String getExpireAisleData() {
    return expireAisleData;
  }


  public void setExpireAisleData(String expireAisleData) {
    this.expireAisleData = expireAisleData;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel extTemplateConf(ExtTemplateConf extTemplateConf) {
    
    this.extTemplateConf = extTemplateConf;
    return this;
  }

   /**
   * Get extTemplateConf
   * @return extTemplateConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExtTemplateConf getExtTemplateConf() {
    return extTemplateConf;
  }


  public void setExtTemplateConf(ExtTemplateConf extTemplateConf) {
    this.extTemplateConf = extTemplateConf;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel extendParams(PreOrderExtInfo extendParams) {
    
    this.extendParams = extendParams;
    return this;
  }

   /**
   * Get extendParams
   * @return extendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PreOrderExtInfo getExtendParams() {
    return extendParams;
  }


  public void setExtendParams(PreOrderExtInfo extendParams) {
    this.extendParams = extendParams;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel freezeAmount(String freezeAmount) {
    
    this.freezeAmount = freezeAmount;
    return this;
  }

   /**
   * 冻结金额，单位：元
   * @return freezeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.00", value = "冻结金额，单位：元")

  public String getFreezeAmount() {
    return freezeAmount;
  }


  public void setFreezeAmount(String freezeAmount) {
    this.freezeAmount = freezeAmount;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel isvPid(String isvPid) {
    
    this.isvPid = isvPid;
    return this;
  }

   /**
   * ISV商户ID
   * @return isvPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088374762857463", value = "ISV商户ID")

  public String getIsvPid() {
    return isvPid;
  }


  public void setIsvPid(String isvPid) {
    this.isvPid = isvPid;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 外部请求号，唯一
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ORDER_12345678", value = "外部请求号，唯一")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 商户ID
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088437463829741", value = "商户ID")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel partnerUserIdentifier(String partnerUserIdentifier) {
    
    this.partnerUserIdentifier = partnerUserIdentifier;
    return this;
  }

   /**
   * 商户侧用户唯一标识。ex.商户侧uid
   * @return partnerUserIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user102934889234", value = "商户侧用户唯一标识。ex.商户侧uid")

  public String getPartnerUserIdentifier() {
    return partnerUserIdentifier;
  }


  public void setPartnerUserIdentifier(String partnerUserIdentifier) {
    this.partnerUserIdentifier = partnerUserIdentifier;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel payAisleData(String payAisleData) {
    
    this.payAisleData = payAisleData;
    return this;
  }

   /**
   * 结算成功后通知
   * @return payAisleData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "业务方结算标识", value = "结算成功后通知")

  public String getPayAisleData() {
    return payAisleData;
  }


  public void setPayAisleData(String payAisleData) {
    this.payAisleData = payAisleData;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel signAisleData(String signAisleData) {
    
    this.signAisleData = signAisleData;
    return this;
  }

   /**
   * 签约成功后通知
   * @return signAisleData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "业务方签约标识", value = "签约成功后通知")

  public String getSignAisleData() {
    return signAisleData;
  }


  public void setSignAisleData(String signAisleData) {
    this.signAisleData = signAisleData;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 签约芝麻GO的模板ID
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020122200020903760008552025", value = "签约芝麻GO的模板ID")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public ZhimaCreditPeZmgoPreorderCreateModel timeoutExpress(String timeoutExpress) {
    
    this.timeoutExpress = timeoutExpress;
    return this;
  }

   /**
   * 超时关单时间 默认1H。1m～15d。m表示分钟，h表示小时，d表示天。该参数数值不接受小数点， 如1.5h，可转换为90m 签约超时关单时间依赖这个时间
   * @return timeoutExpress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15m", value = "超时关单时间 默认1H。1m～15d。m表示分钟，h表示小时，d表示天。该参数数值不接受小数点， 如1.5h，可转换为90m 签约超时关单时间依赖这个时间")

  public String getTimeoutExpress() {
    return timeoutExpress;
  }


  public void setTimeoutExpress(String timeoutExpress) {
    this.timeoutExpress = timeoutExpress;
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
   * @return the ZhimaCreditPeZmgoPreorderCreateModel instance itself
   */
  public ZhimaCreditPeZmgoPreorderCreateModel putAdditionalProperty(String key, Object value) {
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
    ZhimaCreditPeZmgoPreorderCreateModel zhimaCreditPeZmgoPreorderCreateModel = (ZhimaCreditPeZmgoPreorderCreateModel) o;
    return Objects.equals(this.alipayOpenId, zhimaCreditPeZmgoPreorderCreateModel.alipayOpenId) &&
        Objects.equals(this.alipayUserId, zhimaCreditPeZmgoPreorderCreateModel.alipayUserId) &&
        Objects.equals(this.bizTime, zhimaCreditPeZmgoPreorderCreateModel.bizTime) &&
        Objects.equals(this.customTempConf, zhimaCreditPeZmgoPreorderCreateModel.customTempConf) &&
        Objects.equals(this.expireAisleData, zhimaCreditPeZmgoPreorderCreateModel.expireAisleData) &&
        Objects.equals(this.extTemplateConf, zhimaCreditPeZmgoPreorderCreateModel.extTemplateConf) &&
        Objects.equals(this.extendParams, zhimaCreditPeZmgoPreorderCreateModel.extendParams) &&
        Objects.equals(this.freezeAmount, zhimaCreditPeZmgoPreorderCreateModel.freezeAmount) &&
        Objects.equals(this.isvPid, zhimaCreditPeZmgoPreorderCreateModel.isvPid) &&
        Objects.equals(this.outRequestNo, zhimaCreditPeZmgoPreorderCreateModel.outRequestNo) &&
        Objects.equals(this.partnerId, zhimaCreditPeZmgoPreorderCreateModel.partnerId) &&
        Objects.equals(this.partnerUserIdentifier, zhimaCreditPeZmgoPreorderCreateModel.partnerUserIdentifier) &&
        Objects.equals(this.payAisleData, zhimaCreditPeZmgoPreorderCreateModel.payAisleData) &&
        Objects.equals(this.signAisleData, zhimaCreditPeZmgoPreorderCreateModel.signAisleData) &&
        Objects.equals(this.templateId, zhimaCreditPeZmgoPreorderCreateModel.templateId) &&
        Objects.equals(this.timeoutExpress, zhimaCreditPeZmgoPreorderCreateModel.timeoutExpress)&&
        Objects.equals(this.additionalProperties, zhimaCreditPeZmgoPreorderCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayOpenId, alipayUserId, bizTime, customTempConf, expireAisleData, extTemplateConf, extendParams, freezeAmount, isvPid, outRequestNo, partnerId, partnerUserIdentifier, payAisleData, signAisleData, templateId, timeoutExpress, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPeZmgoPreorderCreateModel {\n");
    sb.append("    alipayOpenId: ").append(toIndentedString(alipayOpenId)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    bizTime: ").append(toIndentedString(bizTime)).append("\n");
    sb.append("    customTempConf: ").append(toIndentedString(customTempConf)).append("\n");
    sb.append("    expireAisleData: ").append(toIndentedString(expireAisleData)).append("\n");
    sb.append("    extTemplateConf: ").append(toIndentedString(extTemplateConf)).append("\n");
    sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
    sb.append("    freezeAmount: ").append(toIndentedString(freezeAmount)).append("\n");
    sb.append("    isvPid: ").append(toIndentedString(isvPid)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerUserIdentifier: ").append(toIndentedString(partnerUserIdentifier)).append("\n");
    sb.append("    payAisleData: ").append(toIndentedString(payAisleData)).append("\n");
    sb.append("    signAisleData: ").append(toIndentedString(signAisleData)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    timeoutExpress: ").append(toIndentedString(timeoutExpress)).append("\n");
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
    openapiFields.add("alipay_open_id");
    openapiFields.add("alipay_user_id");
    openapiFields.add("biz_time");
    openapiFields.add("custom_temp_conf");
    openapiFields.add("expire_aisle_data");
    openapiFields.add("ext_template_conf");
    openapiFields.add("extend_params");
    openapiFields.add("freeze_amount");
    openapiFields.add("isv_pid");
    openapiFields.add("out_request_no");
    openapiFields.add("partner_id");
    openapiFields.add("partner_user_identifier");
    openapiFields.add("pay_aisle_data");
    openapiFields.add("sign_aisle_data");
    openapiFields.add("template_id");
    openapiFields.add("timeout_express");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPeZmgoPreorderCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPeZmgoPreorderCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPeZmgoPreorderCreateModel is not found in the empty JSON string", ZhimaCreditPeZmgoPreorderCreateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("alipay_open_id") != null && !jsonObj.get("alipay_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_open_id").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      if (jsonObj.get("biz_time") != null && !jsonObj.get("biz_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_time").toString()));
      }
      if (jsonObj.get("custom_temp_conf") != null && !jsonObj.get("custom_temp_conf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_temp_conf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_temp_conf").toString()));
      }
      if (jsonObj.get("expire_aisle_data") != null && !jsonObj.get("expire_aisle_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expire_aisle_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expire_aisle_data").toString()));
      }
      // validate the optional field `ext_template_conf`
      if (jsonObj.getAsJsonObject("ext_template_conf") != null) {
        ExtTemplateConf.validateJsonObject(jsonObj.getAsJsonObject("ext_template_conf"));
      }
      // validate the optional field `extend_params`
      if (jsonObj.getAsJsonObject("extend_params") != null) {
        PreOrderExtInfo.validateJsonObject(jsonObj.getAsJsonObject("extend_params"));
      }
      if (jsonObj.get("freeze_amount") != null && !jsonObj.get("freeze_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freeze_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freeze_amount").toString()));
      }
      if (jsonObj.get("isv_pid") != null && !jsonObj.get("isv_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_pid").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("partner_user_identifier") != null && !jsonObj.get("partner_user_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_user_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_user_identifier").toString()));
      }
      if (jsonObj.get("pay_aisle_data") != null && !jsonObj.get("pay_aisle_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_aisle_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_aisle_data").toString()));
      }
      if (jsonObj.get("sign_aisle_data") != null && !jsonObj.get("sign_aisle_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_aisle_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_aisle_data").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if (jsonObj.get("timeout_express") != null && !jsonObj.get("timeout_express").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeout_express` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeout_express").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPeZmgoPreorderCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPeZmgoPreorderCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPeZmgoPreorderCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPeZmgoPreorderCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPeZmgoPreorderCreateModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPeZmgoPreorderCreateModel value) throws IOException {
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
           public ZhimaCreditPeZmgoPreorderCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZhimaCreditPeZmgoPreorderCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZhimaCreditPeZmgoPreorderCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPeZmgoPreorderCreateModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPeZmgoPreorderCreateModel
  */
  public static ZhimaCreditPeZmgoPreorderCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPeZmgoPreorderCreateModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPeZmgoPreorderCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

