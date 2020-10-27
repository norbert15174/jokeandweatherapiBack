package pl.jokeandweatherapi.jokeandweatherapi.Controllers.Wheater;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.jokeandweatherapi.jokeandweatherapi.Models.Weather.WeatherModel;

@RestController
@RequestMapping(path = "/Weather")
@CrossOrigin
public class WeatherRestController {

    WeatherController weatherController;
    @Autowired
    public WeatherRestController(WeatherController weatherController) {
        this.weatherController = weatherController;
    }

    @GetMapping
    public WeatherModel getInitWheater(
            @RequestParam(defaultValue = "Warszawa") String q,
            @RequestParam(defaultValue = "pl") String lang){
        return weatherController.getWheaterApi(q,lang);
    }


}
