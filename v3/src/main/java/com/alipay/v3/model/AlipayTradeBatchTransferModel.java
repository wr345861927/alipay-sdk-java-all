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
import com.alipay.v3.model.RoyaltyDetailInfo;
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
 * AlipayTradeBatchTransferModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeBatchTransferModel {
  public static final String SERIALIZED_NAME_EXTEND_PARAMS = "extend_params";
  @SerializedName(SERIALIZED_NAME_EXTEND_PARAMS)
  private String extendParams;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_ROYALTY_PARAMETERS = "royalty_parameters";
  @SerializedName(SERIALIZED_NAME_ROYALTY_PARAMETERS)
  private List<RoyaltyDetailInfo> royaltyParameters = null;

  public AlipayTradeBatchTransferModel() { 
  }

  public AlipayTradeBatchTransferModel extendParams(String extendParams) {
    
    this.extendParams = extendParams;
    return this;
  }

   /**
   * 业务扩展参数
   * @return extendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "业务扩展参数")

  public String getExtendParams() {
    return extendParams;
  }


  public void setExtendParams(String extendParams) {
    this.extendParams = extendParams;
  }


  public AlipayTradeBatchTransferModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 结算请求外部流水号，32个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180101", value = "结算请求外部流水号，32个字符以内、可包含字母、数字、下划线；需保证在商户端不重复")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeBatchTransferModel royaltyParameters(List<RoyaltyDetailInfo> royaltyParameters) {
    
    this.royaltyParameters = royaltyParameters;
    return this;
  }

  public AlipayTradeBatchTransferModel addRoyaltyParametersItem(RoyaltyDetailInfo royaltyParametersItem) {
    if (this.royaltyParameters == null) {
      this.royaltyParameters = new ArrayList<>();
    }
    this.royaltyParameters.add(royaltyParametersItem);
    return this;
  }

   /**
   * 分账条款明细 特别注意：最好一次只传一个分账条款。 如果传多个，则要求出账方只能有一个， 举例：A分给B+A分给C+A分给D&#x3D;OK A分给B+C分给D&#x3D;不行
   * @return royaltyParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账条款明细 特别注意：最好一次只传一个分账条款。 如果传多个，则要求出账方只能有一个， 举例：A分给B+A分给C+A分给D=OK A分给B+C分给D=不行")

  public List<RoyaltyDetailInfo> getRoyaltyParameters() {
    return royaltyParameters;
  }


  public void setRoyaltyParameters(List<RoyaltyDetailInfo> royaltyParameters) {
    this.royaltyParameters = royaltyParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeBatchTransferModel alipayTradeBatchTransferModel = (AlipayTradeBatchTransferModel) o;
    return Objects.equals(this.extendParams, alipayTradeBatchTransferModel.extendParams) &&
        Objects.equals(this.outRequestNo, alipayTradeBatchTransferModel.outRequestNo) &&
        Objects.equals(this.royaltyParameters, alipayTradeBatchTransferModel.royaltyParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendParams, outRequestNo, royaltyParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeBatchTransferModel {\n");
    sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    royaltyParameters: ").append(toIndentedString(royaltyParameters)).append("\n");
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
    openapiFields.add("extend_params");
    openapiFields.add("out_request_no");
    openapiFields.add("royalty_parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeBatchTransferModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeBatchTransferModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeBatchTransferModel is not found in the empty JSON string", AlipayTradeBatchTransferModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeBatchTransferModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeBatchTransferModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("extend_params") != null && !jsonObj.get("extend_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_params").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      JsonArray jsonArrayroyaltyParameters = jsonObj.getAsJsonArray("royalty_parameters");
      if (jsonArrayroyaltyParameters != null) {
        // ensure the json data is an array
        if (!jsonObj.get("royalty_parameters").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `royalty_parameters` to be an array in the JSON string but got `%s`", jsonObj.get("royalty_parameters").toString()));
        }

        // validate the optional field `royalty_parameters` (array)
        for (int i = 0; i < jsonArrayroyaltyParameters.size(); i++) {
          RoyaltyDetailInfo.validateJsonObject(jsonArrayroyaltyParameters.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeBatchTransferModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeBatchTransferModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeBatchTransferModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeBatchTransferModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeBatchTransferModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeBatchTransferModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeBatchTransferModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeBatchTransferModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeBatchTransferModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeBatchTransferModel
  */
  public static AlipayTradeBatchTransferModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeBatchTransferModel.class);
  }

 /**
  * Convert an instance of AlipayTradeBatchTransferModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

