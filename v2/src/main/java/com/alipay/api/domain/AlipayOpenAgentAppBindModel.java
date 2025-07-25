package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绑定智能体ID
 *
 * @author auto create
 * @since 1.0, 2025-06-17 11:23:39
 */
public class AlipayOpenAgentAppBindModel extends AlipayObject {

	private static final long serialVersionUID = 3252249141522238856L;

	/**
	 * 百灵智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 智能体code
	 */
	@ApiField("app_agentcode")
	private String appAgentcode;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAppAgentcode() {
		return this.appAgentcode;
	}
	public void setAppAgentcode(String appAgentcode) {
		this.appAgentcode = appAgentcode;
	}

}
