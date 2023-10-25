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
 * Material
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Material {
  public static final String SERIALIZED_NAME_ARTICLES = "articles";
  @SerializedName(SERIALIZED_NAME_ARTICLES)
  private List<Article> articles = null;

  public static final String SERIALIZED_NAME_MSG_TYPE = "msg_type";
  @SerializedName(SERIALIZED_NAME_MSG_TYPE)
  private String msgType;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private Text text;

  public Material() { 
  }

  public Material articles(List<Article> articles) {
    
    this.articles = articles;
    return this;
  }

  public Material addArticlesItem(Article articlesItem) {
    if (this.articles == null) {
      this.articles = new ArrayList<>();
    }
    this.articles.add(articlesItem);
    return this;
  }

   /**
   * 图文消息子消息项集合，单条消息最多6个子项，否则会发送失败
   * @return articles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "图文消息子消息项集合，单条消息最多6个子项，否则会发送失败")

  public List<Article> getArticles() {
    return articles;
  }


  public void setArticles(List<Article> articles) {
    this.articles = articles;
  }


  public Material msgType(String msgType) {
    
    this.msgType = msgType;
    return this;
  }

   /**
   * 消息类型，text：文本类型，image-text：图文类型。当消息类型为text时，text参数必传，当消息类型为image-text时，articles参数必传
   * @return msgType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "text", value = "消息类型，text：文本类型，image-text：图文类型。当消息类型为text时，text参数必传，当消息类型为image-text时，articles参数必传")

  public String getMsgType() {
    return msgType;
  }


  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }


  public Material text(Text text) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Material material = (Material) o;
    return Objects.equals(this.articles, material.articles) &&
        Objects.equals(this.msgType, material.msgType) &&
        Objects.equals(this.text, material.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articles, msgType, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Material {\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
  * @throws IOException if the JSON Object is invalid with respect to Material
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Material.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Material is not found in the empty JSON string", Material.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Material.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Material` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!Material.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Material' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Material> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Material.class));

       return (TypeAdapter<T>) new TypeAdapter<Material>() {
           @Override
           public void write(JsonWriter out, Material value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Material read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Material given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Material
  * @throws IOException if the JSON string is invalid with respect to Material
  */
  public static Material fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Material.class);
  }

 /**
  * Convert an instance of Material to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

