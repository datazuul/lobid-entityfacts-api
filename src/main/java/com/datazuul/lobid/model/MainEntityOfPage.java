
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
    "dateCreated",
    "dateModified",
    "wasGeneratedBy"
})
@Generated("jsonschema2pojo")
public class MainEntityOfPage {

    @JsonProperty("id")
    private String id;
    @JsonProperty("dateCreated")
    private String dateCreated;
    @JsonProperty("dateModified")
    private String dateModified;
    @JsonProperty("wasGeneratedBy")
    private WasGeneratedBy wasGeneratedBy;
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

    @JsonProperty("dateCreated")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("dateCreated")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("dateModified")
    public String getDateModified() {
        return dateModified;
    }

    @JsonProperty("dateModified")
    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @JsonProperty("wasGeneratedBy")
    public WasGeneratedBy getWasGeneratedBy() {
        return wasGeneratedBy;
    }

    @JsonProperty("wasGeneratedBy")
    public void setWasGeneratedBy(WasGeneratedBy wasGeneratedBy) {
        this.wasGeneratedBy = wasGeneratedBy;
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
        sb.append(MainEntityOfPage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("dateCreated");
        sb.append('=');
        sb.append(((this.dateCreated == null)?"<null>":this.dateCreated));
        sb.append(',');
        sb.append("dateModified");
        sb.append('=');
        sb.append(((this.dateModified == null)?"<null>":this.dateModified));
        sb.append(',');
        sb.append("wasGeneratedBy");
        sb.append('=');
        sb.append(((this.wasGeneratedBy == null)?"<null>":this.wasGeneratedBy));
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
        result = ((result* 31)+((this.dateModified == null)? 0 :this.dateModified.hashCode()));
        result = ((result* 31)+((this.wasGeneratedBy == null)? 0 :this.wasGeneratedBy.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.dateCreated == null)? 0 :this.dateCreated.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MainEntityOfPage) == false) {
            return false;
        }
        MainEntityOfPage rhs = ((MainEntityOfPage) other);
        return ((((((this.dateModified == rhs.dateModified)||((this.dateModified!= null)&&this.dateModified.equals(rhs.dateModified)))&&((this.wasGeneratedBy == rhs.wasGeneratedBy)||((this.wasGeneratedBy!= null)&&this.wasGeneratedBy.equals(rhs.wasGeneratedBy))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.dateCreated == rhs.dateCreated)||((this.dateCreated!= null)&&this.dateCreated.equals(rhs.dateCreated))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
