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
 * VoucherDisplayInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherDisplayInfo {
  public static final String SERIALIZED_NAME_BRAND_LOGO = "brand_logo";
  @SerializedName(SERIALIZED_NAME_BRAND_LOGO)
  private String brandLogo;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_CUSTOMER_SERVICE_MOBILE = "customer_service_mobile";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SERVICE_MOBILE)
  private String customerServiceMobile;

  public static final String SERIALIZED_NAME_CUSTOMER_SERVICE_URL = "customer_service_url";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SERVICE_URL)
  private String customerServiceUrl;

  public static final String SERIALIZED_NAME_VOUCHER_COMMENT = "voucher_comment";
  @SerializedName(SERIALIZED_NAME_VOUCHER_COMMENT)
  private String voucherComment;

  public static final String SERIALIZED_NAME_VOUCHER_DESCRIPTION = "voucher_description";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DESCRIPTION)
  private String voucherDescription;

  public static final String SERIALIZED_NAME_VOUCHER_DETAIL_IMAGES = "voucher_detail_images";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DETAIL_IMAGES)
  private List<String> voucherDetailImages = null;

  public static final String SERIALIZED_NAME_VOUCHER_IMAGE = "voucher_image";
  @SerializedName(SERIALIZED_NAME_VOUCHER_IMAGE)
  private String voucherImage;

  public VoucherDisplayInfo() { 
  }

  public VoucherDisplayInfo brandLogo(String brandLogo) {
    
    this.brandLogo = brandLogo;
    return this;
  }

   /**
   * 商家logo。需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_BRAND_LOGO，返回的resource_id即为该参数的值
   * @return brandLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家logo。需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_BRAND_LOGO，返回的resource_id即为该参数的值")

  public String getBrandLogo() {
    return brandLogo;
  }


  public void setBrandLogo(String brandLogo) {
    this.brandLogo = brandLogo;
  }


  public VoucherDisplayInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 商户品牌名称。如果不设置品牌名称，则默认使用支付宝商家系统中维护的商家别名。如果没有维护商家别名，则使用默认名称：商家优惠。用户领取优惠券后，品牌名称会对用户进行展示
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户品牌名称。如果不设置品牌名称，则默认使用支付宝商家系统中维护的商家别名。如果没有维护商家别名，则使用默认名称：商家优惠。用户领取优惠券后，品牌名称会对用户进行展示")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public VoucherDisplayInfo customerServiceMobile(String customerServiceMobile) {
    
    this.customerServiceMobile = customerServiceMobile;
    return this;
  }

   /**
   * 客服电话
   * @return customerServiceMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "客服电话")

  public String getCustomerServiceMobile() {
    return customerServiceMobile;
  }


  public void setCustomerServiceMobile(String customerServiceMobile) {
    this.customerServiceMobile = customerServiceMobile;
  }


  public VoucherDisplayInfo customerServiceUrl(String customerServiceUrl) {
    
    this.customerServiceUrl = customerServiceUrl;
    return this;
  }

   /**
   * 客服链接
   * @return customerServiceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "客服链接")

  public String getCustomerServiceUrl() {
    return customerServiceUrl;
  }


  public void setCustomerServiceUrl(String customerServiceUrl) {
    this.customerServiceUrl = customerServiceUrl;
  }


  public VoucherDisplayInfo voucherComment(String voucherComment) {
    
    this.voucherComment = voucherComment;
    return this;
  }

   /**
   * 券补充说明，该字段为可运营字段，可描述商品特色 会展示在用户支付宝卡包券详情页
   * @return voucherComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券补充说明，该字段为可运营字段，可描述商品特色 会展示在用户支付宝卡包券详情页")

  public String getVoucherComment() {
    return voucherComment;
  }


  public void setVoucherComment(String voucherComment) {
    this.voucherComment = voucherComment;
  }


  public VoucherDisplayInfo voucherDescription(String voucherDescription) {
    
    this.voucherDescription = voucherDescription;
    return this;
  }

   /**
   * 券详细使用说明。
   * @return voucherDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券详细使用说明。")

  public String getVoucherDescription() {
    return voucherDescription;
  }


  public void setVoucherDescription(String voucherDescription) {
    this.voucherDescription = voucherDescription;
  }


  public VoucherDisplayInfo voucherDetailImages(List<String> voucherDetailImages) {
    
    this.voucherDetailImages = voucherDetailImages;
    return this;
  }

  public VoucherDisplayInfo addVoucherDetailImagesItem(String voucherDetailImagesItem) {
    if (this.voucherDetailImages == null) {
      this.voucherDetailImages = new ArrayList<>();
    }
    this.voucherDetailImages.add(voucherDetailImagesItem);
    return this;
  }

   /**
   * 券详细图列表，会展示在用户支付宝卡包券详情页。需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_DETAIL_IMAGE ,接口返回的resource_id即为该参数的值。上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB。
   * @return voucherDetailImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券详细图列表，会展示在用户支付宝卡包券详情页。需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_DETAIL_IMAGE ,接口返回的resource_id即为该参数的值。上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB。")

  public List<String> getVoucherDetailImages() {
    return voucherDetailImages;
  }


  public void setVoucherDetailImages(List<String> voucherDetailImages) {
    this.voucherDetailImages = voucherDetailImages;
  }


  public VoucherDisplayInfo voucherImage(String voucherImage) {
    
    this.voucherImage = voucherImage;
    return this;
  }

   /**
   * 券详情页封面图，会展示在用户支付宝卡包券详情页。需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_IMAGE，接口返回的resource_id即为该参数的值
   * @return voucherImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券详情页封面图，会展示在用户支付宝卡包券详情页。需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_IMAGE，接口返回的resource_id即为该参数的值")

  public String getVoucherImage() {
    return voucherImage;
  }


  public void setVoucherImage(String voucherImage) {
    this.voucherImage = voucherImage;
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
   * @return the VoucherDisplayInfo instance itself
   */
  public VoucherDisplayInfo putAdditionalProperty(String key, Object value) {
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
    VoucherDisplayInfo voucherDisplayInfo = (VoucherDisplayInfo) o;
    return Objects.equals(this.brandLogo, voucherDisplayInfo.brandLogo) &&
        Objects.equals(this.brandName, voucherDisplayInfo.brandName) &&
        Objects.equals(this.customerServiceMobile, voucherDisplayInfo.customerServiceMobile) &&
        Objects.equals(this.customerServiceUrl, voucherDisplayInfo.customerServiceUrl) &&
        Objects.equals(this.voucherComment, voucherDisplayInfo.voucherComment) &&
        Objects.equals(this.voucherDescription, voucherDisplayInfo.voucherDescription) &&
        Objects.equals(this.voucherDetailImages, voucherDisplayInfo.voucherDetailImages) &&
        Objects.equals(this.voucherImage, voucherDisplayInfo.voucherImage)&&
        Objects.equals(this.additionalProperties, voucherDisplayInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandLogo, brandName, customerServiceMobile, customerServiceUrl, voucherComment, voucherDescription, voucherDetailImages, voucherImage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherDisplayInfo {\n");
    sb.append("    brandLogo: ").append(toIndentedString(brandLogo)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    customerServiceMobile: ").append(toIndentedString(customerServiceMobile)).append("\n");
    sb.append("    customerServiceUrl: ").append(toIndentedString(customerServiceUrl)).append("\n");
    sb.append("    voucherComment: ").append(toIndentedString(voucherComment)).append("\n");
    sb.append("    voucherDescription: ").append(toIndentedString(voucherDescription)).append("\n");
    sb.append("    voucherDetailImages: ").append(toIndentedString(voucherDetailImages)).append("\n");
    sb.append("    voucherImage: ").append(toIndentedString(voucherImage)).append("\n");
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
    openapiFields.add("brand_logo");
    openapiFields.add("brand_name");
    openapiFields.add("customer_service_mobile");
    openapiFields.add("customer_service_url");
    openapiFields.add("voucher_comment");
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
  * @throws IOException if the JSON Object is invalid with respect to VoucherDisplayInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherDisplayInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherDisplayInfo is not found in the empty JSON string", VoucherDisplayInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("brand_logo") != null && !jsonObj.get("brand_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_logo").toString()));
      }
      if (jsonObj.get("brand_name") != null && !jsonObj.get("brand_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_name").toString()));
      }
      if (jsonObj.get("customer_service_mobile") != null && !jsonObj.get("customer_service_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_service_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_service_mobile").toString()));
      }
      if (jsonObj.get("customer_service_url") != null && !jsonObj.get("customer_service_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_service_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_service_url").toString()));
      }
      if (jsonObj.get("voucher_comment") != null && !jsonObj.get("voucher_comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_comment").toString()));
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
       if (!VoucherDisplayInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherDisplayInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherDisplayInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherDisplayInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherDisplayInfo>() {
           @Override
           public void write(JsonWriter out, VoucherDisplayInfo value) throws IOException {
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
           public VoucherDisplayInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherDisplayInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherDisplayInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherDisplayInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherDisplayInfo
  */
  public static VoucherDisplayInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherDisplayInfo.class);
  }

 /**
  * Convert an instance of VoucherDisplayInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

