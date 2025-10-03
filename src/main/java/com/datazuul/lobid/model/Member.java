package com.datazuul.lobid.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "professionOrOccupation",
        "gender",
        "dateOfBirth",
        "type",
        "@context",
        "geographicAreaCode",
        "academicDegree",
        "publication",
        "describedBy",
        "gndIdentifier",
        "id",
        "preferredName",
        "preferredNameEntityForThePerson",
        "sameAs",
        "periodOfActivity",
        "affiliation",
        "placeOfBirth",
        "biographicalOrHistoricalInformation",
        "oldAuthorityNumber",
        "placeOfActivity",
        "fieldOfStudy"
})
@Generated("jsonschema2pojo")
public class Member {

    @JsonProperty("professionOrOccupation")
    private List<ProfessionOrOccupation> professionOrOccupation = new ArrayList<ProfessionOrOccupation>();
    @JsonProperty("gender")
    private List<Gender> gender = new ArrayList<Gender>();
    @JsonProperty("dateOfBirth")
    private List<String> dateOfBirth = new ArrayList<String>();
    @JsonProperty("type")
    private List<String> type = new ArrayList<String>();
    @JsonProperty("@context")
    private String context;
    @JsonProperty("geographicAreaCode")
    private List<GeographicAreaCode> geographicAreaCode = new ArrayList<GeographicAreaCode>();
    @JsonProperty("academicDegree")
    private List<String> academicDegree = new ArrayList<String>();
    @JsonProperty("publication")
    private List<String> publication = new ArrayList<String>();
    @JsonProperty("describedBy")
    private DescribedBy describedBy;
    @JsonProperty("gndIdentifier")
    private String gndIdentifier;
    @JsonProperty("id")
    private String id;
    @JsonProperty("preferredName")
    private String preferredName;
    @JsonProperty("preferredNameEntityForThePerson")
    private PreferredNameEntityForThePerson preferredNameEntityForThePerson;
    @JsonProperty("sameAs")
    private List<SameAs> sameAs = new ArrayList<SameAs>();
    @JsonProperty("periodOfActivity")
    private List<String> periodOfActivity = new ArrayList<String>();
    @JsonProperty("affiliation")
    private List<Affiliation> affiliation = new ArrayList<Affiliation>();
    @JsonProperty("placeOfBirth")
    private List<PlaceOfBirth> placeOfBirth = new ArrayList<PlaceOfBirth>();
    @JsonProperty("biographicalOrHistoricalInformation")
    private List<String> biographicalOrHistoricalInformation = new ArrayList<String>();
    @JsonProperty("oldAuthorityNumber")
    private List<String> oldAuthorityNumber = new ArrayList<String>();
    @JsonProperty("placeOfActivity")
    private List<PlaceOfActivity> placeOfActivity = new ArrayList<PlaceOfActivity>();
    @JsonProperty("fieldOfStudy")
    private List<FieldOfStudy> fieldOfStudy = new ArrayList<FieldOfStudy>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("professionOrOccupation")
    public List<ProfessionOrOccupation> getProfessionOrOccupation() {
        return professionOrOccupation;
    }

    @JsonProperty("professionOrOccupation")
    public void setProfessionOrOccupation(List<ProfessionOrOccupation> professionOrOccupation) {
        this.professionOrOccupation = professionOrOccupation;
    }

    @JsonProperty("gender")
    public List<Gender> getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(List<Gender> gender) {
        this.gender = gender;
    }

    @JsonProperty("dateOfBirth")
    public List<String> getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(List<String> dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    @JsonProperty("geographicAreaCode")
    public List<GeographicAreaCode> getGeographicAreaCode() {
        return geographicAreaCode;
    }

    @JsonProperty("geographicAreaCode")
    public void setGeographicAreaCode(List<GeographicAreaCode> geographicAreaCode) {
        this.geographicAreaCode = geographicAreaCode;
    }

    @JsonProperty("academicDegree")
    public List<String> getAcademicDegree() {
        return academicDegree;
    }

    @JsonProperty("academicDegree")
    public void setAcademicDegree(List<String> academicDegree) {
        this.academicDegree = academicDegree;
    }

    @JsonProperty("publication")
    public List<String> getPublication() {
        return publication;
    }

    @JsonProperty("publication")
    public void setPublication(List<String> publication) {
        this.publication = publication;
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

    @JsonProperty("preferredNameEntityForThePerson")
    public PreferredNameEntityForThePerson getPreferredNameEntityForThePerson() {
        return preferredNameEntityForThePerson;
    }

    @JsonProperty("preferredNameEntityForThePerson")
    public void setPreferredNameEntityForThePerson(PreferredNameEntityForThePerson preferredNameEntityForThePerson) {
        this.preferredNameEntityForThePerson = preferredNameEntityForThePerson;
    }

    @JsonProperty("sameAs")
    public List<SameAs> getSameAs() {
        return sameAs;
    }

    @JsonProperty("sameAs")
    public void setSameAs(List<SameAs> sameAs) {
        this.sameAs = sameAs;
    }

    @JsonProperty("periodOfActivity")
    public List<String> getPeriodOfActivity() {
        return periodOfActivity;
    }

    @JsonProperty("periodOfActivity")
    public void setPeriodOfActivity(List<String> periodOfActivity) {
        this.periodOfActivity = periodOfActivity;
    }

    @JsonProperty("affiliation")
    public List<Affiliation> getAffiliation() {
        return affiliation;
    }

    @JsonProperty("affiliation")
    public void setAffiliation(List<Affiliation> affiliation) {
        this.affiliation = affiliation;
    }

    @JsonProperty("placeOfBirth")
    public List<PlaceOfBirth> getPlaceOfBirth() {
        return placeOfBirth;
    }

    @JsonProperty("placeOfBirth")
    public void setPlaceOfBirth(List<PlaceOfBirth> placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @JsonProperty("biographicalOrHistoricalInformation")
    public List<String> getBiographicalOrHistoricalInformation() {
        return biographicalOrHistoricalInformation;
    }

    @JsonProperty("biographicalOrHistoricalInformation")
    public void setBiographicalOrHistoricalInformation(List<String> biographicalOrHistoricalInformation) {
        this.biographicalOrHistoricalInformation = biographicalOrHistoricalInformation;
    }

    @JsonProperty("oldAuthorityNumber")
    public List<String> getOldAuthorityNumber() {
        return oldAuthorityNumber;
    }

    @JsonProperty("oldAuthorityNumber")
    public void setOldAuthorityNumber(List<String> oldAuthorityNumber) {
        this.oldAuthorityNumber = oldAuthorityNumber;
    }

    @JsonProperty("placeOfActivity")
    public List<PlaceOfActivity> getPlaceOfActivity() {
        return placeOfActivity;
    }

    @JsonProperty("placeOfActivity")
    public void setPlaceOfActivity(List<PlaceOfActivity> placeOfActivity) {
        this.placeOfActivity = placeOfActivity;
    }

    @JsonProperty("fieldOfStudy")
    public List<FieldOfStudy> getFieldOfStudy() {
        return fieldOfStudy;
    }

    @JsonProperty("fieldOfStudy")
    public void setFieldOfStudy(List<FieldOfStudy> fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
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
        sb.append(Member.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("professionOrOccupation");
        sb.append('=');
        sb.append(((this.professionOrOccupation == null) ? "<null>" : this.professionOrOccupation));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null) ? "<null>" : this.gender));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null) ? "<null>" : this.dateOfBirth));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null) ? "<null>" : this.context));
        sb.append(',');
        sb.append("geographicAreaCode");
        sb.append('=');
        sb.append(((this.geographicAreaCode == null) ? "<null>" : this.geographicAreaCode));
        sb.append(',');
        sb.append("academicDegree");
        sb.append('=');
        sb.append(((this.academicDegree == null) ? "<null>" : this.academicDegree));
        sb.append(',');
        sb.append("publication");
        sb.append('=');
        sb.append(((this.publication == null) ? "<null>" : this.publication));
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
        sb.append("preferredNameEntityForThePerson");
        sb.append('=');
        sb.append(((this.preferredNameEntityForThePerson == null) ? "<null>" : this.preferredNameEntityForThePerson));
        sb.append(',');
        sb.append("sameAs");
        sb.append('=');
        sb.append(((this.sameAs == null) ? "<null>" : this.sameAs));
        sb.append(',');
        sb.append("periodOfActivity");
        sb.append('=');
        sb.append(((this.periodOfActivity == null) ? "<null>" : this.periodOfActivity));
        sb.append(',');
        sb.append("affiliation");
        sb.append('=');
        sb.append(((this.affiliation == null) ? "<null>" : this.affiliation));
        sb.append(',');
        sb.append("placeOfBirth");
        sb.append('=');
        sb.append(((this.placeOfBirth == null) ? "<null>" : this.placeOfBirth));
        sb.append(',');
        sb.append("biographicalOrHistoricalInformation");
        sb.append('=');
        sb.append(((this.biographicalOrHistoricalInformation == null) ? "<null>" : this.biographicalOrHistoricalInformation));
        sb.append(',');
        sb.append("oldAuthorityNumber");
        sb.append('=');
        sb.append(((this.oldAuthorityNumber == null) ? "<null>" : this.oldAuthorityNumber));
        sb.append(',');
        sb.append("placeOfActivity");
        sb.append('=');
        sb.append(((this.placeOfActivity == null) ? "<null>" : this.placeOfActivity));
        sb.append(',');
        sb.append("fieldOfStudy");
        sb.append('=');
        sb.append(((this.fieldOfStudy == null) ? "<null>" : this.fieldOfStudy));
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.professionOrOccupation == null) ? 0 : this.professionOrOccupation.hashCode()));
        result = ((result * 31) + ((this.placeOfBirth == null) ? 0 : this.placeOfBirth.hashCode()));
        result = ((result * 31) + ((this.gender == null) ? 0 : this.gender.hashCode()));
        result = ((result * 31) + ((this.dateOfBirth == null) ? 0 : this.dateOfBirth.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.oldAuthorityNumber == null) ? 0 : this.oldAuthorityNumber.hashCode()));
        result = ((result * 31) + ((this.geographicAreaCode == null) ? 0 : this.geographicAreaCode.hashCode()));
        result = ((result * 31) + ((this.periodOfActivity == null) ? 0 : this.periodOfActivity.hashCode()));
        result = ((result * 31) + ((this.biographicalOrHistoricalInformation == null) ? 0 : this.biographicalOrHistoricalInformation.hashCode()));
        result = ((result * 31) + ((this.affiliation == null) ? 0 : this.affiliation.hashCode()));
        result = ((result * 31) + ((this.academicDegree == null) ? 0 : this.academicDegree.hashCode()));
        result = ((result * 31) + ((this.publication == null) ? 0 : this.publication.hashCode()));
        result = ((result * 31) + ((this.context == null) ? 0 : this.context.hashCode()));
        result = ((result * 31) + ((this.describedBy == null) ? 0 : this.describedBy.hashCode()));
        result = ((result * 31) + ((this.gndIdentifier == null) ? 0 : this.gndIdentifier.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.preferredName == null) ? 0 : this.preferredName.hashCode()));
        result = ((result * 31) + ((this.placeOfActivity == null) ? 0 : this.placeOfActivity.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.fieldOfStudy == null) ? 0 : this.fieldOfStudy.hashCode()));
        result = ((result * 31) + ((this.preferredNameEntityForThePerson == null) ? 0 : this.preferredNameEntityForThePerson.hashCode()));
        result = ((result * 31) + ((this.sameAs == null) ? 0 : this.sameAs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Member) == false) {
            return false;
        }
        Member rhs = ((Member) other);
        return (((((((((((((((((((((((this.professionOrOccupation == rhs.professionOrOccupation) || ((this.professionOrOccupation != null) && this.professionOrOccupation.equals(rhs.professionOrOccupation))) && ((this.placeOfBirth == rhs.placeOfBirth) || ((this.placeOfBirth != null) && this.placeOfBirth.equals(rhs.placeOfBirth)))) && ((this.gender == rhs.gender) || ((this.gender != null) && this.gender.equals(rhs.gender)))) && ((this.dateOfBirth == rhs.dateOfBirth) || ((this.dateOfBirth != null) && this.dateOfBirth.equals(rhs.dateOfBirth)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.oldAuthorityNumber == rhs.oldAuthorityNumber) || ((this.oldAuthorityNumber != null) && this.oldAuthorityNumber.equals(rhs.oldAuthorityNumber)))) && ((this.geographicAreaCode == rhs.geographicAreaCode) || ((this.geographicAreaCode != null) && this.geographicAreaCode.equals(rhs.geographicAreaCode)))) && ((this.periodOfActivity == rhs.periodOfActivity) || ((this.periodOfActivity != null) && this.periodOfActivity.equals(rhs.periodOfActivity)))) && ((this.biographicalOrHistoricalInformation == rhs.biographicalOrHistoricalInformation) || ((this.biographicalOrHistoricalInformation != null) && this.biographicalOrHistoricalInformation.equals(rhs.biographicalOrHistoricalInformation)))) && ((this.affiliation == rhs.affiliation) || ((this.affiliation != null) && this.affiliation.equals(rhs.affiliation)))) && ((this.academicDegree == rhs.academicDegree) || ((this.academicDegree != null) && this.academicDegree.equals(rhs.academicDegree)))) && ((this.publication == rhs.publication) || ((this.publication != null) && this.publication.equals(rhs.publication)))) && ((this.context == rhs.context) || ((this.context != null) && this.context.equals(rhs.context)))) && ((this.describedBy == rhs.describedBy) || ((this.describedBy != null) && this.describedBy.equals(rhs.describedBy)))) && ((this.gndIdentifier == rhs.gndIdentifier) || ((this.gndIdentifier != null) && this.gndIdentifier.equals(rhs.gndIdentifier)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.preferredName == rhs.preferredName) || ((this.preferredName != null) && this.preferredName.equals(rhs.preferredName)))) && ((this.placeOfActivity == rhs.placeOfActivity) || ((this.placeOfActivity != null) && this.placeOfActivity.equals(rhs.placeOfActivity)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.fieldOfStudy == rhs.fieldOfStudy) || ((this.fieldOfStudy != null) && this.fieldOfStudy.equals(rhs.fieldOfStudy)))) && ((this.preferredNameEntityForThePerson == rhs.preferredNameEntityForThePerson) || ((this.preferredNameEntityForThePerson != null) && this.preferredNameEntityForThePerson.equals(rhs.preferredNameEntityForThePerson)))) && ((this.sameAs == rhs.sameAs) || ((this.sameAs != null) && this.sameAs.equals(rhs.sameAs))));
    }

}
