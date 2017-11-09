package no.mabjork.finance_advisor.Services;

import no.mabjork.finance_advisor.Models.Stock;
import no.mabjork.finance_advisor.interfaces.StockService;
import no.mabjork.finance_advisor.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StockServiceImpl implements StockService{

    @Autowired
    private StockRepository stockRepository;

    @Override
    public void save(Stock stock) {
        stockRepository.save(stock);
    }

    @Override
    public Stock findById(long id) {
        return stockRepository.findById(id);
    }

    @Override
    public Stock findBySymbol(String symbol) {
        return stockRepository.findBySymbol(symbol);
    }


    @Override
    public Iterable<Stock> findAll(Sort sort) {
        return stockRepository.findAll(sort);
    }

    @Override
    public Page<Stock> findAll(Pageable pageable) {
        return stockRepository.findAll(pageable);
    }

    @Override
    public Iterable<Stock> findAll(){return stockRepository.findAll();}

    @Override
    public List<Stock> findAllMatching(String query) {

        Iterable<Stock> all = stockRepository.findAll();
        List<Stock> newList = new ArrayList<>();

        for(Stock stock: all){
            if (stock.getName().contains(query) | stock.getSymbol().contains(query) | stock.getSector().contains(query))newList.add(stock);
        }
        return newList;
    }


}
