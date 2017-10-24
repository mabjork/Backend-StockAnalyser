package no.mabjork.finance_advisor.interfaces;

import no.mabjork.finance_advisor.Models.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface UserService {

    void save(Account account);

    Account findByUsername(String username);

    boolean userExists(String username);

    Iterable<Account> findAll(Sort sort);

    Page<Account> findAll(Pageable pageable);
}
