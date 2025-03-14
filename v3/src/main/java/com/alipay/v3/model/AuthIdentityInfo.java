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
import com.alipay.v3.model.IndirectCertificateInfo;
import com.alipay.v3.model.IndirectFinancialOrgInfo;
import com.alipay.v3.model.IndirectQualificationInfo;
import com.alipay.v3.model.IndirectSupportCredentials;
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
 * AuthIdentityInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthIdentityInfo {
  public static final String SERIALIZED_NAME_CERTIFICATE_INFO = "certificate_info";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_INFO)
  private IndirectCertificateInfo certificateInfo;

  public static final String SERIALIZED_NAME_CERTIFICATE_TYPE = "certificate_type";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_TYPE)
  private String certificateType;

  public static final String SERIALIZED_NAME_EMPLOYER_LETTER_IMG = "employer_letter_img";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_LETTER_IMG)
  private String employerLetterImg;

  public static final String SERIALIZED_NAME_FINANCIAL_ORG_INFO = "financial_org_info";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_ORG_INFO)
  private IndirectFinancialOrgInfo financialOrgInfo;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_IS_FINANCIAL_ORG = "is_financial_org";
  @SerializedName(SERIALIZED_NAME_IS_FINANCIAL_ORG)
  private Boolean isFinancialOrg;

  public static final String SERIALIZED_NAME_QUALIFICATION_INFO_LIST = "qualification_info_list";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_INFO_LIST)
  private List<IndirectQualificationInfo> qualificationInfoList = null;

  public static final String SERIALIZED_NAME_SUPPORT_CREDENTIALS = "support_credentials";
  @SerializedName(SERIALIZED_NAME_SUPPORT_CREDENTIALS)
  private IndirectSupportCredentials supportCredentials;

  public AuthIdentityInfo() { 
  }

  public AuthIdentityInfo certificateInfo(IndirectCertificateInfo certificateInfo) {
    
    this.certificateInfo = certificateInfo;
    return this;
  }

   /**
   * Get certificateInfo
   * @return certificateInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndirectCertificateInfo getCertificateInfo() {
    return certificateInfo;
  }


  public void setCertificateInfo(IndirectCertificateInfo certificateInfo) {
    this.certificateInfo = certificateInfo;
  }


  public AuthIdentityInfo certificateType(String certificateType) {
    
    this.certificateType = certificateType;
    return this;
  }

   /**
   * 主体类型为企业/个体户/政府机关/事业单位/社会组织时，必填； 证照类型：营业执照(BUSINESS_CERT)/登记证书(REGISTER_CERT) 主体为政府机关/事业单位/社会组织时，填登记证书； 主体类型为企业/个体户时，填营业执照；
   * @return certificateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BUSINESS_CERT", value = "主体类型为企业/个体户/政府机关/事业单位/社会组织时，必填； 证照类型：营业执照(BUSINESS_CERT)/登记证书(REGISTER_CERT) 主体为政府机关/事业单位/社会组织时，填登记证书； 主体类型为企业/个体户时，填营业执照；")

  public String getCertificateType() {
    return certificateType;
  }


  public void setCertificateType(String certificateType) {
    this.certificateType = certificateType;
  }


  public AuthIdentityInfo employerLetterImg(String employerLetterImg) {
    
    this.employerLetterImg = employerLetterImg;
    return this;
  }

   /**
   * 单位证明函照片（使用图片上传接口）主体类型为政府机关/事业单位时，单位证明函照片必填
   * @return employerLetterImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a5d373f6-3e79-405f-9993-fb7ea051c372.jpg", value = "单位证明函照片（使用图片上传接口）主体类型为政府机关/事业单位时，单位证明函照片必填")

  public String getEmployerLetterImg() {
    return employerLetterImg;
  }


  public void setEmployerLetterImg(String employerLetterImg) {
    this.employerLetterImg = employerLetterImg;
  }


  public AuthIdentityInfo financialOrgInfo(IndirectFinancialOrgInfo financialOrgInfo) {
    
    this.financialOrgInfo = financialOrgInfo;
    return this;
  }

   /**
   * Get financialOrgInfo
   * @return financialOrgInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndirectFinancialOrgInfo getFinancialOrgInfo() {
    return financialOrgInfo;
  }


  public void setFinancialOrgInfo(IndirectFinancialOrgInfo financialOrgInfo) {
    this.financialOrgInfo = financialOrgInfo;
  }


  public AuthIdentityInfo identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * 主体类型，枚举定义：企业(ENTERPRISE)、个体工商户(IND_BIZ)、事业单位(INST)、党政机关(GOV)、社会组织(ORG)、小微商户(MSE)
   * @return identityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE", value = "主体类型，枚举定义：企业(ENTERPRISE)、个体工商户(IND_BIZ)、事业单位(INST)、党政机关(GOV)、社会组织(ORG)、小微商户(MSE)")

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public AuthIdentityInfo isFinancialOrg(Boolean isFinancialOrg) {
    
    this.isFinancialOrg = isFinancialOrg;
    return this;
  }

   /**
   * 是否金融机构
   * @return isFinancialOrg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是否金融机构")

  public Boolean getIsFinancialOrg() {
    return isFinancialOrg;
  }


  public void setIsFinancialOrg(Boolean isFinancialOrg) {
    this.isFinancialOrg = isFinancialOrg;
  }


  public AuthIdentityInfo qualificationInfoList(List<IndirectQualificationInfo> qualificationInfoList) {
    
    this.qualificationInfoList = qualificationInfoList;
    return this;
  }

  public AuthIdentityInfo addQualificationInfoListItem(IndirectQualificationInfo qualificationInfoListItem) {
    if (this.qualificationInfoList == null) {
      this.qualificationInfoList = new ArrayList<>();
    }
    this.qualificationInfoList.add(qualificationInfoListItem);
    return this;
  }

   /**
   * 经营许可证列表，填写特殊行业的经营许可证信息，一个主体最多5个行业
   * @return qualificationInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "经营许可证列表，填写特殊行业的经营许可证信息，一个主体最多5个行业")

  public List<IndirectQualificationInfo> getQualificationInfoList() {
    return qualificationInfoList;
  }


  public void setQualificationInfoList(List<IndirectQualificationInfo> qualificationInfoList) {
    this.qualificationInfoList = qualificationInfoList;
  }


  public AuthIdentityInfo supportCredentials(IndirectSupportCredentials supportCredentials) {
    
    this.supportCredentials = supportCredentials;
    return this;
  }

   /**
   * Get supportCredentials
   * @return supportCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndirectSupportCredentials getSupportCredentials() {
    return supportCredentials;
  }


  public void setSupportCredentials(IndirectSupportCredentials supportCredentials) {
    this.supportCredentials = supportCredentials;
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
   * @return the AuthIdentityInfo instance itself
   */
  public AuthIdentityInfo putAdditionalProperty(String key, Object value) {
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
    AuthIdentityInfo authIdentityInfo = (AuthIdentityInfo) o;
    return Objects.equals(this.certificateInfo, authIdentityInfo.certificateInfo) &&
        Objects.equals(this.certificateType, authIdentityInfo.certificateType) &&
        Objects.equals(this.employerLetterImg, authIdentityInfo.employerLetterImg) &&
        Objects.equals(this.financialOrgInfo, authIdentityInfo.financialOrgInfo) &&
        Objects.equals(this.identityType, authIdentityInfo.identityType) &&
        Objects.equals(this.isFinancialOrg, authIdentityInfo.isFinancialOrg) &&
        Objects.equals(this.qualificationInfoList, authIdentityInfo.qualificationInfoList) &&
        Objects.equals(this.supportCredentials, authIdentityInfo.supportCredentials)&&
        Objects.equals(this.additionalProperties, authIdentityInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateInfo, certificateType, employerLetterImg, financialOrgInfo, identityType, isFinancialOrg, qualificationInfoList, supportCredentials, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthIdentityInfo {\n");
    sb.append("    certificateInfo: ").append(toIndentedString(certificateInfo)).append("\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    employerLetterImg: ").append(toIndentedString(employerLetterImg)).append("\n");
    sb.append("    financialOrgInfo: ").append(toIndentedString(financialOrgInfo)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    isFinancialOrg: ").append(toIndentedString(isFinancialOrg)).append("\n");
    sb.append("    qualificationInfoList: ").append(toIndentedString(qualificationInfoList)).append("\n");
    sb.append("    supportCredentials: ").append(toIndentedString(supportCredentials)).append("\n");
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
    openapiFields.add("certificate_info");
    openapiFields.add("certificate_type");
    openapiFields.add("employer_letter_img");
    openapiFields.add("financial_org_info");
    openapiFields.add("identity_type");
    openapiFields.add("is_financial_org");
    openapiFields.add("qualification_info_list");
    openapiFields.add("support_credentials");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthIdentityInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthIdentityInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthIdentityInfo is not found in the empty JSON string", AuthIdentityInfo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `certificate_info`
      if (jsonObj.getAsJsonObject("certificate_info") != null) {
        IndirectCertificateInfo.validateJsonObject(jsonObj.getAsJsonObject("certificate_info"));
      }
      if (jsonObj.get("certificate_type") != null && !jsonObj.get("certificate_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_type").toString()));
      }
      if (jsonObj.get("employer_letter_img") != null && !jsonObj.get("employer_letter_img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_letter_img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_letter_img").toString()));
      }
      // validate the optional field `financial_org_info`
      if (jsonObj.getAsJsonObject("financial_org_info") != null) {
        IndirectFinancialOrgInfo.validateJsonObject(jsonObj.getAsJsonObject("financial_org_info"));
      }
      if (jsonObj.get("identity_type") != null && !jsonObj.get("identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_type").toString()));
      }
      JsonArray jsonArrayqualificationInfoList = jsonObj.getAsJsonArray("qualification_info_list");
      if (jsonArrayqualificationInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("qualification_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `qualification_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("qualification_info_list").toString()));
        }

        // validate the optional field `qualification_info_list` (array)
        for (int i = 0; i < jsonArrayqualificationInfoList.size(); i++) {
          IndirectQualificationInfo.validateJsonObject(jsonArrayqualificationInfoList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `support_credentials`
      if (jsonObj.getAsJsonObject("support_credentials") != null) {
        IndirectSupportCredentials.validateJsonObject(jsonObj.getAsJsonObject("support_credentials"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthIdentityInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthIdentityInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthIdentityInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthIdentityInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthIdentityInfo>() {
           @Override
           public void write(JsonWriter out, AuthIdentityInfo value) throws IOException {
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
           public AuthIdentityInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthIdentityInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthIdentityInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthIdentityInfo
  * @throws IOException if the JSON string is invalid with respect to AuthIdentityInfo
  */
  public static AuthIdentityInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthIdentityInfo.class);
  }

 /**
  * Convert an instance of AuthIdentityInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

