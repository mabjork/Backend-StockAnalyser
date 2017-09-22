package no.mabjork.finance_advisor.repositories;

import no.mabjork.finance_advisor.Models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long>{
    User findById(Long id);
    User findByUsername(String name);
}
