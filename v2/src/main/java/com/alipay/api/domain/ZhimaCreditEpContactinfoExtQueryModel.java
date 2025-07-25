package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业联系方式查询服务增强版
 *
 * @author auto create
 * @since 1.0, 2024-08-20 17:41:20
 */
public class ZhimaCreditEpContactinfoExtQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6871941216788655261L;

	/**
	 * 社会统一信用代码、注册号、企业名可任选一个入参，建议优先使用统代
	 */
	@ApiField("company_key")
	private String companyKey;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getCompanyKey() {
		return this.companyKey;
	}
	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
