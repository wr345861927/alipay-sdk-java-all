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
 * CreateMiniRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateMiniRequest {
  public static final String SERIALIZED_NAME_ALIPAY_ACCOUNT = "alipay_account";
  @SerializedName(SERIALIZED_NAME_ALIPAY_ACCOUNT)
  private String alipayAccount;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_CERT_NAME = "cert_name";
  @SerializedName(SERIALIZED_NAME_CERT_NAME)
  private String certName;

  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  public static final String SERIALIZED_NAME_CONTACT_PHONE = "contact_phone";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE)
  private String contactPhone;

  public static final String SERIALIZED_NAME_IS_INDIVIDUAL = "is_individual";
  @SerializedName(SERIALIZED_NAME_IS_INDIVIDUAL)
  private Boolean isIndividual;

  public static final String SERIALIZED_NAME_LEGAL_PERSONAL_NAME = "legal_personal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_PERSONAL_NAME)
  private String legalPersonalName;

  public static final String SERIALIZED_NAME_LICENSE_PIC = "license_pic";
  @SerializedName(SERIALIZED_NAME_LICENSE_PIC)
  private String licensePic;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public CreateMiniRequest() { 
  }

  public CreateMiniRequest alipayAccount(String alipayAccount) {
    
    this.alipayAccount = alipayAccount;
    return this;
  }

   /**
   * 商家登录支付宝的邮箱帐号或手机号。（1）默认只支持企业账号类型；（2）将is_individual设置为true，支持个体工商户类型的账号（同时也兼容企业账号）（3）将is_individual设置为true且上传营业执照照片，将同时对具备个体工商户营业执照的商家个人账号认证成为个体工商户账号（同时也兼容企业账号、个体工商户账号）
   * @return alipayAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test@email.com", value = "商家登录支付宝的邮箱帐号或手机号。（1）默认只支持企业账号类型；（2）将is_individual设置为true，支持个体工商户类型的账号（同时也兼容企业账号）（3）将is_individual设置为true且上传营业执照照片，将同时对具备个体工商户营业执照的商家个人账号认证成为个体工商户账号（同时也兼容企业账号、个体工商户账号）")

  public String getAlipayAccount() {
    return alipayAccount;
  }


  public void setAlipayAccount(String alipayAccount) {
    this.alipayAccount = alipayAccount;
  }


  public CreateMiniRequest appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序名称
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "示例小程序", value = "小程序名称")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public CreateMiniRequest certName(String certName) {
    
    this.certName = certName;
    return this;
  }

   /**
   * 营业执照企业名称，如果是“无主体名称个体工商户”则填“个体户+法人姓名”，例如“个体户张三”
   * @return certName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三科技有限公司", value = "营业执照企业名称，如果是“无主体名称个体工商户”则填“个体户+法人姓名”，例如“个体户张三”")

  public String getCertName() {
    return certName;
  }


  public void setCertName(String certName) {
    this.certName = certName;
  }


  public CreateMiniRequest certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 营业执照编码
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3704354348893534", value = "营业执照编码")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public CreateMiniRequest contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 商家联系人名称
   * @return contactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "商家联系人名称")

  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public CreateMiniRequest contactPhone(String contactPhone) {
    
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * 商家联系人手机电话
   * @return contactPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "199xxxx6338", value = "商家联系人手机电话")

  public String getContactPhone() {
    return contactPhone;
  }


  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }


  public CreateMiniRequest isIndividual(Boolean isIndividual) {
    
    this.isIndividual = isIndividual;
    return this;
  }

   /**
   * 默认为 false。当设置为 true 时，支持个体工商户的账号类型（同时兼容企业账号）
   * @return isIndividual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "默认为 false。当设置为 true 时，支持个体工商户的账号类型（同时兼容企业账号）")

  public Boolean getIsIndividual() {
    return isIndividual;
  }


  public void setIsIndividual(Boolean isIndividual) {
    this.isIndividual = isIndividual;
  }


  public CreateMiniRequest legalPersonalName(String legalPersonalName) {
    
    this.legalPersonalName = legalPersonalName;
    return this;
  }

   /**
   * 商家法人名称
   * @return legalPersonalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "商家法人名称")

  public String getLegalPersonalName() {
    return legalPersonalName;
  }


  public void setLegalPersonalName(String legalPersonalName) {
    this.legalPersonalName = legalPersonalName;
  }


  public CreateMiniRequest licensePic(String licensePic) {
    
    this.licensePic = licensePic;
    return this;
  }

   /**
   * 营业执照图片的Base64编码字符串，图片大小不能超过2M。将is_individual设置为true，当传入该参数后，如果商家账号不是个体工商户类型，将同时为商家升级账号，无需商家额外操作升级（同时支持企业账号、个体工商户账号）
   * @return licensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/9j/Qnl0ZUFycmF5T3V0cHV0U3RyZWFtIG91dHB1dCA9IG5ldyBCeXRlQ中间缩略Skge30=", value = "营业执照图片的Base64编码字符串，图片大小不能超过2M。将is_individual设置为true，当传入该参数后，如果商家账号不是个体工商户类型，将同时为商家升级账号，无需商家额外操作升级（同时支持企业账号、个体工商户账号）")

  public String getLicensePic() {
    return licensePic;
  }


  public void setLicensePic(String licensePic) {
    this.licensePic = licensePic;
  }


  public CreateMiniRequest outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 开发者外部订单号，自定义传入，通过开发者账号+outOrderNo做业务幂等。（1）该字段会在商家确认创建后通过应用授权通知出参notify_context以out_biz_no属性返回给ISV，应用授权通知订阅参考：&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/isv/01fejh\&quot;&gt;https://opendocs.alipay.com/isv/01fejh&lt;/a&gt;。（2）该字段也会通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03l3f1?pathHash&#x3D;5c81f4fb&amp;scene&#x3D;common\&quot;&gt;alipay.open.mini.merchant.confirmed&lt;/a&gt;返回给订阅方
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "202324353454545", value = "开发者外部订单号，自定义传入，通过开发者账号+outOrderNo做业务幂等。（1）该字段会在商家确认创建后通过应用授权通知出参notify_context以out_biz_no属性返回给ISV，应用授权通知订阅参考：<a href=\"https://opendocs.alipay.com/isv/01fejh\">https://opendocs.alipay.com/isv/01fejh</a>。（2）该字段也会通过<a href=\"https://opendocs.alipay.com/mini/03l3f1?pathHash=5c81f4fb&scene=common\">alipay.open.mini.merchant.confirmed</a>返回给订阅方")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
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
   * @return the CreateMiniRequest instance itself
   */
  public CreateMiniRequest putAdditionalProperty(String key, Object value) {
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
    CreateMiniRequest createMiniRequest = (CreateMiniRequest) o;
    return Objects.equals(this.alipayAccount, createMiniRequest.alipayAccount) &&
        Objects.equals(this.appName, createMiniRequest.appName) &&
        Objects.equals(this.certName, createMiniRequest.certName) &&
        Objects.equals(this.certNo, createMiniRequest.certNo) &&
        Objects.equals(this.contactName, createMiniRequest.contactName) &&
        Objects.equals(this.contactPhone, createMiniRequest.contactPhone) &&
        Objects.equals(this.isIndividual, createMiniRequest.isIndividual) &&
        Objects.equals(this.legalPersonalName, createMiniRequest.legalPersonalName) &&
        Objects.equals(this.licensePic, createMiniRequest.licensePic) &&
        Objects.equals(this.outOrderNo, createMiniRequest.outOrderNo)&&
        Objects.equals(this.additionalProperties, createMiniRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayAccount, appName, certName, certNo, contactName, contactPhone, isIndividual, legalPersonalName, licensePic, outOrderNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMiniRequest {\n");
    sb.append("    alipayAccount: ").append(toIndentedString(alipayAccount)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    isIndividual: ").append(toIndentedString(isIndividual)).append("\n");
    sb.append("    legalPersonalName: ").append(toIndentedString(legalPersonalName)).append("\n");
    sb.append("    licensePic: ").append(toIndentedString(licensePic)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
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
    openapiFields.add("alipay_account");
    openapiFields.add("app_name");
    openapiFields.add("cert_name");
    openapiFields.add("cert_no");
    openapiFields.add("contact_name");
    openapiFields.add("contact_phone");
    openapiFields.add("is_individual");
    openapiFields.add("legal_personal_name");
    openapiFields.add("license_pic");
    openapiFields.add("out_order_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateMiniRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateMiniRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateMiniRequest is not found in the empty JSON string", CreateMiniRequest.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("alipay_account") != null && !jsonObj.get("alipay_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_account").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("cert_name") != null && !jsonObj.get("cert_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_name").toString()));
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("contact_name") != null && !jsonObj.get("contact_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_name").toString()));
      }
      if (jsonObj.get("contact_phone") != null && !jsonObj.get("contact_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_phone").toString()));
      }
      if (jsonObj.get("legal_personal_name") != null && !jsonObj.get("legal_personal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_personal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_personal_name").toString()));
      }
      if (jsonObj.get("license_pic") != null && !jsonObj.get("license_pic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_pic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_pic").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateMiniRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateMiniRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateMiniRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateMiniRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateMiniRequest>() {
           @Override
           public void write(JsonWriter out, CreateMiniRequest value) throws IOException {
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
           public CreateMiniRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateMiniRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateMiniRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateMiniRequest
  * @throws IOException if the JSON string is invalid with respect to CreateMiniRequest
  */
  public static CreateMiniRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateMiniRequest.class);
  }

 /**
  * Convert an instance of CreateMiniRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

