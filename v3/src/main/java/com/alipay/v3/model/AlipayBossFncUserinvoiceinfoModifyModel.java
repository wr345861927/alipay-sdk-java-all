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
import com.alipay.v3.model.UserMailInfoOrder;
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
 * AlipayBossFncUserinvoiceinfoModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayBossFncUserinvoiceinfoModifyModel {
  public static final String SERIALIZED_NAME_ACCEPT_ELECTRONIC = "accept_electronic";
  @SerializedName(SERIALIZED_NAME_ACCEPT_ELECTRONIC)
  private Boolean acceptElectronic;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_AUTO = "auto";
  @SerializedName(SERIALIZED_NAME_AUTO)
  private Boolean auto;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BUSINESS_LICENCE_URL = "business_licence_url";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENCE_URL)
  private String businessLicenceUrl;

  public static final String SERIALIZED_NAME_HOLD = "hold";
  @SerializedName(SERIALIZED_NAME_HOLD)
  private Boolean hold;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OPEN_ACCOUNT_PERMIT_URL = "open_account_permit_url";
  @SerializedName(SERIALIZED_NAME_OPEN_ACCOUNT_PERMIT_URL)
  private String openAccountPermitUrl;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_OPERATOR_TYPE = "operator_type";
  @SerializedName(SERIALIZED_NAME_OPERATOR_TYPE)
  private String operatorType;

  public static final String SERIALIZED_NAME_OTHER_QUALIFICATION_URL = "other_qualification_url";
  @SerializedName(SERIALIZED_NAME_OTHER_QUALIFICATION_URL)
  private String otherQualificationUrl;

  public static final String SERIALIZED_NAME_TAX_NO = "tax_no";
  @SerializedName(SERIALIZED_NAME_TAX_NO)
  private String taxNo;

  public static final String SERIALIZED_NAME_TAX_PAYER_QUALI_VALID = "tax_payer_quali_valid";
  @SerializedName(SERIALIZED_NAME_TAX_PAYER_QUALI_VALID)
  private String taxPayerQualiValid;

  public static final String SERIALIZED_NAME_TAX_PAYER_QUALIFICATION = "tax_payer_qualification";
  @SerializedName(SERIALIZED_NAME_TAX_PAYER_QUALIFICATION)
  private String taxPayerQualification;

  public static final String SERIALIZED_NAME_TAX_QUALIFICATION_URL = "tax_qualification_url";
  @SerializedName(SERIALIZED_NAME_TAX_QUALIFICATION_URL)
  private String taxQualificationUrl;

  public static final String SERIALIZED_NAME_TAX_REG_CERT_URL = "tax_reg_cert_url";
  @SerializedName(SERIALIZED_NAME_TAX_REG_CERT_URL)
  private String taxRegCertUrl;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_USER_MAIL_INFO_ORDER_LIST = "user_mail_info_order_list";
  @SerializedName(SERIALIZED_NAME_USER_MAIL_INFO_ORDER_LIST)
  private List<UserMailInfoOrder> userMailInfoOrderList = null;

  public AlipayBossFncUserinvoiceinfoModifyModel() { 
  }

  public AlipayBossFncUserinvoiceinfoModifyModel acceptElectronic(Boolean acceptElectronic) {
    
    this.acceptElectronic = acceptElectronic;
    return this;
  }

   /**
   * 是否接受电子票 true:是，false:否
   * @return acceptElectronic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否接受电子票 true:是，false:否")

  public Boolean getAcceptElectronic() {
    return acceptElectronic;
  }


  public void setAcceptElectronic(Boolean acceptElectronic) {
    this.acceptElectronic = acceptElectronic;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 公司注册地址，公司营业执照上登记的住址，一般纳税人必须填写，小规模纳税人无需填写
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "武汉市武昌区中北路7号", value = "公司注册地址，公司营业执照上登记的住址，一般纳税人必须填写，小规模纳税人无需填写")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel auto(Boolean auto) {
    
    this.auto = auto;
    return this;
  }

   /**
   * 是否自动申请开票 true:是；false:否
   * @return auto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否自动申请开票 true:是；false:否")

  public Boolean getAuto() {
    return auto;
  }


  public void setAuto(Boolean auto) {
    this.auto = auto;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel bankAccount(String bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * 银行账户，公司银行账号  一般纳税人必须填写，小规模纳税人无需填写
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3602201309100137789", value = "银行账户，公司银行账号  一般纳税人必须填写，小规模纳税人无需填写")

  public String getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * 开户行，办理银行开户手续的营业网点  一般纳税人必须填写，小规模纳税人无需填写
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "中国工商银行广州市第二支行", value = "开户行，办理银行开户手续的营业网点  一般纳税人必须填写，小规模纳税人无需填写")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel businessLicenceUrl(String businessLicenceUrl) {
    
    this.businessLicenceUrl = businessLicenceUrl;
    return this;
  }

   /**
   * 营业执照地址，营业执照上传oss上的地址
   * @return businessLicenceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gfcenter/inv/userinvoicefile/aruserprofilepic_2088421504368153_15138457060231013.jpg", value = "营业执照地址，营业执照上传oss上的地址")

  public String getBusinessLicenceUrl() {
    return businessLicenceUrl;
  }


  public void setBusinessLicenceUrl(String businessLicenceUrl) {
    this.businessLicenceUrl = businessLicenceUrl;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel hold(Boolean hold) {
    
    this.hold = hold;
    return this;
  }

   /**
   * 是否暂停开票，商户修改无效，如果要暂停开票，只能去结算中台处理。
   * @return hold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否暂停开票，商户修改无效，如果要暂停开票，只能去结算中台处理。")

  public Boolean getHold() {
    return hold;
  }


  public void setHold(Boolean hold) {
    this.hold = hold;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 开票资料ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000004", value = "开票资料ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel openAccountPermitUrl(String openAccountPermitUrl) {
    
    this.openAccountPermitUrl = openAccountPermitUrl;
    return this;
  }

   /**
   * 银行开户许可证附件，银行开户许可证上传oss上的地址
   * @return openAccountPermitUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gfcenter/inv/userinvoicefile/aruserprofilepic_2088421504368153_151384570602313.jpg", value = "银行开户许可证附件，银行开户许可证上传oss上的地址")

  public String getOpenAccountPermitUrl() {
    return openAccountPermitUrl;
  }


  public void setOpenAccountPermitUrl(String openAccountPermitUrl) {
    this.openAccountPermitUrl = openAccountPermitUrl;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 当前操作人
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123456789776", value = "当前操作人")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel operatorType(String operatorType) {
    
    this.operatorType = operatorType;
    return this;
  }

   /**
   * 当前操作人类型,01:商户；02:管理员(小二)
   * @return operatorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "当前操作人类型,01:商户；02:管理员(小二)")

  public String getOperatorType() {
    return operatorType;
  }


  public void setOperatorType(String operatorType) {
    this.operatorType = operatorType;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel otherQualificationUrl(String otherQualificationUrl) {
    
    this.otherQualificationUrl = otherQualificationUrl;
    return this;
  }

   /**
   * 其它资质证明地址，其他资质证明附件上传oss上的地址
   * @return otherQualificationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gfcenter/inv/userinvoicefile/aruserprofilepic_2088421504368153_151384570602333.jpg", value = "其它资质证明地址，其他资质证明附件上传oss上的地址")

  public String getOtherQualificationUrl() {
    return otherQualificationUrl;
  }


  public void setOtherQualificationUrl(String otherQualificationUrl) {
    this.otherQualificationUrl = otherQualificationUrl;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel taxNo(String taxNo) {
    
    this.taxNo = taxNo;
    return this;
  }

   /**
   * 纳税人识别号，税务登记证上的号码。一般纳税人必须填写，小规模纳税人如果是商户也必须填写，个人无需填写
   * @return taxNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "310113000782689", value = "纳税人识别号，税务登记证上的号码。一般纳税人必须填写，小规模纳税人如果是商户也必须填写，个人无需填写")

  public String getTaxNo() {
    return taxNo;
  }


  public void setTaxNo(String taxNo) {
    this.taxNo = taxNo;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel taxPayerQualiValid(String taxPayerQualiValid) {
    
    this.taxPayerQualiValid = taxPayerQualiValid;
    return this;
  }

   /**
   * 纳税人资格开始时间 （格式：时间戳）  一般纳税人必须填写，小规模纳税人无需填写
   * @return taxPayerQualiValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1533039333744", value = "纳税人资格开始时间 （格式：时间戳）  一般纳税人必须填写，小规模纳税人无需填写")

  public String getTaxPayerQualiValid() {
    return taxPayerQualiValid;
  }


  public void setTaxPayerQualiValid(String taxPayerQualiValid) {
    this.taxPayerQualiValid = taxPayerQualiValid;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel taxPayerQualification(String taxPayerQualification) {
    
    this.taxPayerQualification = taxPayerQualification;
    return this;
  }

   /**
   * 纳税人资格种类，01：一般纳税人；02：小规模纳税人；03：国际商户
   * @return taxPayerQualification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "纳税人资格种类，01：一般纳税人；02：小规模纳税人；03：国际商户")

  public String getTaxPayerQualification() {
    return taxPayerQualification;
  }


  public void setTaxPayerQualification(String taxPayerQualification) {
    this.taxPayerQualification = taxPayerQualification;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel taxQualificationUrl(String taxQualificationUrl) {
    
    this.taxQualificationUrl = taxQualificationUrl;
    return this;
  }

   /**
   * 一般纳税人资格证书地址，一般纳税人资格证书上传oss上的地址
   * @return taxQualificationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gfcenter/inv/userinvoicefile/aruserprofilepic_2088721075211978_15133031297372951.jpg", value = "一般纳税人资格证书地址，一般纳税人资格证书上传oss上的地址")

  public String getTaxQualificationUrl() {
    return taxQualificationUrl;
  }


  public void setTaxQualificationUrl(String taxQualificationUrl) {
    this.taxQualificationUrl = taxQualificationUrl;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel taxRegCertUrl(String taxRegCertUrl) {
    
    this.taxRegCertUrl = taxRegCertUrl;
    return this;
  }

   /**
   * 税务登记证地址，税务登记证上传oss上的地址
   * @return taxRegCertUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gfcenter/inv/userinvoicefile/aruserprofilepic_2088421504368153_15138457060231013.jpg", value = "税务登记证地址，税务登记证上传oss上的地址")

  public String getTaxRegCertUrl() {
    return taxRegCertUrl;
  }


  public void setTaxRegCertUrl(String taxRegCertUrl) {
    this.taxRegCertUrl = taxRegCertUrl;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * 公司注册电话  一般纳税人必须填写，小规模纳税人无需填写
   * @return telephone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "021-56518888", value = "公司注册电话  一般纳税人必须填写，小规模纳税人无需填写")

  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 发票抬头，票面信息上的抬头信息
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "上海大众汽车有限公司", value = "发票抬头，票面信息上的抬头信息")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AlipayBossFncUserinvoiceinfoModifyModel userMailInfoOrderList(List<UserMailInfoOrder> userMailInfoOrderList) {
    
    this.userMailInfoOrderList = userMailInfoOrderList;
    return this;
  }

  public AlipayBossFncUserinvoiceinfoModifyModel addUserMailInfoOrderListItem(UserMailInfoOrder userMailInfoOrderListItem) {
    if (this.userMailInfoOrderList == null) {
      this.userMailInfoOrderList = new ArrayList<>();
    }
    this.userMailInfoOrderList.add(userMailInfoOrderListItem);
    return this;
  }

   /**
   * 收件人列表,若不修改此项可以不填  选择非电子票时，邮寄信息必填，且保证邮寄信息的ipRoleId和开票资料的ipRoleId相等
   * @return userMailInfoOrderList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "收件人列表,若不修改此项可以不填  选择非电子票时，邮寄信息必填，且保证邮寄信息的ipRoleId和开票资料的ipRoleId相等")

  public List<UserMailInfoOrder> getUserMailInfoOrderList() {
    return userMailInfoOrderList;
  }


  public void setUserMailInfoOrderList(List<UserMailInfoOrder> userMailInfoOrderList) {
    this.userMailInfoOrderList = userMailInfoOrderList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayBossFncUserinvoiceinfoModifyModel alipayBossFncUserinvoiceinfoModifyModel = (AlipayBossFncUserinvoiceinfoModifyModel) o;
    return Objects.equals(this.acceptElectronic, alipayBossFncUserinvoiceinfoModifyModel.acceptElectronic) &&
        Objects.equals(this.address, alipayBossFncUserinvoiceinfoModifyModel.address) &&
        Objects.equals(this.auto, alipayBossFncUserinvoiceinfoModifyModel.auto) &&
        Objects.equals(this.bankAccount, alipayBossFncUserinvoiceinfoModifyModel.bankAccount) &&
        Objects.equals(this.bankName, alipayBossFncUserinvoiceinfoModifyModel.bankName) &&
        Objects.equals(this.businessLicenceUrl, alipayBossFncUserinvoiceinfoModifyModel.businessLicenceUrl) &&
        Objects.equals(this.hold, alipayBossFncUserinvoiceinfoModifyModel.hold) &&
        Objects.equals(this.id, alipayBossFncUserinvoiceinfoModifyModel.id) &&
        Objects.equals(this.openAccountPermitUrl, alipayBossFncUserinvoiceinfoModifyModel.openAccountPermitUrl) &&
        Objects.equals(this.operator, alipayBossFncUserinvoiceinfoModifyModel.operator) &&
        Objects.equals(this.operatorType, alipayBossFncUserinvoiceinfoModifyModel.operatorType) &&
        Objects.equals(this.otherQualificationUrl, alipayBossFncUserinvoiceinfoModifyModel.otherQualificationUrl) &&
        Objects.equals(this.taxNo, alipayBossFncUserinvoiceinfoModifyModel.taxNo) &&
        Objects.equals(this.taxPayerQualiValid, alipayBossFncUserinvoiceinfoModifyModel.taxPayerQualiValid) &&
        Objects.equals(this.taxPayerQualification, alipayBossFncUserinvoiceinfoModifyModel.taxPayerQualification) &&
        Objects.equals(this.taxQualificationUrl, alipayBossFncUserinvoiceinfoModifyModel.taxQualificationUrl) &&
        Objects.equals(this.taxRegCertUrl, alipayBossFncUserinvoiceinfoModifyModel.taxRegCertUrl) &&
        Objects.equals(this.telephone, alipayBossFncUserinvoiceinfoModifyModel.telephone) &&
        Objects.equals(this.title, alipayBossFncUserinvoiceinfoModifyModel.title) &&
        Objects.equals(this.userMailInfoOrderList, alipayBossFncUserinvoiceinfoModifyModel.userMailInfoOrderList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptElectronic, address, auto, bankAccount, bankName, businessLicenceUrl, hold, id, openAccountPermitUrl, operator, operatorType, otherQualificationUrl, taxNo, taxPayerQualiValid, taxPayerQualification, taxQualificationUrl, taxRegCertUrl, telephone, title, userMailInfoOrderList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayBossFncUserinvoiceinfoModifyModel {\n");
    sb.append("    acceptElectronic: ").append(toIndentedString(acceptElectronic)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    businessLicenceUrl: ").append(toIndentedString(businessLicenceUrl)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    openAccountPermitUrl: ").append(toIndentedString(openAccountPermitUrl)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    operatorType: ").append(toIndentedString(operatorType)).append("\n");
    sb.append("    otherQualificationUrl: ").append(toIndentedString(otherQualificationUrl)).append("\n");
    sb.append("    taxNo: ").append(toIndentedString(taxNo)).append("\n");
    sb.append("    taxPayerQualiValid: ").append(toIndentedString(taxPayerQualiValid)).append("\n");
    sb.append("    taxPayerQualification: ").append(toIndentedString(taxPayerQualification)).append("\n");
    sb.append("    taxQualificationUrl: ").append(toIndentedString(taxQualificationUrl)).append("\n");
    sb.append("    taxRegCertUrl: ").append(toIndentedString(taxRegCertUrl)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userMailInfoOrderList: ").append(toIndentedString(userMailInfoOrderList)).append("\n");
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
    openapiFields.add("accept_electronic");
    openapiFields.add("address");
    openapiFields.add("auto");
    openapiFields.add("bank_account");
    openapiFields.add("bank_name");
    openapiFields.add("business_licence_url");
    openapiFields.add("hold");
    openapiFields.add("id");
    openapiFields.add("open_account_permit_url");
    openapiFields.add("operator");
    openapiFields.add("operator_type");
    openapiFields.add("other_qualification_url");
    openapiFields.add("tax_no");
    openapiFields.add("tax_payer_quali_valid");
    openapiFields.add("tax_payer_qualification");
    openapiFields.add("tax_qualification_url");
    openapiFields.add("tax_reg_cert_url");
    openapiFields.add("telephone");
    openapiFields.add("title");
    openapiFields.add("user_mail_info_order_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayBossFncUserinvoiceinfoModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayBossFncUserinvoiceinfoModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayBossFncUserinvoiceinfoModifyModel is not found in the empty JSON string", AlipayBossFncUserinvoiceinfoModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayBossFncUserinvoiceinfoModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayBossFncUserinvoiceinfoModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("bank_account") != null && !jsonObj.get("bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account").toString()));
      }
      if (jsonObj.get("bank_name") != null && !jsonObj.get("bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_name").toString()));
      }
      if (jsonObj.get("business_licence_url") != null && !jsonObj.get("business_licence_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_licence_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_licence_url").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("open_account_permit_url") != null && !jsonObj.get("open_account_permit_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_account_permit_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_account_permit_url").toString()));
      }
      if (jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      if (jsonObj.get("operator_type") != null && !jsonObj.get("operator_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator_type").toString()));
      }
      if (jsonObj.get("other_qualification_url") != null && !jsonObj.get("other_qualification_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_qualification_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_qualification_url").toString()));
      }
      if (jsonObj.get("tax_no") != null && !jsonObj.get("tax_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_no").toString()));
      }
      if (jsonObj.get("tax_payer_quali_valid") != null && !jsonObj.get("tax_payer_quali_valid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_payer_quali_valid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_payer_quali_valid").toString()));
      }
      if (jsonObj.get("tax_payer_qualification") != null && !jsonObj.get("tax_payer_qualification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_payer_qualification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_payer_qualification").toString()));
      }
      if (jsonObj.get("tax_qualification_url") != null && !jsonObj.get("tax_qualification_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_qualification_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_qualification_url").toString()));
      }
      if (jsonObj.get("tax_reg_cert_url") != null && !jsonObj.get("tax_reg_cert_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_reg_cert_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_reg_cert_url").toString()));
      }
      if (jsonObj.get("telephone") != null && !jsonObj.get("telephone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephone").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      JsonArray jsonArrayuserMailInfoOrderList = jsonObj.getAsJsonArray("user_mail_info_order_list");
      if (jsonArrayuserMailInfoOrderList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("user_mail_info_order_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `user_mail_info_order_list` to be an array in the JSON string but got `%s`", jsonObj.get("user_mail_info_order_list").toString()));
        }

        // validate the optional field `user_mail_info_order_list` (array)
        for (int i = 0; i < jsonArrayuserMailInfoOrderList.size(); i++) {
          UserMailInfoOrder.validateJsonObject(jsonArrayuserMailInfoOrderList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayBossFncUserinvoiceinfoModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayBossFncUserinvoiceinfoModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayBossFncUserinvoiceinfoModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayBossFncUserinvoiceinfoModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayBossFncUserinvoiceinfoModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayBossFncUserinvoiceinfoModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayBossFncUserinvoiceinfoModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayBossFncUserinvoiceinfoModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayBossFncUserinvoiceinfoModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayBossFncUserinvoiceinfoModifyModel
  */
  public static AlipayBossFncUserinvoiceinfoModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayBossFncUserinvoiceinfoModifyModel.class);
  }

 /**
  * Convert an instance of AlipayBossFncUserinvoiceinfoModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

