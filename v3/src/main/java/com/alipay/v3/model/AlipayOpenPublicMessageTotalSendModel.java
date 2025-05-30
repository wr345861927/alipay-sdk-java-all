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
import com.alipay.v3.model.Article;
import com.alipay.v3.model.Text;
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
 * AlipayOpenPublicMessageTotalSendModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicMessageTotalSendModel {
  public static final String SERIALIZED_NAME_ARTICLES = "articles";
  @SerializedName(SERIALIZED_NAME_ARTICLES)
  private List<Article> articles = null;

  public static final String SERIALIZED_NAME_MSG_TYPE = "msg_type";
  @SerializedName(SERIALIZED_NAME_MSG_TYPE)
  private String msgType;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private Text text;

  public AlipayOpenPublicMessageTotalSendModel() { 
  }

  public AlipayOpenPublicMessageTotalSendModel articles(List<Article> articles) {
    
    this.articles = articles;
    return this;
  }

  public AlipayOpenPublicMessageTotalSendModel addArticlesItem(Article articlesItem) {
    if (this.articles == null) {
      this.articles = new ArrayList<>();
    }
    this.articles.add(articlesItem);
    return this;
  }

   /**
   * 图文消息，当 msg_type为image-text，本参数必填。 
   * @return articles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "图文消息，当 msg_type为image-text，本参数必填。 ")

  public List<Article> getArticles() {
    return articles;
  }


  public void setArticles(List<Article> articles) {
    this.articles = articles;
  }


  public AlipayOpenPublicMessageTotalSendModel msgType(String msgType) {
    
    this.msgType = msgType;
    return this;
  }

   /**
   * 消息类型。枚举支持： * text：表示文本消息； * image-text：表示图文消息。
   * @return msgType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "text", value = "消息类型。枚举支持： * text：表示文本消息； * image-text：表示图文消息。")

  public String getMsgType() {
    return msgType;
  }


  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }


  public AlipayOpenPublicMessageTotalSendModel text(Text text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Text getText() {
    return text;
  }


  public void setText(Text text) {
    this.text = text;
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
   * @return the AlipayOpenPublicMessageTotalSendModel instance itself
   */
  public AlipayOpenPublicMessageTotalSendModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenPublicMessageTotalSendModel alipayOpenPublicMessageTotalSendModel = (AlipayOpenPublicMessageTotalSendModel) o;
    return Objects.equals(this.articles, alipayOpenPublicMessageTotalSendModel.articles) &&
        Objects.equals(this.msgType, alipayOpenPublicMessageTotalSendModel.msgType) &&
        Objects.equals(this.text, alipayOpenPublicMessageTotalSendModel.text)&&
        Objects.equals(this.additionalProperties, alipayOpenPublicMessageTotalSendModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articles, msgType, text, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicMessageTotalSendModel {\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("articles");
    openapiFields.add("msg_type");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicMessageTotalSendModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicMessageTotalSendModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicMessageTotalSendModel is not found in the empty JSON string", AlipayOpenPublicMessageTotalSendModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayarticles = jsonObj.getAsJsonArray("articles");
      if (jsonArrayarticles != null) {
        // ensure the json data is an array
        if (!jsonObj.get("articles").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `articles` to be an array in the JSON string but got `%s`", jsonObj.get("articles").toString()));
        }

        // validate the optional field `articles` (array)
        for (int i = 0; i < jsonArrayarticles.size(); i++) {
          Article.validateJsonObject(jsonArrayarticles.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("msg_type") != null && !jsonObj.get("msg_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg_type").toString()));
      }
      // validate the optional field `text`
      if (jsonObj.getAsJsonObject("text") != null) {
        Text.validateJsonObject(jsonObj.getAsJsonObject("text"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicMessageTotalSendModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicMessageTotalSendModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicMessageTotalSendModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicMessageTotalSendModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicMessageTotalSendModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicMessageTotalSendModel value) throws IOException {
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
           public AlipayOpenPublicMessageTotalSendModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenPublicMessageTotalSendModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenPublicMessageTotalSendModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicMessageTotalSendModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicMessageTotalSendModel
  */
  public static AlipayOpenPublicMessageTotalSendModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicMessageTotalSendModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicMessageTotalSendModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

