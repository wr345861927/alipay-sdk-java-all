package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询贷款记录详情
 *
 * @author auto create
 * @since 1.0, 2018-11-14 14:26:54
 */
public class AlipayPcreditLoanLoanDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4652928118829699317L;

	/**
	 * 贷款申请受理单号，与外部业务单号二者不能同时为空
	 */
	@ApiField("apply_receipt_no")
	private String applyReceiptNo;

	/**
	 * 外部业务单号，与贷款申请受理单号二者不能同时为空
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getApplyReceiptNo() {
		return this.applyReceiptNo;
	}
	public void setApplyReceiptNo(String applyReceiptNo) {
		this.applyReceiptNo = applyReceiptNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
