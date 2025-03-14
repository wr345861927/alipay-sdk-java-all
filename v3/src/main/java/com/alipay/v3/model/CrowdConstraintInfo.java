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
 * CrowdConstraintInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CrowdConstraintInfo {
  public static final String SERIALIZED_NAME_CROWD_CONDITION = "crowd_condition";
  @SerializedName(SERIALIZED_NAME_CROWD_CONDITION)
  private String crowdCondition;

  public static final String SERIALIZED_NAME_CROWD_NAME = "crowd_name";
  @SerializedName(SERIALIZED_NAME_CROWD_NAME)
  private String crowdName;

  public static final String SERIALIZED_NAME_CROWD_RESTRICTION = "crowd_restriction";
  @SerializedName(SERIALIZED_NAME_CROWD_RESTRICTION)
  private String crowdRestriction;

  public CrowdConstraintInfo() { 
  }

  public CrowdConstraintInfo crowdCondition(String crowdCondition) {
    
    this.crowdCondition = crowdCondition;
    return this;
  }

   /**
   * 圈人的条件  op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据  tagCode:标签code，详细标签code参见附件。&lt;a href&#x3D;\&quot;http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip\&quot;&gt;标签信息&lt;/a&gt;  value:标签值
   * @return crowdCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "圈人的条件  op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据  tagCode:标签code，详细标签code参见附件。<a href=\"http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip\">标签信息</a>  value:标签值")

  public String getCrowdCondition() {
    return crowdCondition;
  }


  public void setCrowdCondition(String crowdCondition) {
    this.crowdCondition = crowdCondition;
  }


  public CrowdConstraintInfo crowdName(String crowdName) {
    
    this.crowdName = crowdName;
    return this;
  }

   /**
   * 圈人名称
   * @return crowdName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "圈人名称")

  public String getCrowdName() {
    return crowdName;
  }


  public void setCrowdName(String crowdName) {
    this.crowdName = crowdName;
  }


  public CrowdConstraintInfo crowdRestriction(String crowdRestriction) {
    
    this.crowdRestriction = crowdRestriction;
    return this;
  }

   /**
   * 圈人约束，取值（NEWCOMER：新客人群；OFFLINE：离线人群），OFFLINE离线人群，需要传递crowd_condition圈人条件，使用方案参考crowd_condition使用说明
   * @return crowdRestriction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "圈人约束，取值（NEWCOMER：新客人群；OFFLINE：离线人群），OFFLINE离线人群，需要传递crowd_condition圈人条件，使用方案参考crowd_condition使用说明")

  public String getCrowdRestriction() {
    return crowdRestriction;
  }


  public void setCrowdRestriction(String crowdRestriction) {
    this.crowdRestriction = crowdRestriction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrowdConstraintInfo crowdConstraintInfo = (CrowdConstraintInfo) o;
    return Objects.equals(this.crowdCondition, crowdConstraintInfo.crowdCondition) &&
        Objects.equals(this.crowdName, crowdConstraintInfo.crowdName) &&
        Objects.equals(this.crowdRestriction, crowdConstraintInfo.crowdRestriction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crowdCondition, crowdName, crowdRestriction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrowdConstraintInfo {\n");
    sb.append("    crowdCondition: ").append(toIndentedString(crowdCondition)).append("\n");
    sb.append("    crowdName: ").append(toIndentedString(crowdName)).append("\n");
    sb.append("    crowdRestriction: ").append(toIndentedString(crowdRestriction)).append("\n");
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
    openapiFields.add("crowd_condition");
    openapiFields.add("crowd_name");
    openapiFields.add("crowd_restriction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CrowdConstraintInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CrowdConstraintInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CrowdConstraintInfo is not found in the empty JSON string", CrowdConstraintInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CrowdConstraintInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CrowdConstraintInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("crowd_condition") != null && !jsonObj.get("crowd_condition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crowd_condition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crowd_condition").toString()));
      }
      if (jsonObj.get("crowd_name") != null && !jsonObj.get("crowd_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crowd_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crowd_name").toString()));
      }
      if (jsonObj.get("crowd_restriction") != null && !jsonObj.get("crowd_restriction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crowd_restriction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crowd_restriction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CrowdConstraintInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CrowdConstraintInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CrowdConstraintInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CrowdConstraintInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CrowdConstraintInfo>() {
           @Override
           public void write(JsonWriter out, CrowdConstraintInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CrowdConstraintInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CrowdConstraintInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CrowdConstraintInfo
  * @throws IOException if the JSON string is invalid with respect to CrowdConstraintInfo
  */
  public static CrowdConstraintInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CrowdConstraintInfo.class);
  }

 /**
  * Convert an instance of CrowdConstraintInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

