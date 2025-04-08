package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * jianhui测试查询
 *
 * @author auto create
 * @since 1.0, 2025-04-01 16:27:29
 */
public class AlipayOpenServicemarketTestJianhuiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2334692346777488853L;

	/**
	 * 测试用
	 */
	@ApiField("jianhui_test")
	private JhUserPageDetailTest jianhuiTest;

	/**
	 * 页面显示数量
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页码数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 总条数
	 */
	@ApiField("total")
	private Long total;

	public JhUserPageDetailTest getJianhuiTest() {
		return this.jianhuiTest;
	}
	public void setJianhuiTest(JhUserPageDetailTest jianhuiTest) {
		this.jianhuiTest = jianhuiTest;
	}

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

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
