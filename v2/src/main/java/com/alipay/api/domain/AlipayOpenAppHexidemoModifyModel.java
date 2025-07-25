package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新流程测试接口
 *
 * @author auto create
 * @since 1.0, 2024-12-06 11:27:20
 */
public class AlipayOpenAppHexidemoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2341334527348636267L;

	/**
	 * 查询对象
	 */
	@ApiField("model")
	private HeXiQueryVo model;

	/**
	 * queryString查询
	 */
	@ApiField("query")
	private String query;

	public HeXiQueryVo getModel() {
		return this.model;
	}
	public void setModel(HeXiQueryVo model) {
		this.model = model;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}
