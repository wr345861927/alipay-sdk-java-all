package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.health.activity.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:44:16
 */
public class AlipayInsSceneHealthActivitySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4565441667424248557L;

	/** 
	 * 申请编号，成功返回原申请编号，失败为空
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
