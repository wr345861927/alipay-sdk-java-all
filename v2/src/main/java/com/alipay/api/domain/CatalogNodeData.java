package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌下可用类目详情
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:02:14
 */
public class CatalogNodeData extends AlipayObject {

	private static final long serialVersionUID = 1454799222345546964L;

	/**
	 * 类目id
	 */
	@ApiField("node_id")
	private String nodeId;

	/**
	 * 类目名称
	 */
	@ApiField("node_nm")
	private String nodeNm;

	public String getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getNodeNm() {
		return this.nodeNm;
	}
	public void setNodeNm(String nodeNm) {
		this.nodeNm = nodeNm;
	}

}
