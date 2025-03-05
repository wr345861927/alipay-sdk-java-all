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
import com.alipay.v3.model.OpenCertifyMetaInfo;
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
 * DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel {
  public static final String SERIALIZED_NAME_ALIVE_PHOTO = "alive_photo";
  @SerializedName(SERIALIZED_NAME_ALIVE_PHOTO)
  private String alivePhoto;

  public static final String SERIALIZED_NAME_ATTACK_FLAG = "attack_flag";
  @SerializedName(SERIALIZED_NAME_ATTACK_FLAG)
  private String attackFlag;

  public static final String SERIALIZED_NAME_CERTIFY_STATE = "certify_state";
  @SerializedName(SERIALIZED_NAME_CERTIFY_STATE)
  private String certifyState;

  public static final String SERIALIZED_NAME_META_INFO = "meta_info";
  @SerializedName(SERIALIZED_NAME_META_INFO)
  private OpenCertifyMetaInfo metaInfo;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private String quality;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private String score;

  public DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel() { 
  }

  public DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel alivePhoto(String alivePhoto) {
    
    this.alivePhoto = alivePhoto;
    return this;
  }

   /**
   * 如果设置了need_alive_photo的值不为N，则该字段返回人脸照片的base64编码字符串。
   * @return alivePhoto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fasf8777asf", value = "如果设置了need_alive_photo的值不为N，则该字段返回人脸照片的base64编码字符串。")

  public String getAlivePhoto() {
    return alivePhoto;
  }


  public void setAlivePhoto(String alivePhoto) {
    this.alivePhoto = alivePhoto;
  }


  public DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel attackFlag(String attackFlag) {
    
    this.attackFlag = attackFlag;
    return this;
  }

   /**
   * 已废弃
   * @return attackFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "已废弃")

  public String getAttackFlag() {
    return attackFlag;
  }


  public void setAttackFlag(String attackFlag) {
    this.attackFlag = attackFlag;
  }


  public DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel certifyState(String certifyState) {
    
    this.certifyState = certifyState;
    return this;
  }

   /**
   * PROCESSING：初始化；SUCCESS：检测成功；FAIL：检测失败
   * @return certifyState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "PROCESSING：初始化；SUCCESS：检测成功；FAIL：检测失败")

  public String getCertifyState() {
    return certifyState;
  }


  public void setCertifyState(String certifyState) {
    this.certifyState = certifyState;
  }


  public DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel metaInfo(OpenCertifyMetaInfo metaInfo) {
    
    this.metaInfo = metaInfo;
    return this;
  }

   /**
   * Get metaInfo
   * @return metaInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenCertifyMetaInfo getMetaInfo() {
    return metaInfo;
  }


  public void setMetaInfo(OpenCertifyMetaInfo metaInfo) {
    this.metaInfo = metaInfo;
  }


  public DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel quality(String quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * 人脸图片质量分，单位为分
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "人脸图片质量分，单位为分")

  public String getQuality() {
    return quality;
  }


  public void setQuality(String quality) {
    this.quality = quality;
  }


  public DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel score(String score) {
    
    this.score = score;
    return this;
  }

   /**
   * 人脸比对分，单位分
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60", value = "人脸比对分，单位分")

  public String getScore() {
    return score;
  }


  public void setScore(String score) {
    this.score = score;
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
   * @return the DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel instance itself
   */
  public DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel datadigitalFincloudGeneralsaasFaceCheckQueryResponseModel = (DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel) o;
    return Objects.equals(this.alivePhoto, datadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.alivePhoto) &&
        Objects.equals(this.attackFlag, datadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.attackFlag) &&
        Objects.equals(this.certifyState, datadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.certifyState) &&
        Objects.equals(this.metaInfo, datadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.metaInfo) &&
        Objects.equals(this.quality, datadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.quality) &&
        Objects.equals(this.score, datadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.score)&&
        Objects.equals(this.additionalProperties, datadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alivePhoto, attackFlag, certifyState, metaInfo, quality, score, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel {\n");
    sb.append("    alivePhoto: ").append(toIndentedString(alivePhoto)).append("\n");
    sb.append("    attackFlag: ").append(toIndentedString(attackFlag)).append("\n");
    sb.append("    certifyState: ").append(toIndentedString(certifyState)).append("\n");
    sb.append("    metaInfo: ").append(toIndentedString(metaInfo)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("alive_photo");
    openapiFields.add("attack_flag");
    openapiFields.add("certify_state");
    openapiFields.add("meta_info");
    openapiFields.add("quality");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel is not found in the empty JSON string", DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("alive_photo") != null && !jsonObj.get("alive_photo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alive_photo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alive_photo").toString()));
      }
      if (jsonObj.get("attack_flag") != null && !jsonObj.get("attack_flag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attack_flag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attack_flag").toString()));
      }
      if (jsonObj.get("certify_state") != null && !jsonObj.get("certify_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certify_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certify_state").toString()));
      }
      // validate the optional field `meta_info`
      if (jsonObj.getAsJsonObject("meta_info") != null) {
        OpenCertifyMetaInfo.validateJsonObject(jsonObj.getAsJsonObject("meta_info"));
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
       if (!DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel value) throws IOException {
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
           public DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel
  */
  public static DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel.class);
  }

 /**
  * Convert an instance of DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

