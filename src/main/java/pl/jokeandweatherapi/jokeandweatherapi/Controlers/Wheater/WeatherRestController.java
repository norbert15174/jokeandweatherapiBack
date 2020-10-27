package pl.jokeandweatherapi.jokeandweatherapi.Controlers.Wheater;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.jokeandweatherapi.jokeandweatherapi.Models.Weather.WeatherModel;

@RestController
@RequestMapping(path = "/Weather")
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
