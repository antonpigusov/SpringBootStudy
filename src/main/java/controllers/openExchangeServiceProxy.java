package controllers;

import model.Currencies.Currency;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "openExchange-service", url = "https://openexchangerates.org")
public interface openExchangeServiceProxy{

    @GetMapping("/api/latest.json?app_id=dc7786f090984886accebc6860e82360&symbols={currency}")
    public Currency getCurrency(@PathVariable String currency);

    @GetMapping("/api/latest.json?app_id=dc7786f090984886accebc6860e82360")
    public Currency getCurrencies();
}
