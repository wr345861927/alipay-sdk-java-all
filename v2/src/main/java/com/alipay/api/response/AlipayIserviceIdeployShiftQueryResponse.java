package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShiftBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ideploy.shift.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-24 20:07:03
 */
public class AlipayIserviceIdeployShiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4448514927286536881L;

	/** 
	 * 班次信息
	 */
	@ApiListField("shift_list")
	@ApiField("shift_base_info")
	private List<ShiftBaseInfo> shiftList;

	public void setShiftList(List<ShiftBaseInfo> shiftList) {
		this.shiftList = shiftList;
	}
	public List<ShiftBaseInfo> getShiftList( ) {
		return this.shiftList;
	}

}
