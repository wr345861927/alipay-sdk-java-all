package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取取消订单或退货指令接口
 *
 * @author auto create
 * @since 1.0, 2023-04-14 10:29:53
 */
public class AntMerchantExpandAssetreverseAssignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5585852455337186839L;

	/**
	 * 每次拉取最大记录数量，可选值为[1,200] ;
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
