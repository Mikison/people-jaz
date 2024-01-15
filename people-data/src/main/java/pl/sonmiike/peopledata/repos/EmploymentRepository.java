package pl.sonmiike.peopledata.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sonmiike.peopledata.model.Employment;
@Repository
public interface EmploymentRepository extends JpaRepository<Employment, Long> {
}
