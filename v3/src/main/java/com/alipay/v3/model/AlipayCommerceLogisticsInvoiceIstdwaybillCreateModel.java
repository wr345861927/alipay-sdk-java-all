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
import com.alipay.v3.model.Invoice;
import com.alipay.v3.model.WaybillInvoice;
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
 * AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel {
  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  private Invoice invoice;

  public static final String SERIALIZED_NAME_LOGISTICS_CODE = "logistics_code";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_CODE)
  private String logisticsCode;

  public static final String SERIALIZED_NAME_OUT_INVOICE_REQUEST_NO = "out_invoice_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_INVOICE_REQUEST_NO)
  private String outInvoiceRequestNo;

  public static final String SERIALIZED_NAME_WAYBILL_INVOICES = "waybill_invoices";
  @SerializedName(SERIALIZED_NAME_WAYBILL_INVOICES)
  private List<WaybillInvoice> waybillInvoices = null;

  public AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel() { 
  }

  public AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel invoice(Invoice invoice) {
    
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Invoice getInvoice() {
    return invoice;
  }


  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }


  public AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel logisticsCode(String logisticsCode) {
    
    this.logisticsCode = logisticsCode;
    return this;
  }

   /**
   * 即时配送公司编码
   * @return logisticsCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FENGNIAO", value = "即时配送公司编码")

  public String getLogisticsCode() {
    return logisticsCode;
  }


  public void setLogisticsCode(String logisticsCode) {
    this.logisticsCode = logisticsCode;
  }


  public AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel outInvoiceRequestNo(String outInvoiceRequestNo) {
    
    this.outInvoiceRequestNo = outInvoiceRequestNo;
    return this;
  }

   /**
   * 开票请求流水号
   * @return outInvoiceRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "out_invoice_no_00001", value = "开票请求流水号")

  public String getOutInvoiceRequestNo() {
    return outInvoiceRequestNo;
  }


  public void setOutInvoiceRequestNo(String outInvoiceRequestNo) {
    this.outInvoiceRequestNo = outInvoiceRequestNo;
  }


  public AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel waybillInvoices(List<WaybillInvoice> waybillInvoices) {
    
    this.waybillInvoices = waybillInvoices;
    return this;
  }

  public AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel addWaybillInvoicesItem(WaybillInvoice waybillInvoicesItem) {
    if (this.waybillInvoices == null) {
      this.waybillInvoices = new ArrayList<>();
    }
    this.waybillInvoices.add(waybillInvoicesItem);
    return this;
  }

   /**
   * 即时配送运单列表
   * @return waybillInvoices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "即时配送运单列表")

  public List<WaybillInvoice> getWaybillInvoices() {
    return waybillInvoices;
  }


  public void setWaybillInvoices(List<WaybillInvoice> waybillInvoices) {
    this.waybillInvoices = waybillInvoices;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel alipayCommerceLogisticsInvoiceIstdwaybillCreateModel = (AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel) o;
    return Objects.equals(this.invoice, alipayCommerceLogisticsInvoiceIstdwaybillCreateModel.invoice) &&
        Objects.equals(this.logisticsCode, alipayCommerceLogisticsInvoiceIstdwaybillCreateModel.logisticsCode) &&
        Objects.equals(this.outInvoiceRequestNo, alipayCommerceLogisticsInvoiceIstdwaybillCreateModel.outInvoiceRequestNo) &&
        Objects.equals(this.waybillInvoices, alipayCommerceLogisticsInvoiceIstdwaybillCreateModel.waybillInvoices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice, logisticsCode, outInvoiceRequestNo, waybillInvoices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel {\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    logisticsCode: ").append(toIndentedString(logisticsCode)).append("\n");
    sb.append("    outInvoiceRequestNo: ").append(toIndentedString(outInvoiceRequestNo)).append("\n");
    sb.append("    waybillInvoices: ").append(toIndentedString(waybillInvoices)).append("\n");
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
    openapiFields.add("invoice");
    openapiFields.add("logistics_code");
    openapiFields.add("out_invoice_request_no");
    openapiFields.add("waybill_invoices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel is not found in the empty JSON string", AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `invoice`
      if (jsonObj.getAsJsonObject("invoice") != null) {
        Invoice.validateJsonObject(jsonObj.getAsJsonObject("invoice"));
      }
      if (jsonObj.get("logistics_code") != null && !jsonObj.get("logistics_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logistics_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logistics_code").toString()));
      }
      if (jsonObj.get("out_invoice_request_no") != null && !jsonObj.get("out_invoice_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_invoice_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_invoice_request_no").toString()));
      }
      JsonArray jsonArraywaybillInvoices = jsonObj.getAsJsonArray("waybill_invoices");
      if (jsonArraywaybillInvoices != null) {
        // ensure the json data is an array
        if (!jsonObj.get("waybill_invoices").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `waybill_invoices` to be an array in the JSON string but got `%s`", jsonObj.get("waybill_invoices").toString()));
        }

        // validate the optional field `waybill_invoices` (array)
        for (int i = 0; i < jsonArraywaybillInvoices.size(); i++) {
          WaybillInvoice.validateJsonObject(jsonArraywaybillInvoices.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel
  */
  public static AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

