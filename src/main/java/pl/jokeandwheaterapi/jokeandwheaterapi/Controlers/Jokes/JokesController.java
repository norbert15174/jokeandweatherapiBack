package pl.jokeandwheaterapi.jokeandwheaterapi.Controlers.Jokes;


import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.util.UriComponentsBuilder;
import pl.jokeandwheaterapi.jokeandwheaterapi.Models.Jokes.Joke;
import pl.jokeandwheaterapi.jokeandwheaterapi.Models.Jokes.Jokes;


@Controller
@RequestScope
public class JokesController {



    public JokesController(){}



        public Jokes getJokes(String amount , String contains){

            MultiValueMap<String,String> headers = new HttpHeaders();
            headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://sv443.net/jokeapi/v2/joke/Any")
                    .queryParam("contains", contains)
                    .queryParam("amount",amount);
            HttpEntity httpEntity = new HttpEntity(headers);

            RestTemplate restTemplate = new RestTemplate();
            Jokes jokes = restTemplate.exchange(builder.toUriString(), HttpMethod.GET,httpEntity, Jokes.class).getBody();

            return jokes;
        }

    }





