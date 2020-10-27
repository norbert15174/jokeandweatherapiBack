package pl.jokeandweatherapi.jokeandweatherapi.Controlers.Wheater;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.util.UriComponentsBuilder;
import pl.jokeandweatherapi.jokeandweatherapi.Models.Weather.WeatherModel;

@Controller
@RequestScope
public class WeatherController {



    @Value("${appid}")
    private String appid;

    public WeatherController(){
    };


    public WeatherModel getWheaterApi(String q, String lang){
        MultiValueMap<String,String> headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://api.openweathermap.org/data/2.5/weather")
                .queryParam("q", q)
                .queryParam("lang",lang)
                .queryParam("appid",this.appid);
        HttpEntity httpEntity = new HttpEntity(headers);

        RestTemplate restTemplate = new RestTemplate();
        WeatherModel weatherModel = restTemplate.exchange(builder.toUriString(), HttpMethod.GET,httpEntity, WeatherModel.class).getBody();
        return weatherModel;
    }

}
