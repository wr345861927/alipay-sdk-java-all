package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayWeiboEbppRechargeResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.weibo.ebpp.recharge request
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:15
 */
public class AlipayWeiboEbppRechargeRequest implements AlipayRequest<AlipayWeiboEbppRechargeResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 商户用户的设备信息
	 */
	private String apdId;

	/** 
	* 手机位置信息
	 */
	private String cellId;

	/** 
	* device_info_token
	 */
	private String deviceInfoToken;

	/** 
	* 商户输入的扩展信息
	 */
	private String exparam;

	/** 
	* 终端设备号
	 */
	private String imei;

	/** 
	* 商户用户的ip信息
	 */
	private String ip;

	/** 
	* 基站LAC
	 */
	private String lacId;

	/** 
	* 免登来源
	 */
	private String loginFrom;

	/** 
	* 设备mac信息
	 */
	private String mac;

	/** 
	* 商户的用户Id
	 */
	private String partnerUserId;

	/** 
	* 设备的安全支付标识
	 */
	private String tid;

	/** 
	* 商户免登Token
	 */
	private String token;

	/** 
	* 设备umid信息
	 */
	private String umid;

	/** 
	* wireless_mac
	 */
	private String wirelessMac;

	public void setApdId(String apdId) {
		this.apdId = apdId;
	}
	public String getApdId() {
		return this.apdId;
	}

	public void setCellId(String cellId) {
		this.cellId = cellId;
	}
	public String getCellId() {
		return this.cellId;
	}

	public void setDeviceInfoToken(String deviceInfoToken) {
		this.deviceInfoToken = deviceInfoToken;
	}
	public String getDeviceInfoToken() {
		return this.deviceInfoToken;
	}

	public void setExparam(String exparam) {
		this.exparam = exparam;
	}
	public String getExparam() {
		return this.exparam;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getImei() {
		return this.imei;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp() {
		return this.ip;
	}

	public void setLacId(String lacId) {
		this.lacId = lacId;
	}
	public String getLacId() {
		return this.lacId;
	}

	public void setLoginFrom(String loginFrom) {
		this.loginFrom = loginFrom;
	}
	public String getLoginFrom() {
		return this.loginFrom;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getMac() {
		return this.mac;
	}

	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
	public String getPartnerUserId() {
		return this.partnerUserId;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTid() {
		return this.tid;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken() {
		return this.token;
	}

	public void setUmid(String umid) {
		this.umid = umid;
	}
	public String getUmid() {
		return this.umid;
	}

	public void setWirelessMac(String wirelessMac) {
		this.wirelessMac = wirelessMac;
	}
	public String getWirelessMac() {
		return this.wirelessMac;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.weibo.ebpp.recharge";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("apd_id", this.apdId);
		txtParams.put("cell_id", this.cellId);
		txtParams.put("device_info_token", this.deviceInfoToken);
		txtParams.put("exparam", this.exparam);
		txtParams.put("imei", this.imei);
		txtParams.put("ip", this.ip);
		txtParams.put("lac_id", this.lacId);
		txtParams.put("login_from", this.loginFrom);
		txtParams.put("mac", this.mac);
		txtParams.put("partner_user_id", this.partnerUserId);
		txtParams.put("tid", this.tid);
		txtParams.put("token", this.token);
		txtParams.put("umid", this.umid);
		txtParams.put("wireless_mac", this.wirelessMac);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayWeiboEbppRechargeResponse> getResponseClass() {
		return AlipayWeiboEbppRechargeResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
