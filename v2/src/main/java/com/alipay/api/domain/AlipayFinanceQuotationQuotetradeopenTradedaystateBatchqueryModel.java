package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询一段日期范围的交易市场状态
 *
 * @author auto create
 * @since 1.0, 2025-04-16 11:41:25
 */
public class AlipayFinanceQuotationQuotetradeopenTradedaystateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8852551756941241157L;

	/**
	 * 查询的开始日期, 格式为 yyyyMMdd
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 查询的开始日期, 格式为 yyyyMMdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 市场, 查询该市场的交易日
	 */
	@ApiField("market")
	private String market;

	public String getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getMarket() {
		return this.market;
	}
	public void setMarket(String market) {
		this.market = market;
	}

}
