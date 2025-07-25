package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询节点之间的父子关系
 *
 * @author auto create
 * @since 1.0, 2023-08-15 11:42:46
 */
public class AlipayMerchantNetworkRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4371839949457856487L;

	/**
	 * 商家的网络节点ID，一般为商家系统的公司，部门等关系之间的一ID
	 */
	@ApiField("merchant_node_id")
	private String merchantNodeId;

	/**
	 * 商家网络类型
	 */
	@ApiField("network_type")
	private String networkType;

	/**
	 * 增加当前商家的网络节点ID的父节点ID
	 */
	@ApiField("parent_merchant_node_id")
	private String parentMerchantNodeId;

	/**
	 * 商家网络的根节点，一般为总部企业账号PID （邀测阶段为商家与支付宝产生合作，由支付宝进行协商提供给商家）
	 */
	@ApiField("root_id")
	private String rootId;

	public String getMerchantNodeId() {
		return this.merchantNodeId;
	}
	public void setMerchantNodeId(String merchantNodeId) {
		this.merchantNodeId = merchantNodeId;
	}

	public String getNetworkType() {
		return this.networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getParentMerchantNodeId() {
		return this.parentMerchantNodeId;
	}
	public void setParentMerchantNodeId(String parentMerchantNodeId) {
		this.parentMerchantNodeId = parentMerchantNodeId;
	}

	public String getRootId() {
		return this.rootId;
	}
	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

}
