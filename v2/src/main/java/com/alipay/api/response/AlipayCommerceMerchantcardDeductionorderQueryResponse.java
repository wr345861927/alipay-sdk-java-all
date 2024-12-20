package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeductionOrderInfo;
import com.alipay.api.domain.DeductionRefundOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.deductionorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-12 19:57:20
 */
public class AlipayCommerceMerchantcardDeductionorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2594366688171321661L;

	/** 
	 * 核销订单信息
	 */
	@ApiField("deduction_order_info")
	private DeductionOrderInfo deductionOrderInfo;

	/** 
	 * 核销订单退款明细列表
	 */
	@ApiListField("deduction_refund_order_info_list")
	@ApiField("deduction_refund_order_info")
	private List<DeductionRefundOrderInfo> deductionRefundOrderInfoList;

	public void setDeductionOrderInfo(DeductionOrderInfo deductionOrderInfo) {
		this.deductionOrderInfo = deductionOrderInfo;
	}
	public DeductionOrderInfo getDeductionOrderInfo( ) {
		return this.deductionOrderInfo;
	}

	public void setDeductionRefundOrderInfoList(List<DeductionRefundOrderInfo> deductionRefundOrderInfoList) {
		this.deductionRefundOrderInfoList = deductionRefundOrderInfoList;
	}
	public List<DeductionRefundOrderInfo> getDeductionRefundOrderInfoList( ) {
		return this.deductionRefundOrderInfoList;
	}

}
