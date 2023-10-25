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
 * AlipayBossFncInvoiceBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayBossFncInvoiceBatchqueryModel {
  public static final String SERIALIZED_NAME_APPLY_ORDER_ID = "apply_order_id";
  @SerializedName(SERIALIZED_NAME_APPLY_ORDER_ID)
  private String applyOrderId;

  public static final String SERIALIZED_NAME_BUYER_INVOICE_TITLE = "buyer_invoice_title";
  @SerializedName(SERIALIZED_NAME_BUYER_INVOICE_TITLE)
  private String buyerInvoiceTitle;

  public static final String SERIALIZED_NAME_BUYER_IPID = "buyer_ipid";
  @SerializedName(SERIALIZED_NAME_BUYER_IPID)
  private String buyerIpid;

  public static final String SERIALIZED_NAME_BUYER_IPIDS = "buyer_ipids";
  @SerializedName(SERIALIZED_NAME_BUYER_IPIDS)
  private List<String> buyerIpids = null;

  public static final String SERIALIZED_NAME_BUYER_IPROLE_ID = "buyer_iprole_id";
  @SerializedName(SERIALIZED_NAME_BUYER_IPROLE_ID)
  private String buyerIproleId;

  public static final String SERIALIZED_NAME_BUYER_IPROLE_IDS = "buyer_iprole_ids";
  @SerializedName(SERIALIZED_NAME_BUYER_IPROLE_IDS)
  private List<String> buyerIproleIds = null;

  public static final String SERIALIZED_NAME_INST_ID = "inst_id";
  @SerializedName(SERIALIZED_NAME_INST_ID)
  private String instId;

  public static final String SERIALIZED_NAME_INVOICE_CHANNEL = "invoice_channel";
  @SerializedName(SERIALIZED_NAME_INVOICE_CHANNEL)
  private String invoiceChannel;

  public static final String SERIALIZED_NAME_INVOICE_CODE = "invoice_code";
  @SerializedName(SERIALIZED_NAME_INVOICE_CODE)
  private String invoiceCode;

  public static final String SERIALIZED_NAME_INVOICE_CREATE_DATE_BEGIN = "invoice_create_date_begin";
  @SerializedName(SERIALIZED_NAME_INVOICE_CREATE_DATE_BEGIN)
  private String invoiceCreateDateBegin;

  public static final String SERIALIZED_NAME_INVOICE_CREATE_DATE_END = "invoice_create_date_end";
  @SerializedName(SERIALIZED_NAME_INVOICE_CREATE_DATE_END)
  private String invoiceCreateDateEnd;

  public static final String SERIALIZED_NAME_INVOICE_IDS = "invoice_ids";
  @SerializedName(SERIALIZED_NAME_INVOICE_IDS)
  private List<String> invoiceIds = null;

  public static final String SERIALIZED_NAME_INVOICE_MATERIAL = "invoice_material";
  @SerializedName(SERIALIZED_NAME_INVOICE_MATERIAL)
  private String invoiceMaterial;

  public static final String SERIALIZED_NAME_INVOICE_NO = "invoice_no";
  @SerializedName(SERIALIZED_NAME_INVOICE_NO)
  private String invoiceNo;

  public static final String SERIALIZED_NAME_INVOICE_OPEN_DATE_BEGIN = "invoice_open_date_begin";
  @SerializedName(SERIALIZED_NAME_INVOICE_OPEN_DATE_BEGIN)
  private String invoiceOpenDateBegin;

  public static final String SERIALIZED_NAME_INVOICE_OPEN_DATE_END = "invoice_open_date_end";
  @SerializedName(SERIALIZED_NAME_INVOICE_OPEN_DATE_END)
  private String invoiceOpenDateEnd;

  public static final String SERIALIZED_NAME_INVOICE_STATUS = "invoice_status";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS)
  private List<String> invoiceStatus = null;

  public static final String SERIALIZED_NAME_INVOICE_TYPES = "invoice_types";
  @SerializedName(SERIALIZED_NAME_INVOICE_TYPES)
  private List<String> invoiceTypes = null;

  public static final String SERIALIZED_NAME_IS_ONLINE = "is_online";
  @SerializedName(SERIALIZED_NAME_IS_ONLINE)
  private String isOnline;

  public static final String SERIALIZED_NAME_IS_RED = "is_red";
  @SerializedName(SERIALIZED_NAME_IS_RED)
  private String isRed;

  public static final String SERIALIZED_NAME_MAIL_STATUS = "mail_status";
  @SerializedName(SERIALIZED_NAME_MAIL_STATUS)
  private List<String> mailStatus = null;

  public static final String SERIALIZED_NAME_MONTHLY_BILL_NO = "monthly_bill_no";
  @SerializedName(SERIALIZED_NAME_MONTHLY_BILL_NO)
  private String monthlyBillNo;

  public static final String SERIALIZED_NAME_PAGE_NO = "page_no";
  @SerializedName(SERIALIZED_NAME_PAGE_NO)
  private Integer pageNo;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TRACKING_NO = "tracking_no";
  @SerializedName(SERIALIZED_NAME_TRACKING_NO)
  private String trackingNo;

  public AlipayBossFncInvoiceBatchqueryModel() { 
  }

  public AlipayBossFncInvoiceBatchqueryModel applyOrderId(String applyOrderId) {
    
    this.applyOrderId = applyOrderId;
    return this;
  }

   /**
   * 开票申请ID，唯一标识开票申请表的ID
   * @return applyOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017090710122000473800320000049574", value = "开票申请ID，唯一标识开票申请表的ID")

  public String getApplyOrderId() {
    return applyOrderId;
  }


  public void setApplyOrderId(String applyOrderId) {
    this.applyOrderId = applyOrderId;
  }


  public AlipayBossFncInvoiceBatchqueryModel buyerInvoiceTitle(String buyerInvoiceTitle) {
    
    this.buyerInvoiceTitle = buyerInvoiceTitle;
    return this;
  }

   /**
   * 买方发票抬头，用于打印在发票上
   * @return buyerInvoiceTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "联想 ( 上海 ) 电子科技有限公司", value = "买方发票抬头，用于打印在发票上")

  public String getBuyerInvoiceTitle() {
    return buyerInvoiceTitle;
  }


  public void setBuyerInvoiceTitle(String buyerInvoiceTitle) {
    this.buyerInvoiceTitle = buyerInvoiceTitle;
  }


  public AlipayBossFncInvoiceBatchqueryModel buyerIpid(String buyerIpid) {
    
    this.buyerIpid = buyerIpid;
    return this;
  }

   /**
   * 对应发票商户的ipId，在主站标示mid，在其他环境标示ip_id。
   * @return buyerIpid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000004", value = "对应发票商户的ipId，在主站标示mid，在其他环境标示ip_id。")

  public String getBuyerIpid() {
    return buyerIpid;
  }


  public void setBuyerIpid(String buyerIpid) {
    this.buyerIpid = buyerIpid;
  }


  public AlipayBossFncInvoiceBatchqueryModel buyerIpids(List<String> buyerIpids) {
    
    this.buyerIpids = buyerIpids;
    return this;
  }

  public AlipayBossFncInvoiceBatchqueryModel addBuyerIpidsItem(String buyerIpidsItem) {
    if (this.buyerIpids == null) {
      this.buyerIpids = new ArrayList<>();
    }
    this.buyerIpids.add(buyerIpidsItem);
    return this;
  }

   /**
   * 购方商户ID集合
   * @return buyerIpids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2345643", value = "购方商户ID集合")

  public List<String> getBuyerIpids() {
    return buyerIpids;
  }


  public void setBuyerIpids(List<String> buyerIpids) {
    this.buyerIpids = buyerIpids;
  }


  public AlipayBossFncInvoiceBatchqueryModel buyerIproleId(String buyerIproleId) {
    
    this.buyerIproleId = buyerIproleId;
    return this;
  }

   /**
   * 商户结算的ipRoleId，表示商户的结算对象，在主站表示pid。
   * @return buyerIproleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088621524618252", value = "商户结算的ipRoleId，表示商户的结算对象，在主站表示pid。")

  public String getBuyerIproleId() {
    return buyerIproleId;
  }


  public void setBuyerIproleId(String buyerIproleId) {
    this.buyerIproleId = buyerIproleId;
  }


  public AlipayBossFncInvoiceBatchqueryModel buyerIproleIds(List<String> buyerIproleIds) {
    
    this.buyerIproleIds = buyerIproleIds;
    return this;
  }

  public AlipayBossFncInvoiceBatchqueryModel addBuyerIproleIdsItem(String buyerIproleIdsItem) {
    if (this.buyerIproleIds == null) {
      this.buyerIproleIds = new ArrayList<>();
    }
    this.buyerIproleIds.add(buyerIproleIdsItem);
    return this;
  }

   /**
   * 购方PID集合
   * @return buyerIproleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088621524618252", value = "购方PID集合")

  public List<String> getBuyerIproleIds() {
    return buyerIproleIds;
  }


  public void setBuyerIproleIds(List<String> buyerIproleIds) {
    this.buyerIproleIds = buyerIproleIds;
  }


  public AlipayBossFncInvoiceBatchqueryModel instId(String instId) {
    
    this.instId = instId;
    return this;
  }

   /**
   * 对应发票所在OU的id，用于标示该发票所述的OU。
   * @return instId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Z50", value = "对应发票所在OU的id，用于标示该发票所述的OU。")

  public String getInstId() {
    return instId;
  }


  public void setInstId(String instId) {
    this.instId = instId;
  }


  public AlipayBossFncInvoiceBatchqueryModel invoiceChannel(String invoiceChannel) {
    
    this.invoiceChannel = invoiceChannel;
    return this;
  }

   /**
   * 开票渠道 01 线上;02 线下
   * @return invoiceChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "开票渠道 01 线上;02 线下")

  public String getInvoiceChannel() {
    return invoiceChannel;
  }


  public void setInvoiceChannel(String invoiceChannel) {
    this.invoiceChannel = invoiceChannel;
  }


  public AlipayBossFncInvoiceBatchqueryModel invoiceCode(String invoiceCode) {
    
    this.invoiceCode = invoiceCode;
    return this;
  }

   /**
   * 发票代码，税务部门给予发票的编码
   * @return invoiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "031001600211", value = "发票代码，税务部门给予发票的编码")

  public String getInvoiceCode() {
    return invoiceCode;
  }


  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }


  public AlipayBossFncInvoiceBatchqueryModel invoiceCreateDateBegin(String invoiceCreateDateBegin) {
    
    this.invoiceCreateDateBegin = invoiceCreateDateBegin;
    return this;
  }

   /**
   * 发票创建日期【起始日期，格式yyyyMMdd】
   * @return invoiceCreateDateBegin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180723", value = "发票创建日期【起始日期，格式yyyyMMdd】")

  public String getInvoiceCreateDateBegin() {
    return invoiceCreateDateBegin;
  }


  public void setInvoiceCreateDateBegin(String invoiceCreateDateBegin) {
    this.invoiceCreateDateBegin = invoiceCreateDateBegin;
  }


  public AlipayBossFncInvoiceBatchqueryModel invoiceCreateDateEnd(String invoiceCreateDateEnd) {
    
    this.invoiceCreateDateEnd = invoiceCreateDateEnd;
    return this;
  }

   /**
   * 发票创建日期【结束日期，格式yyyyMMdd】
   * @return invoiceCreateDateEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180723", value = "发票创建日期【结束日期，格式yyyyMMdd】")

  public String getInvoiceCreateDateEnd() {
    return invoiceCreateDateEnd;
  }


  public void setInvoiceCreateDateEnd(String invoiceCreateDateEnd) {
    this.invoiceCreateDateEnd = invoiceCreateDateEnd;
  }


  public AlipayBossFncInvoiceBatchqueryModel invoiceIds(List<String> invoiceIds) {
    
    this.invoiceIds = invoiceIds;
    return this;
  }

  public AlipayBossFncInvoiceBatchqueryModel addInvoiceIdsItem(String invoiceIdsItem) {
    if (this.invoiceIds == null) {
      this.invoiceIds = new ArrayList<>();
    }
    this.invoiceIds.add(invoiceIdsItem);
    return this;
  }

   /**
   * 发票ID集合，发票ID，唯一标示一张发票的ID
   * @return invoiceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017011210122000494000670000000001", value = "发票ID集合，发票ID，唯一标示一张发票的ID")

  public List<String> getInvoiceIds() {
    return invoiceIds;
  }


  public void setInvoiceIds(List<String> invoiceIds) {
    this.invoiceIds = invoiceIds;
  }


  public AlipayBossFncInvoiceBatchqueryModel invoiceMaterial(String invoiceMaterial) {
    
    this.invoiceMaterial = invoiceMaterial;
    return this;
  }

   /**
   * 开票介质 01电子 02纸质
   * @return invoiceMaterial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "开票介质 01电子 02纸质")

  public String getInvoiceMaterial() {
    return invoiceMaterial;
  }


  public void setInvoiceMaterial(String invoiceMaterial) {
    this.invoiceMaterial = invoiceMaterial;
  }


  public AlipayBossFncInvoiceBatchqueryModel invoiceNo(String invoiceNo) {
    
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * 发票号码，税务部门给予发票的编码
   * @return invoiceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "86230814", value = "发票号码，税务部门给予发票的编码")

  public String getInvoiceNo() {
    return invoiceNo;
  }


  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }


  public AlipayBossFncInvoiceBatchqueryModel invoiceOpenDateBegin(String invoiceOpenDateBegin) {
    
    this.invoiceOpenDateBegin = invoiceOpenDateBegin;
    return this;
  }

   /**
   * 发票开票日期【起始日期，格式yyyyMMdd】
   * @return invoiceOpenDateBegin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180723", value = "发票开票日期【起始日期，格式yyyyMMdd】")

  public String getInvoiceOpenDateBegin() {
    return invoiceOpenDateBegin;
  }


  public void setInvoiceOpenDateBegin(String invoiceOpenDateBegin) {
    this.invoiceOpenDateBegin = invoiceOpenDateBegin;
  }


  public AlipayBossFncInvoiceBatchqueryModel invoiceOpenDateEnd(String invoiceOpenDateEnd) {
    
    this.invoiceOpenDateEnd = invoiceOpenDateEnd;
    return this;
  }

   /**
   * 发票开票日期【结束日期，格式yyyyMMdd】
   * @return invoiceOpenDateEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180723", value = "发票开票日期【结束日期，格式yyyyMMdd】")

  public String getInvoiceOpenDateEnd() {
    return invoiceOpenDateEnd;
  }


  public void setInvoiceOpenDateEnd(String invoiceOpenDateEnd) {
    this.invoiceOpenDateEnd = invoiceOpenDateEnd;
  }


  public AlipayBossFncInvoiceBatchqueryModel invoiceStatus(List<String> invoiceStatus) {
    
    this.invoiceStatus = invoiceStatus;
    return this;
  }

  public AlipayBossFncInvoiceBatchqueryModel addInvoiceStatusItem(String invoiceStatusItem) {
    if (this.invoiceStatus == null) {
      this.invoiceStatus = new ArrayList<>();
    }
    this.invoiceStatus.add(invoiceStatusItem);
    return this;
  }

   /**
   * 发票状态：用于标示发票当前的状态，状态类型以及相关含义：01 待开票;02 开票中;03 已开票;04 作废中;05 已作废;06 红冲中;07 已红冲;08 部分红冲;09 无效
   * @return invoiceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "发票状态：用于标示发票当前的状态，状态类型以及相关含义：01 待开票;02 开票中;03 已开票;04 作废中;05 已作废;06 红冲中;07 已红冲;08 部分红冲;09 无效")

  public List<String> getInvoiceStatus() {
    return invoiceStatus;
  }


  public void setInvoiceStatus(List<String> invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }


  public AlipayBossFncInvoiceBatchqueryModel invoiceTypes(List<String> invoiceTypes) {
    
    this.invoiceTypes = invoiceTypes;
    return this;
  }

  public AlipayBossFncInvoiceBatchqueryModel addInvoiceTypesItem(String invoiceTypesItem) {
    if (this.invoiceTypes == null) {
      this.invoiceTypes = new ArrayList<>();
    }
    this.invoiceTypes.add(invoiceTypesItem);
    return this;
  }

   /**
   * 发票类型,01专票 02普票 03营业税发票 04国际形式发票 05其它发票
   * @return invoiceTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "发票类型,01专票 02普票 03营业税发票 04国际形式发票 05其它发票")

  public List<String> getInvoiceTypes() {
    return invoiceTypes;
  }


  public void setInvoiceTypes(List<String> invoiceTypes) {
    this.invoiceTypes = invoiceTypes;
  }


  public AlipayBossFncInvoiceBatchqueryModel isOnline(String isOnline) {
    
    this.isOnline = isOnline;
    return this;
  }

   /**
   * 是否能在线开票 Y能 N不能
   * @return isOnline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "是否能在线开票 Y能 N不能")

  public String getIsOnline() {
    return isOnline;
  }


  public void setIsOnline(String isOnline) {
    this.isOnline = isOnline;
  }


  public AlipayBossFncInvoiceBatchqueryModel isRed(String isRed) {
    
    this.isRed = isRed;
    return this;
  }

   /**
   * 是否红字 Y红字 N蓝字
   * @return isRed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "N", value = "是否红字 Y红字 N蓝字")

  public String getIsRed() {
    return isRed;
  }


  public void setIsRed(String isRed) {
    this.isRed = isRed;
  }


  public AlipayBossFncInvoiceBatchqueryModel mailStatus(List<String> mailStatus) {
    
    this.mailStatus = mailStatus;
    return this;
  }

  public AlipayBossFncInvoiceBatchqueryModel addMailStatusItem(String mailStatusItem) {
    if (this.mailStatus == null) {
      this.mailStatus = new ArrayList<>();
    }
    this.mailStatus.add(mailStatusItem);
    return this;
  }

   /**
   * 邮寄状态 01 待邮寄;02 已邮寄;03 退回中;04 已退回
   * @return mailStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "邮寄状态 01 待邮寄;02 已邮寄;03 退回中;04 已退回")

  public List<String> getMailStatus() {
    return mailStatus;
  }


  public void setMailStatus(List<String> mailStatus) {
    this.mailStatus = mailStatus;
  }


  public AlipayBossFncInvoiceBatchqueryModel monthlyBillNo(String monthlyBillNo) {
    
    this.monthlyBillNo = monthlyBillNo;
    return this;
  }

   /**
   * 月账单号
   * @return monthlyBillNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017090510122000040400320000017749", value = "月账单号")

  public String getMonthlyBillNo() {
    return monthlyBillNo;
  }


  public void setMonthlyBillNo(String monthlyBillNo) {
    this.monthlyBillNo = monthlyBillNo;
  }


  public AlipayBossFncInvoiceBatchqueryModel pageNo(Integer pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * 起始页，分页时必须提供
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "起始页，分页时必须提供")

  public Integer getPageNo() {
    return pageNo;
  }


  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  public AlipayBossFncInvoiceBatchqueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页显示数，分页时必须提供
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "每页显示数，分页时必须提供")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayBossFncInvoiceBatchqueryModel trackingNo(String trackingNo) {
    
    this.trackingNo = trackingNo;
    return this;
  }

   /**
   * 快递单号
   * @return trackingNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170112101", value = "快递单号")

  public String getTrackingNo() {
    return trackingNo;
  }


  public void setTrackingNo(String trackingNo) {
    this.trackingNo = trackingNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayBossFncInvoiceBatchqueryModel alipayBossFncInvoiceBatchqueryModel = (AlipayBossFncInvoiceBatchqueryModel) o;
    return Objects.equals(this.applyOrderId, alipayBossFncInvoiceBatchqueryModel.applyOrderId) &&
        Objects.equals(this.buyerInvoiceTitle, alipayBossFncInvoiceBatchqueryModel.buyerInvoiceTitle) &&
        Objects.equals(this.buyerIpid, alipayBossFncInvoiceBatchqueryModel.buyerIpid) &&
        Objects.equals(this.buyerIpids, alipayBossFncInvoiceBatchqueryModel.buyerIpids) &&
        Objects.equals(this.buyerIproleId, alipayBossFncInvoiceBatchqueryModel.buyerIproleId) &&
        Objects.equals(this.buyerIproleIds, alipayBossFncInvoiceBatchqueryModel.buyerIproleIds) &&
        Objects.equals(this.instId, alipayBossFncInvoiceBatchqueryModel.instId) &&
        Objects.equals(this.invoiceChannel, alipayBossFncInvoiceBatchqueryModel.invoiceChannel) &&
        Objects.equals(this.invoiceCode, alipayBossFncInvoiceBatchqueryModel.invoiceCode) &&
        Objects.equals(this.invoiceCreateDateBegin, alipayBossFncInvoiceBatchqueryModel.invoiceCreateDateBegin) &&
        Objects.equals(this.invoiceCreateDateEnd, alipayBossFncInvoiceBatchqueryModel.invoiceCreateDateEnd) &&
        Objects.equals(this.invoiceIds, alipayBossFncInvoiceBatchqueryModel.invoiceIds) &&
        Objects.equals(this.invoiceMaterial, alipayBossFncInvoiceBatchqueryModel.invoiceMaterial) &&
        Objects.equals(this.invoiceNo, alipayBossFncInvoiceBatchqueryModel.invoiceNo) &&
        Objects.equals(this.invoiceOpenDateBegin, alipayBossFncInvoiceBatchqueryModel.invoiceOpenDateBegin) &&
        Objects.equals(this.invoiceOpenDateEnd, alipayBossFncInvoiceBatchqueryModel.invoiceOpenDateEnd) &&
        Objects.equals(this.invoiceStatus, alipayBossFncInvoiceBatchqueryModel.invoiceStatus) &&
        Objects.equals(this.invoiceTypes, alipayBossFncInvoiceBatchqueryModel.invoiceTypes) &&
        Objects.equals(this.isOnline, alipayBossFncInvoiceBatchqueryModel.isOnline) &&
        Objects.equals(this.isRed, alipayBossFncInvoiceBatchqueryModel.isRed) &&
        Objects.equals(this.mailStatus, alipayBossFncInvoiceBatchqueryModel.mailStatus) &&
        Objects.equals(this.monthlyBillNo, alipayBossFncInvoiceBatchqueryModel.monthlyBillNo) &&
        Objects.equals(this.pageNo, alipayBossFncInvoiceBatchqueryModel.pageNo) &&
        Objects.equals(this.pageSize, alipayBossFncInvoiceBatchqueryModel.pageSize) &&
        Objects.equals(this.trackingNo, alipayBossFncInvoiceBatchqueryModel.trackingNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyOrderId, buyerInvoiceTitle, buyerIpid, buyerIpids, buyerIproleId, buyerIproleIds, instId, invoiceChannel, invoiceCode, invoiceCreateDateBegin, invoiceCreateDateEnd, invoiceIds, invoiceMaterial, invoiceNo, invoiceOpenDateBegin, invoiceOpenDateEnd, invoiceStatus, invoiceTypes, isOnline, isRed, mailStatus, monthlyBillNo, pageNo, pageSize, trackingNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayBossFncInvoiceBatchqueryModel {\n");
    sb.append("    applyOrderId: ").append(toIndentedString(applyOrderId)).append("\n");
    sb.append("    buyerInvoiceTitle: ").append(toIndentedString(buyerInvoiceTitle)).append("\n");
    sb.append("    buyerIpid: ").append(toIndentedString(buyerIpid)).append("\n");
    sb.append("    buyerIpids: ").append(toIndentedString(buyerIpids)).append("\n");
    sb.append("    buyerIproleId: ").append(toIndentedString(buyerIproleId)).append("\n");
    sb.append("    buyerIproleIds: ").append(toIndentedString(buyerIproleIds)).append("\n");
    sb.append("    instId: ").append(toIndentedString(instId)).append("\n");
    sb.append("    invoiceChannel: ").append(toIndentedString(invoiceChannel)).append("\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    invoiceCreateDateBegin: ").append(toIndentedString(invoiceCreateDateBegin)).append("\n");
    sb.append("    invoiceCreateDateEnd: ").append(toIndentedString(invoiceCreateDateEnd)).append("\n");
    sb.append("    invoiceIds: ").append(toIndentedString(invoiceIds)).append("\n");
    sb.append("    invoiceMaterial: ").append(toIndentedString(invoiceMaterial)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    invoiceOpenDateBegin: ").append(toIndentedString(invoiceOpenDateBegin)).append("\n");
    sb.append("    invoiceOpenDateEnd: ").append(toIndentedString(invoiceOpenDateEnd)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
    sb.append("    invoiceTypes: ").append(toIndentedString(invoiceTypes)).append("\n");
    sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
    sb.append("    isRed: ").append(toIndentedString(isRed)).append("\n");
    sb.append("    mailStatus: ").append(toIndentedString(mailStatus)).append("\n");
    sb.append("    monthlyBillNo: ").append(toIndentedString(monthlyBillNo)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    trackingNo: ").append(toIndentedString(trackingNo)).append("\n");
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
    openapiFields.add("apply_order_id");
    openapiFields.add("buyer_invoice_title");
    openapiFields.add("buyer_ipid");
    openapiFields.add("buyer_ipids");
    openapiFields.add("buyer_iprole_id");
    openapiFields.add("buyer_iprole_ids");
    openapiFields.add("inst_id");
    openapiFields.add("invoice_channel");
    openapiFields.add("invoice_code");
    openapiFields.add("invoice_create_date_begin");
    openapiFields.add("invoice_create_date_end");
    openapiFields.add("invoice_ids");
    openapiFields.add("invoice_material");
    openapiFields.add("invoice_no");
    openapiFields.add("invoice_open_date_begin");
    openapiFields.add("invoice_open_date_end");
    openapiFields.add("invoice_status");
    openapiFields.add("invoice_types");
    openapiFields.add("is_online");
    openapiFields.add("is_red");
    openapiFields.add("mail_status");
    openapiFields.add("monthly_bill_no");
    openapiFields.add("page_no");
    openapiFields.add("page_size");
    openapiFields.add("tracking_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayBossFncInvoiceBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayBossFncInvoiceBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayBossFncInvoiceBatchqueryModel is not found in the empty JSON string", AlipayBossFncInvoiceBatchqueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayBossFncInvoiceBatchqueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayBossFncInvoiceBatchqueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("apply_order_id") != null && !jsonObj.get("apply_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_order_id").toString()));
      }
      if (jsonObj.get("buyer_invoice_title") != null && !jsonObj.get("buyer_invoice_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_invoice_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_invoice_title").toString()));
      }
      if (jsonObj.get("buyer_ipid") != null && !jsonObj.get("buyer_ipid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_ipid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_ipid").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("buyer_ipids") != null && !jsonObj.get("buyer_ipids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_ipids` to be an array in the JSON string but got `%s`", jsonObj.get("buyer_ipids").toString()));
      }
      if (jsonObj.get("buyer_iprole_id") != null && !jsonObj.get("buyer_iprole_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_iprole_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_iprole_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("buyer_iprole_ids") != null && !jsonObj.get("buyer_iprole_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_iprole_ids` to be an array in the JSON string but got `%s`", jsonObj.get("buyer_iprole_ids").toString()));
      }
      if (jsonObj.get("inst_id") != null && !jsonObj.get("inst_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inst_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inst_id").toString()));
      }
      if (jsonObj.get("invoice_channel") != null && !jsonObj.get("invoice_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_channel").toString()));
      }
      if (jsonObj.get("invoice_code") != null && !jsonObj.get("invoice_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_code").toString()));
      }
      if (jsonObj.get("invoice_create_date_begin") != null && !jsonObj.get("invoice_create_date_begin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_create_date_begin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_create_date_begin").toString()));
      }
      if (jsonObj.get("invoice_create_date_end") != null && !jsonObj.get("invoice_create_date_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_create_date_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_create_date_end").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("invoice_ids") != null && !jsonObj.get("invoice_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_ids` to be an array in the JSON string but got `%s`", jsonObj.get("invoice_ids").toString()));
      }
      if (jsonObj.get("invoice_material") != null && !jsonObj.get("invoice_material").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_material` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_material").toString()));
      }
      if (jsonObj.get("invoice_no") != null && !jsonObj.get("invoice_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_no").toString()));
      }
      if (jsonObj.get("invoice_open_date_begin") != null && !jsonObj.get("invoice_open_date_begin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_open_date_begin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_open_date_begin").toString()));
      }
      if (jsonObj.get("invoice_open_date_end") != null && !jsonObj.get("invoice_open_date_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_open_date_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_open_date_end").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("invoice_status") != null && !jsonObj.get("invoice_status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_status` to be an array in the JSON string but got `%s`", jsonObj.get("invoice_status").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("invoice_types") != null && !jsonObj.get("invoice_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_types` to be an array in the JSON string but got `%s`", jsonObj.get("invoice_types").toString()));
      }
      if (jsonObj.get("is_online") != null && !jsonObj.get("is_online").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_online` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_online").toString()));
      }
      if (jsonObj.get("is_red") != null && !jsonObj.get("is_red").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_red` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_red").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("mail_status") != null && !jsonObj.get("mail_status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mail_status` to be an array in the JSON string but got `%s`", jsonObj.get("mail_status").toString()));
      }
      if (jsonObj.get("monthly_bill_no") != null && !jsonObj.get("monthly_bill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `monthly_bill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("monthly_bill_no").toString()));
      }
      if (jsonObj.get("tracking_no") != null && !jsonObj.get("tracking_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayBossFncInvoiceBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayBossFncInvoiceBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayBossFncInvoiceBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayBossFncInvoiceBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayBossFncInvoiceBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayBossFncInvoiceBatchqueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayBossFncInvoiceBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayBossFncInvoiceBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayBossFncInvoiceBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayBossFncInvoiceBatchqueryModel
  */
  public static AlipayBossFncInvoiceBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayBossFncInvoiceBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayBossFncInvoiceBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

