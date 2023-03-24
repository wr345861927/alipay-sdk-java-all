package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivitySendVoucherResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.batchsend response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 22:36:41
 */
public class AlipayMarketingActivityOrdervoucherBatchsendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2114587473843981171L;

	/** 
	 * 发券结果列表
	 */
	@ApiListField("activity_send_voucher_result_info_list")
	@ApiField("activity_send_voucher_result_info")
	private List<ActivitySendVoucherResultInfo> activitySendVoucherResultInfoList;

	public void setActivitySendVoucherResultInfoList(List<ActivitySendVoucherResultInfo> activitySendVoucherResultInfoList) {
		this.activitySendVoucherResultInfoList = activitySendVoucherResultInfoList;
	}
	public List<ActivitySendVoucherResultInfo> getActivitySendVoucherResultInfoList( ) {
		return this.activitySendVoucherResultInfoList;
	}

}
