package no.mabjork.finance_advisor.interfaces;

import no.mabjork.finance_advisor.Models.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
