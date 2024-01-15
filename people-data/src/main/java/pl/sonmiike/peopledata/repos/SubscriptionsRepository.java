package pl.sonmiike.peopledata.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sonmiike.peopledata.model.Subscriptions;

@Repository

public interface SubscriptionsRepository extends JpaRepository<Subscriptions, Long> {
}
