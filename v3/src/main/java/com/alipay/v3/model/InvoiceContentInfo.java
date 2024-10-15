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
 * InvoiceContentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoiceContentInfo {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public static final String SERIALIZED_NAME_ITEM_NO = "item_no";
  @SerializedName(SERIALIZED_NAME_ITEM_NO)
  private String itemNo;

  public static final String SERIALIZED_NAME_ITEM_UNIT = "item_unit";
  @SerializedName(SERIALIZED_NAME_ITEM_UNIT)
  private String itemUnit;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public static final String SERIALIZED_NAME_ROW_TYPE = "row_type";
  @SerializedName(SERIALIZED_NAME_ROW_TYPE)
  private String rowType;

  public static final String SERIALIZED_NAME_SPECIFICATION = "specification";
  @SerializedName(SERIALIZED_NAME_SPECIFICATION)
  private String specification;

  public static final String SERIALIZED_NAME_SUM_PRICE = "sum_price";
  @SerializedName(SERIALIZED_NAME_SUM_PRICE)
  private String sumPrice;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private String tax;

  public static final String SERIALIZED_NAME_TAX_RATE = "tax_rate";
  @SerializedName(SERIALIZED_NAME_TAX_RATE)
  private String taxRate;

  public static final String SERIALIZED_NAME_ZERO_RATE_FLAG = "zero_rate_flag";
  @SerializedName(SERIALIZED_NAME_ZERO_RATE_FLAG)
  private String zeroRateFlag;

  public InvoiceContentInfo() { 
  }

  public InvoiceContentInfo amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 含税金额（元）
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "含税金额（元）")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public InvoiceContentInfo itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * 发票项目名称/货物名称
   * @return itemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "无", value = "发票项目名称/货物名称")

  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public InvoiceContentInfo itemNo(String itemNo) {
    
    this.itemNo = itemNo;
    return this;
  }

   /**
   * 商品编码/税收分类编码
   * @return itemNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "无", value = "商品编码/税收分类编码")

  public String getItemNo() {
    return itemNo;
  }


  public void setItemNo(String itemNo) {
    this.itemNo = itemNo;
  }


  public InvoiceContentInfo itemUnit(String itemUnit) {
    
    this.itemUnit = itemUnit;
    return this;
  }

   /**
   * 单位
   * @return itemUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "无", value = "单位")

  public String getItemUnit() {
    return itemUnit;
  }


  public void setItemUnit(String itemUnit) {
    this.itemUnit = itemUnit;
  }


  public InvoiceContentInfo price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * 单价（元）
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "单价（元）")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public InvoiceContentInfo quantity(String quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * 商品数量
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "商品数量")

  public String getQuantity() {
    return quantity;
  }


  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  public InvoiceContentInfo rowType(String rowType) {
    
    this.rowType = rowType;
    return this;
  }

   /**
   * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行
   * @return rowType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "发票行性质。0表示正常行，1表示折扣行，2表示被折扣行")

  public String getRowType() {
    return rowType;
  }


  public void setRowType(String rowType) {
    this.rowType = rowType;
  }


  public InvoiceContentInfo specification(String specification) {
    
    this.specification = specification;
    return this;
  }

   /**
   * 规格型号
   * @return specification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "无", value = "规格型号")

  public String getSpecification() {
    return specification;
  }


  public void setSpecification(String specification) {
    this.specification = specification;
  }


  public InvoiceContentInfo sumPrice(String sumPrice) {
    
    this.sumPrice = sumPrice;
    return this;
  }

   /**
   * 不含税金额（元）
   * @return sumPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "150", value = "不含税金额（元）")

  public String getSumPrice() {
    return sumPrice;
  }


  public void setSumPrice(String sumPrice) {
    this.sumPrice = sumPrice;
  }


  public InvoiceContentInfo tax(String tax) {
    
    this.tax = tax;
    return this;
  }

   /**
   * 税额
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40", value = "税额")

  public String getTax() {
    return tax;
  }


  public void setTax(String tax) {
    this.tax = tax;
  }


  public InvoiceContentInfo taxRate(String taxRate) {
    
    this.taxRate = taxRate;
    return this;
  }

   /**
   * 税率
   * @return taxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "无", value = "税率")

  public String getTaxRate() {
    return taxRate;
  }


  public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
  }


  public InvoiceContentInfo zeroRateFlag(String zeroRateFlag) {
    
    this.zeroRateFlag = zeroRateFlag;
    return this;
  }

   /**
   * 税率标识，只有税率为0的情况才有值，0&#x3D;出口零税率，1&#x3D;免税，2&#x3D;不征收，3&#x3D;普通零税率
   * @return zeroRateFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "税率标识，只有税率为0的情况才有值，0=出口零税率，1=免税，2=不征收，3=普通零税率")

  public String getZeroRateFlag() {
    return zeroRateFlag;
  }


  public void setZeroRateFlag(String zeroRateFlag) {
    this.zeroRateFlag = zeroRateFlag;
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
   * @return the InvoiceContentInfo instance itself
   */
  public InvoiceContentInfo putAdditionalProperty(String key, Object value) {
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
    InvoiceContentInfo invoiceContentInfo = (InvoiceContentInfo) o;
    return Objects.equals(this.amount, invoiceContentInfo.amount) &&
        Objects.equals(this.itemName, invoiceContentInfo.itemName) &&
        Objects.equals(this.itemNo, invoiceContentInfo.itemNo) &&
        Objects.equals(this.itemUnit, invoiceContentInfo.itemUnit) &&
        Objects.equals(this.price, invoiceContentInfo.price) &&
        Objects.equals(this.quantity, invoiceContentInfo.quantity) &&
        Objects.equals(this.rowType, invoiceContentInfo.rowType) &&
        Objects.equals(this.specification, invoiceContentInfo.specification) &&
        Objects.equals(this.sumPrice, invoiceContentInfo.sumPrice) &&
        Objects.equals(this.tax, invoiceContentInfo.tax) &&
        Objects.equals(this.taxRate, invoiceContentInfo.taxRate) &&
        Objects.equals(this.zeroRateFlag, invoiceContentInfo.zeroRateFlag)&&
        Objects.equals(this.additionalProperties, invoiceContentInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, itemName, itemNo, itemUnit, price, quantity, rowType, specification, sumPrice, tax, taxRate, zeroRateFlag, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceContentInfo {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemNo: ").append(toIndentedString(itemNo)).append("\n");
    sb.append("    itemUnit: ").append(toIndentedString(itemUnit)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
    sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
    sb.append("    sumPrice: ").append(toIndentedString(sumPrice)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    zeroRateFlag: ").append(toIndentedString(zeroRateFlag)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("item_name");
    openapiFields.add("item_no");
    openapiFields.add("item_unit");
    openapiFields.add("price");
    openapiFields.add("quantity");
    openapiFields.add("row_type");
    openapiFields.add("specification");
    openapiFields.add("sum_price");
    openapiFields.add("tax");
    openapiFields.add("tax_rate");
    openapiFields.add("zero_rate_flag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceContentInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoiceContentInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceContentInfo is not found in the empty JSON string", InvoiceContentInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("item_name") != null && !jsonObj.get("item_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_name").toString()));
      }
      if (jsonObj.get("item_no") != null && !jsonObj.get("item_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_no").toString()));
      }
      if (jsonObj.get("item_unit") != null && !jsonObj.get("item_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_unit").toString()));
      }
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if (jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity").toString()));
      }
      if (jsonObj.get("row_type") != null && !jsonObj.get("row_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `row_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("row_type").toString()));
      }
      if (jsonObj.get("specification") != null && !jsonObj.get("specification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specification").toString()));
      }
      if (jsonObj.get("sum_price") != null && !jsonObj.get("sum_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sum_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sum_price").toString()));
      }
      if (jsonObj.get("tax") != null && !jsonObj.get("tax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax").toString()));
      }
      if (jsonObj.get("tax_rate") != null && !jsonObj.get("tax_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_rate").toString()));
      }
      if (jsonObj.get("zero_rate_flag") != null && !jsonObj.get("zero_rate_flag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zero_rate_flag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zero_rate_flag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceContentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceContentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceContentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceContentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceContentInfo>() {
           @Override
           public void write(JsonWriter out, InvoiceContentInfo value) throws IOException {
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
           public InvoiceContentInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoiceContentInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvoiceContentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceContentInfo
  * @throws IOException if the JSON string is invalid with respect to InvoiceContentInfo
  */
  public static InvoiceContentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceContentInfo.class);
  }

 /**
  * Convert an instance of InvoiceContentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

