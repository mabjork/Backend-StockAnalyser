package no.mabjork.finance_advisor.repositories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import no.mabjork.finance_advisor.Models.Currency;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CurrencyRepository extends PagingAndSortingRepository<Currency,Long> {
    List<Currency> findById(Long id);
    Iterable<Currency> findAll(Sort sort);
    Page<Currency> findAll(Pageable pageable);
}
