package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入库单查询接口
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:23:21
 */
public class KoubeiSalesKbassetStuffQuerystockinorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2746415686721555261L;

	/**
	 * 扩展字段，备用
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 分页查询当前查询页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页查询每页数据量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
