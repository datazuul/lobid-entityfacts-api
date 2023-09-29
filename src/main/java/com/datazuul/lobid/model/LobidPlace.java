
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
    "type",
    "@context",
    "oldAuthorityNumber",
    "geographicAreaCode",
    "hasGeometry",
    "deprecatedUri",
    "biographicalOrHistoricalInformation",
    "relatedDdcWithDegreeOfDeterminacy4",
    "describedBy",
    "gndIdentifier",
    "id",
    "preferredName",
    "wikipedia",
    "variantName",
    "sameAs",
    "depiction"
})
@Generated("jsonschema2pojo")
public class LobidPlace {

    @JsonProperty("type")
    private List<String> type = new ArrayList<String>();
    @JsonProperty("@context")
    private String context;
    @JsonProperty("oldAuthorityNumber")
    private List<String> oldAuthorityNumber = new ArrayList<String>();
    @JsonProperty("geographicAreaCode")
    private List<GeographicAreaCode> geographicAreaCode = new ArrayList<GeographicAreaCode>();
    @JsonProperty("hasGeometry")
    private List<HasGeometry> hasGeometry = new ArrayList<HasGeometry>();
    @JsonProperty("deprecatedUri")
    private List<String> deprecatedUri = new ArrayList<String>();
    @JsonProperty("biographicalOrHistoricalInformation")
    private List<String> biographicalOrHistoricalInformation = new ArrayList<String>();
    @JsonProperty("relatedDdcWithDegreeOfDeterminacy4")
    private List<RelatedDdcWithDegreeOfDeterminacy4> relatedDdcWithDegreeOfDeterminacy4 = new ArrayList<RelatedDdcWithDegreeOfDeterminacy4>();
    @JsonProperty("describedBy")
    private DescribedBy describedBy;
    @JsonProperty("gndIdentifier")
    private String gndIdentifier;
    @JsonProperty("id")
    private String id;
    @JsonProperty("preferredName")
    private String preferredName;
    @JsonProperty("wikipedia")
    private List<Wikipedium> wikipedia = new ArrayList<Wikipedium>();
    @JsonProperty("variantName")
    private List<String> variantName = new ArrayList<String>();
    @JsonProperty("sameAs")
    private List<SameAs> sameAs = new ArrayList<SameAs>();
    @JsonProperty("depiction")
    private List<Depiction> depiction = new ArrayList<Depiction>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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

    @JsonProperty("hasGeometry")
    public List<HasGeometry> getHasGeometry() {
        return hasGeometry;
    }

    @JsonProperty("hasGeometry")
    public void setHasGeometry(List<HasGeometry> hasGeometry) {
        this.hasGeometry = hasGeometry;
    }

    @JsonProperty("deprecatedUri")
    public List<String> getDeprecatedUri() {
        return deprecatedUri;
    }

    @JsonProperty("deprecatedUri")
    public void setDeprecatedUri(List<String> deprecatedUri) {
        this.deprecatedUri = deprecatedUri;
    }

    @JsonProperty("biographicalOrHistoricalInformation")
    public List<String> getBiographicalOrHistoricalInformation() {
        return biographicalOrHistoricalInformation;
    }

    @JsonProperty("biographicalOrHistoricalInformation")
    public void setBiographicalOrHistoricalInformation(List<String> biographicalOrHistoricalInformation) {
        this.biographicalOrHistoricalInformation = biographicalOrHistoricalInformation;
    }

    @JsonProperty("relatedDdcWithDegreeOfDeterminacy4")
    public List<RelatedDdcWithDegreeOfDeterminacy4> getRelatedDdcWithDegreeOfDeterminacy4() {
        return relatedDdcWithDegreeOfDeterminacy4;
    }

    @JsonProperty("relatedDdcWithDegreeOfDeterminacy4")
    public void setRelatedDdcWithDegreeOfDeterminacy4(List<RelatedDdcWithDegreeOfDeterminacy4> relatedDdcWithDegreeOfDeterminacy4) {
        this.relatedDdcWithDegreeOfDeterminacy4 = relatedDdcWithDegreeOfDeterminacy4;
    }

    @JsonProperty("describedBy")
    public DescribedBy getDescribedBy() {
        return describedBy;
    }

    @JsonProperty("describedBy")
    public void setDescribedBy(DescribedBy describedBy) {
        this.describedBy = describedBy;
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

    @JsonProperty("wikipedia")
    public List<Wikipedium> getWikipedia() {
        return wikipedia;
    }

    @JsonProperty("wikipedia")
    public void setWikipedia(List<Wikipedium> wikipedia) {
        this.wikipedia = wikipedia;
    }

    @JsonProperty("variantName")
    public List<String> getVariantName() {
        return variantName;
    }

    @JsonProperty("variantName")
    public void setVariantName(List<String> variantName) {
        this.variantName = variantName;
    }

    @JsonProperty("sameAs")
    public List<SameAs> getSameAs() {
        return sameAs;
    }

    @JsonProperty("sameAs")
    public void setSameAs(List<SameAs> sameAs) {
        this.sameAs = sameAs;
    }

    @JsonProperty("depiction")
    public List<Depiction> getDepiction() {
        return depiction;
    }

    @JsonProperty("depiction")
    public void setDepiction(List<Depiction> depiction) {
        this.depiction = depiction;
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
        sb.append(LobidPlace.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("oldAuthorityNumber");
        sb.append('=');
        sb.append(((this.oldAuthorityNumber == null)?"<null>":this.oldAuthorityNumber));
        sb.append(',');
        sb.append("geographicAreaCode");
        sb.append('=');
        sb.append(((this.geographicAreaCode == null)?"<null>":this.geographicAreaCode));
        sb.append(',');
        sb.append("hasGeometry");
        sb.append('=');
        sb.append(((this.hasGeometry == null)?"<null>":this.hasGeometry));
        sb.append(',');
        sb.append("deprecatedUri");
        sb.append('=');
        sb.append(((this.deprecatedUri == null)?"<null>":this.deprecatedUri));
        sb.append(',');
        sb.append("biographicalOrHistoricalInformation");
        sb.append('=');
        sb.append(((this.biographicalOrHistoricalInformation == null)?"<null>":this.biographicalOrHistoricalInformation));
        sb.append(',');
        sb.append("relatedDdcWithDegreeOfDeterminacy4");
        sb.append('=');
        sb.append(((this.relatedDdcWithDegreeOfDeterminacy4 == null)?"<null>":this.relatedDdcWithDegreeOfDeterminacy4));
        sb.append(',');
        sb.append("describedBy");
        sb.append('=');
        sb.append(((this.describedBy == null)?"<null>":this.describedBy));
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
        sb.append("wikipedia");
        sb.append('=');
        sb.append(((this.wikipedia == null)?"<null>":this.wikipedia));
        sb.append(',');
        sb.append("variantName");
        sb.append('=');
        sb.append(((this.variantName == null)?"<null>":this.variantName));
        sb.append(',');
        sb.append("sameAs");
        sb.append('=');
        sb.append(((this.sameAs == null)?"<null>":this.sameAs));
        sb.append(',');
        sb.append("depiction");
        sb.append('=');
        sb.append(((this.depiction == null)?"<null>":this.depiction));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.oldAuthorityNumber == null)? 0 :this.oldAuthorityNumber.hashCode()));
        result = ((result* 31)+((this.geographicAreaCode == null)? 0 :this.geographicAreaCode.hashCode()));
        result = ((result* 31)+((this.hasGeometry == null)? 0 :this.hasGeometry.hashCode()));
        result = ((result* 31)+((this.deprecatedUri == null)? 0 :this.deprecatedUri.hashCode()));
        result = ((result* 31)+((this.biographicalOrHistoricalInformation == null)? 0 :this.biographicalOrHistoricalInformation.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.relatedDdcWithDegreeOfDeterminacy4 == null)? 0 :this.relatedDdcWithDegreeOfDeterminacy4 .hashCode()));
        result = ((result* 31)+((this.describedBy == null)? 0 :this.describedBy.hashCode()));
        result = ((result* 31)+((this.gndIdentifier == null)? 0 :this.gndIdentifier.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.preferredName == null)? 0 :this.preferredName.hashCode()));
        result = ((result* 31)+((this.wikipedia == null)? 0 :this.wikipedia.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.variantName == null)? 0 :this.variantName.hashCode()));
        result = ((result* 31)+((this.sameAs == null)? 0 :this.sameAs.hashCode()));
        result = ((result* 31)+((this.depiction == null)? 0 :this.depiction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LobidPlace) == false) {
            return false;
        }
        LobidPlace rhs = ((LobidPlace) other);
        return ((((((((((((((((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.oldAuthorityNumber == rhs.oldAuthorityNumber)||((this.oldAuthorityNumber!= null)&&this.oldAuthorityNumber.equals(rhs.oldAuthorityNumber))))&&((this.geographicAreaCode == rhs.geographicAreaCode)||((this.geographicAreaCode!= null)&&this.geographicAreaCode.equals(rhs.geographicAreaCode))))&&((this.hasGeometry == rhs.hasGeometry)||((this.hasGeometry!= null)&&this.hasGeometry.equals(rhs.hasGeometry))))&&((this.deprecatedUri == rhs.deprecatedUri)||((this.deprecatedUri!= null)&&this.deprecatedUri.equals(rhs.deprecatedUri))))&&((this.biographicalOrHistoricalInformation == rhs.biographicalOrHistoricalInformation)||((this.biographicalOrHistoricalInformation!= null)&&this.biographicalOrHistoricalInformation.equals(rhs.biographicalOrHistoricalInformation))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.relatedDdcWithDegreeOfDeterminacy4 == rhs.relatedDdcWithDegreeOfDeterminacy4)||((this.relatedDdcWithDegreeOfDeterminacy4 != null)&&this.relatedDdcWithDegreeOfDeterminacy4 .equals(rhs.relatedDdcWithDegreeOfDeterminacy4))))&&((this.describedBy == rhs.describedBy)||((this.describedBy!= null)&&this.describedBy.equals(rhs.describedBy))))&&((this.gndIdentifier == rhs.gndIdentifier)||((this.gndIdentifier!= null)&&this.gndIdentifier.equals(rhs.gndIdentifier))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.preferredName == rhs.preferredName)||((this.preferredName!= null)&&this.preferredName.equals(rhs.preferredName))))&&((this.wikipedia == rhs.wikipedia)||((this.wikipedia!= null)&&this.wikipedia.equals(rhs.wikipedia))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.variantName == rhs.variantName)||((this.variantName!= null)&&this.variantName.equals(rhs.variantName))))&&((this.sameAs == rhs.sameAs)||((this.sameAs!= null)&&this.sameAs.equals(rhs.sameAs))))&&((this.depiction == rhs.depiction)||((this.depiction!= null)&&this.depiction.equals(rhs.depiction))));
    }

}
