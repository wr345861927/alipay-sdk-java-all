package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型测试接口
 *
 * @author auto create
 * @since 1.0, 2025-01-22 15:23:12
 */
public class AlipayDataDataserviceApitreefirstRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7627824586969942275L;

	/**
	 * 无参数
	 */
	@ApiField("demo_case")
	private RainyComplexTypesTheFifteen demoCase;

	public RainyComplexTypesTheFifteen getDemoCase() {
		return this.demoCase;
	}
	public void setDemoCase(RainyComplexTypesTheFifteen demoCase) {
		this.demoCase = demoCase;
	}

}
