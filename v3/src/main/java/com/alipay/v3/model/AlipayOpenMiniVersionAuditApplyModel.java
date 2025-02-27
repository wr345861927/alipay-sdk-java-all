/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.RegionInfo;
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
 * AlipayOpenMiniVersionAuditApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniVersionAuditApplyModel {
  public static final String SERIALIZED_NAME_APP_CATEGORY_IDS = "app_category_ids";
  @SerializedName(SERIALIZED_NAME_APP_CATEGORY_IDS)
  private String appCategoryIds;

  public static final String SERIALIZED_NAME_APP_DESC = "app_desc";
  @SerializedName(SERIALIZED_NAME_APP_DESC)
  private String appDesc;

  public static final String SERIALIZED_NAME_APP_ENGLISH_NAME = "app_english_name";
  @SerializedName(SERIALIZED_NAME_APP_ENGLISH_NAME)
  private String appEnglishName;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_SLOGAN = "app_slogan";
  @SerializedName(SERIALIZED_NAME_APP_SLOGAN)
  private String appSlogan;

  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_AUDIT_RULE = "audit_rule";
  @SerializedName(SERIALIZED_NAME_AUDIT_RULE)
  private String auditRule;

  public static final String SERIALIZED_NAME_AUTO_ONLINE = "auto_online";
  @SerializedName(SERIALIZED_NAME_AUTO_ONLINE)
  private String autoOnline;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_LICENSE_NAME = "license_name";
  @SerializedName(SERIALIZED_NAME_LICENSE_NAME)
  private String licenseName;

  public static final String SERIALIZED_NAME_LICENSE_NO = "license_no";
  @SerializedName(SERIALIZED_NAME_LICENSE_NO)
  private String licenseNo;

  public static final String SERIALIZED_NAME_LICENSE_VALID_DATE = "license_valid_date";
  @SerializedName(SERIALIZED_NAME_LICENSE_VALID_DATE)
  private String licenseValidDate;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_MINI_CATEGORY_IDS = "mini_category_ids";
  @SerializedName(SERIALIZED_NAME_MINI_CATEGORY_IDS)
  private String miniCategoryIds;

  public static final String SERIALIZED_NAME_REGION_TYPE = "region_type";
  @SerializedName(SERIALIZED_NAME_REGION_TYPE)
  private String regionType;

  public static final String SERIALIZED_NAME_SERVICE_EMAIL = "service_email";
  @SerializedName(SERIALIZED_NAME_SERVICE_EMAIL)
  private String serviceEmail;

  public static final String SERIALIZED_NAME_SERVICE_PHONE = "service_phone";
  @SerializedName(SERIALIZED_NAME_SERVICE_PHONE)
  private String servicePhone;

  public static final String SERIALIZED_NAME_SERVICE_REGION_INFO = "service_region_info";
  @SerializedName(SERIALIZED_NAME_SERVICE_REGION_INFO)
  private List<RegionInfo> serviceRegionInfo = null;

  public static final String SERIALIZED_NAME_SPEED_UP = "speed_up";
  @SerializedName(SERIALIZED_NAME_SPEED_UP)
  private String speedUp;

  public static final String SERIALIZED_NAME_TEST_ACCOUT = "test_accout";
  @SerializedName(SERIALIZED_NAME_TEST_ACCOUT)
  private String testAccout;

  public static final String SERIALIZED_NAME_TEST_PASSWORD = "test_password";
  @SerializedName(SERIALIZED_NAME_TEST_PASSWORD)
  private String testPassword;

  public static final String SERIALIZED_NAME_VERSION_DESC = "version_desc";
  @SerializedName(SERIALIZED_NAME_VERSION_DESC)
  private String versionDesc;

  public AlipayOpenMiniVersionAuditApplyModel() { 
  }

  public AlipayOpenMiniVersionAuditApplyModel appCategoryIds(String appCategoryIds) {
    
    this.appCategoryIds = appCategoryIds;
    return this;
  }

   /**
   * 小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以通过  https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。
   * @return appCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11_12;12_13", value = "小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以通过  https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。")

  public String getAppCategoryIds() {
    return appCategoryIds;
  }


  public void setAppCategoryIds(String appCategoryIds) {
    this.appCategoryIds = appCategoryIds;
  }


  public AlipayOpenMiniVersionAuditApplyModel appDesc(String appDesc) {
    
    this.appDesc = appDesc;
    return this;
  }

   /**
   * 小程序描述，长度限制 20~400 个字符。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息
   * @return appDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "一家专注做潮流女装的店铺，带给消费者价格便宜、质量上乘的衣服", value = "小程序描述，长度限制 20~400 个字符。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息")

  public String getAppDesc() {
    return appDesc;
  }


  public void setAppDesc(String appDesc) {
    this.appDesc = appDesc;
  }


  public AlipayOpenMiniVersionAuditApplyModel appEnglishName(String appEnglishName) {
    
    this.appEnglishName = appEnglishName;
    return this;
  }

   /**
   * 小程序应用英文名称，长度限制 3～30 个字符；仅支持英文和数字。 如果不填默认采用当前小程序应用英文名称，如无默认值则必填，不可为空。
   * @return appEnglishName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "demoexample", value = "小程序应用英文名称，长度限制 3～30 个字符；仅支持英文和数字。 如果不填默认采用当前小程序应用英文名称，如无默认值则必填，不可为空。")

  public String getAppEnglishName() {
    return appEnglishName;
  }


  public void setAppEnglishName(String appEnglishName) {
    this.appEnglishName = appEnglishName;
  }


  public AlipayOpenMiniVersionAuditApplyModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序名称，长度限制 3~30 个字符，仅支持包含中文、数字、英文、下划线、+、-。 如果不填默认采用当前小程序应用名称，如无默认值则必填，不可为空。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州支小宝潮流女装店", value = "小程序名称，长度限制 3~30 个字符，仅支持包含中文、数字、英文、下划线、+、-。 如果不填默认采用当前小程序应用名称，如无默认值则必填，不可为空。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AlipayOpenMiniVersionAuditApplyModel appSlogan(String appSlogan) {
    
    this.appSlogan = appSlogan;
    return this;
  }

   /**
   * 小程序简介，一句话描述小程序功能，长度限制 10~32个字符。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息
   * @return appSlogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "专注潮流女装20年", value = "小程序简介，一句话描述小程序功能，长度限制 10~32个字符。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息")

  public String getAppSlogan() {
    return appSlogan;
  }


  public void setAppSlogan(String appSlogan) {
    this.appSlogan = appSlogan;
  }


  public AlipayOpenMiniVersionAuditApplyModel appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 小程序版本号，请选择开发版本执行提交审核操作。
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.1", value = "小程序版本号，请选择开发版本执行提交审核操作。")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public AlipayOpenMiniVersionAuditApplyModel auditRule(String auditRule) {
    
    this.auditRule = auditRule;
    return this;
  }

   /**
   * 审核类型： NONE： 不拆分准入、营销（默认） BASE_PROMOTE：准入、营销拆分审核 建议设置成“BASE_PROMOTE”，小程序将会更容易上架。将小程序发布审核拆分成“准入”、“营销”。原先小程序需要两个环节都审核通过才能上架，现在小程序只需要准入通过即可上架，但是无法在营销场景（支付宝泛搜、支付宝首页推荐等）展现给用户，小程序可通过精搜或者扫码等方式使用。如果小程序需要进行营销，可发布新版本，当准入&amp;营销都通过后，小程序也可被营销。点击查看支付宝小程序营销规范：https://opendocs.alipay.com/b/03al2q
   * @return auditRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BASE_PROMOTE", value = "审核类型： NONE： 不拆分准入、营销（默认） BASE_PROMOTE：准入、营销拆分审核 建议设置成“BASE_PROMOTE”，小程序将会更容易上架。将小程序发布审核拆分成“准入”、“营销”。原先小程序需要两个环节都审核通过才能上架，现在小程序只需要准入通过即可上架，但是无法在营销场景（支付宝泛搜、支付宝首页推荐等）展现给用户，小程序可通过精搜或者扫码等方式使用。如果小程序需要进行营销，可发布新版本，当准入&营销都通过后，小程序也可被营销。点击查看支付宝小程序营销规范：https://opendocs.alipay.com/b/03al2q")

  public String getAuditRule() {
    return auditRule;
  }


  public void setAuditRule(String auditRule) {
    this.auditRule = auditRule;
  }


  public AlipayOpenMiniVersionAuditApplyModel autoOnline(String autoOnline) {
    
    this.autoOnline = autoOnline;
    return this;
  }

   /**
   * 审核通过后是否自动上架， 自动上架：true；不自动上架（默认）：false。 如果小程序上架前无需特殊处理，建议设置成true，平台将会在小程序审核通过时自动将其上架
   * @return autoOnline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "审核通过后是否自动上架， 自动上架：true；不自动上架（默认）：false。 如果小程序上架前无需特殊处理，建议设置成true，平台将会在小程序审核通过时自动将其上架")

  public String getAutoOnline() {
    return autoOnline;
  }


  public void setAutoOnline(String autoOnline) {
    this.autoOnline = autoOnline;
  }


  public AlipayOpenMiniVersionAuditApplyModel bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 小程序投放的端参数。例如投放到支付宝钱包是支付宝端。默认支付宝端。支持： com.alipay.alipaywallet:支付宝端； com.alipay.iot.xpaas：支付宝IoT端。
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.alipay.alipaywallet", value = "小程序投放的端参数。例如投放到支付宝钱包是支付宝端。默认支付宝端。支持： com.alipay.alipaywallet:支付宝端； com.alipay.iot.xpaas：支付宝IoT端。")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AlipayOpenMiniVersionAuditApplyModel licenseName(String licenseName) {
    
    this.licenseName = licenseName;
    return this;
  }

   /**
   * 营业执照名称，部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。 如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填
   * @return licenseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "营业执照名称", value = "营业执照名称，部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。 如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填")

  public String getLicenseName() {
    return licenseName;
  }


  public void setLicenseName(String licenseName) {
    this.licenseName = licenseName;
  }


  public AlipayOpenMiniVersionAuditApplyModel licenseNo(String licenseNo) {
    
    this.licenseNo = licenseNo;
    return this;
  }

   /**
   * 营业执照证件号，部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。  如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填
   * @return licenseNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "licenseNo", value = "营业执照证件号，部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。  如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填")

  public String getLicenseNo() {
    return licenseNo;
  }


  public void setLicenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
  }


  public AlipayOpenMiniVersionAuditApplyModel licenseValidDate(String licenseValidDate) {
    
    this.licenseValidDate = licenseValidDate;
    return this;
  }

   /**
   * 营业执照有效期，格式为 yyyy-MM-dd，9999-12-31表示长期有效。 部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。 如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填
   * @return licenseValidDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9999-12-31", value = "营业执照有效期，格式为 yyyy-MM-dd，9999-12-31表示长期有效。 部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。 如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填")

  public String getLicenseValidDate() {
    return licenseValidDate;
  }


  public void setLicenseValidDate(String licenseValidDate) {
    this.licenseValidDate = licenseValidDate;
  }


  public AlipayOpenMiniVersionAuditApplyModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 小程序备注，小程序备注最多500字符。
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序示例", value = "小程序备注，小程序备注最多500字符。")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AlipayOpenMiniVersionAuditApplyModel miniCategoryIds(String miniCategoryIds) {
    
    this.miniCategoryIds = miniCategoryIds;
    return this;
  }

   /**
   * 新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query 接口查询mini_category_list。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息 注意：个人开发者不得使用企业类目。
   * @return miniCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XS1001_XS2001_XS3002;XS1011_XS2089;XS1002_XS2008_XS3024", value = "新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query 接口查询mini_category_list。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息 注意：个人开发者不得使用企业类目。")

  public String getMiniCategoryIds() {
    return miniCategoryIds;
  }


  public void setMiniCategoryIds(String miniCategoryIds) {
    this.miniCategoryIds = miniCategoryIds;
  }


  public AlipayOpenMiniVersionAuditApplyModel regionType(String regionType) {
    
    this.regionType = regionType;
    return this;
  }

   /**
   * 小程序服务区域类型，支持： GLOBAL-全球 CHINA-中国 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。 LOCATION-指定区域
   * @return regionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHINA", value = "小程序服务区域类型，支持： GLOBAL-全球 CHINA-中国 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。 LOCATION-指定区域")

  public String getRegionType() {
    return regionType;
  }


  public void setRegionType(String regionType) {
    this.regionType = regionType;
  }


  public AlipayOpenMiniVersionAuditApplyModel serviceEmail(String serviceEmail) {
    
    this.serviceEmail = serviceEmail;
    return this;
  }

   /**
   * 小程序客服邮箱，如果不填默认采用当前小程序的应用客服邮箱，小程序客服电话和邮箱至少输入一个。如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。 注意：2021年7月1日后，该字段将逐步灰度为可选字段，请按可选开发。
   * @return serviceEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@mail.com", value = "小程序客服邮箱，如果不填默认采用当前小程序的应用客服邮箱，小程序客服电话和邮箱至少输入一个。如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。 注意：2021年7月1日后，该字段将逐步灰度为可选字段，请按可选开发。")

  public String getServiceEmail() {
    return serviceEmail;
  }


  public void setServiceEmail(String serviceEmail) {
    this.serviceEmail = serviceEmail;
  }


  public AlipayOpenMiniVersionAuditApplyModel servicePhone(String servicePhone) {
    
    this.servicePhone = servicePhone;
    return this;
  }

   /**
   * 小程序客服电话，长度限制5~30个字符，仅支持包含数字和-。如果不填默认采用当前小程序的应用客服电话，小程序客服电话和邮箱至少输入一个。如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。 注意：2021年7月1日后，该字段将逐步灰度为必填字段，请按必填开发。
   * @return servicePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13110101010", value = "小程序客服电话，长度限制5~30个字符，仅支持包含数字和-。如果不填默认采用当前小程序的应用客服电话，小程序客服电话和邮箱至少输入一个。如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。 注意：2021年7月1日后，该字段将逐步灰度为必填字段，请按必填开发。")

  public String getServicePhone() {
    return servicePhone;
  }


  public void setServicePhone(String servicePhone) {
    this.servicePhone = servicePhone;
  }


  public AlipayOpenMiniVersionAuditApplyModel serviceRegionInfo(List<RegionInfo> serviceRegionInfo) {
    
    this.serviceRegionInfo = serviceRegionInfo;
    return this;
  }

  public AlipayOpenMiniVersionAuditApplyModel addServiceRegionInfoItem(RegionInfo serviceRegionInfoItem) {
    if (this.serviceRegionInfo == null) {
      this.serviceRegionInfo = new ArrayList<>();
    }
    this.serviceRegionInfo.add(serviceRegionInfoItem);
    return this;
  }

   /**
   * 省市区信息。当region_type为LOCATION或传入city_code时，province_code不能为空；填写area_code时，province_code和city_code不能为空。只填province_code则全选该省；填写province_code和city_code则全选该市，以此类推。省市区code参见https://gw.alipayobjects.com/os/bmw-prod/0aab0319-13de-42b9-85cf-13877a5f78ed.xlsx 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。
   * @return serviceRegionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "省市区信息。当region_type为LOCATION或传入city_code时，province_code不能为空；填写area_code时，province_code和city_code不能为空。只填province_code则全选该省；填写province_code和city_code则全选该市，以此类推。省市区code参见https://gw.alipayobjects.com/os/bmw-prod/0aab0319-13de-42b9-85cf-13877a5f78ed.xlsx 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。")

  public List<RegionInfo> getServiceRegionInfo() {
    return serviceRegionInfo;
  }


  public void setServiceRegionInfo(List<RegionInfo> serviceRegionInfo) {
    this.serviceRegionInfo = serviceRegionInfo;
  }


  public AlipayOpenMiniVersionAuditApplyModel speedUp(String speedUp) {
    
    this.speedUp = speedUp;
    return this;
  }

   /**
   * 如果有审核加急权益，是否使用审核加急权益加速审核： 加速（默认）：true 不加速：false
   * @return speedUp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "如果有审核加急权益，是否使用审核加急权益加速审核： 加速（默认）：true 不加速：false")

  public String getSpeedUp() {
    return speedUp;
  }


  public void setSpeedUp(String speedUp) {
    this.speedUp = speedUp;
  }


  public AlipayOpenMiniVersionAuditApplyModel testAccout(String testAccout) {
    
    this.testAccout = testAccout;
    return this;
  }

   /**
   * 测试账号，是否需要填写请参见https://opendocs.alipay.com/mini/operation/standard/case/akxg6r#3.%20%E6%B5%8B%E8%AF%95%E5%86%85%E5%AE%B9%E6%8F%90%E4%BA%A4%E4%B8%8D%E5%AE%8C%E6%95%B4
   * @return testAccout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12122", value = "测试账号，是否需要填写请参见https://opendocs.alipay.com/mini/operation/standard/case/akxg6r#3.%20%E6%B5%8B%E8%AF%95%E5%86%85%E5%AE%B9%E6%8F%90%E4%BA%A4%E4%B8%8D%E5%AE%8C%E6%95%B4")

  public String getTestAccout() {
    return testAccout;
  }


  public void setTestAccout(String testAccout) {
    this.testAccout = testAccout;
  }


  public AlipayOpenMiniVersionAuditApplyModel testPassword(String testPassword) {
    
    this.testPassword = testPassword;
    return this;
  }

   /**
   * 测试账号密码
   * @return testPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12121", value = "测试账号密码")

  public String getTestPassword() {
    return testPassword;
  }


  public void setTestPassword(String testPassword) {
    this.testPassword = testPassword;
  }


  public AlipayOpenMiniVersionAuditApplyModel versionDesc(String versionDesc) {
    
    this.versionDesc = versionDesc;
    return this;
  }

   /**
   * 小程序版本描述，30-500个字符。
   * @return versionDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "本次版本更新优化了3项功能，修复了5个BUG", value = "小程序版本描述，30-500个字符。")

  public String getVersionDesc() {
    return versionDesc;
  }


  public void setVersionDesc(String versionDesc) {
    this.versionDesc = versionDesc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniVersionAuditApplyModel alipayOpenMiniVersionAuditApplyModel = (AlipayOpenMiniVersionAuditApplyModel) o;
    return Objects.equals(this.appCategoryIds, alipayOpenMiniVersionAuditApplyModel.appCategoryIds) &&
        Objects.equals(this.appDesc, alipayOpenMiniVersionAuditApplyModel.appDesc) &&
        Objects.equals(this.appEnglishName, alipayOpenMiniVersionAuditApplyModel.appEnglishName) &&
        Objects.equals(this.appName, alipayOpenMiniVersionAuditApplyModel.appName) &&
        Objects.equals(this.appSlogan, alipayOpenMiniVersionAuditApplyModel.appSlogan) &&
        Objects.equals(this.appVersion, alipayOpenMiniVersionAuditApplyModel.appVersion) &&
        Objects.equals(this.auditRule, alipayOpenMiniVersionAuditApplyModel.auditRule) &&
        Objects.equals(this.autoOnline, alipayOpenMiniVersionAuditApplyModel.autoOnline) &&
        Objects.equals(this.bundleId, alipayOpenMiniVersionAuditApplyModel.bundleId) &&
        Objects.equals(this.licenseName, alipayOpenMiniVersionAuditApplyModel.licenseName) &&
        Objects.equals(this.licenseNo, alipayOpenMiniVersionAuditApplyModel.licenseNo) &&
        Objects.equals(this.licenseValidDate, alipayOpenMiniVersionAuditApplyModel.licenseValidDate) &&
        Objects.equals(this.memo, alipayOpenMiniVersionAuditApplyModel.memo) &&
        Objects.equals(this.miniCategoryIds, alipayOpenMiniVersionAuditApplyModel.miniCategoryIds) &&
        Objects.equals(this.regionType, alipayOpenMiniVersionAuditApplyModel.regionType) &&
        Objects.equals(this.serviceEmail, alipayOpenMiniVersionAuditApplyModel.serviceEmail) &&
        Objects.equals(this.servicePhone, alipayOpenMiniVersionAuditApplyModel.servicePhone) &&
        Objects.equals(this.serviceRegionInfo, alipayOpenMiniVersionAuditApplyModel.serviceRegionInfo) &&
        Objects.equals(this.speedUp, alipayOpenMiniVersionAuditApplyModel.speedUp) &&
        Objects.equals(this.testAccout, alipayOpenMiniVersionAuditApplyModel.testAccout) &&
        Objects.equals(this.testPassword, alipayOpenMiniVersionAuditApplyModel.testPassword) &&
        Objects.equals(this.versionDesc, alipayOpenMiniVersionAuditApplyModel.versionDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCategoryIds, appDesc, appEnglishName, appName, appSlogan, appVersion, auditRule, autoOnline, bundleId, licenseName, licenseNo, licenseValidDate, memo, miniCategoryIds, regionType, serviceEmail, servicePhone, serviceRegionInfo, speedUp, testAccout, testPassword, versionDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniVersionAuditApplyModel {\n");
    sb.append("    appCategoryIds: ").append(toIndentedString(appCategoryIds)).append("\n");
    sb.append("    appDesc: ").append(toIndentedString(appDesc)).append("\n");
    sb.append("    appEnglishName: ").append(toIndentedString(appEnglishName)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appSlogan: ").append(toIndentedString(appSlogan)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    auditRule: ").append(toIndentedString(auditRule)).append("\n");
    sb.append("    autoOnline: ").append(toIndentedString(autoOnline)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    licenseName: ").append(toIndentedString(licenseName)).append("\n");
    sb.append("    licenseNo: ").append(toIndentedString(licenseNo)).append("\n");
    sb.append("    licenseValidDate: ").append(toIndentedString(licenseValidDate)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    miniCategoryIds: ").append(toIndentedString(miniCategoryIds)).append("\n");
    sb.append("    regionType: ").append(toIndentedString(regionType)).append("\n");
    sb.append("    serviceEmail: ").append(toIndentedString(serviceEmail)).append("\n");
    sb.append("    servicePhone: ").append(toIndentedString(servicePhone)).append("\n");
    sb.append("    serviceRegionInfo: ").append(toIndentedString(serviceRegionInfo)).append("\n");
    sb.append("    speedUp: ").append(toIndentedString(speedUp)).append("\n");
    sb.append("    testAccout: ").append(toIndentedString(testAccout)).append("\n");
    sb.append("    testPassword: ").append(toIndentedString(testPassword)).append("\n");
    sb.append("    versionDesc: ").append(toIndentedString(versionDesc)).append("\n");
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
    openapiFields.add("app_category_ids");
    openapiFields.add("app_desc");
    openapiFields.add("app_english_name");
    openapiFields.add("app_name");
    openapiFields.add("app_slogan");
    openapiFields.add("app_version");
    openapiFields.add("audit_rule");
    openapiFields.add("auto_online");
    openapiFields.add("bundle_id");
    openapiFields.add("license_name");
    openapiFields.add("license_no");
    openapiFields.add("license_valid_date");
    openapiFields.add("memo");
    openapiFields.add("mini_category_ids");
    openapiFields.add("region_type");
    openapiFields.add("service_email");
    openapiFields.add("service_phone");
    openapiFields.add("service_region_info");
    openapiFields.add("speed_up");
    openapiFields.add("test_accout");
    openapiFields.add("test_password");
    openapiFields.add("version_desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniVersionAuditApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniVersionAuditApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniVersionAuditApplyModel is not found in the empty JSON string", AlipayOpenMiniVersionAuditApplyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniVersionAuditApplyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniVersionAuditApplyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_category_ids") != null && !jsonObj.get("app_category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_category_ids").toString()));
      }
      if (jsonObj.get("app_desc") != null && !jsonObj.get("app_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_desc").toString()));
      }
      if (jsonObj.get("app_english_name") != null && !jsonObj.get("app_english_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_english_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_english_name").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_slogan") != null && !jsonObj.get("app_slogan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_slogan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_slogan").toString()));
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("audit_rule") != null && !jsonObj.get("audit_rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_rule").toString()));
      }
      if (jsonObj.get("auto_online") != null && !jsonObj.get("auto_online").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auto_online` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auto_online").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("license_name") != null && !jsonObj.get("license_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_name").toString()));
      }
      if (jsonObj.get("license_no") != null && !jsonObj.get("license_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_no").toString()));
      }
      if (jsonObj.get("license_valid_date") != null && !jsonObj.get("license_valid_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_valid_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_valid_date").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("mini_category_ids") != null && !jsonObj.get("mini_category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_category_ids").toString()));
      }
      if (jsonObj.get("region_type") != null && !jsonObj.get("region_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region_type").toString()));
      }
      if (jsonObj.get("service_email") != null && !jsonObj.get("service_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_email").toString()));
      }
      if (jsonObj.get("service_phone") != null && !jsonObj.get("service_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_phone").toString()));
      }
      JsonArray jsonArrayserviceRegionInfo = jsonObj.getAsJsonArray("service_region_info");
      if (jsonArrayserviceRegionInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("service_region_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `service_region_info` to be an array in the JSON string but got `%s`", jsonObj.get("service_region_info").toString()));
        }

        // validate the optional field `service_region_info` (array)
        for (int i = 0; i < jsonArrayserviceRegionInfo.size(); i++) {
          RegionInfo.validateJsonObject(jsonArrayserviceRegionInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("speed_up") != null && !jsonObj.get("speed_up").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `speed_up` to be a primitive type in the JSON string but got `%s`", jsonObj.get("speed_up").toString()));
      }
      if (jsonObj.get("test_accout") != null && !jsonObj.get("test_accout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test_accout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test_accout").toString()));
      }
      if (jsonObj.get("test_password") != null && !jsonObj.get("test_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test_password").toString()));
      }
      if (jsonObj.get("version_desc") != null && !jsonObj.get("version_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniVersionAuditApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniVersionAuditApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniVersionAuditApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniVersionAuditApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniVersionAuditApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniVersionAuditApplyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniVersionAuditApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniVersionAuditApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniVersionAuditApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniVersionAuditApplyModel
  */
  public static AlipayOpenMiniVersionAuditApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniVersionAuditApplyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniVersionAuditApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

