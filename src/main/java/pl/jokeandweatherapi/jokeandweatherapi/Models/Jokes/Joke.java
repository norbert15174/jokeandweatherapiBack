
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
    "category",
    "type",
    "joke",
    "flags",
    "id",
    "lang",
    "setup",
    "delivery"
})
public class Joke {

    @JsonProperty("category")
    private String category;
    @JsonProperty("type")
    private String type;
    @JsonProperty("joke")
    private String joke;
    @JsonProperty("flags")
    private Flags flags;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("setup")
    private String setup;
    @JsonProperty("delivery")
    private String delivery;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("joke")
    public String getJoke() {
        return joke;
    }

    @JsonProperty("joke")
    public void setJoke(String joke) {
        this.joke = joke;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("setup")
    public String getSetup() {
        return setup;
    }

    @JsonProperty("setup")
    public void setSetup(String setup) {
        this.setup = setup;
    }

    @JsonProperty("delivery")
    public String getDelivery() {
        return delivery;
    }

    @JsonProperty("delivery")
    public void setDelivery(String delivery) {
        this.delivery = delivery;
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
        return "Joke{" +
                "category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", joke='" + joke + '\'' +
                ", flags=" + flags +
                ", id=" + id +
                ", lang='" + lang + '\'' +
                ", setup='" + setup + '\'' +
                ", delivery='" + delivery + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
