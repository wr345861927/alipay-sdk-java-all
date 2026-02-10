package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 触享查询权益活动接口
 *
 * @author auto create
 * @since 1.0, 2026-02-02 16:27:42
 */
public class AlipayCommerceRetailFocusbenefitdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8599873686328362465L;

	/**
	 * 天分区
	 */
	@ApiField("dt_list")
	private String dtList;

	/**
	 * 时间分区
	 */
	@ApiField("hh_list")
	private String hhList;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 页码
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getDtList() {
		return this.dtList;
	}
	public void setDtList(String dtList) {
		this.dtList = dtList;
	}

	public String getHhList() {
		return this.hhList;
	}
	public void setHhList(String hhList) {
		this.hhList = hhList;
	}

	public String getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
