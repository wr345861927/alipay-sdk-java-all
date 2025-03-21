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
import com.alipay.v3.model.MaterialField;
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
 * AlipayMarketingMaterialCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingMaterialCreateModel {
  public static final String SERIALIZED_NAME_MATERIAL_FIELDS = "material_fields";
  @SerializedName(SERIALIZED_NAME_MATERIAL_FIELDS)
  private List<MaterialField> materialFields = null;

  public static final String SERIALIZED_NAME_MATERIAL_NAME = "material_name";
  @SerializedName(SERIALIZED_NAME_MATERIAL_NAME)
  private String materialName;

  public static final String SERIALIZED_NAME_MATERIAL_SPEC_ID = "material_spec_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_SPEC_ID)
  private String materialSpecId;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public AlipayMarketingMaterialCreateModel() { 
  }

  public AlipayMarketingMaterialCreateModel materialFields(List<MaterialField> materialFields) {
    
    this.materialFields = materialFields;
    return this;
  }

  public AlipayMarketingMaterialCreateModel addMaterialFieldsItem(MaterialField materialFieldsItem) {
    if (this.materialFields == null) {
      this.materialFields = new ArrayList<>();
    }
    this.materialFields.add(materialFieldsItem);
    return this;
  }

   /**
   * 素材字段列表，素材提报的具体内容，包含三种类型：图片、文本、链接。图片类型，则根据“图片资源上传接口”中返回的resource_id字段值进行素材字段的设值。文本或链接类型，则按照实际需要设值即可，需满足具体的规范要求。规范要求详情请参见产品文档。
   * @return materialFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "素材字段列表，素材提报的具体内容，包含三种类型：图片、文本、链接。图片类型，则根据“图片资源上传接口”中返回的resource_id字段值进行素材字段的设值。文本或链接类型，则按照实际需要设值即可，需满足具体的规范要求。规范要求详情请参见产品文档。")

  public List<MaterialField> getMaterialFields() {
    return materialFields;
  }


  public void setMaterialFields(List<MaterialField> materialFields) {
    this.materialFields = materialFields;
  }


  public AlipayMarketingMaterialCreateModel materialName(String materialName) {
    
    this.materialName = materialName;
    return this;
  }

   /**
   * 素材名称，接入方自行生成，建议命名时遵循一定的规律以方便管理。
   * @return materialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试素材名称", value = "素材名称，接入方自行生成，建议命名时遵循一定的规律以方便管理。")

  public String getMaterialName() {
    return materialName;
  }


  public void setMaterialName(String materialName) {
    this.materialName = materialName;
  }


  public AlipayMarketingMaterialCreateModel materialSpecId(String materialSpecId) {
    
    this.materialSpecId = materialSpecId;
    return this;
  }

   /**
   * 素材规范ID，用于标识具体场景下的素材规范，根据具体的使用场景获取对应的素材规范ID。
   * @return materialSpecId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019041301000200000077970001", value = "素材规范ID，用于标识具体场景下的素材规范，根据具体的使用场景获取对应的素材规范ID。")

  public String getMaterialSpecId() {
    return materialSpecId;
  }


  public void setMaterialSpecId(String materialSpecId) {
    this.materialSpecId = materialSpecId;
  }


  public AlipayMarketingMaterialCreateModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务单号，用作幂等控制，相同单号会返回上一次的结果，接入方需保证单号唯一。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21ba1e1c16456985463242192e4d", value = "外部业务单号，用作幂等控制，相同单号会返回上一次的结果，接入方需保证单号唯一。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
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
   * @return the AlipayMarketingMaterialCreateModel instance itself
   */
  public AlipayMarketingMaterialCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingMaterialCreateModel alipayMarketingMaterialCreateModel = (AlipayMarketingMaterialCreateModel) o;
    return Objects.equals(this.materialFields, alipayMarketingMaterialCreateModel.materialFields) &&
        Objects.equals(this.materialName, alipayMarketingMaterialCreateModel.materialName) &&
        Objects.equals(this.materialSpecId, alipayMarketingMaterialCreateModel.materialSpecId) &&
        Objects.equals(this.outBizNo, alipayMarketingMaterialCreateModel.outBizNo)&&
        Objects.equals(this.additionalProperties, alipayMarketingMaterialCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialFields, materialName, materialSpecId, outBizNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingMaterialCreateModel {\n");
    sb.append("    materialFields: ").append(toIndentedString(materialFields)).append("\n");
    sb.append("    materialName: ").append(toIndentedString(materialName)).append("\n");
    sb.append("    materialSpecId: ").append(toIndentedString(materialSpecId)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
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
    openapiFields.add("material_fields");
    openapiFields.add("material_name");
    openapiFields.add("material_spec_id");
    openapiFields.add("out_biz_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingMaterialCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingMaterialCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingMaterialCreateModel is not found in the empty JSON string", AlipayMarketingMaterialCreateModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArraymaterialFields = jsonObj.getAsJsonArray("material_fields");
      if (jsonArraymaterialFields != null) {
        // ensure the json data is an array
        if (!jsonObj.get("material_fields").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `material_fields` to be an array in the JSON string but got `%s`", jsonObj.get("material_fields").toString()));
        }

        // validate the optional field `material_fields` (array)
        for (int i = 0; i < jsonArraymaterialFields.size(); i++) {
          MaterialField.validateJsonObject(jsonArraymaterialFields.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("material_name") != null && !jsonObj.get("material_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_name").toString()));
      }
      if (jsonObj.get("material_spec_id") != null && !jsonObj.get("material_spec_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_spec_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_spec_id").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingMaterialCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingMaterialCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingMaterialCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingMaterialCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingMaterialCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingMaterialCreateModel value) throws IOException {
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
           public AlipayMarketingMaterialCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingMaterialCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingMaterialCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingMaterialCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingMaterialCreateModel
  */
  public static AlipayMarketingMaterialCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingMaterialCreateModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingMaterialCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

