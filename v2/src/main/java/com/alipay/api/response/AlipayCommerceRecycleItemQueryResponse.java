package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RecycleItemDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-13 19:42:26
 */
public class AlipayCommerceRecycleItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1618292558336592467L;

	/** 
	 * 回收商品，包含回收商品的款式、价格、状态等信息
	 */
	@ApiField("recycle_item_dto")
	private RecycleItemDTO recycleItemDto;

	public void setRecycleItemDto(RecycleItemDTO recycleItemDto) {
		this.recycleItemDto = recycleItemDto;
	}
	public RecycleItemDTO getRecycleItemDto( ) {
		return this.recycleItemDto;
	}

}
