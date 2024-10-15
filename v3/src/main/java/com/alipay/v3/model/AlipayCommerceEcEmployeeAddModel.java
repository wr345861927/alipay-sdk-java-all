/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
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
 * AlipayCommerceEcEmployeeAddModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcEmployeeAddModel {
  public static final String SERIALIZED_NAME_CREATE_SHARE_CODE = "create_share_code";
  @SerializedName(SERIALIZED_NAME_CREATE_SHARE_CODE)
  private Boolean createShareCode;

  public static final String SERIALIZED_NAME_DEPARTMENT_IDS = "department_ids";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_IDS)
  private List<String> departmentIds = null;

  public static final String SERIALIZED_NAME_EMPLOYEE_CERT_NO = "employee_cert_no";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_CERT_NO)
  private String employeeCertNo;

  public static final String SERIALIZED_NAME_EMPLOYEE_CERT_TYPE = "employee_cert_type";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_CERT_TYPE)
  private String employeeCertType;

  public static final String SERIALIZED_NAME_EMPLOYEE_EMAIL = "employee_email";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_EMAIL)
  private String employeeEmail;

  public static final String SERIALIZED_NAME_EMPLOYEE_MOBILE = "employee_mobile";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_MOBILE)
  private String employeeMobile;

  public static final String SERIALIZED_NAME_EMPLOYEE_NAME = "employee_name";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NAME)
  private String employeeName;

  public static final String SERIALIZED_NAME_EMPLOYEE_NO = "employee_no";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NO)
  private String employeeNo;

  public static final String SERIALIZED_NAME_ENCRYPT_CERT_NO = "encrypt_cert_no";
  @SerializedName(SERIALIZED_NAME_ENCRYPT_CERT_NO)
  private String encryptCertNo;

  public static final String SERIALIZED_NAME_ENCRYPT_MOBILE = "encrypt_mobile";
  @SerializedName(SERIALIZED_NAME_ENCRYPT_MOBILE)
  private String encryptMobile;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_FREE_SIGN_TOKEN = "free_sign_token";
  @SerializedName(SERIALIZED_NAME_FREE_SIGN_TOKEN)
  private String freeSignToken;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_IDENTITY_OPEN_ID = "identity_open_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_OPEN_ID)
  private String identityOpenId;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_IOT_CHECK_TYPE = "iot_check_type";
  @SerializedName(SERIALIZED_NAME_IOT_CHECK_TYPE)
  private String iotCheckType;

  public static final String SERIALIZED_NAME_IOT_VID = "iot_vid";
  @SerializedName(SERIALIZED_NAME_IOT_VID)
  private String iotVid;

  public static final String SERIALIZED_NAME_PROFILES = "profiles";
  @SerializedName(SERIALIZED_NAME_PROFILES)
  private String profiles;

  public static final String SERIALIZED_NAME_ROLE_LIST = "role_list";
  @SerializedName(SERIALIZED_NAME_ROLE_LIST)
  private List<String> roleList = null;

  public static final String SERIALIZED_NAME_SIGN_RETURN_URL = "sign_return_url";
  @SerializedName(SERIALIZED_NAME_SIGN_RETURN_URL)
  private String signReturnUrl;

  public static final String SERIALIZED_NAME_SIGN_URL_CARRY_INFO = "sign_url_carry_info";
  @SerializedName(SERIALIZED_NAME_SIGN_URL_CARRY_INFO)
  private Boolean signUrlCarryInfo;

  public static final String SERIALIZED_NAME_WITHHOLDING_SIGN_STR = "withholding_sign_str";
  @SerializedName(SERIALIZED_NAME_WITHHOLDING_SIGN_STR)
  private String withholdingSignStr;

  public AlipayCommerceEcEmployeeAddModel() { 
  }

  public AlipayCommerceEcEmployeeAddModel createShareCode(Boolean createShareCode) {
    
    this.createShareCode = createShareCode;
    return this;
  }

   /**
   * 是否需要生成吱口令，默认不生成
   * @return createShareCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否需要生成吱口令，默认不生成")

  public Boolean getCreateShareCode() {
    return createShareCode;
  }


  public void setCreateShareCode(Boolean createShareCode) {
    this.createShareCode = createShareCode;
  }


  public AlipayCommerceEcEmployeeAddModel departmentIds(List<String> departmentIds) {
    
    this.departmentIds = departmentIds;
    return this;
  }

  public AlipayCommerceEcEmployeeAddModel addDepartmentIdsItem(String departmentIdsItem) {
    if (this.departmentIds == null) {
      this.departmentIds = new ArrayList<>();
    }
    this.departmentIds.add(departmentIdsItem);
    return this;
  }

   /**
   * 员工所属部门，支持多个部门，不传默认为根部门
   * @return departmentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"1001069000162569\"]", value = "员工所属部门，支持多个部门，不传默认为根部门")

  public List<String> getDepartmentIds() {
    return departmentIds;
  }


  public void setDepartmentIds(List<String> departmentIds) {
    this.departmentIds = departmentIds;
  }


  public AlipayCommerceEcEmployeeAddModel employeeCertNo(String employeeCertNo) {
    
    this.employeeCertNo = employeeCertNo;
    return this;
  }

   /**
   * 员工证件号码
   * @return employeeCertNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "260101202310011234", value = "员工证件号码")

  public String getEmployeeCertNo() {
    return employeeCertNo;
  }


  public void setEmployeeCertNo(String employeeCertNo) {
    this.employeeCertNo = employeeCertNo;
  }


  public AlipayCommerceEcEmployeeAddModel employeeCertType(String employeeCertType) {
    
    this.employeeCertType = employeeCertType;
    return this;
  }

   /**
   * 员工证件类型
   * @return employeeCertType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDENTITY_CARD", value = "员工证件类型")

  public String getEmployeeCertType() {
    return employeeCertType;
  }


  public void setEmployeeCertType(String employeeCertType) {
    this.employeeCertType = employeeCertType;
  }


  public AlipayCommerceEcEmployeeAddModel employeeEmail(String employeeEmail) {
    
    this.employeeEmail = employeeEmail;
    return this;
  }

   /**
   * 员工邮箱
   * @return employeeEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test123@email.com", value = "员工邮箱")

  public String getEmployeeEmail() {
    return employeeEmail;
  }


  public void setEmployeeEmail(String employeeEmail) {
    this.employeeEmail = employeeEmail;
  }


  public AlipayCommerceEcEmployeeAddModel employeeMobile(String employeeMobile) {
    
    this.employeeMobile = employeeMobile;
    return this;
  }

   /**
   * 员工手机号
   * @return employeeMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13388888888", value = "员工手机号")

  public String getEmployeeMobile() {
    return employeeMobile;
  }


  public void setEmployeeMobile(String employeeMobile) {
    this.employeeMobile = employeeMobile;
  }


  public AlipayCommerceEcEmployeeAddModel employeeName(String employeeName) {
    
    this.employeeName = employeeName;
    return this;
  }

   /**
   * 员工姓名
   * @return employeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "员工姓名")

  public String getEmployeeName() {
    return employeeName;
  }


  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }


  public AlipayCommerceEcEmployeeAddModel employeeNo(String employeeNo) {
    
    this.employeeNo = employeeNo;
    return this;
  }

   /**
   * 员工编号/工号
   * @return employeeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "D28339", value = "员工编号/工号")

  public String getEmployeeNo() {
    return employeeNo;
  }


  public void setEmployeeNo(String employeeNo) {
    this.employeeNo = employeeNo;
  }


  public AlipayCommerceEcEmployeeAddModel encryptCertNo(String encryptCertNo) {
    
    this.encryptCertNo = encryptCertNo;
    return this;
  }

   /**
   * 加密证件号，需与证件类型搭配使用，可替代证件号码(employee_cert_no)字段
   * @return encryptCertNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B0160ABEE2099421C8B30EF3D9ED4E13C6C5708D6BB71441C7858B0C3AF89274", value = "加密证件号，需与证件类型搭配使用，可替代证件号码(employee_cert_no)字段")

  public String getEncryptCertNo() {
    return encryptCertNo;
  }


  public void setEncryptCertNo(String encryptCertNo) {
    this.encryptCertNo = encryptCertNo;
  }


  public AlipayCommerceEcEmployeeAddModel encryptMobile(String encryptMobile) {
    
    this.encryptMobile = encryptMobile;
    return this;
  }

   /**
   * 加密手机号，可替代手机号(employee_mobile)字段
   * @return encryptMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B0160ABEE2099421C8B30EF3D9ED4E13C6C5708D6BB71441C7858B0C3AF89274", value = "加密手机号，可替代手机号(employee_mobile)字段")

  public String getEncryptMobile() {
    return encryptMobile;
  }


  public void setEncryptMobile(String encryptMobile) {
    this.encryptMobile = encryptMobile;
  }


  public AlipayCommerceEcEmployeeAddModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 员工所属企业ID
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20887448493929", value = "员工所属企业ID")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayCommerceEcEmployeeAddModel freeSignToken(String freeSignToken) {
    
    this.freeSignToken = freeSignToken;
    return this;
  }

   /**
   * 员工免签约授权密钥；&lt;br/&gt; 该密钥需联系企业码业务小二申请，当传入密钥有效，则员工添加时会默认签约企业因公付，并激活员工。
   * @return freeSignToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "66WertX2ZyMqHDqEmnfe8I00xxu1AK30qIRx12mr9uhJB6oVuyjZcb32QBLWBU+2", value = "员工免签约授权密钥；<br/> 该密钥需联系企业码业务小二申请，当传入密钥有效，则员工添加时会默认签约企业因公付，并激活员工。")

  public String getFreeSignToken() {
    return freeSignToken;
  }


  public void setFreeSignToken(String freeSignToken) {
    this.freeSignToken = freeSignToken;
  }


  public AlipayCommerceEcEmployeeAddModel identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * 员工身份唯一标识
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20889939994000", value = "员工身份唯一标识")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public AlipayCommerceEcEmployeeAddModel identityOpenId(String identityOpenId) {
    
    this.identityOpenId = identityOpenId;
    return this;
  }

   /**
   * 当身份类型为支付宝会员ID(identity_type&#x3D;ALIPAY_USER_ID)时，传入user_id对应的open_id
   * @return identityOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "当身份类型为支付宝会员ID(identity_type=ALIPAY_USER_ID)时，传入user_id对应的open_id")

  public String getIdentityOpenId() {
    return identityOpenId;
  }


  public void setIdentityOpenId(String identityOpenId) {
    this.identityOpenId = identityOpenId;
  }


  public AlipayCommerceEcEmployeeAddModel identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * 员工身份类型
   * @return identityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALIPAY_USER_ID", value = "员工身份类型")

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public AlipayCommerceEcEmployeeAddModel iotCheckType(String iotCheckType) {
    
    this.iotCheckType = iotCheckType;
    return this;
  }

   /**
   * 员工签约开通企业刷脸付时，刷脸核身的核验方式
   * @return iotCheckType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "facepay_epc_agree_check_nores", value = "员工签约开通企业刷脸付时，刷脸核身的核验方式")

  public String getIotCheckType() {
    return iotCheckType;
  }


  public void setIotCheckType(String iotCheckType) {
    this.iotCheckType = iotCheckType;
  }


  public AlipayCommerceEcEmployeeAddModel iotVid(String iotVid) {
    
    this.iotVid = iotVid;
    return this;
  }

   /**
   * 员工在企业人脸库的人脸唯一标识（该字段已作废，不支持自定义传入）(iot不支持自定义传入)
   * @return iotVid
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2109b5e671aa3ff2eb4851816c65828f", value = "员工在企业人脸库的人脸唯一标识（该字段已作废，不支持自定义传入）(iot不支持自定义传入)")

  public String getIotVid() {
    return iotVid;
  }


  public void setIotVid(String iotVid) {
    this.iotVid = iotVid;
  }


  public AlipayCommerceEcEmployeeAddModel profiles(String profiles) {
    
    this.profiles = profiles;
    return this;
  }

   /**
   * 个性化信息 &lt;a href&#x3D;&#39;https://opendocs.alipay.com/pre-open/0ceh47?pathHash&#x3D;14fac87c&#39;&gt;详见文档&lt;/a&gt;
   * @return profiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"consume_remark\":\"员工账单备注内容示例\", \"inst_id\":\"CMBC\", \"card_type\":\"DC\", \"check_bind_card\":\"Y\"}", value = "个性化信息 <a href='https://opendocs.alipay.com/pre-open/0ceh47?pathHash=14fac87c'>详见文档</a>")

  public String getProfiles() {
    return profiles;
  }


  public void setProfiles(String profiles) {
    this.profiles = profiles;
  }


  public AlipayCommerceEcEmployeeAddModel roleList(List<String> roleList) {
    
    this.roleList = roleList;
    return this;
  }

  public AlipayCommerceEcEmployeeAddModel addRoleListItem(String roleListItem) {
    if (this.roleList == null) {
      this.roleList = new ArrayList<>();
    }
    this.roleList.add(roleListItem);
    return this;
  }

   /**
   * 默认角色列表，目前只支持默认为 USER(目前仅支持普通员工，作为默认值，无需调用方传入)
   * @return roleList
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"USER\"]", value = "默认角色列表，目前只支持默认为 USER(目前仅支持普通员工，作为默认值，无需调用方传入)")

  public List<String> getRoleList() {
    return roleList;
  }


  public void setRoleList(List<String> roleList) {
    this.roleList = roleList;
  }


  public AlipayCommerceEcEmployeeAddModel signReturnUrl(String signReturnUrl) {
    
    this.signReturnUrl = signReturnUrl;
    return this;
  }

   /**
   * 员工签约后回跳地址；支持 alipay scheme 协议地址，不传默认跳转企业码小程序首页
   * @return signReturnUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId=xxx&page=xxx", value = "员工签约后回跳地址；支持 alipay scheme 协议地址，不传默认跳转企业码小程序首页")

  public String getSignReturnUrl() {
    return signReturnUrl;
  }


  public void setSignReturnUrl(String signReturnUrl) {
    this.signReturnUrl = signReturnUrl;
  }


  public AlipayCommerceEcEmployeeAddModel signUrlCarryInfo(Boolean signUrlCarryInfo) {
    
    this.signUrlCarryInfo = signUrlCarryInfo;
    return this;
  }

   /**
   * 签约链接页面是否需要自动回显员工的身份信息（手机或邮箱），默认不显示
   * @return signUrlCarryInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "签约链接页面是否需要自动回显员工的身份信息（手机或邮箱），默认不显示")

  public Boolean getSignUrlCarryInfo() {
    return signUrlCarryInfo;
  }


  public void setSignUrlCarryInfo(Boolean signUrlCarryInfo) {
    this.signUrlCarryInfo = signUrlCarryInfo;
  }


  public AlipayCommerceEcEmployeeAddModel withholdingSignStr(String withholdingSignStr) {
    
    this.withholdingSignStr = withholdingSignStr;
    return this;
  }

   /**
   * 代扣签约字符串，员工需签约开通代扣时必传，否则无需传值
   * @return withholdingSignStr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "app_id%3D2015052600090779%26biz_content%3D%257B%2522access_params%2522%253A%257B%2522channel%2522%253A%2522ALIPAYAPP%2522%257D%252C%2522external_agreement_no%2522%253A%25222019_06_0910%2522%252C%2522personal_product_code%2522%253A%2522...", value = "代扣签约字符串，员工需签约开通代扣时必传，否则无需传值")

  public String getWithholdingSignStr() {
    return withholdingSignStr;
  }


  public void setWithholdingSignStr(String withholdingSignStr) {
    this.withholdingSignStr = withholdingSignStr;
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
   * @return the AlipayCommerceEcEmployeeAddModel instance itself
   */
  public AlipayCommerceEcEmployeeAddModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceEcEmployeeAddModel alipayCommerceEcEmployeeAddModel = (AlipayCommerceEcEmployeeAddModel) o;
    return Objects.equals(this.createShareCode, alipayCommerceEcEmployeeAddModel.createShareCode) &&
        Objects.equals(this.departmentIds, alipayCommerceEcEmployeeAddModel.departmentIds) &&
        Objects.equals(this.employeeCertNo, alipayCommerceEcEmployeeAddModel.employeeCertNo) &&
        Objects.equals(this.employeeCertType, alipayCommerceEcEmployeeAddModel.employeeCertType) &&
        Objects.equals(this.employeeEmail, alipayCommerceEcEmployeeAddModel.employeeEmail) &&
        Objects.equals(this.employeeMobile, alipayCommerceEcEmployeeAddModel.employeeMobile) &&
        Objects.equals(this.employeeName, alipayCommerceEcEmployeeAddModel.employeeName) &&
        Objects.equals(this.employeeNo, alipayCommerceEcEmployeeAddModel.employeeNo) &&
        Objects.equals(this.encryptCertNo, alipayCommerceEcEmployeeAddModel.encryptCertNo) &&
        Objects.equals(this.encryptMobile, alipayCommerceEcEmployeeAddModel.encryptMobile) &&
        Objects.equals(this.enterpriseId, alipayCommerceEcEmployeeAddModel.enterpriseId) &&
        Objects.equals(this.freeSignToken, alipayCommerceEcEmployeeAddModel.freeSignToken) &&
        Objects.equals(this.identity, alipayCommerceEcEmployeeAddModel.identity) &&
        Objects.equals(this.identityOpenId, alipayCommerceEcEmployeeAddModel.identityOpenId) &&
        Objects.equals(this.identityType, alipayCommerceEcEmployeeAddModel.identityType) &&
        Objects.equals(this.iotCheckType, alipayCommerceEcEmployeeAddModel.iotCheckType) &&
        Objects.equals(this.iotVid, alipayCommerceEcEmployeeAddModel.iotVid) &&
        Objects.equals(this.profiles, alipayCommerceEcEmployeeAddModel.profiles) &&
        Objects.equals(this.roleList, alipayCommerceEcEmployeeAddModel.roleList) &&
        Objects.equals(this.signReturnUrl, alipayCommerceEcEmployeeAddModel.signReturnUrl) &&
        Objects.equals(this.signUrlCarryInfo, alipayCommerceEcEmployeeAddModel.signUrlCarryInfo) &&
        Objects.equals(this.withholdingSignStr, alipayCommerceEcEmployeeAddModel.withholdingSignStr)&&
        Objects.equals(this.additionalProperties, alipayCommerceEcEmployeeAddModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createShareCode, departmentIds, employeeCertNo, employeeCertType, employeeEmail, employeeMobile, employeeName, employeeNo, encryptCertNo, encryptMobile, enterpriseId, freeSignToken, identity, identityOpenId, identityType, iotCheckType, iotVid, profiles, roleList, signReturnUrl, signUrlCarryInfo, withholdingSignStr, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcEmployeeAddModel {\n");
    sb.append("    createShareCode: ").append(toIndentedString(createShareCode)).append("\n");
    sb.append("    departmentIds: ").append(toIndentedString(departmentIds)).append("\n");
    sb.append("    employeeCertNo: ").append(toIndentedString(employeeCertNo)).append("\n");
    sb.append("    employeeCertType: ").append(toIndentedString(employeeCertType)).append("\n");
    sb.append("    employeeEmail: ").append(toIndentedString(employeeEmail)).append("\n");
    sb.append("    employeeMobile: ").append(toIndentedString(employeeMobile)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    employeeNo: ").append(toIndentedString(employeeNo)).append("\n");
    sb.append("    encryptCertNo: ").append(toIndentedString(encryptCertNo)).append("\n");
    sb.append("    encryptMobile: ").append(toIndentedString(encryptMobile)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    freeSignToken: ").append(toIndentedString(freeSignToken)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    identityOpenId: ").append(toIndentedString(identityOpenId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    iotCheckType: ").append(toIndentedString(iotCheckType)).append("\n");
    sb.append("    iotVid: ").append(toIndentedString(iotVid)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    roleList: ").append(toIndentedString(roleList)).append("\n");
    sb.append("    signReturnUrl: ").append(toIndentedString(signReturnUrl)).append("\n");
    sb.append("    signUrlCarryInfo: ").append(toIndentedString(signUrlCarryInfo)).append("\n");
    sb.append("    withholdingSignStr: ").append(toIndentedString(withholdingSignStr)).append("\n");
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
    openapiFields.add("create_share_code");
    openapiFields.add("department_ids");
    openapiFields.add("employee_cert_no");
    openapiFields.add("employee_cert_type");
    openapiFields.add("employee_email");
    openapiFields.add("employee_mobile");
    openapiFields.add("employee_name");
    openapiFields.add("employee_no");
    openapiFields.add("encrypt_cert_no");
    openapiFields.add("encrypt_mobile");
    openapiFields.add("enterprise_id");
    openapiFields.add("free_sign_token");
    openapiFields.add("identity");
    openapiFields.add("identity_open_id");
    openapiFields.add("identity_type");
    openapiFields.add("iot_check_type");
    openapiFields.add("iot_vid");
    openapiFields.add("profiles");
    openapiFields.add("role_list");
    openapiFields.add("sign_return_url");
    openapiFields.add("sign_url_carry_info");
    openapiFields.add("withholding_sign_str");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcEmployeeAddModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcEmployeeAddModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcEmployeeAddModel is not found in the empty JSON string", AlipayCommerceEcEmployeeAddModel.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("department_ids") != null && !jsonObj.get("department_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `department_ids` to be an array in the JSON string but got `%s`", jsonObj.get("department_ids").toString()));
      }
      if (jsonObj.get("employee_cert_no") != null && !jsonObj.get("employee_cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_cert_no").toString()));
      }
      if (jsonObj.get("employee_cert_type") != null && !jsonObj.get("employee_cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_cert_type").toString()));
      }
      if (jsonObj.get("employee_email") != null && !jsonObj.get("employee_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_email").toString()));
      }
      if (jsonObj.get("employee_mobile") != null && !jsonObj.get("employee_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_mobile").toString()));
      }
      if (jsonObj.get("employee_name") != null && !jsonObj.get("employee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_name").toString()));
      }
      if (jsonObj.get("employee_no") != null && !jsonObj.get("employee_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_no").toString()));
      }
      if (jsonObj.get("encrypt_cert_no") != null && !jsonObj.get("encrypt_cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encrypt_cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encrypt_cert_no").toString()));
      }
      if (jsonObj.get("encrypt_mobile") != null && !jsonObj.get("encrypt_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encrypt_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encrypt_mobile").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("free_sign_token") != null && !jsonObj.get("free_sign_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `free_sign_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("free_sign_token").toString()));
      }
      if (jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if (jsonObj.get("identity_open_id") != null && !jsonObj.get("identity_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_open_id").toString()));
      }
      if (jsonObj.get("identity_type") != null && !jsonObj.get("identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_type").toString()));
      }
      if (jsonObj.get("iot_check_type") != null && !jsonObj.get("iot_check_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iot_check_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iot_check_type").toString()));
      }
      if (jsonObj.get("iot_vid") != null && !jsonObj.get("iot_vid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iot_vid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iot_vid").toString()));
      }
      if (jsonObj.get("profiles") != null && !jsonObj.get("profiles").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profiles` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profiles").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("role_list") != null && !jsonObj.get("role_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_list` to be an array in the JSON string but got `%s`", jsonObj.get("role_list").toString()));
      }
      if (jsonObj.get("sign_return_url") != null && !jsonObj.get("sign_return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_return_url").toString()));
      }
      if (jsonObj.get("withholding_sign_str") != null && !jsonObj.get("withholding_sign_str").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withholding_sign_str` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withholding_sign_str").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcEmployeeAddModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcEmployeeAddModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcEmployeeAddModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcEmployeeAddModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcEmployeeAddModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcEmployeeAddModel value) throws IOException {
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
           public AlipayCommerceEcEmployeeAddModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceEcEmployeeAddModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceEcEmployeeAddModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcEmployeeAddModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcEmployeeAddModel
  */
  public static AlipayCommerceEcEmployeeAddModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcEmployeeAddModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcEmployeeAddModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

