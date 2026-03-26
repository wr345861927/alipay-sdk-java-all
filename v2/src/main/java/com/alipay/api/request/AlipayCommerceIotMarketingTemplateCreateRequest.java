package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCommerceIotMarketingTemplateCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.commerce.iot.marketing.template.create request
 * 
 * @author auto create
 * @since 1.0, 2026-03-23 16:02:44
 */
public class AlipayCommerceIotMarketingTemplateCreateRequest implements AlipayUploadRequest<AlipayCommerceIotMarketingTemplateCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 模版生效结束时间戳
	 */
	private Long endTime;

	/** 
	* 投放模板图片，为二进制文件
	 */
	private FileItem fileContent;

	/** 
	* 图片横屏竖屏配置 横屏：1   竖屏：2
	 */
	private Long hvScreen;

	/** 
	* 电子海报:NORMAL_DISPLAY
支付结果页:PAY_SUCCESS_RESULT
商户信息海报:MERCHANT_INFO_POSTER
	 */
	private String spaceCode;

	/** 
	* 模版生效开始时间戳
	 */
	private Long startTime;

	/** 
	* 模版名称
	 */
	private String templateName;

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
	public Long getEndTime() {
		return this.endTime;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setHvScreen(Long hvScreen) {
		this.hvScreen = hvScreen;
	}
	public Long getHvScreen() {
		return this.hvScreen;
	}

	public void setSpaceCode(String spaceCode) {
		this.spaceCode = spaceCode;
	}
	public String getSpaceCode() {
		return this.spaceCode;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	public Long getStartTime() {
		return this.startTime;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateName() {
		return this.templateName;
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
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.commerce.iot.marketing.template.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("end_time", this.endTime);
		txtParams.put("hv_screen", this.hvScreen);
		txtParams.put("space_code", this.spaceCode);
		txtParams.put("start_time", this.startTime);
		txtParams.put("template_name", this.templateName);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("file_content", this.fileContent);
		return params;
	}

	public Class<AlipayCommerceIotMarketingTemplateCreateResponse> getResponseClass() {
		return AlipayCommerceIotMarketingTemplateCreateResponse.class;
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
