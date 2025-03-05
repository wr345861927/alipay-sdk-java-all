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
 * IsvExpandOpporDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IsvExpandOpporDTO {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_LEADS_ID = "leads_id";
  @SerializedName(SERIALIZED_NAME_LEADS_ID)
  private String leadsId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPPOR_ID = "oppor_id";
  @SerializedName(SERIALIZED_NAME_OPPOR_ID)
  private String opporId;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public IsvExpandOpporDTO() { 
  }

  public IsvExpandOpporDTO address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 商机地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "紫金港路与文二西路交叉口向西500米西城广场", value = "商机地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public IsvExpandOpporDTO leadsId(String leadsId) {
    
    this.leadsId = leadsId;
    return this;
  }

   /**
   * 商机Id
   * @return leadsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020092100009315", value = "商机Id")

  public String getLeadsId() {
    return leadsId;
  }


  public void setLeadsId(String leadsId) {
    this.leadsId = leadsId;
  }


  public IsvExpandOpporDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 商机名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试", value = "商机名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IsvExpandOpporDTO opporId(String opporId) {
    
    this.opporId = opporId;
    return this;
  }

   /**
   * 商机作业Id
   * @return opporId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020092200010868", value = "商机作业Id")

  public String getOpporId() {
    return opporId;
  }


  public void setOpporId(String opporId) {
    this.opporId = opporId;
  }


  public IsvExpandOpporDTO outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部幂等唯一键
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "out_biz_no", value = "外部幂等唯一键")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public IsvExpandOpporDTO phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 商机联系电话
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13812312323", value = "商机联系电话")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public IsvExpandOpporDTO status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 商机作业状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXPANDED", value = "商机作业状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the IsvExpandOpporDTO instance itself
   */
  public IsvExpandOpporDTO putAdditionalProperty(String key, Object value) {
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
    IsvExpandOpporDTO isvExpandOpporDTO = (IsvExpandOpporDTO) o;
    return Objects.equals(this.address, isvExpandOpporDTO.address) &&
        Objects.equals(this.leadsId, isvExpandOpporDTO.leadsId) &&
        Objects.equals(this.name, isvExpandOpporDTO.name) &&
        Objects.equals(this.opporId, isvExpandOpporDTO.opporId) &&
        Objects.equals(this.outBizNo, isvExpandOpporDTO.outBizNo) &&
        Objects.equals(this.phone, isvExpandOpporDTO.phone) &&
        Objects.equals(this.status, isvExpandOpporDTO.status)&&
        Objects.equals(this.additionalProperties, isvExpandOpporDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, leadsId, name, opporId, outBizNo, phone, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsvExpandOpporDTO {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    leadsId: ").append(toIndentedString(leadsId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    opporId: ").append(toIndentedString(opporId)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("leads_id");
    openapiFields.add("name");
    openapiFields.add("oppor_id");
    openapiFields.add("out_biz_no");
    openapiFields.add("phone");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IsvExpandOpporDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IsvExpandOpporDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IsvExpandOpporDTO is not found in the empty JSON string", IsvExpandOpporDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("leads_id") != null && !jsonObj.get("leads_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leads_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leads_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("oppor_id") != null && !jsonObj.get("oppor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oppor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oppor_id").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IsvExpandOpporDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IsvExpandOpporDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IsvExpandOpporDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IsvExpandOpporDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<IsvExpandOpporDTO>() {
           @Override
           public void write(JsonWriter out, IsvExpandOpporDTO value) throws IOException {
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
           public IsvExpandOpporDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IsvExpandOpporDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IsvExpandOpporDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IsvExpandOpporDTO
  * @throws IOException if the JSON string is invalid with respect to IsvExpandOpporDTO
  */
  public static IsvExpandOpporDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IsvExpandOpporDTO.class);
  }

 /**
  * Convert an instance of IsvExpandOpporDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

