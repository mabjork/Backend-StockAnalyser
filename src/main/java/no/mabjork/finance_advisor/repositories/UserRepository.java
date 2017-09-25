package no.mabjork.finance_advisor.repositories;

import no.mabjork.finance_advisor.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@PreAuthorize("hasRole('ADMIN')")
@Transactional
@Repository
public interface UserRepository extends CrudRepository<User,Long>{
    User findById(Long id);
    User findByUsername(String name);
}
