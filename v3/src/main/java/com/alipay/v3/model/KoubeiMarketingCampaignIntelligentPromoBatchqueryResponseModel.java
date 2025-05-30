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
import com.alipay.v3.model.IntelligentPromo;
import com.alipay.v3.model.PromoPageResult;
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
 * KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_INTELLIGENT_PROMOS = "intelligent_promos";
  @SerializedName(SERIALIZED_NAME_INTELLIGENT_PROMOS)
  private List<IntelligentPromo> intelligentPromos = null;

  public static final String SERIALIZED_NAME_PAGE_RESULT = "page_result";
  @SerializedName(SERIALIZED_NAME_PAGE_RESULT)
  private PromoPageResult pageResult;

  public KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel() { 
  }

  public KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel intelligentPromos(List<IntelligentPromo> intelligentPromos) {
    
    this.intelligentPromos = intelligentPromos;
    return this;
  }

  public KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel addIntelligentPromosItem(IntelligentPromo intelligentPromosItem) {
    if (this.intelligentPromos == null) {
      this.intelligentPromos = new ArrayList<>();
    }
    this.intelligentPromos.add(intelligentPromosItem);
    return this;
  }

   /**
   * 查询返回的营销活动列表信息
   * @return intelligentPromos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "查询返回的营销活动列表信息")

  public List<IntelligentPromo> getIntelligentPromos() {
    return intelligentPromos;
  }


  public void setIntelligentPromos(List<IntelligentPromo> intelligentPromos) {
    this.intelligentPromos = intelligentPromos;
  }


  public KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel pageResult(PromoPageResult pageResult) {
    
    this.pageResult = pageResult;
    return this;
  }

   /**
   * Get pageResult
   * @return pageResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PromoPageResult getPageResult() {
    return pageResult;
  }


  public void setPageResult(PromoPageResult pageResult) {
    this.pageResult = pageResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel koubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel = (KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel) o;
    return Objects.equals(this.intelligentPromos, koubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel.intelligentPromos) &&
        Objects.equals(this.pageResult, koubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel.pageResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intelligentPromos, pageResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel {\n");
    sb.append("    intelligentPromos: ").append(toIndentedString(intelligentPromos)).append("\n");
    sb.append("    pageResult: ").append(toIndentedString(pageResult)).append("\n");
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
    openapiFields.add("intelligent_promos");
    openapiFields.add("page_result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel is not found in the empty JSON string", KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayintelligentPromos = jsonObj.getAsJsonArray("intelligent_promos");
      if (jsonArrayintelligentPromos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("intelligent_promos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `intelligent_promos` to be an array in the JSON string but got `%s`", jsonObj.get("intelligent_promos").toString()));
        }

        // validate the optional field `intelligent_promos` (array)
        for (int i = 0; i < jsonArrayintelligentPromos.size(); i++) {
          IntelligentPromo.validateJsonObject(jsonArrayintelligentPromos.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `page_result`
      if (jsonObj.getAsJsonObject("page_result") != null) {
        PromoPageResult.validateJsonObject(jsonObj.getAsJsonObject("page_result"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel
  */
  public static KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

