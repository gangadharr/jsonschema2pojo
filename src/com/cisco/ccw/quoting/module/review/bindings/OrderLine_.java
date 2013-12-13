
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
    "contractNumber",
    "deliveryMethod",
    "lineID",
    "lineNumber",
    "lineType",
    "partNumber",
    "revSourceCode",
    "serviceLevel",
    "serviceProgName",
    "status"
})
public class OrderLine_ {

    /**
     * 
     */
    @JsonProperty("attachService")
    private String attachService;
    /**
     * 
     */
    @JsonProperty("contractNumber")
    private String contractNumber;
    /**
     * 
     */
    @JsonProperty("deliveryMethod")
    private String deliveryMethod;
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
    @JsonProperty("partNumber")
    private String partNumber;
    /**
     * 
     */
    @JsonProperty("revSourceCode")
    private String revSourceCode;
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
    @JsonProperty("status")
    private Status status;
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
    @JsonProperty("deliveryMethod")
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * 
     */
    @JsonProperty("deliveryMethod")
    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
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
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
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
