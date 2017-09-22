package no.mabjork.finance_advisor.repositories;




import org.springframework.data.jpa.repository.JpaRepository;
import no.mabjork.finance_advisor.Models.Role;


public interface RoleRepository extends JpaRepository<Role,Long> {
}
