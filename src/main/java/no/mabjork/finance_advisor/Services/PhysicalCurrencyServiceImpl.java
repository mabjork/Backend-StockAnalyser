package no.mabjork.finance_advisor.Services;

import no.mabjork.finance_advisor.Models.PhysicalCurrency;
import no.mabjork.finance_advisor.interfaces.PhysicalCurrencyService;
import no.mabjork.finance_advisor.repositories.PhysicalCurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhysicalCurrencyServiceImpl implements PhysicalCurrencyService{
    @Autowired
    private PhysicalCurrencyRepository physicalCurrencyRepository;

    @Override
    public List<PhysicalCurrency> findById(Long id) {
        return physicalCurrencyRepository.findById(id);
    }

    @Override
    public Iterable<PhysicalCurrency> findAll(Sort sort) {
        return physicalCurrencyRepository.findAll(sort);
    }

    @Override
    public Page<PhysicalCurrency> findAll(Pageable pageable) {
        return physicalCurrencyRepository.findAll(pageable);
    }

    @Override
    public Long countBySymbol(String symbol) {
        return physicalCurrencyRepository.countBySymbol(symbol);
    }

    @Override
    public Long countAll() {
        return  physicalCurrencyRepository.count();
    }
}
