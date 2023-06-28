package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上赛事场次组别信息
 *
 * @author auto create
 * @since 1.0, 2023-03-15 19:40:51
 */
public class OnlineGameEventInfo extends AlipayObject {

	private static final long serialVersionUID = 3385692578115654613L;

	/**
	 * 产地描述信息
	 */
	@ApiField("content")
	private String content;

	/**
	 * 用户参赛的场次组别ID
	 */
	@ApiField("game_event_id")
	private String gameEventId;

	/**
	 * 三方用户参赛的场次组别ID
	 */
	@ApiField("out_game_event_no")
	private String outGameEventNo;

	/**
	 * 配合赛事总进度使用
	 */
	@ApiField("progress_unit")
	private String progressUnit;

	/**
	 * 赛事总进度
	 */
	@ApiField("progress_value")
	private Long progressValue;

	/**
	 * 场次状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 场次名称
	 */
	@ApiField("title")
	private String title;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getGameEventId() {
		return this.gameEventId;
	}
	public void setGameEventId(String gameEventId) {
		this.gameEventId = gameEventId;
	}

	public String getOutGameEventNo() {
		return this.outGameEventNo;
	}
	public void setOutGameEventNo(String outGameEventNo) {
		this.outGameEventNo = outGameEventNo;
	}

	public String getProgressUnit() {
		return this.progressUnit;
	}
	public void setProgressUnit(String progressUnit) {
		this.progressUnit = progressUnit;
	}

	public Long getProgressValue() {
		return this.progressValue;
	}
	public void setProgressValue(Long progressValue) {
		this.progressValue = progressValue;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
