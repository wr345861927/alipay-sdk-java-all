package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PageTemplateInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.pagetemplate.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:35
 */
public class DatadigitalFincloudFinsaasDesignPagetemplateGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1412296958911856817L;

	/** 
	 * 模版code
	 */
	@ApiField("template_code")
	private String templateCode;

	/** 
	 * 模版详情
	 */
	@ApiField("template_info")
	private PageTemplateInfoDTO templateInfo;

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTemplateCode( ) {
		return this.templateCode;
	}

	public void setTemplateInfo(PageTemplateInfoDTO templateInfo) {
		this.templateInfo = templateInfo;
	}
	public PageTemplateInfoDTO getTemplateInfo( ) {
		return this.templateInfo;
	}

}
