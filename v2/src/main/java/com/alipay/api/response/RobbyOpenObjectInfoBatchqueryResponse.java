package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ObjStatus;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: robby.open.object.info.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-12 13:00:18
 */
public class RobbyOpenObjectInfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7354793732839367115L;

	/** 
	 * null
	 */
	@ApiListField("object_status_list")
	@ApiField("obj_status")
	private List<ObjStatus> objectStatusList;

	public void setObjectStatusList(List<ObjStatus> objectStatusList) {
		this.objectStatusList = objectStatusList;
	}
	public List<ObjStatus> getObjectStatusList( ) {
		return this.objectStatusList;
	}

}
