package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DomainBind;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.bind.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:17
 */
public class AlipayCloudCloudbaseHttpaccessBindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5584876983434136292L;

	/** 
	 * 路由绑定列表
	 */
	@ApiListField("domain_binds")
	@ApiField("domain_bind")
	private List<DomainBind> domainBinds;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setDomainBinds(List<DomainBind> domainBinds) {
		this.domainBinds = domainBinds;
	}
	public List<DomainBind> getDomainBinds( ) {
		return this.domainBinds;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
