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
import com.alipay.v3.model.Option;
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
 * LifeLabel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LifeLabel {
  public static final String SERIALIZED_NAME_BIZ = "biz";
  @SerializedName(SERIALIZED_NAME_BIZ)
  private String biz;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_LABEL_CODE = "label_code";
  @SerializedName(SERIALIZED_NAME_LABEL_CODE)
  private String labelCode;

  public static final String SERIALIZED_NAME_LABEL_ID = "label_id";
  @SerializedName(SERIALIZED_NAME_LABEL_ID)
  private String labelId;

  public static final String SERIALIZED_NAME_LABEL_NAME = "label_name";
  @SerializedName(SERIALIZED_NAME_LABEL_NAME)
  private String labelName;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<Option> options = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public LifeLabel() { 
  }

  public LifeLabel biz(String biz) {
    
    this.biz = biz;
    return this;
  }

   /**
   * 该标签支持的业务列表，menu表示个性化菜单，extension表示个性化扩展区，message表示消息触达
   * @return biz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "menu,extension,message", value = "该标签支持的业务列表，menu表示个性化菜单，extension表示个性化扩展区，message表示消息触达")

  public String getBiz() {
    return biz;
  }


  public void setBiz(String biz) {
    this.biz = biz;
  }


  public LifeLabel category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * 标签类目
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "基础标签", value = "标签类目")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public LifeLabel dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * 标签值数据类型
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "标签值数据类型")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public LifeLabel labelCode(String labelCode) {
    
    this.labelCode = labelCode;
    return this;
  }

   /**
   * 标签英文代码
   * @return labelCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pps_user_gender", value = "标签英文代码")

  public String getLabelCode() {
    return labelCode;
  }


  public void setLabelCode(String labelCode) {
    this.labelCode = labelCode;
  }


  public LifeLabel labelId(String labelId) {
    
    this.labelId = labelId;
    return this;
  }

   /**
   * 标签id，唯一标识一个标签
   * @return labelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "标签id，唯一标识一个标签")

  public String getLabelId() {
    return labelId;
  }


  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }


  public LifeLabel labelName(String labelName) {
    
    this.labelName = labelName;
    return this;
  }

   /**
   * 标签名
   * @return labelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "性别", value = "标签名")

  public String getLabelName() {
    return labelName;
  }


  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }


  public LifeLabel operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 该标签支持的运算符
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EQ", value = "该标签支持的运算符")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public LifeLabel options(List<Option> options) {
    
    this.options = options;
    return this;
  }

  public LifeLabel addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * 每个取值的业务含义
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "每个取值的业务含义")

  public List<Option> getOptions() {
    return options;
  }


  public void setOptions(List<Option> options) {
    this.options = options;
  }


  public LifeLabel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 标签类型，目前分为common（通用标签）、custom（生活号自定义标签）、cloud（云实验室标签）
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "common", value = "标签类型，目前分为common（通用标签）、custom（生活号自定义标签）、cloud（云实验室标签）")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifeLabel lifeLabel = (LifeLabel) o;
    return Objects.equals(this.biz, lifeLabel.biz) &&
        Objects.equals(this.category, lifeLabel.category) &&
        Objects.equals(this.dataType, lifeLabel.dataType) &&
        Objects.equals(this.labelCode, lifeLabel.labelCode) &&
        Objects.equals(this.labelId, lifeLabel.labelId) &&
        Objects.equals(this.labelName, lifeLabel.labelName) &&
        Objects.equals(this.operator, lifeLabel.operator) &&
        Objects.equals(this.options, lifeLabel.options) &&
        Objects.equals(this.type, lifeLabel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biz, category, dataType, labelCode, labelId, labelName, operator, options, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifeLabel {\n");
    sb.append("    biz: ").append(toIndentedString(biz)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    labelCode: ").append(toIndentedString(labelCode)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("biz");
    openapiFields.add("category");
    openapiFields.add("data_type");
    openapiFields.add("label_code");
    openapiFields.add("label_id");
    openapiFields.add("label_name");
    openapiFields.add("operator");
    openapiFields.add("options");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LifeLabel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LifeLabel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LifeLabel is not found in the empty JSON string", LifeLabel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LifeLabel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LifeLabel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz") != null && !jsonObj.get("biz").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz").toString()));
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type").toString()));
      }
      if (jsonObj.get("label_code") != null && !jsonObj.get("label_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_code").toString()));
      }
      if (jsonObj.get("label_id") != null && !jsonObj.get("label_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_id").toString()));
      }
      if (jsonObj.get("label_name") != null && !jsonObj.get("label_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_name").toString()));
      }
      if (jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
      if (jsonArrayoptions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("options").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
        }

        // validate the optional field `options` (array)
        for (int i = 0; i < jsonArrayoptions.size(); i++) {
          Option.validateJsonObject(jsonArrayoptions.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LifeLabel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LifeLabel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LifeLabel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LifeLabel.class));

       return (TypeAdapter<T>) new TypeAdapter<LifeLabel>() {
           @Override
           public void write(JsonWriter out, LifeLabel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LifeLabel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LifeLabel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LifeLabel
  * @throws IOException if the JSON string is invalid with respect to LifeLabel
  */
  public static LifeLabel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LifeLabel.class);
  }

 /**
  * Convert an instance of LifeLabel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

