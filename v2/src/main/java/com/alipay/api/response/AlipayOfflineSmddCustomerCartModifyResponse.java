package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SkuBean;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.customer.cart.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-27 14:22:28
 */
public class AlipayOfflineSmddCustomerCartModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6759299843376484112L;

	/** 
	 * 优惠文案信息
	 */
	@ApiField("discount_text")
	private String discountText;

	/** 
	 * 优惠金额
	 */
	@ApiField("discounted_price")
	private String discountedPrice;

	/** 
	 * 友好地异常信息（可以直接透出）
	 */
	@ApiField("exception_msg")
	private String exceptionMsg;

	/** 
	 * 购物车原价
	 */
	@ApiField("original_price")
	private String originalPrice;

	/** 
	 * 支付价
	 */
	@ApiField("payment_price")
	private String paymentPrice;

	/** 
	 * sku列表
	 */
	@ApiListField("sku_list")
	@ApiField("sku_bean")
	private List<SkuBean> skuList;

	/** 
	 * 商品总数
	 */
	@ApiField("total_item")
	private Long totalItem;

	public void setDiscountText(String discountText) {
		this.discountText = discountText;
	}
	public String getDiscountText( ) {
		return this.discountText;
	}

	public void setDiscountedPrice(String discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public String getDiscountedPrice( ) {
		return this.discountedPrice;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	public String getExceptionMsg( ) {
		return this.exceptionMsg;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getOriginalPrice( ) {
		return this.originalPrice;
	}

	public void setPaymentPrice(String paymentPrice) {
		this.paymentPrice = paymentPrice;
	}
	public String getPaymentPrice( ) {
		return this.paymentPrice;
	}

	public void setSkuList(List<SkuBean> skuList) {
		this.skuList = skuList;
	}
	public List<SkuBean> getSkuList( ) {
		return this.skuList;
	}

	public void setTotalItem(Long totalItem) {
		this.totalItem = totalItem;
	}
	public Long getTotalItem( ) {
		return this.totalItem;
	}

}
