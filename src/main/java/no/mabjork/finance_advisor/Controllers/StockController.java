package no.mabjork.finance_advisor.Controllers;



import com.fasterxml.jackson.databind.ObjectMapper;
import no.mabjork.finance_advisor.Models.Account;
import no.mabjork.finance_advisor.Models.Stock;
import no.mabjork.finance_advisor.Services.StockServiceImpl;
import no.mabjork.finance_advisor.Services.UserServiceImpl;
import no.mabjork.finance_advisor.auth.JWTAuthenticationFilter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/equities")
public class StockController {

    static Logger log = Logger.getLogger(StockController.class.getName());
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private StockServiceImpl stockService;

    @Autowired
    private ObjectMapper mapper;



    @GetMapping("/all")
    public ResponseEntity getStocks(@RequestParam("page")int page,@RequestParam("pagelenght")int pagelenght){

        Page<Stock> stocks = stockService.findAll(new PageRequest(page,pagelenght));
        log.info(stocks.getSize());
        try{
            String json = mapper.writeValueAsString(stocks);
            return ResponseEntity.ok().body(json);
        }catch (IOException e){
            return ResponseEntity.badRequest().build();
        }
    }
    @GetMapping("/matching")
    public ResponseEntity getStocksMatching(@RequestParam("matching")String matching){
        List<Stock> result = stockService.findAllMatching(matching);
        try{
            String json = mapper.writeValueAsString(result);
            return ResponseEntity.ok().body(json);
        }catch (IOException e){
            return ResponseEntity.badRequest().build();
        }

    }

    @PostMapping("/favorite")
    public ResponseEntity setFavorite(@RequestParam("symbol")String symbol,@RequestParam("username")String username){
        Account account= userService.findByUsername(username);
        Stock stock = stockService.findBySymbol(symbol);
        account.addFavorite(stock);
        return ResponseEntity.ok().build();
    }
    @PostMapping("/unfavorite")
    public ResponseEntity unFavorite(@RequestParam("symbol")String symbol,@RequestParam("username")String username){
        Account account= userService.findByUsername(username);
        Stock stock = stockService.findBySymbol(symbol);
        account.removeFavorite(stock);
        return ResponseEntity.ok().build();
    }





}
