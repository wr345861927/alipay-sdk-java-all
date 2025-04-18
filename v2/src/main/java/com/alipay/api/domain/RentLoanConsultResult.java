package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-02 16:32:26
 */
public class RentLoanConsultResult extends AlipayObject {

	private static final long serialVersionUID = 1192282672428814696L;

	/**
	 * ALLOW：表示允许放款
FORBID：表示不允许放款
	 */
	@ApiField("consult_result")
	private String consultResult;

	/**
	 * 资方信息的pid
	 */
	@ApiField("invest_pid")
	private String investPid;

	public String getConsultResult() {
		return this.consultResult;
	}
	public void setConsultResult(String consultResult) {
		this.consultResult = consultResult;
	}

	public String getInvestPid() {
		return this.investPid;
	}
	public void setInvestPid(String investPid) {
		this.investPid = investPid;
	}

}
