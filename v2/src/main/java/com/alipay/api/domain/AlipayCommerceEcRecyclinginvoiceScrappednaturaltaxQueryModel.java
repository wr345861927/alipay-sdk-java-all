package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商税务信息查询
 *
 * @author auto create
 * @since 1.0, 2026-02-02 10:36:08
 */
public class AlipayCommerceEcRecyclinginvoiceScrappednaturaltaxQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6192272745972599873L;

	/**
	 * 新增成功的供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
