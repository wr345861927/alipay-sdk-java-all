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
 * AlipayOpenMiniBaseinfoModifyErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniBaseinfoModifyErrorResponseModel {
  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    MODIFY_PARAMS_ARE_BLANK("MODIFY_PARAMS_ARE_BLANK"),
    
    CAN_NOT_MODIFY_BASE_INFO("CAN_NOT_MODIFY_BASE_INFO"),
    
    INVALID_MINI_APP_NAME("INVALID_MINI_APP_NAME"),
    
    INVALID_MINI_APP_NAME_LENGTH("INVALID_MINI_APP_NAME_LENGTH"),
    
    MINI_APP_NAME_DUPLICATE("MINI_APP_NAME_DUPLICATE"),
    
    MINI_APP_NAME_SENSITIVE("MINI_APP_NAME_SENSITIVE"),
    
    INVALID_MINI_APP_EN_NAME("INVALID_MINI_APP_EN_NAME"),
    
    INVALID_MINI_APP_EN_NAME_LENGTH("INVALID_MINI_APP_EN_NAME_LENGTH"),
    
    MINI_APP_EN_NAME_DUPLICATE("MINI_APP_EN_NAME_DUPLICATE"),
    
    MINI_APP_EN_NAME_SENSITIVE("MINI_APP_EN_NAME_SENSITIVE"),
    
    INVALID_MINI_APP_SLOGAN_LENGTH("INVALID_MINI_APP_SLOGAN_LENGTH"),
    
    MINI_APP_SLOGAN_SENSITIVE("MINI_APP_SLOGAN_SENSITIVE"),
    
    CATEGOTY_NUM_IS_INVALID("CATEGOTY_NUM_IS_INVALID"),
    
    INVALID_CATEGOTY("INVALID_CATEGOTY"),
    
    INVALID_LOGO_EXT("INVALID_LOGO_EXT"),
    
    LOGO_EXCEED_MAX_SIZE("LOGO_EXCEED_MAX_SIZE"),
    
    LOGO_HEIGHT_NOT_EQUAL_WIDTH("LOGO_HEIGHT_NOT_EQUAL_WIDTH"),
    
    MINI_APP_DESC_SENSITIVE("MINI_APP_DESC_SENSITIVE"),
    
    INVALID_MINI_APP_DESC_LENGTH("INVALID_MINI_APP_DESC_LENGTH"),
    
    INVALID_MINI_APP_SERVICE_PHONE("INVALID_MINI_APP_SERVICE_PHONE"),
    
    INVALID_MINI_APP_SERVICE_EMAIL("INVALID_MINI_APP_SERVICE_EMAIL"),
    
    MINI_APP_SERVICE_EMAIL_SENSITIVE("MINI_APP_SERVICE_EMAIL_SENSITIVE"),
    
    APPLICATION_TYPE_NOT_MINIAPP("APPLICATION_TYPE_NOT_MINIAPP"),
    
    INVALID_MINI_APP_DESC("INVALID_MINI_APP_DESC"),
    
    INVALID_MINI_APP_SLOGAN("INVALID_MINI_APP_SLOGAN"),
    
    RISK_DECISION_CHECK_FAIL("RISK_DECISION_CHECK_FAIL"),
    
    RISK_DECISION_HIT_BRAND("RISK_DECISION_HIT_BRAND"),
    
    SERVICE_TEL_AND_MAIL_BOTH_BLANK("SERVICE_TEL_AND_MAIL_BOTH_BLANK"),
    
    APP_DESC_IS_BLANK("APP_DESC_IS_BLANK"),
    
    MINI_APP_NOT_ONLINE("MINI_APP_NOT_ONLINE"),
    
    LOGO_SIZE_EXCEED("LOGO_SIZE_EXCEED"),
    
    CATEGORY_IS_BLANK("CATEGORY_IS_BLANK"),
    
    PRIVATE_NOT_ALLOW_CATEGORY("PRIVATE_NOT_ALLOW_CATEGORY"),
    
    CANNOT_MODIFY_CATEGORY_WITH_RELATION_VERSION("CANNOT_MODIFY_CATEGORY_WITH_RELATION_VERSION"),
    
    MINI_APP_INFO_AUDIT_CONTAINS("MINI_APP_INFO_AUDIT_CONTAINS"),
    
    CATEGORY_NUM_IS_INVALID("CATEGORY_NUM_IS_INVALID"),
    
    SLOGAN_IS_BLANK("SLOGAN_IS_BLANK"),
    
    OP_FREQUENCY_LIMIT("OP_FREQUENCY_LIMIT"),
    
    LOGO_IS_BLANK("LOGO_IS_BLANK"),
    
    INVALID_LOGO("INVALID_LOGO"),
    
    INVALID_PARAMETER("INVALID_PARAMETER"),
    
    NOT_ALLOW_BETA_CATEGORY("NOT_ALLOW_BETA_CATEGORY");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private String links;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public AlipayOpenMiniBaseinfoModifyErrorResponseModel() { 
  }

  public AlipayOpenMiniBaseinfoModifyErrorResponseModel code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * 错误码
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误码")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public AlipayOpenMiniBaseinfoModifyErrorResponseModel links(String links) {
    
    this.links = links;
    return this;
  }

   /**
   * 解决方案链接
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "解决方案链接")

  public String getLinks() {
    return links;
  }


  public void setLinks(String links) {
    this.links = links;
  }


  public AlipayOpenMiniBaseinfoModifyErrorResponseModel message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 错误描述
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误描述")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniBaseinfoModifyErrorResponseModel alipayOpenMiniBaseinfoModifyErrorResponseModel = (AlipayOpenMiniBaseinfoModifyErrorResponseModel) o;
    return Objects.equals(this.code, alipayOpenMiniBaseinfoModifyErrorResponseModel.code) &&
        Objects.equals(this.links, alipayOpenMiniBaseinfoModifyErrorResponseModel.links) &&
        Objects.equals(this.message, alipayOpenMiniBaseinfoModifyErrorResponseModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniBaseinfoModifyErrorResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("links");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniBaseinfoModifyErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniBaseinfoModifyErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniBaseinfoModifyErrorResponseModel is not found in the empty JSON string", AlipayOpenMiniBaseinfoModifyErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniBaseinfoModifyErrorResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniBaseinfoModifyErrorResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayOpenMiniBaseinfoModifyErrorResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be a primitive type in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniBaseinfoModifyErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniBaseinfoModifyErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniBaseinfoModifyErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniBaseinfoModifyErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniBaseinfoModifyErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniBaseinfoModifyErrorResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniBaseinfoModifyErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniBaseinfoModifyErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniBaseinfoModifyErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniBaseinfoModifyErrorResponseModel
  */
  public static AlipayOpenMiniBaseinfoModifyErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniBaseinfoModifyErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniBaseinfoModifyErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

