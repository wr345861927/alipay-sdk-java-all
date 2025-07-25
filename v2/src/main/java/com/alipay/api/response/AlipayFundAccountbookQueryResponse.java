package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AuthInfoDTO;
import com.alipay.api.domain.ExtCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.accountbook.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-27 10:37:25
 */
public class AlipayFundAccountbookQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5311481532661777319L;

	/** 
	 * 记账账簿id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/** 
	 * 资金记账本关联的授权信息
	 */
	@ApiField("auth_info")
	private AuthInfoDTO authInfo;

	/** 
	 * 可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 场景余额模式外标卡信息
	 */
	@ApiField("ext_card_info")
	private ExtCardInfo extCardInfo;

	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}
	public String getAccountBookId( ) {
		return this.accountBookId;
	}

	public void setAuthInfo(AuthInfoDTO authInfo) {
		this.authInfo = authInfo;
	}
	public AuthInfoDTO getAuthInfo( ) {
		return this.authInfo;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setExtCardInfo(ExtCardInfo extCardInfo) {
		this.extCardInfo = extCardInfo;
	}
	public ExtCardInfo getExtCardInfo( ) {
		return this.extCardInfo;
	}

}
