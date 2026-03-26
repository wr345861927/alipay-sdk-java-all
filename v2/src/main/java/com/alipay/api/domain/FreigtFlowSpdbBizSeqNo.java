package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运企付-浦发银行流水好复杂对象
 *
 * @author auto create
 * @since 1.0, 2026-02-26 14:16:37
 */
public class FreigtFlowSpdbBizSeqNo extends AlipayObject {

	private static final long serialVersionUID = 8169587721117333245L;

	/**
	 * 渠道流水号
	 */
	@ApiField("channel_seq_no")
	private String channelSeqNo;

	/**
	 * 交易流水号
	 */
	@ApiField("tran_seq_no")
	private String tranSeqNo;

	/**
	 * 核心交易流水号
	 */
	@ApiField("ylk_tran_seq_no")
	private String ylkTranSeqNo;

	public String getChannelSeqNo() {
		return this.channelSeqNo;
	}
	public void setChannelSeqNo(String channelSeqNo) {
		this.channelSeqNo = channelSeqNo;
	}

	public String getTranSeqNo() {
		return this.tranSeqNo;
	}
	public void setTranSeqNo(String tranSeqNo) {
		this.tranSeqNo = tranSeqNo;
	}

	public String getYlkTranSeqNo() {
		return this.ylkTranSeqNo;
	}
	public void setYlkTranSeqNo(String ylkTranSeqNo) {
		this.ylkTranSeqNo = ylkTranSeqNo;
	}

}
