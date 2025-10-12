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
        "rs",
        "note",
        "availableChannel",
        "alternateName",
        "type",
        "classification",
        "mainEntityOfPage",
        "@context",
        "url",
        "picaPPN",
        "name",
        "location",
        "id",
        "isil",
        "fundertype",
        "sigel",
        "collects",
        "email",
        "name_en",
        "sameAs"
})
@Generated("jsonschema2pojo")
public class LobidOrganisation extends LobidEntity {

    @JsonProperty("rs")
    private String rs;
    @JsonProperty("note")
    private List<String> note = new ArrayList<String>();
    @JsonProperty("availableChannel")
    private List<AvailableChannel> availableChannel = new ArrayList<AvailableChannel>();
    @JsonProperty("alternateName")
    private List<String> alternateName = new ArrayList<String>();
    @JsonProperty("type")
    private String type;
    @JsonProperty("classification")
    private Classification classification;
    @JsonProperty("mainEntityOfPage")
    private MainEntityOfPage mainEntityOfPage;
    @JsonProperty("@context")
    private String context;
    @JsonProperty("url")
    private String url;
    @JsonProperty("picaPPN")
    private String picaPPN;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private List<Location> location = new ArrayList<Location>();
    @JsonProperty("id")
    private String id;
    @JsonProperty("isil")
    private String isil;
    @JsonProperty("fundertype")
    private Fundertype fundertype;
    @JsonProperty("sigel")
    private String sigel;
    @JsonProperty("collects")
    private Collects collects;
    @JsonProperty("email")
    private String email;
    @JsonProperty("name_en")
    private String nameEn;
    @JsonProperty("sameAs")
    private List<String> sameAs = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("rs")
    public String getRs() {
        return rs;
    }

    @JsonProperty("rs")
    public void setRs(String rs) {
        this.rs = rs;
    }

    @JsonProperty("note")
    public List<String> getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(List<String> note) {
        this.note = note;
    }

    @JsonProperty("availableChannel")
    public List<AvailableChannel> getAvailableChannel() {
        return availableChannel;
    }

    @JsonProperty("availableChannel")
    public void setAvailableChannel(List<AvailableChannel> availableChannel) {
        this.availableChannel = availableChannel;
    }

    @JsonProperty("alternateName")
    public List<String> getAlternateName() {
        return alternateName;
    }

    @JsonProperty("alternateName")
    public void setAlternateName(List<String> alternateName) {
        this.alternateName = alternateName;
    }

    @JsonProperty("classification")
    public Classification getClassification() {
        return classification;
    }

    @JsonProperty("classification")
    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    @JsonProperty("mainEntityOfPage")
    public MainEntityOfPage getMainEntityOfPage() {
        return mainEntityOfPage;
    }

    @JsonProperty("mainEntityOfPage")
    public void setMainEntityOfPage(MainEntityOfPage mainEntityOfPage) {
        this.mainEntityOfPage = mainEntityOfPage;
    }

    @JsonProperty("@context")
    public String getContext() {
        return context;
    }

    @JsonProperty("@context")
    public void setContext(String context) {
        this.context = context;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("picaPPN")
    public String getPicaPPN() {
        return picaPPN;
    }

    @JsonProperty("picaPPN")
    public void setPicaPPN(String picaPPN) {
        this.picaPPN = picaPPN;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("location")
    public List<Location> getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(List<Location> location) {
        this.location = location;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("isil")
    public String getIsil() {
        return isil;
    }

    @JsonProperty("isil")
    public void setIsil(String isil) {
        this.isil = isil;
    }

    @JsonProperty("fundertype")
    public Fundertype getFundertype() {
        return fundertype;
    }

    @JsonProperty("fundertype")
    public void setFundertype(Fundertype fundertype) {
        this.fundertype = fundertype;
    }

    @JsonProperty("sigel")
    public String getSigel() {
        return sigel;
    }

    @JsonProperty("sigel")
    public void setSigel(String sigel) {
        this.sigel = sigel;
    }

    @JsonProperty("collects")
    public Collects getCollects() {
        return collects;
    }

    @JsonProperty("collects")
    public void setCollects(Collects collects) {
        this.collects = collects;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("name_en")
    public String getNameEn() {
        return nameEn;
    }

    @JsonProperty("name_en")
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
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
        sb.append(LobidOrganisation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rs");
        sb.append('=');
        sb.append(((this.rs == null) ? "<null>" : this.rs));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null) ? "<null>" : this.note));
        sb.append(',');
        sb.append("availableChannel");
        sb.append('=');
        sb.append(((this.availableChannel == null) ? "<null>" : this.availableChannel));
        sb.append(',');
        sb.append("alternateName");
        sb.append('=');
        sb.append(((this.alternateName == null) ? "<null>" : this.alternateName));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null) ? "<null>" : this.classification));
        sb.append(',');
        sb.append("mainEntityOfPage");
        sb.append('=');
        sb.append(((this.mainEntityOfPage == null) ? "<null>" : this.mainEntityOfPage));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null) ? "<null>" : this.context));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null) ? "<null>" : this.url));
        sb.append(',');
        sb.append("picaPPN");
        sb.append('=');
        sb.append(((this.picaPPN == null) ? "<null>" : this.picaPPN));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null) ? "<null>" : this.location));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("isil");
        sb.append('=');
        sb.append(((this.isil == null) ? "<null>" : this.isil));
        sb.append(',');
        sb.append("fundertype");
        sb.append('=');
        sb.append(((this.fundertype == null) ? "<null>" : this.fundertype));
        sb.append(',');
        sb.append("sigel");
        sb.append('=');
        sb.append(((this.sigel == null) ? "<null>" : this.sigel));
        sb.append(',');
        sb.append("collects");
        sb.append('=');
        sb.append(((this.collects == null) ? "<null>" : this.collects));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null) ? "<null>" : this.email));
        sb.append(',');
        sb.append("nameEn");
        sb.append('=');
        sb.append(((this.nameEn == null) ? "<null>" : this.nameEn));
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.rs == null) ? 0 : this.rs.hashCode()));
        result = ((result * 31) + ((this.note == null) ? 0 : this.note.hashCode()));
        result = ((result * 31) + ((this.availableChannel == null) ? 0 : this.availableChannel.hashCode()));
        result = ((result * 31) + ((this.alternateName == null) ? 0 : this.alternateName.hashCode()));
        result = ((result * 31) + ((this.nameEn == null) ? 0 : this.nameEn.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.classification == null) ? 0 : this.classification.hashCode()));
        result = ((result * 31) + ((this.mainEntityOfPage == null) ? 0 : this.mainEntityOfPage.hashCode()));
        result = ((result * 31) + ((this.url == null) ? 0 : this.url.hashCode()));
        result = ((result * 31) + ((this.picaPPN == null) ? 0 : this.picaPPN.hashCode()));
        result = ((result * 31) + ((this.context == null) ? 0 : this.context.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.location == null) ? 0 : this.location.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.isil == null) ? 0 : this.isil.hashCode()));
        result = ((result * 31) + ((this.fundertype == null) ? 0 : this.fundertype.hashCode()));
        result = ((result * 31) + ((this.sigel == null) ? 0 : this.sigel.hashCode()));
        result = ((result * 31) + ((this.collects == null) ? 0 : this.collects.hashCode()));
        result = ((result * 31) + ((this.email == null) ? 0 : this.email.hashCode()));
        result = ((result * 31) + ((this.sameAs == null) ? 0 : this.sameAs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LobidOrganisation) == false) {
            return false;
        }
        LobidOrganisation rhs = ((LobidOrganisation) other);
        return ((((((((((((((((((((((this.rs == rhs.rs) || ((this.rs != null) && this.rs.equals(rhs.rs))) && ((this.note == rhs.note) || ((this.note != null) && this.note.equals(rhs.note)))) && ((this.availableChannel == rhs.availableChannel) || ((this.availableChannel != null) && this.availableChannel.equals(rhs.availableChannel)))) && ((this.alternateName == rhs.alternateName) || ((this.alternateName != null) && this.alternateName.equals(rhs.alternateName)))) && ((this.nameEn == rhs.nameEn) || ((this.nameEn != null) && this.nameEn.equals(rhs.nameEn)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.classification == rhs.classification) || ((this.classification != null) && this.classification.equals(rhs.classification)))) && ((this.mainEntityOfPage == rhs.mainEntityOfPage) || ((this.mainEntityOfPage != null) && this.mainEntityOfPage.equals(rhs.mainEntityOfPage)))) && ((this.url == rhs.url) || ((this.url != null) && this.url.equals(rhs.url)))) && ((this.picaPPN == rhs.picaPPN) || ((this.picaPPN != null) && this.picaPPN.equals(rhs.picaPPN)))) && ((this.context == rhs.context) || ((this.context != null) && this.context.equals(rhs.context)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.location == rhs.location) || ((this.location != null) && this.location.equals(rhs.location)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.isil == rhs.isil) || ((this.isil != null) && this.isil.equals(rhs.isil)))) && ((this.fundertype == rhs.fundertype) || ((this.fundertype != null) && this.fundertype.equals(rhs.fundertype)))) && ((this.sigel == rhs.sigel) || ((this.sigel != null) && this.sigel.equals(rhs.sigel)))) && ((this.collects == rhs.collects) || ((this.collects != null) && this.collects.equals(rhs.collects)))) && ((this.email == rhs.email) || ((this.email != null) && this.email.equals(rhs.email)))) && ((this.sameAs == rhs.sameAs) || ((this.sameAs != null) && this.sameAs.equals(rhs.sameAs))));
    }

}
