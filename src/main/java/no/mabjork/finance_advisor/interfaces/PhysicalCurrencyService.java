package no.mabjork.finance_advisor.interfaces;

import no.mabjork.finance_advisor.Models.PhysicalCurrency;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface PhysicalCurrencyService {
    List<PhysicalCurrency> findById(Long id);
    Iterable<PhysicalCurrency> findAll(Sort sort);
    Page<PhysicalCurrency> findAll(Pageable pageable);
    Long countBySymbol(String symbol);
    Long countAll();
}
