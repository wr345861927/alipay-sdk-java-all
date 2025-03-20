package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.transfer.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-12 11:01:25
 */
public class AnttechNftTransferApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5839253445413841293L;

	/** 
	 * 流转的nftId
	 */
	@ApiField("nft_id")
	private String nftId;

	/** 
	 * 请求消息id，全链路唯一标记，建议打印，排查问题需提供
	 */
	@ApiField("req_msg_id")
	private String reqMsgId;

	/** 
	 * 标识一类NFT
	 */
	@ApiField("sku_id")
	private Long skuId;

	public void setNftId(String nftId) {
		this.nftId = nftId;
	}
	public String getNftId( ) {
		return this.nftId;
	}

	public void setReqMsgId(String reqMsgId) {
		this.reqMsgId = reqMsgId;
	}
	public String getReqMsgId( ) {
		return this.reqMsgId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public Long getSkuId( ) {
		return this.skuId;
	}

}
