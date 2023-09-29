
package com.datazuul.lobid.model;

import java.util.LinkedHashMap;
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
    "id",
    "license",
    "dateModified",
    "descriptionLevel"
})
@Generated("jsonschema2pojo")
public class DescribedBy {

    @JsonProperty("id")
    private String id;
    @JsonProperty("license")
    private License license;
    @JsonProperty("dateModified")
    private String dateModified;
    @JsonProperty("descriptionLevel")
    private DescriptionLevel descriptionLevel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("license")
    public License getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(License license) {
        this.license = license;
    }

    @JsonProperty("dateModified")
    public String getDateModified() {
        return dateModified;
    }

    @JsonProperty("dateModified")
    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @JsonProperty("descriptionLevel")
    public DescriptionLevel getDescriptionLevel() {
        return descriptionLevel;
    }

    @JsonProperty("descriptionLevel")
    public void setDescriptionLevel(DescriptionLevel descriptionLevel) {
        this.descriptionLevel = descriptionLevel;
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
        sb.append(DescribedBy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("license");
        sb.append('=');
        sb.append(((this.license == null)?"<null>":this.license));
        sb.append(',');
        sb.append("dateModified");
        sb.append('=');
        sb.append(((this.dateModified == null)?"<null>":this.dateModified));
        sb.append(',');
        sb.append("descriptionLevel");
        sb.append('=');
        sb.append(((this.descriptionLevel == null)?"<null>":this.descriptionLevel));
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
        result = ((result* 31)+((this.descriptionLevel == null)? 0 :this.descriptionLevel.hashCode()));
        result = ((result* 31)+((this.license == null)? 0 :this.license.hashCode()));
        result = ((result* 31)+((this.dateModified == null)? 0 :this.dateModified.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DescribedBy) == false) {
            return false;
        }
        DescribedBy rhs = ((DescribedBy) other);
        return ((((((this.descriptionLevel == rhs.descriptionLevel)||((this.descriptionLevel!= null)&&this.descriptionLevel.equals(rhs.descriptionLevel)))&&((this.license == rhs.license)||((this.license!= null)&&this.license.equals(rhs.license))))&&((this.dateModified == rhs.dateModified)||((this.dateModified!= null)&&this.dateModified.equals(rhs.dateModified))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
