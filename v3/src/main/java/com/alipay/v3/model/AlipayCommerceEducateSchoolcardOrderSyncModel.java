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
import com.alipay.v3.model.GoodsOrder;
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
 * AlipayCommerceEducateSchoolcardOrderSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEducateSchoolcardOrderSyncModel {
  public static final String SERIALIZED_NAME_ACTUAL_AMOUNT = "actual_amount";
  @SerializedName(SERIALIZED_NAME_ACTUAL_AMOUNT)
  private String actualAmount;

  public static final String SERIALIZED_NAME_APPLET_APP_ID = "applet_app_id";
  @SerializedName(SERIALIZED_NAME_APPLET_APP_ID)
  private String appletAppId;

  public static final String SERIALIZED_NAME_CARD_BALANCE = "card_balance";
  @SerializedName(SERIALIZED_NAME_CARD_BALANCE)
  private String cardBalance;

  public static final String SERIALIZED_NAME_CARD_NO = "card_no";
  @SerializedName(SERIALIZED_NAME_CARD_NO)
  private String cardNo;

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private String discountAmount;

  public static final String SERIALIZED_NAME_GOODS_ORDERS = "goods_orders";
  @SerializedName(SERIALIZED_NAME_GOODS_ORDERS)
  private GoodsOrder goodsOrders;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_MODIFIED_TIME = "modified_time";
  @SerializedName(SERIALIZED_NAME_MODIFIED_TIME)
  private String modifiedTime;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private String orderAmount;

  public static final String SERIALIZED_NAME_ORDER_DETAIL_URL = "order_detail_url";
  @SerializedName(SERIALIZED_NAME_ORDER_DETAIL_URL)
  private String orderDetailUrl;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PAY_ADDRESS = "pay_address";
  @SerializedName(SERIALIZED_NAME_PAY_ADDRESS)
  private String payAddress;

  public static final String SERIALIZED_NAME_PAY_MODE = "pay_mode";
  @SerializedName(SERIALIZED_NAME_PAY_MODE)
  private String payMode;

  public static final String SERIALIZED_NAME_RAKE_BACK_PID = "rake_back_pid";
  @SerializedName(SERIALIZED_NAME_RAKE_BACK_PID)
  private String rakeBackPid;

  public static final String SERIALIZED_NAME_SCHOOL_ID = "school_id";
  @SerializedName(SERIALIZED_NAME_SCHOOL_ID)
  private String schoolId;

  public static final String SERIALIZED_NAME_SCHOOL_PID = "school_pid";
  @SerializedName(SERIALIZED_NAME_SCHOOL_PID)
  private String schoolPid;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER_NAME = "service_provider_name";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER_NAME)
  private String serviceProviderName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayCommerceEducateSchoolcardOrderSyncModel() { 
  }

  public AlipayCommerceEducateSchoolcardOrderSyncModel actualAmount(String actualAmount) {
    
    this.actualAmount = actualAmount;
    return this;
  }

   /**
   * 实际金额（总支付金额）
   * @return actualAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.60", value = "实际金额（总支付金额）")

  public String getActualAmount() {
    return actualAmount;
  }


  public void setActualAmount(String actualAmount) {
    this.actualAmount = actualAmount;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel appletAppId(String appletAppId) {
    
    this.appletAppId = appletAppId;
    return this;
  }

   /**
   * 小程序appid
   * @return appletAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022xxxx", value = "小程序appid")

  public String getAppletAppId() {
    return appletAppId;
  }


  public void setAppletAppId(String appletAppId) {
    this.appletAppId = appletAppId;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel cardBalance(String cardBalance) {
    
    this.cardBalance = cardBalance;
    return this;
  }

   /**
   * 校园卡余额
   * @return cardBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.32", value = "校园卡余额")

  public String getCardBalance() {
    return cardBalance;
  }


  public void setCardBalance(String cardBalance) {
    this.cardBalance = cardBalance;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel cardNo(String cardNo) {
    
    this.cardNo = cardNo;
    return this;
  }

   /**
   * 卡号
   * @return cardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022xxxx", value = "卡号")

  public String getCardNo() {
    return cardNo;
  }


  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * 卡类型
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "学生：1；教职工：2", value = "卡类型")

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 该笔订单真实的创建时间，需精确到毫秒。时间格式为 yyyy-MM-dd HH:mm:ss.SSS。同一笔订单保持不变
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-09-16 10:12:12.910", value = "该笔订单真实的创建时间，需精确到毫秒。时间格式为 yyyy-MM-dd HH:mm:ss.SSS。同一笔订单保持不变")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel discountAmount(String discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * 优惠金额
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.70", value = "优惠金额")

  public String getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel goodsOrders(GoodsOrder goodsOrders) {
    
    this.goodsOrders = goodsOrders;
    return this;
  }

   /**
   * Get goodsOrders
   * @return goodsOrders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GoodsOrder getGoodsOrders() {
    return goodsOrders;
  }


  public void setGoodsOrders(GoodsOrder goodsOrders) {
    this.goodsOrders = goodsOrders;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * 商家名称，不传默认展示学校名称
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "温州医科大食堂", value = "商家名称，不传默认展示学校名称")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel modifiedTime(String modifiedTime) {
    
    this.modifiedTime = modifiedTime;
    return this;
  }

   /**
   * 订单修改时间，时间格式为 yyyy-MM-dd HH:mm:ss.SSS。用于订单状态或数据变化较快的顺序控制，防止乱序。order_modified_time较晚的同步会被最终存储，order_modified_time相同的两次同步会被幂等处理。
   * @return modifiedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-09-16 10:12:12.910", value = "订单修改时间，时间格式为 yyyy-MM-dd HH:mm:ss.SSS。用于订单状态或数据变化较快的顺序控制，防止乱序。order_modified_time较晚的同步会被最终存储，order_modified_time相同的两次同步会被幂等处理。")

  public String getModifiedTime() {
    return modifiedTime;
  }


  public void setModifiedTime(String modifiedTime) {
    this.modifiedTime = modifiedTime;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 蚂蚁统一会员ID
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "蚂蚁统一会员ID")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel orderAmount(String orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * 订单金额
   * @return orderAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.30", value = "订单金额")

  public String getOrderAmount() {
    return orderAmount;
  }


  public void setOrderAmount(String orderAmount) {
    this.orderAmount = orderAmount;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel orderDetailUrl(String orderDetailUrl) {
    
    this.orderDetailUrl = orderDetailUrl;
    return this;
  }

   /**
   * 订单详情链接
   * @return orderDetailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "传完整链接page=后面需做encode alipays://platformapi/startapp?appId=2021002126602599&page=%2fpages%2forder-details%2forder-details%3fticketOrderId%3d20210376854", value = "订单详情链接")

  public String getOrderDetailUrl() {
    return orderDetailUrl;
  }


  public void setOrderDetailUrl(String orderDetailUrl) {
    this.orderDetailUrl = orderDetailUrl;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel orderStatus(String orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * 订单状态 消费成功 CONSUME_S ；已退款：REFUNDED； 开卡成功 CARD_ACTIVED；消费失败：UN_CHARGE 充值成功 RECHARGE_S
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CONSUME_S 消费成功", value = "订单状态 消费成功 CONSUME_S ；已退款：REFUNDED； 开卡成功 CARD_ACTIVED；消费失败：UN_CHARGE 充值成功 RECHARGE_S")

  public String getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022xxxx", value = "外部业务号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel payAddress(String payAddress) {
    
    this.payAddress = payAddress;
    return this;
  }

   /**
   * 支付地点
   * @return payAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1餐厅-3楼1号机", value = "支付地点")

  public String getPayAddress() {
    return payAddress;
  }


  public void setPayAddress(String payAddress) {
    this.payAddress = payAddress;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel payMode(String payMode) {
    
    this.payMode = payMode;
    return this;
  }

   /**
   * 付款方式，不传默认展示学校名称+校园卡+（卡号后四位）
   * @return payMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "电子校园卡(卡号后四位)", value = "付款方式，不传默认展示学校名称+校园卡+（卡号后四位）")

  public String getPayMode() {
    return payMode;
  }


  public void setPayMode(String payMode) {
    this.payMode = payMode;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel rakeBackPid(String rakeBackPid) {
    
    this.rakeBackPid = rakeBackPid;
    return this;
  }

   /**
   * 返佣pid
   * @return rakeBackPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxx", value = "返佣pid")

  public String getRakeBackPid() {
    return rakeBackPid;
  }


  public void setRakeBackPid(String rakeBackPid) {
    this.rakeBackPid = rakeBackPid;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel schoolId(String schoolId) {
    
    this.schoolId = schoolId;
    return this;
  }

   /**
   * 学校内标
   * @return schoolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxx", value = "学校内标")

  public String getSchoolId() {
    return schoolId;
  }


  public void setSchoolId(String schoolId) {
    this.schoolId = schoolId;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel schoolPid(String schoolPid) {
    
    this.schoolPid = schoolPid;
    return this;
  }

   /**
   * 学校pid
   * @return schoolPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxx", value = "学校pid")

  public String getSchoolPid() {
    return schoolPid;
  }


  public void setSchoolPid(String schoolPid) {
    this.schoolPid = schoolPid;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel serviceProviderName(String serviceProviderName) {
    
    this.serviceProviderName = serviceProviderName;
    return this;
  }

   /**
   * 服务提供者名称
   * @return serviceProviderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "完美校园", value = "服务提供者名称")

  public String getServiceProviderName() {
    return serviceProviderName;
  }


  public void setServiceProviderName(String serviceProviderName) {
    this.serviceProviderName = serviceProviderName;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 业务类型
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SCHOOL_PAY  校园团餐", value = "业务类型")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public AlipayCommerceEducateSchoolcardOrderSyncModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 蚂蚁统一会员ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxx", value = "蚂蚁统一会员ID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceEducateSchoolcardOrderSyncModel alipayCommerceEducateSchoolcardOrderSyncModel = (AlipayCommerceEducateSchoolcardOrderSyncModel) o;
    return Objects.equals(this.actualAmount, alipayCommerceEducateSchoolcardOrderSyncModel.actualAmount) &&
        Objects.equals(this.appletAppId, alipayCommerceEducateSchoolcardOrderSyncModel.appletAppId) &&
        Objects.equals(this.cardBalance, alipayCommerceEducateSchoolcardOrderSyncModel.cardBalance) &&
        Objects.equals(this.cardNo, alipayCommerceEducateSchoolcardOrderSyncModel.cardNo) &&
        Objects.equals(this.cardType, alipayCommerceEducateSchoolcardOrderSyncModel.cardType) &&
        Objects.equals(this.createTime, alipayCommerceEducateSchoolcardOrderSyncModel.createTime) &&
        Objects.equals(this.discountAmount, alipayCommerceEducateSchoolcardOrderSyncModel.discountAmount) &&
        Objects.equals(this.goodsOrders, alipayCommerceEducateSchoolcardOrderSyncModel.goodsOrders) &&
        Objects.equals(this.merchantName, alipayCommerceEducateSchoolcardOrderSyncModel.merchantName) &&
        Objects.equals(this.modifiedTime, alipayCommerceEducateSchoolcardOrderSyncModel.modifiedTime) &&
        Objects.equals(this.openId, alipayCommerceEducateSchoolcardOrderSyncModel.openId) &&
        Objects.equals(this.orderAmount, alipayCommerceEducateSchoolcardOrderSyncModel.orderAmount) &&
        Objects.equals(this.orderDetailUrl, alipayCommerceEducateSchoolcardOrderSyncModel.orderDetailUrl) &&
        Objects.equals(this.orderStatus, alipayCommerceEducateSchoolcardOrderSyncModel.orderStatus) &&
        Objects.equals(this.outBizNo, alipayCommerceEducateSchoolcardOrderSyncModel.outBizNo) &&
        Objects.equals(this.payAddress, alipayCommerceEducateSchoolcardOrderSyncModel.payAddress) &&
        Objects.equals(this.payMode, alipayCommerceEducateSchoolcardOrderSyncModel.payMode) &&
        Objects.equals(this.rakeBackPid, alipayCommerceEducateSchoolcardOrderSyncModel.rakeBackPid) &&
        Objects.equals(this.schoolId, alipayCommerceEducateSchoolcardOrderSyncModel.schoolId) &&
        Objects.equals(this.schoolPid, alipayCommerceEducateSchoolcardOrderSyncModel.schoolPid) &&
        Objects.equals(this.serviceProviderName, alipayCommerceEducateSchoolcardOrderSyncModel.serviceProviderName) &&
        Objects.equals(this.type, alipayCommerceEducateSchoolcardOrderSyncModel.type) &&
        Objects.equals(this.userId, alipayCommerceEducateSchoolcardOrderSyncModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualAmount, appletAppId, cardBalance, cardNo, cardType, createTime, discountAmount, goodsOrders, merchantName, modifiedTime, openId, orderAmount, orderDetailUrl, orderStatus, outBizNo, payAddress, payMode, rakeBackPid, schoolId, schoolPid, serviceProviderName, type, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEducateSchoolcardOrderSyncModel {\n");
    sb.append("    actualAmount: ").append(toIndentedString(actualAmount)).append("\n");
    sb.append("    appletAppId: ").append(toIndentedString(appletAppId)).append("\n");
    sb.append("    cardBalance: ").append(toIndentedString(cardBalance)).append("\n");
    sb.append("    cardNo: ").append(toIndentedString(cardNo)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    goodsOrders: ").append(toIndentedString(goodsOrders)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    orderDetailUrl: ").append(toIndentedString(orderDetailUrl)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    payAddress: ").append(toIndentedString(payAddress)).append("\n");
    sb.append("    payMode: ").append(toIndentedString(payMode)).append("\n");
    sb.append("    rakeBackPid: ").append(toIndentedString(rakeBackPid)).append("\n");
    sb.append("    schoolId: ").append(toIndentedString(schoolId)).append("\n");
    sb.append("    schoolPid: ").append(toIndentedString(schoolPid)).append("\n");
    sb.append("    serviceProviderName: ").append(toIndentedString(serviceProviderName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("actual_amount");
    openapiFields.add("applet_app_id");
    openapiFields.add("card_balance");
    openapiFields.add("card_no");
    openapiFields.add("card_type");
    openapiFields.add("create_time");
    openapiFields.add("discount_amount");
    openapiFields.add("goods_orders");
    openapiFields.add("merchant_name");
    openapiFields.add("modified_time");
    openapiFields.add("open_id");
    openapiFields.add("order_amount");
    openapiFields.add("order_detail_url");
    openapiFields.add("order_status");
    openapiFields.add("out_biz_no");
    openapiFields.add("pay_address");
    openapiFields.add("pay_mode");
    openapiFields.add("rake_back_pid");
    openapiFields.add("school_id");
    openapiFields.add("school_pid");
    openapiFields.add("service_provider_name");
    openapiFields.add("type");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEducateSchoolcardOrderSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEducateSchoolcardOrderSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEducateSchoolcardOrderSyncModel is not found in the empty JSON string", AlipayCommerceEducateSchoolcardOrderSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceEducateSchoolcardOrderSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceEducateSchoolcardOrderSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("actual_amount") != null && !jsonObj.get("actual_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_amount").toString()));
      }
      if (jsonObj.get("applet_app_id") != null && !jsonObj.get("applet_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applet_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applet_app_id").toString()));
      }
      if (jsonObj.get("card_balance") != null && !jsonObj.get("card_balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_balance").toString()));
      }
      if (jsonObj.get("card_no") != null && !jsonObj.get("card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_no").toString()));
      }
      if (jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("discount_amount") != null && !jsonObj.get("discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_amount").toString()));
      }
      // validate the optional field `goods_orders`
      if (jsonObj.getAsJsonObject("goods_orders") != null) {
        GoodsOrder.validateJsonObject(jsonObj.getAsJsonObject("goods_orders"));
      }
      if (jsonObj.get("merchant_name") != null && !jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      if (jsonObj.get("modified_time") != null && !jsonObj.get("modified_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified_time").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("order_amount") != null && !jsonObj.get("order_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_amount").toString()));
      }
      if (jsonObj.get("order_detail_url") != null && !jsonObj.get("order_detail_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_detail_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_detail_url").toString()));
      }
      if (jsonObj.get("order_status") != null && !jsonObj.get("order_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_status").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("pay_address") != null && !jsonObj.get("pay_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_address").toString()));
      }
      if (jsonObj.get("pay_mode") != null && !jsonObj.get("pay_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_mode").toString()));
      }
      if (jsonObj.get("rake_back_pid") != null && !jsonObj.get("rake_back_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rake_back_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rake_back_pid").toString()));
      }
      if (jsonObj.get("school_id") != null && !jsonObj.get("school_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_id").toString()));
      }
      if (jsonObj.get("school_pid") != null && !jsonObj.get("school_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_pid").toString()));
      }
      if (jsonObj.get("service_provider_name") != null && !jsonObj.get("service_provider_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_provider_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_provider_name").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEducateSchoolcardOrderSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEducateSchoolcardOrderSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEducateSchoolcardOrderSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEducateSchoolcardOrderSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEducateSchoolcardOrderSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEducateSchoolcardOrderSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceEducateSchoolcardOrderSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceEducateSchoolcardOrderSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEducateSchoolcardOrderSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEducateSchoolcardOrderSyncModel
  */
  public static AlipayCommerceEducateSchoolcardOrderSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEducateSchoolcardOrderSyncModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEducateSchoolcardOrderSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

