package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessPoint;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.business.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 15:07:31
 */
public class AlipayDataIotdataBusinessPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3692968256984683412L;

	/** 
	 * 业务点位信息列表
	 */
	@ApiListField("data")
	@ApiField("business_point")
	private List<BusinessPoint> data;

	public void setData(List<BusinessPoint> data) {
		this.data = data;
	}
	public List<BusinessPoint> getData( ) {
		return this.data;
	}

}
