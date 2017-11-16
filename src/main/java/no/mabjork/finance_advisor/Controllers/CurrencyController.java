package no.mabjork.finance_advisor.Controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import no.mabjork.finance_advisor.Models.DigitalCurrency;
import no.mabjork.finance_advisor.Models.PhysicalCurrency;
import no.mabjork.finance_advisor.repositories.DigitalCurrencyRepository;
import no.mabjork.finance_advisor.repositories.PhysicalCurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/currencies")
public class CurrencyController {

    @Autowired
    private PhysicalCurrencyRepository physicalCurrencyRepository;

    @Autowired
    private DigitalCurrencyRepository digitalCurrencyRepository;

    @Autowired
    private ObjectMapper mapper;

    @GetMapping("/physical")
    public ResponseEntity getPhysicalCurrencyPage(@RequestParam("page")int page,@RequestParam("pagelenght")int pagelenght){
        Page<PhysicalCurrency> data = physicalCurrencyRepository.findAll(new PageRequest(page,pagelenght));
        try{
            String json = mapper.writeValueAsString(data);
            return ResponseEntity.ok().body(json);
        }catch (IOException e){
            return ResponseEntity.badRequest().build();
        }
    }
    @GetMapping("/digital")
    public ResponseEntity getDigitalCurrencyPage(@RequestParam("page")int page,@RequestParam("pagelenght")int pagelenght){
        Page<DigitalCurrency> data = digitalCurrencyRepository.findAll(new PageRequest(page,pagelenght));
        try{
            String json = mapper.writeValueAsString(data);
            return ResponseEntity.ok().body(json);
        }catch (IOException e){
            return ResponseEntity.badRequest().build();
        }
    }
}
