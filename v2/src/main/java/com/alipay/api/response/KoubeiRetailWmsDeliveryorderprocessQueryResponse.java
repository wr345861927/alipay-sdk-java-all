package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryOrderProcessVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.deliveryorderprocess.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:07:41
 */
public class KoubeiRetailWmsDeliveryorderprocessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7268866237379219787L;

	/** 
	 * 物流单据状态列表
	 */
	@ApiListField("delivery_order_process_vo_list")
	@ApiField("delivery_order_process_v_o")
	private List<DeliveryOrderProcessVO> deliveryOrderProcessVoList;

	public void setDeliveryOrderProcessVoList(List<DeliveryOrderProcessVO> deliveryOrderProcessVoList) {
		this.deliveryOrderProcessVoList = deliveryOrderProcessVoList;
	}
	public List<DeliveryOrderProcessVO> getDeliveryOrderProcessVoList( ) {
		return this.deliveryOrderProcessVoList;
	}

}
