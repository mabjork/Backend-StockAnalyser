package no.mabjork.finance_advisor.repositories;

import no.mabjork.finance_advisor.Models.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@PreAuthorize("hasRole('ADMIN')")
@Transactional
@Repository
public interface UserRepository extends PagingAndSortingRepository<Account,Long> {
    Account findById(Long id);
    Account findByUsername(String name);
    Iterable<Account> findAll(Sort sort);
    Page<Account> findAll(Pageable pageable);

}
