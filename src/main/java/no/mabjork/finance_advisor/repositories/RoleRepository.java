package no.mabjork.finance_advisor.repositories;




import org.springframework.data.jpa.repository.JpaRepository;
import no.mabjork.finance_advisor.Models.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
