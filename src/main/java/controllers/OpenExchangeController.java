package controllers;


import model.Currencies.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableFeignClients(basePackageClasses = openExchangeServiceProxy.class)
public class OpenExchangeController implements openExchangeServiceProxy{

    @Autowired
    private openExchangeServiceProxy proxy;

    @Override
    @GetMapping("/getCurrency/{currency}")
    public Currency getCurrency(@PathVariable String currency) {
        return proxy.getCurrency(currency);
    }

    @Override
    @GetMapping("/allCurrencies")
    public Currency getCurrencies() {
        return proxy.getCurrencies();
    }
}
