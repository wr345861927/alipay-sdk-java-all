package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量有密跳端支付
 *
 * @author auto create
 * @since 1.0, 2024-04-29 10:54:59
 */
public class AlipayFundBatchAppPayModel extends AlipayObject {

	private static final long serialVersionUID = 5669662511724325757L;

	/**
	 * 支付宝内部批次号
	 */
	@ApiField("batch_trans_id")
	private String batchTransId;

	public String getBatchTransId() {
		return this.batchTransId;
	}
	public void setBatchTransId(String batchTransId) {
		this.batchTransId = batchTransId;
	}

}
