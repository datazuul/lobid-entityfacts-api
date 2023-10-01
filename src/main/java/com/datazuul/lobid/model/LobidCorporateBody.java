package com.datazuul.lobid.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"type", "@context", "gndSubjectCategory", "oldAuthorityNumber", "geographicAreaCode", "deprecatedUri", "placeOfBusiness", "biographicalOrHistoricalInformation", "precedingCorporateBody", "dateOfEstablishment", "describedBy", "broaderTermInstantial", "gndIdentifier", "id", "preferredName", "spatialAreaOfActivity", "variantName", "abbreviatedNameForTheCorporateBody", "sameAs"})
@Generated("jsonschema2pojo")
public class LobidCorporateBody extends LobidEntity {

    @JsonProperty("abbreviatedNameForTheCorporateBody")
    private List<String> abbreviatedNameForTheCorporateBody = new ArrayList<String>();
    @JsonProperty("biographicalOrHistoricalInformation")
    private List<String> biographicalOrHistoricalInformation = new ArrayList<String>();
    @JsonProperty("broaderTermInstantial")
    private List<BroaderTermInstantial> broaderTermInstantial = new ArrayList<BroaderTermInstantial>();
    @JsonProperty("dateOfEstablishment")
    private List<String> dateOfEstablishment = new ArrayList<String>();
    @JsonProperty("depiction")
    private List<Depiction> depiction = new ArrayList<Depiction>();
    @JsonProperty("deprecatedUri")
    private List<String> deprecatedUri = new ArrayList<String>();
    @JsonProperty("describedBy")
    private DescribedBy describedBy;
    @JsonProperty("geographicAreaCode")
    private List<GeographicAreaCode> geographicAreaCode = new ArrayList<GeographicAreaCode>();
    @JsonProperty("homepage")
    private List<Homepage> homepage = new ArrayList<Homepage>();
    @JsonProperty("placeOfBusiness")
    private List<PlaceOfBusiness> placeOfBusiness = new ArrayList<PlaceOfBusiness>();
    @JsonProperty("precedingCorporateBody")
    private List<PrecedingCorporateBody> precedingCorporateBody = new ArrayList<PrecedingCorporateBody>();
    @JsonProperty("spatialAreaOfActivity")
    private List<SpatialAreaOfActivity> spatialAreaOfActivity = new ArrayList<SpatialAreaOfActivity>();
    @JsonProperty("variantName")
    private List<String> variantName = new ArrayList<String>();
    @JsonProperty("wikipedia")
    private List<Wikipedium> wikipedia = new ArrayList<Wikipedium>();
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LobidCorporateBody) == false) {
            return false;
        }
        LobidCorporateBody rhs = ((LobidCorporateBody) other);
        return (((((((((((((((((((((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))) && ((this.gndSubjectCategory == rhs.gndSubjectCategory) || ((this.gndSubjectCategory != null) && this.gndSubjectCategory.equals(rhs.gndSubjectCategory)))) && ((this.oldAuthorityNumber == rhs.oldAuthorityNumber) || ((this.oldAuthorityNumber != null) && this.oldAuthorityNumber.equals(rhs.oldAuthorityNumber)))) && ((this.geographicAreaCode == rhs.geographicAreaCode) || ((this.geographicAreaCode != null) && this.geographicAreaCode.equals(rhs.geographicAreaCode)))) && ((this.deprecatedUri == rhs.deprecatedUri) || ((this.deprecatedUri != null) && this.deprecatedUri.equals(rhs.deprecatedUri)))) && ((this.placeOfBusiness == rhs.placeOfBusiness) || ((this.placeOfBusiness != null) && this.placeOfBusiness.equals(rhs.placeOfBusiness)))) && ((this.biographicalOrHistoricalInformation == rhs.biographicalOrHistoricalInformation) || ((this.biographicalOrHistoricalInformation != null) && this.biographicalOrHistoricalInformation.equals(rhs.biographicalOrHistoricalInformation)))) && ((this.precedingCorporateBody == rhs.precedingCorporateBody) || ((this.precedingCorporateBody != null) && this.precedingCorporateBody.equals(rhs.precedingCorporateBody)))) && ((this.context == rhs.context) || ((this.context != null) && this.context.equals(rhs.context)))) && ((this.dateOfEstablishment == rhs.dateOfEstablishment) || ((this.dateOfEstablishment != null) && this.dateOfEstablishment.equals(rhs.dateOfEstablishment)))) && ((this.describedBy == rhs.describedBy) || ((this.describedBy != null) && this.describedBy.equals(rhs.describedBy)))) && ((this.broaderTermInstantial == rhs.broaderTermInstantial) || ((this.broaderTermInstantial != null) && this.broaderTermInstantial.equals(rhs.broaderTermInstantial)))) && ((this.gndIdentifier == rhs.gndIdentifier) || ((this.gndIdentifier != null) && this.gndIdentifier.equals(rhs.gndIdentifier)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.preferredName == rhs.preferredName) || ((this.preferredName != null) && this.preferredName.equals(rhs.preferredName)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.spatialAreaOfActivity == rhs.spatialAreaOfActivity) || ((this.spatialAreaOfActivity != null) && this.spatialAreaOfActivity.equals(rhs.spatialAreaOfActivity)))) && ((this.variantName == rhs.variantName) || ((this.variantName != null) && this.variantName.equals(rhs.variantName)))) && ((this.abbreviatedNameForTheCorporateBody == rhs.abbreviatedNameForTheCorporateBody) || ((this.abbreviatedNameForTheCorporateBody != null) && this.abbreviatedNameForTheCorporateBody.equals(rhs.abbreviatedNameForTheCorporateBody)))) && ((this.sameAs == rhs.sameAs) || ((this.sameAs != null) && this.sameAs.equals(rhs.sameAs))));
    }

    @JsonProperty("abbreviatedNameForTheCorporateBody")
    public List<String> getAbbreviatedNameForTheCorporateBody() {
        return abbreviatedNameForTheCorporateBody;
    }

    @JsonProperty("abbreviatedNameForTheCorporateBody")
    public void setAbbreviatedNameForTheCorporateBody(List<String> abbreviatedNameForTheCorporateBody) {
        this.abbreviatedNameForTheCorporateBody = abbreviatedNameForTheCorporateBody;
    }

    @JsonProperty("biographicalOrHistoricalInformation")
    public List<String> getBiographicalOrHistoricalInformation() {
        return biographicalOrHistoricalInformation;
    }

    @JsonProperty("biographicalOrHistoricalInformation")
    public void setBiographicalOrHistoricalInformation(List<String> biographicalOrHistoricalInformation) {
        this.biographicalOrHistoricalInformation = biographicalOrHistoricalInformation;
    }

    @JsonProperty("broaderTermInstantial")
    public List<BroaderTermInstantial> getBroaderTermInstantial() {
        return broaderTermInstantial;
    }

    @JsonProperty("broaderTermInstantial")
    public void setBroaderTermInstantial(List<BroaderTermInstantial> broaderTermInstantial) {
        this.broaderTermInstantial = broaderTermInstantial;
    }

    @JsonProperty("dateOfEstablishment")
    public List<String> getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    @JsonProperty("dateOfEstablishment")
    public void setDateOfEstablishment(List<String> dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }
    @JsonProperty("depiction")
    public List<Depiction> getDepiction() {
        return depiction;
    }

    @JsonProperty("depiction")
    public void setDepiction(List<Depiction> depiction) {
        this.depiction = depiction;
    }
    @JsonProperty("deprecatedUri")
    public List<String> getDeprecatedUri() {
        return deprecatedUri;
    }

    @JsonProperty("deprecatedUri")
    public void setDeprecatedUri(List<String> deprecatedUri) {
        this.deprecatedUri = deprecatedUri;
    }

    @JsonProperty("describedBy")
    public DescribedBy getDescribedBy() {
        return describedBy;
    }

    @JsonProperty("describedBy")
    public void setDescribedBy(DescribedBy describedBy) {
        this.describedBy = describedBy;
    }

    @JsonProperty("geographicAreaCode")
    public List<GeographicAreaCode> getGeographicAreaCode() {
        return geographicAreaCode;
    }

    @JsonProperty("geographicAreaCode")
    public void setGeographicAreaCode(List<GeographicAreaCode> geographicAreaCode) {
        this.geographicAreaCode = geographicAreaCode;
    }
    @JsonProperty("homepage")
    public List<Homepage> getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(List<Homepage> homepage) {
        this.homepage = homepage;
    }
    @JsonProperty("placeOfBusiness")
    public List<PlaceOfBusiness> getPlaceOfBusiness() {
        return placeOfBusiness;
    }

    @JsonProperty("placeOfBusiness")
    public void setPlaceOfBusiness(List<PlaceOfBusiness> placeOfBusiness) {
        this.placeOfBusiness = placeOfBusiness;
    }

    @JsonProperty("precedingCorporateBody")
    public List<PrecedingCorporateBody> getPrecedingCorporateBody() {
        return precedingCorporateBody;
    }

    @JsonProperty("precedingCorporateBody")
    public void setPrecedingCorporateBody(List<PrecedingCorporateBody> precedingCorporateBody) {
        this.precedingCorporateBody = precedingCorporateBody;
    }

    @JsonProperty("spatialAreaOfActivity")
    public List<SpatialAreaOfActivity> getSpatialAreaOfActivity() {
        return spatialAreaOfActivity;
    }

    @JsonProperty("spatialAreaOfActivity")
    public void setSpatialAreaOfActivity(List<SpatialAreaOfActivity> spatialAreaOfActivity) {
        this.spatialAreaOfActivity = spatialAreaOfActivity;
    }

    @JsonProperty("variantName")
    public List<String> getVariantName() {
        return variantName;
    }

    @JsonProperty("variantName")
    public void setVariantName(List<String> variantName) {
        this.variantName = variantName;
    }
    @JsonProperty("wikipedia")
    public List<Wikipedium> getWikipedia() {
        return wikipedia;
    }

    @JsonProperty("wikipedia")
    public void setWikipedia(List<Wikipedium> wikipedia) {
        this.wikipedia = wikipedia;
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.gndSubjectCategory == null) ? 0 : this.gndSubjectCategory.hashCode()));
        result = ((result * 31) + ((this.oldAuthorityNumber == null) ? 0 : this.oldAuthorityNumber.hashCode()));
        result = ((result * 31) + ((this.geographicAreaCode == null) ? 0 : this.geographicAreaCode.hashCode()));
        result = ((result * 31) + ((this.deprecatedUri == null) ? 0 : this.deprecatedUri.hashCode()));
        result = ((result * 31) + ((this.placeOfBusiness == null) ? 0 : this.placeOfBusiness.hashCode()));
        result = ((result * 31) + ((this.biographicalOrHistoricalInformation == null) ? 0 : this.biographicalOrHistoricalInformation.hashCode()));
        result = ((result * 31) + ((this.precedingCorporateBody == null) ? 0 : this.precedingCorporateBody.hashCode()));
        result = ((result * 31) + ((this.context == null) ? 0 : this.context.hashCode()));
        result = ((result * 31) + ((this.dateOfEstablishment == null) ? 0 : this.dateOfEstablishment.hashCode()));
        result = ((result * 31) + ((this.describedBy == null) ? 0 : this.describedBy.hashCode()));
        result = ((result * 31) + ((this.broaderTermInstantial == null) ? 0 : this.broaderTermInstantial.hashCode()));
        result = ((result * 31) + ((this.gndIdentifier == null) ? 0 : this.gndIdentifier.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.preferredName == null) ? 0 : this.preferredName.hashCode()));
        result = ((result * 31) + ((this.wikipedia == null) ? 0 : this.wikipedia.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.spatialAreaOfActivity == null) ? 0 : this.spatialAreaOfActivity.hashCode()));
        result = ((result * 31) + ((this.variantName == null) ? 0 : this.variantName.hashCode()));
        result = ((result * 31) + ((this.abbreviatedNameForTheCorporateBody == null) ? 0 : this.abbreviatedNameForTheCorporateBody.hashCode()));
        result = ((result * 31) + ((this.homepage == null) ? 0 : this.homepage.hashCode()));
        result = ((result * 31) + ((this.sameAs == null) ? 0 : this.sameAs.hashCode()));
        result = ((result * 31) + ((this.depiction == null) ? 0 : this.depiction.hashCode()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null) ? "<null>" : this.context));
        sb.append(',');
        sb.append("gndSubjectCategory");
        sb.append('=');
        sb.append(((this.gndSubjectCategory == null) ? "<null>" : this.gndSubjectCategory));
        sb.append(',');
        sb.append("oldAuthorityNumber");
        sb.append('=');
        sb.append(((this.oldAuthorityNumber == null) ? "<null>" : this.oldAuthorityNumber));
        sb.append(',');
        sb.append("geographicAreaCode");
        sb.append('=');
        sb.append(((this.geographicAreaCode == null) ? "<null>" : this.geographicAreaCode));
        sb.append(',');
        sb.append("deprecatedUri");
        sb.append('=');
        sb.append(((this.deprecatedUri == null) ? "<null>" : this.deprecatedUri));
        sb.append(',');
        sb.append("placeOfBusiness");
        sb.append('=');
        sb.append(((this.placeOfBusiness == null) ? "<null>" : this.placeOfBusiness));
        sb.append(',');
        sb.append("biographicalOrHistoricalInformation");
        sb.append('=');
        sb.append(((this.biographicalOrHistoricalInformation == null) ? "<null>" : this.biographicalOrHistoricalInformation));
        sb.append(',');
        sb.append("precedingCorporateBody");
        sb.append('=');
        sb.append(((this.precedingCorporateBody == null) ? "<null>" : this.precedingCorporateBody));
        sb.append(',');
        sb.append("dateOfEstablishment");
        sb.append('=');
        sb.append(((this.dateOfEstablishment == null) ? "<null>" : this.dateOfEstablishment));
        sb.append(',');
        sb.append("describedBy");
        sb.append('=');
        sb.append(((this.describedBy == null) ? "<null>" : this.describedBy));
        sb.append(',');
        sb.append("broaderTermInstantial");
        sb.append('=');
        sb.append(((this.broaderTermInstantial == null) ? "<null>" : this.broaderTermInstantial));
        sb.append(',');
        sb.append("gndIdentifier");
        sb.append('=');
        sb.append(((this.gndIdentifier == null) ? "<null>" : this.gndIdentifier));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("preferredName");
        sb.append('=');
        sb.append(((this.preferredName == null) ? "<null>" : this.preferredName));
        sb.append(',');
        sb.append("wikipedia");
        sb.append('=');
        sb.append(((this.wikipedia == null) ? "<null>" : this.wikipedia));
        sb.append(',');
        sb.append("spatialAreaOfActivity");
        sb.append('=');
        sb.append(((this.spatialAreaOfActivity == null) ? "<null>" : this.spatialAreaOfActivity));
        sb.append(',');
        sb.append("variantName");
        sb.append('=');
        sb.append(((this.variantName == null) ? "<null>" : this.variantName));
        sb.append(',');
        sb.append("abbreviatedNameForTheCorporateBody");
        sb.append('=');
        sb.append(((this.abbreviatedNameForTheCorporateBody == null) ? "<null>" : this.abbreviatedNameForTheCorporateBody));
        sb.append(',');
        sb.append("homepage");
        sb.append('=');
        sb.append(((this.homepage == null) ? "<null>" : this.homepage));
        sb.append(',');
        sb.append("sameAs");
        sb.append('=');
        sb.append(((this.sameAs == null) ? "<null>" : this.sameAs));
        sb.append(',');
        sb.append("depiction");
        sb.append('=');
        sb.append(((this.depiction == null) ? "<null>" : this.depiction));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
