package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WorkspaceAk;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.ak.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:33
 */
public class AlipayCloudCloudbaseEnvAkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5388597544892297255L;

	/** 
	 * ak对象集合
	 */
	@ApiListField("aks")
	@ApiField("workspace_ak")
	private List<WorkspaceAk> aks;

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

	public void setAks(List<WorkspaceAk> aks) {
		this.aks = aks;
	}
	public List<WorkspaceAk> getAks( ) {
		return this.aks;
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
