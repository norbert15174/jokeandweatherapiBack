package pl.jokeandwheaterapi.jokeandwheaterapi.Controlers.Jokes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.jokeandwheaterapi.jokeandwheaterapi.Models.Jokes.Jokes;

@RestController
@RequestMapping(path = "/jokes")
public class JokesRestController {

    @Autowired
    JokesController jokesController;

    @GetMapping("")
    public Jokes get(@RequestParam(defaultValue = "") String contains, @RequestParam(defaultValue = "1") String amount ){
        Jokes jokes = jokesController.getJokes(amount,contains);
        return jokes;
    }



}
