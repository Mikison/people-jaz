package pl.sonmiike.peopledata.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sonmiike.peopledata.model.Person;

@Repository

public interface PeopleRepository extends JpaRepository<Person, Long> {
}
