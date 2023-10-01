
package com.datazuul.lobid.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "associatedDate",
        "type",
        "@context",
        "gndSubjectCategory",
        "oldAuthorityNumber",
        "geographicAreaCode",
        "deprecatedUri",
        "biographicalOrHistoricalInformation",
        "describedBy",
        "gndIdentifier",
        "id",
        "placeOfActivity",
        "preferredName",
        "sameAs",
        "depiction"
})
@Generated("jsonschema2pojo")
public class LobidFamily extends LobidEntity {

    @JsonProperty("associatedDate")
    private List<String> associatedDate = new ArrayList<String>();
    @JsonProperty("biographicalOrHistoricalInformation")
    private List<String> biographicalOrHistoricalInformation = new ArrayList<String>();
    @JsonProperty("depiction")
    private List<Depiction> depiction = new ArrayList<Depiction>();
    @JsonProperty("deprecatedUri")
    private List<String> deprecatedUri = new ArrayList<String>();
    @JsonProperty("describedBy")
    private DescribedBy describedBy;
    @JsonProperty("geographicAreaCode")
    private List<GeographicAreaCode> geographicAreaCode = new ArrayList<GeographicAreaCode>();
    @JsonProperty("placeOfActivity")
    private List<PlaceOfActivity> placeOfActivity = new ArrayList<PlaceOfActivity>();

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LobidFamily) == false) {
            return false;
        }
        LobidFamily rhs = ((LobidFamily) other);
        return (((((((((((((((((this.associatedDate == rhs.associatedDate) || ((this.associatedDate != null) && this.associatedDate.equals(rhs.associatedDate))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.gndSubjectCategory == rhs.gndSubjectCategory) || ((this.gndSubjectCategory != null) && this.gndSubjectCategory.equals(rhs.gndSubjectCategory)))) && ((this.oldAuthorityNumber == rhs.oldAuthorityNumber) || ((this.oldAuthorityNumber != null) && this.oldAuthorityNumber.equals(rhs.oldAuthorityNumber)))) && ((this.geographicAreaCode == rhs.geographicAreaCode) || ((this.geographicAreaCode != null) && this.geographicAreaCode.equals(rhs.geographicAreaCode)))) && ((this.deprecatedUri == rhs.deprecatedUri) || ((this.deprecatedUri != null) && this.deprecatedUri.equals(rhs.deprecatedUri)))) && ((this.biographicalOrHistoricalInformation == rhs.biographicalOrHistoricalInformation) || ((this.biographicalOrHistoricalInformation != null) && this.biographicalOrHistoricalInformation.equals(rhs.biographicalOrHistoricalInformation)))) && ((this.context == rhs.context) || ((this.context != null) && this.context.equals(rhs.context)))) && ((this.describedBy == rhs.describedBy) || ((this.describedBy != null) && this.describedBy.equals(rhs.describedBy)))) && ((this.gndIdentifier == rhs.gndIdentifier) || ((this.gndIdentifier != null) && this.gndIdentifier.equals(rhs.gndIdentifier)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.placeOfActivity == rhs.placeOfActivity) || ((this.placeOfActivity != null) && this.placeOfActivity.equals(rhs.placeOfActivity)))) && ((this.preferredName == rhs.preferredName) || ((this.preferredName != null) && this.preferredName.equals(rhs.preferredName)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.sameAs == rhs.sameAs) || ((this.sameAs != null) && this.sameAs.equals(rhs.sameAs)))) && ((this.depiction == rhs.depiction) || ((this.depiction != null) && this.depiction.equals(rhs.depiction))));
    }

    @JsonProperty("associatedDate")
    public List<String> getAssociatedDate() {
        return associatedDate;
    }

    @JsonProperty("associatedDate")
    public void setAssociatedDate(List<String> associatedDate) {
        this.associatedDate = associatedDate;
    }

    @JsonProperty("biographicalOrHistoricalInformation")
    public List<String> getBiographicalOrHistoricalInformation() {
        return biographicalOrHistoricalInformation;
    }

    @JsonProperty("biographicalOrHistoricalInformation")
    public void setBiographicalOrHistoricalInformation(List<String> biographicalOrHistoricalInformation) {
        this.biographicalOrHistoricalInformation = biographicalOrHistoricalInformation;
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

    @JsonProperty("placeOfActivity")
    public List<PlaceOfActivity> getPlaceOfActivity() {
        return placeOfActivity;
    }

    @JsonProperty("placeOfActivity")
    public void setPlaceOfActivity(List<PlaceOfActivity> placeOfActivity) {
        this.placeOfActivity = placeOfActivity;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.associatedDate == null) ? 0 : this.associatedDate.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.gndSubjectCategory == null) ? 0 : this.gndSubjectCategory.hashCode()));
        result = ((result * 31) + ((this.oldAuthorityNumber == null) ? 0 : this.oldAuthorityNumber.hashCode()));
        result = ((result * 31) + ((this.geographicAreaCode == null) ? 0 : this.geographicAreaCode.hashCode()));
        result = ((result * 31) + ((this.deprecatedUri == null) ? 0 : this.deprecatedUri.hashCode()));
        result = ((result * 31) + ((this.biographicalOrHistoricalInformation == null) ? 0 : this.biographicalOrHistoricalInformation.hashCode()));
        result = ((result * 31) + ((this.context == null) ? 0 : this.context.hashCode()));
        result = ((result * 31) + ((this.describedBy == null) ? 0 : this.describedBy.hashCode()));
        result = ((result * 31) + ((this.gndIdentifier == null) ? 0 : this.gndIdentifier.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.placeOfActivity == null) ? 0 : this.placeOfActivity.hashCode()));
        result = ((result * 31) + ((this.preferredName == null) ? 0 : this.preferredName.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.sameAs == null) ? 0 : this.sameAs.hashCode()));
        result = ((result * 31) + ((this.depiction == null) ? 0 : this.depiction.hashCode()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LobidFamily.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("associatedDate");
        sb.append('=');
        sb.append(((this.associatedDate == null) ? "<null>" : this.associatedDate));
        sb.append(',');
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
        sb.append("biographicalOrHistoricalInformation");
        sb.append('=');
        sb.append(((this.biographicalOrHistoricalInformation == null) ? "<null>" : this.biographicalOrHistoricalInformation));
        sb.append(',');
        sb.append("describedBy");
        sb.append('=');
        sb.append(((this.describedBy == null) ? "<null>" : this.describedBy));
        sb.append(',');
        sb.append("gndIdentifier");
        sb.append('=');
        sb.append(((this.gndIdentifier == null) ? "<null>" : this.gndIdentifier));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("placeOfActivity");
        sb.append('=');
        sb.append(((this.placeOfActivity == null) ? "<null>" : this.placeOfActivity));
        sb.append(',');
        sb.append("preferredName");
        sb.append('=');
        sb.append(((this.preferredName == null) ? "<null>" : this.preferredName));
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
