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
import com.alipay.v3.model.McardNotifyMessage;
import com.alipay.v3.model.McardStylInfo;
import com.alipay.v3.model.MerchantCard;
import com.alipay.v3.model.MerchantCardMsgInfo;
import com.alipay.v3.model.PaidOuterCardExtraInfoDTO;
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
 * AlipayMarketingCardUpdateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardUpdateModel {
  public static final String SERIALIZED_NAME_CARD_INFO = "card_info";
  @SerializedName(SERIALIZED_NAME_CARD_INFO)
  private MerchantCard cardInfo;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_MCARD_STYLE_INFO = "mcard_style_info";
  @SerializedName(SERIALIZED_NAME_MCARD_STYLE_INFO)
  private McardStylInfo mcardStyleInfo;

  public static final String SERIALIZED_NAME_MERCHANT_CARD_MSG_INFO = "merchant_card_msg_info";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CARD_MSG_INFO)
  private MerchantCardMsgInfo merchantCardMsgInfo;

  public static final String SERIALIZED_NAME_NOTIFY_MESSAGES = "notify_messages";
  @SerializedName(SERIALIZED_NAME_NOTIFY_MESSAGES)
  private List<McardNotifyMessage> notifyMessages = null;

  public static final String SERIALIZED_NAME_OCCUR_TIME = "occur_time";
  @SerializedName(SERIALIZED_NAME_OCCUR_TIME)
  private String occurTime;

  public static final String SERIALIZED_NAME_PAID_OUTER_CARD_INFO = "paid_outer_card_info";
  @SerializedName(SERIALIZED_NAME_PAID_OUTER_CARD_INFO)
  private PaidOuterCardExtraInfoDTO paidOuterCardInfo;

  public static final String SERIALIZED_NAME_TARGET_CARD_NO = "target_card_no";
  @SerializedName(SERIALIZED_NAME_TARGET_CARD_NO)
  private String targetCardNo;

  public static final String SERIALIZED_NAME_TARGET_CARD_NO_TYPE = "target_card_no_type";
  @SerializedName(SERIALIZED_NAME_TARGET_CARD_NO_TYPE)
  private String targetCardNoType;

  public AlipayMarketingCardUpdateModel() { 
  }

  public AlipayMarketingCardUpdateModel cardInfo(MerchantCard cardInfo) {
    
    this.cardInfo = cardInfo;
    return this;
  }

   /**
   * Get cardInfo
   * @return cardInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantCard getCardInfo() {
    return cardInfo;
  }


  public void setCardInfo(MerchantCard cardInfo) {
    this.cardInfo = cardInfo;
  }


  public AlipayMarketingCardUpdateModel extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 扩展信息(暂时无用)
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "扩展信息(暂时无用)")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public AlipayMarketingCardUpdateModel mcardStyleInfo(McardStylInfo mcardStyleInfo) {
    
    this.mcardStyleInfo = mcardStyleInfo;
    return this;
  }

   /**
   * Get mcardStyleInfo
   * @return mcardStyleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public McardStylInfo getMcardStyleInfo() {
    return mcardStyleInfo;
  }


  public void setMcardStyleInfo(McardStylInfo mcardStyleInfo) {
    this.mcardStyleInfo = mcardStyleInfo;
  }


  public AlipayMarketingCardUpdateModel merchantCardMsgInfo(MerchantCardMsgInfo merchantCardMsgInfo) {
    
    this.merchantCardMsgInfo = merchantCardMsgInfo;
    return this;
  }

   /**
   * Get merchantCardMsgInfo
   * @return merchantCardMsgInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantCardMsgInfo getMerchantCardMsgInfo() {
    return merchantCardMsgInfo;
  }


  public void setMerchantCardMsgInfo(MerchantCardMsgInfo merchantCardMsgInfo) {
    this.merchantCardMsgInfo = merchantCardMsgInfo;
  }


  public AlipayMarketingCardUpdateModel notifyMessages(List<McardNotifyMessage> notifyMessages) {
    
    this.notifyMessages = notifyMessages;
    return this;
  }

  public AlipayMarketingCardUpdateModel addNotifyMessagesItem(McardNotifyMessage notifyMessagesItem) {
    if (this.notifyMessages == null) {
      this.notifyMessages = new ArrayList<>();
    }
    this.notifyMessages.add(notifyMessagesItem);
    return this;
  }

   /**
   * 注意：此字段已废弃。 卡信息变更通知消息 1、在列表中定义的消息，才会发送给用户，消息格式一定。 2、根据卡信息变更情况，一次可发送多个消息
   * @return notifyMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "注意：此字段已废弃。 卡信息变更通知消息 1、在列表中定义的消息，才会发送给用户，消息格式一定。 2、根据卡信息变更情况，一次可发送多个消息")

  public List<McardNotifyMessage> getNotifyMessages() {
    return notifyMessages;
  }


  public void setNotifyMessages(List<McardNotifyMessage> notifyMessages) {
    this.notifyMessages = notifyMessages;
  }


  public AlipayMarketingCardUpdateModel occurTime(String occurTime) {
    
    this.occurTime = occurTime;
    return this;
  }

   /**
   * 业务发生时间，时间格式为\&quot;yyyy-MM-dd HH:mm:ss\&quot;。
   * @return occurTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-27 12:12:12", value = "业务发生时间，时间格式为\"yyyy-MM-dd HH:mm:ss\"。")

  public String getOccurTime() {
    return occurTime;
  }


  public void setOccurTime(String occurTime) {
    this.occurTime = occurTime;
  }


  public AlipayMarketingCardUpdateModel paidOuterCardInfo(PaidOuterCardExtraInfoDTO paidOuterCardInfo) {
    
    this.paidOuterCardInfo = paidOuterCardInfo;
    return this;
  }

   /**
   * Get paidOuterCardInfo
   * @return paidOuterCardInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaidOuterCardExtraInfoDTO getPaidOuterCardInfo() {
    return paidOuterCardInfo;
  }


  public void setPaidOuterCardInfo(PaidOuterCardExtraInfoDTO paidOuterCardInfo) {
    this.paidOuterCardInfo = paidOuterCardInfo;
  }


  public AlipayMarketingCardUpdateModel targetCardNo(String targetCardNo) {
    
    this.targetCardNo = targetCardNo;
    return this;
  }

   /**
   * 支付宝业务卡号：1、3.0（历史版本）版本来源于alipay.marketing.card.open(会员卡开卡)接口开卡后获取的 card_info.biz_card_no 值；2、极速版来源于spi.alipay.user.opencard.get(会员卡开通，获取会员卡信息)请求参数中的biz_card_no值。
   * @return targetCardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000001", value = "支付宝业务卡号：1、3.0（历史版本）版本来源于alipay.marketing.card.open(会员卡开卡)接口开卡后获取的 card_info.biz_card_no 值；2、极速版来源于spi.alipay.user.opencard.get(会员卡开通，获取会员卡信息)请求参数中的biz_card_no值。")

  public String getTargetCardNo() {
    return targetCardNo;
  }


  public void setTargetCardNo(String targetCardNo) {
    this.targetCardNo = targetCardNo;
  }


  public AlipayMarketingCardUpdateModel targetCardNoType(String targetCardNoType) {
    
    this.targetCardNoType = targetCardNoType;
    return this;
  }

   /**
   * 卡号ID类型
   * @return targetCardNoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BIZ_CARD", value = "卡号ID类型")

  public String getTargetCardNoType() {
    return targetCardNoType;
  }


  public void setTargetCardNoType(String targetCardNoType) {
    this.targetCardNoType = targetCardNoType;
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
   * @return the AlipayMarketingCardUpdateModel instance itself
   */
  public AlipayMarketingCardUpdateModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingCardUpdateModel alipayMarketingCardUpdateModel = (AlipayMarketingCardUpdateModel) o;
    return Objects.equals(this.cardInfo, alipayMarketingCardUpdateModel.cardInfo) &&
        Objects.equals(this.extInfo, alipayMarketingCardUpdateModel.extInfo) &&
        Objects.equals(this.mcardStyleInfo, alipayMarketingCardUpdateModel.mcardStyleInfo) &&
        Objects.equals(this.merchantCardMsgInfo, alipayMarketingCardUpdateModel.merchantCardMsgInfo) &&
        Objects.equals(this.notifyMessages, alipayMarketingCardUpdateModel.notifyMessages) &&
        Objects.equals(this.occurTime, alipayMarketingCardUpdateModel.occurTime) &&
        Objects.equals(this.paidOuterCardInfo, alipayMarketingCardUpdateModel.paidOuterCardInfo) &&
        Objects.equals(this.targetCardNo, alipayMarketingCardUpdateModel.targetCardNo) &&
        Objects.equals(this.targetCardNoType, alipayMarketingCardUpdateModel.targetCardNoType)&&
        Objects.equals(this.additionalProperties, alipayMarketingCardUpdateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardInfo, extInfo, mcardStyleInfo, merchantCardMsgInfo, notifyMessages, occurTime, paidOuterCardInfo, targetCardNo, targetCardNoType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardUpdateModel {\n");
    sb.append("    cardInfo: ").append(toIndentedString(cardInfo)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    mcardStyleInfo: ").append(toIndentedString(mcardStyleInfo)).append("\n");
    sb.append("    merchantCardMsgInfo: ").append(toIndentedString(merchantCardMsgInfo)).append("\n");
    sb.append("    notifyMessages: ").append(toIndentedString(notifyMessages)).append("\n");
    sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
    sb.append("    paidOuterCardInfo: ").append(toIndentedString(paidOuterCardInfo)).append("\n");
    sb.append("    targetCardNo: ").append(toIndentedString(targetCardNo)).append("\n");
    sb.append("    targetCardNoType: ").append(toIndentedString(targetCardNoType)).append("\n");
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
    openapiFields.add("card_info");
    openapiFields.add("ext_info");
    openapiFields.add("mcard_style_info");
    openapiFields.add("merchant_card_msg_info");
    openapiFields.add("notify_messages");
    openapiFields.add("occur_time");
    openapiFields.add("paid_outer_card_info");
    openapiFields.add("target_card_no");
    openapiFields.add("target_card_no_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardUpdateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardUpdateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardUpdateModel is not found in the empty JSON string", AlipayMarketingCardUpdateModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `card_info`
      if (jsonObj.getAsJsonObject("card_info") != null) {
        MerchantCard.validateJsonObject(jsonObj.getAsJsonObject("card_info"));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      // validate the optional field `mcard_style_info`
      if (jsonObj.getAsJsonObject("mcard_style_info") != null) {
        McardStylInfo.validateJsonObject(jsonObj.getAsJsonObject("mcard_style_info"));
      }
      // validate the optional field `merchant_card_msg_info`
      if (jsonObj.getAsJsonObject("merchant_card_msg_info") != null) {
        MerchantCardMsgInfo.validateJsonObject(jsonObj.getAsJsonObject("merchant_card_msg_info"));
      }
      JsonArray jsonArraynotifyMessages = jsonObj.getAsJsonArray("notify_messages");
      if (jsonArraynotifyMessages != null) {
        // ensure the json data is an array
        if (!jsonObj.get("notify_messages").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `notify_messages` to be an array in the JSON string but got `%s`", jsonObj.get("notify_messages").toString()));
        }

        // validate the optional field `notify_messages` (array)
        for (int i = 0; i < jsonArraynotifyMessages.size(); i++) {
          McardNotifyMessage.validateJsonObject(jsonArraynotifyMessages.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("occur_time") != null && !jsonObj.get("occur_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `occur_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("occur_time").toString()));
      }
      // validate the optional field `paid_outer_card_info`
      if (jsonObj.getAsJsonObject("paid_outer_card_info") != null) {
        PaidOuterCardExtraInfoDTO.validateJsonObject(jsonObj.getAsJsonObject("paid_outer_card_info"));
      }
      if (jsonObj.get("target_card_no") != null && !jsonObj.get("target_card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_card_no").toString()));
      }
      if (jsonObj.get("target_card_no_type") != null && !jsonObj.get("target_card_no_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_card_no_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_card_no_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardUpdateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardUpdateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardUpdateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardUpdateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardUpdateModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardUpdateModel value) throws IOException {
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
           public AlipayMarketingCardUpdateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingCardUpdateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingCardUpdateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardUpdateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardUpdateModel
  */
  public static AlipayMarketingCardUpdateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardUpdateModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardUpdateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

