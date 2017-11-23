package no.mabjork.finance_advisor.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import no.mabjork.finance_advisor.Services.DigitalCurrencyServiceImpl;
import no.mabjork.finance_advisor.Services.PhysicalCurrencyServiceImpl;
import no.mabjork.finance_advisor.Services.StockServiceImpl;
import no.mabjork.finance_advisor.Services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;

@RestController
@RequestMapping("/metadata")
public class MetadataController {

    @Autowired
    private PhysicalCurrencyServiceImpl physicalCurrencyService;

    @Autowired
    private DigitalCurrencyServiceImpl digitalCurrencyService;

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private StockServiceImpl stockService;

    @Autowired
    private ObjectMapper mapper;


    @GetMapping("")
    public ResponseEntity Index(){
        HashMap<String,Object> response = new HashMap<>();
        response.put("num_dig_cur",digitalCurrencyService.countAll());
        response.put("num_phy_cur",physicalCurrencyService.countAll());
        response.put("num_stocks",stockService.countAll());

        try{
            String json = mapper.writeValueAsString(response);
            return ResponseEntity.ok().body(json);
        }catch (IOException e){
            return ResponseEntity.badRequest().build();
        }
    }

}
