package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反洗钱制裁扫描风险筛查
 *
 * @author auto create
 * @since 1.0, 2026-04-13 17:09:03
 */
public class AlipaySecurityRiskSanctionWatchlistCheckModel extends AlipayObject {

	private static final long serialVersionUID = 6187679771957547199L;

	/**
	 * null
	 */
	@ApiListField("pbc_scan_params")
	@ApiField("p_b_c_scan_param")
	private List<PBCScanParam> pbcScanParams;

	public List<PBCScanParam> getPbcScanParams() {
		return this.pbcScanParams;
	}
	public void setPbcScanParams(List<PBCScanParam> pbcScanParams) {
		this.pbcScanParams = pbcScanParams;
	}

}
