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
import com.alipay.v3.model.SubTaskInfo;
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
 * AlipayOpenSpIsvSignauthQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpIsvSignauthQueryResponseModel {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TASK_INFOS = "task_infos";
  @SerializedName(SERIALIZED_NAME_TASK_INFOS)
  private List<SubTaskInfo> taskInfos = null;

  public AlipayOpenSpIsvSignauthQueryResponseModel() { 
  }

  public AlipayOpenSpIsvSignauthQueryResponseModel orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 签约授权一体化订单ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211102034000100000047728652040", value = "签约授权一体化订单ID")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public AlipayOpenSpIsvSignauthQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 签约授权一体化订单状态 INIT:初始化 UNCONFIRM:待确认 FAILURE:失败 FINISH:成功
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INIT", value = "签约授权一体化订单状态 INIT:初始化 UNCONFIRM:待确认 FAILURE:失败 FINISH:成功")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayOpenSpIsvSignauthQueryResponseModel taskInfos(List<SubTaskInfo> taskInfos) {
    
    this.taskInfos = taskInfos;
    return this;
  }

  public AlipayOpenSpIsvSignauthQueryResponseModel addTaskInfosItem(SubTaskInfo taskInfosItem) {
    if (this.taskInfos == null) {
      this.taskInfos = new ArrayList<>();
    }
    this.taskInfos.add(taskInfosItem);
    return this;
  }

   /**
   * 签约授权一体化订单子任务单信息
   * @return taskInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "签约授权一体化订单子任务单信息")

  public List<SubTaskInfo> getTaskInfos() {
    return taskInfos;
  }


  public void setTaskInfos(List<SubTaskInfo> taskInfos) {
    this.taskInfos = taskInfos;
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
   * @return the AlipayOpenSpIsvSignauthQueryResponseModel instance itself
   */
  public AlipayOpenSpIsvSignauthQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenSpIsvSignauthQueryResponseModel alipayOpenSpIsvSignauthQueryResponseModel = (AlipayOpenSpIsvSignauthQueryResponseModel) o;
    return Objects.equals(this.orderId, alipayOpenSpIsvSignauthQueryResponseModel.orderId) &&
        Objects.equals(this.status, alipayOpenSpIsvSignauthQueryResponseModel.status) &&
        Objects.equals(this.taskInfos, alipayOpenSpIsvSignauthQueryResponseModel.taskInfos)&&
        Objects.equals(this.additionalProperties, alipayOpenSpIsvSignauthQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, status, taskInfos, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpIsvSignauthQueryResponseModel {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskInfos: ").append(toIndentedString(taskInfos)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("status");
    openapiFields.add("task_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpIsvSignauthQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpIsvSignauthQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpIsvSignauthQueryResponseModel is not found in the empty JSON string", AlipayOpenSpIsvSignauthQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      JsonArray jsonArraytaskInfos = jsonObj.getAsJsonArray("task_infos");
      if (jsonArraytaskInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("task_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `task_infos` to be an array in the JSON string but got `%s`", jsonObj.get("task_infos").toString()));
        }

        // validate the optional field `task_infos` (array)
        for (int i = 0; i < jsonArraytaskInfos.size(); i++) {
          SubTaskInfo.validateJsonObject(jsonArraytaskInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpIsvSignauthQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpIsvSignauthQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpIsvSignauthQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpIsvSignauthQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpIsvSignauthQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpIsvSignauthQueryResponseModel value) throws IOException {
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
           public AlipayOpenSpIsvSignauthQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenSpIsvSignauthQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenSpIsvSignauthQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpIsvSignauthQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpIsvSignauthQueryResponseModel
  */
  public static AlipayOpenSpIsvSignauthQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpIsvSignauthQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpIsvSignauthQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

