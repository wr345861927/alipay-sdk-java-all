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
import com.alipay.v3.model.EmployeeDepartmentDTO;
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
 * EmployeeInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EmployeeInfoDTO {
  public static final String SERIALIZED_NAME_ACTIVATE = "activate";
  @SerializedName(SERIALIZED_NAME_ACTIVATE)
  private String activate;

  public static final String SERIALIZED_NAME_DEPARTMENT_LIST = "department_list";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_LIST)
  private List<EmployeeDepartmentDTO> departmentList = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EMPLOYEE_CERT_NO = "employee_cert_no";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_CERT_NO)
  private String employeeCertNo;

  public static final String SERIALIZED_NAME_EMPLOYEE_CERT_TYPE = "employee_cert_type";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_CERT_TYPE)
  private String employeeCertType;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

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

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_IOT_FACE_STATUS = "iot_face_status";
  @SerializedName(SERIALIZED_NAME_IOT_FACE_STATUS)
  private String iotFaceStatus;

  public static final String SERIALIZED_NAME_IOT_UNIQUE_ID = "iot_unique_id";
  @SerializedName(SERIALIZED_NAME_IOT_UNIQUE_ID)
  private String iotUniqueId;

  public static final String SERIALIZED_NAME_IOT_VID = "iot_vid";
  @SerializedName(SERIALIZED_NAME_IOT_VID)
  private String iotVid;

  public static final String SERIALIZED_NAME_JOB_LEVEL_SHOW = "job_level_show";
  @SerializedName(SERIALIZED_NAME_JOB_LEVEL_SHOW)
  private String jobLevelShow;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_PROFILES = "profiles";
  @SerializedName(SERIALIZED_NAME_PROFILES)
  private String profiles;

  public static final String SERIALIZED_NAME_ROLE_LIST = "role_list";
  @SerializedName(SERIALIZED_NAME_ROLE_LIST)
  private List<String> roleList = null;

  public static final String SERIALIZED_NAME_TL_EMPLOYEE_ID = "tl_employee_id";
  @SerializedName(SERIALIZED_NAME_TL_EMPLOYEE_ID)
  private String tlEmployeeId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public EmployeeInfoDTO() { 
  }

  public EmployeeInfoDTO activate(String activate) {
    
    this.activate = activate;
    return this;
  }

   /**
   * 是否激活
   * @return activate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVATED", value = "是否激活")

  public String getActivate() {
    return activate;
  }


  public void setActivate(String activate) {
    this.activate = activate;
  }


  public EmployeeInfoDTO departmentList(List<EmployeeDepartmentDTO> departmentList) {
    
    this.departmentList = departmentList;
    return this;
  }

  public EmployeeInfoDTO addDepartmentListItem(EmployeeDepartmentDTO departmentListItem) {
    if (this.departmentList == null) {
      this.departmentList = new ArrayList<>();
    }
    this.departmentList.add(departmentListItem);
    return this;
  }

   /**
   * 员工所属部门列表
   * @return departmentList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "员工所属部门列表")

  public List<EmployeeDepartmentDTO> getDepartmentList() {
    return departmentList;
  }


  public void setDepartmentList(List<EmployeeDepartmentDTO> departmentList) {
    this.departmentList = departmentList;
  }


  public EmployeeInfoDTO email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 员工邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456@qq.com", value = "员工邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public EmployeeInfoDTO employeeCertNo(String employeeCertNo) {
    
    this.employeeCertNo = employeeCertNo;
    return this;
  }

   /**
   * 证件号
   * @return employeeCertNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "证件号")

  public String getEmployeeCertNo() {
    return employeeCertNo;
  }


  public void setEmployeeCertNo(String employeeCertNo) {
    this.employeeCertNo = employeeCertNo;
  }


  public EmployeeInfoDTO employeeCertType(String employeeCertType) {
    
    this.employeeCertType = employeeCertType;
    return this;
  }

   /**
   * 证件类型
   * @return employeeCertType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDENTITY_CARD", value = "证件类型")

  public String getEmployeeCertType() {
    return employeeCertType;
  }


  public void setEmployeeCertType(String employeeCertType) {
    this.employeeCertType = employeeCertType;
  }


  public EmployeeInfoDTO employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 员工id
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "228420000000057942506", value = "员工id")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public EmployeeInfoDTO employeeName(String employeeName) {
    
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


  public EmployeeInfoDTO employeeNo(String employeeNo) {
    
    this.employeeNo = employeeNo;
    return this;
  }

   /**
   * 员工编号/工号
   * @return employeeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200818255", value = "员工编号/工号")

  public String getEmployeeNo() {
    return employeeNo;
  }


  public void setEmployeeNo(String employeeNo) {
    this.employeeNo = employeeNo;
  }


  public EmployeeInfoDTO encryptCertNo(String encryptCertNo) {
    
    this.encryptCertNo = encryptCertNo;
    return this;
  }

   /**
   * 加密证件号（证件号转大写后使用SHA256加密），搭配证件号使用
   * @return encryptCertNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0fc57efb28cfb5125d32e6d84823d49032d46d10df08f0e599d3844ecd3e0a1f", value = "加密证件号（证件号转大写后使用SHA256加密），搭配证件号使用")

  public String getEncryptCertNo() {
    return encryptCertNo;
  }


  public void setEncryptCertNo(String encryptCertNo) {
    this.encryptCertNo = encryptCertNo;
  }


  public EmployeeInfoDTO encryptMobile(String encryptMobile) {
    
    this.encryptMobile = encryptMobile;
    return this;
  }

   /**
   * 加密手机号（使用SHA256进行加密）
   * @return encryptMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f20a8027c95b5b3225c93e81e39ff0f496fd2868de11dbcc49d9584be80463a6", value = "加密手机号（使用SHA256进行加密）")

  public String getEncryptMobile() {
    return encryptMobile;
  }


  public void setEncryptMobile(String encryptMobile) {
    this.encryptMobile = encryptMobile;
  }


  public EmployeeInfoDTO gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Oct 19 11:47:12 CST 2024", value = "创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public EmployeeInfoDTO gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 变更时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Oct 19 11:47:12 CST 2024", value = "变更时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public EmployeeInfoDTO iotFaceStatus(String iotFaceStatus) {
    
    this.iotFaceStatus = iotFaceStatus;
    return this;
  }

   /**
   * 员工是否人脸在库
   * @return iotFaceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "员工是否人脸在库")

  public String getIotFaceStatus() {
    return iotFaceStatus;
  }


  public void setIotFaceStatus(String iotFaceStatus) {
    this.iotFaceStatus = iotFaceStatus;
  }


  public EmployeeInfoDTO iotUniqueId(String iotUniqueId) {
    
    this.iotUniqueId = iotUniqueId;
    return this;
  }

   /**
   * IOT开通刷脸支持唯一操作流水号，此处透出用于外部服务商通过该unique_id便捷调用IOT侧接口
   * @return iotUniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3444950005320032", value = "IOT开通刷脸支持唯一操作流水号，此处透出用于外部服务商通过该unique_id便捷调用IOT侧接口")

  public String getIotUniqueId() {
    return iotUniqueId;
  }


  public void setIotUniqueId(String iotUniqueId) {
    this.iotUniqueId = iotUniqueId;
  }


  public EmployeeInfoDTO iotVid(String iotVid) {
    
    this.iotVid = iotVid;
    return this;
  }

   /**
   * 员工在企业人脸库的人脸唯一标识
   * @return iotVid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2109b5e671aa3ff2eb4851816c65828f", value = "员工在企业人脸库的人脸唯一标识")

  public String getIotVid() {
    return iotVid;
  }


  public void setIotVid(String iotVid) {
    this.iotVid = iotVid;
  }


  public EmployeeInfoDTO jobLevelShow(String jobLevelShow) {
    
    this.jobLevelShow = jobLevelShow;
    return this;
  }

   /**
   * 员工职级
   * @return jobLevelShow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "S2", value = "员工职级")

  public String getJobLevelShow() {
    return jobLevelShow;
  }


  public void setJobLevelShow(String jobLevelShow) {
    this.jobLevelShow = jobLevelShow;
  }


  public EmployeeInfoDTO mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * 手机号码
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13456782345", value = "手机号码")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public EmployeeInfoDTO openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户ID（绑定支付宝账号的uid）
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "用户ID（绑定支付宝账号的uid）")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public EmployeeInfoDTO profiles(String profiles) {
    
    this.profiles = profiles;
    return this;
  }

   /**
   * 个性化信息 &lt;a href&#x3D;&#39;https://opendocs.alipay.com/pre-open/0ceh47?pathHash&#x3D;14fac87c&#39;&gt;详见文档&lt;/a&gt;
   * @return profiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"consume_remark\":\"员工账单备注内容示例\", \"inst_id\":\"CMBC\", \"card_type\":\"CC\", \"check_bind_card\":\"Y\"}", value = "个性化信息 <a href='https://opendocs.alipay.com/pre-open/0ceh47?pathHash=14fac87c'>详见文档</a>")

  public String getProfiles() {
    return profiles;
  }


  public void setProfiles(String profiles) {
    this.profiles = profiles;
  }


  public EmployeeInfoDTO roleList(List<String> roleList) {
    
    this.roleList = roleList;
    return this;
  }

  public EmployeeInfoDTO addRoleListItem(String roleListItem) {
    if (this.roleList == null) {
      this.roleList = new ArrayList<>();
    }
    this.roleList.add(roleListItem);
    return this;
  }

   /**
   * 角色列表
   * @return roleList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"ADMIN\"]", value = "角色列表")

  public List<String> getRoleList() {
    return roleList;
  }


  public void setRoleList(List<String> roleList) {
    this.roleList = roleList;
  }


  public EmployeeInfoDTO tlEmployeeId(String tlEmployeeId) {
    
    this.tlEmployeeId = tlEmployeeId;
    return this;
  }

   /**
   * 直属主管员工ID
   * @return tlEmployeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "228420000000057942506", value = "直属主管员工ID")

  public String getTlEmployeeId() {
    return tlEmployeeId;
  }


  public void setTlEmployeeId(String tlEmployeeId) {
    this.tlEmployeeId = tlEmployeeId;
  }


  public EmployeeInfoDTO userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户ID（绑定支付宝账号的uid）
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123454654356", value = "用户ID（绑定支付宝账号的uid）")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
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
   * @return the EmployeeInfoDTO instance itself
   */
  public EmployeeInfoDTO putAdditionalProperty(String key, Object value) {
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
    EmployeeInfoDTO employeeInfoDTO = (EmployeeInfoDTO) o;
    return Objects.equals(this.activate, employeeInfoDTO.activate) &&
        Objects.equals(this.departmentList, employeeInfoDTO.departmentList) &&
        Objects.equals(this.email, employeeInfoDTO.email) &&
        Objects.equals(this.employeeCertNo, employeeInfoDTO.employeeCertNo) &&
        Objects.equals(this.employeeCertType, employeeInfoDTO.employeeCertType) &&
        Objects.equals(this.employeeId, employeeInfoDTO.employeeId) &&
        Objects.equals(this.employeeName, employeeInfoDTO.employeeName) &&
        Objects.equals(this.employeeNo, employeeInfoDTO.employeeNo) &&
        Objects.equals(this.encryptCertNo, employeeInfoDTO.encryptCertNo) &&
        Objects.equals(this.encryptMobile, employeeInfoDTO.encryptMobile) &&
        Objects.equals(this.gmtCreate, employeeInfoDTO.gmtCreate) &&
        Objects.equals(this.gmtModified, employeeInfoDTO.gmtModified) &&
        Objects.equals(this.iotFaceStatus, employeeInfoDTO.iotFaceStatus) &&
        Objects.equals(this.iotUniqueId, employeeInfoDTO.iotUniqueId) &&
        Objects.equals(this.iotVid, employeeInfoDTO.iotVid) &&
        Objects.equals(this.jobLevelShow, employeeInfoDTO.jobLevelShow) &&
        Objects.equals(this.mobile, employeeInfoDTO.mobile) &&
        Objects.equals(this.openId, employeeInfoDTO.openId) &&
        Objects.equals(this.profiles, employeeInfoDTO.profiles) &&
        Objects.equals(this.roleList, employeeInfoDTO.roleList) &&
        Objects.equals(this.tlEmployeeId, employeeInfoDTO.tlEmployeeId) &&
        Objects.equals(this.userId, employeeInfoDTO.userId)&&
        Objects.equals(this.additionalProperties, employeeInfoDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activate, departmentList, email, employeeCertNo, employeeCertType, employeeId, employeeName, employeeNo, encryptCertNo, encryptMobile, gmtCreate, gmtModified, iotFaceStatus, iotUniqueId, iotVid, jobLevelShow, mobile, openId, profiles, roleList, tlEmployeeId, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeInfoDTO {\n");
    sb.append("    activate: ").append(toIndentedString(activate)).append("\n");
    sb.append("    departmentList: ").append(toIndentedString(departmentList)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    employeeCertNo: ").append(toIndentedString(employeeCertNo)).append("\n");
    sb.append("    employeeCertType: ").append(toIndentedString(employeeCertType)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    employeeNo: ").append(toIndentedString(employeeNo)).append("\n");
    sb.append("    encryptCertNo: ").append(toIndentedString(encryptCertNo)).append("\n");
    sb.append("    encryptMobile: ").append(toIndentedString(encryptMobile)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    iotFaceStatus: ").append(toIndentedString(iotFaceStatus)).append("\n");
    sb.append("    iotUniqueId: ").append(toIndentedString(iotUniqueId)).append("\n");
    sb.append("    iotVid: ").append(toIndentedString(iotVid)).append("\n");
    sb.append("    jobLevelShow: ").append(toIndentedString(jobLevelShow)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    roleList: ").append(toIndentedString(roleList)).append("\n");
    sb.append("    tlEmployeeId: ").append(toIndentedString(tlEmployeeId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("activate");
    openapiFields.add("department_list");
    openapiFields.add("email");
    openapiFields.add("employee_cert_no");
    openapiFields.add("employee_cert_type");
    openapiFields.add("employee_id");
    openapiFields.add("employee_name");
    openapiFields.add("employee_no");
    openapiFields.add("encrypt_cert_no");
    openapiFields.add("encrypt_mobile");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("iot_face_status");
    openapiFields.add("iot_unique_id");
    openapiFields.add("iot_vid");
    openapiFields.add("job_level_show");
    openapiFields.add("mobile");
    openapiFields.add("open_id");
    openapiFields.add("profiles");
    openapiFields.add("role_list");
    openapiFields.add("tl_employee_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EmployeeInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeInfoDTO is not found in the empty JSON string", EmployeeInfoDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("activate") != null && !jsonObj.get("activate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activate").toString()));
      }
      JsonArray jsonArraydepartmentList = jsonObj.getAsJsonArray("department_list");
      if (jsonArraydepartmentList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("department_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `department_list` to be an array in the JSON string but got `%s`", jsonObj.get("department_list").toString()));
        }

        // validate the optional field `department_list` (array)
        for (int i = 0; i < jsonArraydepartmentList.size(); i++) {
          EmployeeDepartmentDTO.validateJsonObject(jsonArraydepartmentList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("employee_cert_no") != null && !jsonObj.get("employee_cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_cert_no").toString()));
      }
      if (jsonObj.get("employee_cert_type") != null && !jsonObj.get("employee_cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_cert_type").toString()));
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
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
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("iot_face_status") != null && !jsonObj.get("iot_face_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iot_face_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iot_face_status").toString()));
      }
      if (jsonObj.get("iot_unique_id") != null && !jsonObj.get("iot_unique_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iot_unique_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iot_unique_id").toString()));
      }
      if (jsonObj.get("iot_vid") != null && !jsonObj.get("iot_vid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iot_vid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iot_vid").toString()));
      }
      if (jsonObj.get("job_level_show") != null && !jsonObj.get("job_level_show").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_level_show` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_level_show").toString()));
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("profiles") != null && !jsonObj.get("profiles").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profiles` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profiles").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("role_list") != null && !jsonObj.get("role_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_list` to be an array in the JSON string but got `%s`", jsonObj.get("role_list").toString()));
      }
      if (jsonObj.get("tl_employee_id") != null && !jsonObj.get("tl_employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tl_employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tl_employee_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeInfoDTO>() {
           @Override
           public void write(JsonWriter out, EmployeeInfoDTO value) throws IOException {
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
           public EmployeeInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeInfoDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeInfoDTO
  * @throws IOException if the JSON string is invalid with respect to EmployeeInfoDTO
  */
  public static EmployeeInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeInfoDTO.class);
  }

 /**
  * Convert an instance of EmployeeInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

