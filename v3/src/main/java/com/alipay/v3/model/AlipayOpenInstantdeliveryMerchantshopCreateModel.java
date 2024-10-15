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
 * AlipayOpenInstantdeliveryMerchantshopCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenInstantdeliveryMerchantshopCreateModel {
  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  public static final String SERIALIZED_NAME_DETAIL_ADDRESS = "detail_address";
  @SerializedName(SERIALIZED_NAME_DETAIL_ADDRESS)
  private String detailAddress;

  public static final String SERIALIZED_NAME_ENTERPRISE_CITY = "enterprise_city";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_CITY)
  private String enterpriseCity;

  public static final String SERIALIZED_NAME_ENTERPRISE_DISTRICT = "enterprise_district";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_DISTRICT)
  private String enterpriseDistrict;

  public static final String SERIALIZED_NAME_ENTERPRISE_PROVINCE = "enterprise_province";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_PROVINCE)
  private String enterpriseProvince;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_POIID = "poiid";
  @SerializedName(SERIALIZED_NAME_POIID)
  private String poiid;

  public static final String SERIALIZED_NAME_SHOP_CATEGORY = "shop_category";
  @SerializedName(SERIALIZED_NAME_SHOP_CATEGORY)
  private String shopCategory;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName;

  public static final String SERIALIZED_NAME_SHOP_NO = "shop_no";
  @SerializedName(SERIALIZED_NAME_SHOP_NO)
  private String shopNo;

  public AlipayOpenInstantdeliveryMerchantshopCreateModel() { 
  }

  public AlipayOpenInstantdeliveryMerchantshopCreateModel contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 联系人姓名
   * @return contactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "联系人姓名")

  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel detailAddress(String detailAddress) {
    
    this.detailAddress = detailAddress;
    return this;
  }

   /**
   * 地址。商户详细经营地址或人员所在地点
   * @return detailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "万塘路18号黄龙时代广场B座", value = "地址。商户详细经营地址或人员所在地点")

  public String getDetailAddress() {
    return detailAddress;
  }


  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel enterpriseCity(String enterpriseCity) {
    
    this.enterpriseCity = enterpriseCity;
    return this;
  }

   /**
   * 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
   * @return enterpriseCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "371000", value = "城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）")

  public String getEnterpriseCity() {
    return enterpriseCity;
  }


  public void setEnterpriseCity(String enterpriseCity) {
    this.enterpriseCity = enterpriseCity;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel enterpriseDistrict(String enterpriseDistrict) {
    
    this.enterpriseDistrict = enterpriseDistrict;
    return this;
  }

   /**
   * 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
   * @return enterpriseDistrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "371002", value = "区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）")

  public String getEnterpriseDistrict() {
    return enterpriseDistrict;
  }


  public void setEnterpriseDistrict(String enterpriseDistrict) {
    this.enterpriseDistrict = enterpriseDistrict;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel enterpriseProvince(String enterpriseProvince) {
    
    this.enterpriseProvince = enterpriseProvince;
    return this;
  }

   /**
   * 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
   * @return enterpriseProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "370000", value = "省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）")

  public String getEnterpriseProvince() {
    return enterpriseProvince;
  }


  public void setEnterpriseProvince(String enterpriseProvince) {
    this.enterpriseProvince = enterpriseProvince;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel latitude(String latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * 纬度，浮点型,小数点后最多保留6位 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60.270001", value = "纬度，浮点型,小数点后最多保留6位 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker")

  public String getLatitude() {
    return latitude;
  }


  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel longitude(String longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * 经度，浮点型, 小数点后最多保留6位。 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120.760001", value = "经度，浮点型, 小数点后最多保留6位。 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker")

  public String getLongitude() {
    return longitude;
  }


  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "out_biz_no_202008311750003", value = "外部业务号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 联系人电话/手机号
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13888888888", value = "联系人电话/手机号")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel poiid(String poiid) {
    
    this.poiid = poiid;
    return this;
  }

   /**
   * 高德poiid
   * @return poiid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B0FFIVU189", value = "高德poiid")

  public String getPoiid() {
    return poiid;
  }


  public void setPoiid(String poiid) {
    this.poiid = poiid;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel shopCategory(String shopCategory) {
    
    this.shopCategory = shopCategory;
    return this;
  }

   /**
   * 店铺类目，取值参见文件https://mif-pub.alipayobjects.com/ShopCategory.xlsx 中的三级门店类目
   * @return shopCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1001", value = "店铺类目，取值参见文件https://mif-pub.alipayobjects.com/ShopCategory.xlsx 中的三级门店类目")

  public String getShopCategory() {
    return shopCategory;
  }


  public void setShopCategory(String shopCategory) {
    this.shopCategory = shopCategory;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 门店名称，最长不超过256个字符。名称+地址需要全局唯一。
   * @return shopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "门店1", value = "门店名称，最长不超过256个字符。名称+地址需要全局唯一。")

  public String getShopName() {
    return shopName;
  }


  public void setShopName(String shopName) {
    this.shopName = shopName;
  }


  public AlipayOpenInstantdeliveryMerchantshopCreateModel shopNo(String shopNo) {
    
    this.shopNo = shopNo;
    return this;
  }

   /**
   * 商家门店编码，可自定义，但必须唯一
   * @return shopNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "商家门店编码，可自定义，但必须唯一")

  public String getShopNo() {
    return shopNo;
  }


  public void setShopNo(String shopNo) {
    this.shopNo = shopNo;
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
   * @return the AlipayOpenInstantdeliveryMerchantshopCreateModel instance itself
   */
  public AlipayOpenInstantdeliveryMerchantshopCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenInstantdeliveryMerchantshopCreateModel alipayOpenInstantdeliveryMerchantshopCreateModel = (AlipayOpenInstantdeliveryMerchantshopCreateModel) o;
    return Objects.equals(this.contactName, alipayOpenInstantdeliveryMerchantshopCreateModel.contactName) &&
        Objects.equals(this.detailAddress, alipayOpenInstantdeliveryMerchantshopCreateModel.detailAddress) &&
        Objects.equals(this.enterpriseCity, alipayOpenInstantdeliveryMerchantshopCreateModel.enterpriseCity) &&
        Objects.equals(this.enterpriseDistrict, alipayOpenInstantdeliveryMerchantshopCreateModel.enterpriseDistrict) &&
        Objects.equals(this.enterpriseProvince, alipayOpenInstantdeliveryMerchantshopCreateModel.enterpriseProvince) &&
        Objects.equals(this.latitude, alipayOpenInstantdeliveryMerchantshopCreateModel.latitude) &&
        Objects.equals(this.longitude, alipayOpenInstantdeliveryMerchantshopCreateModel.longitude) &&
        Objects.equals(this.outBizNo, alipayOpenInstantdeliveryMerchantshopCreateModel.outBizNo) &&
        Objects.equals(this.phone, alipayOpenInstantdeliveryMerchantshopCreateModel.phone) &&
        Objects.equals(this.poiid, alipayOpenInstantdeliveryMerchantshopCreateModel.poiid) &&
        Objects.equals(this.shopCategory, alipayOpenInstantdeliveryMerchantshopCreateModel.shopCategory) &&
        Objects.equals(this.shopName, alipayOpenInstantdeliveryMerchantshopCreateModel.shopName) &&
        Objects.equals(this.shopNo, alipayOpenInstantdeliveryMerchantshopCreateModel.shopNo)&&
        Objects.equals(this.additionalProperties, alipayOpenInstantdeliveryMerchantshopCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactName, detailAddress, enterpriseCity, enterpriseDistrict, enterpriseProvince, latitude, longitude, outBizNo, phone, poiid, shopCategory, shopName, shopNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenInstantdeliveryMerchantshopCreateModel {\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    detailAddress: ").append(toIndentedString(detailAddress)).append("\n");
    sb.append("    enterpriseCity: ").append(toIndentedString(enterpriseCity)).append("\n");
    sb.append("    enterpriseDistrict: ").append(toIndentedString(enterpriseDistrict)).append("\n");
    sb.append("    enterpriseProvince: ").append(toIndentedString(enterpriseProvince)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    poiid: ").append(toIndentedString(poiid)).append("\n");
    sb.append("    shopCategory: ").append(toIndentedString(shopCategory)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    shopNo: ").append(toIndentedString(shopNo)).append("\n");
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
    openapiFields.add("contact_name");
    openapiFields.add("detail_address");
    openapiFields.add("enterprise_city");
    openapiFields.add("enterprise_district");
    openapiFields.add("enterprise_province");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("out_biz_no");
    openapiFields.add("phone");
    openapiFields.add("poiid");
    openapiFields.add("shop_category");
    openapiFields.add("shop_name");
    openapiFields.add("shop_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenInstantdeliveryMerchantshopCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenInstantdeliveryMerchantshopCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenInstantdeliveryMerchantshopCreateModel is not found in the empty JSON string", AlipayOpenInstantdeliveryMerchantshopCreateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("contact_name") != null && !jsonObj.get("contact_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_name").toString()));
      }
      if (jsonObj.get("detail_address") != null && !jsonObj.get("detail_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail_address").toString()));
      }
      if (jsonObj.get("enterprise_city") != null && !jsonObj.get("enterprise_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_city").toString()));
      }
      if (jsonObj.get("enterprise_district") != null && !jsonObj.get("enterprise_district").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_district` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_district").toString()));
      }
      if (jsonObj.get("enterprise_province") != null && !jsonObj.get("enterprise_province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_province").toString()));
      }
      if (jsonObj.get("latitude") != null && !jsonObj.get("latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latitude").toString()));
      }
      if (jsonObj.get("longitude") != null && !jsonObj.get("longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longitude").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (jsonObj.get("poiid") != null && !jsonObj.get("poiid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poiid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poiid").toString()));
      }
      if (jsonObj.get("shop_category") != null && !jsonObj.get("shop_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_category").toString()));
      }
      if (jsonObj.get("shop_name") != null && !jsonObj.get("shop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_name").toString()));
      }
      if (jsonObj.get("shop_no") != null && !jsonObj.get("shop_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenInstantdeliveryMerchantshopCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenInstantdeliveryMerchantshopCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenInstantdeliveryMerchantshopCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenInstantdeliveryMerchantshopCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenInstantdeliveryMerchantshopCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenInstantdeliveryMerchantshopCreateModel value) throws IOException {
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
           public AlipayOpenInstantdeliveryMerchantshopCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenInstantdeliveryMerchantshopCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenInstantdeliveryMerchantshopCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenInstantdeliveryMerchantshopCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenInstantdeliveryMerchantshopCreateModel
  */
  public static AlipayOpenInstantdeliveryMerchantshopCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenInstantdeliveryMerchantshopCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenInstantdeliveryMerchantshopCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

