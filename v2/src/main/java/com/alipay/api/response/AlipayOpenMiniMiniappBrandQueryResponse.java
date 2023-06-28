package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantBrandListResult;
import com.alipay.api.domain.MiniappBrandAuditResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.brand.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 11:51:17
 */
public class AlipayOpenMiniMiniappBrandQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5265419969587921551L;

	/** 
	 * 商户已有品牌
	 */
	@ApiField("merchant_brand_list_result")
	private MerchantBrandListResult merchantBrandListResult;

	/** 
	 * 小程序品牌认证结果
	 */
	@ApiField("miniapp_brand_audit_result")
	private MiniappBrandAuditResult miniappBrandAuditResult;

	public void setMerchantBrandListResult(MerchantBrandListResult merchantBrandListResult) {
		this.merchantBrandListResult = merchantBrandListResult;
	}
	public MerchantBrandListResult getMerchantBrandListResult( ) {
		return this.merchantBrandListResult;
	}

	public void setMiniappBrandAuditResult(MiniappBrandAuditResult miniappBrandAuditResult) {
		this.miniappBrandAuditResult = miniappBrandAuditResult;
	}
	public MiniappBrandAuditResult getMiniappBrandAuditResult( ) {
		return this.miniappBrandAuditResult;
	}

}
