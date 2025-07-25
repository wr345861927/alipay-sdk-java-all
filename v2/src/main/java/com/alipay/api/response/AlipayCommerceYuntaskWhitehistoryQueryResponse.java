package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YunTaskWhiteUserDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.whitehistory.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 16:34:45
 */
public class AlipayCommerceYuntaskWhitehistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6642733215119418277L;

	/** 
	 * 当前页数
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 每页大小，单位个，例如10个
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数，单位个，比如100个
	 */
	@ApiField("total_size")
	private Long totalSize;

	/** 
	 * 白名单列表
	 */
	@ApiListField("white_list")
	@ApiField("yun_task_white_user_d_t_o")
	private List<YunTaskWhiteUserDTO> whiteList;

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

	public void setWhiteList(List<YunTaskWhiteUserDTO> whiteList) {
		this.whiteList = whiteList;
	}
	public List<YunTaskWhiteUserDTO> getWhiteList( ) {
		return this.whiteList;
	}

}
