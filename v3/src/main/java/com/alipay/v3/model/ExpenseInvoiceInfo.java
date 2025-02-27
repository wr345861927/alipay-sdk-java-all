/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.InvoiceOutputInfo;
import com.alipay.v3.model.OcrNormalScanInfo;
import com.alipay.v3.model.OcrPlaneScanInfo;
import com.alipay.v3.model.OcrTaxiScanInfo;
import com.alipay.v3.model.OcrTrainScanInfo;
import com.alipay.v3.model.VoucherFileInfo;
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
 * ExpenseInvoiceInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseInvoiceInfo {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_OPEN_ID = "employee_open_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_OPEN_ID)
  private String employeeOpenId;

  public static final String SERIALIZED_NAME_INVOICE_OUTPUT_INFO = "invoice_output_info";
  @SerializedName(SERIALIZED_NAME_INVOICE_OUTPUT_INFO)
  private InvoiceOutputInfo invoiceOutputInfo;

  public static final String SERIALIZED_NAME_OCR_NORMAL_SCAN_INFO = "ocr_normal_scan_info";
  @SerializedName(SERIALIZED_NAME_OCR_NORMAL_SCAN_INFO)
  private OcrNormalScanInfo ocrNormalScanInfo;

  public static final String SERIALIZED_NAME_OCR_PLANE_SCAN_INFO = "ocr_plane_scan_info";
  @SerializedName(SERIALIZED_NAME_OCR_PLANE_SCAN_INFO)
  private OcrPlaneScanInfo ocrPlaneScanInfo;

  public static final String SERIALIZED_NAME_OCR_TAXI_SCAN_INFO = "ocr_taxi_scan_info";
  @SerializedName(SERIALIZED_NAME_OCR_TAXI_SCAN_INFO)
  private OcrTaxiScanInfo ocrTaxiScanInfo;

  public static final String SERIALIZED_NAME_OCR_TRAIN_SCAN_INFO = "ocr_train_scan_info";
  @SerializedName(SERIALIZED_NAME_OCR_TRAIN_SCAN_INFO)
  private OcrTrainScanInfo ocrTrainScanInfo;

  public static final String SERIALIZED_NAME_VOUCHER_FILE_INFO = "voucher_file_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_FILE_INFO)
  private VoucherFileInfo voucherFileInfo;

  public static final String SERIALIZED_NAME_VOUCHER_ID = "voucher_id";
  @SerializedName(SERIALIZED_NAME_VOUCHER_ID)
  private String voucherId;

  public ExpenseInvoiceInfo() { 
  }

  public ExpenseInvoiceInfo employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 员工ID
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "员工ID")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public ExpenseInvoiceInfo employeeOpenId(String employeeOpenId) {
    
    this.employeeOpenId = employeeOpenId;
    return this;
  }

   /**
   * 员工ID
   * @return employeeOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "员工ID")

  public String getEmployeeOpenId() {
    return employeeOpenId;
  }


  public void setEmployeeOpenId(String employeeOpenId) {
    this.employeeOpenId = employeeOpenId;
  }


  public ExpenseInvoiceInfo invoiceOutputInfo(InvoiceOutputInfo invoiceOutputInfo) {
    
    this.invoiceOutputInfo = invoiceOutputInfo;
    return this;
  }

   /**
   * Get invoiceOutputInfo
   * @return invoiceOutputInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvoiceOutputInfo getInvoiceOutputInfo() {
    return invoiceOutputInfo;
  }


  public void setInvoiceOutputInfo(InvoiceOutputInfo invoiceOutputInfo) {
    this.invoiceOutputInfo = invoiceOutputInfo;
  }


  public ExpenseInvoiceInfo ocrNormalScanInfo(OcrNormalScanInfo ocrNormalScanInfo) {
    
    this.ocrNormalScanInfo = ocrNormalScanInfo;
    return this;
  }

   /**
   * Get ocrNormalScanInfo
   * @return ocrNormalScanInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OcrNormalScanInfo getOcrNormalScanInfo() {
    return ocrNormalScanInfo;
  }


  public void setOcrNormalScanInfo(OcrNormalScanInfo ocrNormalScanInfo) {
    this.ocrNormalScanInfo = ocrNormalScanInfo;
  }


  public ExpenseInvoiceInfo ocrPlaneScanInfo(OcrPlaneScanInfo ocrPlaneScanInfo) {
    
    this.ocrPlaneScanInfo = ocrPlaneScanInfo;
    return this;
  }

   /**
   * Get ocrPlaneScanInfo
   * @return ocrPlaneScanInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OcrPlaneScanInfo getOcrPlaneScanInfo() {
    return ocrPlaneScanInfo;
  }


  public void setOcrPlaneScanInfo(OcrPlaneScanInfo ocrPlaneScanInfo) {
    this.ocrPlaneScanInfo = ocrPlaneScanInfo;
  }


  public ExpenseInvoiceInfo ocrTaxiScanInfo(OcrTaxiScanInfo ocrTaxiScanInfo) {
    
    this.ocrTaxiScanInfo = ocrTaxiScanInfo;
    return this;
  }

   /**
   * Get ocrTaxiScanInfo
   * @return ocrTaxiScanInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OcrTaxiScanInfo getOcrTaxiScanInfo() {
    return ocrTaxiScanInfo;
  }


  public void setOcrTaxiScanInfo(OcrTaxiScanInfo ocrTaxiScanInfo) {
    this.ocrTaxiScanInfo = ocrTaxiScanInfo;
  }


  public ExpenseInvoiceInfo ocrTrainScanInfo(OcrTrainScanInfo ocrTrainScanInfo) {
    
    this.ocrTrainScanInfo = ocrTrainScanInfo;
    return this;
  }

   /**
   * Get ocrTrainScanInfo
   * @return ocrTrainScanInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OcrTrainScanInfo getOcrTrainScanInfo() {
    return ocrTrainScanInfo;
  }


  public void setOcrTrainScanInfo(OcrTrainScanInfo ocrTrainScanInfo) {
    this.ocrTrainScanInfo = ocrTrainScanInfo;
  }


  public ExpenseInvoiceInfo voucherFileInfo(VoucherFileInfo voucherFileInfo) {
    
    this.voucherFileInfo = voucherFileInfo;
    return this;
  }

   /**
   * Get voucherFileInfo
   * @return voucherFileInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherFileInfo getVoucherFileInfo() {
    return voucherFileInfo;
  }


  public void setVoucherFileInfo(VoucherFileInfo voucherFileInfo) {
    this.voucherFileInfo = voucherFileInfo;
  }


  public ExpenseInvoiceInfo voucherId(String voucherId) {
    
    this.voucherId = voucherId;
    return this;
  }

   /**
   * 凭证ID
   * @return voucherId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "凭证ID")

  public String getVoucherId() {
    return voucherId;
  }


  public void setVoucherId(String voucherId) {
    this.voucherId = voucherId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseInvoiceInfo expenseInvoiceInfo = (ExpenseInvoiceInfo) o;
    return Objects.equals(this.employeeId, expenseInvoiceInfo.employeeId) &&
        Objects.equals(this.employeeOpenId, expenseInvoiceInfo.employeeOpenId) &&
        Objects.equals(this.invoiceOutputInfo, expenseInvoiceInfo.invoiceOutputInfo) &&
        Objects.equals(this.ocrNormalScanInfo, expenseInvoiceInfo.ocrNormalScanInfo) &&
        Objects.equals(this.ocrPlaneScanInfo, expenseInvoiceInfo.ocrPlaneScanInfo) &&
        Objects.equals(this.ocrTaxiScanInfo, expenseInvoiceInfo.ocrTaxiScanInfo) &&
        Objects.equals(this.ocrTrainScanInfo, expenseInvoiceInfo.ocrTrainScanInfo) &&
        Objects.equals(this.voucherFileInfo, expenseInvoiceInfo.voucherFileInfo) &&
        Objects.equals(this.voucherId, expenseInvoiceInfo.voucherId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, employeeOpenId, invoiceOutputInfo, ocrNormalScanInfo, ocrPlaneScanInfo, ocrTaxiScanInfo, ocrTrainScanInfo, voucherFileInfo, voucherId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseInvoiceInfo {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeOpenId: ").append(toIndentedString(employeeOpenId)).append("\n");
    sb.append("    invoiceOutputInfo: ").append(toIndentedString(invoiceOutputInfo)).append("\n");
    sb.append("    ocrNormalScanInfo: ").append(toIndentedString(ocrNormalScanInfo)).append("\n");
    sb.append("    ocrPlaneScanInfo: ").append(toIndentedString(ocrPlaneScanInfo)).append("\n");
    sb.append("    ocrTaxiScanInfo: ").append(toIndentedString(ocrTaxiScanInfo)).append("\n");
    sb.append("    ocrTrainScanInfo: ").append(toIndentedString(ocrTrainScanInfo)).append("\n");
    sb.append("    voucherFileInfo: ").append(toIndentedString(voucherFileInfo)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
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
    openapiFields.add("employee_id");
    openapiFields.add("employee_open_id");
    openapiFields.add("invoice_output_info");
    openapiFields.add("ocr_normal_scan_info");
    openapiFields.add("ocr_plane_scan_info");
    openapiFields.add("ocr_taxi_scan_info");
    openapiFields.add("ocr_train_scan_info");
    openapiFields.add("voucher_file_info");
    openapiFields.add("voucher_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseInvoiceInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExpenseInvoiceInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseInvoiceInfo is not found in the empty JSON string", ExpenseInvoiceInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExpenseInvoiceInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExpenseInvoiceInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("employee_open_id") != null && !jsonObj.get("employee_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_open_id").toString()));
      }
      // validate the optional field `invoice_output_info`
      if (jsonObj.getAsJsonObject("invoice_output_info") != null) {
        InvoiceOutputInfo.validateJsonObject(jsonObj.getAsJsonObject("invoice_output_info"));
      }
      // validate the optional field `ocr_normal_scan_info`
      if (jsonObj.getAsJsonObject("ocr_normal_scan_info") != null) {
        OcrNormalScanInfo.validateJsonObject(jsonObj.getAsJsonObject("ocr_normal_scan_info"));
      }
      // validate the optional field `ocr_plane_scan_info`
      if (jsonObj.getAsJsonObject("ocr_plane_scan_info") != null) {
        OcrPlaneScanInfo.validateJsonObject(jsonObj.getAsJsonObject("ocr_plane_scan_info"));
      }
      // validate the optional field `ocr_taxi_scan_info`
      if (jsonObj.getAsJsonObject("ocr_taxi_scan_info") != null) {
        OcrTaxiScanInfo.validateJsonObject(jsonObj.getAsJsonObject("ocr_taxi_scan_info"));
      }
      // validate the optional field `ocr_train_scan_info`
      if (jsonObj.getAsJsonObject("ocr_train_scan_info") != null) {
        OcrTrainScanInfo.validateJsonObject(jsonObj.getAsJsonObject("ocr_train_scan_info"));
      }
      // validate the optional field `voucher_file_info`
      if (jsonObj.getAsJsonObject("voucher_file_info") != null) {
        VoucherFileInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_file_info"));
      }
      if (jsonObj.get("voucher_id") != null && !jsonObj.get("voucher_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseInvoiceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseInvoiceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseInvoiceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseInvoiceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseInvoiceInfo>() {
           @Override
           public void write(JsonWriter out, ExpenseInvoiceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExpenseInvoiceInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExpenseInvoiceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseInvoiceInfo
  * @throws IOException if the JSON string is invalid with respect to ExpenseInvoiceInfo
  */
  public static ExpenseInvoiceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseInvoiceInfo.class);
  }

 /**
  * Convert an instance of ExpenseInvoiceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

