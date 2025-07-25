package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家营销投放领域--代理的商户信息
 *
 * @author auto create
 * @since 1.0, 2024-06-26 10:59:20
 */
public class DeliveryAgencyMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 2818736828174338958L;

	/**
	 * 合作业务类型。
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 商户信息
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户id类型。 限制: 服务商代运营模式必传
如果merchant_id_type选择SMID。则表明当前商家券活动的归属者是该SMID所绑定的支付宝PID。 因此要求该SMID必须绑定相应的支付宝PID。
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantIdType() {
		return this.merchantIdType;
	}
	public void setMerchantIdType(String merchantIdType) {
		this.merchantIdType = merchantIdType;
	}

}
