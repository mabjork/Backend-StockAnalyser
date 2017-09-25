package no.mabjork.finance_advisor.repositories;

import no.mabjork.finance_advisor.Models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@PreAuthorize("hasRole('ADMIN')")
@Transactional
@Repository
public interface UserRepository extends CrudRepository<Account,Long>{
    Account findById(Long id);
    Account findByUsername(String name);
}
