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
        "@context",
        "id",
        "totalItems",
        "member",
        "aggregation"
})
@Generated("jsonschema2pojo")
public class LobidSearchPersons {

    @JsonProperty("@context")
    private String context;
    @JsonProperty("id")
    private String id;
    @JsonProperty("totalItems")
    private Integer totalItems;
    @JsonProperty("member")
    private List<LobidPerson> member = new ArrayList<LobidPerson>();
    @JsonProperty("aggregation")
    //private Aggregation aggregation;
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

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("totalItems")
    public Integer getTotalItems() {
        return totalItems;
    }

    @JsonProperty("totalItems")
    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    @JsonProperty("member")
    public List<LobidPerson> getMember() {
        return member;
    }

    @JsonProperty("member")
    public void setMember(List<LobidPerson> member) {
        this.member = member;
    }

    /*
    @JsonProperty("aggregation")
    public Aggregation getAggregation() {
        return aggregation;
    }

    @JsonProperty("aggregation")
    public void setAggregation(Aggregation aggregation) {
        this.aggregation = aggregation;
    }
    */

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
        sb.append(LobidSearchPersons.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null) ? "<null>" : this.context));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("totalItems");
        sb.append('=');
        sb.append(((this.totalItems == null) ? "<null>" : this.totalItems));
        sb.append(',');
        sb.append("member");
        sb.append('=');
        sb.append(((this.member == null) ? "<null>" : this.member));
        sb.append(',');
        /*
        sb.append("aggregation");
        sb.append('=');
        sb.append(((this.aggregation == null)?"<null>":this.aggregation));
        sb.append(',');
        */
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
        result = ((result * 31) + ((this.context == null) ? 0 : this.context.hashCode()));
        result = ((result * 31) + ((this.member == null) ? 0 : this.member.hashCode()));
        result = ((result * 31) + ((this.totalItems == null) ? 0 : this.totalItems.hashCode()));
        //result = ((result* 31)+((this.aggregation == null)? 0 :this.aggregation.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LobidSearchPersons) == false) {
            return false;
        }
        LobidSearchPersons rhs = ((LobidSearchPersons) other);
        return (
                ((((
                        ((this.context == rhs.context) || ((this.context != null) && this.context.equals(rhs.context)))
                                && ((this.member == rhs.member) || ((this.member != null) && this.member.equals(rhs.member)))
                ) && ((this.totalItems == rhs.totalItems) || ((this.totalItems != null) && this.totalItems.equals(rhs.totalItems))))
                )
                        && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
