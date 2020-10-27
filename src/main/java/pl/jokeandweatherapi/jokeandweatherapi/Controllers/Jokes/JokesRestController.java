package pl.jokeandweatherapi.jokeandweatherapi.Controllers.Jokes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.jokeandweatherapi.jokeandweatherapi.Models.Jokes.Jokes;

@RestController
@RequestMapping(path = "/jokes")
@CrossOrigin
public class JokesRestController {

    @Autowired
    JokesController jokesController;

    @GetMapping("")
    public Jokes get(@RequestParam(defaultValue = "") String contains, @RequestParam(defaultValue = "1") String amount ){
        Jokes jokes = jokesController.getJokes(amount,contains);
        return jokes;
    }



}
