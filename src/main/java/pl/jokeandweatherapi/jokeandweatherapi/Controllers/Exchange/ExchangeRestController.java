package pl.jokeandweatherapi.jokeandweatherapi.Controllers.Exchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jokeandweatherapi.jokeandweatherapi.Models.Exchange.ExchangeModel;
import pl.jokeandweatherapi.jokeandweatherapi.Models.Exchange.MoneyType;

import java.util.Random;

@RestController
@RequestMapping("/exchange")
@CrossOrigin
public class ExchangeRestController {

    ExchangeController exchangeController;
    @Autowired
    public ExchangeRestController(ExchangeController exchangeController) {
        this.exchangeController = exchangeController;
    }

    @GetMapping("/random")
    MoneyType getRandom(){
        return MoneyType.values()[new Random().nextInt(30)];
    }

    @GetMapping
    ExchangeModel getCurrency(){
        return exchangeController.getCurrency();
    }


}
