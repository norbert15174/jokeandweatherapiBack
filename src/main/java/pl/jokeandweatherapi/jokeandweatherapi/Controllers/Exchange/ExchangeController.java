package pl.jokeandweatherapi.jokeandweatherapi.Controllers.Exchange;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import pl.jokeandweatherapi.jokeandweatherapi.Models.Exchange.ExchangeModel;
import pl.jokeandweatherapi.jokeandweatherapi.Models.Exchange.MoneyType;
import pl.jokeandweatherapi.jokeandweatherapi.Models.Jokes.Jokes;

import java.util.Random;
@Controller
public class ExchangeController {

    ExchangeModel getCurrency(){
        MultiValueMap<String,String> headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.ratesapi.io/api/latest")
                .queryParam("base", MoneyType.PLN);
        HttpEntity httpEntity = new HttpEntity(headers);

        RestTemplate restTemplate = new RestTemplate();
        ExchangeModel exchangeModel = restTemplate.exchange(builder.toUriString(), HttpMethod.GET,httpEntity, ExchangeModel.class).getBody();

        return exchangeModel;
    }




}
