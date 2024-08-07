package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IcpProvinceAreaItemList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.icp.area.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-26 17:21:56
 */
public class AlipayOpenMiniIcpAreaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8592751781943494712L;

	/** 
	 * 省市区列表信息
	 */
	@ApiListField("area_items")
	@ApiField("icp_province_area_item_list")
	private List<IcpProvinceAreaItemList> areaItems;

	public void setAreaItems(List<IcpProvinceAreaItemList> areaItems) {
		this.areaItems = areaItems;
	}
	public List<IcpProvinceAreaItemList> getAreaItems( ) {
		return this.areaItems;
	}

}
