/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-15
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
 * MiniAppCategory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MiniAppCategory {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_HAS_CHILD = "has_child";
  @SerializedName(SERIALIZED_NAME_HAS_CHILD)
  private Boolean hasChild;

  public static final String SERIALIZED_NAME_NEED_LICENSE = "need_license";
  @SerializedName(SERIALIZED_NAME_NEED_LICENSE)
  private Boolean needLicense;

  public static final String SERIALIZED_NAME_NEED_OUT_DOOR_PIC = "need_out_door_pic";
  @SerializedName(SERIALIZED_NAME_NEED_OUT_DOOR_PIC)
  private Boolean needOutDoorPic;

  public static final String SERIALIZED_NAME_NEED_SPECIAL_LICENSE = "need_special_license";
  @SerializedName(SERIALIZED_NAME_NEED_SPECIAL_LICENSE)
  private Boolean needSpecialLicense;

  public static final String SERIALIZED_NAME_PARENT_CATEGORY_ID = "parent_category_id";
  @SerializedName(SERIALIZED_NAME_PARENT_CATEGORY_ID)
  private String parentCategoryId;

  public MiniAppCategory() { 
  }

  public MiniAppCategory categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 类目id
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "类目id")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public MiniAppCategory categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 类目名称
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "类目名称")

  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public MiniAppCategory hasChild(Boolean hasChild) {
    
    this.hasChild = hasChild;
    return this;
  }

   /**
   * 是否有子类目
   * @return hasChild
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否有子类目")

  public Boolean getHasChild() {
    return hasChild;
  }


  public void setHasChild(Boolean hasChild) {
    this.hasChild = hasChild;
  }


  public MiniAppCategory needLicense(Boolean needLicense) {
    
    this.needLicense = needLicense;
    return this;
  }

   /**
   * 是否需要营业执照
   * @return needLicense
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否需要营业执照")

  public Boolean getNeedLicense() {
    return needLicense;
  }


  public void setNeedLicense(Boolean needLicense) {
    this.needLicense = needLicense;
  }


  public MiniAppCategory needOutDoorPic(Boolean needOutDoorPic) {
    
    this.needOutDoorPic = needOutDoorPic;
    return this;
  }

   /**
   * 是否需要门头照
   * @return needOutDoorPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否需要门头照")

  public Boolean getNeedOutDoorPic() {
    return needOutDoorPic;
  }


  public void setNeedOutDoorPic(Boolean needOutDoorPic) {
    this.needOutDoorPic = needOutDoorPic;
  }


  public MiniAppCategory needSpecialLicense(Boolean needSpecialLicense) {
    
    this.needSpecialLicense = needSpecialLicense;
    return this;
  }

   /**
   * 是否需要特许营业执照
   * @return needSpecialLicense
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否需要特许营业执照")

  public Boolean getNeedSpecialLicense() {
    return needSpecialLicense;
  }


  public void setNeedSpecialLicense(Boolean needSpecialLicense) {
    this.needSpecialLicense = needSpecialLicense;
  }


  public MiniAppCategory parentCategoryId(String parentCategoryId) {
    
    this.parentCategoryId = parentCategoryId;
    return this;
  }

   /**
   * 父类目id
   * @return parentCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "父类目id")

  public String getParentCategoryId() {
    return parentCategoryId;
  }


  public void setParentCategoryId(String parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
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
   * @return the MiniAppCategory instance itself
   */
  public MiniAppCategory putAdditionalProperty(String key, Object value) {
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
    MiniAppCategory miniAppCategory = (MiniAppCategory) o;
    return Objects.equals(this.categoryId, miniAppCategory.categoryId) &&
        Objects.equals(this.categoryName, miniAppCategory.categoryName) &&
        Objects.equals(this.hasChild, miniAppCategory.hasChild) &&
        Objects.equals(this.needLicense, miniAppCategory.needLicense) &&
        Objects.equals(this.needOutDoorPic, miniAppCategory.needOutDoorPic) &&
        Objects.equals(this.needSpecialLicense, miniAppCategory.needSpecialLicense) &&
        Objects.equals(this.parentCategoryId, miniAppCategory.parentCategoryId)&&
        Objects.equals(this.additionalProperties, miniAppCategory.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryName, hasChild, needLicense, needOutDoorPic, needSpecialLicense, parentCategoryId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiniAppCategory {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    hasChild: ").append(toIndentedString(hasChild)).append("\n");
    sb.append("    needLicense: ").append(toIndentedString(needLicense)).append("\n");
    sb.append("    needOutDoorPic: ").append(toIndentedString(needOutDoorPic)).append("\n");
    sb.append("    needSpecialLicense: ").append(toIndentedString(needSpecialLicense)).append("\n");
    sb.append("    parentCategoryId: ").append(toIndentedString(parentCategoryId)).append("\n");
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
    openapiFields.add("category_id");
    openapiFields.add("category_name");
    openapiFields.add("has_child");
    openapiFields.add("need_license");
    openapiFields.add("need_out_door_pic");
    openapiFields.add("need_special_license");
    openapiFields.add("parent_category_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MiniAppCategory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MiniAppCategory.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MiniAppCategory is not found in the empty JSON string", MiniAppCategory.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (jsonObj.get("category_name") != null && !jsonObj.get("category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_name").toString()));
      }
      if (jsonObj.get("parent_category_id") != null && !jsonObj.get("parent_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_category_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MiniAppCategory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MiniAppCategory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MiniAppCategory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MiniAppCategory.class));

       return (TypeAdapter<T>) new TypeAdapter<MiniAppCategory>() {
           @Override
           public void write(JsonWriter out, MiniAppCategory value) throws IOException {
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
           public MiniAppCategory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MiniAppCategory instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MiniAppCategory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MiniAppCategory
  * @throws IOException if the JSON string is invalid with respect to MiniAppCategory
  */
  public static MiniAppCategory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MiniAppCategory.class);
  }

 /**
  * Convert an instance of MiniAppCategory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

