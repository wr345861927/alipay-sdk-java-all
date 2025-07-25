package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群广告屏蔽分页查询
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:25
 */
public class AlipayMerchantGroupGroupcontrolBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8551295655219244331L;

	/**
	 * 当前第几页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页展示条数，最大展示50条
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
