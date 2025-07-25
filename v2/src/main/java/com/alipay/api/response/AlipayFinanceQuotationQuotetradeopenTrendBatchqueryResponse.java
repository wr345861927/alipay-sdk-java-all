package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ObjTrendDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetradeopen.trend.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-16 11:41:40
 */
public class AlipayFinanceQuotationQuotetradeopenTrendBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5413759169857559227L;

	/** 
	 * 个股分时信息
	 */
	@ApiListField("data")
	@ApiField("obj_trend_d_t_o")
	private List<ObjTrendDTO> data;

	public void setData(List<ObjTrendDTO> data) {
		this.data = data;
	}
	public List<ObjTrendDTO> getData( ) {
		return this.data;
	}

}
