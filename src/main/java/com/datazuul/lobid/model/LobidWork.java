
package com.datazuul.lobid.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "broaderTermPartitive",
        "languageCode",
        "type",
        "@context",
        "gndSubjectCategory",
        "oldAuthorityNumber",
        "geographicAreaCode",
        "describedBy",
        "gndIdentifier",
        "id",
        "preferredName",
        "firstAuthor",
        "sameAs"
})
@Generated("jsonschema2pojo")
public class LobidWork extends LobidEntity {

    @JsonProperty("broaderTermPartitive")
    private List<BroaderTermPartitive> broaderTermPartitive = new ArrayList<BroaderTermPartitive>();
    @JsonProperty("describedBy")
    private DescribedBy describedBy;
    @JsonProperty("firstAuthor")
    private List<FirstAuthor> firstAuthor = new ArrayList<FirstAuthor>();
    @JsonProperty("geographicAreaCode")
    private List<GeographicAreaCode> geographicAreaCode = new ArrayList<GeographicAreaCode>();
    @JsonProperty("languageCode")
    private List<LanguageCode> languageCode = new ArrayList<LanguageCode>();

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LobidWork) == false) {
            return false;
        }
        LobidWork rhs = ((LobidWork) other);
        return (((((((((((((((this.broaderTermPartitive == rhs.broaderTermPartitive) || ((this.broaderTermPartitive != null) && this.broaderTermPartitive.equals(rhs.broaderTermPartitive))) && ((this.languageCode == rhs.languageCode) || ((this.languageCode != null) && this.languageCode.equals(rhs.languageCode)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.gndSubjectCategory == rhs.gndSubjectCategory) || ((this.gndSubjectCategory != null) && this.gndSubjectCategory.equals(rhs.gndSubjectCategory)))) && ((this.oldAuthorityNumber == rhs.oldAuthorityNumber) || ((this.oldAuthorityNumber != null) && this.oldAuthorityNumber.equals(rhs.oldAuthorityNumber)))) && ((this.geographicAreaCode == rhs.geographicAreaCode) || ((this.geographicAreaCode != null) && this.geographicAreaCode.equals(rhs.geographicAreaCode)))) && ((this.context == rhs.context) || ((this.context != null) && this.context.equals(rhs.context)))) && ((this.describedBy == rhs.describedBy) || ((this.describedBy != null) && this.describedBy.equals(rhs.describedBy)))) && ((this.gndIdentifier == rhs.gndIdentifier) || ((this.gndIdentifier != null) && this.gndIdentifier.equals(rhs.gndIdentifier)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.preferredName == rhs.preferredName) || ((this.preferredName != null) && this.preferredName.equals(rhs.preferredName)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.firstAuthor == rhs.firstAuthor) || ((this.firstAuthor != null) && this.firstAuthor.equals(rhs.firstAuthor)))) && ((this.sameAs == rhs.sameAs) || ((this.sameAs != null) && this.sameAs.equals(rhs.sameAs))));
    }

    @JsonProperty("broaderTermPartitive")
    public List<BroaderTermPartitive> getBroaderTermPartitive() {
        return broaderTermPartitive;
    }

    @JsonProperty("broaderTermPartitive")
    public void setBroaderTermPartitive(List<BroaderTermPartitive> broaderTermPartitive) {
        this.broaderTermPartitive = broaderTermPartitive;
    }

    @JsonProperty("describedBy")
    public DescribedBy getDescribedBy() {
        return describedBy;
    }

    @JsonProperty("describedBy")
    public void setDescribedBy(DescribedBy describedBy) {
        this.describedBy = describedBy;
    }

    @JsonProperty("firstAuthor")
    public List<FirstAuthor> getFirstAuthor() {
        return firstAuthor;
    }

    @JsonProperty("firstAuthor")
    public void setFirstAuthor(List<FirstAuthor> firstAuthor) {
        this.firstAuthor = firstAuthor;
    }

    @JsonProperty("geographicAreaCode")
    public List<GeographicAreaCode> getGeographicAreaCode() {
        return geographicAreaCode;
    }

    @JsonProperty("geographicAreaCode")
    public void setGeographicAreaCode(List<GeographicAreaCode> geographicAreaCode) {
        this.geographicAreaCode = geographicAreaCode;
    }

    @JsonProperty("languageCode")
    public List<LanguageCode> getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("languageCode")
    public void setLanguageCode(List<LanguageCode> languageCode) {
        this.languageCode = languageCode;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.broaderTermPartitive == null) ? 0 : this.broaderTermPartitive.hashCode()));
        result = ((result * 31) + ((this.languageCode == null) ? 0 : this.languageCode.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.gndSubjectCategory == null) ? 0 : this.gndSubjectCategory.hashCode()));
        result = ((result * 31) + ((this.oldAuthorityNumber == null) ? 0 : this.oldAuthorityNumber.hashCode()));
        result = ((result * 31) + ((this.geographicAreaCode == null) ? 0 : this.geographicAreaCode.hashCode()));
        result = ((result * 31) + ((this.context == null) ? 0 : this.context.hashCode()));
        result = ((result * 31) + ((this.describedBy == null) ? 0 : this.describedBy.hashCode()));
        result = ((result * 31) + ((this.gndIdentifier == null) ? 0 : this.gndIdentifier.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.preferredName == null) ? 0 : this.preferredName.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.firstAuthor == null) ? 0 : this.firstAuthor.hashCode()));
        result = ((result * 31) + ((this.sameAs == null) ? 0 : this.sameAs.hashCode()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LobidWork.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("broaderTermPartitive");
        sb.append('=');
        sb.append(((this.broaderTermPartitive == null) ? "<null>" : this.broaderTermPartitive));
        sb.append(',');
        sb.append("languageCode");
        sb.append('=');
        sb.append(((this.languageCode == null) ? "<null>" : this.languageCode));
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
        sb.append("preferredName");
        sb.append('=');
        sb.append(((this.preferredName == null) ? "<null>" : this.preferredName));
        sb.append(',');
        sb.append("firstAuthor");
        sb.append('=');
        sb.append(((this.firstAuthor == null) ? "<null>" : this.firstAuthor));
        sb.append(',');
        sb.append("sameAs");
        sb.append('=');
        sb.append(((this.sameAs == null) ? "<null>" : this.sameAs));
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
