package no.mabjork.finance_advisor.interfaces;

import no.mabjork.finance_advisor.Models.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface StockService {
    void save(Stock stock);

    Stock findById(long id);
    Stock findBySymbol(String symbol);

    Iterable<Stock> findAll(Sort sort);

    Page<Stock> findAll(Pageable pageable);

    Iterable<Stock> findAll();

    List<Stock> findAllMatching(String query);

    Long countAll();

}
