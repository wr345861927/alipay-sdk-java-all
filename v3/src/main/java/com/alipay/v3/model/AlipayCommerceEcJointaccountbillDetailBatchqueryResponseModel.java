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
import com.alipay.v3.model.JointAccountBillDetail;
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
 * AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_BILL_LIST = "bill_list";
  @SerializedName(SERIALIZED_NAME_BILL_LIST)
  private List<JointAccountBillDetail> billList = null;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_HAS_NEXT_PAGE = "has_next_page";
  @SerializedName(SERIALIZED_NAME_HAS_NEXT_PAGE)
  private Boolean hasNextPage;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private String pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel() { 
  }

  public AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel billList(List<JointAccountBillDetail> billList) {
    
    this.billList = billList;
    return this;
  }

  public AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel addBillListItem(JointAccountBillDetail billListItem) {
    if (this.billList == null) {
      this.billList = new ArrayList<>();
    }
    this.billList.add(billListItem);
    return this;
  }

   /**
   * 返回账单列表
   * @return billList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回账单列表")

  public List<JointAccountBillDetail> getBillList() {
    return billList;
  }


  public void setBillList(List<JointAccountBillDetail> billList) {
    this.billList = billList;
  }


  public AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 业务场景
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ISV_DEFAULT", value = "业务场景")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID，和接口入参一致
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123456789000", value = "企业ID，和接口入参一致")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel hasNextPage(Boolean hasNextPage) {
    
    this.hasNextPage = hasNextPage;
    return this;
  }

   /**
   * 是否有下一页
   * @return hasNextPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否有下一页")

  public Boolean getHasNextPage() {
    return hasNextPage;
  }


  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }


  public AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel pageNum(String pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当期页数
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当期页数")

  public String getPageNum() {
    return pageNum;
  }


  public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 当期页记录数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "当期页记录数")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel alipayCommerceEcJointaccountbillDetailBatchqueryResponseModel = (AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel) o;
    return Objects.equals(this.billList, alipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.billList) &&
        Objects.equals(this.bizScene, alipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.bizScene) &&
        Objects.equals(this.enterpriseId, alipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.enterpriseId) &&
        Objects.equals(this.hasNextPage, alipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.hasNextPage) &&
        Objects.equals(this.pageNum, alipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billList, bizScene, enterpriseId, hasNextPage, pageNum, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel {\n");
    sb.append("    billList: ").append(toIndentedString(billList)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("bill_list");
    openapiFields.add("biz_scene");
    openapiFields.add("enterprise_id");
    openapiFields.add("has_next_page");
    openapiFields.add("page_num");
    openapiFields.add("page_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel is not found in the empty JSON string", AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraybillList = jsonObj.getAsJsonArray("bill_list");
      if (jsonArraybillList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("bill_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `bill_list` to be an array in the JSON string but got `%s`", jsonObj.get("bill_list").toString()));
        }

        // validate the optional field `bill_list` (array)
        for (int i = 0; i < jsonArraybillList.size(); i++) {
          JointAccountBillDetail.validateJsonObject(jsonArraybillList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("page_num") != null && !jsonObj.get("page_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_num").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel
  */
  public static AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

