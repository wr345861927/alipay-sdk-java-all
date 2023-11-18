package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格详情信息模型
 *
 * @author auto create
 * @since 1.0, 2023-11-16 13:54:29
 */
public class PriceInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8728378379727134691L;

	/**
	 * 附加金额，单位：元，精确到小数点后两位。计算规则参考：https://opendocs.alipay.com/mini/077it9?pathHash=502012b2&ref=api#Q%EF%BC%9A%E5%88%9B%E5%BB%BA%E8%AE%A2%E5%8D%95%E6%97%B6%E7%9A%84%E4%BB%B7%E6%A0%BC%E5%85%AC%E5%BC%8F%E5%A6%82%E4%BD%95%E4%BC%A0%E9%80%92%EF%BC%9F
	 */
	@ApiField("additional_price")
	private String additionalPrice;

	/**
	 * 商家优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("discounted_price")
	private String discountedPrice;

	/**
	 * 运费，单位：元，精确到小数点后两位
	 */
	@ApiField("freight")
	private String freight;

	/**
	 * 商家侧储蓄卡金额，单位为元，精确到小数点后两位
	 */
	@ApiField("merchant_value_price")
	private String merchantValuePrice;

	/**
	 * 订单总价，单位：元,精确到小数点后两位
	 */
	@ApiField("order_price")
	private String orderPrice;

	public String getAdditionalPrice() {
		return this.additionalPrice;
	}
	public void setAdditionalPrice(String additionalPrice) {
		this.additionalPrice = additionalPrice;
	}

	public String getDiscountedPrice() {
		return this.discountedPrice;
	}
	public void setDiscountedPrice(String discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public String getFreight() {
		return this.freight;
	}
	public void setFreight(String freight) {
		this.freight = freight;
	}

	public String getMerchantValuePrice() {
		return this.merchantValuePrice;
	}
	public void setMerchantValuePrice(String merchantValuePrice) {
		this.merchantValuePrice = merchantValuePrice;
	}

	public String getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

}
