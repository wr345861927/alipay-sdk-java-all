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
 * AlipayMerchantTradecomplainFeedbackSubmitModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantTradecomplainFeedbackSubmitModel {
  public static final String SERIALIZED_NAME_COMPLAIN_EVENT_ID = "complain_event_id";
  @SerializedName(SERIALIZED_NAME_COMPLAIN_EVENT_ID)
  private String complainEventId;

  public static final String SERIALIZED_NAME_FEEDBACK_CODE = "feedback_code";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_CODE)
  private String feedbackCode;

  public static final String SERIALIZED_NAME_FEEDBACK_CONTENT = "feedback_content";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_CONTENT)
  private String feedbackContent;

  public static final String SERIALIZED_NAME_FEEDBACK_IMAGES = "feedback_images";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_IMAGES)
  private String feedbackImages;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public AlipayMerchantTradecomplainFeedbackSubmitModel() { 
  }

  public AlipayMerchantTradecomplainFeedbackSubmitModel complainEventId(String complainEventId) {
    
    this.complainEventId = complainEventId;
    return this;
  }

   /**
   * 支付宝侧投诉单号
   * @return complainEventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020092300102000000001459758", value = "支付宝侧投诉单号")

  public String getComplainEventId() {
    return complainEventId;
  }


  public void setComplainEventId(String complainEventId) {
    this.complainEventId = complainEventId;
  }


  public AlipayMerchantTradecomplainFeedbackSubmitModel feedbackCode(String feedbackCode) {
    
    this.feedbackCode = feedbackCode;
    return this;
  }

   /**
   * 反馈类目ID 00:使用体验保障金退款； 02:通过其他方式退款; 03:已发货; 04:其他; 05:已完成售后服务; 06:非我方责任范围；
   * @return feedbackCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02", value = "反馈类目ID 00:使用体验保障金退款； 02:通过其他方式退款; 03:已发货; 04:其他; 05:已完成售后服务; 06:非我方责任范围；")

  public String getFeedbackCode() {
    return feedbackCode;
  }


  public void setFeedbackCode(String feedbackCode) {
    this.feedbackCode = feedbackCode;
  }


  public AlipayMerchantTradecomplainFeedbackSubmitModel feedbackContent(String feedbackContent) {
    
    this.feedbackContent = feedbackContent;
    return this;
  }

   /**
   * 反馈内容，字数不超过200个字
   * @return feedbackContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "钱已退款给您，请查收", value = "反馈内容，字数不超过200个字")

  public String getFeedbackContent() {
    return feedbackContent;
  }


  public void setFeedbackContent(String feedbackContent) {
    this.feedbackContent = feedbackContent;
  }


  public AlipayMerchantTradecomplainFeedbackSubmitModel feedbackImages(String feedbackImages) {
    
    this.feedbackImages = feedbackImages;
    return this;
  }

   /**
   * 商家处理投诉时反馈凭证的图片id，多个逗号隔开（图片id可以通过\&quot;商户上传处理图片\&quot;接口获取）
   * @return feedbackImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wAe1XmjGS8mBSV0FFklAUgAAACMAAQED,A*C5jFT7v7SIMAAAAAAAAAAAAADpp1AQ", value = "商家处理投诉时反馈凭证的图片id，多个逗号隔开（图片id可以通过\"商户上传处理图片\"接口获取）")

  public String getFeedbackImages() {
    return feedbackImages;
  }


  public void setFeedbackImages(String feedbackImages) {
    this.feedbackImages = feedbackImages;
  }


  public AlipayMerchantTradecomplainFeedbackSubmitModel operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 处理投诉人，字数不超过6个字
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "王芳", value = "处理投诉人，字数不超过6个字")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
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
   * @return the AlipayMerchantTradecomplainFeedbackSubmitModel instance itself
   */
  public AlipayMerchantTradecomplainFeedbackSubmitModel putAdditionalProperty(String key, Object value) {
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
    AlipayMerchantTradecomplainFeedbackSubmitModel alipayMerchantTradecomplainFeedbackSubmitModel = (AlipayMerchantTradecomplainFeedbackSubmitModel) o;
    return Objects.equals(this.complainEventId, alipayMerchantTradecomplainFeedbackSubmitModel.complainEventId) &&
        Objects.equals(this.feedbackCode, alipayMerchantTradecomplainFeedbackSubmitModel.feedbackCode) &&
        Objects.equals(this.feedbackContent, alipayMerchantTradecomplainFeedbackSubmitModel.feedbackContent) &&
        Objects.equals(this.feedbackImages, alipayMerchantTradecomplainFeedbackSubmitModel.feedbackImages) &&
        Objects.equals(this.operator, alipayMerchantTradecomplainFeedbackSubmitModel.operator)&&
        Objects.equals(this.additionalProperties, alipayMerchantTradecomplainFeedbackSubmitModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complainEventId, feedbackCode, feedbackContent, feedbackImages, operator, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantTradecomplainFeedbackSubmitModel {\n");
    sb.append("    complainEventId: ").append(toIndentedString(complainEventId)).append("\n");
    sb.append("    feedbackCode: ").append(toIndentedString(feedbackCode)).append("\n");
    sb.append("    feedbackContent: ").append(toIndentedString(feedbackContent)).append("\n");
    sb.append("    feedbackImages: ").append(toIndentedString(feedbackImages)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
    openapiFields.add("complain_event_id");
    openapiFields.add("feedback_code");
    openapiFields.add("feedback_content");
    openapiFields.add("feedback_images");
    openapiFields.add("operator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantTradecomplainFeedbackSubmitModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantTradecomplainFeedbackSubmitModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantTradecomplainFeedbackSubmitModel is not found in the empty JSON string", AlipayMerchantTradecomplainFeedbackSubmitModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("complain_event_id") != null && !jsonObj.get("complain_event_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complain_event_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complain_event_id").toString()));
      }
      if (jsonObj.get("feedback_code") != null && !jsonObj.get("feedback_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedback_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedback_code").toString()));
      }
      if (jsonObj.get("feedback_content") != null && !jsonObj.get("feedback_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedback_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedback_content").toString()));
      }
      if (jsonObj.get("feedback_images") != null && !jsonObj.get("feedback_images").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedback_images` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedback_images").toString()));
      }
      if (jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantTradecomplainFeedbackSubmitModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantTradecomplainFeedbackSubmitModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantTradecomplainFeedbackSubmitModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantTradecomplainFeedbackSubmitModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantTradecomplainFeedbackSubmitModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantTradecomplainFeedbackSubmitModel value) throws IOException {
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
           public AlipayMerchantTradecomplainFeedbackSubmitModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMerchantTradecomplainFeedbackSubmitModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMerchantTradecomplainFeedbackSubmitModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantTradecomplainFeedbackSubmitModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantTradecomplainFeedbackSubmitModel
  */
  public static AlipayMerchantTradecomplainFeedbackSubmitModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantTradecomplainFeedbackSubmitModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantTradecomplainFeedbackSubmitModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

