package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV单据状态DTO
 *
 * @author auto create
 * @since 1.0, 2023-05-06 14:29:07
 */
public class IndrISVOrderStatusDTO extends AlipayObject {

	private static final long serialVersionUID = 5551184871871494836L;

	/**
	 * 错误码 材料审核拒绝时会给出
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息  材料审核拒绝时会给出
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 状态码
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}
