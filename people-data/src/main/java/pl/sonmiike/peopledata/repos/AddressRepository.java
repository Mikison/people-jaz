package pl.sonmiike.peopledata.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sonmiike.peopledata.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
