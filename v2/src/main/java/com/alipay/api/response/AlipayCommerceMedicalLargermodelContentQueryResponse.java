package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PageContentCardDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.content.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-23 11:19:49
 */
public class AlipayCommerceMedicalLargermodelContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6239432265337571758L;

	/** 
	 * 卡片数据列表
	 */
	@ApiListField("list")
	@ApiField("page_content_card_detail")
	private List<PageContentCardDetail> list;

	public void setList(List<PageContentCardDetail> list) {
		this.list = list;
	}
	public List<PageContentCardDetail> getList( ) {
		return this.list;
	}

}
