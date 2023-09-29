
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
    "@context",
    "acquaintanceshipOrFriendship",
    "biographicalOrHistoricalInformation",
    "dateOfBirth",
    "dateOfDeath",
    "deprecatedUri",
    "familialRelationship",
    "gender",
    "geographicAreaCode",
    "gndIdentifier",
    "gndSubjectCategory",
    "id",
    "languageCode",
    "oldAuthorityNumber",
    "placeOfActivity",
    "placeOfBirth",
    "placeOfDeath",
    "preferredName",
    "preferredNameEntityForThePerson",
    "professionOrOccupation",
    "professionalRelationship",
    "relatedWork",
    "sameAs",
    "type",
    "variantName",
    "variantNameEntityForThePerson",
    "wikipedia",
    "depiction"
})
@Generated("jsonschema2pojo")
public class LobidPerson {

    @JsonProperty("@context")
    private String context;
    @JsonProperty("acquaintanceshipOrFriendship")
    private List<AcquaintanceshipOrFriendship> acquaintanceshipOrFriendship = new ArrayList<AcquaintanceshipOrFriendship>();
    @JsonProperty("biographicalOrHistoricalInformation")
    private List<String> biographicalOrHistoricalInformation = new ArrayList<String>();
    @JsonProperty("dateOfBirth")
    private List<String> dateOfBirth = new ArrayList<String>();
    @JsonProperty("dateOfDeath")
    private List<String> dateOfDeath = new ArrayList<String>();
    @JsonProperty("deprecatedUri")
    private List<String> deprecatedUri = new ArrayList<String>();
    @JsonProperty("familialRelationship")
    private List<FamilialRelationship> familialRelationship = new ArrayList<FamilialRelationship>();
    @JsonProperty("gender")
    private List<Gender> gender = new ArrayList<Gender>();
    @JsonProperty("geographicAreaCode")
    private List<GeographicAreaCode> geographicAreaCode = new ArrayList<GeographicAreaCode>();
    @JsonProperty("gndIdentifier")
    private String gndIdentifier;
    @JsonProperty("gndSubjectCategory")
    private List<GndSubjectCategory> gndSubjectCategory = new ArrayList<GndSubjectCategory>();
    @JsonProperty("id")
    private String id;
    @JsonProperty("languageCode")
    private List<LanguageCode> languageCode = new ArrayList<LanguageCode>();
    @JsonProperty("oldAuthorityNumber")
    private List<String> oldAuthorityNumber = new ArrayList<String>();
    @JsonProperty("placeOfActivity")
    private List<PlaceOfActivity> placeOfActivity = new ArrayList<PlaceOfActivity>();
    @JsonProperty("placeOfBirth")
    private List<PlaceOfBirth> placeOfBirth = new ArrayList<PlaceOfBirth>();
    @JsonProperty("placeOfDeath")
    private List<PlaceOfDeath> placeOfDeath = new ArrayList<PlaceOfDeath>();
    @JsonProperty("preferredName")
    private String preferredName;
    @JsonProperty("preferredNameEntityForThePerson")
    private PreferredNameEntityForThePerson preferredNameEntityForThePerson;
    @JsonProperty("professionOrOccupation")
    private List<ProfessionOrOccupation> professionOrOccupation = new ArrayList<ProfessionOrOccupation>();
    @JsonProperty("professionalRelationship")
    private List<ProfessionalRelationship> professionalRelationship = new ArrayList<ProfessionalRelationship>();
    @JsonProperty("relatedWork")
    private List<RelatedWork> relatedWork = new ArrayList<RelatedWork>();
    @JsonProperty("sameAs")
    private List<SameAs> sameAs = new ArrayList<SameAs>();
    @JsonProperty("type")
    private List<String> type = new ArrayList<String>();
    @JsonProperty("variantName")
    private List<String> variantName = new ArrayList<String>();
    @JsonProperty("variantNameEntityForThePerson")
    private List<VariantNameEntityForThePerson> variantNameEntityForThePerson = new ArrayList<VariantNameEntityForThePerson>();
    @JsonProperty("wikipedia")
    private List<Wikipedium> wikipedia = new ArrayList<Wikipedium>();
    @JsonProperty("depiction")
    private List<Depiction> depiction = new ArrayList<Depiction>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("@context")
    public String getContext() {
        return context;
    }

    @JsonProperty("@context")
    public void setContext(String context) {
        this.context = context;
    }

    @JsonProperty("acquaintanceshipOrFriendship")
    public List<AcquaintanceshipOrFriendship> getAcquaintanceshipOrFriendship() {
        return acquaintanceshipOrFriendship;
    }

    @JsonProperty("acquaintanceshipOrFriendship")
    public void setAcquaintanceshipOrFriendship(List<AcquaintanceshipOrFriendship> acquaintanceshipOrFriendship) {
        this.acquaintanceshipOrFriendship = acquaintanceshipOrFriendship;
    }

    @JsonProperty("biographicalOrHistoricalInformation")
    public List<String> getBiographicalOrHistoricalInformation() {
        return biographicalOrHistoricalInformation;
    }

    @JsonProperty("biographicalOrHistoricalInformation")
    public void setBiographicalOrHistoricalInformation(List<String> biographicalOrHistoricalInformation) {
        this.biographicalOrHistoricalInformation = biographicalOrHistoricalInformation;
    }

    @JsonProperty("dateOfBirth")
    public List<String> getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(List<String> dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("dateOfDeath")
    public List<String> getDateOfDeath() {
        return dateOfDeath;
    }

    @JsonProperty("dateOfDeath")
    public void setDateOfDeath(List<String> dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    @JsonProperty("deprecatedUri")
    public List<String> getDeprecatedUri() {
        return deprecatedUri;
    }

    @JsonProperty("deprecatedUri")
    public void setDeprecatedUri(List<String> deprecatedUri) {
        this.deprecatedUri = deprecatedUri;
    }

    @JsonProperty("familialRelationship")
    public List<FamilialRelationship> getFamilialRelationship() {
        return familialRelationship;
    }

    @JsonProperty("familialRelationship")
    public void setFamilialRelationship(List<FamilialRelationship> familialRelationship) {
        this.familialRelationship = familialRelationship;
    }

    @JsonProperty("gender")
    public List<Gender> getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(List<Gender> gender) {
        this.gender = gender;
    }

    @JsonProperty("geographicAreaCode")
    public List<GeographicAreaCode> getGeographicAreaCode() {
        return geographicAreaCode;
    }

    @JsonProperty("geographicAreaCode")
    public void setGeographicAreaCode(List<GeographicAreaCode> geographicAreaCode) {
        this.geographicAreaCode = geographicAreaCode;
    }

    @JsonProperty("gndIdentifier")
    public String getGndIdentifier() {
        return gndIdentifier;
    }

    @JsonProperty("gndIdentifier")
    public void setGndIdentifier(String gndIdentifier) {
        this.gndIdentifier = gndIdentifier;
    }

    @JsonProperty("gndSubjectCategory")
    public List<GndSubjectCategory> getGndSubjectCategory() {
        return gndSubjectCategory;
    }

    @JsonProperty("gndSubjectCategory")
    public void setGndSubjectCategory(List<GndSubjectCategory> gndSubjectCategory) {
        this.gndSubjectCategory = gndSubjectCategory;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("languageCode")
    public List<LanguageCode> getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("languageCode")
    public void setLanguageCode(List<LanguageCode> languageCode) {
        this.languageCode = languageCode;
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

    @JsonProperty("placeOfBirth")
    public List<PlaceOfBirth> getPlaceOfBirth() {
        return placeOfBirth;
    }

    @JsonProperty("placeOfBirth")
    public void setPlaceOfBirth(List<PlaceOfBirth> placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @JsonProperty("placeOfDeath")
    public List<PlaceOfDeath> getPlaceOfDeath() {
        return placeOfDeath;
    }

    @JsonProperty("placeOfDeath")
    public void setPlaceOfDeath(List<PlaceOfDeath> placeOfDeath) {
        this.placeOfDeath = placeOfDeath;
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

    @JsonProperty("professionOrOccupation")
    public List<ProfessionOrOccupation> getProfessionOrOccupation() {
        return professionOrOccupation;
    }

    @JsonProperty("professionOrOccupation")
    public void setProfessionOrOccupation(List<ProfessionOrOccupation> professionOrOccupation) {
        this.professionOrOccupation = professionOrOccupation;
    }

    @JsonProperty("professionalRelationship")
    public List<ProfessionalRelationship> getProfessionalRelationship() {
        return professionalRelationship;
    }

    @JsonProperty("professionalRelationship")
    public void setProfessionalRelationship(List<ProfessionalRelationship> professionalRelationship) {
        this.professionalRelationship = professionalRelationship;
    }

    @JsonProperty("relatedWork")
    public List<RelatedWork> getRelatedWork() {
        return relatedWork;
    }

    @JsonProperty("relatedWork")
    public void setRelatedWork(List<RelatedWork> relatedWork) {
        this.relatedWork = relatedWork;
    }

    @JsonProperty("sameAs")
    public List<SameAs> getSameAs() {
        return sameAs;
    }

    @JsonProperty("sameAs")
    public void setSameAs(List<SameAs> sameAs) {
        this.sameAs = sameAs;
    }

    @JsonProperty("type")
    public List<String> getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(List<String> type) {
        this.type = type;
    }

    @JsonProperty("variantName")
    public List<String> getVariantName() {
        return variantName;
    }

    @JsonProperty("variantName")
    public void setVariantName(List<String> variantName) {
        this.variantName = variantName;
    }

    @JsonProperty("variantNameEntityForThePerson")
    public List<VariantNameEntityForThePerson> getVariantNameEntityForThePerson() {
        return variantNameEntityForThePerson;
    }

    @JsonProperty("variantNameEntityForThePerson")
    public void setVariantNameEntityForThePerson(List<VariantNameEntityForThePerson> variantNameEntityForThePerson) {
        this.variantNameEntityForThePerson = variantNameEntityForThePerson;
    }

    @JsonProperty("wikipedia")
    public List<Wikipedium> getWikipedia() {
        return wikipedia;
    }

    @JsonProperty("wikipedia")
    public void setWikipedia(List<Wikipedium> wikipedia) {
        this.wikipedia = wikipedia;
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
        sb.append(LobidPerson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("acquaintanceshipOrFriendship");
        sb.append('=');
        sb.append(((this.acquaintanceshipOrFriendship == null)?"<null>":this.acquaintanceshipOrFriendship));
        sb.append(',');
        sb.append("biographicalOrHistoricalInformation");
        sb.append('=');
        sb.append(((this.biographicalOrHistoricalInformation == null)?"<null>":this.biographicalOrHistoricalInformation));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("dateOfDeath");
        sb.append('=');
        sb.append(((this.dateOfDeath == null)?"<null>":this.dateOfDeath));
        sb.append(',');
        sb.append("deprecatedUri");
        sb.append('=');
        sb.append(((this.deprecatedUri == null)?"<null>":this.deprecatedUri));
        sb.append(',');
        sb.append("familialRelationship");
        sb.append('=');
        sb.append(((this.familialRelationship == null)?"<null>":this.familialRelationship));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("geographicAreaCode");
        sb.append('=');
        sb.append(((this.geographicAreaCode == null)?"<null>":this.geographicAreaCode));
        sb.append(',');
        sb.append("gndIdentifier");
        sb.append('=');
        sb.append(((this.gndIdentifier == null)?"<null>":this.gndIdentifier));
        sb.append(',');
        sb.append("gndSubjectCategory");
        sb.append('=');
        sb.append(((this.gndSubjectCategory == null)?"<null>":this.gndSubjectCategory));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("languageCode");
        sb.append('=');
        sb.append(((this.languageCode == null)?"<null>":this.languageCode));
        sb.append(',');
        sb.append("oldAuthorityNumber");
        sb.append('=');
        sb.append(((this.oldAuthorityNumber == null)?"<null>":this.oldAuthorityNumber));
        sb.append(',');
        sb.append("placeOfActivity");
        sb.append('=');
        sb.append(((this.placeOfActivity == null)?"<null>":this.placeOfActivity));
        sb.append(',');
        sb.append("placeOfBirth");
        sb.append('=');
        sb.append(((this.placeOfBirth == null)?"<null>":this.placeOfBirth));
        sb.append(',');
        sb.append("placeOfDeath");
        sb.append('=');
        sb.append(((this.placeOfDeath == null)?"<null>":this.placeOfDeath));
        sb.append(',');
        sb.append("preferredName");
        sb.append('=');
        sb.append(((this.preferredName == null)?"<null>":this.preferredName));
        sb.append(',');
        sb.append("preferredNameEntityForThePerson");
        sb.append('=');
        sb.append(((this.preferredNameEntityForThePerson == null)?"<null>":this.preferredNameEntityForThePerson));
        sb.append(',');
        sb.append("professionOrOccupation");
        sb.append('=');
        sb.append(((this.professionOrOccupation == null)?"<null>":this.professionOrOccupation));
        sb.append(',');
        sb.append("professionalRelationship");
        sb.append('=');
        sb.append(((this.professionalRelationship == null)?"<null>":this.professionalRelationship));
        sb.append(',');
        sb.append("relatedWork");
        sb.append('=');
        sb.append(((this.relatedWork == null)?"<null>":this.relatedWork));
        sb.append(',');
        sb.append("sameAs");
        sb.append('=');
        sb.append(((this.sameAs == null)?"<null>":this.sameAs));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("variantName");
        sb.append('=');
        sb.append(((this.variantName == null)?"<null>":this.variantName));
        sb.append(',');
        sb.append("variantNameEntityForThePerson");
        sb.append('=');
        sb.append(((this.variantNameEntityForThePerson == null)?"<null>":this.variantNameEntityForThePerson));
        sb.append(',');
        sb.append("wikipedia");
        sb.append('=');
        sb.append(((this.wikipedia == null)?"<null>":this.wikipedia));
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
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.relatedWork == null)? 0 :this.relatedWork.hashCode()));
        result = ((result* 31)+((this.dateOfDeath == null)? 0 :this.dateOfDeath.hashCode()));
        result = ((result* 31)+((this.placeOfDeath == null)? 0 :this.placeOfDeath.hashCode()));
        result = ((result* 31)+((this.familialRelationship == null)? 0 :this.familialRelationship.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.gndSubjectCategory == null)? 0 :this.gndSubjectCategory.hashCode()));
        result = ((result* 31)+((this.oldAuthorityNumber == null)? 0 :this.oldAuthorityNumber.hashCode()));
        result = ((result* 31)+((this.geographicAreaCode == null)? 0 :this.geographicAreaCode.hashCode()));
        result = ((result* 31)+((this.biographicalOrHistoricalInformation == null)? 0 :this.biographicalOrHistoricalInformation.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.gndIdentifier == null)? 0 :this.gndIdentifier.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.placeOfActivity == null)? 0 :this.placeOfActivity.hashCode()));
        result = ((result* 31)+((this.preferredName == null)? 0 :this.preferredName.hashCode()));
        result = ((result* 31)+((this.wikipedia == null)? 0 :this.wikipedia.hashCode()));
        result = ((result* 31)+((this.preferredNameEntityForThePerson == null)? 0 :this.preferredNameEntityForThePerson.hashCode()));
        result = ((result* 31)+((this.depiction == null)? 0 :this.depiction.hashCode()));
        result = ((result* 31)+((this.professionOrOccupation == null)? 0 :this.professionOrOccupation.hashCode()));
        result = ((result* 31)+((this.placeOfBirth == null)? 0 :this.placeOfBirth.hashCode()));
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        result = ((result* 31)+((this.variantNameEntityForThePerson == null)? 0 :this.variantNameEntityForThePerson.hashCode()));
        result = ((result* 31)+((this.languageCode == null)? 0 :this.languageCode.hashCode()));
        result = ((result* 31)+((this.professionalRelationship == null)? 0 :this.professionalRelationship.hashCode()));
        result = ((result* 31)+((this.deprecatedUri == null)? 0 :this.deprecatedUri.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.variantName == null)? 0 :this.variantName.hashCode()));
        result = ((result* 31)+((this.acquaintanceshipOrFriendship == null)? 0 :this.acquaintanceshipOrFriendship.hashCode()));
        result = ((result* 31)+((this.sameAs == null)? 0 :this.sameAs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LobidPerson) == false) {
            return false;
        }
        LobidPerson rhs = ((LobidPerson) other);
        return ((((((((((((((((((((((((((((((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender)))&&((this.relatedWork == rhs.relatedWork)||((this.relatedWork!= null)&&this.relatedWork.equals(rhs.relatedWork))))&&((this.dateOfDeath == rhs.dateOfDeath)||((this.dateOfDeath!= null)&&this.dateOfDeath.equals(rhs.dateOfDeath))))&&((this.placeOfDeath == rhs.placeOfDeath)||((this.placeOfDeath!= null)&&this.placeOfDeath.equals(rhs.placeOfDeath))))&&((this.familialRelationship == rhs.familialRelationship)||((this.familialRelationship!= null)&&this.familialRelationship.equals(rhs.familialRelationship))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.gndSubjectCategory == rhs.gndSubjectCategory)||((this.gndSubjectCategory!= null)&&this.gndSubjectCategory.equals(rhs.gndSubjectCategory))))&&((this.oldAuthorityNumber == rhs.oldAuthorityNumber)||((this.oldAuthorityNumber!= null)&&this.oldAuthorityNumber.equals(rhs.oldAuthorityNumber))))&&((this.geographicAreaCode == rhs.geographicAreaCode)||((this.geographicAreaCode!= null)&&this.geographicAreaCode.equals(rhs.geographicAreaCode))))&&((this.biographicalOrHistoricalInformation == rhs.biographicalOrHistoricalInformation)||((this.biographicalOrHistoricalInformation!= null)&&this.biographicalOrHistoricalInformation.equals(rhs.biographicalOrHistoricalInformation))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.gndIdentifier == rhs.gndIdentifier)||((this.gndIdentifier!= null)&&this.gndIdentifier.equals(rhs.gndIdentifier))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.placeOfActivity == rhs.placeOfActivity)||((this.placeOfActivity!= null)&&this.placeOfActivity.equals(rhs.placeOfActivity))))&&((this.preferredName == rhs.preferredName)||((this.preferredName!= null)&&this.preferredName.equals(rhs.preferredName))))&&((this.wikipedia == rhs.wikipedia)||((this.wikipedia!= null)&&this.wikipedia.equals(rhs.wikipedia))))&&((this.preferredNameEntityForThePerson == rhs.preferredNameEntityForThePerson)||((this.preferredNameEntityForThePerson!= null)&&this.preferredNameEntityForThePerson.equals(rhs.preferredNameEntityForThePerson))))&&((this.depiction == rhs.depiction)||((this.depiction!= null)&&this.depiction.equals(rhs.depiction))))&&((this.professionOrOccupation == rhs.professionOrOccupation)||((this.professionOrOccupation!= null)&&this.professionOrOccupation.equals(rhs.professionOrOccupation))))&&((this.placeOfBirth == rhs.placeOfBirth)||((this.placeOfBirth!= null)&&this.placeOfBirth.equals(rhs.placeOfBirth))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))))&&((this.variantNameEntityForThePerson == rhs.variantNameEntityForThePerson)||((this.variantNameEntityForThePerson!= null)&&this.variantNameEntityForThePerson.equals(rhs.variantNameEntityForThePerson))))&&((this.languageCode == rhs.languageCode)||((this.languageCode!= null)&&this.languageCode.equals(rhs.languageCode))))&&((this.professionalRelationship == rhs.professionalRelationship)||((this.professionalRelationship!= null)&&this.professionalRelationship.equals(rhs.professionalRelationship))))&&((this.deprecatedUri == rhs.deprecatedUri)||((this.deprecatedUri!= null)&&this.deprecatedUri.equals(rhs.deprecatedUri))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.variantName == rhs.variantName)||((this.variantName!= null)&&this.variantName.equals(rhs.variantName))))&&((this.acquaintanceshipOrFriendship == rhs.acquaintanceshipOrFriendship)||((this.acquaintanceshipOrFriendship!= null)&&this.acquaintanceshipOrFriendship.equals(rhs.acquaintanceshipOrFriendship))))&&((this.sameAs == rhs.sameAs)||((this.sameAs!= null)&&this.sameAs.equals(rhs.sameAs))));
    }

}
