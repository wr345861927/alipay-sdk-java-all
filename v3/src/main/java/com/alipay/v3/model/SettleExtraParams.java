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
 * SettleExtraParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SettleExtraParams {
  public static final String SERIALIZED_NAME_QUIT_TYPE = "quit_type";
  @SerializedName(SERIALIZED_NAME_QUIT_TYPE)
  private String quitType;

  public static final String SERIALIZED_NAME_SCENE_PAY_LINK_INFO = "scene_pay_link_info";
  @SerializedName(SERIALIZED_NAME_SCENE_PAY_LINK_INFO)
  private String scenePayLinkInfo;

  public static final String SERIALIZED_NAME_SETTLE_ADJUST_REASON = "settle_adjust_reason";
  @SerializedName(SERIALIZED_NAME_SETTLE_ADJUST_REASON)
  private String settleAdjustReason;

  public SettleExtraParams() { 
  }

  public SettleExtraParams quitType(String quitType) {
    
    this.quitType = quitType;
    return this;
  }

   /**
   * quit_type为USER_CANCEL_QUIT或者SETTLE_APPLY_QUIT
   * @return quitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SETTLE_APPLY_QUIT", value = "quit_type为USER_CANCEL_QUIT或者SETTLE_APPLY_QUIT")

  public String getQuitType() {
    return quitType;
  }


  public void setQuitType(String quitType) {
    this.quitType = quitType;
  }


  public SettleExtraParams scenePayLinkInfo(String scenePayLinkInfo) {
    
    this.scenePayLinkInfo = scenePayLinkInfo;
    return this;
  }

   /**
   * 商链通权益抵扣信息,  当前只有运营商使用,  未使用权益抵扣忽略该字段  fundRuleList为对应的出资信息，目前该列表不支持多对象，长度限制为1。其中fundAgreementNo为本笔交易实际出资的协议，由(商链通二方通用版本接入文档)2.3.2获取，fundAmount为该出资协议出资的金额。  bizScene和subBizScene为(商链通二方通用版本接入文档)2.1.3中支付宝侧分配的信息。  bizMode&#x3D;MERCHANT_ORDER为固定值。
   * @return scenePayLinkInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"fundRuleList\":[{\"fundAmount\":0.01,\"fundAgreementNo\":\"20235228003240641994\"}],\"bizScene\":\"支付宝侧分配\",\"subBizScene\":\"支付宝侧分配\",\"bizMode\":\"MERCHANT_ORDER\"}", value = "商链通权益抵扣信息,  当前只有运营商使用,  未使用权益抵扣忽略该字段  fundRuleList为对应的出资信息，目前该列表不支持多对象，长度限制为1。其中fundAgreementNo为本笔交易实际出资的协议，由(商链通二方通用版本接入文档)2.3.2获取，fundAmount为该出资协议出资的金额。  bizScene和subBizScene为(商链通二方通用版本接入文档)2.1.3中支付宝侧分配的信息。  bizMode=MERCHANT_ORDER为固定值。")

  public String getScenePayLinkInfo() {
    return scenePayLinkInfo;
  }


  public void setScenePayLinkInfo(String scenePayLinkInfo) {
    this.scenePayLinkInfo = scenePayLinkInfo;
  }


  public SettleExtraParams settleAdjustReason(String settleAdjustReason) {
    
    this.settleAdjustReason = settleAdjustReason;
    return this;
  }

   /**
   * action_type选择PAY_TO_ZERO时必填， \&quot;SERVICE_CANCELED\&quot;:\&quot;服务已取消\&quot;, \&quot;OTHER_CHANNEL_PERFORMANCE\&quot;:\&quot;户已通过其他方式履约\&quot;
   * @return settleAdjustReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SERVICE_CANCELED或OTHER_CHANNEL_PERFORMANCE", value = "action_type选择PAY_TO_ZERO时必填， \"SERVICE_CANCELED\":\"服务已取消\", \"OTHER_CHANNEL_PERFORMANCE\":\"户已通过其他方式履约\"")

  public String getSettleAdjustReason() {
    return settleAdjustReason;
  }


  public void setSettleAdjustReason(String settleAdjustReason) {
    this.settleAdjustReason = settleAdjustReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettleExtraParams settleExtraParams = (SettleExtraParams) o;
    return Objects.equals(this.quitType, settleExtraParams.quitType) &&
        Objects.equals(this.scenePayLinkInfo, settleExtraParams.scenePayLinkInfo) &&
        Objects.equals(this.settleAdjustReason, settleExtraParams.settleAdjustReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quitType, scenePayLinkInfo, settleAdjustReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettleExtraParams {\n");
    sb.append("    quitType: ").append(toIndentedString(quitType)).append("\n");
    sb.append("    scenePayLinkInfo: ").append(toIndentedString(scenePayLinkInfo)).append("\n");
    sb.append("    settleAdjustReason: ").append(toIndentedString(settleAdjustReason)).append("\n");
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
    openapiFields.add("quit_type");
    openapiFields.add("scene_pay_link_info");
    openapiFields.add("settle_adjust_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SettleExtraParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SettleExtraParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettleExtraParams is not found in the empty JSON string", SettleExtraParams.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SettleExtraParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SettleExtraParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("quit_type") != null && !jsonObj.get("quit_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quit_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quit_type").toString()));
      }
      if (jsonObj.get("scene_pay_link_info") != null && !jsonObj.get("scene_pay_link_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_pay_link_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_pay_link_info").toString()));
      }
      if (jsonObj.get("settle_adjust_reason") != null && !jsonObj.get("settle_adjust_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_adjust_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_adjust_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettleExtraParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettleExtraParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettleExtraParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettleExtraParams.class));

       return (TypeAdapter<T>) new TypeAdapter<SettleExtraParams>() {
           @Override
           public void write(JsonWriter out, SettleExtraParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettleExtraParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettleExtraParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettleExtraParams
  * @throws IOException if the JSON string is invalid with respect to SettleExtraParams
  */
  public static SettleExtraParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettleExtraParams.class);
  }

 /**
  * Convert an instance of SettleExtraParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

