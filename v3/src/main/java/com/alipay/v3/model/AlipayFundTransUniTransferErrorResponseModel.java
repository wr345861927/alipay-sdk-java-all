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
 * AlipayFundTransUniTransferErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundTransUniTransferErrorResponseModel {
  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    INVALID_PARAMETER("INVALID_PARAMETER"),
    
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    EXCEED_LIMIT_SM_AMOUNT("EXCEED_LIMIT_SM_AMOUNT"),
    
    EXCEED_LIMIT_MM_AMOUNT("EXCEED_LIMIT_MM_AMOUNT"),
    
    PAYCARD_UNABLE_PAYMENT("PAYCARD_UNABLE_PAYMENT"),
    
    PAYER_STATUS_ERROR("PAYER_STATUS_ERROR"),
    
    PAYER_CERTIFY_CHECK_FAIL("PAYER_CERTIFY_CHECK_FAIL"),
    
    PAYER_BALANCE_NOT_ENOUGH("PAYER_BALANCE_NOT_ENOUGH"),
    
    PAYER_USER_INFO_ERROR("PAYER_USER_INFO_ERROR"),
    
    PAYMENT_INFO_INCONSISTENCY("PAYMENT_INFO_INCONSISTENCY"),
    
    CARD_BIN_ERROR("CARD_BIN_ERROR"),
    
    PAYEE_CARD_INFO_ERROR("PAYEE_CARD_INFO_ERROR"),
    
    INST_PAY_UNABLE("INST_PAY_UNABLE"),
    
    MEMO_REQUIRED_IN_TRANSFER_ERROR("MEMO_REQUIRED_IN_TRANSFER_ERROR"),
    
    PERMIT_CHECK_PERM_IDENTITY_THEFT("PERMIT_CHECK_PERM_IDENTITY_THEFT"),
    
    REMARK_HAS_SENSITIVE_WORD("REMARK_HAS_SENSITIVE_WORD"),
    
    EXCEED_LIMIT_DM_AMOUNT("EXCEED_LIMIT_DM_AMOUNT"),
    
    NO_ACCOUNT_RECEIVE_PERMISSION("NO_ACCOUNT_RECEIVE_PERMISSION"),
    
    BALANCE_IS_NOT_ENOUGH("BALANCE_IS_NOT_ENOUGH"),
    
    NO_ACCOUNT_PAYMENT_PERMISSION("NO_ACCOUNT_PAYMENT_PERMISSION"),
    
    PAYER_NOT_EXIST("PAYER_NOT_EXIST"),
    
    PRODUCT_NOT_SIGN("PRODUCT_NOT_SIGN"),
    
    PAYMENT_TIME_EXPIRE("PAYMENT_TIME_EXPIRE"),
    
    PAYEE_NOT_EXIST("PAYEE_NOT_EXIST"),
    
    PAYEE_ACCOUNT_STATUS_ERROR("PAYEE_ACCOUNT_STATUS_ERROR"),
    
    PERMIT_NON_BANK_LIMIT_PAYEE("PERMIT_NON_BANK_LIMIT_PAYEE"),
    
    PAYEE_TRUSTEESHIP_ACC_OVER_LIMIT("PAYEE_TRUSTEESHIP_ACC_OVER_LIMIT"),
    
    NO_PERMISSION_ACCOUNT("NO_PERMISSION_ACCOUNT"),
    
    TRUSTEESHIP_ACCOUNT_NOT_EXIST("TRUSTEESHIP_ACCOUNT_NOT_EXIST"),
    
    PAYEE_ACCOUNT_NOT_EXSIT("PAYEE_ACCOUNT_NOT_EXSIT"),
    
    ORDER_NOT_EXIST("ORDER_NOT_EXIST"),
    
    PAYEE_USERINFO_STATUS_ERROR("PAYEE_USERINFO_STATUS_ERROR"),
    
    PAYMENT_MONEY_NOT_ENOUGH("PAYMENT_MONEY_NOT_ENOUGH"),
    
    TRUSTEESHIP_RECIEVE_QUOTA_LIMIT("TRUSTEESHIP_RECIEVE_QUOTA_LIMIT"),
    
    SECURITY_CHECK_FAILED("SECURITY_CHECK_FAILED"),
    
    NO_ORDER_PERMISSION("NO_ORDER_PERMISSION"),
    
    ORDER_STATUS_INVALID("ORDER_STATUS_INVALID"),
    
    PERM_AML_NOT_REALNAME_REV("PERM_AML_NOT_REALNAME_REV"),
    
    USER_AGREEMENT_VERIFY_FAIL("USER_AGREEMENT_VERIFY_FAIL"),
    
    PAYER_NOT_EQUAL_PAYEE_ERROR("PAYER_NOT_EQUAL_PAYEE_ERROR"),
    
    EXCEED_LIMIT_DC_RECEIVED("EXCEED_LIMIT_DC_RECEIVED"),
    
    PAYER_PERMLIMIT_CHECK_FAILURE("PAYER_PERMLIMIT_CHECK_FAILURE"),
    
    PAYEE_ACC_OCUPIED("PAYEE_ACC_OCUPIED"),
    
    PAYER_PAYEE_CANNOT_SAME("PAYER_PAYEE_CANNOT_SAME"),
    
    PERMIT_CHECK_PERM_LIMITED("PERMIT_CHECK_PERM_LIMITED"),
    
    RESOURCE_LIMIT_EXCEED("RESOURCE_LIMIT_EXCEED"),
    
    INVALID_PAYER_ACCOUNT("INVALID_PAYER_ACCOUNT"),
    
    EXCEED_LIMIT_DM_MAX_AMOUNT("EXCEED_LIMIT_DM_MAX_AMOUNT"),
    
    EXCEED_LIMIT_PERSONAL_SM_AMOUNT("EXCEED_LIMIT_PERSONAL_SM_AMOUNT"),
    
    EXCEED_LIMIT_UNRN_DM_AMOUNT("EXCEED_LIMIT_UNRN_DM_AMOUNT"),
    
    INVALID_CARDNO("INVALID_CARDNO"),
    
    RELEASE_USER_FORBBIDEN_RECIEVE("RELEASE_USER_FORBBIDEN_RECIEVE"),
    
    PAYEE_USER_TYPE_ERROR("PAYEE_USER_TYPE_ERROR"),
    
    EXCEED_LIMIT_SM_MIN_AMOUNT("EXCEED_LIMIT_SM_MIN_AMOUNT"),
    
    PERMIT_CHECK_RECEIVE_LIMIT("PERMIT_CHECK_RECEIVE_LIMIT"),
    
    NOT_IN_WHITE_LIST("NOT_IN_WHITE_LIST"),
    
    MONEY_PAY_CLOSED("MONEY_PAY_CLOSED"),
    
    NO_AVAILABLE_PAYMENT_TOOLS("NO_AVAILABLE_PAYMENT_TOOLS"),
    
    PAYEE_NOT_RELNAME_CERTIFY("PAYEE_NOT_RELNAME_CERTIFY"),
    
    OVERSEA_TRANSFER_CLOSE("OVERSEA_TRANSFER_CLOSE"),
    
    PAYMENT_FAIL("PAYMENT_FAIL"),
    
    ALREADY_WITHDRAW_STD_RED_PACKET("ALREADY_WITHDRAW_STD_RED_PACKET"),
    
    BLOCK_USER_FORBBIDEN_RECIEVE("BLOCK_USER_FORBBIDEN_RECIEVE"),
    
    REQUEST_PROCESSING("REQUEST_PROCESSING"),
    
    USER_NOT_EXIST("USER_NOT_EXIST"),
    
    PARAM_ILLEGAL("PARAM_ILLEGAL"),
    
    PROCESS_FAIL("PROCESS_FAIL"),
    
    CURRENCY_NOT_SUPPORT("CURRENCY_NOT_SUPPORT"),
    
    PAYER_REQUESTER_RELATION_INVALID("PAYER_REQUESTER_RELATION_INVALID"),
    
    AUTHOREE_IS_NOT_MATCH("AUTHOREE_IS_NOT_MATCH"),
    
    NO_ACCOUNT_USER_FORBBIDEN_RECIEVE("NO_ACCOUNT_USER_FORBBIDEN_RECIEVE"),
    
    SIGN_INVALID("SIGN_INVALID"),
    
    SIGN_INVOKE_PID_INCONSISTENT("SIGN_INVOKE_PID_INCONSISTENT"),
    
    SIGN_QUERY_APP_INFO_ERROR("SIGN_QUERY_APP_INFO_ERROR"),
    
    SIGN_QUERY_AGGREMENT_ERROR("SIGN_QUERY_AGGREMENT_ERROR"),
    
    SIGN_AGREEMENT_NO_INCONSISTENT("SIGN_AGREEMENT_NO_INCONSISTENT"),
    
    SIGN_PARAM_INVALID("SIGN_PARAM_INVALID"),
    
    SIGN_NOT_ALLOW_SKIP("SIGN_NOT_ALLOW_SKIP"),
    
    EXCEED_LIMIT_ENT_SM_AMOUNT("EXCEED_LIMIT_ENT_SM_AMOUNT"),
    
    ISV_AUTH_ERROR("ISV_AUTH_ERROR"),
    
    PAYER_USERINFO_NOT_EXSIT("PAYER_USERINFO_NOT_EXSIT"),
    
    BLOCK_USER_FORBBIDEN_SEND("BLOCK_USER_FORBBIDEN_SEND"),
    
    BANK_RESPONSE_ERROR("BANK_RESPONSE_ERROR"),
    
    BIZ_UNIQUE_EXCEPTION("BIZ_UNIQUE_EXCEPTION"),
    
    NO_ACCOUNTBOOK_PERMISSION("NO_ACCOUNTBOOK_PERMISSION"),
    
    PERMIT_CHECK_PERM_AML_CERT_EXPIRED("PERMIT_CHECK_PERM_AML_CERT_EXPIRED"),
    
    MRCHPROD_QUERY_ERROR("MRCHPROD_QUERY_ERROR"),
    
    PERMIT_PAYER_FORBIDDEN("PERMIT_PAYER_FORBIDDEN"),
    
    IDENTITY_FUND_RELATION_NOT_FOUND("IDENTITY_FUND_RELATION_NOT_FOUND"),
    
    INST_PAY_REMARK_UNVALID_CHARS("INST_PAY_REMARK_UNVALID_CHARS"),
    
    PERMIT_LIMIT_PAYEE("PERMIT_LIMIT_PAYEE"),
    
    INVALID_TAX_BILL_AGREEMENT("INVALID_TAX_BILL_AGREEMENT"),
    
    PAY_SALARY_MODE_NOT_SUPPORT("PAY_SALARY_MODE_NOT_SUPPORT"),
    
    CONTRACTOR_ACCOUNT_BOOK_NOT_FUND("CONTRACTOR_ACCOUNT_BOOK_NOT_FUND"),
    
    BANKCODE_OR_BRANCHNAME_INFO_ERROR("BANKCODE_OR_BRANCHNAME_INFO_ERROR"),
    
    PAYEE_OUT_PERMLIMIT_CHECK_FAILURE("PAYEE_OUT_PERMLIMIT_CHECK_FAILURE"),
    
    MID_ACCOUNT_STATUS_ERROR("MID_ACCOUNT_STATUS_ERROR"),
    
    MID_ACCOUNT_TYPE_ERROR("MID_ACCOUNT_TYPE_ERROR"),
    
    PAYEE_MID_CANNOT_SAME("PAYEE_MID_CANNOT_SAME"),
    
    PAYER_MID_CANNOT_SAME("PAYER_MID_CANNOT_SAME"),
    
    MID_ACCOUNT_CHECK_ERROR("MID_ACCOUNT_CHECK_ERROR"),
    
    PERM_PAY_USER_DAILY_QUOTA_ORG_BALANCE_LIMIT("PERM_PAY_USER_DAILY_QUOTA_ORG_BALANCE_LIMIT"),
    
    PERM_PAY_USER_MONTH_QUOTA_ORG_BALANCE_LIMIT("PERM_PAY_USER_MONTH_QUOTA_ORG_BALANCE_LIMIT"),
    
    PERM_PAY_CUSTOMER_DAILY_QUOTA_ORG_BALANCE_LIMIT("PERM_PAY_CUSTOMER_DAILY_QUOTA_ORG_BALANCE_LIMIT"),
    
    PERM_PAY_CUSTOMER_MONTH_QUOTA_ORG_BALANCE_LIMIT("PERM_PAY_CUSTOMER_MONTH_QUOTA_ORG_BALANCE_LIMIT"),
    
    NOT_SUPPORT_PAYER_ACCOUNT_TYPE("NOT_SUPPORT_PAYER_ACCOUNT_TYPE"),
    
    EXCEED_LIMIT_MM_MAX_AMOUNT("EXCEED_LIMIT_MM_MAX_AMOUNT"),
    
    REP_INCONSISTENT("REP_INCONSISTENT"),
    
    ILLEGAL_OPERATION("ILLEGAL_OPERATION"),
    
    PERM_RECEIVE_CUSTOMER_ALMS_LIMIT("PERM_RECEIVE_CUSTOMER_ALMS_LIMIT"),
    
    PAYEE_IDENTITY_NOT_MATCH("PAYEE_IDENTITY_NOT_MATCH"),
    
    FLEXIBLE_STAFFING_RISK_CONSULT_UNSIGNED_MERCHANT("FLEXIBLE_STAFFING_RISK_CONSULT_UNSIGNED_MERCHANT"),
    
    FLEXIBLE_STAFFING_RISK_CONSULT_UNAUTHORIZED_CONSULT("FLEXIBLE_STAFFING_RISK_CONSULT_UNAUTHORIZED_CONSULT"),
    
    FLEXIBLE_STAFFING_RISK_CONSULT_USER_NOT_EXIST("FLEXIBLE_STAFFING_RISK_CONSULT_USER_NOT_EXIST"),
    
    FLEXIBLE_STAFFING_RISK_CONSULT_RISK_RECEIVER("FLEXIBLE_STAFFING_RISK_CONSULT_RISK_RECEIVER"),
    
    PAYEE_USERINFO_ERROR("PAYEE_USERINFO_ERROR"),
    
    FLEXIBLE_STAFFING_HIGH_RISK_RECEIVER("FLEXIBLE_STAFFING_HIGH_RISK_RECEIVER"),
    
    FLEXIBLE_STAFFING_POTENTIAL_RISK_RECEIVER("FLEXIBLE_STAFFING_POTENTIAL_RISK_RECEIVER"),
    
    PAYER_ACCOUNT_BOOK_INFO_EXCEPTION("PAYER_ACCOUNT_BOOK_INFO_EXCEPTION"),
    
    RECEIVER_ACCOUNT_BOOK_INFO_EXCEPTION("RECEIVER_ACCOUNT_BOOK_INFO_EXCEPTION"),
    
    ACCOUNT_BOOK_SCENE_CODE_EXCEPTION("ACCOUNT_BOOK_SCENE_CODE_EXCEPTION"),
    
    TRUSTEESHIP_ACCOUNT_STATUS_ERROR("TRUSTEESHIP_ACCOUNT_STATUS_ERROR"),
    
    PAYER_NOT_EQUAL_PAYEE_FOR_BIZ_SCENE_REQUIRED("PAYER_NOT_EQUAL_PAYEE_FOR_BIZ_SCENE_REQUIRED"),
    
    PERMIT_PAYER_LEVEL_FORBIDDEN("PERMIT_PAYER_LEVEL_FORBIDDEN"),
    
    FLEXIBLE_STAFFING_UN_KNOWN_RISK_RECEIVER("FLEXIBLE_STAFFING_UN_KNOWN_RISK_RECEIVER"),
    
    JUDICIAL_FREEZE("JUDICIAL_FREEZE"),
    
    TRANS_AMOUNT_NOT_IN_PRIZE_LIMIT("TRANS_AMOUNT_NOT_IN_PRIZE_LIMIT"),
    
    PROMO_CAMP_RELATION_CONFIG_MISSED("PROMO_CAMP_RELATION_CONFIG_MISSED"),
    
    PAYEE_RECEIVE_COUNT_EXCEED_LIMIT("PAYEE_RECEIVE_COUNT_EXCEED_LIMIT"),
    
    PROMO_TRANS_ORDER_DEALING("PROMO_TRANS_ORDER_DEALING"),
    
    FUND_PROTITOPN_NOT_MATCH("FUND_PROTITOPN_NOT_MATCH"),
    
    FUND_WALLET_INST_NOT_EXIST("FUND_WALLET_INST_NOT_EXIST"),
    
    FUND_WALLET_UNAVAILABLE("FUND_WALLET_UNAVAILABLE"),
    
    PARTITION_FORMAT_ERROR("PARTITION_FORMAT_ERROR"),
    
    CURREBT_AFTER_INVALID_TIME("CURREBT_AFTER_INVALID_TIME"),
    
    UNAUTHORIZED_CONSULT("UNAUTHORIZED_CONSULT"),
    
    TAX_BILL_AGREEMENT_MISS("TAX_BILL_AGREEMENT_MISS"),
    
    FORBID_OPERATION_USER_WALLET("FORBID_OPERATION_USER_WALLET"),
    
    USER_RISK_FREEZE("USER_RISK_FREEZE"),
    
    BALANCE_NOT_ENOUGH_FOR_CARD_FEE("BALANCE_NOT_ENOUGH_FOR_CARD_FEE"),
    
    TRANS_ORDER_DEALING("TRANS_ORDER_DEALING"),
    
    PAYEE_USER_IS_INST("PAYEE_USER_IS_INST"),
    
    PAYER_NOT_RELNAME_CERTIFY("PAYER_NOT_RELNAME_CERTIFY"),
    
    BALANCE_NOT_ENOUGH("BALANCE_NOT_ENOUGH"),
    
    EMPLOYEE_SERVICE_NOT_EXIST("EMPLOYEE_SERVICE_NOT_EXIST"),
    
    UN_SUPPORT_EMPLOYEE_SERVICE("UN_SUPPORT_EMPLOYEE_SERVICE"),
    
    PERM_AML_NOT_REALNAME_PAY("PERM_AML_NOT_REALNAME_PAY"),
    
    CONFIGURATION_ERROR("CONFIGURATION_ERROR"),
    
    ILLEGAL_REQUEST_USER_ID("ILLEGAL_REQUEST_USER_ID"),
    
    PARAMETER_ERROR("PARAMETER_ERROR"),
    
    PERMIT_CHECK_PERM_AML_CERT_MISS_ACC_LIMIT("PERMIT_CHECK_PERM_AML_CERT_MISS_ACC_LIMIT"),
    
    RECEIVER_USER_RISK_FREEZE("RECEIVER_USER_RISK_FREEZE");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private String links;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public AlipayFundTransUniTransferErrorResponseModel() { 
  }

  public AlipayFundTransUniTransferErrorResponseModel code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * 错误码
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误码")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public AlipayFundTransUniTransferErrorResponseModel links(String links) {
    
    this.links = links;
    return this;
  }

   /**
   * 解决方案链接
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "解决方案链接")

  public String getLinks() {
    return links;
  }


  public void setLinks(String links) {
    this.links = links;
  }


  public AlipayFundTransUniTransferErrorResponseModel message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 错误描述
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误描述")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundTransUniTransferErrorResponseModel alipayFundTransUniTransferErrorResponseModel = (AlipayFundTransUniTransferErrorResponseModel) o;
    return Objects.equals(this.code, alipayFundTransUniTransferErrorResponseModel.code) &&
        Objects.equals(this.links, alipayFundTransUniTransferErrorResponseModel.links) &&
        Objects.equals(this.message, alipayFundTransUniTransferErrorResponseModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundTransUniTransferErrorResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("links");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundTransUniTransferErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundTransUniTransferErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundTransUniTransferErrorResponseModel is not found in the empty JSON string", AlipayFundTransUniTransferErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundTransUniTransferErrorResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundTransUniTransferErrorResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayFundTransUniTransferErrorResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be a primitive type in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundTransUniTransferErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundTransUniTransferErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundTransUniTransferErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundTransUniTransferErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundTransUniTransferErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundTransUniTransferErrorResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundTransUniTransferErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundTransUniTransferErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundTransUniTransferErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundTransUniTransferErrorResponseModel
  */
  public static AlipayFundTransUniTransferErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundTransUniTransferErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundTransUniTransferErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

