package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 管控账户资金划拨结果查询
 *
 * @author auto create
 * @since 1.0, 2024-02-01 17:40:57
 */
public class AnttechBlockchainFinanceFsupvTransferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1364987343164819853L;

	/**
	 * 受理号，即管控账户资金划拨响应中返回的受理号
	 */
	@ApiField("accepted_no")
	private String acceptedNo;

	/**
	 * 申请资金划拨时上传的流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getAcceptedNo() {
		return this.acceptedNo;
	}
	public void setAcceptedNo(String acceptedNo) {
		this.acceptedNo = acceptedNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
