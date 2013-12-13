
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
    "country",
    "customerNumber",
    "orgId",
    "siteUseId",
    "state"
})
public class ResellerInfo {

    /**
     * 
     */
    @JsonProperty("country")
    private String country;
    /**
     * 
     */
    @JsonProperty("customerNumber")
    private Double customerNumber;
    /**
     * 
     */
    @JsonProperty("orgId")
    private Double orgId;
    /**
     * 
     */
    @JsonProperty("siteUseId")
    private Double siteUseId;
    /**
     * 
     */
    @JsonProperty("state")
    private String state;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     */
    @JsonProperty("customerNumber")
    public Double getCustomerNumber() {
        return customerNumber;
    }

    /**
     * 
     */
    @JsonProperty("customerNumber")
    public void setCustomerNumber(Double customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * 
     */
    @JsonProperty("orgId")
    public Double getOrgId() {
        return orgId;
    }

    /**
     * 
     */
    @JsonProperty("orgId")
    public void setOrgId(Double orgId) {
        this.orgId = orgId;
    }

    /**
     * 
     */
    @JsonProperty("siteUseId")
    public Double getSiteUseId() {
        return siteUseId;
    }

    /**
     * 
     */
    @JsonProperty("siteUseId")
    public void setSiteUseId(Double siteUseId) {
        this.siteUseId = siteUseId;
    }

    /**
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
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
