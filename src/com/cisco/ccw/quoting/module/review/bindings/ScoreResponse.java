
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
    "dealId",
    "orderId",
    "orderLines",
    "orderType",
    "quoteNumber",
    "requestId",
    "soNumber",
    "status",
    "userType"
})
public class ScoreResponse {

    /**
     * 
     */
    @JsonProperty("applicationName")
    private String applicationName;
    /**
     * 
     */
    @JsonProperty("dealId")
    private Double dealId;
    /**
     * 
     */
    @JsonProperty("orderId")
    private Double orderId;
    /**
     * 
     */
    @JsonProperty("orderLines")
    private List<OrderLine_> orderLines = new ArrayList<OrderLine_>();
    /**
     * 
     */
    @JsonProperty("orderType")
    private String orderType;
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
    @JsonProperty("soNumber")
    private Double soNumber;
    /**
     * 
     */
    @JsonProperty("status")
    private Status_ status;
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
    public List<OrderLine_> getOrderLines() {
        return orderLines;
    }

    /**
     * 
     */
    @JsonProperty("orderLines")
    public void setOrderLines(List<OrderLine_> orderLines) {
        this.orderLines = orderLines;
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
    @JsonProperty("status")
    public Status_ getStatus() {
        return status;
    }

    /**
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status_ status) {
        this.status = status;
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
