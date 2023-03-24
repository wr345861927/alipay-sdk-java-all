package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MarketingDeliveryDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.templatemsg.maketing.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:16:48
 */
public class AlipayOpenMiniTemplatemsgMaketingBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1698625938518826717L;

	/** 
	 * 投放详情列表
	 */
	@ApiListField("marketing_delivery_detail_list")
	@ApiField("marketing_delivery_detail")
	private List<MarketingDeliveryDetail> marketingDeliveryDetailList;

	/** 
	 * 投放详情总条数
	 */
	@ApiField("total")
	private Long total;

	public void setMarketingDeliveryDetailList(List<MarketingDeliveryDetail> marketingDeliveryDetailList) {
		this.marketingDeliveryDetailList = marketingDeliveryDetailList;
	}
	public List<MarketingDeliveryDetail> getMarketingDeliveryDetailList( ) {
		return this.marketingDeliveryDetailList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
