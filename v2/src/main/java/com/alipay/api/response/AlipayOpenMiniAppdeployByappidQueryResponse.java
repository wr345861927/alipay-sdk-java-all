package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppDeployResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.appdeploy.byappid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:41:10
 */
public class AlipayOpenMiniAppdeployByappidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1182445931932454887L;

	/** 
	 * 小程序发布信息
	 */
	@ApiListField("deploys")
	@ApiField("mini_app_deploy_response")
	private List<MiniAppDeployResponse> deploys;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setDeploys(List<MiniAppDeployResponse> deploys) {
		this.deploys = deploys;
	}
	public List<MiniAppDeployResponse> getDeploys( ) {
		return this.deploys;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
