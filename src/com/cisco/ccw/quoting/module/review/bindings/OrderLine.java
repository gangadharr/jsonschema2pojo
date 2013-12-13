
package com.cisco.ccw.quoting.module.review.bindings;

import java.util.HashMap;
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
    "attachService",
    "billingInfo",
    "contractNumber",
    "endCustomerInfo",
    "federalGovt",
    "installSiteInfo",
    "lineID",
    "lineNumber",
    "lineType",
    "orderType",
    "partNumber",
    "refurbLine",
    "revSourceCode",
    "serviceItemInfo",
    "serviceLevel",
    "serviceProgName",
    "shippingInfo"
})
public class OrderLine {

    /**
     * 
     */
    @JsonProperty("attachService")
    private String attachService;
    /**
     * 
     */
    @JsonProperty("billingInfo")
    private BillingInfo_ billingInfo;
    /**
     * 
     */
    @JsonProperty("contractNumber")
    private String contractNumber;
    /**
     * 
     */
    @JsonProperty("endCustomerInfo")
    private EndCustomerInfo_ endCustomerInfo;
    /**
     * 
     */
    @JsonProperty("federalGovt")
    private String federalGovt;
    /**
     * 
     */
    @JsonProperty("installSiteInfo")
    private InstallSiteInfo_ installSiteInfo;
    /**
     * 
     */
    @JsonProperty("lineID")
    private Double lineID;
    /**
     * 
     */
    @JsonProperty("lineNumber")
    private String lineNumber;
    /**
     * 
     */
    @JsonProperty("lineType")
    private String lineType;
    /**
     * 
     */
    @JsonProperty("orderType")
    private String orderType;
    /**
     * 
     */
    @JsonProperty("partNumber")
    private String partNumber;
    /**
     * 
     */
    @JsonProperty("refurbLine")
    private String refurbLine;
    /**
     * 
     */
    @JsonProperty("revSourceCode")
    private String revSourceCode;
    /**
     * 
     */
    @JsonProperty("serviceItemInfo")
    private String serviceItemInfo;
    /**
     * 
     */
    @JsonProperty("serviceLevel")
    private String serviceLevel;
    /**
     * 
     */
    @JsonProperty("serviceProgName")
    private String serviceProgName;
    /**
     * 
     */
    @JsonProperty("shippingInfo")
    private ShippingInfo shippingInfo;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("attachService")
    public String getAttachService() {
        return attachService;
    }

    /**
     * 
     */
    @JsonProperty("attachService")
    public void setAttachService(String attachService) {
        this.attachService = attachService;
    }

    /**
     * 
     */
    @JsonProperty("billingInfo")
    public BillingInfo_ getBillingInfo() {
        return billingInfo;
    }

    /**
     * 
     */
    @JsonProperty("billingInfo")
    public void setBillingInfo(BillingInfo_ billingInfo) {
        this.billingInfo = billingInfo;
    }

    /**
     * 
     */
    @JsonProperty("contractNumber")
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * 
     */
    @JsonProperty("contractNumber")
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    /**
     * 
     */
    @JsonProperty("endCustomerInfo")
    public EndCustomerInfo_ getEndCustomerInfo() {
        return endCustomerInfo;
    }

    /**
     * 
     */
    @JsonProperty("endCustomerInfo")
    public void setEndCustomerInfo(EndCustomerInfo_ endCustomerInfo) {
        this.endCustomerInfo = endCustomerInfo;
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
    public InstallSiteInfo_ getInstallSiteInfo() {
        return installSiteInfo;
    }

    /**
     * 
     */
    @JsonProperty("installSiteInfo")
    public void setInstallSiteInfo(InstallSiteInfo_ installSiteInfo) {
        this.installSiteInfo = installSiteInfo;
    }

    /**
     * 
     */
    @JsonProperty("lineID")
    public Double getLineID() {
        return lineID;
    }

    /**
     * 
     */
    @JsonProperty("lineID")
    public void setLineID(Double lineID) {
        this.lineID = lineID;
    }

    /**
     * 
     */
    @JsonProperty("lineNumber")
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * 
     */
    @JsonProperty("lineNumber")
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * 
     */
    @JsonProperty("lineType")
    public String getLineType() {
        return lineType;
    }

    /**
     * 
     */
    @JsonProperty("lineType")
    public void setLineType(String lineType) {
        this.lineType = lineType;
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
    @JsonProperty("partNumber")
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * 
     */
    @JsonProperty("partNumber")
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * 
     */
    @JsonProperty("refurbLine")
    public String getRefurbLine() {
        return refurbLine;
    }

    /**
     * 
     */
    @JsonProperty("refurbLine")
    public void setRefurbLine(String refurbLine) {
        this.refurbLine = refurbLine;
    }

    /**
     * 
     */
    @JsonProperty("revSourceCode")
    public String getRevSourceCode() {
        return revSourceCode;
    }

    /**
     * 
     */
    @JsonProperty("revSourceCode")
    public void setRevSourceCode(String revSourceCode) {
        this.revSourceCode = revSourceCode;
    }

    /**
     * 
     */
    @JsonProperty("serviceItemInfo")
    public String getServiceItemInfo() {
        return serviceItemInfo;
    }

    /**
     * 
     */
    @JsonProperty("serviceItemInfo")
    public void setServiceItemInfo(String serviceItemInfo) {
        this.serviceItemInfo = serviceItemInfo;
    }

    /**
     * 
     */
    @JsonProperty("serviceLevel")
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * 
     */
    @JsonProperty("serviceLevel")
    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    /**
     * 
     */
    @JsonProperty("serviceProgName")
    public String getServiceProgName() {
        return serviceProgName;
    }

    /**
     * 
     */
    @JsonProperty("serviceProgName")
    public void setServiceProgName(String serviceProgName) {
        this.serviceProgName = serviceProgName;
    }

    /**
     * 
     */
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    /**
     * 
     */
    @JsonProperty("shippingInfo")
    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
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
