package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 航段信息
 *
 * @author auto create
 * @since 1.0, 2023-09-21 09:50:18
 */
public class Airline extends AlipayObject {

	private static final long serialVersionUID = 8693438663354341545L;

	/**
	 * 票面航司二字码
	 */
	@ApiField("ac_code")
	private String acCode;

	/**
	 * 票面航司名称
	 */
	@ApiField("ac_name")
	private String acName;

	/**
	 * 票面航班号
	 */
	@ApiField("flight_no")
	private String flightNo;

	/**
	 * 是否是共享航班
	 */
	@ApiField("is_share")
	private Boolean isShare;

	/**
	 * 是否是经停航班
	 */
	@ApiField("is_stop")
	private Boolean isStop;

	/**
	 * 机型描述
	 */
	@ApiField("plane_model")
	private String planeModel;

	/**
	 * 机型大小，一般为大、中、小，个别情况存在特殊机型
	 */
	@ApiField("plane_model_size")
	private String planeModelSize;

	/**
	 * 共享航班主飞信息
	 */
	@ApiField("share_airline")
	private ShareAirline shareAirline;

	/**
	 * 经停信息
	 */
	@ApiListField("stop_info")
	@ApiField("stop_info")
	private List<StopInfo> stopInfo;

	public String getAcCode() {
		return this.acCode;
	}
	public void setAcCode(String acCode) {
		this.acCode = acCode;
	}

	public String getAcName() {
		return this.acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}

	public String getFlightNo() {
		return this.flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public Boolean getIsShare() {
		return this.isShare;
	}
	public void setIsShare(Boolean isShare) {
		this.isShare = isShare;
	}

	public Boolean getIsStop() {
		return this.isStop;
	}
	public void setIsStop(Boolean isStop) {
		this.isStop = isStop;
	}

	public String getPlaneModel() {
		return this.planeModel;
	}
	public void setPlaneModel(String planeModel) {
		this.planeModel = planeModel;
	}

	public String getPlaneModelSize() {
		return this.planeModelSize;
	}
	public void setPlaneModelSize(String planeModelSize) {
		this.planeModelSize = planeModelSize;
	}

	public ShareAirline getShareAirline() {
		return this.shareAirline;
	}
	public void setShareAirline(ShareAirline shareAirline) {
		this.shareAirline = shareAirline;
	}

	public List<StopInfo> getStopInfo() {
		return this.stopInfo;
	}
	public void setStopInfo(List<StopInfo> stopInfo) {
		this.stopInfo = stopInfo;
	}

}
