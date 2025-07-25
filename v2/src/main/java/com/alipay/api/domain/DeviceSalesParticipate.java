package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备参与卖进活动的信息
 *
 * @author auto create
 * @since 1.0, 2025-02-28 15:29:56
 */
public class DeviceSalesParticipate extends AlipayObject {

	private static final long serialVersionUID = 3722372658971787416L;

	/**
	 * 活动 id（做任务得设备、先采后返的时候必有）
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 卖进订单id（有卖进活动的时候必有）
	 */
	@ApiField("sales_entry_order_id")
	private String salesEntryOrderId;

	/**
	 * 卖进方案id
	 */
	@ApiField("solution_id")
	private String solutionId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getSalesEntryOrderId() {
		return this.salesEntryOrderId;
	}
	public void setSalesEntryOrderId(String salesEntryOrderId) {
		this.salesEntryOrderId = salesEntryOrderId;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

}
