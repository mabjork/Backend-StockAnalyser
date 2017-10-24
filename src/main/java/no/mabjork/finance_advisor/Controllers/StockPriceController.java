package no.mabjork.finance_advisor.Controllers;



import com.fasterxml.jackson.databind.ObjectMapper;
import no.mabjork.finance_advisor.Models.Stock;
import no.mabjork.finance_advisor.Services.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/price")
public class StockPriceController {

    @Autowired
    private StockServiceImpl stockService;

    @Autowired
    private ObjectMapper mapper;


    @GetMapping("/")
    public String index(){return "";}

    @GetMapping("/stocks")
    public ResponseEntity getStocks(@RequestParam("number")int number,@RequestParam("page")int page){

        Page<Stock> stocks = stockService.findAll(new PageRequest(page,number));
        try{
            String json = mapper.writeValueAsString(stocks);
            return ResponseEntity.ok().body(json);
        }catch (IOException e){
            return ResponseEntity.badRequest().build();
        }
    }
    @GetMapping("/stocks/matching")
    public ResponseEntity getStocksMatching(@RequestParam("matching")String matching){
        return ResponseEntity.ok().build();
    }
    @PostMapping("/stocks/favorite")
    public ResponseEntity setFavorite(@RequestParam("stock")int id,@RequestParam("username")String username){
        return ResponseEntity.ok().build();
    }


}
