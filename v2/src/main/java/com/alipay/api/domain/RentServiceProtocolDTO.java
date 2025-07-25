package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁服务协议
 *
 * @author auto create
 * @since 1.0, 2025-06-06 17:52:47
 */
public class RentServiceProtocolDTO extends AlipayObject {

	private static final long serialVersionUID = 4241919145433299964L;

	/**
	 * 租赁协议名称
	 */
	@ApiField("protocol_name")
	private String protocolName;

	/**
	 * 租赁协议地址，小程序page路径
	 */
	@ApiField("protocol_path")
	private String protocolPath;

	public String getProtocolName() {
		return this.protocolName;
	}
	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}

	public String getProtocolPath() {
		return this.protocolPath;
	}
	public void setProtocolPath(String protocolPath) {
		this.protocolPath = protocolPath;
	}

}
