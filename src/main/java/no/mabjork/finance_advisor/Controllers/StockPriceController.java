package no.mabjork.finance_advisor.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/price")
public class StockPriceController {

    @RequestMapping("/")
    public String index(){return "";}
}
