/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
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
 * AlipayEcoMycarParkingOrderSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingOrderSyncModel {
  public static final String SERIALIZED_NAME_AGENT_PID = "agent_pid";
  @SerializedName(SERIALIZED_NAME_AGENT_PID)
  private String agentPid;

  public static final String SERIALIZED_NAME_CAR_NUMBER = "car_number";
  @SerializedName(SERIALIZED_NAME_CAR_NUMBER)
  private String carNumber;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "card_number";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_IN_DURATION = "in_duration";
  @SerializedName(SERIALIZED_NAME_IN_DURATION)
  private String inDuration;

  public static final String SERIALIZED_NAME_IN_TIME = "in_time";
  @SerializedName(SERIALIZED_NAME_IN_TIME)
  private String inTime;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public static final String SERIALIZED_NAME_ORDER_TIME = "order_time";
  @SerializedName(SERIALIZED_NAME_ORDER_TIME)
  private String orderTime;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_OUT_PARKING_ID = "out_parking_id";
  @SerializedName(SERIALIZED_NAME_OUT_PARKING_ID)
  private String outParkingId;

  public static final String SERIALIZED_NAME_OUT_TIME = "out_time";
  @SerializedName(SERIALIZED_NAME_OUT_TIME)
  private String outTime;

  public static final String SERIALIZED_NAME_PARKING_ID = "parking_id";
  @SerializedName(SERIALIZED_NAME_PARKING_ID)
  private String parkingId;

  public static final String SERIALIZED_NAME_PARKING_NAME = "parking_name";
  @SerializedName(SERIALIZED_NAME_PARKING_NAME)
  private String parkingName;

  public static final String SERIALIZED_NAME_PARKING_RECORD_ID = "parking_record_id";
  @SerializedName(SERIALIZED_NAME_PARKING_RECORD_ID)
  private String parkingRecordId;

  public static final String SERIALIZED_NAME_PAY_MONEY = "pay_money";
  @SerializedName(SERIALIZED_NAME_PAY_MONEY)
  private String payMoney;

  public static final String SERIALIZED_NAME_PAY_SCENE = "pay_scene";
  @SerializedName(SERIALIZED_NAME_PAY_SCENE)
  private String payScene;

  public static final String SERIALIZED_NAME_PAY_TIME = "pay_time";
  @SerializedName(SERIALIZED_NAME_PAY_TIME)
  private String payTime;

  public static final String SERIALIZED_NAME_PAY_TYPE = "pay_type";
  @SerializedName(SERIALIZED_NAME_PAY_TYPE)
  private String payType;

  public static final String SERIALIZED_NAME_SMID = "smid";
  @SerializedName(SERIALIZED_NAME_SMID)
  private String smid;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayEcoMycarParkingOrderSyncModel() { 
  }

  public AlipayEcoMycarParkingOrderSyncModel agentPid(String agentPid) {
    
    this.agentPid = agentPid;
    return this;
  }

   /**
   * 该笔停车交易需要返佣的对象实体PID，可能是商户，可能是ISV；只做下沉，用于离线表层面对账。
   * @return agentPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxx", value = "该笔停车交易需要返佣的对象实体PID，可能是商户，可能是ISV；只做下沉，用于离线表层面对账。")

  public String getAgentPid() {
    return agentPid;
  }


  public void setAgentPid(String agentPid) {
    this.agentPid = agentPid;
  }


  public AlipayEcoMycarParkingOrderSyncModel carNumber(String carNumber) {
    
    this.carNumber = carNumber;
    return this;
  }

   /**
   * 车牌
   * @return carNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙Axxxxx", value = "车牌")

  public String getCarNumber() {
    return carNumber;
  }


  public void setCarNumber(String carNumber) {
    this.carNumber = carNumber;
  }


  public AlipayEcoMycarParkingOrderSyncModel cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * 如果是停车卡缴费，则填入停车卡卡号，否则为&#39;*&#39;
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2357868977445645645656", value = "如果是停车卡缴费，则填入停车卡卡号，否则为'*'")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public AlipayEcoMycarParkingOrderSyncModel inDuration(String inDuration) {
    
    this.inDuration = inDuration;
    return this;
  }

   /**
   * 停车时长（以分为单位）
   * @return inDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "320", value = "停车时长（以分为单位）")

  public String getInDuration() {
    return inDuration;
  }


  public void setInDuration(String inDuration) {
    this.inDuration = inDuration;
  }


  public AlipayEcoMycarParkingOrderSyncModel inTime(String inTime) {
    
    this.inTime = inTime;
    return this;
  }

   /**
   * 入场时间，格式\&quot;YYYY-MM-DD HH:mm:ss\&quot;，24小时制
   * @return inTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-08-12 20:20:13", value = "入场时间，格式\"YYYY-MM-DD HH:mm:ss\"，24小时制")

  public String getInTime() {
    return inTime;
  }


  public void setInTime(String inTime) {
    this.inTime = inTime;
  }


  public AlipayEcoMycarParkingOrderSyncModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 应用用户ID，唯一标识
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "021uU2O6oUtUsckXA1rpUpiWpFWNTOFZXoOgVOPIrkW2Dgb", value = "应用用户ID，唯一标识")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayEcoMycarParkingOrderSyncModel orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 支付宝支付流水，系统唯一
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7674879087745646586", value = "支付宝支付流水，系统唯一")

  public String getOrderNo() {
    return orderNo;
  }


  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public AlipayEcoMycarParkingOrderSyncModel orderStatus(String orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * 设备商订单状态，枚举支持： * 0：成功。 * 1：失败。
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "设备商订单状态，枚举支持： * 0：成功。 * 1：失败。")

  public String getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public AlipayEcoMycarParkingOrderSyncModel orderTime(String orderTime) {
    
    this.orderTime = orderTime;
    return this;
  }

   /**
   * 订单创建时间，格式\&quot;YYYY-MM-DD HH:mm:ss\&quot;，24小时制
   * @return orderTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-08-12 20:27:30", value = "订单创建时间，格式\"YYYY-MM-DD HH:mm:ss\"，24小时制")

  public String getOrderTime() {
    return orderTime;
  }


  public void setOrderTime(String orderTime) {
    this.orderTime = orderTime;
  }


  public AlipayEcoMycarParkingOrderSyncModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 设备商订单号，由ISV系统生成
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201605061278654435466567", value = "设备商订单号，由ISV系统生成")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public AlipayEcoMycarParkingOrderSyncModel outParkingId(String outParkingId) {
    
    this.outParkingId = outParkingId;
    return this;
  }

   /**
   * ISV停车场ID，由ISV定义的停车场标识，同一个isv或商户范围内唯一。需与 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口传入值一致。
   * @return outParkingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201605061278654", value = "ISV停车场ID，由ISV定义的停车场标识，同一个isv或商户范围内唯一。需与 <a href=\"https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口传入值一致。")

  public String getOutParkingId() {
    return outParkingId;
  }


  public void setOutParkingId(String outParkingId) {
    this.outParkingId = outParkingId;
  }


  public AlipayEcoMycarParkingOrderSyncModel outTime(String outTime) {
    
    this.outTime = outTime;
    return this;
  }

   /**
   * 出场时间，格式\&quot;YYYY-MM-DD HH:mm:ss\&quot;，24小时制
   * @return outTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-04 15:04:05", value = "出场时间，格式\"YYYY-MM-DD HH:mm:ss\"，24小时制")

  public String getOutTime() {
    return outTime;
  }


  public void setOutTime(String outTime) {
    this.outTime = outTime;
  }


  public AlipayEcoMycarParkingOrderSyncModel parkingId(String parkingId) {
    
    this.parkingId = parkingId;
    return this;
  }

   /**
   * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口获取。
   * @return parkingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890123456", value = "支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 <a href=\"https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口获取。")

  public String getParkingId() {
    return parkingId;
  }


  public void setParkingId(String parkingId) {
    this.parkingId = parkingId;
  }


  public AlipayEcoMycarParkingOrderSyncModel parkingName(String parkingName) {
    
    this.parkingName = parkingName;
    return this;
  }

   /**
   * 停车场名称，需与&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口传入值一致。
   * @return parkingName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "上海证大五道口地下停车场", value = "停车场名称，需与<a href=\"https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口传入值一致。")

  public String getParkingName() {
    return parkingName;
  }


  public void setParkingName(String parkingName) {
    this.parkingName = parkingName;
  }


  public AlipayEcoMycarParkingOrderSyncModel parkingRecordId(String parkingRecordId) {
    
    this.parkingRecordId = parkingRecordId;
    return this;
  }

   /**
   * 支付宝业务流水号，用于记录车辆从驶入到驶出的全流程。通过 alipay.eco.mycar.parking.enterinfo.sync(车辆驶入接口)接口获取。
   * @return parkingRecordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090711003017233600000001", value = "支付宝业务流水号，用于记录车辆从驶入到驶出的全流程。通过 alipay.eco.mycar.parking.enterinfo.sync(车辆驶入接口)接口获取。")

  public String getParkingRecordId() {
    return parkingRecordId;
  }


  public void setParkingRecordId(String parkingRecordId) {
    this.parkingRecordId = parkingRecordId;
  }


  public AlipayEcoMycarParkingOrderSyncModel payMoney(String payMoney) {
    
    this.payMoney = payMoney;
    return this;
  }

   /**
   * 缴费金额，保留小数点后两位
   * @return payMoney
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.00", value = "缴费金额，保留小数点后两位")

  public String getPayMoney() {
    return payMoney;
  }


  public void setPayMoney(String payMoney) {
    this.payMoney = payMoney;
  }


  public AlipayEcoMycarParkingOrderSyncModel payScene(String payScene) {
    
    this.payScene = payScene;
    return this;
  }

   /**
   * 支付场景：INPARKINGLOT_PAY：场内在线缴费；ENTRANCE_EXIT_PAY：出入口缴费、VEH_DEVICE_PAY：车机缴费；会根据场景判断是否发放能量，当前只有场内支付场景会发能量，需要能量发放请与服务接入支持同学提前沟通。
   * @return payScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INPARKINGLOT_PAY", value = "支付场景：INPARKINGLOT_PAY：场内在线缴费；ENTRANCE_EXIT_PAY：出入口缴费、VEH_DEVICE_PAY：车机缴费；会根据场景判断是否发放能量，当前只有场内支付场景会发能量，需要能量发放请与服务接入支持同学提前沟通。")

  public String getPayScene() {
    return payScene;
  }


  public void setPayScene(String payScene) {
    this.payScene = payScene;
  }


  public AlipayEcoMycarParkingOrderSyncModel payTime(String payTime) {
    
    this.payTime = payTime;
    return this;
  }

   /**
   * 缴费时间, 格式\&quot;YYYYMM-DD HH:mm:ss\&quot;，24小时制
   * @return payTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-08-12 23:20:23", value = "缴费时间, 格式\"YYYYMM-DD HH:mm:ss\"，24小时制")

  public String getPayTime() {
    return payTime;
  }


  public void setPayTime(String payTime) {
    this.payTime = payTime;
  }


  public AlipayEcoMycarParkingOrderSyncModel payType(String payType) {
    
    this.payType = payType;
    return this;
  }

   /**
   * 付款方式，枚举支持： *1：支付宝在线缴费。
   * @return payType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "付款方式，枚举支持： *1：支付宝在线缴费。")

  public String getPayType() {
    return payType;
  }


  public void setPayType(String payType) {
    this.payType = payType;
  }


  public AlipayEcoMycarParkingOrderSyncModel smid(String smid) {
    
    this.smid = smid;
    return this;
  }

   /**
   * 间连商户ID
   * @return smid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345678900", value = "间连商户ID")

  public String getSmid() {
    return smid;
  }


  public void setSmid(String smid) {
    this.smid = smid;
  }


  public AlipayEcoMycarParkingOrderSyncModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 停车缴费用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 注意：ISV需保证用户 id的正确性，以免导致用户在停车平台查询不到相关的订单信息。
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088006362935583", value = "停车缴费用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 注意：ISV需保证用户 id的正确性，以免导致用户在停车平台查询不到相关的订单信息。")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
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
   * @return the AlipayEcoMycarParkingOrderSyncModel instance itself
   */
  public AlipayEcoMycarParkingOrderSyncModel putAdditionalProperty(String key, Object value) {
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
    AlipayEcoMycarParkingOrderSyncModel alipayEcoMycarParkingOrderSyncModel = (AlipayEcoMycarParkingOrderSyncModel) o;
    return Objects.equals(this.agentPid, alipayEcoMycarParkingOrderSyncModel.agentPid) &&
        Objects.equals(this.carNumber, alipayEcoMycarParkingOrderSyncModel.carNumber) &&
        Objects.equals(this.cardNumber, alipayEcoMycarParkingOrderSyncModel.cardNumber) &&
        Objects.equals(this.inDuration, alipayEcoMycarParkingOrderSyncModel.inDuration) &&
        Objects.equals(this.inTime, alipayEcoMycarParkingOrderSyncModel.inTime) &&
        Objects.equals(this.openId, alipayEcoMycarParkingOrderSyncModel.openId) &&
        Objects.equals(this.orderNo, alipayEcoMycarParkingOrderSyncModel.orderNo) &&
        Objects.equals(this.orderStatus, alipayEcoMycarParkingOrderSyncModel.orderStatus) &&
        Objects.equals(this.orderTime, alipayEcoMycarParkingOrderSyncModel.orderTime) &&
        Objects.equals(this.outOrderNo, alipayEcoMycarParkingOrderSyncModel.outOrderNo) &&
        Objects.equals(this.outParkingId, alipayEcoMycarParkingOrderSyncModel.outParkingId) &&
        Objects.equals(this.outTime, alipayEcoMycarParkingOrderSyncModel.outTime) &&
        Objects.equals(this.parkingId, alipayEcoMycarParkingOrderSyncModel.parkingId) &&
        Objects.equals(this.parkingName, alipayEcoMycarParkingOrderSyncModel.parkingName) &&
        Objects.equals(this.parkingRecordId, alipayEcoMycarParkingOrderSyncModel.parkingRecordId) &&
        Objects.equals(this.payMoney, alipayEcoMycarParkingOrderSyncModel.payMoney) &&
        Objects.equals(this.payScene, alipayEcoMycarParkingOrderSyncModel.payScene) &&
        Objects.equals(this.payTime, alipayEcoMycarParkingOrderSyncModel.payTime) &&
        Objects.equals(this.payType, alipayEcoMycarParkingOrderSyncModel.payType) &&
        Objects.equals(this.smid, alipayEcoMycarParkingOrderSyncModel.smid) &&
        Objects.equals(this.userId, alipayEcoMycarParkingOrderSyncModel.userId)&&
        Objects.equals(this.additionalProperties, alipayEcoMycarParkingOrderSyncModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentPid, carNumber, cardNumber, inDuration, inTime, openId, orderNo, orderStatus, orderTime, outOrderNo, outParkingId, outTime, parkingId, parkingName, parkingRecordId, payMoney, payScene, payTime, payType, smid, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingOrderSyncModel {\n");
    sb.append("    agentPid: ").append(toIndentedString(agentPid)).append("\n");
    sb.append("    carNumber: ").append(toIndentedString(carNumber)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    inDuration: ").append(toIndentedString(inDuration)).append("\n");
    sb.append("    inTime: ").append(toIndentedString(inTime)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderTime: ").append(toIndentedString(orderTime)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    outParkingId: ").append(toIndentedString(outParkingId)).append("\n");
    sb.append("    outTime: ").append(toIndentedString(outTime)).append("\n");
    sb.append("    parkingId: ").append(toIndentedString(parkingId)).append("\n");
    sb.append("    parkingName: ").append(toIndentedString(parkingName)).append("\n");
    sb.append("    parkingRecordId: ").append(toIndentedString(parkingRecordId)).append("\n");
    sb.append("    payMoney: ").append(toIndentedString(payMoney)).append("\n");
    sb.append("    payScene: ").append(toIndentedString(payScene)).append("\n");
    sb.append("    payTime: ").append(toIndentedString(payTime)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
    sb.append("    smid: ").append(toIndentedString(smid)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("agent_pid");
    openapiFields.add("car_number");
    openapiFields.add("card_number");
    openapiFields.add("in_duration");
    openapiFields.add("in_time");
    openapiFields.add("open_id");
    openapiFields.add("order_no");
    openapiFields.add("order_status");
    openapiFields.add("order_time");
    openapiFields.add("out_order_no");
    openapiFields.add("out_parking_id");
    openapiFields.add("out_time");
    openapiFields.add("parking_id");
    openapiFields.add("parking_name");
    openapiFields.add("parking_record_id");
    openapiFields.add("pay_money");
    openapiFields.add("pay_scene");
    openapiFields.add("pay_time");
    openapiFields.add("pay_type");
    openapiFields.add("smid");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingOrderSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingOrderSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingOrderSyncModel is not found in the empty JSON string", AlipayEcoMycarParkingOrderSyncModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agent_pid") != null && !jsonObj.get("agent_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_pid").toString()));
      }
      if (jsonObj.get("car_number") != null && !jsonObj.get("car_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `car_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("car_number").toString()));
      }
      if (jsonObj.get("card_number") != null && !jsonObj.get("card_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_number").toString()));
      }
      if (jsonObj.get("in_duration") != null && !jsonObj.get("in_duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in_duration").toString()));
      }
      if (jsonObj.get("in_time") != null && !jsonObj.get("in_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in_time").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("order_no") != null && !jsonObj.get("order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_no").toString()));
      }
      if (jsonObj.get("order_status") != null && !jsonObj.get("order_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_status").toString()));
      }
      if (jsonObj.get("order_time") != null && !jsonObj.get("order_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_time").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
      if (jsonObj.get("out_parking_id") != null && !jsonObj.get("out_parking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_parking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_parking_id").toString()));
      }
      if (jsonObj.get("out_time") != null && !jsonObj.get("out_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_time").toString()));
      }
      if (jsonObj.get("parking_id") != null && !jsonObj.get("parking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_id").toString()));
      }
      if (jsonObj.get("parking_name") != null && !jsonObj.get("parking_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_name").toString()));
      }
      if (jsonObj.get("parking_record_id") != null && !jsonObj.get("parking_record_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_record_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_record_id").toString()));
      }
      if (jsonObj.get("pay_money") != null && !jsonObj.get("pay_money").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_money` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_money").toString()));
      }
      if (jsonObj.get("pay_scene") != null && !jsonObj.get("pay_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_scene").toString()));
      }
      if (jsonObj.get("pay_time") != null && !jsonObj.get("pay_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_time").toString()));
      }
      if (jsonObj.get("pay_type") != null && !jsonObj.get("pay_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_type").toString()));
      }
      if (jsonObj.get("smid") != null && !jsonObj.get("smid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smid").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingOrderSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingOrderSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingOrderSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingOrderSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingOrderSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingOrderSyncModel value) throws IOException {
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
           public AlipayEcoMycarParkingOrderSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEcoMycarParkingOrderSyncModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEcoMycarParkingOrderSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingOrderSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingOrderSyncModel
  */
  public static AlipayEcoMycarParkingOrderSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingOrderSyncModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingOrderSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

