package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.formtemplate.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:17:07
 */
public class DatadigitalFincloudFinsaasFormtemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8375477723518471841L;

	/** 
	 * form_template_id + 唯一 + 页面表单模板查询 + 数据库。
	 */
	@ApiField("form_template_id")
	private String formTemplateId;

	/** 
	 * form_template_json_string + 页面表单模板查询 + 数据库。
	 */
	@ApiField("form_template_json_string")
	private String formTemplateJsonString;

	/** 
	 * form_template_name + 页面表单模板查询 + 数据库。
	 */
	@ApiField("form_template_name")
	private String formTemplateName;

	public void setFormTemplateId(String formTemplateId) {
		this.formTemplateId = formTemplateId;
	}
	public String getFormTemplateId( ) {
		return this.formTemplateId;
	}

	public void setFormTemplateJsonString(String formTemplateJsonString) {
		this.formTemplateJsonString = formTemplateJsonString;
	}
	public String getFormTemplateJsonString( ) {
		return this.formTemplateJsonString;
	}

	public void setFormTemplateName(String formTemplateName) {
		this.formTemplateName = formTemplateName;
	}
	public String getFormTemplateName( ) {
		return this.formTemplateName;
	}

}
