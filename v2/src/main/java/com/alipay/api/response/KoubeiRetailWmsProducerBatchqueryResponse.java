package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProducerVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.producer.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class KoubeiRetailWmsProducerBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8459568242147993771L;

	/** 
	 * 生产厂商信息
	 */
	@ApiListField("producers")
	@ApiField("producer_v_o")
	private List<ProducerVO> producers;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setProducers(List<ProducerVO> producers) {
		this.producers = producers;
	}
	public List<ProducerVO> getProducers( ) {
		return this.producers;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
