package pl.nbp.npb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NbpController {

    @GetMapping("/exchangerates/{currencyCode}/today")
    public CurrencyModel index(@PathVariable String currencyCode) {
        RestTemplate restTemplate = new RestTemplate(); //Klasa ze Springa bierze nam Jsona i zamienia na Obkiet, tylko trzeba mu powiedzieć jak!
        CurrencyModel currencyModel = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/c/"
        + currencyCode + "/today/?format=json", CurrencyModel.class);
        return currencyModel;
    }

}
