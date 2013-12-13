
package com.cisco.ccw.quoting.module.review.bindings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "applicationName",
    "billingInfo",
    "creditCheckComplete",
    "creditCheckDate",
    "dealId",
    "debug",
    "endCustomerInfo",
    "executeRules",
    "federalGovt",
    "installSiteInfo",
    "intendedUse",
    "operation",
    "orderId",
    "orderLines",
    "orderTotal",
    "orderType",
    "priceListInfo",
    "quoteNumber",
    "requestId",
    "resellerInfo",
    "shippingInfo",
    "soNumber",
    "userType"
})
public class ScoreRequest {

    /**
     * 
     */
    @JsonProperty("applicationName")
    private String applicationName;
    /**
     * 
     */
    @JsonProperty("billingInfo")
    private BillingInfo billingInfo;
    /**
     * 
     */
    @JsonProperty("creditCheckComplete")
    private String creditCheckComplete;
    /**
     * 
     */
    @JsonProperty("creditCheckDate")
    private String creditCheckDate;
    /**
     * 
     */
    @JsonProperty("dealId")
    private Double dealId;
    /**
     * 
     */
    @JsonProperty("debug")
    private String debug;
    /**
     * 
     */
    @JsonProperty("endCustomerInfo")
    private EndCustomerInfo endCustomerInfo;
    /**
     * 
     */
    @JsonProperty("executeRules")
    private String executeRules;
    /**
     * 
     */
    @JsonProperty("federalGovt")
    private String federalGovt;
    /**
     * 
     */
    @JsonProperty("installSiteInfo")
    private InstallSiteInfo installSiteInfo;
    /**
     * 
     */
    @JsonProperty("intendedUse")
    private String intendedUse;
    /**
     * 
     */
    @JsonProperty("operation")
    private String operation;
    /**
     * 
     */
    @JsonProperty("orderId")
    private Double orderId;
    /**
     * 
     */
    @JsonProperty("orderLines")
    private List<OrderLine> orderLines = new ArrayList<OrderLine>();
    /**
     * 
     */
    @JsonProperty("orderTotal")
    private Double orderTotal;
    /**
     * 
     */
    @JsonProperty("orderType")
    private String orderType;
    /**
     * 
     */
    @JsonProperty("priceListInfo")
    private PriceListInfo priceListInfo;
    /**
     * 
     */
    @JsonProperty("quoteNumber")
    private String quoteNumber;
    /**
     * 
     */
    @JsonProperty("requestId")
    private Double requestId;
    /**
     * 
     */
    @JsonProperty("resellerInfo")
    private ResellerInfo resellerInfo;
    /**
     * 
     */
    @JsonProperty("shippingInfo")
    private ShippingInfo_ shippingInfo;
    /**
     * 
     */
    @JsonProperty("soNumber")
    private Double soNumber;
    /**
     * 
     */
    @JsonProperty("userType")
    private String userType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("applicationName")
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * 
     */
    @JsonProperty("applicationName")
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * 
     */
    @JsonProperty("billingInfo")
    public BillingInfo getBillingInfo() {
        return billingInfo;
    }

    /**
     * 
     */
    @JsonProperty("billingInfo")
    public void setBillingInfo(BillingInfo billingInfo) {
        this.billingInfo = billingInfo;
    }

    /**
     * 
     */
    @JsonProperty("creditCheckComplete")
    public String getCreditCheckComplete() {
        return creditCheckComplete;
    }

    /**
     * 
     */
    @JsonProperty("creditCheckComplete")
    public void setCreditCheckComplete(String creditCheckComplete) {
        this.creditCheckComplete = creditCheckComplete;
    }

    /**
     * 
     */
    @JsonProperty("creditCheckDate")
    public String getCreditCheckDate() {
        return creditCheckDate;
    }

    /**
     * 
     */
    @JsonProperty("creditCheckDate")
    public void setCreditCheckDate(String creditCheckDate) {
        this.creditCheckDate = creditCheckDate;
    }

    /**
     * 
     */
    @JsonProperty("dealId")
    public Double getDealId() {
        return dealId;
    }

    /**
     * 
     */
    @JsonProperty("dealId")
    public void setDealId(Double dealId) {
        this.dealId = dealId;
    }

    /**
     * 
     */
    @JsonProperty("debug")
    public String getDebug() {
        return debug;
    }

    /**
     * 
     */
    @JsonProperty("debug")
    public void setDebug(String debug) {
        this.debug = debug;
    }

    /**
     * 
     */
    @JsonProperty("endCustomerInfo")
    public EndCustomerInfo getEndCustomerInfo() {
        return endCustomerInfo;
    }

    /**
     * 
     */
    @JsonProperty("endCustomerInfo")
    public void setEndCustomerInfo(EndCustomerInfo endCustomerInfo) {
        this.endCustomerInfo = endCustomerInfo;
    }

    /**
     * 
     */
    @JsonProperty("executeRules")
    public String getExecuteRules() {
        return executeRules;
    }

    /**
     * 
     */
    @JsonProperty("executeRules")
    public void setExecuteRules(String executeRules) {
        this.executeRules = executeRules;
    }

    /**
     * 
     */
    @JsonProperty("federalGovt")
    public String getFederalGovt() {
        return federalGovt;
    }

    /**
     * 
     */
    @JsonProperty("federalGovt")
    public void setFederalGovt(String federalGovt) {
        this.federalGovt = federalGovt;
    }

    /**
     * 
     */
    @JsonProperty("installSiteInfo")
    public InstallSiteInfo getInstallSiteInfo() {
        return installSiteInfo;
    }

    /**
     * 
     */
    @JsonProperty("installSiteInfo")
    public void setInstallSiteInfo(InstallSiteInfo installSiteInfo) {
        this.installSiteInfo = installSiteInfo;
    }

    /**
     * 
     */
    @JsonProperty("intendedUse")
    public String getIntendedUse() {
        return intendedUse;
    }

    /**
     * 
     */
    @JsonProperty("intendedUse")
    public void setIntendedUse(String intendedUse) {
        this.intendedUse = intendedUse;
    }

    /**
     * 
     */
    @JsonProperty("operation")
    public String getOperation() {
        return operation;
    }

    /**
     * 
     */
    @JsonProperty("operation")
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * 
     */
    @JsonProperty("orderId")
    public Double getOrderId() {
        return orderId;
    }

    /**
     * 
     */
    @JsonProperty("orderId")
    public void setOrderId(Double orderId) {
        this.orderId = orderId;
    }

    /**
     * 
     */
    @JsonProperty("orderLines")
    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    /**
     * 
     */
    @JsonProperty("orderLines")
    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    /**
     * 
     */
    @JsonProperty("orderTotal")
    public Double getOrderTotal() {
        return orderTotal;
    }

    /**
     * 
     */
    @JsonProperty("orderTotal")
    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    /**
     * 
     */
    @JsonProperty("orderType")
    public String getOrderType() {
        return orderType;
    }

    /**
     * 
     */
    @JsonProperty("orderType")
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * 
     */
    @JsonProperty("priceListInfo")
    public PriceListInfo getPriceListInfo() {
        return priceListInfo;
    }

    /**
     * 
     */
    @JsonProperty("priceListInfo")
    public void setPriceListInfo(PriceListInfo priceListInfo) {
        this.priceListInfo = priceListInfo;
    }

    /**
     * 
     */
    @JsonProperty("quoteNumber")
    public String getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * 
     */
    @JsonProperty("quoteNumber")
    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    /**
     * 
     */
    @JsonProperty("requestId")
    public Double getRequestId() {
        return requestId;
    }

    /**
     * 
     */
    @JsonProperty("requestId")
    public void setRequestId(Double requestId) {
        this.requestId = requestId;
    }

    /**
     * 
     */
    @JsonProperty("resellerInfo")
    public ResellerInfo getResellerInfo() {
        return resellerInfo;
    }

    /**
     * 
     */
    @JsonProperty("resellerInfo")
    public void setResellerInfo(ResellerInfo resellerInfo) {
        this.resellerInfo = resellerInfo;
    }

    /**
     * 
     */
    @JsonProperty("shippingInfo")
    public ShippingInfo_ getShippingInfo() {
        return shippingInfo;
    }

    /**
     * 
     */
    @JsonProperty("shippingInfo")
    public void setShippingInfo(ShippingInfo_ shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    /**
     * 
     */
    @JsonProperty("soNumber")
    public Double getSoNumber() {
        return soNumber;
    }

    /**
     * 
     */
    @JsonProperty("soNumber")
    public void setSoNumber(Double soNumber) {
        this.soNumber = soNumber;
    }

    /**
     * 
     */
    @JsonProperty("userType")
    public String getUserType() {
        return userType;
    }

    /**
     * 
     */
    @JsonProperty("userType")
    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
