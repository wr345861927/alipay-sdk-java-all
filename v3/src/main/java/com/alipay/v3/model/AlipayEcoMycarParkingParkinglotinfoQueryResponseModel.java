/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-10-25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.BusinessItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AlipayEcoMycarParkingParkinglotinfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingParkinglotinfoQueryResponseModel {
  public static final String SERIALIZED_NAME_ADDRESS_ID = "address_id";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ID)
  private String addressId;

  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private String agentId;

  public static final String SERIALIZED_NAME_BUSINESS_ISV = "business_isv";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ISV)
  private List<BusinessItem> businessIsv = null;

  public static final String SERIALIZED_NAME_CITY_ID = "city_id";
  @SerializedName(SERIALIZED_NAME_CITY_ID)
  private String cityId;

  public static final String SERIALIZED_NAME_MAP_POI_ADDRESS = "map_poi_address";
  @SerializedName(SERIALIZED_NAME_MAP_POI_ADDRESS)
  private String mapPoiAddress;

  public static final String SERIALIZED_NAME_MAP_POI_NAME = "map_poi_name";
  @SerializedName(SERIALIZED_NAME_MAP_POI_NAME)
  private String mapPoiName;

  public static final String SERIALIZED_NAME_MCHNT_ID = "mchnt_id";
  @SerializedName(SERIALIZED_NAME_MCHNT_ID)
  private String mchntId;

  public static final String SERIALIZED_NAME_OUT_PARKING_ID = "out_parking_id";
  @SerializedName(SERIALIZED_NAME_OUT_PARKING_ID)
  private String outParkingId;

  public static final String SERIALIZED_NAME_PARKING_ADDRESS = "parking_address";
  @SerializedName(SERIALIZED_NAME_PARKING_ADDRESS)
  private String parkingAddress;

  public static final String SERIALIZED_NAME_PARKING_FEE_DESCRIPTION = "parking_fee_description";
  @SerializedName(SERIALIZED_NAME_PARKING_FEE_DESCRIPTION)
  private String parkingFeeDescription;

  public static final String SERIALIZED_NAME_PARKING_FEE_DESCRIPTION_IMG = "parking_fee_description_img";
  @SerializedName(SERIALIZED_NAME_PARKING_FEE_DESCRIPTION_IMG)
  private String parkingFeeDescriptionImg;

  public static final String SERIALIZED_NAME_PARKING_ID = "parking_id";
  @SerializedName(SERIALIZED_NAME_PARKING_ID)
  private String parkingId;

  public static final String SERIALIZED_NAME_PARKING_LATITUDE = "parking_latitude";
  @SerializedName(SERIALIZED_NAME_PARKING_LATITUDE)
  private String parkingLatitude;

  public static final String SERIALIZED_NAME_PARKING_LONGITUDE = "parking_longitude";
  @SerializedName(SERIALIZED_NAME_PARKING_LONGITUDE)
  private String parkingLongitude;

  public static final String SERIALIZED_NAME_PARKING_LOT_TYPE = "parking_lot_type";
  @SerializedName(SERIALIZED_NAME_PARKING_LOT_TYPE)
  private String parkingLotType;

  public static final String SERIALIZED_NAME_PARKING_MOBILE = "parking_mobile";
  @SerializedName(SERIALIZED_NAME_PARKING_MOBILE)
  private String parkingMobile;

  public static final String SERIALIZED_NAME_PARKING_NAME = "parking_name";
  @SerializedName(SERIALIZED_NAME_PARKING_NAME)
  private String parkingName;

  public static final String SERIALIZED_NAME_PARKING_POIID = "parking_poiid";
  @SerializedName(SERIALIZED_NAME_PARKING_POIID)
  private String parkingPoiid;

  public static final String SERIALIZED_NAME_PAY_TYPE = "pay_type";
  @SerializedName(SERIALIZED_NAME_PAY_TYPE)
  private String payType;

  public static final String SERIALIZED_NAME_PROVINCE_ID = "province_id";
  @SerializedName(SERIALIZED_NAME_PROVINCE_ID)
  private String provinceId;

  public static final String SERIALIZED_NAME_SHOPINGMALL_ID = "shopingmall_id";
  @SerializedName(SERIALIZED_NAME_SHOPINGMALL_ID)
  private String shopingmallId;

  public static final String SERIALIZED_NAME_TIME_OUT = "time_out";
  @SerializedName(SERIALIZED_NAME_TIME_OUT)
  private String timeOut;

  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel() { 
  }

  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel addressId(String addressId) {
    
    this.addressId = addressId;
    return this;
  }

   /**
   * 地区编码
   * @return addressId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "110105", value = "地区编码")

  public String getAddressId() {
    return addressId;
  }


  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel agentId(String agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 服务商ID（2088开头的16位纯数字），由服务商提供给ISV
   * @return agentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088456825942563", value = "服务商ID（2088开头的16位纯数字），由服务商提供给ISV")

  public String getAgentId() {
    return agentId;
  }


  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel businessIsv(List<BusinessItem> businessIsv) {
    
    this.businessIsv = businessIsv;
    return this;
  }

  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel addBusinessIsvItem(BusinessItem businessIsvItem) {
    if (this.businessIsv == null) {
      this.businessIsv = new ArrayList<>();
    }
    this.businessIsv.add(businessIsvItem);
    return this;
  }

   /**
   * 车场业务归属列表
   * @return businessIsv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "车场业务归属列表")

  public List<BusinessItem> getBusinessIsv() {
    return businessIsv;
  }


  public void setBusinessIsv(List<BusinessItem> businessIsv) {
    this.businessIsv = businessIsv;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel cityId(String cityId) {
    
    this.cityId = cityId;
    return this;
  }

   /**
   * 城市编码
   * @return cityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "010", value = "城市编码")

  public String getCityId() {
    return cityId;
  }


  public void setCityId(String cityId) {
    this.cityId = cityId;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel mapPoiAddress(String mapPoiAddress) {
    
    this.mapPoiAddress = mapPoiAddress;
    return this;
  }

   /**
   * 高德检索地址
   * @return mapPoiAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "望京街4号望京SOHO", value = "高德检索地址")

  public String getMapPoiAddress() {
    return mapPoiAddress;
  }


  public void setMapPoiAddress(String mapPoiAddress) {
    this.mapPoiAddress = mapPoiAddress;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel mapPoiName(String mapPoiName) {
    
    this.mapPoiName = mapPoiName;
    return this;
  }

   /**
   * 高德检索名称
   * @return mapPoiName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "望京SOHO停车场", value = "高德检索名称")

  public String getMapPoiName() {
    return mapPoiName;
  }


  public void setMapPoiName(String mapPoiName) {
    this.mapPoiName = mapPoiName;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel mchntId(String mchntId) {
    
    this.mchntId = mchntId;
    return this;
  }

   /**
   * 收款方ID（2088开头的16位纯数字），由停车场收款的业主方提供给ISV，该字段暂用于机具和物料申领
   * @return mchntId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088456825942563", value = "收款方ID（2088开头的16位纯数字），由停车场收款的业主方提供给ISV，该字段暂用于机具和物料申领")

  public String getMchntId() {
    return mchntId;
  }


  public void setMchntId(String mchntId) {
    this.mchntId = mchntId;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel outParkingId(String outParkingId) {
    
    this.outParkingId = outParkingId;
    return this;
  }

   /**
   * ISV停车场ID，由ISV提供，同一个isv或商户范围内唯一
   * @return outParkingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000110001", value = "ISV停车场ID，由ISV提供，同一个isv或商户范围内唯一")

  public String getOutParkingId() {
    return outParkingId;
  }


  public void setOutParkingId(String outParkingId) {
    this.outParkingId = outParkingId;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel parkingAddress(String parkingAddress) {
    
    this.parkingAddress = parkingAddress;
    return this;
  }

   /**
   * 停车场地址
   * @return parkingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "北京市朝阳区望京街与阜安西路交叉路口", value = "停车场地址")

  public String getParkingAddress() {
    return parkingAddress;
  }


  public void setParkingAddress(String parkingAddress) {
    this.parkingAddress = parkingAddress;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel parkingFeeDescription(String parkingFeeDescription) {
    
    this.parkingFeeDescription = parkingFeeDescription;
    return this;
  }

   /**
   * 收费说明
   * @return parkingFeeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小车一小时10元", value = "收费说明")

  public String getParkingFeeDescription() {
    return parkingFeeDescription;
  }


  public void setParkingFeeDescription(String parkingFeeDescription) {
    this.parkingFeeDescription = parkingFeeDescription;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel parkingFeeDescriptionImg(String parkingFeeDescriptionImg) {
    
    this.parkingFeeDescriptionImg = parkingFeeDescriptionImg;
    return this;
  }

   /**
   * 停车场价格明细图片
   * @return parkingFeeDescriptionImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://mdgwdev.alipay.net/afts/img/A*617CRpBdj_fJCs1NmMi4dQAAAa4wAA/original?bz=industry_etc&t=-NhhRTMCAllKiM3Vj1mNcQAAAABkMK5ft-HF", value = "停车场价格明细图片")

  public String getParkingFeeDescriptionImg() {
    return parkingFeeDescriptionImg;
  }


  public void setParkingFeeDescriptionImg(String parkingFeeDescriptionImg) {
    this.parkingFeeDescriptionImg = parkingFeeDescriptionImg;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel parkingId(String parkingId) {
    
    this.parkingId = parkingId;
    return this;
  }

   /**
   * 支付宝返回停车场id，系统唯一
   * @return parkingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PI1532313981415143356", value = "支付宝返回停车场id，系统唯一")

  public String getParkingId() {
    return parkingId;
  }


  public void setParkingId(String parkingId) {
    this.parkingId = parkingId;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel parkingLatitude(String parkingLatitude) {
    
    this.parkingLatitude = parkingLatitude;
    return this;
  }

   /**
   * 停车场位置经度（优先高德坐标获取结果）
   * @return parkingLatitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "39.998001", value = "停车场位置经度（优先高德坐标获取结果）")

  public String getParkingLatitude() {
    return parkingLatitude;
  }


  public void setParkingLatitude(String parkingLatitude) {
    this.parkingLatitude = parkingLatitude;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel parkingLongitude(String parkingLongitude) {
    
    this.parkingLongitude = parkingLongitude;
    return this;
  }

   /**
   * 停车场位置经度（优先高德坐标获取结果）
   * @return parkingLongitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "116.480654", value = "停车场位置经度（优先高德坐标获取结果）")

  public String getParkingLongitude() {
    return parkingLongitude;
  }


  public void setParkingLongitude(String parkingLongitude) {
    this.parkingLongitude = parkingLongitude;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel parkingLotType(String parkingLotType) {
    
    this.parkingLotType = parkingLotType;
    return this;
  }

   /**
   * 停车场类型，1为居民小区、2为商圈停车场（购物中心商业广场商场等）、3为路侧停车、4为公园景点（景点乐园公园老街古镇等）、5为商务楼宇（酒店写字楼商务楼园区等）、6为其他、7为交通枢纽（机场火车站汽车站码头港口等）、8为市政设施（体育场博物图书馆医院学校等）
   * @return parkingLotType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2为商圈停车场（购物中心商业广场商场等）", value = "停车场类型，1为居民小区、2为商圈停车场（购物中心商业广场商场等）、3为路侧停车、4为公园景点（景点乐园公园老街古镇等）、5为商务楼宇（酒店写字楼商务楼园区等）、6为其他、7为交通枢纽（机场火车站汽车站码头港口等）、8为市政设施（体育场博物图书馆医院学校等）")

  public String getParkingLotType() {
    return parkingLotType;
  }


  public void setParkingLotType(String parkingLotType) {
    this.parkingLotType = parkingLotType;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel parkingMobile(String parkingMobile) {
    
    this.parkingMobile = parkingMobile;
    return this;
  }

   /**
   * 停车场客服电话
   * @return parkingMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "189XXXXXXXX", value = "停车场客服电话")

  public String getParkingMobile() {
    return parkingMobile;
  }


  public void setParkingMobile(String parkingMobile) {
    this.parkingMobile = parkingMobile;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel parkingName(String parkingName) {
    
    this.parkingName = parkingName;
    return this;
  }

   /**
   * 停车场名称，由ISV定义，尽量与高德地图上的一致
   * @return parkingName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "望京SOHO停车场", value = "停车场名称，由ISV定义，尽量与高德地图上的一致")

  public String getParkingName() {
    return parkingName;
  }


  public void setParkingName(String parkingName) {
    this.parkingName = parkingName;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel parkingPoiid(String parkingPoiid) {
    
    this.parkingPoiid = parkingPoiid;
    return this;
  }

   /**
   * 高德地图唯一标识
   * @return parkingPoiid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B0FFFAIBGG", value = "高德地图唯一标识")

  public String getParkingPoiid() {
    return parkingPoiid;
  }


  public void setParkingPoiid(String parkingPoiid) {
    this.parkingPoiid = parkingPoiid;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel payType(String payType) {
    
    this.payType = payType;
    return this;
  }

   /**
   * 支付方式（1为支付宝在线缴费，2为支付宝代扣缴费，3当面付)，如支持多种方式以&#39;,&#39;进行间隔
   * @return payType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2为支付宝代扣缴费", value = "支付方式（1为支付宝在线缴费，2为支付宝代扣缴费，3当面付)，如支持多种方式以','进行间隔")

  public String getPayType() {
    return payType;
  }


  public void setPayType(String payType) {
    this.payType = payType;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel provinceId(String provinceId) {
    
    this.provinceId = provinceId;
    return this;
  }

   /**
   * 省份编码
   * @return provinceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "110000", value = "省份编码")

  public String getProvinceId() {
    return provinceId;
  }


  public void setProvinceId(String provinceId) {
    this.provinceId = provinceId;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel shopingmallId(String shopingmallId) {
    
    this.shopingmallId = shopingmallId;
    return this;
  }

   /**
   * 商圈id
   * @return shopingmallId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100001008", value = "商圈id")

  public String getShopingmallId() {
    return shopingmallId;
  }


  public void setShopingmallId(String shopingmallId) {
    this.shopingmallId = shopingmallId;
  }


  public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel timeOut(String timeOut) {
    
    this.timeOut = timeOut;
    return this;
  }

   /**
   * 用户支付未离场的超时时间(以分钟为单位)
   * @return timeOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13", value = "用户支付未离场的超时时间(以分钟为单位)")

  public String getTimeOut() {
    return timeOut;
  }


  public void setTimeOut(String timeOut) {
    this.timeOut = timeOut;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoMycarParkingParkinglotinfoQueryResponseModel alipayEcoMycarParkingParkinglotinfoQueryResponseModel = (AlipayEcoMycarParkingParkinglotinfoQueryResponseModel) o;
    return Objects.equals(this.addressId, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.addressId) &&
        Objects.equals(this.agentId, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.agentId) &&
        Objects.equals(this.businessIsv, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.businessIsv) &&
        Objects.equals(this.cityId, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.cityId) &&
        Objects.equals(this.mapPoiAddress, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.mapPoiAddress) &&
        Objects.equals(this.mapPoiName, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.mapPoiName) &&
        Objects.equals(this.mchntId, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.mchntId) &&
        Objects.equals(this.outParkingId, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.outParkingId) &&
        Objects.equals(this.parkingAddress, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.parkingAddress) &&
        Objects.equals(this.parkingFeeDescription, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.parkingFeeDescription) &&
        Objects.equals(this.parkingFeeDescriptionImg, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.parkingFeeDescriptionImg) &&
        Objects.equals(this.parkingId, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.parkingId) &&
        Objects.equals(this.parkingLatitude, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.parkingLatitude) &&
        Objects.equals(this.parkingLongitude, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.parkingLongitude) &&
        Objects.equals(this.parkingLotType, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.parkingLotType) &&
        Objects.equals(this.parkingMobile, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.parkingMobile) &&
        Objects.equals(this.parkingName, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.parkingName) &&
        Objects.equals(this.parkingPoiid, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.parkingPoiid) &&
        Objects.equals(this.payType, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.payType) &&
        Objects.equals(this.provinceId, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.provinceId) &&
        Objects.equals(this.shopingmallId, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.shopingmallId) &&
        Objects.equals(this.timeOut, alipayEcoMycarParkingParkinglotinfoQueryResponseModel.timeOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, agentId, businessIsv, cityId, mapPoiAddress, mapPoiName, mchntId, outParkingId, parkingAddress, parkingFeeDescription, parkingFeeDescriptionImg, parkingId, parkingLatitude, parkingLongitude, parkingLotType, parkingMobile, parkingName, parkingPoiid, payType, provinceId, shopingmallId, timeOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingParkinglotinfoQueryResponseModel {\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    businessIsv: ").append(toIndentedString(businessIsv)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    mapPoiAddress: ").append(toIndentedString(mapPoiAddress)).append("\n");
    sb.append("    mapPoiName: ").append(toIndentedString(mapPoiName)).append("\n");
    sb.append("    mchntId: ").append(toIndentedString(mchntId)).append("\n");
    sb.append("    outParkingId: ").append(toIndentedString(outParkingId)).append("\n");
    sb.append("    parkingAddress: ").append(toIndentedString(parkingAddress)).append("\n");
    sb.append("    parkingFeeDescription: ").append(toIndentedString(parkingFeeDescription)).append("\n");
    sb.append("    parkingFeeDescriptionImg: ").append(toIndentedString(parkingFeeDescriptionImg)).append("\n");
    sb.append("    parkingId: ").append(toIndentedString(parkingId)).append("\n");
    sb.append("    parkingLatitude: ").append(toIndentedString(parkingLatitude)).append("\n");
    sb.append("    parkingLongitude: ").append(toIndentedString(parkingLongitude)).append("\n");
    sb.append("    parkingLotType: ").append(toIndentedString(parkingLotType)).append("\n");
    sb.append("    parkingMobile: ").append(toIndentedString(parkingMobile)).append("\n");
    sb.append("    parkingName: ").append(toIndentedString(parkingName)).append("\n");
    sb.append("    parkingPoiid: ").append(toIndentedString(parkingPoiid)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
    sb.append("    provinceId: ").append(toIndentedString(provinceId)).append("\n");
    sb.append("    shopingmallId: ").append(toIndentedString(shopingmallId)).append("\n");
    sb.append("    timeOut: ").append(toIndentedString(timeOut)).append("\n");
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
    openapiFields.add("address_id");
    openapiFields.add("agent_id");
    openapiFields.add("business_isv");
    openapiFields.add("city_id");
    openapiFields.add("map_poi_address");
    openapiFields.add("map_poi_name");
    openapiFields.add("mchnt_id");
    openapiFields.add("out_parking_id");
    openapiFields.add("parking_address");
    openapiFields.add("parking_fee_description");
    openapiFields.add("parking_fee_description_img");
    openapiFields.add("parking_id");
    openapiFields.add("parking_latitude");
    openapiFields.add("parking_longitude");
    openapiFields.add("parking_lot_type");
    openapiFields.add("parking_mobile");
    openapiFields.add("parking_name");
    openapiFields.add("parking_poiid");
    openapiFields.add("pay_type");
    openapiFields.add("province_id");
    openapiFields.add("shopingmall_id");
    openapiFields.add("time_out");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingParkinglotinfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingParkinglotinfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingParkinglotinfoQueryResponseModel is not found in the empty JSON string", AlipayEcoMycarParkingParkinglotinfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoMycarParkingParkinglotinfoQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoMycarParkingParkinglotinfoQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("address_id") != null && !jsonObj.get("address_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_id").toString()));
      }
      if (jsonObj.get("agent_id") != null && !jsonObj.get("agent_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_id").toString()));
      }
      JsonArray jsonArraybusinessIsv = jsonObj.getAsJsonArray("business_isv");
      if (jsonArraybusinessIsv != null) {
        // ensure the json data is an array
        if (!jsonObj.get("business_isv").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `business_isv` to be an array in the JSON string but got `%s`", jsonObj.get("business_isv").toString()));
        }

        // validate the optional field `business_isv` (array)
        for (int i = 0; i < jsonArraybusinessIsv.size(); i++) {
          BusinessItem.validateJsonObject(jsonArraybusinessIsv.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("city_id") != null && !jsonObj.get("city_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_id").toString()));
      }
      if (jsonObj.get("map_poi_address") != null && !jsonObj.get("map_poi_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `map_poi_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("map_poi_address").toString()));
      }
      if (jsonObj.get("map_poi_name") != null && !jsonObj.get("map_poi_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `map_poi_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("map_poi_name").toString()));
      }
      if (jsonObj.get("mchnt_id") != null && !jsonObj.get("mchnt_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mchnt_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mchnt_id").toString()));
      }
      if (jsonObj.get("out_parking_id") != null && !jsonObj.get("out_parking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_parking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_parking_id").toString()));
      }
      if (jsonObj.get("parking_address") != null && !jsonObj.get("parking_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_address").toString()));
      }
      if (jsonObj.get("parking_fee_description") != null && !jsonObj.get("parking_fee_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_fee_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_fee_description").toString()));
      }
      if (jsonObj.get("parking_fee_description_img") != null && !jsonObj.get("parking_fee_description_img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_fee_description_img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_fee_description_img").toString()));
      }
      if (jsonObj.get("parking_id") != null && !jsonObj.get("parking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_id").toString()));
      }
      if (jsonObj.get("parking_latitude") != null && !jsonObj.get("parking_latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_latitude").toString()));
      }
      if (jsonObj.get("parking_longitude") != null && !jsonObj.get("parking_longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_longitude").toString()));
      }
      if (jsonObj.get("parking_lot_type") != null && !jsonObj.get("parking_lot_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_lot_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_lot_type").toString()));
      }
      if (jsonObj.get("parking_mobile") != null && !jsonObj.get("parking_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_mobile").toString()));
      }
      if (jsonObj.get("parking_name") != null && !jsonObj.get("parking_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_name").toString()));
      }
      if (jsonObj.get("parking_poiid") != null && !jsonObj.get("parking_poiid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_poiid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_poiid").toString()));
      }
      if (jsonObj.get("pay_type") != null && !jsonObj.get("pay_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_type").toString()));
      }
      if (jsonObj.get("province_id") != null && !jsonObj.get("province_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_id").toString()));
      }
      if (jsonObj.get("shopingmall_id") != null && !jsonObj.get("shopingmall_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopingmall_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopingmall_id").toString()));
      }
      if (jsonObj.get("time_out") != null && !jsonObj.get("time_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_out").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingParkinglotinfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingParkinglotinfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingParkinglotinfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingParkinglotinfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingParkinglotinfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingParkinglotinfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoMycarParkingParkinglotinfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingParkinglotinfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingParkinglotinfoQueryResponseModel
  */
  public static AlipayEcoMycarParkingParkinglotinfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingParkinglotinfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingParkinglotinfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

