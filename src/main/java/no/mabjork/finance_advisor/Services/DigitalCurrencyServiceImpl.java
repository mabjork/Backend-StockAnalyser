package no.mabjork.finance_advisor.Services;

import no.mabjork.finance_advisor.Models.DigitalCurrency;
import no.mabjork.finance_advisor.interfaces.DigitalCurrencyService;
import no.mabjork.finance_advisor.repositories.DigitalCurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DigitalCurrencyServiceImpl implements DigitalCurrencyService{
    @Autowired
    private DigitalCurrencyRepository digitalCurrencyRepository;

    @Override
    public List<DigitalCurrency> findById(Long id) {
        return digitalCurrencyRepository.findById(id);
    }

    @Override
    public Iterable<DigitalCurrency> findAll(Sort sort) {
        return digitalCurrencyRepository.findAll(sort);
    }

    @Override
    public Page<DigitalCurrency> findAll(Pageable pageable) {
        return digitalCurrencyRepository.findAll(pageable);
    }

    @Override
    public Long countBySymbol(String symbol) {
        return digitalCurrencyRepository.countBySymbol(symbol);
    }

    @Override
    public Long countAll() {
        return digitalCurrencyRepository.count();
    }
}
