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
import com.alipay.v3.model.LabelContext;
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
 * Filter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Filter {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private LabelContext context;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public Filter() { 
  }

  public Filter context(LabelContext context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelContext getContext() {
    return context;
  }


  public void setContext(LabelContext context) {
    this.context = context;
  }


  public Filter template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * 过滤器模板，${a}是一个变量，会被context参数中的a参数替换，从而展开为最终的表达式，template最多支持两个参数，支持and及or连接符。  and：同时满足条件；  or：只需满足其中一个条件
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "${a}", value = "过滤器模板，${a}是一个变量，会被context参数中的a参数替换，从而展开为最终的表达式，template最多支持两个参数，支持and及or连接符。  and：同时满足条件；  or：只需满足其中一个条件")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.context, filter.context) &&
        Objects.equals(this.template, filter.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
    openapiFields.add("context");
    openapiFields.add("template");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Filter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Filter.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Filter is not found in the empty JSON string", Filter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Filter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Filter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `context`
      if (jsonObj.getAsJsonObject("context") != null) {
        LabelContext.validateJsonObject(jsonObj.getAsJsonObject("context"));
      }
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<Filter>() {
           @Override
           public void write(JsonWriter out, Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Filter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Filter
  * @throws IOException if the JSON string is invalid with respect to Filter
  */
  public static Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Filter.class);
  }

 /**
  * Convert an instance of Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

