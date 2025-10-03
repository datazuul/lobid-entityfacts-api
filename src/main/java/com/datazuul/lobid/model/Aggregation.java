
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
    "gndSubjectCategory.id",
    "professionOrOccupation.id",
    "geographicAreaCode.id",
    "dateOfBirth",
    "type"
})
@Generated("jsonschema2pojo")
public class Aggregation {

    @JsonProperty("gndSubjectCategory.id")
    private List<GndSubjectCategoryId> gndSubjectCategoryId = new ArrayList<GndSubjectCategoryId>();
    @JsonProperty("professionOrOccupation.id")
    private List<ProfessionOrOccupationId> professionOrOccupationId = new ArrayList<ProfessionOrOccupationId>();
    @JsonProperty("geographicAreaCode.id")
    private List<GeographicAreaCodeId> geographicAreaCodeId = new ArrayList<GeographicAreaCodeId>();
    @JsonProperty("dateOfBirth")
    private List<DateOfBirth> dateOfBirth = new ArrayList<DateOfBirth>();
    @JsonProperty("type")
    private List<Type> type = new ArrayList<Type>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("gndSubjectCategory.id")
    public List<GndSubjectCategoryId> getGndSubjectCategoryId() {
        return gndSubjectCategoryId;
    }

    @JsonProperty("gndSubjectCategory.id")
    public void setGndSubjectCategoryId(List<GndSubjectCategoryId> gndSubjectCategoryId) {
        this.gndSubjectCategoryId = gndSubjectCategoryId;
    }

    @JsonProperty("professionOrOccupation.id")
    public List<ProfessionOrOccupationId> getProfessionOrOccupationId() {
        return professionOrOccupationId;
    }

    @JsonProperty("professionOrOccupation.id")
    public void setProfessionOrOccupationId(List<ProfessionOrOccupationId> professionOrOccupationId) {
        this.professionOrOccupationId = professionOrOccupationId;
    }

    @JsonProperty("geographicAreaCode.id")
    public List<GeographicAreaCodeId> getGeographicAreaCodeId() {
        return geographicAreaCodeId;
    }

    @JsonProperty("geographicAreaCode.id")
    public void setGeographicAreaCodeId(List<GeographicAreaCodeId> geographicAreaCodeId) {
        this.geographicAreaCodeId = geographicAreaCodeId;
    }

    @JsonProperty("dateOfBirth")
    public List<DateOfBirth> getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(List<DateOfBirth> dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("type")
    public List<Type> getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(List<Type> type) {
        this.type = type;
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
        sb.append(Aggregation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gndSubjectCategoryId");
        sb.append('=');
        sb.append(((this.gndSubjectCategoryId == null)?"<null>":this.gndSubjectCategoryId));
        sb.append(',');
        sb.append("professionOrOccupationId");
        sb.append('=');
        sb.append(((this.professionOrOccupationId == null)?"<null>":this.professionOrOccupationId));
        sb.append(',');
        sb.append("geographicAreaCodeId");
        sb.append('=');
        sb.append(((this.geographicAreaCodeId == null)?"<null>":this.geographicAreaCodeId));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.geographicAreaCodeId == null)? 0 :this.geographicAreaCodeId.hashCode()));
        result = ((result* 31)+((this.gndSubjectCategoryId == null)? 0 :this.gndSubjectCategoryId.hashCode()));
        result = ((result* 31)+((this.professionOrOccupationId == null)? 0 :this.professionOrOccupationId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Aggregation) == false) {
            return false;
        }
        Aggregation rhs = ((Aggregation) other);
        return (((((((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.geographicAreaCodeId == rhs.geographicAreaCodeId)||((this.geographicAreaCodeId!= null)&&this.geographicAreaCodeId.equals(rhs.geographicAreaCodeId))))&&((this.gndSubjectCategoryId == rhs.gndSubjectCategoryId)||((this.gndSubjectCategoryId!= null)&&this.gndSubjectCategoryId.equals(rhs.gndSubjectCategoryId))))&&((this.professionOrOccupationId == rhs.professionOrOccupationId)||((this.professionOrOccupationId!= null)&&this.professionOrOccupationId.equals(rhs.professionOrOccupationId))));
    }

}
