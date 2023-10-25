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
import com.alipay.v3.model.PromoOperatorInfo;
import com.alipay.v3.model.PromoPageInfo;
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
 * KoubeiMarketingCampaignIntelligentPromoBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KoubeiMarketingCampaignIntelligentPromoBatchqueryModel {
  public static final String SERIALIZED_NAME_OPERATOR_CONTEXT = "operator_context";
  @SerializedName(SERIALIZED_NAME_OPERATOR_CONTEXT)
  private PromoOperatorInfo operatorContext;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_OWNER_INFO = "owner_info";
  @SerializedName(SERIALIZED_NAME_OWNER_INFO)
  private PromoOperatorInfo ownerInfo;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private PromoPageInfo pageInfo;

  public KoubeiMarketingCampaignIntelligentPromoBatchqueryModel() { 
  }

  public KoubeiMarketingCampaignIntelligentPromoBatchqueryModel operatorContext(PromoOperatorInfo operatorContext) {
    
    this.operatorContext = operatorContext;
    return this;
  }

   /**
   * Get operatorContext
   * @return operatorContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PromoOperatorInfo getOperatorContext() {
    return operatorContext;
  }


  public void setOperatorContext(PromoOperatorInfo operatorContext) {
    this.operatorContext = operatorContext;
  }


  public KoubeiMarketingCampaignIntelligentPromoBatchqueryModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 外部业务id，请保持足够的复杂，方便定位数据来源
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "65165813-a51a-44b9-984c-c75022ecbaf7", value = "外部业务id，请保持足够的复杂，方便定位数据来源")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public KoubeiMarketingCampaignIntelligentPromoBatchqueryModel ownerInfo(PromoOperatorInfo ownerInfo) {
    
    this.ownerInfo = ownerInfo;
    return this;
  }

   /**
   * Get ownerInfo
   * @return ownerInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PromoOperatorInfo getOwnerInfo() {
    return ownerInfo;
  }


  public void setOwnerInfo(PromoOperatorInfo ownerInfo) {
    this.ownerInfo = ownerInfo;
  }


  public KoubeiMarketingCampaignIntelligentPromoBatchqueryModel pageInfo(PromoPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PromoPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(PromoPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KoubeiMarketingCampaignIntelligentPromoBatchqueryModel koubeiMarketingCampaignIntelligentPromoBatchqueryModel = (KoubeiMarketingCampaignIntelligentPromoBatchqueryModel) o;
    return Objects.equals(this.operatorContext, koubeiMarketingCampaignIntelligentPromoBatchqueryModel.operatorContext) &&
        Objects.equals(this.outRequestNo, koubeiMarketingCampaignIntelligentPromoBatchqueryModel.outRequestNo) &&
        Objects.equals(this.ownerInfo, koubeiMarketingCampaignIntelligentPromoBatchqueryModel.ownerInfo) &&
        Objects.equals(this.pageInfo, koubeiMarketingCampaignIntelligentPromoBatchqueryModel.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorContext, outRequestNo, ownerInfo, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KoubeiMarketingCampaignIntelligentPromoBatchqueryModel {\n");
    sb.append("    operatorContext: ").append(toIndentedString(operatorContext)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    ownerInfo: ").append(toIndentedString(ownerInfo)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("operator_context");
    openapiFields.add("out_request_no");
    openapiFields.add("owner_info");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KoubeiMarketingCampaignIntelligentPromoBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KoubeiMarketingCampaignIntelligentPromoBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KoubeiMarketingCampaignIntelligentPromoBatchqueryModel is not found in the empty JSON string", KoubeiMarketingCampaignIntelligentPromoBatchqueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KoubeiMarketingCampaignIntelligentPromoBatchqueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KoubeiMarketingCampaignIntelligentPromoBatchqueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `operator_context`
      if (jsonObj.getAsJsonObject("operator_context") != null) {
        PromoOperatorInfo.validateJsonObject(jsonObj.getAsJsonObject("operator_context"));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      // validate the optional field `owner_info`
      if (jsonObj.getAsJsonObject("owner_info") != null) {
        PromoOperatorInfo.validateJsonObject(jsonObj.getAsJsonObject("owner_info"));
      }
      // validate the optional field `page_info`
      if (jsonObj.getAsJsonObject("page_info") != null) {
        PromoPageInfo.validateJsonObject(jsonObj.getAsJsonObject("page_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KoubeiMarketingCampaignIntelligentPromoBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KoubeiMarketingCampaignIntelligentPromoBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KoubeiMarketingCampaignIntelligentPromoBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KoubeiMarketingCampaignIntelligentPromoBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<KoubeiMarketingCampaignIntelligentPromoBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, KoubeiMarketingCampaignIntelligentPromoBatchqueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KoubeiMarketingCampaignIntelligentPromoBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KoubeiMarketingCampaignIntelligentPromoBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KoubeiMarketingCampaignIntelligentPromoBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to KoubeiMarketingCampaignIntelligentPromoBatchqueryModel
  */
  public static KoubeiMarketingCampaignIntelligentPromoBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KoubeiMarketingCampaignIntelligentPromoBatchqueryModel.class);
  }

 /**
  * Convert an instance of KoubeiMarketingCampaignIntelligentPromoBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

