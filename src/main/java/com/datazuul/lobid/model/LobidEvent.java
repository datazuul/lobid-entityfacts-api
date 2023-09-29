
package com.datazuul.lobid.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "relatedDdcWithDegreeOfDeterminacy2",
    "relatedDdcWithDegreeOfDeterminacy3",
    "type",
    "@context",
    "relatedPlaceOrGeographicName",
    "dateOfTermination",
    "gndSubjectCategory",
    "oldAuthorityNumber",
    "geographicAreaCode",
    "dateOfEstablishment",
    "describedBy",
    "broaderTermInstantial",
    "gndIdentifier",
    "id",
    "preferredName",
    "sameAs"
})
@Generated("jsonschema2pojo")
public class LobidEvent {

    @JsonProperty("relatedDdcWithDegreeOfDeterminacy2")
    private List<RelatedDdcWithDegreeOfDeterminacy2> relatedDdcWithDegreeOfDeterminacy2 = new ArrayList<RelatedDdcWithDegreeOfDeterminacy2>();
    @JsonProperty("relatedDdcWithDegreeOfDeterminacy3")
    private List<RelatedDdcWithDegreeOfDeterminacy3> relatedDdcWithDegreeOfDeterminacy3 = new ArrayList<RelatedDdcWithDegreeOfDeterminacy3>();
    @JsonProperty("type")
    private List<String> type = new ArrayList<String>();
    @JsonProperty("@context")
    private String context;
    @JsonProperty("relatedPlaceOrGeographicName")
    private List<RelatedPlaceOrGeographicName> relatedPlaceOrGeographicName = new ArrayList<RelatedPlaceOrGeographicName>();
    @JsonProperty("dateOfTermination")
    private List<String> dateOfTermination = new ArrayList<String>();
    @JsonProperty("gndSubjectCategory")
    private List<GndSubjectCategory> gndSubjectCategory = new ArrayList<GndSubjectCategory>();
    @JsonProperty("oldAuthorityNumber")
    private List<String> oldAuthorityNumber = new ArrayList<String>();
    @JsonProperty("geographicAreaCode")
    private List<GeographicAreaCode> geographicAreaCode = new ArrayList<GeographicAreaCode>();
    @JsonProperty("dateOfEstablishment")
    private List<String> dateOfEstablishment = new ArrayList<String>();
    @JsonProperty("describedBy")
    private DescribedBy describedBy;
    @JsonProperty("broaderTermInstantial")
    private List<BroaderTermInstantial> broaderTermInstantial = new ArrayList<BroaderTermInstantial>();
    @JsonProperty("gndIdentifier")
    private String gndIdentifier;
    @JsonProperty("id")
    private String id;
    @JsonProperty("preferredName")
    private String preferredName;
    @JsonProperty("sameAs")
    private List<SameAs> sameAs = new ArrayList<SameAs>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("relatedDdcWithDegreeOfDeterminacy2")
    public List<RelatedDdcWithDegreeOfDeterminacy2> getRelatedDdcWithDegreeOfDeterminacy2() {
        return relatedDdcWithDegreeOfDeterminacy2;
    }

    @JsonProperty("relatedDdcWithDegreeOfDeterminacy2")
    public void setRelatedDdcWithDegreeOfDeterminacy2(List<RelatedDdcWithDegreeOfDeterminacy2> relatedDdcWithDegreeOfDeterminacy2) {
        this.relatedDdcWithDegreeOfDeterminacy2 = relatedDdcWithDegreeOfDeterminacy2;
    }

    @JsonProperty("relatedDdcWithDegreeOfDeterminacy3")
    public List<RelatedDdcWithDegreeOfDeterminacy3> getRelatedDdcWithDegreeOfDeterminacy3() {
        return relatedDdcWithDegreeOfDeterminacy3;
    }

    @JsonProperty("relatedDdcWithDegreeOfDeterminacy3")
    public void setRelatedDdcWithDegreeOfDeterminacy3(List<RelatedDdcWithDegreeOfDeterminacy3> relatedDdcWithDegreeOfDeterminacy3) {
        this.relatedDdcWithDegreeOfDeterminacy3 = relatedDdcWithDegreeOfDeterminacy3;
    }

    @JsonProperty("type")
    public List<String> getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(List<String> type) {
        this.type = type;
    }

    @JsonProperty("@context")
    public String getContext() {
        return context;
    }

    @JsonProperty("@context")
    public void setContext(String context) {
        this.context = context;
    }

    @JsonProperty("relatedPlaceOrGeographicName")
    public List<RelatedPlaceOrGeographicName> getRelatedPlaceOrGeographicName() {
        return relatedPlaceOrGeographicName;
    }

    @JsonProperty("relatedPlaceOrGeographicName")
    public void setRelatedPlaceOrGeographicName(List<RelatedPlaceOrGeographicName> relatedPlaceOrGeographicName) {
        this.relatedPlaceOrGeographicName = relatedPlaceOrGeographicName;
    }

    @JsonProperty("dateOfTermination")
    public List<String> getDateOfTermination() {
        return dateOfTermination;
    }

    @JsonProperty("dateOfTermination")
    public void setDateOfTermination(List<String> dateOfTermination) {
        this.dateOfTermination = dateOfTermination;
    }

    @JsonProperty("gndSubjectCategory")
    public List<GndSubjectCategory> getGndSubjectCategory() {
        return gndSubjectCategory;
    }

    @JsonProperty("gndSubjectCategory")
    public void setGndSubjectCategory(List<GndSubjectCategory> gndSubjectCategory) {
        this.gndSubjectCategory = gndSubjectCategory;
    }

    @JsonProperty("oldAuthorityNumber")
    public List<String> getOldAuthorityNumber() {
        return oldAuthorityNumber;
    }

    @JsonProperty("oldAuthorityNumber")
    public void setOldAuthorityNumber(List<String> oldAuthorityNumber) {
        this.oldAuthorityNumber = oldAuthorityNumber;
    }

    @JsonProperty("geographicAreaCode")
    public List<GeographicAreaCode> getGeographicAreaCode() {
        return geographicAreaCode;
    }

    @JsonProperty("geographicAreaCode")
    public void setGeographicAreaCode(List<GeographicAreaCode> geographicAreaCode) {
        this.geographicAreaCode = geographicAreaCode;
    }

    @JsonProperty("dateOfEstablishment")
    public List<String> getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    @JsonProperty("dateOfEstablishment")
    public void setDateOfEstablishment(List<String> dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    @JsonProperty("describedBy")
    public DescribedBy getDescribedBy() {
        return describedBy;
    }

    @JsonProperty("describedBy")
    public void setDescribedBy(DescribedBy describedBy) {
        this.describedBy = describedBy;
    }

    @JsonProperty("broaderTermInstantial")
    public List<BroaderTermInstantial> getBroaderTermInstantial() {
        return broaderTermInstantial;
    }

    @JsonProperty("broaderTermInstantial")
    public void setBroaderTermInstantial(List<BroaderTermInstantial> broaderTermInstantial) {
        this.broaderTermInstantial = broaderTermInstantial;
    }

    @JsonProperty("gndIdentifier")
    public String getGndIdentifier() {
        return gndIdentifier;
    }

    @JsonProperty("gndIdentifier")
    public void setGndIdentifier(String gndIdentifier) {
        this.gndIdentifier = gndIdentifier;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("preferredName")
    public String getPreferredName() {
        return preferredName;
    }

    @JsonProperty("preferredName")
    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    @JsonProperty("sameAs")
    public List<SameAs> getSameAs() {
        return sameAs;
    }

    @JsonProperty("sameAs")
    public void setSameAs(List<SameAs> sameAs) {
        this.sameAs = sameAs;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LobidEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("relatedDdcWithDegreeOfDeterminacy2");
        sb.append('=');
        sb.append(((this.relatedDdcWithDegreeOfDeterminacy2 == null)?"<null>":this.relatedDdcWithDegreeOfDeterminacy2));
        sb.append(',');
        sb.append("relatedDdcWithDegreeOfDeterminacy3");
        sb.append('=');
        sb.append(((this.relatedDdcWithDegreeOfDeterminacy3 == null)?"<null>":this.relatedDdcWithDegreeOfDeterminacy3));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("relatedPlaceOrGeographicName");
        sb.append('=');
        sb.append(((this.relatedPlaceOrGeographicName == null)?"<null>":this.relatedPlaceOrGeographicName));
        sb.append(',');
        sb.append("dateOfTermination");
        sb.append('=');
        sb.append(((this.dateOfTermination == null)?"<null>":this.dateOfTermination));
        sb.append(',');
        sb.append("gndSubjectCategory");
        sb.append('=');
        sb.append(((this.gndSubjectCategory == null)?"<null>":this.gndSubjectCategory));
        sb.append(',');
        sb.append("oldAuthorityNumber");
        sb.append('=');
        sb.append(((this.oldAuthorityNumber == null)?"<null>":this.oldAuthorityNumber));
        sb.append(',');
        sb.append("geographicAreaCode");
        sb.append('=');
        sb.append(((this.geographicAreaCode == null)?"<null>":this.geographicAreaCode));
        sb.append(',');
        sb.append("dateOfEstablishment");
        sb.append('=');
        sb.append(((this.dateOfEstablishment == null)?"<null>":this.dateOfEstablishment));
        sb.append(',');
        sb.append("describedBy");
        sb.append('=');
        sb.append(((this.describedBy == null)?"<null>":this.describedBy));
        sb.append(',');
        sb.append("broaderTermInstantial");
        sb.append('=');
        sb.append(((this.broaderTermInstantial == null)?"<null>":this.broaderTermInstantial));
        sb.append(',');
        sb.append("gndIdentifier");
        sb.append('=');
        sb.append(((this.gndIdentifier == null)?"<null>":this.gndIdentifier));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("preferredName");
        sb.append('=');
        sb.append(((this.preferredName == null)?"<null>":this.preferredName));
        sb.append(',');
        sb.append("sameAs");
        sb.append('=');
        sb.append(((this.sameAs == null)?"<null>":this.sameAs));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.relatedDdcWithDegreeOfDeterminacy2 == null)? 0 :this.relatedDdcWithDegreeOfDeterminacy2 .hashCode()));
        result = ((result* 31)+((this.relatedDdcWithDegreeOfDeterminacy3 == null)? 0 :this.relatedDdcWithDegreeOfDeterminacy3 .hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.relatedPlaceOrGeographicName == null)? 0 :this.relatedPlaceOrGeographicName.hashCode()));
        result = ((result* 31)+((this.dateOfTermination == null)? 0 :this.dateOfTermination.hashCode()));
        result = ((result* 31)+((this.gndSubjectCategory == null)? 0 :this.gndSubjectCategory.hashCode()));
        result = ((result* 31)+((this.oldAuthorityNumber == null)? 0 :this.oldAuthorityNumber.hashCode()));
        result = ((result* 31)+((this.geographicAreaCode == null)? 0 :this.geographicAreaCode.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.dateOfEstablishment == null)? 0 :this.dateOfEstablishment.hashCode()));
        result = ((result* 31)+((this.describedBy == null)? 0 :this.describedBy.hashCode()));
        result = ((result* 31)+((this.broaderTermInstantial == null)? 0 :this.broaderTermInstantial.hashCode()));
        result = ((result* 31)+((this.gndIdentifier == null)? 0 :this.gndIdentifier.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.preferredName == null)? 0 :this.preferredName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sameAs == null)? 0 :this.sameAs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LobidEvent) == false) {
            return false;
        }
        LobidEvent rhs = ((LobidEvent) other);
        return ((((((((((((((((((this.relatedDdcWithDegreeOfDeterminacy2 == rhs.relatedDdcWithDegreeOfDeterminacy2)||((this.relatedDdcWithDegreeOfDeterminacy2 != null)&&this.relatedDdcWithDegreeOfDeterminacy2 .equals(rhs.relatedDdcWithDegreeOfDeterminacy2)))&&((this.relatedDdcWithDegreeOfDeterminacy3 == rhs.relatedDdcWithDegreeOfDeterminacy3)||((this.relatedDdcWithDegreeOfDeterminacy3 != null)&&this.relatedDdcWithDegreeOfDeterminacy3 .equals(rhs.relatedDdcWithDegreeOfDeterminacy3))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.relatedPlaceOrGeographicName == rhs.relatedPlaceOrGeographicName)||((this.relatedPlaceOrGeographicName!= null)&&this.relatedPlaceOrGeographicName.equals(rhs.relatedPlaceOrGeographicName))))&&((this.dateOfTermination == rhs.dateOfTermination)||((this.dateOfTermination!= null)&&this.dateOfTermination.equals(rhs.dateOfTermination))))&&((this.gndSubjectCategory == rhs.gndSubjectCategory)||((this.gndSubjectCategory!= null)&&this.gndSubjectCategory.equals(rhs.gndSubjectCategory))))&&((this.oldAuthorityNumber == rhs.oldAuthorityNumber)||((this.oldAuthorityNumber!= null)&&this.oldAuthorityNumber.equals(rhs.oldAuthorityNumber))))&&((this.geographicAreaCode == rhs.geographicAreaCode)||((this.geographicAreaCode!= null)&&this.geographicAreaCode.equals(rhs.geographicAreaCode))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.dateOfEstablishment == rhs.dateOfEstablishment)||((this.dateOfEstablishment!= null)&&this.dateOfEstablishment.equals(rhs.dateOfEstablishment))))&&((this.describedBy == rhs.describedBy)||((this.describedBy!= null)&&this.describedBy.equals(rhs.describedBy))))&&((this.broaderTermInstantial == rhs.broaderTermInstantial)||((this.broaderTermInstantial!= null)&&this.broaderTermInstantial.equals(rhs.broaderTermInstantial))))&&((this.gndIdentifier == rhs.gndIdentifier)||((this.gndIdentifier!= null)&&this.gndIdentifier.equals(rhs.gndIdentifier))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.preferredName == rhs.preferredName)||((this.preferredName!= null)&&this.preferredName.equals(rhs.preferredName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sameAs == rhs.sameAs)||((this.sameAs!= null)&&this.sameAs.equals(rhs.sameAs))));
    }

}
