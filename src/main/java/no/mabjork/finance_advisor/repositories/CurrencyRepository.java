package no.mabjork.finance_advisor.repositories;
import org.springframework.data.repository.CrudRepository;

import no.mabjork.finance_advisor.Models.Currency;

import java.util.List;

public interface CurrencyRepository extends CrudRepository<Currency,Long>{
    List<Currency> findById(Long id);
}
