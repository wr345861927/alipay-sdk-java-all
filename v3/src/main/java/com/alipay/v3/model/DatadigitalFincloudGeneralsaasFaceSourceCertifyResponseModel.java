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
 * DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel {
  public static final String SERIALIZED_NAME_CERTIFY_NO = "certify_no";
  @SerializedName(SERIALIZED_NAME_CERTIFY_NO)
  private String certifyNo;

  public static final String SERIALIZED_NAME_MISMATCH_REASON = "mismatch_reason";
  @SerializedName(SERIALIZED_NAME_MISMATCH_REASON)
  private String mismatchReason;

  public static final String SERIALIZED_NAME_PASSED = "passed";
  @SerializedName(SERIALIZED_NAME_PASSED)
  private String passed;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private String quality;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private String score;

  public DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel() { 
  }

  public DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel certifyNo(String certifyNo) {
    
    this.certifyNo = certifyNo;
    return this;
  }

   /**
   * 人脸认证单据号，用于认证问题排查
   * @return certifyNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxxx", value = "人脸认证单据号，用于认证问题排查")

  public String getCertifyNo() {
    return certifyNo;
  }


  public void setCertifyNo(String certifyNo) {
    this.certifyNo = certifyNo;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel mismatchReason(String mismatchReason) {
    
    this.mismatchReason = mismatchReason;
    return this;
  }

   /**
   * 认证不通过原因
   * @return mismatchReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UNABLE_GET_IMAGE", value = "认证不通过原因")

  public String getMismatchReason() {
    return mismatchReason;
  }


  public void setMismatchReason(String mismatchReason) {
    this.mismatchReason = mismatchReason;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel passed(String passed) {
    
    this.passed = passed;
    return this;
  }

   /**
   * T：通过；F：不通过
   * @return passed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "T：通过；F：不通过")

  public String getPassed() {
    return passed;
  }


  public void setPassed(String passed) {
    this.passed = passed;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel quality(String quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * double值，人脸图片质量分
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "double值，人脸图片质量分")

  public String getQuality() {
    return quality;
  }


  public void setQuality(String quality) {
    this.quality = quality;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel score(String score) {
    
    this.score = score;
    return this;
  }

   /**
   * double值，活体检测结果分数
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "double值，活体检测结果分数")

  public String getScore() {
    return score;
  }


  public void setScore(String score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel datadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel = (DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel) o;
    return Objects.equals(this.certifyNo, datadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel.certifyNo) &&
        Objects.equals(this.mismatchReason, datadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel.mismatchReason) &&
        Objects.equals(this.passed, datadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel.passed) &&
        Objects.equals(this.quality, datadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel.quality) &&
        Objects.equals(this.score, datadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certifyNo, mismatchReason, passed, quality, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel {\n");
    sb.append("    certifyNo: ").append(toIndentedString(certifyNo)).append("\n");
    sb.append("    mismatchReason: ").append(toIndentedString(mismatchReason)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("certify_no");
    openapiFields.add("mismatch_reason");
    openapiFields.add("passed");
    openapiFields.add("quality");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel is not found in the empty JSON string", DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("certify_no") != null && !jsonObj.get("certify_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certify_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certify_no").toString()));
      }
      if (jsonObj.get("mismatch_reason") != null && !jsonObj.get("mismatch_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mismatch_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mismatch_reason").toString()));
      }
      if (jsonObj.get("passed") != null && !jsonObj.get("passed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passed").toString()));
      }
      if (jsonObj.get("quality") != null && !jsonObj.get("quality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quality").toString()));
      }
      if (jsonObj.get("score") != null && !jsonObj.get("score").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `score` to be a primitive type in the JSON string but got `%s`", jsonObj.get("score").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel>() {
           @Override
           public void write(JsonWriter out, DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel
  * @throws IOException if the JSON string is invalid with respect to DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel
  */
  public static DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel.class);
  }

 /**
  * Convert an instance of DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

