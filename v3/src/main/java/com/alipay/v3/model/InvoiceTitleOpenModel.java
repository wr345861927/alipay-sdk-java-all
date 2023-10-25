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
 * InvoiceTitleOpenModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoiceTitleOpenModel {
  public static final String SERIALIZED_NAME_PAYER_ADDRESS_TEL = "payer_address_tel";
  @SerializedName(SERIALIZED_NAME_PAYER_ADDRESS_TEL)
  private String payerAddressTel;

  public static final String SERIALIZED_NAME_PAYER_BANK_NAME_ACCOUNT = "payer_bank_name_account";
  @SerializedName(SERIALIZED_NAME_PAYER_BANK_NAME_ACCOUNT)
  private String payerBankNameAccount;

  public static final String SERIALIZED_NAME_PAYER_REGISTER_NO = "payer_register_no";
  @SerializedName(SERIALIZED_NAME_PAYER_REGISTER_NO)
  private String payerRegisterNo;

  public static final String SERIALIZED_NAME_TITLE_NAME = "title_name";
  @SerializedName(SERIALIZED_NAME_TITLE_NAME)
  private String titleName;

  public InvoiceTitleOpenModel() { 
  }

  public InvoiceTitleOpenModel payerAddressTel(String payerAddressTel) {
    
    this.payerAddressTel = payerAddressTel;
    return this;
  }

   /**
   * 票面上的购买方地址、电话
   * @return payerAddressTel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上的购买方地址、电话")

  public String getPayerAddressTel() {
    return payerAddressTel;
  }


  public void setPayerAddressTel(String payerAddressTel) {
    this.payerAddressTel = payerAddressTel;
  }


  public InvoiceTitleOpenModel payerBankNameAccount(String payerBankNameAccount) {
    
    this.payerBankNameAccount = payerBankNameAccount;
    return this;
  }

   /**
   * 票面上的购买方开户行及账户
   * @return payerBankNameAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上的购买方开户行及账户")

  public String getPayerBankNameAccount() {
    return payerBankNameAccount;
  }


  public void setPayerBankNameAccount(String payerBankNameAccount) {
    this.payerBankNameAccount = payerBankNameAccount;
  }


  public InvoiceTitleOpenModel payerRegisterNo(String payerRegisterNo) {
    
    this.payerRegisterNo = payerRegisterNo;
    return this;
  }

   /**
   * 票面上的购买方纳税人识别号
   * @return payerRegisterNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上的购买方纳税人识别号")

  public String getPayerRegisterNo() {
    return payerRegisterNo;
  }


  public void setPayerRegisterNo(String payerRegisterNo) {
    this.payerRegisterNo = payerRegisterNo;
  }


  public InvoiceTitleOpenModel titleName(String titleName) {
    
    this.titleName = titleName;
    return this;
  }

   /**
   * 票面上的购买方名称
   * @return titleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上的购买方名称")

  public String getTitleName() {
    return titleName;
  }


  public void setTitleName(String titleName) {
    this.titleName = titleName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceTitleOpenModel invoiceTitleOpenModel = (InvoiceTitleOpenModel) o;
    return Objects.equals(this.payerAddressTel, invoiceTitleOpenModel.payerAddressTel) &&
        Objects.equals(this.payerBankNameAccount, invoiceTitleOpenModel.payerBankNameAccount) &&
        Objects.equals(this.payerRegisterNo, invoiceTitleOpenModel.payerRegisterNo) &&
        Objects.equals(this.titleName, invoiceTitleOpenModel.titleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerAddressTel, payerBankNameAccount, payerRegisterNo, titleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceTitleOpenModel {\n");
    sb.append("    payerAddressTel: ").append(toIndentedString(payerAddressTel)).append("\n");
    sb.append("    payerBankNameAccount: ").append(toIndentedString(payerBankNameAccount)).append("\n");
    sb.append("    payerRegisterNo: ").append(toIndentedString(payerRegisterNo)).append("\n");
    sb.append("    titleName: ").append(toIndentedString(titleName)).append("\n");
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
    openapiFields.add("payer_address_tel");
    openapiFields.add("payer_bank_name_account");
    openapiFields.add("payer_register_no");
    openapiFields.add("title_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceTitleOpenModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoiceTitleOpenModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceTitleOpenModel is not found in the empty JSON string", InvoiceTitleOpenModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoiceTitleOpenModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceTitleOpenModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("payer_address_tel") != null && !jsonObj.get("payer_address_tel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_address_tel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_address_tel").toString()));
      }
      if (jsonObj.get("payer_bank_name_account") != null && !jsonObj.get("payer_bank_name_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_bank_name_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_bank_name_account").toString()));
      }
      if (jsonObj.get("payer_register_no") != null && !jsonObj.get("payer_register_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_register_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_register_no").toString()));
      }
      if (jsonObj.get("title_name") != null && !jsonObj.get("title_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceTitleOpenModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceTitleOpenModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceTitleOpenModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceTitleOpenModel.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceTitleOpenModel>() {
           @Override
           public void write(JsonWriter out, InvoiceTitleOpenModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceTitleOpenModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceTitleOpenModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceTitleOpenModel
  * @throws IOException if the JSON string is invalid with respect to InvoiceTitleOpenModel
  */
  public static InvoiceTitleOpenModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceTitleOpenModel.class);
  }

 /**
  * Convert an instance of InvoiceTitleOpenModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

