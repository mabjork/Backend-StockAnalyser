package no.mabjork.finance_advisor.interfaces;

import no.mabjork.finance_advisor.Models.Account;

public interface UserService {

    void save(Account account);

    Account findByUsername(String username);
}
