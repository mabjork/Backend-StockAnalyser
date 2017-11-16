package no.mabjork.finance_advisor.repositories;

import no.mabjork.finance_advisor.Models.PhysicalCurrency;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PhysicalCurrencyRepository  extends PagingAndSortingRepository<PhysicalCurrency,Long> {
    List<PhysicalCurrency> findById(Long id);
    Iterable<PhysicalCurrency> findAll(Sort sort);
    Page<PhysicalCurrency> findAll(Pageable pageable);
}
