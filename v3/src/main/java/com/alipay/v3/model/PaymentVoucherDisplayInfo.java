/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
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
 * PaymentVoucherDisplayInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentVoucherDisplayInfo {
  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_CUSTOMER_SERVICE_MOBILE = "customer_service_mobile";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SERVICE_MOBILE)
  private String customerServiceMobile;

  public static final String SERIALIZED_NAME_VOUCHER_DESCRIPTION = "voucher_description";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DESCRIPTION)
  private String voucherDescription;

  public static final String SERIALIZED_NAME_VOUCHER_DETAIL_IMAGES = "voucher_detail_images";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DETAIL_IMAGES)
  private List<String> voucherDetailImages = null;

  public static final String SERIALIZED_NAME_VOUCHER_IMAGE = "voucher_image";
  @SerializedName(SERIALIZED_NAME_VOUCHER_IMAGE)
  private String voucherImage;

  public PaymentVoucherDisplayInfo() { 
  }

  public PaymentVoucherDisplayInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 商户品牌名称。
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户品牌名称。")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public PaymentVoucherDisplayInfo customerServiceMobile(String customerServiceMobile) {
    
    this.customerServiceMobile = customerServiceMobile;
    return this;
  }

   /**
   * 商家客服电话，会展示在支付宝卡包券详情页。
   * @return customerServiceMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家客服电话，会展示在支付宝卡包券详情页。")

  public String getCustomerServiceMobile() {
    return customerServiceMobile;
  }


  public void setCustomerServiceMobile(String customerServiceMobile) {
    this.customerServiceMobile = customerServiceMobile;
  }


  public PaymentVoucherDisplayInfo voucherDescription(String voucherDescription) {
    
    this.voucherDescription = voucherDescription;
    return this;
  }

   /**
   * 用于说明详细的活动规则，会展示在支付宝卡包券详情页。
   * @return voucherDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用于说明详细的活动规则，会展示在支付宝卡包券详情页。")

  public String getVoucherDescription() {
    return voucherDescription;
  }


  public void setVoucherDescription(String voucherDescription) {
    this.voucherDescription = voucherDescription;
  }


  public PaymentVoucherDisplayInfo voucherDetailImages(List<String> voucherDetailImages) {
    
    this.voucherDetailImages = voucherDetailImages;
    return this;
  }

  public PaymentVoucherDisplayInfo addVoucherDetailImagesItem(String voucherDetailImagesItem) {
    if (this.voucherDetailImages == null) {
      this.voucherDetailImages = new ArrayList<>();
    }
    this.voucherDetailImages.add(voucherDetailImagesItem);
    return this;
  }

   /**
   * 券详细图列表，会展示在用户支付宝卡包券详情页 需要通过  alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_DETAIL_IMAGE  ,接口返回的resource_id即为该参数的值 上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB 限制  1.voucher_image填入，该值才能填入； 2.最多3张；
   * @return voucherDetailImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券详细图列表，会展示在用户支付宝卡包券详情页 需要通过  alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_DETAIL_IMAGE  ,接口返回的resource_id即为该参数的值 上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB 限制  1.voucher_image填入，该值才能填入； 2.最多3张；")

  public List<String> getVoucherDetailImages() {
    return voucherDetailImages;
  }


  public void setVoucherDetailImages(List<String> voucherDetailImages) {
    this.voucherDetailImages = voucherDetailImages;
  }


  public PaymentVoucherDisplayInfo voucherImage(String voucherImage) {
    
    this.voucherImage = voucherImage;
    return this;
  }

   /**
   * 券详情页封面图，会展示在用户支付宝卡包券详情页 需要通过  alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_IMAGE，接口返回的resource_id即为该参数的值  限制: 该字段在兑换券场景下必传 上传图片尺寸670*335，支持格式：png、jpg、jpeg、bmp，大小不超过2MB 限制: 1.指定可核销商品(available_goods)时必传
   * @return voucherImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券详情页封面图，会展示在用户支付宝卡包券详情页 需要通过  alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_IMAGE，接口返回的resource_id即为该参数的值  限制: 该字段在兑换券场景下必传 上传图片尺寸670*335，支持格式：png、jpg、jpeg、bmp，大小不超过2MB 限制: 1.指定可核销商品(available_goods)时必传")

  public String getVoucherImage() {
    return voucherImage;
  }


  public void setVoucherImage(String voucherImage) {
    this.voucherImage = voucherImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentVoucherDisplayInfo paymentVoucherDisplayInfo = (PaymentVoucherDisplayInfo) o;
    return Objects.equals(this.brandName, paymentVoucherDisplayInfo.brandName) &&
        Objects.equals(this.customerServiceMobile, paymentVoucherDisplayInfo.customerServiceMobile) &&
        Objects.equals(this.voucherDescription, paymentVoucherDisplayInfo.voucherDescription) &&
        Objects.equals(this.voucherDetailImages, paymentVoucherDisplayInfo.voucherDetailImages) &&
        Objects.equals(this.voucherImage, paymentVoucherDisplayInfo.voucherImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, customerServiceMobile, voucherDescription, voucherDetailImages, voucherImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentVoucherDisplayInfo {\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    customerServiceMobile: ").append(toIndentedString(customerServiceMobile)).append("\n");
    sb.append("    voucherDescription: ").append(toIndentedString(voucherDescription)).append("\n");
    sb.append("    voucherDetailImages: ").append(toIndentedString(voucherDetailImages)).append("\n");
    sb.append("    voucherImage: ").append(toIndentedString(voucherImage)).append("\n");
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
    openapiFields.add("brand_name");
    openapiFields.add("customer_service_mobile");
    openapiFields.add("voucher_description");
    openapiFields.add("voucher_detail_images");
    openapiFields.add("voucher_image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentVoucherDisplayInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentVoucherDisplayInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentVoucherDisplayInfo is not found in the empty JSON string", PaymentVoucherDisplayInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentVoucherDisplayInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentVoucherDisplayInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("brand_name") != null && !jsonObj.get("brand_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_name").toString()));
      }
      if (jsonObj.get("customer_service_mobile") != null && !jsonObj.get("customer_service_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_service_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_service_mobile").toString()));
      }
      if (jsonObj.get("voucher_description") != null && !jsonObj.get("voucher_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_description").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("voucher_detail_images") != null && !jsonObj.get("voucher_detail_images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_detail_images` to be an array in the JSON string but got `%s`", jsonObj.get("voucher_detail_images").toString()));
      }
      if (jsonObj.get("voucher_image") != null && !jsonObj.get("voucher_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_image").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentVoucherDisplayInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentVoucherDisplayInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentVoucherDisplayInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentVoucherDisplayInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentVoucherDisplayInfo>() {
           @Override
           public void write(JsonWriter out, PaymentVoucherDisplayInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentVoucherDisplayInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentVoucherDisplayInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentVoucherDisplayInfo
  * @throws IOException if the JSON string is invalid with respect to PaymentVoucherDisplayInfo
  */
  public static PaymentVoucherDisplayInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentVoucherDisplayInfo.class);
  }

 /**
  * Convert an instance of PaymentVoucherDisplayInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

