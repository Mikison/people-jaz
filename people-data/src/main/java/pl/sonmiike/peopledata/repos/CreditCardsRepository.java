package pl.sonmiike.peopledata.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sonmiike.peopledata.model.CreditCard;

@Repository
public interface CreditCardsRepository extends JpaRepository<CreditCard, Long> {


}
