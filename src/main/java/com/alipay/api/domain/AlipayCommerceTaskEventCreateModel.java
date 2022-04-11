package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 任务事件规则创建
 *
 * @author auto create
 * @since 1.0, 2022-03-31 14:23:36
 */
public class AlipayCommerceTaskEventCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8717796619895357921L;

	/**
	 * 规则事件
	 */
	@ApiListField("event_list")
	@ApiField("string")
	private List<String> eventList;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 任务模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public List<String> getEventList() {
		return this.eventList;
	}
	public void setEventList(List<String> eventList) {
		this.eventList = eventList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}