package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMarketingVerificationTradeAuditResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.marketing.verification.trade.audit request
 * 
 * @author auto create
 * @since 1.0, 2026-04-22 16:37:45
 */
public class AlipayMarketingVerificationTradeAuditRequest implements AlipayUploadRequest<AlipayMarketingVerificationTradeAuditResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 激活照片（3c必填）转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem activateContent;

	/** 
	* 支付宝交易号，用于识别交易信息
	 */
	private String alipayTradeNo;

	/** 
	* 审计相关业务信息，若审计结果未提交或未通过，则每次请求覆盖上次业务参数。审计已通过则不允许重新提交。
	 */
	private String bizInfo;

	/** 
	* 送货清单，转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem deliveryListContent;

	/** 
	* 辅助文件信息，如四码照片，转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem evidentiaryContent;

	/** 
	* 发票信息转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem invoiceContent;

	/** 
	* 产品送达现场照或自提现场照片（家电必传），转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem onSiteContent;

	/** 
	* 其他辅助材料1，转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem otherContent1;

	/** 
	* 其他辅助材料2,转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem otherContent2;

	/** 
	* 其他辅助材料3，转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem otherContent3;

	/** 
	* 其他辅助材料4，转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem otherContent4;

	/** 
	* 其他辅助材料5，转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem otherContent5;

	/** 
	* 外部订单号
	 */
	private String outTradeNo;

	/** 
	* 销货清单，转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem salesListContent;

	/** 
	* 支付宝分配的场景编码，用于识别活动场景及区域等信息
	 */
	private String sceneCode;

	/** 
	* 机身SN照（家电必传），转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem snBodyContent;

	/** 
	* 商品SN照转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem snContent;

	public void setActivateContent(FileItem activateContent) {
		this.activateContent = activateContent;
	}
	public FileItem getActivateContent() {
		return this.activateContent;
	}

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}

	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}
	public String getBizInfo() {
		return this.bizInfo;
	}

	public void setDeliveryListContent(FileItem deliveryListContent) {
		this.deliveryListContent = deliveryListContent;
	}
	public FileItem getDeliveryListContent() {
		return this.deliveryListContent;
	}

	public void setEvidentiaryContent(FileItem evidentiaryContent) {
		this.evidentiaryContent = evidentiaryContent;
	}
	public FileItem getEvidentiaryContent() {
		return this.evidentiaryContent;
	}

	public void setInvoiceContent(FileItem invoiceContent) {
		this.invoiceContent = invoiceContent;
	}
	public FileItem getInvoiceContent() {
		return this.invoiceContent;
	}

	public void setOnSiteContent(FileItem onSiteContent) {
		this.onSiteContent = onSiteContent;
	}
	public FileItem getOnSiteContent() {
		return this.onSiteContent;
	}

	public void setOtherContent1(FileItem otherContent1) {
		this.otherContent1 = otherContent1;
	}
	public FileItem getOtherContent1() {
		return this.otherContent1;
	}

	public void setOtherContent2(FileItem otherContent2) {
		this.otherContent2 = otherContent2;
	}
	public FileItem getOtherContent2() {
		return this.otherContent2;
	}

	public void setOtherContent3(FileItem otherContent3) {
		this.otherContent3 = otherContent3;
	}
	public FileItem getOtherContent3() {
		return this.otherContent3;
	}

	public void setOtherContent4(FileItem otherContent4) {
		this.otherContent4 = otherContent4;
	}
	public FileItem getOtherContent4() {
		return this.otherContent4;
	}

	public void setOtherContent5(FileItem otherContent5) {
		this.otherContent5 = otherContent5;
	}
	public FileItem getOtherContent5() {
		return this.otherContent5;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo() {
		return this.outTradeNo;
	}

	public void setSalesListContent(FileItem salesListContent) {
		this.salesListContent = salesListContent;
	}
	public FileItem getSalesListContent() {
		return this.salesListContent;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode() {
		return this.sceneCode;
	}

	public void setSnBodyContent(FileItem snBodyContent) {
		this.snBodyContent = snBodyContent;
	}
	public FileItem getSnBodyContent() {
		return this.snBodyContent;
	}

	public void setSnContent(FileItem snContent) {
		this.snContent = snContent;
	}
	public FileItem getSnContent() {
		return this.snContent;
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
		return "alipay.marketing.verification.trade.audit";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("alipay_trade_no", this.alipayTradeNo);
		txtParams.put("biz_info", this.bizInfo);
		txtParams.put("out_trade_no", this.outTradeNo);
		txtParams.put("scene_code", this.sceneCode);
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
		params.put("activate_content", this.activateContent);
		params.put("delivery_list_content", this.deliveryListContent);
		params.put("evidentiary_content", this.evidentiaryContent);
		params.put("invoice_content", this.invoiceContent);
		params.put("on_site_content", this.onSiteContent);
		params.put("other_content_1", this.otherContent1);
		params.put("other_content_2", this.otherContent2);
		params.put("other_content_3", this.otherContent3);
		params.put("other_content_4", this.otherContent4);
		params.put("other_content_5", this.otherContent5);
		params.put("sales_list_content", this.salesListContent);
		params.put("sn_body_content", this.snBodyContent);
		params.put("sn_content", this.snContent);
		return params;
	}

	public Class<AlipayMarketingVerificationTradeAuditResponse> getResponseClass() {
		return AlipayMarketingVerificationTradeAuditResponse.class;
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
