package no.mabjork.finance_advisor.interfaces;

import no.mabjork.finance_advisor.Models.DigitalCurrency;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface DigitalCurrencyService {
    List<DigitalCurrency> findById(Long id);
    Iterable<DigitalCurrency> findAll(Sort sort);
    Page<DigitalCurrency> findAll(Pageable pageable);
    Long countBySymbol(String symbol);
    Long countAll();
}
