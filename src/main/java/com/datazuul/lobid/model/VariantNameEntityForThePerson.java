
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
    "forename",
    "prefix",
    "surname",
    "personalName"
})
@Generated("jsonschema2pojo")
public class VariantNameEntityForThePerson {

    @JsonProperty("forename")
    private List<String> forename = new ArrayList<String>();
    @JsonProperty("prefix")
    private List<String> prefix = new ArrayList<String>();
    @JsonProperty("surname")
    private List<String> surname = new ArrayList<String>();
    @JsonProperty("personalName")
    private List<String> personalName = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("forename")
    public List<String> getForename() {
        return forename;
    }

    @JsonProperty("forename")
    public void setForename(List<String> forename) {
        this.forename = forename;
    }

    @JsonProperty("prefix")
    public List<String> getPrefix() {
        return prefix;
    }

    @JsonProperty("prefix")
    public void setPrefix(List<String> prefix) {
        this.prefix = prefix;
    }

    @JsonProperty("surname")
    public List<String> getSurname() {
        return surname;
    }

    @JsonProperty("surname")
    public void setSurname(List<String> surname) {
        this.surname = surname;
    }

    @JsonProperty("personalName")
    public List<String> getPersonalName() {
        return personalName;
    }

    @JsonProperty("personalName")
    public void setPersonalName(List<String> personalName) {
        this.personalName = personalName;
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
        sb.append(VariantNameEntityForThePerson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("forename");
        sb.append('=');
        sb.append(((this.forename == null)?"<null>":this.forename));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("surname");
        sb.append('=');
        sb.append(((this.surname == null)?"<null>":this.surname));
        sb.append(',');
        sb.append("personalName");
        sb.append('=');
        sb.append(((this.personalName == null)?"<null>":this.personalName));
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
        result = ((result* 31)+((this.forename == null)? 0 :this.forename.hashCode()));
        result = ((result* 31)+((this.personalName == null)? 0 :this.personalName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.surname == null)? 0 :this.surname.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VariantNameEntityForThePerson) == false) {
            return false;
        }
        VariantNameEntityForThePerson rhs = ((VariantNameEntityForThePerson) other);
        return ((((((this.forename == rhs.forename)||((this.forename!= null)&&this.forename.equals(rhs.forename)))&&((this.personalName == rhs.personalName)||((this.personalName!= null)&&this.personalName.equals(rhs.personalName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.surname == rhs.surname)||((this.surname!= null)&&this.surname.equals(rhs.surname))));
    }

}
