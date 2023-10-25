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
import com.alipay.v3.model.CommonErrorType;
import com.alipay.v3.model.ZhimaCustomerJobworthJobdataAddErrorResponseModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.alipay.v3.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCustomerJobworthJobdataAddDefaultResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ZhimaCustomerJobworthJobdataAddDefaultResponse.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ZhimaCustomerJobworthJobdataAddDefaultResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ZhimaCustomerJobworthJobdataAddDefaultResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CommonErrorType> adapterCommonErrorType = gson.getDelegateAdapter(this, TypeToken.get(CommonErrorType.class));
            final TypeAdapter<ZhimaCustomerJobworthJobdataAddErrorResponseModel> adapterZhimaCustomerJobworthJobdataAddErrorResponseModel = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCustomerJobworthJobdataAddErrorResponseModel.class));

            return (TypeAdapter<T>) new TypeAdapter<ZhimaCustomerJobworthJobdataAddDefaultResponse>() {
                @Override
                public void write(JsonWriter out, ZhimaCustomerJobworthJobdataAddDefaultResponse value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CommonErrorType`
                    if (value.getActualInstance() instanceof CommonErrorType) {
                        JsonObject obj = adapterCommonErrorType.toJsonTree((CommonErrorType)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ZhimaCustomerJobworthJobdataAddErrorResponseModel`
                    if (value.getActualInstance() instanceof ZhimaCustomerJobworthJobdataAddErrorResponseModel) {
                        JsonObject obj = adapterZhimaCustomerJobworthJobdataAddErrorResponseModel.toJsonTree((ZhimaCustomerJobworthJobdataAddErrorResponseModel)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: CommonErrorType, ZhimaCustomerJobworthJobdataAddErrorResponseModel");
                }

                @Override
                public ZhimaCustomerJobworthJobdataAddDefaultResponse read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize CommonErrorType
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CommonErrorType.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'CommonErrorType'");
                        ZhimaCustomerJobworthJobdataAddDefaultResponse ret = new ZhimaCustomerJobworthJobdataAddDefaultResponse();
                        ret.setActualInstance(adapterCommonErrorType.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'CommonErrorType'", e);
                    }

                    // deserialize ZhimaCustomerJobworthJobdataAddErrorResponseModel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ZhimaCustomerJobworthJobdataAddErrorResponseModel.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ZhimaCustomerJobworthJobdataAddErrorResponseModel'");
                        ZhimaCustomerJobworthJobdataAddDefaultResponse ret = new ZhimaCustomerJobworthJobdataAddDefaultResponse();
                        ret.setActualInstance(adapterZhimaCustomerJobworthJobdataAddErrorResponseModel.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ZhimaCustomerJobworthJobdataAddErrorResponseModel'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for ZhimaCustomerJobworthJobdataAddDefaultResponse: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ZhimaCustomerJobworthJobdataAddDefaultResponse() {
        super("anyOf", Boolean.FALSE);
    }

    public ZhimaCustomerJobworthJobdataAddDefaultResponse(CommonErrorType o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ZhimaCustomerJobworthJobdataAddDefaultResponse(ZhimaCustomerJobworthJobdataAddErrorResponseModel o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CommonErrorType", new GenericType<CommonErrorType>() {
        });
        schemas.put("ZhimaCustomerJobworthJobdataAddErrorResponseModel", new GenericType<ZhimaCustomerJobworthJobdataAddErrorResponseModel>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ZhimaCustomerJobworthJobdataAddDefaultResponse.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * CommonErrorType, ZhimaCustomerJobworthJobdataAddErrorResponseModel
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CommonErrorType) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ZhimaCustomerJobworthJobdataAddErrorResponseModel) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CommonErrorType, ZhimaCustomerJobworthJobdataAddErrorResponseModel");
    }

    /**
     * Get the actual instance, which can be the following:
     * CommonErrorType, ZhimaCustomerJobworthJobdataAddErrorResponseModel
     *
     * @return The actual instance (CommonErrorType, ZhimaCustomerJobworthJobdataAddErrorResponseModel)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CommonErrorType`. If the actual instance is not `CommonErrorType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CommonErrorType`
     * @throws ClassCastException if the instance is not `CommonErrorType`
     */
    public CommonErrorType getCommonErrorType() throws ClassCastException {
        return (CommonErrorType)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ZhimaCustomerJobworthJobdataAddErrorResponseModel`. If the actual instance is not `ZhimaCustomerJobworthJobdataAddErrorResponseModel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ZhimaCustomerJobworthJobdataAddErrorResponseModel`
     * @throws ClassCastException if the instance is not `ZhimaCustomerJobworthJobdataAddErrorResponseModel`
     */
    public ZhimaCustomerJobworthJobdataAddErrorResponseModel getZhimaCustomerJobworthJobdataAddErrorResponseModel() throws ClassCastException {
        return (ZhimaCustomerJobworthJobdataAddErrorResponseModel)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCustomerJobworthJobdataAddDefaultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with CommonErrorType
    try {
      CommonErrorType.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with ZhimaCustomerJobworthJobdataAddErrorResponseModel
    try {
      ZhimaCustomerJobworthJobdataAddErrorResponseModel.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for ZhimaCustomerJobworthJobdataAddDefaultResponse with anyOf schemas: CommonErrorType, ZhimaCustomerJobworthJobdataAddErrorResponseModel. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ZhimaCustomerJobworthJobdataAddDefaultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCustomerJobworthJobdataAddDefaultResponse
  * @throws IOException if the JSON string is invalid with respect to ZhimaCustomerJobworthJobdataAddDefaultResponse
  */
  public static ZhimaCustomerJobworthJobdataAddDefaultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCustomerJobworthJobdataAddDefaultResponse.class);
  }

 /**
  * Convert an instance of ZhimaCustomerJobworthJobdataAddDefaultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

