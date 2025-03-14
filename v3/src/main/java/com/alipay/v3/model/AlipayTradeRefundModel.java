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
import com.alipay.v3.model.GoodsDetail;
import com.alipay.v3.model.OpenApiRoyaltyDetailInfoPojo;
import com.alipay.v3.model.RefundGoodsDetail;
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
 * AlipayTradeRefundModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeRefundModel {
  public static final String SERIALIZED_NAME_GOODS_DETAIL = "goods_detail";
  @SerializedName(SERIALIZED_NAME_GOODS_DETAIL)
  private List<GoodsDetail> goodsDetail = null;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "operator_id";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private String operatorId;

  public static final String SERIALIZED_NAME_ORG_PID = "org_pid";
  @SerializedName(SERIALIZED_NAME_ORG_PID)
  private String orgPid;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_QUERY_OPTIONS = "query_options";
  @SerializedName(SERIALIZED_NAME_QUERY_OPTIONS)
  private List<String> queryOptions = null;

  public static final String SERIALIZED_NAME_REFUND_ADVANCE_ACCOUNT = "refund_advance_account";
  @SerializedName(SERIALIZED_NAME_REFUND_ADVANCE_ACCOUNT)
  private String refundAdvanceAccount;

  public static final String SERIALIZED_NAME_REFUND_ADVANCE_ACCOUNT_TYPE = "refund_advance_account_type";
  @SerializedName(SERIALIZED_NAME_REFUND_ADVANCE_ACCOUNT_TYPE)
  private String refundAdvanceAccountType;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private String refundAmount;

  public static final String SERIALIZED_NAME_REFUND_CURRENCY = "refund_currency";
  @SerializedName(SERIALIZED_NAME_REFUND_CURRENCY)
  private String refundCurrency;

  public static final String SERIALIZED_NAME_REFUND_GOODS_DETAIL = "refund_goods_detail";
  @SerializedName(SERIALIZED_NAME_REFUND_GOODS_DETAIL)
  private List<RefundGoodsDetail> refundGoodsDetail = null;

  public static final String SERIALIZED_NAME_REFUND_REASON = "refund_reason";
  @SerializedName(SERIALIZED_NAME_REFUND_REASON)
  private String refundReason;

  public static final String SERIALIZED_NAME_REFUND_ROYALTY_PARAMETERS = "refund_royalty_parameters";
  @SerializedName(SERIALIZED_NAME_REFUND_ROYALTY_PARAMETERS)
  private List<OpenApiRoyaltyDetailInfoPojo> refundRoyaltyParameters = null;

  public static final String SERIALIZED_NAME_REFUND_TRANS_OUT = "refund_trans_out";
  @SerializedName(SERIALIZED_NAME_REFUND_TRANS_OUT)
  private String refundTransOut;

  public static final String SERIALIZED_NAME_REFUND_TRANS_OUT_TYPE = "refund_trans_out_type";
  @SerializedName(SERIALIZED_NAME_REFUND_TRANS_OUT_TYPE)
  private String refundTransOutType;

  public static final String SERIALIZED_NAME_RELATED_SETTLE_CONFIRM_NO = "related_settle_confirm_no";
  @SerializedName(SERIALIZED_NAME_RELATED_SETTLE_CONFIRM_NO)
  private String relatedSettleConfirmNo;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_TERMINAL_ID = "terminal_id";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeRefundModel() { 
  }

  public AlipayTradeRefundModel goodsDetail(List<GoodsDetail> goodsDetail) {
    
    this.goodsDetail = goodsDetail;
    return this;
  }

  public AlipayTradeRefundModel addGoodsDetailItem(GoodsDetail goodsDetailItem) {
    if (this.goodsDetail == null) {
      this.goodsDetail = new ArrayList<>();
    }
    this.goodsDetail.add(goodsDetailItem);
    return this;
  }

   /**
   * 退款包含的商品列表信息，Json格式。
   * @return goodsDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "退款包含的商品列表信息，Json格式。")

  public List<GoodsDetail> getGoodsDetail() {
    return goodsDetail;
  }


  public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
    this.goodsDetail = goodsDetail;
  }


  public AlipayTradeRefundModel operatorId(String operatorId) {
    
    this.operatorId = operatorId;
    return this;
  }

   /**
   * 商户的操作员编号
   * @return operatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OP001", value = "商户的操作员编号")

  public String getOperatorId() {
    return operatorId;
  }


  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }


  public AlipayTradeRefundModel orgPid(String orgPid) {
    
    this.orgPid = orgPid;
    return this;
  }

   /**
   * 银行间联模式下有用，其它场景请不要使用；  双联通过该参数指定需要退款的交易所属收单机构的pid;
   * @return orgPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117952222", value = "银行间联模式下有用，其它场景请不要使用；  双联通过该参数指定需要退款的交易所属收单机构的pid;")

  public String getOrgPid() {
    return orgPid;
  }


  public void setOrgPid(String orgPid) {
    this.orgPid = orgPid;
  }


  public AlipayTradeRefundModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 退款请求号。 标识一次退款请求，需要保证在交易号下唯一，如需部分退款，则此参数必传。 注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HZ01RF001", value = "退款请求号。 标识一次退款请求，需要保证在交易号下唯一，如需部分退款，则此参数必传。 注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeRefundModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 商户订单号。 订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一。与支付宝交易号 trade_no 不能同时为空。
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20150320010101001", value = "商户订单号。 订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一。与支付宝交易号 trade_no 不能同时为空。")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayTradeRefundModel queryOptions(List<String> queryOptions) {
    
    this.queryOptions = queryOptions;
    return this;
  }

  public AlipayTradeRefundModel addQueryOptionsItem(String queryOptionsItem) {
    if (this.queryOptions == null) {
      this.queryOptions = new ArrayList<>();
    }
    this.queryOptions.add(queryOptionsItem);
    return this;
  }

   /**
   * 查询选项。 商户通过上送该参数来定制同步需要额外返回的信息字段，数组格式。
   * @return queryOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"refund_detail_item_list\"]", value = "查询选项。 商户通过上送该参数来定制同步需要额外返回的信息字段，数组格式。")

  public List<String> getQueryOptions() {
    return queryOptions;
  }


  public void setQueryOptions(List<String> queryOptions) {
    this.queryOptions = queryOptions;
  }


  public AlipayTradeRefundModel refundAdvanceAccount(String refundAdvanceAccount) {
    
    this.refundAdvanceAccount = refundAdvanceAccount;
    return this;
  }

   /**
   * 指定垫资退款账号主体，可能是用户id或登录名
   * @return refundAdvanceAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "loginname@alitest.com", value = "指定垫资退款账号主体，可能是用户id或登录名")

  public String getRefundAdvanceAccount() {
    return refundAdvanceAccount;
  }


  public void setRefundAdvanceAccount(String refundAdvanceAccount) {
    this.refundAdvanceAccount = refundAdvanceAccount;
  }


  public AlipayTradeRefundModel refundAdvanceAccountType(String refundAdvanceAccountType) {
    
    this.refundAdvanceAccountType = refundAdvanceAccountType;
    return this;
  }

   /**
   * 指定垫资退款账号的类型，取值范围：default，userId，loginName
   * @return refundAdvanceAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "loginName", value = "指定垫资退款账号的类型，取值范围：default，userId，loginName")

  public String getRefundAdvanceAccountType() {
    return refundAdvanceAccountType;
  }


  public void setRefundAdvanceAccountType(String refundAdvanceAccountType) {
    this.refundAdvanceAccountType = refundAdvanceAccountType;
  }


  public AlipayTradeRefundModel refundAmount(String refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 退款金额。 需要退款的金额，该金额不能大于订单金额，单位为元，支持两位小数。 注：如果正向交易使用了营销，该退款金额包含营销金额，支付宝会按业务规则分配营销和买家自有资金分别退多少，默认优先退买家的自有资金。如交易总金额100元，用户支付时使用了80元自有资金和20元无资金流的营销券，商家实际收款80元。如果首次请求退款60元，则60元全部从商家收款资金扣除退回给用户自有资产；如果再请求退款40元，则从商家收款资金扣除20元退回用户资产以及把20元的营销券退回给用户（券是否可再使用取决于券的规则配置）。
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200.12", value = "退款金额。 需要退款的金额，该金额不能大于订单金额，单位为元，支持两位小数。 注：如果正向交易使用了营销，该退款金额包含营销金额，支付宝会按业务规则分配营销和买家自有资金分别退多少，默认优先退买家的自有资金。如交易总金额100元，用户支付时使用了80元自有资金和20元无资金流的营销券，商家实际收款80元。如果首次请求退款60元，则60元全部从商家收款资金扣除退回给用户自有资产；如果再请求退款40元，则从商家收款资金扣除20元退回用户资产以及把20元的营销券退回给用户（券是否可再使用取决于券的规则配置）。")

  public String getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
  }


  public AlipayTradeRefundModel refundCurrency(String refundCurrency) {
    
    this.refundCurrency = refundCurrency;
    return this;
  }

   /**
   * 订单退款币种信息。支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
   * @return refundCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "订单退款币种信息。支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY")

  public String getRefundCurrency() {
    return refundCurrency;
  }


  public void setRefundCurrency(String refundCurrency) {
    this.refundCurrency = refundCurrency;
  }


  public AlipayTradeRefundModel refundGoodsDetail(List<RefundGoodsDetail> refundGoodsDetail) {
    
    this.refundGoodsDetail = refundGoodsDetail;
    return this;
  }

  public AlipayTradeRefundModel addRefundGoodsDetailItem(RefundGoodsDetail refundGoodsDetailItem) {
    if (this.refundGoodsDetail == null) {
      this.refundGoodsDetail = new ArrayList<>();
    }
    this.refundGoodsDetail.add(refundGoodsDetailItem);
    return this;
  }

   /**
   * 退款包含的商品列表信息
   * @return refundGoodsDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "退款包含的商品列表信息")

  public List<RefundGoodsDetail> getRefundGoodsDetail() {
    return refundGoodsDetail;
  }


  public void setRefundGoodsDetail(List<RefundGoodsDetail> refundGoodsDetail) {
    this.refundGoodsDetail = refundGoodsDetail;
  }


  public AlipayTradeRefundModel refundReason(String refundReason) {
    
    this.refundReason = refundReason;
    return this;
  }

   /**
   * 退款原因说明。 商家自定义，将在会在商户和用户的pc退款账单详情中展示
   * @return refundReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "正常退款", value = "退款原因说明。 商家自定义，将在会在商户和用户的pc退款账单详情中展示")

  public String getRefundReason() {
    return refundReason;
  }


  public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
  }


  public AlipayTradeRefundModel refundRoyaltyParameters(List<OpenApiRoyaltyDetailInfoPojo> refundRoyaltyParameters) {
    
    this.refundRoyaltyParameters = refundRoyaltyParameters;
    return this;
  }

  public AlipayTradeRefundModel addRefundRoyaltyParametersItem(OpenApiRoyaltyDetailInfoPojo refundRoyaltyParametersItem) {
    if (this.refundRoyaltyParameters == null) {
      this.refundRoyaltyParameters = new ArrayList<>();
    }
    this.refundRoyaltyParameters.add(refundRoyaltyParametersItem);
    return this;
  }

   /**
   * 退分账明细信息。  注： 1.当面付且非直付通模式无需传入退分账明细，系统自动按退款金额与订单金额的比率，从收款方和分账收入方退款，不支持指定退款金额与退款方。  2.直付通模式，电脑网站支付，手机 APP 支付，手机网站支付产品，须在退款请求中明确是否退分账，从哪个分账收入方退，退多少分账金额；如不明确，默认从收款方退款，收款方余额不足退款失败。不支持系统按比率退款。
   * @return refundRoyaltyParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "退分账明细信息。  注： 1.当面付且非直付通模式无需传入退分账明细，系统自动按退款金额与订单金额的比率，从收款方和分账收入方退款，不支持指定退款金额与退款方。  2.直付通模式，电脑网站支付，手机 APP 支付，手机网站支付产品，须在退款请求中明确是否退分账，从哪个分账收入方退，退多少分账金额；如不明确，默认从收款方退款，收款方余额不足退款失败。不支持系统按比率退款。")

  public List<OpenApiRoyaltyDetailInfoPojo> getRefundRoyaltyParameters() {
    return refundRoyaltyParameters;
  }


  public void setRefundRoyaltyParameters(List<OpenApiRoyaltyDetailInfoPojo> refundRoyaltyParameters) {
    this.refundRoyaltyParameters = refundRoyaltyParameters;
  }


  public AlipayTradeRefundModel refundTransOut(String refundTransOut) {
    
    this.refundTransOut = refundTransOut;
    return this;
  }

   /**
   * 指定退款账号，对应指定账号退款合约中的约定账号  与refund_trans_out_type绑定使用 1、refund_trans_out_type&#x3D;userId时，传入对应的支付宝2088账号 2、refund_trans_out_type&#x3D;loginName时，传入对应的支付宝账号登录名
   * @return refundTransOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxxxxx", value = "指定退款账号，对应指定账号退款合约中的约定账号  与refund_trans_out_type绑定使用 1、refund_trans_out_type=userId时，传入对应的支付宝2088账号 2、refund_trans_out_type=loginName时，传入对应的支付宝账号登录名")

  public String getRefundTransOut() {
    return refundTransOut;
  }


  public void setRefundTransOut(String refundTransOut) {
    this.refundTransOut = refundTransOut;
  }


  public AlipayTradeRefundModel refundTransOutType(String refundTransOutType) {
    
    this.refundTransOutType = refundTransOutType;
    return this;
  }

   /**
   * 指定退款账号类型 userId：支付宝账号id loginName：支付宝账号登录名
   * @return refundTransOutType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "userId", value = "指定退款账号类型 userId：支付宝账号id loginName：支付宝账号登录名")

  public String getRefundTransOutType() {
    return refundTransOutType;
  }


  public void setRefundTransOutType(String refundTransOutType) {
    this.refundTransOutType = refundTransOutType;
  }


  public AlipayTradeRefundModel relatedSettleConfirmNo(String relatedSettleConfirmNo) {
    
    this.relatedSettleConfirmNo = relatedSettleConfirmNo;
    return this;
  }

   /**
   * 针对账期交易，在确认结算后退款的话，需要指定确认结算时的结算单号。
   * @return relatedSettleConfirmNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2024041122001495000530302869", value = "针对账期交易，在确认结算后退款的话，需要指定确认结算时的结算单号。")

  public String getRelatedSettleConfirmNo() {
    return relatedSettleConfirmNo;
  }


  public void setRelatedSettleConfirmNo(String relatedSettleConfirmNo) {
    this.relatedSettleConfirmNo = relatedSettleConfirmNo;
  }


  public AlipayTradeRefundModel storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 商户门店编号，由商家自定义。需保证当前商户下唯一。
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NJ_S_001", value = "商户门店编号，由商家自定义。需保证当前商户下唯一。")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public AlipayTradeRefundModel terminalId(String terminalId) {
    
    this.terminalId = terminalId;
    return this;
  }

   /**
   * 商户的终端编号
   * @return terminalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NJ_T_001", value = "商户的终端编号")

  public String getTerminalId() {
    return terminalId;
  }


  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  public AlipayTradeRefundModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号。 和商户订单号 out_trade_no 不能同时为空，两者同时存在时，优先取值trade_no
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014112611001004680073956707", value = "支付宝交易号。 和商户订单号 out_trade_no 不能同时为空，两者同时存在时，优先取值trade_no")

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
   * @return the AlipayTradeRefundModel instance itself
   */
  public AlipayTradeRefundModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeRefundModel alipayTradeRefundModel = (AlipayTradeRefundModel) o;
    return Objects.equals(this.goodsDetail, alipayTradeRefundModel.goodsDetail) &&
        Objects.equals(this.operatorId, alipayTradeRefundModel.operatorId) &&
        Objects.equals(this.orgPid, alipayTradeRefundModel.orgPid) &&
        Objects.equals(this.outRequestNo, alipayTradeRefundModel.outRequestNo) &&
        Objects.equals(this.outTradeNo, alipayTradeRefundModel.outTradeNo) &&
        Objects.equals(this.queryOptions, alipayTradeRefundModel.queryOptions) &&
        Objects.equals(this.refundAdvanceAccount, alipayTradeRefundModel.refundAdvanceAccount) &&
        Objects.equals(this.refundAdvanceAccountType, alipayTradeRefundModel.refundAdvanceAccountType) &&
        Objects.equals(this.refundAmount, alipayTradeRefundModel.refundAmount) &&
        Objects.equals(this.refundCurrency, alipayTradeRefundModel.refundCurrency) &&
        Objects.equals(this.refundGoodsDetail, alipayTradeRefundModel.refundGoodsDetail) &&
        Objects.equals(this.refundReason, alipayTradeRefundModel.refundReason) &&
        Objects.equals(this.refundRoyaltyParameters, alipayTradeRefundModel.refundRoyaltyParameters) &&
        Objects.equals(this.refundTransOut, alipayTradeRefundModel.refundTransOut) &&
        Objects.equals(this.refundTransOutType, alipayTradeRefundModel.refundTransOutType) &&
        Objects.equals(this.relatedSettleConfirmNo, alipayTradeRefundModel.relatedSettleConfirmNo) &&
        Objects.equals(this.storeId, alipayTradeRefundModel.storeId) &&
        Objects.equals(this.terminalId, alipayTradeRefundModel.terminalId) &&
        Objects.equals(this.tradeNo, alipayTradeRefundModel.tradeNo)&&
        Objects.equals(this.additionalProperties, alipayTradeRefundModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsDetail, operatorId, orgPid, outRequestNo, outTradeNo, queryOptions, refundAdvanceAccount, refundAdvanceAccountType, refundAmount, refundCurrency, refundGoodsDetail, refundReason, refundRoyaltyParameters, refundTransOut, refundTransOutType, relatedSettleConfirmNo, storeId, terminalId, tradeNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeRefundModel {\n");
    sb.append("    goodsDetail: ").append(toIndentedString(goodsDetail)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    orgPid: ").append(toIndentedString(orgPid)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    queryOptions: ").append(toIndentedString(queryOptions)).append("\n");
    sb.append("    refundAdvanceAccount: ").append(toIndentedString(refundAdvanceAccount)).append("\n");
    sb.append("    refundAdvanceAccountType: ").append(toIndentedString(refundAdvanceAccountType)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundCurrency: ").append(toIndentedString(refundCurrency)).append("\n");
    sb.append("    refundGoodsDetail: ").append(toIndentedString(refundGoodsDetail)).append("\n");
    sb.append("    refundReason: ").append(toIndentedString(refundReason)).append("\n");
    sb.append("    refundRoyaltyParameters: ").append(toIndentedString(refundRoyaltyParameters)).append("\n");
    sb.append("    refundTransOut: ").append(toIndentedString(refundTransOut)).append("\n");
    sb.append("    refundTransOutType: ").append(toIndentedString(refundTransOutType)).append("\n");
    sb.append("    relatedSettleConfirmNo: ").append(toIndentedString(relatedSettleConfirmNo)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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
    openapiFields.add("goods_detail");
    openapiFields.add("operator_id");
    openapiFields.add("org_pid");
    openapiFields.add("out_request_no");
    openapiFields.add("out_trade_no");
    openapiFields.add("query_options");
    openapiFields.add("refund_advance_account");
    openapiFields.add("refund_advance_account_type");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_currency");
    openapiFields.add("refund_goods_detail");
    openapiFields.add("refund_reason");
    openapiFields.add("refund_royalty_parameters");
    openapiFields.add("refund_trans_out");
    openapiFields.add("refund_trans_out_type");
    openapiFields.add("related_settle_confirm_no");
    openapiFields.add("store_id");
    openapiFields.add("terminal_id");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeRefundModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeRefundModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeRefundModel is not found in the empty JSON string", AlipayTradeRefundModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArraygoodsDetail = jsonObj.getAsJsonArray("goods_detail");
      if (jsonArraygoodsDetail != null) {
        // ensure the json data is an array
        if (!jsonObj.get("goods_detail").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `goods_detail` to be an array in the JSON string but got `%s`", jsonObj.get("goods_detail").toString()));
        }

        // validate the optional field `goods_detail` (array)
        for (int i = 0; i < jsonArraygoodsDetail.size(); i++) {
          GoodsDetail.validateJsonObject(jsonArraygoodsDetail.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("operator_id") != null && !jsonObj.get("operator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator_id").toString()));
      }
      if (jsonObj.get("org_pid") != null && !jsonObj.get("org_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_pid").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("query_options") != null && !jsonObj.get("query_options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_options` to be an array in the JSON string but got `%s`", jsonObj.get("query_options").toString()));
      }
      if (jsonObj.get("refund_advance_account") != null && !jsonObj.get("refund_advance_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_advance_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_advance_account").toString()));
      }
      if (jsonObj.get("refund_advance_account_type") != null && !jsonObj.get("refund_advance_account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_advance_account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_advance_account_type").toString()));
      }
      if (jsonObj.get("refund_amount") != null && !jsonObj.get("refund_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_amount").toString()));
      }
      if (jsonObj.get("refund_currency") != null && !jsonObj.get("refund_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_currency").toString()));
      }
      JsonArray jsonArrayrefundGoodsDetail = jsonObj.getAsJsonArray("refund_goods_detail");
      if (jsonArrayrefundGoodsDetail != null) {
        // ensure the json data is an array
        if (!jsonObj.get("refund_goods_detail").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `refund_goods_detail` to be an array in the JSON string but got `%s`", jsonObj.get("refund_goods_detail").toString()));
        }

        // validate the optional field `refund_goods_detail` (array)
        for (int i = 0; i < jsonArrayrefundGoodsDetail.size(); i++) {
          RefundGoodsDetail.validateJsonObject(jsonArrayrefundGoodsDetail.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("refund_reason") != null && !jsonObj.get("refund_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_reason").toString()));
      }
      JsonArray jsonArrayrefundRoyaltyParameters = jsonObj.getAsJsonArray("refund_royalty_parameters");
      if (jsonArrayrefundRoyaltyParameters != null) {
        // ensure the json data is an array
        if (!jsonObj.get("refund_royalty_parameters").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `refund_royalty_parameters` to be an array in the JSON string but got `%s`", jsonObj.get("refund_royalty_parameters").toString()));
        }

        // validate the optional field `refund_royalty_parameters` (array)
        for (int i = 0; i < jsonArrayrefundRoyaltyParameters.size(); i++) {
          OpenApiRoyaltyDetailInfoPojo.validateJsonObject(jsonArrayrefundRoyaltyParameters.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("refund_trans_out") != null && !jsonObj.get("refund_trans_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_trans_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_trans_out").toString()));
      }
      if (jsonObj.get("refund_trans_out_type") != null && !jsonObj.get("refund_trans_out_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_trans_out_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_trans_out_type").toString()));
      }
      if (jsonObj.get("related_settle_confirm_no") != null && !jsonObj.get("related_settle_confirm_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_settle_confirm_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("related_settle_confirm_no").toString()));
      }
      if (jsonObj.get("store_id") != null && !jsonObj.get("store_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_id").toString()));
      }
      if (jsonObj.get("terminal_id") != null && !jsonObj.get("terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_id").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeRefundModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeRefundModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeRefundModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeRefundModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeRefundModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeRefundModel value) throws IOException {
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
           public AlipayTradeRefundModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeRefundModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeRefundModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeRefundModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeRefundModel
  */
  public static AlipayTradeRefundModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeRefundModel.class);
  }

 /**
  * Convert an instance of AlipayTradeRefundModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

