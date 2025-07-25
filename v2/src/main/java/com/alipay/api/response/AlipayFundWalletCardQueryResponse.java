package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GiftCardVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.card.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-14 13:42:26
 */
public class AlipayFundWalletCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6128355162796147961L;

	/** 
	 * 礼品卡对客展示
	 */
	@ApiListField("gift_card_vos")
	@ApiField("gift_card_vo")
	private List<GiftCardVo> giftCardVos;

	/** 
	 * 查询总数量
	 */
	@ApiField("total_nums")
	private String totalNums;

	/** 
	 * 查询总页数
	 */
	@ApiField("total_pages")
	private String totalPages;

	public void setGiftCardVos(List<GiftCardVo> giftCardVos) {
		this.giftCardVos = giftCardVos;
	}
	public List<GiftCardVo> getGiftCardVos( ) {
		return this.giftCardVos;
	}

	public void setTotalNums(String totalNums) {
		this.totalNums = totalNums;
	}
	public String getTotalNums( ) {
		return this.totalNums;
	}

	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}
	public String getTotalPages( ) {
		return this.totalPages;
	}

}
