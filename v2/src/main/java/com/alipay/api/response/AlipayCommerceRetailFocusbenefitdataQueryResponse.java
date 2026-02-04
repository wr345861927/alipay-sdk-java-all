package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.focusbenefitdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-02 16:27:42
 */
public class AlipayCommerceRetailFocusbenefitdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4322157673137826341L;

	/** 
	 * 返回数据信息
	 */
	@ApiField("data_list")
	private String dataList;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/** 
	 * 页码
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setDataList(String dataList) {
		this.dataList = dataList;
	}
	public String getDataList( ) {
		return this.dataList;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}
	public String getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
