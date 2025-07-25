package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentOrderReceiverAddressInfoVO;
import com.alipay.api.domain.RentOrderDeliveryInfoVO;
import com.alipay.api.domain.RentGoodsDetailInfoVO;
import com.alipay.api.domain.RentPathInfoVO;
import com.alipay.api.domain.RentOrderPriceInfoVO;
import com.alipay.api.domain.RentPromoInfoVO;
import com.alipay.api.domain.RentPlanInfoVO;
import com.alipay.api.domain.RentSignInfoVO;
import com.alipay.api.domain.RentOrderStatementInfoVO;
import com.alipay.api.domain.RentSubMerchantVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-16 13:42:33
 */
public class AlipayCommerceRentOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3355339418882655224L;

	/** 
	 * 订单收货地址
	 */
	@ApiField("address_info")
	private RentOrderReceiverAddressInfoVO addressInfo;

	/** 
	 * 买家支付宝用户id，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/** 
	 * 默认退货寄回地址
	 */
	@ApiField("default_receiving_address")
	private RentOrderReceiverAddressInfoVO defaultReceivingAddress;

	/** 
	 * 订单履约信息
	 */
	@ApiField("delivery_info")
	private RentOrderDeliveryInfoVO deliveryInfo;

	/** 
	 * 商品详细信息。当前只会有单个商品
	 */
	@ApiListField("item_infos")
	@ApiField("rent_goods_detail_info_v_o")
	private List<RentGoodsDetailInfoVO> itemInfos;

	/** 
	 * 订单备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/** 
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 租赁订单页面地址信息
	 */
	@ApiField("path_info")
	private RentPathInfoVO pathInfo;

	/** 
	 * 订单金额信息
	 */
	@ApiField("price_info")
	private RentOrderPriceInfoVO priceInfo;

	/** 
	 * 优惠信息，包含分期优惠
	 */
	@ApiField("promo_info")
	private RentPromoInfoVO promoInfo;

	/** 
	 * 租赁计划信息
	 */
	@ApiField("rent_plan_info")
	private RentPlanInfoVO rentPlanInfo;

	/** 
	 * 租赁订单支付产品、信用产品签约信息
	 */
	@ApiField("rent_sign_info")
	private RentSignInfoVO rentSignInfo;

	/** 
	 * 租赁账单信息
	 */
	@ApiListField("rent_statement_infos")
	@ApiField("rent_order_statement_info_v_o")
	private List<RentOrderStatementInfoVO> rentStatementInfos;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 二级商户信息
	 */
	@ApiField("sub_merchant")
	private RentSubMerchantVO subMerchant;

	/** 
	 * 租赁订单标题，用于支付宝小程序订单中心、芝麻租赁频道中对用户展示
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 当商家收单appid与下单appid不一致时才有值
	 */
	@ApiField("trade_app_id")
	private String tradeAppId;

	public void setAddressInfo(RentOrderReceiverAddressInfoVO addressInfo) {
		this.addressInfo = addressInfo;
	}
	public RentOrderReceiverAddressInfoVO getAddressInfo( ) {
		return this.addressInfo;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}
	public String getBuyerOpenId( ) {
		return this.buyerOpenId;
	}

	public void setDefaultReceivingAddress(RentOrderReceiverAddressInfoVO defaultReceivingAddress) {
		this.defaultReceivingAddress = defaultReceivingAddress;
	}
	public RentOrderReceiverAddressInfoVO getDefaultReceivingAddress( ) {
		return this.defaultReceivingAddress;
	}

	public void setDeliveryInfo(RentOrderDeliveryInfoVO deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}
	public RentOrderDeliveryInfoVO getDeliveryInfo( ) {
		return this.deliveryInfo;
	}

	public void setItemInfos(List<RentGoodsDetailInfoVO> itemInfos) {
		this.itemInfos = itemInfos;
	}
	public List<RentGoodsDetailInfoVO> getItemInfos( ) {
		return this.itemInfos;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}
	public Date getOrderCreateTime( ) {
		return this.orderCreateTime;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setPathInfo(RentPathInfoVO pathInfo) {
		this.pathInfo = pathInfo;
	}
	public RentPathInfoVO getPathInfo( ) {
		return this.pathInfo;
	}

	public void setPriceInfo(RentOrderPriceInfoVO priceInfo) {
		this.priceInfo = priceInfo;
	}
	public RentOrderPriceInfoVO getPriceInfo( ) {
		return this.priceInfo;
	}

	public void setPromoInfo(RentPromoInfoVO promoInfo) {
		this.promoInfo = promoInfo;
	}
	public RentPromoInfoVO getPromoInfo( ) {
		return this.promoInfo;
	}

	public void setRentPlanInfo(RentPlanInfoVO rentPlanInfo) {
		this.rentPlanInfo = rentPlanInfo;
	}
	public RentPlanInfoVO getRentPlanInfo( ) {
		return this.rentPlanInfo;
	}

	public void setRentSignInfo(RentSignInfoVO rentSignInfo) {
		this.rentSignInfo = rentSignInfo;
	}
	public RentSignInfoVO getRentSignInfo( ) {
		return this.rentSignInfo;
	}

	public void setRentStatementInfos(List<RentOrderStatementInfoVO> rentStatementInfos) {
		this.rentStatementInfos = rentStatementInfos;
	}
	public List<RentOrderStatementInfoVO> getRentStatementInfos( ) {
		return this.rentStatementInfos;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubMerchant(RentSubMerchantVO subMerchant) {
		this.subMerchant = subMerchant;
	}
	public RentSubMerchantVO getSubMerchant( ) {
		return this.subMerchant;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setTradeAppId(String tradeAppId) {
		this.tradeAppId = tradeAppId;
	}
	public String getTradeAppId( ) {
		return this.tradeAppId;
	}

}
