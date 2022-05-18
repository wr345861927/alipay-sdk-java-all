package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantInvoiceUKDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.merchant.apply.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:16:50
 */
public class AlipayEbppInvoiceMerchantApplyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4453484492859718333L;

	/** 
	 * 同一批次下未归集成功的发票
	 */
	@ApiListField("error_invoices")
	@ApiField("merchant_invoice_u_k_d_t_o")
	private List<MerchantInvoiceUKDTO> errorInvoices;

	public void setErrorInvoices(List<MerchantInvoiceUKDTO> errorInvoices) {
		this.errorInvoices = errorInvoices;
	}
	public List<MerchantInvoiceUKDTO> getErrorInvoices( ) {
		return this.errorInvoices;
	}

}
