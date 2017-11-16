package no.mabjork.finance_advisor.repositories;

import no.mabjork.finance_advisor.Models.DigitalCurrency;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface DigitalCurrencyRepository  extends PagingAndSortingRepository<DigitalCurrency,Long> {
    List<DigitalCurrency> findById(Long id);
    Iterable<DigitalCurrency> findAll(Sort sort);
    Page<DigitalCurrency> findAll(Pageable pageable);
}
