package no.mabjork.finance_advisor.repositories;

import no.mabjork.finance_advisor.Models.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@PreAuthorize("hasRole('USER')")
@Transactional
@Repository
public interface StockRepository extends CrudRepository<Stock,Long>{
    List<Stock> findById(Long id);
}
