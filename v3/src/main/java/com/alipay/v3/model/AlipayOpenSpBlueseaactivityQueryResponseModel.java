/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * AlipayOpenSpBlueseaactivityQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpBlueseaactivityQueryResponseModel {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_BUSINESS_LIC = "business_lic";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LIC)
  private String businessLic;

  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_DISTRICT_CODE = "district_code";
  @SerializedName(SERIALIZED_NAME_DISTRICT_CODE)
  private String districtCode;

  public static final String SERIALIZED_NAME_FOOD_BUSINESS_LIC = "food_business_lic";
  @SerializedName(SERIALIZED_NAME_FOOD_BUSINESS_LIC)
  private String foodBusinessLic;

  public static final String SERIALIZED_NAME_FOOD_CIRCULATE_LIC = "food_circulate_lic";
  @SerializedName(SERIALIZED_NAME_FOOD_CIRCULATE_LIC)
  private String foodCirculateLic;

  public static final String SERIALIZED_NAME_FOOD_HEALTH_LIC = "food_health_lic";
  @SerializedName(SERIALIZED_NAME_FOOD_HEALTH_LIC)
  private String foodHealthLic;

  public static final String SERIALIZED_NAME_FOOD_PRODUCTION_LIC = "food_production_lic";
  @SerializedName(SERIALIZED_NAME_FOOD_PRODUCTION_LIC)
  private String foodProductionLic;

  public static final String SERIALIZED_NAME_FOOD_SERVICE_LIC = "food_service_lic";
  @SerializedName(SERIALIZED_NAME_FOOD_SERVICE_LIC)
  private String foodServiceLic;

  public static final String SERIALIZED_NAME_INDOOR_PIC = "indoor_pic";
  @SerializedName(SERIALIZED_NAME_INDOOR_PIC)
  private String indoorPic;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_MERCHANT_LOGON = "merchant_logon";
  @SerializedName(SERIALIZED_NAME_MERCHANT_LOGON)
  private String merchantLogon;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public static final String SERIALIZED_NAME_SHOP_ENTRANCE_PIC = "shop_entrance_pic";
  @SerializedName(SERIALIZED_NAME_SHOP_ENTRANCE_PIC)
  private String shopEntrancePic;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_ID = "sub_merchant_id";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_ID)
  private String subMerchantId;

  public static final String SERIALIZED_NAME_TOBACCO_LIC = "tobacco_lic";
  @SerializedName(SERIALIZED_NAME_TOBACCO_LIC)
  private String tobaccoLic;

  public AlipayOpenSpBlueseaactivityQueryResponseModel() { 
  }

  public AlipayOpenSpBlueseaactivityQueryResponseModel address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 详细地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "万塘路18号黄龙时代广场B座", value = "详细地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 蓝海活动的场景，包括直连餐饮（BLUE_SEA_FOOD_APPLY）、直连快消（BLUE_SEA_FMCG_APPLY）、间连餐饮（BLUE_SEA_FOOD_INDIRECT_APPLY）、间连快消（BLUE_SEA_FMCG_INDIRECT_APPLY）场景
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BLUE_SEA_FOOD_APPLY", value = "蓝海活动的场景，包括直连餐饮（BLUE_SEA_FOOD_APPLY）、直连快消（BLUE_SEA_FMCG_APPLY）、间连餐饮（BLUE_SEA_FOOD_INDIRECT_APPLY）、间连快消（BLUE_SEA_FMCG_INDIRECT_APPLY）场景")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel businessLic(String businessLic) {
    
    this.businessLic = businessLic;
    return this;
  }

   /**
   * 营业执照，要求证件文本信息清晰可见。 资质信息请参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01hd83\&quot;&gt;报名资质要求&lt;/a&gt;
   * @return businessLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "营业执照，要求证件文本信息清晰可见。 资质信息请参见<a href=\"https://opendocs.alipay.com/open/01hd83\">报名资质要求</a>")

  public String getBusinessLic() {
    return businessLic;
  }


  public void setBusinessLic(String businessLic) {
    this.businessLic = businessLic;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "310001", value = "城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel districtCode(String districtCode) {
    
    this.districtCode = districtCode;
    return this;
  }

   /**
   * 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
   * @return districtCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "310006", value = "区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）")

  public String getDistrictCode() {
    return districtCode;
  }


  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel foodBusinessLic(String foodBusinessLic) {
    
    this.foodBusinessLic = foodBusinessLic;
    return this;
  }

   /**
   * 食品经营许可证，要求证件文本信息清晰可见。资质信息请参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01hd83\&quot;&gt;报名资质要求&lt;/a&gt;
   * @return foodBusinessLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "食品经营许可证，要求证件文本信息清晰可见。资质信息请参见<a href=\"https://opendocs.alipay.com/open/01hd83\">报名资质要求</a>")

  public String getFoodBusinessLic() {
    return foodBusinessLic;
  }


  public void setFoodBusinessLic(String foodBusinessLic) {
    this.foodBusinessLic = foodBusinessLic;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel foodCirculateLic(String foodCirculateLic) {
    
    this.foodCirculateLic = foodCirculateLic;
    return this;
  }

   /**
   * 食品流通许可证，要求证件文本信息清晰可见。资质信息请参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01hd83\&quot;&gt;报名资质要求&lt;/a&gt;
   * @return foodCirculateLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "食品流通许可证，要求证件文本信息清晰可见。资质信息请参见<a href=\"https://opendocs.alipay.com/open/01hd83\">报名资质要求</a>")

  public String getFoodCirculateLic() {
    return foodCirculateLic;
  }


  public void setFoodCirculateLic(String foodCirculateLic) {
    this.foodCirculateLic = foodCirculateLic;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel foodHealthLic(String foodHealthLic) {
    
    this.foodHealthLic = foodHealthLic;
    return this;
  }

   /**
   * 食品卫生许可证，要求证件文本信息清晰可见。资质信息请参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01hd83\&quot;&gt;报名资质要求&lt;/a&gt;
   * @return foodHealthLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "食品卫生许可证，要求证件文本信息清晰可见。资质信息请参见<a href=\"https://opendocs.alipay.com/open/01hd83\">报名资质要求</a>")

  public String getFoodHealthLic() {
    return foodHealthLic;
  }


  public void setFoodHealthLic(String foodHealthLic) {
    this.foodHealthLic = foodHealthLic;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel foodProductionLic(String foodProductionLic) {
    
    this.foodProductionLic = foodProductionLic;
    return this;
  }

   /**
   * 食品生产许可证，要求证件文本信息清晰可见。资质信息请参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01hd83\&quot;&gt;报名资质要求&lt;/a&gt;
   * @return foodProductionLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "食品生产许可证，要求证件文本信息清晰可见。资质信息请参见<a href=\"https://opendocs.alipay.com/open/01hd83\">报名资质要求</a>")

  public String getFoodProductionLic() {
    return foodProductionLic;
  }


  public void setFoodProductionLic(String foodProductionLic) {
    this.foodProductionLic = foodProductionLic;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel foodServiceLic(String foodServiceLic) {
    
    this.foodServiceLic = foodServiceLic;
    return this;
  }

   /**
   * 餐饮服务许可证，要求证件文本信息清晰可见。资质信息请参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01hd83\&quot;&gt;报名资质要求&lt;/a&gt;
   * @return foodServiceLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "餐饮服务许可证，要求证件文本信息清晰可见。资质信息请参见<a href=\"https://opendocs.alipay.com/open/01hd83\">报名资质要求</a>")

  public String getFoodServiceLic() {
    return foodServiceLic;
  }


  public void setFoodServiceLic(String foodServiceLic) {
    this.foodServiceLic = foodServiceLic;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel indoorPic(String indoorPic) {
    
    this.indoorPic = indoorPic;
    return this;
  }

   /**
   * 门头照，要求内景照片清晰可见。资质信息请参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01hd83\&quot;&gt;报名资质要求&lt;/a&gt;
   * @return indoorPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "门头照，要求内景照片清晰可见。资质信息请参见<a href=\"https://opendocs.alipay.com/open/01hd83\">报名资质要求</a>")

  public String getIndoorPic() {
    return indoorPic;
  }


  public void setIndoorPic(String indoorPic) {
    this.indoorPic = indoorPic;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 审核驳回原因，在订单状态为失败时有效
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "资质照片和商户名称不一致，请修改一致后，重新申请;其他原因;", value = "审核驳回原因，在订单状态为失败时有效")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel merchantLogon(String merchantLogon) {
    
    this.merchantLogon = merchantLogon;
    return this;
  }

   /**
   * 参与蓝海活动的商户支付宝账号，只有当参与直连蓝海活动场景（BLUE_SEA_FOOD_APPLY/BLUE_SEA_FMCG_APPLY）时才返回
   * @return merchantLogon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13200132000", value = "参与蓝海活动的商户支付宝账号，只有当参与直连蓝海活动场景（BLUE_SEA_FOOD_APPLY/BLUE_SEA_FMCG_APPLY）时才返回")

  public String getMerchantLogon() {
    return merchantLogon;
  }


  public void setMerchantLogon(String merchantLogon) {
    this.merchantLogon = merchantLogon;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "310000", value = "省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel shopEntrancePic(String shopEntrancePic) {
    
    this.shopEntrancePic = shopEntrancePic;
    return this;
  }

   /**
   * 门头照，要求店铺外观照片清晰可见。资质信息请参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01hd83\&quot;&gt;报名资质要求&lt;/a&gt;
   * @return shopEntrancePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "门头照，要求店铺外观照片清晰可见。资质信息请参见<a href=\"https://opendocs.alipay.com/open/01hd83\">报名资质要求</a>")

  public String getShopEntrancePic() {
    return shopEntrancePic;
  }


  public void setShopEntrancePic(String shopEntrancePic) {
    this.shopEntrancePic = shopEntrancePic;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 申请单状态，状态机参考（AUDITING:审核中，FAIL:报名失败，PASS:报名成功）
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDITING", value = "申请单状态，状态机参考（AUDITING:审核中，FAIL:报名失败，PASS:报名成功）")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel subMerchantId(String subMerchantId) {
    
    this.subMerchantId = subMerchantId;
    return this;
  }

   /**
   * 参与蓝海活动的间连商户账号，只有当参与间连蓝海活动场景（BLUE_SEA_FOOD_INDIRECT_APPLY/BLUE_SEA_FMCG_INDIRECT_APPLY）时才返回
   * @return subMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088100010001000", value = "参与蓝海活动的间连商户账号，只有当参与间连蓝海活动场景（BLUE_SEA_FOOD_INDIRECT_APPLY/BLUE_SEA_FMCG_INDIRECT_APPLY）时才返回")

  public String getSubMerchantId() {
    return subMerchantId;
  }


  public void setSubMerchantId(String subMerchantId) {
    this.subMerchantId = subMerchantId;
  }


  public AlipayOpenSpBlueseaactivityQueryResponseModel tobaccoLic(String tobaccoLic) {
    
    this.tobaccoLic = tobaccoLic;
    return this;
  }

   /**
   * 烟草专卖零售许可证，要求证件文本信息清晰可见。资质信息请参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01hd83\&quot;&gt;报名资质要求&lt;/a&gt;
   * @return tobaccoLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "烟草专卖零售许可证，要求证件文本信息清晰可见。资质信息请参见<a href=\"https://opendocs.alipay.com/open/01hd83\">报名资质要求</a>")

  public String getTobaccoLic() {
    return tobaccoLic;
  }


  public void setTobaccoLic(String tobaccoLic) {
    this.tobaccoLic = tobaccoLic;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AlipayOpenSpBlueseaactivityQueryResponseModel instance itself
   */
  public AlipayOpenSpBlueseaactivityQueryResponseModel putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSpBlueseaactivityQueryResponseModel alipayOpenSpBlueseaactivityQueryResponseModel = (AlipayOpenSpBlueseaactivityQueryResponseModel) o;
    return Objects.equals(this.address, alipayOpenSpBlueseaactivityQueryResponseModel.address) &&
        Objects.equals(this.bizScene, alipayOpenSpBlueseaactivityQueryResponseModel.bizScene) &&
        Objects.equals(this.businessLic, alipayOpenSpBlueseaactivityQueryResponseModel.businessLic) &&
        Objects.equals(this.cityCode, alipayOpenSpBlueseaactivityQueryResponseModel.cityCode) &&
        Objects.equals(this.districtCode, alipayOpenSpBlueseaactivityQueryResponseModel.districtCode) &&
        Objects.equals(this.foodBusinessLic, alipayOpenSpBlueseaactivityQueryResponseModel.foodBusinessLic) &&
        Objects.equals(this.foodCirculateLic, alipayOpenSpBlueseaactivityQueryResponseModel.foodCirculateLic) &&
        Objects.equals(this.foodHealthLic, alipayOpenSpBlueseaactivityQueryResponseModel.foodHealthLic) &&
        Objects.equals(this.foodProductionLic, alipayOpenSpBlueseaactivityQueryResponseModel.foodProductionLic) &&
        Objects.equals(this.foodServiceLic, alipayOpenSpBlueseaactivityQueryResponseModel.foodServiceLic) &&
        Objects.equals(this.indoorPic, alipayOpenSpBlueseaactivityQueryResponseModel.indoorPic) &&
        Objects.equals(this.memo, alipayOpenSpBlueseaactivityQueryResponseModel.memo) &&
        Objects.equals(this.merchantLogon, alipayOpenSpBlueseaactivityQueryResponseModel.merchantLogon) &&
        Objects.equals(this.provinceCode, alipayOpenSpBlueseaactivityQueryResponseModel.provinceCode) &&
        Objects.equals(this.shopEntrancePic, alipayOpenSpBlueseaactivityQueryResponseModel.shopEntrancePic) &&
        Objects.equals(this.status, alipayOpenSpBlueseaactivityQueryResponseModel.status) &&
        Objects.equals(this.subMerchantId, alipayOpenSpBlueseaactivityQueryResponseModel.subMerchantId) &&
        Objects.equals(this.tobaccoLic, alipayOpenSpBlueseaactivityQueryResponseModel.tobaccoLic)&&
        Objects.equals(this.additionalProperties, alipayOpenSpBlueseaactivityQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, bizScene, businessLic, cityCode, districtCode, foodBusinessLic, foodCirculateLic, foodHealthLic, foodProductionLic, foodServiceLic, indoorPic, memo, merchantLogon, provinceCode, shopEntrancePic, status, subMerchantId, tobaccoLic, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpBlueseaactivityQueryResponseModel {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    businessLic: ").append(toIndentedString(businessLic)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    foodBusinessLic: ").append(toIndentedString(foodBusinessLic)).append("\n");
    sb.append("    foodCirculateLic: ").append(toIndentedString(foodCirculateLic)).append("\n");
    sb.append("    foodHealthLic: ").append(toIndentedString(foodHealthLic)).append("\n");
    sb.append("    foodProductionLic: ").append(toIndentedString(foodProductionLic)).append("\n");
    sb.append("    foodServiceLic: ").append(toIndentedString(foodServiceLic)).append("\n");
    sb.append("    indoorPic: ").append(toIndentedString(indoorPic)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    merchantLogon: ").append(toIndentedString(merchantLogon)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    shopEntrancePic: ").append(toIndentedString(shopEntrancePic)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subMerchantId: ").append(toIndentedString(subMerchantId)).append("\n");
    sb.append("    tobaccoLic: ").append(toIndentedString(tobaccoLic)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("address");
    openapiFields.add("biz_scene");
    openapiFields.add("business_lic");
    openapiFields.add("city_code");
    openapiFields.add("district_code");
    openapiFields.add("food_business_lic");
    openapiFields.add("food_circulate_lic");
    openapiFields.add("food_health_lic");
    openapiFields.add("food_production_lic");
    openapiFields.add("food_service_lic");
    openapiFields.add("indoor_pic");
    openapiFields.add("memo");
    openapiFields.add("merchant_logon");
    openapiFields.add("province_code");
    openapiFields.add("shop_entrance_pic");
    openapiFields.add("status");
    openapiFields.add("sub_merchant_id");
    openapiFields.add("tobacco_lic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpBlueseaactivityQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpBlueseaactivityQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpBlueseaactivityQueryResponseModel is not found in the empty JSON string", AlipayOpenSpBlueseaactivityQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("business_lic") != null && !jsonObj.get("business_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_lic").toString()));
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("district_code") != null && !jsonObj.get("district_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_code").toString()));
      }
      if (jsonObj.get("food_business_lic") != null && !jsonObj.get("food_business_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `food_business_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("food_business_lic").toString()));
      }
      if (jsonObj.get("food_circulate_lic") != null && !jsonObj.get("food_circulate_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `food_circulate_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("food_circulate_lic").toString()));
      }
      if (jsonObj.get("food_health_lic") != null && !jsonObj.get("food_health_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `food_health_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("food_health_lic").toString()));
      }
      if (jsonObj.get("food_production_lic") != null && !jsonObj.get("food_production_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `food_production_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("food_production_lic").toString()));
      }
      if (jsonObj.get("food_service_lic") != null && !jsonObj.get("food_service_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `food_service_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("food_service_lic").toString()));
      }
      if (jsonObj.get("indoor_pic") != null && !jsonObj.get("indoor_pic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indoor_pic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indoor_pic").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("merchant_logon") != null && !jsonObj.get("merchant_logon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_logon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_logon").toString()));
      }
      if (jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
      if (jsonObj.get("shop_entrance_pic") != null && !jsonObj.get("shop_entrance_pic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_entrance_pic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_entrance_pic").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("sub_merchant_id") != null && !jsonObj.get("sub_merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_merchant_id").toString()));
      }
      if (jsonObj.get("tobacco_lic") != null && !jsonObj.get("tobacco_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tobacco_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tobacco_lic").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpBlueseaactivityQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpBlueseaactivityQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpBlueseaactivityQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpBlueseaactivityQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpBlueseaactivityQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpBlueseaactivityQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSpBlueseaactivityQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenSpBlueseaactivityQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSpBlueseaactivityQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpBlueseaactivityQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpBlueseaactivityQueryResponseModel
  */
  public static AlipayOpenSpBlueseaactivityQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpBlueseaactivityQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpBlueseaactivityQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

