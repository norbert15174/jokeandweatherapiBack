
package pl.jokeandweatherapi.jokeandweatherapi.Models.Jokes;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nsfw",
    "religious",
    "political",
    "racist",
    "sexist"
})
public class Flags {

    @JsonProperty("nsfw")
    private Boolean nsfw;
    @JsonProperty("religious")
    private Boolean religious;
    @JsonProperty("political")
    private Boolean political;
    @JsonProperty("racist")
    private Boolean racist;
    @JsonProperty("sexist")
    private Boolean sexist;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nsfw")
    public Boolean getNsfw() {
        return nsfw;
    }

    @JsonProperty("nsfw")
    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    @JsonProperty("religious")
    public Boolean getReligious() {
        return religious;
    }

    @JsonProperty("religious")
    public void setReligious(Boolean religious) {
        this.religious = religious;
    }

    @JsonProperty("political")
    public Boolean getPolitical() {
        return political;
    }

    @JsonProperty("political")
    public void setPolitical(Boolean political) {
        this.political = political;
    }

    @JsonProperty("racist")
    public Boolean getRacist() {
        return racist;
    }

    @JsonProperty("racist")
    public void setRacist(Boolean racist) {
        this.racist = racist;
    }

    @JsonProperty("sexist")
    public Boolean getSexist() {
        return sexist;
    }

    @JsonProperty("sexist")
    public void setSexist(Boolean sexist) {
        this.sexist = sexist;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
