package no.mabjork.finance_advisor.repositories;

import no.mabjork.finance_advisor.Models.Stock;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockRepository extends CrudRepository<Stock,Long>{
    List<Stock> findById(Long id);
}
