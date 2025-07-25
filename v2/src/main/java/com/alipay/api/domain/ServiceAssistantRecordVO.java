package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小助手快捷服务记录模型
 *
 * @author auto create
 * @since 1.0, 2024-08-13 16:34:27
 */
public class ServiceAssistantRecordVO extends AlipayObject {

	private static final long serialVersionUID = 1495528134642143748L;

	/**
	 * 小助手内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 小助手发布时间，即小助手创建或者修改时间。
	 */
	@ApiField("gmt_published")
	private Date gmtPublished;

	/**
	 * 快捷服务名称，b侧展示用，不在c侧群内透出
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务数量
	 */
	@ApiField("service_cnt")
	private Long serviceCnt;

	/**
	 * 小助手状态 INIT (初始化), AUDITING (审核中), DENY (审核驳回), VALID (生效), INVALID (失效)；DENY (审核驳回)是终态；INVALID (失效)支持修改； INVALID (失效)支持上线；VALID (生效)支持下线。
	 */
	@ApiField("status")
	private String status;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public Date getGmtPublished() {
		return this.gmtPublished;
	}
	public void setGmtPublished(Date gmtPublished) {
		this.gmtPublished = gmtPublished;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getServiceCnt() {
		return this.serviceCnt;
	}
	public void setServiceCnt(Long serviceCnt) {
		this.serviceCnt = serviceCnt;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
