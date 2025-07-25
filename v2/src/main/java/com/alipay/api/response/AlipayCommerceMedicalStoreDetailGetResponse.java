package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StoreInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.store.detail.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-20 15:32:29
 */
public class AlipayCommerceMedicalStoreDetailGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1478415295859656417L;

	/** 
	 * 门店详情列表
	 */
	@ApiListField("records")
	@ApiField("store_info_v_o")
	private List<StoreInfoVO> records;

	public void setRecords(List<StoreInfoVO> records) {
		this.records = records;
	}
	public List<StoreInfoVO> getRecords( ) {
		return this.records;
	}

}
