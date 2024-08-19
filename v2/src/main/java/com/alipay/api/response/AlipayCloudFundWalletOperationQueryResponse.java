package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WalletOperationDetails;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.wallet.operation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 18:02:05
 */
public class AlipayCloudFundWalletOperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6751324638936669189L;

	/** 
	 * 当前页，单位是'页'。
	 */
	@ApiField("current_page")
	private String currentPage;

	/** 
	 * 总条数，单位是'条数'。
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页，单位是'页'。
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 钱包操作明细
	 */
	@ApiField("wallet_operations")
	private WalletOperationDetails walletOperations;

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public String getCurrentPage( ) {
		return this.currentPage;
	}

	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}
	public String getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}
	public String getTotalPages( ) {
		return this.totalPages;
	}

	public void setWalletOperations(WalletOperationDetails walletOperations) {
		this.walletOperations = walletOperations;
	}
	public WalletOperationDetails getWalletOperations( ) {
		return this.walletOperations;
	}

}
