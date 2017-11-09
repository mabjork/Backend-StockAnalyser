package no.mabjork.finance_advisor.repositories;

import no.mabjork.finance_advisor.Models.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@PreAuthorize("hasRole('USER')")
@Transactional
@Repository
public interface StockRepository extends PagingAndSortingRepository<Stock,Long> {
    Stock findById(Long id);

    Stock findBySymbol(String symbol);
    Iterable<Stock> findAll(Sort sort);

    Page<Stock> findAll(Pageable pageable);

    Iterable<Stock> findAll();
}

